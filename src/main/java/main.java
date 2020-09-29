import models.table;
import services.TableServices;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException, IOException {
        TableServices tableService = new TableServices();
        String row="";
        BufferedReader csvReader = new BufferedReader(new FileReader("test_case.csv" ));
        row = csvReader.readLine();
        //while(csvReader.readLine()!=null&&!csvReader.readLine().isEmpty())
        for(int i=0;i<56817;i++)
        {
            row = csvReader.readLine();
            String[] data = row.split(";");
            table user = new table(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9]);
            tableService.saveUser(user);
            System.out.println();

        }

    }
    public static void read_csv() throws IOException {
        String row="";
        BufferedReader csvReader = new BufferedReader(new FileReader("test_case.csv" ));
        for(int i=0;i<10;i++)
        {
            row = csvReader.readLine();
            String[] data = row.split(";");
            for (int y=0;y<data.length;y++)
            {
                System.out.print(data[y]+" ");
            }
            System.out.println();

        }
        //while ((row = csvReader.readLine()) != null) {
        //   String[] data = row.split(",");
        // do something with the data
        //}
        csvReader.close();

    }

}
