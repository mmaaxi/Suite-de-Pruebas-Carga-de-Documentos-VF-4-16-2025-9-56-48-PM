Feature: Validar límite de tamaño de archivo

  Escenario: Rechazo de carga por exceder el tamaño de archivo permitido
    Dado que el usuario está en la página de carga de archivos
    Cuando selecciona un archivo que excede el límite permitido
    Entonces el sistema rechaza la carga
    Y muestra un mensaje de error de tamaño