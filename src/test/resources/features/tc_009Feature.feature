Feature: Validación de carga de documento en diferentes navegadores

  Escenario: Cargar un documento exitosamente desde Chrome, Firefox y Edge
    Dado que el usuario está en la página de carga de documentos
    Cuando el usuario carga un documento desde Chrome
    Entonces el sistema debe responder de manera consistente
    Cuando el usuario carga un documento desde Firefox
    Entonces el sistema debe responder de manera consistente
    Cuando el usuario carga un documento desde Edge
    Entonces el sistema debe responder de manera consistente