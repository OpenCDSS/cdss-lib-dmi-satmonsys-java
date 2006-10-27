// ----------------------------------------------------------------------------
// SatMonSys_Station - class to store data from the SatMonSys station table.
// ----------------------------------------------------------------------------
// Copyright:   See the COPYRIGHT file
// ----------------------------------------------------------------------------
// History:
//
// 2005-09-22	J. Thomas Sapienza, RTi	Initial version.
// ----------------------------------------------------------------------------

package DWR.DMI.SatMonSysDMI;

import java.util.Date;

import RTi.DMI.DMIUtil;
import RTi.DMI.DMIDataObject;

public class SatMonSys_Station 
extends DMIDataObject {

protected int _station_num = 		DMIUtil.MISSING_INT;
protected int _geoloc_num = 		DMIUtil.MISSING_INT;
protected String _station_name = 	DMIUtil.MISSING_STRING;
protected String _station_id = 		DMIUtil.MISSING_STRING;
protected String _cooperator_id = 	DMIUtil.MISSING_STRING;
protected String _nesdis_id = 		DMIUtil.MISSING_STRING;
protected double _drain_area = 		DMIUtil.MISSING_DOUBLE;
protected double _contr_area = 		DMIUtil.MISSING_DOUBLE;
protected String _source = 		DMIUtil.MISSING_STRING;
protected String _abbrev = 		DMIUtil.MISSING_STRING;
protected int _transbsn = 		DMIUtil.MISSING_INT;
protected Date _modified = 		DMIUtil.MISSING_DATE;
protected int _user_num = 		DMIUtil.MISSING_INT;
protected int _elevation = 		DMIUtil.MISSING_INT;

public SatMonSys_Station() {
	super();
}

public void finalize() 
throws Throwable {
	_station_name = null;
	_station_id = null;
	_cooperator_id = null;
	_nesdis_id = null;
	_source = null;
	_abbrev = null;
	_modified = null;
	super.finalize();
}

/**
Returns _abbrev
@return _abbrev
*/
public String getAbbrev() {
	return _abbrev;
}

/**
Returns _contr_area
@return _contr_area
*/
public double getContr_area() {
	return _contr_area;
}

/**
Returns _cooperator_id
@return _cooperator_id
*/
public String getCooperator_id() {
	return _cooperator_id;
}

/**
Returns _drain_area
@return _drain_area
*/
public double getDrain_area() {
	return _drain_area;
}

/**
Returns _elevation
@return _elevation
*/
public int getElevation() {
	return _elevation;
}

/**
Returns _geoloc_num
@return _geoloc_num
*/
public int getGeoloc_num() {
	return _geoloc_num;
}

/**
Returns _modified
@return _modified
*/
public Date getModified() {
	return _modified;
}

/**
Returns _nesdis_id
@return _nesdis_id
*/
public String getNesdis_id() {
	return _nesdis_id;
}

/**
Returns _source
@return _source
*/
public String getSource() {
	return _source;
}

/**
Returns _station_id
@return _station_id
*/
public String getStation_id() {
	return _station_id;
}

/**
Returns _station_name
@return _station_name
*/
public String getStation_name() {
	return _station_name;
}

/**
Returns _station_num
@return _station_num
*/
public int getStation_num() {
	return _station_num;
}

/**
Returns _transbsn
@return _transbsn
*/
public int getTransbsn() {
	return _transbsn;
}

/**
Returns _user_num
@return _user_num
*/
public int getUser_num() {
	return _user_num;
}

/**
Sets _abbrev
@param abbrev value to put in _abbrev
*/
public void setAbbrev(String abbrev) {
	_abbrev = abbrev;
}

/**
Sets _contr_area
@param contr_area value to put in _contr_area
*/
public void setContr_area(double contr_area) {
	_contr_area = contr_area;
}

/**
Sets _cooperator_id
@param cooperator_id value to put into _cooperator_id
*/
public void setCooperator_id(String cooperator_id) {
	_cooperator_id = cooperator_id;
}

/**
Sets _drain_area
@param drain_area value to put into _drain_area
*/
public void setDrain_area(double drain_area) {
	_drain_area = drain_area;
}

/**
Sets _elevation
@param elevation
*/
public void setElevation(int elevation) {
	_elevation = elevation;
}

/**
Sets _geoloc_num
@param geoloc_num value to put into _geoloc_num
*/
public void setGeoloc_num(int geoloc_num) {
	_geoloc_num = geoloc_num;
}

/**
Sets _modified
@param modified value to put into _modified
*/
public void setModified(Date modified) {
	_modified = modified;
}

/**
Sets _nesdis_id
@param nesdis_id value to put into _nesdis_id
*/
public void setNesdis_id(String nesdis_id) {
	_nesdis_id = nesdis_id;
}

/**
Sets _source
@param source value to put into _source
*/
public void setSource(String source) {
	_source = source;
}

/**
Sets _station_id
@param station_id value to put into _station_id
*/
public void setStation_id(String station_id) {
	_station_id = station_id;
}

/**
Sets _station_name
@param station_name value to put into _station_name
*/
public void setStation_name(String station_name) {
	_station_name = station_name;
}

/**
Sets _station_num
@param station_num value to put into _station_num
*/
public void setStation_num(int station_num) {
	_station_num = station_num;
}

/**
Sets _transbsn
@param transbsn value to put into _transbsn
*/
public void setTransbsn(int transbsn) {
	_transbsn = transbsn;
}

/**
Sets _user_num
@param user_num value to put into _user_num
*/
public void setUser_num(int user_num) {
	_user_num = user_num;
}

/**
Returns a String representation of this table.
@return a String representation of this table.
*/
public String toString() {
	return "SatMonSys_Station {\n"
		+ "   station_num:    " + _station_num + "\n"
		+ "   geoloc_num:     " + _geoloc_num
		+ "   station_name:  '" + _station_name + "'\n"
		+ "   station_id:    '" + _station_id + "'\n"
		+ "   cooperator_id: '" + _cooperator_id + "'\n"
		+ "   nesdis_id:     '" + _nesdis_id + "'\n"
		+ "   drain_area:     " + _drain_area + "\n"
		+ "   contr_area:     " + _contr_area + "\n"
		+ "   source:        '" + _source  + "'\n"
		+ "   abbrev:        '" + _abbrev + "'\n"
		+ "   transbsn:       " + _transbsn + "\n"
		+ "   modified:       " + _modified + "\n"
		+ "   user_num:       " + _user_num + "\n"
		+ "   elevation:      " + _elevation + "\n}";
}

}
