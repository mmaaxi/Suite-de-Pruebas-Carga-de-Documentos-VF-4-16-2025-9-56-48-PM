Feature: Validar carga de documento con formato válido

  Scenario: Subir un documento con un formato permitido
    Given que el usuario tiene la página de carga de documentos abierta
    When el usuario selecciona un archivo en formato permitido
    Then el sistema muestra la vista previa del archivo
    When el usuario hace clic en 'Cargar documento'
    Then el archivo se carga exitosamente