import {Injectable} from '@angular/core';
import {Http, Response, Headers, URLSearchParams, RequestOptions} from '@angular/http';

import {Registro} from '../entities/registro';
import 'rxjs/add/operator/map';
import { Observable } from 'rxjs/Rx';


@Injectable()
export class RegistroService {
  // URLs for CRUD operations
  allRegistrosUrl = 'http://localhost:8089/registros/activos';
  newRegistroUrl= 'http://localhost:8089/registros/create';
  // constructor
  constructor(private http: Http) {
  }

  // retorna todos registros
  getAllregistros(): Observable<Registro[]> {
    return this.http.get(this.allRegistrosUrl)
      .map(this.extractData)
      .catch(this.handleError);
  }
  // Crea registros
  createRegistro(registro: Registro): Observable<number> {
    const cpHeaders = new Headers({ 'Content-Type': 'application/json' });
    const options = new RequestOptions({ headers: cpHeaders });
      return this.http.post(this.newRegistroUrl, registro, options)
        .map(success => success.status)
        .catch(this.handleError);
}

  // Extracion de datos
  private extractData(res: Response) {
    const body = res.json();
    return body;
  }

  // Captura de errores
  private handleError(error: Response | any) {
    console.error(error.message || error);
    error.text();
    return Observable.throw(error);
  }
}
