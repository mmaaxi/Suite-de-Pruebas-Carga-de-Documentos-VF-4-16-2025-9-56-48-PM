Feature: Validar seguridad y permisos en la carga

  Scenario: Intentar cargar un documento sin los permisos necesarios
    Given el usuario está en la página de carga de documentos
    When el usuario intenta cargar un documento sin permisos
    Then el sistema deniega la operación
    And registra el intento de acceso no autorizado