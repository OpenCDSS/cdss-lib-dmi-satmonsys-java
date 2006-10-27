//------------------------------------------------------------------------------
// SatMonSys_Geoloc - object to hold data from the SatMonSys geoloc table.
//------------------------------------------------------------------------------
// Copyright:	See the COPYRIGHT file.
//------------------------------------------------------------------------------
// History:
// 
// 2005-09-23	J. Thomas Sapienza, RTi	Initial version.
//------------------------------------------------------------------------------

package DWR.DMI.SatMonSysDMI;

import RTi.DMI.DMIDataObject;
import RTi.DMI.DMIUtil;

import java.util.Date;

public class SatMonSys_Geoloc 
extends DMIDataObject {

protected int _geoloc_num = 		DMIUtil.MISSING_INT;
protected double _utm_x = 		DMIUtil.MISSING_DOUBLE;
protected double _utm_y = 		DMIUtil.MISSING_DOUBLE;
protected double _latdecdeg = 		DMIUtil.MISSING_DOUBLE;
protected double _longdecdeg = 		DMIUtil.MISSING_DOUBLE;
protected String _pm = 			DMIUtil.MISSING_STRING;
protected int _ts = 			DMIUtil.MISSING_INT;
protected String _tdir = 		DMIUtil.MISSING_STRING;
protected String _tsa = 		DMIUtil.MISSING_STRING;
protected int  _rng = 			DMIUtil.MISSING_INT;
protected String _rdir = 		DMIUtil.MISSING_STRING;
protected String _rnga = 		DMIUtil.MISSING_STRING;
protected int _sec = 			DMIUtil.MISSING_INT;
protected String _seca = 		DMIUtil.MISSING_STRING;
protected String _q160 = 		DMIUtil.MISSING_STRING;
protected String _q40 = 		DMIUtil.MISSING_STRING;
protected String _q10 = 		DMIUtil.MISSING_STRING;
protected int _coordsns = 		DMIUtil.MISSING_INT;
protected String _coordsns_dir =	DMIUtil.MISSING_STRING;
protected int _coordsew = 		DMIUtil.MISSING_INT;
protected String _coordsew_dir = 	DMIUtil.MISSING_STRING;
protected int _div = 			DMIUtil.MISSING_INT;
protected int _wd = 			DMIUtil.MISSING_INT;
protected int _id = 			DMIUtil.MISSING_INT;
protected String _county = 		DMIUtil.MISSING_STRING;
protected String _topomap = 		DMIUtil.MISSING_STRING;
protected int _cty = 			DMIUtil.MISSING_INT;
protected String _huc = 		DMIUtil.MISSING_STRING;
protected double _elev = 		DMIUtil.MISSING_DOUBLE;
protected String _loc_type = 		DMIUtil.MISSING_STRING;
protected String _feature_type = 	DMIUtil.MISSING_STRING;
protected int _accuracy = 		DMIUtil.MISSING_INT;
protected String _st = 			DMIUtil.MISSING_STRING;
protected int _aquifer_num = 		DMIUtil.MISSING_INT;
protected int _stream_num = 		DMIUtil.MISSING_INT;
protected double _str_mile = 		DMIUtil.MISSING_DOUBLE;
protected String _loc_description = 	DMIUtil.MISSING_STRING;
protected String _spotter_version = 	DMIUtil.MISSING_STRING;
protected Date _modified = 		DMIUtil.MISSING_DATE;
protected int _user_num = 		DMIUtil.MISSING_INT;

/**
Construct and initialize to empty strings and missing data.
*/
public SatMonSys_Geoloc() {
	super();
}

/**
Finalize before garbage collection.
@exception Throwable if an error occurs.
*/
protected void finalize ()
throws Throwable {
	_pm = null;
	_tdir = null;
	_tsa = null;
	_rdir = null;
	_rnga = null;
	_seca = null;
	_q160 = null;
	_q40 = null;
	_q10 = null;
	_coordsns_dir = null;
	_coordsew_dir = null;
	_county = null;
	_topomap = null;
	_loc_type = null;
	_feature_type = null;
	_st = null;
	_loc_description = null;
	_spotter_version = null;
	_modified = null;
	_huc = null;
	super.finalize();
}

/**
Returns _accuracy
@return _accuracy
*/
public int getAccuracy() {
	return _accuracy;
}

/**
Returns _aquifer_num
@return _aquifer_num
*/
public int getAquifer_num() {
	return _aquifer_num;
}

/**
Returns _coordsew
@return _coordsew
*/
public int getCoordsew() {
	return _coordsew;
}

/**
Returns _coordsew_dir
@return _coordsew_dir
*/
public String getCoordsew_dir() {
	return _coordsew_dir;
}

/**
Returns _coordsns
@return _coordsns
*/
public int getCoordsns() {
	return _coordsns;
}

/**
Returns _coordsns_dir
@return _coordsns_dir
*/
public String getCoordsns_dir() {
	return _coordsns_dir;
}

/**
Returns _county
@return _county
*/
public String getCounty() {
	return _county;
}

/**
Returns _cty
@return _cty
*/
public int getCty() {
	return _cty;
}

/**
Returns _div
@return _div
*/
public int getDiv() {
	return _div;
}

/**
Returns _elev
@return _elev
*/
public double getElev() {
	return _elev;
}

/**
Returns _feature_type
@return _feature_type
*/
public String getFeature_type() {
	return _feature_type;
}

/**
Returns _geoloc_num
@return _geoloc_num
*/
public int getGeoloc_num() {
	return _geoloc_num;
}

/**
Returns _huc
@return _huc
*/
public String getHUC() {
	return _huc;
}

/**
Returns _id
@return _id
*/
public int getID() {
	return _id;
}

/**
Returns _latdecdeg
@return _latdecdeg
*/
public double getLatdecdeg() {
	return _latdecdeg;
}

/**
Returns _loc_description
@return _loc_description
*/
public String getLoc_description() {
	return _loc_description;
}

/**
Returns _loc_type
@return _loc_type
*/
public String getLoc_type() {
	return _loc_type;
}

/**
Returns _longdecdeg
@return _longdecdeg
*/
public double getLongdecdeg() {
	return _longdecdeg;
}

/**
Returns _modified
@return _modified
*/
public Date getModified() {
	return _modified;
}

/**
Returns _pm
@return _pm
*/
public String getPM() {
	return _pm;
}

/**
Returns _q10
@return _q10
*/
public String getQ10() {
	return _q10;
}

/**
Returns _q40
@return _q40
*/
public String getQ40() {
	return _q40;
}

/**
Returns _q160
@return _q160
*/
public String getQ160() {
	return _q160;
}

/**
Returns _rdir
@return _rdir
*/
public String getRdir() {
	return _rdir;
}

/**
Returns _rng
@return _rng
*/
public int getRng() {
	return _rng;
}

/**
Returns _rnga
@return _rnga
*/
public String getRnga() {
	return _rnga;
}

/**
Returns _sec
@return _sec
*/
public int getSec() {
	return _sec;
}

/**
Returns _seca
@return _seca
*/
public String getSeca() {
	return _seca;
}

/**
Returns _spotter_version
@return _spotter_version
*/
public String getSpotter_version() {
	return _spotter_version;
}

/**
Returns _st
@return _st
*/
public String getST() {
	return _st;
}

/**
Returns _str_mile
@return _str_mile
*/
public double getStr_mile() {
	return _str_mile;
}

/**
Returns _stream_num
@return _stream_num
*/
public int getStream_num() {
	return _stream_num;
}

/**
Returns _tdir
@return _tdir
*/
public String getTdir() {
	return _tdir;
}

/**
Returns _topomap
@return _topomap
*/
public String getTopomap() {
	return _topomap;
}

/**
Returns _tsa
@return _tsa
*/
public String getTsa() {
	return _tsa;
}

/**
Returns _ts
@return _ts
*/
public int getTS() {
	return _ts;
}

/**
Returns _user_num
@return _user_num
*/
public int getUser_num() {
	return _user_num;
}

/**
Returns _utm_x
@return _utm_x
*/
public double getUtm_x() {
	return _utm_x;
}

/**
Returns _utm_y
@return _utm_y
*/
public double getUtm_y() {
	return _utm_y;
}

/**
Returns _wd
@return _wd
*/
public int getWD() {
	return _wd;
}

/**
Sets _accuracy
@param accuracy value to put into _accuracy
*/
public void setAccuracy(int accuracy) {
	_accuracy = accuracy;
}

/**
Sets _aquifer_num
@param aquifer_num value to put into _aquifer_num
*/
public void setAquifer_num(int aquifer_num) {
	_aquifer_num = aquifer_num;
}

/**
Sets _coordsew
@param coordsew value to put into _coordsew
*/
public void setCoordsew(int coordsew) {
	_coordsew = coordsew;
}

/**
Sets _coordsew_dir
@param coordsew_dir value to put into _coordsew_dir
*/
public void setCoordsew_dir(String coordsew_dir) {
	_coordsew_dir = coordsew_dir;
}

/**
Sets _coordsns
@param coordsns value to put into _coordsns
*/
public void setCoordsns(int coordsns) {
	_coordsns = coordsns;
}

/**
Sets _coordsns_dir
@param coordsns_dir value to put into _coordsns_dir
*/
public void setCoordsns_dir(String coordsns_dir) {
	_coordsns_dir = coordsns_dir;
}

/**
Sets _county
@param county value to put into _county
*/
public void setCounty(String county) {
	_county = county;
}

/**
Sets _cty
@param cty value to put into _cty
*/
public void setCty(int cty) {
	_cty = cty;
}

/**
Sets _div
@param div value to put into _div
*/
public void setDiv(int div) {
	_div = div;
}

/**
Sets _elev
@param elev value to put into _elev
*/
public void setElev(double elev) {
	_elev = elev;
}

/**
Sets _feature_type
@param feature_type value to put into _feature_type
*/
public void setFeature_type(String feature_type) {
	_feature_type = feature_type;
}

/**
Sets _geoloc_num
@param geoloc_num value to put into _geoloc_num
*/
public void setGeoloc_num(int geoloc_num) {
	_geoloc_num = geoloc_num;
}

/**
Sets _huc
@param huc value to put into _huc
*/
public void setHUC(String huc) {
	_huc = huc;
}

/**
Sets _id
@param id value to put into _id
*/
public void setID(int id) {
	_id = id;
}

/**
Sets _latdecdeg
@param latdecdeg value to put into _latdecdeg
*/
public void setLatdecdeg(double latdecdeg) {
	_latdecdeg = latdecdeg;
}

/**
Sets _loc_description
@param description value to put into _loc_description
*/
public void setLoc_description(String description) {
	_loc_description = description;
}

/**
Sets _loc_type
@param loc_type value to put into _loc_type
*/
public void setLoc_type(String loc_type) {
	_loc_type = loc_type;
}

/**
Sets _longdecdeg
@param longdecdeg value to put into _longdecdeg
*/
public void setLongdecdeg(double longdecdeg) {
	_longdecdeg = longdecdeg;
}

/**
Sets _modified
@param modified value to put into _modified
*/
public void setModified(Date modified) {
	_modified = modified;
}

/**
Sets _pm
@param pm value to put into _pm
*/
public void setPM(String pm) {
	_pm = pm;
}

/**
Sets _q10
@param q10 value to put into _q10
*/
public void setQ10(String q10) {
	_q10 = q10;
}

/**
Sets _q40
@param q40 value to put into _q40
*/
public void setQ40(String q40) {
	_q40 = q40;
}

/**
Sets _q160
@param q160 value to put into _q160
*/
public void setQ160(String q160) {
	_q160 = q160;
}

/**
Sets _rdir
@param rdir value to put into _rdir
*/
public void setRdir(String rdir) {
	_rdir = rdir;
}

/**
Sets _rng
@param rng value to put into _rng
*/
public void setRng(int rng) {
	_rng = rng;
}

/**
Sets _rnga
@param rnga value to put into _rnga
*/
public void setRnga(String rnga) {
	_rnga = rnga;
}

/**
Sets _sec
@param sec value to put into _sec
*/
public void setSec(int sec) {
	_sec = sec;
}

/**
Sets _seca
@param seca value to put into _seca
*/
public void setSeca(String seca) {
	_seca = seca;
}

/**
Sets _spotter_version
@param spotter_version value to put into _spotter_version
*/
public void setSpotter_version(String spotter_version) {
	_spotter_version = spotter_version;
}

/**
Sets _st
@param st value to put into _st
*/
public void setST(String st) {
	_st = st;
}

/**
Sets _str_mile
@param str_mile value to put into _str_mile
*/
public void setStr_mile(double str_mile) {
	_str_mile = str_mile;
}

/**
Sets _stream_num
@param stream_num value to put into _stream_num
*/
public void setStream_num(int stream_num) {
	_stream_num = stream_num;
}

/**
Sets _tdir
@param tdir value to put into _tdir
*/
public void setTdir(String tdir) {
	_tdir = tdir;
}

/**
Sets _topomap
@param topomap value to put into _topomap
*/
public void setTopomap(String topomap) {
	_topomap = topomap;
}

/**
Sets _tsa
@param tsa value to put into _tsa
*/
public void setTsa(String tsa) {
	_tsa = tsa;
}

/**
Sets _ts
@param ts value to put into _ts
*/
public void setTS(int ts) {
	_ts = ts;
}

/**
Sets _user_num
@param user_num value to put into _user_num
*/
public void setUser_num(int user_num) {
	_user_num = user_num;
}

/**
Sets _utm_x
@param utm_x value to put into _utm_x
*/
public void setUtm_x(double utm_x) {
	_utm_x = utm_x;
}

/**
Sets _utm_y
@param utm_y value to put into _utm_y
*/
public void setUtm_y(double utm_y) {
	_utm_y = utm_y;
}

/**
Sets _wd
@param wd value to put into _wd
*/
public void setWD(int wd) {
	_wd = wd;
}

/**
Returns a String representation of this object.
@return a String representation of this object.
*/
public String toString() {
	return "SatMonSys_Geoloc {\n"
		+ "   geoloc_num:       " + _geoloc_num + "\n"
		+ "   utm_x:            " + _utm_x + "\n"
		+ "   utm_y:            " + _utm_y + "\n"
		+ "   latdecdeg:        " + _latdecdeg + "\n"
		+ "   longdecdeg:       " + _longdecdeg + "\n"
		+ "   pm:              '" + _pm + "'\n"
		+ "   ts:               " + _ts + "\n"
		+ "   tdir:            '" + _tdir + "'\n"
		+ "   tsa:             '" + _tsa + "'\n"
		+ "   rng:              " + _rng + "\n"
		+ "   rdir:            '" + _rdir + "'\n"
		+ "   rnga:            '" + _rnga + "'\n"
		+ "   sec:              " + _sec + "\n"
		+ "   seca:            '" + _seca + "'\n"
		+ "   q160:            '" + _q160 + "'\n"
		+ "   q40:             '" + _q40 + "'\n"
		+ "   q10:             '" + _q10 + "'\n"
		+ "   coordsns:         " + _coordsns + "\n"
		+ "   coordsns_dir:    '" + _coordsns_dir + "'\n"
		+ "   coordsew:         " + _coordsew + "\n"
		+ "   coordsew_dir:    '" + _coordsew_dir + "'\n"
		+ "   div:              " + _div + "\n"
		+ "   wd:               " + _wd + "\n"
		+ "   id:               " + _id + "\n"
		+ "   county:          '" + _county + "'\n"
		+ "   topomap:         '" + _topomap + "'\n"
		+ "   cty:              " + _cty + "\n"
		+ "   huc:             '" + _huc + "'\n"
		+ "   elev:             " + _elev + "\n"
		+ "   loc_type:        '" + _loc_type + "'\n"
		+ "   feature_type:    '" + _feature_type + "'\n"
		+ "   accuracy:         " + _accuracy + "\n"
		+ "   st:              '" + _st + "'\n"
		+ "   aquifer_num:      " + _aquifer_num + "\n"
		+ "   stream_num:       " + _stream_num + "\n"
		+ "   str_mile:         " + _str_mile + "\n"
		+ "   loc_description: '" + _loc_description + "'\n"
		+ "   spotter_version: '" + _spotter_version + "'\n"
		+ "   modified:         " + _modified + "\n"
		+ "   user_num:         " + _user_num + "\n}";
}

}
