package excel;

import com.aspose.cells.Cells;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import config.Config;
import models.Shipment;
import utils.Utils;

import java.util.ArrayList;

public class Excel {
        public static void generaExcel(ArrayList<Shipment> shipments) {
            // Instantiate a new Excel workbook instance
            Workbook ExcelWorkbook = new Workbook();

            // Get reference to first worksheet in the workbook
            Worksheet ExcelWorksheet = ExcelWorkbook.getWorksheets().get(0);

            // Get reference to Cells collection in the first worksheet
            Cells WorksheetCells = ExcelWorksheet.getCells();

            // Insert data into the worksheet using the cells collection
            WorksheetCells.get("A1").putValue("Id del envío");
            WorksheetCells.get("B1").putValue("Fechad de creación");
            WorksheetCells.get("C1").putValue("Fecha estimada de entrega");
            WorksheetCells.get("D1").putValue("Fecha de entrega");
            WorksheetCells.get("E1").putValue("Remitente");
            WorksheetCells.get("F1").putValue("Destinatario");
            WorksheetCells.get("G1").putValue("Notificaciones");
            WorksheetCells.get("H1").putValue("Código postal alternativo");
            WorksheetCells.get("I1").putValue("Dirección de entrega alternativa");
            WorksheetCells.get("J1").putValue("Ciudad alternativa");
            WorksheetCells.get("K1").putValue("Estado del envío");
            WorksheetCells.get("L1").putValue("Nombre de usuario no registrado");
            WorksheetCells.get("M1").putValue("Correo de usuario no registrado");

            int cont = 2;
            for (int i = 0; i < shipments.size() ; i++) {
                WorksheetCells.get("A"+ (i + cont)).putValue(shipments.get(i).getId());
                WorksheetCells.get("B"+ (i + cont)).putValue(shipments.get(i).getCreateDate());
                WorksheetCells.get("C"+ (i + cont)).putValue((shipments.get(i).getExpectDate() == null)?"Sin especificar": Utils.dayFormatter(shipments.get(i).getExpectDate()));
                WorksheetCells.get("D"+ (i + cont)).putValue((shipments.get(i).getDeliveryDate() == null)?"Sin especificar":Utils.dayFormatter(shipments.get(i).getDeliveryDate()));
                WorksheetCells.get("E"+ (i + cont)).putValue(shipments.get(i).getIdSender());
                WorksheetCells.get("F"+ (i + cont)).putValue((shipments.get(i).getIdReciever() == 0)?"Usuario no registrado":shipments.get(i).getIdReciever());
                WorksheetCells.get("G"+ (i + cont)).putValue(shipments.get(i).isNotifications());
                WorksheetCells.get("H"+ (i + cont)).putValue(shipments.get(i).getAlternativePostalCode());
                WorksheetCells.get("I"+ (i + cont)).putValue((shipments.get(i).getAlternativeAddress() == null)?"No existe dirección alternativa":shipments.get(i).getAlternativeAddress());
                WorksheetCells.get("J"+ (i + cont)).putValue((shipments.get(i).getAlternativeCity() == null)?"No existe ciudad alternativa":shipments.get(i).getAlternativeCity());
                WorksheetCells.get("K"+ (i + cont)).putValue(shipments.get(i).getStatus());
                WorksheetCells.get("L"+ (i + cont)).putValue((shipments.get(i).getNameUserNoRegister() == null)?"Sin especificar":shipments.get(i).getNameUserNoRegister());
                WorksheetCells.get("M"+ (i + cont)).putValue((shipments.get(i).getEmailUserNoRegister() == null)?"Sin especificar":shipments.get(i).getEmailUserNoRegister());
            }

            // Save the workbook as XLSX
            try {
                ExcelWorkbook.save(Config.excelPath());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
