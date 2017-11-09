import {Ubicacion} from './Ubicacion';
import {Vehiculo} from './Vehiculo';

export class Registro {
  constructor(public idRegistro: number,
    public vehiculo: Vehiculo,
    public ubicacion: Ubicacion,
    public horaIngreso: string,
    public horaSalida: string,
    public total: string,
    public estado: number
  ) {
  }
}
