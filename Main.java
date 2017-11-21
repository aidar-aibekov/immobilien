import entities.*;
import org.hibernate.*;
import org.hibernate.query.Query;


import javax.persistence.metamodel.EntityType;

public class Main {
    private static HibernateUtil hibernateUtil = new HibernateUtil();

    public static void main(final String[] args) throws Exception {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {

                    if (o instanceof Haus) {
                        System.out.println("Hausaddress: " + ((Haus) o).getAddress());
                        System.out.print("Kaufinteressanten: ");
                        ((Haus) o).getKaufinteressanten().stream().forEach(a->{
                            System.out.print(a.getName());
                            System.out.print(", ");
                        });
                        System.out.println();

                    }




                    System.out.println("----------------");
                }
            }
        } finally {
            session.close();
        }


    }

}






