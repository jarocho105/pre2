/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import java.sql.Time;


import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.puntoventa.util.CajaIngresoConstantesFunciones;
import com.bydan.erp.puntoventa.util.CajaIngresoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CajaIngresoParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.CajaIngresoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CajaIngresoBeanSwingJInternalFrame extends CajaIngresoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajaIngresoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CajaIngreso> cajaingresoValidator = new ClassValidator<CajaIngreso>(CajaIngreso.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CajaIngreso cajaingreso;	
	public CajaIngreso cajaingresoAux;
	public CajaIngreso cajaingresoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CajaIngreso cajaingresoTotales;
	public Long idCajaIngresoActual;
	public Long iIdNuevoCajaIngreso=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
	}

	public String sFinalQueryComboCaja="";

	public List<Caja> cajasForeignKey;

	public List<Caja> getcajasForeignKey() {
		return cajasForeignKey;
	}

	public void setcajasForeignKey(List<Caja> cajasForeignKey) {
		this.cajasForeignKey = cajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Caja cajaForeignKey;

	public Caja getcajaForeignKey() {
		return cajaForeignKey;
	}

	public void setcajaForeignKey(Caja cajaForeignKey) {
		this.cajaForeignKey = cajaForeignKey;
	}

	public String sFinalQueryComboTurnoPunVen="";

	public List<TurnoPunVen> turnopunvensForeignKey;

	public List<TurnoPunVen> getturnopunvensForeignKey() {
		return turnopunvensForeignKey;
	}

	public void setturnopunvensForeignKey(List<TurnoPunVen> turnopunvensForeignKey) {
		this.turnopunvensForeignKey = turnopunvensForeignKey;
	}

	//OBJETO FK ACTUAL
	public TurnoPunVen turnopunvenForeignKey;

	public TurnoPunVen getturnopunvenForeignKey() {
		return turnopunvenForeignKey;
	}

	public void setturnopunvenForeignKey(TurnoPunVen turnopunvenForeignKey) {
		this.turnopunvenForeignKey = turnopunvenForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosCajaIngresoDetalle=false;

	public Boolean getIsTienePermisosCajaIngresoDetalle() {
		return isTienePermisosCajaIngresoDetalle;
	}

	public void setIsTienePermisosCajaIngresoDetalle(Boolean isTienePermisosCajaIngresoDetalle) {
		this.isTienePermisosCajaIngresoDetalle= isTienePermisosCajaIngresoDetalle;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoCajaIngreso;
	public Boolean isPermisoNuevoCajaIngreso;
	public Boolean isPermisoActualizarCajaIngreso;
	public Boolean isPermisoActualizarOriginalCajaIngreso;
	public Boolean isPermisoEliminarCajaIngreso;
	public Boolean isPermisoGuardarCambiosCajaIngreso;
	public Boolean isPermisoConsultaCajaIngreso;
	public Boolean isPermisoBusquedaCajaIngreso;
	public Boolean isPermisoReporteCajaIngreso;
	public Boolean isPermisoPaginacionMedioCajaIngreso;
	public Boolean isPermisoPaginacionAltoCajaIngreso;
	public Boolean isPermisoPaginacionTodoCajaIngreso;
	public Boolean isPermisoCopiarCajaIngreso;
	public Boolean isPermisoVerFormCajaIngreso;
	public Boolean isPermisoDuplicarCajaIngreso;
	public Boolean isPermisoOrdenCajaIngreso;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public CajaIngresoParameterReturnGeneral cajaingresoReturnGeneral;
	public CajaIngresoParameterReturnGeneral cajaingresoParameterGeneral;
	
	

	public CajaIngresoDetalleLogic cajaingresodetalleLogic=null;

	public CajaIngresoDetalleLogic getCajaIngresoDetalleLogic() {
		return cajaingresodetalleLogic;
	}

	public void setCajaIngresoDetalleLogic(CajaIngresoDetalleLogic cajaingresodetalleLogic) {
		this.cajaingresodetalleLogic = cajaingresodetalleLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajaIngreso=false;
	public Boolean esParaAccionDesdeFormularioCajaIngreso=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajaIngresoSessionBeanAdditional cajaingresoSessionBeanAdditional=null;
	
	public CajaIngresoSessionBeanAdditional getCajaIngresoSessionBeanAdditional() {
		return this.cajaingresoSessionBeanAdditional;
	}
	
	public void setCajaIngresoSessionBeanAdditional(CajaIngresoSessionBeanAdditional cajaingresoSessionBeanAdditional) {
		try {
			this.cajaingresoSessionBeanAdditional=cajaingresoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajaIngresoBeanSwingJInternalFrameAdditional cajaingresoBeanSwingJInternalFrameAdditional=null;
	//public class CajaIngresoBeanSwingJInternalFrame
	
	public CajaIngresoBeanSwingJInternalFrameAdditional getCajaIngresoBeanSwingJInternalFrameAdditional() {
		return this.cajaingresoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajaIngresoBeanSwingJInternalFrameAdditional(CajaIngresoBeanSwingJInternalFrameAdditional cajaingresoBeanSwingJInternalFrameAdditional) {
		try {
			this.cajaingresoBeanSwingJInternalFrameAdditional=cajaingresoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajaIngresoLogic cajaingresoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CajaIngreso cajaingresoBean;
	public CajaIngresoConstantesFunciones cajaingresoConstantesFunciones;
	//public CajaIngresoParameterReturnGeneral cajaingresoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public CajaLogic cajaLogic;
	public TurnoPunVenLogic turnopunvenLogic;
	
	//PARAMETROS
	
	
	//public List<CajaIngreso> cajaingresos;	
	//public List<CajaIngreso> cajaingresosEliminados;
	//public List<CajaIngreso> cajaingresosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajaIngreso=false;
	public Boolean isVisibilidadCeldaDuplicarCajaIngreso=true;
	public Boolean isVisibilidadCeldaCopiarCajaIngreso=true;
	public Boolean isVisibilidadCeldaVerFormCajaIngreso=true;
	public Boolean isVisibilidadCeldaOrdenCajaIngreso=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
	public Boolean isVisibilidadCeldaModificarCajaIngreso=false;
	public Boolean isVisibilidadCeldaActualizarCajaIngreso=false;
	public Boolean isVisibilidadCeldaEliminarCajaIngreso=false;
	public Boolean isVisibilidadCeldaCancelarCajaIngreso=false;
	public Boolean isVisibilidadCeldaGuardarCajaIngreso=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajaIngreso=false;	
	
	
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTurnoPunVen=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoCajaIngreso() {
		return this.iIdNuevoCajaIngreso;
	}

	public void setiIdNuevoCajaIngreso(Long iIdNuevoCajaIngreso) {
		this.iIdNuevoCajaIngreso = iIdNuevoCajaIngreso;
	}
	
	public Long getidCajaIngresoActual() {
		return this.idCajaIngresoActual;
	}

	public void setidCajaIngresoActual(Long idCajaIngresoActual) {
		this.idCajaIngresoActual = idCajaIngresoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CajaIngreso getcajaingreso() {
		return this.cajaingreso;
	}

	public void setcajaingreso(CajaIngreso cajaingreso) {
		this.cajaingreso = cajaingreso;
	}
	
	public CajaIngreso getcajaingresoAux() {
		return this.cajaingresoAux;
	}

	public void setcajaingresoAux(CajaIngreso cajaingresoAux) {
		this.cajaingresoAux = cajaingresoAux;
	}				
	
	public CajaIngreso getcajaingresoAnterior() {
		return this.cajaingresoAnterior;
	}

	public void setcajaingresoAnterior(CajaIngreso cajaingresoAnterior) {
		this.cajaingresoAnterior = cajaingresoAnterior;
	}	
	
	public CajaIngreso getcajaingresoTotales() {
		return this.cajaingresoTotales;
	}

	public void setcajaingresoTotales(CajaIngreso cajaingresoTotales) {
		this.cajaingresoTotales = cajaingresoTotales;
	}	
	
	public CajaIngreso getcajaingresoBean() {
		return this.cajaingresoBean;
	}

	public void setcajaingresoBean(CajaIngreso cajaingresoBean) {
		this.cajaingresoBean = cajaingresoBean;
	}	
	
	public CajaIngresoParameterReturnGeneral getcajaingresoReturnGeneral() {
		return this.cajaingresoReturnGeneral;
	}

	public void setcajaingresoReturnGeneral(CajaIngresoParameterReturnGeneral cajaingresoReturnGeneral) {
		this.cajaingresoReturnGeneral = cajaingresoReturnGeneral;
	}	
	
	
	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_turno_pun_venFK_IdTurnoPunVen=-1L;

	public Long getid_turno_pun_venFK_IdTurnoPunVen() {
		return this.id_turno_pun_venFK_IdTurnoPunVen;
	}

	public void setid_turno_pun_venFK_IdTurnoPunVen(Long id_turno_pun_venFK_IdTurnoPunVen) {
		this.id_turno_pun_venFK_IdTurnoPunVen = id_turno_pun_venFK_IdTurnoPunVen;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CajaIngresoLogic getCajaIngresoLogic()	{		
		return cajaingresoLogic;
	}

	public void setCajaIngresoLogic(CajaIngresoLogic cajaingresoLogic) {
		this.cajaingresoLogic = cajaingresoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoCajaIngreso() {
		return isEsNuevoCajaIngreso;
	}

	public void setIsEsNuevoCajaIngreso(Boolean isEsNuevoCajaIngreso) {
		this.isEsNuevoCajaIngreso = isEsNuevoCajaIngreso;
	}

	public Boolean getEsParaAccionDesdeFormularioCajaIngreso() {
		return esParaAccionDesdeFormularioCajaIngreso;
	}
	
	public void setEsParaAccionDesdeFormularioCajaIngreso(Boolean esParaAccionDesdeFormularioCajaIngreso) {
		this.esParaAccionDesdeFormularioCajaIngreso = esParaAccionDesdeFormularioCajaIngreso;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.cajaingresoSessionBean==null) {
				this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(cajaingresoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.cajaingresoSessionBean==null) {
				this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(cajaingresoSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.cajaingresoSessionBean==null) {
				this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(cajaingresoSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajasForeignKey=new ArrayList<Caja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaLogic cajaLogic=new CajaLogic();

			//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

			if(this.cajaingresoSessionBean==null) {
				this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

					cajaLogic.getTodosCajasWithConnection(sFinalQuery,new Pagination());

					this.cajasForeignKey=cajaLogic.getCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaLogic.getEntityWithConnection(cajaingresoSessionBean.getlidCajaActual());
					this.cajasForeignKey.add(cajaLogic.getCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTurnoPunVensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.turnopunvensForeignKey=new ArrayList<TurnoPunVen>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TurnoPunVenLogic turnopunvenLogic=new TurnoPunVenLogic();

			//turnopunvenLogic.getTurnoPunVenDataAccess().setIsForForeingKeyData(true);

			if(this.cajaingresoSessionBean==null) {
				this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//turnopunvenLogic.getTurnoPunVenDataAccess().setIsForForeingKeyData(true);

					turnopunvenLogic.getTodosTurnoPunVensWithConnection(sFinalQuery,new Pagination());

					this.turnopunvensForeignKey=turnopunvenLogic.getTurnoPunVens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTurnoPunVen(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnopunvenLogic.getEntityWithConnection(cajaingresoSessionBean.getlidTurnoPunVenActual());
					this.turnopunvensForeignKey.add(turnopunvenLogic.getTurnoPunVen());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.cajaingreso!=null) {
						this.cajaingreso.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajaIngreso.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajaIngresoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaCajaIngresoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajaIngresoGenerico!=null && jComboBoxid_empresaCajaIngresoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajaIngresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.cajaingreso!=null) {
						this.cajaingreso.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCajaIngreso.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCajaIngresoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalCajaIngresoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCajaIngresoGenerico!=null && jComboBoxid_sucursalCajaIngresoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCajaIngresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.cajaingreso!=null) {
						this.cajaingreso.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioCajaIngreso.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioCajaIngresoGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioCajaIngresoGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioCajaIngresoGenerico!=null && jComboBoxid_usuarioCajaIngresoGenerico.getItemCount()>0) {
					jComboBoxid_usuarioCajaIngresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCajaForeignKey(Long idCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaTemp!=null) {

					if(this.cajaingreso!=null) {
						this.cajaingreso.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaCajaIngreso.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaTemp!=null && jComboBoxid_cajaFK_IdCajaCajaIngreso!=null) {
						jComboBoxid_cajaFK_IdCajaCajaIngreso.setSelectedItem(cajaTemp);
					} else {
						if(jComboBoxid_cajaFK_IdCajaCajaIngreso!=null) {
							//jComboBoxid_cajaFK_IdCajaCajaIngreso.setSelectedItem(cajaTemp);
							if(jComboBoxid_cajaFK_IdCajaCajaIngreso.getItemCount()>0) {
								jComboBoxid_cajaFK_IdCajaCajaIngreso.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCajaForeignKeyDescripcion(Long idCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}


			sDescripcion=CajaConstantesFunciones.getCajaDescripcion(cajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaCajaIngresoGenerico)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(cajaTemp!=null) {
				jComboBoxid_cajaCajaIngresoGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaCajaIngresoGenerico!=null && jComboBoxid_cajaCajaIngresoGenerico.getItemCount()>0) {
					jComboBoxid_cajaCajaIngresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTurnoPunVenForeignKey(Long idTurnoPunVenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TurnoPunVen  turnopunvenTemp=null;

			for(TurnoPunVen turnopunvenAux:turnopunvensForeignKey) {
				if(turnopunvenAux.getId()!=null && turnopunvenAux.getId().equals(idTurnoPunVenSeleccionado)) {
					turnopunvenTemp=turnopunvenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(turnopunvenTemp!=null) {

					if(this.cajaingreso!=null) {
						this.cajaingreso.setTurnoPunVen(turnopunvenTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setSelectedItem(turnopunvenTemp);
					}
				} else {
					//jComboBoxid_turno_pun_venCajaIngreso.setSelectedItem(turnopunvenTemp);
					if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
						if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTurnoPunVen") || sFormularioTipoBusqueda.equals("Todos")){
					if(turnopunvenTemp!=null && jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso!=null) {
						jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setSelectedItem(turnopunvenTemp);
					} else {
						if(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso!=null) {
							//jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setSelectedItem(turnopunvenTemp);
							if(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.getItemCount()>0) {
								jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTurnoPunVenForeignKeyDescripcion(Long idTurnoPunVenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TurnoPunVen  turnopunvenTemp=null;

			for(TurnoPunVen turnopunvenAux:turnopunvensForeignKey) {
				if(turnopunvenAux.getId()!=null && turnopunvenAux.getId().equals(idTurnoPunVenSeleccionado)) {
					turnopunvenTemp=turnopunvenAux;
					break;
				}
			}


			sDescripcion=TurnoPunVenConstantesFunciones.getTurnoPunVenDescripcion(turnopunvenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTurnoPunVenForeignKeyGenerico(Long idTurnoPunVenSeleccionado,JComboBox jComboBoxid_turno_pun_venCajaIngresoGenerico)throws Exception
	{
		try
		{
			TurnoPunVen  turnopunvenTemp=null;

			for(TurnoPunVen turnopunvenAux:turnopunvensForeignKey) {
				if(turnopunvenAux.getId()!=null && turnopunvenAux.getId().equals(idTurnoPunVenSeleccionado)) {
					turnopunvenTemp=turnopunvenAux;
					break;
				}
			}

			if(turnopunvenTemp!=null) {
				jComboBoxid_turno_pun_venCajaIngresoGenerico.setSelectedItem(turnopunvenTemp);
			} else {
				if(jComboBoxid_turno_pun_venCajaIngresoGenerico!=null && jComboBoxid_turno_pun_venCajaIngresoGenerico.getItemCount()>0) {
					jComboBoxid_turno_pun_venCajaIngresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CajaIngreso cajaingreso,JComboBox jComboBoxid_empresaCajaIngresoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajaIngresoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajaIngresoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajaingreso.setid_empresa(empresaAux.getId());
				cajaingreso.setempresa_descripcion(CajaIngresoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajaingreso.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CajaIngreso cajaingreso,JComboBox jComboBoxid_sucursalCajaIngresoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCajaIngresoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCajaIngresoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cajaingreso.setid_sucursal(sucursalAux.getId());
				cajaingreso.setsucursal_descripcion(CajaIngresoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cajaingreso.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(CajaIngreso cajaingreso,JComboBox jComboBoxid_usuarioCajaIngresoGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioCajaIngresoGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioCajaIngresoGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				cajaingreso.setid_usuario(usuarioAux.getId());
				cajaingreso.setusuario_descripcion(CajaIngresoConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				cajaingreso.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(CajaIngreso cajaingreso,JComboBox jComboBoxid_cajaCajaIngresoGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaCajaIngresoGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaCajaIngresoGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				cajaingreso.setid_caja(cajaAux.getId());
				cajaingreso.setcaja_descripcion(CajaIngresoConstantesFunciones.getCajaDescripcion(cajaAux));
				cajaingreso.setCaja(cajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTurnoPunVenForeignKey(CajaIngreso cajaingreso,JComboBox jComboBoxid_turno_pun_venCajaIngresoGenerico)throws Exception
	{
		try
		{
			TurnoPunVen  turnopunvenAux=new TurnoPunVen();

			if(jComboBoxid_turno_pun_venCajaIngresoGenerico==null) {
				turnopunvenAux=(TurnoPunVen)this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.getSelectedItem();
			} else {
				turnopunvenAux=(TurnoPunVen)jComboBoxid_turno_pun_venCajaIngresoGenerico.getSelectedItem();
			}

			if(turnopunvenAux!=null && turnopunvenAux.getId()!=null) {
				cajaingreso.setid_turno_pun_ven(turnopunvenAux.getId());
				cajaingreso.setturnopunven_descripcion(CajaIngresoConstantesFunciones.getTurnoPunVenDescripcion(turnopunvenAux));
				cajaingreso.setTurnoPunVen(turnopunvenAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
					}

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
					}

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
					}

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
					}

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cajaFK_IdCajaCajaIngreso.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jComboBoxid_cajaFK_IdCajaCajaIngreso.addItem(caja);
							}
						}

						if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTurnoPunVensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTurnoPunVen=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.removeAllItems();

							for(TurnoPunVen turnopunven:this.turnopunvensForeignKey) {
								this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.addItem(turnopunven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngreso!=null) { 
					}

					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTurnoPunVen") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.removeAllItems();

							for(TurnoPunVen turnopunven:this.turnopunvensForeignKey) {
								this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.addItem(turnopunven);
							}
						}

						if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCajaForeignKey(Caja caja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cajaFK_IdCajaCajaIngreso.setSelectedItem(caja);
						} else {
							this.jComboBoxid_cajaFK_IdCajaCajaIngreso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTurnoPunVenForeignKey(TurnoPunVen turnopunven,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setSelectedItem(turnopunven);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setSelectedItem(turnopunven);
						} else {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCajaIngreso() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CajaIngresoConstantesFunciones.refrescarForeignKeysDescripcionesCajaIngreso(this.cajaingresoLogic.getCajaIngresos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CajaIngresoConstantesFunciones.refrescarForeignKeysDescripcionesCajaIngreso(this.cajaingresos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Caja.class));
		classes.add(new Classe(TurnoPunVen.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cajaingresoLogic.setCajaIngresos(this.cajaingresos);
			cajaingresoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public CajaIngresoParameterReturnGeneral getCajaIngresoParameterGeneral() {
		return this.cajaingresoParameterGeneral;
	}
	
	public void setCajaIngresoParameterGeneral(CajaIngresoParameterReturnGeneral cajaingresoParameterGeneral) {
		this.cajaingresoParameterGeneral = cajaingresoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoCajaIngreso() {
		return isPermisoTodoCajaIngreso;
	}

	public void setIsPermisoTodoCajaIngreso(Boolean isPermisoTodoCajaIngreso) {
		this.isPermisoTodoCajaIngreso = isPermisoTodoCajaIngreso;
	}

	public Boolean getIsPermisoNuevoCajaIngreso() {
		return isPermisoNuevoCajaIngreso;
	}

	public void setIsPermisoNuevoCajaIngreso(Boolean isPermisoNuevoCajaIngreso) {
		this.isPermisoNuevoCajaIngreso = isPermisoNuevoCajaIngreso;
	}

	public Boolean getIsPermisoActualizarCajaIngreso() {
		return isPermisoActualizarCajaIngreso;
	}

	public void setIsPermisoActualizarCajaIngreso(Boolean isPermisoActualizarCajaIngreso) {
		this.isPermisoActualizarCajaIngreso = isPermisoActualizarCajaIngreso;
	}

	public Boolean getIsPermisoEliminarCajaIngreso() {
		return isPermisoEliminarCajaIngreso;
	}

	public void setIsPermisoEliminarCajaIngreso(Boolean isPermisoEliminarCajaIngreso) {
		this.isPermisoEliminarCajaIngreso = isPermisoEliminarCajaIngreso;
	}

	public Boolean getIsPermisoGuardarCambiosCajaIngreso() {
		return isPermisoGuardarCambiosCajaIngreso;
	}

	public void setIsPermisoGuardarCambiosCajaIngreso(Boolean isPermisoGuardarCambiosCajaIngreso) {
		this.isPermisoGuardarCambiosCajaIngreso = isPermisoGuardarCambiosCajaIngreso;
	}
	
	public Boolean getIsPermisoConsultaCajaIngreso() {
		return isPermisoConsultaCajaIngreso;
	}

	public void setIsPermisoConsultaCajaIngreso(Boolean isPermisoConsultaCajaIngreso) {
		this.isPermisoConsultaCajaIngreso = isPermisoConsultaCajaIngreso;
	}

	public Boolean getIsPermisoBusquedaCajaIngreso() {
		return isPermisoBusquedaCajaIngreso;
	}

	public void setIsPermisoBusquedaCajaIngreso(Boolean isPermisoBusquedaCajaIngreso) {
		this.isPermisoBusquedaCajaIngreso = isPermisoBusquedaCajaIngreso;
	}

	public Boolean getIsPermisoReporteCajaIngreso() {
		return isPermisoReporteCajaIngreso;
	}

	public void setIsPermisoReporteCajaIngreso(Boolean isPermisoReporteCajaIngreso) {
		this.isPermisoReporteCajaIngreso = isPermisoReporteCajaIngreso;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajaIngreso() {
		return isPermisoPaginacionMedioCajaIngreso;
	}

	public void setIsPermisoPaginacionMedioCajaIngreso(Boolean isPermisoPaginacionMedioCajaIngreso) {
		this.isPermisoPaginacionMedioCajaIngreso = isPermisoPaginacionMedioCajaIngreso;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajaIngreso() {
		return isPermisoPaginacionTodoCajaIngreso;
	}

	public void setIsPermisoPaginacionTodoCajaIngreso(Boolean isPermisoPaginacionTodoCajaIngreso) {
		this.isPermisoPaginacionTodoCajaIngreso = isPermisoPaginacionTodoCajaIngreso;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajaIngreso() {
		return isPermisoPaginacionAltoCajaIngreso;
	}

	public void setIsPermisoPaginacionAltoCajaIngreso(Boolean isPermisoPaginacionAltoCajaIngreso) {
		this.isPermisoPaginacionAltoCajaIngreso = isPermisoPaginacionAltoCajaIngreso;
	}
	
	public Boolean getIsPermisoCopiarCajaIngreso() {
		return isPermisoCopiarCajaIngreso;
	}

	public void setIsPermisoCopiarCajaIngreso(Boolean isPermisoCopiarCajaIngreso) {
		this.isPermisoCopiarCajaIngreso = isPermisoCopiarCajaIngreso;
	}
	
	public Boolean getIsPermisoVerFormCajaIngreso() {
		return isPermisoVerFormCajaIngreso;
	}

	public void setIsPermisoVerFormCajaIngreso(Boolean isPermisoVerFormCajaIngreso) {
		this.isPermisoVerFormCajaIngreso = isPermisoVerFormCajaIngreso;
	}
	
	public Boolean getIsPermisoDuplicarCajaIngreso() {
		return isPermisoDuplicarCajaIngreso;
	}

	public void setIsPermisoDuplicarCajaIngreso(Boolean isPermisoDuplicarCajaIngreso) {
		this.isPermisoDuplicarCajaIngreso = isPermisoDuplicarCajaIngreso;
	}
	
	public Boolean getIsPermisoOrdenCajaIngreso() {
		return isPermisoOrdenCajaIngreso;
	}

	public void setIsPermisoOrdenCajaIngreso(Boolean isPermisoOrdenCajaIngreso) {
		this.isPermisoOrdenCajaIngreso = isPermisoOrdenCajaIngreso;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoCajaIngreso() {
		return isVisibilidadCeldaNuevoCajaIngreso;
	}

	public void setIsVisibilidadCeldaNuevoCajaIngreso(Boolean isVisibilidadCeldaNuevoCajaIngreso) {
		this.isVisibilidadCeldaNuevoCajaIngreso = isVisibilidadCeldaNuevoCajaIngreso;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajaIngreso() {
		return isVisibilidadCeldaDuplicarCajaIngreso;
	}

	public void setIsVisibilidadCeldaDuplicarCajaIngreso(Boolean isVisibilidadCeldaDuplicarCajaIngreso) {
		this.isVisibilidadCeldaDuplicarCajaIngreso = isVisibilidadCeldaDuplicarCajaIngreso;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajaIngreso() {
		return isVisibilidadCeldaCopiarCajaIngreso;
	}

	public void setIsVisibilidadCeldaCopiarCajaIngreso(Boolean isVisibilidadCeldaCopiarCajaIngreso) {
		this.isVisibilidadCeldaCopiarCajaIngreso = isVisibilidadCeldaCopiarCajaIngreso;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajaIngreso() {
		return isVisibilidadCeldaVerFormCajaIngreso;
	}

	public void setIsVisibilidadCeldaVerFormCajaIngreso(Boolean isVisibilidadCeldaVerFormCajaIngreso) {
		this.isVisibilidadCeldaVerFormCajaIngreso = isVisibilidadCeldaVerFormCajaIngreso;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajaIngreso() {
		return isVisibilidadCeldaOrdenCajaIngreso;
	}

	public void setIsVisibilidadCeldaOrdenCajaIngreso(Boolean isVisibilidadCeldaOrdenCajaIngreso) {
		this.isVisibilidadCeldaOrdenCajaIngreso = isVisibilidadCeldaOrdenCajaIngreso;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajaIngreso() {
		return isVisibilidadCeldaNuevoRelacionesCajaIngreso;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajaIngreso(Boolean isVisibilidadCeldaNuevoRelacionesCajaIngreso) {
		this.isVisibilidadCeldaNuevoRelacionesCajaIngreso = isVisibilidadCeldaNuevoRelacionesCajaIngreso;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajaIngreso() {
		return isVisibilidadCeldaModificarCajaIngreso;
	}

	public void setIsVisibilidadCeldaModificarCajaIngreso(Boolean isVisibilidadCeldaModificarCajaIngreso) {
		this.isVisibilidadCeldaModificarCajaIngreso = isVisibilidadCeldaModificarCajaIngreso;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajaIngreso() {
		return isVisibilidadCeldaActualizarCajaIngreso;
	}

	public void setIsVisibilidadCeldaActualizarCajaIngreso(Boolean isVisibilidadCeldaActualizarCajaIngreso) {
		this.isVisibilidadCeldaActualizarCajaIngreso = isVisibilidadCeldaActualizarCajaIngreso;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajaIngreso() {
		return isVisibilidadCeldaEliminarCajaIngreso;
	}

	public void setIsVisibilidadCeldaEliminarCajaIngreso(Boolean isVisibilidadCeldaEliminarCajaIngreso) {
		this.isVisibilidadCeldaEliminarCajaIngreso = isVisibilidadCeldaEliminarCajaIngreso;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajaIngreso() {
		return isVisibilidadCeldaCancelarCajaIngreso;
	}

	public void setIsVisibilidadCeldaCancelarCajaIngreso(Boolean isVisibilidadCeldaCancelarCajaIngreso) {
		this.isVisibilidadCeldaCancelarCajaIngreso = isVisibilidadCeldaCancelarCajaIngreso;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajaIngreso() {
		return isVisibilidadCeldaGuardarCajaIngreso;
	}

	public void setIsVisibilidadCeldaGuardarCajaIngreso(Boolean isVisibilidadCeldaGuardarCajaIngreso) {
		this.isVisibilidadCeldaGuardarCajaIngreso = isVisibilidadCeldaGuardarCajaIngreso;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajaIngreso() {
		return isVisibilidadCeldaGuardarCambiosCajaIngreso;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajaIngreso(Boolean isVisibilidadCeldaGuardarCambiosCajaIngreso) {
		this.isVisibilidadCeldaGuardarCambiosCajaIngreso = isVisibilidadCeldaGuardarCambiosCajaIngreso;
	}
		
	public CajaIngresoSessionBean getcajaingresoSessionBean() {
		return this.cajaingresoSessionBean;
	}
	
	public void setcajaingresoSessionBean(CajaIngresoSessionBean cajaingresoSessionBean) {
		this.cajaingresoSessionBean=cajaingresoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTurnoPunVen() {
		return this.isVisibilidadFK_IdTurnoPunVen;
	}

	public void setisVisibilidadFK_IdTurnoPunVen(Boolean isVisibilidadFK_IdTurnoPunVen) {
		this.isVisibilidadFK_IdTurnoPunVen=isVisibilidadFK_IdTurnoPunVen;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(CajaIngreso cajaingreso)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cajaingreso,null);
				this.setActualParaGuardarSucursalForeignKey(cajaingreso,null);
				this.setActualParaGuardarUsuarioForeignKey(cajaingreso,null);
				this.setActualParaGuardarCajaForeignKey(cajaingreso,null);
				this.setActualParaGuardarTurnoPunVenForeignKey(cajaingreso,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(CajaIngreso cajaingreso,CajaIngreso cajaingresoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajaIngreso(cajaingreso);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajaingresoAux.setId(cajaingreso.getId());
		cajaingresoAux.setVersionRow(cajaingreso.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCajaIngreso();
		
			int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cajaingresoValidator.getInvalidValues(this.cajaingreso);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cajaingresoLogic.setDatosCliente(datosCliente);
			cajaingresoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cajaingresoAux=new  CajaIngreso();
				
				cajaingresoAux.setIsNew(true);
				cajaingresoAux.setIsChanged(true);
				
				cajaingresoAux.setCajaIngresoOriginal(this.cajaingreso);
				
				cajaingresoAux.setId(this.cajaingreso.getId());	
				cajaingresoAux.setVersionRow(this.cajaingreso.getVersionRow());	
				cajaingresoAux.setid_empresa(this.cajaingreso.getid_empresa());	
				cajaingresoAux.setid_sucursal(this.cajaingreso.getid_sucursal());	
				cajaingresoAux.setid_usuario(this.cajaingreso.getid_usuario());	
				cajaingresoAux.setid_caja(this.cajaingreso.getid_caja());	
				cajaingresoAux.setid_turno_pun_ven(this.cajaingreso.getid_turno_pun_ven());	
				cajaingresoAux.setsecuencial(this.cajaingreso.getsecuencial());	
				cajaingresoAux.setfecha(this.cajaingreso.getfecha());	
				cajaingresoAux.sethora(this.cajaingreso.gethora());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajaingresoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cajaingresoAux,cajaingresoLogic.getCajaIngresos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaingresoAux,cajaingresos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cajaingresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaingresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoLogic.saveCajaIngresos();//WithConnection
						//cajaingresoLogic.getSetVersionRowCajaIngresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajaingreso,cajaingresoAux);
					
					this.refrescarForeignKeysDescripcionesCajaIngreso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalles.addAll(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetallesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaingresoLogic.saveCajaIngresoRelaciones(cajaingresoAux,this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles());//WithConnection
								//cajaingresoLogic.getSetVersionRowCajaIngresos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajaingreso,cajaingresoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalles= new ArrayList<CajaIngresoDetalle>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							cajaingresoAux.setCajaIngresoDetalles(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajaingresoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajaingresoAux,cajaingresoLogic.getCajaIngresos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajaingresoAux,cajaingresos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajaingreso,cajaingresoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cajaingresoAux=new  CajaIngreso();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cajaingresoSessionBean.getEsGuardarRelacionado() 
					|| (this.cajaingresoSessionBean.getEsGuardarRelacionado() && this.cajaingreso.getId()>=0)) {
						
					cajaingresoAux.setIsNew(false);
				}
				
				cajaingresoAux.setIsDeleted(false);
			
				cajaingresoAux.setId(this.cajaingreso.getId());	
				cajaingresoAux.setVersionRow(this.cajaingreso.getVersionRow());	
				cajaingresoAux.setid_empresa(this.cajaingreso.getid_empresa());	
				cajaingresoAux.setid_sucursal(this.cajaingreso.getid_sucursal());	
				cajaingresoAux.setid_usuario(this.cajaingreso.getid_usuario());	
				cajaingresoAux.setid_caja(this.cajaingreso.getid_caja());	
				cajaingresoAux.setid_turno_pun_ven(this.cajaingreso.getid_turno_pun_ven());	
				cajaingresoAux.setsecuencial(this.cajaingreso.getsecuencial());	
				cajaingresoAux.setfecha(this.cajaingreso.getfecha());	
				cajaingresoAux.sethora(this.cajaingreso.gethora());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajaingresoAux,cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaingresoAux,cajaingresos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cajaingresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaingresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoLogic.saveCajaIngresos();//WithConnection
						//cajaingresoLogic.getSetVersionRowCajaIngresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajaingreso,cajaingresoAux);
					
					this.refrescarForeignKeysDescripcionesCajaIngreso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalles.addAll(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetallesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaingresoLogic.saveCajaIngresoRelaciones(cajaingresoAux,this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles());//WithConnection
								//cajaingresoLogic.getSetVersionRowCajaIngresos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajaingreso,cajaingresoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalles= new ArrayList<CajaIngresoDetalle>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							cajaingresoAux.setCajaIngresoDetalles(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajaingresoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajaingresoAux,cajaingresoLogic.getCajaIngresos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajaingresoAux,cajaingresos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajaingreso,cajaingresoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cajaingresoAux=new  CajaIngreso();
				
				cajaingresoAux.setIsNew(false);
				cajaingresoAux.setIsChanged(false);
				
				cajaingresoAux.setIsDeleted(true);
				
				cajaingresoAux.setId(this.cajaingreso.getId());	
				cajaingresoAux.setVersionRow(this.cajaingreso.getVersionRow());	
				cajaingresoAux.setid_empresa(this.cajaingreso.getid_empresa());	
				cajaingresoAux.setid_sucursal(this.cajaingreso.getid_sucursal());	
				cajaingresoAux.setid_usuario(this.cajaingreso.getid_usuario());	
				cajaingresoAux.setid_caja(this.cajaingreso.getid_caja());	
				cajaingresoAux.setid_turno_pun_ven(this.cajaingreso.getid_turno_pun_ven());	
				cajaingresoAux.setsecuencial(this.cajaingreso.getsecuencial());	
				cajaingresoAux.setfecha(this.cajaingreso.getfecha());	
				cajaingresoAux.sethora(this.cajaingreso.gethora());	
				
				if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cajaingresoAux.getId()>=0) {	
						this.cajaingresosEliminados.add(cajaingresoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cajaingresoAux,cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaingresoAux,cajaingresos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cajaingresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaingresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoLogic.saveCajaIngresos();//WithConnection
						//cajaingresoLogic.getSetVersionRowCajaIngresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalles.addAll(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetallesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaingresoLogic.saveCajaIngresoRelaciones(cajaingresoAux,this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles());//WithConnection
								//cajaingresoLogic.getSetVersionRowCajaIngresos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalles= new ArrayList<CajaIngresoDetalle>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							cajaingresoAux.setCajaIngresoDetalles(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cajaingresoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cajaingresoAux,cajaingresoLogic.getCajaIngresos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cajaingresoAux,cajaingresos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getCajaIngresos().addAll(this.cajaingresosEliminados);
					
					cajaingresoLogic.saveCajaIngresos();//WithConnection
					//cajaingresoLogic.getSetVersionRowCajaIngresos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCajaIngreso();
				
				this.cajaingresosEliminados= new ArrayList<CajaIngreso>();		
			}
			
			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Caja Ingreso GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cajaingreso=cajaingresoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessCajaIngreso();
      	}
		
	}	
	
	public void actualizarRelaciones(CajaIngreso cajaingresoLocal) throws Exception {
		
		if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				cajaingresoLocal.setCajaIngresoDetalles(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles());
			
			} else {
			
				cajaingresoLocal.setCajaIngresoDetalles(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalles);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CajaIngreso cajaingresoLocal) throws Exception {	
		if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajaingresoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cajaingresoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				cajaingresoLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				cajaingresoLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TurnoPunVenDetalleFormJInternalFrame.class)) {
				TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrameLocal=(TurnoPunVenBeanSwingJInternalFrame) ((TurnoPunVenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				turnopunvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTurnoPunVen(turnopunvenBeanSwingJInternalFrameLocal.getturnopunven(),true);
				turnopunvenBeanSwingJInternalFrameLocal.actualizarLista(turnopunvenBeanSwingJInternalFrameLocal.turnopunven,this.turnopunvensForeignKey);

				turnopunvenBeanSwingJInternalFrameLocal.actualizarRelaciones(turnopunvenBeanSwingJInternalFrameLocal.turnopunven);

				cajaingresoLocal.setTurnoPunVen(turnopunvenBeanSwingJInternalFrameLocal.turnopunven);

				this.addItemDefectoCombosForeignKeyTurnoPunVen();
				this.cargarCombosFrameTurnoPunVensForeignKey("Formulario");
				this.setActualTurnoPunVenForeignKey(turnopunvenBeanSwingJInternalFrameLocal.turnopunven.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajaIngresoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajaingresoValidator.getInvalidValues(this.cajaingreso);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CajaIngreso cajaingreso,List<CajaIngreso> cajaingresos) throws Exception {
		try	{		
			CajaIngresoConstantesFunciones.actualizarLista(cajaingreso,cajaingresos,this.cajaingresoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CajaIngreso cajaingreso,List<CajaIngreso> cajaingresos) throws Exception {
		try	{			
			CajaIngresoConstantesFunciones.actualizarSelectedLista(cajaingreso,cajaingresos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CajaIngreso> cajaingresosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajaingresosLocal=this.cajaingresoLogic.getCajaIngresos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajaingresosLocal=this.cajaingresos;
			}
			//ARCHITECTURE
		
			for(CajaIngreso cajaingresoLocal:cajaingresosLocal) {
				if(this.permiteMantenimiento(cajaingresoLocal) && cajaingresoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+CajaIngresoConstantesFunciones.getCajaIngresoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajaIngresoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_empresaCajaIngreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_sucursalCajaIngreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_usuarioCajaIngreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_cajaCajaIngreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoConstantesFunciones.IDTURNOPUNVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_turno_pun_venCajaIngreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelsecuencialCajaIngreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelfechaCajaIngreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoConstantesFunciones.HORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelhoraCajaIngreso,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_empresaCajaIngreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_sucursalCajaIngreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_usuarioCajaIngreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_cajaCajaIngreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngreso.jLabelid_turno_pun_venCajaIngreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngreso.jLabelsecuencialCajaIngreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngreso.jLabelfechaCajaIngreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngreso.jLabelhoraCajaIngreso,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CajaIngresoDetalle")) {
			if(this.cajaingreso==null) {
				this.cajaingreso= new CajaIngreso();
			}

			if(this.cajaingresoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCajaIngreso
				this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);

				this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.getcajaingresodetalle().setCajaIngreso(this.cajaingreso);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCajaIngreso--;	
		
		
		this.cajaingresoAux=new CajaIngreso();
		
		this.cajaingresoAux.setId(this.iIdNuevoCajaIngreso);
		this.cajaingresoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajaingresoLogic.getCajaIngresos().add(this.cajaingresoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajaingresos.add(this.cajaingresoAux);
		}
		//ARCHITECTURE
		
		this.cajaingreso=this.cajaingresoAux;
		
		if(CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajaIngreso(this.cajaingreso);
			this.setVariablesObjetoActualToFormularioForeignKeyCajaIngreso(this.cajaingreso);
		}
				
		//this.setDefaultControlesCajaIngreso();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajaIngreso();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajaIngreso();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaIngreso();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaIngreso(this.cajaingresoBean,this.cajaingreso,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CajaIngresoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
			classes=CajaIngresoConstantesFunciones.getClassesRelationshipsOfCajaIngreso(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cajaingresoReturnGeneral=cajaingresoLogic.procesarEventosCajaIngresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaingresoLogic.getCajaIngresos(),this.cajaingreso,this.cajaingresoParameterGeneral,this.isEsNuevoCajaIngreso,classes);//this.cajaingresoLogic.getCajaIngreso()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajaIngreso(this.cajaingresoReturnGeneral,this.cajaingresoBean,false);
		
		if(this.cajaingresoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajaIngreso(this.cajaingresoReturnGeneral.getCajaIngreso());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajaIngreso(this.cajaingresoReturnGeneral.getCajaIngreso());
		}
		
		if(this.cajaingresoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajaIngreso(this.cajaingresoReturnGeneral.getCajaIngreso(),classes);//this.cajaingresoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajaIngreso();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajaIngreso();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaIngresoBeanSwingJInternalFrameAdditional.RecargarFormCajaIngreso(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajaIngreso(false);
						
			if(cajaingresoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.getEsGuardarRelacionado() && CajaIngresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajaIngresoDetalleActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaIngreso();
			}
			
			this.actualizarVisualTableDatosCajaIngreso();
			
			this.jTableDatosCajaIngreso.setRowSelectionInterval(this.getIndiceNuevoCajaIngreso(), this.getIndiceNuevoCajaIngreso());
			
			this.seleccionarFilaTablaCajaIngresoActual();
						
			this.actualizarEstadoCeldasBotonesCajaIngreso("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajaIngreso(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajaIngreso.jTextFieldsecuencialCajaIngreso.setEnabled(isHabilitar && this.cajaingresoConstantesFunciones.activarsecuencialCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jDateChooserfechaCajaIngreso.setEnabled(isHabilitar && this.cajaingresoConstantesFunciones.activarfechaCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jSpinnerhoraCajaIngreso.setEnabled(isHabilitar && this.cajaingresoConstantesFunciones.activarhoraCajaIngreso);	
		//
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setEnabled(isHabilitar && this.cajaingresoConstantesFunciones.activarid_empresaCajaIngreso);//
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setEnabled(isHabilitar && this.cajaingresoConstantesFunciones.activarid_sucursalCajaIngreso);//
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setEnabled(isHabilitar && this.cajaingresoConstantesFunciones.activarid_usuarioCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setEnabled(isHabilitar && this.cajaingresoConstantesFunciones.activarid_cajaCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setEnabled(isHabilitar && this.cajaingresoConstantesFunciones.activarid_turno_pun_venCajaIngreso);
	};
	
	public void setDefaultControlesCajaIngreso() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajaIngreso(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajaingresoSessionBean.setConGuardarRelaciones(true);			
			this.cajaingresoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.cajaingresoSessionBean.setConGuardarRelaciones(false);			
			this.cajaingresoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCajaIngreso() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
				if(cajaingresoAux.getId().equals(this.iIdNuevoCajaIngreso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngreso cajaingresoAux:this.cajaingresos) {
				if(cajaingresoAux.getId().equals(this.iIdNuevoCajaIngreso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualCajaIngreso(CajaIngreso cajaingreso,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
				if(cajaingresoAux.getId().equals(cajaingreso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngreso cajaingresoAux:this.cajaingresos) {
				if(cajaingresoAux.getId().equals(cajaingreso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalCajaIngreso(CajaIngreso cajaingresoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
				if(cajaingresoAux.getCajaIngresoOriginal().getId().equals(cajaingresoOriginal.getId())) {
					existe=true;
					cajaingresoOriginal.setId(cajaingresoAux.getId());
					cajaingresoOriginal.setVersionRow(cajaingresoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngreso cajaingresoAux:this.cajaingresos) {
				if(cajaingresoAux.getCajaIngresoOriginal().getId().equals(cajaingresoOriginal.getId())) {
					existe=true;
					cajaingresoOriginal.setId(cajaingresoAux.getId());
					cajaingresoOriginal.setVersionRow(cajaingresoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajaIngreso(Boolean esParaCancelar) throws Exception {
		cajaingresosAux=new ArrayList<CajaIngreso>();
		cajaingresoAux=new CajaIngreso();
		
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
					if(cajaingresoAux.getId()<0) {
						cajaingresosAux.add(cajaingresoAux);
					}		
				}
				this.iIdNuevoCajaIngreso=0L;
				this.cajaingresoLogic.getCajaIngresos().removeAll(cajaingresosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaIngreso cajaingresoAux:this.cajaingresos) {
					if(cajaingresoAux.getId()<0) {
						cajaingresosAux.add(cajaingresoAux);
					}		
				}
				this.iIdNuevoCajaIngreso=0L;
				this.cajaingresos.removeAll(cajaingresosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajaIngreso 
					&& this.cajaingresoLogic.getCajaIngresos().size()>0
					) {
					cajaingresoAux=this.cajaingresoLogic.getCajaIngresos().get(this.cajaingresoLogic.getCajaIngresos().size() - 1);
				
					if(cajaingresoAux.getId()<0) {
						this.cajaingresoLogic.getCajaIngresos().remove(cajaingresoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajaIngreso && this.cajaingresos.size()>0) {
					cajaingresoAux=this.cajaingresos.get(this.cajaingresos.size() - 1);
				
					if(cajaingresoAux.getId()<0) {
						this.cajaingresos.remove(cajaingresoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajaIngreso(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajaingreso.getId()<0) {
				this.cajaingresoLogic.getCajaIngresos().remove(this.cajaingreso);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajaingreso.getId()<0) {
				this.cajaingresos.remove(this.cajaingreso);
			}
		}			
	}
	
	public void setEstadosInicialesCajaIngreso(List<CajaIngreso> cajaingresosAux) throws Exception {
		CajaIngresoConstantesFunciones.setEstadosInicialesCajaIngreso(cajaingresosAux);
	}
	
	public void setEstadosInicialesCajaIngreso(CajaIngreso cajaingresoAux) throws Exception {
		CajaIngresoConstantesFunciones.setEstadosInicialesCajaIngreso(cajaingresoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajaIngresoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajaIngreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajaIngresoActual()) {
				if(!this.isEsNuevoCajaIngreso) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajaIngreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajaIngreso=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajaIngresoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Caja Ingreso ?", "MANTENIMIENTO DE Caja Ingreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajaIngreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CajaIngreso cajaingreso) throws Exception {
		CajaIngresoConstantesFunciones.seleccionarAsignar(this.cajaingreso,cajaingreso);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajaIngreso=this.isPermisoActualizarOriginalCajaIngreso;
			
			
			this.seleccionarAsignar(cajaingreso);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaIngresoConstantesFunciones.quitarEspaciosCajaIngreso(this.cajaingreso,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCajaIngreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajaingresoSessionBean.setsFuncionBusquedaRapida(this.cajaingresoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCajaIngreso) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajaIngreso(esParaCancelar);				
				this.cancelarNuevoCajaIngreso(esParaCancelar);								
			}
			
			this.cajaingreso=new CajaIngreso();
			
			this.inicializarCajaIngreso();
			
			this.actualizarEstadoCeldasBotonesCajaIngreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajaIngreso() throws Exception {
		try {
			CajaIngresoConstantesFunciones.inicializarCajaIngreso(this.cajaingreso);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajaingresoLogic.getCajaIngresos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajaIngresos(String sAccionBusqueda,List<CajaIngreso> cajaingresosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="CajaIngreso"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajaIngresoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajaIngresoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CajaIngreso"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Caja Ingresos");		
		parameters.put("busquedapor", CajaIngresoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CajaIngresoDetalle.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CajaIngresoLogic cajaingresoLogicAuxiliar=new CajaIngresoLogic();
					cajaingresoLogicAuxiliar.setDatosCliente(cajaingresoLogic.getDatosCliente());				
					cajaingresoLogicAuxiliar.setCajaIngresos(cajaingresosParaReportes);
					
					cajaingresoLogicAuxiliar.cargarRelacionesLoteForeignKeyCajaIngresoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					cajaingresosParaReportes=cajaingresoLogicAuxiliar.getCajaIngresos();
					
					//cajaingresoLogic.getNewConnexionToDeep();
					
					//for (CajaIngreso cajaingreso:cajaingresosParaReportes) {
					//	cajaingresoLogic.deepLoad(cajaingreso, false, DeepLoadType.INCLUDE, classes);
					//}						
					//cajaingresoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//cajaingresoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCajaIngresoDetalle = AuxiliarReportes.class.getResourceAsStream("CajaIngresoDetalleDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cajaingresodetalle", reportFileCajaIngresoDetalle);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajaIngreso=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajaIngresoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajaIngresoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajaIngreso=new JRBeanArrayDataSource(CajaIngresoJInternalFrame.TraerCajaIngresoBeans(cajaingresosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajaIngreso);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajaIngresoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajaIngresoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajaIngresoBean.TraerCajaIngresoBeans(cajaingresosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteCajaIngresos(sAccionBusqueda,sTipoArchivoReporte,cajaingresosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajaIngresos(sAccionBusqueda,sTipoArchivoReporte,cajaingresosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajaIngresoActionPerformed(null);
					//this.generarExcelReporteCajaIngresos(sAccionBusqueda,sTipoArchivoReporte,cajaingresosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajaIngresos(sAccionBusqueda,sTipoArchivoReporte,cajaingresosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajaIngresos(sAccionBusqueda,sTipoArchivoReporte,cajaingresosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajaIngresos(sAccionBusqueda,sTipoArchivoReporte,cajaingresosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajaIngresos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaIngreso> cajaingresosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingreso";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaIngresos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaIngreso("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CajaIngreso cajaingreso : cajaingresosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajaIngresoConstantesFunciones.generarExcelReporteDataCajaIngreso("NORMAL",row,workbook,cajaingreso,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajaIngreso(String sTipo,Row row,Workbook workbook) {
		
		CajaIngresoConstantesFunciones.generarExcelReporteHeaderCajaIngreso(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajaIngresos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaIngreso> cajaingresosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingreso_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaIngresos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CajaIngreso cajaingreso : cajaingresosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajaIngresoConstantesFunciones.getCajaIngresoDescripcion(cajaingreso));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingreso.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingreso.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingreso.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingreso.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingreso.getturnopunven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingreso.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingreso.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoConstantesFunciones.LABEL_HORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_HORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingreso.gethora());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajaIngresos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaIngreso> cajaingresosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CajaIngreso> cajaingresosRespaldo=null;
		
		classes=CajaIngresoConstantesFunciones.getClassesRelationshipsOfCajaIngreso(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajaingresoLogic.setDatosCliente(this.datosCliente);
		this.cajaingresoLogic.setDatosDeep(this.datosDeep);
		this.cajaingresoLogic.setIsConDeep(true);
		
		cajaingresosRespaldo=this.cajaingresoLogic.getCajaIngresos();
		
		this.cajaingresoLogic.setCajaIngresos(cajaingresosParaReportes);	
		this.cajaingresoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajaingresosParaReportes=this.cajaingresoLogic.getCajaIngresos();
		this.cajaingresoLogic.setCajaIngresos(cajaingresosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingreso_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaIngresos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaIngreso("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CajaIngreso cajaingreso : cajaingresosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajaIngreso("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajaIngresoConstantesFunciones.generarExcelReporteDataCajaIngreso("NORMAL",row,workbook,cajaingreso,cellStyleDataAux);
		
			
			


				//CajaIngresoDetalle
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO))) {

				if(cajaingreso.getCajaIngresoDetalles()!=null && cajaingreso.getCajaIngresoDetalles().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CajaIngresoDetalleConstantesFunciones.generarExcelReporteHeaderCajaIngresoDetalle("RELACIONADO",row,workbook);
				}

				if(cajaingreso.getCajaIngresoDetalles()!=null) {
					i2=0;
					for(CajaIngresoDetalle cajaingresodetalle : cajaingreso.getCajaIngresoDetalles()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CajaIngresoDetalleConstantesFunciones.generarExcelReporteDataCajaIngresoDetalle("RELACIONADO",row,workbook,cajaingresodetalle,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CajaIngresoConstantesFunciones.getCajaIngresoDescripcion(cajaingreso));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaIngreso.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajaIngreso() throws Exception {		
		this.startProcessCajaIngreso(true);
	}
	
	public void startProcessCajaIngreso(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajaIngreso ,this.jPanelParametrosReportesCajaIngreso, this.jScrollPanelDatosCajaIngreso,this.jPanelPaginacionCajaIngreso, this.jScrollPanelDatosEdicionCajaIngreso, this.jPanelAccionesCajaIngreso,this.jPanelAccionesFormularioCajaIngreso,this.jmenuBarCajaIngreso,this.jmenuBarDetalleCajaIngreso,this.jTtoolBarCajaIngreso,this.jTtoolBarDetalleCajaIngreso);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaIngreso=this.jTabbedPaneBusquedasCajaIngreso; 
		
		final JPanel jPanelParametrosReportesCajaIngreso=this.jPanelParametrosReportesCajaIngreso;
		//final JScrollPane jScrollPanelDatosCajaIngreso=this.jScrollPanelDatosCajaIngreso;
		final JTable jTableDatosCajaIngreso=this.jTableDatosCajaIngreso;		
		final JPanel jPanelPaginacionCajaIngreso=this.jPanelPaginacionCajaIngreso;
		//final JScrollPane jScrollPanelDatosEdicionCajaIngreso=this.jScrollPanelDatosEdicionCajaIngreso;
		final JPanel jPanelAccionesCajaIngreso=this.jPanelAccionesCajaIngreso;
		
		JPanel jPanelCamposAuxiliarCajaIngreso=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajaIngreso=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			jPanelCamposAuxiliarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jPanelCamposCajaIngreso;
			jPanelAccionesFormularioAuxiliarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jPanelAccionesFormularioCajaIngreso;
		}
		
		final JPanel jPanelCamposCajaIngreso=jPanelCamposAuxiliarCajaIngreso;
		final JPanel jPanelAccionesFormularioCajaIngreso=jPanelAccionesFormularioAuxiliarCajaIngreso;
		
		
		final JMenuBar jmenuBarCajaIngreso=this.jmenuBarCajaIngreso;
		final JToolBar jTtoolBarCajaIngreso=this.jTtoolBarCajaIngreso;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajaIngreso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaIngreso=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			jmenuBarDetalleAuxiliarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jmenuBarDetalleCajaIngreso;
			jTtoolBarDetalleAuxiliarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jTtoolBarDetalleCajaIngreso;
		}
		
		final JMenuBar jmenuBarDetalleCajaIngreso=jmenuBarDetalleAuxiliarCajaIngreso;
		final JToolBar jTtoolBarDetalleCajaIngreso=jTtoolBarDetalleAuxiliarCajaIngreso;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaIngreso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaIngreso;
			processRunnable.jTableDatos=jTableDatosCajaIngreso;
			processRunnable.jPanelCampos=jPanelCamposCajaIngreso;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaIngreso;
			processRunnable.jPanelAcciones=jPanelAccionesCajaIngreso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaIngreso;
			
			
			processRunnable.jmenuBar=jmenuBarCajaIngreso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaIngreso;
			processRunnable.jTtoolBar=jTtoolBarCajaIngreso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaIngreso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaIngreso ,jPanelParametrosReportesCajaIngreso,jTableDatosCajaIngreso, /*jScrollPanelDatosCajaIngreso,*/jPanelCamposCajaIngreso,jPanelPaginacionCajaIngreso, /*jScrollPanelDatosEdicionCajaIngreso,*/ jPanelAccionesCajaIngreso,jPanelAccionesFormularioCajaIngreso,jmenuBarCajaIngreso,jmenuBarDetalleCajaIngreso,jTtoolBarCajaIngreso,jTtoolBarDetalleCajaIngreso);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaIngreso ,jPanelParametrosReportesCajaIngreso, jScrollPanelDatosCajaIngreso,jPanelPaginacionCajaIngreso, jScrollPanelDatosEdicionCajaIngreso, jPanelAccionesCajaIngreso,jPanelAccionesFormularioCajaIngreso,jmenuBarCajaIngreso,jmenuBarDetalleCajaIngreso,jTtoolBarCajaIngreso,jTtoolBarDetalleCajaIngreso);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessCajaIngreso() {// throws Exception 
		this.finishProcessCajaIngreso(true);
	}
	
	public void finishProcessCajaIngreso(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajaIngreso ,this.jPanelParametrosReportesCajaIngreso, this.jScrollPanelDatosCajaIngreso,this.jPanelPaginacionCajaIngreso, this.jScrollPanelDatosEdicionCajaIngreso, this.jPanelAccionesCajaIngreso,this.jPanelAccionesFormularioCajaIngreso,this.jmenuBarCajaIngreso,this.jmenuBarDetalleCajaIngreso,this.jTtoolBarCajaIngreso,this.jTtoolBarDetalleCajaIngreso);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaIngreso=this.jTabbedPaneBusquedasCajaIngreso; 
		
		final JPanel jPanelParametrosReportesCajaIngreso=this.jPanelParametrosReportesCajaIngreso;
		//final JScrollPane jScrollPanelDatosCajaIngreso=this.jScrollPanelDatosCajaIngreso;
		final JTable jTableDatosCajaIngreso=this.jTableDatosCajaIngreso;		
		final JPanel jPanelPaginacionCajaIngreso=this.jPanelPaginacionCajaIngreso;
		//final JScrollPane jScrollPanelDatosEdicionCajaIngreso=this.jScrollPanelDatosEdicionCajaIngreso;
		final JPanel jPanelAccionesCajaIngreso=this.jPanelAccionesCajaIngreso;
		
		JPanel jPanelCamposAuxiliarCajaIngreso=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajaIngreso=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			jPanelCamposAuxiliarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jPanelCamposCajaIngreso;
			jPanelAccionesFormularioAuxiliarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jPanelAccionesFormularioCajaIngreso;
		}
		
		final JPanel jPanelCamposCajaIngreso=jPanelCamposAuxiliarCajaIngreso;
		final JPanel jPanelAccionesFormularioCajaIngreso=jPanelAccionesFormularioAuxiliarCajaIngreso;
		
		
		final JMenuBar jmenuBarCajaIngreso=this.jmenuBarCajaIngreso;		
		final JToolBar jTtoolBarCajaIngreso=this.jTtoolBarCajaIngreso;
				
		JMenuBar jmenuBarDetalleAuxiliarCajaIngreso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaIngreso=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			jmenuBarDetalleAuxiliarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jmenuBarDetalleCajaIngreso;
			jTtoolBarDetalleAuxiliarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jTtoolBarDetalleCajaIngreso;		
		}
		
		final JMenuBar jmenuBarDetalleCajaIngreso=jmenuBarDetalleAuxiliarCajaIngreso;
		final JToolBar jTtoolBarDetalleCajaIngreso=jTtoolBarDetalleAuxiliarCajaIngreso;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaIngreso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaIngreso;
			processRunnable.jTableDatos=jTableDatosCajaIngreso;
			processRunnable.jPanelCampos=jPanelCamposCajaIngreso;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaIngreso;
			processRunnable.jPanelAcciones=jPanelAccionesCajaIngreso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaIngreso;
			
			
			processRunnable.jmenuBar=jmenuBarCajaIngreso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaIngreso;
			processRunnable.jTtoolBar=jTtoolBarCajaIngreso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaIngreso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajaIngreso ,jPanelParametrosReportesCajaIngreso, jTableDatosCajaIngreso,/*jScrollPanelDatosCajaIngreso,*/jPanelCamposCajaIngreso,jPanelPaginacionCajaIngreso, /*jScrollPanelDatosEdicionCajaIngreso,*/ jPanelAccionesCajaIngreso,jPanelAccionesFormularioCajaIngreso,jmenuBarCajaIngreso,jmenuBarDetalleCajaIngreso,jTtoolBarCajaIngreso,jTtoolBarDetalleCajaIngreso));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajaIngreso(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajaIngreso(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajaIngreso(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajaIngreso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajaIngreso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajaIngreso,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajaIngreso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajaIngreso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajaIngreso,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajaingresoConstantesFunciones.getsFinalQueryCajaIngreso();
		String  finalQueryPaginacionTodos=this.cajaingresoConstantesFunciones.getsFinalQueryCajaIngreso();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=CajaIngresoConstantesFunciones.getArrayColumnasGlobalesNoCajaIngreso(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajaIngresoConstantesFunciones.getArrayColumnasGlobalesCajaIngreso(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajaIngresoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajaingresosEliminados= new ArrayList<CajaIngreso>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajaIngreso();
		
				///*CajaIngresoSessionBean*/this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			
			if(this.cajaingresoSessionBean==null) {
				this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=CajaIngresoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajaIngresoConstantesFunciones.getClassesForeignKeysOfCajaIngreso(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajaingreso."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajaingresosAux= new ArrayList<CajaIngreso>();
			
				
			cajaingresoLogic.setDatosCliente(this.datosCliente);
			cajaingresoLogic.setDatosDeep(this.datosDeep);
			cajaingresoLogic.setIsConDeep(true);
			
			
			cajaingresoLogic.getCajaIngresoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cajaingresoLogic.getTodosCajaIngresos(finalQueryGlobal,pagination);
					
					//cajaingresoLogic.getTodosCajaIngresosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cajaingresoLogic.getCajaIngresos()==null|| cajaingresoLogic.getCajaIngresos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaingresosAux= new ArrayList<CajaIngreso>();
							cajaingresosAux.addAll(cajaingresoLogic.getCajaIngresos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresosAux= new ArrayList<CajaIngreso>();
							cajaingresosAux.addAll(cajaingresos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaingresoLogic.getTodosCajaIngresos(finalQueryGlobal+"",this.pagination);												
							
							//cajaingresoLogic.getTodosCajaIngresosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCajaIngresos("Todos",cajaingresoLogic.getCajaIngresos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());					
							cajaingresoLogic.getCajaIngresos().addAll(cajaingresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresos=new ArrayList<CajaIngreso>();
							cajaingresos.addAll(cajaingresosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCajaIngreso=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCajaIngreso=this.idActual;
				
				} else if(this.idCajaIngresoActual!=null && this.idCajaIngresoActual!=0L) {
					idCajaIngreso=idCajaIngresoActual;
				}
				
					
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndicePorId(idCajaIngreso);
				
				this.cajaingresos=new ArrayList<CajaIngreso>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cajaingresoLogic.getEntity(idCajaIngreso);
					
					//cajaingresoLogic.getEntityWithConnection(idCajaIngreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
					cajaingresoLogic.getCajaIngresos().add(cajaingresoLogic.getCajaIngreso());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingresos=new ArrayList<CajaIngreso>();
					this.cajaingresos.add(cajaingreso);
				}
				
				if(cajaingresoLogic.getCajaIngreso()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCaja")) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresoLogic.getCajaIngresosFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresoLogic.getCajaIngresos()==null||cajaingresoLogic.getCajaIngresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresos==null|| cajaingresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresosAux=new ArrayList<CajaIngreso>();
						cajaingresosAux.addAll(cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresosAux=new ArrayList<CajaIngreso>();
							cajaingresosAux.addAll(cajaingresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresoLogic.getCajaIngresosFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresos("FK_IdCaja",cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresos("FK_IdCaja",cajaingresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
						cajaingresoLogic.getCajaIngresos().addAll(cajaingresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresos=new ArrayList<CajaIngreso>();
							cajaingresos.addAll(cajaingresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresoLogic.getCajaIngresosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresoLogic.getCajaIngresos()==null||cajaingresoLogic.getCajaIngresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresos==null|| cajaingresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresosAux=new ArrayList<CajaIngreso>();
						cajaingresosAux.addAll(cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresosAux=new ArrayList<CajaIngreso>();
							cajaingresosAux.addAll(cajaingresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresoLogic.getCajaIngresosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresos("FK_IdEmpresa",cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresos("FK_IdEmpresa",cajaingresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
						cajaingresoLogic.getCajaIngresos().addAll(cajaingresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresos=new ArrayList<CajaIngreso>();
							cajaingresos.addAll(cajaingresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresoLogic.getCajaIngresosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresoLogic.getCajaIngresos()==null||cajaingresoLogic.getCajaIngresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresos==null|| cajaingresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresosAux=new ArrayList<CajaIngreso>();
						cajaingresosAux.addAll(cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresosAux=new ArrayList<CajaIngreso>();
							cajaingresosAux.addAll(cajaingresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresoLogic.getCajaIngresosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresos("FK_IdSucursal",cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresos("FK_IdSucursal",cajaingresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
						cajaingresoLogic.getCajaIngresos().addAll(cajaingresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresos=new ArrayList<CajaIngreso>();
							cajaingresos.addAll(cajaingresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTurnoPunVen")) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresoLogic.getCajaIngresosFK_IdTurnoPunVen(finalQueryGlobal,pagination,id_turno_pun_venFK_IdTurnoPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresoLogic.getCajaIngresos()==null||cajaingresoLogic.getCajaIngresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresos==null|| cajaingresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresosAux=new ArrayList<CajaIngreso>();
						cajaingresosAux.addAll(cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresosAux=new ArrayList<CajaIngreso>();
							cajaingresosAux.addAll(cajaingresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresoLogic.getCajaIngresosFK_IdTurnoPunVen(finalQueryGlobal,pagination,id_turno_pun_venFK_IdTurnoPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresos("FK_IdTurnoPunVen",cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresos("FK_IdTurnoPunVen",cajaingresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
						cajaingresoLogic.getCajaIngresos().addAll(cajaingresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresos=new ArrayList<CajaIngreso>();
							cajaingresos.addAll(cajaingresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresoLogic.getCajaIngresosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresoLogic.getCajaIngresos()==null||cajaingresoLogic.getCajaIngresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresos==null|| cajaingresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresosAux=new ArrayList<CajaIngreso>();
						cajaingresosAux.addAll(cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresosAux=new ArrayList<CajaIngreso>();
							cajaingresosAux.addAll(cajaingresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresoLogic.getCajaIngresosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresos("FK_IdUsuario",cajaingresoLogic.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresos("FK_IdUsuario",cajaingresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
						cajaingresoLogic.getCajaIngresos().addAll(cajaingresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresos=new ArrayList<CajaIngreso>();
							cajaingresos.addAll(cajaingresosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajaIngreso();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajaIngreso();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajaingresoLogic.getCajaIngresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaingresos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajaingresoLogic.getCajaIngresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaingresos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CajaIngreso cajaingreso) {
		Boolean permite=true;
		
		if(this.cajaingreso.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajaIngresoConstantesFunciones.getOrderByListaCajaIngreso();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajaIngresoConstantesFunciones.getOrderByListaCajaIngreso();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngreso cajaingreso:cajaingresoLogic.getCajaIngresos()) {
				if(cajaingreso.getsType().equals(Constantes2.S_TOTALES)) {
					cajaingresoTotales=cajaingreso;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngreso cajaingreso:this.cajaingresos) {
				if(cajaingreso.getsType().equals(Constantes2.S_TOTALES)) {
					cajaingresoTotales=cajaingreso;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.cajaingresoAux=new CajaIngreso();
			this.cajaingresoAux.setsType(Constantes2.S_TOTALES);
			this.cajaingresoAux.setIsNew(false);
			this.cajaingresoAux.setIsChanged(false);
			this.cajaingresoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CajaIngresoConstantesFunciones.TotalizarValoresFilaCajaIngreso(this.cajaingresoLogic.getCajaIngresos(),this.cajaingresoAux);
				
				this.cajaingresoLogic.getCajaIngresos().add(this.cajaingresoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajaIngresoConstantesFunciones.TotalizarValoresFilaCajaIngreso(this.cajaingresos,this.cajaingresoAux);
				
				this.cajaingresos.add(this.cajaingresoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajaingresoTotales=new CajaIngreso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajaingresoLogic.getCajaIngresos().remove(cajaingresoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajaingresos.remove(cajaingresoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajaingresoTotales=new CajaIngreso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngreso cajaingreso:cajaingresoLogic.getCajaIngresos()) {
				if(cajaingreso.getsType().equals(Constantes2.S_TOTALES)) {
					cajaingresoTotales=cajaingreso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaIngresoConstantesFunciones.TotalizarValoresFilaCajaIngreso(this.cajaingresoLogic.getCajaIngresos(),cajaingresoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngreso cajaingreso:this.cajaingresos) {
				if(cajaingreso.getsType().equals(Constantes2.S_TOTALES)) {
					cajaingresoTotales=cajaingreso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaIngresoConstantesFunciones.TotalizarValoresFilaCajaIngreso(this.cajaingresos,cajaingresoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajaIngresosFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaIngresosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaIngresosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaIngresosFK_IdTurnoPunVen()throws Exception {
		try {
			sAccionBusqueda="FK_IdTurnoPunVen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaIngresosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajaIngresosFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLogic.getCajaIngresosFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaIngresosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLogic.getCajaIngresosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaIngresosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLogic.getCajaIngresosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaIngresosFK_IdTurnoPunVen(String sFinalQuery,Long id_turno_pun_ven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLogic.getCajaIngresosFK_IdTurnoPunVen(sFinalQuery,this.pagination,id_turno_pun_ven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaIngresosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLogic.getCajaIngresosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCajaIngreso() {
		this.isPermisoTodoCajaIngreso=false;
		this.isPermisoNuevoCajaIngreso=false;
		this.isPermisoActualizarCajaIngreso=false;
		this.isPermisoActualizarOriginalCajaIngreso=false;
		this.isPermisoEliminarCajaIngreso=false;
		this.isPermisoGuardarCambiosCajaIngreso=false;
		this.isPermisoConsultaCajaIngreso=false;
		this.isPermisoBusquedaCajaIngreso=false;
		this.isPermisoReporteCajaIngreso=false;		
		this.isPermisoOrdenCajaIngreso=false;		
		this.isPermisoPaginacionMedioCajaIngreso=false;		
		this.isPermisoPaginacionAltoCajaIngreso=false;
		this.isPermisoPaginacionTodoCajaIngreso=false;
		this.isPermisoCopiarCajaIngreso=false;		
		this.isPermisoVerFormCajaIngreso=false;		
		this.isPermisoDuplicarCajaIngreso=false;		
		this.isPermisoOrdenCajaIngreso=false;		
	}
	
	public void setPermisosUsuarioCajaIngreso(Boolean isPermiso) {
		this.isPermisoTodoCajaIngreso=isPermiso;
		this.isPermisoNuevoCajaIngreso=isPermiso;
		this.isPermisoActualizarCajaIngreso=isPermiso;
		this.isPermisoActualizarOriginalCajaIngreso=isPermiso;
		this.isPermisoEliminarCajaIngreso=isPermiso;
		this.isPermisoGuardarCambiosCajaIngreso=isPermiso;
		this.isPermisoConsultaCajaIngreso=isPermiso;
		this.isPermisoBusquedaCajaIngreso=isPermiso;
		this.isPermisoReporteCajaIngreso=isPermiso;
		this.isPermisoOrdenCajaIngreso=isPermiso;		
		this.isPermisoPaginacionMedioCajaIngreso=isPermiso;		
		this.isPermisoPaginacionAltoCajaIngreso=isPermiso;		
		this.isPermisoPaginacionTodoCajaIngreso=isPermiso;		
		this.isPermisoCopiarCajaIngreso=isPermiso;		
		this.isPermisoVerFormCajaIngreso=isPermiso;		
		this.isPermisoDuplicarCajaIngreso=isPermiso;
		this.isPermisoOrdenCajaIngreso=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajaIngreso(Boolean isPermiso) {
		//this.isPermisoTodoCajaIngreso=isPermiso;
		this.isPermisoNuevoCajaIngreso=isPermiso;
		this.isPermisoActualizarCajaIngreso=isPermiso;
		this.isPermisoActualizarOriginalCajaIngreso=isPermiso;
		this.isPermisoEliminarCajaIngreso=isPermiso;
		this.isPermisoGuardarCambiosCajaIngreso=isPermiso;
		//this.isPermisoConsultaCajaIngreso=isPermiso;
		//this.isPermisoBusquedaCajaIngreso=isPermiso;
		//this.isPermisoReporteCajaIngreso=isPermiso;
		//this.isPermisoOrdenCajaIngreso=isPermiso;		
		//this.isPermisoPaginacionMedioCajaIngreso=isPermiso;		
		//this.isPermisoPaginacionAltoCajaIngreso=isPermiso;		
		//this.isPermisoPaginacionTodoCajaIngreso=isPermiso;		
		//this.isPermisoCopiarCajaIngreso=isPermiso;		
		//this.isPermisoDuplicarCajaIngreso=isPermiso;
		//this.isPermisoOrdenCajaIngreso=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajaIngresoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CajaIngresoDetalleConstantesFunciones.SNOMBREOPCION);
		
		if(CajaIngresoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCajaIngresoDetalle=false;
		this.isTienePermisosCajaIngresoDetalle=this.verificarGetPermisosUsuarioOpcionCajaIngresoClaseRelacionada(this.opcionsRelacionadas,CajaIngresoDetalleConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajaIngreso(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajaIngresoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCajaIngresoDetalle=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCajaIngresoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajaIngresoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajaIngresoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCajaIngresoDetalle && this.jInternalFrameDetalleFormCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.remove(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCajaIngreso() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajaIngresoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajaIngresoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajaIngreso=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajaIngreso=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajaIngreso=this.isPermisoActualizarCajaIngreso;
			this.isPermisoEliminarCajaIngreso=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajaIngreso=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajaIngreso=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajaIngreso=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajaIngreso=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajaIngreso=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaIngreso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajaIngreso=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajaIngreso=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajaIngreso=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajaIngreso=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajaIngreso=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajaIngreso=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaIngreso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajaIngreso.setToolTipText(this.jTableDatosCajaIngreso.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajaIngreso(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajaIngreso(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajaIngresoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(CajaIngresoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioCajaIngreso() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCajaIngresoDetalle && this.cajaingresoConstantesFunciones.mostrarCajaIngresoDetalleCajaIngreso && !CajaIngresoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Caja Ingreso Detalle");
			reporte.setsDescripcion("Caja Ingreso Detalle");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyCajaIngresoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
				this.turnopunvensForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCajaIngresoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajaIngresoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCajaIngresoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTurnoPunVenListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTurnoPunVenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.turnopunvensForeignKey==null||this.turnopunvensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TurnoPunVenConstantesFunciones.getArrayColumnasGlobalesTurnoPunVen(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TurnoPunVenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TurnoPunVenConstantesFunciones.SFINALQUERY;

				this.cargarCombosTurnoPunVensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCajaIngresoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CajaIngresoParameterReturnGeneral cajaingresoReturnGeneral=new CajaIngresoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cajaingresoConstantesFunciones.cargarid_empresaCajaIngreso)
					 || (this.esRecargarFks && this.cajaingresoConstantesFunciones.cargarid_empresaCajaIngreso)) {

					if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cajaingresoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cajaingresoConstantesFunciones.cargarid_sucursalCajaIngreso)
					 || (this.esRecargarFks && this.cajaingresoConstantesFunciones.cargarid_sucursalCajaIngreso)) {

					if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cajaingresoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.cajaingresoConstantesFunciones.cargarid_usuarioCajaIngreso)
					 || (this.esRecargarFks && this.cajaingresoConstantesFunciones.cargarid_usuarioCajaIngreso)) {

					if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+cajaingresoSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalCaja="";

				if(((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0) && this.cajaingresoConstantesFunciones.cargarid_cajaCajaIngreso)
					 || (this.esRecargarFks && this.cajaingresoConstantesFunciones.cargarid_cajaCajaIngreso)) {

					if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

						finalQueryGlobalCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalCaja, "");
						finalQueryGlobalCaja+=CajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCaja=" WHERE " + ConstantesSql.ID + "="+cajaingresoSessionBean.getlidCajaActual();
					}
				} else {
					finalQueryGlobalCaja="NONE";
				}


				String finalQueryGlobalTurnoPunVen="";

				if(((this.turnopunvensForeignKey==null||this.turnopunvensForeignKey.size()<=0) && this.cajaingresoConstantesFunciones.cargarid_turno_pun_venCajaIngreso)
					 || (this.esRecargarFks && this.cajaingresoConstantesFunciones.cargarid_turno_pun_venCajaIngreso)) {

					if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TurnoPunVenConstantesFunciones.getArrayColumnasGlobalesTurnoPunVen(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTurnoPunVen=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TurnoPunVenConstantesFunciones.TABLENAME);

						finalQueryGlobalTurnoPunVen=Funciones.GetFinalQueryAppend(finalQueryGlobalTurnoPunVen, "");
						finalQueryGlobalTurnoPunVen+=TurnoPunVenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTurnoPunVensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTurnoPunVen=" WHERE " + ConstantesSql.ID + "="+cajaingresoSessionBean.getlidTurnoPunVenActual();
					}
				} else {
					finalQueryGlobalTurnoPunVen="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cajaingresoReturnGeneral=cajaingresoLogic.cargarCombosLoteForeignKeyCajaIngreso(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalCaja,finalQueryGlobalTurnoPunVen);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cajaingresoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cajaingresoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=cajaingresoReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalCaja.equals("NONE")) {
				this.cajasForeignKey=cajaingresoReturnGeneral.getcajasForeignKey();
			}

			if(!finalQueryGlobalTurnoPunVen.equals("NONE")) {
				this.turnopunvensForeignKey=cajaingresoReturnGeneral.getturnopunvensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCajaIngreso()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyCaja();
			this.addItemDefectoCombosForeignKeyTurnoPunVen();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cajaingresoSessionBean==null) {
				this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				Caja caja=new Caja();
				CajaConstantesFunciones.setCajaDescripcion(caja,Constantes.SMENSAJE_ESCOJA_OPCION);
				caja.setId(null);

				if(!CajaConstantesFunciones.ExisteEnLista(this.cajasForeignKey,caja,true)) {

					this.cajasForeignKey.add(0,caja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTurnoPunVen()throws Exception {
		try {

			if(!this.cajaingresoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {
				TurnoPunVen turnopunven=new TurnoPunVen();
				TurnoPunVenConstantesFunciones.setTurnoPunVenDescripcion(turnopunven,Constantes.SMENSAJE_ESCOJA_OPCION);
				turnopunven.setId(null);

				if(!TurnoPunVenConstantesFunciones.ExisteEnLista(this.turnopunvensForeignKey,turnopunven,true)) {

					this.turnopunvensForeignKey.add(0,turnopunven);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCajaIngreso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajaIngreso(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajaIngreso()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.cajaingreso.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaIngreso();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajaIngreso(CajaIngreso cajaingreso)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(cajaingreso.getid_caja(),false,"Formulario");
			this.setActualTurnoPunVenForeignKey(cajaingreso.getid_turno_pun_ven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajaIngreso(CajaIngreso cajaingreso,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajaIngreso()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.cajaingresoConstantesFunciones.getid_caja(),false,"Formulario");
			this.setActualTurnoPunVenForeignKey(this.cajaingresoConstantesFunciones.getid_turno_pun_ven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajaIngreso()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajaIngreso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajaIngreso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajaIngreso()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajaIngreso()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");
			this.cargarCombosFrameTurnoPunVensForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCajaIngreso(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTurnoPunVensForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCajaIngreso()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CajaIngresoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajaIngresoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajaIngresoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajaingresoSessionBean=new CajaIngresoSessionBean(); 
		this.cajaingresoConstantesFunciones=new CajaIngresoConstantesFunciones(); 
		this.cajaingresoBean=new CajaIngreso();//(this.cajaingresoConstantesFunciones); 		
		this.cajaingresoReturnGeneral=new CajaIngresoParameterReturnGeneral(); 
		
		this.cajaingresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaingresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajaIngresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajaIngresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajaIngresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajaIngreso(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.cajaingresoConstantesFunciones=new CajaIngresoConstantesFunciones(); 
			this.cajaingresoBean=new CajaIngreso();//this.cajaingresoConstantesFunciones); 			
			this.cajaingresoReturnGeneral=new CajaIngresoParameterReturnGeneral(); 
		
			CajaIngresoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Ingreso Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cajaingreso=new CajaIngreso();
			this.cajaingresos = new ArrayList<CajaIngreso>();
			this.cajaingresosAux = new ArrayList<CajaIngreso>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic=new CajaIngresoLogic();
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}
			
			//this.cajaingresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajaingresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajaIngreso);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaIngreso);	
					}
					
					if(this.jInternalFrameImportacionCajaIngreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaIngreso);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajaIngreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajaIngreso);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaIngreso);
				this.jInternalFrameDetalleFormCajaIngreso.setVisible(false);
				this.jInternalFrameDetalleFormCajaIngreso.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaIngreso);
					this.jInternalFrameReporteDinamicoCajaIngreso.setVisible(false);
					this.jInternalFrameReporteDinamicoCajaIngreso.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajaIngreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajaIngreso);
					this.jInternalFrameImportacionCajaIngreso.setVisible(false);
					this.jInternalFrameImportacionCajaIngreso.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajaIngreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajaIngreso);
					this.jInternalFrameOrderByCajaIngreso.setVisible(false);
					this.jInternalFrameOrderByCajaIngreso.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajaIngresoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajaIngresoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.cajaingresoReturnGeneral=new CajaIngresoParameterReturnGeneral();
			
			this.cajaingresoParameterGeneral=new CajaIngresoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajaingresoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(CajaIngresoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CajaIngresoDetalleConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaIngresoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajaingresoSessionBean.getEsGuardarRelacionado(),this.cajaingresoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaIngresoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajaingresoSessionBean.getEsGuardarRelacionado(),this.cajaingresoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoCajaIngreso=false;
			this.isVisibilidadCeldaDuplicarCajaIngreso=true;
			this.isVisibilidadCeldaCopiarCajaIngreso=true;
			this.isVisibilidadCeldaVerFormCajaIngreso=true;
			this.isVisibilidadCeldaOrdenCajaIngreso=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
			this.isVisibilidadCeldaModificarCajaIngreso=false;
			this.isVisibilidadCeldaActualizarCajaIngreso=false;
			this.isVisibilidadCeldaEliminarCajaIngreso=false;
			this.isVisibilidadCeldaCancelarCajaIngreso=false;
			this.isVisibilidadCeldaGuardarCajaIngreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=false;
			
			
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTurnoPunVen=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajaIngreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajaIngreso();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajaIngreso(false);
			
			this.setPermisosUsuarioCajaIngreso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaingresoSessionBean.getEsGuardarRelacionado() 
				|| (this.cajaingresoSessionBean.getEsGuardarRelacionado() && this.cajaingresoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajaIngresoClasesRelacionadas();
			}
			
			if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajaIngresoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajaIngreso();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajaIngreso();
			}
			
			if(!this.isPermisoBusquedaCajaIngreso) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCajaIngreso,this.isPermisoPaginacionMedioCajaIngreso,this.isPermisoPaginacionTodoCajaIngreso);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajaIngresoConstantesFunciones.getTiposSeleccionarCajaIngreso());
				
				this.tiposColumnasSelect=CajaIngresoConstantesFunciones.getTiposSeleccionarCajaIngreso(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCajaIngreso();				
				//this.tiposRelacionesSelect=CajaIngresoConstantesFunciones.getTiposRelacionesCajaIngreso(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajaIngreso();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCajaIngreso(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCajaIngreso(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaIngreso() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.cajaingresodetalleLogic=new CajaIngresoDetalleLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.usuarioLogic=new UsuarioLogic();
			this.cajaLogic=new CajaLogic();
			this.turnopunvenLogic=new TurnoPunVenLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cajaingresoImplementable= (CajaIngresoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaIngresoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajaingresoImplementableHome= (CajaIngresoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaIngresoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajaingresos= new ArrayList<CajaIngreso>();
			this.cajaingresosEliminados= new ArrayList<CajaIngreso>();
						
			this.isEsNuevoCajaIngreso=false;
			this.esParaAccionDesdeFormularioCajaIngreso=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			this.turnopunvensForeignKey=new ArrayList<TurnoPunVen>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCajaIngreso(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajaIngreso();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajaIngresoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajaIngresoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajaIngreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajaIngreso(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajaIngreso();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajaIngreso();
			}
			
			CajaIngresoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajaIngreso.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajaIngreso.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajaIngreso.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajaIngreso(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CajaIngreso: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajaIngreso() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajaIngreso")) {
				iIndex=this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();	
				
				

				if(sTitle.equals("Caja Ingreso Detalles")) {
					if(!CajaIngresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCajaIngreso();

						this.cargarParteTabPanelRelacionadaCajaIngresoDetalle(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajaIngreso();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCajaIngresoDetalle(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCajaIngreso.cargarSessionConBeanSwingJInternalFrameCajaIngresoDetalle(false,true,iIndex);
		this.jButtonCajaIngresoDetalleActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCajaIngresoDetalle();

		//this.jTabbedPaneRelacionesCajaIngreso.updateUI();
		//this.jTabbedPaneRelacionesCajaIngreso.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCajaIngreso.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CajaIngresoDetalle")) {
				int row=this.jTableDatosCajaIngreso.getSelectedRow();
				jButtonCajaIngresoDetalleActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Caja Ingreso Detalle")) {

					if(this.isTienePermisosCajaIngresoDetalle && this.cajaingresoConstantesFunciones.mostrarCajaIngresoDetalleCajaIngreso && !CajaIngresoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Caja Ingreso Detalles"+"("+CajaIngresoDetalleConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Caja Ingreso Detalles");

						if(cajaingresoConstantesFunciones.resaltarCajaIngresoDetalleCajaIngreso!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cajaingresoConstantesFunciones.resaltarCajaIngresoDetalleCajaIngreso);
						}

						jmenuItem.setEnabled(this.cajaingresoConstantesFunciones.activarCajaIngresoDetalleCajaIngreso);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CajaIngresoDetalle"));

						

						this.jInternalFrameDetalleFormCajaIngreso.jmenuDetalleCajaIngreso.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCajaIngreso(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajaIngreso(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajaIngreso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajaIngresoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajaIngreso();
		
		this.cargarCombosFrameForeignKeyCajaIngreso();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajaIngreso();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajaIngreso();
		}
	}
	
	

	public void cargarCombosForeignKeyCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCaja(this.cajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTurnoPunVen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTurnoPunVenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTurnoPunVen();
				this.cargarCombosFrameTurnoPunVensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTurnoPunVen(this.turnopunvensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCajaIngresoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			
			if(jTableDatosCajaIngreso.getRowCount()>=1) {
				jTableDatosCajaIngreso.removeRowSelectionInterval(0, jTableDatosCajaIngreso.getRowCount()-1);						
			}
			
			this.isEsNuevoCajaIngreso=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajaIngreso(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajaIngreso(true);			
			//this.cajaingreso=new CajaIngreso();
			//this.cajaingreso.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaIngreso(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaIngreso() ;
			
			if(CajaIngresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaIngreso(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajaingreso);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);				
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CajaIngreso: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajaIngresoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajaIngreso.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajaIngreso.getSelectedRows().length;			
			}
			
			cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajaIngreso--;			
				//CajaIngreso cajaingresoAux= new CajaIngreso();			
				//cajaingresoAux.setId(this.iIdNuevoCajaIngreso);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CajaIngreso cajaingresoOrigen=new CajaIngreso();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CajaIngreso cajaingresoOrigen : cajaingresosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajaingresoOrigen =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresoOrigen =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajaIngreso();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajaingreso.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajaIngreso(cajaingresoOrigen,this.cajaingreso,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajaingresoLogic.getCajaIngresos().add(this.cajaingresoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajaingresos.add(this.cajaingresoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajaIngreso(false);
				
				this.jTableDatosCajaIngreso.setRowSelectionInterval(this.getIndiceNuevoCajaIngreso(), this.getIndiceNuevoCajaIngreso());
				
				int iLastRow =  this.jTableDatosCajaIngreso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaIngreso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaIngreso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaIngreso(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();									
		
			CajaIngreso cajaingresoOrigen=new CajaIngreso();
			CajaIngreso cajaingresoDestino=new CajaIngreso();
				
			cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajaIngreso.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajaingresosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajaIngreso.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoOrigen =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajaingresoOrigen =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresoDestino =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajaingresoDestino =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajaingresoOrigen =cajaingresosSeleccionados.get(0);
				cajaingresoDestino =cajaingresosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajaIngreso(cajaingresoOrigen,cajaingresoDestino,true,false);
				
				cajaingresoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajaingresoDestino,cajaingresoLogic.getCajaIngresos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaingresoDestino,cajaingresos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajaIngreso(false);
				
				//this.jTableDatosCajaIngreso.setRowSelectionInterval(this.getIndiceNuevoCajaIngreso(), this.getIndiceNuevoCajaIngreso());
				
				int iLastRow =  this.jTableDatosCajaIngreso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaIngreso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaIngreso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaIngreso(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajaIngreso.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajaIngreso.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajaIngreso.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajaIngreso.setVisible(!isVisible);
			this.jPanelPaginacionCajaIngreso.setVisible(!isVisible);
			this.jPanelAccionesCajaIngreso.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajaIngreso();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajaIngreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajaIngreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajaIngreso();
			
			this.abrirFrameOrderByCajaIngreso();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajaIngreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajaIngreso(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaIngreso);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajaIngreso.isMaximum()) {
					this.jInternalFrameDetalleFormCajaIngreso.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajaIngreso.setSize(this.jInternalFrameDetalleFormCajaIngreso.iWidthFormulario,this.jInternalFrameDetalleFormCajaIngreso.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajaIngreso.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajaIngreso.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajaIngreso.isMaximum()) {
						this.jInternalFrameDetalleFormCajaIngreso.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajaIngreso.jContentPaneDetalleCajaIngreso.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajaIngreso.jContentPaneDetalleCajaIngreso.getWidth(),CajaIngresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajaIngreso.jContentPaneDetalleCajaIngreso.getWidth(),CajaIngresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajaIngreso.jContentPaneDetalleCajaIngreso.getWidth(),CajaIngresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CajaIngresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCajaIngresoDetalle();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajaIngreso.setVisible(true);
	        this.jInternalFrameDetalleFormCajaIngreso.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajaIngreso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajaIngreso==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajaIngreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaIngreso,false,this);
				} else {
					this.jInternalFrameOrderByCajaIngreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaIngreso,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajaIngreso);
				this.jInternalFrameOrderByCajaIngreso.setVisible(false);
				this.jInternalFrameOrderByCajaIngreso.setSelected(false);
				
				this.jInternalFrameOrderByCajaIngreso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaIngreso"));
				
				this.inicializarActualizarBindingTablaOrderByCajaIngreso();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajaIngreso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajaIngreso==null) {
				
				this.jInternalFrameImportacionCajaIngreso=new ImportacionJInternalFrame(CajaIngresoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaIngreso);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajaIngreso);
				this.jInternalFrameImportacionCajaIngreso.setVisible(false);
				this.jInternalFrameImportacionCajaIngreso.setSelected(false);


				this.jInternalFrameImportacionCajaIngreso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaIngreso"));
				this.jInternalFrameImportacionCajaIngreso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaIngreso"));
				this.jInternalFrameImportacionCajaIngreso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaIngreso"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajaIngreso() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajaIngreso==null) {
				this.jInternalFrameReporteDinamicoCajaIngreso=new ReporteDinamicoJInternalFrame(CajaIngresoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaIngreso);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaIngreso);
				this.jInternalFrameReporteDinamicoCajaIngreso.setVisible(false);
				this.jInternalFrameReporteDinamicoCajaIngreso.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajaIngreso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaIngreso"));
				this.jInternalFrameReporteDinamicoCajaIngreso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaIngreso"));
				this.jInternalFrameReporteDinamicoCajaIngreso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaIngreso"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaIngreso();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCajaIngresoDetalle() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaIngresoDetalle.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCajaIngreso.jContentPaneDetalleCajaIngreso.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaIngresoDetalle.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaIngresoDetalle.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaIngresoDetalle.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCajaIngreso() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaIngreso);
			
	       	this.jInternalFrameDetalleFormCajaIngreso.setVisible(false);
	        this.jInternalFrameDetalleFormCajaIngreso.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajaIngreso.dispose();
			//this.jInternalFrameDetalleFormCajaIngreso=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajaIngreso() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajaIngreso.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajaIngreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajaIngreso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajaIngreso.setVisible(true);
	        this.jInternalFrameImportacionCajaIngreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajaIngreso() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajaIngreso.setVisible(true);
	        this.jInternalFrameOrderByCajaIngreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajaIngreso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajaIngreso.setVisible(false);
	        this.jInternalFrameOrderByCajaIngreso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajaIngreso() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajaIngreso.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajaIngreso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajaIngreso() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajaIngreso.setVisible(false);
	        this.jInternalFrameImportacionCajaIngreso.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajaIngreso(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajaIngreso(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajaIngreso(true);
			//this.isEsNuevoCajaIngreso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajaIngreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaIngreso(false) ;
			
			if(cajaingresoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.getEsGuardarRelacionado() && CajaIngresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajaIngresoDetalleActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CajaIngresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaIngreso(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaIngreso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajaIngresoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajaIngreso(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajaIngreso(true);
			//this.isEsNuevoCajaIngreso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajaingreso.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajaIngreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajaIngreso(false) ;
			
			if(CajaIngresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaIngreso(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaIngreso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaIngreso.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTurnoPunVen(List<TurnoPunVen> turnopunvensForeignKey)throws Exception{
		TableColumn tableColumnTurnoPunVen=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN));
		TableCellEditor tableCellEditorTurnoPunVen =tableColumnTurnoPunVen.getCellEditor();

		TurnoPunVenTableCell turnopunvenTableCellFk=(TurnoPunVenTableCell)tableCellEditorTurnoPunVen;

		if(turnopunvenTableCellFk!=null) {
			turnopunvenTableCellFk.setturnopunvensForeignKey(turnopunvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaIngreso.getSelectedRow();

		//if(intSelectedRow<=0) {
			//turnopunvenTableCellFk.setRowActual(intSelectedRow);
			//turnopunvenTableCellFk.setturnopunvensForeignKeyActual(turnopunvensForeignKey);
		//}


		if(turnopunvenTableCellFk!=null) {
			turnopunvenTableCellFk.RecargarTurnoPunVensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajaIngreso(false);
			
			//if(!this.isEsNuevoCajaIngreso) {								
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				
			}
			
			if(this.permiteMantenimiento(this.cajaingreso)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajaIngreso=true;
					this.inicializarActualizarBindingTablaCajaIngreso(false);
					this.isEsNuevoCajaIngreso=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajaIngreso=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajaIngreso=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaIngreso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaIngreso(false);
				
				this.habilitarDeshabilitarControlesCajaIngreso(false);
			
												
				
				if(CajaIngresoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajaIngreso();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajaIngresoActionPerformed(evt,cajaingresoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajaIngreso(this.cajaingreso,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajaIngreso.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajaingresoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajaingreso.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajaIngresoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				this.cajaingreso.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				this.cajaingreso.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajaingreso)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajaIngresoModel) this.jTableDatosCajaIngreso.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajaIngreso=true;
				this.inicializarActualizarBindingTablaCajaIngreso(false);
				this.isEsNuevoCajaIngreso=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaIngreso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaIngreso(false);
				
				this.habilitarDeshabilitarControlesCajaIngreso(false);
				
				
				
				if(CajaIngresoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajaIngreso();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajaIngresoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajaIngreso.getRowCount()>=1) {
				jTableDatosCajaIngreso.removeRowSelectionInterval(0, jTableDatosCajaIngreso.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajaIngreso(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajaIngreso(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaIngreso(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaIngreso(false) ;
			
			this.isEsNuevoCajaIngreso=false;
			
			if(CajaIngresoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajaIngreso();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajaIngresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajaIngreso(false);
				
				//SI ES MANUAL
				if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajaIngreso();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajaIngresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajaIngreso--;			
			//CajaIngreso cajaingresoAux= new CajaIngreso();			
			//cajaingresoAux.setId(this.iIdNuevoCajaIngreso);
			
			if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajaIngreso();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
			
			this.cajaingreso.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajaingresoLogic.getCajaIngresos().add(this.cajaingresoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajaingresos.add(this.cajaingresoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajaIngreso(false);
			
			this.jTableDatosCajaIngreso.setRowSelectionInterval(this.getIndiceNuevoCajaIngreso(), this.getIndiceNuevoCajaIngreso());
			
			int iLastRow =  this.jTableDatosCajaIngreso.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajaIngreso.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajaIngreso.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajaIngreso(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajaIngresoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajaIngreso(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaIngreso(false);
			
			//SI ES MANUAL
			if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaIngreso();
			}
			
			//this.abrirFrameTreeCajaIngreso();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajaIngresoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Caja IngresoS ?", "MANTENIMIENTO DE Caja Ingreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCajaIngreso.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCajaIngreso();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cajaingresoReturnGeneral=cajaingresoLogic.procesarImportacionCajaIngresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cajaingresoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCajaIngresoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajaIngresoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajaIngreso.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajaIngreso.setFileImportacion(this.jInternalFrameImportacionCajaIngreso.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajaIngreso.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajaIngreso.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajaIngreso.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajaIngreso.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajaIngresoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		

		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajaIngresoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajaIngresoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteCajaIngresos("Todos",cajaingresosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaIngresoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TurnoPunVen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TurnoPunVen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TurnoPunVen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TurnoPunVen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoConstantesFunciones.LABEL_HORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoCajaIngreso.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajaIngresoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					sNombreCampoCategoria="id_turno_pun_ven";
					break;

				case CajaIngresoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case CajaIngresoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case CajaIngresoConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoria="hora";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajaIngresoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					sNombreCampoCategoriaValor="id_turno_pun_ven";
					break;

				case CajaIngresoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case CajaIngresoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case CajaIngresoConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoriaValor="hora";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaIngresoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Turno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_turno_pun_ven");
					break;

				case CajaIngresoConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case CajaIngresoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case CajaIngresoConstantesFunciones.LABEL_HORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoCajaIngresoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingreso";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("CajaIngresos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajaIngresoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CajaIngreso cajaingreso:cajaingresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingreso.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CajaIngreso cajaingreso:cajaingresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingreso.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(CajaIngreso cajaingreso:cajaingresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingreso.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(CajaIngreso cajaingreso:cajaingresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingreso.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN);
					iRow++;

					for(CajaIngreso cajaingreso:cajaingresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingreso.getturnopunven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(CajaIngreso cajaingreso:cajaingresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingreso.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(CajaIngreso cajaingreso:cajaingresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingreso.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoConstantesFunciones.LABEL_HORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_HORA);
					iRow++;

					for(CajaIngreso cajaingreso:cajaingresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingreso.gethora());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelCajaIngreso(row);				
			//	iRow++;
			//}				
			
			//for(CajaIngreso cajaingresoAux:cajaingresosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajaIngreso(cajaingresoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaIngreso(false);
			
			//SI ES MANUAL
			if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaIngreso();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajaIngresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaIngreso(false);
			
			//SI ES MANUAL
			if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaIngreso();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajaIngresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaIngreso(false);
			
			//SI ES MANUAL
			if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaIngreso();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajaIngreso() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajaIngreso.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajaIngreso.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajaIngreso.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajaIngreso.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajaIngreso.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajaIngreso.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajaIngreso.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajaIngreso(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajaIngreso(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajaIngreso(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajaIngreso(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajaIngreso(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajaIngreso(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaIngreso(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajaIngreso(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajaIngreso() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajaIngreso();
		
		this.inicializarActualizarBindingBotonesManualCajaIngreso(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajaIngreso();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaIngreso() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajaIngreso(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajaIngreso(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajaIngreso.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajaIngreso.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajaIngreso.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajaIngreso.jCheckBoxPostAccionNuevoCajaIngreso.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajaIngreso.jCheckBoxPostAccionSinCerrarCajaIngreso.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajaIngreso.jCheckBoxPostAccionSinMensajeCajaIngreso.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajaIngreso.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajaIngreso.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajaIngreso.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
				this.jInternalFrameDetalleFormCajaIngreso.jCheckBoxPostAccionNuevoCajaIngreso.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajaIngreso.jCheckBoxPostAccionSinCerrarCajaIngreso.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajaIngreso.jCheckBoxPostAccionSinMensajeCajaIngreso.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajaIngreso.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajaIngreso.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajaIngreso.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajaIngreso.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajaIngreso.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajaIngreso.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajaIngreso.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajaIngreso.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajaIngreso.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajaIngreso(Boolean esInicializar) throws Exception {
		try	{	
			if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajaIngreso(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajaIngreso() throws Exception {
		try	{
			if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaIngreso();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaIngreso() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaIngreso() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajaIngreso.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajaIngreso.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajaIngreso.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajaIngreso.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajaIngreso.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajaIngreso.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajaIngreso.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajaIngreso.addItem(reporte);
			}
			
			
			if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajaIngreso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajaIngreso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajaIngreso.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajaIngreso.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajaIngreso.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajaIngreso.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajaIngreso.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajaIngreso.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajaIngreso.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaIngreso();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaIngreso() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
				this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
				this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaIngreso.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaIngreso.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajaIngreso.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaIngreso.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaIngreso.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajaIngreso()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cajaFK_IdCajaCajaIngreso.getSelectedItem()!=null){this.id_cajaFK_IdCaja=((Caja)this.jComboBoxid_cajaFK_IdCajaCajaIngreso.getSelectedItem()).getId();}
		if(this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.getSelectedItem()!=null){this.id_turno_pun_venFK_IdTurnoPunVen=((TurnoPunVen)this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaIngreso.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajaIngreso(Boolean esInicializar) throws Exception {				
		if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajaIngreso();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajaIngreso() throws Exception {
		this.inicializarActualizarBindingTablaCajaIngreso(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajaIngreso() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajaIngresoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajaIngreso(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajaingresoLogic.getCajaIngresos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajaingresos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajaIngreso.setModel(new CajaIngresoModel(this.cajaingresoLogic.getCajaIngresos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajaIngreso.setModel(new CajaIngresoModel(this.cajaingresos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajaIngreso!=null && this.jInternalFrameOrderByCajaIngreso.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajaIngreso();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO,cajaingresoConstantesFunciones.resaltarSeleccionarCajaIngreso,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO,cajaingresoConstantesFunciones.resaltarSeleccionarCajaIngreso,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_ID));

		if(this.cajaingresoConstantesFunciones.mostraridCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajaingresoConstantesFunciones.resaltaridCajaIngreso,this.cajaingresoConstantesFunciones.activaridCajaIngreso,this,true,"idCajaIngreso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaingresoConstantesFunciones.resaltaridCajaIngreso,this.cajaingresoConstantesFunciones.activaridCajaIngreso,this,true,"idCajaIngreso","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cajaingresoConstantesFunciones.mostrarid_empresaCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cajaingresoConstantesFunciones.resaltarid_empresaCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_empresaCajaIngreso));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cajaingresoConstantesFunciones.resaltarid_empresaCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_empresaCajaIngreso,false,"id_empresaCajaIngreso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cajaingresoConstantesFunciones.mostrarid_sucursalCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cajaingresoConstantesFunciones.resaltarid_sucursalCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_sucursalCajaIngreso));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cajaingresoConstantesFunciones.resaltarid_sucursalCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_sucursalCajaIngreso,false,"id_sucursalCajaIngreso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_IDUSUARIO));

		if(this.cajaingresoConstantesFunciones.mostrarid_usuarioCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.cajaingresoConstantesFunciones.resaltarid_usuarioCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_usuarioCajaIngreso));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.cajaingresoConstantesFunciones.resaltarid_usuarioCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_usuarioCajaIngreso,false,"id_usuarioCajaIngreso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_IDCAJA));

		if(this.cajaingresoConstantesFunciones.mostrarid_cajaCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_IDCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CajaTableCell(this.cajasForeignKey,this.cajaingresoConstantesFunciones.resaltarid_cajaCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_cajaCajaIngreso));
			tableColumn.setCellEditor(new CajaTableCell(this.cajasForeignKey,this.cajaingresoConstantesFunciones.resaltarid_cajaCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_cajaCajaIngreso,true,"id_cajaCajaIngreso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN));

		if(this.cajaingresoConstantesFunciones.mostrarid_turno_pun_venCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TurnoPunVenTableCell(this.turnopunvensForeignKey,this.cajaingresoConstantesFunciones.resaltarid_turno_pun_venCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_turno_pun_venCajaIngreso));
			tableColumn.setCellEditor(new TurnoPunVenTableCell(this.turnopunvensForeignKey,this.cajaingresoConstantesFunciones.resaltarid_turno_pun_venCajaIngreso,this,this.cajaingresoConstantesFunciones.activarid_turno_pun_venCajaIngreso,true,"id_turno_pun_venCajaIngreso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_SECUENCIAL));

		if(this.cajaingresoConstantesFunciones.mostrarsecuencialCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajaingresoConstantesFunciones.resaltarsecuencialCajaIngreso,this.cajaingresoConstantesFunciones.activarsecuencialCajaIngreso,this,true,"secuencialCajaIngreso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaingresoConstantesFunciones.resaltarsecuencialCajaIngreso,this.cajaingresoConstantesFunciones.activarsecuencialCajaIngreso,this,true,"secuencialCajaIngreso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_FECHA));

		if(this.cajaingresoConstantesFunciones.mostrarfechaCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cajaingresoConstantesFunciones.resaltarfechaCajaIngreso,this.cajaingresoConstantesFunciones.activarfechaCajaIngreso,this,true,"fechaCajaIngreso","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cajaingresoConstantesFunciones.resaltarfechaCajaIngreso,this.cajaingresoConstantesFunciones.activarfechaCajaIngreso,this,true,"fechaCajaIngreso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,CajaIngresoConstantesFunciones.LABEL_HORA));

		if(this.cajaingresoConstantesFunciones.mostrarhoraCajaIngreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoConstantesFunciones.LABEL_HORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cajaingresoConstantesFunciones.resaltarhoraCajaIngreso,this.cajaingresoConstantesFunciones.activarhoraCajaIngreso,this,true,"horaCajaIngreso","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cajaingresoConstantesFunciones.resaltarhoraCajaIngreso,this.cajaingresoConstantesFunciones.activarhoraCajaIngreso,this,true,"horaCajaIngreso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajaIngresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCajaIngresoDetalle && this.cajaingresoConstantesFunciones.mostrarCajaIngresoDetalleCajaIngreso && !CajaIngresoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Caja Ingreso Detalles");
				tableColumn.setHeaderValue("Caja Ingreso Detalles");
				tableColumn.setCellRenderer(new CajaIngresoDetalleTableCell(cajaingresoConstantesFunciones.resaltarCajaIngresoDetalleCajaIngreso,this,this.cajaingresoConstantesFunciones.activarCajaIngresoDetalleCajaIngreso));
				tableColumn.setCellEditor(new CajaIngresoDetalleTableCell(cajaingresoConstantesFunciones.resaltarCajaIngresoDetalleCajaIngreso,this,this.cajaingresoConstantesFunciones.activarCajaIngresoDetalleCajaIngreso));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCajaIngreso.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajaingresoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajaingresoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaIngreso.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajaingresoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajaingresoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaIngreso.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajaingresoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajaingresoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajaIngreso.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.cajaingresoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosCajaIngreso.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosCajaIngreso.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cajaingresoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajaIngreso.moveColumn(this.jTableDatosCajaIngreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajaIngreso.moveColumn(this.jTableDatosCajaIngreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cajaingresoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCajaIngreso.moveColumn(this.jTableDatosCajaIngreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajaIngreso.moveColumn(this.jTableDatosCajaIngreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajaIngreso.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajaIngreso.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajaIngreso,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajaIngreso.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajaIngreso.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajaIngreso.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajaIngreso.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajaIngreso.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=cajaingresoLogic.getCajaIngresos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajaingresos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosCajaIngreso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajaIngreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajaIngreso();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoCajaIngreso=false;
					
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
				if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajaIngreso==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaIngreso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaIngreso.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajaingreso.getsType().equals("DUPLICADO")
				   || this.cajaingreso.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajaIngreso=true;
				
				} else {
					this.isEsNuevoCajaIngreso=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
					if(this.cajaingreso.getId()>=0 && !this.cajaingreso.getIsNew()) {						
						this.isEsNuevoCajaIngreso=false;
						
					} else {
						this.isEsNuevoCajaIngreso=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajaIngreso(esRelaciones);						
				
				this.seleccionarCajaIngreso(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajaingreso.getId()<0) {
					this.isEsNuevoCajaIngreso=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajaIngreso(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajaIngreso(evt,rowIndex);
				}	
				
				if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CajaIngreso: " + this.dDif); 
					}
				}								
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajaIngreso(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajaingreso)) {
					if(this.cajaingreso.getId()>0) {
						this.cajaingreso.setIsDeleted(true);
						
						this.cajaingresosEliminados.add(this.cajaingreso);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajaingresoLogic.getCajaIngresos().remove(this.cajaingreso);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajaingresos.remove(this.cajaingreso);				
					}
					
					
					((CajaIngresoModel) this.jTableDatosCajaIngreso.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaIngreso(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajaIngreso(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajaIngreso) {
			
			if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaIngreso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaIngreso.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajaIngreso(this.cajaingreso);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cajaingresoConstantesFunciones.cargarid_empresaCajaIngreso || this.cajaingresoConstantesFunciones.event_dependid_empresaCajaIngreso) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cajaingreso.getid_empresa());
									//this.inicializarActualizarBindingCajaIngreso(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cajaingreso.getEmpresa()!=null) {
							this.empresasForeignKey.add(cajaingreso.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cajaingreso.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cajaingresoConstantesFunciones.cargarid_sucursalCajaIngreso || this.cajaingresoConstantesFunciones.event_dependid_sucursalCajaIngreso) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cajaingreso.getid_sucursal());
									//this.inicializarActualizarBindingCajaIngreso(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cajaingreso.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cajaingreso.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cajaingreso.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.cajaingresoConstantesFunciones.cargarid_usuarioCajaIngreso || this.cajaingresoConstantesFunciones.event_dependid_usuarioCajaIngreso) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.cajaingreso.getid_usuario());
									//this.inicializarActualizarBindingCajaIngreso(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(cajaingreso.getUsuario()!=null) {
							this.usuariosForeignKey.add(cajaingreso.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.cajaingreso.getid_usuario(),false,"Formulario");

					//Caja
					if(!this.cajaingresoConstantesFunciones.cargarid_cajaCajaIngreso || this.cajaingresoConstantesFunciones.event_dependid_cajaCajaIngreso) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.cajaingreso.getid_caja());
									//this.inicializarActualizarBindingCajaIngreso(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(cajaingreso.getCaja()!=null) {
							this.cajasForeignKey.add(cajaingreso.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.cajaingreso.getid_caja(),false,"Formulario");

					//TurnoPunVen
					if(!this.cajaingresoConstantesFunciones.cargarid_turno_pun_venCajaIngreso || this.cajaingresoConstantesFunciones.event_dependid_turno_pun_venCajaIngreso) {
						//this.cargarCombosTurnoPunVensForeignKeyLista(" where id="+this.cajaingreso.getid_turno_pun_ven());
									//this.inicializarActualizarBindingCajaIngreso(false,false);
						this.turnopunvensForeignKey=new ArrayList<TurnoPunVen>();

						if(cajaingreso.getTurnoPunVen()!=null) {
							this.turnopunvensForeignKey.add(cajaingreso.getTurnoPunVen());
						}

						this.addItemDefectoCombosForeignKeyTurnoPunVen();
						this.cargarCombosFrameTurnoPunVensForeignKey("Todos");
					}
					this.setActualTurnoPunVenForeignKey(this.cajaingreso.getid_turno_pun_ven(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajaIngreso("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajaIngreso(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaIngreso() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaIngreso(CajaIngreso cajaingreso) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajaIngreso(cajaingreso,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaIngreso(CajaIngreso cajaingreso,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajaIngreso(cajaingreso);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajaIngreso(cajaingreso,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajaIngreso(cajaingreso);
	}
	
	public void setVariablesObjetoActualToFormularioCajaIngreso(CajaIngreso cajaingreso) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.setText(cajaingreso.getId().toString());
			this.jInternalFrameDetalleFormCajaIngreso.jTextFieldsecuencialCajaIngreso.setText(cajaingreso.getsecuencial());
			this.jInternalFrameDetalleFormCajaIngreso.jDateChooserfechaCajaIngreso.setDate(cajaingreso.getfecha());
			this.jInternalFrameDetalleFormCajaIngreso.jSpinnerhoraCajaIngreso.setValue(cajaingreso.gethora());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CajaIngreso cajaingresoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajaingresoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CajaIngreso cajaingresoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajaingresoLocal=this.cajaingreso;
			} else {
				cajaingresoLocal=this.cajaingresoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajaingresoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajaIngreso(cajaingresoLocal,true);
					
					if(cajaingresoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajaingresoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajaingresoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajaIngreso(CajaIngreso cajaingreso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaIngreso(cajaingreso,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(cajaingreso);
	}
	
	public void setVariablesFormularioToObjetoActualCajaIngreso(CajaIngreso cajaingreso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaIngreso(cajaingreso,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajaIngreso(CajaIngreso cajaingreso,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.getText()==null || this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.getText()=="" || this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.getText()=="Id") {
				this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.setText("0");
			}

			if(conColumnasBase) {cajaingreso.setId(Long.parseLong(this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaIngresoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelIdCajaIngreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaingreso.setsecuencial(this.jInternalFrameDetalleFormCajaIngreso.jTextFieldsecuencialCajaIngreso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaIngresoConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelsecuencialCajaIngreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaingreso.setfecha(this.jInternalFrameDetalleFormCajaIngreso.jDateChooserfechaCajaIngreso.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaIngresoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelfechaCajaIngreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaingreso.sethora(new Time(((Date)this.jInternalFrameDetalleFormCajaIngreso.jSpinnerhoraCajaIngreso.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaIngresoConstantesFunciones.LABEL_HORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngreso.jLabelhoraCajaIngreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaIngreso(CajaIngreso cajaingresoBean,CajaIngreso cajaingreso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cajaingresoBean.getid_caja()!=null && !cajaingresoBean.getid_caja().equals(-1L))) {cajaingreso.setid_caja(cajaingresoBean.getid_caja());}
			if(conDefault || (!conDefault && cajaingresoBean.getid_turno_pun_ven()!=null && !cajaingresoBean.getid_turno_pun_ven().equals(-1L))) {cajaingreso.setid_turno_pun_ven(cajaingresoBean.getid_turno_pun_ven());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajaIngreso(CajaIngreso cajaingresoOrigen,CajaIngreso cajaingreso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajaingresoOrigen.getId()!=null && !cajaingresoOrigen.getId().equals(0L))) {cajaingreso.setId(cajaingresoOrigen.getId());}}
			if(conDefault || (!conDefault && cajaingresoOrigen.getid_caja()!=null && !cajaingresoOrigen.getid_caja().equals(-1L))) {cajaingreso.setid_caja(cajaingresoOrigen.getid_caja());}
			if(conDefault || (!conDefault && cajaingresoOrigen.getid_turno_pun_ven()!=null && !cajaingresoOrigen.getid_turno_pun_ven().equals(-1L))) {cajaingreso.setid_turno_pun_ven(cajaingresoOrigen.getid_turno_pun_ven());}
			if(conDefault || (!conDefault && cajaingresoOrigen.getsecuencial()!=null && !cajaingresoOrigen.getsecuencial().equals(""))) {cajaingreso.setsecuencial(cajaingresoOrigen.getsecuencial());}
			if(conDefault || (!conDefault && cajaingresoOrigen.getfecha()!=null && !cajaingresoOrigen.getfecha().equals(new Date()))) {cajaingreso.setfecha(cajaingresoOrigen.getfecha());}
			if(conDefault || (!conDefault && cajaingresoOrigen.gethora()!=null && !cajaingresoOrigen.gethora().equals(new Time((new Date()).getTime())))) {cajaingreso.sethora(cajaingresoOrigen.gethora());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaIngreso(CajaIngreso cajaingreso) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.setText(cajaingreso.getId().toString());
			this.jInternalFrameDetalleFormCajaIngreso.jTextFieldsecuencialCajaIngreso.setText(cajaingreso.getsecuencial());
			this.jInternalFrameDetalleFormCajaIngreso.jDateChooserfechaCajaIngreso.setDate(cajaingreso.getfecha());
			this.jInternalFrameDetalleFormCajaIngreso.jSpinnerhoraCajaIngreso.setValue(cajaingreso.gethora());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaIngreso(CajaIngresoBean cajaingresoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.setText(cajaingresoBean.getId().toString());
			this.jInternalFrameDetalleFormCajaIngreso.jTextFieldsecuencialCajaIngreso.setText(cajaingresoBean.getsecuencial());
			this.jInternalFrameDetalleFormCajaIngreso.jDateChooserfechaCajaIngreso.setDate(cajaingresoBean.getfecha());
			this.jInternalFrameDetalleFormCajaIngreso.jSpinnerhoraCajaIngreso.setValue(cajaingresoBean.gethora());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajaIngreso(CajaIngresoParameterReturnGeneral cajaingresoReturnGeneral,CajaIngresoBean cajaingresoBean,Boolean conDefault) throws Exception { 
		try {
			CajaIngreso cajaingresoLocal=new CajaIngreso();
			
			cajaingresoLocal=cajaingresoReturnGeneral.getCajaIngreso();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajaingresoLocal.getId()!=null && !cajaingresoLocal.getId().equals(0L))) {cajaingresoBean.setId(cajaingresoLocal.getId());}}
			if(conDefault || (!conDefault && cajaingresoLocal.getid_caja()!=null && !cajaingresoLocal.getid_caja().equals(-1L))) {cajaingresoBean.setid_caja(cajaingresoLocal.getid_caja());}
			if(conDefault || (!conDefault && cajaingresoLocal.getid_turno_pun_ven()!=null && !cajaingresoLocal.getid_turno_pun_ven().equals(-1L))) {cajaingresoBean.setid_turno_pun_ven(cajaingresoLocal.getid_turno_pun_ven());}
			if(conDefault || (!conDefault && cajaingresoLocal.getsecuencial()!=null && !cajaingresoLocal.getsecuencial().equals(""))) {cajaingresoBean.setsecuencial(cajaingresoLocal.getsecuencial());}
			if(conDefault || (!conDefault && cajaingresoLocal.getfecha()!=null && !cajaingresoLocal.getfecha().equals(new Date()))) {cajaingresoBean.setfecha(cajaingresoLocal.getfecha());}
			if(conDefault || (!conDefault && cajaingresoLocal.gethora()!=null && !cajaingresoLocal.gethora().equals(new Time((new Date()).getTime())))) {cajaingresoBean.sethora(cajaingresoLocal.gethora());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajaIngresoGenerico(Long idCajaIngresoSeleccionado,JComboBox jComboBoxCajaIngreso,List<CajaIngreso> cajaingresosLocal)throws Exception {
		try {
			CajaIngreso  cajaingresoTemp=null;

			for(CajaIngreso cajaingresoAux:cajaingresosLocal) {
				if(cajaingresoAux.getId()!=null && cajaingresoAux.getId().equals(idCajaIngresoSeleccionado)) {
					cajaingresoTemp=cajaingresoAux;
					break;
				}
			}

			jComboBoxCajaIngreso.setSelectedItem(cajaingresoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajaIngresoGenerico(JComboBox jComboBoxCajaIngreso,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaIngreso.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajaIngreso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaIngreso.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajaIngreso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("CajaIngresoDetalle")) {
			jButtonCajaIngresoDetalleActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaingreso=(CajaIngreso) cajaingresoLogic.getCajaIngresos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajaingreso =(CajaIngreso) cajaingresos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajaingreso.getIsNew() && !cajaingreso.getIsChanged() && !cajaingreso.getIsDeleted()) {
				sDescripcion=cajaingreso.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingreso.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cajaingreso.getIsNew() && !cajaingreso.getIsChanged() && !cajaingreso.getIsDeleted()) {
				sDescripcion=cajaingreso.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingreso.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!cajaingreso.getIsNew() && !cajaingreso.getIsChanged() && !cajaingreso.getIsDeleted()) {
				sDescripcion=cajaingreso.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingreso.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!cajaingreso.getIsNew() && !cajaingreso.getIsChanged() && !cajaingreso.getIsDeleted()) {
				sDescripcion=cajaingreso.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingreso.getcaja_descripcion();
			}
		}

		if(sTipo.equals("TurnoPunVen")) {
			//sDescripcion=this.getActualTurnoPunVenForeignKeyDescripcion((Long)value);
			if(!cajaingreso.getIsNew() && !cajaingreso.getIsChanged() && !cajaingreso.getIsDeleted()) {
				sDescripcion=cajaingreso.getturnopunven_descripcion();
			} else {
				//sDescripcion=this.getActualTurnoPunVenForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingreso.getturnopunven_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CajaIngreso cajaingresoRow=new CajaIngreso();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaingresoRow=(CajaIngreso) cajaingresoLogic.getCajaIngresos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajaingresoRow=(CajaIngreso) cajaingresos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCajaIngresoDetalleActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CajaIngreso cajaingreso) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCajaIngreso==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso = (CajaIngreso)this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cajaingreso = (CajaIngreso)this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cajaingreso!=null) {
						this.cajaingreso = cajaingreso;
					} else {
						this.cajaingreso = new CajaIngreso();
					}
				}

				if(this.isTienePermisosCajaIngresoDetalle && this.permiteMantenimiento(this.cajaingreso)) {
					CajaIngresoDetalleBeanSwingJInternalFrame cajaingresodetalleBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFramePopup=new CajaIngresoDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cajaingresodetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFramePopup;
					} else {
						cajaingresodetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame;
					}

					List<CajaIngreso> cajaingresos=new ArrayList<CajaIngreso>();
					cajaingresos.add(this.cajaingreso);
					if(!esRelacionado) {
						//cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.setConGuardarRelaciones(false);
						//cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cajaingresodetalleBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCajaIngreso.cargarCajaIngresoDetalleBeanSwingJInternalFrame(cajaingresos,this.cajaingreso,cajaingresodetalleBeanSwingJInternalFrame,/*conInicializar,*/cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.getConGuardarRelaciones(),cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
					cajaingresodetalleBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cajaingresodetalleBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngresoDetalle("no_relacionado");

						cajaingresodetalleBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CajaIngresoDetalleConstantesFunciones.ITAMANIOFILATABLA + (CajaIngresoDetalleConstantesFunciones.ITAMANIOFILATABLA/2));

						cajaingresodetalleBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCajaIngreso=(TitledBorder)this.jScrollPanelDatosCajaIngreso.getBorder();
						TitledBorder titledBorderCajaIngresoDetalle=(TitledBorder)cajaingresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaIngresoDetalle.getBorder();

						titledBorderCajaIngresoDetalle.setTitle(titledBorderCajaIngreso.getTitle() + " -> Caja Ingreso Detalle");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cajaingresodetalleBeanSwingJInternalFrame);
						}

						cajaingresodetalleBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cajaingresodetalleBeanSwingJInternalFrame);

						cajaingresodetalleBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cajaingresoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Caja Ingreso Detalle",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajaIngreso(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoCajaIngreso && this.isPermisoNuevoCajaIngreso));			
			this.jButtonDuplicarCajaIngreso.setVisible((this.isVisibilidadCeldaDuplicarCajaIngreso && this.isPermisoDuplicarCajaIngreso));			
			this.jButtonCopiarCajaIngreso.setVisible((this.isVisibilidadCeldaCopiarCajaIngreso && this.isPermisoCopiarCajaIngreso));
			this.jButtonVerFormCajaIngreso.setVisible((this.isVisibilidadCeldaVerFormCajaIngreso && this.isPermisoVerFormCajaIngreso));
			
			this.jButtonAbrirOrderByCajaIngreso.setVisible((this.isVisibilidadCeldaOrdenCajaIngreso && this.isPermisoOrdenCajaIngreso));			
			
			this.jButtonNuevoRelacionesCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaIngreso && this.isPermisoNuevoCajaIngreso));			
			this.jButtonNuevoGuardarCambiosCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoCajaIngreso && this.isPermisoNuevoCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));
			
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarCajaIngreso.setVisible((this.isVisibilidadCeldaModificarCajaIngreso && this.isPermisoActualizarCajaIngreso));	
			this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarCajaIngreso.setVisible((this.isVisibilidadCeldaActualizarCajaIngreso && this.isPermisoActualizarCajaIngreso));	
			this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarCajaIngreso.setVisible((this.isVisibilidadCeldaEliminarCajaIngreso && this.isPermisoEliminarCajaIngreso));
			this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarCajaIngreso.setVisible(this.isVisibilidadCeldaCancelarCajaIngreso);							
			this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosCajaIngreso.setVisible((this.isVisibilidadCeldaGuardarCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajaIngreso.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoCajaIngreso && this.isPermisoNuevoCajaIngreso));						
			this.jButtonDuplicarToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaDuplicarCajaIngreso && this.isPermisoDuplicarCajaIngreso));						
			this.jButtonCopiarToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaCopiarCajaIngreso && this.isPermisoCopiarCajaIngreso));			
			this.jButtonVerFormToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaVerFormCajaIngreso && this.isPermisoVerFormCajaIngreso));			
			this.jButtonAbrirOrderByToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaOrdenCajaIngreso && this.isPermisoOrdenCajaIngreso));
			this.jButtonNuevoRelacionesToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaIngreso && this.isPermisoNuevoCajaIngreso));			
			this.jButtonNuevoGuardarCambiosToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoCajaIngreso && this.isPermisoNuevoCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));			
			
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaModificarCajaIngreso && this.isPermisoActualizarCajaIngreso));	
			this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaActualizarCajaIngreso  && this.isPermisoActualizarCajaIngreso));	
			this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaEliminarCajaIngreso && this.isPermisoEliminarCajaIngreso));
			this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarToolBarCajaIngreso.setVisible(this.isVisibilidadCeldaCancelarCajaIngreso);				
			this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaGuardarCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajaIngreso.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoCajaIngreso && this.isPermisoNuevoCajaIngreso));			
			this.jMenuItemDuplicarCajaIngreso.setVisible((this.isVisibilidadCeldaDuplicarCajaIngreso && this.isPermisoDuplicarCajaIngreso));			
			this.jMenuItemCopiarCajaIngreso.setVisible((this.isVisibilidadCeldaCopiarCajaIngreso && this.isPermisoCopiarCajaIngreso));			
			this.jMenuItemVerFormCajaIngreso.setVisible((this.isVisibilidadCeldaVerFormCajaIngreso && this.isPermisoVerFormCajaIngreso));			
			this.jMenuItemAbrirOrderByCajaIngreso.setVisible((this.isVisibilidadCeldaOrdenCajaIngreso && this.isPermisoOrdenCajaIngreso));			
			//this.jMenuItemMostrarOcultarCajaIngreso.setVisible((this.isVisibilidadCeldaOrdenCajaIngreso && this.isPermisoOrdenCajaIngreso));
			this.jMenuItemDetalleAbrirOrderByCajaIngreso.setVisible((this.isVisibilidadCeldaOrdenCajaIngreso && this.isPermisoOrdenCajaIngreso));			
			//this.jMenuItemDetalleMostrarOcultarCajaIngreso.setVisible((this.isVisibilidadCeldaOrdenCajaIngreso && this.isPermisoOrdenCajaIngreso));			
			this.jMenuItemNuevoRelacionesCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaIngreso && this.isPermisoNuevoCajaIngreso));			
			this.jMenuItemNuevoGuardarCambiosCajaIngreso.setVisible((this.isVisibilidadCeldaNuevoCajaIngreso && this.isPermisoNuevoCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));									
			
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemModificarCajaIngreso.setVisible((this.isVisibilidadCeldaModificarCajaIngreso && this.isPermisoActualizarCajaIngreso));	
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemActualizarCajaIngreso.setVisible((this.isVisibilidadCeldaActualizarCajaIngreso && this.isPermisoActualizarCajaIngreso));	
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemEliminarCajaIngreso.setVisible((this.isVisibilidadCeldaEliminarCajaIngreso && this.isPermisoEliminarCajaIngreso));
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemCancelarCajaIngreso.setVisible(this.isVisibilidadCeldaCancelarCajaIngreso);				
			}
			
			this.jMenuItemGuardarCambiosCajaIngreso.setVisible((this.isVisibilidadCeldaGuardarCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));						
			this.jMenuItemGuardarCambiosTablaCajaIngreso.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajaIngreso=this.jButtonNuevoCajaIngreso.isVisible();
			this.isVisibilidadCeldaDuplicarCajaIngreso=this.jButtonDuplicarCajaIngreso.isVisible();
			this.isVisibilidadCeldaCopiarCajaIngreso=this.jButtonCopiarCajaIngreso.isVisible();
			this.isVisibilidadCeldaVerFormCajaIngreso=this.jButtonVerFormCajaIngreso.isVisible();
			
			this.isVisibilidadCeldaOrdenCajaIngreso=this.jButtonAbrirOrderByCajaIngreso.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=this.jButtonNuevoRelacionesCajaIngreso.isVisible();
			this.isVisibilidadCeldaModificarCajaIngreso=this.jButtonModificarCajaIngreso.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			this.isVisibilidadCeldaActualizarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarCajaIngreso.isVisible();
			this.isVisibilidadCeldaEliminarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarCajaIngreso.isVisible();
			this.isVisibilidadCeldaCancelarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarCajaIngreso.isVisible();
			this.isVisibilidadCeldaGuardarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosCajaIngreso.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=this.jButtonGuardarCambiosTablaCajaIngreso.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajaIngreso=this.jButtonNuevoToolBarCajaIngreso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=this.jButtonNuevoRelacionesToolBarCajaIngreso.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			this.isVisibilidadCeldaModificarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarToolBarCajaIngreso.isVisible();
			this.isVisibilidadCeldaActualizarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarToolBarCajaIngreso.isVisible();
			this.isVisibilidadCeldaEliminarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarToolBarCajaIngreso.isVisible();
			this.isVisibilidadCeldaCancelarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarToolBarCajaIngreso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaIngreso=this.jButtonGuardarCambiosToolBarCajaIngreso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=this.jButtonGuardarCambiosTablaToolBarCajaIngreso.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajaIngreso=this.jMenuItemNuevoCajaIngreso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=this.jMenuItemNuevoRelacionesCajaIngreso.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			this.isVisibilidadCeldaModificarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jMenuItemModificarCajaIngreso.isVisible();
			this.isVisibilidadCeldaActualizarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jMenuItemActualizarCajaIngreso.isVisible();
			this.isVisibilidadCeldaEliminarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jMenuItemEliminarCajaIngreso.isVisible();
			this.isVisibilidadCeldaCancelarCajaIngreso=this.jInternalFrameDetalleFormCajaIngreso.jMenuItemCancelarCajaIngreso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaIngreso=this.jMenuItemGuardarCambiosCajaIngreso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=this.jMenuItemGuardarCambiosTablaCajaIngreso.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajaIngreso(Boolean esInicializar) {
		if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
				//if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajaIngreso();
			}
			
			this.inicializarActualizarBindingBotonesManualCajaIngreso(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajaIngreso() {
		this.jButtonNuevoCajaIngreso.setVisible(this.isPermisoNuevoCajaIngreso);			
		this.jButtonDuplicarCajaIngreso.setVisible(this.isPermisoDuplicarCajaIngreso);			
		this.jButtonCopiarCajaIngreso.setVisible(this.isPermisoCopiarCajaIngreso);			
		this.jButtonVerFormCajaIngreso.setVisible(this.isPermisoVerFormCajaIngreso);			
		
		this.jButtonAbrirOrderByCajaIngreso.setVisible(this.isPermisoOrdenCajaIngreso);					
		
		this.jButtonNuevoRelacionesCajaIngreso.setVisible(this.isPermisoNuevoCajaIngreso);			
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarCajaIngreso.setVisible(this.isPermisoActualizarCajaIngreso);	
			this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarCajaIngreso.setVisible(this.isPermisoActualizarCajaIngreso);	
			this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarCajaIngreso.setVisible(this.isPermisoEliminarCajaIngreso);
			this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarCajaIngreso.setVisible(this.isVisibilidadCeldaCancelarCajaIngreso);						
			this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosCajaIngreso.setVisible(this.isPermisoGuardarCambiosCajaIngreso);							
		}
		
		this.jButtonGuardarCambiosTablaCajaIngreso.setVisible(this.isPermisoActualizarCajaIngreso);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaIngreso() {
		this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarCajaIngreso.setVisible(this.isPermisoActualizarCajaIngreso);	
		this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarCajaIngreso.setVisible(this.isPermisoActualizarCajaIngreso);	
		this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarCajaIngreso.setVisible(this.isPermisoEliminarCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarCajaIngreso.setVisible(this.isVisibilidadCeldaCancelarCajaIngreso);							
		this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosCajaIngreso.setVisible((this.isVisibilidadCeldaGuardarCajaIngreso && this.isPermisoGuardarCambiosCajaIngreso));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajaIngreso() {
		if(CajaIngresoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajaIngreso();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajaIngreso() {
	}
	
	public void jTableDatosCajaIngresoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajaIngreso(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajaingreso.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajaIngresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajaIngreso(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajaingresoLogic.getConnexion());

				if(this.cajaingreso.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajaingreso.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngreso=(TitledBorder)this.jScrollPanelDatosCajaIngreso.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajaIngreso.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajaingreso.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCajaIngresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCajaIngreso(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cajaingresoLogic.getConnexion());

				if(this.cajaingreso.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cajaingreso.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngreso=(TitledBorder)this.jScrollPanelDatosCajaIngreso.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCajaIngreso.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cajaingreso.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioCajaIngresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebCajaIngreso(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.cajaingresoLogic.getConnexion());

				if(this.cajaingreso.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.cajaingreso.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngreso=(TitledBorder)this.jScrollPanelDatosCajaIngreso.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderCajaIngreso.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.cajaingreso.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaCajaIngresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebCajaIngreso(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.cajaingresoLogic.getConnexion());

				if(this.cajaingreso.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.cajaingreso.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngreso=(TitledBorder)this.jScrollPanelDatosCajaIngreso.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderCajaIngreso.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.cajaingreso.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_turno_pun_venCajaIngresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoturnopunven=true;

			idTienePermisoturnopunven=this.tienePermisosUsuarioEnPaginaWebCajaIngreso(TurnoPunVenConstantesFunciones.CLASSNAME);

			if(idTienePermisoturnopunven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);

				this.turnopunvenBeanSwingJInternalFrame=new TurnoPunVenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.turnopunvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.turnopunvenBeanSwingJInternalFrame.getTurnoPunVenLogic().setConnexion(this.cajaingresoLogic.getConnexion());

				if(this.cajaingreso.getid_turno_pun_ven()!=null) {
					this.turnopunvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.turnopunvenBeanSwingJInternalFrame.setIdActual(this.cajaingreso.getid_turno_pun_ven());
					this.turnopunvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.turnopunvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.turnopunvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaTurnoPunVen();
				}

				JInternalFrameBase jinternalFrame =this.turnopunvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngreso=(TitledBorder)this.jScrollPanelDatosCajaIngreso.getBorder();
				TitledBorder titledBorderturnopunven=(TitledBorder)this.turnopunvenBeanSwingJInternalFrame.jScrollPanelDatosTurnoPunVen.getBorder();

				titledBorderturnopunven.setTitle(titledBorderCajaIngreso.getTitle() + " -> Turno Pun Ven");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_turno_pun_venCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.getid_turno_pun_ven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_turno_pun_ven = "+this.cajaingreso.getid_turno_pun_ven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.cajaingreso.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.cajaingreso.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoraCajaIngresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.getcajaingreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingreso==null) {
						this.cajaingreso = new CajaIngreso();
					}

					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);
				}

				if(this.cajaingreso.gethora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora = "+this.cajaingreso.gethora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCajaCajaIngresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngreso(false,false);

			this.getCajaIngresosFK_IdCaja();

			this.inicializarActualizarBindingCajaIngreso(false);

			//if(CajaIngresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajaIngresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngreso(false,false);

			this.getCajaIngresosFK_IdEmpresa();

			this.inicializarActualizarBindingCajaIngreso(false);

			//if(CajaIngresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCajaIngresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngreso(false,false);

			this.getCajaIngresosFK_IdSucursal();

			this.inicializarActualizarBindingCajaIngreso(false);

			//if(CajaIngresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTurnoPunVenCajaIngresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngreso(false,false);

			this.getCajaIngresosFK_IdTurnoPunVen();

			this.inicializarActualizarBindingCajaIngreso(false);

			//if(CajaIngresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioCajaIngresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngreso(false,false);

			this.getCajaIngresosFK_IdUsuario();

			this.inicializarActualizarBindingCajaIngreso(false);

			//if(CajaIngresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajaIngreso() {
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
		

		if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
			this.jInternalFrameDetalleFormCajaIngreso.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajaIngreso.dispose();
			this.jInternalFrameDetalleFormCajaIngreso=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
			this.jInternalFrameReporteDinamicoCajaIngreso.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajaIngreso.dispose();
			this.jInternalFrameReporteDinamicoCajaIngreso=null;
		}
		
		if(this.jInternalFrameImportacionCajaIngreso!=null) {
			this.jInternalFrameImportacionCajaIngreso.setVisible(false);	    			
			this.jInternalFrameImportacionCajaIngreso.dispose();
			this.jInternalFrameImportacionCajaIngreso=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajaIngreso();
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajaIngreso")) {
				jButtonNuevoCajaIngresoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajaIngreso")) {
				jButtonDuplicarCajaIngresoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajaIngreso")) {
				jButtonCopiarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajaIngreso")) {
				jButtonVerFormCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajaIngreso")) {
				jButtonNuevoCajaIngresoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajaIngreso")) {
				jButtonDuplicarCajaIngresoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajaIngreso")) {
				jButtonNuevoCajaIngresoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajaIngreso")) {
				jButtonDuplicarCajaIngresoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajaIngreso")) {
				jButtonNuevoCajaIngresoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajaIngreso")) {
				jButtonNuevoCajaIngresoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajaIngreso")) {
				jButtonNuevoCajaIngresoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajaIngreso")) {
				jButtonModificarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajaIngreso")) {
				jButtonModificarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajaIngreso")) {
				jButtonModificarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajaIngreso")) {
				jButtonActualizarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajaIngreso")) {
				jButtonActualizarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajaIngreso")) {
				jButtonActualizarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajaIngreso")) {
				jButtonEliminarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajaIngreso")) {
				jButtonEliminarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajaIngreso")) {
				jButtonEliminarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajaIngreso")) {
				jButtonCancelarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajaIngreso")) {
				jButtonCancelarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajaIngreso")) {
				jButtonCancelarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajaIngreso")) {
				jButtonCerrarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajaIngreso")) {
				jButtonCerrarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajaIngreso")) {
				jButtonCerrarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajaIngreso")) {
				jButtonMostrarOcultarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajaIngreso")) {
				jButtonCancelarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajaIngreso")) {
				jButtonGuardarCambiosCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajaIngreso")) {
				jButtonGuardarCambiosCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajaIngreso")) {
				jButtonCopiarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajaIngreso")) {
				jButtonVerFormCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajaIngreso")) {
				jButtonGuardarCambiosCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajaIngreso")) {
				jButtonCopiarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajaIngreso")) {
				jButtonVerFormCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajaIngreso")) {
				jButtonGuardarCambiosCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajaIngreso")) {
				jButtonGuardarCambiosCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajaIngreso")) {
				jButtonGuardarCambiosCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajaIngreso")) {
				jButtonRecargarInformacionCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajaIngreso")) {
				jButtonRecargarInformacionCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajaIngreso")) {
				jButtonRecargarInformacionCajaIngresoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajaIngreso")) {
				jButtonAnterioresCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajaIngreso")) {
				jButtonAnterioresCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajaIngreso")) {
				jButtonAnterioresCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajaIngreso")) {
				jButtonSiguientesCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajaIngreso")) {
				jButtonSiguientesCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajaIngreso")) {
				jButtonSiguientesCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajaIngreso") || sTipo.equals("MenuItemDetalleAbrirOrderByCajaIngreso")) {
				jButtonAbrirOrderByCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajaIngreso") || sTipo.equals("MenuItemDetalleMostrarOcultarCajaIngreso")) {
				jButtonMostrarOcultarCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajaIngreso")) {
				jButtonNuevoGuardarCambiosCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajaIngreso")) {
				jButtonNuevoGuardarCambiosCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajaIngreso")) {
				jButtonNuevoGuardarCambiosCajaIngresoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajaIngreso")) {
				jButtonCerrarReporteDinamicoCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajaIngreso")) {
				jButtonGenerarReporteDinamicoCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajaIngreso")) {
				
				jButtonGenerarExcelReporteDinamicoCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajaIngreso")) {
				jButtonCerrarImportacionCajaIngresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajaIngreso")) {
				
				jButtonGenerarImportacionCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajaIngreso")) {
				
				jButtonAbrirImportacionCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajaIngreso")) {
				jComboBoxTiposAccionesCajaIngresoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajaIngreso")) {
				jComboBoxTiposRelacionesCajaIngresoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajaIngreso")) {
				jComboBoxTiposAccionesCajaIngresoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajaIngreso")) {
				
				jComboBoxTiposSeleccionarCajaIngresoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajaIngreso")) {
				jTextFieldValorCampoGeneralCajaIngresoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajaIngreso")) {
				jButtonAbrirOrderByCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajaIngreso")) {
				jButtonAbrirOrderByCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajaIngreso")) {
				jButtonCerrarOrderByCajaIngresoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaIngresoBusqueda")) {
				this.jButtonidCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaIngresoUpdate")) {
				this.jButtonid_empresaCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaIngresoBusqueda")) {
				this.jButtonid_empresaCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaIngresoUpdate")) {
				this.jButtonid_sucursalCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaIngresoBusqueda")) {
				this.jButtonid_sucursalCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCajaIngresoUpdate")) {
				this.jButtonid_usuarioCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCajaIngresoBusqueda")) {
				this.jButtonid_usuarioCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaIngresoUpdate")) {
				this.jButtonid_cajaCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaIngresoBusqueda")) {
				this.jButtonid_cajaCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_turno_pun_venCajaIngresoUpdate")) {
				this.jButtonid_turno_pun_venCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_turno_pun_venCajaIngresoBusqueda")) {
				this.jButtonid_turno_pun_venCajaIngresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialCajaIngresoBusqueda")) {
				this.jButtonsecuencialCajaIngresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCajaIngresoBusqueda")) {
				this.jButtonfechaCajaIngresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaCajaIngresoBusqueda")) {
				this.jButtonhoraCajaIngresoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCajaCajaIngreso")) {
				this.jButtonFK_IdCajaCajaIngresoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTurnoPunVenCajaIngreso")) {
				this.jButtonFK_IdTurnoPunVenCajaIngresoActionPerformed(evt);
			}
			
			;
			
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajaIngreso();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				


				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CajaIngreso cajaingresoLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajaingresoLocal=this.cajaingreso;
			} else {
				cajaingresoLocal=this.cajaingresoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
							
				
				


				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
								
						
				


				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
								
				
				


				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
							
				
				


				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresoAnterior =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajaingresoAnterior =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
								
				
				


				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajaIngreso")) {
					jCheckBoxSeleccionarTodosCajaIngresoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajaIngreso")) {
					jCheckBoxSeleccionadosCajaIngresoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajaIngreso")) {
					
				}
				
				


				
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
												
				
				


				
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresoAnterior =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajaingresoAnterior =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingreso);
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngreso.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresoAnterior =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajaIngreso")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajaIngresoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajaIngreso.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajaingreso =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajaingreso =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajaingreso);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajaIngreso")) {
				
				}
				
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajaIngreso")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajaIngreso.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajaIngreso")) {
			
			}
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajaIngreso();
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			if(sTipo.equals("NuevoCajaIngreso")) {
				jButtonNuevoCajaIngresoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajaIngreso")) {
				jButtonDuplicarCajaIngresoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajaIngreso")) {
				jButtonCopiarCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajaIngreso")) {
				jButtonVerFormCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajaIngreso")) {
				jButtonNuevoCajaIngresoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajaIngreso")) {
				jButtonModificarCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajaIngreso")) {
				jButtonActualizarCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajaIngreso")) {
				jButtonEliminarCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajaIngreso")) {
				jButtonGuardarCambiosCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajaIngreso")) {
				jButtonCancelarCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajaIngreso")) {
				jButtonCerrarCajaIngresoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajaIngreso")) {
				jButtonGuardarCambiosCajaIngresoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajaIngreso")) {
				jButtonNuevoGuardarCambiosCajaIngresoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajaIngreso")) {
				jButtonAbrirOrderByCajaIngresoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajaIngreso")) {
				jButtonRecargarInformacionCajaIngresoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajaIngreso")) {
				jButtonAnterioresCajaIngresoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajaIngreso")) {
				jButtonSiguientesCajaIngresoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaIngresoBusqueda")) {
				this.jButtonidCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaIngresoUpdate")) {
				this.jButtonid_empresaCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaIngresoBusqueda")) {
				this.jButtonid_empresaCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaIngresoUpdate")) {
				this.jButtonid_sucursalCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaIngresoBusqueda")) {
				this.jButtonid_sucursalCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCajaIngresoUpdate")) {
				this.jButtonid_usuarioCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCajaIngresoBusqueda")) {
				this.jButtonid_usuarioCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaIngresoUpdate")) {
				this.jButtonid_cajaCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaIngresoBusqueda")) {
				this.jButtonid_cajaCajaIngresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_turno_pun_venCajaIngresoUpdate")) {
				this.jButtonid_turno_pun_venCajaIngresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_turno_pun_venCajaIngresoBusqueda")) {
				this.jButtonid_turno_pun_venCajaIngresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialCajaIngresoBusqueda")) {
				this.jButtonsecuencialCajaIngresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCajaIngresoBusqueda")) {
				this.jButtonfechaCajaIngresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaCajaIngresoBusqueda")) {
				this.jButtonhoraCajaIngresoBusquedaActionPerformed(evt);
			}
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajaIngreso();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajaIngreso")) {
				closingInternalFrameCajaIngreso();
				
			} else if(sTipo.equals("jButtonCancelarCajaIngreso")) {
				JInternalFrameBase jInternalFrameDetalleFormCajaIngreso = (JInternalFrameBase)evt.getSource();
	            	
	            CajaIngresoBeanSwingJInternalFrame jInternalFrameParent=(CajaIngresoBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaIngreso.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajaIngresoActionPerformed(null);
			}
			
			CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajaingreso,new Object(),this.cajaingresoParameterGeneral,this.cajaingresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajaIngreso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajaIngreso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajaIngreso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajaingreso)) {
			if(!esControlTabla) {
				if(CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);			
				}
				
				if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajaIngreso(this.cajaingreso,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajaingresoReturnGeneral=cajaingresoLogic.procesarEventosCajaIngresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaingresoLogic.getCajaIngresos(),this.cajaingreso,this.cajaingresoParameterGeneral,this.isEsNuevoCajaIngreso,classes);//this.cajaingresoLogic.getCajaIngreso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajaIngreso(this.cajaingresoReturnGeneral,this.cajaingresoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajaIngreso(classes,this.cajaingresoReturnGeneral,this.cajaingresoBean,false);
					}
						
					if(this.cajaingresoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajaIngreso(this.cajaingresoReturnGeneral.getCajaIngreso());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajaIngreso(this.cajaingresoReturnGeneral.getCajaIngreso());	
					}
						
					if(this.cajaingresoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajaIngreso(this.cajaingresoReturnGeneral.getCajaIngreso(),classes);//this.cajaingresoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajaIngreso(this.cajaingreso,classes);//this.cajaingresoBean);									
				}
			
				if(CajaIngresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajaIngreso(this.cajaingreso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngreso(this.cajaingreso);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajaingresoAnterior!=null) {
						this.cajaingreso=this.cajaingresoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajaingresoReturnGeneral=cajaingresoLogic.procesarEventosCajaIngresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaingresoLogic.getCajaIngresos(),this.cajaingreso,this.cajaingresoParameterGeneral,this.isEsNuevoCajaIngreso,classes);//this.cajaingresoLogic.getCajaIngreso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajaingresoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajaingresoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajaingresoReturnGeneral.getCajaIngreso(),cajaingresoLogic.getCajaIngresos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajaingresoReturnGeneral.getCajaIngreso(),this.cajaingresos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajaIngreso.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajaIngreso.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajaIngreso();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajaIngreso() throws Exception {
		
		CajaIngresoModel cajaingresoModel=(CajaIngresoModel)this.jTableDatosCajaIngreso.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaingresoModel.cajaingresos=this.cajaingresoLogic.getCajaIngresos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajaingresoModel.cajaingresos=this.cajaingresos;
		}
		
		
		((CajaIngresoModel) this.jTableDatosCajaIngreso.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajaIngreso() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajaingresoAnterior(),this.cajaingresoLogic.getCajaIngresos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajaingresoAnterior(),this.cajaingresos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajaIngreso();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajaIngreso(CajaIngreso cajaingreso,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaIngresoDetalle.class)) {
					this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.setCajaIngresoDetalles(cajaingreso.getCajaIngresoDetalles());
					this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaingreso,new Object(),generalEntityParameterGeneral,this.cajaingresoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajaIngresoConstantesFunciones.getClassesRelationshipsOfCajaIngreso(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajaIngresoConstantesFunciones.getClassesRelationshipsFromStringsOfCajaIngreso(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajaIngreso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajaIngresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaingreso,new Object(),generalEntityParameterGeneral,this.cajaingresoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajaIngreso(CajaIngresoBean cajaingresoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaIngresoDetalle.class)) {
					this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.setCajaIngresoDetalles(cajaingreso.getCajaIngresoDetalles());
					this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajaIngreso(ArrayList<Classe> classes,CajaIngresoReturnGeneral cajaingresoReturnGeneral,CajaIngresoBean cajaingresoBean,Boolean conDefault) throws Exception {
		
			this.cajaingresoBean.setCajaIngresoDetalles(cajaingresoReturnGeneral.getCajaIngreso().getCajaIngresoDetalles());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajaIngreso(CajaIngreso cajaingreso,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaIngresoDetalle.class)) {
					cajaingreso.setCajaIngresoDetalles(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleLogic.getCajaIngresoDetalles());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cajaingreso)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajaIngreso = new CajaIngresoDetalleFormJInternalFrame(jDesktopPane,this.cajaingresoSessionBean.getConGuardarRelaciones(),this.cajaingresoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.setVisible(false);
		this.jInternalFrameDetalleFormCajaIngreso.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajaIngreso.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajaIngreso.cajaingresoLogic=this.cajaingresoLogic;
		
		this.cargarCombosFrameForeignKeyCajaIngreso("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaIngreso();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaIngreso();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajaIngreso("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajaIngreso();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajaIngreso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaIngreso"));
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarCajaIngreso.addActionListener(new ButtonActionListener(this,"ModificarCajaIngreso"));

		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarToolBarCajaIngreso.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaIngreso"));
					
		this.jInternalFrameDetalleFormCajaIngreso.jMenuItemModificarCajaIngreso.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaIngreso"));		
		
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarCajaIngreso.addActionListener (new ButtonActionListener(this,"ActualizarCajaIngreso"));
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarToolBarCajaIngreso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaIngreso"));
						
		this.jInternalFrameDetalleFormCajaIngreso.jMenuItemActualizarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaIngreso"));		
		
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarCajaIngreso.addActionListener (new ButtonActionListener(this,"EliminarCajaIngreso"));
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaIngreso"));
								
		this.jInternalFrameDetalleFormCajaIngreso.jMenuItemEliminarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaIngreso"));		
		
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarCajaIngreso.addActionListener (new ButtonActionListener(this,"CancelarCajaIngreso"));
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaIngreso"));
					
		this.jInternalFrameDetalleFormCajaIngreso.jMenuItemCancelarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaIngreso"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jMenuItemDetalleCerrarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaIngreso"));		
		
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaIngreso"));
		
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaIngreso"));
		
		
		
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaIngreso"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonidCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"idCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_empresaCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_empresaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_sucursalCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_sucursalCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_usuarioCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_usuarioCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_cajaCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_cajaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_turno_pun_venCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_turno_pun_venCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonsecuencialCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonfechaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonhoraCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"horaCajaIngresoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaIngreso"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajaIngreso"));
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaIngreso"));
		}
		
		this.jTableDatosCajaIngreso.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajaIngreso"));
		
		this.jTableDatosCajaIngreso.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajaIngreso"));
		
		this.jButtonNuevoCajaIngreso.addActionListener(new ButtonActionListener(this,"NuevoCajaIngreso"));
		
		this.jButtonDuplicarCajaIngreso.addActionListener(new ButtonActionListener(this,"DuplicarCajaIngreso"));
		
		this.jButtonCopiarCajaIngreso.addActionListener(new ButtonActionListener(this,"CopiarCajaIngreso"));
		
		this.jButtonVerFormCajaIngreso.addActionListener(new ButtonActionListener(this,"VerFormCajaIngreso"));
		
		
		this.jButtonNuevoToolBarCajaIngreso.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajaIngreso"));
			
		this.jButtonDuplicarToolBarCajaIngreso.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajaIngreso"));
			
		this.jMenuItemNuevoCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajaIngreso"));
			
		this.jMenuItemDuplicarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajaIngreso"));		
		
		
		this.jButtonNuevoRelacionesCajaIngreso.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajaIngreso"));
		
		
		this.jButtonNuevoRelacionesToolBarCajaIngreso.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajaIngreso"));
			
		this.jMenuItemNuevoRelacionesCajaIngreso.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajaIngreso"));		
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarCajaIngreso.addActionListener(new ButtonActionListener(this,"ModificarCajaIngreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonModificarToolBarCajaIngreso.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaIngreso"));
			
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemModificarCajaIngreso.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaIngreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarCajaIngreso.addActionListener (new ButtonActionListener(this,"ActualizarCajaIngreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonActualizarToolBarCajaIngreso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaIngreso"));
				
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemActualizarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaIngreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarCajaIngreso.addActionListener (new ButtonActionListener(this,"EliminarCajaIngreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonEliminarToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaIngreso"));
						
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemEliminarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaIngreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarCajaIngreso.addActionListener (new ButtonActionListener(this,"CancelarCajaIngreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonCancelarToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaIngreso"));
			
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemCancelarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaIngreso"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajaIngreso"));		
		
		
		this.jButtonCerrarCajaIngreso.addActionListener (new ButtonActionListener(this,"CerrarCajaIngreso"));
		
		
		this.jButtonCerrarToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajaIngreso"));
			
		this.jMenuItemCerrarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajaIngreso"));
			
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jMenuItemDetalleCerrarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaIngreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosCajaIngreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajaIngreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaIngreso"));
		}
		
		this.jButtonCopiarToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajaIngreso"));
			
		this.jButtonVerFormToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajaIngreso"));
		
		this.jMenuItemGuardarCambiosCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajaIngreso"));
			
		this.jMenuItemCopiarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajaIngreso"));		
		
		this.jMenuItemVerFormCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajaIngreso"));		
		
		
		this.jButtonGuardarCambiosTablaCajaIngreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaIngreso"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajaIngreso"));
			
		this.jMenuItemGuardarCambiosTablaCajaIngreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaIngreso"));		
		
		
		
		this.jButtonRecargarInformacionCajaIngreso.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajaIngreso"));
					
		this.jButtonRecargarInformacionToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajaIngreso"));
		
		this.jMenuItemRecargarInformacionCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajaIngreso"));		
		
		
		
		this.jButtonAnterioresCajaIngreso.addActionListener (new ButtonActionListener(this,"AnterioresCajaIngreso"));
		
		
		this.jButtonAnterioresToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajaIngreso"));
		
		this.jMenuItemAnterioresCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajaIngreso"));		
		
		
		this.jButtonSiguientesCajaIngreso.addActionListener (new ButtonActionListener(this,"SiguientesCajaIngreso"));
		
		
		this.jButtonSiguientesToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajaIngreso"));
			
		this.jMenuItemSiguientesCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajaIngreso"));
			
		this.jMenuItemAbrirOrderByCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajaIngreso"));
			
		this.jMenuItemMostrarOcultarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajaIngreso"));
			
		this.jMenuItemDetalleAbrirOrderByCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajaIngreso"));
			
		this.jMenuItemDetalleMostarOcultarCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajaIngreso"));		
		
		
		this.jButtonNuevoGuardarCambiosCajaIngreso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajaIngreso"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajaIngreso"));
			
		this.jMenuItemNuevoGuardarCambiosCajaIngreso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajaIngreso"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajaIngreso.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajaIngreso"));

		this.jCheckBoxSeleccionadosCajaIngreso.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajaIngreso"));
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaIngreso"));
		}
		
		
		this.jComboBoxTiposRelacionesCajaIngreso.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajaIngreso"));
			
		this.jComboBoxTiposAccionesCajaIngreso.addActionListener (new ButtonActionListener(this,"TiposAccionesCajaIngreso"));
					
		this.jComboBoxTiposSeleccionarCajaIngreso.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajaIngreso"));
			
		this.jTextFieldValorCampoGeneralCajaIngreso.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajaIngreso"));		
		
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonidCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"idCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_empresaCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_empresaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_sucursalCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_sucursalCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_usuarioCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_usuarioCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_cajaCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_cajaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_turno_pun_venCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_turno_pun_venCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonsecuencialCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonfechaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonhoraCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"horaCajaIngresoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCajaCajaIngreso.addActionListener(new ButtonActionListener(this,"FK_IdCajaCajaIngreso"));

			this.jButtonFK_IdTurnoPunVenCajaIngreso.addActionListener(new ButtonActionListener(this,"FK_IdTurnoPunVenCajaIngreso"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajaIngreso!=null) {
				this.jInternalFrameReporteDinamicoCajaIngreso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaIngreso"));
				this.jInternalFrameReporteDinamicoCajaIngreso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaIngreso"));
				this.jInternalFrameReporteDinamicoCajaIngreso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaIngreso"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajaIngreso.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaIngreso"));				
			//this.jButtonGenerarReporteDinamicoCajaIngreso.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaIngreso"));
			//this.jButtonGenerarExcelReporteDinamicoCajaIngreso.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaIngreso"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajaIngreso!=null) {
				this.jInternalFrameImportacionCajaIngreso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaIngreso"));
				this.jInternalFrameImportacionCajaIngreso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaIngreso"));
				this.jInternalFrameImportacionCajaIngreso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaIngreso"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajaIngreso.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajaIngreso"));
			
			this.jButtonAbrirOrderByToolBarCajaIngreso.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajaIngreso"));			
			
			if(this.jInternalFrameOrderByCajaIngreso!=null) {
				this.jInternalFrameOrderByCajaIngreso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaIngreso"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngreso.jTabbedPaneRelacionesCajaIngreso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaIngreso"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameCajaIngreso();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajaIngreso.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajaIngreso = (JInternalFrameBase)event.getSource();
	            	
	            CajaIngresoBeanSwingJInternalFrame jInternalFrameParent=(CajaIngresoBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaIngreso.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajaIngresoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajaIngreso.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajaIngresoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajaIngreso.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajaIngreso.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajaIngreso";
		inputMap = this.jButtonNuevoCajaIngreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajaIngreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaIngresoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajaIngreso";
		inputMap = this.jButtonNuevoRelacionesCajaIngreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajaIngreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaIngresoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajaIngreso";
		inputMap = this.jButtonModificarCajaIngreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajaIngreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajaIngresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajaIngreso";
		inputMap = this.jButtonActualizarCajaIngreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajaIngreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajaIngresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajaIngreso";
		inputMap = this.jButtonEliminarCajaIngreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajaIngreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajaIngresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajaIngreso";
		inputMap = this.jButtonCancelarCajaIngreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajaIngreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajaIngresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajaIngreso";
		inputMap = this.jButtonCerrarCajaIngreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajaIngreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajaIngresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajaIngreso";
		inputMap = this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosCajaIngreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajaIngreso.jButtonGuardarCambiosCajaIngreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajaIngresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajaIngreso.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajaIngresoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajaIngreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajaIngresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajaIngreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajaIngresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajaIngreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajaIngresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonidCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"idCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_empresaCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_empresaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_sucursalCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_sucursalCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_usuarioCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_usuarioCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_cajaCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_cajaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaIngresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_turno_pun_venCajaIngresoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaIngresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonid_turno_pun_venCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonsecuencialCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonfechaCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajaIngresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngreso.jButtonhoraCajaIngresoBusqueda.addActionListener(new ButtonActionListener(this,"horaCajaIngresoBusqueda"));
		
		
		this.jButtonFK_IdCajaCajaIngreso.addActionListener(new ButtonActionListener(this,"FK_IdCajaCajaIngreso"));

		this.jButtonFK_IdTurnoPunVenCajaIngreso.addActionListener(new ButtonActionListener(this,"FK_IdTurnoPunVenCajaIngreso"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajaIngreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajaIngresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajaIngresoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajaIngreso.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajaIngreso(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
					cajaingresoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaIngreso cajaingresoAux:cajaingresos) {
					cajaingresoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajaIngresoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaIngreso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
						cajaingresoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaIngreso cajaingresoAux:cajaingresos) {
						cajaingresoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaIngreso cajaingresoAux:cajaingresos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajaIngreso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaIngreso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaIngreso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajaIngresoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaIngreso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajaIngreso.getSelectedRows();
			
			CajaIngreso cajaingresoLocal=new CajaIngreso();
			
			//this.seleccionarTodosCajaIngreso(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLocal =(CajaIngreso) this.cajaingresoLogic.getCajaIngresos().toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajaingresoLocal =(CajaIngreso) this.cajaingresos.toArray()[this.jTableDatosCajaIngreso.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajaingresoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
						cajaingresoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaIngreso cajaingresoAux:cajaingresos) {
						cajaingresoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajaIngreso(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaIngreso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaIngreso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaIngreso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajaIngresoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajaIngresoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajaIngresoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajaIngreso(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajaIngreso.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaIngreso cajaingresoAux:this.cajaingresoLogic.getCajaIngresos()) {
				
						if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							cajaingresoAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cajaingresoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_HORA)) {
							existe=true;
							cajaingresoAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaIngreso cajaingresoAux:cajaingresos) {
					
						if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							cajaingresoAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cajaingresoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_HORA)) {
							existe=true;
							cajaingresoAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajaIngreso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajaIngresoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajaIngreso(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajaIngreso=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajaIngreso.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajaIngreso) {				
					conSplash=true;//false;										
					
					//this.startProcessCajaIngreso(conSplash);
				
					this.generarReporteCajaIngresosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajaIngresosSeleccionados();
				//this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaIngresosSeleccionados(false);
				//this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaIngresosSeleccionados(true);
				//this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaIngreso();
				
				this.exportarCajaIngresosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajaIngresos();
				//this.importarCajaIngresos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaIngreso();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajaIngresosSeleccionados();
				//this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Caja Ingreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajaIngreso();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajaIngreso)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajaIngreso(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.setSelectedIndex(0);					
				}	
			} 			
			else if(CajaIngresoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajaIngreso) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajaIngreso(conSplash);
					
						//this.actualizarParametrosGeneralCajaIngreso();
						
						this.generarReporteProcesoAccionCajaIngresosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajaIngresoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Caja IngresoS SELECCIONADOS?", "MANTENIMIENTO DE Caja Ingreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajaIngreso();
				
						this.actualizarParametrosGeneralCajaIngreso();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajaingresoReturnGeneral=cajaingresoLogic.procesarAccionCajaIngresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajaingresoLogic.getCajaIngresos(),this.cajaingresoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajaIngresoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajaIngreso();
					
					CajaIngresoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajaIngresoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaIngreso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaIngreso.jComboBoxTiposAccionesFormularioCajaIngreso.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajaIngreso(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajaIngresoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajaIngreso();
			
			if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		
			CajaIngreso cajaingreso=new CajaIngreso();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajaIngreso(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajaIngreso.getSelectedItem();
			
			
			
			
			cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajaingresosSeleccionados.size()==1) {
				for(CajaIngreso cajaingresoAux:cajaingresosSeleccionados) {
					cajaingreso=cajaingresoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Caja Ingreso Detalle")) {
					jButtonCajaIngresoDetalleActionPerformed(null,rowIndex,true,false,cajaingreso);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajaIngreso();
			
      		//this.finishProcessCajaIngreso(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajaIngresoReturnGeneral() throws Exception {
		if(this.cajaingresoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajaingresoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajaingresoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajaingresoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajaingresoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajaingresoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajaIngreso(false);
		}
		
		if(this.cajaingresoReturnGeneral.getConRetornoLista() || this.cajaingresoReturnGeneral.getConRetornoObjeto()) {
			if(this.cajaingresoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajaingresoLogic.setCajaIngresos(this.cajaingresoReturnGeneral.getCajaIngresos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cajaingresoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajaingresoLogic.setCajaIngreso(this.cajaingresoReturnGeneral.getCajaIngreso());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCajaIngreso(false);
		}
	}
	
	public void actualizarParametrosGeneralCajaIngreso() throws Exception {
		
		
	}
	
	public ArrayList<CajaIngreso> getCajaIngresosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajaIngreso) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CajaIngreso cajaingresoAux:cajaingresoLogic.getCajaIngresos()) {
					if(cajaingresoAux.getIsSelected()) {
						cajaingresosSeleccionados.add(cajaingresoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaIngreso cajaingresoAux:this.cajaingresos) {
					if(cajaingresoAux.getIsSelected()) {
						cajaingresosSeleccionados.add(cajaingresoAux);				
					}
				}
			}
			
			if(cajaingresosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajaingresosSeleccionados.addAll(this.cajaingresoLogic.getCajaIngresos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajaingresosSeleccionados.addAll(this.cajaingresos);				
					}
				}
			}
		} else {
			cajaingresosSeleccionados.add(this.cajaingreso);
		}
		
		return cajaingresosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteCajaIngresosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajaIngresosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajaIngresosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaIngresosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaIngresosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCajaIngresosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Caja Ingreso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajaIngresosSeleccionados() throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajaIngresos("Todos",cajaingresosSeleccionados);
		
	}	
	
	public void generarReporteNormalCajaIngresosSeleccionados() throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajaIngresos("Todos",cajaingresosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajaIngresosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajaIngresos("Todos",cajaingresosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajaIngresosSeleccionados() throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajaIngreso();
		
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajaIngreso();
		
		
		//this.generarReporteCajaIngresos("Todos",cajaingresosSeleccionados ,cajaingresoImplementable,cajaingresoImplementableHome);
	}
	
	public void mostrarImportacionCajaIngresos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajaIngreso();
		
		this.abrirFrameImportacionCajaIngreso();		
		
			
		//this.generarReporteCajaIngresos("Todos",cajaingresosSeleccionados ,cajaingresoImplementable,cajaingresoImplementableHome);
	}
	
	public void importarCajaIngresos() throws Exception {		
	
	}
	
	public void exportarCajaIngresosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajaIngresosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajaIngresosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajaIngresosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Caja Ingreso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajaIngresosSeleccionados() throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingreso."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajaIngreso(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CajaIngreso cajaingresoAux:cajaingresosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajaIngreso(cajaingresoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajaingresoAux.setsDetalleGeneralEntityReporte(cajaingresoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajaIngreso(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoConstantesFunciones.LABEL_HORA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajaIngreso(CajaIngreso cajaingreso,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajaingreso.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.getturnopunven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingreso.gethora().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajaIngresosSeleccionados() throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingreso.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CajaIngresos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajaIngreso(row);				
				iRow++;
			}				
			
			for(CajaIngreso cajaingresoAux:cajaingresosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajaIngreso(cajaingresoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajaIngresosSeleccionados() throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();		
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingreso.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajaingresos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajaingreso");
			//elementRoot.appendChild(element);
		
			for(CajaIngreso cajaingresoAux:cajaingresosSeleccionados) {
				element = document.createElement("cajaingreso");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajaIngreso(cajaingresoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajaIngreso(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoConstantesFunciones.LABEL_HORA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajaIngreso(CajaIngreso cajaingreso,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.getturnopunven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingreso.gethora());				
	}
	
	public void setFilaDatosExportarXmlCajaIngreso(CajaIngreso cajaingreso,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajaIngresoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajaingreso.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajaIngresoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajaingreso.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CajaIngresoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajaingreso.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CajaIngresoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cajaingreso.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(CajaIngresoConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(cajaingreso.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementcaja_descripcion = document.createElement(CajaIngresoConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(cajaingreso.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementturnopunven_descripcion = document.createElement(CajaIngresoConstantesFunciones.IDTURNOPUNVEN);
		elementturnopunven_descripcion.appendChild(document.createTextNode(cajaingreso.getturnopunven_descripcion()));
		element.appendChild(elementturnopunven_descripcion);

		Element elementsecuencial = document.createElement(CajaIngresoConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(cajaingreso.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha = document.createElement(CajaIngresoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(cajaingreso.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementhora = document.createElement(CajaIngresoConstantesFunciones.HORA);
		elementhora.appendChild(document.createTextNode(cajaingreso.gethora().toString().trim()));
		element.appendChild(elementhora);
	}
	
	public void generarReporteGroupGenericoCajaIngresosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CajaIngreso> cajaingresosSeleccionados=new ArrayList<CajaIngreso>();
		
		cajaingresosSeleccionados=this.getCajaIngresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoCajaIngreso(cajaingresosSeleccionados);
		
		this.generarReporteCajaIngresos("Todos",cajaingresosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajaIngreso(ArrayList<CajaIngreso> cajaingresosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CajaIngreso cajaingresoAux:cajaingresosSeleccionados) {
				cajaingresoAux.setsDetalleGeneralEntityReporte(cajaingresoAux.toString());
			
				if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajaingresoAux.setsDescripcionGeneralEntityReporte1(cajaingresoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cajaingresoAux.setsDescripcionGeneralEntityReporte1(cajaingresoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					cajaingresoAux.setsDescripcionGeneralEntityReporte1(cajaingresoAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					cajaingresoAux.setsDescripcionGeneralEntityReporte1(cajaingresoAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN)) {
					existe=true;
					cajaingresoAux.setsDescripcionGeneralEntityReporte1(cajaingresoAux.getturnopunven_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					cajaingresoAux.setsDescripcionGeneralEntityReporte1(cajaingresoAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					cajaingresoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajaingresoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoConstantesFunciones.LABEL_HORA)) {
					existe=true;
					cajaingresoAux.setsDescripcionGeneralEntityReporte1(cajaingresoAux.gethora().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajaIngreso(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajaIngreso=true;
				this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=true;
				this.isVisibilidadCeldaGuardarCambiosCajaIngreso=true;
			}
			
			this.isVisibilidadCeldaModificarCajaIngreso=false;
			this.isVisibilidadCeldaActualizarCajaIngreso=false;
			this.isVisibilidadCeldaEliminarCajaIngreso=false;
			this.isVisibilidadCeldaCancelarCajaIngreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngreso=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajaIngreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=false;
			this.isVisibilidadCeldaModificarCajaIngreso=false;
			this.isVisibilidadCeldaActualizarCajaIngreso=true;
			this.isVisibilidadCeldaEliminarCajaIngreso=false;
			this.isVisibilidadCeldaCancelarCajaIngreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngreso=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajaIngreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=false;
			this.isVisibilidadCeldaModificarCajaIngreso=false;
			this.isVisibilidadCeldaActualizarCajaIngreso=true;
			this.isVisibilidadCeldaEliminarCajaIngreso=true;
			this.isVisibilidadCeldaCancelarCajaIngreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngreso=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajaIngreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=false;
			this.isVisibilidadCeldaModificarCajaIngreso=false;
			this.isVisibilidadCeldaActualizarCajaIngreso=true;
			this.isVisibilidadCeldaEliminarCajaIngreso=false;
			this.isVisibilidadCeldaCancelarCajaIngreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajaIngreso=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=true;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=true;
			this.isVisibilidadCeldaModificarCajaIngreso=false;
			this.isVisibilidadCeldaActualizarCajaIngreso=false;
			this.isVisibilidadCeldaEliminarCajaIngreso=false;
			this.isVisibilidadCeldaCancelarCajaIngreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngreso=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajaIngreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=false;
			this.isVisibilidadCeldaActualizarCajaIngreso=false;
			this.isVisibilidadCeldaEliminarCajaIngreso=false;
			this.isVisibilidadCeldaCancelarCajaIngreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajaIngreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=false;
			this.isVisibilidadCeldaModificarCajaIngreso=true;
			this.isVisibilidadCeldaActualizarCajaIngreso=false;
			this.isVisibilidadCeldaEliminarCajaIngreso=false;
			this.isVisibilidadCeldaCancelarCajaIngreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngreso=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajaIngresoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajaIngreso=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=true;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=true;
		} else {
			this.actualizarEstadoPanelsCajaIngreso(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajaIngreso=false;
			//this.isVisibilidadCeldaVerFormCajaIngreso=false;
			this.isVisibilidadCeldaDuplicarCajaIngreso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajaingresoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
		} else {
			this.isVisibilidadCeldaNuevoCajaIngreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngreso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajaingresoSessionBean.getEsGuardarRelacionado()) {
			if(!cajaingresoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;												
			}
			
			this.jButtonCerrarCajaIngreso.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajaIngreso=false;
		}
		
		if(!this.permiteMantenimiento(this.cajaingreso)) {
			this.isVisibilidadCeldaActualizarCajaIngreso=false;
			this.isVisibilidadCeldaEliminarCajaIngreso=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajaIngreso() {
		this.isVisibilidadCeldaNuevoCajaIngreso=false;
		this.isVisibilidadCeldaGuardarCambiosCajaIngreso=false;
	}
	
	public void actualizarEstadoPanelsCajaIngreso(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajaIngreso!=null) {
				this.jScrollPanelDatosEdicionCajaIngreso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngreso!=null) {
				this.jScrollPanelDatosCajaIngreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaIngreso!=null) {
				this.jPanelPaginacionCajaIngreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajaIngreso!=null) {
				this.jScrollPanelDatosEdicionCajaIngreso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajaIngreso!=null) {
				this.jScrollPanelDatosCajaIngreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaIngreso!=null) {
				this.jPanelPaginacionCajaIngreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajaIngreso!=null) {
				this.jScrollPanelDatosEdicionCajaIngreso.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngreso!=null) {
				this.jScrollPanelDatosCajaIngreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaIngreso!=null) {
				this.jPanelPaginacionCajaIngreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajaIngreso!=null) {
				this.jScrollPanelDatosEdicionCajaIngreso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngreso!=null) {
				this.jScrollPanelDatosCajaIngreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaIngreso!=null) {
				this.jPanelPaginacionCajaIngreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajaIngreso!=null) {
				this.jScrollPanelDatosEdicionCajaIngreso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngreso!=null) {
				this.jScrollPanelDatosCajaIngreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaIngreso!=null) {
				this.jPanelPaginacionCajaIngreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajaIngreso!=null) {
				this.jScrollPanelDatosEdicionCajaIngreso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngreso!=null) {
				this.jScrollPanelDatosCajaIngreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaIngreso!=null) {
				this.jPanelPaginacionCajaIngreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajaIngreso!=null) {
				this.jScrollPanelDatosEdicionCajaIngreso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngreso!=null) {
				this.jScrollPanelDatosCajaIngreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaIngreso!=null) {
				this.jPanelPaginacionCajaIngreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
					this.jTabbedPaneBusquedasCajaIngreso.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngreso!=null) {
				this.jTabbedPaneBusquedasCajaIngreso.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajaIngreso!=null) {
				this.jPanelParametrosReportesCajaIngreso.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdCajaCajaIngreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdTurnoPunVenCajaIngreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCaja=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdCajaCajaIngreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdTurnoPunVenCajaIngreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdCaja=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdCajaCajaIngreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdTurnoPunVenCajaIngreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadFK_IdCaja=isParaCaja;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdCajaCajaIngreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaCajaNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdTurnoPunVenCajaIngreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaTurnoPunVen(Boolean isParaTurnoPunVen){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTurnoPunVenNegation=!isParaTurnoPunVen;

			this.isVisibilidadFK_IdCaja=isParaTurnoPunVenNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdCajaCajaIngreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaTurnoPunVen;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaIngreso.remove(jPanelFK_IdTurnoPunVenCajaIngreso);}
		}
		
	}
	
	

	public String registrarSesionCajaIngresoParaCajaIngresoDetalles() throws Exception {
		Boolean isPaginaPopupCajaIngresoDetalle=false;

		try {

			if(this.cajaingresoSessionBean==null) {
				this.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean==null) {
				this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean.setsPathNavegacionActual(cajaingresoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle(true);
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle(CajaIngresoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean.setisBusquedaDesdeForeignKeySesionCajaIngreso(true);
			this.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleSessionBean.setlidCajaIngresoActual(this.idCajaIngresoActual);

			cajaingresoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCajaIngreso(true);
			cajaingresoSessionBean.setlIdCajaIngresoActualForeignKey(this.idCajaIngresoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CajaIngresoSessionBean cajaingresoSessionBean=new CajaIngresoSessionBean();
		
		if(this.cajaingresoSessionBean==null) {
			this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		}
		
		this.cajaingresoSessionBean.setsUltimaBusquedaCajaIngreso(this.getsAccionBusqueda());
		this.cajaingresoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cajaingresoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
			cajaingresoSessionBean.setid_caja(this.getid_cajaFK_IdCaja());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cajaingresoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cajaingresoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTurnoPunVen")) {
			cajaingresoSessionBean.setid_turno_pun_ven(this.getid_turno_pun_venFK_IdTurnoPunVen());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			cajaingresoSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CajaIngresoSessionBean cajaingresoSessionBean=new CajaIngresoSessionBean();
		
		if(this.cajaingresoSessionBean==null) {
			this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		}
		
		if(this.cajaingresoSessionBean.getsUltimaBusquedaCajaIngreso()!=null&&!this.cajaingresoSessionBean.getsUltimaBusquedaCajaIngreso().equals("")) {
			this.setsAccionBusqueda(cajaingresoSessionBean.getsUltimaBusquedaCajaIngreso());
			this.setiNumeroPaginacion(cajaingresoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cajaingresoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
				this.setid_cajaFK_IdCaja(cajaingresoSessionBean.getid_caja());
				cajaingresoSessionBean.setid_caja(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cajaingresoSessionBean.getid_empresa());
				cajaingresoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cajaingresoSessionBean.getid_sucursal());
				cajaingresoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTurnoPunVen")) {
				this.setid_turno_pun_venFK_IdTurnoPunVen(cajaingresoSessionBean.getid_turno_pun_ven());
				cajaingresoSessionBean.setid_turno_pun_ven(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(cajaingresoSessionBean.getid_usuario());
				cajaingresoSessionBean.setid_usuario(-1L);
			}
		}
		
		this.cajaingresoSessionBean.setsUltimaBusquedaCajaIngreso("");
		this.cajaingresoSessionBean.setiNumeroPaginacion(CajaIngresoConstantesFunciones.INUMEROPAGINACION);
		this.cajaingresoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajaIngreso(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajaIngreso() {
		this.updateBorderResaltarBusquedasFormularioCajaIngreso();
		this.updateVisibilidadBusquedasFormularioCajaIngreso();
		this.updateHabilitarBusquedasFormularioCajaIngreso();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajaIngreso() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajaIngreso.getComponents().length>0) {
	

		if(this.cajaingresoConstantesFunciones.resaltarFK_IdCajaCajaIngreso!=null) {
			index= this.jTabbedPaneBusquedasCajaIngreso.indexOfComponent(this.jPanelFK_IdCajaCajaIngreso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngreso.getComponent(index);
				jPanel.setBorder(this.cajaingresoConstantesFunciones.resaltarFK_IdCajaCajaIngreso);
			}
		}

		if(this.cajaingresoConstantesFunciones.resaltarFK_IdTurnoPunVenCajaIngreso!=null) {
			index= this.jTabbedPaneBusquedasCajaIngreso.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajaIngreso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngreso.getComponent(index);
				jPanel.setBorder(this.cajaingresoConstantesFunciones.resaltarFK_IdTurnoPunVenCajaIngreso);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajaIngreso() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajaIngreso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaIngreso.indexOfComponent(this.jPanelFK_IdCajaCajaIngreso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngreso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaingresoConstantesFunciones.mostrarFK_IdCajaCajaIngreso);
			if(!this.cajaingresoConstantesFunciones.mostrarFK_IdCajaCajaIngreso && index>-1) {
				this.jTabbedPaneBusquedasCajaIngreso.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajaIngreso.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajaIngreso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngreso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaingresoConstantesFunciones.mostrarFK_IdTurnoPunVenCajaIngreso);
			if(!this.cajaingresoConstantesFunciones.mostrarFK_IdTurnoPunVenCajaIngreso && index>-1) {
				this.jTabbedPaneBusquedasCajaIngreso.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajaIngreso() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajaIngreso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaIngreso.indexOfComponent(this.jPanelFK_IdCajaCajaIngreso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngreso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaingresoConstantesFunciones.activarFK_IdCajaCajaIngreso);
				this.jTabbedPaneBusquedasCajaIngreso.setEnabledAt(index,this.cajaingresoConstantesFunciones.activarFK_IdCajaCajaIngreso);
			}

			index= this.jTabbedPaneBusquedasCajaIngreso.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajaIngreso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngreso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaingresoConstantesFunciones.activarFK_IdTurnoPunVenCajaIngreso);
				this.jTabbedPaneBusquedasCajaIngreso.setEnabledAt(index,this.cajaingresoConstantesFunciones.activarFK_IdTurnoPunVenCajaIngreso);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajaIngreso(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCaja")) {
			index= this.jTabbedPaneBusquedasCajaIngreso.indexOfComponent(this.jPanelFK_IdCajaCajaIngreso);

			this.jTabbedPaneBusquedasCajaIngreso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngreso.getComponent(index);

			this.cajaingresoConstantesFunciones.setResaltarFK_IdCajaCajaIngreso(resaltar);

			jPanel.setBorder(this.cajaingresoConstantesFunciones.resaltarFK_IdCajaCajaIngreso);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTurnoPunVen")) {
			index= this.jTabbedPaneBusquedasCajaIngreso.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajaIngreso);

			this.jTabbedPaneBusquedasCajaIngreso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngreso.getComponent(index);

			this.cajaingresoConstantesFunciones.setResaltarFK_IdTurnoPunVenCajaIngreso(resaltar);

			jPanel.setBorder(this.cajaingresoConstantesFunciones.resaltarFK_IdTurnoPunVenCajaIngreso);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajaIngreso.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioCajaIngreso() throws Exception {

		if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajaIngreso();
		this.updateVisibilidadResaltarControlesFormularioCajaIngreso();
		this.updateHabilitarResaltarControlesFormularioCajaIngreso();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajaIngreso() throws Exception {
		if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajaingresoConstantesFunciones.resaltaridCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltaridCajaIngreso);}
		if(this.cajaingresoConstantesFunciones.resaltarid_empresaCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltarid_empresaCajaIngreso);}
		if(this.cajaingresoConstantesFunciones.resaltarid_sucursalCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltarid_sucursalCajaIngreso);}
		if(this.cajaingresoConstantesFunciones.resaltarid_usuarioCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltarid_usuarioCajaIngreso);}
		if(this.cajaingresoConstantesFunciones.resaltarid_cajaCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltarid_cajaCajaIngreso);}
		if(this.cajaingresoConstantesFunciones.resaltarid_turno_pun_venCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltarid_turno_pun_venCajaIngreso);}
		if(this.cajaingresoConstantesFunciones.resaltarsecuencialCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jTextFieldsecuencialCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltarsecuencialCajaIngreso);}
		if(this.cajaingresoConstantesFunciones.resaltarfechaCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jDateChooserfechaCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltarfechaCajaIngreso);}
		if(this.cajaingresoConstantesFunciones.resaltarhoraCajaIngreso!=null && this.jInternalFrameDetalleFormCajaIngreso!=null) {this.jInternalFrameDetalleFormCajaIngreso.jSpinnerhoraCajaIngreso.setBorder(this.cajaingresoConstantesFunciones.resaltarhoraCajaIngreso);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajaIngreso() throws Exception {		
		if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
	
		//this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostraridCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelidCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostraridCajaIngreso);
		//this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_empresaCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelid_empresaCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_empresaCajaIngreso);
		//this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_sucursalCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelid_sucursalCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_sucursalCajaIngreso);
		//this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_usuarioCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelid_usuarioCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_usuarioCajaIngreso);
		//this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_cajaCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelid_cajaCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_cajaCajaIngreso);
		//this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_turno_pun_venCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelid_turno_pun_venCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarid_turno_pun_venCajaIngreso);
		//this.jInternalFrameDetalleFormCajaIngreso.jTextFieldsecuencialCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarsecuencialCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelsecuencialCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarsecuencialCajaIngreso);
		//this.jInternalFrameDetalleFormCajaIngreso.jDateChooserfechaCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarfechaCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelfechaCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarfechaCajaIngreso);
		//this.jInternalFrameDetalleFormCajaIngreso.jSpinnerhoraCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarhoraCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jPanelhoraCajaIngreso.setVisible(this.cajaingresoConstantesFunciones.mostrarhoraCajaIngreso);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajaIngreso() throws Exception {
		if(this.jInternalFrameDetalleFormCajaIngreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaIngreso!=null) {
	
		this.jInternalFrameDetalleFormCajaIngreso.jLabelidCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activaridCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_empresaCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activarid_empresaCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_sucursalCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activarid_sucursalCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_usuarioCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activarid_usuarioCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_cajaCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activarid_cajaCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jComboBoxid_turno_pun_venCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activarid_turno_pun_venCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jTextFieldsecuencialCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activarsecuencialCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jDateChooserfechaCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activarfechaCajaIngreso);
		this.jInternalFrameDetalleFormCajaIngreso.jSpinnerhoraCajaIngreso.setEnabled(this.cajaingresoConstantesFunciones.activarhoraCajaIngreso);
		}
	}
	
		
}