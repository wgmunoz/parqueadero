import {Injectable} from '@angular/core';
import {Http, Response, Headers, URLSearchParams, RequestOptions} from '@angular/http';

import {Registro} from '../entities/registro';
import {Observable} from 'rxjs';


@Injectable()
export class RegistroService {
  // URLs for CRUD operations
  allRegistrosUrl = 'http://localhost:8089/registros/activos';
  // constructor
  constructor(private http: Http) {
  }

  // funcion
  getAllregistros(): Observable<Registro[]> {
    return this.http.get(this.allRegistrosUrl)
      .map(this.extractData)
      .catch(this.handleError);

  }

  // Extracion de datos
  private extractData(res: Response) {
    let body = res.json();
    return body;
  }

  // Captura de errores
  private handleError(error: Response | any) {
    console.error(error.message || error);
    error.text();
    return Observable.throw(error);
  }
}
