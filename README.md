# MANUAL DE USUARIO FERNANPAAQ
Practica Obligatoria Tema 6. Programa de una compañia de transportes realizado por Manuel José Liébana

## Índice
1. [Comenzando](#comenzando)
2. [Requisitos Mínimos](#requisitos)
3. [Instalación](#Instalación)
4. [Ejecucion](#ejecucion)
5. [Colaboradores](#colaboradores)


## 🔰​ Comenzando 🔰​

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

## ✔ Requisitos Mínimos ✔

_Debes tener instalado Windows 10 o Windows 11 (x64) y la siguiente versión de java
**Oracle OpenJDK 21.0.2**, para descargarla acceda al siguiente enlace_

```
https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe
```

Para comprobar la version de java que tenemos instalada en nuestro equipo, escribimos "cmd" en el buscador de Windows. Después de ejecutarlo, escribimos "java-version" en la terminal.

_A continuación, debes tener el siguiente path en tus variables de entorno del sistema, si no sabes mirarlo en el buscador de Windows "Editar las variables del entorno" y por último añadir la siguiente línea al path si no la tienes:_

```
C:\Program Files\Java\jdk-21\bin
```

## 🔧 Instalación 🔧

_Una vez cumplas los requisitos, debes descargarte nuestro repositorio, pulsando en el siguiente botón:_

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/e0b4fa4b-e48f-4d22-ae78-8029e76f5e6c)

_Ahora crea una carpeta llamada "practicaTema6" con los archivos dentro y situalos en el disco C: solo tendrás que descomprimirlo con permisos de administrador para pasar al siguiente apartado_

## ⚙️ Ejecución ⚙️
_Dentro de la carpeta se encuentra un ejecutable llamado **practicaTema6**. Para acceder al programa primero debe cumplir los requisitos y después puede abrir la aplicación._
_Al abrir la aplicación se encontrará con la siguiente pantalla:_

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/3543e4e1-d027-48ad-8cf9-231deecc082a)

Encontrarás un menú con las siguientes opciones:
1. Login
2. Registrarse
3. Seguir un envío con el número de seguimiento
4. Log out

## 1. Iniciar sesión
Debemos introducir un usuario y contraseña de una cuenta registrada para acceder al programa.

  ### Inicio de sesión como usuario

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/28216291-30a3-444b-bb76-ccc709515749)

Una vez iniciada la sesión, nos aparecerá una pequeña frase de bienvenida con el nombre de usuario y el número de paquetes que tiene pendiente de entrega, además de otro menú.
El menú contendrá las siguientes opciones:
1. Realizar un envío
2. Muestra información
3. Modificar mis datos de entrega para un envío
4. Muestra información de los envíos que yo he realizado
5. Ver mi perfil
6. Modificar mis datos
7. Cerrar sesión

  #### 1.- Realizar un envío
El programá nos pedirá el correo electrónico de un usuario, si este no encuentra ningún usuario con ese usuario, nos pedirá su número de teléfono. En caso de no encontrar ninguna de las 2 variantes, comenzaremos a introducir los datos del envío y se añaderá a "Envíos de usuarios no registrados", de caso contrario, usará la información del usuario registrado para el envío.

    Envío a usuario no registrado
    
  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/c879a56f-b137-465e-87a0-d92bd0014858)
 
    Envío a  usuario registrado
    
  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/ad51845c-cfad-45ba-9c0b-ee5be64be51d)


  Si al crear un envío indicamos que queremos recibir información, cada vez que se asigne un conductor o se modifique el estado de un envío se enviará un mensaje al correo del usuario que recibirá el paquete indicando dicha operación.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/59bb734d-2c37-4114-bc14-89bdc6757d1f)


  #### 2.- Muestra información
  Muestra al usuario la información de los envíos que son dirigidos a él.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/bccd0811-b0d4-44bc-8e91-dc4d09c4b4cc)


  #### 3.- Modificar mis datos de entrega para un envío
  El usuario puede modificar la dirección de entrega de un envío introduciendo el id del envío

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/bfa43299-3e52-4934-b702-9f17e5f550e4)


  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/12bb400f-0670-49cf-8cbd-27d5f38c5088)
  

  #### 4.- Muestra información de los envíos que yo he realizado
  Muestra al usuario la información de los envíos que él ha enviado a otros usuarios

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/fa956dcb-bc3d-484e-8373-77d870218b48)

  #### 5.- Ver mi perfil
  Muestra al usuario la información de su cuenta de usuario en el programa

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/1308397a-1883-4290-8f1f-d0ec533b5018)

  #### 6.- Modificar mis datos
  El programa nos pregunta que deseamos modificar de la cuenta, introducimos la opción y rellenamos las preguntas con la nueva información

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/187d68b3-aac5-474d-a9fc-3a9230b29205)


  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/28e27c4b-4d08-4863-8e1e-dc6d8bf3707f)

  #### 7.- Cerrar sesión
  El programa cierra la sesión del usuario y volvemos al menú de inicio

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/a68626ac-c846-4863-95a7-5c6af5dcb72e)


  ### Inicio de sesión como conductor
  Nos aparecerá el siguiente menú

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/bee46b07-d1e7-4d20-881d-f2fc799ac3d3)

Las opciones serán las siguientes:
1. Información de los envíos pendientes de entrega
2. Cambiar el estado de un envío
3. Ver el histórico de paquetes entregados
4. Añadir una zona de entrega a mi perfil
5. Ver mi perfil
6. Modificar mis datos
7. Salir

  #### 1.- Información de los envíos pendientes de entrega
  Esta opción muestra al conductor la información de envíos que tenga sin entregar

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/b4c2ce51-1f95-49bc-9460-dfc13c6e798d)

  #### 2.- Cambiar el estado de un envío
  Esta opción muestra al conductor los envíos que no estan entregados para poder modificar su estado, puede seleccionar 3 estados (En oficina de origen | En reparto | Entregado).
  Si el envío tiene activadas las notificaciones, cada vez que el conductor modifique el envío se enviará un mensaje al correo del destinatario explicando el cambio de estado.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/4e2b248b-1957-4443-9ce9-43f42d147dd6)
  

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/0644571c-05dd-4846-bd11-a50bf79c93fe)


  #### 3.- Ver el histórico de paquetes entregados
  Se muestra por pantalla todos los paquetes que el conductor tiene entregados

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/b7aa23e0-c4be-45a1-ba85-27dae9cb79da)

  #### 4.- Añadir una zona de entrega a mi perfil
  El conductor puede añadir más zonas de entregas para recibir más envíos (Se introduce el código postal de la zona de entrega)

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/ae88bb68-1710-4c16-82ee-fec545bbf9a7)

  #### 5.- Ver mi perfil
  Se muestra en pantalla la información del conductor

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/59935f54-c824-4208-9466-49aa0ff67807)

  #### 6.- Modificar mis datos
  El conductor puede cambiar su email y contraseña cuando él desee.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/9edc113b-48ae-4a25-8a07-fdf307c01820)

  #### 7.- Salir
  El programa cierra la sesión del conductor y vuelve a mostrar el menú de inicio

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/8d0df4ba-d53d-40a7-ab21-2fe8ac498a3c)


  ### Inicio de sesión como administrador
  Al iniciar sesión como administrador, nos aparecerá el siguiente menú.

  Nos muestra cuantos usuarios y conductores hay registrados en el programa, así como el número de envíos pendientes de entrega, sin conductor y número de envíos a usuarios no registrados. Además nos muestra la media de días que tarda la empresa en entregar un paquete.

  Las opciones del menú son:
  1. Ver los envíos sin asignar
  2. Asignar un envío a un conductor
  3. Ver un resumen de los usuarios registrados
  4. Ver un resumen de los conductores registrados
  5. Ver mi perfil
  6. Modificar mis datos
  7. Registrar un conductor
  8. Cerrar sesión
  9. Salir


  #### 1.- Ver los envíos sin asignar
  Muestra los envíos que no tienen asignado un conductor

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/3a1786f0-e474-41a9-90c9-973313c63bf4)

  #### 2.- Asignar un envío a un conductor
  El programa muestra al administrador los envíos que no tienen conductor, así como los conductores que tiene esa zona de entrega. El admin es el que selecciona el envío a asignar además del conductor

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/a178149d-4f01-46bd-8cf0-6c3f7f459962)

  Si el envío tiene activada las notificaciones, el programa envía un mensaje al correo del recibidor indicando que se le ha asignado un conductor a su envío.

  #### 3.- Ver un resumen de los usuarios registrados
  Se muestra la información de todos los usuarios registrados en el programa
  
  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/fbf9fdfb-37b9-4e24-a196-20eb024e4c68)

  #### 4.- Ver un resumen de los conductores registrados
  Se muestra la información de todos los conductores registrados en el programa
  
  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/9fa2bdf5-74f4-4e31-b91c-88ccff4d986a)

  #### 5.- Ver mi perfil
  Se muestra la información del administrador

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/7b424719-9a0e-48dc-a893-490813350e22)

  #### 6.- Modificar mis datos
  El administrador puede cambiar su email y contraseña

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/19b05b33-8168-4d8d-8208-e8fa1440395e)

  #### 7.- Mostrar la configuración del sistema
  Esta opción permite al administrador ver toda la configuración existente en el fichero "config.properties".

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/2e1ca376-ea99-44c4-b569-55e00892b270)

  #### 8.- Registrar un conductor
  El administrador es el único que puede registrar a un conductor. Deberá introducir su nombre, email y contraseña además de un código de confirmación que se envía al correo del conductor.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/94e510b7-50d5-476d-a6fe-02a12863ad90)


  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/b711028e-f5f0-42f6-b6b7-64f0a5cf2ac0)

  #### 9.- Hacer una copia de seguridad
  En la nueva versión se implementa una nueva funcionalidad al sistema la cúal hace capaz al administrador de generar una copia de seguridad del sistema.
  En la captura da un error ya que la ruta debe ser correcta para que el programa pueda crear la copia correctamente.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/0389ab91-8491-4622-b12b-47e6cf8c35c3)

  #### 10.- Exportar los envíos
  Esta nueva implementación otorga al administrador la posibilidad de exportar toda la información de los envíos a un fichero ".xls".
  El fichero se guarda en una carpeta llamada "Excel" dentro de la carpeta del proyecto.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/f1028fb4-a389-42a3-a439-9b017d58ac92)

  #### 11.- Cerrar sesión
  El programa cierra la sesión del administrador y muestra el menú de inicio

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/4ddc3f17-1467-4722-a771-06cfeaaab34f)

  #### 12.- Salir
  Se cierra el programa entero

### 2. Registrarse
El programa nos pedirá que introduzcamos nombre de usuario, apellidos, email, contraseña, dirección de entrega (código postal, provincia, ciudad, calle, número domicilio) y por último este enviará un mensaje al correo introducido con un número de confirmación para asegurar que el correo es válido. En caso de no introducir correctamente ese código, no se registrará al usuario.

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/852698bf-26b7-48a1-aff3-fe7f1642587b)


![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/e6f51e79-205c-42db-b20a-4abe3d8ad7cf)


#### 3. Seguir un envío con el número de seguimiento
Esta opción permite a cualquier usuario ver una pequeña información de un envío introduciendo su número de seguimiento.
En la nueva versión del programa, esta opción puede ser desabilitada al gusto del programador en el fichero de configuración "properties".

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/9541469d-5dbf-4ce7-93b9-0d0a2268f160)


#### 4. Log out
Se apaga el sistema por completo

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/2df370ad-5608-47c2-b377-2a8d657b8fbe)
