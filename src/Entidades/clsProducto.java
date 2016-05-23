/*
Uniandes - Puyo 
Sistema de Facturacion 2016
Octavo Semestre
Jonathan Llerena
23-05-2016
*/

package Entidades;
/**
 *
 * @author Jonahtan Llerena
 */
public class clsProducto {
    private int _id;
    private String _nombre;
    private String _descipcion;
    private int _stock;
    private float _pvp; //precio de venta al publico
    private float _pcp; //precio de compra al proveedor
    private boolean _sinIva;

    public clsProducto() {
    }

    public clsProducto(int _id, String _nombre, String _descipcion, int _stock, float _pvp, float _pcp, boolean _sinIva) {
        this._id = _id;
        this._nombre = _nombre;
        this._descipcion = _descipcion;
        this._stock = _stock;
        this._pvp = _pvp;
        this._pcp = _pcp;
        this._sinIva = _sinIva;
    }

    public int tId() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String Descipcion() {
        return _descipcion;
    }

    public void Descipcion(String _descipcion) {
        this._descipcion = _descipcion;
    }

    public int Stock() {
        return _stock;
    }

    public void Stock(int _stock) {
        this._stock = _stock;
    }

    public float Pvp() {
        return _pvp;
    }

    public void Pvp(float _pvp) {
        this._pvp = _pvp;
    }

    public float Pcp() {
        return _pcp;
    }

    public void Pcp(float _pcp) {
        this._pcp = _pcp;
    }

    public boolean SinIva() {
        return _sinIva;
    }

    public void SinIva(boolean _sinIva) {
        this._sinIva = _sinIva;
    }

    
}
