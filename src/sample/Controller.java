package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Controller  {
    @FXML
    private Button AddPhotoButton;
    @FXML
    private Hyperlink h4;
      @FXML
    private Label l1;
    @FXML
    private Text chooseServicestxt;
    @FXML
    private Text cardnumber;

    @FXML
    private Text securitycode;

    @FXML
    private TextField cardnumbertxt;

    @FXML
    private TextField securitycodetxt;

    @FXML
    private Button confirmaddingservices;

    @FXML
    private RadioButton drycleaningradio;

    @FXML
    private RadioButton spaRadio;
    @FXML
    private Button drycleaningbutton;

    @FXML
    private Button spabutton;
    @FXML
    private Hyperlink h2;
    @FXML
    private TextField FullName;

    @FXML
    private TextField Phone;

    @FXML
    private TextField Username;

    @FXML
    private TextField Password;
    @FXML
    private Hyperlink h3;
    @FXML
    private Button b8;
    @FXML
    private Hyperlink h1;
    @FXML
    private RadioButton cashbutton;
    @FXML
    private TextField admincodemyservices;

    @FXML
    private RadioButton visabutton;

    @FXML
    private Button b9;

    @FXML
    private Button b7;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private TextField AdminCode;

    @FXML
    private Button b6;

    @FXML
    private TextField T1;
    @FXML
    private TextField Usernamein;

    @FXML
    private TextField Passwordin;

    @FXML
    private Button b1;

    @FXML
    private Button b2;
    @FXML
    private Button b3;

    @FXML
    private TextField T2;
    @FXML
    private Button b10;

    @FXML
    private Button b11;

    @FXML
    private Button b12;
    @FXML
    private Button b13;

    @FXML
    private DatePicker d1;

    @FXML
    private TextField AddHotelName;

    @FXML
    private DatePicker d2;

    @FXML
    private RadioButton r1;

    @FXML
    private RadioButton r2;

    @FXML
    private RadioButton r3;
    @FXML
    private ImageView HotelLabel;

    @FXML
    private Text LabelCairo;

    @FXML
    private Label LabelFourSeasons;

    @FXML
    private Text LabelRating;

    @FXML
    private RadioButton r4;
    @FXML
    private Button b14;
    @FXML
    private TextField fullnameTxt;

    @FXML
    private TextField phonetxt;

    @FXML
    private TextField usernametxt;

    @FXML
    private TextField passwordtxt;
    @FXML
    private Button b15;

    @FXML
    private Button b16;

    @FXML
    private Button b17;
    @FXML
    private Slider s1;
    @FXML
    private ImageView photo1;
    @FXML
    private Label ads1;

    @FXML
    private Label ads2;
    @FXML
    private Button visapayment;
    @FXML
    private Label ads3;
    @FXML
    private ImageView photo2;

    @FXML
    private ImageView photo3;

    @FXML
    private Text rate1;
    @FXML
    private RadioButton AmHS;

    @FXML
    private RadioButton PmHS;
    @FXML
    private Text rate2;
    @FXML
    private Button addAdvertisementbutton;

    @FXML
    private TextField adstxt1;

    @FXML
    private TextField adstxt2;

    @FXML
    private TextField adstxt3;

    @FXML
    private Text rate3;

    @FXML
    private Hyperlink txt1;

    @FXML
    private Text txt2;

    @FXML
    private Hyperlink txt3;

    @FXML
    private Text txt4;

    @FXML
    private Hyperlink txt5;

    @FXML
    private Text txt6;
    @FXML
   ImageView myImageview;

    @FXML
    private TextField T3;
    @FXML
    private Button doneaddingadvertisementsbutton;
    @FXML
    private TextField T4;
    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private Button addservices;
    @FXML
    private RadioButton radiobutton1;

    @FXML
    private Button b18;
    @FXML
    private Label LabelOfHotel;
    @FXML
    private DatePicker d3;
    @FXML
    private TextField T5;
    @FXML
    private Button DoneAddingHotel;
    @FXML
    private TextField T6;

    @FXML
    private Button AddHotelButton;

    @FXML
    private Button D1;

    @FXML
    private Button D2;

    @FXML
    private Button D3;

    @FXML
    private Button b19;

    @FXML
    private DatePicker d4;
    @FXML
    private DatePicker drycleaningdate;
    @FXML
    void openreservationscene1(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("reservationscene1.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void donedrycleaning(ActionEvent event) throws IOException {

        JOptionPane.showMessageDialog(null,"request sent","request status",1);
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("servicescene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void checkout(ActionEvent event) {
        CheckOut ch1= new CheckOut();
        ch1.getComment();
        ch1.getRating();
        JOptionPane.showMessageDialog(null,"checked out successfully","checkout status",1);
        System.exit(0);
    }
    @FXML
    void carrentalrequest(ActionEvent event) throws IOException {
        CarRental cr= new CarRental();
        cr.getCarType();
        cr.getDate();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update guests set comfortfacilities = '1' where id = '1'");
            JOptionPane.showMessageDialog(null, "request sent successfully", "request status", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("servicescene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void opencomfortfacilities(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("comfortfacilities.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void openhousekeepingrequests(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("housekeepingrequests.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    @FXML
    void approvereservationrequests(ActionEvent event) throws IOException {
        JOptionPane.showMessageDialog(null,"Requests approved","requests status",1);
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("managerscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();

    }
    @FXML
    void openreservationrequests(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("reservationrequests.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();

    }

    @FXML
    void opencarrentalscene(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("carrentalscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }


    @FXML
    void opencheckinscene(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("checkinscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void opencheckoutscene(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("checkoutscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void openhousekeepingscene(ActionEvent event) throws IOException {
        //Customer c1= new Customer();
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("housekeepingscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    @FXML
    void openservicespage(ActionEvent event) throws IOException {
        Hotels h1 = new Hotels();
        h1.getRoomType();
        h1.getCheckin();
        h1.getCheckout();
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("servicescene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    @FXML
    void viewSchedule(ActionEvent event) throws URISyntaxException, IOException {
        Manager m1= new Manager();
        m1.viewScheduling();
    }




    @FXML
    void openroompage1(ActionEvent event) throws IOException {
        Customer c1= new Customer();
        c1.setHotelName("Ramsis Hotel");
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("bookingscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    @FXML
    void openroompage2(ActionEvent event) throws IOException {
        Customer c1= new Customer();
        c1.setHotelName("Lukas Hotel");
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("bookingscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    @FXML
    void openroompage3(ActionEvent event) throws IOException {
        Customer c1= new Customer();
        c1.setHotelName("Kempinsiki Hotel");
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("bookingscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void openadminscene(ActionEvent event) throws IOException {
        String l= T2.getText();
        if(l.equals("A1")){
            Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("adminscene.fxml"));
            Scene login = new Scene(LB);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(login);
            window.show();

        }else{
            JOptionPane.showMessageDialog(null,"wrong entry","access denied",1);
        }
    }

    @FXML
    void openguestscene(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("loginscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();

    }

    @FXML
    void openmanagerscene(ActionEvent event) throws IOException {
        String s = T1.getText();
        if(s.equals("M1")){
            Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("managerscene.fxml"));
            Scene login = new Scene(LB);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(login);
            window.show();
        } else {
            JOptionPane.showMessageDialog(null,"wrong entry","access denied",1);

        }
    }
    @FXML
    void openreservationscene(ActionEvent event) throws IOException {
        if (Username.getText().isEmpty() || Password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The username or password is empty", "Why Empty", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("update guests set id = '1' where Name = '"+Username.getText()+"'");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from guests where Name = '" + Username.getText() + "' and Password = '" + Password.getText() + "'");

                while (rs.next())
                {
                    Main m = new Main();
                    Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("reservationscene.fxml"));
                    Scene login = new Scene(LB);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(login);
                    window.show();
                }
                con.close();
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());}
        }

        D1.setVisible(true);
        D2.setVisible(true);
        D3.setVisible(true);
    }
    @FXML
    private Label label1;
    @FXML
    private RadioButton radiohousekeeping;

    @FXML
    private Label labelhousekeeping;
    @FXML
    void showhousekeepingrequests(ActionEvent event) {
        labelhousekeeping.setVisible(true);
        radiohousekeeping.setVisible(true);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM guests WHERE  housekeeping = 1");
            if (rs.next()) {
                labelhousekeeping.setText(String.valueOf((rs.getString("Name"))));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    @FXML
    private RadioButton radiocomfortfacilities;

    @FXML
    private Label labelcomfortfacilities;
    @FXML
    void showcomfortfacilities(ActionEvent event) {
        labelcomfortfacilities.setVisible(true);
        radiocomfortfacilities.setVisible(true);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM guests WHERE  comfortfacilities = 1");
            if (rs.next()) {
                labelcomfortfacilities.setText(String.valueOf((rs.getString("Name"))));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    @FXML
    void pressshow(ActionEvent event) {
        label1.setVisible(true);
        radiobutton1.setVisible(true);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM guests WHERE  checkin = 1");
            if (rs.next()) {
                label1.setText(String.valueOf((rs.getString("Name"))));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @FXML
    void openloginscene(ActionEvent event) throws IOException {
        try {
            ResultSet rs = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
            Statement stmt = con.createStatement();
            String sql = "INSERT IGNORE INTO guests (Name,Password,FullName,Phone) VALUES('" + Usernamein.getText() + "','" + Passwordin.getText() + "','" +FullName.getText()+"','"+Phone.getText() + "')";
            stmt.executeUpdate(sql);
        //Customer c1 = new Customer(Usernamein.getText(), FullName.getText(), Phone.getText(), Passwordin.getText());
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("loginscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    @FXML
    void opencreateaccountscene(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("createaccountscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();

    }
    @FXML
    void requestsentnotification (ActionEvent event) throws IOException {
        Housekeeping hs1= new Housekeeping();
        hs1.hs=true;

        if(PmHS.isSelected()){
            hs1.setTime("PM");
        }else if(AmHS.isSelected()){
            hs1.setTime("AM");

        }
        else{
            JOptionPane.showMessageDialog(null,"Error","Please choose only one time zone",1);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update guests set housekeeping = '1' where id = '1'");
            JOptionPane.showMessageDialog(null, "request sent successfully", "request status", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("servicescene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void addhotelsScene(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("addhotelsscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    public void browse(ActionEvent event) throws java.sql.SQLException {
        DoneAddingHotel.setVisible(true);
        AddHotelName.setVisible(true);
        AddHotelButton.setVisible(true);
        FileChooser fc = new FileChooser();
        fc.setTitle("Select Image");
        //fc.setInitialDirectory(new File(System.getProperty("Desktop")));
        fc.getExtensionFilters().clear();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All Files", "*.png", "*.jpeg", "*.gif"));
        File file = fc.showOpenDialog(null);

            HotelLabel.setImage(new Image(file.toURI().toString()));
    }
    @FXML
    void AdminEdit(ActionEvent event) {
        String l= AdminCode.getText();
        if(l.equals("A1")){


            AddHotelButton.setVisible(true);
            addAdvertisementbutton.setVisible(true);


        }else{
            JOptionPane.showMessageDialog(null,"wrong entry","access denied",1);
        }

    }
    @FXML
    void OpenAccessScene(ActionEvent event) throws IOException {

        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("accessscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();

    }

    @FXML
    void openHousekeepingSchedule(ActionEvent event) throws URISyntaxException, IOException {
        Admin a1= new Admin();
        a1.HousekeepingSchedule();
    }

    @FXML
    void openStatisticaldata(ActionEvent event) throws URISyntaxException, IOException {
        Admin a1= new Admin();
        a1.AddStatisticalData();
    }
    @FXML
    void deletehotel1(ActionEvent event) {
        photo1.setVisible(false);
        txt1.setVisible(false);
        txt2.setVisible(false);
        rate1.setVisible(false);
    }

    @FXML
    void deletehotel2(ActionEvent event) {
        photo2.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        rate2.setVisible(false);
    }

    @FXML
    void deletehotel3(ActionEvent event) {
        photo3.setVisible(false);
        txt5.setVisible(false);
        txt6.setVisible(false);
        rate3.setVisible(false);
    }

    public void DoneAddingHotel(ActionEvent actionEvent) {
        LabelOfHotel.setText(AddHotelName.getText());
        LabelOfHotel.setVisible(true);
        DoneAddingHotel.setVisible(false);
        AddHotelName.setVisible(false);
        AddHotelButton.setVisible(false);
    }
    @FXML
    void servicesEdit(ActionEvent event) {
        String l= AdminCode.getText();
        if(l.equals("A1")){
            addservices.setVisible(true);
        }
    }
    @FXML
    void addservicesFunc(ActionEvent event) {
        Admin a1= new Admin();
        if(spaRadio.isSelected() && drycleaningradio.isSelected()) {
            spabutton.setVisible(true);
            drycleaningbutton.setVisible(true);
            a1.addServices("Spa");
            a1.addServices("Dry cleaning");

        }
        if(spaRadio.isSelected() ) {
            spabutton.setVisible(true);
            a1.addServices("Spa");
        }
        if( drycleaningradio.isSelected()) {
            drycleaningbutton.setVisible(true);
            a1.addServices("Dry cleaning");
        }
        chooseServicestxt.setVisible(false);
        drycleaningradio.setVisible(false);
        spaRadio.setVisible(false);
        confirmaddingservices.setVisible(false);

    }
    @FXML
    void opendrycleaningscene(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("drycleaningscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }

    @FXML
    void openspascene(ActionEvent event) throws IOException {
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("spascene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    @FXML
    void donespa(ActionEvent event) throws IOException {

        JOptionPane.showMessageDialog(null,"reserved successfully!","Request status",1);
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("servicescene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    @FXML
    void doneaddingservices(ActionEvent event) {
        if(admincodemyservices.getText().equals("A1")){
            chooseServicestxt.setVisible(true);
            spaRadio.setVisible(true);
            drycleaningradio.setVisible(true);
            confirmaddingservices.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Wrong entry","Access denied!",1);
        }
    }
    @FXML
    void AddAdsfunc(ActionEvent event) {
        adstxt1.setVisible(true);
        adstxt2.setVisible(true);
        adstxt3.setVisible(true);
        doneaddingadvertisementsbutton.setVisible(true);

    }
    @FXML
    void DoneAddingads(ActionEvent event) {
        Admin a1= new Admin();
        a1.AddAds(ads1.getText());
        a1.AddAds(ads2.getText());

        adstxt1.setVisible(false);
        adstxt2.setVisible(false);
        adstxt3.setVisible(false);
        ads1.setText(adstxt1.getText());
        ads2.setText(adstxt2.getText());
        ads3.setText(adstxt3.getText());
        ads1.setVisible(true);
        ads2.setVisible(true);
        ads3.setVisible(true);
        addAdvertisementbutton.setVisible(false);
        doneaddingadvertisementsbutton.setVisible(false);
    }
    @FXML
    void approvecheckin(ActionEvent event) {
        if(cashbutton.isSelected()){
            CheckIn ch1= new CheckIn();
            ch1.PaymentMethod(false);
        }
        else if(visabutton.isSelected()){
            cardnumber.setVisible(true);
            securitycode.setVisible(true);
            cardnumbertxt.setVisible(true);
            securitycodetxt.setVisible(true);
            visapayment.setVisible(true);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "123456");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update guests set checkin = '1' where id = '1'");
            JOptionPane.showMessageDialog(null, "you have successfully checked in", "Confirmation", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    @FXML
    void visapayment(ActionEvent event) throws IOException {
        JOptionPane.showMessageDialog(null,"Transaction made successful","payment status",1);
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("servicescene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();
    }
    @FXML
    void exit(ActionEvent event) {
    System.exit(0);
    }
    @FXML
    void approveaccessrequests(ActionEvent event) throws IOException {
        JOptionPane.showMessageDialog(null,"Requests approved","requests status",1);
        Parent LB = FXMLLoader.load(getClass().getClassLoader().getResource("adminscene.fxml"));
        Scene login = new Scene(LB);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(login);
        window.show();

    }



}



