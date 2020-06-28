Se realizo un menú para poder acceder a cada uno de los ejercicios, además de tener un botón al ingresar a cada ejercicio y regresar respectivamente al menú.
7. Control ListView (con una lista de String)
Problema:
Disponer un ListView con los nombres de países de Sudamérica. Cuando se seleccione un país mostrar en un TextView la cantidad de habitantes del país seleccionado.
La interfaz visual a implementar es la siguiente (primero disponemos un TextView en la parte superior (cuyo id lo definimos con el valor tv1) y un ListView (y definimos su id con el valor list1)):

En los dos vectores paralelos se almacena en uno los nombres de países y en el otro la cantidad de habitantes de los países mencionados. Definimos un objeto de tipo TextView y otro de tipo ListView donde se almacenará las referencias a los objetos que definimos en el archivo XML. Creando un objeto de clase ArrayAdapter. Dentro del método onItemClick se cambia el contenido del TextView con el nombre del país y la cantidad de habitantes de este. Este método recibe en el tercer parámetro la posición del item seleccionado del ListView. Cuando se ejecuta el proyecto se visualiza la interfaz en el emulador.

8. Control ImageButton
Problema:
Disponer un objeto de la clase ImageButton que muestre una imagen de un teléfono. Cuando se presione mostrar en un control TextView el mensaje "Llamando".
Nos permite de poner una imagen con botón y al presionarle y realizar una acción el cual nos permite que aperesca un texto que diga Llamando.

Se crea el proyecto. Se busca una imagen de teléfono en formato jpg que se va a utilizar 50*50 píxeles. Se copia el archivo a la carpeta de recursos del proyecto el cual contaba con dos imágenes por defecto. El destino para la imagen no se lo puede visualizar en Android Studio por lo que debemos realizarlo por el explorador ir a Usuarios, seleccionar el usuario que se encuentre conectado, ingresar a la carpeta AndroidStudioProjects y seleccionar la carpeta con el nombre de nuestro proyecto.
La imagen de la clase ImageButton se encontrará en la pestaña "Images & Media". Cuando se copia el archivo se guardó en la carpeta: mipmap-mdpi. Las siguientes carpetas cuentan con los siguientes tamaños y resoluciones:
mipmap-mdpi de tamaño original
mipmap-hdpi de 150%
mipmap-xhdpi de 200%
mipmap-xxhdpi de 300%
mipmap-xxxhdpi de 400%

16. Almacenamiento en una base de datos SQLite
Problema:
Confeccionar un programa que permita almacenar los datos de artículos. Crear la tabla artículos y definir los campos código, descripción del articulo y precio.
El programa debe permitir:
1 - Carga de articulo.
2 - Consulta por el código.
3 - Consulta por la descripción.
4 - Borrado de un artículo ingresando su código.
4 - Modificación de la descripción y el precio.

Se guardará en la base de datos que tiene Android que es SQLite y podemos escoger por código, modificarlos, eliminarlos para una consulta respectiva.
Primero se creará una clase que herede SQLiteOpenHelper que nos permitirá crear la base de datos y actualizar las tablas y datos. Luego se crea una nueva clase. Se codifica la clase que tendrá la base de datos que se creará. 
La clase SQLiteOpenHelper se implementará dos métodos: onCreate y onUpgrade. En el método onCreate se creará la tabla con los campos requeridos y para modificar la tabla debemos hacerlo en el método onUpgrade.
Para borrar uno o más registros la clase SQLiteDatabase tiene un método en el primer parámetro el nombre de la tabla y en el segundo la condición que debe cumplirse para borrar la fila de la tabla. El método delete retorna un entero que indica la cantidad de registros borrados. 


35. Dibujar: texto
Problema: 
Clase Canvas es el de graficar texto. 

Dibuja a través de parámetros y podemos dibujar cualquier tipo de figuras dibujo un texto y otros dibujitos así también.
Primero se crea un proyecto. Para graficar texto se dispone del método drawText que permite imprimir un String en una determinada columna o fila con un determinado pincel que puede definirse el color.
          
42. internacionalización y archivos strings.xml
Problema:
Crear un nuevo proyecto y confeccionar el mismo problema del concepto anterior donde estudiamos el archivo strings.xml. Ahora haremos que muestre su interfaz según la configuración del idioma seleccionado en el dispositivo.

Este es una característica que tienen o deben tener los celulares que en la actualidad aun esta pasando que la aplicación tome el idioma y según eso se traduzca el sistema.
Aparecerá un diálogo donde se indica que se creará un archivo llamado "strings" se selecciona "Locate" y se presiona el botón ">>". Luego se selecciona el idioma. Se tiene el archivo strings.xml donde se dispone las traducciones del archivo strings.xml. Al acceder al emulador de Android se configurar al idioma deseado:
tecla home -> tecla menú -> configuración > Idioma y teclado > Seleccionar idioma



