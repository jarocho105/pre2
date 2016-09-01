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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.CajerosConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.CajerosParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.CajerosParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.CajerosBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CajerosBeanSwingJInternalFrame extends CajerosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajerosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Cajeros> cajerosValidator = new ClassValidator<Cajeros>(Cajeros.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Cajeros cajeros;	
	public Cajeros cajerosAux;
	public Cajeros cajerosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Cajeros cajerosTotales;
	public Long idCajerosActual;
	public Long iIdNuevoCajeros=0L;
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
	
	public Boolean isPermisoTodoCajeros;
	public Boolean isPermisoNuevoCajeros;
	public Boolean isPermisoActualizarCajeros;
	public Boolean isPermisoActualizarOriginalCajeros;
	public Boolean isPermisoEliminarCajeros;
	public Boolean isPermisoGuardarCambiosCajeros;
	public Boolean isPermisoConsultaCajeros;
	public Boolean isPermisoBusquedaCajeros;
	public Boolean isPermisoReporteCajeros;
	public Boolean isPermisoPaginacionMedioCajeros;
	public Boolean isPermisoPaginacionAltoCajeros;
	public Boolean isPermisoPaginacionTodoCajeros;
	public Boolean isPermisoCopiarCajeros;
	public Boolean isPermisoVerFormCajeros;
	public Boolean isPermisoDuplicarCajeros;
	public Boolean isPermisoOrdenCajeros;
	
	
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
	
	public CajerosParameterReturnGeneral cajerosReturnGeneral;
	public CajerosParameterReturnGeneral cajerosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajeros=false;
	public Boolean esParaAccionDesdeFormularioCajeros=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajerosSessionBeanAdditional cajerosSessionBeanAdditional=null;
	
	public CajerosSessionBeanAdditional getCajerosSessionBeanAdditional() {
		return this.cajerosSessionBeanAdditional;
	}
	
	public void setCajerosSessionBeanAdditional(CajerosSessionBeanAdditional cajerosSessionBeanAdditional) {
		try {
			this.cajerosSessionBeanAdditional=cajerosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajerosBeanSwingJInternalFrameAdditional cajerosBeanSwingJInternalFrameAdditional=null;
	//public class CajerosBeanSwingJInternalFrame
	
	public CajerosBeanSwingJInternalFrameAdditional getCajerosBeanSwingJInternalFrameAdditional() {
		return this.cajerosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajerosBeanSwingJInternalFrameAdditional(CajerosBeanSwingJInternalFrameAdditional cajerosBeanSwingJInternalFrameAdditional) {
		try {
			this.cajerosBeanSwingJInternalFrameAdditional=cajerosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajerosLogic cajerosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Cajeros cajerosBean;
	public CajerosConstantesFunciones cajerosConstantesFunciones;
	//public CajerosParameterReturnGeneral cajerosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public CajaLogic cajaLogic;
	
	//PARAMETROS
	
	
	//public List<Cajeros> cajeross;	
	//public List<Cajeros> cajerossEliminados;
	//public List<Cajeros> cajerossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajeros=false;
	public Boolean isVisibilidadCeldaDuplicarCajeros=true;
	public Boolean isVisibilidadCeldaCopiarCajeros=true;
	public Boolean isVisibilidadCeldaVerFormCajeros=true;
	public Boolean isVisibilidadCeldaOrdenCajeros=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajeros=false;
	public Boolean isVisibilidadCeldaModificarCajeros=false;
	public Boolean isVisibilidadCeldaActualizarCajeros=false;
	public Boolean isVisibilidadCeldaEliminarCajeros=false;
	public Boolean isVisibilidadCeldaCancelarCajeros=false;
	public Boolean isVisibilidadCeldaGuardarCajeros=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajeros=false;	
	
	
	public Boolean isVisibilidadBusquedaCajeros=false;
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCajeros() {
		return this.iIdNuevoCajeros;
	}

	public void setiIdNuevoCajeros(Long iIdNuevoCajeros) {
		this.iIdNuevoCajeros = iIdNuevoCajeros;
	}
	
	public Long getidCajerosActual() {
		return this.idCajerosActual;
	}

	public void setidCajerosActual(Long idCajerosActual) {
		this.idCajerosActual = idCajerosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Cajeros getcajeros() {
		return this.cajeros;
	}

	public void setcajeros(Cajeros cajeros) {
		this.cajeros = cajeros;
	}
	
	public Cajeros getcajerosAux() {
		return this.cajerosAux;
	}

	public void setcajerosAux(Cajeros cajerosAux) {
		this.cajerosAux = cajerosAux;
	}				
	
	public Cajeros getcajerosAnterior() {
		return this.cajerosAnterior;
	}

	public void setcajerosAnterior(Cajeros cajerosAnterior) {
		this.cajerosAnterior = cajerosAnterior;
	}	
	
	public Cajeros getcajerosTotales() {
		return this.cajerosTotales;
	}

	public void setcajerosTotales(Cajeros cajerosTotales) {
		this.cajerosTotales = cajerosTotales;
	}	
	
	public Cajeros getcajerosBean() {
		return this.cajerosBean;
	}

	public void setcajerosBean(Cajeros cajerosBean) {
		this.cajerosBean = cajerosBean;
	}	
	
	public CajerosParameterReturnGeneral getcajerosReturnGeneral() {
		return this.cajerosReturnGeneral;
	}

	public void setcajerosReturnGeneral(CajerosParameterReturnGeneral cajerosReturnGeneral) {
		this.cajerosReturnGeneral = cajerosReturnGeneral;
	}	
	
	
	public Date fecha_inicioBusquedaCajeros=new Date();

	public Date getfecha_inicioBusquedaCajeros() {
		return this.fecha_inicioBusquedaCajeros;
	}

	public void setfecha_inicioBusquedaCajeros(Date fecha_inicioBusquedaCajeros) {
		this.fecha_inicioBusquedaCajeros = fecha_inicioBusquedaCajeros;
	}

;
	public Date fecha_finBusquedaCajeros=new Date();

	public Date getfecha_finBusquedaCajeros() {
		return this.fecha_finBusquedaCajeros;
	}

	public void setfecha_finBusquedaCajeros(Date fecha_finBusquedaCajeros) {
		this.fecha_finBusquedaCajeros = fecha_finBusquedaCajeros;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CajerosLogic getCajerosLogic()	{		
		return cajerosLogic;
	}

	public void setCajerosLogic(CajerosLogic cajerosLogic) {
		this.cajerosLogic = cajerosLogic;
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
	
	public Boolean getIsEsNuevoCajeros() {
		return isEsNuevoCajeros;
	}

	public void setIsEsNuevoCajeros(Boolean isEsNuevoCajeros) {
		this.isEsNuevoCajeros = isEsNuevoCajeros;
	}

	public Boolean getEsParaAccionDesdeFormularioCajeros() {
		return esParaAccionDesdeFormularioCajeros;
	}
	
	public void setEsParaAccionDesdeFormularioCajeros(Boolean esParaAccionDesdeFormularioCajeros) {
		this.esParaAccionDesdeFormularioCajeros = esParaAccionDesdeFormularioCajeros;
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

			if(this.cajerosSessionBean==null) {
				this.cajerosSessionBean=new CajerosSessionBean();
			}

			if(!this.cajerosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cajerosSessionBean.getlidEmpresaActual());
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

			if(this.cajerosSessionBean==null) {
				this.cajerosSessionBean=new CajerosSessionBean();
			}

			if(!this.cajerosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cajerosSessionBean.getlidSucursalActual());
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

			if(this.cajerosSessionBean==null) {
				this.cajerosSessionBean=new CajerosSessionBean();
			}

			if(!this.cajerosSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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
					cajaLogic.getEntityWithConnection(cajerosSessionBean.getlidCajaActual());
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

					if(this.cajeros!=null) {
						this.cajeros.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajeros!=null) {
						this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajeros.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajeros!=null) {
						if(this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajerosGenerico)throws Exception
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
				jComboBoxid_empresaCajerosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajerosGenerico!=null && jComboBoxid_empresaCajerosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajerosGenerico.setSelectedIndex(0);
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

					if(this.cajeros!=null) {
						this.cajeros.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCajeros!=null) {
						this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCajeros.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCajeros!=null) {
						if(this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCajerosGenerico)throws Exception
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
				jComboBoxid_sucursalCajerosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCajerosGenerico!=null && jComboBoxid_sucursalCajerosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCajerosGenerico.setSelectedIndex(0);
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

					if(this.cajeros!=null) {
						this.cajeros.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormCajeros!=null) {
						this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaCajeros.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormCajeros!=null) {
						if(this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setSelectedIndex(0);
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
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaCajerosGenerico)throws Exception
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
				jComboBoxid_cajaCajerosGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaCajerosGenerico!=null && jComboBoxid_cajaCajerosGenerico.getItemCount()>0) {
					jComboBoxid_cajaCajerosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Cajeros cajeros,JComboBox jComboBoxid_empresaCajerosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajerosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajerosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajeros.setid_empresa(empresaAux.getId());
				cajeros.setempresa_descripcion(CajerosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajeros.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Cajeros cajeros,JComboBox jComboBoxid_sucursalCajerosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCajerosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCajerosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cajeros.setid_sucursal(sucursalAux.getId());
				cajeros.setsucursal_descripcion(CajerosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cajeros.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(Cajeros cajeros,JComboBox jComboBoxid_cajaCajerosGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaCajerosGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaCajerosGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				cajeros.setid_caja(cajaAux.getId());
				cajeros.setcaja_descripcion(CajerosConstantesFunciones.getCajaDescripcion(cajaAux));
				cajeros.setCaja(cajaAux);			}
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

					if(!CajerosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeros!=null) { 
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeros!=null) { 
					}

					if(!CajerosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajerosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeros!=null) { 
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeros!=null) { 
					}

					if(!CajerosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajerosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeros!=null) { 
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeros!=null) { 
					}

					if(!CajerosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajeros!=null) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeros!=null) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajeros!=null) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeros!=null) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajeros!=null) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeros!=null) {
							this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCajeros() throws Exception {
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
		
	public CajerosParameterReturnGeneral getCajerosParameterGeneral() {
		return this.cajerosParameterGeneral;
	}
	
	public void setCajerosParameterGeneral(CajerosParameterReturnGeneral cajerosParameterGeneral) {
		this.cajerosParameterGeneral = cajerosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCajeros() {
		return isPermisoTodoCajeros;
	}

	public void setIsPermisoTodoCajeros(Boolean isPermisoTodoCajeros) {
		this.isPermisoTodoCajeros = isPermisoTodoCajeros;
	}

	public Boolean getIsPermisoNuevoCajeros() {
		return isPermisoNuevoCajeros;
	}

	public void setIsPermisoNuevoCajeros(Boolean isPermisoNuevoCajeros) {
		this.isPermisoNuevoCajeros = isPermisoNuevoCajeros;
	}

	public Boolean getIsPermisoActualizarCajeros() {
		return isPermisoActualizarCajeros;
	}

	public void setIsPermisoActualizarCajeros(Boolean isPermisoActualizarCajeros) {
		this.isPermisoActualizarCajeros = isPermisoActualizarCajeros;
	}

	public Boolean getIsPermisoEliminarCajeros() {
		return isPermisoEliminarCajeros;
	}

	public void setIsPermisoEliminarCajeros(Boolean isPermisoEliminarCajeros) {
		this.isPermisoEliminarCajeros = isPermisoEliminarCajeros;
	}

	public Boolean getIsPermisoGuardarCambiosCajeros() {
		return isPermisoGuardarCambiosCajeros;
	}

	public void setIsPermisoGuardarCambiosCajeros(Boolean isPermisoGuardarCambiosCajeros) {
		this.isPermisoGuardarCambiosCajeros = isPermisoGuardarCambiosCajeros;
	}
	
	public Boolean getIsPermisoConsultaCajeros() {
		return isPermisoConsultaCajeros;
	}

	public void setIsPermisoConsultaCajeros(Boolean isPermisoConsultaCajeros) {
		this.isPermisoConsultaCajeros = isPermisoConsultaCajeros;
	}

	public Boolean getIsPermisoBusquedaCajeros() {
		return isPermisoBusquedaCajeros;
	}

	public void setIsPermisoBusquedaCajeros(Boolean isPermisoBusquedaCajeros) {
		this.isPermisoBusquedaCajeros = isPermisoBusquedaCajeros;
	}

	public Boolean getIsPermisoReporteCajeros() {
		return isPermisoReporteCajeros;
	}

	public void setIsPermisoReporteCajeros(Boolean isPermisoReporteCajeros) {
		this.isPermisoReporteCajeros = isPermisoReporteCajeros;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajeros() {
		return isPermisoPaginacionMedioCajeros;
	}

	public void setIsPermisoPaginacionMedioCajeros(Boolean isPermisoPaginacionMedioCajeros) {
		this.isPermisoPaginacionMedioCajeros = isPermisoPaginacionMedioCajeros;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajeros() {
		return isPermisoPaginacionTodoCajeros;
	}

	public void setIsPermisoPaginacionTodoCajeros(Boolean isPermisoPaginacionTodoCajeros) {
		this.isPermisoPaginacionTodoCajeros = isPermisoPaginacionTodoCajeros;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajeros() {
		return isPermisoPaginacionAltoCajeros;
	}

	public void setIsPermisoPaginacionAltoCajeros(Boolean isPermisoPaginacionAltoCajeros) {
		this.isPermisoPaginacionAltoCajeros = isPermisoPaginacionAltoCajeros;
	}
	
	public Boolean getIsPermisoCopiarCajeros() {
		return isPermisoCopiarCajeros;
	}

	public void setIsPermisoCopiarCajeros(Boolean isPermisoCopiarCajeros) {
		this.isPermisoCopiarCajeros = isPermisoCopiarCajeros;
	}
	
	public Boolean getIsPermisoVerFormCajeros() {
		return isPermisoVerFormCajeros;
	}

	public void setIsPermisoVerFormCajeros(Boolean isPermisoVerFormCajeros) {
		this.isPermisoVerFormCajeros = isPermisoVerFormCajeros;
	}
	
	public Boolean getIsPermisoDuplicarCajeros() {
		return isPermisoDuplicarCajeros;
	}

	public void setIsPermisoDuplicarCajeros(Boolean isPermisoDuplicarCajeros) {
		this.isPermisoDuplicarCajeros = isPermisoDuplicarCajeros;
	}
	
	public Boolean getIsPermisoOrdenCajeros() {
		return isPermisoOrdenCajeros;
	}

	public void setIsPermisoOrdenCajeros(Boolean isPermisoOrdenCajeros) {
		this.isPermisoOrdenCajeros = isPermisoOrdenCajeros;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCajeros() {
		return isVisibilidadCeldaNuevoCajeros;
	}

	public void setIsVisibilidadCeldaNuevoCajeros(Boolean isVisibilidadCeldaNuevoCajeros) {
		this.isVisibilidadCeldaNuevoCajeros = isVisibilidadCeldaNuevoCajeros;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajeros() {
		return isVisibilidadCeldaDuplicarCajeros;
	}

	public void setIsVisibilidadCeldaDuplicarCajeros(Boolean isVisibilidadCeldaDuplicarCajeros) {
		this.isVisibilidadCeldaDuplicarCajeros = isVisibilidadCeldaDuplicarCajeros;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajeros() {
		return isVisibilidadCeldaCopiarCajeros;
	}

	public void setIsVisibilidadCeldaCopiarCajeros(Boolean isVisibilidadCeldaCopiarCajeros) {
		this.isVisibilidadCeldaCopiarCajeros = isVisibilidadCeldaCopiarCajeros;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajeros() {
		return isVisibilidadCeldaVerFormCajeros;
	}

	public void setIsVisibilidadCeldaVerFormCajeros(Boolean isVisibilidadCeldaVerFormCajeros) {
		this.isVisibilidadCeldaVerFormCajeros = isVisibilidadCeldaVerFormCajeros;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajeros() {
		return isVisibilidadCeldaOrdenCajeros;
	}

	public void setIsVisibilidadCeldaOrdenCajeros(Boolean isVisibilidadCeldaOrdenCajeros) {
		this.isVisibilidadCeldaOrdenCajeros = isVisibilidadCeldaOrdenCajeros;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajeros() {
		return isVisibilidadCeldaNuevoRelacionesCajeros;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajeros(Boolean isVisibilidadCeldaNuevoRelacionesCajeros) {
		this.isVisibilidadCeldaNuevoRelacionesCajeros = isVisibilidadCeldaNuevoRelacionesCajeros;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajeros() {
		return isVisibilidadCeldaModificarCajeros;
	}

	public void setIsVisibilidadCeldaModificarCajeros(Boolean isVisibilidadCeldaModificarCajeros) {
		this.isVisibilidadCeldaModificarCajeros = isVisibilidadCeldaModificarCajeros;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajeros() {
		return isVisibilidadCeldaActualizarCajeros;
	}

	public void setIsVisibilidadCeldaActualizarCajeros(Boolean isVisibilidadCeldaActualizarCajeros) {
		this.isVisibilidadCeldaActualizarCajeros = isVisibilidadCeldaActualizarCajeros;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajeros() {
		return isVisibilidadCeldaEliminarCajeros;
	}

	public void setIsVisibilidadCeldaEliminarCajeros(Boolean isVisibilidadCeldaEliminarCajeros) {
		this.isVisibilidadCeldaEliminarCajeros = isVisibilidadCeldaEliminarCajeros;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajeros() {
		return isVisibilidadCeldaCancelarCajeros;
	}

	public void setIsVisibilidadCeldaCancelarCajeros(Boolean isVisibilidadCeldaCancelarCajeros) {
		this.isVisibilidadCeldaCancelarCajeros = isVisibilidadCeldaCancelarCajeros;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajeros() {
		return isVisibilidadCeldaGuardarCajeros;
	}

	public void setIsVisibilidadCeldaGuardarCajeros(Boolean isVisibilidadCeldaGuardarCajeros) {
		this.isVisibilidadCeldaGuardarCajeros = isVisibilidadCeldaGuardarCajeros;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajeros() {
		return isVisibilidadCeldaGuardarCambiosCajeros;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajeros(Boolean isVisibilidadCeldaGuardarCambiosCajeros) {
		this.isVisibilidadCeldaGuardarCambiosCajeros = isVisibilidadCeldaGuardarCambiosCajeros;
	}
		
	public CajerosSessionBean getcajerosSessionBean() {
		return this.cajerosSessionBean;
	}
	
	public void setcajerosSessionBean(CajerosSessionBean cajerosSessionBean) {
		this.cajerosSessionBean=cajerosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCajeros() {
		return this.isVisibilidadBusquedaCajeros;
	}

	public void setisVisibilidadBusquedaCajeros(Boolean isVisibilidadBusquedaCajeros) {
		this.isVisibilidadBusquedaCajeros=isVisibilidadBusquedaCajeros;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajeros(Cajeros cajeros)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cajeros,null);
				this.setActualParaGuardarSucursalForeignKey(cajeros,null);
				this.setActualParaGuardarCajaForeignKey(cajeros,null);
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
	
	public void bugActualizarReferenciaActual(Cajeros cajeros,Cajeros cajerosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajeros(cajeros);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajerosAux.setId(cajeros.getId());
		cajerosAux.setVersionRow(cajeros.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(Cajeros cajerosLocal) throws Exception {
		
		if(this.cajerosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Cajeros cajerosLocal) throws Exception {	
		if(this.cajerosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajerosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cajerosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				cajerosLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajerosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajerosValidator.getInvalidValues(this.cajeros);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Cajeros cajeros,List<Cajeros> cajeross) throws Exception {
	}		
	
	public void actualizarSelectedLista(Cajeros cajeros,List<Cajeros> cajeross) throws Exception {
		try	{			
			CajerosConstantesFunciones.actualizarSelectedLista(cajeros,cajeross);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Cajeros> cajerossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajerossLocal=this.cajerosLogic.getCajeross();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajerossLocal=this.cajeross;
			}
			//ARCHITECTURE
		
			for(Cajeros cajerosLocal:cajerossLocal) {
				if(this.permiteMantenimiento(cajerosLocal) && cajerosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CajerosConstantesFunciones.getCajerosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajerosConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeros.jLabelid_cajaCajeros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajerosConstantesFunciones.NOMBRECAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeros.jLabelnombre_cajaCajeros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajerosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeros.jLabelfechaCajeros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajerosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeros.jLabeltotalCajeros,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCajeros!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeros.jLabelid_cajaCajeros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeros.jLabelnombre_cajaCajeros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeros.jLabelfechaCajeros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeros.jLabeltotalCajeros,"");
		
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
		this.iIdNuevoCajeros--;	
		
		
		this.cajerosAux=new Cajeros();
		
		this.cajerosAux.setId(this.iIdNuevoCajeros);
		this.cajerosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajerosLogic.getCajeross().add(this.cajerosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajeross.add(this.cajerosAux);
		}
		//ARCHITECTURE
		
		this.cajeros=this.cajerosAux;
		
		if(CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajeros(this.cajeros);
			this.setVariablesObjetoActualToFormularioForeignKeyCajeros(this.cajeros);
		}
				
		//this.setDefaultControlesCajeros();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajeros();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajeros();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajeros();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajeros(this.cajerosBean,this.cajeros,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajeros(this.cajerosReturnGeneral,this.cajerosBean,false);
		
		if(this.cajerosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajeros(this.cajerosReturnGeneral.getCajeros());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajeros(this.cajerosReturnGeneral.getCajeros());
		}
		
		if(this.cajerosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajeros(this.cajerosReturnGeneral.getCajeros(),classes);//this.cajerosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajeros();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajeros();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajerosBeanSwingJInternalFrameAdditional.RecargarFormCajeros(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajeros(false);
						
			if(cajerosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CajerosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajeros();
			}
			
			this.actualizarVisualTableDatosCajeros();
			
			this.jTableDatosCajeros.setRowSelectionInterval(this.getIndiceNuevoCajeros(), this.getIndiceNuevoCajeros());
			
			this.seleccionarFilaTablaCajerosActual();
						
			this.actualizarEstadoCeldasBotonesCajeros("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajeros(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajeros.jDateChooserfecha_inicioCajeros.setEnabled(isHabilitar && this.cajerosConstantesFunciones.activarfecha_inicioCajeros);
		this.jInternalFrameDetalleFormCajeros.jDateChooserfecha_finCajeros.setEnabled(isHabilitar && this.cajerosConstantesFunciones.activarfecha_finCajeros);
		this.jInternalFrameDetalleFormCajeros.jTextAreanombre_cajaCajeros.setEnabled(isHabilitar && this.cajerosConstantesFunciones.activarnombre_cajaCajeros);
		this.jInternalFrameDetalleFormCajeros.jDateChooserfechaCajeros.setEnabled(isHabilitar && this.cajerosConstantesFunciones.activarfechaCajeros);
		this.jInternalFrameDetalleFormCajeros.jTextFieldtotalCajeros.setEnabled(isHabilitar && this.cajerosConstantesFunciones.activartotalCajeros);	
		//
		this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setEnabled(isHabilitar && this.cajerosConstantesFunciones.activarid_empresaCajeros);//
		this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setEnabled(isHabilitar && this.cajerosConstantesFunciones.activarid_sucursalCajeros);//
		this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setEnabled(isHabilitar && this.cajerosConstantesFunciones.activarid_cajaCajeros);
	};
	
	public void setDefaultControlesCajeros() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajeros(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajerosSessionBean.setConGuardarRelaciones(true);			
			this.cajerosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.setVisible(true);
			
					
		} else {
			//this.cajerosSessionBean.setConGuardarRelaciones(false);			
			this.cajerosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCajeros() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
				if(cajerosAux.getId().equals(this.iIdNuevoCajeros)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cajeros cajerosAux:this.cajeross) {
				if(cajerosAux.getId().equals(this.iIdNuevoCajeros)) {
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
	
	public int getIndiceActualCajeros(Cajeros cajeros,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
				if(cajerosAux.getId().equals(cajeros.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cajeros cajerosAux:this.cajeross) {
				if(cajerosAux.getId().equals(cajeros.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCajeros(Cajeros cajerosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
				if(cajerosAux.getCajerosOriginal().getId().equals(cajerosOriginal.getId())) {
					existe=true;
					cajerosOriginal.setId(cajerosAux.getId());
					cajerosOriginal.setVersionRow(cajerosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cajeros cajerosAux:this.cajeross) {
				if(cajerosAux.getCajerosOriginal().getId().equals(cajerosOriginal.getId())) {
					existe=true;
					cajerosOriginal.setId(cajerosAux.getId());
					cajerosOriginal.setVersionRow(cajerosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajeros(Boolean esParaCancelar) throws Exception {
		cajerossAux=new ArrayList<Cajeros>();
		cajerosAux=new Cajeros();
		
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
					if(cajerosAux.getId()<0) {
						cajerossAux.add(cajerosAux);
					}		
				}
				this.iIdNuevoCajeros=0L;
				this.cajerosLogic.getCajeross().removeAll(cajerossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cajeros cajerosAux:this.cajeross) {
					if(cajerosAux.getId()<0) {
						cajerossAux.add(cajerosAux);
					}		
				}
				this.iIdNuevoCajeros=0L;
				this.cajeross.removeAll(cajerossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajeros 
					&& this.cajerosLogic.getCajeross().size()>0
					) {
					cajerosAux=this.cajerosLogic.getCajeross().get(this.cajerosLogic.getCajeross().size() - 1);
				
					if(cajerosAux.getId()<0) {
						this.cajerosLogic.getCajeross().remove(cajerosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajeros && this.cajeross.size()>0) {
					cajerosAux=this.cajeross.get(this.cajeross.size() - 1);
				
					if(cajerosAux.getId()<0) {
						this.cajeross.remove(cajerosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajeros(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajeros.getId()<0) {
				this.cajerosLogic.getCajeross().remove(this.cajeros);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajeros.getId()<0) {
				this.cajeross.remove(this.cajeros);
			}
		}			
	}
	
	public void setEstadosInicialesCajeros(List<Cajeros> cajerossAux) throws Exception {
		CajerosConstantesFunciones.setEstadosInicialesCajeros(cajerossAux);
	}
	
	public void setEstadosInicialesCajeros(Cajeros cajerosAux) throws Exception {
		CajerosConstantesFunciones.setEstadosInicialesCajeros(cajerosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajerosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajeros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajerosActual()) {
				if(!this.isEsNuevoCajeros) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajeros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajeros=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajerosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cajeros ?", "MANTENIMIENTO DE Cajeros", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajeros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Cajeros cajeros) throws Exception {
		CajerosConstantesFunciones.seleccionarAsignar(this.cajeros,cajeros);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajeros=this.isPermisoActualizarOriginalCajeros;
			
			
			this.seleccionarAsignar(cajeros);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCajeros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajerosSessionBean.setsFuncionBusquedaRapida(this.cajerosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCajeros) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajeros(esParaCancelar);				
				this.cancelarNuevoCajeros(esParaCancelar);								
			}
			
			this.cajeros=new Cajeros();
			
			this.inicializarCajeros();
			
			this.actualizarEstadoCeldasBotonesCajeros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajeros() throws Exception {
		try {
			CajerosConstantesFunciones.inicializarCajeros(this.cajeros);
			
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
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajerosLogic.getCajeross().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajeross(String sAccionBusqueda,List<Cajeros> cajerossParaReportes) throws Exception {
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
					sPathReporteFinal="Cajeros"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajerosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajerosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Cajeros"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cajeroses");		
		parameters.put("busquedapor", CajerosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajeros=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajerosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajerosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajeros=new JRBeanArrayDataSource(CajerosJInternalFrame.TraerCajerosBeans(cajerossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajeros);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajerosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajerosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajerosBean.TraerCajerosBeans(cajerossParaReportes).toArray()));
							
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
				this.generarExcelReporteCajeross(sAccionBusqueda,sTipoArchivoReporte,cajerossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajeross(sAccionBusqueda,sTipoArchivoReporte,cajerossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajerosActionPerformed(null);
					//this.generarExcelReporteCajeross(sAccionBusqueda,sTipoArchivoReporte,cajerossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajeross(sAccionBusqueda,sTipoArchivoReporte,cajerossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajeross(sAccionBusqueda,sTipoArchivoReporte,cajerossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajeross(sAccionBusqueda,sTipoArchivoReporte,cajerossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajeross(String sAccionBusqueda,String sTipoArchivoReporte,List<Cajeros> cajerossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeros";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cajeross");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajeros("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Cajeros cajeros : cajerossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajerosConstantesFunciones.generarExcelReporteDataCajeros("NORMAL",row,workbook,cajeros,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajeros(String sTipo,Row row,Workbook workbook) {
		
		CajerosConstantesFunciones.generarExcelReporteHeaderCajeros(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajeross(String sAccionBusqueda,String sTipoArchivoReporte,List<Cajeros> cajerossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeros_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cajeross");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Cajeros cajeros : cajerossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajerosConstantesFunciones.getCajerosDescripcion(cajeros));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajerosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajerosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeros.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajerosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajerosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeros.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajerosConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajerosConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeros.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajerosConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeros.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajerosConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeros.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajerosConstantesFunciones.LABEL_NOMBRECAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajerosConstantesFunciones.LABEL_NOMBRECAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeros.getnombre_caja());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajerosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeros.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajerosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajerosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeros.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajeross(String sAccionBusqueda,String sTipoArchivoReporte,List<Cajeros> cajerossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Cajeros> cajerossRespaldo=null;
		
		classes=CajerosConstantesFunciones.getClassesRelationshipsOfCajeros(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajerosLogic.setDatosCliente(this.datosCliente);
		this.cajerosLogic.setDatosDeep(this.datosDeep);
		this.cajerosLogic.setIsConDeep(true);
		
		cajerossRespaldo=this.cajerosLogic.getCajeross();
		
		this.cajerosLogic.setCajeross(cajerossParaReportes);	
		this.cajerosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajerossParaReportes=this.cajerosLogic.getCajeross();
		this.cajerosLogic.setCajeross(cajerossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeros_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cajeross");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajeros("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Cajeros cajeros : cajerossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajeros("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajerosConstantesFunciones.generarExcelReporteDataCajeros("NORMAL",row,workbook,cajeros,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CajerosConstantesFunciones.getCajerosDescripcion(cajeros));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajeros.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeros.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajeros() throws Exception {		
		this.startProcessCajeros(true);
	}
	
	public void startProcessCajeros(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajeros ,this.jPanelParametrosReportesCajeros, this.jScrollPanelDatosCajeros,this.jPanelPaginacionCajeros, this.jScrollPanelDatosEdicionCajeros, this.jPanelAccionesCajeros,this.jPanelAccionesFormularioCajeros,this.jmenuBarCajeros,this.jmenuBarDetalleCajeros,this.jTtoolBarCajeros,this.jTtoolBarDetalleCajeros);		
		
		final JTabbedPane jTabbedPaneBusquedasCajeros=this.jTabbedPaneBusquedasCajeros; 
		
		final JPanel jPanelParametrosReportesCajeros=this.jPanelParametrosReportesCajeros;
		//final JScrollPane jScrollPanelDatosCajeros=this.jScrollPanelDatosCajeros;
		final JTable jTableDatosCajeros=this.jTableDatosCajeros;		
		final JPanel jPanelPaginacionCajeros=this.jPanelPaginacionCajeros;
		//final JScrollPane jScrollPanelDatosEdicionCajeros=this.jScrollPanelDatosEdicionCajeros;
		final JPanel jPanelAccionesCajeros=this.jPanelAccionesCajeros;
		
		JPanel jPanelCamposAuxiliarCajeros=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajeros=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajeros!=null) {
			jPanelCamposAuxiliarCajeros=this.jInternalFrameDetalleFormCajeros.jPanelCamposCajeros;
			jPanelAccionesFormularioAuxiliarCajeros=this.jInternalFrameDetalleFormCajeros.jPanelAccionesFormularioCajeros;
		}
		
		final JPanel jPanelCamposCajeros=jPanelCamposAuxiliarCajeros;
		final JPanel jPanelAccionesFormularioCajeros=jPanelAccionesFormularioAuxiliarCajeros;
		
		
		final JMenuBar jmenuBarCajeros=this.jmenuBarCajeros;
		final JToolBar jTtoolBarCajeros=this.jTtoolBarCajeros;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajeros=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajeros=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) {
			jmenuBarDetalleAuxiliarCajeros=this.jInternalFrameDetalleFormCajeros.jmenuBarDetalleCajeros;
			jTtoolBarDetalleAuxiliarCajeros=this.jInternalFrameDetalleFormCajeros.jTtoolBarDetalleCajeros;
		}
		
		final JMenuBar jmenuBarDetalleCajeros=jmenuBarDetalleAuxiliarCajeros;
		final JToolBar jTtoolBarDetalleCajeros=jTtoolBarDetalleAuxiliarCajeros;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajeros;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajeros;
			processRunnable.jTableDatos=jTableDatosCajeros;
			processRunnable.jPanelCampos=jPanelCamposCajeros;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajeros;
			processRunnable.jPanelAcciones=jPanelAccionesCajeros;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajeros;
			
			
			processRunnable.jmenuBar=jmenuBarCajeros;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajeros;
			processRunnable.jTtoolBar=jTtoolBarCajeros;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajeros;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajeros ,jPanelParametrosReportesCajeros,jTableDatosCajeros, /*jScrollPanelDatosCajeros,*/jPanelCamposCajeros,jPanelPaginacionCajeros, /*jScrollPanelDatosEdicionCajeros,*/ jPanelAccionesCajeros,jPanelAccionesFormularioCajeros,jmenuBarCajeros,jmenuBarDetalleCajeros,jTtoolBarCajeros,jTtoolBarDetalleCajeros);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajeros ,jPanelParametrosReportesCajeros, jScrollPanelDatosCajeros,jPanelPaginacionCajeros, jScrollPanelDatosEdicionCajeros, jPanelAccionesCajeros,jPanelAccionesFormularioCajeros,jmenuBarCajeros,jmenuBarDetalleCajeros,jTtoolBarCajeros,jTtoolBarDetalleCajeros);
						
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
	
	public void finishProcessCajeros() {// throws Exception 
		this.finishProcessCajeros(true);
	}
	
	public void finishProcessCajeros(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajeros ,this.jPanelParametrosReportesCajeros, this.jScrollPanelDatosCajeros,this.jPanelPaginacionCajeros, this.jScrollPanelDatosEdicionCajeros, this.jPanelAccionesCajeros,this.jPanelAccionesFormularioCajeros,this.jmenuBarCajeros,this.jmenuBarDetalleCajeros,this.jTtoolBarCajeros,this.jTtoolBarDetalleCajeros);		
		
		final JTabbedPane jTabbedPaneBusquedasCajeros=this.jTabbedPaneBusquedasCajeros; 
		
		final JPanel jPanelParametrosReportesCajeros=this.jPanelParametrosReportesCajeros;
		//final JScrollPane jScrollPanelDatosCajeros=this.jScrollPanelDatosCajeros;
		final JTable jTableDatosCajeros=this.jTableDatosCajeros;		
		final JPanel jPanelPaginacionCajeros=this.jPanelPaginacionCajeros;
		//final JScrollPane jScrollPanelDatosEdicionCajeros=this.jScrollPanelDatosEdicionCajeros;
		final JPanel jPanelAccionesCajeros=this.jPanelAccionesCajeros;
		
		JPanel jPanelCamposAuxiliarCajeros=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajeros=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajeros!=null) {
			jPanelCamposAuxiliarCajeros=this.jInternalFrameDetalleFormCajeros.jPanelCamposCajeros;
			jPanelAccionesFormularioAuxiliarCajeros=this.jInternalFrameDetalleFormCajeros.jPanelAccionesFormularioCajeros;
		}
		
		final JPanel jPanelCamposCajeros=jPanelCamposAuxiliarCajeros;
		final JPanel jPanelAccionesFormularioCajeros=jPanelAccionesFormularioAuxiliarCajeros;
		
		
		final JMenuBar jmenuBarCajeros=this.jmenuBarCajeros;		
		final JToolBar jTtoolBarCajeros=this.jTtoolBarCajeros;
				
		JMenuBar jmenuBarDetalleAuxiliarCajeros=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajeros=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajeros!=null) {
			jmenuBarDetalleAuxiliarCajeros=this.jInternalFrameDetalleFormCajeros.jmenuBarDetalleCajeros;
			jTtoolBarDetalleAuxiliarCajeros=this.jInternalFrameDetalleFormCajeros.jTtoolBarDetalleCajeros;		
		}
		
		final JMenuBar jmenuBarDetalleCajeros=jmenuBarDetalleAuxiliarCajeros;
		final JToolBar jTtoolBarDetalleCajeros=jTtoolBarDetalleAuxiliarCajeros;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajeros;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajeros;
			processRunnable.jTableDatos=jTableDatosCajeros;
			processRunnable.jPanelCampos=jPanelCamposCajeros;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajeros;
			processRunnable.jPanelAcciones=jPanelAccionesCajeros;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajeros;
			
			
			processRunnable.jmenuBar=jmenuBarCajeros;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajeros;
			processRunnable.jTtoolBar=jTtoolBarCajeros;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajeros;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajeros ,jPanelParametrosReportesCajeros, jTableDatosCajeros,/*jScrollPanelDatosCajeros,*/jPanelCamposCajeros,jPanelPaginacionCajeros, /*jScrollPanelDatosEdicionCajeros,*/ jPanelAccionesCajeros,jPanelAccionesFormularioCajeros,jmenuBarCajeros,jmenuBarDetalleCajeros,jTtoolBarCajeros,jTtoolBarDetalleCajeros));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajeros(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajeros(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajeros(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajeros(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajeros,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajeros,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajeros(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajeros,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajeros,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajerosConstantesFunciones.getsFinalQueryCajeros();
		String  finalQueryPaginacionTodos=this.cajerosConstantesFunciones.getsFinalQueryCajeros();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CajerosConstantesFunciones.getArrayColumnasGlobalesNoCajeros(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajerosConstantesFunciones.getArrayColumnasGlobalesCajeros(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajerosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajerossEliminados= new ArrayList<Cajeros>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajeros();
		
				///*CajerosSessionBean*/this.cajerosSessionBean=new CajerosSessionBean();
			
			if(this.cajerosSessionBean==null) {
				this.cajerosSessionBean=new CajerosSessionBean();
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
					this.iNumeroPaginacion=CajerosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajerosConstantesFunciones.getClassesForeignKeysOfCajeros(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajeros."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajerossAux= new ArrayList<Cajeros>();
			
				
			cajerosLogic.setDatosCliente(this.datosCliente);
			cajerosLogic.setDatosDeep(this.datosDeep);
			cajerosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCajeros")) {
				this.sDetalleReporte=CajerosConstantesFunciones.getDetalleIndiceBusquedaCajeros(fecha_inicioBusquedaCajeros,fecha_finBusquedaCajeros);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajerosLogic.getCajerossBusquedaCajeros(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaCajeros,fecha_finBusquedaCajeros);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajerosConstantesFunciones.getDetalleIndiceBusquedaCajeros(fecha_inicioBusquedaCajeros,fecha_finBusquedaCajeros);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajerosConstantesFunciones.getDetalleIndiceBusquedaCajeros(fecha_inicioBusquedaCajeros,fecha_finBusquedaCajeros);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajerosLogic.getCajeross()==null||cajerosLogic.getCajeross().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajeross==null|| cajeross.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajerossAux=new ArrayList<Cajeros>();
						cajerossAux.addAll(cajerosLogic.getCajeross());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajerossAux=new ArrayList<Cajeros>();
							cajerossAux.addAll(cajeross);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajerosLogic.getCajerossBusquedaCajeros(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaCajeros,fecha_finBusquedaCajeros);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajerosConstantesFunciones.getDetalleIndiceBusquedaCajeros(fecha_inicioBusquedaCajeros,fecha_finBusquedaCajeros);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajerosConstantesFunciones.getDetalleIndiceBusquedaCajeros(fecha_inicioBusquedaCajeros,fecha_finBusquedaCajeros);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajeross("BusquedaCajeros",cajerosLogic.getCajeross());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajeross("BusquedaCajeros",cajeross);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajerosLogic.setCajeross(new ArrayList<Cajeros>());
						cajerosLogic.getCajeross().addAll(cajerossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeross=new ArrayList<Cajeros>();
							cajeross.addAll(cajerossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajeros();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajeros();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajerosLogic.getCajeross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajeross.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajerosLogic.getCajeross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajeross.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Cajeros cajeros) {
		Boolean permite=true;
		
		if(this.cajeros.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajerosConstantesFunciones.getOrderByListaCajeros();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajerosConstantesFunciones.getOrderByListaCajeros();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cajeros cajeros:cajerosLogic.getCajeross()) {
				if(cajeros.getsType().equals(Constantes2.S_TOTALES)) {
					cajerosTotales=cajeros;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cajeros cajeros:this.cajeross) {
				if(cajeros.getsType().equals(Constantes2.S_TOTALES)) {
					cajerosTotales=cajeros;
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
			this.cajerosAux=new Cajeros();
			this.cajerosAux.setsType(Constantes2.S_TOTALES);
			this.cajerosAux.setIsNew(false);
			this.cajerosAux.setIsChanged(false);
			this.cajerosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CajerosConstantesFunciones.TotalizarValoresFilaCajeros(this.cajerosLogic.getCajeross(),this.cajerosAux);
				
				//this.cajerosLogic.getCajeross().add(this.cajerosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajerosConstantesFunciones.TotalizarValoresFilaCajeros(this.cajeross,this.cajerosAux);
				
				this.cajeross.add(this.cajerosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajerosTotales=new Cajeros();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajerosLogic.getCajeross().remove(cajerosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajeross.remove(cajerosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajerosTotales=new Cajeros();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cajeros cajeros:cajerosLogic.getCajeross()) {
				if(cajeros.getsType().equals(Constantes2.S_TOTALES)) {
					cajerosTotales=cajeros;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajerosConstantesFunciones.TotalizarValoresFilaCajeros(this.cajerosLogic.getCajeross(),cajerosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cajeros cajeros:this.cajeross) {
				if(cajeros.getsType().equals(Constantes2.S_TOTALES)) {
					cajerosTotales=cajeros;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajerosConstantesFunciones.TotalizarValoresFilaCajeros(this.cajeross,cajerosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajerossBusquedaCajeros()throws Exception {
		try {
			sAccionBusqueda="BusquedaCajeros";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajerossFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajerossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajerossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajerossBusquedaCajeros(String sFinalQuery,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajerosLogic.getCajerossBusquedaCajeros(sFinalQuery,this.pagination,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajerossFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajerosLogic.getCajerossFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajerossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajerosLogic.getCajerossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajerossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajerosLogic.getCajerossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCajeros() {
		this.isPermisoTodoCajeros=false;
		this.isPermisoNuevoCajeros=false;
		this.isPermisoActualizarCajeros=false;
		this.isPermisoActualizarOriginalCajeros=false;
		this.isPermisoEliminarCajeros=false;
		this.isPermisoGuardarCambiosCajeros=false;
		this.isPermisoConsultaCajeros=true;
		this.isPermisoBusquedaCajeros=true;
		this.isPermisoReporteCajeros=true;
		this.isPermisoOrdenCajeros=false;		
		this.isPermisoPaginacionMedioCajeros=false;		
		this.isPermisoPaginacionAltoCajeros=false;		
		this.isPermisoPaginacionTodoCajeros=false;		
		this.isPermisoCopiarCajeros=false;		
		this.isPermisoVerFormCajeros=false;		
		this.isPermisoDuplicarCajeros=false;
		this.isPermisoOrdenCajeros=false;
	}
	
	public void setPermisosUsuarioCajeros(Boolean isPermiso) {
		this.isPermisoTodoCajeros=isPermiso;
		this.isPermisoNuevoCajeros=isPermiso;
		this.isPermisoActualizarCajeros=isPermiso;
		this.isPermisoActualizarOriginalCajeros=isPermiso;
		this.isPermisoEliminarCajeros=isPermiso;
		this.isPermisoGuardarCambiosCajeros=isPermiso;
		this.isPermisoConsultaCajeros=isPermiso;
		this.isPermisoBusquedaCajeros=isPermiso;
		this.isPermisoReporteCajeros=isPermiso;
		this.isPermisoOrdenCajeros=isPermiso;		
		this.isPermisoPaginacionMedioCajeros=isPermiso;		
		this.isPermisoPaginacionAltoCajeros=isPermiso;		
		this.isPermisoPaginacionTodoCajeros=isPermiso;		
		this.isPermisoCopiarCajeros=isPermiso;		
		this.isPermisoVerFormCajeros=isPermiso;		
		this.isPermisoDuplicarCajeros=isPermiso;
		this.isPermisoOrdenCajeros=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajeros(Boolean isPermiso) {
		//this.isPermisoTodoCajeros=isPermiso;
		this.isPermisoNuevoCajeros=isPermiso;
		this.isPermisoActualizarCajeros=isPermiso;
		this.isPermisoActualizarOriginalCajeros=isPermiso;
		this.isPermisoEliminarCajeros=isPermiso;
		this.isPermisoGuardarCambiosCajeros=isPermiso;
		//this.isPermisoConsultaCajeros=isPermiso;
		//this.isPermisoBusquedaCajeros=isPermiso;
		//this.isPermisoReporteCajeros=isPermiso;
		//this.isPermisoOrdenCajeros=isPermiso;		
		//this.isPermisoPaginacionMedioCajeros=isPermiso;		
		//this.isPermisoPaginacionAltoCajeros=isPermiso;		
		//this.isPermisoPaginacionTodoCajeros=isPermiso;		
		//this.isPermisoCopiarCajeros=isPermiso;		
		//this.isPermisoDuplicarCajeros=isPermiso;
		//this.isPermisoOrdenCajeros=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajerosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CajerosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajeros(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajerosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCajerosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajerosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajerosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCajeros() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajerosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajerosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajerosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajeros=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajeros=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajeros=this.isPermisoActualizarCajeros;
			this.isPermisoEliminarCajeros=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajeros=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajeros=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajeros=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajeros=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajeros=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajeros=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajeros=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajeros=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajeros=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajeros=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajeros=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajeros=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajeros=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajerosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajeros.setToolTipText(this.jTableDatosCajeros.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajeros(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajeros(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajerosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CajerosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCajeros() throws Exception {
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
	public void inicializarCombosForeignKeyCajerosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCajerosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajerosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCajeros()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cajerosSessionBean==null) {
				this.cajerosSessionBean=new CajerosSessionBean();
			}

			if(!this.cajerosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cajerosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.cajerosSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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
	
	public void initActionsCombosTodosForeignKeyCajeros()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajeros(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajeros()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajeros();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajeros(Cajeros cajeros)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(cajeros.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajeros(Cajeros cajeros,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajeros()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.cajerosConstantesFunciones.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajeros()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajeros()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajeros()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajeros()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajeros()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCajeros(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCajeros()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros!=null && this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros!=null && this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros!=null && this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CajerosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajerosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajerosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajerosSessionBean=new CajerosSessionBean(); 
		this.cajerosConstantesFunciones=new CajerosConstantesFunciones(); 
		this.cajerosBean=new Cajeros();//(this.cajerosConstantesFunciones); 		
		this.cajerosReturnGeneral=new CajerosParameterReturnGeneral(); 
		
		this.cajerosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajerosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajerosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajerosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajerosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajeros(true);
			
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
			
			this.cajerosConstantesFunciones=new CajerosConstantesFunciones(); 
			this.cajerosBean=new Cajeros();//this.cajerosConstantesFunciones); 			
			this.cajerosReturnGeneral=new CajerosParameterReturnGeneral(); 
		
			CajerosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cajeros Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cajeros=new Cajeros();
			this.cajeross = new ArrayList<Cajeros>();
			this.cajerossAux = new ArrayList<Cajeros>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic=new CajerosLogic();
				this.cajerosLogic.getNewConnexionToDeep("");
			}
			
			//this.cajerosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajerosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajeros);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajeros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajeros);	
					}
					
					if(this.jInternalFrameImportacionCajeros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajeros);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajeros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajeros);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajeros!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajeros);
				this.jInternalFrameDetalleFormCajeros.setVisible(false);
				this.jInternalFrameDetalleFormCajeros.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajeros!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajeros);
					this.jInternalFrameReporteDinamicoCajeros.setVisible(false);
					this.jInternalFrameReporteDinamicoCajeros.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajeros!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajeros);
					this.jInternalFrameImportacionCajeros.setVisible(false);
					this.jInternalFrameImportacionCajeros.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajeros!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajeros);
					this.jInternalFrameOrderByCajeros.setVisible(false);
					this.jInternalFrameOrderByCajeros.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajerosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajerosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cajerosReturnGeneral=new CajerosParameterReturnGeneral();
			
			this.cajerosParameterGeneral=new CajerosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajerosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CajerosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajerosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajerosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajerosSessionBean.getEsGuardarRelacionado(),this.cajerosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajerosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajerosSessionBean.getEsGuardarRelacionado(),this.cajerosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCajeros=false;
			this.isVisibilidadCeldaDuplicarCajeros=true;
			this.isVisibilidadCeldaCopiarCajeros=true;
			this.isVisibilidadCeldaVerFormCajeros=true;
			this.isVisibilidadCeldaOrdenCajeros=true;
			this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
			this.isVisibilidadCeldaModificarCajeros=false;
			this.isVisibilidadCeldaActualizarCajeros=false;
			this.isVisibilidadCeldaEliminarCajeros=false;
			this.isVisibilidadCeldaCancelarCajeros=false;
			this.isVisibilidadCeldaGuardarCajeros=false;
			this.isVisibilidadCeldaGuardarCambiosCajeros=false;
			
			
			this.isVisibilidadBusquedaCajeros=true;
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajeros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajeros();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajeros(false);
			
			this.setPermisosUsuarioCajeros();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajerosSessionBean.getEsGuardarRelacionado() 
				|| (this.cajerosSessionBean.getEsGuardarRelacionado() && this.cajerosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajerosClasesRelacionadas();
			}
			
			if(this.cajerosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajerosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajerosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajeros();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajeros();
			}
			
			if(!this.isPermisoBusquedaCajeros) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajeros.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajerosConstantesFunciones.getTiposSeleccionarCajeros());
				
				this.tiposColumnasSelect=CajerosConstantesFunciones.getTiposSeleccionarCajeros(true);
				
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
			//if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajeros();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCajeros(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCajeros(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajeros() ;
			
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
			this.cajaLogic=new CajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cajerosImplementable= (CajerosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajerosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajerosImplementableHome= (CajerosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajerosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajeross= new ArrayList<Cajeros>();
			this.cajerossEliminados= new ArrayList<Cajeros>();
						
			this.isEsNuevoCajeros=false;
			this.esParaAccionDesdeFormularioCajeros=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCajeros(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajeros();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajerosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajerosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajeros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajeros(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajeros!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajeros();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajeros();
			}
			
			CajerosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajeros.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajeros.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajeros.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajeros(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Cajeros: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajeros() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajeros")) {
				iIndex=this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajeros.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajeros();	
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
	
	public void cargarCombosForeignKeyCajeros(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajeros(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajeros(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajerosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajeros();
		
		this.cargarCombosFrameForeignKeyCajeros();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajeros();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajeros();
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
	
	public void jButtonNuevoCajerosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajerosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
			
			if(jTableDatosCajeros.getRowCount()>=1) {
				jTableDatosCajeros.removeRowSelectionInterval(0, jTableDatosCajeros.getRowCount()-1);						
			}
			
			this.isEsNuevoCajeros=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajeros(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajeros(true);			
			//this.cajeros=new Cajeros();
			//this.cajeros.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajeros(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajeros() ;
			
			if(CajerosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajeros(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajeros);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajeros);				
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
			if(this.cajerosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Cajeros: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajerosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajeros.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajeros.getSelectedRows().length;			
			}
			
			cajerossSeleccionados=this.getCajerossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajeros--;			
				//Cajeros cajerosAux= new Cajeros();			
				//cajerosAux.setId(this.iIdNuevoCajeros);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Cajeros cajerosOrigen=new Cajeros();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Cajeros cajerosOrigen : cajerossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajerosOrigen =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajerosOrigen =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajeros();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajeros.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajeros(cajerosOrigen,this.cajeros,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajerosLogic.getCajeross().add(this.cajerosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajeross.add(this.cajerosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajeros(false);
				
				this.jTableDatosCajeros.setRowSelectionInterval(this.getIndiceNuevoCajeros(), this.getIndiceNuevoCajeros());
				
				int iLastRow =  this.jTableDatosCajeros.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajeros.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajeros.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajeros(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();									
		
			Cajeros cajerosOrigen=new Cajeros();
			Cajeros cajerosDestino=new Cajeros();
				
			cajerossSeleccionados=this.getCajerossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajeros.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajerossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajeros.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajerosOrigen =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajerosOrigen =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajerosDestino =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajerosDestino =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajerosOrigen =cajerossSeleccionados.get(0);
				cajerosDestino =cajerossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajeros(cajerosOrigen,cajerosDestino,true,false);
				
				cajerosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajerosDestino,cajerosLogic.getCajeross());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajerosDestino,cajeross);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajeros(false);
				
				//this.jTableDatosCajeros.setRowSelectionInterval(this.getIndiceNuevoCajeros(), this.getIndiceNuevoCajeros());
				
				int iLastRow =  this.jTableDatosCajeros.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajeros.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajeros.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajeros(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajeros.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajeros.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajeros.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajeros.setVisible(!isVisible);
			this.jPanelPaginacionCajeros.setVisible(!isVisible);
			this.jPanelAccionesCajeros.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajeros();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajeros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajeros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajeros();
			
			this.abrirFrameOrderByCajeros();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajeros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajeros(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajeros);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajeros.isMaximum()) {
					this.jInternalFrameDetalleFormCajeros.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajeros.setSize(this.jInternalFrameDetalleFormCajeros.iWidthFormulario,this.jInternalFrameDetalleFormCajeros.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajeros.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajeros.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajeros.isMaximum()) {
						this.jInternalFrameDetalleFormCajeros.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajeros.jContentPaneDetalleCajeros.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajeros.jContentPaneDetalleCajeros.getWidth(),CajerosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajeros.jContentPaneDetalleCajeros.getWidth(),CajerosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajeros.jContentPaneDetalleCajeros.getWidth(),CajerosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajeros.setVisible(true);
	        this.jInternalFrameDetalleFormCajeros.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajeros() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajeros==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajeros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajeros,false,this);
				} else {
					this.jInternalFrameOrderByCajeros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajeros,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajeros);
				this.jInternalFrameOrderByCajeros.setVisible(false);
				this.jInternalFrameOrderByCajeros.setSelected(false);
				
				this.jInternalFrameOrderByCajeros.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajeros"));
				
				this.inicializarActualizarBindingTablaOrderByCajeros();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajeros() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajeros==null) {
				
				this.jInternalFrameImportacionCajeros=new ImportacionJInternalFrame(CajerosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajeros);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajeros);
				this.jInternalFrameImportacionCajeros.setVisible(false);
				this.jInternalFrameImportacionCajeros.setSelected(false);


				this.jInternalFrameImportacionCajeros.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajeros"));
				this.jInternalFrameImportacionCajeros.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajeros"));
				this.jInternalFrameImportacionCajeros.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajeros"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajeros() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajeros==null) {
				this.jInternalFrameReporteDinamicoCajeros=new ReporteDinamicoJInternalFrame(CajerosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajeros);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajeros);
				this.jInternalFrameReporteDinamicoCajeros.setVisible(false);
				this.jInternalFrameReporteDinamicoCajeros.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajeros.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajeros"));
				this.jInternalFrameReporteDinamicoCajeros.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajeros"));
				this.jInternalFrameReporteDinamicoCajeros.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajeros"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajeros();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCajeros() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajeros);
			
	       	this.jInternalFrameDetalleFormCajeros.setVisible(false);
	        this.jInternalFrameDetalleFormCajeros.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajeros.dispose();
			//this.jInternalFrameDetalleFormCajeros=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajeros() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajeros.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajeros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajeros() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajeros.setVisible(true);
	        this.jInternalFrameImportacionCajeros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajeros() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajeros.setVisible(true);
	        this.jInternalFrameOrderByCajeros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajeros() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajeros.setVisible(false);
	        this.jInternalFrameOrderByCajeros.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajeros() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajeros.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajeros.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajeros() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajeros.setVisible(false);
	        this.jInternalFrameImportacionCajeros.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajeros(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajeros(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajeros(true);
			//this.isEsNuevoCajeros=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajeros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajeros(false) ;
			
			if(cajerosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CajerosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajeros(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajeros(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajerosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajeros(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajeros(true);
			//this.isEsNuevoCajeros=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajeros.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajeros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajeros(false) ;
			
			if(CajerosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajeros(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajeros(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosCajeros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeros,CajerosConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajeros.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajeros(false);
			
			//if(!this.isEsNuevoCajeros) {								
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				
			}
			
			if(this.permiteMantenimiento(this.cajeros)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajerosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajeros=true;
					this.inicializarActualizarBindingTablaCajeros(false);
					this.isEsNuevoCajeros=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajeros=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajeros=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajeros(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajeros(false);
				
				this.habilitarDeshabilitarControlesCajeros(false);
			
												
				
				if(CajerosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajeros();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajerosActionPerformed(evt,cajerosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajeros(this.cajeros,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajeros.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajerosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajeros.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajerosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				this.cajeros.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				this.cajeros.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajeros)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajerosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajerosModel) this.jTableDatosCajeros.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajeros=true;
				this.inicializarActualizarBindingTablaCajeros(false);
				this.isEsNuevoCajeros=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajeros(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajeros(false);
				
				this.habilitarDeshabilitarControlesCajeros(false);
				
				
				
				if(CajerosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajeros();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajerosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajeros.getRowCount()>=1) {
				jTableDatosCajeros.removeRowSelectionInterval(0, jTableDatosCajeros.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajeros(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajeros(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajeros(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajeros(false) ;
			
			this.isEsNuevoCajeros=false;
			
			if(CajerosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajeros();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajerosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajeros(false);
				
				//SI ES MANUAL
				if(CajerosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajeros();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajerosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajeros--;			
			//Cajeros cajerosAux= new Cajeros();			
			//cajerosAux.setId(this.iIdNuevoCajeros);
			
			if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajeros();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
			
			this.cajeros.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajerosLogic.getCajeross().add(this.cajerosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajeross.add(this.cajerosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajeros(false);
			
			this.jTableDatosCajeros.setRowSelectionInterval(this.getIndiceNuevoCajeros(), this.getIndiceNuevoCajeros());
			
			int iLastRow =  this.jTableDatosCajeros.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajeros.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajeros.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajeros(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajerosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajeros(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajeros(false);
			
			//SI ES MANUAL
			if(CajerosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajeros();
			}
			
			//this.abrirFrameTreeCajeros();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajerosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajerosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajeros.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajeros.setFileImportacion(this.jInternalFrameImportacionCajeros.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajeros.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajeros.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajeros.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajeros.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajerosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		

		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajerosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajerosBaseDesign.jrxml";
			
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
			
			this.generarReporteCajeross("Todos",cajerossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajerosConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajerosConstantesFunciones.LABEL_NOMBRECAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajerosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajerosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCajeros.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajeros.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajerosConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case CajerosConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoria="nombre_caja";
					break;

				case CajerosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case CajerosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajeros.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajerosConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case CajerosConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoriaValor="nombre_caja";
					break;

				case CajerosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case CajerosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajeros.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeros.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajerosConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case CajerosConstantesFunciones.LABEL_NOMBRECAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_caja");
					break;

				case CajerosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case CajerosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoCajerosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeros";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Cajeross");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajerosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajerosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Cajeros cajeros:cajerossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeros.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajerosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajerosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Cajeros cajeros:cajerossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeros.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajerosConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajerosConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(Cajeros cajeros:cajerossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeros.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajerosConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(Cajeros cajeros:cajerossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeros.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajerosConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(Cajeros cajeros:cajerossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeros.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajerosConstantesFunciones.LABEL_NOMBRECAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajerosConstantesFunciones.LABEL_NOMBRECAJA);
					iRow++;

					for(Cajeros cajeros:cajerossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeros.getnombre_caja());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajerosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Cajeros cajeros:cajerossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeros.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajerosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajerosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(Cajeros cajeros:cajerossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeros.gettotal());
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
			//	this.getFilaCabeceraExportarExcelCajeros(row);				
			//	iRow++;
			//}				
			
			//for(Cajeros cajerosAux:cajerossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajeros(cajerosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
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
				this.cajerosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajeros(false);
			
			//SI ES MANUAL
			if(CajerosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajeros();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajerosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajeros(false);
			
			//SI ES MANUAL
			if(CajerosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajeros();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajerosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajeros(false);
			
			//SI ES MANUAL
			if(CajerosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajeros();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajeros() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajeros.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajeros.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajeros.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajeros.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajeros.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajeros.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajeros.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajeros(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajeros(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajeros(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajeros(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajeros(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajeros(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajeros(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajeros(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajerosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajerosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajeros() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajeros();
		
		this.inicializarActualizarBindingBotonesManualCajeros(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajeros();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajeros() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajeros(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajeros(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajeros.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajeros.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajeros.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajeros!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajeros.jCheckBoxPostAccionNuevoCajeros.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajeros.jCheckBoxPostAccionSinCerrarCajeros.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajeros.jCheckBoxPostAccionSinMensajeCajeros.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajeros.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajeros.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajeros.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajeros!=null) {
				this.jInternalFrameDetalleFormCajeros.jCheckBoxPostAccionNuevoCajeros.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajeros.jCheckBoxPostAccionSinCerrarCajeros.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajeros.jCheckBoxPostAccionSinMensajeCajeros.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajeros.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajeros.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajeros!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajeros.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajeros!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajeros.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajeros.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajeros.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajeros.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajeros!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajeros.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajeros.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajeros(Boolean esInicializar) throws Exception {
		try	{	
			if(CajerosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajeros(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajeros() throws Exception {
		try	{
			if(CajerosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajeros();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajeros() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajeros() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajeros.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajeros.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajeros.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajeros.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajeros.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajeros.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajeros.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajeros.addItem(reporte);
			}
			
			
			if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajeros.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajeros.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajeros.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajeros.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajeros.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajeros.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajeros.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajeros.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajeros.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajeros();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajeros() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajeros!=null) {
				this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajeros!=null) {
				this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajeros!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajeros.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajeros.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajeros.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajeros.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCajeros.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajeros.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CajerosConstantesFunciones.getTiposSeleccionarCajeros(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajeros.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCajeros.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCajeros.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CajerosConstantesFunciones.getTiposSeleccionarCajeros(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajeros.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCajeros.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajeros.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CajerosConstantesFunciones.getTiposSeleccionarCajeros(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajeros.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCajeros.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajeros()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_inicioBusquedaCajeros=new Date(this.jDateChooserfecha_inicioBusquedaCajerosCajeros.getDate().getTime());
		this.fecha_finBusquedaCajeros=new Date(this.jDateChooserfecha_finBusquedaCajerosCajeros.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajeros(Boolean esInicializar) throws Exception {				
		if(CajerosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajeros();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajeros() throws Exception {
		this.inicializarActualizarBindingTablaCajeros(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajeros() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajerosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajerosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajerosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajerosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajerosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajerosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajeros(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajerosLogic.getCajeross().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajeross.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajeros.setModel(new CajerosModel(this.cajerosLogic.getCajeross(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajeros.setModel(new CajerosModel(this.cajeross,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajeros!=null && this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajeros();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajeros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeros,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajerosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajerosConstantesFunciones.SCLASSWEBTITULO,cajerosConstantesFunciones.resaltarSeleccionarCajeros,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajerosConstantesFunciones.SCLASSWEBTITULO,cajerosConstantesFunciones.resaltarSeleccionarCajeros,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajeros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeros,CajerosConstantesFunciones.LABEL_ID));

		if(this.cajerosConstantesFunciones.mostraridCajeros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajerosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajerosConstantesFunciones.resaltaridCajeros,this.cajerosConstantesFunciones.activaridCajeros,iSizeTabla,this,true,"idCajeros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajerosConstantesFunciones.resaltaridCajeros,this.cajerosConstantesFunciones.activaridCajeros,this,true,"idCajeros","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeros,CajerosConstantesFunciones.LABEL_NOMBRECAJA));

		if(this.cajerosConstantesFunciones.mostrarnombre_cajaCajeros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajerosConstantesFunciones.LABEL_NOMBRECAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajerosConstantesFunciones.resaltarnombre_cajaCajeros,this.cajerosConstantesFunciones.activarnombre_cajaCajeros,iSizeTabla,this,true,"nombre_cajaCajeros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajerosConstantesFunciones.resaltarnombre_cajaCajeros,this.cajerosConstantesFunciones.activarnombre_cajaCajeros,this,true,"nombre_cajaCajeros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajerosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeros,CajerosConstantesFunciones.LABEL_FECHA));

		if(this.cajerosConstantesFunciones.mostrarfechaCajeros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajerosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cajerosConstantesFunciones.resaltarfechaCajeros,this.cajerosConstantesFunciones.activarfechaCajeros,iSizeTabla,this,true,"fechaCajeros","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cajerosConstantesFunciones.resaltarfechaCajeros,this.cajerosConstantesFunciones.activarfechaCajeros,this,true,"fechaCajeros","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajerosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeros,CajerosConstantesFunciones.LABEL_TOTAL));

		if(this.cajerosConstantesFunciones.mostrartotalCajeros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajerosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajerosConstantesFunciones.resaltartotalCajeros,this.cajerosConstantesFunciones.activartotalCajeros,iSizeTabla,this,true,"totalCajeros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajerosConstantesFunciones.resaltartotalCajeros,this.cajerosConstantesFunciones.activartotalCajeros,this,true,"totalCajeros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajerosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajerosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajerosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajeros.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajerosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajerosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajeros.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajeros && this.isPermisoGuardarCambiosCajeros) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajerosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajerosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajeros.addColumn(tableColumn);
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
			
			this.jTableDatosCajeros.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajeros && this.isPermisoGuardarCambiosCajeros) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajeros && this.isPermisoGuardarCambiosCajeros) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajeros.moveColumn(this.jTableDatosCajeros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajeros.moveColumn(this.jTableDatosCajeros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajeros.moveColumn(this.jTableDatosCajeros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajeros.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajeros.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajeros,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajeros.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajeros.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajeros.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajeros.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajeros.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cajerosLogic.getCajeross().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajeross.size()-1;
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
		//this.jTableDatosCajeros.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajeros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajeros();
			
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
				
				//this.isEsNuevoCajeros=false;
					
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
				if(this.cajerosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajeros==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajeros.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajeros.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajeros.getsType().equals("DUPLICADO")
				   || this.cajeros.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajeros=true;
				
				} else {
					this.isEsNuevoCajeros=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
					if(this.cajeros.getId()>=0 && !this.cajeros.getIsNew()) {						
						this.isEsNuevoCajeros=false;
						
					} else {
						this.isEsNuevoCajeros=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajeros(esRelaciones);						
				
				this.seleccionarCajeros(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajeros.getId()<0) {
					this.isEsNuevoCajeros=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajeros(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajeros(evt,rowIndex);
				}	
				
				if(this.cajerosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Cajeros: " + this.dDif); 
					}
				}								
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajeros(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajeros)) {
					if(this.cajeros.getId()>0) {
						this.cajeros.setIsDeleted(true);
						
						this.cajerossEliminados.add(this.cajeros);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajerosLogic.getCajeross().remove(this.cajeros);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajeross.remove(this.cajeros);				
					}
					
					
					((CajerosModel) this.jTableDatosCajeros.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajeros(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajeros(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajeros) {
			
			if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajeros.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajeros.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajeros(this.cajeros);
				}
				
				//ARCHITECTURE
				try {
					

					//Caja
					if(!this.cajerosConstantesFunciones.cargarid_cajaCajeros || this.cajerosConstantesFunciones.event_dependid_cajaCajeros) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.cajeros.getid_caja());
									//this.inicializarActualizarBindingCajeros(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(cajeros.getCaja()!=null) {
							this.cajasForeignKey.add(cajeros.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.cajeros.getid_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajeros("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajeros(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajeros() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajeros(Cajeros cajeros) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajeros(cajeros,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajeros(Cajeros cajeros,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajeros(cajeros);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajeros(cajeros,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajeros(cajeros);
	}
	
	public void setVariablesObjetoActualToFormularioCajeros(Cajeros cajeros) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.setText(cajeros.getId().toString());
			this.jInternalFrameDetalleFormCajeros.jTextAreanombre_cajaCajeros.setText(cajeros.getnombre_caja());
			this.jInternalFrameDetalleFormCajeros.jDateChooserfechaCajeros.setDate(cajeros.getfecha());
			this.jInternalFrameDetalleFormCajeros.jTextFieldtotalCajeros.setText(cajeros.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Cajeros cajerosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajerosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Cajeros cajerosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajerosLocal=this.cajeros;
			} else {
				cajerosLocal=this.cajerosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajerosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajeros(cajerosLocal,true);
					
					if(cajerosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajerosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajerosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajerosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajeros(Cajeros cajeros,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajeros(cajeros,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajeros(cajeros);
	}
	
	public void setVariablesFormularioToObjetoActualCajeros(Cajeros cajeros,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajeros(cajeros,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajeros(Cajeros cajeros,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.getText()==null || this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.getText()=="" || this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.getText()=="Id") {
				this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.setText("0");
			}

			if(conColumnasBase) {cajeros.setId(Long.parseLong(this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajerosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeros.jLabelIdCajeros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajeros.setnombre_caja(this.jInternalFrameDetalleFormCajeros.jTextAreanombre_cajaCajeros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajerosConstantesFunciones.LABEL_NOMBRECAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeros.jLabelnombre_cajaCajeros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajeros.setfecha(this.jInternalFrameDetalleFormCajeros.jDateChooserfechaCajeros.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajerosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeros.jLabelfechaCajeros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajeros.settotal(Double.parseDouble(this.jInternalFrameDetalleFormCajeros.jTextFieldtotalCajeros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajerosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeros.jLabeltotalCajeros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajeros(Cajeros cajerosBean,Cajeros cajeros,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajeros(Cajeros cajerosOrigen,Cajeros cajeros,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajerosOrigen.getId()!=null && !cajerosOrigen.getId().equals(0L))) {cajeros.setId(cajerosOrigen.getId());}}
			if(conDefault || (!conDefault && cajerosOrigen.getid_caja()!=null && !cajerosOrigen.getid_caja().equals(-1L))) {cajeros.setid_caja(cajerosOrigen.getid_caja());}
			if(conDefault || (!conDefault && cajerosOrigen.getfecha_inicio()!=null && !cajerosOrigen.getfecha_inicio().equals(new Date()))) {cajeros.setfecha_inicio(cajerosOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && cajerosOrigen.getfecha_fin()!=null && !cajerosOrigen.getfecha_fin().equals(new Date()))) {cajeros.setfecha_fin(cajerosOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && cajerosOrigen.getnombre_caja()!=null && !cajerosOrigen.getnombre_caja().equals(""))) {cajeros.setnombre_caja(cajerosOrigen.getnombre_caja());}
			if(conDefault || (!conDefault && cajerosOrigen.getfecha()!=null && !cajerosOrigen.getfecha().equals(new Date()))) {cajeros.setfecha(cajerosOrigen.getfecha());}
			if(conDefault || (!conDefault && cajerosOrigen.gettotal()!=null && !cajerosOrigen.gettotal().equals(0.0))) {cajeros.settotal(cajerosOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajeros(Cajeros cajeros) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.setText(cajeros.getId().toString());
			this.jInternalFrameDetalleFormCajeros.jTextAreanombre_cajaCajeros.setText(cajeros.getnombre_caja());
			this.jInternalFrameDetalleFormCajeros.jDateChooserfechaCajeros.setDate(cajeros.getfecha());
			this.jInternalFrameDetalleFormCajeros.jTextFieldtotalCajeros.setText(cajeros.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajeros(CajerosBean cajerosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.setText(cajerosBean.getId().toString());
			this.jInternalFrameDetalleFormCajeros.jTextAreanombre_cajaCajeros.setText(cajerosBean.getnombre_caja());
			this.jInternalFrameDetalleFormCajeros.jDateChooserfechaCajeros.setDate(cajerosBean.getfecha());
			this.jInternalFrameDetalleFormCajeros.jTextFieldtotalCajeros.setText(cajerosBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajeros(CajerosParameterReturnGeneral cajerosReturnGeneral,CajerosBean cajerosBean,Boolean conDefault) throws Exception { 
		try {
			Cajeros cajerosLocal=new Cajeros();
			
			cajerosLocal=cajerosReturnGeneral.getCajeros();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajerosLocal.getId()!=null && !cajerosLocal.getId().equals(0L))) {cajerosBean.setId(cajerosLocal.getId());}}
			if(conDefault || (!conDefault && cajerosLocal.getnombre_caja()!=null && !cajerosLocal.getnombre_caja().equals(""))) {cajerosBean.setnombre_caja(cajerosLocal.getnombre_caja());}
			if(conDefault || (!conDefault && cajerosLocal.getfecha()!=null && !cajerosLocal.getfecha().equals(new Date()))) {cajerosBean.setfecha(cajerosLocal.getfecha());}
			if(conDefault || (!conDefault && cajerosLocal.gettotal()!=null && !cajerosLocal.gettotal().equals(0.0))) {cajerosBean.settotal(cajerosLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajerosGenerico(Long idCajerosSeleccionado,JComboBox jComboBoxCajeros,List<Cajeros> cajerossLocal)throws Exception {
		try {
			Cajeros  cajerosTemp=null;

			for(Cajeros cajerosAux:cajerossLocal) {
				if(cajerosAux.getId()!=null && cajerosAux.getId().equals(idCajerosSeleccionado)) {
					cajerosTemp=cajerosAux;
					break;
				}
			}

			jComboBoxCajeros.setSelectedItem(cajerosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajerosGenerico(JComboBox jComboBoxCajeros,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajeros.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajeros.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajeros.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajeros.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajeros=(Cajeros) cajerosLogic.getCajeross().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajeros =(Cajeros) cajeross.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajeros.getIsNew() && !cajeros.getIsChanged() && !cajeros.getIsDeleted()) {
				sDescripcion=cajeros.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajeros.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cajeros.getIsNew() && !cajeros.getIsChanged() && !cajeros.getIsDeleted()) {
				sDescripcion=cajeros.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cajeros.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!cajeros.getIsNew() && !cajeros.getIsChanged() && !cajeros.getIsDeleted()) {
				sDescripcion=cajeros.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=cajeros.getcaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Cajeros cajerosRow=new Cajeros();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajerosRow=(Cajeros) cajerosLogic.getCajeross().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajerosRow=(Cajeros) cajeross.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajeros(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajeros.setVisible((this.isVisibilidadCeldaNuevoCajeros && this.isPermisoNuevoCajeros));			
			this.jButtonDuplicarCajeros.setVisible((this.isVisibilidadCeldaDuplicarCajeros && this.isPermisoDuplicarCajeros));			
			this.jButtonCopiarCajeros.setVisible((this.isVisibilidadCeldaCopiarCajeros && this.isPermisoCopiarCajeros));
			this.jButtonVerFormCajeros.setVisible((this.isVisibilidadCeldaVerFormCajeros && this.isPermisoVerFormCajeros));
			
			this.jButtonAbrirOrderByCajeros.setVisible((this.isVisibilidadCeldaOrdenCajeros && this.isPermisoOrdenCajeros));			
			
			this.jButtonNuevoRelacionesCajeros.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajeros && this.isPermisoNuevoCajeros));			
			this.jButtonNuevoGuardarCambiosCajeros.setVisible((this.isVisibilidadCeldaNuevoCajeros && this.isPermisoNuevoCajeros && this.isPermisoGuardarCambiosCajeros));
			
			if(this.jInternalFrameDetalleFormCajeros!=null) {
			this.jInternalFrameDetalleFormCajeros.jButtonModificarCajeros.setVisible((this.isVisibilidadCeldaModificarCajeros && this.isPermisoActualizarCajeros));	
			this.jInternalFrameDetalleFormCajeros.jButtonActualizarCajeros.setVisible((this.isVisibilidadCeldaActualizarCajeros && this.isPermisoActualizarCajeros));	
			this.jInternalFrameDetalleFormCajeros.jButtonEliminarCajeros.setVisible((this.isVisibilidadCeldaEliminarCajeros && this.isPermisoEliminarCajeros));
			this.jInternalFrameDetalleFormCajeros.jButtonCancelarCajeros.setVisible(this.isVisibilidadCeldaCancelarCajeros);							
			this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosCajeros.setVisible((this.isVisibilidadCeldaGuardarCajeros && this.isPermisoGuardarCambiosCajeros));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajeros.setVisible((this.isVisibilidadCeldaGuardarCambiosCajeros && this.isPermisoGuardarCambiosCajeros));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajeros.setVisible((this.isVisibilidadCeldaNuevoCajeros && this.isPermisoNuevoCajeros));						
			this.jButtonDuplicarToolBarCajeros.setVisible((this.isVisibilidadCeldaDuplicarCajeros && this.isPermisoDuplicarCajeros));						
			this.jButtonCopiarToolBarCajeros.setVisible((this.isVisibilidadCeldaCopiarCajeros && this.isPermisoCopiarCajeros));			
			this.jButtonVerFormToolBarCajeros.setVisible((this.isVisibilidadCeldaVerFormCajeros && this.isPermisoVerFormCajeros));			
			this.jButtonAbrirOrderByToolBarCajeros.setVisible((this.isVisibilidadCeldaOrdenCajeros && this.isPermisoOrdenCajeros));
			this.jButtonNuevoRelacionesToolBarCajeros.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajeros && this.isPermisoNuevoCajeros));			
			this.jButtonNuevoGuardarCambiosToolBarCajeros.setVisible((this.isVisibilidadCeldaNuevoCajeros && this.isPermisoNuevoCajeros && this.isPermisoGuardarCambiosCajeros));			
			
			if(this.jInternalFrameDetalleFormCajeros!=null) {
			this.jInternalFrameDetalleFormCajeros.jButtonModificarToolBarCajeros.setVisible((this.isVisibilidadCeldaModificarCajeros && this.isPermisoActualizarCajeros));	
			this.jInternalFrameDetalleFormCajeros.jButtonActualizarToolBarCajeros.setVisible((this.isVisibilidadCeldaActualizarCajeros  && this.isPermisoActualizarCajeros));	
			this.jInternalFrameDetalleFormCajeros.jButtonEliminarToolBarCajeros.setVisible((this.isVisibilidadCeldaEliminarCajeros && this.isPermisoEliminarCajeros));
			this.jInternalFrameDetalleFormCajeros.jButtonCancelarToolBarCajeros.setVisible(this.isVisibilidadCeldaCancelarCajeros);				
			this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosToolBarCajeros.setVisible((this.isVisibilidadCeldaGuardarCajeros && this.isPermisoGuardarCambiosCajeros));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajeros.setVisible((this.isVisibilidadCeldaGuardarCambiosCajeros && this.isPermisoGuardarCambiosCajeros));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajeros.setVisible((this.isVisibilidadCeldaNuevoCajeros && this.isPermisoNuevoCajeros));			
			this.jMenuItemDuplicarCajeros.setVisible((this.isVisibilidadCeldaDuplicarCajeros && this.isPermisoDuplicarCajeros));			
			this.jMenuItemCopiarCajeros.setVisible((this.isVisibilidadCeldaCopiarCajeros && this.isPermisoCopiarCajeros));			
			this.jMenuItemVerFormCajeros.setVisible((this.isVisibilidadCeldaVerFormCajeros && this.isPermisoVerFormCajeros));			
			this.jMenuItemAbrirOrderByCajeros.setVisible((this.isVisibilidadCeldaOrdenCajeros && this.isPermisoOrdenCajeros));			
			//this.jMenuItemMostrarOcultarCajeros.setVisible((this.isVisibilidadCeldaOrdenCajeros && this.isPermisoOrdenCajeros));
			this.jMenuItemDetalleAbrirOrderByCajeros.setVisible((this.isVisibilidadCeldaOrdenCajeros && this.isPermisoOrdenCajeros));			
			//this.jMenuItemDetalleMostrarOcultarCajeros.setVisible((this.isVisibilidadCeldaOrdenCajeros && this.isPermisoOrdenCajeros));			
			this.jMenuItemNuevoRelacionesCajeros.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajeros && this.isPermisoNuevoCajeros));			
			this.jMenuItemNuevoGuardarCambiosCajeros.setVisible((this.isVisibilidadCeldaNuevoCajeros && this.isPermisoNuevoCajeros && this.isPermisoGuardarCambiosCajeros));									
			
			if(this.jInternalFrameDetalleFormCajeros!=null) {
			this.jInternalFrameDetalleFormCajeros.jMenuItemModificarCajeros.setVisible((this.isVisibilidadCeldaModificarCajeros && this.isPermisoActualizarCajeros));	
			this.jInternalFrameDetalleFormCajeros.jMenuItemActualizarCajeros.setVisible((this.isVisibilidadCeldaActualizarCajeros && this.isPermisoActualizarCajeros));	
			this.jInternalFrameDetalleFormCajeros.jMenuItemEliminarCajeros.setVisible((this.isVisibilidadCeldaEliminarCajeros && this.isPermisoEliminarCajeros));
			this.jInternalFrameDetalleFormCajeros.jMenuItemCancelarCajeros.setVisible(this.isVisibilidadCeldaCancelarCajeros);				
			}
			
			this.jMenuItemGuardarCambiosCajeros.setVisible((this.isVisibilidadCeldaGuardarCajeros && this.isPermisoGuardarCambiosCajeros));						
			this.jMenuItemGuardarCambiosTablaCajeros.setVisible((this.isVisibilidadCeldaGuardarCambiosCajeros && this.isPermisoGuardarCambiosCajeros));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajeros=this.jButtonNuevoCajeros.isVisible();
			this.isVisibilidadCeldaDuplicarCajeros=this.jButtonDuplicarCajeros.isVisible();
			this.isVisibilidadCeldaCopiarCajeros=this.jButtonCopiarCajeros.isVisible();
			this.isVisibilidadCeldaVerFormCajeros=this.jButtonVerFormCajeros.isVisible();
			
			this.isVisibilidadCeldaOrdenCajeros=this.jButtonAbrirOrderByCajeros.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajeros=this.jButtonNuevoRelacionesCajeros.isVisible();
			this.isVisibilidadCeldaModificarCajeros=this.jButtonModificarCajeros.isVisible();
			
			if(this.jInternalFrameDetalleFormCajeros!=null) {
			this.isVisibilidadCeldaActualizarCajeros=this.jInternalFrameDetalleFormCajeros.jButtonActualizarCajeros.isVisible();
			this.isVisibilidadCeldaEliminarCajeros=this.jInternalFrameDetalleFormCajeros.jButtonEliminarCajeros.isVisible();
			this.isVisibilidadCeldaCancelarCajeros=this.jInternalFrameDetalleFormCajeros.jButtonCancelarCajeros.isVisible();
			this.isVisibilidadCeldaGuardarCajeros=this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosCajeros.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajeros=this.jButtonGuardarCambiosTablaCajeros.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajeros=this.jButtonNuevoToolBarCajeros.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajeros=this.jButtonNuevoRelacionesToolBarCajeros.isVisible();
			
			if(this.jInternalFrameDetalleFormCajeros!=null) {
			this.isVisibilidadCeldaModificarCajeros=this.jInternalFrameDetalleFormCajeros.jButtonModificarToolBarCajeros.isVisible();
			this.isVisibilidadCeldaActualizarCajeros=this.jInternalFrameDetalleFormCajeros.jButtonActualizarToolBarCajeros.isVisible();
			this.isVisibilidadCeldaEliminarCajeros=this.jInternalFrameDetalleFormCajeros.jButtonEliminarToolBarCajeros.isVisible();
			this.isVisibilidadCeldaCancelarCajeros=this.jInternalFrameDetalleFormCajeros.jButtonCancelarToolBarCajeros.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajeros=this.jButtonGuardarCambiosToolBarCajeros.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajeros=this.jButtonGuardarCambiosTablaToolBarCajeros.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajeros=this.jMenuItemNuevoCajeros.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajeros=this.jMenuItemNuevoRelacionesCajeros.isVisible();
			
			if(this.jInternalFrameDetalleFormCajeros!=null) {
			this.isVisibilidadCeldaModificarCajeros=this.jInternalFrameDetalleFormCajeros.jMenuItemModificarCajeros.isVisible();
			this.isVisibilidadCeldaActualizarCajeros=this.jInternalFrameDetalleFormCajeros.jMenuItemActualizarCajeros.isVisible();
			this.isVisibilidadCeldaEliminarCajeros=this.jInternalFrameDetalleFormCajeros.jMenuItemEliminarCajeros.isVisible();
			this.isVisibilidadCeldaCancelarCajeros=this.jInternalFrameDetalleFormCajeros.jMenuItemCancelarCajeros.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajeros=this.jMenuItemGuardarCambiosCajeros.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajeros=this.jMenuItemGuardarCambiosTablaCajeros.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajeros(Boolean esInicializar) {
		if(CajerosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajerosSessionBean.getConGuardarRelaciones()) {
				//if(this.cajerosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajeros();
			}
			
			this.inicializarActualizarBindingBotonesManualCajeros(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajeros() {
		this.jButtonNuevoCajeros.setVisible(this.isPermisoNuevoCajeros);			
		this.jButtonDuplicarCajeros.setVisible(this.isPermisoDuplicarCajeros);			
		this.jButtonCopiarCajeros.setVisible(this.isPermisoCopiarCajeros);			
		this.jButtonVerFormCajeros.setVisible(this.isPermisoVerFormCajeros);			
		
		this.jButtonAbrirOrderByCajeros.setVisible(this.isPermisoOrdenCajeros);					
		
		this.jButtonNuevoRelacionesCajeros.setVisible(this.isPermisoNuevoCajeros);			
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonModificarCajeros.setVisible(this.isPermisoActualizarCajeros);	
			this.jInternalFrameDetalleFormCajeros.jButtonActualizarCajeros.setVisible(this.isPermisoActualizarCajeros);	
			this.jInternalFrameDetalleFormCajeros.jButtonEliminarCajeros.setVisible(this.isPermisoEliminarCajeros);
			this.jInternalFrameDetalleFormCajeros.jButtonCancelarCajeros.setVisible(this.isVisibilidadCeldaCancelarCajeros);						
			this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosCajeros.setVisible(this.isPermisoGuardarCambiosCajeros);							
		}
		
		this.jButtonGuardarCambiosTablaCajeros.setVisible(this.isPermisoActualizarCajeros);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajeros() {
		this.jInternalFrameDetalleFormCajeros.jButtonModificarCajeros.setVisible(this.isPermisoActualizarCajeros);	
		this.jInternalFrameDetalleFormCajeros.jButtonActualizarCajeros.setVisible(this.isPermisoActualizarCajeros);	
		this.jInternalFrameDetalleFormCajeros.jButtonEliminarCajeros.setVisible(this.isPermisoEliminarCajeros);
		this.jInternalFrameDetalleFormCajeros.jButtonCancelarCajeros.setVisible(this.isVisibilidadCeldaCancelarCajeros);							
		this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosCajeros.setVisible((this.isVisibilidadCeldaGuardarCajeros && this.isPermisoGuardarCambiosCajeros));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajeros() {
		if(CajerosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajeros();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajeros() {
	}
	
	public void jTableDatosCajerosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajeros(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajeros.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajerosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajeros(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajerosLogic.getConnexion());

				if(this.cajeros.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajeros.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeros=(TitledBorder)this.jScrollPanelDatosCajeros.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajeros.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajeros.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCajerosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCajeros(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cajerosLogic.getConnexion());

				if(this.cajeros.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cajeros.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeros=(TitledBorder)this.jScrollPanelDatosCajeros.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCajeros.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cajeros.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaCajerosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebCajeros(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.cajerosLogic.getConnexion());

				if(this.cajeros.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.cajeros.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeros=(TitledBorder)this.jScrollPanelDatosCajeros.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderCajeros.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.cajeros.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.cajeros.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.cajeros.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cajaCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.getnombre_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_caja like '%"+this.cajeros.getnombre_caja()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.cajeros.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalCajerosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeros(this.getcajeros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeros==null) {
						this.cajeros = new Cajeros();
					}

					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);
				}

				if(this.cajeros.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.cajeros.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCajerosCajerosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeros(false,false);

			this.getCajerossBusquedaCajeros();

			this.inicializarActualizarBindingCajeros(false);

			//if(CajerosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCajaCajerosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeros(false,false);

			this.getCajerossFK_IdCaja();

			this.inicializarActualizarBindingCajeros(false);

			//if(CajerosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajerosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeros(false,false);

			this.getCajerossFK_IdEmpresa();

			this.inicializarActualizarBindingCajeros(false);

			//if(CajerosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCajerosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeros(false,false);

			this.getCajerossFK_IdSucursal();

			this.inicializarActualizarBindingCajeros(false);

			//if(CajerosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajerosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajeros() {
		if(this.jInternalFrameDetalleFormCajeros!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajeros!=null) {
			this.jInternalFrameDetalleFormCajeros.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajeros.dispose();
			this.jInternalFrameDetalleFormCajeros=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajeros!=null) {
			this.jInternalFrameReporteDinamicoCajeros.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajeros.dispose();
			this.jInternalFrameReporteDinamicoCajeros=null;
		}
		
		if(this.jInternalFrameImportacionCajeros!=null) {
			this.jInternalFrameImportacionCajeros.setVisible(false);	    			
			this.jInternalFrameImportacionCajeros.dispose();
			this.jInternalFrameImportacionCajeros=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajeros();
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajeros")) {
				jButtonNuevoCajerosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajeros")) {
				jButtonDuplicarCajerosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajeros")) {
				jButtonCopiarCajerosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajeros")) {
				jButtonVerFormCajerosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajeros")) {
				jButtonNuevoCajerosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajeros")) {
				jButtonDuplicarCajerosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajeros")) {
				jButtonNuevoCajerosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajeros")) {
				jButtonDuplicarCajerosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajeros")) {
				jButtonNuevoCajerosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajeros")) {
				jButtonNuevoCajerosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajeros")) {
				jButtonNuevoCajerosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajeros")) {
				jButtonModificarCajerosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajeros")) {
				jButtonModificarCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajeros")) {
				jButtonModificarCajerosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajeros")) {
				jButtonActualizarCajerosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajeros")) {
				jButtonActualizarCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajeros")) {
				jButtonActualizarCajerosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajeros")) {
				jButtonEliminarCajerosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajeros")) {
				jButtonEliminarCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajeros")) {
				jButtonEliminarCajerosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajeros")) {
				jButtonCancelarCajerosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajeros")) {
				jButtonCancelarCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajeros")) {
				jButtonCancelarCajerosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajeros")) {
				jButtonCerrarCajerosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajeros")) {
				jButtonCerrarCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajeros")) {
				jButtonCerrarCajerosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajeros")) {
				jButtonMostrarOcultarCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajeros")) {
				jButtonCancelarCajerosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajeros")) {
				jButtonGuardarCambiosCajerosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajeros")) {
				jButtonGuardarCambiosCajerosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajeros")) {
				jButtonCopiarCajerosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajeros")) {
				jButtonVerFormCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajeros")) {
				jButtonGuardarCambiosCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajeros")) {
				jButtonCopiarCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajeros")) {
				jButtonVerFormCajerosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajeros")) {
				jButtonGuardarCambiosCajerosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajeros")) {
				jButtonGuardarCambiosCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajeros")) {
				jButtonGuardarCambiosCajerosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajeros")) {
				jButtonRecargarInformacionCajerosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajeros")) {
				jButtonRecargarInformacionCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajeros")) {
				jButtonRecargarInformacionCajerosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajeros")) {
				jButtonAnterioresCajerosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajeros")) {
				jButtonAnterioresCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajeros")) {
				jButtonAnterioresCajerosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajeros")) {
				jButtonSiguientesCajerosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajeros")) {
				jButtonSiguientesCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajeros")) {
				jButtonSiguientesCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajeros") || sTipo.equals("MenuItemDetalleAbrirOrderByCajeros")) {
				jButtonAbrirOrderByCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajeros") || sTipo.equals("MenuItemDetalleMostrarOcultarCajeros")) {
				jButtonMostrarOcultarCajerosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajeros")) {
				jButtonNuevoGuardarCambiosCajerosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajeros")) {
				jButtonNuevoGuardarCambiosCajerosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajeros")) {
				jButtonNuevoGuardarCambiosCajerosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajeros")) {
				jButtonCerrarReporteDinamicoCajerosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajeros")) {
				jButtonGenerarReporteDinamicoCajerosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajeros")) {
				
				jButtonGenerarExcelReporteDinamicoCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajeros")) {
				jButtonCerrarImportacionCajerosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajeros")) {
				
				jButtonGenerarImportacionCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajeros")) {
				
				jButtonAbrirImportacionCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajeros")) {
				jComboBoxTiposAccionesCajerosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajeros")) {
				jComboBoxTiposRelacionesCajerosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajeros")) {
				jComboBoxTiposAccionesCajerosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajeros")) {
				
				jComboBoxTiposSeleccionarCajerosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajeros")) {
				jTextFieldValorCampoGeneralCajerosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajeros")) {
				jButtonAbrirOrderByCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajeros")) {
				jButtonAbrirOrderByCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajeros")) {
				jButtonCerrarOrderByCajerosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajerosBusqueda")) {
				this.jButtonidCajerosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajerosUpdate")) {
				this.jButtonid_empresaCajerosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajerosBusqueda")) {
				this.jButtonid_empresaCajerosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajerosUpdate")) {
				this.jButtonid_sucursalCajerosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajerosBusqueda")) {
				this.jButtonid_sucursalCajerosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajerosUpdate")) {
				this.jButtonid_cajaCajerosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajerosBusqueda")) {
				this.jButtonid_cajaCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioCajerosBusqueda")) {
				this.jButtonfecha_inicioCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finCajerosBusqueda")) {
				this.jButtonfecha_finCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaCajerosBusqueda")) {
				this.jButtonnombre_cajaCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCajerosBusqueda")) {
				this.jButtonfechaCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCajerosBusqueda")) {
				this.jButtontotalCajerosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCajerosCajeros")) {
				this.jButtonBusquedaCajerosCajerosActionPerformed(evt);
			}
			
			;
			
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajeros();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajerosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				


				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Cajeros cajerosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajerosLocal=this.cajeros;
			} else {
				cajerosLocal=this.cajerosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
							
				
				


				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajerosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosAnterior =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajerosAnterior =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
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
			
			


			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajerosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
								
						
				


				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
								
				
				


				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajerosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosAnterior =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajerosAnterior =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajerosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosAnterior =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajerosAnterior =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajerosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
							
				
				


				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajerosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajerosAnterior =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajerosAnterior =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
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
			
			


			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajerosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
								
				
				


				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajerosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosAnterior =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajerosAnterior =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajerosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajerosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajeros")) {
					jCheckBoxSeleccionarTodosCajerosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajeros")) {
					jCheckBoxSeleccionadosCajerosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajeros")) {
					
				}
				
				


				
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
												
				
				


				
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajerosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajerosAnterior =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajerosAnterior =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajerosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
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
			
			


			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajerosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeros);
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
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
				
				


				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cajeros.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cajeros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajerosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajerosAnterior =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajerosAnterior =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajeros")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajerosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajeros.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajeros =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajeros =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajeros);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajeros")) {
				
				}
				
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajeros")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajeros.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajeros")) {
			
			}
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajeros();
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
			if(sTipo.equals("NuevoCajeros")) {
				jButtonNuevoCajerosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajeros")) {
				jButtonDuplicarCajerosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajeros")) {
				jButtonCopiarCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajeros")) {
				jButtonVerFormCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajeros")) {
				jButtonNuevoCajerosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajeros")) {
				jButtonModificarCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajeros")) {
				jButtonActualizarCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajeros")) {
				jButtonEliminarCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajeros")) {
				jButtonGuardarCambiosCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajeros")) {
				jButtonCancelarCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajeros")) {
				jButtonCerrarCajerosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajeros")) {
				jButtonGuardarCambiosCajerosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajeros")) {
				jButtonNuevoGuardarCambiosCajerosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajeros")) {
				jButtonAbrirOrderByCajerosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajeros")) {
				jButtonRecargarInformacionCajerosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajeros")) {
				jButtonAnterioresCajerosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajeros")) {
				jButtonSiguientesCajerosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajerosBusqueda")) {
				this.jButtonidCajerosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajerosUpdate")) {
				this.jButtonid_empresaCajerosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajerosBusqueda")) {
				this.jButtonid_empresaCajerosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajerosUpdate")) {
				this.jButtonid_sucursalCajerosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajerosBusqueda")) {
				this.jButtonid_sucursalCajerosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajerosUpdate")) {
				this.jButtonid_cajaCajerosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajerosBusqueda")) {
				this.jButtonid_cajaCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioCajerosBusqueda")) {
				this.jButtonfecha_inicioCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finCajerosBusqueda")) {
				this.jButtonfecha_finCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaCajerosBusqueda")) {
				this.jButtonnombre_cajaCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCajerosBusqueda")) {
				this.jButtonfechaCajerosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCajerosBusqueda")) {
				this.jButtontotalCajerosBusquedaActionPerformed(evt);
			}
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajeros();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajeros")) {
				closingInternalFrameCajeros();
				
			} else if(sTipo.equals("jButtonCancelarCajeros")) {
				JInternalFrameBase jInternalFrameDetalleFormCajeros = (JInternalFrameBase)evt.getSource();
	            	
	            CajerosBeanSwingJInternalFrame jInternalFrameParent=(CajerosBeanSwingJInternalFrame)jInternalFrameDetalleFormCajeros.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajerosActionPerformed(null);
			}
			
			CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajeros,new Object(),this.cajerosParameterGeneral,this.cajerosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajeros(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajeros(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajeros(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajeros)) {
			if(!esControlTabla) {
				if(CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);			
				}
				
				if(this.cajerosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajeros(this.cajeros,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajeros(this.cajerosReturnGeneral,this.cajerosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajerosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajeros(classes,this.cajerosReturnGeneral,this.cajerosBean,false);
					}
						
					if(this.cajerosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajeros(this.cajerosReturnGeneral.getCajeros());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajeros(this.cajerosReturnGeneral.getCajeros());	
					}
						
					if(this.cajerosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajeros(this.cajerosReturnGeneral.getCajeros(),classes);//this.cajerosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajeros(this.cajeros,classes);//this.cajerosBean);									
				}
			
				if(CajerosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajeros(this.cajeros,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeros(this.cajeros);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajerosAnterior!=null) {
						this.cajeros=this.cajerosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajerosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajerosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajerosReturnGeneral.getCajeros(),cajerosLogic.getCajeross());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajerosReturnGeneral.getCajeros(),this.cajeross);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajeros.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajeros.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajeros();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajeros() throws Exception {
		
		CajerosModel cajerosModel=(CajerosModel)this.jTableDatosCajeros.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajerosModel.cajeross=this.cajerosLogic.getCajeross();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajerosModel.cajeross=this.cajeross;
		}
		
		
		((CajerosModel) this.jTableDatosCajeros.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajeros() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajerosAnterior(),this.cajerosLogic.getCajeross());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajerosAnterior(),this.cajeross);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajeros();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajeros(Cajeros cajeros,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
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
										
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajeros,new Object(),generalEntityParameterGeneral,this.cajerosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajerosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajerosConstantesFunciones.getClassesRelationshipsOfCajeros(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajerosConstantesFunciones.getClassesRelationshipsFromStringsOfCajeros(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajeros(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajerosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajeros,new Object(),generalEntityParameterGeneral,this.cajerosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajeros(CajerosBean cajerosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajeros(ArrayList<Classe> classes,CajerosReturnGeneral cajerosReturnGeneral,CajerosBean cajerosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajeros(Cajeros cajeros,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cajeros)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajeros = new CajerosDetalleFormJInternalFrame(jDesktopPane,this.cajerosSessionBean.getConGuardarRelaciones(),this.cajerosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajeros);
		this.jInternalFrameDetalleFormCajeros.setVisible(false);
		this.jInternalFrameDetalleFormCajeros.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajeros.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajeros.cajerosLogic=this.cajerosLogic;
		
		this.cargarCombosFrameForeignKeyCajeros("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajeros();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajeros();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajeros("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajeros();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajeros.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajeros"));
		
		this.jInternalFrameDetalleFormCajeros.jButtonModificarCajeros.addActionListener(new ButtonActionListener(this,"ModificarCajeros"));

		
		this.jInternalFrameDetalleFormCajeros.jButtonModificarToolBarCajeros.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajeros"));
					
		this.jInternalFrameDetalleFormCajeros.jMenuItemModificarCajeros.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajeros"));		
		
		
		
		this.jInternalFrameDetalleFormCajeros.jButtonActualizarCajeros.addActionListener (new ButtonActionListener(this,"ActualizarCajeros"));
		
		
		this.jInternalFrameDetalleFormCajeros.jButtonActualizarToolBarCajeros.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajeros"));
						
		this.jInternalFrameDetalleFormCajeros.jMenuItemActualizarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajeros"));		
		
		
		
		this.jInternalFrameDetalleFormCajeros.jButtonEliminarCajeros.addActionListener (new ButtonActionListener(this,"EliminarCajeros"));
		
		
		this.jInternalFrameDetalleFormCajeros.jButtonEliminarToolBarCajeros.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajeros"));
								
		this.jInternalFrameDetalleFormCajeros.jMenuItemEliminarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajeros"));		
		
		
		
		this.jInternalFrameDetalleFormCajeros.jButtonCancelarCajeros.addActionListener (new ButtonActionListener(this,"CancelarCajeros"));
		
		
		this.jInternalFrameDetalleFormCajeros.jButtonCancelarToolBarCajeros.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajeros"));
					
		this.jInternalFrameDetalleFormCajeros.jMenuItemCancelarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajeros"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajeros.jMenuItemDetalleCerrarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajeros"));		
		
		
		
		this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosToolBarCajeros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajeros"));
		
		
		
		this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosToolBarCajeros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajeros"));
		
		
		
		this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajeros"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonidCajerosBusqueda.addActionListener(new ButtonActionListener(this,"idCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_empresaCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_empresaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_sucursalCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_sucursalCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_cajaCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_cajaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfecha_inicioCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfecha_finCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonnombre_cajaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfechaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtontotalCajerosBusqueda.addActionListener(new ButtonActionListener(this,"totalCajerosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajeros"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajeros"));
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajeros"));
		}
		
		this.jTableDatosCajeros.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajeros"));
		
		this.jTableDatosCajeros.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajeros"));
		
		this.jButtonNuevoCajeros.addActionListener(new ButtonActionListener(this,"NuevoCajeros"));
		
		this.jButtonDuplicarCajeros.addActionListener(new ButtonActionListener(this,"DuplicarCajeros"));
		
		this.jButtonCopiarCajeros.addActionListener(new ButtonActionListener(this,"CopiarCajeros"));
		
		this.jButtonVerFormCajeros.addActionListener(new ButtonActionListener(this,"VerFormCajeros"));
		
		
		this.jButtonNuevoToolBarCajeros.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajeros"));
			
		this.jButtonDuplicarToolBarCajeros.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajeros"));
			
		this.jMenuItemNuevoCajeros.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajeros"));
			
		this.jMenuItemDuplicarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajeros"));		
		
		
		this.jButtonNuevoRelacionesCajeros.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajeros"));
		
		
		this.jButtonNuevoRelacionesToolBarCajeros.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajeros"));
			
		this.jMenuItemNuevoRelacionesCajeros.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajeros"));		
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonModificarCajeros.addActionListener(new ButtonActionListener(this,"ModificarCajeros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonModificarToolBarCajeros.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajeros"));
			
			this.jInternalFrameDetalleFormCajeros.jMenuItemModificarCajeros.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajeros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajeros.jButtonActualizarCajeros.addActionListener (new ButtonActionListener(this,"ActualizarCajeros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonActualizarToolBarCajeros.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajeros"));
				
			this.jInternalFrameDetalleFormCajeros.jMenuItemActualizarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajeros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonEliminarCajeros.addActionListener (new ButtonActionListener(this,"EliminarCajeros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonEliminarToolBarCajeros.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajeros"));
						
			this.jInternalFrameDetalleFormCajeros.jMenuItemEliminarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajeros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonCancelarCajeros.addActionListener (new ButtonActionListener(this,"CancelarCajeros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonCancelarToolBarCajeros.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajeros"));
			
			this.jInternalFrameDetalleFormCajeros.jMenuItemCancelarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajeros"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajeros.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajeros"));		
		
		
		this.jButtonCerrarCajeros.addActionListener (new ButtonActionListener(this,"CerrarCajeros"));
		
		
		this.jButtonCerrarToolBarCajeros.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajeros"));
			
		this.jMenuItemCerrarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajeros"));
			
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jMenuItemDetalleCerrarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajeros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosCajeros.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajeros"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosToolBarCajeros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajeros"));
		}
		
		this.jButtonCopiarToolBarCajeros.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajeros"));
			
		this.jButtonVerFormToolBarCajeros.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajeros"));
		
		this.jMenuItemGuardarCambiosCajeros.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajeros"));
			
		this.jMenuItemCopiarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajeros"));		
		
		this.jMenuItemVerFormCajeros.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajeros"));		
		
		
		this.jButtonGuardarCambiosTablaCajeros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajeros"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajeros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajeros"));
			
		this.jMenuItemGuardarCambiosTablaCajeros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajeros"));		
		
		
		
		this.jButtonRecargarInformacionCajeros.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajeros"));
					
		this.jButtonRecargarInformacionToolBarCajeros.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajeros"));
		
		this.jMenuItemRecargarInformacionCajeros.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajeros"));		
		
		
		
		this.jButtonAnterioresCajeros.addActionListener (new ButtonActionListener(this,"AnterioresCajeros"));
		
		
		this.jButtonAnterioresToolBarCajeros.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajeros"));
		
		this.jMenuItemAnterioresCajeros.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajeros"));		
		
		
		this.jButtonSiguientesCajeros.addActionListener (new ButtonActionListener(this,"SiguientesCajeros"));
		
		
		this.jButtonSiguientesToolBarCajeros.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajeros"));
			
		this.jMenuItemSiguientesCajeros.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajeros"));
			
		this.jMenuItemAbrirOrderByCajeros.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajeros"));
			
		this.jMenuItemMostrarOcultarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajeros"));
			
		this.jMenuItemDetalleAbrirOrderByCajeros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajeros"));
			
		this.jMenuItemDetalleMostarOcultarCajeros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajeros"));		
		
		
		this.jButtonNuevoGuardarCambiosCajeros.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajeros"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajeros.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajeros"));
			
		this.jMenuItemNuevoGuardarCambiosCajeros.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajeros"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajeros.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajeros"));

		this.jCheckBoxSeleccionadosCajeros.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajeros"));
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajeros"));
		}
		
		
		this.jComboBoxTiposRelacionesCajeros.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajeros"));
			
		this.jComboBoxTiposAccionesCajeros.addActionListener (new ButtonActionListener(this,"TiposAccionesCajeros"));
					
		this.jComboBoxTiposSeleccionarCajeros.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajeros"));
			
		this.jTextFieldValorCampoGeneralCajeros.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajeros"));		
		
		
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonidCajerosBusqueda.addActionListener(new ButtonActionListener(this,"idCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_empresaCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_empresaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_sucursalCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_sucursalCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_cajaCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_cajaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfecha_inicioCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfecha_finCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonnombre_cajaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfechaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtontotalCajerosBusqueda.addActionListener(new ButtonActionListener(this,"totalCajerosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCajerosCajeros.addActionListener(new ButtonActionListener(this,"BusquedaCajerosCajeros"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajeros!=null) {
				this.jInternalFrameReporteDinamicoCajeros.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajeros"));
				this.jInternalFrameReporteDinamicoCajeros.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajeros"));
				this.jInternalFrameReporteDinamicoCajeros.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajeros"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajeros.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajeros"));				
			//this.jButtonGenerarReporteDinamicoCajeros.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajeros"));
			//this.jButtonGenerarExcelReporteDinamicoCajeros.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajeros"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajeros!=null) {
				this.jInternalFrameImportacionCajeros.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajeros"));
				this.jInternalFrameImportacionCajeros.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajeros"));
				this.jInternalFrameImportacionCajeros.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajeros"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajeros.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajeros"));
			
			this.jButtonAbrirOrderByToolBarCajeros.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajeros"));			
			
			if(this.jInternalFrameOrderByCajeros!=null) {
				this.jInternalFrameOrderByCajeros.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajeros"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajeros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeros.jTabbedPaneRelacionesCajeros.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajeros"));
		
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
            		closingInternalFrameCajeros();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajeros.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajeros = (JInternalFrameBase)event.getSource();
	            	
	            CajerosBeanSwingJInternalFrame jInternalFrameParent=(CajerosBeanSwingJInternalFrame)jInternalFrameDetalleFormCajeros.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajerosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajeros.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajerosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajeros.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajeros.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajerosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajerosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajerosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajeros";
		inputMap = this.jButtonNuevoCajeros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajeros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajerosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajerosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajerosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajerosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajeros";
		inputMap = this.jButtonNuevoRelacionesCajeros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajeros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajerosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajeros";
		inputMap = this.jButtonModificarCajeros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajeros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajerosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajeros";
		inputMap = this.jButtonActualizarCajeros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajeros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajerosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajeros";
		inputMap = this.jButtonEliminarCajeros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajeros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajerosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajeros";
		inputMap = this.jButtonCancelarCajeros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajeros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajerosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajeros";
		inputMap = this.jButtonCerrarCajeros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajeros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajerosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajeros";
		inputMap = this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosCajeros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajeros.jButtonGuardarCambiosCajeros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajerosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajeros.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajerosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajeros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajerosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajeros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajerosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajeros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajerosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonidCajerosBusqueda.addActionListener(new ButtonActionListener(this,"idCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_empresaCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_empresaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_sucursalCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_sucursalCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajerosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeros.jButtonid_cajaCajerosUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajerosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonid_cajaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfecha_inicioCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfecha_finCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonnombre_cajaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtonfechaCajerosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCajerosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeros.jButtontotalCajerosBusqueda.addActionListener(new ButtonActionListener(this,"totalCajerosBusqueda"));
		
		
		this.jButtonBusquedaCajerosCajeros.addActionListener(new ButtonActionListener(this,"BusquedaCajerosCajeros"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajeros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajerosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajerosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajeros.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajeros(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
					cajerosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cajeros cajerosAux:cajeross) {
					cajerosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajerosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajeros(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
						cajerosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cajeros cajerosAux:cajeross) {
						cajerosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cajeros cajerosAux:cajeross) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajeros(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajeros.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajeros.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajeros,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajerosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajeros(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajeros.getSelectedRows();
			
			Cajeros cajerosLocal=new Cajeros();
			
			//this.seleccionarTodosCajeros(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajerosLocal =(Cajeros) this.cajerosLogic.getCajeross().toArray()[this.jTableDatosCajeros.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajerosLocal =(Cajeros) this.cajeross.toArray()[this.jTableDatosCajeros.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajerosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
						cajerosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cajeros cajerosAux:cajeross) {
						cajerosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajeros(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajeros.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajeros.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajeros,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajerosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajerosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajerosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajeros(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajeros.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cajeros cajerosAux:this.cajerosLogic.getCajeross()) {
				
						if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							cajerosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							cajerosAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							cajerosAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cajerosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cajerosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cajeros cajerosAux:cajeross) {
					
						if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							cajerosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							cajerosAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							cajerosAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cajerosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cajerosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajeros(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajerosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajeros(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajeros=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajeros.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajeros) {				
					conSplash=true;//false;										
					
					//this.startProcessCajeros(conSplash);
				
					this.generarReporteCajerossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajerossSeleccionados();
				//this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajerossSeleccionados(false);
				//this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajerossSeleccionados(true);
				//this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajeros();
				
				this.exportarCajerossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajeross();
				//this.importarCajeross();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajeros();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajerossSeleccionados();
				//this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cajeros", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajeros();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajeros)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajeros(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.setSelectedIndex(0);					
				}	
			} 			
			else if(CajerosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajeros) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajeros(conSplash);
					
						//this.actualizarParametrosGeneralCajeros();
						
						this.generarReporteProcesoAccionCajerossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajerosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CajerosES SELECCIONADOS?", "MANTENIMIENTO DE Cajeros", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajeros();
				
						this.actualizarParametrosGeneralCajeros();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajerosReturnGeneral=cajerosLogic.procesarAccionCajerossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajerosLogic.getCajeross(),this.cajerosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajerosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajeros();
					
					CajerosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajerosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajeros.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajeros.jComboBoxTiposAccionesFormularioCajeros.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajeros(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajerosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajeros();
			
			if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		
			Cajeros cajeros=new Cajeros();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajeros(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajeros.getSelectedItem();
			
			
			
			
			cajerossSeleccionados=this.getCajerossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajerossSeleccionados.size()==1) {
				for(Cajeros cajerosAux:cajerossSeleccionados) {
					cajeros=cajerosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajeros();
			
      		//this.finishProcessCajeros(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajerosReturnGeneral() throws Exception {
		if(this.cajerosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajerosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajerosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajerosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajerosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajerosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajeros(false);
		}
		
		if(this.cajerosReturnGeneral.getConRetornoLista() || this.cajerosReturnGeneral.getConRetornoObjeto()) {
			if(this.cajerosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajerosLogic.setCajeross(this.cajerosReturnGeneral.getCajeross());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCajeros(false);
		}
	}
	
	public void actualizarParametrosGeneralCajeros() throws Exception {
		
		
	}
	
	public ArrayList<Cajeros> getCajerossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajeros) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Cajeros cajerosAux:cajerosLogic.getCajeross()) {
					if(cajerosAux.getIsSelected()) {
						cajerossSeleccionados.add(cajerosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cajeros cajerosAux:this.cajeross) {
					if(cajerosAux.getIsSelected()) {
						cajerossSeleccionados.add(cajerosAux);				
					}
				}
			}
			
			if(cajerossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajerossSeleccionados.addAll(this.cajerosLogic.getCajeross());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajerossSeleccionados.addAll(this.cajeross);				
					}
				}
			}
		} else {
			cajerossSeleccionados.add(this.cajeros);
		}
		
		return cajerossSeleccionados;
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
	
	public void generarReporteCajerossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajerossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajerossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajerossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajerossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cajeros",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajerossSeleccionados() throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajeross("Todos",cajerossSeleccionados);
		
	}	
	
	public void generarReporteNormalCajerossSeleccionados() throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajeross("Todos",cajerossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajerossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajeross("Todos",cajerossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajerossSeleccionados() throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajeros();
		
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajeros();
		
		
		//this.generarReporteCajeross("Todos",cajerossSeleccionados ,cajerosImplementable,cajerosImplementableHome);
	}
	
	public void mostrarImportacionCajeross() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajeros();
		
		this.abrirFrameImportacionCajeros();		
		
			
		//this.generarReporteCajeross("Todos",cajerossSeleccionados ,cajerosImplementable,cajerosImplementableHome);
	}
	
	public void importarCajeross() throws Exception {		
	
	}
	
	public void exportarCajerossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajerossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajerossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajerossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cajeros",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajerossSeleccionados() throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeros."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajeros(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Cajeros cajerosAux:cajerossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajeros(cajerosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajerosAux.setsDetalleGeneralEntityReporte(cajerosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajeros(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_NOMBRECAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajerosConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajeros(Cajeros cajeros,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajeros.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.getnombre_caja();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeros.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajerossSeleccionados() throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeros.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Cajeross");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajeros(row);				
				iRow++;
			}				
			
			for(Cajeros cajerosAux:cajerossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajeros(cajerosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajerossSeleccionados() throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();		
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeros.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajeross");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajeros");
			//elementRoot.appendChild(element);
		
			for(Cajeros cajerosAux:cajerossSeleccionados) {
				element = document.createElement("cajeros");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajeros(cajerosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajeros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajeros(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_NOMBRECAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajerosConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajeros(Cajeros cajeros,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.getnombre_caja());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeros.gettotal());				
	}
	
	public void setFilaDatosExportarXmlCajeros(Cajeros cajeros,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajerosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajeros.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajerosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajeros.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CajerosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajeros.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CajerosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cajeros.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcaja_descripcion = document.createElement(CajerosConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(cajeros.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementfecha_inicio = document.createElement(CajerosConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(cajeros.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(CajerosConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(cajeros.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnombre_caja = document.createElement(CajerosConstantesFunciones.NOMBRECAJA);
		elementnombre_caja.appendChild(document.createTextNode(cajeros.getnombre_caja().trim()));
		element.appendChild(elementnombre_caja);

		Element elementfecha = document.createElement(CajerosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(cajeros.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementtotal = document.createElement(CajerosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(cajeros.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoCajerossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Cajeros> cajerossSeleccionados=new ArrayList<Cajeros>();
		
		cajerossSeleccionados=this.getCajerossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCajeros(cajerossSeleccionados);
		
		this.generarReporteCajeross("Todos",cajerossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajeros(ArrayList<Cajeros> cajerossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Cajeros cajerosAux:cajerossSeleccionados) {
				cajerosAux.setsDetalleGeneralEntityReporte(cajerosAux.toString());
			
				if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajerosAux.setsDescripcionGeneralEntityReporte1(cajerosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cajerosAux.setsDescripcionGeneralEntityReporte1(cajerosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					cajerosAux.setsDescripcionGeneralEntityReporte1(cajerosAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					cajerosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajerosAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					cajerosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajerosAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_NOMBRECAJA)) {
					existe=true;
					cajerosAux.setsDescripcionGeneralEntityReporte1(cajerosAux.getnombre_caja());
				}
				 else if(sTipoSeleccionar.equals(CajerosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					cajerosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajerosAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajerosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajeros(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajeros=true;
				this.isVisibilidadCeldaNuevoRelacionesCajeros=true;
				this.isVisibilidadCeldaGuardarCambiosCajeros=true;
			}
			
			this.isVisibilidadCeldaModificarCajeros=false;
			this.isVisibilidadCeldaActualizarCajeros=false;
			this.isVisibilidadCeldaEliminarCajeros=false;
			this.isVisibilidadCeldaCancelarCajeros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeros=true;
				} else {
					this.isVisibilidadCeldaGuardarCajeros=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajeros=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
			this.isVisibilidadCeldaGuardarCambiosCajeros=false;
			this.isVisibilidadCeldaModificarCajeros=false;
			this.isVisibilidadCeldaActualizarCajeros=true;
			this.isVisibilidadCeldaEliminarCajeros=false;
			this.isVisibilidadCeldaCancelarCajeros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeros=true;
				} else {
					this.isVisibilidadCeldaGuardarCajeros=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajeros=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
			this.isVisibilidadCeldaGuardarCambiosCajeros=false;
			this.isVisibilidadCeldaModificarCajeros=false;
			this.isVisibilidadCeldaActualizarCajeros=true;
			this.isVisibilidadCeldaEliminarCajeros=true;
			this.isVisibilidadCeldaCancelarCajeros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeros=true;
				} else {
					this.isVisibilidadCeldaGuardarCajeros=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajeros=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
			this.isVisibilidadCeldaGuardarCambiosCajeros=false;
			this.isVisibilidadCeldaModificarCajeros=false;
			this.isVisibilidadCeldaActualizarCajeros=true;
			this.isVisibilidadCeldaEliminarCajeros=false;
			this.isVisibilidadCeldaCancelarCajeros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeros=false;
				} else {
					this.isVisibilidadCeldaGuardarCajeros=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajeros=true;
			this.isVisibilidadCeldaNuevoRelacionesCajeros=true;
			this.isVisibilidadCeldaGuardarCambiosCajeros=true;
			this.isVisibilidadCeldaModificarCajeros=false;
			this.isVisibilidadCeldaActualizarCajeros=false;
			this.isVisibilidadCeldaEliminarCajeros=false;
			this.isVisibilidadCeldaCancelarCajeros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeros=true;
				} else {
					this.isVisibilidadCeldaGuardarCajeros=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajeros=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
			this.isVisibilidadCeldaGuardarCambiosCajeros=false;
			this.isVisibilidadCeldaActualizarCajeros=false;
			this.isVisibilidadCeldaEliminarCajeros=false;
			this.isVisibilidadCeldaCancelarCajeros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeros=false;
				} else {
					this.isVisibilidadCeldaGuardarCajeros=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajeros=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
			this.isVisibilidadCeldaGuardarCambiosCajeros=false;
			this.isVisibilidadCeldaModificarCajeros=true;
			this.isVisibilidadCeldaActualizarCajeros=false;
			this.isVisibilidadCeldaEliminarCajeros=false;
			this.isVisibilidadCeldaCancelarCajeros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeros=false;
				} else {
					this.isVisibilidadCeldaGuardarCajeros=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajerosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajeros=true;
			this.isVisibilidadCeldaNuevoRelacionesCajeros=true;
			this.isVisibilidadCeldaGuardarCambiosCajeros=true;
		} else {
			this.actualizarEstadoPanelsCajeros(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajeros=false;
			//this.isVisibilidadCeldaVerFormCajeros=false;
			this.isVisibilidadCeldaDuplicarCajeros=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajerosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
		} else {
			this.isVisibilidadCeldaNuevoCajeros=false;
			this.isVisibilidadCeldaGuardarCambiosCajeros=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajerosSessionBean.getEsGuardarRelacionado()) {
			if(!cajerosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajeros=false;												
			}
			
			this.jButtonCerrarCajeros.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
		}
		
		if(!this.permiteMantenimiento(this.cajeros)) {
			this.isVisibilidadCeldaActualizarCajeros=false;
			this.isVisibilidadCeldaEliminarCajeros=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCajeros=false;
		this.isVisibilidadCeldaNuevoRelacionesCajeros=false;
		this.isVisibilidadCeldaGuardarCambiosCajeros=false;
		//this.isVisibilidadCeldaModificarCajeros=true;
		this.isVisibilidadCeldaActualizarCajeros=false;
		this.isVisibilidadCeldaEliminarCajeros=false;
		//this.isVisibilidadCeldaCancelarCajeros=true;			
		this.isVisibilidadCeldaGuardarCajeros=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajeros() {
	}
	
	public void actualizarEstadoPanelsCajeros(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajeros!=null) {
				this.jScrollPanelDatosEdicionCajeros.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeros!=null) {
				this.jTabbedPaneBusquedasCajeros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajeros!=null) {
				this.jScrollPanelDatosCajeros.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajeros!=null) {
				this.jPanelPaginacionCajeros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajeros!=null) {
				this.jScrollPanelDatosEdicionCajeros.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeros!=null) {
				this.jTabbedPaneBusquedasCajeros.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajeros!=null) {
				this.jScrollPanelDatosCajeros.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajeros!=null) {
				this.jPanelPaginacionCajeros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajeros!=null) {
				this.jScrollPanelDatosEdicionCajeros.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeros!=null) {
				this.jTabbedPaneBusquedasCajeros.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajeros!=null) {
				this.jScrollPanelDatosCajeros.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajeros!=null) {
				this.jPanelPaginacionCajeros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajeros!=null) {
				this.jScrollPanelDatosEdicionCajeros.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeros!=null) {
				this.jTabbedPaneBusquedasCajeros.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajeros!=null) {
				this.jScrollPanelDatosCajeros.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajeros!=null) {
				this.jPanelPaginacionCajeros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajeros!=null) {
				this.jScrollPanelDatosEdicionCajeros.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeros!=null) {
				this.jTabbedPaneBusquedasCajeros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajeros!=null) {
				this.jScrollPanelDatosCajeros.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajeros!=null) {
				this.jPanelPaginacionCajeros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajeros!=null) {
				this.jScrollPanelDatosEdicionCajeros.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeros!=null) {
				this.jTabbedPaneBusquedasCajeros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajeros!=null) {
				this.jScrollPanelDatosCajeros.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajeros!=null) {
				this.jPanelPaginacionCajeros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajeros!=null) {
				this.jScrollPanelDatosEdicionCajeros.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeros!=null) {
				this.jTabbedPaneBusquedasCajeros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajeros!=null) {
				this.jScrollPanelDatosCajeros.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajeros!=null) {
				this.jPanelPaginacionCajeros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajerosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajeros!=null) {
					this.jTabbedPaneBusquedasCajeros.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajerosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeros!=null) {
				this.jTabbedPaneBusquedasCajeros.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajeros!=null) {
				this.jPanelParametrosReportesCajeros.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCajeros=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCajeros) {this.jTabbedPaneBusquedasCajeros.remove(jPanelBusquedaCajerosCajeros);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaCajeros=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaCajeros) {this.jTabbedPaneBusquedasCajeros.remove(jPanelBusquedaCajerosCajeros);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadBusquedaCajeros=isParaCajaNegation;
			if(!this.isVisibilidadBusquedaCajeros) {this.jTabbedPaneBusquedasCajeros.remove(jPanelBusquedaCajerosCajeros);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajeros(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajeros() {
		this.updateBorderResaltarBusquedasFormularioCajeros();
		this.updateVisibilidadBusquedasFormularioCajeros();
		this.updateHabilitarBusquedasFormularioCajeros();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajeros() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajeros.getComponents().length>0) {
	

		if(this.cajerosConstantesFunciones.resaltarBusquedaCajerosCajeros!=null) {
			index= this.jTabbedPaneBusquedasCajeros.indexOfComponent(this.jPanelBusquedaCajerosCajeros);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeros.getComponent(index);
				jPanel.setBorder(this.cajerosConstantesFunciones.resaltarBusquedaCajerosCajeros);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajeros() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajeros.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajeros.indexOfComponent(this.jPanelBusquedaCajerosCajeros);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajeros.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajerosConstantesFunciones.mostrarBusquedaCajerosCajeros);
			if(!this.cajerosConstantesFunciones.mostrarBusquedaCajerosCajeros && index>-1) {
				this.jTabbedPaneBusquedasCajeros.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajeros() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajeros.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajeros.indexOfComponent(this.jPanelBusquedaCajerosCajeros);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajeros.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajerosConstantesFunciones.activarBusquedaCajerosCajeros);
				this.jTabbedPaneBusquedasCajeros.setEnabledAt(index,this.cajerosConstantesFunciones.activarBusquedaCajerosCajeros);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajeros(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCajeros")) {
			index= this.jTabbedPaneBusquedasCajeros.indexOfComponent(this.jPanelBusquedaCajerosCajeros);

			this.jTabbedPaneBusquedasCajeros.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeros.getComponent(index);

			this.cajerosConstantesFunciones.setResaltarBusquedaCajerosCajeros(resaltar);

			jPanel.setBorder(this.cajerosConstantesFunciones.resaltarBusquedaCajerosCajeros);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajeros.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCajeros() throws Exception {

		if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajeros();
		this.updateVisibilidadResaltarControlesFormularioCajeros();
		this.updateHabilitarResaltarControlesFormularioCajeros();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajeros() throws Exception {
		if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajerosConstantesFunciones.resaltaridCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.setBorder(this.cajerosConstantesFunciones.resaltaridCajeros);}
		if(this.cajerosConstantesFunciones.resaltarid_empresaCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setBorder(this.cajerosConstantesFunciones.resaltarid_empresaCajeros);}
		if(this.cajerosConstantesFunciones.resaltarid_sucursalCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setBorder(this.cajerosConstantesFunciones.resaltarid_sucursalCajeros);}
		if(this.cajerosConstantesFunciones.resaltarid_cajaCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setBorder(this.cajerosConstantesFunciones.resaltarid_cajaCajeros);}
		if(this.cajerosConstantesFunciones.resaltarfecha_inicioCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jDateChooserfecha_inicioCajeros.setBorder(this.cajerosConstantesFunciones.resaltarfecha_inicioCajeros);}
		if(this.cajerosConstantesFunciones.resaltarfecha_finCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jDateChooserfecha_finCajeros.setBorder(this.cajerosConstantesFunciones.resaltarfecha_finCajeros);}
		if(this.cajerosConstantesFunciones.resaltarnombre_cajaCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jTextAreanombre_cajaCajeros.setBorder(this.cajerosConstantesFunciones.resaltarnombre_cajaCajeros);}
		if(this.cajerosConstantesFunciones.resaltarfechaCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jDateChooserfechaCajeros.setBorder(this.cajerosConstantesFunciones.resaltarfechaCajeros);}
		if(this.cajerosConstantesFunciones.resaltartotalCajeros!=null && this.jInternalFrameDetalleFormCajeros!=null) {this.jInternalFrameDetalleFormCajeros.jTextFieldtotalCajeros.setBorder(this.cajerosConstantesFunciones.resaltartotalCajeros);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajeros() throws Exception {		
		if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajeros!=null) {
	
		//this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.setVisible(this.cajerosConstantesFunciones.mostraridCajeros);
		this.jInternalFrameDetalleFormCajeros.jPanelidCajeros.setVisible(this.cajerosConstantesFunciones.mostraridCajeros);
		//this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setVisible(this.cajerosConstantesFunciones.mostrarid_empresaCajeros);
		this.jInternalFrameDetalleFormCajeros.jPanelid_empresaCajeros.setVisible(this.cajerosConstantesFunciones.mostrarid_empresaCajeros);
		//this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setVisible(this.cajerosConstantesFunciones.mostrarid_sucursalCajeros);
		this.jInternalFrameDetalleFormCajeros.jPanelid_sucursalCajeros.setVisible(this.cajerosConstantesFunciones.mostrarid_sucursalCajeros);
		//this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setVisible(this.cajerosConstantesFunciones.mostrarid_cajaCajeros);
		this.jInternalFrameDetalleFormCajeros.jPanelid_cajaCajeros.setVisible(this.cajerosConstantesFunciones.mostrarid_cajaCajeros);
		//this.jInternalFrameDetalleFormCajeros.jDateChooserfecha_inicioCajeros.setVisible(this.cajerosConstantesFunciones.mostrarfecha_inicioCajeros);
		this.jInternalFrameDetalleFormCajeros.jPanelfecha_inicioCajeros.setVisible(this.cajerosConstantesFunciones.mostrarfecha_inicioCajeros);
		//this.jInternalFrameDetalleFormCajeros.jDateChooserfecha_finCajeros.setVisible(this.cajerosConstantesFunciones.mostrarfecha_finCajeros);
		this.jInternalFrameDetalleFormCajeros.jPanelfecha_finCajeros.setVisible(this.cajerosConstantesFunciones.mostrarfecha_finCajeros);
		//this.jInternalFrameDetalleFormCajeros.jTextAreanombre_cajaCajeros.setVisible(this.cajerosConstantesFunciones.mostrarnombre_cajaCajeros);
		this.jInternalFrameDetalleFormCajeros.jPanelnombre_cajaCajeros.setVisible(this.cajerosConstantesFunciones.mostrarnombre_cajaCajeros);
		//this.jInternalFrameDetalleFormCajeros.jDateChooserfechaCajeros.setVisible(this.cajerosConstantesFunciones.mostrarfechaCajeros);
		this.jInternalFrameDetalleFormCajeros.jPanelfechaCajeros.setVisible(this.cajerosConstantesFunciones.mostrarfechaCajeros);
		//this.jInternalFrameDetalleFormCajeros.jTextFieldtotalCajeros.setVisible(this.cajerosConstantesFunciones.mostrartotalCajeros);
		this.jInternalFrameDetalleFormCajeros.jPaneltotalCajeros.setVisible(this.cajerosConstantesFunciones.mostrartotalCajeros);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajeros() throws Exception {
		if(this.jInternalFrameDetalleFormCajeros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajeros!=null) {
	
		this.jInternalFrameDetalleFormCajeros.jLabelidCajeros.setEnabled(this.cajerosConstantesFunciones.activaridCajeros);
		this.jInternalFrameDetalleFormCajeros.jComboBoxid_empresaCajeros.setEnabled(this.cajerosConstantesFunciones.activarid_empresaCajeros);
		this.jInternalFrameDetalleFormCajeros.jComboBoxid_sucursalCajeros.setEnabled(this.cajerosConstantesFunciones.activarid_sucursalCajeros);
		this.jInternalFrameDetalleFormCajeros.jComboBoxid_cajaCajeros.setEnabled(this.cajerosConstantesFunciones.activarid_cajaCajeros);
		this.jInternalFrameDetalleFormCajeros.jDateChooserfecha_inicioCajeros.setEnabled(this.cajerosConstantesFunciones.activarfecha_inicioCajeros);
		this.jInternalFrameDetalleFormCajeros.jDateChooserfecha_finCajeros.setEnabled(this.cajerosConstantesFunciones.activarfecha_finCajeros);
		this.jInternalFrameDetalleFormCajeros.jTextAreanombre_cajaCajeros.setEnabled(this.cajerosConstantesFunciones.activarnombre_cajaCajeros);
		this.jInternalFrameDetalleFormCajeros.jDateChooserfechaCajeros.setEnabled(this.cajerosConstantesFunciones.activarfechaCajeros);
		this.jInternalFrameDetalleFormCajeros.jTextFieldtotalCajeros.setEnabled(this.cajerosConstantesFunciones.activartotalCajeros);
		}
	}
	
		
}