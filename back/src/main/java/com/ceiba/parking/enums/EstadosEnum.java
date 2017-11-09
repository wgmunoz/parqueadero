package com.ceiba.parking.enums;

public enum EstadosEnum {
	HABILITADO {

        @Override
        public int getId() {
            return 1;
        }

        @Override
        public String getNombre() {
            return "Habilitado";
        }

        @Override
        public Integer isHabilitado() {
            return 1;
        }

    },
    DESHABILITADO {

        @Override
        public int getId() {
            return 0;
        }

        @Override
        public String getNombre() {
            return "Deshabilitado";
        }

        @Override
        public Integer isHabilitado() {
            return 0;
        }
    };

    public abstract int getId();

    public abstract String getNombre();

    public abstract Integer isHabilitado();

    public EstadosEnum[] getContenido() {
        return EstadosEnum.values();
    }

    public static EstadosEnum getValor(int id) {
        for (EstadosEnum e : values()) {
            if (e.getId() == id) {
                return e;
            }
        }

        return null;
    }

    /**
     * Devuelve el nombre del indicador de habilitado utilizado en gran parte de
     * tablas del modelo de datos.
     *
     * @return nombre del atributo de habilitado, generalmente es
     * 'indHabilitado'
     */
    public static String indicadorTabla() {
        return "indHabilitado";
    }

    
}
