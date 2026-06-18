package ch07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcHWTest {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "user1";
    private static final String DB_PASSWORD = "1111";

    public static void main(String[] args){
        findAll();
        insert(2, "2번이 등록한 게시글", "안녕하세요. 자바 공부 해요.");
        findById(10);
        update(10, "수정된 10번 게시글", "수정했어요");
        findAll();
        delete(10);
        findAll();
    }

    // 등록(C)
    static void insert(int memberId, String title, String content){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();
            // 3. SQL 실행(SELECT)
            // 4. 결과 수신(ResultSet 객체 생성)
            int affectedRows = stmt.executeUpdate("INSERT INTO post (member_id, title, content) VALUES ("+memberId+", '"+title+"', '"+content+"')");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(rs != null) rs.close(); } catch (Exception e){ }
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }

    // 목록 조회(R)
    static void findAll(){

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행(SELECT)
            // 4. 결과 수신(ResultSet 객체 생성)
            rs = stmt.executeQuery("SELECT * FROM post");

            while(rs.next()){
                int id = rs.getInt("id");
                int member_id = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");

                System.out.println("ID: " + id + "\t | 회원아이디: " + member_id + "\t | 제목: " + title + " |\t 내용: " + content);
            }

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(rs != null) rs.close(); } catch (Exception e){ }
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }

    // 한건 조회(R)
    static void findById(int id){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행(SELECT)
            // 4. 결과 수신(ResultSet 객체 생성)
            rs = stmt.executeQuery("SELECT id, member_id, title, content \n" +
                    "FROM post\n" +
                    "WHERE id = "+id+"");
            if (rs.next()) {
                int searchId = rs.getInt("id");
                int memberId = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");

                System.out.println(searchId + " 조회결과 \n ---------------------------------------\n" + "ID : " + id +
                        " | 멤버아이디 : " + memberId + " | 제목 : " + title + "| 내용 : " + content);
            } else {
                System.out.println(id + "번 게시글을 찾을 수 없습니다.");
            }
        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(rs != null) rs.close(); } catch (Exception e){ }
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }

    // 수정(U)
    static void update(int id, String title, String content){
        Connection conn = null;
        Statement stmt = null;
        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행
            stmt.executeUpdate(
                    "UPDATE post\n" +
                            "    SET title = '"+title+"',\n" +
                            "        content = '"+content+"'\n" +
                            "    WHERE id = "+id+";");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }

    // 삭제(D)
    static void delete(int id){
        Connection conn = null;
        Statement stmt = null;
        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행
            stmt.executeUpdate("DELETE FROM post\n" +
                    "    WHERE id = "+id+";");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }

    }
//
}