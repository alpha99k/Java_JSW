package ch07;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import java.sql.*;

public class ConnectionPoolTest {

    private static DataSource dataSource;

    static {
        HikariConfig config = new HikariConfig("/hikari.properties");
        dataSource = new HikariDataSource(config);
    }

    public static void main(String[] args){
        findAll();
        insert(2, "2번이 등록한 게시글", "안녕하세요. 자바 공부 해요.");
        findById(10);
        update(10, "수정된 10번 게시글", "수정했어요");
        findAll();
        delete(10);
        findAll();
        deleteAll(3);
        login("haru@gmail.com", "123");
        login("haru@gmail.com", "pwd123");
        login("haru@gmail.com' or '1' = '1", "123");

        if(dataSource != null){
            ((HikariDataSource)dataSource).close();
        }
    }

    // 등록(C)
    static void insert(int memberId, String title, String content){
        String sql = "INSERT INTO post (member_id, title, content) VALUES (?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection();
            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            pstmt = conn.prepareStatement(sql);
            // 3. SQL 실행(SELECT)
            pstmt.setInt(1, memberId);
            pstmt.setString(2, title);
            pstmt.setString(3, content);
            // 4. 결과 수신(ResultSet 객체 생성)
            int affectedRows = pstmt.executeUpdate();

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }


    // 모든 게시글 목록 조회
    static void findAll(){
        findAll(""); // 이대로 유지할 거라면 아래 조건식을 아래와 같이 고쳐야 합니다.
    }

    // 목록 조회(R)
    static void findAll(String keyword){
        // 1. 오타 수정 (viwe_count -> view_count)
        String sql = "SELECT id, member_id, title, view_count, created_at From post";

        // 2. 조건식 수정 (null이 아니고 빈 문자열도 아닐 때만)
        boolean hasKeyword = keyword != null && !keyword.equals("");
        if(hasKeyword){
            sql += " WHERE title LIKE ? OR content LIKE ?";
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // 초기화 유지

        try{
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);

            if(hasKeyword) {
                pstmt.setString(1, "%" + keyword + "%");
                pstmt.setString(2, "%" + keyword + "%");
            }

            // 3. 실행 위치를 if문 밖으로 이동
            rs = pstmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                int member_id = rs.getInt("member_id");
                String title = rs.getString("title");
                int viewCount = rs.getInt("view_count");
                String created_at = rs.getString("created_at");

                System.out.println("ID: " + id + "\t | 회원아이디: " + member_id + "\t | 제목: " + title +"\t | 생성일: " + created_at + "\t | 조회수: " + viewCount);
            }

        }catch(Exception e){
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 4. rs 닫기 추가 및 자원 해제
            try{ if(rs != null) rs.close(); } catch (Exception e){ }
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 한건 조회(R)
    static void findById(int id){
        String sql = "SELECT id, member_id, title, content, view_count FROM post WHERE id = "+id+"";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection();

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행(SELECT)
            // 4. 결과 수신(ResultSet 객체 생성)
            rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                int memberId = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int viewCount = rs.getInt("view_count");

                System.out.println( " \t\t\t\t" +  id + "번 조회결과 \n ---------------------------------------\n" + "ID : " + id +
                        " | 멤버아이디 : " + memberId + " | 조회수 : " + viewCount +" | 제목 : " + title + " | 내용 : " + content);
            } else {
                System.out.println(id + "번 게시글을 찾을 수 없습니다.");
            }
        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(rs != null) rs.close(); } catch (Exception e){ }
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }

    // 수정(U)
    static void update(int id, String title, String content){
        // 1. 하드코딩 대신 물음표(?)를 사용하고 콤마(,)를 정확히 넣은 SQL문
        String sql = "UPDATE post SET title = ?, content = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);

            // 2. 물음표(?) 자리에 순서대로 데이터 채워넣기 (필수!)
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setInt(3, id);

            // 3. SQL 실행
            pstmt.executeUpdate();

        }catch(Exception e){
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 삭제(D)
    static void delete(int id){
        String sql = "DELETE FROM post WHERE id ="+id+"";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection();

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행
            pstmt.executeUpdate();

            System.out.println(id + "번 게시물 삭제 완료 ");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }

    //지정한 회원의 모든 게시글 삭제
    static void deleteAll(int id){
        String sql = "DELETE FROM post WHERE member_id = "+id+"";
        Connection conn = null;
        Statement stmt = null;
        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection();

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행
            stmt.executeUpdate(sql);

            System.out.println(id + "번 회원 게시물전체 삭제 완료 ");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    static void login(String email, String password) {
        String sql = "SELECT * FROM MEMBER WHERE email = ? AND password = ?;";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection();

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행(SELECT)
            // 4. 결과 수신(ResultSet 객체 생성)
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();

            if(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");

                System.out.println("로그인 성공");
                System.out.println("ID: " + id + ", 이메일: " + email + ", 이름: " + name + ", 전화번호: " + phone);
            } else{
                System.out.println("아이디와 패스워드를 확인하세요.");
            }

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(rs != null) rs.close(); } catch (Exception e){ }
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }
}