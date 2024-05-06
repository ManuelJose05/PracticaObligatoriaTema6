package correos;

import java.time.LocalDate;

public class Plantilla {
    public static String correoEstado(String nombre,String correo, String direccion,String estado, int numSeguimiento) {
        return "<body marginheight=0 marginwidth=0 topmargin=0 leftmargin=0 style=\"height: 100% !important; margin: 0; padding: 0; width: 100% !important;min-width: 100%;\">    \n" +
                "    \n" +
                "<table name=\"bmeMainBody\" style=\"background-color: rgb(255, 144, 0);\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" bgcolor=\"#ff9000\"><tbody><tr><td width=\"100%\" valign=\"top\" align=\"center\"><table name=\"bmeMainColumnParentTable\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td name=\"bmeMainColumnParent\" style=\"border: 0px none transparent; border-radius: 0px; border-collapse: separate; border-spacing: 0px;\"> <table name=\"bmeMainColumn\" class=\"\" style=\"max-width: 100%; border-radius: 0px; border-collapse: separate; border-spacing: 0px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">    <tbody><tr><td class=\"blk_container bmeHolder\" name=\"bmePreHeader\" style=\"color: rgb(102, 102, 102); border: 0px none transparent; background-color: rgb(34, 34, 34);\" width=\"100%\" valign=\"top\" bgcolor=\"#222222\" align=\"center\"><div id=\"dv_2\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_permission\" style=\"\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td name=\"tblCell\" style=\"padding:20px;\" valign=\"top\" align=\"left\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td name=\"bmePermissionText\" style=\"text-align: center;\" align=\"center\"><span style=\"font-family: Arial, Helvetica, sans-serif; font-weight: normal; font-size: 11px;line-height: 140%;\"></span></td></tr></tbody></table></td></tr></tbody></table></div></td></tr> <tr><td class=\"bmeHolder\" name=\"bmeMainContentParent\" style=\"border: 0px none transparent; border-radius: 0px; border-collapse: separate; border-spacing: 0px; overflow: hidden;\" width=\"100%\" valign=\"top\" align=\"center\"> <table name=\"bmeMainContent\" style=\"border-radius: 0px; border-collapse: separate; border-spacing: 0px; border: 0px none transparent;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\"> <tbody><tr><td class=\"blk_container bmeHolder\" name=\"bmeHeader\" style=\"color: rgb(56, 56, 56); border: 0px none transparent; background-color: rgb(34, 34, 34);\" width=\"100%\" valign=\"top\" bgcolor=\"#222222\" align=\"center\"><div id=\"dv_9\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_divider\" style=\"\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"tblCellMain\" style=\"padding-top:20px; padding-bottom:20px;padding-left:20px;padding-right:20px;\"><table class=\"tblLine\" style=\"border-top-width: 0px; border-top-style: none; min-width: 1px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><span></span></td></tr></tbody></table></td></tr></tbody></table></div><div id=\"dv_6\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_text\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><table class=\"bmeContainerRow\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"tdPart\" valign=\"top\" align=\"center\"><table name=\"tblText\" style=\"float:left; background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"left\"><tbody><tr><td name=\"tblCell\" style=\"padding: 20px; font-family: Arial, Helvetica, sans-serif; font-size: 14px; font-weight: normal; color: rgb(56, 56, 56); text-align: left;\" valign=\"top\" align=\"left\"><div style=\"line-height: 150%; text-align: center;\"><span style=\"font-size: 24px; font-family: Arial, Helvetica, sans-serif; color: #ff9000; line-height: 150%;\">FERNANPAAQ</span></div></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></div><div id=\"dv_11\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_divider\" style=\"\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"tblCellMain\" style=\"padding: 5px 20px;\"><table class=\"tblLine\" style=\"border-top-width: 0px; border-top-style: none; min-width: 1px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><span></span></td></tr></tbody></table></td></tr></tbody></table></div><div id=\"dv_3\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_image\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"bmeImage\" style=\"padding: 0px; border-collapse: collapse;\" align=\"center\"><img src=\"https://www.benchmarkemail.com/images/templates_n/new_editor/Templates/Clock/Clock.png\" style=\"max-width: 1200px; display: block; width: 600px;\" alt=\"\" width=\"600\" border=\"0\"></td></tr></tbody></table></td></tr></tbody></table></div>\n" +
                "</td></tr> <tr>" +
                "<td class=\"blk_container bmeHolder\" name=\"bmeBody\" style=\"color: rgb(56, 56, 56); border: 0px none transparent; background-color: rgb(255, 144, 0);\" width=\"100%\" valign=\"top\" bgcolor=\"#ff9000\" align=\"center\"><div id=\"dv_12\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_divider\" style=\"\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"tblCellMain\" style=\"padding-top:20px; padding-bottom:20px;padding-left:20px;padding-right:20px;\"><table class=\"tblLine\" style=\"border-top-width: 0px; border-top-style: none; min-width: 1px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><span></span></td></tr></tbody></table></td></tr></tbody></table></div><div id=\"dv_13\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_text\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><table class=\"bmeContainerRow\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"tdPart\" valign=\"top\" align=\"center\"><table name=\"tblText\" style=\"float:left; background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"left\"><tbody><tr><td name=\"tblCell\" style=\"padding: 20px; font-family: Arial, Helvetica, sans-serif; font-size: 14px; font-weight: normal; color: rgb(56, 56, 56); text-align: left;\" valign=\"top\" align=\"left\"><div style=\"line-height: 150%; text-align: center;\"><span style=\"font-size: 24px; font-family: Arial, Helvetica, sans-serif; color: #ffffff; line-height: 150%;\">" + nombre + " su paquete con numero de seguimiento <strong>" + numSeguimiento + "</strong> esta en " + estado + "</span></div></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></div><div id=\"dv_14\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_text\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><table class=\"bmeContainerRow\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"tdPart\" valign=\"top\" align=\"center\"><table name=\"tblText\" style=\"float:left; background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"left\"><tbody><tr><td name=\"tblCell\" style=\"padding-top: 10px; padding-bottom:10px; padding-left:20px; padding-right:20px; font-family: Arial,Helvetica,sans-serif; font-size: 14px; font-weight: normal; color: #383838; text-align: left;\" valign=\"top\" align=\"left\"><div style=\"line-height: 150%; text-align: center;\"><span style=\"font-size: 16px; font-family: Arial, Helvetica, sans-serif; color: #ffffff; line-height: 150%;\">Su paquete ha sido entregado en " + direccion + " el dia " + LocalDate.now() + ". Gracias por confiar en FERNANPAAQ</span></div></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></div><div id=\"dv_15\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_divider\" style=\"\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"tblCellMain\" style=\"padding: 15px 20px;\"><table class=\"tblLine\" style=\"border-top-width: 0px; border-top-style: none; min-width: 1px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><span></span></td></tr></tbody></table></td></tr></tbody></table></div><div id=\"dv_16\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_boxtext\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td name=\"bmeBoxContainer\" style=\"padding-left:20px; padding-right:20px; padding-top:0px; padding-bottom:0px;\" align=\"center\"><table name=\"tblText\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td style=\"padding: 20px; font-family:Arial, Helvetica, sans-serif; font-weight: normal; font-size: 14px; color: #383838;background-color:rgb(34, 34, 34); border-collapse: collapse;\" name=\"tblCell\" valign=\"top\" align=\"left\"><div style=\"line-height: 150%; text-align: center;\"><span style=\"font-size: 24px; font-family: Arial, Helvetica, sans-serif; color: #ffffff; line-height: 150%;\"><strong>Información de contacto</strong></span><br><br><span style=\"font-size: 14px; font-family: Arial, Helvetica, sans-serif; color: #ffffff; line-height: 150%;\"><br>Correo electrónico del cliente: " + correo + " </span></div></td></tr></tbody></table></td></tr></tbody></table></div><div id=\"dv_17\" class=\"blk_wrapper\"><table class=\"blk\" name=\"blk_image\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td class=\"bmeImage\" style=\"border-collapse: collapse; padding: 0px;\" align=\"center\"><img src=\"https://www.benchmarkemail.com/images/templates_n/new_editor/Templates/Clock/Shadow.png\" style=\"max-width: 1200px; display: block; width: 600px;\" alt=\"\" width=\"600\" border=\"0\"></td></tr></tbody></table></td></tr></tbody></table></div>\n" +
                "\n" +
                "</body>    \n" +
                "</html><img src='http://benchmarkemail.benchurl.com/c/o?e=8E4B52&c=91CEA&t=1&l=7889F345&email=hL2iimIGZvj2QooSzVze1t7P%2FZjRPRKrj2c0%2B7DqUhU%3D&relid=' alt='' border=0 style=\"display:none;\" height=1 width=1>        \n" +
                " ";
    }

    public static String pintaToken(String nombre,int numero){
        return "<head>\n" +
                "<!--[if gte mso 9]>\n" +
                "<xml>\n" +
                "  <o:OfficeDocumentSettings>\n" +
                "    <o:AllowPNG/>\n" +
                "    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "  </o:OfficeDocumentSettings>\n" +
                "</xml>\n" +
                "<![endif]-->\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                "  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
                "  <title></title>\n" +
                "  \n" +
                "    <style type=\"text/css\">\n" +
                "      @media only screen and (min-width: 620px) {\n" +
                "  .u-row {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    vertical-align: top;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-18 {\n" +
                "    width: 108px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-18p34 {\n" +
                "    width: 110.04px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-63p66 {\n" +
                "    width: 381.96px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-100 {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .u-row-container {\n" +
                "    max-width: 100% !important;\n" +
                "    padding-left: 0px !important;\n" +
                "    padding-right: 0px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important;\n" +
                "  }\n" +
                "  .u-row {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col > div {\n" +
                "    margin: 0 auto;\n" +
                "  }\n" +
                "}\n" +
                "body {\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "}\n" +
                "\n" +
                "table,\n" +
                "tr,\n" +
                "td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "  margin: 0;\n" +
                "}\n" +
                "\n" +
                ".ie-container table,\n" +
                ".mso-container table {\n" +
                "  table-layout: fixed;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit;\n" +
                "}\n" +
                "\n" +
                "a[x-apple-data-detectors='true'] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important;\n" +
                "}\n" +
                "\n" +
                "table, td { color: #000000; } #u_body a { color: #cca250; text-decoration: none; } @media (max-width: 480px) { #u_content_image_4 .v-src-width { width: auto !important; } #u_content_image_4 .v-src-max-width { max-width: 57% !important; } #u_content_image_3 .v-container-padding-padding { padding: 46px 10px 10px !important; } #u_content_image_3 .v-src-width { width: auto !important; } #u_content_image_3 .v-src-max-width { max-width: 29% !important; } #u_content_heading_3 .v-container-padding-padding { padding: 10px 20px !important; } #u_content_heading_3 .v-font-size { font-size: 28px !important; } #u_content_text_3 .v-container-padding-padding { padding: 10px 22px 26px !important; } #u_content_heading_2 .v-container-padding-padding { padding: 22px 22px 10px !important; } #u_content_heading_2 .v-font-size { font-size: 24px !important; } }\n" +
                "    </style>\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #f9f9f9;color: #000000\">\n" +
                "  <!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "  <table id=\"u_body\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #f9f9f9;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "  <tbody>\n" +
                "  <tr style=\"vertical-align: top\">\n" +
                "    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #f9f9f9;\"><![endif]-->\n" +
                "    \n" +
                "  \n" +
                "  \n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #111114;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #111114;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_image_4\" style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:20px 10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"images/image-6.png\" alt=\"Logo\" title=\"Logo\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 44%;max-width: 255.2px;\" width=\"255.2\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "  \n" +
                "\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"background-color: #fffefe;width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"background-color: #fffefe;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_image_3\" style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:55px 10px 10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"images/image-1.png\" alt=\"Tick Icon\" title=\"Tick Icon\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 14%;max-width: 81.2px;\" width=\"81.2\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_heading_3\" style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 55px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <!--[if mso]><table width=\"100%\"><tr><td><![endif]-->\n" +
                "    <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 160%; text-align: center; word-wrap: break-word; font-family: 'Montserrat',sans-serif; font-size: 33px; font-weight: 400;\"><span><strong>" + numero + "</strong></span></h1>\n" +
                "  <!--[if mso]></td></tr></table><![endif]-->\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_text_3\" style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 60px 50px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-font-size\" style=\"font-size: 14px; color: #444444; line-height: 170%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 170%;\"><span style=\"font-size: 16px; line-height: 27.2px;\">" + nombre.toUpperCase() + " AQUI TIENE SU NÚMERO DE CONFIRMACIÓN PARA REGISTRARSE EN FERNANPAAQ  </span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "  \n" +
                "\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"108\" style=\"width: 108px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-18\" style=\"max-width: 320px;min-width: 108px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid #ffffff;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"379\" style=\"background-color: #cca250;width: 379px;padding: 20px;border-top: 1px solid #CCC;border-left: 1px solid #CCC;border-right: 1px solid #CCC;border-bottom: 1px solid #CCC;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-63p66\" style=\"max-width: 320px;min-width: 381.96px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"background-color: #cca250;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 20px;border-top: 1px solid #CCC;border-left: 1px solid #CCC;border-right: 1px solid #CCC;border-bottom: 1px solid #CCC;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <!--[if mso]><table width=\"100%\"><tr><td><![endif]-->\n" +
                "    <h1 class=\"v-font-size\" style=\"margin: 0px; color: #ffffff; line-height: 160%; text-align: center; word-wrap: break-word; font-family: 'Montserrat',sans-serif; font-size: 20px; font-weight: 400;\"><span><strong>FERNANPAAQ</strong></span></h1>\n" +
                "  <!--[if mso]></td></tr></table><![endif]-->\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-font-size\" style=\"font-size: 14px; color: #f1f8f5; line-height: 200%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 200%;\"><span style=\"color: #f7e1b5; font-size: 14px; line-height: 28px;\"><strong><span style=\"font-size: 14px; line-height: 28px;\">✓</span></strong> </span> Envíos rápidos 24/48h</p>\n" +
                "<p style=\"font-size: 14px; line-height: 200%;\"><span style=\"color: #f7e1b5; font-size: 14px; line-height: 28px;\"><strong>✓</strong></span>  Envíos disponibles para toda la península</p>\n" +
                "<p style=\"font-size: 14px; line-height: 200%;\"><span style=\"color: #f7e1b5; font-size: 14px; line-height: 28px;\">✓</span>  Envíos seguros</p>\n" +
                "<p style=\"font-size: 14px; line-height: 200%;\"><span style=\"color: #f7e1b5; font-size: 14px; line-height: 28px;\">✓</span>  Envíos totalmente gratis</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"110\" style=\"width: 110px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-18p34\" style=\"max-width: 320px;min-width: 110.04px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid #ffffff;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "  \n" +
                "\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_heading_2\" style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:40px 55px 10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <!--[if mso]><table width=\"100%\"><tr><td><![endif]-->\n" +
                "    <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 160%; text-align: center; word-wrap: break-word; font-family: 'Montserrat',sans-serif; font-size: 26px; font-weight: 400;\"><span><span></span></span></h1>\n" +
                "  <!--[if mso]></td></tr></table><![endif]-->\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:0px 60px 20px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-font-size\" style=\"font-size: 14px; color: #444444; line-height: 170%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 170%;\"><span style=\"font-size: 16px; line-height: 27.2px;\">Gracias por registrarse en FernanPaaq!!</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 50px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <!--[if mso]><style>.v-button {background: transparent !important;}</style><![endif]-->\n" +
                "<div align=\"center\">\n" +
                "  <!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"https://unlayer.com/\" style=\"height:45px; v-text-anchor:middle; width:66px;\" arcsize=\"9%\"  stroke=\"f\" fillcolor=\"#ffffff\"><w:anchorlock/><center style=\"color:#FFFFFF;\"><![endif]-->\n" +
                "    <a href=\"https://unlayer.com/\" target=\"_blank\" class=\"v-button v-font-size\" style=\"box-sizing: border-box;display: inline-block;text-decoration: none;-webkit-text-size-adjust: none;text-align: center;color: #FFFFFF; background-color: #ffffff; border-radius: 4px;-webkit-border-radius: 4px; -moz-border-radius: 4px; width:auto; max-width:100%; overflow-wrap: break-word; word-break: break-word; word-wrap:break-word; mso-border-alt: none;font-size: 14px;\">\n" +
                "      <span style=\"display:block;padding:14px 33px;line-height:120%;\"></span>\n" +
                "    </a>\n" +
                "    <!--[if mso]></center></v:roundrect><![endif]-->\n" +
                "</div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "  \n" +
                "\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #111114;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #111114;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:32px 10px 0px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-font-size\" style=\"font-size: 14px; color: #ffffff; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 18px; line-height: 25.2px;\"><strong>FernanPaaq</strong></span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-font-size\" style=\"font-size: 14px; color: #b0b1b4; line-height: 180%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 180%;\">IES FERNANDO III, MARTOS, JAÉN</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<div align=\"center\">\n" +
                "  <div style=\"display: table; max-width:211px;\">\n" +
                "  <!--[if (mso)|(IE)]><table width=\"211\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse;\" align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:211px;\"><tr><![endif]-->\n" +
                "  \n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 21px;\" valign=\"top\"><![endif]-->\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 21px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
                "          <img src=\"images/image-2.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 21px;\" valign=\"top\"><![endif]-->\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 21px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://twitter.com/\" title=\"Twitter\" target=\"_blank\">\n" +
                "          <img src=\"images/image-3.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 21px;\" valign=\"top\"><![endif]-->\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 21px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://instagram.com/\" title=\"Instagram\" target=\"_blank\">\n" +
                "          <img src=\"images/image-5.png\" alt=\"Instagram\" title=\"Instagram\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 0px;\" valign=\"top\"><![endif]-->\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 0px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://linkedin.com/\" title=\"LinkedIn\" target=\"_blank\">\n" +
                "          <img src=\"images/image-4.png\" alt=\"LinkedIn\" title=\"LinkedIn\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "    \n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"82%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #9495a7;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Montserrat',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:0px 10px 13px;font-family:'Montserrat',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-font-size\" style=\"font-size: 14px; color: #b0b1b4; line-height: 180%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 180%;\">© MANUEL JOSE All Rights Reserved</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "  \n" +
                "\n" +
                "\n" +
                "    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
                "    </td>\n" +
                "  </tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "  <!--[if mso]></div><![endif]-->\n" +
                "  <!--[if IE]></div><![endif]-->\n" +
                "</body>\n" +
                "\n";
    }

    public static String tokenRegistro(String nombreUsuario, String correo,int numToken){
        return "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "<head>\n" +
                "<!--[if gte mso 9]>\n" +
                "<xml>\n" +
                "  <o:OfficeDocumentSettings>\n" +
                "    <o:AllowPNG/>\n" +
                "    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "  </o:OfficeDocumentSettings>\n" +
                "</xml>\n" +
                "<![endif]-->\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                "  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
                "  <title></title>\n" +
                "  \n" +
                "    <style type=\"text/css\">\n" +
                "      @media only screen and (min-width: 620px) {\n" +
                "  .u-row {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    vertical-align: top;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-100 {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .u-row-container {\n" +
                "    max-width: 100% !important;\n" +
                "    padding-left: 0px !important;\n" +
                "    padding-right: 0px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important;\n" +
                "  }\n" +
                "  .u-row {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col > div {\n" +
                "    margin: 0 auto;\n" +
                "  }\n" +
                "}\n" +
                "body {\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "}\n" +
                "\n" +
                "table,\n" +
                "tr,\n" +
                "td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "  margin: 0;\n" +
                "}\n" +
                "\n" +
                ".ie-container table,\n" +
                ".mso-container table {\n" +
                "  table-layout: fixed;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit;\n" +
                "}\n" +
                "\n" +
                "a[x-apple-data-detectors='true'] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important;\n" +
                "}\n" +
                "\n" +
                "table, td { color: #000000; } #u_body a { color: #0000ee; text-decoration: underline; } @media (max-width: 480px) { #u_content_image_2 .v-src-width { width: auto !important; } #u_content_image_2 .v-src-max-width { max-width: 31% !important; } #u_content_image_1 .v-container-padding-padding { padding: 40px 10px 5px !important; } #u_content_image_1 .v-src-width { width: auto !important; } #u_content_image_1 .v-src-max-width { max-width: 50% !important; } #u_content_heading_1 .v-font-size { font-size: 18px !important; } #u_content_text_2 .v-container-padding-padding { padding: 10px !important; } #u_content_button_1 .v-text-align { text-align: left !important; } #u_content_text_1 .v-container-padding-padding { padding: 10px 10px 40px !important; } }\n" +
                "    </style>\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Raleway:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><link href=\"https://fonts.googleapis.com/css2?family=Arvo&display=swap\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #ffffff;color: #000000\">\n" +
                "  <!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "  <table id=\"u_body\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #ffffff;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "  <tbody>\n" +
                "  <tr style=\"vertical-align: top\">\n" +
                "    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "    \n" +
                "  \n" +
                "  \n" +
                "    <!--[if gte mso 9]>\n" +
                "      <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;\">\n" +
                "        <tr>\n" +
                "          <td background=\"https://cdn.templates.unlayer.com/assets/1704365105617-bg.png\" valign=\"top\" width=\"100%\">\n" +
                "      <v:rect xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"true\" stroke=\"false\" style=\"width: 600px;\">\n" +
                "        <v:fill type=\"frame\" src=\"https://cdn.templates.unlayer.com/assets/1704365105617-bg.png\" /><v:textbox style=\"mso-fit-shape-to-text:true\" inset=\"0,0,0,0\">\n" +
                "      <![endif]-->\n" +
                "  \n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-image: url('images/image-2.png');background-repeat: no-repeat;background-position: center top;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-image: url('images/image-2.png');background-repeat: no-repeat;background-position: center top;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_image_2\" style=\"font-family:'Raleway',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:30px 10px 15px;font-family:'Raleway',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"images/image-1.png\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 16%;max-width: 92.8px;\" width=\"92.8\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "  \n" +
                "    <!--[if gte mso 9]>\n" +
                "      </v:textbox></v:rect>\n" +
                "    </td>\n" +
                "    </tr>\n" +
                "    </table>\n" +
                "    <![endif]-->\n" +
                "    \n" +
                "\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "    <!--[if gte mso 9]>\n" +
                "      <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;\">\n" +
                "        <tr>\n" +
                "          <td background=\"https://cdn.templates.unlayer.com/assets/1704365105617-bg.png\" valign=\"top\" width=\"100%\">\n" +
                "      <v:rect xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"true\" stroke=\"false\" style=\"width: 600px;\">\n" +
                "        <v:fill type=\"frame\" src=\"https://cdn.templates.unlayer.com/assets/1704365105617-bg.png\" /><v:textbox style=\"mso-fit-shape-to-text:true\" inset=\"0,0,0,0\">\n" +
                "      <![endif]-->\n" +
                "  \n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-image: url('images/image-2.png');background-repeat: no-repeat;background-position: center top;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-image: url('images/image-2.png');background-repeat: no-repeat;background-position: center top;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_image_1\" style=\"font-family:'Raleway',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:60px 10px 15px;font-family:'Raleway',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"images/image-3.png\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 35%;max-width: 203px;\" width=\"203\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_heading_1\" style=\"font-family:'Raleway',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 20px;font-family:'Raleway',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <!--[if mso]><table width=\"100%\"><tr><td><![endif]-->\n" +
                "    <h1 class=\"v-text-align v-font-size\" style=\"margin: 0px; line-height: 140%; text-align: center; word-wrap: break-word; font-family: Arvo; font-size: 25px; font-weight: 400;\"><span><span><span><span><span><span><span><span><strong> " + numToken + "  </strong><br /></strong></span></span></span></span></span></span></span></span></h1>\n" +
                "  <!--[if mso]></td></tr></table><![endif]-->\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_text_2\" style=\"font-family:'Raleway',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 70px;font-family:'Raleway',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align v-font-size\" style=\"font-size: 14px; line-height: 170%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"line-height: 170%;\"><span data-metadata=\"&lt;!--(figmeta)eyJmaWxlS2V5Ijoia1NVOHd0cGhRU2w3YnZMY2JvWVd6USIsInBhc3RlSUQiOjE3MTIwNTA3NDUsImRhdGFUeXBlIjoic2NlbmUifQo=(/figmeta)--&gt;\" style=\"line-height: 23.8px;\"></span>Querido " + nombreUsuario + " aquí tiene su código de confirmación para activar su cuenta en FernanPaaq. Recordarle que el correo utilizado para dicha cuenta es " + correo + "</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_button_1\" style=\"font-family:'Raleway',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Raleway',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <!--[if mso]><style>.v-button {background: transparent !important;}</style><![endif]-->\n" +
                "<div class=\"v-text-align\" align=\"center\">\n" +
                "  <!--[if mso]><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr><td align=\"center\" bgcolor=\"#ffffff\" style=\"padding:10px 20px;\" valign=\"top\"><![endif]-->\n" +
                "    <a href=\"https://unlayer.com\" target=\"_blank\" class=\"v-button v-font-size\" style=\"box-sizing: border-box;display: inline-block;text-decoration: none;-webkit-text-size-adjust: none;text-align: center;color: #000000; background-color: #ffffff; border-radius: 4px;-webkit-border-radius: 4px; -moz-border-radius: 4px; width:auto; max-width:100%; overflow-wrap: break-word; word-break: break-word; word-wrap:break-word; mso-border-alt: none;font-size: 14px;\">\n" +
                "      <span style=\"display:block;padding:10px 20px;line-height:120%;\"><strong>Detalles</strong></span>\n" +
                "    </a>\n" +
                "    <!--[if mso]></td></tr></table><![endif]-->\n" +
                "</div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_text_1\" style=\"font-family:'Raleway',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 70px 60px;font-family:'Raleway',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align v-font-size\" style=\"font-size: 15px; line-height: 160%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"line-height: 160%;\">En caso de algún error por favor contacte con nosotros de inmediato al correo manuel.liebana.2001@fernando3martos.com</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Raleway',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Raleway',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 10px solid #ffffff;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "  \n" +
                "    <!--[if gte mso 9]>\n" +
                "      </v:textbox></v:rect>\n" +
                "    </td>\n" +
                "    </tr>\n" +
                "    </table>\n" +
                "    <![endif]-->\n" +
                "    \n" +
                "\n" +
                "\n" +
                "    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
                "    </td>\n" +
                "  </tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "  <!--[if mso]></div><![endif]-->\n" +
                "  <!--[if IE]></div><![endif]-->\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }
}
