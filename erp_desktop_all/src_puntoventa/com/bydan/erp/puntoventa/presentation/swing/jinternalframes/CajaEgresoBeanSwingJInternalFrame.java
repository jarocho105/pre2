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

import com.bydan.erp.puntoventa.util.CajaEgresoConstantesFunciones;
import com.bydan.erp.puntoventa.util.CajaEgresoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CajaEgresoParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.CajaEgresoBean;
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
public class CajaEgresoBeanSwingJInternalFrame extends CajaEgresoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajaEgresoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CajaEgreso> cajaegresoValidator = new ClassValidator<CajaEgreso>(CajaEgreso.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CajaEgreso cajaegreso;	
	public CajaEgreso cajaegresoAux;
	public CajaEgreso cajaegresoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CajaEgreso cajaegresoTotales;
	public Long idCajaEgresoActual;
	public Long iIdNuevoCajaEgreso=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCajaEgresoDetalle=false;

	public Boolean getIsTienePermisosCajaEgresoDetalle() {
		return isTienePermisosCajaEgresoDetalle;
	}

	public void setIsTienePermisosCajaEgresoDetalle(Boolean isTienePermisosCajaEgresoDetalle) {
		this.isTienePermisosCajaEgresoDetalle= isTienePermisosCajaEgresoDetalle;
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
	
	public Boolean isPermisoTodoCajaEgreso;
	public Boolean isPermisoNuevoCajaEgreso;
	public Boolean isPermisoActualizarCajaEgreso;
	public Boolean isPermisoActualizarOriginalCajaEgreso;
	public Boolean isPermisoEliminarCajaEgreso;
	public Boolean isPermisoGuardarCambiosCajaEgreso;
	public Boolean isPermisoConsultaCajaEgreso;
	public Boolean isPermisoBusquedaCajaEgreso;
	public Boolean isPermisoReporteCajaEgreso;
	public Boolean isPermisoPaginacionMedioCajaEgreso;
	public Boolean isPermisoPaginacionAltoCajaEgreso;
	public Boolean isPermisoPaginacionTodoCajaEgreso;
	public Boolean isPermisoCopiarCajaEgreso;
	public Boolean isPermisoVerFormCajaEgreso;
	public Boolean isPermisoDuplicarCajaEgreso;
	public Boolean isPermisoOrdenCajaEgreso;
	
	
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
	
	public CajaEgresoParameterReturnGeneral cajaegresoReturnGeneral;
	public CajaEgresoParameterReturnGeneral cajaegresoParameterGeneral;
	
	

	public CajaEgresoDetalleLogic cajaegresodetalleLogic=null;

	public CajaEgresoDetalleLogic getCajaEgresoDetalleLogic() {
		return cajaegresodetalleLogic;
	}

	public void setCajaEgresoDetalleLogic(CajaEgresoDetalleLogic cajaegresodetalleLogic) {
		this.cajaegresodetalleLogic = cajaegresodetalleLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajaEgreso=false;
	public Boolean esParaAccionDesdeFormularioCajaEgreso=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajaEgresoSessionBeanAdditional cajaegresoSessionBeanAdditional=null;
	
	public CajaEgresoSessionBeanAdditional getCajaEgresoSessionBeanAdditional() {
		return this.cajaegresoSessionBeanAdditional;
	}
	
	public void setCajaEgresoSessionBeanAdditional(CajaEgresoSessionBeanAdditional cajaegresoSessionBeanAdditional) {
		try {
			this.cajaegresoSessionBeanAdditional=cajaegresoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajaEgresoBeanSwingJInternalFrameAdditional cajaegresoBeanSwingJInternalFrameAdditional=null;
	//public class CajaEgresoBeanSwingJInternalFrame
	
	public CajaEgresoBeanSwingJInternalFrameAdditional getCajaEgresoBeanSwingJInternalFrameAdditional() {
		return this.cajaegresoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajaEgresoBeanSwingJInternalFrameAdditional(CajaEgresoBeanSwingJInternalFrameAdditional cajaegresoBeanSwingJInternalFrameAdditional) {
		try {
			this.cajaegresoBeanSwingJInternalFrameAdditional=cajaegresoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajaEgresoLogic cajaegresoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CajaEgreso cajaegresoBean;
	public CajaEgresoConstantesFunciones cajaegresoConstantesFunciones;
	//public CajaEgresoParameterReturnGeneral cajaegresoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public CajaLogic cajaLogic;
	public TurnoPunVenLogic turnopunvenLogic;
	
	//PARAMETROS
	
	
	//public List<CajaEgreso> cajaegresos;	
	//public List<CajaEgreso> cajaegresosEliminados;
	//public List<CajaEgreso> cajaegresosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajaEgreso=false;
	public Boolean isVisibilidadCeldaDuplicarCajaEgreso=true;
	public Boolean isVisibilidadCeldaCopiarCajaEgreso=true;
	public Boolean isVisibilidadCeldaVerFormCajaEgreso=true;
	public Boolean isVisibilidadCeldaOrdenCajaEgreso=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
	public Boolean isVisibilidadCeldaModificarCajaEgreso=false;
	public Boolean isVisibilidadCeldaActualizarCajaEgreso=false;
	public Boolean isVisibilidadCeldaEliminarCajaEgreso=false;
	public Boolean isVisibilidadCeldaCancelarCajaEgreso=false;
	public Boolean isVisibilidadCeldaGuardarCajaEgreso=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajaEgreso=false;	
	
	
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTurnoPunVen=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoCajaEgreso() {
		return this.iIdNuevoCajaEgreso;
	}

	public void setiIdNuevoCajaEgreso(Long iIdNuevoCajaEgreso) {
		this.iIdNuevoCajaEgreso = iIdNuevoCajaEgreso;
	}
	
	public Long getidCajaEgresoActual() {
		return this.idCajaEgresoActual;
	}

	public void setidCajaEgresoActual(Long idCajaEgresoActual) {
		this.idCajaEgresoActual = idCajaEgresoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CajaEgreso getcajaegreso() {
		return this.cajaegreso;
	}

	public void setcajaegreso(CajaEgreso cajaegreso) {
		this.cajaegreso = cajaegreso;
	}
	
	public CajaEgreso getcajaegresoAux() {
		return this.cajaegresoAux;
	}

	public void setcajaegresoAux(CajaEgreso cajaegresoAux) {
		this.cajaegresoAux = cajaegresoAux;
	}				
	
	public CajaEgreso getcajaegresoAnterior() {
		return this.cajaegresoAnterior;
	}

	public void setcajaegresoAnterior(CajaEgreso cajaegresoAnterior) {
		this.cajaegresoAnterior = cajaegresoAnterior;
	}	
	
	public CajaEgreso getcajaegresoTotales() {
		return this.cajaegresoTotales;
	}

	public void setcajaegresoTotales(CajaEgreso cajaegresoTotales) {
		this.cajaegresoTotales = cajaegresoTotales;
	}	
	
	public CajaEgreso getcajaegresoBean() {
		return this.cajaegresoBean;
	}

	public void setcajaegresoBean(CajaEgreso cajaegresoBean) {
		this.cajaegresoBean = cajaegresoBean;
	}	
	
	public CajaEgresoParameterReturnGeneral getcajaegresoReturnGeneral() {
		return this.cajaegresoReturnGeneral;
	}

	public void setcajaegresoReturnGeneral(CajaEgresoParameterReturnGeneral cajaegresoReturnGeneral) {
		this.cajaegresoReturnGeneral = cajaegresoReturnGeneral;
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
	
	
	public CajaEgresoLogic getCajaEgresoLogic()	{		
		return cajaegresoLogic;
	}

	public void setCajaEgresoLogic(CajaEgresoLogic cajaegresoLogic) {
		this.cajaegresoLogic = cajaegresoLogic;
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
	
	public Boolean getIsEsNuevoCajaEgreso() {
		return isEsNuevoCajaEgreso;
	}

	public void setIsEsNuevoCajaEgreso(Boolean isEsNuevoCajaEgreso) {
		this.isEsNuevoCajaEgreso = isEsNuevoCajaEgreso;
	}

	public Boolean getEsParaAccionDesdeFormularioCajaEgreso() {
		return esParaAccionDesdeFormularioCajaEgreso;
	}
	
	public void setEsParaAccionDesdeFormularioCajaEgreso(Boolean esParaAccionDesdeFormularioCajaEgreso) {
		this.esParaAccionDesdeFormularioCajaEgreso = esParaAccionDesdeFormularioCajaEgreso;
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

			if(this.cajaegresoSessionBean==null) {
				this.cajaegresoSessionBean=new CajaEgresoSessionBean();
			}

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cajaegresoSessionBean.getlidEmpresaActual());
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

			if(this.cajaegresoSessionBean==null) {
				this.cajaegresoSessionBean=new CajaEgresoSessionBean();
			}

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cajaegresoSessionBean.getlidSucursalActual());
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

			if(this.cajaegresoSessionBean==null) {
				this.cajaegresoSessionBean=new CajaEgresoSessionBean();
			}

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(cajaegresoSessionBean.getlidUsuarioActual());
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

			if(this.cajaegresoSessionBean==null) {
				this.cajaegresoSessionBean=new CajaEgresoSessionBean();
			}

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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
					cajaLogic.getEntityWithConnection(cajaegresoSessionBean.getlidCajaActual());
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

			if(this.cajaegresoSessionBean==null) {
				this.cajaegresoSessionBean=new CajaEgresoSessionBean();
			}

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {
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
					turnopunvenLogic.getEntityWithConnection(cajaegresoSessionBean.getlidTurnoPunVenActual());
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

					if(this.cajaegreso!=null) {
						this.cajaegreso.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajaEgreso.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajaEgresoGenerico)throws Exception
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
				jComboBoxid_empresaCajaEgresoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajaEgresoGenerico!=null && jComboBoxid_empresaCajaEgresoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajaEgresoGenerico.setSelectedIndex(0);
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

					if(this.cajaegreso!=null) {
						this.cajaegreso.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCajaEgreso.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCajaEgresoGenerico)throws Exception
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
				jComboBoxid_sucursalCajaEgresoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCajaEgresoGenerico!=null && jComboBoxid_sucursalCajaEgresoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCajaEgresoGenerico.setSelectedIndex(0);
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

					if(this.cajaegreso!=null) {
						this.cajaegreso.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioCajaEgreso.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioCajaEgresoGenerico)throws Exception
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
				jComboBoxid_usuarioCajaEgresoGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioCajaEgresoGenerico!=null && jComboBoxid_usuarioCajaEgresoGenerico.getItemCount()>0) {
					jComboBoxid_usuarioCajaEgresoGenerico.setSelectedIndex(0);
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

					if(this.cajaegreso!=null) {
						this.cajaegreso.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaCajaEgreso.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaTemp!=null && jComboBoxid_cajaFK_IdCajaCajaEgreso!=null) {
						jComboBoxid_cajaFK_IdCajaCajaEgreso.setSelectedItem(cajaTemp);
					} else {
						if(jComboBoxid_cajaFK_IdCajaCajaEgreso!=null) {
							//jComboBoxid_cajaFK_IdCajaCajaEgreso.setSelectedItem(cajaTemp);
							if(jComboBoxid_cajaFK_IdCajaCajaEgreso.getItemCount()>0) {
								jComboBoxid_cajaFK_IdCajaCajaEgreso.setSelectedIndex(0);
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
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaCajaEgresoGenerico)throws Exception
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
				jComboBoxid_cajaCajaEgresoGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaCajaEgresoGenerico!=null && jComboBoxid_cajaCajaEgresoGenerico.getItemCount()>0) {
					jComboBoxid_cajaCajaEgresoGenerico.setSelectedIndex(0);
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

					if(this.cajaegreso!=null) {
						this.cajaegreso.setTurnoPunVen(turnopunvenTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setSelectedItem(turnopunvenTemp);
					}
				} else {
					//jComboBoxid_turno_pun_venCajaEgreso.setSelectedItem(turnopunvenTemp);
					if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
						if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTurnoPunVen") || sFormularioTipoBusqueda.equals("Todos")){
					if(turnopunvenTemp!=null && jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso!=null) {
						jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setSelectedItem(turnopunvenTemp);
					} else {
						if(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso!=null) {
							//jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setSelectedItem(turnopunvenTemp);
							if(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.getItemCount()>0) {
								jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setSelectedIndex(0);
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
	public void setActualTurnoPunVenForeignKeyGenerico(Long idTurnoPunVenSeleccionado,JComboBox jComboBoxid_turno_pun_venCajaEgresoGenerico)throws Exception
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
				jComboBoxid_turno_pun_venCajaEgresoGenerico.setSelectedItem(turnopunvenTemp);
			} else {
				if(jComboBoxid_turno_pun_venCajaEgresoGenerico!=null && jComboBoxid_turno_pun_venCajaEgresoGenerico.getItemCount()>0) {
					jComboBoxid_turno_pun_venCajaEgresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CajaEgreso cajaegreso,JComboBox jComboBoxid_empresaCajaEgresoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajaEgresoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajaEgresoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajaegreso.setid_empresa(empresaAux.getId());
				cajaegreso.setempresa_descripcion(CajaEgresoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajaegreso.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CajaEgreso cajaegreso,JComboBox jComboBoxid_sucursalCajaEgresoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCajaEgresoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCajaEgresoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cajaegreso.setid_sucursal(sucursalAux.getId());
				cajaegreso.setsucursal_descripcion(CajaEgresoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cajaegreso.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(CajaEgreso cajaegreso,JComboBox jComboBoxid_usuarioCajaEgresoGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioCajaEgresoGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioCajaEgresoGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				cajaegreso.setid_usuario(usuarioAux.getId());
				cajaegreso.setusuario_descripcion(CajaEgresoConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				cajaegreso.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(CajaEgreso cajaegreso,JComboBox jComboBoxid_cajaCajaEgresoGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaCajaEgresoGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaCajaEgresoGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				cajaegreso.setid_caja(cajaAux.getId());
				cajaegreso.setcaja_descripcion(CajaEgresoConstantesFunciones.getCajaDescripcion(cajaAux));
				cajaegreso.setCaja(cajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTurnoPunVenForeignKey(CajaEgreso cajaegreso,JComboBox jComboBoxid_turno_pun_venCajaEgresoGenerico)throws Exception
	{
		try
		{
			TurnoPunVen  turnopunvenAux=new TurnoPunVen();

			if(jComboBoxid_turno_pun_venCajaEgresoGenerico==null) {
				turnopunvenAux=(TurnoPunVen)this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.getSelectedItem();
			} else {
				turnopunvenAux=(TurnoPunVen)jComboBoxid_turno_pun_venCajaEgresoGenerico.getSelectedItem();
			}

			if(turnopunvenAux!=null && turnopunvenAux.getId()!=null) {
				cajaegreso.setid_turno_pun_ven(turnopunvenAux.getId());
				cajaegreso.setturnopunven_descripcion(CajaEgresoConstantesFunciones.getTurnoPunVenDescripcion(turnopunvenAux));
				cajaegreso.setTurnoPunVen(turnopunvenAux);			}
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

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
					}

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
					}

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
					}

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
					}

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cajaFK_IdCajaCajaEgreso.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jComboBoxid_cajaFK_IdCajaCajaEgreso.addItem(caja);
							}
						}

						if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.removeAllItems();

							for(TurnoPunVen turnopunven:this.turnopunvensForeignKey) {
								this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.addItem(turnopunven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgreso!=null) { 
					}

					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTurnoPunVen") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.removeAllItems();

							for(TurnoPunVen turnopunven:this.turnopunvensForeignKey) {
								this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.addItem(turnopunven);
							}
						}

						if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cajaFK_IdCajaCajaEgreso.setSelectedItem(caja);
						} else {
							this.jComboBoxid_cajaFK_IdCajaCajaEgreso.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setSelectedItem(turnopunven);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setSelectedItem(turnopunven);
						} else {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCajaEgreso() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CajaEgresoConstantesFunciones.refrescarForeignKeysDescripcionesCajaEgreso(this.cajaegresoLogic.getCajaEgresos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CajaEgresoConstantesFunciones.refrescarForeignKeysDescripcionesCajaEgreso(this.cajaegresos);
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
			//cajaegresoLogic.setCajaEgresos(this.cajaegresos);
			cajaegresoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CajaEgresoParameterReturnGeneral getCajaEgresoParameterGeneral() {
		return this.cajaegresoParameterGeneral;
	}
	
	public void setCajaEgresoParameterGeneral(CajaEgresoParameterReturnGeneral cajaegresoParameterGeneral) {
		this.cajaegresoParameterGeneral = cajaegresoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCajaEgreso() {
		return isPermisoTodoCajaEgreso;
	}

	public void setIsPermisoTodoCajaEgreso(Boolean isPermisoTodoCajaEgreso) {
		this.isPermisoTodoCajaEgreso = isPermisoTodoCajaEgreso;
	}

	public Boolean getIsPermisoNuevoCajaEgreso() {
		return isPermisoNuevoCajaEgreso;
	}

	public void setIsPermisoNuevoCajaEgreso(Boolean isPermisoNuevoCajaEgreso) {
		this.isPermisoNuevoCajaEgreso = isPermisoNuevoCajaEgreso;
	}

	public Boolean getIsPermisoActualizarCajaEgreso() {
		return isPermisoActualizarCajaEgreso;
	}

	public void setIsPermisoActualizarCajaEgreso(Boolean isPermisoActualizarCajaEgreso) {
		this.isPermisoActualizarCajaEgreso = isPermisoActualizarCajaEgreso;
	}

	public Boolean getIsPermisoEliminarCajaEgreso() {
		return isPermisoEliminarCajaEgreso;
	}

	public void setIsPermisoEliminarCajaEgreso(Boolean isPermisoEliminarCajaEgreso) {
		this.isPermisoEliminarCajaEgreso = isPermisoEliminarCajaEgreso;
	}

	public Boolean getIsPermisoGuardarCambiosCajaEgreso() {
		return isPermisoGuardarCambiosCajaEgreso;
	}

	public void setIsPermisoGuardarCambiosCajaEgreso(Boolean isPermisoGuardarCambiosCajaEgreso) {
		this.isPermisoGuardarCambiosCajaEgreso = isPermisoGuardarCambiosCajaEgreso;
	}
	
	public Boolean getIsPermisoConsultaCajaEgreso() {
		return isPermisoConsultaCajaEgreso;
	}

	public void setIsPermisoConsultaCajaEgreso(Boolean isPermisoConsultaCajaEgreso) {
		this.isPermisoConsultaCajaEgreso = isPermisoConsultaCajaEgreso;
	}

	public Boolean getIsPermisoBusquedaCajaEgreso() {
		return isPermisoBusquedaCajaEgreso;
	}

	public void setIsPermisoBusquedaCajaEgreso(Boolean isPermisoBusquedaCajaEgreso) {
		this.isPermisoBusquedaCajaEgreso = isPermisoBusquedaCajaEgreso;
	}

	public Boolean getIsPermisoReporteCajaEgreso() {
		return isPermisoReporteCajaEgreso;
	}

	public void setIsPermisoReporteCajaEgreso(Boolean isPermisoReporteCajaEgreso) {
		this.isPermisoReporteCajaEgreso = isPermisoReporteCajaEgreso;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajaEgreso() {
		return isPermisoPaginacionMedioCajaEgreso;
	}

	public void setIsPermisoPaginacionMedioCajaEgreso(Boolean isPermisoPaginacionMedioCajaEgreso) {
		this.isPermisoPaginacionMedioCajaEgreso = isPermisoPaginacionMedioCajaEgreso;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajaEgreso() {
		return isPermisoPaginacionTodoCajaEgreso;
	}

	public void setIsPermisoPaginacionTodoCajaEgreso(Boolean isPermisoPaginacionTodoCajaEgreso) {
		this.isPermisoPaginacionTodoCajaEgreso = isPermisoPaginacionTodoCajaEgreso;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajaEgreso() {
		return isPermisoPaginacionAltoCajaEgreso;
	}

	public void setIsPermisoPaginacionAltoCajaEgreso(Boolean isPermisoPaginacionAltoCajaEgreso) {
		this.isPermisoPaginacionAltoCajaEgreso = isPermisoPaginacionAltoCajaEgreso;
	}
	
	public Boolean getIsPermisoCopiarCajaEgreso() {
		return isPermisoCopiarCajaEgreso;
	}

	public void setIsPermisoCopiarCajaEgreso(Boolean isPermisoCopiarCajaEgreso) {
		this.isPermisoCopiarCajaEgreso = isPermisoCopiarCajaEgreso;
	}
	
	public Boolean getIsPermisoVerFormCajaEgreso() {
		return isPermisoVerFormCajaEgreso;
	}

	public void setIsPermisoVerFormCajaEgreso(Boolean isPermisoVerFormCajaEgreso) {
		this.isPermisoVerFormCajaEgreso = isPermisoVerFormCajaEgreso;
	}
	
	public Boolean getIsPermisoDuplicarCajaEgreso() {
		return isPermisoDuplicarCajaEgreso;
	}

	public void setIsPermisoDuplicarCajaEgreso(Boolean isPermisoDuplicarCajaEgreso) {
		this.isPermisoDuplicarCajaEgreso = isPermisoDuplicarCajaEgreso;
	}
	
	public Boolean getIsPermisoOrdenCajaEgreso() {
		return isPermisoOrdenCajaEgreso;
	}

	public void setIsPermisoOrdenCajaEgreso(Boolean isPermisoOrdenCajaEgreso) {
		this.isPermisoOrdenCajaEgreso = isPermisoOrdenCajaEgreso;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCajaEgreso() {
		return isVisibilidadCeldaNuevoCajaEgreso;
	}

	public void setIsVisibilidadCeldaNuevoCajaEgreso(Boolean isVisibilidadCeldaNuevoCajaEgreso) {
		this.isVisibilidadCeldaNuevoCajaEgreso = isVisibilidadCeldaNuevoCajaEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajaEgreso() {
		return isVisibilidadCeldaDuplicarCajaEgreso;
	}

	public void setIsVisibilidadCeldaDuplicarCajaEgreso(Boolean isVisibilidadCeldaDuplicarCajaEgreso) {
		this.isVisibilidadCeldaDuplicarCajaEgreso = isVisibilidadCeldaDuplicarCajaEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajaEgreso() {
		return isVisibilidadCeldaCopiarCajaEgreso;
	}

	public void setIsVisibilidadCeldaCopiarCajaEgreso(Boolean isVisibilidadCeldaCopiarCajaEgreso) {
		this.isVisibilidadCeldaCopiarCajaEgreso = isVisibilidadCeldaCopiarCajaEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajaEgreso() {
		return isVisibilidadCeldaVerFormCajaEgreso;
	}

	public void setIsVisibilidadCeldaVerFormCajaEgreso(Boolean isVisibilidadCeldaVerFormCajaEgreso) {
		this.isVisibilidadCeldaVerFormCajaEgreso = isVisibilidadCeldaVerFormCajaEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajaEgreso() {
		return isVisibilidadCeldaOrdenCajaEgreso;
	}

	public void setIsVisibilidadCeldaOrdenCajaEgreso(Boolean isVisibilidadCeldaOrdenCajaEgreso) {
		this.isVisibilidadCeldaOrdenCajaEgreso = isVisibilidadCeldaOrdenCajaEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajaEgreso() {
		return isVisibilidadCeldaNuevoRelacionesCajaEgreso;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajaEgreso(Boolean isVisibilidadCeldaNuevoRelacionesCajaEgreso) {
		this.isVisibilidadCeldaNuevoRelacionesCajaEgreso = isVisibilidadCeldaNuevoRelacionesCajaEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajaEgreso() {
		return isVisibilidadCeldaModificarCajaEgreso;
	}

	public void setIsVisibilidadCeldaModificarCajaEgreso(Boolean isVisibilidadCeldaModificarCajaEgreso) {
		this.isVisibilidadCeldaModificarCajaEgreso = isVisibilidadCeldaModificarCajaEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajaEgreso() {
		return isVisibilidadCeldaActualizarCajaEgreso;
	}

	public void setIsVisibilidadCeldaActualizarCajaEgreso(Boolean isVisibilidadCeldaActualizarCajaEgreso) {
		this.isVisibilidadCeldaActualizarCajaEgreso = isVisibilidadCeldaActualizarCajaEgreso;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajaEgreso() {
		return isVisibilidadCeldaEliminarCajaEgreso;
	}

	public void setIsVisibilidadCeldaEliminarCajaEgreso(Boolean isVisibilidadCeldaEliminarCajaEgreso) {
		this.isVisibilidadCeldaEliminarCajaEgreso = isVisibilidadCeldaEliminarCajaEgreso;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajaEgreso() {
		return isVisibilidadCeldaCancelarCajaEgreso;
	}

	public void setIsVisibilidadCeldaCancelarCajaEgreso(Boolean isVisibilidadCeldaCancelarCajaEgreso) {
		this.isVisibilidadCeldaCancelarCajaEgreso = isVisibilidadCeldaCancelarCajaEgreso;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajaEgreso() {
		return isVisibilidadCeldaGuardarCajaEgreso;
	}

	public void setIsVisibilidadCeldaGuardarCajaEgreso(Boolean isVisibilidadCeldaGuardarCajaEgreso) {
		this.isVisibilidadCeldaGuardarCajaEgreso = isVisibilidadCeldaGuardarCajaEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajaEgreso() {
		return isVisibilidadCeldaGuardarCambiosCajaEgreso;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajaEgreso(Boolean isVisibilidadCeldaGuardarCambiosCajaEgreso) {
		this.isVisibilidadCeldaGuardarCambiosCajaEgreso = isVisibilidadCeldaGuardarCambiosCajaEgreso;
	}
		
	public CajaEgresoSessionBean getcajaegresoSessionBean() {
		return this.cajaegresoSessionBean;
	}
	
	public void setcajaegresoSessionBean(CajaEgresoSessionBean cajaegresoSessionBean) {
		this.cajaegresoSessionBean=cajaegresoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(CajaEgreso cajaegreso)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cajaegreso,null);
				this.setActualParaGuardarSucursalForeignKey(cajaegreso,null);
				this.setActualParaGuardarUsuarioForeignKey(cajaegreso,null);
				this.setActualParaGuardarCajaForeignKey(cajaegreso,null);
				this.setActualParaGuardarTurnoPunVenForeignKey(cajaegreso,null);
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
	
	public void bugActualizarReferenciaActual(CajaEgreso cajaegreso,CajaEgreso cajaegresoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajaEgreso(cajaegreso);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajaegresoAux.setId(cajaegreso.getId());
		cajaegresoAux.setVersionRow(cajaegreso.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCajaEgreso();
		
			int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cajaegresoValidator.getInvalidValues(this.cajaegreso);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cajaegresoLogic.setDatosCliente(datosCliente);
			cajaegresoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cajaegresoAux=new  CajaEgreso();
				
				cajaegresoAux.setIsNew(true);
				cajaegresoAux.setIsChanged(true);
				
				cajaegresoAux.setCajaEgresoOriginal(this.cajaegreso);
				
				cajaegresoAux.setId(this.cajaegreso.getId());	
				cajaegresoAux.setVersionRow(this.cajaegreso.getVersionRow());	
				cajaegresoAux.setid_empresa(this.cajaegreso.getid_empresa());	
				cajaegresoAux.setid_sucursal(this.cajaegreso.getid_sucursal());	
				cajaegresoAux.setid_usuario(this.cajaegreso.getid_usuario());	
				cajaegresoAux.setid_caja(this.cajaegreso.getid_caja());	
				cajaegresoAux.setid_turno_pun_ven(this.cajaegreso.getid_turno_pun_ven());	
				cajaegresoAux.setsecuencial(this.cajaegreso.getsecuencial());	
				cajaegresoAux.setfecha(this.cajaegreso.getfecha());	
				cajaegresoAux.sethora(this.cajaegreso.gethora());	
				cajaegresoAux.setvalor(this.cajaegreso.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajaegresoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cajaegresoAux,cajaegresoLogic.getCajaEgresos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaegresoAux,cajaegresos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cajaegresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaegresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoLogic.saveCajaEgresos();//WithConnection
						//cajaegresoLogic.getSetVersionRowCajaEgresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajaegreso,cajaegresoAux);
					
					this.refrescarForeignKeysDescripcionesCajaEgreso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalles.addAll(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetallesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaegresoLogic.saveCajaEgresoRelaciones(cajaegresoAux,this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles());//WithConnection
								//cajaegresoLogic.getSetVersionRowCajaEgresos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajaegreso,cajaegresoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalles= new ArrayList<CajaEgresoDetalle>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							cajaegresoAux.setCajaEgresoDetalles(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajaegresoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajaegresoAux,cajaegresoLogic.getCajaEgresos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajaegresoAux,cajaegresos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajaegreso,cajaegresoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cajaegresoAux=new  CajaEgreso();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cajaegresoSessionBean.getEsGuardarRelacionado() 
					|| (this.cajaegresoSessionBean.getEsGuardarRelacionado() && this.cajaegreso.getId()>=0)) {
						
					cajaegresoAux.setIsNew(false);
				}
				
				cajaegresoAux.setIsDeleted(false);
			
				cajaegresoAux.setId(this.cajaegreso.getId());	
				cajaegresoAux.setVersionRow(this.cajaegreso.getVersionRow());	
				cajaegresoAux.setid_empresa(this.cajaegreso.getid_empresa());	
				cajaegresoAux.setid_sucursal(this.cajaegreso.getid_sucursal());	
				cajaegresoAux.setid_usuario(this.cajaegreso.getid_usuario());	
				cajaegresoAux.setid_caja(this.cajaegreso.getid_caja());	
				cajaegresoAux.setid_turno_pun_ven(this.cajaegreso.getid_turno_pun_ven());	
				cajaegresoAux.setsecuencial(this.cajaegreso.getsecuencial());	
				cajaegresoAux.setfecha(this.cajaegreso.getfecha());	
				cajaegresoAux.sethora(this.cajaegreso.gethora());	
				cajaegresoAux.setvalor(this.cajaegreso.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajaegresoAux,cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaegresoAux,cajaegresos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cajaegresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaegresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoLogic.saveCajaEgresos();//WithConnection
						//cajaegresoLogic.getSetVersionRowCajaEgresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajaegreso,cajaegresoAux);
					
					this.refrescarForeignKeysDescripcionesCajaEgreso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalles.addAll(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetallesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaegresoLogic.saveCajaEgresoRelaciones(cajaegresoAux,this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles());//WithConnection
								//cajaegresoLogic.getSetVersionRowCajaEgresos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajaegreso,cajaegresoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalles= new ArrayList<CajaEgresoDetalle>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							cajaegresoAux.setCajaEgresoDetalles(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajaegresoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajaegresoAux,cajaegresoLogic.getCajaEgresos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajaegresoAux,cajaegresos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajaegreso,cajaegresoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cajaegresoAux=new  CajaEgreso();
				
				cajaegresoAux.setIsNew(false);
				cajaegresoAux.setIsChanged(false);
				
				cajaegresoAux.setIsDeleted(true);
				
				cajaegresoAux.setId(this.cajaegreso.getId());	
				cajaegresoAux.setVersionRow(this.cajaegreso.getVersionRow());	
				cajaegresoAux.setid_empresa(this.cajaegreso.getid_empresa());	
				cajaegresoAux.setid_sucursal(this.cajaegreso.getid_sucursal());	
				cajaegresoAux.setid_usuario(this.cajaegreso.getid_usuario());	
				cajaegresoAux.setid_caja(this.cajaegreso.getid_caja());	
				cajaegresoAux.setid_turno_pun_ven(this.cajaegreso.getid_turno_pun_ven());	
				cajaegresoAux.setsecuencial(this.cajaegreso.getsecuencial());	
				cajaegresoAux.setfecha(this.cajaegreso.getfecha());	
				cajaegresoAux.sethora(this.cajaegreso.gethora());	
				cajaegresoAux.setvalor(this.cajaegreso.getvalor());	
				
				if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cajaegresoAux.getId()>=0) {	
						this.cajaegresosEliminados.add(cajaegresoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cajaegresoAux,cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaegresoAux,cajaegresos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cajaegresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaegresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoLogic.saveCajaEgresos();//WithConnection
						//cajaegresoLogic.getSetVersionRowCajaEgresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalles.addAll(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetallesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaegresoLogic.saveCajaEgresoRelaciones(cajaegresoAux,this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles());//WithConnection
								//cajaegresoLogic.getSetVersionRowCajaEgresos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalles= new ArrayList<CajaEgresoDetalle>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							cajaegresoAux.setCajaEgresoDetalles(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cajaegresoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cajaegresoAux,cajaegresoLogic.getCajaEgresos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cajaegresoAux,cajaegresos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getCajaEgresos().addAll(this.cajaegresosEliminados);
					
					cajaegresoLogic.saveCajaEgresos();//WithConnection
					//cajaegresoLogic.getSetVersionRowCajaEgresos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCajaEgreso();
				
				this.cajaegresosEliminados= new ArrayList<CajaEgreso>();		
			}
			
			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Caja Egreso GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cajaegreso=cajaegresoAux;
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
      		//this.finishProcessCajaEgreso();
      	}
		
	}	
	
	public void actualizarRelaciones(CajaEgreso cajaegresoLocal) throws Exception {
		
		if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				cajaegresoLocal.setCajaEgresoDetalles(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles());
			
			} else {
			
				cajaegresoLocal.setCajaEgresoDetalles(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalles);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CajaEgreso cajaegresoLocal) throws Exception {	
		if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajaegresoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cajaegresoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				cajaegresoLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				cajaegresoLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TurnoPunVenDetalleFormJInternalFrame.class)) {
				TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrameLocal=(TurnoPunVenBeanSwingJInternalFrame) ((TurnoPunVenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				turnopunvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTurnoPunVen(turnopunvenBeanSwingJInternalFrameLocal.getturnopunven(),true);
				turnopunvenBeanSwingJInternalFrameLocal.actualizarLista(turnopunvenBeanSwingJInternalFrameLocal.turnopunven,this.turnopunvensForeignKey);

				turnopunvenBeanSwingJInternalFrameLocal.actualizarRelaciones(turnopunvenBeanSwingJInternalFrameLocal.turnopunven);

				cajaegresoLocal.setTurnoPunVen(turnopunvenBeanSwingJInternalFrameLocal.turnopunven);

				this.addItemDefectoCombosForeignKeyTurnoPunVen();
				this.cargarCombosFrameTurnoPunVensForeignKey("Formulario");
				this.setActualTurnoPunVenForeignKey(turnopunvenBeanSwingJInternalFrameLocal.turnopunven.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajaEgresoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajaegresoValidator.getInvalidValues(this.cajaegreso);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CajaEgreso cajaegreso,List<CajaEgreso> cajaegresos) throws Exception {
		try	{		
			CajaEgresoConstantesFunciones.actualizarLista(cajaegreso,cajaegresos,this.cajaegresoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CajaEgreso cajaegreso,List<CajaEgreso> cajaegresos) throws Exception {
		try	{			
			CajaEgresoConstantesFunciones.actualizarSelectedLista(cajaegreso,cajaegresos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CajaEgreso> cajaegresosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajaegresosLocal=this.cajaegresoLogic.getCajaEgresos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajaegresosLocal=this.cajaegresos;
			}
			//ARCHITECTURE
		
			for(CajaEgreso cajaegresoLocal:cajaegresosLocal) {
				if(this.permiteMantenimiento(cajaegresoLocal) && cajaegresoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CajaEgresoConstantesFunciones.getCajaEgresoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_empresaCajaEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_sucursalCajaEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_usuarioCajaEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_cajaCajaEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.IDTURNOPUNVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_turno_pun_venCajaEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelsecuencialCajaEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelfechaCajaEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.HORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelhoraCajaEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelvalorCajaEgreso,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_empresaCajaEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_sucursalCajaEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_usuarioCajaEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_cajaCajaEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelid_turno_pun_venCajaEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelsecuencialCajaEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelfechaCajaEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelhoraCajaEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgreso.jLabelvalorCajaEgreso,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CajaEgresoDetalle")) {
			if(this.cajaegreso==null) {
				this.cajaegreso= new CajaEgreso();
			}

			if(this.cajaegresoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCajaEgreso
				this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);

				this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.getcajaegresodetalle().setCajaEgreso(this.cajaegreso);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCajaEgreso--;	
		
		
		this.cajaegresoAux=new CajaEgreso();
		
		this.cajaegresoAux.setId(this.iIdNuevoCajaEgreso);
		this.cajaegresoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajaegresoLogic.getCajaEgresos().add(this.cajaegresoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajaegresos.add(this.cajaegresoAux);
		}
		//ARCHITECTURE
		
		this.cajaegreso=this.cajaegresoAux;
		
		if(CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajaEgreso(this.cajaegreso);
			this.setVariablesObjetoActualToFormularioForeignKeyCajaEgreso(this.cajaegreso);
		}
				
		//this.setDefaultControlesCajaEgreso();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajaEgreso();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajaEgreso();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaEgreso();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaEgreso(this.cajaegresoBean,this.cajaegreso,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CajaEgresoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
			classes=CajaEgresoConstantesFunciones.getClassesRelationshipsOfCajaEgreso(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cajaegresoReturnGeneral=cajaegresoLogic.procesarEventosCajaEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaegresoLogic.getCajaEgresos(),this.cajaegreso,this.cajaegresoParameterGeneral,this.isEsNuevoCajaEgreso,classes);//this.cajaegresoLogic.getCajaEgreso()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajaEgreso(this.cajaegresoReturnGeneral,this.cajaegresoBean,false);
		
		if(this.cajaegresoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajaEgreso(this.cajaegresoReturnGeneral.getCajaEgreso());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajaEgreso(this.cajaegresoReturnGeneral.getCajaEgreso());
		}
		
		if(this.cajaegresoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajaEgreso(this.cajaegresoReturnGeneral.getCajaEgreso(),classes);//this.cajaegresoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajaEgreso();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajaEgreso();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaEgresoBeanSwingJInternalFrameAdditional.RecargarFormCajaEgreso(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajaEgreso(false);
						
			if(cajaegresoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.getEsGuardarRelacionado() && CajaEgresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajaEgresoDetalleActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaEgreso();
			}
			
			this.actualizarVisualTableDatosCajaEgreso();
			
			this.jTableDatosCajaEgreso.setRowSelectionInterval(this.getIndiceNuevoCajaEgreso(), this.getIndiceNuevoCajaEgreso());
			
			this.seleccionarFilaTablaCajaEgresoActual();
						
			this.actualizarEstadoCeldasBotonesCajaEgreso("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajaEgreso(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajaEgreso.jTextFieldsecuencialCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarsecuencialCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jDateChooserfechaCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarfechaCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jSpinnerhoraCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarhoraCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jTextFieldvalorCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarvalorCajaEgreso);	
		//
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarid_empresaCajaEgreso);//
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarid_sucursalCajaEgreso);//
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarid_usuarioCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarid_cajaCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setEnabled(isHabilitar && this.cajaegresoConstantesFunciones.activarid_turno_pun_venCajaEgreso);
	};
	
	public void setDefaultControlesCajaEgreso() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajaEgreso(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajaegresoSessionBean.setConGuardarRelaciones(true);			
			this.cajaegresoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.cajaegresoSessionBean.setConGuardarRelaciones(false);			
			this.cajaegresoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCajaEgreso() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
				if(cajaegresoAux.getId().equals(this.iIdNuevoCajaEgreso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgreso cajaegresoAux:this.cajaegresos) {
				if(cajaegresoAux.getId().equals(this.iIdNuevoCajaEgreso)) {
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
	
	public int getIndiceActualCajaEgreso(CajaEgreso cajaegreso,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
				if(cajaegresoAux.getId().equals(cajaegreso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgreso cajaegresoAux:this.cajaegresos) {
				if(cajaegresoAux.getId().equals(cajaegreso.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCajaEgreso(CajaEgreso cajaegresoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
				if(cajaegresoAux.getCajaEgresoOriginal().getId().equals(cajaegresoOriginal.getId())) {
					existe=true;
					cajaegresoOriginal.setId(cajaegresoAux.getId());
					cajaegresoOriginal.setVersionRow(cajaegresoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgreso cajaegresoAux:this.cajaegresos) {
				if(cajaegresoAux.getCajaEgresoOriginal().getId().equals(cajaegresoOriginal.getId())) {
					existe=true;
					cajaegresoOriginal.setId(cajaegresoAux.getId());
					cajaegresoOriginal.setVersionRow(cajaegresoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajaEgreso(Boolean esParaCancelar) throws Exception {
		cajaegresosAux=new ArrayList<CajaEgreso>();
		cajaegresoAux=new CajaEgreso();
		
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
					if(cajaegresoAux.getId()<0) {
						cajaegresosAux.add(cajaegresoAux);
					}		
				}
				this.iIdNuevoCajaEgreso=0L;
				this.cajaegresoLogic.getCajaEgresos().removeAll(cajaegresosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaEgreso cajaegresoAux:this.cajaegresos) {
					if(cajaegresoAux.getId()<0) {
						cajaegresosAux.add(cajaegresoAux);
					}		
				}
				this.iIdNuevoCajaEgreso=0L;
				this.cajaegresos.removeAll(cajaegresosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajaEgreso 
					&& this.cajaegresoLogic.getCajaEgresos().size()>0
					) {
					cajaegresoAux=this.cajaegresoLogic.getCajaEgresos().get(this.cajaegresoLogic.getCajaEgresos().size() - 1);
				
					if(cajaegresoAux.getId()<0) {
						this.cajaegresoLogic.getCajaEgresos().remove(cajaegresoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajaEgreso && this.cajaegresos.size()>0) {
					cajaegresoAux=this.cajaegresos.get(this.cajaegresos.size() - 1);
				
					if(cajaegresoAux.getId()<0) {
						this.cajaegresos.remove(cajaegresoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajaEgreso(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajaegreso.getId()<0) {
				this.cajaegresoLogic.getCajaEgresos().remove(this.cajaegreso);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajaegreso.getId()<0) {
				this.cajaegresos.remove(this.cajaegreso);
			}
		}			
	}
	
	public void setEstadosInicialesCajaEgreso(List<CajaEgreso> cajaegresosAux) throws Exception {
		CajaEgresoConstantesFunciones.setEstadosInicialesCajaEgreso(cajaegresosAux);
	}
	
	public void setEstadosInicialesCajaEgreso(CajaEgreso cajaegresoAux) throws Exception {
		CajaEgresoConstantesFunciones.setEstadosInicialesCajaEgreso(cajaegresoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajaEgresoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajaEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajaEgresoActual()) {
				if(!this.isEsNuevoCajaEgreso) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajaEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajaEgreso=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajaEgresoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Caja Egreso ?", "MANTENIMIENTO DE Caja Egreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajaEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CajaEgreso cajaegreso) throws Exception {
		CajaEgresoConstantesFunciones.seleccionarAsignar(this.cajaegreso,cajaegreso);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajaEgreso=this.isPermisoActualizarOriginalCajaEgreso;
			
			
			this.seleccionarAsignar(cajaegreso);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaEgresoConstantesFunciones.quitarEspaciosCajaEgreso(this.cajaegreso,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCajaEgreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajaegresoSessionBean.setsFuncionBusquedaRapida(this.cajaegresoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCajaEgreso) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajaEgreso(esParaCancelar);				
				this.cancelarNuevoCajaEgreso(esParaCancelar);								
			}
			
			this.cajaegreso=new CajaEgreso();
			
			this.inicializarCajaEgreso();
			
			this.actualizarEstadoCeldasBotonesCajaEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajaEgreso() throws Exception {
		try {
			CajaEgresoConstantesFunciones.inicializarCajaEgreso(this.cajaegreso);
			
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
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajaegresoLogic.getCajaEgresos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajaEgresos(String sAccionBusqueda,List<CajaEgreso> cajaegresosParaReportes) throws Exception {
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
					sPathReporteFinal="CajaEgreso"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajaEgresoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajaEgresoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CajaEgreso"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Caja Egresos");		
		parameters.put("busquedapor", CajaEgresoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CajaEgresoDetalle.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CajaEgresoLogic cajaegresoLogicAuxiliar=new CajaEgresoLogic();
					cajaegresoLogicAuxiliar.setDatosCliente(cajaegresoLogic.getDatosCliente());				
					cajaegresoLogicAuxiliar.setCajaEgresos(cajaegresosParaReportes);
					
					cajaegresoLogicAuxiliar.cargarRelacionesLoteForeignKeyCajaEgresoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					cajaegresosParaReportes=cajaegresoLogicAuxiliar.getCajaEgresos();
					
					//cajaegresoLogic.getNewConnexionToDeep();
					
					//for (CajaEgreso cajaegreso:cajaegresosParaReportes) {
					//	cajaegresoLogic.deepLoad(cajaegreso, false, DeepLoadType.INCLUDE, classes);
					//}						
					//cajaegresoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//cajaegresoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCajaEgresoDetalle = AuxiliarReportes.class.getResourceAsStream("CajaEgresoDetalleDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cajaegresodetalle", reportFileCajaEgresoDetalle);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajaEgreso=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajaEgresoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajaEgresoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajaEgreso=new JRBeanArrayDataSource(CajaEgresoJInternalFrame.TraerCajaEgresoBeans(cajaegresosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajaEgreso);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajaEgresoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajaEgresoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajaEgresoBean.TraerCajaEgresoBeans(cajaegresosParaReportes).toArray()));
							
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
				this.generarExcelReporteCajaEgresos(sAccionBusqueda,sTipoArchivoReporte,cajaegresosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajaEgresos(sAccionBusqueda,sTipoArchivoReporte,cajaegresosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajaEgresoActionPerformed(null);
					//this.generarExcelReporteCajaEgresos(sAccionBusqueda,sTipoArchivoReporte,cajaegresosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajaEgresos(sAccionBusqueda,sTipoArchivoReporte,cajaegresosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajaEgresos(sAccionBusqueda,sTipoArchivoReporte,cajaegresosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajaEgresos(sAccionBusqueda,sTipoArchivoReporte,cajaegresosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajaEgresos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaEgreso> cajaegresosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegreso";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaEgresos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaEgreso("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CajaEgreso cajaegreso : cajaegresosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajaEgresoConstantesFunciones.generarExcelReporteDataCajaEgreso("NORMAL",row,workbook,cajaegreso,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajaEgreso(String sTipo,Row row,Workbook workbook) {
		
		CajaEgresoConstantesFunciones.generarExcelReporteHeaderCajaEgreso(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajaEgresos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaEgreso> cajaegresosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegreso_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaEgresos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CajaEgreso cajaegreso : cajaegresosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajaEgresoConstantesFunciones.getCajaEgresoDescripcion(cajaegreso));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.getturnopunven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_HORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_HORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.gethora());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegreso.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajaEgresos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaEgreso> cajaegresosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CajaEgreso> cajaegresosRespaldo=null;
		
		classes=CajaEgresoConstantesFunciones.getClassesRelationshipsOfCajaEgreso(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajaegresoLogic.setDatosCliente(this.datosCliente);
		this.cajaegresoLogic.setDatosDeep(this.datosDeep);
		this.cajaegresoLogic.setIsConDeep(true);
		
		cajaegresosRespaldo=this.cajaegresoLogic.getCajaEgresos();
		
		this.cajaegresoLogic.setCajaEgresos(cajaegresosParaReportes);	
		this.cajaegresoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajaegresosParaReportes=this.cajaegresoLogic.getCajaEgresos();
		this.cajaegresoLogic.setCajaEgresos(cajaegresosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegreso_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaEgresos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaEgreso("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CajaEgreso cajaegreso : cajaegresosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajaEgreso("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajaEgresoConstantesFunciones.generarExcelReporteDataCajaEgreso("NORMAL",row,workbook,cajaegreso,cellStyleDataAux);
		
			
			


				//CajaEgresoDetalle
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO))) {

				if(cajaegreso.getCajaEgresoDetalles()!=null && cajaegreso.getCajaEgresoDetalles().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CajaEgresoDetalleConstantesFunciones.generarExcelReporteHeaderCajaEgresoDetalle("RELACIONADO",row,workbook);
				}

				if(cajaegreso.getCajaEgresoDetalles()!=null) {
					i2=0;
					for(CajaEgresoDetalle cajaegresodetalle : cajaegreso.getCajaEgresoDetalles()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CajaEgresoDetalleConstantesFunciones.generarExcelReporteDataCajaEgresoDetalle("RELACIONADO",row,workbook,cajaegresodetalle,cellStyleDataAuxHijo);
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
		cell.setCellValue(CajaEgresoConstantesFunciones.getCajaEgresoDescripcion(cajaegreso));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaEgreso.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajaEgreso() throws Exception {		
		this.startProcessCajaEgreso(true);
	}
	
	public void startProcessCajaEgreso(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajaEgreso ,this.jPanelParametrosReportesCajaEgreso, this.jScrollPanelDatosCajaEgreso,this.jPanelPaginacionCajaEgreso, this.jScrollPanelDatosEdicionCajaEgreso, this.jPanelAccionesCajaEgreso,this.jPanelAccionesFormularioCajaEgreso,this.jmenuBarCajaEgreso,this.jmenuBarDetalleCajaEgreso,this.jTtoolBarCajaEgreso,this.jTtoolBarDetalleCajaEgreso);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaEgreso=this.jTabbedPaneBusquedasCajaEgreso; 
		
		final JPanel jPanelParametrosReportesCajaEgreso=this.jPanelParametrosReportesCajaEgreso;
		//final JScrollPane jScrollPanelDatosCajaEgreso=this.jScrollPanelDatosCajaEgreso;
		final JTable jTableDatosCajaEgreso=this.jTableDatosCajaEgreso;		
		final JPanel jPanelPaginacionCajaEgreso=this.jPanelPaginacionCajaEgreso;
		//final JScrollPane jScrollPanelDatosEdicionCajaEgreso=this.jScrollPanelDatosEdicionCajaEgreso;
		final JPanel jPanelAccionesCajaEgreso=this.jPanelAccionesCajaEgreso;
		
		JPanel jPanelCamposAuxiliarCajaEgreso=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajaEgreso=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			jPanelCamposAuxiliarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jPanelCamposCajaEgreso;
			jPanelAccionesFormularioAuxiliarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jPanelAccionesFormularioCajaEgreso;
		}
		
		final JPanel jPanelCamposCajaEgreso=jPanelCamposAuxiliarCajaEgreso;
		final JPanel jPanelAccionesFormularioCajaEgreso=jPanelAccionesFormularioAuxiliarCajaEgreso;
		
		
		final JMenuBar jmenuBarCajaEgreso=this.jmenuBarCajaEgreso;
		final JToolBar jTtoolBarCajaEgreso=this.jTtoolBarCajaEgreso;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajaEgreso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaEgreso=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			jmenuBarDetalleAuxiliarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jmenuBarDetalleCajaEgreso;
			jTtoolBarDetalleAuxiliarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jTtoolBarDetalleCajaEgreso;
		}
		
		final JMenuBar jmenuBarDetalleCajaEgreso=jmenuBarDetalleAuxiliarCajaEgreso;
		final JToolBar jTtoolBarDetalleCajaEgreso=jTtoolBarDetalleAuxiliarCajaEgreso;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaEgreso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaEgreso;
			processRunnable.jTableDatos=jTableDatosCajaEgreso;
			processRunnable.jPanelCampos=jPanelCamposCajaEgreso;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaEgreso;
			processRunnable.jPanelAcciones=jPanelAccionesCajaEgreso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaEgreso;
			
			
			processRunnable.jmenuBar=jmenuBarCajaEgreso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaEgreso;
			processRunnable.jTtoolBar=jTtoolBarCajaEgreso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaEgreso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaEgreso ,jPanelParametrosReportesCajaEgreso,jTableDatosCajaEgreso, /*jScrollPanelDatosCajaEgreso,*/jPanelCamposCajaEgreso,jPanelPaginacionCajaEgreso, /*jScrollPanelDatosEdicionCajaEgreso,*/ jPanelAccionesCajaEgreso,jPanelAccionesFormularioCajaEgreso,jmenuBarCajaEgreso,jmenuBarDetalleCajaEgreso,jTtoolBarCajaEgreso,jTtoolBarDetalleCajaEgreso);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaEgreso ,jPanelParametrosReportesCajaEgreso, jScrollPanelDatosCajaEgreso,jPanelPaginacionCajaEgreso, jScrollPanelDatosEdicionCajaEgreso, jPanelAccionesCajaEgreso,jPanelAccionesFormularioCajaEgreso,jmenuBarCajaEgreso,jmenuBarDetalleCajaEgreso,jTtoolBarCajaEgreso,jTtoolBarDetalleCajaEgreso);
						
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
	
	public void finishProcessCajaEgreso() {// throws Exception 
		this.finishProcessCajaEgreso(true);
	}
	
	public void finishProcessCajaEgreso(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajaEgreso ,this.jPanelParametrosReportesCajaEgreso, this.jScrollPanelDatosCajaEgreso,this.jPanelPaginacionCajaEgreso, this.jScrollPanelDatosEdicionCajaEgreso, this.jPanelAccionesCajaEgreso,this.jPanelAccionesFormularioCajaEgreso,this.jmenuBarCajaEgreso,this.jmenuBarDetalleCajaEgreso,this.jTtoolBarCajaEgreso,this.jTtoolBarDetalleCajaEgreso);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaEgreso=this.jTabbedPaneBusquedasCajaEgreso; 
		
		final JPanel jPanelParametrosReportesCajaEgreso=this.jPanelParametrosReportesCajaEgreso;
		//final JScrollPane jScrollPanelDatosCajaEgreso=this.jScrollPanelDatosCajaEgreso;
		final JTable jTableDatosCajaEgreso=this.jTableDatosCajaEgreso;		
		final JPanel jPanelPaginacionCajaEgreso=this.jPanelPaginacionCajaEgreso;
		//final JScrollPane jScrollPanelDatosEdicionCajaEgreso=this.jScrollPanelDatosEdicionCajaEgreso;
		final JPanel jPanelAccionesCajaEgreso=this.jPanelAccionesCajaEgreso;
		
		JPanel jPanelCamposAuxiliarCajaEgreso=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajaEgreso=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			jPanelCamposAuxiliarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jPanelCamposCajaEgreso;
			jPanelAccionesFormularioAuxiliarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jPanelAccionesFormularioCajaEgreso;
		}
		
		final JPanel jPanelCamposCajaEgreso=jPanelCamposAuxiliarCajaEgreso;
		final JPanel jPanelAccionesFormularioCajaEgreso=jPanelAccionesFormularioAuxiliarCajaEgreso;
		
		
		final JMenuBar jmenuBarCajaEgreso=this.jmenuBarCajaEgreso;		
		final JToolBar jTtoolBarCajaEgreso=this.jTtoolBarCajaEgreso;
				
		JMenuBar jmenuBarDetalleAuxiliarCajaEgreso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaEgreso=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			jmenuBarDetalleAuxiliarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jmenuBarDetalleCajaEgreso;
			jTtoolBarDetalleAuxiliarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jTtoolBarDetalleCajaEgreso;		
		}
		
		final JMenuBar jmenuBarDetalleCajaEgreso=jmenuBarDetalleAuxiliarCajaEgreso;
		final JToolBar jTtoolBarDetalleCajaEgreso=jTtoolBarDetalleAuxiliarCajaEgreso;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaEgreso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaEgreso;
			processRunnable.jTableDatos=jTableDatosCajaEgreso;
			processRunnable.jPanelCampos=jPanelCamposCajaEgreso;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaEgreso;
			processRunnable.jPanelAcciones=jPanelAccionesCajaEgreso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaEgreso;
			
			
			processRunnable.jmenuBar=jmenuBarCajaEgreso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaEgreso;
			processRunnable.jTtoolBar=jTtoolBarCajaEgreso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaEgreso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajaEgreso ,jPanelParametrosReportesCajaEgreso, jTableDatosCajaEgreso,/*jScrollPanelDatosCajaEgreso,*/jPanelCamposCajaEgreso,jPanelPaginacionCajaEgreso, /*jScrollPanelDatosEdicionCajaEgreso,*/ jPanelAccionesCajaEgreso,jPanelAccionesFormularioCajaEgreso,jmenuBarCajaEgreso,jmenuBarDetalleCajaEgreso,jTtoolBarCajaEgreso,jTtoolBarDetalleCajaEgreso));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajaEgreso(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajaEgreso(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajaEgreso(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajaEgreso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajaEgreso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajaEgreso,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajaEgreso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajaEgreso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajaEgreso,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajaegresoConstantesFunciones.getsFinalQueryCajaEgreso();
		String  finalQueryPaginacionTodos=this.cajaegresoConstantesFunciones.getsFinalQueryCajaEgreso();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CajaEgresoConstantesFunciones.getArrayColumnasGlobalesNoCajaEgreso(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajaEgresoConstantesFunciones.getArrayColumnasGlobalesCajaEgreso(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajaEgresoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajaegresosEliminados= new ArrayList<CajaEgreso>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajaEgreso();
		
				///*CajaEgresoSessionBean*/this.cajaegresoSessionBean=new CajaEgresoSessionBean();
			
			if(this.cajaegresoSessionBean==null) {
				this.cajaegresoSessionBean=new CajaEgresoSessionBean();
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
					this.iNumeroPaginacion=CajaEgresoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajaEgresoConstantesFunciones.getClassesForeignKeysOfCajaEgreso(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajaegreso."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajaegresosAux= new ArrayList<CajaEgreso>();
			
				
			cajaegresoLogic.setDatosCliente(this.datosCliente);
			cajaegresoLogic.setDatosDeep(this.datosDeep);
			cajaegresoLogic.setIsConDeep(true);
			
			
			cajaegresoLogic.getCajaEgresoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cajaegresoLogic.getTodosCajaEgresos(finalQueryGlobal,pagination);
					
					//cajaegresoLogic.getTodosCajaEgresosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cajaegresoLogic.getCajaEgresos()==null|| cajaegresoLogic.getCajaEgresos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaegresosAux= new ArrayList<CajaEgreso>();
							cajaegresosAux.addAll(cajaegresoLogic.getCajaEgresos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresosAux= new ArrayList<CajaEgreso>();
							cajaegresosAux.addAll(cajaegresos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaegresoLogic.getTodosCajaEgresos(finalQueryGlobal+"",this.pagination);												
							
							//cajaegresoLogic.getTodosCajaEgresosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCajaEgresos("Todos",cajaegresoLogic.getCajaEgresos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());					
							cajaegresoLogic.getCajaEgresos().addAll(cajaegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresos=new ArrayList<CajaEgreso>();
							cajaegresos.addAll(cajaegresosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCajaEgreso=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCajaEgreso=this.idActual;
				
				} else if(this.idCajaEgresoActual!=null && this.idCajaEgresoActual!=0L) {
					idCajaEgreso=idCajaEgresoActual;
				}
				
					
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndicePorId(idCajaEgreso);
				
				this.cajaegresos=new ArrayList<CajaEgreso>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cajaegresoLogic.getEntity(idCajaEgreso);
					
					//cajaegresoLogic.getEntityWithConnection(idCajaEgreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
					cajaegresoLogic.getCajaEgresos().add(cajaegresoLogic.getCajaEgreso());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegresos=new ArrayList<CajaEgreso>();
					this.cajaegresos.add(cajaegreso);
				}
				
				if(cajaegresoLogic.getCajaEgreso()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCaja")) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresoLogic.getCajaEgresosFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresoLogic.getCajaEgresos()==null||cajaegresoLogic.getCajaEgresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresos==null|| cajaegresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresosAux=new ArrayList<CajaEgreso>();
						cajaegresosAux.addAll(cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresosAux=new ArrayList<CajaEgreso>();
							cajaegresosAux.addAll(cajaegresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresoLogic.getCajaEgresosFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresos("FK_IdCaja",cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresos("FK_IdCaja",cajaegresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
						cajaegresoLogic.getCajaEgresos().addAll(cajaegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresos=new ArrayList<CajaEgreso>();
							cajaegresos.addAll(cajaegresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresoLogic.getCajaEgresosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresoLogic.getCajaEgresos()==null||cajaegresoLogic.getCajaEgresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresos==null|| cajaegresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresosAux=new ArrayList<CajaEgreso>();
						cajaegresosAux.addAll(cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresosAux=new ArrayList<CajaEgreso>();
							cajaegresosAux.addAll(cajaegresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresoLogic.getCajaEgresosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresos("FK_IdEmpresa",cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresos("FK_IdEmpresa",cajaegresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
						cajaegresoLogic.getCajaEgresos().addAll(cajaegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresos=new ArrayList<CajaEgreso>();
							cajaegresos.addAll(cajaegresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresoLogic.getCajaEgresosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresoLogic.getCajaEgresos()==null||cajaegresoLogic.getCajaEgresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresos==null|| cajaegresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresosAux=new ArrayList<CajaEgreso>();
						cajaegresosAux.addAll(cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresosAux=new ArrayList<CajaEgreso>();
							cajaegresosAux.addAll(cajaegresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresoLogic.getCajaEgresosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresos("FK_IdSucursal",cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresos("FK_IdSucursal",cajaegresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
						cajaegresoLogic.getCajaEgresos().addAll(cajaegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresos=new ArrayList<CajaEgreso>();
							cajaegresos.addAll(cajaegresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTurnoPunVen")) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresoLogic.getCajaEgresosFK_IdTurnoPunVen(finalQueryGlobal,pagination,id_turno_pun_venFK_IdTurnoPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresoLogic.getCajaEgresos()==null||cajaegresoLogic.getCajaEgresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresos==null|| cajaegresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresosAux=new ArrayList<CajaEgreso>();
						cajaegresosAux.addAll(cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresosAux=new ArrayList<CajaEgreso>();
							cajaegresosAux.addAll(cajaegresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresoLogic.getCajaEgresosFK_IdTurnoPunVen(finalQueryGlobal,pagination,id_turno_pun_venFK_IdTurnoPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresos("FK_IdTurnoPunVen",cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresos("FK_IdTurnoPunVen",cajaegresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
						cajaegresoLogic.getCajaEgresos().addAll(cajaegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresos=new ArrayList<CajaEgreso>();
							cajaegresos.addAll(cajaegresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresoLogic.getCajaEgresosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresoLogic.getCajaEgresos()==null||cajaegresoLogic.getCajaEgresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresos==null|| cajaegresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresosAux=new ArrayList<CajaEgreso>();
						cajaegresosAux.addAll(cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresosAux=new ArrayList<CajaEgreso>();
							cajaegresosAux.addAll(cajaegresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresoLogic.getCajaEgresosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresos("FK_IdUsuario",cajaegresoLogic.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresos("FK_IdUsuario",cajaegresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
						cajaegresoLogic.getCajaEgresos().addAll(cajaegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresos=new ArrayList<CajaEgreso>();
							cajaegresos.addAll(cajaegresosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajaEgreso();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajaEgreso();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajaegresoLogic.getCajaEgresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaegresos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajaegresoLogic.getCajaEgresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaegresos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CajaEgreso cajaegreso) {
		Boolean permite=true;
		
		if(this.cajaegreso.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajaEgresoConstantesFunciones.getOrderByListaCajaEgreso();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajaEgresoConstantesFunciones.getOrderByListaCajaEgreso();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgreso cajaegreso:cajaegresoLogic.getCajaEgresos()) {
				if(cajaegreso.getsType().equals(Constantes2.S_TOTALES)) {
					cajaegresoTotales=cajaegreso;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgreso cajaegreso:this.cajaegresos) {
				if(cajaegreso.getsType().equals(Constantes2.S_TOTALES)) {
					cajaegresoTotales=cajaegreso;
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
			this.cajaegresoAux=new CajaEgreso();
			this.cajaegresoAux.setsType(Constantes2.S_TOTALES);
			this.cajaegresoAux.setIsNew(false);
			this.cajaegresoAux.setIsChanged(false);
			this.cajaegresoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CajaEgresoConstantesFunciones.TotalizarValoresFilaCajaEgreso(this.cajaegresoLogic.getCajaEgresos(),this.cajaegresoAux);
				
				this.cajaegresoLogic.getCajaEgresos().add(this.cajaegresoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajaEgresoConstantesFunciones.TotalizarValoresFilaCajaEgreso(this.cajaegresos,this.cajaegresoAux);
				
				this.cajaegresos.add(this.cajaegresoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajaegresoTotales=new CajaEgreso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajaegresoLogic.getCajaEgresos().remove(cajaegresoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajaegresos.remove(cajaegresoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajaegresoTotales=new CajaEgreso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgreso cajaegreso:cajaegresoLogic.getCajaEgresos()) {
				if(cajaegreso.getsType().equals(Constantes2.S_TOTALES)) {
					cajaegresoTotales=cajaegreso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaEgresoConstantesFunciones.TotalizarValoresFilaCajaEgreso(this.cajaegresoLogic.getCajaEgresos(),cajaegresoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgreso cajaegreso:this.cajaegresos) {
				if(cajaegreso.getsType().equals(Constantes2.S_TOTALES)) {
					cajaegresoTotales=cajaegreso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaEgresoConstantesFunciones.TotalizarValoresFilaCajaEgreso(this.cajaegresos,cajaegresoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajaEgresosFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaEgresosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaEgresosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaEgresosFK_IdTurnoPunVen()throws Exception {
		try {
			sAccionBusqueda="FK_IdTurnoPunVen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaEgresosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajaEgresosFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLogic.getCajaEgresosFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaEgresosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLogic.getCajaEgresosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaEgresosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLogic.getCajaEgresosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaEgresosFK_IdTurnoPunVen(String sFinalQuery,Long id_turno_pun_ven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLogic.getCajaEgresosFK_IdTurnoPunVen(sFinalQuery,this.pagination,id_turno_pun_ven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaEgresosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLogic.getCajaEgresosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosCajaEgreso() {
		this.isPermisoTodoCajaEgreso=false;
		this.isPermisoNuevoCajaEgreso=false;
		this.isPermisoActualizarCajaEgreso=false;
		this.isPermisoActualizarOriginalCajaEgreso=false;
		this.isPermisoEliminarCajaEgreso=false;
		this.isPermisoGuardarCambiosCajaEgreso=false;
		this.isPermisoConsultaCajaEgreso=false;
		this.isPermisoBusquedaCajaEgreso=false;
		this.isPermisoReporteCajaEgreso=false;		
		this.isPermisoOrdenCajaEgreso=false;		
		this.isPermisoPaginacionMedioCajaEgreso=false;		
		this.isPermisoPaginacionAltoCajaEgreso=false;
		this.isPermisoPaginacionTodoCajaEgreso=false;
		this.isPermisoCopiarCajaEgreso=false;		
		this.isPermisoVerFormCajaEgreso=false;		
		this.isPermisoDuplicarCajaEgreso=false;		
		this.isPermisoOrdenCajaEgreso=false;		
	}
	
	public void setPermisosUsuarioCajaEgreso(Boolean isPermiso) {
		this.isPermisoTodoCajaEgreso=isPermiso;
		this.isPermisoNuevoCajaEgreso=isPermiso;
		this.isPermisoActualizarCajaEgreso=isPermiso;
		this.isPermisoActualizarOriginalCajaEgreso=isPermiso;
		this.isPermisoEliminarCajaEgreso=isPermiso;
		this.isPermisoGuardarCambiosCajaEgreso=isPermiso;
		this.isPermisoConsultaCajaEgreso=isPermiso;
		this.isPermisoBusquedaCajaEgreso=isPermiso;
		this.isPermisoReporteCajaEgreso=isPermiso;
		this.isPermisoOrdenCajaEgreso=isPermiso;		
		this.isPermisoPaginacionMedioCajaEgreso=isPermiso;		
		this.isPermisoPaginacionAltoCajaEgreso=isPermiso;		
		this.isPermisoPaginacionTodoCajaEgreso=isPermiso;		
		this.isPermisoCopiarCajaEgreso=isPermiso;		
		this.isPermisoVerFormCajaEgreso=isPermiso;		
		this.isPermisoDuplicarCajaEgreso=isPermiso;
		this.isPermisoOrdenCajaEgreso=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajaEgreso(Boolean isPermiso) {
		//this.isPermisoTodoCajaEgreso=isPermiso;
		this.isPermisoNuevoCajaEgreso=isPermiso;
		this.isPermisoActualizarCajaEgreso=isPermiso;
		this.isPermisoActualizarOriginalCajaEgreso=isPermiso;
		this.isPermisoEliminarCajaEgreso=isPermiso;
		this.isPermisoGuardarCambiosCajaEgreso=isPermiso;
		//this.isPermisoConsultaCajaEgreso=isPermiso;
		//this.isPermisoBusquedaCajaEgreso=isPermiso;
		//this.isPermisoReporteCajaEgreso=isPermiso;
		//this.isPermisoOrdenCajaEgreso=isPermiso;		
		//this.isPermisoPaginacionMedioCajaEgreso=isPermiso;		
		//this.isPermisoPaginacionAltoCajaEgreso=isPermiso;		
		//this.isPermisoPaginacionTodoCajaEgreso=isPermiso;		
		//this.isPermisoCopiarCajaEgreso=isPermiso;		
		//this.isPermisoDuplicarCajaEgreso=isPermiso;
		//this.isPermisoOrdenCajaEgreso=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajaEgresoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CajaEgresoDetalleConstantesFunciones.SNOMBREOPCION);
		
		if(CajaEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCajaEgresoDetalle=false;
		this.isTienePermisosCajaEgresoDetalle=this.verificarGetPermisosUsuarioOpcionCajaEgresoClaseRelacionada(this.opcionsRelacionadas,CajaEgresoDetalleConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajaEgreso(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajaEgresoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCajaEgresoDetalle=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCajaEgresoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajaEgresoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajaEgresoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCajaEgresoDetalle && this.jInternalFrameDetalleFormCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.remove(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCajaEgreso() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajaEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajaEgresoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajaEgreso=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajaEgreso=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajaEgreso=this.isPermisoActualizarCajaEgreso;
			this.isPermisoEliminarCajaEgreso=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajaEgreso=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajaEgreso=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajaEgreso=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajaEgreso=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajaEgreso=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaEgreso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajaEgreso=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajaEgreso=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajaEgreso=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajaEgreso=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajaEgreso=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajaEgreso=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaEgreso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajaEgreso.setToolTipText(this.jTableDatosCajaEgreso.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajaEgreso(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajaEgreso(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajaEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CajaEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCajaEgreso() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCajaEgresoDetalle && this.cajaegresoConstantesFunciones.mostrarCajaEgresoDetalleCajaEgreso && !CajaEgresoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Caja Egreso Detalle");
			reporte.setsDescripcion("Caja Egreso Detalle");
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
	public void inicializarCombosForeignKeyCajaEgresoListas()throws Exception {
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
	
	public void cargarCombosTodosForeignKeyCajaEgresoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajaEgresoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCajaEgresoListas(false);
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
	
	public void cargarCombosLoteForeignKeyCajaEgresoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CajaEgresoParameterReturnGeneral cajaegresoReturnGeneral=new CajaEgresoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cajaegresoConstantesFunciones.cargarid_empresaCajaEgreso)
					 || (this.esRecargarFks && this.cajaegresoConstantesFunciones.cargarid_empresaCajaEgreso)) {

					if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cajaegresoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cajaegresoConstantesFunciones.cargarid_sucursalCajaEgreso)
					 || (this.esRecargarFks && this.cajaegresoConstantesFunciones.cargarid_sucursalCajaEgreso)) {

					if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cajaegresoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.cajaegresoConstantesFunciones.cargarid_usuarioCajaEgreso)
					 || (this.esRecargarFks && this.cajaegresoConstantesFunciones.cargarid_usuarioCajaEgreso)) {

					if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+cajaegresoSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalCaja="";

				if(((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0) && this.cajaegresoConstantesFunciones.cargarid_cajaCajaEgreso)
					 || (this.esRecargarFks && this.cajaegresoConstantesFunciones.cargarid_cajaCajaEgreso)) {

					if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

						finalQueryGlobalCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalCaja, "");
						finalQueryGlobalCaja+=CajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCaja=" WHERE " + ConstantesSql.ID + "="+cajaegresoSessionBean.getlidCajaActual();
					}
				} else {
					finalQueryGlobalCaja="NONE";
				}


				String finalQueryGlobalTurnoPunVen="";

				if(((this.turnopunvensForeignKey==null||this.turnopunvensForeignKey.size()<=0) && this.cajaegresoConstantesFunciones.cargarid_turno_pun_venCajaEgreso)
					 || (this.esRecargarFks && this.cajaegresoConstantesFunciones.cargarid_turno_pun_venCajaEgreso)) {

					if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TurnoPunVenConstantesFunciones.getArrayColumnasGlobalesTurnoPunVen(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTurnoPunVen=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TurnoPunVenConstantesFunciones.TABLENAME);

						finalQueryGlobalTurnoPunVen=Funciones.GetFinalQueryAppend(finalQueryGlobalTurnoPunVen, "");
						finalQueryGlobalTurnoPunVen+=TurnoPunVenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTurnoPunVensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTurnoPunVen=" WHERE " + ConstantesSql.ID + "="+cajaegresoSessionBean.getlidTurnoPunVenActual();
					}
				} else {
					finalQueryGlobalTurnoPunVen="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cajaegresoReturnGeneral=cajaegresoLogic.cargarCombosLoteForeignKeyCajaEgreso(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalCaja,finalQueryGlobalTurnoPunVen);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cajaegresoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cajaegresoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=cajaegresoReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalCaja.equals("NONE")) {
				this.cajasForeignKey=cajaegresoReturnGeneral.getcajasForeignKey();
			}

			if(!finalQueryGlobalTurnoPunVen.equals("NONE")) {
				this.turnopunvensForeignKey=cajaegresoReturnGeneral.getturnopunvensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCajaEgreso()throws Exception {
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
			if(this.cajaegresoSessionBean==null) {
				this.cajaegresoSessionBean=new CajaEgresoSessionBean();
			}

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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

			if(!this.cajaegresoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {
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
	
	public void initActionsCombosTodosForeignKeyCajaEgreso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajaEgreso(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajaEgreso()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.cajaegreso.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaEgreso();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajaEgreso(CajaEgreso cajaegreso)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(cajaegreso.getid_caja(),false,"Formulario");
			this.setActualTurnoPunVenForeignKey(cajaegreso.getid_turno_pun_ven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajaEgreso(CajaEgreso cajaegreso,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajaEgreso()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.cajaegresoConstantesFunciones.getid_caja(),false,"Formulario");
			this.setActualTurnoPunVenForeignKey(this.cajaegresoConstantesFunciones.getid_turno_pun_ven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajaEgreso()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajaEgreso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajaEgreso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajaEgreso()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajaEgreso()throws Exception {
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
	
	public void cargarCombosFrameForeignKeyCajaEgreso(String sFormularioTipoBusqueda)throws Exception {
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
	
	public void setItemDefectoCombosForeignKeyCajaEgreso()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CajaEgresoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajaEgresoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajaEgresoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajaegresoSessionBean=new CajaEgresoSessionBean(); 
		this.cajaegresoConstantesFunciones=new CajaEgresoConstantesFunciones(); 
		this.cajaegresoBean=new CajaEgreso();//(this.cajaegresoConstantesFunciones); 		
		this.cajaegresoReturnGeneral=new CajaEgresoParameterReturnGeneral(); 
		
		this.cajaegresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaegresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajaEgresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajaEgresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajaEgresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajaEgreso(true);
			
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
			
			this.cajaegresoConstantesFunciones=new CajaEgresoConstantesFunciones(); 
			this.cajaegresoBean=new CajaEgreso();//this.cajaegresoConstantesFunciones); 			
			this.cajaegresoReturnGeneral=new CajaEgresoParameterReturnGeneral(); 
		
			CajaEgresoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Egreso Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cajaegreso=new CajaEgreso();
			this.cajaegresos = new ArrayList<CajaEgreso>();
			this.cajaegresosAux = new ArrayList<CajaEgreso>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic=new CajaEgresoLogic();
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}
			
			//this.cajaegresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajaegresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajaEgreso);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaEgreso);	
					}
					
					if(this.jInternalFrameImportacionCajaEgreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaEgreso);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajaEgreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajaEgreso);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaEgreso);
				this.jInternalFrameDetalleFormCajaEgreso.setVisible(false);
				this.jInternalFrameDetalleFormCajaEgreso.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaEgreso);
					this.jInternalFrameReporteDinamicoCajaEgreso.setVisible(false);
					this.jInternalFrameReporteDinamicoCajaEgreso.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajaEgreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajaEgreso);
					this.jInternalFrameImportacionCajaEgreso.setVisible(false);
					this.jInternalFrameImportacionCajaEgreso.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajaEgreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajaEgreso);
					this.jInternalFrameOrderByCajaEgreso.setVisible(false);
					this.jInternalFrameOrderByCajaEgreso.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajaEgresoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajaEgresoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cajaegresoReturnGeneral=new CajaEgresoParameterReturnGeneral();
			
			this.cajaegresoParameterGeneral=new CajaEgresoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajaegresoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CajaEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CajaEgresoDetalleConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaEgresoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajaegresoSessionBean.getEsGuardarRelacionado(),this.cajaegresoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaEgresoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajaegresoSessionBean.getEsGuardarRelacionado(),this.cajaegresoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCajaEgreso=false;
			this.isVisibilidadCeldaDuplicarCajaEgreso=true;
			this.isVisibilidadCeldaCopiarCajaEgreso=true;
			this.isVisibilidadCeldaVerFormCajaEgreso=true;
			this.isVisibilidadCeldaOrdenCajaEgreso=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
			this.isVisibilidadCeldaModificarCajaEgreso=false;
			this.isVisibilidadCeldaActualizarCajaEgreso=false;
			this.isVisibilidadCeldaEliminarCajaEgreso=false;
			this.isVisibilidadCeldaCancelarCajaEgreso=false;
			this.isVisibilidadCeldaGuardarCajaEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=false;
			
			
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTurnoPunVen=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajaEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajaEgreso();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajaEgreso(false);
			
			this.setPermisosUsuarioCajaEgreso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaegresoSessionBean.getEsGuardarRelacionado() 
				|| (this.cajaegresoSessionBean.getEsGuardarRelacionado() && this.cajaegresoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajaEgresoClasesRelacionadas();
			}
			
			if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajaEgresoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajaEgreso();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajaEgreso();
			}
			
			if(!this.isPermisoBusquedaCajaEgreso) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCajaEgreso,this.isPermisoPaginacionMedioCajaEgreso,this.isPermisoPaginacionTodoCajaEgreso);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajaEgresoConstantesFunciones.getTiposSeleccionarCajaEgreso());
				
				this.tiposColumnasSelect=CajaEgresoConstantesFunciones.getTiposSeleccionarCajaEgreso(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCajaEgreso();				
				//this.tiposRelacionesSelect=CajaEgresoConstantesFunciones.getTiposRelacionesCajaEgreso(true);
				
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
			//if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajaEgreso();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCajaEgreso(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCajaEgreso(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaEgreso() ;
			
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
			
			
			this.cajaegresodetalleLogic=new CajaEgresoDetalleLogic(); 
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
				cajaegresoImplementable= (CajaEgresoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaEgresoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajaegresoImplementableHome= (CajaEgresoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaEgresoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajaegresos= new ArrayList<CajaEgreso>();
			this.cajaegresosEliminados= new ArrayList<CajaEgreso>();
						
			this.isEsNuevoCajaEgreso=false;
			this.esParaAccionDesdeFormularioCajaEgreso=false;
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
				this.cargarCombosForeignKeyCajaEgreso(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajaEgreso();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajaEgresoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajaEgresoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajaEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajaEgreso(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajaEgreso();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajaEgreso();
			}
			
			CajaEgresoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajaEgreso.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajaEgreso.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajaEgreso.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajaEgreso(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CajaEgreso: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajaEgreso() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajaEgreso")) {
				iIndex=this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();	
				
				

				if(sTitle.equals("Caja Egreso Detalles")) {
					if(!CajaEgresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCajaEgreso();

						this.cargarParteTabPanelRelacionadaCajaEgresoDetalle(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajaEgreso();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCajaEgresoDetalle(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCajaEgreso.cargarSessionConBeanSwingJInternalFrameCajaEgresoDetalle(false,true,iIndex);
		this.jButtonCajaEgresoDetalleActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCajaEgresoDetalle();

		//this.jTabbedPaneRelacionesCajaEgreso.updateUI();
		//this.jTabbedPaneRelacionesCajaEgreso.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCajaEgreso.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CajaEgresoDetalle")) {
				int row=this.jTableDatosCajaEgreso.getSelectedRow();
				jButtonCajaEgresoDetalleActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Caja Egreso Detalle")) {

					if(this.isTienePermisosCajaEgresoDetalle && this.cajaegresoConstantesFunciones.mostrarCajaEgresoDetalleCajaEgreso && !CajaEgresoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Caja Egreso Detalles"+"("+CajaEgresoDetalleConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Caja Egreso Detalles");

						if(cajaegresoConstantesFunciones.resaltarCajaEgresoDetalleCajaEgreso!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cajaegresoConstantesFunciones.resaltarCajaEgresoDetalleCajaEgreso);
						}

						jmenuItem.setEnabled(this.cajaegresoConstantesFunciones.activarCajaEgresoDetalleCajaEgreso);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CajaEgresoDetalle"));

						

						this.jInternalFrameDetalleFormCajaEgreso.jmenuDetalleCajaEgreso.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCajaEgreso(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajaEgreso(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajaEgreso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajaEgresoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajaEgreso();
		
		this.cargarCombosFrameForeignKeyCajaEgreso();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajaEgreso();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajaEgreso();
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
	
	public void jButtonNuevoCajaEgresoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
			
			if(jTableDatosCajaEgreso.getRowCount()>=1) {
				jTableDatosCajaEgreso.removeRowSelectionInterval(0, jTableDatosCajaEgreso.getRowCount()-1);						
			}
			
			this.isEsNuevoCajaEgreso=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajaEgreso(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajaEgreso(true);			
			//this.cajaegreso=new CajaEgreso();
			//this.cajaegreso.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaEgreso(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaEgreso() ;
			
			if(CajaEgresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaEgreso(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajaegreso);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);				
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
			if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CajaEgreso: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajaEgresoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajaEgreso.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajaEgreso.getSelectedRows().length;			
			}
			
			cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajaEgreso--;			
				//CajaEgreso cajaegresoAux= new CajaEgreso();			
				//cajaegresoAux.setId(this.iIdNuevoCajaEgreso);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CajaEgreso cajaegresoOrigen=new CajaEgreso();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CajaEgreso cajaegresoOrigen : cajaegresosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajaegresoOrigen =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresoOrigen =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajaEgreso();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajaegreso.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajaEgreso(cajaegresoOrigen,this.cajaegreso,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajaegresoLogic.getCajaEgresos().add(this.cajaegresoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajaegresos.add(this.cajaegresoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajaEgreso(false);
				
				this.jTableDatosCajaEgreso.setRowSelectionInterval(this.getIndiceNuevoCajaEgreso(), this.getIndiceNuevoCajaEgreso());
				
				int iLastRow =  this.jTableDatosCajaEgreso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaEgreso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaEgreso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaEgreso(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();									
		
			CajaEgreso cajaegresoOrigen=new CajaEgreso();
			CajaEgreso cajaegresoDestino=new CajaEgreso();
				
			cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajaEgreso.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajaegresosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajaEgreso.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoOrigen =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajaegresoOrigen =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresoDestino =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajaegresoDestino =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajaegresoOrigen =cajaegresosSeleccionados.get(0);
				cajaegresoDestino =cajaegresosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajaEgreso(cajaegresoOrigen,cajaegresoDestino,true,false);
				
				cajaegresoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajaegresoDestino,cajaegresoLogic.getCajaEgresos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaegresoDestino,cajaegresos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajaEgreso(false);
				
				//this.jTableDatosCajaEgreso.setRowSelectionInterval(this.getIndiceNuevoCajaEgreso(), this.getIndiceNuevoCajaEgreso());
				
				int iLastRow =  this.jTableDatosCajaEgreso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaEgreso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaEgreso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaEgreso(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajaEgreso.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajaEgreso.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajaEgreso.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajaEgreso.setVisible(!isVisible);
			this.jPanelPaginacionCajaEgreso.setVisible(!isVisible);
			this.jPanelAccionesCajaEgreso.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajaEgreso();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajaEgreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajaEgreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajaEgreso();
			
			this.abrirFrameOrderByCajaEgreso();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajaEgreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajaEgreso(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaEgreso);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajaEgreso.isMaximum()) {
					this.jInternalFrameDetalleFormCajaEgreso.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajaEgreso.setSize(this.jInternalFrameDetalleFormCajaEgreso.iWidthFormulario,this.jInternalFrameDetalleFormCajaEgreso.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajaEgreso.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajaEgreso.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajaEgreso.isMaximum()) {
						this.jInternalFrameDetalleFormCajaEgreso.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajaEgreso.jContentPaneDetalleCajaEgreso.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajaEgreso.jContentPaneDetalleCajaEgreso.getWidth(),CajaEgresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajaEgreso.jContentPaneDetalleCajaEgreso.getWidth(),CajaEgresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajaEgreso.jContentPaneDetalleCajaEgreso.getWidth(),CajaEgresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CajaEgresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCajaEgresoDetalle();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajaEgreso.setVisible(true);
	        this.jInternalFrameDetalleFormCajaEgreso.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajaEgreso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajaEgreso==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajaEgreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaEgreso,false,this);
				} else {
					this.jInternalFrameOrderByCajaEgreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaEgreso,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajaEgreso);
				this.jInternalFrameOrderByCajaEgreso.setVisible(false);
				this.jInternalFrameOrderByCajaEgreso.setSelected(false);
				
				this.jInternalFrameOrderByCajaEgreso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaEgreso"));
				
				this.inicializarActualizarBindingTablaOrderByCajaEgreso();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajaEgreso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajaEgreso==null) {
				
				this.jInternalFrameImportacionCajaEgreso=new ImportacionJInternalFrame(CajaEgresoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaEgreso);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajaEgreso);
				this.jInternalFrameImportacionCajaEgreso.setVisible(false);
				this.jInternalFrameImportacionCajaEgreso.setSelected(false);


				this.jInternalFrameImportacionCajaEgreso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaEgreso"));
				this.jInternalFrameImportacionCajaEgreso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaEgreso"));
				this.jInternalFrameImportacionCajaEgreso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaEgreso"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajaEgreso() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajaEgreso==null) {
				this.jInternalFrameReporteDinamicoCajaEgreso=new ReporteDinamicoJInternalFrame(CajaEgresoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaEgreso);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaEgreso);
				this.jInternalFrameReporteDinamicoCajaEgreso.setVisible(false);
				this.jInternalFrameReporteDinamicoCajaEgreso.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajaEgreso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaEgreso"));
				this.jInternalFrameReporteDinamicoCajaEgreso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaEgreso"));
				this.jInternalFrameReporteDinamicoCajaEgreso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaEgreso"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaEgreso();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCajaEgresoDetalle() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaEgresoDetalle.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCajaEgreso.jContentPaneDetalleCajaEgreso.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaEgresoDetalle.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaEgresoDetalle.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaEgresoDetalle.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCajaEgreso() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaEgreso);
			
	       	this.jInternalFrameDetalleFormCajaEgreso.setVisible(false);
	        this.jInternalFrameDetalleFormCajaEgreso.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajaEgreso.dispose();
			//this.jInternalFrameDetalleFormCajaEgreso=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajaEgreso() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajaEgreso.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajaEgreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajaEgreso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajaEgreso.setVisible(true);
	        this.jInternalFrameImportacionCajaEgreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajaEgreso() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajaEgreso.setVisible(true);
	        this.jInternalFrameOrderByCajaEgreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajaEgreso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajaEgreso.setVisible(false);
	        this.jInternalFrameOrderByCajaEgreso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajaEgreso() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajaEgreso.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajaEgreso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajaEgreso() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajaEgreso.setVisible(false);
	        this.jInternalFrameImportacionCajaEgreso.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajaEgreso(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajaEgreso(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajaEgreso(true);
			//this.isEsNuevoCajaEgreso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajaEgreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaEgreso(false) ;
			
			if(cajaegresoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.getEsGuardarRelacionado() && CajaEgresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajaEgresoDetalleActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CajaEgresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaEgreso(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaEgreso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajaEgresoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajaEgreso(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajaEgreso(true);
			//this.isEsNuevoCajaEgreso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajaegreso.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajaEgreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajaEgreso(false) ;
			
			if(CajaEgresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaEgreso(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaEgreso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaEgreso.getSelectedRow();

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
		TableColumn tableColumnTurnoPunVen=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN));
		TableCellEditor tableCellEditorTurnoPunVen =tableColumnTurnoPunVen.getCellEditor();

		TurnoPunVenTableCell turnopunvenTableCellFk=(TurnoPunVenTableCell)tableCellEditorTurnoPunVen;

		if(turnopunvenTableCellFk!=null) {
			turnopunvenTableCellFk.setturnopunvensForeignKey(turnopunvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaEgreso.getSelectedRow();

		//if(intSelectedRow<=0) {
			//turnopunvenTableCellFk.setRowActual(intSelectedRow);
			//turnopunvenTableCellFk.setturnopunvensForeignKeyActual(turnopunvensForeignKey);
		//}


		if(turnopunvenTableCellFk!=null) {
			turnopunvenTableCellFk.RecargarTurnoPunVensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajaEgreso(false);
			
			//if(!this.isEsNuevoCajaEgreso) {								
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				
			}
			
			if(this.permiteMantenimiento(this.cajaegreso)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajaEgreso=true;
					this.inicializarActualizarBindingTablaCajaEgreso(false);
					this.isEsNuevoCajaEgreso=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajaEgreso=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajaEgreso=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaEgreso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaEgreso(false);
				
				this.habilitarDeshabilitarControlesCajaEgreso(false);
			
												
				
				if(CajaEgresoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajaEgreso();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajaEgresoActionPerformed(evt,cajaegresoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajaEgreso(this.cajaegreso,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajaEgreso.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajaegresoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajaegreso.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajaEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				this.cajaegreso.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				this.cajaegreso.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajaegreso)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajaEgresoModel) this.jTableDatosCajaEgreso.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajaEgreso=true;
				this.inicializarActualizarBindingTablaCajaEgreso(false);
				this.isEsNuevoCajaEgreso=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaEgreso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaEgreso(false);
				
				this.habilitarDeshabilitarControlesCajaEgreso(false);
				
				
				
				if(CajaEgresoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajaEgreso();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajaEgresoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajaEgreso.getRowCount()>=1) {
				jTableDatosCajaEgreso.removeRowSelectionInterval(0, jTableDatosCajaEgreso.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajaEgreso(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajaEgreso(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaEgreso(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaEgreso(false) ;
			
			this.isEsNuevoCajaEgreso=false;
			
			if(CajaEgresoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajaEgreso();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajaEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajaEgreso(false);
				
				//SI ES MANUAL
				if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajaEgreso();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajaEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajaEgreso--;			
			//CajaEgreso cajaegresoAux= new CajaEgreso();			
			//cajaegresoAux.setId(this.iIdNuevoCajaEgreso);
			
			if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajaEgreso();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
			
			this.cajaegreso.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajaegresoLogic.getCajaEgresos().add(this.cajaegresoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajaegresos.add(this.cajaegresoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajaEgreso(false);
			
			this.jTableDatosCajaEgreso.setRowSelectionInterval(this.getIndiceNuevoCajaEgreso(), this.getIndiceNuevoCajaEgreso());
			
			int iLastRow =  this.jTableDatosCajaEgreso.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajaEgreso.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajaEgreso.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajaEgreso(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajaEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajaEgreso(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaEgreso(false);
			
			//SI ES MANUAL
			if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaEgreso();
			}
			
			//this.abrirFrameTreeCajaEgreso();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajaEgresoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Caja EgresoS ?", "MANTENIMIENTO DE Caja Egreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCajaEgreso.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCajaEgreso();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cajaegresoReturnGeneral=cajaegresoLogic.procesarImportacionCajaEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cajaegresoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCajaEgresoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajaEgresoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajaEgreso.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajaEgreso.setFileImportacion(this.jInternalFrameImportacionCajaEgreso.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajaEgreso.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajaEgreso.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajaEgreso.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajaEgreso.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajaEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		

		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajaEgresoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajaEgresoBaseDesign.jrxml";
			
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
			
			this.generarReporteCajaEgresos("Todos",cajaegresosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaEgresoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TurnoPunVen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TurnoPunVen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TurnoPunVen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TurnoPunVen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoConstantesFunciones.LABEL_HORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCajaEgreso.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajaEgresoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					sNombreCampoCategoria="id_turno_pun_ven";
					break;

				case CajaEgresoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case CajaEgresoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case CajaEgresoConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoria="hora";
					break;

				case CajaEgresoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajaEgresoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					sNombreCampoCategoriaValor="id_turno_pun_ven";
					break;

				case CajaEgresoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case CajaEgresoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case CajaEgresoConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoriaValor="hora";
					break;

				case CajaEgresoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaEgresoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Turno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_turno_pun_ven");
					break;

				case CajaEgresoConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case CajaEgresoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case CajaEgresoConstantesFunciones.LABEL_HORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora");
					break;

				case CajaEgresoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoCajaEgresoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegreso";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CajaEgresos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajaEgresoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.getturnopunven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoConstantesFunciones.LABEL_HORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_HORA);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.gethora());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(CajaEgreso cajaegreso:cajaegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegreso.getvalor());
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
			//	this.getFilaCabeceraExportarExcelCajaEgreso(row);				
			//	iRow++;
			//}				
			
			//for(CajaEgreso cajaegresoAux:cajaegresosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajaEgreso(cajaegresoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
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
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaEgreso(false);
			
			//SI ES MANUAL
			if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaEgreso();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajaEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaEgreso(false);
			
			//SI ES MANUAL
			if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaEgreso();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajaEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaEgreso(false);
			
			//SI ES MANUAL
			if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaEgreso();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajaEgreso() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajaEgreso.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajaEgreso.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajaEgreso.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajaEgreso.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajaEgreso.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajaEgreso.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajaEgreso.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajaEgreso(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajaEgreso(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajaEgreso(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajaEgreso(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajaEgreso(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajaEgreso(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaEgreso(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajaEgreso(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajaEgreso() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajaEgreso();
		
		this.inicializarActualizarBindingBotonesManualCajaEgreso(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajaEgreso();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaEgreso() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajaEgreso(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajaEgreso(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajaEgreso.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajaEgreso.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajaEgreso.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajaEgreso.jCheckBoxPostAccionNuevoCajaEgreso.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajaEgreso.jCheckBoxPostAccionSinCerrarCajaEgreso.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajaEgreso.jCheckBoxPostAccionSinMensajeCajaEgreso.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajaEgreso.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajaEgreso.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajaEgreso.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
				this.jInternalFrameDetalleFormCajaEgreso.jCheckBoxPostAccionNuevoCajaEgreso.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajaEgreso.jCheckBoxPostAccionSinCerrarCajaEgreso.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajaEgreso.jCheckBoxPostAccionSinMensajeCajaEgreso.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajaEgreso.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajaEgreso.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajaEgreso.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajaEgreso.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajaEgreso.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajaEgreso.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajaEgreso.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajaEgreso.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajaEgreso.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajaEgreso(Boolean esInicializar) throws Exception {
		try	{	
			if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajaEgreso(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajaEgreso() throws Exception {
		try	{
			if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaEgreso();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaEgreso() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaEgreso() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajaEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajaEgreso.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajaEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajaEgreso.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajaEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajaEgreso.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajaEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajaEgreso.addItem(reporte);
			}
			
			
			if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajaEgreso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajaEgreso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajaEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajaEgreso.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajaEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajaEgreso.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajaEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajaEgreso.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajaEgreso.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaEgreso();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaEgreso() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
				this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
				this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajaEgreso.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgreso.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaEgreso.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CajaEgresoConstantesFunciones.getTiposSeleccionarCajaEgreso(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CajaEgresoConstantesFunciones.getTiposSeleccionarCajaEgreso(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CajaEgresoConstantesFunciones.getTiposSeleccionarCajaEgreso(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaEgreso.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCajaEgreso.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajaEgreso()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cajaFK_IdCajaCajaEgreso.getSelectedItem()!=null){this.id_cajaFK_IdCaja=((Caja)this.jComboBoxid_cajaFK_IdCajaCajaEgreso.getSelectedItem()).getId();}
		if(this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.getSelectedItem()!=null){this.id_turno_pun_venFK_IdTurnoPunVen=((TurnoPunVen)this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajaEgreso.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajaEgreso(Boolean esInicializar) throws Exception {				
		if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajaEgreso();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajaEgreso() throws Exception {
		this.inicializarActualizarBindingTablaCajaEgreso(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajaEgreso() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajaEgresoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajaEgreso(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajaegresoLogic.getCajaEgresos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajaegresos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajaEgreso.setModel(new CajaEgresoModel(this.cajaegresoLogic.getCajaEgresos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajaEgreso.setModel(new CajaEgresoModel(this.cajaegresos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajaEgreso!=null && this.jInternalFrameOrderByCajaEgreso.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajaEgreso();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO,cajaegresoConstantesFunciones.resaltarSeleccionarCajaEgreso,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO,cajaegresoConstantesFunciones.resaltarSeleccionarCajaEgreso,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_ID));

		if(this.cajaegresoConstantesFunciones.mostraridCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajaegresoConstantesFunciones.resaltaridCajaEgreso,this.cajaegresoConstantesFunciones.activaridCajaEgreso,iSizeTabla,this,true,"idCajaEgreso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaegresoConstantesFunciones.resaltaridCajaEgreso,this.cajaegresoConstantesFunciones.activaridCajaEgreso,this,true,"idCajaEgreso","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cajaegresoConstantesFunciones.mostrarid_empresaCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cajaegresoConstantesFunciones.resaltarid_empresaCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_empresaCajaEgreso,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cajaegresoConstantesFunciones.resaltarid_empresaCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_empresaCajaEgreso,false,"id_empresaCajaEgreso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cajaegresoConstantesFunciones.mostrarid_sucursalCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cajaegresoConstantesFunciones.resaltarid_sucursalCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_sucursalCajaEgreso,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cajaegresoConstantesFunciones.resaltarid_sucursalCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_sucursalCajaEgreso,false,"id_sucursalCajaEgreso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_IDUSUARIO));

		if(this.cajaegresoConstantesFunciones.mostrarid_usuarioCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.cajaegresoConstantesFunciones.resaltarid_usuarioCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_usuarioCajaEgreso,iSizeTabla));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.cajaegresoConstantesFunciones.resaltarid_usuarioCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_usuarioCajaEgreso,false,"id_usuarioCajaEgreso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_IDCAJA));

		if(this.cajaegresoConstantesFunciones.mostrarid_cajaCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_IDCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CajaTableCell(this.cajasForeignKey,this.cajaegresoConstantesFunciones.resaltarid_cajaCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_cajaCajaEgreso,iSizeTabla));
			tableColumn.setCellEditor(new CajaTableCell(this.cajasForeignKey,this.cajaegresoConstantesFunciones.resaltarid_cajaCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_cajaCajaEgreso,true,"id_cajaCajaEgreso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN));

		if(this.cajaegresoConstantesFunciones.mostrarid_turno_pun_venCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TurnoPunVenTableCell(this.turnopunvensForeignKey,this.cajaegresoConstantesFunciones.resaltarid_turno_pun_venCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_turno_pun_venCajaEgreso,iSizeTabla));
			tableColumn.setCellEditor(new TurnoPunVenTableCell(this.turnopunvensForeignKey,this.cajaegresoConstantesFunciones.resaltarid_turno_pun_venCajaEgreso,this,this.cajaegresoConstantesFunciones.activarid_turno_pun_venCajaEgreso,true,"id_turno_pun_venCajaEgreso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_SECUENCIAL));

		if(this.cajaegresoConstantesFunciones.mostrarsecuencialCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajaegresoConstantesFunciones.resaltarsecuencialCajaEgreso,this.cajaegresoConstantesFunciones.activarsecuencialCajaEgreso,iSizeTabla,this,true,"secuencialCajaEgreso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaegresoConstantesFunciones.resaltarsecuencialCajaEgreso,this.cajaegresoConstantesFunciones.activarsecuencialCajaEgreso,this,true,"secuencialCajaEgreso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_FECHA));

		if(this.cajaegresoConstantesFunciones.mostrarfechaCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cajaegresoConstantesFunciones.resaltarfechaCajaEgreso,this.cajaegresoConstantesFunciones.activarfechaCajaEgreso,iSizeTabla,this,true,"fechaCajaEgreso","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cajaegresoConstantesFunciones.resaltarfechaCajaEgreso,this.cajaegresoConstantesFunciones.activarfechaCajaEgreso,this,true,"fechaCajaEgreso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_HORA));

		if(this.cajaegresoConstantesFunciones.mostrarhoraCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_HORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cajaegresoConstantesFunciones.resaltarhoraCajaEgreso,this.cajaegresoConstantesFunciones.activarhoraCajaEgreso,iSizeTabla,this,true,"horaCajaEgreso","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cajaegresoConstantesFunciones.resaltarhoraCajaEgreso,this.cajaegresoConstantesFunciones.activarhoraCajaEgreso,iSizeTabla,this,true,"horaCajaEgreso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,CajaEgresoConstantesFunciones.LABEL_VALOR));

		if(this.cajaegresoConstantesFunciones.mostrarvalorCajaEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajaegresoConstantesFunciones.resaltarvalorCajaEgreso,this.cajaegresoConstantesFunciones.activarvalorCajaEgreso,iSizeTabla,this,true,"valorCajaEgreso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaegresoConstantesFunciones.resaltarvalorCajaEgreso,this.cajaegresoConstantesFunciones.activarvalorCajaEgreso,this,true,"valorCajaEgreso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCajaEgresoDetalle && this.cajaegresoConstantesFunciones.mostrarCajaEgresoDetalleCajaEgreso && !CajaEgresoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Caja Egreso Detalles");
				tableColumn.setHeaderValue("Caja Egreso Detalles");
				tableColumn.setCellRenderer(new CajaEgresoDetalleTableCell(cajaegresoConstantesFunciones.resaltarCajaEgresoDetalleCajaEgreso,this,this.cajaegresoConstantesFunciones.activarCajaEgresoDetalleCajaEgreso));
				tableColumn.setCellEditor(new CajaEgresoDetalleTableCell(cajaegresoConstantesFunciones.resaltarCajaEgresoDetalleCajaEgreso,this,this.cajaegresoConstantesFunciones.activarCajaEgresoDetalleCajaEgreso));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCajaEgreso.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajaegresoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajaegresoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaEgreso.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajaegresoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajaegresoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaEgreso.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajaegresoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajaegresoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajaEgreso.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.cajaegresoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosCajaEgreso.addColumn(tableColumn);
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
			
			this.jTableDatosCajaEgreso.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cajaegresoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajaEgreso.moveColumn(this.jTableDatosCajaEgreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajaEgreso.moveColumn(this.jTableDatosCajaEgreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cajaegresoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCajaEgreso.moveColumn(this.jTableDatosCajaEgreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajaEgreso.moveColumn(this.jTableDatosCajaEgreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajaEgreso.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajaEgreso.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajaEgreso,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajaEgreso.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajaEgreso.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajaEgreso.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajaEgreso.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajaEgreso.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cajaegresoLogic.getCajaEgresos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajaegresos.size()-1;
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
		//this.jTableDatosCajaEgreso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajaEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajaEgreso();
			
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
				
				//this.isEsNuevoCajaEgreso=false;
					
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
				if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajaEgreso==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaEgreso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaEgreso.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajaegreso.getsType().equals("DUPLICADO")
				   || this.cajaegreso.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajaEgreso=true;
				
				} else {
					this.isEsNuevoCajaEgreso=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
					if(this.cajaegreso.getId()>=0 && !this.cajaegreso.getIsNew()) {						
						this.isEsNuevoCajaEgreso=false;
						
					} else {
						this.isEsNuevoCajaEgreso=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajaEgreso(esRelaciones);						
				
				this.seleccionarCajaEgreso(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajaegreso.getId()<0) {
					this.isEsNuevoCajaEgreso=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajaEgreso(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajaEgreso(evt,rowIndex);
				}	
				
				if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CajaEgreso: " + this.dDif); 
					}
				}								
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajaEgreso(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajaegreso)) {
					if(this.cajaegreso.getId()>0) {
						this.cajaegreso.setIsDeleted(true);
						
						this.cajaegresosEliminados.add(this.cajaegreso);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajaegresoLogic.getCajaEgresos().remove(this.cajaegreso);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajaegresos.remove(this.cajaegreso);				
					}
					
					
					((CajaEgresoModel) this.jTableDatosCajaEgreso.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaEgreso(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajaEgreso(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajaEgreso) {
			
			if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaEgreso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaEgreso.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajaEgreso(this.cajaegreso);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cajaegresoConstantesFunciones.cargarid_empresaCajaEgreso || this.cajaegresoConstantesFunciones.event_dependid_empresaCajaEgreso) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cajaegreso.getid_empresa());
									//this.inicializarActualizarBindingCajaEgreso(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cajaegreso.getEmpresa()!=null) {
							this.empresasForeignKey.add(cajaegreso.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cajaegreso.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cajaegresoConstantesFunciones.cargarid_sucursalCajaEgreso || this.cajaegresoConstantesFunciones.event_dependid_sucursalCajaEgreso) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cajaegreso.getid_sucursal());
									//this.inicializarActualizarBindingCajaEgreso(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cajaegreso.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cajaegreso.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cajaegreso.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.cajaegresoConstantesFunciones.cargarid_usuarioCajaEgreso || this.cajaegresoConstantesFunciones.event_dependid_usuarioCajaEgreso) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.cajaegreso.getid_usuario());
									//this.inicializarActualizarBindingCajaEgreso(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(cajaegreso.getUsuario()!=null) {
							this.usuariosForeignKey.add(cajaegreso.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.cajaegreso.getid_usuario(),false,"Formulario");

					//Caja
					if(!this.cajaegresoConstantesFunciones.cargarid_cajaCajaEgreso || this.cajaegresoConstantesFunciones.event_dependid_cajaCajaEgreso) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.cajaegreso.getid_caja());
									//this.inicializarActualizarBindingCajaEgreso(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(cajaegreso.getCaja()!=null) {
							this.cajasForeignKey.add(cajaegreso.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.cajaegreso.getid_caja(),false,"Formulario");

					//TurnoPunVen
					if(!this.cajaegresoConstantesFunciones.cargarid_turno_pun_venCajaEgreso || this.cajaegresoConstantesFunciones.event_dependid_turno_pun_venCajaEgreso) {
						//this.cargarCombosTurnoPunVensForeignKeyLista(" where id="+this.cajaegreso.getid_turno_pun_ven());
									//this.inicializarActualizarBindingCajaEgreso(false,false);
						this.turnopunvensForeignKey=new ArrayList<TurnoPunVen>();

						if(cajaegreso.getTurnoPunVen()!=null) {
							this.turnopunvensForeignKey.add(cajaegreso.getTurnoPunVen());
						}

						this.addItemDefectoCombosForeignKeyTurnoPunVen();
						this.cargarCombosFrameTurnoPunVensForeignKey("Todos");
					}
					this.setActualTurnoPunVenForeignKey(this.cajaegreso.getid_turno_pun_ven(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajaEgreso("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajaEgreso(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaEgreso() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaEgreso(CajaEgreso cajaegreso) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajaEgreso(cajaegreso,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaEgreso(CajaEgreso cajaegreso,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajaEgreso(cajaegreso);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajaEgreso(cajaegreso,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajaEgreso(cajaegreso);
	}
	
	public void setVariablesObjetoActualToFormularioCajaEgreso(CajaEgreso cajaegreso) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.setText(cajaegreso.getId().toString());
			this.jInternalFrameDetalleFormCajaEgreso.jTextFieldsecuencialCajaEgreso.setText(cajaegreso.getsecuencial());
			this.jInternalFrameDetalleFormCajaEgreso.jDateChooserfechaCajaEgreso.setDate(cajaegreso.getfecha());
			this.jInternalFrameDetalleFormCajaEgreso.jSpinnerhoraCajaEgreso.setValue(cajaegreso.gethora());
			this.jInternalFrameDetalleFormCajaEgreso.jTextFieldvalorCajaEgreso.setText(cajaegreso.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CajaEgreso cajaegresoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajaegresoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CajaEgreso cajaegresoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajaegresoLocal=this.cajaegreso;
			} else {
				cajaegresoLocal=this.cajaegresoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajaegresoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajaEgreso(cajaegresoLocal,true);
					
					if(cajaegresoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajaegresoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajaegresoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajaEgreso(CajaEgreso cajaegreso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaEgreso(cajaegreso,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(cajaegreso);
	}
	
	public void setVariablesFormularioToObjetoActualCajaEgreso(CajaEgreso cajaegreso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaEgreso(cajaegreso,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajaEgreso(CajaEgreso cajaegreso,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.getText()==null || this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.getText()=="" || this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.getText()=="Id") {
				this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.setText("0");
			}

			if(conColumnasBase) {cajaegreso.setId(Long.parseLong(this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaEgresoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelIdCajaEgreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaegreso.setsecuencial(this.jInternalFrameDetalleFormCajaEgreso.jTextFieldsecuencialCajaEgreso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaEgresoConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelsecuencialCajaEgreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaegreso.setfecha(this.jInternalFrameDetalleFormCajaEgreso.jDateChooserfechaCajaEgreso.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaEgresoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelfechaCajaEgreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaegreso.sethora(new Time(((Date)this.jInternalFrameDetalleFormCajaEgreso.jSpinnerhoraCajaEgreso.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaEgresoConstantesFunciones.LABEL_HORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelhoraCajaEgreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaegreso.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormCajaEgreso.jTextFieldvalorCajaEgreso.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaEgresoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgreso.jLabelvalorCajaEgreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaEgreso(CajaEgreso cajaegresoBean,CajaEgreso cajaegreso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cajaegresoBean.getid_caja()!=null && !cajaegresoBean.getid_caja().equals(-1L))) {cajaegreso.setid_caja(cajaegresoBean.getid_caja());}
			if(conDefault || (!conDefault && cajaegresoBean.getid_turno_pun_ven()!=null && !cajaegresoBean.getid_turno_pun_ven().equals(-1L))) {cajaegreso.setid_turno_pun_ven(cajaegresoBean.getid_turno_pun_ven());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajaEgreso(CajaEgreso cajaegresoOrigen,CajaEgreso cajaegreso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajaegresoOrigen.getId()!=null && !cajaegresoOrigen.getId().equals(0L))) {cajaegreso.setId(cajaegresoOrigen.getId());}}
			if(conDefault || (!conDefault && cajaegresoOrigen.getid_caja()!=null && !cajaegresoOrigen.getid_caja().equals(-1L))) {cajaegreso.setid_caja(cajaegresoOrigen.getid_caja());}
			if(conDefault || (!conDefault && cajaegresoOrigen.getid_turno_pun_ven()!=null && !cajaegresoOrigen.getid_turno_pun_ven().equals(-1L))) {cajaegreso.setid_turno_pun_ven(cajaegresoOrigen.getid_turno_pun_ven());}
			if(conDefault || (!conDefault && cajaegresoOrigen.getsecuencial()!=null && !cajaegresoOrigen.getsecuencial().equals(""))) {cajaegreso.setsecuencial(cajaegresoOrigen.getsecuencial());}
			if(conDefault || (!conDefault && cajaegresoOrigen.getfecha()!=null && !cajaegresoOrigen.getfecha().equals(new Date()))) {cajaegreso.setfecha(cajaegresoOrigen.getfecha());}
			if(conDefault || (!conDefault && cajaegresoOrigen.gethora()!=null && !cajaegresoOrigen.gethora().equals(new Time((new Date()).getTime())))) {cajaegreso.sethora(cajaegresoOrigen.gethora());}
			if(conDefault || (!conDefault && cajaegresoOrigen.getvalor()!=null && !cajaegresoOrigen.getvalor().equals(0.0))) {cajaegreso.setvalor(cajaegresoOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaEgreso(CajaEgreso cajaegreso) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.setText(cajaegreso.getId().toString());
			this.jInternalFrameDetalleFormCajaEgreso.jTextFieldsecuencialCajaEgreso.setText(cajaegreso.getsecuencial());
			this.jInternalFrameDetalleFormCajaEgreso.jDateChooserfechaCajaEgreso.setDate(cajaegreso.getfecha());
			this.jInternalFrameDetalleFormCajaEgreso.jSpinnerhoraCajaEgreso.setValue(cajaegreso.gethora());
			this.jInternalFrameDetalleFormCajaEgreso.jTextFieldvalorCajaEgreso.setText(cajaegreso.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaEgreso(CajaEgresoBean cajaegresoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.setText(cajaegresoBean.getId().toString());
			this.jInternalFrameDetalleFormCajaEgreso.jTextFieldsecuencialCajaEgreso.setText(cajaegresoBean.getsecuencial());
			this.jInternalFrameDetalleFormCajaEgreso.jDateChooserfechaCajaEgreso.setDate(cajaegresoBean.getfecha());
			this.jInternalFrameDetalleFormCajaEgreso.jSpinnerhoraCajaEgreso.setValue(cajaegresoBean.gethora());
			this.jInternalFrameDetalleFormCajaEgreso.jTextFieldvalorCajaEgreso.setText(cajaegresoBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajaEgreso(CajaEgresoParameterReturnGeneral cajaegresoReturnGeneral,CajaEgresoBean cajaegresoBean,Boolean conDefault) throws Exception { 
		try {
			CajaEgreso cajaegresoLocal=new CajaEgreso();
			
			cajaegresoLocal=cajaegresoReturnGeneral.getCajaEgreso();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajaegresoLocal.getId()!=null && !cajaegresoLocal.getId().equals(0L))) {cajaegresoBean.setId(cajaegresoLocal.getId());}}
			if(conDefault || (!conDefault && cajaegresoLocal.getid_caja()!=null && !cajaegresoLocal.getid_caja().equals(-1L))) {cajaegresoBean.setid_caja(cajaegresoLocal.getid_caja());}
			if(conDefault || (!conDefault && cajaegresoLocal.getid_turno_pun_ven()!=null && !cajaegresoLocal.getid_turno_pun_ven().equals(-1L))) {cajaegresoBean.setid_turno_pun_ven(cajaegresoLocal.getid_turno_pun_ven());}
			if(conDefault || (!conDefault && cajaegresoLocal.getsecuencial()!=null && !cajaegresoLocal.getsecuencial().equals(""))) {cajaegresoBean.setsecuencial(cajaegresoLocal.getsecuencial());}
			if(conDefault || (!conDefault && cajaegresoLocal.getfecha()!=null && !cajaegresoLocal.getfecha().equals(new Date()))) {cajaegresoBean.setfecha(cajaegresoLocal.getfecha());}
			if(conDefault || (!conDefault && cajaegresoLocal.gethora()!=null && !cajaegresoLocal.gethora().equals(new Time((new Date()).getTime())))) {cajaegresoBean.sethora(cajaegresoLocal.gethora());}
			if(conDefault || (!conDefault && cajaegresoLocal.getvalor()!=null && !cajaegresoLocal.getvalor().equals(0.0))) {cajaegresoBean.setvalor(cajaegresoLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajaEgresoGenerico(Long idCajaEgresoSeleccionado,JComboBox jComboBoxCajaEgreso,List<CajaEgreso> cajaegresosLocal)throws Exception {
		try {
			CajaEgreso  cajaegresoTemp=null;

			for(CajaEgreso cajaegresoAux:cajaegresosLocal) {
				if(cajaegresoAux.getId()!=null && cajaegresoAux.getId().equals(idCajaEgresoSeleccionado)) {
					cajaegresoTemp=cajaegresoAux;
					break;
				}
			}

			jComboBoxCajaEgreso.setSelectedItem(cajaegresoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajaEgresoGenerico(JComboBox jComboBoxCajaEgreso,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaEgreso.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajaEgreso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaEgreso.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajaEgreso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CajaEgresoDetalle")) {
			jButtonCajaEgresoDetalleActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaegreso=(CajaEgreso) cajaegresoLogic.getCajaEgresos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajaegreso =(CajaEgreso) cajaegresos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajaegreso.getIsNew() && !cajaegreso.getIsChanged() && !cajaegreso.getIsDeleted()) {
				sDescripcion=cajaegreso.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegreso.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cajaegreso.getIsNew() && !cajaegreso.getIsChanged() && !cajaegreso.getIsDeleted()) {
				sDescripcion=cajaegreso.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegreso.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!cajaegreso.getIsNew() && !cajaegreso.getIsChanged() && !cajaegreso.getIsDeleted()) {
				sDescripcion=cajaegreso.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegreso.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!cajaegreso.getIsNew() && !cajaegreso.getIsChanged() && !cajaegreso.getIsDeleted()) {
				sDescripcion=cajaegreso.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegreso.getcaja_descripcion();
			}
		}

		if(sTipo.equals("TurnoPunVen")) {
			//sDescripcion=this.getActualTurnoPunVenForeignKeyDescripcion((Long)value);
			if(!cajaegreso.getIsNew() && !cajaegreso.getIsChanged() && !cajaegreso.getIsDeleted()) {
				sDescripcion=cajaegreso.getturnopunven_descripcion();
			} else {
				//sDescripcion=this.getActualTurnoPunVenForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegreso.getturnopunven_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CajaEgreso cajaegresoRow=new CajaEgreso();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaegresoRow=(CajaEgreso) cajaegresoLogic.getCajaEgresos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajaegresoRow=(CajaEgreso) cajaegresos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCajaEgresoDetalleActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CajaEgreso cajaegreso) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCajaEgreso==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso = (CajaEgreso)this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cajaegreso = (CajaEgreso)this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cajaegreso!=null) {
						this.cajaegreso = cajaegreso;
					} else {
						this.cajaegreso = new CajaEgreso();
					}
				}

				if(this.isTienePermisosCajaEgresoDetalle && this.permiteMantenimiento(this.cajaegreso)) {
					CajaEgresoDetalleBeanSwingJInternalFrame cajaegresodetalleBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFramePopup=new CajaEgresoDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cajaegresodetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFramePopup;
					} else {
						cajaegresodetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame;
					}

					List<CajaEgreso> cajaegresos=new ArrayList<CajaEgreso>();
					cajaegresos.add(this.cajaegreso);
					if(!esRelacionado) {
						//cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.setConGuardarRelaciones(false);
						//cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cajaegresodetalleBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCajaEgreso.cargarCajaEgresoDetalleBeanSwingJInternalFrame(cajaegresos,this.cajaegreso,cajaegresodetalleBeanSwingJInternalFrame,/*conInicializar,*/cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.getConGuardarRelaciones(),cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
					cajaegresodetalleBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cajaegresodetalleBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgresoDetalle("no_relacionado");

						cajaegresodetalleBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CajaEgresoDetalleConstantesFunciones.ITAMANIOFILATABLA + (CajaEgresoDetalleConstantesFunciones.ITAMANIOFILATABLA/2));

						cajaegresodetalleBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCajaEgreso=(TitledBorder)this.jScrollPanelDatosCajaEgreso.getBorder();
						TitledBorder titledBorderCajaEgresoDetalle=(TitledBorder)cajaegresodetalleBeanSwingJInternalFrame.jScrollPanelDatosCajaEgresoDetalle.getBorder();

						titledBorderCajaEgresoDetalle.setTitle(titledBorderCajaEgreso.getTitle() + " -> Caja Egreso Detalle");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cajaegresodetalleBeanSwingJInternalFrame);
						}

						cajaegresodetalleBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cajaegresodetalleBeanSwingJInternalFrame);

						cajaegresodetalleBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cajaegresoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Caja Egreso Detalle",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajaEgreso(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoCajaEgreso && this.isPermisoNuevoCajaEgreso));			
			this.jButtonDuplicarCajaEgreso.setVisible((this.isVisibilidadCeldaDuplicarCajaEgreso && this.isPermisoDuplicarCajaEgreso));			
			this.jButtonCopiarCajaEgreso.setVisible((this.isVisibilidadCeldaCopiarCajaEgreso && this.isPermisoCopiarCajaEgreso));
			this.jButtonVerFormCajaEgreso.setVisible((this.isVisibilidadCeldaVerFormCajaEgreso && this.isPermisoVerFormCajaEgreso));
			
			this.jButtonAbrirOrderByCajaEgreso.setVisible((this.isVisibilidadCeldaOrdenCajaEgreso && this.isPermisoOrdenCajaEgreso));			
			
			this.jButtonNuevoRelacionesCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaEgreso && this.isPermisoNuevoCajaEgreso));			
			this.jButtonNuevoGuardarCambiosCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoCajaEgreso && this.isPermisoNuevoCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));
			
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarCajaEgreso.setVisible((this.isVisibilidadCeldaModificarCajaEgreso && this.isPermisoActualizarCajaEgreso));	
			this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarCajaEgreso.setVisible((this.isVisibilidadCeldaActualizarCajaEgreso && this.isPermisoActualizarCajaEgreso));	
			this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarCajaEgreso.setVisible((this.isVisibilidadCeldaEliminarCajaEgreso && this.isPermisoEliminarCajaEgreso));
			this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarCajaEgreso.setVisible(this.isVisibilidadCeldaCancelarCajaEgreso);							
			this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosCajaEgreso.setVisible((this.isVisibilidadCeldaGuardarCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajaEgreso.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoCajaEgreso && this.isPermisoNuevoCajaEgreso));						
			this.jButtonDuplicarToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaDuplicarCajaEgreso && this.isPermisoDuplicarCajaEgreso));						
			this.jButtonCopiarToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaCopiarCajaEgreso && this.isPermisoCopiarCajaEgreso));			
			this.jButtonVerFormToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaVerFormCajaEgreso && this.isPermisoVerFormCajaEgreso));			
			this.jButtonAbrirOrderByToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaOrdenCajaEgreso && this.isPermisoOrdenCajaEgreso));
			this.jButtonNuevoRelacionesToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaEgreso && this.isPermisoNuevoCajaEgreso));			
			this.jButtonNuevoGuardarCambiosToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoCajaEgreso && this.isPermisoNuevoCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));			
			
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaModificarCajaEgreso && this.isPermisoActualizarCajaEgreso));	
			this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaActualizarCajaEgreso  && this.isPermisoActualizarCajaEgreso));	
			this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaEliminarCajaEgreso && this.isPermisoEliminarCajaEgreso));
			this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarToolBarCajaEgreso.setVisible(this.isVisibilidadCeldaCancelarCajaEgreso);				
			this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaGuardarCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajaEgreso.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoCajaEgreso && this.isPermisoNuevoCajaEgreso));			
			this.jMenuItemDuplicarCajaEgreso.setVisible((this.isVisibilidadCeldaDuplicarCajaEgreso && this.isPermisoDuplicarCajaEgreso));			
			this.jMenuItemCopiarCajaEgreso.setVisible((this.isVisibilidadCeldaCopiarCajaEgreso && this.isPermisoCopiarCajaEgreso));			
			this.jMenuItemVerFormCajaEgreso.setVisible((this.isVisibilidadCeldaVerFormCajaEgreso && this.isPermisoVerFormCajaEgreso));			
			this.jMenuItemAbrirOrderByCajaEgreso.setVisible((this.isVisibilidadCeldaOrdenCajaEgreso && this.isPermisoOrdenCajaEgreso));			
			//this.jMenuItemMostrarOcultarCajaEgreso.setVisible((this.isVisibilidadCeldaOrdenCajaEgreso && this.isPermisoOrdenCajaEgreso));
			this.jMenuItemDetalleAbrirOrderByCajaEgreso.setVisible((this.isVisibilidadCeldaOrdenCajaEgreso && this.isPermisoOrdenCajaEgreso));			
			//this.jMenuItemDetalleMostrarOcultarCajaEgreso.setVisible((this.isVisibilidadCeldaOrdenCajaEgreso && this.isPermisoOrdenCajaEgreso));			
			this.jMenuItemNuevoRelacionesCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaEgreso && this.isPermisoNuevoCajaEgreso));			
			this.jMenuItemNuevoGuardarCambiosCajaEgreso.setVisible((this.isVisibilidadCeldaNuevoCajaEgreso && this.isPermisoNuevoCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));									
			
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemModificarCajaEgreso.setVisible((this.isVisibilidadCeldaModificarCajaEgreso && this.isPermisoActualizarCajaEgreso));	
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemActualizarCajaEgreso.setVisible((this.isVisibilidadCeldaActualizarCajaEgreso && this.isPermisoActualizarCajaEgreso));	
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemEliminarCajaEgreso.setVisible((this.isVisibilidadCeldaEliminarCajaEgreso && this.isPermisoEliminarCajaEgreso));
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemCancelarCajaEgreso.setVisible(this.isVisibilidadCeldaCancelarCajaEgreso);				
			}
			
			this.jMenuItemGuardarCambiosCajaEgreso.setVisible((this.isVisibilidadCeldaGuardarCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));						
			this.jMenuItemGuardarCambiosTablaCajaEgreso.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajaEgreso=this.jButtonNuevoCajaEgreso.isVisible();
			this.isVisibilidadCeldaDuplicarCajaEgreso=this.jButtonDuplicarCajaEgreso.isVisible();
			this.isVisibilidadCeldaCopiarCajaEgreso=this.jButtonCopiarCajaEgreso.isVisible();
			this.isVisibilidadCeldaVerFormCajaEgreso=this.jButtonVerFormCajaEgreso.isVisible();
			
			this.isVisibilidadCeldaOrdenCajaEgreso=this.jButtonAbrirOrderByCajaEgreso.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=this.jButtonNuevoRelacionesCajaEgreso.isVisible();
			this.isVisibilidadCeldaModificarCajaEgreso=this.jButtonModificarCajaEgreso.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			this.isVisibilidadCeldaActualizarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarCajaEgreso.isVisible();
			this.isVisibilidadCeldaEliminarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarCajaEgreso.isVisible();
			this.isVisibilidadCeldaCancelarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarCajaEgreso.isVisible();
			this.isVisibilidadCeldaGuardarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosCajaEgreso.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=this.jButtonGuardarCambiosTablaCajaEgreso.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajaEgreso=this.jButtonNuevoToolBarCajaEgreso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=this.jButtonNuevoRelacionesToolBarCajaEgreso.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			this.isVisibilidadCeldaModificarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarToolBarCajaEgreso.isVisible();
			this.isVisibilidadCeldaActualizarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarToolBarCajaEgreso.isVisible();
			this.isVisibilidadCeldaEliminarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarToolBarCajaEgreso.isVisible();
			this.isVisibilidadCeldaCancelarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarToolBarCajaEgreso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaEgreso=this.jButtonGuardarCambiosToolBarCajaEgreso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=this.jButtonGuardarCambiosTablaToolBarCajaEgreso.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajaEgreso=this.jMenuItemNuevoCajaEgreso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=this.jMenuItemNuevoRelacionesCajaEgreso.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			this.isVisibilidadCeldaModificarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jMenuItemModificarCajaEgreso.isVisible();
			this.isVisibilidadCeldaActualizarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jMenuItemActualizarCajaEgreso.isVisible();
			this.isVisibilidadCeldaEliminarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jMenuItemEliminarCajaEgreso.isVisible();
			this.isVisibilidadCeldaCancelarCajaEgreso=this.jInternalFrameDetalleFormCajaEgreso.jMenuItemCancelarCajaEgreso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaEgreso=this.jMenuItemGuardarCambiosCajaEgreso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=this.jMenuItemGuardarCambiosTablaCajaEgreso.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajaEgreso(Boolean esInicializar) {
		if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
				//if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajaEgreso();
			}
			
			this.inicializarActualizarBindingBotonesManualCajaEgreso(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajaEgreso() {
		this.jButtonNuevoCajaEgreso.setVisible(this.isPermisoNuevoCajaEgreso);			
		this.jButtonDuplicarCajaEgreso.setVisible(this.isPermisoDuplicarCajaEgreso);			
		this.jButtonCopiarCajaEgreso.setVisible(this.isPermisoCopiarCajaEgreso);			
		this.jButtonVerFormCajaEgreso.setVisible(this.isPermisoVerFormCajaEgreso);			
		
		this.jButtonAbrirOrderByCajaEgreso.setVisible(this.isPermisoOrdenCajaEgreso);					
		
		this.jButtonNuevoRelacionesCajaEgreso.setVisible(this.isPermisoNuevoCajaEgreso);			
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarCajaEgreso.setVisible(this.isPermisoActualizarCajaEgreso);	
			this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarCajaEgreso.setVisible(this.isPermisoActualizarCajaEgreso);	
			this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarCajaEgreso.setVisible(this.isPermisoEliminarCajaEgreso);
			this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarCajaEgreso.setVisible(this.isVisibilidadCeldaCancelarCajaEgreso);						
			this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosCajaEgreso.setVisible(this.isPermisoGuardarCambiosCajaEgreso);							
		}
		
		this.jButtonGuardarCambiosTablaCajaEgreso.setVisible(this.isPermisoActualizarCajaEgreso);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaEgreso() {
		this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarCajaEgreso.setVisible(this.isPermisoActualizarCajaEgreso);	
		this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarCajaEgreso.setVisible(this.isPermisoActualizarCajaEgreso);	
		this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarCajaEgreso.setVisible(this.isPermisoEliminarCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarCajaEgreso.setVisible(this.isVisibilidadCeldaCancelarCajaEgreso);							
		this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosCajaEgreso.setVisible((this.isVisibilidadCeldaGuardarCajaEgreso && this.isPermisoGuardarCambiosCajaEgreso));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajaEgreso() {
		if(CajaEgresoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajaEgreso();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajaEgreso() {
	}
	
	public void jTableDatosCajaEgresoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajaEgreso(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajaegreso.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajaEgresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajaEgreso(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajaegresoLogic.getConnexion());

				if(this.cajaegreso.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajaegreso.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgreso=(TitledBorder)this.jScrollPanelDatosCajaEgreso.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajaEgreso.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajaegreso.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCajaEgresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCajaEgreso(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cajaegresoLogic.getConnexion());

				if(this.cajaegreso.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cajaegreso.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgreso=(TitledBorder)this.jScrollPanelDatosCajaEgreso.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCajaEgreso.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cajaegreso.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioCajaEgresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebCajaEgreso(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.cajaegresoLogic.getConnexion());

				if(this.cajaegreso.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.cajaegreso.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgreso=(TitledBorder)this.jScrollPanelDatosCajaEgreso.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderCajaEgreso.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.cajaegreso.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaCajaEgresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebCajaEgreso(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.cajaegresoLogic.getConnexion());

				if(this.cajaegreso.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.cajaegreso.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgreso=(TitledBorder)this.jScrollPanelDatosCajaEgreso.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderCajaEgreso.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.cajaegreso.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_turno_pun_venCajaEgresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoturnopunven=true;

			idTienePermisoturnopunven=this.tienePermisosUsuarioEnPaginaWebCajaEgreso(TurnoPunVenConstantesFunciones.CLASSNAME);

			if(idTienePermisoturnopunven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);

				this.turnopunvenBeanSwingJInternalFrame=new TurnoPunVenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.turnopunvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.turnopunvenBeanSwingJInternalFrame.getTurnoPunVenLogic().setConnexion(this.cajaegresoLogic.getConnexion());

				if(this.cajaegreso.getid_turno_pun_ven()!=null) {
					this.turnopunvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.turnopunvenBeanSwingJInternalFrame.setIdActual(this.cajaegreso.getid_turno_pun_ven());
					this.turnopunvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.turnopunvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.turnopunvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaTurnoPunVen();
				}

				JInternalFrameBase jinternalFrame =this.turnopunvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgreso=(TitledBorder)this.jScrollPanelDatosCajaEgreso.getBorder();
				TitledBorder titledBorderturnopunven=(TitledBorder)this.turnopunvenBeanSwingJInternalFrame.jScrollPanelDatosTurnoPunVen.getBorder();

				titledBorderturnopunven.setTitle(titledBorderCajaEgreso.getTitle() + " -> Turno Pun Ven");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_turno_pun_venCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getid_turno_pun_ven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_turno_pun_ven = "+this.cajaegreso.getid_turno_pun_ven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.cajaegreso.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.cajaegreso.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoraCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.gethora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora = "+this.cajaegreso.gethora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorCajaEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.getcajaegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegreso==null) {
						this.cajaegreso = new CajaEgreso();
					}

					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);
				}

				if(this.cajaegreso.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.cajaegreso.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCajaCajaEgresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgreso(false,false);

			this.getCajaEgresosFK_IdCaja();

			this.inicializarActualizarBindingCajaEgreso(false);

			//if(CajaEgresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajaEgresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgreso(false,false);

			this.getCajaEgresosFK_IdEmpresa();

			this.inicializarActualizarBindingCajaEgreso(false);

			//if(CajaEgresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCajaEgresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgreso(false,false);

			this.getCajaEgresosFK_IdSucursal();

			this.inicializarActualizarBindingCajaEgreso(false);

			//if(CajaEgresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTurnoPunVenCajaEgresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgreso(false,false);

			this.getCajaEgresosFK_IdTurnoPunVen();

			this.inicializarActualizarBindingCajaEgreso(false);

			//if(CajaEgresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioCajaEgresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgreso(false,false);

			this.getCajaEgresosFK_IdUsuario();

			this.inicializarActualizarBindingCajaEgreso(false);

			//if(CajaEgresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajaEgreso() {
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
		

		if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
			this.jInternalFrameDetalleFormCajaEgreso.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajaEgreso.dispose();
			this.jInternalFrameDetalleFormCajaEgreso=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
			this.jInternalFrameReporteDinamicoCajaEgreso.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajaEgreso.dispose();
			this.jInternalFrameReporteDinamicoCajaEgreso=null;
		}
		
		if(this.jInternalFrameImportacionCajaEgreso!=null) {
			this.jInternalFrameImportacionCajaEgreso.setVisible(false);	    			
			this.jInternalFrameImportacionCajaEgreso.dispose();
			this.jInternalFrameImportacionCajaEgreso=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajaEgreso();
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajaEgreso")) {
				jButtonNuevoCajaEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajaEgreso")) {
				jButtonDuplicarCajaEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajaEgreso")) {
				jButtonCopiarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajaEgreso")) {
				jButtonVerFormCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajaEgreso")) {
				jButtonNuevoCajaEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajaEgreso")) {
				jButtonDuplicarCajaEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajaEgreso")) {
				jButtonNuevoCajaEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajaEgreso")) {
				jButtonDuplicarCajaEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajaEgreso")) {
				jButtonNuevoCajaEgresoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajaEgreso")) {
				jButtonNuevoCajaEgresoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajaEgreso")) {
				jButtonNuevoCajaEgresoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajaEgreso")) {
				jButtonModificarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajaEgreso")) {
				jButtonModificarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajaEgreso")) {
				jButtonModificarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajaEgreso")) {
				jButtonActualizarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajaEgreso")) {
				jButtonActualizarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajaEgreso")) {
				jButtonActualizarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajaEgreso")) {
				jButtonEliminarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajaEgreso")) {
				jButtonEliminarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajaEgreso")) {
				jButtonEliminarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajaEgreso")) {
				jButtonCancelarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajaEgreso")) {
				jButtonCancelarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajaEgreso")) {
				jButtonCancelarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajaEgreso")) {
				jButtonCerrarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajaEgreso")) {
				jButtonCerrarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajaEgreso")) {
				jButtonCerrarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajaEgreso")) {
				jButtonMostrarOcultarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajaEgreso")) {
				jButtonCancelarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajaEgreso")) {
				jButtonGuardarCambiosCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajaEgreso")) {
				jButtonGuardarCambiosCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajaEgreso")) {
				jButtonCopiarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajaEgreso")) {
				jButtonVerFormCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajaEgreso")) {
				jButtonGuardarCambiosCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajaEgreso")) {
				jButtonCopiarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajaEgreso")) {
				jButtonVerFormCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajaEgreso")) {
				jButtonGuardarCambiosCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajaEgreso")) {
				jButtonGuardarCambiosCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajaEgreso")) {
				jButtonGuardarCambiosCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajaEgreso")) {
				jButtonRecargarInformacionCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajaEgreso")) {
				jButtonRecargarInformacionCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajaEgreso")) {
				jButtonRecargarInformacionCajaEgresoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajaEgreso")) {
				jButtonAnterioresCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajaEgreso")) {
				jButtonAnterioresCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajaEgreso")) {
				jButtonAnterioresCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajaEgreso")) {
				jButtonSiguientesCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajaEgreso")) {
				jButtonSiguientesCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajaEgreso")) {
				jButtonSiguientesCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajaEgreso") || sTipo.equals("MenuItemDetalleAbrirOrderByCajaEgreso")) {
				jButtonAbrirOrderByCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajaEgreso") || sTipo.equals("MenuItemDetalleMostrarOcultarCajaEgreso")) {
				jButtonMostrarOcultarCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajaEgreso")) {
				jButtonNuevoGuardarCambiosCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajaEgreso")) {
				jButtonNuevoGuardarCambiosCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajaEgreso")) {
				jButtonNuevoGuardarCambiosCajaEgresoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajaEgreso")) {
				jButtonCerrarReporteDinamicoCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajaEgreso")) {
				jButtonGenerarReporteDinamicoCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajaEgreso")) {
				
				jButtonGenerarExcelReporteDinamicoCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajaEgreso")) {
				jButtonCerrarImportacionCajaEgresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajaEgreso")) {
				
				jButtonGenerarImportacionCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajaEgreso")) {
				
				jButtonAbrirImportacionCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajaEgreso")) {
				jComboBoxTiposAccionesCajaEgresoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajaEgreso")) {
				jComboBoxTiposRelacionesCajaEgresoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajaEgreso")) {
				jComboBoxTiposAccionesCajaEgresoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajaEgreso")) {
				
				jComboBoxTiposSeleccionarCajaEgresoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajaEgreso")) {
				jTextFieldValorCampoGeneralCajaEgresoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajaEgreso")) {
				jButtonAbrirOrderByCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajaEgreso")) {
				jButtonAbrirOrderByCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajaEgreso")) {
				jButtonCerrarOrderByCajaEgresoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaEgresoBusqueda")) {
				this.jButtonidCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaEgresoUpdate")) {
				this.jButtonid_empresaCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaEgresoBusqueda")) {
				this.jButtonid_empresaCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaEgresoUpdate")) {
				this.jButtonid_sucursalCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaEgresoBusqueda")) {
				this.jButtonid_sucursalCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCajaEgresoUpdate")) {
				this.jButtonid_usuarioCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCajaEgresoBusqueda")) {
				this.jButtonid_usuarioCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaEgresoUpdate")) {
				this.jButtonid_cajaCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaEgresoBusqueda")) {
				this.jButtonid_cajaCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_turno_pun_venCajaEgresoUpdate")) {
				this.jButtonid_turno_pun_venCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_turno_pun_venCajaEgresoBusqueda")) {
				this.jButtonid_turno_pun_venCajaEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialCajaEgresoBusqueda")) {
				this.jButtonsecuencialCajaEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCajaEgresoBusqueda")) {
				this.jButtonfechaCajaEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaCajaEgresoBusqueda")) {
				this.jButtonhoraCajaEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCajaEgresoBusqueda")) {
				this.jButtonvalorCajaEgresoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCajaCajaEgreso")) {
				this.jButtonFK_IdCajaCajaEgresoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTurnoPunVenCajaEgreso")) {
				this.jButtonFK_IdTurnoPunVenCajaEgresoActionPerformed(evt);
			}
			
			;
			
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajaEgreso();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				


				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CajaEgreso cajaegresoLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajaegresoLocal=this.cajaegreso;
			} else {
				cajaegresoLocal=this.cajaegresoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
							
				
				


				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
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
			
			


			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
								
						
				


				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
								
				
				


				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
							
				
				


				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresoAnterior =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajaegresoAnterior =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
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
			
			


			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
								
				
				


				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajaEgreso")) {
					jCheckBoxSeleccionarTodosCajaEgresoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajaEgreso")) {
					jCheckBoxSeleccionadosCajaEgresoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajaEgreso")) {
					
				}
				
				


				
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
												
				
				


				
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresoAnterior =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajaegresoAnterior =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
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
			
			


			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegreso);
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
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
				
				


				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgreso.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresoAnterior =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajaEgreso")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajaEgresoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajaEgreso.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajaegreso =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajaegreso =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajaegreso);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajaEgreso")) {
				
				}
				
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajaEgreso")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajaEgreso.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajaEgreso")) {
			
			}
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajaEgreso();
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
			if(sTipo.equals("NuevoCajaEgreso")) {
				jButtonNuevoCajaEgresoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajaEgreso")) {
				jButtonDuplicarCajaEgresoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajaEgreso")) {
				jButtonCopiarCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajaEgreso")) {
				jButtonVerFormCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajaEgreso")) {
				jButtonNuevoCajaEgresoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajaEgreso")) {
				jButtonModificarCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajaEgreso")) {
				jButtonActualizarCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajaEgreso")) {
				jButtonEliminarCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajaEgreso")) {
				jButtonGuardarCambiosCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajaEgreso")) {
				jButtonCancelarCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajaEgreso")) {
				jButtonCerrarCajaEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajaEgreso")) {
				jButtonGuardarCambiosCajaEgresoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajaEgreso")) {
				jButtonNuevoGuardarCambiosCajaEgresoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajaEgreso")) {
				jButtonAbrirOrderByCajaEgresoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajaEgreso")) {
				jButtonRecargarInformacionCajaEgresoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajaEgreso")) {
				jButtonAnterioresCajaEgresoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajaEgreso")) {
				jButtonSiguientesCajaEgresoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaEgresoBusqueda")) {
				this.jButtonidCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaEgresoUpdate")) {
				this.jButtonid_empresaCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaEgresoBusqueda")) {
				this.jButtonid_empresaCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaEgresoUpdate")) {
				this.jButtonid_sucursalCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaEgresoBusqueda")) {
				this.jButtonid_sucursalCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCajaEgresoUpdate")) {
				this.jButtonid_usuarioCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCajaEgresoBusqueda")) {
				this.jButtonid_usuarioCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaEgresoUpdate")) {
				this.jButtonid_cajaCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaEgresoBusqueda")) {
				this.jButtonid_cajaCajaEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_turno_pun_venCajaEgresoUpdate")) {
				this.jButtonid_turno_pun_venCajaEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_turno_pun_venCajaEgresoBusqueda")) {
				this.jButtonid_turno_pun_venCajaEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialCajaEgresoBusqueda")) {
				this.jButtonsecuencialCajaEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCajaEgresoBusqueda")) {
				this.jButtonfechaCajaEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaCajaEgresoBusqueda")) {
				this.jButtonhoraCajaEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCajaEgresoBusqueda")) {
				this.jButtonvalorCajaEgresoBusquedaActionPerformed(evt);
			}
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajaEgreso();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajaEgreso")) {
				closingInternalFrameCajaEgreso();
				
			} else if(sTipo.equals("jButtonCancelarCajaEgreso")) {
				JInternalFrameBase jInternalFrameDetalleFormCajaEgreso = (JInternalFrameBase)evt.getSource();
	            	
	            CajaEgresoBeanSwingJInternalFrame jInternalFrameParent=(CajaEgresoBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaEgreso.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajaEgresoActionPerformed(null);
			}
			
			CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajaegreso,new Object(),this.cajaegresoParameterGeneral,this.cajaegresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajaEgreso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajaEgreso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajaEgreso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajaegreso)) {
			if(!esControlTabla) {
				if(CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);			
				}
				
				if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajaEgreso(this.cajaegreso,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajaegresoReturnGeneral=cajaegresoLogic.procesarEventosCajaEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaegresoLogic.getCajaEgresos(),this.cajaegreso,this.cajaegresoParameterGeneral,this.isEsNuevoCajaEgreso,classes);//this.cajaegresoLogic.getCajaEgreso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajaEgreso(this.cajaegresoReturnGeneral,this.cajaegresoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajaEgreso(classes,this.cajaegresoReturnGeneral,this.cajaegresoBean,false);
					}
						
					if(this.cajaegresoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajaEgreso(this.cajaegresoReturnGeneral.getCajaEgreso());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajaEgreso(this.cajaegresoReturnGeneral.getCajaEgreso());	
					}
						
					if(this.cajaegresoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajaEgreso(this.cajaegresoReturnGeneral.getCajaEgreso(),classes);//this.cajaegresoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajaEgreso(this.cajaegreso,classes);//this.cajaegresoBean);									
				}
			
				if(CajaEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajaEgreso(this.cajaegreso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgreso(this.cajaegreso);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajaegresoAnterior!=null) {
						this.cajaegreso=this.cajaegresoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajaegresoReturnGeneral=cajaegresoLogic.procesarEventosCajaEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaegresoLogic.getCajaEgresos(),this.cajaegreso,this.cajaegresoParameterGeneral,this.isEsNuevoCajaEgreso,classes);//this.cajaegresoLogic.getCajaEgreso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajaegresoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajaegresoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajaegresoReturnGeneral.getCajaEgreso(),cajaegresoLogic.getCajaEgresos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajaegresoReturnGeneral.getCajaEgreso(),this.cajaegresos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajaEgreso.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajaEgreso.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajaEgreso();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajaEgreso() throws Exception {
		
		CajaEgresoModel cajaegresoModel=(CajaEgresoModel)this.jTableDatosCajaEgreso.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaegresoModel.cajaegresos=this.cajaegresoLogic.getCajaEgresos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajaegresoModel.cajaegresos=this.cajaegresos;
		}
		
		
		((CajaEgresoModel) this.jTableDatosCajaEgreso.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajaEgreso() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajaegresoAnterior(),this.cajaegresoLogic.getCajaEgresos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajaegresoAnterior(),this.cajaegresos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajaEgreso();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajaEgreso(CajaEgreso cajaegreso,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaEgresoDetalle.class)) {
					this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.setCajaEgresoDetalles(cajaegreso.getCajaEgresoDetalles());
					this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
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
										
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaegreso,new Object(),generalEntityParameterGeneral,this.cajaegresoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajaEgresoConstantesFunciones.getClassesRelationshipsOfCajaEgreso(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajaEgresoConstantesFunciones.getClassesRelationshipsFromStringsOfCajaEgreso(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajaEgreso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajaEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaegreso,new Object(),generalEntityParameterGeneral,this.cajaegresoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajaEgreso(CajaEgresoBean cajaegresoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaEgresoDetalle.class)) {
					this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.setCajaEgresoDetalles(cajaegreso.getCajaEgresoDetalles());
					this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajaEgreso(ArrayList<Classe> classes,CajaEgresoReturnGeneral cajaegresoReturnGeneral,CajaEgresoBean cajaegresoBean,Boolean conDefault) throws Exception {
		
			this.cajaegresoBean.setCajaEgresoDetalles(cajaegresoReturnGeneral.getCajaEgreso().getCajaEgresoDetalles());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajaEgreso(CajaEgreso cajaegreso,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaEgresoDetalle.class)) {
					cajaegreso.setCajaEgresoDetalles(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleLogic.getCajaEgresoDetalles());
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
		if(!paraTabla && !this.permiteMantenimiento(this.cajaegreso)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajaEgreso = new CajaEgresoDetalleFormJInternalFrame(jDesktopPane,this.cajaegresoSessionBean.getConGuardarRelaciones(),this.cajaegresoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.setVisible(false);
		this.jInternalFrameDetalleFormCajaEgreso.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajaEgreso.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajaEgreso.cajaegresoLogic=this.cajaegresoLogic;
		
		this.cargarCombosFrameForeignKeyCajaEgreso("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaEgreso();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaEgreso();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajaEgreso("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajaEgreso();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajaEgreso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaEgreso"));
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarCajaEgreso.addActionListener(new ButtonActionListener(this,"ModificarCajaEgreso"));

		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarToolBarCajaEgreso.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaEgreso"));
					
		this.jInternalFrameDetalleFormCajaEgreso.jMenuItemModificarCajaEgreso.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaEgreso"));		
		
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarCajaEgreso.addActionListener (new ButtonActionListener(this,"ActualizarCajaEgreso"));
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarToolBarCajaEgreso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaEgreso"));
						
		this.jInternalFrameDetalleFormCajaEgreso.jMenuItemActualizarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaEgreso"));		
		
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarCajaEgreso.addActionListener (new ButtonActionListener(this,"EliminarCajaEgreso"));
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaEgreso"));
								
		this.jInternalFrameDetalleFormCajaEgreso.jMenuItemEliminarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaEgreso"));		
		
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarCajaEgreso.addActionListener (new ButtonActionListener(this,"CancelarCajaEgreso"));
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaEgreso"));
					
		this.jInternalFrameDetalleFormCajaEgreso.jMenuItemCancelarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaEgreso"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jMenuItemDetalleCerrarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaEgreso"));		
		
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaEgreso"));
		
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaEgreso"));
		
		
		
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaEgreso"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonidCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"idCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_empresaCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_empresaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_sucursalCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_sucursalCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_usuarioCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_usuarioCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_cajaCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_cajaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_turno_pun_venCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_turno_pun_venCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonsecuencialCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonfechaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonhoraCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"horaCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonvalorCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaEgresoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaEgreso"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajaEgreso"));
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaEgreso"));
		}
		
		this.jTableDatosCajaEgreso.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajaEgreso"));
		
		this.jTableDatosCajaEgreso.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajaEgreso"));
		
		this.jButtonNuevoCajaEgreso.addActionListener(new ButtonActionListener(this,"NuevoCajaEgreso"));
		
		this.jButtonDuplicarCajaEgreso.addActionListener(new ButtonActionListener(this,"DuplicarCajaEgreso"));
		
		this.jButtonCopiarCajaEgreso.addActionListener(new ButtonActionListener(this,"CopiarCajaEgreso"));
		
		this.jButtonVerFormCajaEgreso.addActionListener(new ButtonActionListener(this,"VerFormCajaEgreso"));
		
		
		this.jButtonNuevoToolBarCajaEgreso.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajaEgreso"));
			
		this.jButtonDuplicarToolBarCajaEgreso.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajaEgreso"));
			
		this.jMenuItemNuevoCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajaEgreso"));
			
		this.jMenuItemDuplicarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajaEgreso"));		
		
		
		this.jButtonNuevoRelacionesCajaEgreso.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajaEgreso"));
		
		
		this.jButtonNuevoRelacionesToolBarCajaEgreso.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajaEgreso"));
			
		this.jMenuItemNuevoRelacionesCajaEgreso.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajaEgreso"));		
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarCajaEgreso.addActionListener(new ButtonActionListener(this,"ModificarCajaEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonModificarToolBarCajaEgreso.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaEgreso"));
			
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemModificarCajaEgreso.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaEgreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarCajaEgreso.addActionListener (new ButtonActionListener(this,"ActualizarCajaEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonActualizarToolBarCajaEgreso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaEgreso"));
				
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemActualizarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaEgreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarCajaEgreso.addActionListener (new ButtonActionListener(this,"EliminarCajaEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonEliminarToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaEgreso"));
						
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemEliminarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaEgreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarCajaEgreso.addActionListener (new ButtonActionListener(this,"CancelarCajaEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonCancelarToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaEgreso"));
			
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemCancelarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaEgreso"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajaEgreso"));		
		
		
		this.jButtonCerrarCajaEgreso.addActionListener (new ButtonActionListener(this,"CerrarCajaEgreso"));
		
		
		this.jButtonCerrarToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajaEgreso"));
			
		this.jMenuItemCerrarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajaEgreso"));
			
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jMenuItemDetalleCerrarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaEgreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosCajaEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajaEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaEgreso"));
		}
		
		this.jButtonCopiarToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajaEgreso"));
			
		this.jButtonVerFormToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajaEgreso"));
		
		this.jMenuItemGuardarCambiosCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajaEgreso"));
			
		this.jMenuItemCopiarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajaEgreso"));		
		
		this.jMenuItemVerFormCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajaEgreso"));		
		
		
		this.jButtonGuardarCambiosTablaCajaEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaEgreso"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajaEgreso"));
			
		this.jMenuItemGuardarCambiosTablaCajaEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaEgreso"));		
		
		
		
		this.jButtonRecargarInformacionCajaEgreso.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajaEgreso"));
					
		this.jButtonRecargarInformacionToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajaEgreso"));
		
		this.jMenuItemRecargarInformacionCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajaEgreso"));		
		
		
		
		this.jButtonAnterioresCajaEgreso.addActionListener (new ButtonActionListener(this,"AnterioresCajaEgreso"));
		
		
		this.jButtonAnterioresToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajaEgreso"));
		
		this.jMenuItemAnterioresCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajaEgreso"));		
		
		
		this.jButtonSiguientesCajaEgreso.addActionListener (new ButtonActionListener(this,"SiguientesCajaEgreso"));
		
		
		this.jButtonSiguientesToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajaEgreso"));
			
		this.jMenuItemSiguientesCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajaEgreso"));
			
		this.jMenuItemAbrirOrderByCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajaEgreso"));
			
		this.jMenuItemMostrarOcultarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajaEgreso"));
			
		this.jMenuItemDetalleAbrirOrderByCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajaEgreso"));
			
		this.jMenuItemDetalleMostarOcultarCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajaEgreso"));		
		
		
		this.jButtonNuevoGuardarCambiosCajaEgreso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajaEgreso"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajaEgreso"));
			
		this.jMenuItemNuevoGuardarCambiosCajaEgreso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajaEgreso"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajaEgreso.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajaEgreso"));

		this.jCheckBoxSeleccionadosCajaEgreso.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajaEgreso"));
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaEgreso"));
		}
		
		
		this.jComboBoxTiposRelacionesCajaEgreso.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajaEgreso"));
			
		this.jComboBoxTiposAccionesCajaEgreso.addActionListener (new ButtonActionListener(this,"TiposAccionesCajaEgreso"));
					
		this.jComboBoxTiposSeleccionarCajaEgreso.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajaEgreso"));
			
		this.jTextFieldValorCampoGeneralCajaEgreso.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajaEgreso"));		
		
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonidCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"idCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_empresaCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_empresaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_sucursalCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_sucursalCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_usuarioCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_usuarioCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_cajaCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_cajaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_turno_pun_venCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_turno_pun_venCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonsecuencialCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonfechaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonhoraCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"horaCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonvalorCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaEgresoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCajaCajaEgreso.addActionListener(new ButtonActionListener(this,"FK_IdCajaCajaEgreso"));

			this.jButtonFK_IdTurnoPunVenCajaEgreso.addActionListener(new ButtonActionListener(this,"FK_IdTurnoPunVenCajaEgreso"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajaEgreso!=null) {
				this.jInternalFrameReporteDinamicoCajaEgreso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaEgreso"));
				this.jInternalFrameReporteDinamicoCajaEgreso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaEgreso"));
				this.jInternalFrameReporteDinamicoCajaEgreso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaEgreso"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajaEgreso.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaEgreso"));				
			//this.jButtonGenerarReporteDinamicoCajaEgreso.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaEgreso"));
			//this.jButtonGenerarExcelReporteDinamicoCajaEgreso.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaEgreso"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajaEgreso!=null) {
				this.jInternalFrameImportacionCajaEgreso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaEgreso"));
				this.jInternalFrameImportacionCajaEgreso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaEgreso"));
				this.jInternalFrameImportacionCajaEgreso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaEgreso"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajaEgreso.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajaEgreso"));
			
			this.jButtonAbrirOrderByToolBarCajaEgreso.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajaEgreso"));			
			
			if(this.jInternalFrameOrderByCajaEgreso!=null) {
				this.jInternalFrameOrderByCajaEgreso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaEgreso"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgreso.jTabbedPaneRelacionesCajaEgreso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaEgreso"));
		
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
            		closingInternalFrameCajaEgreso();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajaEgreso.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajaEgreso = (JInternalFrameBase)event.getSource();
	            	
	            CajaEgresoBeanSwingJInternalFrame jInternalFrameParent=(CajaEgresoBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaEgreso.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajaEgresoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajaEgreso.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajaEgresoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajaEgreso.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajaEgreso.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajaEgreso";
		inputMap = this.jButtonNuevoCajaEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajaEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaEgresoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajaEgreso";
		inputMap = this.jButtonNuevoRelacionesCajaEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajaEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaEgresoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajaEgreso";
		inputMap = this.jButtonModificarCajaEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajaEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajaEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajaEgreso";
		inputMap = this.jButtonActualizarCajaEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajaEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajaEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajaEgreso";
		inputMap = this.jButtonEliminarCajaEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajaEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajaEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajaEgreso";
		inputMap = this.jButtonCancelarCajaEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajaEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajaEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajaEgreso";
		inputMap = this.jButtonCerrarCajaEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajaEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajaEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajaEgreso";
		inputMap = this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosCajaEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajaEgreso.jButtonGuardarCambiosCajaEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajaEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajaEgreso.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajaEgresoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajaEgreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajaEgresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajaEgreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajaEgresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajaEgreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajaEgresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonidCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"idCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_empresaCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_empresaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_sucursalCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_sucursalCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_usuarioCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_usuarioCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_cajaCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_cajaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_turno_pun_venCajaEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonid_turno_pun_venCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonsecuencialCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonfechaCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonhoraCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"horaCajaEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgreso.jButtonvalorCajaEgresoBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaEgresoBusqueda"));
		
		
		this.jButtonFK_IdCajaCajaEgreso.addActionListener(new ButtonActionListener(this,"FK_IdCajaCajaEgreso"));

		this.jButtonFK_IdTurnoPunVenCajaEgreso.addActionListener(new ButtonActionListener(this,"FK_IdTurnoPunVenCajaEgreso"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajaEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajaEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajaEgresoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajaEgreso.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajaEgreso(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
					cajaegresoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaEgreso cajaegresoAux:cajaegresos) {
					cajaegresoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajaEgresoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaEgreso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
						cajaegresoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaEgreso cajaegresoAux:cajaegresos) {
						cajaegresoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaEgreso cajaegresoAux:cajaegresos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajaEgreso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaEgreso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaEgreso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajaEgresoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaEgreso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajaEgreso.getSelectedRows();
			
			CajaEgreso cajaegresoLocal=new CajaEgreso();
			
			//this.seleccionarTodosCajaEgreso(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLocal =(CajaEgreso) this.cajaegresoLogic.getCajaEgresos().toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajaegresoLocal =(CajaEgreso) this.cajaegresos.toArray()[this.jTableDatosCajaEgreso.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajaegresoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
						cajaegresoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaEgreso cajaegresoAux:cajaegresos) {
						cajaegresoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajaEgreso(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaEgreso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaEgreso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaEgreso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajaEgresoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajaEgresoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajaEgresoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajaEgreso(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajaEgreso.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaEgreso cajaegresoAux:this.cajaegresoLogic.getCajaEgresos()) {
				
						if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							cajaegresoAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cajaegresoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_HORA)) {
							existe=true;
							cajaegresoAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							cajaegresoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaEgreso cajaegresoAux:cajaegresos) {
					
						if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							cajaegresoAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cajaegresoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_HORA)) {
							existe=true;
							cajaegresoAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							cajaegresoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajaEgreso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajaEgresoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajaEgreso(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajaEgreso=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajaEgreso.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajaEgreso) {				
					conSplash=true;//false;										
					
					//this.startProcessCajaEgreso(conSplash);
				
					this.generarReporteCajaEgresosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajaEgresosSeleccionados();
				//this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaEgresosSeleccionados(false);
				//this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaEgresosSeleccionados(true);
				//this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaEgreso();
				
				this.exportarCajaEgresosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajaEgresos();
				//this.importarCajaEgresos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaEgreso();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajaEgresosSeleccionados();
				//this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Caja Egreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajaEgreso();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajaEgreso)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajaEgreso(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.setSelectedIndex(0);					
				}	
			} 			
			else if(CajaEgresoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajaEgreso) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajaEgreso(conSplash);
					
						//this.actualizarParametrosGeneralCajaEgreso();
						
						this.generarReporteProcesoAccionCajaEgresosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajaEgresoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Caja EgresoS SELECCIONADOS?", "MANTENIMIENTO DE Caja Egreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajaEgreso();
				
						this.actualizarParametrosGeneralCajaEgreso();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajaegresoReturnGeneral=cajaegresoLogic.procesarAccionCajaEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajaegresoLogic.getCajaEgresos(),this.cajaegresoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajaEgresoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajaEgreso();
					
					CajaEgresoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajaEgresoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaEgreso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaEgreso.jComboBoxTiposAccionesFormularioCajaEgreso.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajaEgreso(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajaEgresoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajaEgreso();
			
			if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		
			CajaEgreso cajaegreso=new CajaEgreso();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajaEgreso(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajaEgreso.getSelectedItem();
			
			
			
			
			cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajaegresosSeleccionados.size()==1) {
				for(CajaEgreso cajaegresoAux:cajaegresosSeleccionados) {
					cajaegreso=cajaegresoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Caja Egreso Detalle")) {
					jButtonCajaEgresoDetalleActionPerformed(null,rowIndex,true,false,cajaegreso);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajaEgreso();
			
      		//this.finishProcessCajaEgreso(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajaEgresoReturnGeneral() throws Exception {
		if(this.cajaegresoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajaegresoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajaegresoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajaegresoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajaegresoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajaegresoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajaEgreso(false);
		}
		
		if(this.cajaegresoReturnGeneral.getConRetornoLista() || this.cajaegresoReturnGeneral.getConRetornoObjeto()) {
			if(this.cajaegresoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajaegresoLogic.setCajaEgresos(this.cajaegresoReturnGeneral.getCajaEgresos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cajaegresoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajaegresoLogic.setCajaEgreso(this.cajaegresoReturnGeneral.getCajaEgreso());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCajaEgreso(false);
		}
	}
	
	public void actualizarParametrosGeneralCajaEgreso() throws Exception {
		
		
	}
	
	public ArrayList<CajaEgreso> getCajaEgresosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajaEgreso) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CajaEgreso cajaegresoAux:cajaegresoLogic.getCajaEgresos()) {
					if(cajaegresoAux.getIsSelected()) {
						cajaegresosSeleccionados.add(cajaegresoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaEgreso cajaegresoAux:this.cajaegresos) {
					if(cajaegresoAux.getIsSelected()) {
						cajaegresosSeleccionados.add(cajaegresoAux);				
					}
				}
			}
			
			if(cajaegresosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajaegresosSeleccionados.addAll(this.cajaegresoLogic.getCajaEgresos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajaegresosSeleccionados.addAll(this.cajaegresos);				
					}
				}
			}
		} else {
			cajaegresosSeleccionados.add(this.cajaegreso);
		}
		
		return cajaegresosSeleccionados;
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
	
	public void generarReporteCajaEgresosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajaEgresosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajaEgresosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaEgresosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaEgresosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCajaEgresosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Caja Egreso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajaEgresosSeleccionados() throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajaEgresos("Todos",cajaegresosSeleccionados);
		
	}	
	
	public void generarReporteNormalCajaEgresosSeleccionados() throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajaEgresos("Todos",cajaegresosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajaEgresosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajaEgresos("Todos",cajaegresosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajaEgresosSeleccionados() throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajaEgreso();
		
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajaEgreso();
		
		
		//this.generarReporteCajaEgresos("Todos",cajaegresosSeleccionados ,cajaegresoImplementable,cajaegresoImplementableHome);
	}
	
	public void mostrarImportacionCajaEgresos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajaEgreso();
		
		this.abrirFrameImportacionCajaEgreso();		
		
			
		//this.generarReporteCajaEgresos("Todos",cajaegresosSeleccionados ,cajaegresoImplementable,cajaegresoImplementableHome);
	}
	
	public void importarCajaEgresos() throws Exception {		
	
	}
	
	public void exportarCajaEgresosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajaEgresosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajaEgresosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajaEgresosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Caja Egreso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajaEgresosSeleccionados() throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegreso."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajaEgreso(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CajaEgreso cajaegresoAux:cajaegresosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajaEgreso(cajaegresoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajaegresoAux.setsDetalleGeneralEntityReporte(cajaegresoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajaEgreso(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_HORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajaEgreso(CajaEgreso cajaegreso,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajaegreso.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getturnopunven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.gethora().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegreso.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajaEgresosSeleccionados() throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegreso.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CajaEgresos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajaEgreso(row);				
				iRow++;
			}				
			
			for(CajaEgreso cajaegresoAux:cajaegresosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajaEgreso(cajaegresoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajaEgresosSeleccionados() throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();		
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegreso.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajaegresos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajaegreso");
			//elementRoot.appendChild(element);
		
			for(CajaEgreso cajaegresoAux:cajaegresosSeleccionados) {
				element = document.createElement("cajaegreso");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajaEgreso(cajaegresoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajaEgreso(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_HORA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajaEgreso(CajaEgreso cajaegreso,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getturnopunven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.gethora());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegreso.getvalor());				
	}
	
	public void setFilaDatosExportarXmlCajaEgreso(CajaEgreso cajaegreso,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajaEgresoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajaegreso.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajaEgresoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajaegreso.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CajaEgresoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajaegreso.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CajaEgresoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cajaegreso.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(CajaEgresoConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(cajaegreso.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementcaja_descripcion = document.createElement(CajaEgresoConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(cajaegreso.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementturnopunven_descripcion = document.createElement(CajaEgresoConstantesFunciones.IDTURNOPUNVEN);
		elementturnopunven_descripcion.appendChild(document.createTextNode(cajaegreso.getturnopunven_descripcion()));
		element.appendChild(elementturnopunven_descripcion);

		Element elementsecuencial = document.createElement(CajaEgresoConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(cajaegreso.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha = document.createElement(CajaEgresoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(cajaegreso.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementhora = document.createElement(CajaEgresoConstantesFunciones.HORA);
		elementhora.appendChild(document.createTextNode(cajaegreso.gethora().toString().trim()));
		element.appendChild(elementhora);

		Element elementvalor = document.createElement(CajaEgresoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(cajaegreso.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoCajaEgresosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CajaEgreso> cajaegresosSeleccionados=new ArrayList<CajaEgreso>();
		
		cajaegresosSeleccionados=this.getCajaEgresosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCajaEgreso(cajaegresosSeleccionados);
		
		this.generarReporteCajaEgresos("Todos",cajaegresosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajaEgreso(ArrayList<CajaEgreso> cajaegresosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CajaEgreso cajaegresoAux:cajaegresosSeleccionados) {
				cajaegresoAux.setsDetalleGeneralEntityReporte(cajaegresoAux.toString());
			
				if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajaegresoAux.setsDescripcionGeneralEntityReporte1(cajaegresoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cajaegresoAux.setsDescripcionGeneralEntityReporte1(cajaegresoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					cajaegresoAux.setsDescripcionGeneralEntityReporte1(cajaegresoAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					cajaegresoAux.setsDescripcionGeneralEntityReporte1(cajaegresoAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN)) {
					existe=true;
					cajaegresoAux.setsDescripcionGeneralEntityReporte1(cajaegresoAux.getturnopunven_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					cajaegresoAux.setsDescripcionGeneralEntityReporte1(cajaegresoAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					cajaegresoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajaegresoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoConstantesFunciones.LABEL_HORA)) {
					existe=true;
					cajaegresoAux.setsDescripcionGeneralEntityReporte1(cajaegresoAux.gethora().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajaEgreso(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajaEgreso=true;
				this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=true;
				this.isVisibilidadCeldaGuardarCambiosCajaEgreso=true;
			}
			
			this.isVisibilidadCeldaModificarCajaEgreso=false;
			this.isVisibilidadCeldaActualizarCajaEgreso=false;
			this.isVisibilidadCeldaEliminarCajaEgreso=false;
			this.isVisibilidadCeldaCancelarCajaEgreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgreso=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajaEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=false;
			this.isVisibilidadCeldaModificarCajaEgreso=false;
			this.isVisibilidadCeldaActualizarCajaEgreso=true;
			this.isVisibilidadCeldaEliminarCajaEgreso=false;
			this.isVisibilidadCeldaCancelarCajaEgreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgreso=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajaEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=false;
			this.isVisibilidadCeldaModificarCajaEgreso=false;
			this.isVisibilidadCeldaActualizarCajaEgreso=true;
			this.isVisibilidadCeldaEliminarCajaEgreso=true;
			this.isVisibilidadCeldaCancelarCajaEgreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgreso=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajaEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=false;
			this.isVisibilidadCeldaModificarCajaEgreso=false;
			this.isVisibilidadCeldaActualizarCajaEgreso=true;
			this.isVisibilidadCeldaEliminarCajaEgreso=false;
			this.isVisibilidadCeldaCancelarCajaEgreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajaEgreso=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=true;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=true;
			this.isVisibilidadCeldaModificarCajaEgreso=false;
			this.isVisibilidadCeldaActualizarCajaEgreso=false;
			this.isVisibilidadCeldaEliminarCajaEgreso=false;
			this.isVisibilidadCeldaCancelarCajaEgreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgreso=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajaEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=false;
			this.isVisibilidadCeldaActualizarCajaEgreso=false;
			this.isVisibilidadCeldaEliminarCajaEgreso=false;
			this.isVisibilidadCeldaCancelarCajaEgreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajaEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=false;
			this.isVisibilidadCeldaModificarCajaEgreso=true;
			this.isVisibilidadCeldaActualizarCajaEgreso=false;
			this.isVisibilidadCeldaEliminarCajaEgreso=false;
			this.isVisibilidadCeldaCancelarCajaEgreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgreso=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajaEgresoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajaEgreso=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=true;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=true;
		} else {
			this.actualizarEstadoPanelsCajaEgreso(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajaEgreso=false;
			//this.isVisibilidadCeldaVerFormCajaEgreso=false;
			this.isVisibilidadCeldaDuplicarCajaEgreso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajaegresoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
		} else {
			this.isVisibilidadCeldaNuevoCajaEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgreso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajaegresoSessionBean.getEsGuardarRelacionado()) {
			if(!cajaegresoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;												
			}
			
			this.jButtonCerrarCajaEgreso.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajaEgreso=false;
		}
		
		if(!this.permiteMantenimiento(this.cajaegreso)) {
			this.isVisibilidadCeldaActualizarCajaEgreso=false;
			this.isVisibilidadCeldaEliminarCajaEgreso=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajaEgreso() {
		this.isVisibilidadCeldaNuevoCajaEgreso=false;
		this.isVisibilidadCeldaGuardarCambiosCajaEgreso=false;
	}
	
	public void actualizarEstadoPanelsCajaEgreso(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajaEgreso!=null) {
				this.jScrollPanelDatosEdicionCajaEgreso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgreso!=null) {
				this.jScrollPanelDatosCajaEgreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaEgreso!=null) {
				this.jPanelPaginacionCajaEgreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajaEgreso!=null) {
				this.jScrollPanelDatosEdicionCajaEgreso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajaEgreso!=null) {
				this.jScrollPanelDatosCajaEgreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaEgreso!=null) {
				this.jPanelPaginacionCajaEgreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajaEgreso!=null) {
				this.jScrollPanelDatosEdicionCajaEgreso.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgreso!=null) {
				this.jScrollPanelDatosCajaEgreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaEgreso!=null) {
				this.jPanelPaginacionCajaEgreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajaEgreso!=null) {
				this.jScrollPanelDatosEdicionCajaEgreso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgreso!=null) {
				this.jScrollPanelDatosCajaEgreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaEgreso!=null) {
				this.jPanelPaginacionCajaEgreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajaEgreso!=null) {
				this.jScrollPanelDatosEdicionCajaEgreso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgreso!=null) {
				this.jScrollPanelDatosCajaEgreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaEgreso!=null) {
				this.jPanelPaginacionCajaEgreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajaEgreso!=null) {
				this.jScrollPanelDatosEdicionCajaEgreso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgreso!=null) {
				this.jScrollPanelDatosCajaEgreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaEgreso!=null) {
				this.jPanelPaginacionCajaEgreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajaEgreso!=null) {
				this.jScrollPanelDatosEdicionCajaEgreso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgreso!=null) {
				this.jScrollPanelDatosCajaEgreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaEgreso!=null) {
				this.jPanelPaginacionCajaEgreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
					this.jTabbedPaneBusquedasCajaEgreso.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgreso!=null) {
				this.jTabbedPaneBusquedasCajaEgreso.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajaEgreso!=null) {
				this.jPanelParametrosReportesCajaEgreso.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdCajaCajaEgreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdTurnoPunVenCajaEgreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCaja=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdCajaCajaEgreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdTurnoPunVenCajaEgreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdCaja=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdCajaCajaEgreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdTurnoPunVenCajaEgreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadFK_IdCaja=isParaCaja;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdCajaCajaEgreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaCajaNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdTurnoPunVenCajaEgreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaTurnoPunVen(Boolean isParaTurnoPunVen){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTurnoPunVenNegation=!isParaTurnoPunVen;

			this.isVisibilidadFK_IdCaja=isParaTurnoPunVenNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdCajaCajaEgreso);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaTurnoPunVen;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajaEgreso.remove(jPanelFK_IdTurnoPunVenCajaEgreso);}
		}
		
	}
	
	

	public String registrarSesionCajaEgresoParaCajaEgresoDetalles() throws Exception {
		Boolean isPaginaPopupCajaEgresoDetalle=false;

		try {

			if(this.cajaegresoSessionBean==null) {
				this.cajaegresoSessionBean=new CajaEgresoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean==null) {
				this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean.setsPathNavegacionActual(cajaegresoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCajaEgresoDetalle(true);
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajaEgresoDetalle(CajaEgresoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean.setisBusquedaDesdeForeignKeySesionCajaEgreso(true);
			this.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleSessionBean.setlidCajaEgresoActual(this.idCajaEgresoActual);

			cajaegresoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCajaEgreso(true);
			cajaegresoSessionBean.setlIdCajaEgresoActualForeignKey(this.idCajaEgresoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CajaEgresoSessionBean cajaegresoSessionBean=new CajaEgresoSessionBean();
		
		if(this.cajaegresoSessionBean==null) {
			this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		}
		
		this.cajaegresoSessionBean.setsUltimaBusquedaCajaEgreso(this.getsAccionBusqueda());
		this.cajaegresoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cajaegresoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
			cajaegresoSessionBean.setid_caja(this.getid_cajaFK_IdCaja());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cajaegresoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cajaegresoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTurnoPunVen")) {
			cajaegresoSessionBean.setid_turno_pun_ven(this.getid_turno_pun_venFK_IdTurnoPunVen());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			cajaegresoSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CajaEgresoSessionBean cajaegresoSessionBean=new CajaEgresoSessionBean();
		
		if(this.cajaegresoSessionBean==null) {
			this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		}
		
		if(this.cajaegresoSessionBean.getsUltimaBusquedaCajaEgreso()!=null&&!this.cajaegresoSessionBean.getsUltimaBusquedaCajaEgreso().equals("")) {
			this.setsAccionBusqueda(cajaegresoSessionBean.getsUltimaBusquedaCajaEgreso());
			this.setiNumeroPaginacion(cajaegresoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cajaegresoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
				this.setid_cajaFK_IdCaja(cajaegresoSessionBean.getid_caja());
				cajaegresoSessionBean.setid_caja(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cajaegresoSessionBean.getid_empresa());
				cajaegresoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cajaegresoSessionBean.getid_sucursal());
				cajaegresoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTurnoPunVen")) {
				this.setid_turno_pun_venFK_IdTurnoPunVen(cajaegresoSessionBean.getid_turno_pun_ven());
				cajaegresoSessionBean.setid_turno_pun_ven(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(cajaegresoSessionBean.getid_usuario());
				cajaegresoSessionBean.setid_usuario(-1L);
			}
		}
		
		this.cajaegresoSessionBean.setsUltimaBusquedaCajaEgreso("");
		this.cajaegresoSessionBean.setiNumeroPaginacion(CajaEgresoConstantesFunciones.INUMEROPAGINACION);
		this.cajaegresoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajaEgreso(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajaEgreso() {
		this.updateBorderResaltarBusquedasFormularioCajaEgreso();
		this.updateVisibilidadBusquedasFormularioCajaEgreso();
		this.updateHabilitarBusquedasFormularioCajaEgreso();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajaEgreso() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajaEgreso.getComponents().length>0) {
	

		if(this.cajaegresoConstantesFunciones.resaltarFK_IdCajaCajaEgreso!=null) {
			index= this.jTabbedPaneBusquedasCajaEgreso.indexOfComponent(this.jPanelFK_IdCajaCajaEgreso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgreso.getComponent(index);
				jPanel.setBorder(this.cajaegresoConstantesFunciones.resaltarFK_IdCajaCajaEgreso);
			}
		}

		if(this.cajaegresoConstantesFunciones.resaltarFK_IdTurnoPunVenCajaEgreso!=null) {
			index= this.jTabbedPaneBusquedasCajaEgreso.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajaEgreso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgreso.getComponent(index);
				jPanel.setBorder(this.cajaegresoConstantesFunciones.resaltarFK_IdTurnoPunVenCajaEgreso);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajaEgreso() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajaEgreso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaEgreso.indexOfComponent(this.jPanelFK_IdCajaCajaEgreso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgreso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaegresoConstantesFunciones.mostrarFK_IdCajaCajaEgreso);
			if(!this.cajaegresoConstantesFunciones.mostrarFK_IdCajaCajaEgreso && index>-1) {
				this.jTabbedPaneBusquedasCajaEgreso.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajaEgreso.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajaEgreso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgreso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaegresoConstantesFunciones.mostrarFK_IdTurnoPunVenCajaEgreso);
			if(!this.cajaegresoConstantesFunciones.mostrarFK_IdTurnoPunVenCajaEgreso && index>-1) {
				this.jTabbedPaneBusquedasCajaEgreso.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajaEgreso() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajaEgreso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaEgreso.indexOfComponent(this.jPanelFK_IdCajaCajaEgreso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgreso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaegresoConstantesFunciones.activarFK_IdCajaCajaEgreso);
				this.jTabbedPaneBusquedasCajaEgreso.setEnabledAt(index,this.cajaegresoConstantesFunciones.activarFK_IdCajaCajaEgreso);
			}

			index= this.jTabbedPaneBusquedasCajaEgreso.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajaEgreso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgreso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaegresoConstantesFunciones.activarFK_IdTurnoPunVenCajaEgreso);
				this.jTabbedPaneBusquedasCajaEgreso.setEnabledAt(index,this.cajaegresoConstantesFunciones.activarFK_IdTurnoPunVenCajaEgreso);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajaEgreso(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCaja")) {
			index= this.jTabbedPaneBusquedasCajaEgreso.indexOfComponent(this.jPanelFK_IdCajaCajaEgreso);

			this.jTabbedPaneBusquedasCajaEgreso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgreso.getComponent(index);

			this.cajaegresoConstantesFunciones.setResaltarFK_IdCajaCajaEgreso(resaltar);

			jPanel.setBorder(this.cajaegresoConstantesFunciones.resaltarFK_IdCajaCajaEgreso);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTurnoPunVen")) {
			index= this.jTabbedPaneBusquedasCajaEgreso.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajaEgreso);

			this.jTabbedPaneBusquedasCajaEgreso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgreso.getComponent(index);

			this.cajaegresoConstantesFunciones.setResaltarFK_IdTurnoPunVenCajaEgreso(resaltar);

			jPanel.setBorder(this.cajaegresoConstantesFunciones.resaltarFK_IdTurnoPunVenCajaEgreso);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajaEgreso.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCajaEgreso() throws Exception {

		if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajaEgreso();
		this.updateVisibilidadResaltarControlesFormularioCajaEgreso();
		this.updateHabilitarResaltarControlesFormularioCajaEgreso();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajaEgreso() throws Exception {
		if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajaegresoConstantesFunciones.resaltaridCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltaridCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarid_empresaCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarid_empresaCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarid_sucursalCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarid_sucursalCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarid_usuarioCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarid_usuarioCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarid_cajaCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarid_cajaCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarid_turno_pun_venCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarid_turno_pun_venCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarsecuencialCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jTextFieldsecuencialCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarsecuencialCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarfechaCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jDateChooserfechaCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarfechaCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarhoraCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jSpinnerhoraCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarhoraCajaEgreso);}
		if(this.cajaegresoConstantesFunciones.resaltarvalorCajaEgreso!=null && this.jInternalFrameDetalleFormCajaEgreso!=null) {this.jInternalFrameDetalleFormCajaEgreso.jTextFieldvalorCajaEgreso.setBorder(this.cajaegresoConstantesFunciones.resaltarvalorCajaEgreso);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajaEgreso() throws Exception {		
		if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
	
		//this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostraridCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelidCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostraridCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_empresaCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelid_empresaCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_empresaCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_sucursalCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelid_sucursalCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_sucursalCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_usuarioCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelid_usuarioCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_usuarioCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_cajaCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelid_cajaCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_cajaCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_turno_pun_venCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelid_turno_pun_venCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarid_turno_pun_venCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jTextFieldsecuencialCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarsecuencialCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelsecuencialCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarsecuencialCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jDateChooserfechaCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarfechaCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelfechaCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarfechaCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jSpinnerhoraCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarhoraCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelhoraCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarhoraCajaEgreso);
		//this.jInternalFrameDetalleFormCajaEgreso.jTextFieldvalorCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarvalorCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jPanelvalorCajaEgreso.setVisible(this.cajaegresoConstantesFunciones.mostrarvalorCajaEgreso);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajaEgreso() throws Exception {
		if(this.jInternalFrameDetalleFormCajaEgreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaEgreso!=null) {
	
		this.jInternalFrameDetalleFormCajaEgreso.jLabelidCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activaridCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_empresaCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarid_empresaCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_sucursalCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarid_sucursalCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_usuarioCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarid_usuarioCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_cajaCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarid_cajaCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jComboBoxid_turno_pun_venCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarid_turno_pun_venCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jTextFieldsecuencialCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarsecuencialCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jDateChooserfechaCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarfechaCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jSpinnerhoraCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarhoraCajaEgreso);
		this.jInternalFrameDetalleFormCajaEgreso.jTextFieldvalorCajaEgreso.setEnabled(this.cajaegresoConstantesFunciones.activarvalorCajaEgreso);
		}
	}
	
		
}