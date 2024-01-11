<p align="center">
  <img width="200" height="200" src="https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/58dec1af-3d86-4464-b796-f75c48576c14" alt="logo del proyecto">
</p>
<h1 align="center">Swing_P02_compendio</h1>
<p align="center">
   <img src="https://img.shields.io/badge/STATUS-COMPLETADO-green">
    <img src="https://img.shields.io/badge/LENGUAJE-JAVA-orange">
   <img src="https://img.shields.io/badge/fecha de creación-octubre del 2023-blue">
   <img src="https://img.shields.io/badge/License-EPL%201.0-red">
</p>

## Contenido de la publicación📑
* **_Descripción del proyecto_**
* **_Desarrollo del proyecto_**
* **_Despliegue (como ejecutar la aplicación desde el ejecutable):_**
  * **_Windows_**
  * **_Línea de comandos_**
* **_Construido con_**
* **_Versionado_**
* **_Autores_**
* **_Licencia_**
* **_Recursos adicionales:_**
  * **_Link a la propia página de GitHub...etc_**

## Descripción del proyecto❔
>Se trata de una interfaz gráfica, que permita gestionar una plataforma de pisos de alquiler turísticos. En este caso
>mi interfaz se ha llamado "IRIS APARTAMENTS" y tiene tanto opciones para salir de nuestra interfaz como para poder dar de alta un piso turistico eligiendo las características que queremos que tenga.
>La opción de dar de baja un piso todavía no está implementada.


## Desarrollo del proyecto🗒️

1º Hemos elegido cual es la paleta de colores que vamos a utilizar en el proyecto:

![paleta](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/3c060253-3104-48d8-9b09-5de04b7d20a2)

2º Ahora vamos a comenzar a desarrollar nuestro proyecto dividiendolo en varias clases con las distintas partes de nuestra interfaz gráfica. Vamos a tener 2 Ventanas: una que será la principal que aparezca para elegir la opción que queremos y otra donde añadiremos toda la información del piso que queremos alquilar.

### Esta es la clase "VentanaPrincipal.java" de la carpeta de desarrollo🗂️
![VentanaPrincipal](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/4bf7dca0-2f0c-4119-8fa3-e899b169b945)

**Como podemos ver tenemos nuestra ventana principal con dos botones: uno de alta pisos y otro de baja pisos, además de tener un menu superior con las opciones de salir, las dos opciones de alta y baja pisos que
podremos acceder por aquí también y la opción de ayuda para más información**

También es importante ir informando al usuario de las acciones que realizamos, así que cuando pulsemos tanto en salir, como en baja pisos, como en ayuda nos a parecerán estos mensajes emergentes:

![Salir](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/9034c7d1-8191-4cd6-9e6a-5d9e7b62b130)

![Ayuda](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/1849379f-52a6-4029-9482-72989ff9500c)

![BajaPisos](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/6b695d42-2ff1-4d29-9ee3-70407e0e36d5)

Una vez que pinchemos en la opción de alta pisos tanto desde el menú como del botón se nos abrirá la otra ventana que es donde introduciremos toda la información

### Esta es la clase "VentanaDialogoAltaPisos.java" de la carpeta de desarrollo🗂️

![VentanaDialogoAltaPisos](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/9a98876f-7e71-4fb2-b620-eaf5be4a0645)

**Para los distintos paneles que aparecen en la ventana los dividiremos en clases distintas y los llamaremos desde esta ventana (PanelTitulo.java, PanelDatosArrendador.java, PanelDatosInmueble.java y PanelImprimirDatos.java)**

Los botones que aparecen en nuestra ventana van a limpiar todos los campos (botón nuevo), poner un mensaje emergente si hemos guardado los datos (botón guardar) y mostrar la información en el panel de imprimir datos (botón imprimir)

![Guardar](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/58bf12e3-43cf-429b-b7ee-d560a02c53a7)

![Imprimir](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/345c29c0-ae5f-4593-967d-1b9fa27d2548)

## Despliegue (como ejecutar la aplicación desde el ejecutable)🖥️

* **Windows**
Simplemente tenemos que pinchar en el ejecutable y se nos abrirá:

>![Windows](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/9dccdb52-7fbc-4ed8-89f1-5e6c6481185d)

* **Linea de comandos**
Abrimos la linea de comandos (cmd) y nos situamos en la ruta donde esté guardado nuestro archivo .jar, una vez ahi ejecutaremos el suguiente comando y se nos abrirá la interfaz:

>![CMD](https://github.com/Irishongki/GitHub_MarkDown_Practica01/assets/48756218/c6fbfde0-9520-4519-8cba-89c120039226)

## Construido con✍️
>He realizado este proyecto con el entorno de trabajo de Eclipse y utilizando el lenguaje Java

## Versionado☑️
>Se trata de la versión 1.0 de este proyecto

## Autores👱‍♀️
>Proyecto realizado por Irene Cañadas Pastor
