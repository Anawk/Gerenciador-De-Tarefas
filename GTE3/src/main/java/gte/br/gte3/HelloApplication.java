package gte.br.gte3;

import gte.br.gte3.Model.Usuario;
import gte.br.gte3.Util.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stagePrincipal;
    private  static  Scene cadastroScene;
    private static Scene listaScene;
    @Override
    public void start(Stage stage) throws IOException {
        stagePrincipal = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lista.fxml"));
        Scene sceneLista = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("cadastro.fxml"));
        Scene sceneCadastro = new Scene(fxmlLoader2.load());
        cadastroScene = sceneCadastro;
        listaScene = sceneLista;
        stage.setTitle("Hello!");
        stage.setScene(sceneLista);
        stage.show();
    }

    public static void mudaeTela(String tela){
        if (tela == "cadastro") {
            stagePrincipal.setScene(cadastroScene);
        }
        if (tela == "lista"){
            stagePrincipal.setScene(listaScene);
        }


    }



    //    @Override
//    public void init() throws Exception {
////        Usuario u = new Usuario("Gustavo", "123","wduibfiuw","Gustavo", "emiliano");
////        Session session = HibernateUtil.getSessionFactory().openSession();
////        Transaction transaction = session.beginTransaction();
////
////        session.persist(u);
////        transaction.commit();
////
////        Usuario usuario = session.get(Usuario.class, 1);
////        System.out.println(usuario.toString());
//    }

    public static void main(String[] args) {
        launch();

    }
}