import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        List<Object[]> list = null;

        try {
            session.beginTransaction();

            Query<Object[]> query = session.createSQLQuery("select s.fullname, m.mark from students as s\n"+
                    " inner join marks m on m.id_students = s.id;");

            list = query.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e);
        } finally {
            session.close();
            sessionFactory.close();
        }
        list.forEach(s -> System.out.println(s[0] + " " + s[1]));
    }
}
