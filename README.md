# Microproyecto 1 y 2 – Gestor de Turnos en Consola

## Resumen
Aplicación en Java para crear y gestionar múltiples turnos de trabajo en consola. Permite introducir turnos por teclado, validarlos, almacenarlos en un array y mostrarlos. Incluye manejo de errores y reglas de negocio, preparando el sistema para futuras mejoras como detección de solapamientos.

## Objetivo
- Practicar Programación Orientada a Objetos: clases, atributos, métodos, constructores.
- Validar la entrada de datos y proteger el estado de los objetos.
- Gestionar colecciones de objetos mediante arrays y bucles.
- Preparar la base para funciones más avanzadas en próximos microproyectos.

## Tecnologías y conceptos aplicados
- **Java** (POO, clases, objetos, encapsulación, arrays, bucles, condicionales)
- **Constructores con validación defensiva**
- **Excepciones** (`IllegalArgumentException`)
- **Arrays y recorrido de colecciones**
- Preparación para **entrada dinámica por teclado** y **detectar solapamientos**

## Flujo de interacción
1. El usuario introduce día, hora de inicio y hora de fin.
2. El constructor valida la consistencia del turno (`horaInicio < horaFin`).
3. Si los datos son válidos, el turno se guarda en el array.
4. Si los datos son inválidos, se lanza una excepción y se informa al usuario.
5. Se recorre el array para mostrar todos los turnos creados.


## Ejecución: caso válido, caso límite y caso inválido 

## Evidencia
- Casos válidos, límites e inválidos probados en consola.
- Uso de `try-catch` para manejar turnos inválidos.
- Código preparado para expandir a menú interactivo y detección de solapamientos.

  ## Próximos pasos
- Añadir menú interactivo para crear, listar y eliminar turnos.
- Implementar ArrayList para gestionar cualquier número de turnos.
- Detectar solapamientos y mostrar alertas.
