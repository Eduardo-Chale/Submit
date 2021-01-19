package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    static ArrayList<Usuario> usuarios = new ArrayList();
    int posicion;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Stage
        primaryStage.setTitle("Tercer Ejercicio");

        //Scene principal
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        //elementos principal
        Button btnLogin =new Button("Login");
        btnLogin.setPrefWidth(100);
        Button btnRegistro =new Button("Registro");
        btnRegistro.setPrefWidth(100);
        VBox iniciovbBtn = new VBox(30);
        iniciovbBtn.setAlignment(Pos.TOP_CENTER);
        iniciovbBtn.getChildren().add(btnLogin);
        iniciovbBtn.getChildren().add(btnRegistro);
        grid.add(iniciovbBtn,0,0);
        Scene principal=new Scene(grid, 300, 275);

        //Scene registro
        GridPane grid2 = new GridPane();
        grid2.setAlignment(Pos.CENTER);
        grid2.setHgap(10);
        grid2.setVgap(10);
        grid2.setPadding(new Insets(25, 25, 25, 25));
        //elementos registro
        Text titleReg = new Text("Registro");
        titleReg.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid2.add(titleReg, 0, 0, 2, 1);
        Label usuarioLbl = new Label("Nombre de usuario:");
        grid2.add(usuarioLbl, 0, 1);
        TextField usuarioTf = new TextField();
        grid2.add(usuarioTf, 1, 1);
        Label contraseña = new Label("Contraseña:");
        grid2.add(contraseña, 0, 2);
        PasswordField contraseñaPf = new PasswordField();
        grid2.add(contraseñaPf, 1, 2);

        Button btnAceptarR = new Button("Aceptar");
        Button btnAtrasR = new Button("Atras");
        HBox registrohbBtn = new HBox(10);
        registrohbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        registrohbBtn.getChildren().add(btnAtrasR);
        registrohbBtn.getChildren().add(btnAceptarR);
        grid2.add(registrohbBtn, 1, 4);

        Text error = new Text();
        grid2.add(error, 1, 6);

        Scene registro = new Scene(grid2, 350, 275);


        //Scene login usuario
        GridPane grid3 = new GridPane();
        grid3.setAlignment(Pos.CENTER);
        grid3.setHgap(10);
        grid3.setVgap(10);
        grid3.setPadding(new Insets(25, 25, 25, 25));

        Text titleLog = new Text("Login");
        titleLog.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid3.add(titleLog, 0, 0, 2, 1);

        Label usuarioLblL = new Label("Nombre de usuario:");
        grid3.add(usuarioLblL, 0, 1);
        TextField usuarioTfL = new TextField();
        grid3.add(usuarioTfL, 1, 1);
        Label contraseñaL = new Label("Contraseña:");
        grid3.add(contraseñaL, 0, 2);
        PasswordField contraseñaPfL = new PasswordField();
        grid3.add(contraseñaPfL, 1, 2);

        Button btnAtrasL = new Button("Atras");
        Button btnAceptarL = new Button("Aceptar");
        HBox loginhbBtn = new HBox(10);
        loginhbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        loginhbBtn.getChildren().add(btnAtrasL);
        loginhbBtn.getChildren().add(btnAceptarL);
        grid3.add(loginhbBtn, 1, 4);

        Text error2 = new Text();
        grid3.add(error2, 1, 6);

        Scene login = new Scene(grid3, 350, 275);

        //Scene login bienvenido
        GridPane grid4 = new GridPane();
        grid4.setAlignment(Pos.CENTER);
        grid4.setHgap(10);
        grid4.setVgap(10);
        grid4.setPadding(new Insets(25, 25, 25, 25));

        Text titleBienvenido = new Text("Bienvenido");
        titleBienvenido.setFont(Font.font("Tahoma", FontWeight.BOLD, 30));
        grid4.add(titleBienvenido, 2, 2, 2, 1);
        Scene Bienvenido = new Scene(grid4, 450, 275);

        //Scene login nuevo usuario
        GridPane grid5 = new GridPane();
        grid5.setAlignment(Pos.CENTER);
        grid5.setHgap(10);
        grid5.setVgap(10);
        grid5.setPadding(new Insets(25, 25, 25, 25));

        Text titleLog2 = new Text("Login");
        titleLog2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid5.add(titleLog2, 0, 0, 2, 1);

        Label nombreLblL = new Label("Nombre completo:");
        grid5.add(nombreLblL, 0, 1);
        TextField nombreTfL = new TextField();
        grid5.add(nombreTfL, 1, 1);
        Label edadL = new Label("Edad:");
        grid5.add(edadL, 0, 2);
        TextField edadTfL = new TextField();
        grid5.add(edadTfL, 1, 2);

        Button btnAceptarL2 = new Button("Aceptar");
        HBox loginhbBtn2 = new HBox(10);
        loginhbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
        loginhbBtn2.getChildren().add(btnAceptarL2);
        grid5.add(loginhbBtn2, 1, 4);


        Scene login2 = new Scene(grid5, 350, 275);

        //Accion de buttons
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.setScene(login);
                usuarioTfL.clear();
                contraseñaPfL.clear();
                error2.setFill(null);
                error2.setText("");
            }
        });

        btnRegistro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.setScene(registro);
                usuarioTf.clear();
                contraseñaPf.clear();
                error.setFill(null);
                error.setText("");
            }
        });

        btnAtrasR.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.setScene(principal);
            }
        });

        btnAtrasL.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.setScene(principal);
            }
        });

        btnAceptarL.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String tempNom=usuarioTfL.getText();
                String contraseña=contraseñaPfL.getText();
                Usuario temp=new Usuario(tempNom,contraseña);
                String nombre1=temp.getNomUsuario();
                boolean nuevo=true;
                Usuario acceso = null;

                for(int i =0;i<usuarios.size();i++){
                    Usuario temp2=usuarios.get(i);
                    if(nombre1.equals(temp2.getNomUsuario())){
                        nuevo=false;
                        System.out.println(nuevo);
                        acceso=temp2;
                        posicion=i;
                    }
                }
                if(nuevo==false){
                    if((usuarios.get(posicion).getContraseñaUsuario()).equals(temp.getContraseñaUsuario())){
                        if(acceso.getEdad()==0){
                            nombreTfL.clear();
                            edadTfL.clear();
                            primaryStage.setScene(login2);
                        }else{
                            titleBienvenido.setText("Bienvenido "+acceso.getNombreCompleto());
                            primaryStage.setScene(Bienvenido);
                        }
                    }else{
                        error2.setFill(Color.FIREBRICK);
                        error2.setText("Contraseña incorrecta");
                    }

                }else{
                    error2.setFill(Color.FIREBRICK);
                    error2.setText("Nombre de usuario desconocido");
                }
            }
        });

        btnAceptarL2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String nombreCom=nombreTfL.getText();
                String edadTemp=edadTfL.getText();
                Usuario temp=usuarios.get(posicion);
                temp.setNombreCompleto(nombreCom);
                temp.setEdad(Integer.parseInt(edadTemp));
                usuarios.remove(posicion);
                usuarios.add(temp);
                primaryStage.setScene(principal);
            }
        });

        btnAceptarR.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String tempNom= usuarioTf.getText();
                String contraseña=contraseñaPf.getText();
                Usuario temp=new Usuario(tempNom,contraseña);
                String nombre1=temp.getNomUsuario();
                boolean nuevo=true;
                for(int i =0;i<usuarios.size();i++){
                    Usuario temp2=usuarios.get(i);
                    if(nombre1.equals(temp2.getNomUsuario())){
                       nuevo=false;
                       System.out.println(nuevo);
                    }
                }
                if(nuevo==true){
                    usuarios.add(temp);
                    primaryStage.setScene(principal);
                }else{
                    error.setFill(Color.FIREBRICK);
                    error.setText("Nombre de usuario ocupado");
                }
            }
        });

        primaryStage.setScene(principal);
        primaryStage.show();
    }
    public class Usuario{
        String nomUsuario;
        String contraseñaUsuario;
        int edad;
        String nombreCompleto;

        public Usuario(String nomUsuario, String contraseñaUsuario){
            this.nomUsuario=nomUsuario;
            this.contraseñaUsuario=contraseñaUsuario;
            this.edad=0;
            this.nombreCompleto="";
        }

        public String getNomUsuario(){
            return nomUsuario;
        }

        public String getContraseñaUsuario() {
            return contraseñaUsuario;
        }

        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public int getEdad() {
            return edad;
        }

        public void setNomUsuario(String nomUsuario) {
            this.nomUsuario = nomUsuario;
        }

        public void setContraseñaUsuario(String contraseñaUsuario) {
            this.contraseñaUsuario = contraseñaUsuario;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

    }

    public Usuario crearUsuario(String nombre,String contraseña){
        Usuario temporal=new Usuario(nombre,contraseña);
        return temporal;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
