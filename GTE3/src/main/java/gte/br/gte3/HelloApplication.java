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
    private static Scene loginScene;
    private static Scene listaScene;
    private static Scene categorizacaoScene;
    private static Scene adicionarcatScene;
    private static Scene editarcatScene;
    private static Scene excluircatScene;
    private static Scene adicionardisScene;
    private static Scene editardisScene;
    private static Scene excluirdisScene;

    @Override
    public void start(Stage stage) throws IOException {
        stagePrincipal = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cadastro.fxml"));
        Scene sceneCadastro = new Scene(fxmlLoader.load());

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("lista.fxml"));
        Scene sceneLista = new Scene(fxmlLoader2.load());

        FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene sceneLogin = new Scene(fxmlLoader3.load());

        FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("categorizacao.fxml"));
        Scene sceneCategorizacao = new Scene(fxmlLoader4.load());

        FXMLLoader fxmlLoader5 = new FXMLLoader(HelloApplication.class.getResource("adicionardis.fxml"));
        Scene sceneAdicionarDis = new Scene(fxmlLoader5.load());

        FXMLLoader fxmlLoader6 = new FXMLLoader(HelloApplication.class.getResource("editardis.fxml"));
        Scene sceneEditarDis = new Scene(fxmlLoader6.load());

        FXMLLoader fxmlLoader7 = new FXMLLoader(HelloApplication.class.getResource("excluirdis.fxml"));
        Scene sceneExcluirDis = new Scene(fxmlLoader7.load());

        FXMLLoader fxmlLoader8 = new FXMLLoader(HelloApplication.class.getResource("adicionarcat.fxml"));
        Scene sceneAdicionarCat = new Scene(fxmlLoader8.load());

        FXMLLoader fxmlLoader9 = new FXMLLoader(HelloApplication.class.getResource("editarcat.fxml"));
        Scene sceneEditarCat = new Scene(fxmlLoader9.load());

        FXMLLoader fxmlLoader10 = new FXMLLoader(HelloApplication.class.getResource("excluircat.fxml"));
        Scene sceneExcluirCat = new Scene(fxmlLoader10.load());

        excluircatScene = sceneExcluirCat;
        editarcatScene = sceneEditarCat;
        adicionarcatScene = sceneAdicionarCat;
        excluirdisScene = sceneExcluirDis;
        editardisScene = sceneEditarDis;
        adicionardisScene = sceneAdicionarDis;
        categorizacaoScene = sceneCategorizacao;
        cadastroScene = sceneCadastro;
        loginScene = sceneLogin;
        listaScene = sceneLista;
        //stage.setTitle("Hello!");
        stage.setScene(sceneCategorizacao);
        stage.setScene(sceneLogin);
        stage.setScene(sceneCadastro);

        stage.show();
    }

    public static void mudaeTela(String tela) {
        if (tela == "cadastro") {
            stagePrincipal.setScene(cadastroScene);
        }
        if (tela == "login") {
            stagePrincipal.setScene(loginScene);
        }
    }
    public static void mudartela2(String tela) {
        if (tela == "cadastro") {
            stagePrincipal.setScene(cadastroScene);
        }
        if (tela == "lista") {
            stagePrincipal.setScene(listaScene);
        }
    }
        public static void mudaeTela3(String tela) {
            if (tela == "lista") {
                stagePrincipal.setScene(listaScene);
            }
            if (tela == "categorizacao") {
                stagePrincipal.setScene(categorizacaoScene);
            }
        }
            public static void mudaeTela4(String tela){
                if (tela == "categorizacao") {
                    stagePrincipal.setScene(categorizacaoScene);
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