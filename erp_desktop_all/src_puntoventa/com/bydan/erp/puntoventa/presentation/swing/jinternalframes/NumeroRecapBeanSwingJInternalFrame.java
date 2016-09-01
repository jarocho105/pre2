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

import com.bydan.erp.puntoventa.util.NumeroRecapConstantesFunciones;
import com.bydan.erp.puntoventa.util.NumeroRecapParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.NumeroRecapParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.NumeroRecapBean;
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
public class NumeroRecapBeanSwingJInternalFrame extends NumeroRecapJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NumeroRecapBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NumeroRecap> numerorecapValidator = new ClassValidator<NumeroRecap>(NumeroRecap.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NumeroRecap numerorecap;	
	public NumeroRecap numerorecapAux;
	public NumeroRecap numerorecapAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NumeroRecap numerorecapTotales;
	public Long idNumeroRecapActual;
	public Long iIdNuevoNumeroRecap=0L;
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

	public String sFinalQueryComboConexion="";

	public List<Conexion> conexionsForeignKey;

	public List<Conexion> getconexionsForeignKey() {
		return conexionsForeignKey;
	}

	public void setconexionsForeignKey(List<Conexion> conexionsForeignKey) {
		this.conexionsForeignKey = conexionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Conexion conexionForeignKey;

	public Conexion getconexionForeignKey() {
		return conexionForeignKey;
	}

	public void setconexionForeignKey(Conexion conexionForeignKey) {
		this.conexionForeignKey = conexionForeignKey;
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
	
	public Boolean isPermisoTodoNumeroRecap;
	public Boolean isPermisoNuevoNumeroRecap;
	public Boolean isPermisoActualizarNumeroRecap;
	public Boolean isPermisoActualizarOriginalNumeroRecap;
	public Boolean isPermisoEliminarNumeroRecap;
	public Boolean isPermisoGuardarCambiosNumeroRecap;
	public Boolean isPermisoConsultaNumeroRecap;
	public Boolean isPermisoBusquedaNumeroRecap;
	public Boolean isPermisoReporteNumeroRecap;
	public Boolean isPermisoPaginacionMedioNumeroRecap;
	public Boolean isPermisoPaginacionAltoNumeroRecap;
	public Boolean isPermisoPaginacionTodoNumeroRecap;
	public Boolean isPermisoCopiarNumeroRecap;
	public Boolean isPermisoVerFormNumeroRecap;
	public Boolean isPermisoDuplicarNumeroRecap;
	public Boolean isPermisoOrdenNumeroRecap;
	
	
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
	
	public NumeroRecapParameterReturnGeneral numerorecapReturnGeneral;
	public NumeroRecapParameterReturnGeneral numerorecapParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNumeroRecap=false;
	public Boolean esParaAccionDesdeFormularioNumeroRecap=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NumeroRecapSessionBeanAdditional numerorecapSessionBeanAdditional=null;
	
	public NumeroRecapSessionBeanAdditional getNumeroRecapSessionBeanAdditional() {
		return this.numerorecapSessionBeanAdditional;
	}
	
	public void setNumeroRecapSessionBeanAdditional(NumeroRecapSessionBeanAdditional numerorecapSessionBeanAdditional) {
		try {
			this.numerorecapSessionBeanAdditional=numerorecapSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NumeroRecapBeanSwingJInternalFrameAdditional numerorecapBeanSwingJInternalFrameAdditional=null;
	//public class NumeroRecapBeanSwingJInternalFrame
	
	public NumeroRecapBeanSwingJInternalFrameAdditional getNumeroRecapBeanSwingJInternalFrameAdditional() {
		return this.numerorecapBeanSwingJInternalFrameAdditional;
	}
	
	public void setNumeroRecapBeanSwingJInternalFrameAdditional(NumeroRecapBeanSwingJInternalFrameAdditional numerorecapBeanSwingJInternalFrameAdditional) {
		try {
			this.numerorecapBeanSwingJInternalFrameAdditional=numerorecapBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NumeroRecapLogic numerorecapLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NumeroRecap numerorecapBean;
	public NumeroRecapConstantesFunciones numerorecapConstantesFunciones;
	//public NumeroRecapParameterReturnGeneral numerorecapReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ConexionLogic conexionLogic;
	
	//PARAMETROS
	
	
	//public List<NumeroRecap> numerorecaps;	
	//public List<NumeroRecap> numerorecapsEliminados;
	//public List<NumeroRecap> numerorecapsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNumeroRecap=false;
	public Boolean isVisibilidadCeldaDuplicarNumeroRecap=true;
	public Boolean isVisibilidadCeldaCopiarNumeroRecap=true;
	public Boolean isVisibilidadCeldaVerFormNumeroRecap=true;
	public Boolean isVisibilidadCeldaOrdenNumeroRecap=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
	public Boolean isVisibilidadCeldaModificarNumeroRecap=false;
	public Boolean isVisibilidadCeldaActualizarNumeroRecap=false;
	public Boolean isVisibilidadCeldaEliminarNumeroRecap=false;
	public Boolean isVisibilidadCeldaCancelarNumeroRecap=false;
	public Boolean isVisibilidadCeldaGuardarNumeroRecap=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNumeroRecap=false;	
	
	
	public Boolean isVisibilidadFK_IdConexion=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoNumeroRecap() {
		return this.iIdNuevoNumeroRecap;
	}

	public void setiIdNuevoNumeroRecap(Long iIdNuevoNumeroRecap) {
		this.iIdNuevoNumeroRecap = iIdNuevoNumeroRecap;
	}
	
	public Long getidNumeroRecapActual() {
		return this.idNumeroRecapActual;
	}

	public void setidNumeroRecapActual(Long idNumeroRecapActual) {
		this.idNumeroRecapActual = idNumeroRecapActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NumeroRecap getnumerorecap() {
		return this.numerorecap;
	}

	public void setnumerorecap(NumeroRecap numerorecap) {
		this.numerorecap = numerorecap;
	}
	
	public NumeroRecap getnumerorecapAux() {
		return this.numerorecapAux;
	}

	public void setnumerorecapAux(NumeroRecap numerorecapAux) {
		this.numerorecapAux = numerorecapAux;
	}				
	
	public NumeroRecap getnumerorecapAnterior() {
		return this.numerorecapAnterior;
	}

	public void setnumerorecapAnterior(NumeroRecap numerorecapAnterior) {
		this.numerorecapAnterior = numerorecapAnterior;
	}	
	
	public NumeroRecap getnumerorecapTotales() {
		return this.numerorecapTotales;
	}

	public void setnumerorecapTotales(NumeroRecap numerorecapTotales) {
		this.numerorecapTotales = numerorecapTotales;
	}	
	
	public NumeroRecap getnumerorecapBean() {
		return this.numerorecapBean;
	}

	public void setnumerorecapBean(NumeroRecap numerorecapBean) {
		this.numerorecapBean = numerorecapBean;
	}	
	
	public NumeroRecapParameterReturnGeneral getnumerorecapReturnGeneral() {
		return this.numerorecapReturnGeneral;
	}

	public void setnumerorecapReturnGeneral(NumeroRecapParameterReturnGeneral numerorecapReturnGeneral) {
		this.numerorecapReturnGeneral = numerorecapReturnGeneral;
	}	
	
	
	public Long id_conexionFK_IdConexion=-1L;

	public Long getid_conexionFK_IdConexion() {
		return this.id_conexionFK_IdConexion;
	}

	public void setid_conexionFK_IdConexion(Long id_conexionFK_IdConexion) {
		this.id_conexionFK_IdConexion = id_conexionFK_IdConexion;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NumeroRecapLogic getNumeroRecapLogic()	{		
		return numerorecapLogic;
	}

	public void setNumeroRecapLogic(NumeroRecapLogic numerorecapLogic) {
		this.numerorecapLogic = numerorecapLogic;
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
	
	public Boolean getIsEsNuevoNumeroRecap() {
		return isEsNuevoNumeroRecap;
	}

	public void setIsEsNuevoNumeroRecap(Boolean isEsNuevoNumeroRecap) {
		this.isEsNuevoNumeroRecap = isEsNuevoNumeroRecap;
	}

	public Boolean getEsParaAccionDesdeFormularioNumeroRecap() {
		return esParaAccionDesdeFormularioNumeroRecap;
	}
	
	public void setEsParaAccionDesdeFormularioNumeroRecap(Boolean esParaAccionDesdeFormularioNumeroRecap) {
		this.esParaAccionDesdeFormularioNumeroRecap = esParaAccionDesdeFormularioNumeroRecap;
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

			if(this.numerorecapSessionBean==null) {
				this.numerorecapSessionBean=new NumeroRecapSessionBean();
			}

			if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(numerorecapSessionBean.getlidEmpresaActual());
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

			if(this.numerorecapSessionBean==null) {
				this.numerorecapSessionBean=new NumeroRecapSessionBean();
			}

			if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(numerorecapSessionBean.getlidSucursalActual());
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

	public void cargarCombosConexionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.conexionsForeignKey=new ArrayList<Conexion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ConexionLogic conexionLogic=new ConexionLogic();

			//conexionLogic.getConexionDataAccess().setIsForForeingKeyData(true);

			if(this.numerorecapSessionBean==null) {
				this.numerorecapSessionBean=new NumeroRecapSessionBean();
			}

			if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionConexion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conexionLogic.getConexionDataAccess().setIsForForeingKeyData(true);

					conexionLogic.getTodosConexionsWithConnection(sFinalQuery,new Pagination());

					this.conexionsForeignKey=conexionLogic.getConexions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaConexion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					conexionLogic.getEntityWithConnection(numerorecapSessionBean.getlidConexionActual());
					this.conexionsForeignKey.add(conexionLogic.getConexion());
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

					if(this.numerorecap!=null) {
						this.numerorecap.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
						this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNumeroRecap.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
						if(this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNumeroRecapGenerico)throws Exception
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
				jComboBoxid_empresaNumeroRecapGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNumeroRecapGenerico!=null && jComboBoxid_empresaNumeroRecapGenerico.getItemCount()>0) {
					jComboBoxid_empresaNumeroRecapGenerico.setSelectedIndex(0);
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

					if(this.numerorecap!=null) {
						this.numerorecap.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
						this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalNumeroRecap.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
						if(this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalNumeroRecapGenerico)throws Exception
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
				jComboBoxid_sucursalNumeroRecapGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalNumeroRecapGenerico!=null && jComboBoxid_sucursalNumeroRecapGenerico.getItemCount()>0) {
					jComboBoxid_sucursalNumeroRecapGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualConexionForeignKey(Long idConexionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Conexion  conexionTemp=null;

			for(Conexion conexionAux:conexionsForeignKey) {
				if(conexionAux.getId()!=null && conexionAux.getId().equals(idConexionSeleccionado)) {
					conexionTemp=conexionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(conexionTemp!=null) {

					if(this.numerorecap!=null) {
						this.numerorecap.setConexion(conexionTemp);
					}

					if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
						this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setSelectedItem(conexionTemp);
					}
				} else {
					//jComboBoxid_conexionNumeroRecap.setSelectedItem(conexionTemp);
					if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
						if(this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdConexion") || sFormularioTipoBusqueda.equals("Todos")){
					if(conexionTemp!=null && jComboBoxid_conexionFK_IdConexionNumeroRecap!=null) {
						jComboBoxid_conexionFK_IdConexionNumeroRecap.setSelectedItem(conexionTemp);
					} else {
						if(jComboBoxid_conexionFK_IdConexionNumeroRecap!=null) {
							//jComboBoxid_conexionFK_IdConexionNumeroRecap.setSelectedItem(conexionTemp);
							if(jComboBoxid_conexionFK_IdConexionNumeroRecap.getItemCount()>0) {
								jComboBoxid_conexionFK_IdConexionNumeroRecap.setSelectedIndex(0);
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

	public String getActualConexionForeignKeyDescripcion(Long idConexionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Conexion  conexionTemp=null;

			for(Conexion conexionAux:conexionsForeignKey) {
				if(conexionAux.getId()!=null && conexionAux.getId().equals(idConexionSeleccionado)) {
					conexionTemp=conexionAux;
					break;
				}
			}


			sDescripcion=ConexionConstantesFunciones.getConexionDescripcion(conexionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualConexionForeignKeyGenerico(Long idConexionSeleccionado,JComboBox jComboBoxid_conexionNumeroRecapGenerico)throws Exception
	{
		try
		{
			Conexion  conexionTemp=null;

			for(Conexion conexionAux:conexionsForeignKey) {
				if(conexionAux.getId()!=null && conexionAux.getId().equals(idConexionSeleccionado)) {
					conexionTemp=conexionAux;
					break;
				}
			}

			if(conexionTemp!=null) {
				jComboBoxid_conexionNumeroRecapGenerico.setSelectedItem(conexionTemp);
			} else {
				if(jComboBoxid_conexionNumeroRecapGenerico!=null && jComboBoxid_conexionNumeroRecapGenerico.getItemCount()>0) {
					jComboBoxid_conexionNumeroRecapGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(NumeroRecap numerorecap,JComboBox jComboBoxid_empresaNumeroRecapGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNumeroRecapGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNumeroRecapGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				numerorecap.setid_empresa(empresaAux.getId());
				numerorecap.setempresa_descripcion(NumeroRecapConstantesFunciones.getEmpresaDescripcion(empresaAux));
				numerorecap.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(NumeroRecap numerorecap,JComboBox jComboBoxid_sucursalNumeroRecapGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalNumeroRecapGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalNumeroRecapGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				numerorecap.setid_sucursal(sucursalAux.getId());
				numerorecap.setsucursal_descripcion(NumeroRecapConstantesFunciones.getSucursalDescripcion(sucursalAux));
				numerorecap.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarConexionForeignKey(NumeroRecap numerorecap,JComboBox jComboBoxid_conexionNumeroRecapGenerico)throws Exception
	{
		try
		{
			Conexion  conexionAux=new Conexion();

			if(jComboBoxid_conexionNumeroRecapGenerico==null) {
				conexionAux=(Conexion)this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.getSelectedItem();
			} else {
				conexionAux=(Conexion)jComboBoxid_conexionNumeroRecapGenerico.getSelectedItem();
			}

			if(conexionAux!=null && conexionAux.getId()!=null) {
				numerorecap.setid_conexion(conexionAux.getId());
				numerorecap.setconexion_descripcion(NumeroRecapConstantesFunciones.getConexionDescripcion(conexionAux));
				numerorecap.setConexion(conexionAux);			}
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

					if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) { 
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNumeroRecap!=null) { 
					}

					if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
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

					if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) { 
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNumeroRecap!=null) { 
					}

					if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameConexionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingConexion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) { 
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.removeAllItems();

							for(Conexion conexion:this.conexionsForeignKey) {
								this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.addItem(conexion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNumeroRecap!=null) { 
					}

					if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdConexion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_conexionFK_IdConexionNumeroRecap.removeAllItems();

							for(Conexion conexion:this.conexionsForeignKey) {
								this.jComboBoxid_conexionFK_IdConexionNumeroRecap.addItem(conexion);
							}
						}

						if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameConexionForeignKey(Conexion conexion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setSelectedItem(conexion);
						}
					} else {
						if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_conexionFK_IdConexionNumeroRecap.setSelectedItem(conexion);
						} else {
							this.jComboBoxid_conexionFK_IdConexionNumeroRecap.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesNumeroRecap() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NumeroRecapConstantesFunciones.refrescarForeignKeysDescripcionesNumeroRecap(this.numerorecapLogic.getNumeroRecaps());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NumeroRecapConstantesFunciones.refrescarForeignKeysDescripcionesNumeroRecap(this.numerorecaps);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Conexion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//numerorecapLogic.setNumeroRecaps(this.numerorecaps);
			numerorecapLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NumeroRecapParameterReturnGeneral getNumeroRecapParameterGeneral() {
		return this.numerorecapParameterGeneral;
	}
	
	public void setNumeroRecapParameterGeneral(NumeroRecapParameterReturnGeneral numerorecapParameterGeneral) {
		this.numerorecapParameterGeneral = numerorecapParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNumeroRecap() {
		return isPermisoTodoNumeroRecap;
	}

	public void setIsPermisoTodoNumeroRecap(Boolean isPermisoTodoNumeroRecap) {
		this.isPermisoTodoNumeroRecap = isPermisoTodoNumeroRecap;
	}

	public Boolean getIsPermisoNuevoNumeroRecap() {
		return isPermisoNuevoNumeroRecap;
	}

	public void setIsPermisoNuevoNumeroRecap(Boolean isPermisoNuevoNumeroRecap) {
		this.isPermisoNuevoNumeroRecap = isPermisoNuevoNumeroRecap;
	}

	public Boolean getIsPermisoActualizarNumeroRecap() {
		return isPermisoActualizarNumeroRecap;
	}

	public void setIsPermisoActualizarNumeroRecap(Boolean isPermisoActualizarNumeroRecap) {
		this.isPermisoActualizarNumeroRecap = isPermisoActualizarNumeroRecap;
	}

	public Boolean getIsPermisoEliminarNumeroRecap() {
		return isPermisoEliminarNumeroRecap;
	}

	public void setIsPermisoEliminarNumeroRecap(Boolean isPermisoEliminarNumeroRecap) {
		this.isPermisoEliminarNumeroRecap = isPermisoEliminarNumeroRecap;
	}

	public Boolean getIsPermisoGuardarCambiosNumeroRecap() {
		return isPermisoGuardarCambiosNumeroRecap;
	}

	public void setIsPermisoGuardarCambiosNumeroRecap(Boolean isPermisoGuardarCambiosNumeroRecap) {
		this.isPermisoGuardarCambiosNumeroRecap = isPermisoGuardarCambiosNumeroRecap;
	}
	
	public Boolean getIsPermisoConsultaNumeroRecap() {
		return isPermisoConsultaNumeroRecap;
	}

	public void setIsPermisoConsultaNumeroRecap(Boolean isPermisoConsultaNumeroRecap) {
		this.isPermisoConsultaNumeroRecap = isPermisoConsultaNumeroRecap;
	}

	public Boolean getIsPermisoBusquedaNumeroRecap() {
		return isPermisoBusquedaNumeroRecap;
	}

	public void setIsPermisoBusquedaNumeroRecap(Boolean isPermisoBusquedaNumeroRecap) {
		this.isPermisoBusquedaNumeroRecap = isPermisoBusquedaNumeroRecap;
	}

	public Boolean getIsPermisoReporteNumeroRecap() {
		return isPermisoReporteNumeroRecap;
	}

	public void setIsPermisoReporteNumeroRecap(Boolean isPermisoReporteNumeroRecap) {
		this.isPermisoReporteNumeroRecap = isPermisoReporteNumeroRecap;
	}
	
	public Boolean getIsPermisoPaginacionMedioNumeroRecap() {
		return isPermisoPaginacionMedioNumeroRecap;
	}

	public void setIsPermisoPaginacionMedioNumeroRecap(Boolean isPermisoPaginacionMedioNumeroRecap) {
		this.isPermisoPaginacionMedioNumeroRecap = isPermisoPaginacionMedioNumeroRecap;
	}
	
	public Boolean getIsPermisoPaginacionTodoNumeroRecap() {
		return isPermisoPaginacionTodoNumeroRecap;
	}

	public void setIsPermisoPaginacionTodoNumeroRecap(Boolean isPermisoPaginacionTodoNumeroRecap) {
		this.isPermisoPaginacionTodoNumeroRecap = isPermisoPaginacionTodoNumeroRecap;
	}
	
	public Boolean getIsPermisoPaginacionAltoNumeroRecap() {
		return isPermisoPaginacionAltoNumeroRecap;
	}

	public void setIsPermisoPaginacionAltoNumeroRecap(Boolean isPermisoPaginacionAltoNumeroRecap) {
		this.isPermisoPaginacionAltoNumeroRecap = isPermisoPaginacionAltoNumeroRecap;
	}
	
	public Boolean getIsPermisoCopiarNumeroRecap() {
		return isPermisoCopiarNumeroRecap;
	}

	public void setIsPermisoCopiarNumeroRecap(Boolean isPermisoCopiarNumeroRecap) {
		this.isPermisoCopiarNumeroRecap = isPermisoCopiarNumeroRecap;
	}
	
	public Boolean getIsPermisoVerFormNumeroRecap() {
		return isPermisoVerFormNumeroRecap;
	}

	public void setIsPermisoVerFormNumeroRecap(Boolean isPermisoVerFormNumeroRecap) {
		this.isPermisoVerFormNumeroRecap = isPermisoVerFormNumeroRecap;
	}
	
	public Boolean getIsPermisoDuplicarNumeroRecap() {
		return isPermisoDuplicarNumeroRecap;
	}

	public void setIsPermisoDuplicarNumeroRecap(Boolean isPermisoDuplicarNumeroRecap) {
		this.isPermisoDuplicarNumeroRecap = isPermisoDuplicarNumeroRecap;
	}
	
	public Boolean getIsPermisoOrdenNumeroRecap() {
		return isPermisoOrdenNumeroRecap;
	}

	public void setIsPermisoOrdenNumeroRecap(Boolean isPermisoOrdenNumeroRecap) {
		this.isPermisoOrdenNumeroRecap = isPermisoOrdenNumeroRecap;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNumeroRecap() {
		return isVisibilidadCeldaNuevoNumeroRecap;
	}

	public void setIsVisibilidadCeldaNuevoNumeroRecap(Boolean isVisibilidadCeldaNuevoNumeroRecap) {
		this.isVisibilidadCeldaNuevoNumeroRecap = isVisibilidadCeldaNuevoNumeroRecap;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNumeroRecap() {
		return isVisibilidadCeldaDuplicarNumeroRecap;
	}

	public void setIsVisibilidadCeldaDuplicarNumeroRecap(Boolean isVisibilidadCeldaDuplicarNumeroRecap) {
		this.isVisibilidadCeldaDuplicarNumeroRecap = isVisibilidadCeldaDuplicarNumeroRecap;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNumeroRecap() {
		return isVisibilidadCeldaCopiarNumeroRecap;
	}

	public void setIsVisibilidadCeldaCopiarNumeroRecap(Boolean isVisibilidadCeldaCopiarNumeroRecap) {
		this.isVisibilidadCeldaCopiarNumeroRecap = isVisibilidadCeldaCopiarNumeroRecap;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNumeroRecap() {
		return isVisibilidadCeldaVerFormNumeroRecap;
	}

	public void setIsVisibilidadCeldaVerFormNumeroRecap(Boolean isVisibilidadCeldaVerFormNumeroRecap) {
		this.isVisibilidadCeldaVerFormNumeroRecap = isVisibilidadCeldaVerFormNumeroRecap;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNumeroRecap() {
		return isVisibilidadCeldaOrdenNumeroRecap;
	}

	public void setIsVisibilidadCeldaOrdenNumeroRecap(Boolean isVisibilidadCeldaOrdenNumeroRecap) {
		this.isVisibilidadCeldaOrdenNumeroRecap = isVisibilidadCeldaOrdenNumeroRecap;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNumeroRecap() {
		return isVisibilidadCeldaNuevoRelacionesNumeroRecap;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNumeroRecap(Boolean isVisibilidadCeldaNuevoRelacionesNumeroRecap) {
		this.isVisibilidadCeldaNuevoRelacionesNumeroRecap = isVisibilidadCeldaNuevoRelacionesNumeroRecap;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNumeroRecap() {
		return isVisibilidadCeldaModificarNumeroRecap;
	}

	public void setIsVisibilidadCeldaModificarNumeroRecap(Boolean isVisibilidadCeldaModificarNumeroRecap) {
		this.isVisibilidadCeldaModificarNumeroRecap = isVisibilidadCeldaModificarNumeroRecap;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNumeroRecap() {
		return isVisibilidadCeldaActualizarNumeroRecap;
	}

	public void setIsVisibilidadCeldaActualizarNumeroRecap(Boolean isVisibilidadCeldaActualizarNumeroRecap) {
		this.isVisibilidadCeldaActualizarNumeroRecap = isVisibilidadCeldaActualizarNumeroRecap;
	}

	public Boolean getIsVisibilidadCeldaEliminarNumeroRecap() {
		return isVisibilidadCeldaEliminarNumeroRecap;
	}

	public void setIsVisibilidadCeldaEliminarNumeroRecap(Boolean isVisibilidadCeldaEliminarNumeroRecap) {
		this.isVisibilidadCeldaEliminarNumeroRecap = isVisibilidadCeldaEliminarNumeroRecap;
	}

	public Boolean getIsVisibilidadCeldaCancelarNumeroRecap() {
		return isVisibilidadCeldaCancelarNumeroRecap;
	}

	public void setIsVisibilidadCeldaCancelarNumeroRecap(Boolean isVisibilidadCeldaCancelarNumeroRecap) {
		this.isVisibilidadCeldaCancelarNumeroRecap = isVisibilidadCeldaCancelarNumeroRecap;
	}

	public Boolean getIsVisibilidadCeldaGuardarNumeroRecap() {
		return isVisibilidadCeldaGuardarNumeroRecap;
	}

	public void setIsVisibilidadCeldaGuardarNumeroRecap(Boolean isVisibilidadCeldaGuardarNumeroRecap) {
		this.isVisibilidadCeldaGuardarNumeroRecap = isVisibilidadCeldaGuardarNumeroRecap;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNumeroRecap() {
		return isVisibilidadCeldaGuardarCambiosNumeroRecap;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNumeroRecap(Boolean isVisibilidadCeldaGuardarCambiosNumeroRecap) {
		this.isVisibilidadCeldaGuardarCambiosNumeroRecap = isVisibilidadCeldaGuardarCambiosNumeroRecap;
	}
		
	public NumeroRecapSessionBean getnumerorecapSessionBean() {
		return this.numerorecapSessionBean;
	}
	
	public void setnumerorecapSessionBean(NumeroRecapSessionBean numerorecapSessionBean) {
		this.numerorecapSessionBean=numerorecapSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdConexion() {
		return this.isVisibilidadFK_IdConexion;
	}

	public void setisVisibilidadFK_IdConexion(Boolean isVisibilidadFK_IdConexion) {
		this.isVisibilidadFK_IdConexion=isVisibilidadFK_IdConexion;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(NumeroRecap numerorecap)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(numerorecap,null);
				this.setActualParaGuardarSucursalForeignKey(numerorecap,null);
				this.setActualParaGuardarConexionForeignKey(numerorecap,null);
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
	
	public void bugActualizarReferenciaActual(NumeroRecap numerorecap,NumeroRecap numerorecapAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNumeroRecap(numerorecap);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		numerorecapAux.setId(numerorecap.getId());
		numerorecapAux.setVersionRow(numerorecap.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNumeroRecap();
		
			int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = numerorecapValidator.getInvalidValues(this.numerorecap);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			numerorecapLogic.setDatosCliente(datosCliente);
			numerorecapLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				numerorecapAux=new  NumeroRecap();
				
				numerorecapAux.setIsNew(true);
				numerorecapAux.setIsChanged(true);
				
				numerorecapAux.setNumeroRecapOriginal(this.numerorecap);
				
				numerorecapAux.setId(this.numerorecap.getId());	
				numerorecapAux.setVersionRow(this.numerorecap.getVersionRow());	
				numerorecapAux.setid_empresa(this.numerorecap.getid_empresa());	
				numerorecapAux.setid_sucursal(this.numerorecap.getid_sucursal());	
				numerorecapAux.setid_conexion(this.numerorecap.getid_conexion());	
				numerorecapAux.setnumero_recap(this.numerorecap.getnumero_recap());	
				numerorecapAux.setfecha(this.numerorecap.getfecha());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.numerorecapSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(numerorecapAux,numerorecapLogic.getNumeroRecaps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(numerorecapAux,numerorecaps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.numerorecapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.numerorecapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapLogic.saveNumeroRecaps();//WithConnection
						//numerorecapLogic.getSetVersionRowNumeroRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.numerorecap,numerorecapAux);
					
					this.refrescarForeignKeysDescripcionesNumeroRecap();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								numerorecapLogic.saveNumeroRecapRelaciones(numerorecapAux);//WithConnection
								//numerorecapLogic.getSetVersionRowNumeroRecaps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.numerorecap,numerorecapAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones() 
									|| this.numerorecapSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(numerorecapAux,numerorecapLogic.getNumeroRecaps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(numerorecapAux,numerorecaps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.numerorecap,numerorecapAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				numerorecapAux=new  NumeroRecap();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.numerorecapSessionBean.getEsGuardarRelacionado() 
					|| (this.numerorecapSessionBean.getEsGuardarRelacionado() && this.numerorecap.getId()>=0)) {
						
					numerorecapAux.setIsNew(false);
				}
				
				numerorecapAux.setIsDeleted(false);
			
				numerorecapAux.setId(this.numerorecap.getId());	
				numerorecapAux.setVersionRow(this.numerorecap.getVersionRow());	
				numerorecapAux.setid_empresa(this.numerorecap.getid_empresa());	
				numerorecapAux.setid_sucursal(this.numerorecap.getid_sucursal());	
				numerorecapAux.setid_conexion(this.numerorecap.getid_conexion());	
				numerorecapAux.setnumero_recap(this.numerorecap.getnumero_recap());	
				numerorecapAux.setfecha(this.numerorecap.getfecha());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(numerorecapAux,numerorecapLogic.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(numerorecapAux,numerorecaps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.numerorecapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.numerorecapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapLogic.saveNumeroRecaps();//WithConnection
						//numerorecapLogic.getSetVersionRowNumeroRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.numerorecap,numerorecapAux);
					
					this.refrescarForeignKeysDescripcionesNumeroRecap();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								numerorecapLogic.saveNumeroRecapRelaciones(numerorecapAux);//WithConnection
								//numerorecapLogic.getSetVersionRowNumeroRecaps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.numerorecap,numerorecapAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones() 
									|| this.numerorecapSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(numerorecapAux,numerorecapLogic.getNumeroRecaps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(numerorecapAux,numerorecaps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.numerorecap,numerorecapAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				numerorecapAux=new  NumeroRecap();
				
				numerorecapAux.setIsNew(false);
				numerorecapAux.setIsChanged(false);
				
				numerorecapAux.setIsDeleted(true);
				
				numerorecapAux.setId(this.numerorecap.getId());	
				numerorecapAux.setVersionRow(this.numerorecap.getVersionRow());	
				numerorecapAux.setid_empresa(this.numerorecap.getid_empresa());	
				numerorecapAux.setid_sucursal(this.numerorecap.getid_sucursal());	
				numerorecapAux.setid_conexion(this.numerorecap.getid_conexion());	
				numerorecapAux.setnumero_recap(this.numerorecap.getnumero_recap());	
				numerorecapAux.setfecha(this.numerorecap.getfecha());	
				
				if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.numerorecapAux.getId()>=0) {	
						this.numerorecapsEliminados.add(numerorecapAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(numerorecapAux,numerorecapLogic.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(numerorecapAux,numerorecaps);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.numerorecapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.numerorecapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapLogic.saveNumeroRecaps();//WithConnection
						//numerorecapLogic.getSetVersionRowNumeroRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								numerorecapLogic.saveNumeroRecapRelaciones(numerorecapAux);//WithConnection
								//numerorecapLogic.getSetVersionRowNumeroRecaps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones() 
								|| this.numerorecapSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(numerorecapAux,numerorecapLogic.getNumeroRecaps());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(numerorecapAux,numerorecaps);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.getNumeroRecaps().addAll(this.numerorecapsEliminados);
					
					numerorecapLogic.saveNumeroRecaps();//WithConnection
					//numerorecapLogic.getSetVersionRowNumeroRecaps();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesNumeroRecap();
				
				this.numerorecapsEliminados= new ArrayList<NumeroRecap>();		
			}
			
			if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Numero Recap GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.numerorecap=numerorecapAux;
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
      		//this.finishProcessNumeroRecap();
      	}
		
	}	
	
	public void actualizarRelaciones(NumeroRecap numerorecapLocal) throws Exception {
		
		if(this.numerorecapSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NumeroRecap numerorecapLocal) throws Exception {	
		if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				numerorecapLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				numerorecapLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ConexionDetalleFormJInternalFrame.class)) {
				ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrameLocal=(ConexionBeanSwingJInternalFrame) ((ConexionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				conexionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoConexion(conexionBeanSwingJInternalFrameLocal.getconexion(),true);
				conexionBeanSwingJInternalFrameLocal.actualizarLista(conexionBeanSwingJInternalFrameLocal.conexion,this.conexionsForeignKey);

				conexionBeanSwingJInternalFrameLocal.actualizarRelaciones(conexionBeanSwingJInternalFrameLocal.conexion);

				numerorecapLocal.setConexion(conexionBeanSwingJInternalFrameLocal.conexion);

				this.addItemDefectoCombosForeignKeyConexion();
				this.cargarCombosFrameConexionsForeignKey("Formulario");
				this.setActualConexionForeignKey(conexionBeanSwingJInternalFrameLocal.conexion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNumeroRecapActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = numerorecapValidator.getInvalidValues(this.numerorecap);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NumeroRecap numerorecap,List<NumeroRecap> numerorecaps) throws Exception {
		try	{		
			NumeroRecapConstantesFunciones.actualizarLista(numerorecap,numerorecaps,this.numerorecapSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NumeroRecap numerorecap,List<NumeroRecap> numerorecaps) throws Exception {
		try	{			
			NumeroRecapConstantesFunciones.actualizarSelectedLista(numerorecap,numerorecaps);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NumeroRecap> numerorecapsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				numerorecapsLocal=this.numerorecapLogic.getNumeroRecaps();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				numerorecapsLocal=this.numerorecaps;
			}
			//ARCHITECTURE
		
			for(NumeroRecap numerorecapLocal:numerorecapsLocal) {
				if(this.permiteMantenimiento(numerorecapLocal) && numerorecapLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NumeroRecapConstantesFunciones.getNumeroRecapLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NumeroRecapConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroRecap.jLabelid_empresaNumeroRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroRecapConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroRecap.jLabelid_sucursalNumeroRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroRecapConstantesFunciones.IDCONEXION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroRecap.jLabelid_conexionNumeroRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroRecapConstantesFunciones.NUMERORECAP)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroRecap.jLabelnumero_recapNumeroRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroRecapConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroRecap.jLabelfechaNumeroRecap,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroRecap.jLabelid_empresaNumeroRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroRecap.jLabelid_sucursalNumeroRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroRecap.jLabelid_conexionNumeroRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroRecap.jLabelnumero_recapNumeroRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroRecap.jLabelfechaNumeroRecap,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoNumeroRecap--;	
		
		
		this.numerorecapAux=new NumeroRecap();
		
		this.numerorecapAux.setId(this.iIdNuevoNumeroRecap);
		this.numerorecapAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.numerorecapLogic.getNumeroRecaps().add(this.numerorecapAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.numerorecaps.add(this.numerorecapAux);
		}
		//ARCHITECTURE
		
		this.numerorecap=this.numerorecapAux;
		
		if(NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNumeroRecap(this.numerorecap);
			this.setVariablesObjetoActualToFormularioForeignKeyNumeroRecap(this.numerorecap);
		}
				
		//this.setDefaultControlesNumeroRecap();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNumeroRecap();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNumeroRecap();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNumeroRecap();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNumeroRecap(this.numerorecapBean,this.numerorecap,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NumeroRecapConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
			classes=NumeroRecapConstantesFunciones.getClassesRelationshipsOfNumeroRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.numerorecapReturnGeneral=numerorecapLogic.procesarEventosNumeroRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.numerorecapLogic.getNumeroRecaps(),this.numerorecap,this.numerorecapParameterGeneral,this.isEsNuevoNumeroRecap,classes);//this.numerorecapLogic.getNumeroRecap()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNumeroRecap(this.numerorecapReturnGeneral,this.numerorecapBean,false);
		
		if(this.numerorecapReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNumeroRecap(this.numerorecapReturnGeneral.getNumeroRecap());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNumeroRecap(this.numerorecapReturnGeneral.getNumeroRecap());
		}
		
		if(this.numerorecapReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNumeroRecap(this.numerorecapReturnGeneral.getNumeroRecap(),classes);//this.numerorecapBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNumeroRecap();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNumeroRecap();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NumeroRecapBeanSwingJInternalFrameAdditional.RecargarFormNumeroRecap(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNumeroRecap(false);
						
			if(numerorecapSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNumeroRecap();
			}
			
			this.actualizarVisualTableDatosNumeroRecap();
			
			this.jTableDatosNumeroRecap.setRowSelectionInterval(this.getIndiceNuevoNumeroRecap(), this.getIndiceNuevoNumeroRecap());
			
			this.seleccionarFilaTablaNumeroRecapActual();
						
			this.actualizarEstadoCeldasBotonesNumeroRecap("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNumeroRecap(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNumeroRecap.jTextFieldnumero_recapNumeroRecap.setEnabled(isHabilitar && this.numerorecapConstantesFunciones.activarnumero_recapNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jDateChooserfechaNumeroRecap.setEnabled(isHabilitar && this.numerorecapConstantesFunciones.activarfechaNumeroRecap);	
		//
		this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setEnabled(isHabilitar && this.numerorecapConstantesFunciones.activarid_empresaNumeroRecap);//
		this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setEnabled(isHabilitar && this.numerorecapConstantesFunciones.activarid_sucursalNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setEnabled(isHabilitar && this.numerorecapConstantesFunciones.activarid_conexionNumeroRecap);
	};
	
	public void setDefaultControlesNumeroRecap() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNumeroRecap(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.numerorecapSessionBean.setConGuardarRelaciones(true);			
			this.numerorecapSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.setVisible(true);
			
					
		} else {
			//this.numerorecapSessionBean.setConGuardarRelaciones(false);			
			this.numerorecapSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoNumeroRecap() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
				if(numerorecapAux.getId().equals(this.iIdNuevoNumeroRecap)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroRecap numerorecapAux:this.numerorecaps) {
				if(numerorecapAux.getId().equals(this.iIdNuevoNumeroRecap)) {
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
	
	public int getIndiceActualNumeroRecap(NumeroRecap numerorecap,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
				if(numerorecapAux.getId().equals(numerorecap.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroRecap numerorecapAux:this.numerorecaps) {
				if(numerorecapAux.getId().equals(numerorecap.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNumeroRecap(NumeroRecap numerorecapOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
				if(numerorecapAux.getNumeroRecapOriginal().getId().equals(numerorecapOriginal.getId())) {
					existe=true;
					numerorecapOriginal.setId(numerorecapAux.getId());
					numerorecapOriginal.setVersionRow(numerorecapAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroRecap numerorecapAux:this.numerorecaps) {
				if(numerorecapAux.getNumeroRecapOriginal().getId().equals(numerorecapOriginal.getId())) {
					existe=true;
					numerorecapOriginal.setId(numerorecapAux.getId());
					numerorecapOriginal.setVersionRow(numerorecapAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNumeroRecap(Boolean esParaCancelar) throws Exception {
		numerorecapsAux=new ArrayList<NumeroRecap>();
		numerorecapAux=new NumeroRecap();
		
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
					if(numerorecapAux.getId()<0) {
						numerorecapsAux.add(numerorecapAux);
					}		
				}
				this.iIdNuevoNumeroRecap=0L;
				this.numerorecapLogic.getNumeroRecaps().removeAll(numerorecapsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NumeroRecap numerorecapAux:this.numerorecaps) {
					if(numerorecapAux.getId()<0) {
						numerorecapsAux.add(numerorecapAux);
					}		
				}
				this.iIdNuevoNumeroRecap=0L;
				this.numerorecaps.removeAll(numerorecapsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNumeroRecap 
					&& this.numerorecapLogic.getNumeroRecaps().size()>0
					) {
					numerorecapAux=this.numerorecapLogic.getNumeroRecaps().get(this.numerorecapLogic.getNumeroRecaps().size() - 1);
				
					if(numerorecapAux.getId()<0) {
						this.numerorecapLogic.getNumeroRecaps().remove(numerorecapAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNumeroRecap && this.numerorecaps.size()>0) {
					numerorecapAux=this.numerorecaps.get(this.numerorecaps.size() - 1);
				
					if(numerorecapAux.getId()<0) {
						this.numerorecaps.remove(numerorecapAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNumeroRecap(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(numerorecap.getId()<0) {
				this.numerorecapLogic.getNumeroRecaps().remove(this.numerorecap);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(numerorecap.getId()<0) {
				this.numerorecaps.remove(this.numerorecap);
			}
		}			
	}
	
	public void setEstadosInicialesNumeroRecap(List<NumeroRecap> numerorecapsAux) throws Exception {
		NumeroRecapConstantesFunciones.setEstadosInicialesNumeroRecap(numerorecapsAux);
	}
	
	public void setEstadosInicialesNumeroRecap(NumeroRecap numerorecapAux) throws Exception {
		NumeroRecapConstantesFunciones.setEstadosInicialesNumeroRecap(numerorecapAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNumeroRecapActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNumeroRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNumeroRecapActual()) {
				if(!this.isEsNuevoNumeroRecap) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNumeroRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNumeroRecap=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNumeroRecapActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Numero Recap ?", "MANTENIMIENTO DE Numero Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNumeroRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NumeroRecap numerorecap) throws Exception {
		NumeroRecapConstantesFunciones.seleccionarAsignar(this.numerorecap,numerorecap);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNumeroRecap=this.isPermisoActualizarOriginalNumeroRecap;
			
			
			this.seleccionarAsignar(numerorecap);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NumeroRecapConstantesFunciones.quitarEspaciosNumeroRecap(this.numerorecap,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNumeroRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.numerorecapSessionBean.setsFuncionBusquedaRapida(this.numerorecapSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNumeroRecap) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNumeroRecap(esParaCancelar);				
				this.cancelarNuevoNumeroRecap(esParaCancelar);								
			}
			
			this.numerorecap=new NumeroRecap();
			
			this.inicializarNumeroRecap();
			
			this.actualizarEstadoCeldasBotonesNumeroRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNumeroRecap() throws Exception {
		try {
			NumeroRecapConstantesFunciones.inicializarNumeroRecap(this.numerorecap);
			
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
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.numerorecapLogic.getNumeroRecaps().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNumeroRecaps(String sAccionBusqueda,List<NumeroRecap> numerorecapsParaReportes) throws Exception {
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
					sPathReporteFinal="NumeroRecap"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NumeroRecapMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NumeroRecapMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NumeroRecap"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Numero Recapes");		
		parameters.put("busquedapor", NumeroRecapConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNumeroRecap=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NumeroRecapConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NumeroRecapConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNumeroRecap=new JRBeanArrayDataSource(NumeroRecapJInternalFrame.TraerNumeroRecapBeans(numerorecapsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNumeroRecap);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NumeroRecapConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NumeroRecapConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NumeroRecapBean.TraerNumeroRecapBeans(numerorecapsParaReportes).toArray()));
							
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
				this.generarExcelReporteNumeroRecaps(sAccionBusqueda,sTipoArchivoReporte,numerorecapsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNumeroRecaps(sAccionBusqueda,sTipoArchivoReporte,numerorecapsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNumeroRecapActionPerformed(null);
					//this.generarExcelReporteNumeroRecaps(sAccionBusqueda,sTipoArchivoReporte,numerorecapsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNumeroRecaps(sAccionBusqueda,sTipoArchivoReporte,numerorecapsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNumeroRecaps(sAccionBusqueda,sTipoArchivoReporte,numerorecapsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNumeroRecaps(sAccionBusqueda,sTipoArchivoReporte,numerorecapsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNumeroRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<NumeroRecap> numerorecapsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numerorecap";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NumeroRecaps");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNumeroRecap("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NumeroRecap numerorecap : numerorecapsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NumeroRecapConstantesFunciones.generarExcelReporteDataNumeroRecap("NORMAL",row,workbook,numerorecap,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNumeroRecap(String sTipo,Row row,Workbook workbook) {
		
		NumeroRecapConstantesFunciones.generarExcelReporteHeaderNumeroRecap(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNumeroRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<NumeroRecap> numerorecapsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numerorecap_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NumeroRecaps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NumeroRecap numerorecap : numerorecapsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NumeroRecapConstantesFunciones.getNumeroRecapDescripcion(numerorecap));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroRecapConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numerorecap.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numerorecap.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroRecapConstantesFunciones.LABEL_IDCONEXION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDCONEXION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numerorecap.getconexion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroRecapConstantesFunciones.LABEL_NUMERORECAP))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_NUMERORECAP);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numerorecap.getnumero_recap());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroRecapConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numerorecap.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNumeroRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<NumeroRecap> numerorecapsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NumeroRecap> numerorecapsRespaldo=null;
		
		classes=NumeroRecapConstantesFunciones.getClassesRelationshipsOfNumeroRecap(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.numerorecapLogic.setDatosCliente(this.datosCliente);
		this.numerorecapLogic.setDatosDeep(this.datosDeep);
		this.numerorecapLogic.setIsConDeep(true);
		
		numerorecapsRespaldo=this.numerorecapLogic.getNumeroRecaps();
		
		this.numerorecapLogic.setNumeroRecaps(numerorecapsParaReportes);	
		this.numerorecapLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		numerorecapsParaReportes=this.numerorecapLogic.getNumeroRecaps();
		this.numerorecapLogic.setNumeroRecaps(numerorecapsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numerorecap_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NumeroRecaps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNumeroRecap("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NumeroRecap numerorecap : numerorecapsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNumeroRecap("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NumeroRecapConstantesFunciones.generarExcelReporteDataNumeroRecap("NORMAL",row,workbook,numerorecap,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(NumeroRecapConstantesFunciones.getNumeroRecapDescripcion(numerorecap));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNumeroRecap.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNumeroRecap() throws Exception {		
		this.startProcessNumeroRecap(true);
	}
	
	public void startProcessNumeroRecap(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNumeroRecap ,this.jPanelParametrosReportesNumeroRecap, this.jScrollPanelDatosNumeroRecap,this.jPanelPaginacionNumeroRecap, this.jScrollPanelDatosEdicionNumeroRecap, this.jPanelAccionesNumeroRecap,this.jPanelAccionesFormularioNumeroRecap,this.jmenuBarNumeroRecap,this.jmenuBarDetalleNumeroRecap,this.jTtoolBarNumeroRecap,this.jTtoolBarDetalleNumeroRecap);		
		
		final JTabbedPane jTabbedPaneBusquedasNumeroRecap=this.jTabbedPaneBusquedasNumeroRecap; 
		
		final JPanel jPanelParametrosReportesNumeroRecap=this.jPanelParametrosReportesNumeroRecap;
		//final JScrollPane jScrollPanelDatosNumeroRecap=this.jScrollPanelDatosNumeroRecap;
		final JTable jTableDatosNumeroRecap=this.jTableDatosNumeroRecap;		
		final JPanel jPanelPaginacionNumeroRecap=this.jPanelPaginacionNumeroRecap;
		//final JScrollPane jScrollPanelDatosEdicionNumeroRecap=this.jScrollPanelDatosEdicionNumeroRecap;
		final JPanel jPanelAccionesNumeroRecap=this.jPanelAccionesNumeroRecap;
		
		JPanel jPanelCamposAuxiliarNumeroRecap=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNumeroRecap=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			jPanelCamposAuxiliarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jPanelCamposNumeroRecap;
			jPanelAccionesFormularioAuxiliarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jPanelAccionesFormularioNumeroRecap;
		}
		
		final JPanel jPanelCamposNumeroRecap=jPanelCamposAuxiliarNumeroRecap;
		final JPanel jPanelAccionesFormularioNumeroRecap=jPanelAccionesFormularioAuxiliarNumeroRecap;
		
		
		final JMenuBar jmenuBarNumeroRecap=this.jmenuBarNumeroRecap;
		final JToolBar jTtoolBarNumeroRecap=this.jTtoolBarNumeroRecap;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNumeroRecap=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNumeroRecap=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			jmenuBarDetalleAuxiliarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jmenuBarDetalleNumeroRecap;
			jTtoolBarDetalleAuxiliarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jTtoolBarDetalleNumeroRecap;
		}
		
		final JMenuBar jmenuBarDetalleNumeroRecap=jmenuBarDetalleAuxiliarNumeroRecap;
		final JToolBar jTtoolBarDetalleNumeroRecap=jTtoolBarDetalleAuxiliarNumeroRecap;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNumeroRecap;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNumeroRecap;
			processRunnable.jTableDatos=jTableDatosNumeroRecap;
			processRunnable.jPanelCampos=jPanelCamposNumeroRecap;
			processRunnable.jPanelPaginacion=jPanelPaginacionNumeroRecap;
			processRunnable.jPanelAcciones=jPanelAccionesNumeroRecap;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNumeroRecap;
			
			
			processRunnable.jmenuBar=jmenuBarNumeroRecap;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNumeroRecap;
			processRunnable.jTtoolBar=jTtoolBarNumeroRecap;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNumeroRecap;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNumeroRecap ,jPanelParametrosReportesNumeroRecap,jTableDatosNumeroRecap, /*jScrollPanelDatosNumeroRecap,*/jPanelCamposNumeroRecap,jPanelPaginacionNumeroRecap, /*jScrollPanelDatosEdicionNumeroRecap,*/ jPanelAccionesNumeroRecap,jPanelAccionesFormularioNumeroRecap,jmenuBarNumeroRecap,jmenuBarDetalleNumeroRecap,jTtoolBarNumeroRecap,jTtoolBarDetalleNumeroRecap);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNumeroRecap ,jPanelParametrosReportesNumeroRecap, jScrollPanelDatosNumeroRecap,jPanelPaginacionNumeroRecap, jScrollPanelDatosEdicionNumeroRecap, jPanelAccionesNumeroRecap,jPanelAccionesFormularioNumeroRecap,jmenuBarNumeroRecap,jmenuBarDetalleNumeroRecap,jTtoolBarNumeroRecap,jTtoolBarDetalleNumeroRecap);
						
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
	
	public void finishProcessNumeroRecap() {// throws Exception 
		this.finishProcessNumeroRecap(true);
	}
	
	public void finishProcessNumeroRecap(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNumeroRecap ,this.jPanelParametrosReportesNumeroRecap, this.jScrollPanelDatosNumeroRecap,this.jPanelPaginacionNumeroRecap, this.jScrollPanelDatosEdicionNumeroRecap, this.jPanelAccionesNumeroRecap,this.jPanelAccionesFormularioNumeroRecap,this.jmenuBarNumeroRecap,this.jmenuBarDetalleNumeroRecap,this.jTtoolBarNumeroRecap,this.jTtoolBarDetalleNumeroRecap);		
		
		final JTabbedPane jTabbedPaneBusquedasNumeroRecap=this.jTabbedPaneBusquedasNumeroRecap; 
		
		final JPanel jPanelParametrosReportesNumeroRecap=this.jPanelParametrosReportesNumeroRecap;
		//final JScrollPane jScrollPanelDatosNumeroRecap=this.jScrollPanelDatosNumeroRecap;
		final JTable jTableDatosNumeroRecap=this.jTableDatosNumeroRecap;		
		final JPanel jPanelPaginacionNumeroRecap=this.jPanelPaginacionNumeroRecap;
		//final JScrollPane jScrollPanelDatosEdicionNumeroRecap=this.jScrollPanelDatosEdicionNumeroRecap;
		final JPanel jPanelAccionesNumeroRecap=this.jPanelAccionesNumeroRecap;
		
		JPanel jPanelCamposAuxiliarNumeroRecap=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNumeroRecap=new JPanel();
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			jPanelCamposAuxiliarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jPanelCamposNumeroRecap;
			jPanelAccionesFormularioAuxiliarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jPanelAccionesFormularioNumeroRecap;
		}
		
		final JPanel jPanelCamposNumeroRecap=jPanelCamposAuxiliarNumeroRecap;
		final JPanel jPanelAccionesFormularioNumeroRecap=jPanelAccionesFormularioAuxiliarNumeroRecap;
		
		
		final JMenuBar jmenuBarNumeroRecap=this.jmenuBarNumeroRecap;		
		final JToolBar jTtoolBarNumeroRecap=this.jTtoolBarNumeroRecap;
				
		JMenuBar jmenuBarDetalleAuxiliarNumeroRecap=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNumeroRecap=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			jmenuBarDetalleAuxiliarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jmenuBarDetalleNumeroRecap;
			jTtoolBarDetalleAuxiliarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jTtoolBarDetalleNumeroRecap;		
		}
		
		final JMenuBar jmenuBarDetalleNumeroRecap=jmenuBarDetalleAuxiliarNumeroRecap;
		final JToolBar jTtoolBarDetalleNumeroRecap=jTtoolBarDetalleAuxiliarNumeroRecap;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNumeroRecap;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNumeroRecap;
			processRunnable.jTableDatos=jTableDatosNumeroRecap;
			processRunnable.jPanelCampos=jPanelCamposNumeroRecap;
			processRunnable.jPanelPaginacion=jPanelPaginacionNumeroRecap;
			processRunnable.jPanelAcciones=jPanelAccionesNumeroRecap;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNumeroRecap;
			
			
			processRunnable.jmenuBar=jmenuBarNumeroRecap;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNumeroRecap;
			processRunnable.jTtoolBar=jTtoolBarNumeroRecap;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNumeroRecap;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNumeroRecap ,jPanelParametrosReportesNumeroRecap, jTableDatosNumeroRecap,/*jScrollPanelDatosNumeroRecap,*/jPanelCamposNumeroRecap,jPanelPaginacionNumeroRecap, /*jScrollPanelDatosEdicionNumeroRecap,*/ jPanelAccionesNumeroRecap,jPanelAccionesFormularioNumeroRecap,jmenuBarNumeroRecap,jmenuBarDetalleNumeroRecap,jTtoolBarNumeroRecap,jTtoolBarDetalleNumeroRecap));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNumeroRecap(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNumeroRecap(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNumeroRecap(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNumeroRecap(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNumeroRecap,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNumeroRecap,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNumeroRecap(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNumeroRecap,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNumeroRecap,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.numerorecapConstantesFunciones.getsFinalQueryNumeroRecap();
		String  finalQueryPaginacionTodos=this.numerorecapConstantesFunciones.getsFinalQueryNumeroRecap();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NumeroRecapConstantesFunciones.getArrayColumnasGlobalesNoNumeroRecap(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NumeroRecapConstantesFunciones.getArrayColumnasGlobalesNumeroRecap(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NumeroRecapConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.numerorecapsEliminados= new ArrayList<NumeroRecap>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNumeroRecap();
		
				///*NumeroRecapSessionBean*/this.numerorecapSessionBean=new NumeroRecapSessionBean();
			
			if(this.numerorecapSessionBean==null) {
				this.numerorecapSessionBean=new NumeroRecapSessionBean();
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
					this.iNumeroPaginacion=NumeroRecapConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NumeroRecapConstantesFunciones.getClassesForeignKeysOfNumeroRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/numerorecap."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			numerorecapsAux= new ArrayList<NumeroRecap>();
			
				
			numerorecapLogic.setDatosCliente(this.datosCliente);
			numerorecapLogic.setDatosDeep(this.datosDeep);
			numerorecapLogic.setIsConDeep(true);
			
			
			numerorecapLogic.getNumeroRecapDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					numerorecapLogic.getTodosNumeroRecaps(finalQueryGlobal,pagination);
					
					//numerorecapLogic.getTodosNumeroRecapsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(numerorecapLogic.getNumeroRecaps()==null|| numerorecapLogic.getNumeroRecaps().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							numerorecapsAux= new ArrayList<NumeroRecap>();
							numerorecapsAux.addAll(numerorecapLogic.getNumeroRecaps());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecapsAux= new ArrayList<NumeroRecap>();
							numerorecapsAux.addAll(numerorecaps);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							numerorecapLogic.getTodosNumeroRecaps(finalQueryGlobal+"",this.pagination);												
							
							//numerorecapLogic.getTodosNumeroRecapsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNumeroRecaps("Todos",numerorecapLogic.getNumeroRecaps() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							numerorecapLogic.setNumeroRecaps(new ArrayList<NumeroRecap>());					
							numerorecapLogic.getNumeroRecaps().addAll(numerorecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecaps=new ArrayList<NumeroRecap>();
							numerorecaps.addAll(numerorecapsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNumeroRecap=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNumeroRecap=this.idActual;
				
				} else if(this.idNumeroRecapActual!=null && this.idNumeroRecapActual!=0L) {
					idNumeroRecap=idNumeroRecapActual;
				}
				
					
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndicePorId(idNumeroRecap);
				
				this.numerorecaps=new ArrayList<NumeroRecap>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					numerorecapLogic.getEntity(idNumeroRecap);
					
					//numerorecapLogic.getEntityWithConnection(idNumeroRecap);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numerorecapLogic.setNumeroRecaps(new ArrayList<NumeroRecap>());
					numerorecapLogic.getNumeroRecaps().add(numerorecapLogic.getNumeroRecap());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numerorecaps=new ArrayList<NumeroRecap>();
					this.numerorecaps.add(numerorecap);
				}
				
				if(numerorecapLogic.getNumeroRecap()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdConexion")) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					numerorecapLogic.getNumeroRecapsFK_IdConexion(finalQueryGlobal,pagination,id_conexionFK_IdConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=numerorecapLogic.getNumeroRecaps()==null||numerorecapLogic.getNumeroRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=numerorecaps==null|| numerorecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapsAux=new ArrayList<NumeroRecap>();
						numerorecapsAux.addAll(numerorecapLogic.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecapsAux=new ArrayList<NumeroRecap>();
							numerorecapsAux.addAll(numerorecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							numerorecapLogic.getNumeroRecapsFK_IdConexion(finalQueryGlobal,pagination,id_conexionFK_IdConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNumeroRecaps("FK_IdConexion",numerorecapLogic.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNumeroRecaps("FK_IdConexion",numerorecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapLogic.setNumeroRecaps(new ArrayList<NumeroRecap>());
						numerorecapLogic.getNumeroRecaps().addAll(numerorecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecaps=new ArrayList<NumeroRecap>();
							numerorecaps.addAll(numerorecapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					numerorecapLogic.getNumeroRecapsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=numerorecapLogic.getNumeroRecaps()==null||numerorecapLogic.getNumeroRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=numerorecaps==null|| numerorecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapsAux=new ArrayList<NumeroRecap>();
						numerorecapsAux.addAll(numerorecapLogic.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecapsAux=new ArrayList<NumeroRecap>();
							numerorecapsAux.addAll(numerorecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							numerorecapLogic.getNumeroRecapsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNumeroRecaps("FK_IdEmpresa",numerorecapLogic.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNumeroRecaps("FK_IdEmpresa",numerorecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapLogic.setNumeroRecaps(new ArrayList<NumeroRecap>());
						numerorecapLogic.getNumeroRecaps().addAll(numerorecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecaps=new ArrayList<NumeroRecap>();
							numerorecaps.addAll(numerorecapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					numerorecapLogic.getNumeroRecapsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=numerorecapLogic.getNumeroRecaps()==null||numerorecapLogic.getNumeroRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=numerorecaps==null|| numerorecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapsAux=new ArrayList<NumeroRecap>();
						numerorecapsAux.addAll(numerorecapLogic.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecapsAux=new ArrayList<NumeroRecap>();
							numerorecapsAux.addAll(numerorecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							numerorecapLogic.getNumeroRecapsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNumeroRecaps("FK_IdSucursal",numerorecapLogic.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNumeroRecaps("FK_IdSucursal",numerorecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapLogic.setNumeroRecaps(new ArrayList<NumeroRecap>());
						numerorecapLogic.getNumeroRecaps().addAll(numerorecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecaps=new ArrayList<NumeroRecap>();
							numerorecaps.addAll(numerorecapsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNumeroRecap();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNumeroRecap();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=numerorecapLogic.getNumeroRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=numerorecaps.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=numerorecapLogic.getNumeroRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=numerorecaps.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NumeroRecap numerorecap) {
		Boolean permite=true;
		
		if(this.numerorecap.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NumeroRecapConstantesFunciones.getOrderByListaNumeroRecap();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NumeroRecapConstantesFunciones.getOrderByListaNumeroRecap();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroRecap numerorecap:numerorecapLogic.getNumeroRecaps()) {
				if(numerorecap.getsType().equals(Constantes2.S_TOTALES)) {
					numerorecapTotales=numerorecap;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroRecap numerorecap:this.numerorecaps) {
				if(numerorecap.getsType().equals(Constantes2.S_TOTALES)) {
					numerorecapTotales=numerorecap;
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
			this.numerorecapAux=new NumeroRecap();
			this.numerorecapAux.setsType(Constantes2.S_TOTALES);
			this.numerorecapAux.setIsNew(false);
			this.numerorecapAux.setIsChanged(false);
			this.numerorecapAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NumeroRecapConstantesFunciones.TotalizarValoresFilaNumeroRecap(this.numerorecapLogic.getNumeroRecaps(),this.numerorecapAux);
				
				this.numerorecapLogic.getNumeroRecaps().add(this.numerorecapAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NumeroRecapConstantesFunciones.TotalizarValoresFilaNumeroRecap(this.numerorecaps,this.numerorecapAux);
				
				this.numerorecaps.add(this.numerorecapAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		numerorecapTotales=new NumeroRecap();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.numerorecapLogic.getNumeroRecaps().remove(numerorecapTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.numerorecaps.remove(numerorecapTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		numerorecapTotales=new NumeroRecap();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroRecap numerorecap:numerorecapLogic.getNumeroRecaps()) {
				if(numerorecap.getsType().equals(Constantes2.S_TOTALES)) {
					numerorecapTotales=numerorecap;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NumeroRecapConstantesFunciones.TotalizarValoresFilaNumeroRecap(this.numerorecapLogic.getNumeroRecaps(),numerorecapTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroRecap numerorecap:this.numerorecaps) {
				if(numerorecap.getsType().equals(Constantes2.S_TOTALES)) {
					numerorecapTotales=numerorecap;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NumeroRecapConstantesFunciones.TotalizarValoresFilaNumeroRecap(this.numerorecaps,numerorecapTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNumeroRecapsFK_IdConexion()throws Exception {
		try {
			sAccionBusqueda="FK_IdConexion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNumeroRecapsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNumeroRecapsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNumeroRecapsFK_IdConexion(String sFinalQuery,Long id_conexion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numerorecapLogic.getNumeroRecapsFK_IdConexion(sFinalQuery,this.pagination,id_conexion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNumeroRecapsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numerorecapLogic.getNumeroRecapsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNumeroRecapsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numerorecapLogic.getNumeroRecapsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosNumeroRecap() {
		this.isPermisoTodoNumeroRecap=false;
		this.isPermisoNuevoNumeroRecap=false;
		this.isPermisoActualizarNumeroRecap=false;
		this.isPermisoActualizarOriginalNumeroRecap=false;
		this.isPermisoEliminarNumeroRecap=false;
		this.isPermisoGuardarCambiosNumeroRecap=false;
		this.isPermisoConsultaNumeroRecap=false;
		this.isPermisoBusquedaNumeroRecap=false;
		this.isPermisoReporteNumeroRecap=false;		
		this.isPermisoOrdenNumeroRecap=false;		
		this.isPermisoPaginacionMedioNumeroRecap=false;		
		this.isPermisoPaginacionAltoNumeroRecap=false;
		this.isPermisoPaginacionTodoNumeroRecap=false;
		this.isPermisoCopiarNumeroRecap=false;		
		this.isPermisoVerFormNumeroRecap=false;		
		this.isPermisoDuplicarNumeroRecap=false;		
		this.isPermisoOrdenNumeroRecap=false;		
	}
	
	public void setPermisosUsuarioNumeroRecap(Boolean isPermiso) {
		this.isPermisoTodoNumeroRecap=isPermiso;
		this.isPermisoNuevoNumeroRecap=isPermiso;
		this.isPermisoActualizarNumeroRecap=isPermiso;
		this.isPermisoActualizarOriginalNumeroRecap=isPermiso;
		this.isPermisoEliminarNumeroRecap=isPermiso;
		this.isPermisoGuardarCambiosNumeroRecap=isPermiso;
		this.isPermisoConsultaNumeroRecap=isPermiso;
		this.isPermisoBusquedaNumeroRecap=isPermiso;
		this.isPermisoReporteNumeroRecap=isPermiso;
		this.isPermisoOrdenNumeroRecap=isPermiso;		
		this.isPermisoPaginacionMedioNumeroRecap=isPermiso;		
		this.isPermisoPaginacionAltoNumeroRecap=isPermiso;		
		this.isPermisoPaginacionTodoNumeroRecap=isPermiso;		
		this.isPermisoCopiarNumeroRecap=isPermiso;		
		this.isPermisoVerFormNumeroRecap=isPermiso;		
		this.isPermisoDuplicarNumeroRecap=isPermiso;
		this.isPermisoOrdenNumeroRecap=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNumeroRecap(Boolean isPermiso) {
		//this.isPermisoTodoNumeroRecap=isPermiso;
		this.isPermisoNuevoNumeroRecap=isPermiso;
		this.isPermisoActualizarNumeroRecap=isPermiso;
		this.isPermisoActualizarOriginalNumeroRecap=isPermiso;
		this.isPermisoEliminarNumeroRecap=isPermiso;
		this.isPermisoGuardarCambiosNumeroRecap=isPermiso;
		//this.isPermisoConsultaNumeroRecap=isPermiso;
		//this.isPermisoBusquedaNumeroRecap=isPermiso;
		//this.isPermisoReporteNumeroRecap=isPermiso;
		//this.isPermisoOrdenNumeroRecap=isPermiso;		
		//this.isPermisoPaginacionMedioNumeroRecap=isPermiso;		
		//this.isPermisoPaginacionAltoNumeroRecap=isPermiso;		
		//this.isPermisoPaginacionTodoNumeroRecap=isPermiso;		
		//this.isPermisoCopiarNumeroRecap=isPermiso;		
		//this.isPermisoDuplicarNumeroRecap=isPermiso;
		//this.isPermisoOrdenNumeroRecap=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNumeroRecapClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(NumeroRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebNumeroRecap(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNumeroRecapClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioNumeroRecapClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNumeroRecapClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNumeroRecapClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioNumeroRecap() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NumeroRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NumeroRecapConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNumeroRecap=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNumeroRecap=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNumeroRecap=this.isPermisoActualizarNumeroRecap;
			this.isPermisoEliminarNumeroRecap=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNumeroRecap=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNumeroRecap=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNumeroRecap=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNumeroRecap=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNumeroRecap=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNumeroRecap=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNumeroRecap=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNumeroRecap=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNumeroRecap=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNumeroRecap=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNumeroRecap=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNumeroRecap=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNumeroRecap=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNumeroRecap.setToolTipText(this.jTableDatosNumeroRecap.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNumeroRecap(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNumeroRecap(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NumeroRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NumeroRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNumeroRecap() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyNumeroRecapListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.conexionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNumeroRecapListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NumeroRecapJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNumeroRecapListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyConexionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyConexionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.conexionsForeignKey==null||this.conexionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ConexionConstantesFunciones.getArrayColumnasGlobalesConexion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ConexionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ConexionConstantesFunciones.SFINALQUERY;

				this.cargarCombosConexionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyNumeroRecapListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			NumeroRecapParameterReturnGeneral numerorecapReturnGeneral=new NumeroRecapParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.numerorecapConstantesFunciones.cargarid_empresaNumeroRecap)
					 || (this.esRecargarFks && this.numerorecapConstantesFunciones.cargarid_empresaNumeroRecap)) {

					if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+numerorecapSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.numerorecapConstantesFunciones.cargarid_sucursalNumeroRecap)
					 || (this.esRecargarFks && this.numerorecapConstantesFunciones.cargarid_sucursalNumeroRecap)) {

					if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+numerorecapSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalConexion="";

				if(((this.conexionsForeignKey==null||this.conexionsForeignKey.size()<=0) && this.numerorecapConstantesFunciones.cargarid_conexionNumeroRecap)
					 || (this.esRecargarFks && this.numerorecapConstantesFunciones.cargarid_conexionNumeroRecap)) {

					if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionConexion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ConexionConstantesFunciones.getArrayColumnasGlobalesConexion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalConexion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ConexionConstantesFunciones.TABLENAME);

						finalQueryGlobalConexion=Funciones.GetFinalQueryAppend(finalQueryGlobalConexion, "");
						finalQueryGlobalConexion+=ConexionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosConexionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalConexion=" WHERE " + ConstantesSql.ID + "="+numerorecapSessionBean.getlidConexionActual();
					}
				} else {
					finalQueryGlobalConexion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				numerorecapReturnGeneral=numerorecapLogic.cargarCombosLoteForeignKeyNumeroRecap(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalConexion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=numerorecapReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=numerorecapReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalConexion.equals("NONE")) {
				this.conexionsForeignKey=numerorecapReturnGeneral.getconexionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNumeroRecap()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyConexion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.numerorecapSessionBean==null) {
				this.numerorecapSessionBean=new NumeroRecapSessionBean();
			}

			if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyConexion()throws Exception {
		try {

			if(!this.numerorecapSessionBean.getisBusquedaDesdeForeignKeySesionConexion()) {
				Conexion conexion=new Conexion();
				ConexionConstantesFunciones.setConexionDescripcion(conexion,Constantes.SMENSAJE_ESCOJA_OPCION);
				conexion.setId(null);

				if(!ConexionConstantesFunciones.ExisteEnLista(this.conexionsForeignKey,conexion,true)) {

					this.conexionsForeignKey.add(0,conexion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyNumeroRecap()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNumeroRecap(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNumeroRecap()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.numerorecap.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNumeroRecap();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNumeroRecap(NumeroRecap numerorecap)throws Exception {	
		try {
			
			this.setActualConexionForeignKey(numerorecap.getid_conexion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNumeroRecap(NumeroRecap numerorecap,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNumeroRecap()throws Exception {	
		try {
			
			this.setActualConexionForeignKey(this.numerorecapConstantesFunciones.getid_conexion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNumeroRecap()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNumeroRecap()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNumeroRecap()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNumeroRecap()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNumeroRecap()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameConexionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNumeroRecap(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameConexionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNumeroRecap()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public NumeroRecapBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NumeroRecapBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NumeroRecapBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.numerorecapSessionBean=new NumeroRecapSessionBean(); 
		this.numerorecapConstantesFunciones=new NumeroRecapConstantesFunciones(); 
		this.numerorecapBean=new NumeroRecap();//(this.numerorecapConstantesFunciones); 		
		this.numerorecapReturnGeneral=new NumeroRecapParameterReturnGeneral(); 
		
		this.numerorecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.numerorecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NumeroRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NumeroRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NumeroRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNumeroRecap(true);
			
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
			
			this.numerorecapConstantesFunciones=new NumeroRecapConstantesFunciones(); 
			this.numerorecapBean=new NumeroRecap();//this.numerorecapConstantesFunciones); 			
			this.numerorecapReturnGeneral=new NumeroRecapParameterReturnGeneral(); 
		
			NumeroRecapBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Numero Recap Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.numerorecap=new NumeroRecap();
			this.numerorecaps = new ArrayList<NumeroRecap>();
			this.numerorecapsAux = new ArrayList<NumeroRecap>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic=new NumeroRecapLogic();
				this.numerorecapLogic.getNewConnexionToDeep("");
			}
			
			//this.numerorecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.numerorecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNumeroRecap);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNumeroRecap);	
					}
					
					if(this.jInternalFrameImportacionNumeroRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNumeroRecap);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNumeroRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNumeroRecap);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNumeroRecap);
				this.jInternalFrameDetalleFormNumeroRecap.setVisible(false);
				this.jInternalFrameDetalleFormNumeroRecap.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNumeroRecap);
					this.jInternalFrameReporteDinamicoNumeroRecap.setVisible(false);
					this.jInternalFrameReporteDinamicoNumeroRecap.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNumeroRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNumeroRecap);
					this.jInternalFrameImportacionNumeroRecap.setVisible(false);
					this.jInternalFrameImportacionNumeroRecap.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNumeroRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNumeroRecap);
					this.jInternalFrameOrderByNumeroRecap.setVisible(false);
					this.jInternalFrameOrderByNumeroRecap.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNumeroRecapActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NumeroRecapConstantesFunciones.INUMEROPAGINACION;
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
			
			this.numerorecapReturnGeneral=new NumeroRecapParameterReturnGeneral();
			
			this.numerorecapParameterGeneral=new NumeroRecapParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.numerorecapLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NumeroRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NumeroRecapConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.numerorecapSessionBean.getEsGuardarRelacionado(),this.numerorecapSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NumeroRecapConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.numerorecapSessionBean.getEsGuardarRelacionado(),this.numerorecapSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNumeroRecap=false;
			this.isVisibilidadCeldaDuplicarNumeroRecap=true;
			this.isVisibilidadCeldaCopiarNumeroRecap=true;
			this.isVisibilidadCeldaVerFormNumeroRecap=true;
			this.isVisibilidadCeldaOrdenNumeroRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
			this.isVisibilidadCeldaModificarNumeroRecap=false;
			this.isVisibilidadCeldaActualizarNumeroRecap=false;
			this.isVisibilidadCeldaEliminarNumeroRecap=false;
			this.isVisibilidadCeldaCancelarNumeroRecap=false;
			this.isVisibilidadCeldaGuardarNumeroRecap=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=false;
			
			
			this.isVisibilidadFK_IdConexion=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNumeroRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNumeroRecap();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNumeroRecap(false);
			
			this.setPermisosUsuarioNumeroRecap();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.numerorecapSessionBean.getEsGuardarRelacionado() 
				|| (this.numerorecapSessionBean.getEsGuardarRelacionado() && this.numerorecapSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNumeroRecapClasesRelacionadas();
			}
			
			if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNumeroRecapClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNumeroRecap();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNumeroRecap();
			}
			
			if(!this.isPermisoBusquedaNumeroRecap) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNumeroRecap,this.isPermisoPaginacionMedioNumeroRecap,this.isPermisoPaginacionTodoNumeroRecap);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NumeroRecapConstantesFunciones.getTiposSeleccionarNumeroRecap());
				
				this.tiposColumnasSelect=NumeroRecapConstantesFunciones.getTiposSeleccionarNumeroRecap(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNumeroRecap();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioNumeroRecap(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioNumeroRecap(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNumeroRecap() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.conexionLogic=new ConexionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				numerorecapImplementable= (NumeroRecapImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NumeroRecapConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				numerorecapImplementableHome= (NumeroRecapImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NumeroRecapConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.numerorecaps= new ArrayList<NumeroRecap>();
			this.numerorecapsEliminados= new ArrayList<NumeroRecap>();
						
			this.isEsNuevoNumeroRecap=false;
			this.esParaAccionDesdeFormularioNumeroRecap=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.conexionsForeignKey=new ArrayList<Conexion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNumeroRecap(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNumeroRecap();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NumeroRecapBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NumeroRecapConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNumeroRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNumeroRecap(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNumeroRecap();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNumeroRecap();
			}
			
			NumeroRecapBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNumeroRecap.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNumeroRecap.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNumeroRecap.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNumeroRecap(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NumeroRecap: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNumeroRecap() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNumeroRecap")) {
				iIndex=this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNumeroRecap();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyNumeroRecap(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNumeroRecap(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNumeroRecap(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNumeroRecapListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNumeroRecap();
		
		this.cargarCombosFrameForeignKeyNumeroRecap();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNumeroRecap();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNumeroRecap();
		}
	}
	
	

	public void cargarCombosForeignKeyConexion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyConexionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyConexion();
				this.cargarCombosFrameConexionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaConexion(this.conexionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoNumeroRecapActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
			
			if(jTableDatosNumeroRecap.getRowCount()>=1) {
				jTableDatosNumeroRecap.removeRowSelectionInterval(0, jTableDatosNumeroRecap.getRowCount()-1);						
			}
			
			this.isEsNuevoNumeroRecap=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNumeroRecap(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNumeroRecap(true);			
			//this.numerorecap=new NumeroRecap();
			//this.numerorecap.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNumeroRecap(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNumeroRecap() ;
			
			if(NumeroRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNumeroRecap(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.numerorecap);	
			this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);				
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
			if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NumeroRecap: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNumeroRecapActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNumeroRecap.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNumeroRecap.getSelectedRows().length;			
			}
			
			numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNumeroRecap--;			
				//NumeroRecap numerorecapAux= new NumeroRecap();			
				//numerorecapAux.setId(this.iIdNuevoNumeroRecap);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NumeroRecap numerorecapOrigen=new NumeroRecap();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NumeroRecap numerorecapOrigen : numerorecapsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							numerorecapOrigen =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numerorecapOrigen =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNumeroRecap();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.numerorecap.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNumeroRecap(numerorecapOrigen,this.numerorecap,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.numerorecapLogic.getNumeroRecaps().add(this.numerorecapAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.numerorecaps.add(this.numerorecapAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNumeroRecap(false);
				
				this.jTableDatosNumeroRecap.setRowSelectionInterval(this.getIndiceNuevoNumeroRecap(), this.getIndiceNuevoNumeroRecap());
				
				int iLastRow =  this.jTableDatosNumeroRecap.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNumeroRecap.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNumeroRecap.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNumeroRecap(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();									
		
			NumeroRecap numerorecapOrigen=new NumeroRecap();
			NumeroRecap numerorecapDestino=new NumeroRecap();
				
			numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNumeroRecap.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || numerorecapsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNumeroRecap.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapOrigen =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						numerorecapOrigen =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numerorecapDestino =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						numerorecapDestino =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				numerorecapOrigen =numerorecapsSeleccionados.get(0);
				numerorecapDestino =numerorecapsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNumeroRecap(numerorecapOrigen,numerorecapDestino,true,false);
				
				numerorecapDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(numerorecapDestino,numerorecapLogic.getNumeroRecaps());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(numerorecapDestino,numerorecaps);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNumeroRecap(false);
				
				//this.jTableDatosNumeroRecap.setRowSelectionInterval(this.getIndiceNuevoNumeroRecap(), this.getIndiceNuevoNumeroRecap());
				
				int iLastRow =  this.jTableDatosNumeroRecap.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNumeroRecap.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNumeroRecap.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNumeroRecap(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNumeroRecap.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNumeroRecap.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNumeroRecap.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNumeroRecap.setVisible(!isVisible);
			this.jPanelPaginacionNumeroRecap.setVisible(!isVisible);
			this.jPanelAccionesNumeroRecap.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNumeroRecap();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNumeroRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNumeroRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNumeroRecap();
			
			this.abrirFrameOrderByNumeroRecap();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNumeroRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNumeroRecap(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNumeroRecap);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNumeroRecap.isMaximum()) {
					this.jInternalFrameDetalleFormNumeroRecap.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNumeroRecap.setSize(this.jInternalFrameDetalleFormNumeroRecap.iWidthFormulario,this.jInternalFrameDetalleFormNumeroRecap.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNumeroRecap.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNumeroRecap.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNumeroRecap.isMaximum()) {
						this.jInternalFrameDetalleFormNumeroRecap.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNumeroRecap.jContentPaneDetalleNumeroRecap.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNumeroRecap.jContentPaneDetalleNumeroRecap.getWidth(),NumeroRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNumeroRecap.jContentPaneDetalleNumeroRecap.getWidth(),NumeroRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNumeroRecap.jContentPaneDetalleNumeroRecap.getWidth(),NumeroRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNumeroRecap.setVisible(true);
	        this.jInternalFrameDetalleFormNumeroRecap.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNumeroRecap() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNumeroRecap==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNumeroRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNumeroRecap,false,this);
				} else {
					this.jInternalFrameOrderByNumeroRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNumeroRecap,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNumeroRecap);
				this.jInternalFrameOrderByNumeroRecap.setVisible(false);
				this.jInternalFrameOrderByNumeroRecap.setSelected(false);
				
				this.jInternalFrameOrderByNumeroRecap.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNumeroRecap"));
				
				this.inicializarActualizarBindingTablaOrderByNumeroRecap();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNumeroRecap() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNumeroRecap==null) {
				
				this.jInternalFrameImportacionNumeroRecap=new ImportacionJInternalFrame(NumeroRecapConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNumeroRecap);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNumeroRecap);
				this.jInternalFrameImportacionNumeroRecap.setVisible(false);
				this.jInternalFrameImportacionNumeroRecap.setSelected(false);


				this.jInternalFrameImportacionNumeroRecap.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNumeroRecap"));
				this.jInternalFrameImportacionNumeroRecap.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNumeroRecap"));
				this.jInternalFrameImportacionNumeroRecap.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNumeroRecap"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNumeroRecap() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNumeroRecap==null) {
				this.jInternalFrameReporteDinamicoNumeroRecap=new ReporteDinamicoJInternalFrame(NumeroRecapConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNumeroRecap);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNumeroRecap);
				this.jInternalFrameReporteDinamicoNumeroRecap.setVisible(false);
				this.jInternalFrameReporteDinamicoNumeroRecap.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNumeroRecap.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNumeroRecap"));
				this.jInternalFrameReporteDinamicoNumeroRecap.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNumeroRecap"));
				this.jInternalFrameReporteDinamicoNumeroRecap.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNumeroRecap"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNumeroRecap();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleNumeroRecap() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNumeroRecap);
			
	       	this.jInternalFrameDetalleFormNumeroRecap.setVisible(false);
	        this.jInternalFrameDetalleFormNumeroRecap.setSelected(false);
			
			//this.jInternalFrameDetalleFormNumeroRecap.dispose();
			//this.jInternalFrameDetalleFormNumeroRecap=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNumeroRecap() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNumeroRecap.setVisible(true);
	        this.jInternalFrameReporteDinamicoNumeroRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNumeroRecap() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNumeroRecap.setVisible(true);
	        this.jInternalFrameImportacionNumeroRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNumeroRecap() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNumeroRecap.setVisible(true);
	        this.jInternalFrameOrderByNumeroRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNumeroRecap() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNumeroRecap.setVisible(false);
	        this.jInternalFrameOrderByNumeroRecap.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNumeroRecap() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNumeroRecap.setVisible(false);
	        this.jInternalFrameReporteDinamicoNumeroRecap.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNumeroRecap() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNumeroRecap.setVisible(false);
	        this.jInternalFrameImportacionNumeroRecap.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNumeroRecap(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNumeroRecap(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNumeroRecap(true);
			//this.isEsNuevoNumeroRecap=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNumeroRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNumeroRecap(false) ;
			
			if(numerorecapSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(NumeroRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNumeroRecap(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNumeroRecap(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNumeroRecapActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNumeroRecap(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNumeroRecap(true);
			//this.isEsNuevoNumeroRecap=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.numerorecap.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNumeroRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNumeroRecap(false) ;
			
			if(NumeroRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNumeroRecap(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNumeroRecap(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaConexion(List<Conexion> conexionsForeignKey)throws Exception{
		TableColumn tableColumnConexion=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,NumeroRecapConstantesFunciones.LABEL_IDCONEXION));
		TableCellEditor tableCellEditorConexion =tableColumnConexion.getCellEditor();

		ConexionTableCell conexionTableCellFk=(ConexionTableCell)tableCellEditorConexion;

		if(conexionTableCellFk!=null) {
			conexionTableCellFk.setconexionsForeignKey(conexionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNumeroRecap.getSelectedRow();

		//if(intSelectedRow<=0) {
			//conexionTableCellFk.setRowActual(intSelectedRow);
			//conexionTableCellFk.setconexionsForeignKeyActual(conexionsForeignKey);
		//}


		if(conexionTableCellFk!=null) {
			conexionTableCellFk.RecargarConexionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNumeroRecap(false);
			
			//if(!this.isEsNuevoNumeroRecap) {								
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
				
			}
			
			if(this.permiteMantenimiento(this.numerorecap)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNumeroRecap=true;
					this.inicializarActualizarBindingTablaNumeroRecap(false);
					this.isEsNuevoNumeroRecap=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNumeroRecap=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNumeroRecap=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNumeroRecap(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNumeroRecap(false);
				
				this.habilitarDeshabilitarControlesNumeroRecap(false);
			
												
				
				if(NumeroRecapJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNumeroRecap();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNumeroRecapActionPerformed(evt,numerorecapSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNumeroRecap(this.numerorecap,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNumeroRecap.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,numerorecapSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.numerorecap.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNumeroRecapActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				this.numerorecap.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				this.numerorecap.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.numerorecap)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NumeroRecapModel) this.jTableDatosNumeroRecap.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNumeroRecap=true;
				this.inicializarActualizarBindingTablaNumeroRecap(false);
				this.isEsNuevoNumeroRecap=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNumeroRecap(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNumeroRecap(false);
				
				this.habilitarDeshabilitarControlesNumeroRecap(false);
				
				
				
				if(NumeroRecapJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNumeroRecap();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNumeroRecapActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNumeroRecap.getRowCount()>=1) {
				jTableDatosNumeroRecap.removeRowSelectionInterval(0, jTableDatosNumeroRecap.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNumeroRecap(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNumeroRecap(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNumeroRecap(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNumeroRecap(false) ;
			
			this.isEsNuevoNumeroRecap=false;
			
			if(NumeroRecapJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNumeroRecap();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNumeroRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNumeroRecap(false);
				
				//SI ES MANUAL
				if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNumeroRecap();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNumeroRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNumeroRecap--;			
			//NumeroRecap numerorecapAux= new NumeroRecap();			
			//numerorecapAux.setId(this.iIdNuevoNumeroRecap);
			
			if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNumeroRecap();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
			
			this.numerorecap.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.numerorecapLogic.getNumeroRecaps().add(this.numerorecapAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.numerorecaps.add(this.numerorecapAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNumeroRecap(false);
			
			this.jTableDatosNumeroRecap.setRowSelectionInterval(this.getIndiceNuevoNumeroRecap(), this.getIndiceNuevoNumeroRecap());
			
			int iLastRow =  this.jTableDatosNumeroRecap.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNumeroRecap.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNumeroRecap.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNumeroRecap(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNumeroRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNumeroRecap(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNumeroRecap(false);
			
			//SI ES MANUAL
			if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNumeroRecap();
			}
			
			//this.abrirFrameTreeNumeroRecap();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNumeroRecapActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Numero RecapES ?", "MANTENIMIENTO DE Numero Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNumeroRecap.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNumeroRecap();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.numerorecapReturnGeneral=numerorecapLogic.procesarImportacionNumeroRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.numerorecapParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNumeroRecapReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNumeroRecapActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNumeroRecap.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNumeroRecap.setFileImportacion(this.jInternalFrameImportacionNumeroRecap.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNumeroRecap.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNumeroRecap.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNumeroRecap.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNumeroRecap.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNumeroRecapActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		

		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NumeroRecapBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NumeroRecapBaseDesign.jrxml";
			
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
			
			this.generarReporteNumeroRecaps("Todos",numerorecapsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NumeroRecapConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroRecapConstantesFunciones.LABEL_IDCONEXION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Conexion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Conexion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Conexion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Conexion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroRecapConstantesFunciones.LABEL_NUMERORECAP:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRecap_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRecap_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRecap_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRecap_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroRecapConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNumeroRecap.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NumeroRecapConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case NumeroRecapConstantesFunciones.LABEL_IDCONEXION:
					sNombreCampoCategoria="id_conexion";
					break;

				case NumeroRecapConstantesFunciones.LABEL_NUMERORECAP:
					sNombreCampoCategoria="numero_recap";
					break;

				case NumeroRecapConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NumeroRecapConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case NumeroRecapConstantesFunciones.LABEL_IDCONEXION:
					sNombreCampoCategoriaValor="id_conexion";
					break;

				case NumeroRecapConstantesFunciones.LABEL_NUMERORECAP:
					sNombreCampoCategoriaValor="numero_recap";
					break;

				case NumeroRecapConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NumeroRecapConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case NumeroRecapConstantesFunciones.LABEL_IDCONEXION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Conexion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_conexion");
					break;

				case NumeroRecapConstantesFunciones.LABEL_NUMERORECAP:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Recap",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_recap");
					break;

				case NumeroRecapConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
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
	
	public void jButtonGenerarExcelReporteDinamicoNumeroRecapActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numerorecap";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NumeroRecaps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NumeroRecapConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(NumeroRecap numerorecap:numerorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numerorecap.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(NumeroRecap numerorecap:numerorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numerorecap.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroRecapConstantesFunciones.LABEL_IDCONEXION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDCONEXION);
					iRow++;

					for(NumeroRecap numerorecap:numerorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numerorecap.getconexion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroRecapConstantesFunciones.LABEL_NUMERORECAP:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_NUMERORECAP);
					iRow++;

					for(NumeroRecap numerorecap:numerorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numerorecap.getnumero_recap());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroRecapConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(NumeroRecap numerorecap:numerorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numerorecap.getfecha());
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
			//	this.getFilaCabeceraExportarExcelNumeroRecap(row);				
			//	iRow++;
			//}				
			
			//for(NumeroRecap numerorecapAux:numerorecapsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNumeroRecap(numerorecapAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
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
				this.numerorecapLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNumeroRecap(false);
			
			//SI ES MANUAL
			if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNumeroRecap();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNumeroRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNumeroRecap(false);
			
			//SI ES MANUAL
			if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNumeroRecap();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNumeroRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNumeroRecap(false);
			
			//SI ES MANUAL
			if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNumeroRecap();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNumeroRecap() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNumeroRecap.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNumeroRecap.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNumeroRecap.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNumeroRecap.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNumeroRecap.setMinimumSize(dimensionMinimum);
		this.jTableDatosNumeroRecap.setMaximumSize(dimensionMaximum);
		this.jTableDatosNumeroRecap.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNumeroRecap(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNumeroRecap(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNumeroRecap(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNumeroRecap(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNumeroRecap(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNumeroRecap(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNumeroRecap(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNumeroRecap(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNumeroRecap() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNumeroRecap();
		
		this.inicializarActualizarBindingBotonesManualNumeroRecap(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNumeroRecap();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNumeroRecap() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNumeroRecap(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNumeroRecap(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNumeroRecap.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNumeroRecap.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNumeroRecap.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNumeroRecap.jCheckBoxPostAccionNuevoNumeroRecap.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNumeroRecap.jCheckBoxPostAccionSinCerrarNumeroRecap.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNumeroRecap.jCheckBoxPostAccionSinMensajeNumeroRecap.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNumeroRecap.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNumeroRecap.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNumeroRecap.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
				this.jInternalFrameDetalleFormNumeroRecap.jCheckBoxPostAccionNuevoNumeroRecap.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNumeroRecap.jCheckBoxPostAccionSinCerrarNumeroRecap.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNumeroRecap.jCheckBoxPostAccionSinMensajeNumeroRecap.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNumeroRecap.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNumeroRecap.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNumeroRecap.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNumeroRecap.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNumeroRecap.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNumeroRecap.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNumeroRecap.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNumeroRecap.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNumeroRecap.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNumeroRecap(Boolean esInicializar) throws Exception {
		try	{	
			if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNumeroRecap(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNumeroRecap() throws Exception {
		try	{
			if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNumeroRecap();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNumeroRecap() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNumeroRecap() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNumeroRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNumeroRecap.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNumeroRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNumeroRecap.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNumeroRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNumeroRecap.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNumeroRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNumeroRecap.addItem(reporte);
			}
			
			
			if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNumeroRecap.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNumeroRecap.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNumeroRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNumeroRecap.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNumeroRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNumeroRecap.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNumeroRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNumeroRecap.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNumeroRecap.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNumeroRecap();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNumeroRecap() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
				this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
				this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNumeroRecap.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
				
				if(this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNumeroRecap.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNumeroRecap.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNumeroRecap.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNumeroRecap.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNumeroRecap()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_conexionFK_IdConexionNumeroRecap.getSelectedItem()!=null){this.id_conexionFK_IdConexion=((Conexion)this.jComboBoxid_conexionFK_IdConexionNumeroRecap.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNumeroRecap(Boolean esInicializar) throws Exception {				
		if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNumeroRecap();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNumeroRecap() throws Exception {
		this.inicializarActualizarBindingTablaNumeroRecap(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNumeroRecap() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNumeroRecapOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecapOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNumeroRecap(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=numerorecapLogic.getNumeroRecaps().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=numerorecaps.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNumeroRecap.setModel(new NumeroRecapModel(this.numerorecapLogic.getNumeroRecaps(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNumeroRecap.setModel(new NumeroRecapModel(this.numerorecaps,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNumeroRecap!=null && this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNumeroRecap();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO,numerorecapConstantesFunciones.resaltarSeleccionarNumeroRecap,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO,numerorecapConstantesFunciones.resaltarSeleccionarNumeroRecap,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,NumeroRecapConstantesFunciones.LABEL_ID));

		if(this.numerorecapConstantesFunciones.mostraridNumeroRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroRecapConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.numerorecapConstantesFunciones.resaltaridNumeroRecap,this.numerorecapConstantesFunciones.activaridNumeroRecap,this,true,"idNumeroRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numerorecapConstantesFunciones.resaltaridNumeroRecap,this.numerorecapConstantesFunciones.activaridNumeroRecap,this,true,"idNumeroRecap","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,NumeroRecapConstantesFunciones.LABEL_IDEMPRESA));

		if(this.numerorecapConstantesFunciones.mostrarid_empresaNumeroRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroRecapConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.numerorecapConstantesFunciones.resaltarid_empresaNumeroRecap,this,this.numerorecapConstantesFunciones.activarid_empresaNumeroRecap));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.numerorecapConstantesFunciones.resaltarid_empresaNumeroRecap,this,this.numerorecapConstantesFunciones.activarid_empresaNumeroRecap,false,"id_empresaNumeroRecap","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.numerorecapConstantesFunciones.mostrarid_sucursalNumeroRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.numerorecapConstantesFunciones.resaltarid_sucursalNumeroRecap,this,this.numerorecapConstantesFunciones.activarid_sucursalNumeroRecap));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.numerorecapConstantesFunciones.resaltarid_sucursalNumeroRecap,this,this.numerorecapConstantesFunciones.activarid_sucursalNumeroRecap,false,"id_sucursalNumeroRecap","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,NumeroRecapConstantesFunciones.LABEL_IDCONEXION));

		if(this.numerorecapConstantesFunciones.mostrarid_conexionNumeroRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroRecapConstantesFunciones.LABEL_IDCONEXION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ConexionTableCell(this.conexionsForeignKey,this.numerorecapConstantesFunciones.resaltarid_conexionNumeroRecap,this,this.numerorecapConstantesFunciones.activarid_conexionNumeroRecap));
			tableColumn.setCellEditor(new ConexionTableCell(this.conexionsForeignKey,this.numerorecapConstantesFunciones.resaltarid_conexionNumeroRecap,this,this.numerorecapConstantesFunciones.activarid_conexionNumeroRecap,true,"id_conexionNumeroRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,NumeroRecapConstantesFunciones.LABEL_NUMERORECAP));

		if(this.numerorecapConstantesFunciones.mostrarnumero_recapNumeroRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroRecapConstantesFunciones.LABEL_NUMERORECAP,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.numerorecapConstantesFunciones.resaltarnumero_recapNumeroRecap,this.numerorecapConstantesFunciones.activarnumero_recapNumeroRecap,this,true,"numero_recapNumeroRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numerorecapConstantesFunciones.resaltarnumero_recapNumeroRecap,this.numerorecapConstantesFunciones.activarnumero_recapNumeroRecap,this,true,"numero_recapNumeroRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,NumeroRecapConstantesFunciones.LABEL_FECHA));

		if(this.numerorecapConstantesFunciones.mostrarfechaNumeroRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroRecapConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.numerorecapConstantesFunciones.resaltarfechaNumeroRecap,this.numerorecapConstantesFunciones.activarfechaNumeroRecap,this,true,"fechaNumeroRecap","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.numerorecapConstantesFunciones.resaltarfechaNumeroRecap,this.numerorecapConstantesFunciones.activarfechaNumeroRecap,this,true,"fechaNumeroRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new NumeroRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.numerorecapSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.numerorecapSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNumeroRecap.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.numerorecapSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.numerorecapSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNumeroRecap.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.numerorecapSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.numerorecapSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNumeroRecap.addColumn(tableColumn);
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
			
			this.jTableDatosNumeroRecap.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNumeroRecap.moveColumn(this.jTableDatosNumeroRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNumeroRecap.moveColumn(this.jTableDatosNumeroRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNumeroRecap.moveColumn(this.jTableDatosNumeroRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNumeroRecap.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNumeroRecap.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNumeroRecap,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNumeroRecap.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNumeroRecap.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNumeroRecap.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNumeroRecap.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNumeroRecap.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=numerorecapLogic.getNumeroRecaps().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=numerorecaps.size()-1;
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
		//this.jTableDatosNumeroRecap.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNumeroRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNumeroRecap();
			
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
				
				//this.isEsNuevoNumeroRecap=false;
					
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
				if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNumeroRecap==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNumeroRecap.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNumeroRecap.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.numerorecap.getsType().equals("DUPLICADO")
				   || this.numerorecap.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNumeroRecap=true;
				
				} else {
					this.isEsNuevoNumeroRecap=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
					if(this.numerorecap.getId()>=0 && !this.numerorecap.getIsNew()) {						
						this.isEsNuevoNumeroRecap=false;
						
					} else {
						this.isEsNuevoNumeroRecap=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNumeroRecap(esRelaciones);						
				
				this.seleccionarNumeroRecap(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.numerorecap.getId()<0) {
					this.isEsNuevoNumeroRecap=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNumeroRecap(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNumeroRecap(evt,rowIndex);
				}	
				
				if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NumeroRecap: " + this.dDif); 
					}
				}								
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNumeroRecap(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.numerorecap)) {
					if(this.numerorecap.getId()>0) {
						this.numerorecap.setIsDeleted(true);
						
						this.numerorecapsEliminados.add(this.numerorecap);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.numerorecapLogic.getNumeroRecaps().remove(this.numerorecap);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.numerorecaps.remove(this.numerorecap);				
					}
					
					
					((NumeroRecapModel) this.jTableDatosNumeroRecap.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNumeroRecap(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNumeroRecap(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNumeroRecap) {
			
			if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNumeroRecap.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNumeroRecap.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNumeroRecap(this.numerorecap);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.numerorecapConstantesFunciones.cargarid_empresaNumeroRecap || this.numerorecapConstantesFunciones.event_dependid_empresaNumeroRecap) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.numerorecap.getid_empresa());
									//this.inicializarActualizarBindingNumeroRecap(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(numerorecap.getEmpresa()!=null) {
							this.empresasForeignKey.add(numerorecap.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.numerorecap.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.numerorecapConstantesFunciones.cargarid_sucursalNumeroRecap || this.numerorecapConstantesFunciones.event_dependid_sucursalNumeroRecap) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.numerorecap.getid_sucursal());
									//this.inicializarActualizarBindingNumeroRecap(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(numerorecap.getSucursal()!=null) {
							this.sucursalsForeignKey.add(numerorecap.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.numerorecap.getid_sucursal(),false,"Formulario");

					//Conexion
					if(!this.numerorecapConstantesFunciones.cargarid_conexionNumeroRecap || this.numerorecapConstantesFunciones.event_dependid_conexionNumeroRecap) {
						//this.cargarCombosConexionsForeignKeyLista(" where id="+this.numerorecap.getid_conexion());
									//this.inicializarActualizarBindingNumeroRecap(false,false);
						this.conexionsForeignKey=new ArrayList<Conexion>();

						if(numerorecap.getConexion()!=null) {
							this.conexionsForeignKey.add(numerorecap.getConexion());
						}

						this.addItemDefectoCombosForeignKeyConexion();
						this.cargarCombosFrameConexionsForeignKey("Todos");
					}
					this.setActualConexionForeignKey(this.numerorecap.getid_conexion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNumeroRecap("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNumeroRecap(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNumeroRecap() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNumeroRecap(NumeroRecap numerorecap) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNumeroRecap(numerorecap,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNumeroRecap(NumeroRecap numerorecap,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNumeroRecap(numerorecap);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNumeroRecap(numerorecap,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNumeroRecap(numerorecap);
	}
	
	public void setVariablesObjetoActualToFormularioNumeroRecap(NumeroRecap numerorecap) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.setText(numerorecap.getId().toString());
			this.jInternalFrameDetalleFormNumeroRecap.jTextFieldnumero_recapNumeroRecap.setText(numerorecap.getnumero_recap());
			this.jInternalFrameDetalleFormNumeroRecap.jDateChooserfechaNumeroRecap.setDate(numerorecap.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NumeroRecap numerorecapLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,numerorecapLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NumeroRecap numerorecapLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				numerorecapLocal=this.numerorecap;
			} else {
				numerorecapLocal=this.numerorecapAnterior;
			}
		}
		
		if(this.permiteMantenimiento(numerorecapLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNumeroRecap(numerorecapLocal,true);
					
					if(numerorecapSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(numerorecapLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(numerorecapLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNumeroRecap(NumeroRecap numerorecap,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNumeroRecap(numerorecap,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(numerorecap);
	}
	
	public void setVariablesFormularioToObjetoActualNumeroRecap(NumeroRecap numerorecap,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNumeroRecap(numerorecap,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNumeroRecap(NumeroRecap numerorecap,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.getText()==null || this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.getText()=="" || this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.getText()=="Id") {
				this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.setText("0");
			}

			if(conColumnasBase) {numerorecap.setId(Long.parseLong(this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroRecapConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroRecap.jLabelIdNumeroRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numerorecap.setnumero_recap(this.jInternalFrameDetalleFormNumeroRecap.jTextFieldnumero_recapNumeroRecap.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroRecapConstantesFunciones.LABEL_NUMERORECAP+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroRecap.jLabelnumero_recapNumeroRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numerorecap.setfecha(this.jInternalFrameDetalleFormNumeroRecap.jDateChooserfechaNumeroRecap.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroRecapConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroRecap.jLabelfechaNumeroRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNumeroRecap(NumeroRecap numerorecapBean,NumeroRecap numerorecap,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && numerorecapBean.getid_conexion()!=null && !numerorecapBean.getid_conexion().equals(-1L))) {numerorecap.setid_conexion(numerorecapBean.getid_conexion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNumeroRecap(NumeroRecap numerorecapOrigen,NumeroRecap numerorecap,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && numerorecapOrigen.getId()!=null && !numerorecapOrigen.getId().equals(0L))) {numerorecap.setId(numerorecapOrigen.getId());}}
			if(conDefault || (!conDefault && numerorecapOrigen.getid_conexion()!=null && !numerorecapOrigen.getid_conexion().equals(-1L))) {numerorecap.setid_conexion(numerorecapOrigen.getid_conexion());}
			if(conDefault || (!conDefault && numerorecapOrigen.getnumero_recap()!=null && !numerorecapOrigen.getnumero_recap().equals(""))) {numerorecap.setnumero_recap(numerorecapOrigen.getnumero_recap());}
			if(conDefault || (!conDefault && numerorecapOrigen.getfecha()!=null && !numerorecapOrigen.getfecha().equals(new Date()))) {numerorecap.setfecha(numerorecapOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNumeroRecap(NumeroRecap numerorecap) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.setText(numerorecap.getId().toString());
			this.jInternalFrameDetalleFormNumeroRecap.jTextFieldnumero_recapNumeroRecap.setText(numerorecap.getnumero_recap());
			this.jInternalFrameDetalleFormNumeroRecap.jDateChooserfechaNumeroRecap.setDate(numerorecap.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNumeroRecap(NumeroRecapBean numerorecapBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.setText(numerorecapBean.getId().toString());
			this.jInternalFrameDetalleFormNumeroRecap.jTextFieldnumero_recapNumeroRecap.setText(numerorecapBean.getnumero_recap());
			this.jInternalFrameDetalleFormNumeroRecap.jDateChooserfechaNumeroRecap.setDate(numerorecapBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNumeroRecap(NumeroRecapParameterReturnGeneral numerorecapReturnGeneral,NumeroRecapBean numerorecapBean,Boolean conDefault) throws Exception { 
		try {
			NumeroRecap numerorecapLocal=new NumeroRecap();
			
			numerorecapLocal=numerorecapReturnGeneral.getNumeroRecap();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && numerorecapLocal.getId()!=null && !numerorecapLocal.getId().equals(0L))) {numerorecapBean.setId(numerorecapLocal.getId());}}
			if(conDefault || (!conDefault && numerorecapLocal.getid_conexion()!=null && !numerorecapLocal.getid_conexion().equals(-1L))) {numerorecapBean.setid_conexion(numerorecapLocal.getid_conexion());}
			if(conDefault || (!conDefault && numerorecapLocal.getnumero_recap()!=null && !numerorecapLocal.getnumero_recap().equals(""))) {numerorecapBean.setnumero_recap(numerorecapLocal.getnumero_recap());}
			if(conDefault || (!conDefault && numerorecapLocal.getfecha()!=null && !numerorecapLocal.getfecha().equals(new Date()))) {numerorecapBean.setfecha(numerorecapLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNumeroRecapGenerico(Long idNumeroRecapSeleccionado,JComboBox jComboBoxNumeroRecap,List<NumeroRecap> numerorecapsLocal)throws Exception {
		try {
			NumeroRecap  numerorecapTemp=null;

			for(NumeroRecap numerorecapAux:numerorecapsLocal) {
				if(numerorecapAux.getId()!=null && numerorecapAux.getId().equals(idNumeroRecapSeleccionado)) {
					numerorecapTemp=numerorecapAux;
					break;
				}
			}

			jComboBoxNumeroRecap.setSelectedItem(numerorecapTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNumeroRecapGenerico(JComboBox jComboBoxNumeroRecap,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNumeroRecap.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNumeroRecap.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNumeroRecap.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNumeroRecap.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			numerorecap=(NumeroRecap) numerorecapLogic.getNumeroRecaps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			numerorecap =(NumeroRecap) numerorecaps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!numerorecap.getIsNew() && !numerorecap.getIsChanged() && !numerorecap.getIsDeleted()) {
				sDescripcion=numerorecap.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=numerorecap.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!numerorecap.getIsNew() && !numerorecap.getIsChanged() && !numerorecap.getIsDeleted()) {
				sDescripcion=numerorecap.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=numerorecap.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Conexion")) {
			//sDescripcion=this.getActualConexionForeignKeyDescripcion((Long)value);
			if(!numerorecap.getIsNew() && !numerorecap.getIsChanged() && !numerorecap.getIsDeleted()) {
				sDescripcion=numerorecap.getconexion_descripcion();
			} else {
				//sDescripcion=this.getActualConexionForeignKeyDescripcion((Long)value);
				sDescripcion=numerorecap.getconexion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NumeroRecap numerorecapRow=new NumeroRecap();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			numerorecapRow=(NumeroRecap) numerorecapLogic.getNumeroRecaps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			numerorecapRow=(NumeroRecap) numerorecaps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNumeroRecap(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoNumeroRecap && this.isPermisoNuevoNumeroRecap));			
			this.jButtonDuplicarNumeroRecap.setVisible((this.isVisibilidadCeldaDuplicarNumeroRecap && this.isPermisoDuplicarNumeroRecap));			
			this.jButtonCopiarNumeroRecap.setVisible((this.isVisibilidadCeldaCopiarNumeroRecap && this.isPermisoCopiarNumeroRecap));
			this.jButtonVerFormNumeroRecap.setVisible((this.isVisibilidadCeldaVerFormNumeroRecap && this.isPermisoVerFormNumeroRecap));
			
			this.jButtonAbrirOrderByNumeroRecap.setVisible((this.isVisibilidadCeldaOrdenNumeroRecap && this.isPermisoOrdenNumeroRecap));			
			
			this.jButtonNuevoRelacionesNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesNumeroRecap && this.isPermisoNuevoNumeroRecap));			
			this.jButtonNuevoGuardarCambiosNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoNumeroRecap && this.isPermisoNuevoNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));
			
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarNumeroRecap.setVisible((this.isVisibilidadCeldaModificarNumeroRecap && this.isPermisoActualizarNumeroRecap));	
			this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarNumeroRecap.setVisible((this.isVisibilidadCeldaActualizarNumeroRecap && this.isPermisoActualizarNumeroRecap));	
			this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarNumeroRecap.setVisible((this.isVisibilidadCeldaEliminarNumeroRecap && this.isPermisoEliminarNumeroRecap));
			this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarNumeroRecap.setVisible(this.isVisibilidadCeldaCancelarNumeroRecap);							
			this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosNumeroRecap.setVisible((this.isVisibilidadCeldaGuardarNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));			
			
			}
						
			this.jButtonGuardarCambiosTablaNumeroRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoNumeroRecap && this.isPermisoNuevoNumeroRecap));						
			this.jButtonDuplicarToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaDuplicarNumeroRecap && this.isPermisoDuplicarNumeroRecap));						
			this.jButtonCopiarToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaCopiarNumeroRecap && this.isPermisoCopiarNumeroRecap));			
			this.jButtonVerFormToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaVerFormNumeroRecap && this.isPermisoVerFormNumeroRecap));			
			this.jButtonAbrirOrderByToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaOrdenNumeroRecap && this.isPermisoOrdenNumeroRecap));
			this.jButtonNuevoRelacionesToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesNumeroRecap && this.isPermisoNuevoNumeroRecap));			
			this.jButtonNuevoGuardarCambiosToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoNumeroRecap && this.isPermisoNuevoNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));			
			
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaModificarNumeroRecap && this.isPermisoActualizarNumeroRecap));	
			this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaActualizarNumeroRecap  && this.isPermisoActualizarNumeroRecap));	
			this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaEliminarNumeroRecap && this.isPermisoEliminarNumeroRecap));
			this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarToolBarNumeroRecap.setVisible(this.isVisibilidadCeldaCancelarNumeroRecap);				
			this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaGuardarNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNumeroRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoNumeroRecap && this.isPermisoNuevoNumeroRecap));			
			this.jMenuItemDuplicarNumeroRecap.setVisible((this.isVisibilidadCeldaDuplicarNumeroRecap && this.isPermisoDuplicarNumeroRecap));			
			this.jMenuItemCopiarNumeroRecap.setVisible((this.isVisibilidadCeldaCopiarNumeroRecap && this.isPermisoCopiarNumeroRecap));			
			this.jMenuItemVerFormNumeroRecap.setVisible((this.isVisibilidadCeldaVerFormNumeroRecap && this.isPermisoVerFormNumeroRecap));			
			this.jMenuItemAbrirOrderByNumeroRecap.setVisible((this.isVisibilidadCeldaOrdenNumeroRecap && this.isPermisoOrdenNumeroRecap));			
			//this.jMenuItemMostrarOcultarNumeroRecap.setVisible((this.isVisibilidadCeldaOrdenNumeroRecap && this.isPermisoOrdenNumeroRecap));
			this.jMenuItemDetalleAbrirOrderByNumeroRecap.setVisible((this.isVisibilidadCeldaOrdenNumeroRecap && this.isPermisoOrdenNumeroRecap));			
			//this.jMenuItemDetalleMostrarOcultarNumeroRecap.setVisible((this.isVisibilidadCeldaOrdenNumeroRecap && this.isPermisoOrdenNumeroRecap));			
			this.jMenuItemNuevoRelacionesNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesNumeroRecap && this.isPermisoNuevoNumeroRecap));			
			this.jMenuItemNuevoGuardarCambiosNumeroRecap.setVisible((this.isVisibilidadCeldaNuevoNumeroRecap && this.isPermisoNuevoNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));									
			
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemModificarNumeroRecap.setVisible((this.isVisibilidadCeldaModificarNumeroRecap && this.isPermisoActualizarNumeroRecap));	
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemActualizarNumeroRecap.setVisible((this.isVisibilidadCeldaActualizarNumeroRecap && this.isPermisoActualizarNumeroRecap));	
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemEliminarNumeroRecap.setVisible((this.isVisibilidadCeldaEliminarNumeroRecap && this.isPermisoEliminarNumeroRecap));
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemCancelarNumeroRecap.setVisible(this.isVisibilidadCeldaCancelarNumeroRecap);				
			}
			
			this.jMenuItemGuardarCambiosNumeroRecap.setVisible((this.isVisibilidadCeldaGuardarNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));						
			this.jMenuItemGuardarCambiosTablaNumeroRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNumeroRecap=this.jButtonNuevoNumeroRecap.isVisible();
			this.isVisibilidadCeldaDuplicarNumeroRecap=this.jButtonDuplicarNumeroRecap.isVisible();
			this.isVisibilidadCeldaCopiarNumeroRecap=this.jButtonCopiarNumeroRecap.isVisible();
			this.isVisibilidadCeldaVerFormNumeroRecap=this.jButtonVerFormNumeroRecap.isVisible();
			
			this.isVisibilidadCeldaOrdenNumeroRecap=this.jButtonAbrirOrderByNumeroRecap.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=this.jButtonNuevoRelacionesNumeroRecap.isVisible();
			this.isVisibilidadCeldaModificarNumeroRecap=this.jButtonModificarNumeroRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			this.isVisibilidadCeldaActualizarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarNumeroRecap.isVisible();
			this.isVisibilidadCeldaEliminarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarNumeroRecap.isVisible();
			this.isVisibilidadCeldaCancelarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarNumeroRecap.isVisible();
			this.isVisibilidadCeldaGuardarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosNumeroRecap.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=this.jButtonGuardarCambiosTablaNumeroRecap.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNumeroRecap=this.jButtonNuevoToolBarNumeroRecap.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=this.jButtonNuevoRelacionesToolBarNumeroRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			this.isVisibilidadCeldaModificarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarToolBarNumeroRecap.isVisible();
			this.isVisibilidadCeldaActualizarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarToolBarNumeroRecap.isVisible();
			this.isVisibilidadCeldaEliminarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarToolBarNumeroRecap.isVisible();
			this.isVisibilidadCeldaCancelarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarToolBarNumeroRecap.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNumeroRecap=this.jButtonGuardarCambiosToolBarNumeroRecap.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=this.jButtonGuardarCambiosTablaToolBarNumeroRecap.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNumeroRecap=this.jMenuItemNuevoNumeroRecap.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=this.jMenuItemNuevoRelacionesNumeroRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			this.isVisibilidadCeldaModificarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jMenuItemModificarNumeroRecap.isVisible();
			this.isVisibilidadCeldaActualizarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jMenuItemActualizarNumeroRecap.isVisible();
			this.isVisibilidadCeldaEliminarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jMenuItemEliminarNumeroRecap.isVisible();
			this.isVisibilidadCeldaCancelarNumeroRecap=this.jInternalFrameDetalleFormNumeroRecap.jMenuItemCancelarNumeroRecap.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNumeroRecap=this.jMenuItemGuardarCambiosNumeroRecap.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=this.jMenuItemGuardarCambiosTablaNumeroRecap.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNumeroRecap(Boolean esInicializar) {
		if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {			
			if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
				//if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNumeroRecap();
			}
			
			this.inicializarActualizarBindingBotonesManualNumeroRecap(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNumeroRecap() {
		this.jButtonNuevoNumeroRecap.setVisible(this.isPermisoNuevoNumeroRecap);			
		this.jButtonDuplicarNumeroRecap.setVisible(this.isPermisoDuplicarNumeroRecap);			
		this.jButtonCopiarNumeroRecap.setVisible(this.isPermisoCopiarNumeroRecap);			
		this.jButtonVerFormNumeroRecap.setVisible(this.isPermisoVerFormNumeroRecap);			
		
		this.jButtonAbrirOrderByNumeroRecap.setVisible(this.isPermisoOrdenNumeroRecap);					
		
		this.jButtonNuevoRelacionesNumeroRecap.setVisible(this.isPermisoNuevoNumeroRecap);			
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarNumeroRecap.setVisible(this.isPermisoActualizarNumeroRecap);	
			this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarNumeroRecap.setVisible(this.isPermisoActualizarNumeroRecap);	
			this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarNumeroRecap.setVisible(this.isPermisoEliminarNumeroRecap);
			this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarNumeroRecap.setVisible(this.isVisibilidadCeldaCancelarNumeroRecap);						
			this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosNumeroRecap.setVisible(this.isPermisoGuardarCambiosNumeroRecap);							
		}
		
		this.jButtonGuardarCambiosTablaNumeroRecap.setVisible(this.isPermisoActualizarNumeroRecap);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNumeroRecap() {
		this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarNumeroRecap.setVisible(this.isPermisoActualizarNumeroRecap);	
		this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarNumeroRecap.setVisible(this.isPermisoActualizarNumeroRecap);	
		this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarNumeroRecap.setVisible(this.isPermisoEliminarNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarNumeroRecap.setVisible(this.isVisibilidadCeldaCancelarNumeroRecap);							
		this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosNumeroRecap.setVisible((this.isVisibilidadCeldaGuardarNumeroRecap && this.isPermisoGuardarCambiosNumeroRecap));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNumeroRecap() {
		if(NumeroRecapJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNumeroRecap();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNumeroRecap() {
	}
	
	public void jTableDatosNumeroRecapListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNumeroRecap(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNumeroRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numerorecap==null) {
						this.numerorecap = new NumeroRecap();
					}

					this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
				}

				if(this.numerorecap.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.numerorecap.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNumeroRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNumeroRecap(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNumeroRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNumeroRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.numerorecapLogic.getConnexion());

				if(this.numerorecap.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.numerorecap.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNumeroRecap=(TitledBorder)this.jScrollPanelDatosNumeroRecap.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNumeroRecap.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNumeroRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numerorecap==null) {
						this.numerorecap = new NumeroRecap();
					}

					this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
				}

				if(this.numerorecap.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.numerorecap.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalNumeroRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebNumeroRecap(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNumeroRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNumeroRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.numerorecapLogic.getConnexion());

				if(this.numerorecap.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.numerorecap.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNumeroRecap=(TitledBorder)this.jScrollPanelDatosNumeroRecap.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderNumeroRecap.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalNumeroRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numerorecap==null) {
						this.numerorecap = new NumeroRecap();
					}

					this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
				}

				if(this.numerorecap.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.numerorecap.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_conexionNumeroRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoconexion=true;

			idTienePermisoconexion=this.tienePermisosUsuarioEnPaginaWebNumeroRecap(ConexionConstantesFunciones.CLASSNAME);

			if(idTienePermisoconexion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNumeroRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNumeroRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);

				this.conexionBeanSwingJInternalFrame=new ConexionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.conexionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.conexionBeanSwingJInternalFrame.getConexionLogic().setConnexion(this.numerorecapLogic.getConnexion());

				if(this.numerorecap.getid_conexion()!=null) {
					this.conexionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.conexionBeanSwingJInternalFrame.setIdActual(this.numerorecap.getid_conexion());
					this.conexionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.conexionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.conexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConexion();
				}

				JInternalFrameBase jinternalFrame =this.conexionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNumeroRecap=(TitledBorder)this.jScrollPanelDatosNumeroRecap.getBorder();
				TitledBorder titledBorderconexion=(TitledBorder)this.conexionBeanSwingJInternalFrame.jScrollPanelDatosConexion.getBorder();

				titledBorderconexion.setTitle(titledBorderNumeroRecap.getTitle() + " -> Conexion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_conexionNumeroRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numerorecap==null) {
						this.numerorecap = new NumeroRecap();
					}

					this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
				}

				if(this.numerorecap.getid_conexion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_conexion = "+this.numerorecap.getid_conexion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_recapNumeroRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numerorecap==null) {
						this.numerorecap = new NumeroRecap();
					}

					this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
				}

				if(this.numerorecap.getnumero_recap()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_recap like '%"+this.numerorecap.getnumero_recap()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaNumeroRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroRecap(this.getnumerorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numerorecap==null) {
						this.numerorecap = new NumeroRecap();
					}

					this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);
				}

				if(this.numerorecap.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.numerorecap.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdConexionNumeroRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNumeroRecap(false,false);

			this.getNumeroRecapsFK_IdConexion();

			this.inicializarActualizarBindingNumeroRecap(false);

			//if(NumeroRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNumeroRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaNumeroRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNumeroRecap(false,false);

			this.getNumeroRecapsFK_IdEmpresa();

			this.inicializarActualizarBindingNumeroRecap(false);

			//if(NumeroRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNumeroRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalNumeroRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNumeroRecap(false,false);

			this.getNumeroRecapsFK_IdSucursal();

			this.inicializarActualizarBindingNumeroRecap(false);

			//if(NumeroRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNumeroRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numerorecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNumeroRecap() {
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
			this.jInternalFrameDetalleFormNumeroRecap.setVisible(false);	    			
			this.jInternalFrameDetalleFormNumeroRecap.dispose();
			this.jInternalFrameDetalleFormNumeroRecap=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
			this.jInternalFrameReporteDinamicoNumeroRecap.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNumeroRecap.dispose();
			this.jInternalFrameReporteDinamicoNumeroRecap=null;
		}
		
		if(this.jInternalFrameImportacionNumeroRecap!=null) {
			this.jInternalFrameImportacionNumeroRecap.setVisible(false);	    			
			this.jInternalFrameImportacionNumeroRecap.dispose();
			this.jInternalFrameImportacionNumeroRecap=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNumeroRecap();
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
			
			if(sTipo.equals("NuevoNumeroRecap")) {
				jButtonNuevoNumeroRecapActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNumeroRecap")) {
				jButtonDuplicarNumeroRecapActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNumeroRecap")) {
				jButtonCopiarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("VerFormNumeroRecap")) {
				jButtonVerFormNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNumeroRecap")) {
				jButtonNuevoNumeroRecapActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNumeroRecap")) {
				jButtonDuplicarNumeroRecapActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNumeroRecap")) {
				jButtonNuevoNumeroRecapActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNumeroRecap")) {
				jButtonDuplicarNumeroRecapActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNumeroRecap")) {
				jButtonNuevoNumeroRecapActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNumeroRecap")) {
				jButtonNuevoNumeroRecapActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNumeroRecap")) {
				jButtonNuevoNumeroRecapActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNumeroRecap")) {
				jButtonModificarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNumeroRecap")) {
				jButtonModificarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNumeroRecap")) {
				jButtonModificarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNumeroRecap")) {
				jButtonActualizarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNumeroRecap")) {
				jButtonActualizarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNumeroRecap")) {
				jButtonActualizarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("EliminarNumeroRecap")) {
				jButtonEliminarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNumeroRecap")) {
				jButtonEliminarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNumeroRecap")) {
				jButtonEliminarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("CancelarNumeroRecap")) {
				jButtonCancelarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNumeroRecap")) {
				jButtonCancelarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNumeroRecap")) {
				jButtonCancelarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("CerrarNumeroRecap")) {
				jButtonCerrarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNumeroRecap")) {
				jButtonCerrarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNumeroRecap")) {
				jButtonCerrarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNumeroRecap")) {
				jButtonMostrarOcultarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNumeroRecap")) {
				jButtonCancelarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNumeroRecap")) {
				jButtonGuardarCambiosNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNumeroRecap")) {
				jButtonGuardarCambiosNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNumeroRecap")) {
				jButtonCopiarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNumeroRecap")) {
				jButtonVerFormNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNumeroRecap")) {
				jButtonGuardarCambiosNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNumeroRecap")) {
				jButtonCopiarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNumeroRecap")) {
				jButtonVerFormNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNumeroRecap")) {
				jButtonGuardarCambiosNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNumeroRecap")) {
				jButtonGuardarCambiosNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNumeroRecap")) {
				jButtonGuardarCambiosNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNumeroRecap")) {
				jButtonRecargarInformacionNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNumeroRecap")) {
				jButtonRecargarInformacionNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNumeroRecap")) {
				jButtonRecargarInformacionNumeroRecapActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNumeroRecap")) {
				jButtonAnterioresNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNumeroRecap")) {
				jButtonAnterioresNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNumeroRecap")) {
				jButtonAnterioresNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNumeroRecap")) {
				jButtonSiguientesNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNumeroRecap")) {
				jButtonSiguientesNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNumeroRecap")) {
				jButtonSiguientesNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNumeroRecap") || sTipo.equals("MenuItemDetalleAbrirOrderByNumeroRecap")) {
				jButtonAbrirOrderByNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNumeroRecap") || sTipo.equals("MenuItemDetalleMostrarOcultarNumeroRecap")) {
				jButtonMostrarOcultarNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNumeroRecap")) {
				jButtonNuevoGuardarCambiosNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNumeroRecap")) {
				jButtonNuevoGuardarCambiosNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNumeroRecap")) {
				jButtonNuevoGuardarCambiosNumeroRecapActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNumeroRecap")) {
				jButtonCerrarReporteDinamicoNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNumeroRecap")) {
				jButtonGenerarReporteDinamicoNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNumeroRecap")) {
				
				jButtonGenerarExcelReporteDinamicoNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNumeroRecap")) {
				jButtonCerrarImportacionNumeroRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNumeroRecap")) {
				
				jButtonGenerarImportacionNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNumeroRecap")) {
				
				jButtonAbrirImportacionNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNumeroRecap")) {
				jComboBoxTiposAccionesNumeroRecapActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNumeroRecap")) {
				jComboBoxTiposRelacionesNumeroRecapActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNumeroRecap")) {
				jComboBoxTiposAccionesNumeroRecapActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNumeroRecap")) {
				
				jComboBoxTiposSeleccionarNumeroRecapActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNumeroRecap")) {
				jTextFieldValorCampoGeneralNumeroRecapActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNumeroRecap")) {
				jButtonAbrirOrderByNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNumeroRecap")) {
				jButtonAbrirOrderByNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNumeroRecap")) {
				jButtonCerrarOrderByNumeroRecapActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNumeroRecapBusqueda")) {
				this.jButtonidNumeroRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNumeroRecapUpdate")) {
				this.jButtonid_empresaNumeroRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNumeroRecapBusqueda")) {
				this.jButtonid_empresaNumeroRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalNumeroRecapUpdate")) {
				this.jButtonid_sucursalNumeroRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalNumeroRecapBusqueda")) {
				this.jButtonid_sucursalNumeroRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_conexionNumeroRecapUpdate")) {
				this.jButtonid_conexionNumeroRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_conexionNumeroRecapBusqueda")) {
				this.jButtonid_conexionNumeroRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_recapNumeroRecapBusqueda")) {
				this.jButtonnumero_recapNumeroRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaNumeroRecapBusqueda")) {
				this.jButtonfechaNumeroRecapBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdConexionNumeroRecap")) {
				this.jButtonFK_IdConexionNumeroRecapActionPerformed(evt);
			}
			
			;
			
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNumeroRecap();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroRecapActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				


				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NumeroRecap numerorecapLocal=null;
			
			if(!this.getEsControlTabla()) {
				numerorecapLocal=this.numerorecap;
			} else {
				numerorecapLocal=this.numerorecapAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
							
				
				


				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
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
			
			


			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroRecapActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
								
						
				


				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
								
				
				


				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroRecapActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
							
				
				


				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroRecapActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numerorecapAnterior =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.numerorecapAnterior =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
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
			
			


			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroRecapActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
								
				
				


				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroRecapActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroRecapActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNumeroRecap")) {
					jCheckBoxSeleccionarTodosNumeroRecapItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNumeroRecap")) {
					jCheckBoxSeleccionadosNumeroRecapItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNumeroRecap")) {
					
				}
				
				


				
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
												
				
				


				
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroRecapActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numerorecapAnterior =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.numerorecapAnterior =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroRecapActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
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
			
			


			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroRecapActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numerorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numerorecap);
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
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
				
				


				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroRecap.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numerorecapAnterior =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNumeroRecap")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNumeroRecapListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNumeroRecap.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.numerorecap =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.numerorecap =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.numerorecap);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNumeroRecap")) {
				
				}
				
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNumeroRecap")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNumeroRecap.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNumeroRecap")) {
			
			}
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNumeroRecap();
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
			if(sTipo.equals("NuevoNumeroRecap")) {
				jButtonNuevoNumeroRecapActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNumeroRecap")) {
				jButtonDuplicarNumeroRecapActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNumeroRecap")) {
				jButtonCopiarNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNumeroRecap")) {
				jButtonVerFormNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNumeroRecap")) {
				jButtonNuevoNumeroRecapActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNumeroRecap")) {
				jButtonModificarNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNumeroRecap")) {
				jButtonActualizarNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNumeroRecap")) {
				jButtonEliminarNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNumeroRecap")) {
				jButtonGuardarCambiosNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNumeroRecap")) {
				jButtonCancelarNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNumeroRecap")) {
				jButtonCerrarNumeroRecapActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNumeroRecap")) {
				jButtonGuardarCambiosNumeroRecapActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNumeroRecap")) {
				jButtonNuevoGuardarCambiosNumeroRecapActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNumeroRecap")) {
				jButtonAbrirOrderByNumeroRecapActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNumeroRecap")) {
				jButtonRecargarInformacionNumeroRecapActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNumeroRecap")) {
				jButtonAnterioresNumeroRecapActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNumeroRecap")) {
				jButtonSiguientesNumeroRecapActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNumeroRecapBusqueda")) {
				this.jButtonidNumeroRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNumeroRecapUpdate")) {
				this.jButtonid_empresaNumeroRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNumeroRecapBusqueda")) {
				this.jButtonid_empresaNumeroRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalNumeroRecapUpdate")) {
				this.jButtonid_sucursalNumeroRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalNumeroRecapBusqueda")) {
				this.jButtonid_sucursalNumeroRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_conexionNumeroRecapUpdate")) {
				this.jButtonid_conexionNumeroRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_conexionNumeroRecapBusqueda")) {
				this.jButtonid_conexionNumeroRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_recapNumeroRecapBusqueda")) {
				this.jButtonnumero_recapNumeroRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaNumeroRecapBusqueda")) {
				this.jButtonfechaNumeroRecapBusquedaActionPerformed(evt);
			}
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNumeroRecap();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNumeroRecap")) {
				closingInternalFrameNumeroRecap();
				
			} else if(sTipo.equals("jButtonCancelarNumeroRecap")) {
				JInternalFrameBase jInternalFrameDetalleFormNumeroRecap = (JInternalFrameBase)evt.getSource();
	            	
	            NumeroRecapBeanSwingJInternalFrame jInternalFrameParent=(NumeroRecapBeanSwingJInternalFrame)jInternalFrameDetalleFormNumeroRecap.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNumeroRecapActionPerformed(null);
			}
			
			NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.numerorecap,new Object(),this.numerorecapParameterGeneral,this.numerorecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNumeroRecap(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNumeroRecap(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNumeroRecap(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.numerorecap)) {
			if(!esControlTabla) {
				if(NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);			
				}
				
				if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNumeroRecap(this.numerorecap,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.numerorecapReturnGeneral=numerorecapLogic.procesarEventosNumeroRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.numerorecapLogic.getNumeroRecaps(),this.numerorecap,this.numerorecapParameterGeneral,this.isEsNuevoNumeroRecap,classes);//this.numerorecapLogic.getNumeroRecap()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNumeroRecap(this.numerorecapReturnGeneral,this.numerorecapBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNumeroRecap(classes,this.numerorecapReturnGeneral,this.numerorecapBean,false);
					}
						
					if(this.numerorecapReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNumeroRecap(this.numerorecapReturnGeneral.getNumeroRecap());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNumeroRecap(this.numerorecapReturnGeneral.getNumeroRecap());	
					}
						
					if(this.numerorecapReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNumeroRecap(this.numerorecapReturnGeneral.getNumeroRecap(),classes);//this.numerorecapBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNumeroRecap(this.numerorecap,classes);//this.numerorecapBean);									
				}
			
				if(NumeroRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNumeroRecap(this.numerorecap,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroRecap(this.numerorecap);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.numerorecapAnterior!=null) {
						this.numerorecap=this.numerorecapAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.numerorecapReturnGeneral=numerorecapLogic.procesarEventosNumeroRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.numerorecapLogic.getNumeroRecaps(),this.numerorecap,this.numerorecapParameterGeneral,this.isEsNuevoNumeroRecap,classes);//this.numerorecapLogic.getNumeroRecap()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.numerorecapSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.numerorecapSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.numerorecapReturnGeneral.getNumeroRecap(),numerorecapLogic.getNumeroRecaps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.numerorecapReturnGeneral.getNumeroRecap(),this.numerorecaps);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNumeroRecap.repaint();
				
				//((AbstractTableModel) this.jTableDatosNumeroRecap.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNumeroRecap();
			}
		}
	}
	
	public void actualizarVisualTableDatosNumeroRecap() throws Exception {
		
		NumeroRecapModel numerorecapModel=(NumeroRecapModel)this.jTableDatosNumeroRecap.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			numerorecapModel.numerorecaps=this.numerorecapLogic.getNumeroRecaps();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			numerorecapModel.numerorecaps=this.numerorecaps;
		}
		
		
		((NumeroRecapModel) this.jTableDatosNumeroRecap.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNumeroRecap() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnumerorecapAnterior(),this.numerorecapLogic.getNumeroRecaps());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnumerorecapAnterior(),this.numerorecaps);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNumeroRecap();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNumeroRecap(NumeroRecap numerorecap,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
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
										
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.numerorecap,new Object(),generalEntityParameterGeneral,this.numerorecapReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NumeroRecapConstantesFunciones.getClassesRelationshipsOfNumeroRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NumeroRecapConstantesFunciones.getClassesRelationshipsFromStringsOfNumeroRecap(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNumeroRecap(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NumeroRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.numerorecap,new Object(),generalEntityParameterGeneral,this.numerorecapReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNumeroRecap(NumeroRecapBean numerorecapBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNumeroRecap(ArrayList<Classe> classes,NumeroRecapReturnGeneral numerorecapReturnGeneral,NumeroRecapBean numerorecapBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNumeroRecap(NumeroRecap numerorecap,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.numerorecap)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNumeroRecap = new NumeroRecapDetalleFormJInternalFrame(jDesktopPane,this.numerorecapSessionBean.getConGuardarRelaciones(),this.numerorecapSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.setVisible(false);
		this.jInternalFrameDetalleFormNumeroRecap.setSelected(false);						
		
		this.jInternalFrameDetalleFormNumeroRecap.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNumeroRecap.numerorecapLogic=this.numerorecapLogic;
		
		this.cargarCombosFrameForeignKeyNumeroRecap("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNumeroRecap();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNumeroRecap();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNumeroRecap("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNumeroRecap();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNumeroRecap.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNumeroRecap"));
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarNumeroRecap.addActionListener(new ButtonActionListener(this,"ModificarNumeroRecap"));

		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarToolBarNumeroRecap.addActionListener(new ButtonActionListener(this,"ModificarToolBarNumeroRecap"));
					
		this.jInternalFrameDetalleFormNumeroRecap.jMenuItemModificarNumeroRecap.addActionListener(new ButtonActionListener(this,"MenuItemModificarNumeroRecap"));		
		
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarNumeroRecap.addActionListener (new ButtonActionListener(this,"ActualizarNumeroRecap"));
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarToolBarNumeroRecap.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNumeroRecap"));
						
		this.jInternalFrameDetalleFormNumeroRecap.jMenuItemActualizarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNumeroRecap"));		
		
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarNumeroRecap.addActionListener (new ButtonActionListener(this,"EliminarNumeroRecap"));
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"EliminarToolBarNumeroRecap"));
								
		this.jInternalFrameDetalleFormNumeroRecap.jMenuItemEliminarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNumeroRecap"));		
		
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarNumeroRecap.addActionListener (new ButtonActionListener(this,"CancelarNumeroRecap"));
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"CancelarToolBarNumeroRecap"));
					
		this.jInternalFrameDetalleFormNumeroRecap.jMenuItemCancelarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNumeroRecap"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jMenuItemDetalleCerrarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNumeroRecap"));		
		
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNumeroRecap"));
		
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNumeroRecap"));
		
		
		
		this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNumeroRecap"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonidNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"idNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_empresaNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_empresaNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_sucursalNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_sucursalNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_conexionNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_conexionNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_conexionNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_conexionNumeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonnumero_recapNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_recapNumeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonfechaNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"fechaNumeroRecapBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNumeroRecap"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNumeroRecap"));
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNumeroRecap"));
		}
		
		this.jTableDatosNumeroRecap.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNumeroRecap"));
		
		this.jTableDatosNumeroRecap.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNumeroRecap"));
		
		this.jButtonNuevoNumeroRecap.addActionListener(new ButtonActionListener(this,"NuevoNumeroRecap"));
		
		this.jButtonDuplicarNumeroRecap.addActionListener(new ButtonActionListener(this,"DuplicarNumeroRecap"));
		
		this.jButtonCopiarNumeroRecap.addActionListener(new ButtonActionListener(this,"CopiarNumeroRecap"));
		
		this.jButtonVerFormNumeroRecap.addActionListener(new ButtonActionListener(this,"VerFormNumeroRecap"));
		
		
		this.jButtonNuevoToolBarNumeroRecap.addActionListener(new ButtonActionListener(this,"NuevoToolBarNumeroRecap"));
			
		this.jButtonDuplicarToolBarNumeroRecap.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNumeroRecap"));
			
		this.jMenuItemNuevoNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNumeroRecap"));
			
		this.jMenuItemDuplicarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNumeroRecap"));		
		
		
		this.jButtonNuevoRelacionesNumeroRecap.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNumeroRecap"));
		
		
		this.jButtonNuevoRelacionesToolBarNumeroRecap.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNumeroRecap"));
			
		this.jMenuItemNuevoRelacionesNumeroRecap.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNumeroRecap"));		
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarNumeroRecap.addActionListener(new ButtonActionListener(this,"ModificarNumeroRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonModificarToolBarNumeroRecap.addActionListener(new ButtonActionListener(this,"ModificarToolBarNumeroRecap"));
			
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemModificarNumeroRecap.addActionListener(new ButtonActionListener(this,"MenuItemModificarNumeroRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarNumeroRecap.addActionListener (new ButtonActionListener(this,"ActualizarNumeroRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonActualizarToolBarNumeroRecap.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNumeroRecap"));
				
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemActualizarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNumeroRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarNumeroRecap.addActionListener (new ButtonActionListener(this,"EliminarNumeroRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonEliminarToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"EliminarToolBarNumeroRecap"));
						
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemEliminarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNumeroRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarNumeroRecap.addActionListener (new ButtonActionListener(this,"CancelarNumeroRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonCancelarToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"CancelarToolBarNumeroRecap"));
			
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemCancelarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNumeroRecap"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNumeroRecap"));		
		
		
		this.jButtonCerrarNumeroRecap.addActionListener (new ButtonActionListener(this,"CerrarNumeroRecap"));
		
		
		this.jButtonCerrarToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"CerrarToolBarNumeroRecap"));
			
		this.jMenuItemCerrarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNumeroRecap"));
			
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jMenuItemDetalleCerrarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNumeroRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosNumeroRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosNumeroRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNumeroRecap"));
		}
		
		this.jButtonCopiarToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"CopiarToolBarNumeroRecap"));
			
		this.jButtonVerFormToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"VerFormToolBarNumeroRecap"));
		
		this.jMenuItemGuardarCambiosNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNumeroRecap"));
			
		this.jMenuItemCopiarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNumeroRecap"));		
		
		this.jMenuItemVerFormNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNumeroRecap"));		
		
		
		this.jButtonGuardarCambiosTablaNumeroRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNumeroRecap"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNumeroRecap"));
			
		this.jMenuItemGuardarCambiosTablaNumeroRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNumeroRecap"));		
		
		
		
		this.jButtonRecargarInformacionNumeroRecap.addActionListener (new ButtonActionListener(this,"RecargarInformacionNumeroRecap"));
					
		this.jButtonRecargarInformacionToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNumeroRecap"));
		
		this.jMenuItemRecargarInformacionNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNumeroRecap"));		
		
		
		
		this.jButtonAnterioresNumeroRecap.addActionListener (new ButtonActionListener(this,"AnterioresNumeroRecap"));
		
		
		this.jButtonAnterioresToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNumeroRecap"));
		
		this.jMenuItemAnterioresNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNumeroRecap"));		
		
		
		this.jButtonSiguientesNumeroRecap.addActionListener (new ButtonActionListener(this,"SiguientesNumeroRecap"));
		
		
		this.jButtonSiguientesToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNumeroRecap"));
			
		this.jMenuItemSiguientesNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNumeroRecap"));
			
		this.jMenuItemAbrirOrderByNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNumeroRecap"));
			
		this.jMenuItemMostrarOcultarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNumeroRecap"));
			
		this.jMenuItemDetalleAbrirOrderByNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNumeroRecap"));
			
		this.jMenuItemDetalleMostarOcultarNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNumeroRecap"));		
		
		
		this.jButtonNuevoGuardarCambiosNumeroRecap.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNumeroRecap"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNumeroRecap"));
			
		this.jMenuItemNuevoGuardarCambiosNumeroRecap.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNumeroRecap"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNumeroRecap.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNumeroRecap"));

		this.jCheckBoxSeleccionadosNumeroRecap.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNumeroRecap"));
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNumeroRecap"));
		}
		
		
		this.jComboBoxTiposRelacionesNumeroRecap.addActionListener (new ButtonActionListener(this,"TiposRelacionesNumeroRecap"));
			
		this.jComboBoxTiposAccionesNumeroRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesNumeroRecap"));
					
		this.jComboBoxTiposSeleccionarNumeroRecap.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNumeroRecap"));
			
		this.jTextFieldValorCampoGeneralNumeroRecap.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNumeroRecap"));		
		
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonidNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"idNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_empresaNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_empresaNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_sucursalNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_sucursalNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_conexionNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_conexionNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_conexionNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_conexionNumeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonnumero_recapNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_recapNumeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonfechaNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"fechaNumeroRecapBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdConexionNumeroRecap.addActionListener(new ButtonActionListener(this,"FK_IdConexionNumeroRecap"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNumeroRecap!=null) {
				this.jInternalFrameReporteDinamicoNumeroRecap.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNumeroRecap"));
				this.jInternalFrameReporteDinamicoNumeroRecap.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNumeroRecap"));
				this.jInternalFrameReporteDinamicoNumeroRecap.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNumeroRecap"));
			}
			
			//this.jButtonCerrarReporteDinamicoNumeroRecap.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNumeroRecap"));				
			//this.jButtonGenerarReporteDinamicoNumeroRecap.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNumeroRecap"));
			//this.jButtonGenerarExcelReporteDinamicoNumeroRecap.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNumeroRecap"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNumeroRecap!=null) {
				this.jInternalFrameImportacionNumeroRecap.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNumeroRecap"));
				this.jInternalFrameImportacionNumeroRecap.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNumeroRecap"));
				this.jInternalFrameImportacionNumeroRecap.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNumeroRecap"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNumeroRecap.addActionListener (new ButtonActionListener(this,"AbrirOrderByNumeroRecap"));
			
			this.jButtonAbrirOrderByToolBarNumeroRecap.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNumeroRecap"));			
			
			if(this.jInternalFrameOrderByNumeroRecap!=null) {
				this.jInternalFrameOrderByNumeroRecap.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNumeroRecap"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroRecap.jTabbedPaneRelacionesNumeroRecap.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNumeroRecap"));
		
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
            		closingInternalFrameNumeroRecap();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNumeroRecap.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNumeroRecap = (JInternalFrameBase)event.getSource();
	            	
	            NumeroRecapBeanSwingJInternalFrame jInternalFrameParent=(NumeroRecapBeanSwingJInternalFrame)jInternalFrameDetalleFormNumeroRecap.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNumeroRecapActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNumeroRecap.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNumeroRecapListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNumeroRecap.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNumeroRecap.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNumeroRecap";
		inputMap = this.jButtonNuevoNumeroRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNumeroRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNumeroRecapActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNumeroRecap";
		inputMap = this.jButtonNuevoRelacionesNumeroRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNumeroRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNumeroRecapActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNumeroRecap";
		inputMap = this.jButtonModificarNumeroRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNumeroRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNumeroRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNumeroRecap";
		inputMap = this.jButtonActualizarNumeroRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNumeroRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNumeroRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNumeroRecap";
		inputMap = this.jButtonEliminarNumeroRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNumeroRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNumeroRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNumeroRecap";
		inputMap = this.jButtonCancelarNumeroRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNumeroRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNumeroRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNumeroRecap";
		inputMap = this.jButtonCerrarNumeroRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNumeroRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNumeroRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNumeroRecap";
		inputMap = this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosNumeroRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNumeroRecap.jButtonGuardarCambiosNumeroRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNumeroRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNumeroRecap.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNumeroRecapItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNumeroRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNumeroRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNumeroRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNumeroRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNumeroRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNumeroRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonidNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"idNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_empresaNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_empresaNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_sucursalNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_sucursalNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNumeroRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_conexionNumeroRecapUpdate.addActionListener(new ButtonActionListener(this,"id_conexionNumeroRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonid_conexionNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_conexionNumeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonnumero_recapNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_recapNumeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroRecap.jButtonfechaNumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"fechaNumeroRecapBusqueda"));
		
		
		this.jButtonFK_IdConexionNumeroRecap.addActionListener(new ButtonActionListener(this,"FK_IdConexionNumeroRecap"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNumeroRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNumeroRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNumeroRecapActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNumeroRecap.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNumeroRecap(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
					numerorecapAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NumeroRecap numerorecapAux:numerorecaps) {
					numerorecapAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNumeroRecapItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNumeroRecap(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
						numerorecapAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NumeroRecap numerorecapAux:numerorecaps) {
						numerorecapAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NumeroRecap numerorecapAux:numerorecaps) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNumeroRecap(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNumeroRecap.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNumeroRecap.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNumeroRecapItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNumeroRecap(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNumeroRecap.getSelectedRows();
			
			NumeroRecap numerorecapLocal=new NumeroRecap();
			
			//this.seleccionarTodosNumeroRecap(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numerorecapLocal =(NumeroRecap) this.numerorecapLogic.getNumeroRecaps().toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					numerorecapLocal =(NumeroRecap) this.numerorecaps.toArray()[this.jTableDatosNumeroRecap.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				numerorecapLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
						numerorecapAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NumeroRecap numerorecapAux:numerorecaps) {
						numerorecapAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNumeroRecap(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNumeroRecap.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNumeroRecap.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNumeroRecap,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNumeroRecapItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNumeroRecapParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNumeroRecapActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNumeroRecap(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNumeroRecap.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NumeroRecap numerorecapAux:this.numerorecapLogic.getNumeroRecaps()) {
				
						if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_NUMERORECAP)) {
							existe=true;
							numerorecapAux.setnumero_recap(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							numerorecapAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NumeroRecap numerorecapAux:numerorecaps) {
					
						if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_NUMERORECAP)) {
							existe=true;
							numerorecapAux.setnumero_recap(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							numerorecapAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNumeroRecap(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNumeroRecapActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNumeroRecap(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNumeroRecap=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNumeroRecap.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNumeroRecap) {				
					conSplash=true;//false;										
					
					//this.startProcessNumeroRecap(conSplash);
				
					this.generarReporteNumeroRecapsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNumeroRecapsSeleccionados();
				//this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNumeroRecapsSeleccionados(false);
				//this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNumeroRecapsSeleccionados(true);
				//this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNumeroRecap();
				
				this.exportarNumeroRecapsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNumeroRecaps();
				//this.importarNumeroRecaps();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNumeroRecap();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNumeroRecapsSeleccionados();
				//this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Numero Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNumeroRecap();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNumeroRecap)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNumeroRecap(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.setSelectedIndex(0);					
				}	
			} 			
			else if(NumeroRecapBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNumeroRecap) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNumeroRecap(conSplash);
					
						//this.actualizarParametrosGeneralNumeroRecap();
						
						this.generarReporteProcesoAccionNumeroRecapsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NumeroRecapBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Numero RecapES SELECCIONADOS?", "MANTENIMIENTO DE Numero Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNumeroRecap();
				
						this.actualizarParametrosGeneralNumeroRecap();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.numerorecapReturnGeneral=numerorecapLogic.procesarAccionNumeroRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.numerorecapLogic.getNumeroRecaps(),this.numerorecapParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNumeroRecapReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNumeroRecap();
					
					NumeroRecapBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNumeroRecapReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNumeroRecap.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNumeroRecap.jComboBoxTiposAccionesFormularioNumeroRecap.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNumeroRecap(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNumeroRecapActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNumeroRecap();
			
			if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		
			NumeroRecap numerorecap=new NumeroRecap();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNumeroRecap(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNumeroRecap.getSelectedItem();
			
			
			
			
			numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
			//this.sTipoAccion;
			
			if(numerorecapsSeleccionados.size()==1) {
				for(NumeroRecap numerorecapAux:numerorecapsSeleccionados) {
					numerorecap=numerorecapAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNumeroRecap();
			
      		//this.finishProcessNumeroRecap(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNumeroRecapReturnGeneral() throws Exception {
		if(this.numerorecapReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.numerorecapReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.numerorecapReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.numerorecapReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.numerorecapReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.numerorecapReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNumeroRecap(false);
		}
		
		if(this.numerorecapReturnGeneral.getConRetornoLista() || this.numerorecapReturnGeneral.getConRetornoObjeto()) {
			if(this.numerorecapReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.numerorecapLogic.setNumeroRecaps(this.numerorecapReturnGeneral.getNumeroRecaps());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.numerorecapReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.numerorecapLogic.setNumeroRecap(this.numerorecapReturnGeneral.getNumeroRecap());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNumeroRecap(false);
		}
	}
	
	public void actualizarParametrosGeneralNumeroRecap() throws Exception {
		
		
	}
	
	public ArrayList<NumeroRecap> getNumeroRecapsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNumeroRecap) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NumeroRecap numerorecapAux:numerorecapLogic.getNumeroRecaps()) {
					if(numerorecapAux.getIsSelected()) {
						numerorecapsSeleccionados.add(numerorecapAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NumeroRecap numerorecapAux:this.numerorecaps) {
					if(numerorecapAux.getIsSelected()) {
						numerorecapsSeleccionados.add(numerorecapAux);				
					}
				}
			}
			
			if(numerorecapsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						numerorecapsSeleccionados.addAll(this.numerorecapLogic.getNumeroRecaps());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						numerorecapsSeleccionados.addAll(this.numerorecaps);				
					}
				}
			}
		} else {
			numerorecapsSeleccionados.add(this.numerorecap);
		}
		
		return numerorecapsSeleccionados;
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
	
	public void generarReporteNumeroRecapsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNumeroRecapsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNumeroRecapsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNumeroRecapsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNumeroRecapsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Numero Recap",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNumeroRecapsSeleccionados() throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNumeroRecaps("Todos",numerorecapsSeleccionados);
		
	}	
	
	public void generarReporteNormalNumeroRecapsSeleccionados() throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNumeroRecaps("Todos",numerorecapsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNumeroRecapsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNumeroRecaps("Todos",numerorecapsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNumeroRecapsSeleccionados() throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNumeroRecap();
		
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNumeroRecap();
		
		
		//this.generarReporteNumeroRecaps("Todos",numerorecapsSeleccionados ,numerorecapImplementable,numerorecapImplementableHome);
	}
	
	public void mostrarImportacionNumeroRecaps() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNumeroRecap();
		
		this.abrirFrameImportacionNumeroRecap();		
		
			
		//this.generarReporteNumeroRecaps("Todos",numerorecapsSeleccionados ,numerorecapImplementable,numerorecapImplementableHome);
	}
	
	public void importarNumeroRecaps() throws Exception {		
	
	}
	
	public void exportarNumeroRecapsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNumeroRecapsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNumeroRecapsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNumeroRecapsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Numero Recap",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNumeroRecapsSeleccionados() throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numerorecap."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNumeroRecap(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NumeroRecap numerorecapAux:numerorecapsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNumeroRecap(numerorecapAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//numerorecapAux.setsDetalleGeneralEntityReporte(numerorecapAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNumeroRecap(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NumeroRecapConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroRecapConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroRecapConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroRecapConstantesFunciones.LABEL_IDCONEXION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroRecapConstantesFunciones.LABEL_NUMERORECAP;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroRecapConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNumeroRecap(NumeroRecap numerorecap,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=numerorecap.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=numerorecap.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=numerorecap.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numerorecap.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numerorecap.getconexion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numerorecap.getnumero_recap();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numerorecap.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNumeroRecapsSeleccionados() throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numerorecap.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NumeroRecaps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNumeroRecap(row);				
				iRow++;
			}				
			
			for(NumeroRecap numerorecapAux:numerorecapsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNumeroRecap(numerorecapAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNumeroRecapsSeleccionados() throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();		
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numerorecap.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("numerorecaps");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("numerorecap");
			//elementRoot.appendChild(element);
		
			for(NumeroRecap numerorecapAux:numerorecapsSeleccionados) {
				element = document.createElement("numerorecap");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNumeroRecap(numerorecapAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNumeroRecap(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_IDCONEXION);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_NUMERORECAP);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroRecapConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNumeroRecap(NumeroRecap numerorecap,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(numerorecap.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(numerorecap.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(numerorecap.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(numerorecap.getconexion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(numerorecap.getnumero_recap());
		cell = row.createCell(iColumn++);cell.setCellValue(numerorecap.getfecha());				
	}
	
	public void setFilaDatosExportarXmlNumeroRecap(NumeroRecap numerorecap,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NumeroRecapConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(numerorecap.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NumeroRecapConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(numerorecap.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NumeroRecapConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(numerorecap.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(NumeroRecapConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(numerorecap.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementconexion_descripcion = document.createElement(NumeroRecapConstantesFunciones.IDCONEXION);
		elementconexion_descripcion.appendChild(document.createTextNode(numerorecap.getconexion_descripcion()));
		element.appendChild(elementconexion_descripcion);

		Element elementnumero_recap = document.createElement(NumeroRecapConstantesFunciones.NUMERORECAP);
		elementnumero_recap.appendChild(document.createTextNode(numerorecap.getnumero_recap().trim()));
		element.appendChild(elementnumero_recap);

		Element elementfecha = document.createElement(NumeroRecapConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(numerorecap.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoNumeroRecapsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NumeroRecap> numerorecapsSeleccionados=new ArrayList<NumeroRecap>();
		
		numerorecapsSeleccionados=this.getNumeroRecapsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNumeroRecap(numerorecapsSeleccionados);
		
		this.generarReporteNumeroRecaps("Todos",numerorecapsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNumeroRecap(ArrayList<NumeroRecap> numerorecapsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NumeroRecap numerorecapAux:numerorecapsSeleccionados) {
				numerorecapAux.setsDetalleGeneralEntityReporte(numerorecapAux.toString());
			
				if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					numerorecapAux.setsDescripcionGeneralEntityReporte1(numerorecapAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					numerorecapAux.setsDescripcionGeneralEntityReporte1(numerorecapAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_IDCONEXION)) {
					existe=true;
					numerorecapAux.setsDescripcionGeneralEntityReporte1(numerorecapAux.getconexion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_NUMERORECAP)) {
					existe=true;
					numerorecapAux.setsDescripcionGeneralEntityReporte1(numerorecapAux.getnumero_recap());
				}
				 else if(sTipoSeleccionar.equals(NumeroRecapConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					numerorecapAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(numerorecapAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNumeroRecap(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNumeroRecap=true;
				this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=true;
				this.isVisibilidadCeldaGuardarCambiosNumeroRecap=true;
			}
			
			this.isVisibilidadCeldaModificarNumeroRecap=false;
			this.isVisibilidadCeldaActualizarNumeroRecap=false;
			this.isVisibilidadCeldaEliminarNumeroRecap=false;
			this.isVisibilidadCeldaCancelarNumeroRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNumeroRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=false;
			this.isVisibilidadCeldaModificarNumeroRecap=false;
			this.isVisibilidadCeldaActualizarNumeroRecap=true;
			this.isVisibilidadCeldaEliminarNumeroRecap=false;
			this.isVisibilidadCeldaCancelarNumeroRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNumeroRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=false;
			this.isVisibilidadCeldaModificarNumeroRecap=false;
			this.isVisibilidadCeldaActualizarNumeroRecap=true;
			this.isVisibilidadCeldaEliminarNumeroRecap=true;
			this.isVisibilidadCeldaCancelarNumeroRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNumeroRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=false;
			this.isVisibilidadCeldaModificarNumeroRecap=false;
			this.isVisibilidadCeldaActualizarNumeroRecap=true;
			this.isVisibilidadCeldaEliminarNumeroRecap=false;
			this.isVisibilidadCeldaCancelarNumeroRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNumeroRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=true;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=true;
			this.isVisibilidadCeldaModificarNumeroRecap=false;
			this.isVisibilidadCeldaActualizarNumeroRecap=false;
			this.isVisibilidadCeldaEliminarNumeroRecap=false;
			this.isVisibilidadCeldaCancelarNumeroRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNumeroRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=false;
			this.isVisibilidadCeldaActualizarNumeroRecap=false;
			this.isVisibilidadCeldaEliminarNumeroRecap=false;
			this.isVisibilidadCeldaCancelarNumeroRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNumeroRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=false;
			this.isVisibilidadCeldaModificarNumeroRecap=true;
			this.isVisibilidadCeldaActualizarNumeroRecap=false;
			this.isVisibilidadCeldaEliminarNumeroRecap=false;
			this.isVisibilidadCeldaCancelarNumeroRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarNumeroRecap=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NumeroRecapJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNumeroRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=true;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=true;
		} else {
			this.actualizarEstadoPanelsNumeroRecap(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNumeroRecap=false;
			//this.isVisibilidadCeldaVerFormNumeroRecap=false;
			this.isVisibilidadCeldaDuplicarNumeroRecap=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!numerorecapSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
		} else {
			this.isVisibilidadCeldaNuevoNumeroRecap=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroRecap=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(numerorecapSessionBean.getEsGuardarRelacionado()) {
			if(!numerorecapSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;												
			}
			
			this.jButtonCerrarNumeroRecap.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNumeroRecap=false;
		}
		
		if(!this.permiteMantenimiento(this.numerorecap)) {
			this.isVisibilidadCeldaActualizarNumeroRecap=false;
			this.isVisibilidadCeldaEliminarNumeroRecap=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNumeroRecap() {
	}
	
	public void actualizarEstadoPanelsNumeroRecap(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNumeroRecap!=null) {
				this.jScrollPanelDatosEdicionNumeroRecap.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNumeroRecap!=null) {
				this.jScrollPanelDatosNumeroRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionNumeroRecap!=null) {
				this.jPanelPaginacionNumeroRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNumeroRecap!=null) {
				this.jScrollPanelDatosEdicionNumeroRecap.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNumeroRecap!=null) {
				this.jScrollPanelDatosNumeroRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionNumeroRecap!=null) {
				this.jPanelPaginacionNumeroRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNumeroRecap!=null) {
				this.jScrollPanelDatosEdicionNumeroRecap.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNumeroRecap!=null) {
				this.jScrollPanelDatosNumeroRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionNumeroRecap!=null) {
				this.jPanelPaginacionNumeroRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNumeroRecap!=null) {
				this.jScrollPanelDatosEdicionNumeroRecap.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNumeroRecap!=null) {
				this.jScrollPanelDatosNumeroRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionNumeroRecap!=null) {
				this.jPanelPaginacionNumeroRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNumeroRecap!=null) {
				this.jScrollPanelDatosEdicionNumeroRecap.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNumeroRecap!=null) {
				this.jScrollPanelDatosNumeroRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionNumeroRecap!=null) {
				this.jPanelPaginacionNumeroRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNumeroRecap!=null) {
				this.jScrollPanelDatosEdicionNumeroRecap.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNumeroRecap!=null) {
				this.jScrollPanelDatosNumeroRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionNumeroRecap!=null) {
				this.jPanelPaginacionNumeroRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNumeroRecap!=null) {
				this.jScrollPanelDatosEdicionNumeroRecap.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNumeroRecap!=null) {
				this.jScrollPanelDatosNumeroRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionNumeroRecap!=null) {
				this.jPanelPaginacionNumeroRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
					this.jTabbedPaneBusquedasNumeroRecap.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroRecap!=null) {
				this.jTabbedPaneBusquedasNumeroRecap.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNumeroRecap!=null) {
				this.jPanelParametrosReportesNumeroRecap.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdConexion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdConexion) {this.jTabbedPaneBusquedasNumeroRecap.remove(jPanelFK_IdConexionNumeroRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdConexion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdConexion) {this.jTabbedPaneBusquedasNumeroRecap.remove(jPanelFK_IdConexionNumeroRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaConexion(Boolean isParaConexion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaConexionNegation=!isParaConexion;

			this.isVisibilidadFK_IdConexion=isParaConexion;
			if(!this.isVisibilidadFK_IdConexion) {this.jTabbedPaneBusquedasNumeroRecap.remove(jPanelFK_IdConexionNumeroRecap);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NumeroRecapSessionBean numerorecapSessionBean=new NumeroRecapSessionBean();
		
		if(this.numerorecapSessionBean==null) {
			this.numerorecapSessionBean=new NumeroRecapSessionBean();
		}
		
		this.numerorecapSessionBean.setsUltimaBusquedaNumeroRecap(this.getsAccionBusqueda());
		this.numerorecapSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.numerorecapSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdConexion")) {
			numerorecapSessionBean.setid_conexion(this.getid_conexionFK_IdConexion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			numerorecapSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			numerorecapSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NumeroRecapSessionBean numerorecapSessionBean=new NumeroRecapSessionBean();
		
		if(this.numerorecapSessionBean==null) {
			this.numerorecapSessionBean=new NumeroRecapSessionBean();
		}
		
		if(this.numerorecapSessionBean.getsUltimaBusquedaNumeroRecap()!=null&&!this.numerorecapSessionBean.getsUltimaBusquedaNumeroRecap().equals("")) {
			this.setsAccionBusqueda(numerorecapSessionBean.getsUltimaBusquedaNumeroRecap());
			this.setiNumeroPaginacion(numerorecapSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(numerorecapSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdConexion")) {
				this.setid_conexionFK_IdConexion(numerorecapSessionBean.getid_conexion());
				numerorecapSessionBean.setid_conexion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(numerorecapSessionBean.getid_empresa());
				numerorecapSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(numerorecapSessionBean.getid_sucursal());
				numerorecapSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.numerorecapSessionBean.setsUltimaBusquedaNumeroRecap("");
		this.numerorecapSessionBean.setiNumeroPaginacion(NumeroRecapConstantesFunciones.INUMEROPAGINACION);
		this.numerorecapSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNumeroRecap(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNumeroRecap() {
		this.updateBorderResaltarBusquedasFormularioNumeroRecap();
		this.updateVisibilidadBusquedasFormularioNumeroRecap();
		this.updateHabilitarBusquedasFormularioNumeroRecap();
	}
	
	public void updateBorderResaltarBusquedasFormularioNumeroRecap() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNumeroRecap.getComponents().length>0) {
	

		if(this.numerorecapConstantesFunciones.resaltarFK_IdConexionNumeroRecap!=null) {
			index= this.jTabbedPaneBusquedasNumeroRecap.indexOfComponent(this.jPanelFK_IdConexionNumeroRecap);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroRecap.getComponent(index);
				jPanel.setBorder(this.numerorecapConstantesFunciones.resaltarFK_IdConexionNumeroRecap);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNumeroRecap() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNumeroRecap.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNumeroRecap.indexOfComponent(this.jPanelFK_IdConexionNumeroRecap);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroRecap.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.numerorecapConstantesFunciones.mostrarFK_IdConexionNumeroRecap);
			if(!this.numerorecapConstantesFunciones.mostrarFK_IdConexionNumeroRecap && index>-1) {
				this.jTabbedPaneBusquedasNumeroRecap.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNumeroRecap() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNumeroRecap.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNumeroRecap.indexOfComponent(this.jPanelFK_IdConexionNumeroRecap);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroRecap.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.numerorecapConstantesFunciones.activarFK_IdConexionNumeroRecap);
				this.jTabbedPaneBusquedasNumeroRecap.setEnabledAt(index,this.numerorecapConstantesFunciones.activarFK_IdConexionNumeroRecap);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNumeroRecap(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdConexion")) {
			index= this.jTabbedPaneBusquedasNumeroRecap.indexOfComponent(this.jPanelFK_IdConexionNumeroRecap);

			this.jTabbedPaneBusquedasNumeroRecap.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroRecap.getComponent(index);

			this.numerorecapConstantesFunciones.setResaltarFK_IdConexionNumeroRecap(resaltar);

			jPanel.setBorder(this.numerorecapConstantesFunciones.resaltarFK_IdConexionNumeroRecap);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarNumeroRecap.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNumeroRecap() throws Exception {

		if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNumeroRecap();
		this.updateVisibilidadResaltarControlesFormularioNumeroRecap();
		this.updateHabilitarResaltarControlesFormularioNumeroRecap();
		
	}
	
	public void updateBorderResaltarControlesFormularioNumeroRecap() throws Exception {
		if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.numerorecapConstantesFunciones.resaltaridNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap!=null) {this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.setBorder(this.numerorecapConstantesFunciones.resaltaridNumeroRecap);}
		if(this.numerorecapConstantesFunciones.resaltarid_empresaNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap!=null) {this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setBorder(this.numerorecapConstantesFunciones.resaltarid_empresaNumeroRecap);}
		if(this.numerorecapConstantesFunciones.resaltarid_sucursalNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap!=null) {this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setBorder(this.numerorecapConstantesFunciones.resaltarid_sucursalNumeroRecap);}
		if(this.numerorecapConstantesFunciones.resaltarid_conexionNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap!=null) {this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setBorder(this.numerorecapConstantesFunciones.resaltarid_conexionNumeroRecap);}
		if(this.numerorecapConstantesFunciones.resaltarnumero_recapNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap!=null) {this.jInternalFrameDetalleFormNumeroRecap.jTextFieldnumero_recapNumeroRecap.setBorder(this.numerorecapConstantesFunciones.resaltarnumero_recapNumeroRecap);}
		if(this.numerorecapConstantesFunciones.resaltarfechaNumeroRecap!=null && this.jInternalFrameDetalleFormNumeroRecap!=null) {this.jInternalFrameDetalleFormNumeroRecap.jDateChooserfechaNumeroRecap.setBorder(this.numerorecapConstantesFunciones.resaltarfechaNumeroRecap);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNumeroRecap() throws Exception {		
		if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
	
		//this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostraridNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jPanelidNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostraridNumeroRecap);
		//this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarid_empresaNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jPanelid_empresaNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarid_empresaNumeroRecap);
		//this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarid_sucursalNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jPanelid_sucursalNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarid_sucursalNumeroRecap);
		//this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarid_conexionNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jPanelid_conexionNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarid_conexionNumeroRecap);
		//this.jInternalFrameDetalleFormNumeroRecap.jTextFieldnumero_recapNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarnumero_recapNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jPanelnumero_recapNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarnumero_recapNumeroRecap);
		//this.jInternalFrameDetalleFormNumeroRecap.jDateChooserfechaNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarfechaNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jPanelfechaNumeroRecap.setVisible(this.numerorecapConstantesFunciones.mostrarfechaNumeroRecap);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNumeroRecap() throws Exception {
		if(this.jInternalFrameDetalleFormNumeroRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNumeroRecap!=null) {
	
		this.jInternalFrameDetalleFormNumeroRecap.jLabelidNumeroRecap.setEnabled(this.numerorecapConstantesFunciones.activaridNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_empresaNumeroRecap.setEnabled(this.numerorecapConstantesFunciones.activarid_empresaNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_sucursalNumeroRecap.setEnabled(this.numerorecapConstantesFunciones.activarid_sucursalNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jComboBoxid_conexionNumeroRecap.setEnabled(this.numerorecapConstantesFunciones.activarid_conexionNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jTextFieldnumero_recapNumeroRecap.setEnabled(this.numerorecapConstantesFunciones.activarnumero_recapNumeroRecap);
		this.jInternalFrameDetalleFormNumeroRecap.jDateChooserfechaNumeroRecap.setEnabled(this.numerorecapConstantesFunciones.activarfechaNumeroRecap);
		}
	}
	
		
}