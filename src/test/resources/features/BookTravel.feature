# language: es
# encoding: UTF-8

Característica: Reservar Vuelos
  Como usuario
  Quiero consultar destinos de viaje
  Para efectuar reservas de vuelo

  @Home @TC01
  Escenario: Selecionar fechas de Vuelo para viaje Internacional

    Dado Fabio ingresa a la pagina de home
    Cuando selecciona un viaje de ida y vuelta con destino a Miami
    Entonces El modulo de busqueda desplegara los datos ingresados


  @Home @TC02
  Escenario: Bucar fechas de Vuelo para viaje Internacional

    Dado Fabio ingresa a la pagina de home
    Cuando Busca un viaje de ida y vuelta con destino a Miami
    Y El usuario acepta la alerta del protocolo COVID-19
    Entonces El modulo mostrara los resultados para los vuelos de ida


  @Home @TC03
  Escenario: Reserva Vuelo Internacional con metodo de Pago Efective

    Dado Fabio busca vuelos con destino a Miami
    Cuando Selecciona los vuelos de Ida y Vuelta
    Y Registra su detalle de contacto
    Y selecciona como metodo de pago Efecty
    Entonces El sistema reservara el vuelo seleccionado


  @Home @TC04
  Escenario: Buscar vuelo nacional por Horario

    Dado Fabio consulta un vuelo por horario a Cartagena
    Cuando Aplica un filtro por los vuelos que salen mas tarde
    Entonces El sistema muestra los vuelos en el orden solicitado
