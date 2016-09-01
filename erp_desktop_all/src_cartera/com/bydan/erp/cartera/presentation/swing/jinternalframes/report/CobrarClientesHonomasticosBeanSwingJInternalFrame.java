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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.CobrarClientesHonomasticosConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarClientesHonomasticosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarClientesHonomasticosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarClientesHonomasticosBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
public class CobrarClientesHonomasticosBeanSwingJInternalFrame extends CobrarClientesHonomasticosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarClientesHonomasticosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarClientesHonomasticos> cobrarclienteshonomasticosValidator = new ClassValidator<CobrarClientesHonomasticos>(CobrarClientesHonomasticos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarClientesHonomasticos cobrarclienteshonomasticos;	
	public CobrarClientesHonomasticos cobrarclienteshonomasticosAux;
	public CobrarClientesHonomasticos cobrarclienteshonomasticosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarClientesHonomasticos cobrarclienteshonomasticosTotales;
	public Long idCobrarClientesHonomasticosActual;
	public Long iIdNuevoCobrarClientesHonomasticos=0L;
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

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboRegion="";

	public List<Region> regionsForeignKey;

	public List<Region> getregionsForeignKey() {
		return regionsForeignKey;
	}

	public void setregionsForeignKey(List<Region> regionsForeignKey) {
		this.regionsForeignKey = regionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Region regionForeignKey;

	public Region getregionForeignKey() {
		return regionForeignKey;
	}

	public void setregionForeignKey(Region regionForeignKey) {
		this.regionForeignKey = regionForeignKey;
	}

	public String sFinalQueryComboProvincia="";

	public List<Provincia> provinciasForeignKey;

	public List<Provincia> getprovinciasForeignKey() {
		return provinciasForeignKey;
	}

	public void setprovinciasForeignKey(List<Provincia> provinciasForeignKey) {
		this.provinciasForeignKey = provinciasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Provincia provinciaForeignKey;

	public Provincia getprovinciaForeignKey() {
		return provinciaForeignKey;
	}

	public void setprovinciaForeignKey(Provincia provinciaForeignKey) {
		this.provinciaForeignKey = provinciaForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
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
	
	public Boolean isPermisoTodoCobrarClientesHonomasticos;
	public Boolean isPermisoNuevoCobrarClientesHonomasticos;
	public Boolean isPermisoActualizarCobrarClientesHonomasticos;
	public Boolean isPermisoActualizarOriginalCobrarClientesHonomasticos;
	public Boolean isPermisoEliminarCobrarClientesHonomasticos;
	public Boolean isPermisoGuardarCambiosCobrarClientesHonomasticos;
	public Boolean isPermisoConsultaCobrarClientesHonomasticos;
	public Boolean isPermisoBusquedaCobrarClientesHonomasticos;
	public Boolean isPermisoReporteCobrarClientesHonomasticos;
	public Boolean isPermisoPaginacionMedioCobrarClientesHonomasticos;
	public Boolean isPermisoPaginacionAltoCobrarClientesHonomasticos;
	public Boolean isPermisoPaginacionTodoCobrarClientesHonomasticos;
	public Boolean isPermisoCopiarCobrarClientesHonomasticos;
	public Boolean isPermisoVerFormCobrarClientesHonomasticos;
	public Boolean isPermisoDuplicarCobrarClientesHonomasticos;
	public Boolean isPermisoOrdenCobrarClientesHonomasticos;
	
	
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
	
	public CobrarClientesHonomasticosParameterReturnGeneral cobrarclienteshonomasticosReturnGeneral;
	public CobrarClientesHonomasticosParameterReturnGeneral cobrarclienteshonomasticosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarClientesHonomasticos=false;
	public Boolean esParaAccionDesdeFormularioCobrarClientesHonomasticos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarClientesHonomasticosSessionBeanAdditional cobrarclienteshonomasticosSessionBeanAdditional=null;
	
	public CobrarClientesHonomasticosSessionBeanAdditional getCobrarClientesHonomasticosSessionBeanAdditional() {
		return this.cobrarclienteshonomasticosSessionBeanAdditional;
	}
	
	public void setCobrarClientesHonomasticosSessionBeanAdditional(CobrarClientesHonomasticosSessionBeanAdditional cobrarclienteshonomasticosSessionBeanAdditional) {
		try {
			this.cobrarclienteshonomasticosSessionBeanAdditional=cobrarclienteshonomasticosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional cobrarclienteshonomasticosBeanSwingJInternalFrameAdditional=null;
	//public class CobrarClientesHonomasticosBeanSwingJInternalFrame
	
	public CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional getCobrarClientesHonomasticosBeanSwingJInternalFrameAdditional() {
		return this.cobrarclienteshonomasticosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarClientesHonomasticosBeanSwingJInternalFrameAdditional(CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional cobrarclienteshonomasticosBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarclienteshonomasticosBeanSwingJInternalFrameAdditional=cobrarclienteshonomasticosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarClientesHonomasticosLogic cobrarclienteshonomasticosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarClientesHonomasticos cobrarclienteshonomasticosBean;
	public CobrarClientesHonomasticosConstantesFunciones cobrarclienteshonomasticosConstantesFunciones;
	//public CobrarClientesHonomasticosParameterReturnGeneral cobrarclienteshonomasticosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public PaisLogic paisLogic;
	public RegionLogic regionLogic;
	public ProvinciaLogic provinciaLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarClientesHonomasticos> cobrarclienteshonomasticoss;	
	//public List<CobrarClientesHonomasticos> cobrarclienteshonomasticossEliminados;
	//public List<CobrarClientesHonomasticos> cobrarclienteshonomasticossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarClientesHonomasticos=true;
	public Boolean isVisibilidadCeldaCopiarCobrarClientesHonomasticos=true;
	public Boolean isVisibilidadCeldaVerFormCobrarClientesHonomasticos=true;
	public Boolean isVisibilidadCeldaOrdenCobrarClientesHonomasticos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
	public Boolean isVisibilidadCeldaModificarCobrarClientesHonomasticos=false;
	public Boolean isVisibilidadCeldaActualizarCobrarClientesHonomasticos=false;
	public Boolean isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
	public Boolean isVisibilidadCeldaCancelarCobrarClientesHonomasticos=false;
	public Boolean isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarClientesHonomasticos=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdProvincia=false;
	public Boolean isVisibilidadFK_IdRegion=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCobrarClientesHonomasticos() {
		return this.iIdNuevoCobrarClientesHonomasticos;
	}

	public void setiIdNuevoCobrarClientesHonomasticos(Long iIdNuevoCobrarClientesHonomasticos) {
		this.iIdNuevoCobrarClientesHonomasticos = iIdNuevoCobrarClientesHonomasticos;
	}
	
	public Long getidCobrarClientesHonomasticosActual() {
		return this.idCobrarClientesHonomasticosActual;
	}

	public void setidCobrarClientesHonomasticosActual(Long idCobrarClientesHonomasticosActual) {
		this.idCobrarClientesHonomasticosActual = idCobrarClientesHonomasticosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarClientesHonomasticos getcobrarclienteshonomasticos() {
		return this.cobrarclienteshonomasticos;
	}

	public void setcobrarclienteshonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos) {
		this.cobrarclienteshonomasticos = cobrarclienteshonomasticos;
	}
	
	public CobrarClientesHonomasticos getcobrarclienteshonomasticosAux() {
		return this.cobrarclienteshonomasticosAux;
	}

	public void setcobrarclienteshonomasticosAux(CobrarClientesHonomasticos cobrarclienteshonomasticosAux) {
		this.cobrarclienteshonomasticosAux = cobrarclienteshonomasticosAux;
	}				
	
	public CobrarClientesHonomasticos getcobrarclienteshonomasticosAnterior() {
		return this.cobrarclienteshonomasticosAnterior;
	}

	public void setcobrarclienteshonomasticosAnterior(CobrarClientesHonomasticos cobrarclienteshonomasticosAnterior) {
		this.cobrarclienteshonomasticosAnterior = cobrarclienteshonomasticosAnterior;
	}	
	
	public CobrarClientesHonomasticos getcobrarclienteshonomasticosTotales() {
		return this.cobrarclienteshonomasticosTotales;
	}

	public void setcobrarclienteshonomasticosTotales(CobrarClientesHonomasticos cobrarclienteshonomasticosTotales) {
		this.cobrarclienteshonomasticosTotales = cobrarclienteshonomasticosTotales;
	}	
	
	public CobrarClientesHonomasticos getcobrarclienteshonomasticosBean() {
		return this.cobrarclienteshonomasticosBean;
	}

	public void setcobrarclienteshonomasticosBean(CobrarClientesHonomasticos cobrarclienteshonomasticosBean) {
		this.cobrarclienteshonomasticosBean = cobrarclienteshonomasticosBean;
	}	
	
	public CobrarClientesHonomasticosParameterReturnGeneral getcobrarclienteshonomasticosReturnGeneral() {
		return this.cobrarclienteshonomasticosReturnGeneral;
	}

	public void setcobrarclienteshonomasticosReturnGeneral(CobrarClientesHonomasticosParameterReturnGeneral cobrarclienteshonomasticosReturnGeneral) {
		this.cobrarclienteshonomasticosReturnGeneral = cobrarclienteshonomasticosReturnGeneral;
	}	
	
	
	public Long id_paisBusquedaCobrarClientesHonomasticos=-1L;

	public Long getid_paisBusquedaCobrarClientesHonomasticos() {
		return this.id_paisBusquedaCobrarClientesHonomasticos;
	}

	public void setid_paisBusquedaCobrarClientesHonomasticos(Long id_paisBusquedaCobrarClientesHonomasticos) {
		this.id_paisBusquedaCobrarClientesHonomasticos = id_paisBusquedaCobrarClientesHonomasticos;
	}

;
	public Long id_regionBusquedaCobrarClientesHonomasticos=-1L;

	public Long getid_regionBusquedaCobrarClientesHonomasticos() {
		return this.id_regionBusquedaCobrarClientesHonomasticos;
	}

	public void setid_regionBusquedaCobrarClientesHonomasticos(Long id_regionBusquedaCobrarClientesHonomasticos) {
		this.id_regionBusquedaCobrarClientesHonomasticos = id_regionBusquedaCobrarClientesHonomasticos;
	}

;
	public Long id_provinciaBusquedaCobrarClientesHonomasticos=-1L;

	public Long getid_provinciaBusquedaCobrarClientesHonomasticos() {
		return this.id_provinciaBusquedaCobrarClientesHonomasticos;
	}

	public void setid_provinciaBusquedaCobrarClientesHonomasticos(Long id_provinciaBusquedaCobrarClientesHonomasticos) {
		this.id_provinciaBusquedaCobrarClientesHonomasticos = id_provinciaBusquedaCobrarClientesHonomasticos;
	}

;
	public Long id_ciudadBusquedaCobrarClientesHonomasticos=-1L;

	public Long getid_ciudadBusquedaCobrarClientesHonomasticos() {
		return this.id_ciudadBusquedaCobrarClientesHonomasticos;
	}

	public void setid_ciudadBusquedaCobrarClientesHonomasticos(Long id_ciudadBusquedaCobrarClientesHonomasticos) {
		this.id_ciudadBusquedaCobrarClientesHonomasticos = id_ciudadBusquedaCobrarClientesHonomasticos;
	}

;
	public Date fecha_nacimientoBusquedaCobrarClientesHonomasticos=new Date();

	public Date getfecha_nacimientoBusquedaCobrarClientesHonomasticos() {
		return this.fecha_nacimientoBusquedaCobrarClientesHonomasticos;
	}

	public void setfecha_nacimientoBusquedaCobrarClientesHonomasticos(Date fecha_nacimientoBusquedaCobrarClientesHonomasticos) {
		this.fecha_nacimientoBusquedaCobrarClientesHonomasticos = fecha_nacimientoBusquedaCobrarClientesHonomasticos;
	}

	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_provinciaFK_IdProvincia=-1L;

	public Long getid_provinciaFK_IdProvincia() {
		return this.id_provinciaFK_IdProvincia;
	}

	public void setid_provinciaFK_IdProvincia(Long id_provinciaFK_IdProvincia) {
		this.id_provinciaFK_IdProvincia = id_provinciaFK_IdProvincia;
	}

	public Long id_regionFK_IdRegion=-1L;

	public Long getid_regionFK_IdRegion() {
		return this.id_regionFK_IdRegion;
	}

	public void setid_regionFK_IdRegion(Long id_regionFK_IdRegion) {
		this.id_regionFK_IdRegion = id_regionFK_IdRegion;
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
	
	
	public CobrarClientesHonomasticosLogic getCobrarClientesHonomasticosLogic()	{		
		return cobrarclienteshonomasticosLogic;
	}

	public void setCobrarClientesHonomasticosLogic(CobrarClientesHonomasticosLogic cobrarclienteshonomasticosLogic) {
		this.cobrarclienteshonomasticosLogic = cobrarclienteshonomasticosLogic;
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
	
	public Boolean getIsEsNuevoCobrarClientesHonomasticos() {
		return isEsNuevoCobrarClientesHonomasticos;
	}

	public void setIsEsNuevoCobrarClientesHonomasticos(Boolean isEsNuevoCobrarClientesHonomasticos) {
		this.isEsNuevoCobrarClientesHonomasticos = isEsNuevoCobrarClientesHonomasticos;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarClientesHonomasticos() {
		return esParaAccionDesdeFormularioCobrarClientesHonomasticos;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarClientesHonomasticos(Boolean esParaAccionDesdeFormularioCobrarClientesHonomasticos) {
		this.esParaAccionDesdeFormularioCobrarClientesHonomasticos = esParaAccionDesdeFormularioCobrarClientesHonomasticos;
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

			if(this.cobrarclienteshonomasticosSessionBean==null) {
				this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
			}

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarclienteshonomasticosSessionBean.getlidEmpresaActual());
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

			if(this.cobrarclienteshonomasticosSessionBean==null) {
				this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
			}

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cobrarclienteshonomasticosSessionBean.getlidSucursalActual());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarclienteshonomasticosSessionBean==null) {
				this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
			}

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(cobrarclienteshonomasticosSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosRegionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.regionsForeignKey=new ArrayList<Region>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RegionLogic regionLogic=new RegionLogic();

			//regionLogic.getRegionDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarclienteshonomasticosSessionBean==null) {
				this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
			}

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionRegion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//regionLogic.getRegionDataAccess().setIsForForeingKeyData(true);

					regionLogic.getTodosRegionsWithConnection(sFinalQuery,new Pagination());

					this.regionsForeignKey=regionLogic.getRegions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRegion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLogic.getEntityWithConnection(cobrarclienteshonomasticosSessionBean.getlidRegionActual());
					this.regionsForeignKey.add(regionLogic.getRegion());
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

	public void cargarCombosProvinciasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.provinciasForeignKey=new ArrayList<Provincia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProvinciaLogic provinciaLogic=new ProvinciaLogic();

			//provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarclienteshonomasticosSessionBean==null) {
				this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
			}

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

					provinciaLogic.getTodosProvinciasWithConnection(sFinalQuery,new Pagination());

					this.provinciasForeignKey=provinciaLogic.getProvincias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProvincia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getEntityWithConnection(cobrarclienteshonomasticosSessionBean.getlidProvinciaActual());
					this.provinciasForeignKey.add(provinciaLogic.getProvincia());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarclienteshonomasticosSessionBean==null) {
				this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
			}

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(cobrarclienteshonomasticosSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

					if(this.cobrarclienteshonomasticos!=null) {
						this.cobrarclienteshonomasticos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarClientesHonomasticos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarClientesHonomasticosGenerico)throws Exception
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
				jComboBoxid_empresaCobrarClientesHonomasticosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarClientesHonomasticosGenerico!=null && jComboBoxid_empresaCobrarClientesHonomasticosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarClientesHonomasticosGenerico.setSelectedIndex(0);
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

					if(this.cobrarclienteshonomasticos!=null) {
						this.cobrarclienteshonomasticos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCobrarClientesHonomasticos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCobrarClientesHonomasticosGenerico)throws Exception
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
				jComboBoxid_sucursalCobrarClientesHonomasticosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCobrarClientesHonomasticosGenerico!=null && jComboBoxid_sucursalCobrarClientesHonomasticosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCobrarClientesHonomasticosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.cobrarclienteshonomasticos!=null) {
						this.cobrarclienteshonomasticos.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisCobrarClientesHonomasticos.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
						jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
							//jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(paisTemp);
							if(jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getItemCount()>0) {
								jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisCobrarClientesHonomasticosGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisCobrarClientesHonomasticosGenerico!=null && jComboBoxid_paisCobrarClientesHonomasticosGenerico.getItemCount()>0) {
					jComboBoxid_paisCobrarClientesHonomasticosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRegionForeignKey(Long idRegionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(regionTemp!=null) {

					if(this.cobrarclienteshonomasticos!=null) {
						this.cobrarclienteshonomasticos.setRegion(regionTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setSelectedItem(regionTemp);
					}
				} else {
					//jComboBoxid_regionCobrarClientesHonomasticos.setSelectedItem(regionTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos") || sFormularioTipoBusqueda.equals("Todos")){
					if(regionTemp!=null && jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
						jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(regionTemp);
					} else {
						if(jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
							//jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(regionTemp);
							if(jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getItemCount()>0) {
								jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedIndex(0);
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

	public String getActualRegionForeignKeyDescripcion(Long idRegionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}


			sDescripcion=RegionConstantesFunciones.getRegionDescripcion(regionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRegionForeignKeyGenerico(Long idRegionSeleccionado,JComboBox jComboBoxid_regionCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}

			if(regionTemp!=null) {
				jComboBoxid_regionCobrarClientesHonomasticosGenerico.setSelectedItem(regionTemp);
			} else {
				if(jComboBoxid_regionCobrarClientesHonomasticosGenerico!=null && jComboBoxid_regionCobrarClientesHonomasticosGenerico.getItemCount()>0) {
					jComboBoxid_regionCobrarClientesHonomasticosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProvinciaForeignKey(Long idProvinciaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(provinciaTemp!=null) {

					if(this.cobrarclienteshonomasticos!=null) {
						this.cobrarclienteshonomasticos.setProvincia(provinciaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setSelectedItem(provinciaTemp);
					}
				} else {
					//jComboBoxid_provinciaCobrarClientesHonomasticos.setSelectedItem(provinciaTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos") || sFormularioTipoBusqueda.equals("Todos")){
					if(provinciaTemp!=null && jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
						jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(provinciaTemp);
					} else {
						if(jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
							//jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(provinciaTemp);
							if(jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getItemCount()>0) {
								jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedIndex(0);
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

	public String getActualProvinciaForeignKeyDescripcion(Long idProvinciaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}


			sDescripcion=ProvinciaConstantesFunciones.getProvinciaDescripcion(provinciaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProvinciaForeignKeyGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxid_provinciaCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(provinciaTemp!=null) {
				jComboBoxid_provinciaCobrarClientesHonomasticosGenerico.setSelectedItem(provinciaTemp);
			} else {
				if(jComboBoxid_provinciaCobrarClientesHonomasticosGenerico!=null && jComboBoxid_provinciaCobrarClientesHonomasticosGenerico.getItemCount()>0) {
					jComboBoxid_provinciaCobrarClientesHonomasticosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.cobrarclienteshonomasticos!=null) {
						this.cobrarclienteshonomasticos.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadCobrarClientesHonomasticos.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
						jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
							//jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getItemCount()>0) {
								jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadCobrarClientesHonomasticosGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadCobrarClientesHonomasticosGenerico!=null && jComboBoxid_ciudadCobrarClientesHonomasticosGenerico.getItemCount()>0) {
					jComboBoxid_ciudadCobrarClientesHonomasticosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarClientesHonomasticos cobrarclienteshonomasticos,JComboBox jComboBoxid_empresaCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarClientesHonomasticosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarClientesHonomasticosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarclienteshonomasticos.setid_empresa(empresaAux.getId());
				cobrarclienteshonomasticos.setempresa_descripcion(CobrarClientesHonomasticosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarclienteshonomasticos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CobrarClientesHonomasticos cobrarclienteshonomasticos,JComboBox jComboBoxid_sucursalCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCobrarClientesHonomasticosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCobrarClientesHonomasticosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cobrarclienteshonomasticos.setid_sucursal(sucursalAux.getId());
				cobrarclienteshonomasticos.setsucursal_descripcion(CobrarClientesHonomasticosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cobrarclienteshonomasticos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(CobrarClientesHonomasticos cobrarclienteshonomasticos,JComboBox jComboBoxid_paisCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisCobrarClientesHonomasticosGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisCobrarClientesHonomasticosGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				cobrarclienteshonomasticos.setid_pais(paisAux.getId());
				cobrarclienteshonomasticos.setpais_descripcion(CobrarClientesHonomasticosConstantesFunciones.getPaisDescripcion(paisAux));
				cobrarclienteshonomasticos.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRegionForeignKey(CobrarClientesHonomasticos cobrarclienteshonomasticos,JComboBox jComboBoxid_regionCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Region  regionAux=new Region();

			if(jComboBoxid_regionCobrarClientesHonomasticosGenerico==null) {
				regionAux=(Region)this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.getSelectedItem();
			} else {
				regionAux=(Region)jComboBoxid_regionCobrarClientesHonomasticosGenerico.getSelectedItem();
			}

			if(regionAux!=null && regionAux.getId()!=null) {
				cobrarclienteshonomasticos.setid_region(regionAux.getId());
				cobrarclienteshonomasticos.setregion_descripcion(CobrarClientesHonomasticosConstantesFunciones.getRegionDescripcion(regionAux));
				cobrarclienteshonomasticos.setRegion(regionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProvinciaForeignKey(CobrarClientesHonomasticos cobrarclienteshonomasticos,JComboBox jComboBoxid_provinciaCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaAux=new Provincia();

			if(jComboBoxid_provinciaCobrarClientesHonomasticosGenerico==null) {
				provinciaAux=(Provincia)this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.getSelectedItem();
			} else {
				provinciaAux=(Provincia)jComboBoxid_provinciaCobrarClientesHonomasticosGenerico.getSelectedItem();
			}

			if(provinciaAux!=null && provinciaAux.getId()!=null) {
				cobrarclienteshonomasticos.setid_provincia(provinciaAux.getId());
				cobrarclienteshonomasticos.setprovincia_descripcion(CobrarClientesHonomasticosConstantesFunciones.getProvinciaDescripcion(provinciaAux));
				cobrarclienteshonomasticos.setProvincia(provinciaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(CobrarClientesHonomasticos cobrarclienteshonomasticos,JComboBox jComboBoxid_ciudadCobrarClientesHonomasticosGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadCobrarClientesHonomasticosGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadCobrarClientesHonomasticosGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				cobrarclienteshonomasticos.setid_ciudad(ciudadAux.getId());
				cobrarclienteshonomasticos.setciudad_descripcion(CobrarClientesHonomasticosConstantesFunciones.getCiudadDescripcion(ciudadAux));
				cobrarclienteshonomasticos.setCiudad(ciudadAux);			}
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

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
					}

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
					}

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
					}

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.addItem(pais);
							}
						}

						if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRegionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRegion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.removeAllItems();

							for(Region region:this.regionsForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.addItem(region);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
					}

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.removeAllItems();

							for(Region region:this.regionsForeignKey) {
								this.jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.addItem(region);
							}
						}

						if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProvinciasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProvincia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.addItem(provincia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
					}

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.addItem(provincia);
							}
						}

						if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { 
					}

					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.addItem(ciudad);
							}
						}

						if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameRegionForeignKey(Region region,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setSelectedItem(region);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(region);
						} else {
							this.jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProvinciaForeignKey(Provincia provincia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setSelectedItem(provincia);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(provincia);
						} else {
							this.jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCobrarClientesHonomasticos() throws Exception {
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
		
	public CobrarClientesHonomasticosParameterReturnGeneral getCobrarClientesHonomasticosParameterGeneral() {
		return this.cobrarclienteshonomasticosParameterGeneral;
	}
	
	public void setCobrarClientesHonomasticosParameterGeneral(CobrarClientesHonomasticosParameterReturnGeneral cobrarclienteshonomasticosParameterGeneral) {
		this.cobrarclienteshonomasticosParameterGeneral = cobrarclienteshonomasticosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarClientesHonomasticos() {
		return isPermisoTodoCobrarClientesHonomasticos;
	}

	public void setIsPermisoTodoCobrarClientesHonomasticos(Boolean isPermisoTodoCobrarClientesHonomasticos) {
		this.isPermisoTodoCobrarClientesHonomasticos = isPermisoTodoCobrarClientesHonomasticos;
	}

	public Boolean getIsPermisoNuevoCobrarClientesHonomasticos() {
		return isPermisoNuevoCobrarClientesHonomasticos;
	}

	public void setIsPermisoNuevoCobrarClientesHonomasticos(Boolean isPermisoNuevoCobrarClientesHonomasticos) {
		this.isPermisoNuevoCobrarClientesHonomasticos = isPermisoNuevoCobrarClientesHonomasticos;
	}

	public Boolean getIsPermisoActualizarCobrarClientesHonomasticos() {
		return isPermisoActualizarCobrarClientesHonomasticos;
	}

	public void setIsPermisoActualizarCobrarClientesHonomasticos(Boolean isPermisoActualizarCobrarClientesHonomasticos) {
		this.isPermisoActualizarCobrarClientesHonomasticos = isPermisoActualizarCobrarClientesHonomasticos;
	}

	public Boolean getIsPermisoEliminarCobrarClientesHonomasticos() {
		return isPermisoEliminarCobrarClientesHonomasticos;
	}

	public void setIsPermisoEliminarCobrarClientesHonomasticos(Boolean isPermisoEliminarCobrarClientesHonomasticos) {
		this.isPermisoEliminarCobrarClientesHonomasticos = isPermisoEliminarCobrarClientesHonomasticos;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarClientesHonomasticos() {
		return isPermisoGuardarCambiosCobrarClientesHonomasticos;
	}

	public void setIsPermisoGuardarCambiosCobrarClientesHonomasticos(Boolean isPermisoGuardarCambiosCobrarClientesHonomasticos) {
		this.isPermisoGuardarCambiosCobrarClientesHonomasticos = isPermisoGuardarCambiosCobrarClientesHonomasticos;
	}
	
	public Boolean getIsPermisoConsultaCobrarClientesHonomasticos() {
		return isPermisoConsultaCobrarClientesHonomasticos;
	}

	public void setIsPermisoConsultaCobrarClientesHonomasticos(Boolean isPermisoConsultaCobrarClientesHonomasticos) {
		this.isPermisoConsultaCobrarClientesHonomasticos = isPermisoConsultaCobrarClientesHonomasticos;
	}

	public Boolean getIsPermisoBusquedaCobrarClientesHonomasticos() {
		return isPermisoBusquedaCobrarClientesHonomasticos;
	}

	public void setIsPermisoBusquedaCobrarClientesHonomasticos(Boolean isPermisoBusquedaCobrarClientesHonomasticos) {
		this.isPermisoBusquedaCobrarClientesHonomasticos = isPermisoBusquedaCobrarClientesHonomasticos;
	}

	public Boolean getIsPermisoReporteCobrarClientesHonomasticos() {
		return isPermisoReporteCobrarClientesHonomasticos;
	}

	public void setIsPermisoReporteCobrarClientesHonomasticos(Boolean isPermisoReporteCobrarClientesHonomasticos) {
		this.isPermisoReporteCobrarClientesHonomasticos = isPermisoReporteCobrarClientesHonomasticos;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarClientesHonomasticos() {
		return isPermisoPaginacionMedioCobrarClientesHonomasticos;
	}

	public void setIsPermisoPaginacionMedioCobrarClientesHonomasticos(Boolean isPermisoPaginacionMedioCobrarClientesHonomasticos) {
		this.isPermisoPaginacionMedioCobrarClientesHonomasticos = isPermisoPaginacionMedioCobrarClientesHonomasticos;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarClientesHonomasticos() {
		return isPermisoPaginacionTodoCobrarClientesHonomasticos;
	}

	public void setIsPermisoPaginacionTodoCobrarClientesHonomasticos(Boolean isPermisoPaginacionTodoCobrarClientesHonomasticos) {
		this.isPermisoPaginacionTodoCobrarClientesHonomasticos = isPermisoPaginacionTodoCobrarClientesHonomasticos;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarClientesHonomasticos() {
		return isPermisoPaginacionAltoCobrarClientesHonomasticos;
	}

	public void setIsPermisoPaginacionAltoCobrarClientesHonomasticos(Boolean isPermisoPaginacionAltoCobrarClientesHonomasticos) {
		this.isPermisoPaginacionAltoCobrarClientesHonomasticos = isPermisoPaginacionAltoCobrarClientesHonomasticos;
	}
	
	public Boolean getIsPermisoCopiarCobrarClientesHonomasticos() {
		return isPermisoCopiarCobrarClientesHonomasticos;
	}

	public void setIsPermisoCopiarCobrarClientesHonomasticos(Boolean isPermisoCopiarCobrarClientesHonomasticos) {
		this.isPermisoCopiarCobrarClientesHonomasticos = isPermisoCopiarCobrarClientesHonomasticos;
	}
	
	public Boolean getIsPermisoVerFormCobrarClientesHonomasticos() {
		return isPermisoVerFormCobrarClientesHonomasticos;
	}

	public void setIsPermisoVerFormCobrarClientesHonomasticos(Boolean isPermisoVerFormCobrarClientesHonomasticos) {
		this.isPermisoVerFormCobrarClientesHonomasticos = isPermisoVerFormCobrarClientesHonomasticos;
	}
	
	public Boolean getIsPermisoDuplicarCobrarClientesHonomasticos() {
		return isPermisoDuplicarCobrarClientesHonomasticos;
	}

	public void setIsPermisoDuplicarCobrarClientesHonomasticos(Boolean isPermisoDuplicarCobrarClientesHonomasticos) {
		this.isPermisoDuplicarCobrarClientesHonomasticos = isPermisoDuplicarCobrarClientesHonomasticos;
	}
	
	public Boolean getIsPermisoOrdenCobrarClientesHonomasticos() {
		return isPermisoOrdenCobrarClientesHonomasticos;
	}

	public void setIsPermisoOrdenCobrarClientesHonomasticos(Boolean isPermisoOrdenCobrarClientesHonomasticos) {
		this.isPermisoOrdenCobrarClientesHonomasticos = isPermisoOrdenCobrarClientesHonomasticos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarClientesHonomasticos() {
		return isVisibilidadCeldaNuevoCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaNuevoCobrarClientesHonomasticos(Boolean isVisibilidadCeldaNuevoCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos = isVisibilidadCeldaNuevoCobrarClientesHonomasticos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarClientesHonomasticos() {
		return isVisibilidadCeldaDuplicarCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarClientesHonomasticos(Boolean isVisibilidadCeldaDuplicarCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaDuplicarCobrarClientesHonomasticos = isVisibilidadCeldaDuplicarCobrarClientesHonomasticos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarClientesHonomasticos() {
		return isVisibilidadCeldaCopiarCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaCopiarCobrarClientesHonomasticos(Boolean isVisibilidadCeldaCopiarCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaCopiarCobrarClientesHonomasticos = isVisibilidadCeldaCopiarCobrarClientesHonomasticos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarClientesHonomasticos() {
		return isVisibilidadCeldaVerFormCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaVerFormCobrarClientesHonomasticos(Boolean isVisibilidadCeldaVerFormCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaVerFormCobrarClientesHonomasticos = isVisibilidadCeldaVerFormCobrarClientesHonomasticos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarClientesHonomasticos() {
		return isVisibilidadCeldaOrdenCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaOrdenCobrarClientesHonomasticos(Boolean isVisibilidadCeldaOrdenCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos = isVisibilidadCeldaOrdenCobrarClientesHonomasticos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos() {
		return isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos(Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos = isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarClientesHonomasticos() {
		return isVisibilidadCeldaModificarCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaModificarCobrarClientesHonomasticos(Boolean isVisibilidadCeldaModificarCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaModificarCobrarClientesHonomasticos = isVisibilidadCeldaModificarCobrarClientesHonomasticos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarClientesHonomasticos() {
		return isVisibilidadCeldaActualizarCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaActualizarCobrarClientesHonomasticos(Boolean isVisibilidadCeldaActualizarCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos = isVisibilidadCeldaActualizarCobrarClientesHonomasticos;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarClientesHonomasticos() {
		return isVisibilidadCeldaEliminarCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaEliminarCobrarClientesHonomasticos(Boolean isVisibilidadCeldaEliminarCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos = isVisibilidadCeldaEliminarCobrarClientesHonomasticos;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarClientesHonomasticos() {
		return isVisibilidadCeldaCancelarCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaCancelarCobrarClientesHonomasticos(Boolean isVisibilidadCeldaCancelarCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos = isVisibilidadCeldaCancelarCobrarClientesHonomasticos;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarClientesHonomasticos() {
		return isVisibilidadCeldaGuardarCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaGuardarCobrarClientesHonomasticos(Boolean isVisibilidadCeldaGuardarCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos = isVisibilidadCeldaGuardarCobrarClientesHonomasticos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos() {
		return isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos(Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos) {
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos = isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos;
	}
		
	public CobrarClientesHonomasticosSessionBean getcobrarclienteshonomasticosSessionBean() {
		return this.cobrarclienteshonomasticosSessionBean;
	}
	
	public void setcobrarclienteshonomasticosSessionBean(CobrarClientesHonomasticosSessionBean cobrarclienteshonomasticosSessionBean) {
		this.cobrarclienteshonomasticosSessionBean=cobrarclienteshonomasticosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarClientesHonomasticos() {
		return this.isVisibilidadBusquedaCobrarClientesHonomasticos;
	}

	public void setisVisibilidadBusquedaCobrarClientesHonomasticos(Boolean isVisibilidadBusquedaCobrarClientesHonomasticos) {
		this.isVisibilidadBusquedaCobrarClientesHonomasticos=isVisibilidadBusquedaCobrarClientesHonomasticos;
	}

	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdProvincia() {
		return this.isVisibilidadFK_IdProvincia;
	}

	public void setisVisibilidadFK_IdProvincia(Boolean isVisibilidadFK_IdProvincia) {
		this.isVisibilidadFK_IdProvincia=isVisibilidadFK_IdProvincia;
	}

	public Boolean getisVisibilidadFK_IdRegion() {
		return this.isVisibilidadFK_IdRegion;
	}

	public void setisVisibilidadFK_IdRegion(Boolean isVisibilidadFK_IdRegion) {
		this.isVisibilidadFK_IdRegion=isVisibilidadFK_IdRegion;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarclienteshonomasticos,null);
				this.setActualParaGuardarSucursalForeignKey(cobrarclienteshonomasticos,null);
				this.setActualParaGuardarPaisForeignKey(cobrarclienteshonomasticos,null);
				this.setActualParaGuardarRegionForeignKey(cobrarclienteshonomasticos,null);
				this.setActualParaGuardarProvinciaForeignKey(cobrarclienteshonomasticos,null);
				this.setActualParaGuardarCiudadForeignKey(cobrarclienteshonomasticos,null);
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
	
	public void bugActualizarReferenciaActual(CobrarClientesHonomasticos cobrarclienteshonomasticos,CobrarClientesHonomasticos cobrarclienteshonomasticosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarClientesHonomasticos(cobrarclienteshonomasticos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarclienteshonomasticosAux.setId(cobrarclienteshonomasticos.getId());
		cobrarclienteshonomasticosAux.setVersionRow(cobrarclienteshonomasticos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarClientesHonomasticos cobrarclienteshonomasticosLocal) throws Exception {
		
		if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarClientesHonomasticos cobrarclienteshonomasticosLocal) throws Exception {	
		if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarclienteshonomasticosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cobrarclienteshonomasticosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				cobrarclienteshonomasticosLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RegionDetalleFormJInternalFrame.class)) {
				RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrameLocal=(RegionBeanSwingJInternalFrame) ((RegionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				regionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRegion(regionBeanSwingJInternalFrameLocal.getregion(),true);
				regionBeanSwingJInternalFrameLocal.actualizarLista(regionBeanSwingJInternalFrameLocal.region,this.regionsForeignKey);

				regionBeanSwingJInternalFrameLocal.actualizarRelaciones(regionBeanSwingJInternalFrameLocal.region);

				cobrarclienteshonomasticosLocal.setRegion(regionBeanSwingJInternalFrameLocal.region);

				this.addItemDefectoCombosForeignKeyRegion();
				this.cargarCombosFrameRegionsForeignKey("Formulario");
				this.setActualRegionForeignKey(regionBeanSwingJInternalFrameLocal.region.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProvinciaDetalleFormJInternalFrame.class)) {
				ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrameLocal=(ProvinciaBeanSwingJInternalFrame) ((ProvinciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				provinciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProvincia(provinciaBeanSwingJInternalFrameLocal.getprovincia(),true);
				provinciaBeanSwingJInternalFrameLocal.actualizarLista(provinciaBeanSwingJInternalFrameLocal.provincia,this.provinciasForeignKey);

				provinciaBeanSwingJInternalFrameLocal.actualizarRelaciones(provinciaBeanSwingJInternalFrameLocal.provincia);

				cobrarclienteshonomasticosLocal.setProvincia(provinciaBeanSwingJInternalFrameLocal.provincia);

				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey("Formulario");
				this.setActualProvinciaForeignKey(provinciaBeanSwingJInternalFrameLocal.provincia.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				cobrarclienteshonomasticosLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarClientesHonomasticosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarclienteshonomasticosValidator.getInvalidValues(this.cobrarclienteshonomasticos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarClientesHonomasticos cobrarclienteshonomasticos,List<CobrarClientesHonomasticos> cobrarclienteshonomasticoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarClientesHonomasticos cobrarclienteshonomasticos,List<CobrarClientesHonomasticos> cobrarclienteshonomasticoss) throws Exception {
		try	{			
			CobrarClientesHonomasticosConstantesFunciones.actualizarSelectedLista(cobrarclienteshonomasticos,cobrarclienteshonomasticoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarClientesHonomasticos> cobrarclienteshonomasticossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarclienteshonomasticossLocal=this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarclienteshonomasticossLocal=this.cobrarclienteshonomasticoss;
			}
			//ARCHITECTURE
		
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosLocal:cobrarclienteshonomasticossLocal) {
				if(this.permiteMantenimiento(cobrarclienteshonomasticosLocal) && cobrarclienteshonomasticosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.getCobrarClientesHonomasticosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_ciudadCobrarClientesHonomasticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.NOMBRERUTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_rutaCobrarClientesHonomasticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_vendedorCobrarClientesHonomasticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelcodigoCobrarClientesHonomasticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_completoCobrarClientesHonomasticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.NOMBRECOMERCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_comercialCobrarClientesHonomasticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.FECHANACIMIENTODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.DIRECCIONDIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabeldireccion_direccionCobrarClientesHonomasticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesHonomasticosConstantesFunciones.TELEFONOTELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabeltelefono_telefonoCobrarClientesHonomasticos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_ciudadCobrarClientesHonomasticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_rutaCobrarClientesHonomasticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_vendedorCobrarClientesHonomasticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelcodigoCobrarClientesHonomasticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_completoCobrarClientesHonomasticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_comercialCobrarClientesHonomasticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabeldireccion_direccionCobrarClientesHonomasticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabeltelefono_telefonoCobrarClientesHonomasticos,"");
		
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
		this.iIdNuevoCobrarClientesHonomasticos--;	
		
		
		this.cobrarclienteshonomasticosAux=new CobrarClientesHonomasticos();
		
		this.cobrarclienteshonomasticosAux.setId(this.iIdNuevoCobrarClientesHonomasticos);
		this.cobrarclienteshonomasticosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().add(this.cobrarclienteshonomasticosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarclienteshonomasticoss.add(this.cobrarclienteshonomasticosAux);
		}
		//ARCHITECTURE
		
		this.cobrarclienteshonomasticos=this.cobrarclienteshonomasticosAux;
		
		if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
		}
				
		//this.setDefaultControlesCobrarClientesHonomasticos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarClientesHonomasticos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesHonomasticos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesHonomasticos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticosBean,this.cobrarclienteshonomasticos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesHonomasticos(this.cobrarclienteshonomasticosReturnGeneral,this.cobrarclienteshonomasticosBean,false);
		
		if(this.cobrarclienteshonomasticosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesHonomasticos(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarClientesHonomasticos(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos());
		}
		
		if(this.cobrarclienteshonomasticosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesHonomasticos(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos(),classes);//this.cobrarclienteshonomasticosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarClientesHonomasticos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarClientesHonomasticos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.RecargarFormCobrarClientesHonomasticos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
						
			if(cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesHonomasticos();
			}
			
			this.actualizarVisualTableDatosCobrarClientesHonomasticos();
			
			this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesHonomasticos(), this.getIndiceNuevoCobrarClientesHonomasticos());
			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
						
			this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarClientesHonomasticos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarfecha_nacimientoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_ciudadCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_ciudadCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_rutaCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_rutaCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_vendedorCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_vendedorCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextFieldcodigoCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarcodigoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_completoCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_completoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_comercialCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_comercialCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarfecha_nacimiento_datoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreadireccion_direccionCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activardireccion_direccionCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreatelefono_telefonoCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activartelefono_telefonoCobrarClientesHonomasticos);	
		//
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarid_empresaCobrarClientesHonomasticos);//
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarid_sucursalCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarid_paisCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarid_regionCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarid_provinciaCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setEnabled(isHabilitar && this.cobrarclienteshonomasticosConstantesFunciones.activarid_ciudadCobrarClientesHonomasticos);
	};
	
	public void setDefaultControlesCobrarClientesHonomasticos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarClientesHonomasticos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarclienteshonomasticosSessionBean.setConGuardarRelaciones(true);			
			this.cobrarclienteshonomasticosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.setVisible(true);
			
					
		} else {
			//this.cobrarclienteshonomasticosSessionBean.setConGuardarRelaciones(false);			
			this.cobrarclienteshonomasticosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarClientesHonomasticos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
				if(cobrarclienteshonomasticosAux.getId().equals(this.iIdNuevoCobrarClientesHonomasticos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticoss) {
				if(cobrarclienteshonomasticosAux.getId().equals(this.iIdNuevoCobrarClientesHonomasticos)) {
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
	
	public int getIndiceActualCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
				if(cobrarclienteshonomasticosAux.getId().equals(cobrarclienteshonomasticos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticoss) {
				if(cobrarclienteshonomasticosAux.getId().equals(cobrarclienteshonomasticos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
				if(cobrarclienteshonomasticosAux.getCobrarClientesHonomasticosOriginal().getId().equals(cobrarclienteshonomasticosOriginal.getId())) {
					existe=true;
					cobrarclienteshonomasticosOriginal.setId(cobrarclienteshonomasticosAux.getId());
					cobrarclienteshonomasticosOriginal.setVersionRow(cobrarclienteshonomasticosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticoss) {
				if(cobrarclienteshonomasticosAux.getCobrarClientesHonomasticosOriginal().getId().equals(cobrarclienteshonomasticosOriginal.getId())) {
					existe=true;
					cobrarclienteshonomasticosOriginal.setId(cobrarclienteshonomasticosAux.getId());
					cobrarclienteshonomasticosOriginal.setVersionRow(cobrarclienteshonomasticosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarClientesHonomasticos(Boolean esParaCancelar) throws Exception {
		cobrarclienteshonomasticossAux=new ArrayList<CobrarClientesHonomasticos>();
		cobrarclienteshonomasticosAux=new CobrarClientesHonomasticos();
		
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
					if(cobrarclienteshonomasticosAux.getId()<0) {
						cobrarclienteshonomasticossAux.add(cobrarclienteshonomasticosAux);
					}		
				}
				this.iIdNuevoCobrarClientesHonomasticos=0L;
				this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().removeAll(cobrarclienteshonomasticossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticoss) {
					if(cobrarclienteshonomasticosAux.getId()<0) {
						cobrarclienteshonomasticossAux.add(cobrarclienteshonomasticosAux);
					}		
				}
				this.iIdNuevoCobrarClientesHonomasticos=0L;
				this.cobrarclienteshonomasticoss.removeAll(cobrarclienteshonomasticossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesHonomasticos 
					&& this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size()>0
					) {
					cobrarclienteshonomasticosAux=this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().get(this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size() - 1);
				
					if(cobrarclienteshonomasticosAux.getId()<0) {
						this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().remove(cobrarclienteshonomasticosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesHonomasticos && this.cobrarclienteshonomasticoss.size()>0) {
					cobrarclienteshonomasticosAux=this.cobrarclienteshonomasticoss.get(this.cobrarclienteshonomasticoss.size() - 1);
				
					if(cobrarclienteshonomasticosAux.getId()<0) {
						this.cobrarclienteshonomasticoss.remove(cobrarclienteshonomasticosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarClientesHonomasticos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarclienteshonomasticos.getId()<0) {
				this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().remove(this.cobrarclienteshonomasticos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarclienteshonomasticos.getId()<0) {
				this.cobrarclienteshonomasticoss.remove(this.cobrarclienteshonomasticos);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarClientesHonomasticos(List<CobrarClientesHonomasticos> cobrarclienteshonomasticossAux) throws Exception {
		CobrarClientesHonomasticosConstantesFunciones.setEstadosInicialesCobrarClientesHonomasticos(cobrarclienteshonomasticossAux);
	}
	
	public void setEstadosInicialesCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticosAux) throws Exception {
		CobrarClientesHonomasticosConstantesFunciones.setEstadosInicialesCobrarClientesHonomasticos(cobrarclienteshonomasticosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarClientesHonomasticosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarClientesHonomasticosActual()) {
				if(!this.isEsNuevoCobrarClientesHonomasticos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarClientesHonomasticos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarClientesHonomasticosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Clientes Honomasticos ?", "MANTENIMIENTO DE Cobrar Clientes Honomasticos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarClientesHonomasticos cobrarclienteshonomasticos) throws Exception {
		CobrarClientesHonomasticosConstantesFunciones.seleccionarAsignar(this.cobrarclienteshonomasticos,cobrarclienteshonomasticos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarClientesHonomasticos=this.isPermisoActualizarOriginalCobrarClientesHonomasticos;
			
			
			this.seleccionarAsignar(cobrarclienteshonomasticos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarclienteshonomasticosSessionBean.setsFuncionBusquedaRapida(this.cobrarclienteshonomasticosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarClientesHonomasticos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarClientesHonomasticos(esParaCancelar);				
				this.cancelarNuevoCobrarClientesHonomasticos(esParaCancelar);								
			}
			
			this.cobrarclienteshonomasticos=new CobrarClientesHonomasticos();
			
			this.inicializarCobrarClientesHonomasticos();
			
			this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarClientesHonomasticos() throws Exception {
		try {
			CobrarClientesHonomasticosConstantesFunciones.inicializarCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarClientesHonomasticoss(String sAccionBusqueda,List<CobrarClientesHonomasticos> cobrarclienteshonomasticossParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarClientesHonomasticos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarClientesHonomasticosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarClientesHonomasticosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarClientesHonomasticos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Clientes Honomasticoses");		
		parameters.put("busquedapor", CobrarClientesHonomasticosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarClientesHonomasticos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarClientesHonomasticosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarClientesHonomasticosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarClientesHonomasticos=new JRBeanArrayDataSource(CobrarClientesHonomasticosJInternalFrame.TraerCobrarClientesHonomasticosBeans(cobrarclienteshonomasticossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarClientesHonomasticos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarClientesHonomasticosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarClientesHonomasticosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarClientesHonomasticosBean.TraerCobrarClientesHonomasticosBeans(cobrarclienteshonomasticossParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarClientesHonomasticoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclienteshonomasticossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarClientesHonomasticoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclienteshonomasticossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticosActionPerformed(null);
					//this.generarExcelReporteCobrarClientesHonomasticoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclienteshonomasticossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarClientesHonomasticoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclienteshonomasticossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarClientesHonomasticoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclienteshonomasticossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarClientesHonomasticoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclienteshonomasticossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarClientesHonomasticoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesHonomasticos> cobrarclienteshonomasticossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclienteshonomasticos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesHonomasticoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesHonomasticos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarClientesHonomasticos cobrarclienteshonomasticos : cobrarclienteshonomasticossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarClientesHonomasticosConstantesFunciones.generarExcelReporteDataCobrarClientesHonomasticos("NORMAL",row,workbook,cobrarclienteshonomasticos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarClientesHonomasticos(String sTipo,Row row,Workbook workbook) {
		
		CobrarClientesHonomasticosConstantesFunciones.generarExcelReporteHeaderCobrarClientesHonomasticos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarClientesHonomasticoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesHonomasticos> cobrarclienteshonomasticossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclienteshonomasticos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesHonomasticoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarClientesHonomasticos cobrarclienteshonomasticos : cobrarclienteshonomasticossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.getCobrarClientesHonomasticosDescripcion(cobrarclienteshonomasticos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getregion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getprovincia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getfecha_nacimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getnombre_ruta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getnombre_comercial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getfecha_nacimiento_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.getdireccion_direccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclienteshonomasticos.gettelefono_telefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarClientesHonomasticoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesHonomasticos> cobrarclienteshonomasticossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarClientesHonomasticos> cobrarclienteshonomasticossRespaldo=null;
		
		classes=CobrarClientesHonomasticosConstantesFunciones.getClassesRelationshipsOfCobrarClientesHonomasticos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarclienteshonomasticosLogic.setDatosCliente(this.datosCliente);
		this.cobrarclienteshonomasticosLogic.setDatosDeep(this.datosDeep);
		this.cobrarclienteshonomasticosLogic.setIsConDeep(true);
		
		cobrarclienteshonomasticossRespaldo=this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss();
		
		this.cobrarclienteshonomasticosLogic.setCobrarClientesHonomasticoss(cobrarclienteshonomasticossParaReportes);	
		this.cobrarclienteshonomasticosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarclienteshonomasticossParaReportes=this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss();
		this.cobrarclienteshonomasticosLogic.setCobrarClientesHonomasticoss(cobrarclienteshonomasticossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclienteshonomasticos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesHonomasticoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesHonomasticos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarClientesHonomasticos cobrarclienteshonomasticos : cobrarclienteshonomasticossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarClientesHonomasticos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarClientesHonomasticosConstantesFunciones.generarExcelReporteDataCobrarClientesHonomasticos("NORMAL",row,workbook,cobrarclienteshonomasticos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.getCobrarClientesHonomasticosDescripcion(cobrarclienteshonomasticos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarClientesHonomasticos() throws Exception {		
		this.startProcessCobrarClientesHonomasticos(true);
	}
	
	public void startProcessCobrarClientesHonomasticos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarClientesHonomasticos ,this.jPanelParametrosReportesCobrarClientesHonomasticos, this.jScrollPanelDatosCobrarClientesHonomasticos,this.jPanelPaginacionCobrarClientesHonomasticos, this.jScrollPanelDatosEdicionCobrarClientesHonomasticos, this.jPanelAccionesCobrarClientesHonomasticos,this.jPanelAccionesFormularioCobrarClientesHonomasticos,this.jmenuBarCobrarClientesHonomasticos,this.jmenuBarDetalleCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,this.jTtoolBarDetalleCobrarClientesHonomasticos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesHonomasticos=this.jTabbedPaneBusquedasCobrarClientesHonomasticos; 
		
		final JPanel jPanelParametrosReportesCobrarClientesHonomasticos=this.jPanelParametrosReportesCobrarClientesHonomasticos;
		//final JScrollPane jScrollPanelDatosCobrarClientesHonomasticos=this.jScrollPanelDatosCobrarClientesHonomasticos;
		final JTable jTableDatosCobrarClientesHonomasticos=this.jTableDatosCobrarClientesHonomasticos;		
		final JPanel jPanelPaginacionCobrarClientesHonomasticos=this.jPanelPaginacionCobrarClientesHonomasticos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesHonomasticos=this.jScrollPanelDatosEdicionCobrarClientesHonomasticos;
		final JPanel jPanelAccionesCobrarClientesHonomasticos=this.jPanelAccionesCobrarClientesHonomasticos;
		
		JPanel jPanelCamposAuxiliarCobrarClientesHonomasticos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesHonomasticos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			jPanelCamposAuxiliarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelCamposCobrarClientesHonomasticos;
			jPanelAccionesFormularioAuxiliarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelAccionesFormularioCobrarClientesHonomasticos;
		}
		
		final JPanel jPanelCamposCobrarClientesHonomasticos=jPanelCamposAuxiliarCobrarClientesHonomasticos;
		final JPanel jPanelAccionesFormularioCobrarClientesHonomasticos=jPanelAccionesFormularioAuxiliarCobrarClientesHonomasticos;
		
		
		final JMenuBar jmenuBarCobrarClientesHonomasticos=this.jmenuBarCobrarClientesHonomasticos;
		final JToolBar jTtoolBarCobrarClientesHonomasticos=this.jTtoolBarCobrarClientesHonomasticos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesHonomasticos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesHonomasticos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jmenuBarDetalleCobrarClientesHonomasticos;
			jTtoolBarDetalleAuxiliarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTtoolBarDetalleCobrarClientesHonomasticos;
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesHonomasticos=jmenuBarDetalleAuxiliarCobrarClientesHonomasticos;
		final JToolBar jTtoolBarDetalleCobrarClientesHonomasticos=jTtoolBarDetalleAuxiliarCobrarClientesHonomasticos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesHonomasticos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesHonomasticos;
			processRunnable.jTableDatos=jTableDatosCobrarClientesHonomasticos;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesHonomasticos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesHonomasticos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesHonomasticos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesHonomasticos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesHonomasticos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesHonomasticos;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesHonomasticos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesHonomasticos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesHonomasticos ,jPanelParametrosReportesCobrarClientesHonomasticos,jTableDatosCobrarClientesHonomasticos, /*jScrollPanelDatosCobrarClientesHonomasticos,*/jPanelCamposCobrarClientesHonomasticos,jPanelPaginacionCobrarClientesHonomasticos, /*jScrollPanelDatosEdicionCobrarClientesHonomasticos,*/ jPanelAccionesCobrarClientesHonomasticos,jPanelAccionesFormularioCobrarClientesHonomasticos,jmenuBarCobrarClientesHonomasticos,jmenuBarDetalleCobrarClientesHonomasticos,jTtoolBarCobrarClientesHonomasticos,jTtoolBarDetalleCobrarClientesHonomasticos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesHonomasticos ,jPanelParametrosReportesCobrarClientesHonomasticos, jScrollPanelDatosCobrarClientesHonomasticos,jPanelPaginacionCobrarClientesHonomasticos, jScrollPanelDatosEdicionCobrarClientesHonomasticos, jPanelAccionesCobrarClientesHonomasticos,jPanelAccionesFormularioCobrarClientesHonomasticos,jmenuBarCobrarClientesHonomasticos,jmenuBarDetalleCobrarClientesHonomasticos,jTtoolBarCobrarClientesHonomasticos,jTtoolBarDetalleCobrarClientesHonomasticos);
						
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
	
	public void finishProcessCobrarClientesHonomasticos() {// throws Exception 
		this.finishProcessCobrarClientesHonomasticos(true);
	}
	
	public void finishProcessCobrarClientesHonomasticos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarClientesHonomasticos ,this.jPanelParametrosReportesCobrarClientesHonomasticos, this.jScrollPanelDatosCobrarClientesHonomasticos,this.jPanelPaginacionCobrarClientesHonomasticos, this.jScrollPanelDatosEdicionCobrarClientesHonomasticos, this.jPanelAccionesCobrarClientesHonomasticos,this.jPanelAccionesFormularioCobrarClientesHonomasticos,this.jmenuBarCobrarClientesHonomasticos,this.jmenuBarDetalleCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,this.jTtoolBarDetalleCobrarClientesHonomasticos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesHonomasticos=this.jTabbedPaneBusquedasCobrarClientesHonomasticos; 
		
		final JPanel jPanelParametrosReportesCobrarClientesHonomasticos=this.jPanelParametrosReportesCobrarClientesHonomasticos;
		//final JScrollPane jScrollPanelDatosCobrarClientesHonomasticos=this.jScrollPanelDatosCobrarClientesHonomasticos;
		final JTable jTableDatosCobrarClientesHonomasticos=this.jTableDatosCobrarClientesHonomasticos;		
		final JPanel jPanelPaginacionCobrarClientesHonomasticos=this.jPanelPaginacionCobrarClientesHonomasticos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesHonomasticos=this.jScrollPanelDatosEdicionCobrarClientesHonomasticos;
		final JPanel jPanelAccionesCobrarClientesHonomasticos=this.jPanelAccionesCobrarClientesHonomasticos;
		
		JPanel jPanelCamposAuxiliarCobrarClientesHonomasticos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesHonomasticos=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			jPanelCamposAuxiliarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelCamposCobrarClientesHonomasticos;
			jPanelAccionesFormularioAuxiliarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelAccionesFormularioCobrarClientesHonomasticos;
		}
		
		final JPanel jPanelCamposCobrarClientesHonomasticos=jPanelCamposAuxiliarCobrarClientesHonomasticos;
		final JPanel jPanelAccionesFormularioCobrarClientesHonomasticos=jPanelAccionesFormularioAuxiliarCobrarClientesHonomasticos;
		
		
		final JMenuBar jmenuBarCobrarClientesHonomasticos=this.jmenuBarCobrarClientesHonomasticos;		
		final JToolBar jTtoolBarCobrarClientesHonomasticos=this.jTtoolBarCobrarClientesHonomasticos;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesHonomasticos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesHonomasticos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jmenuBarDetalleCobrarClientesHonomasticos;
			jTtoolBarDetalleAuxiliarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTtoolBarDetalleCobrarClientesHonomasticos;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesHonomasticos=jmenuBarDetalleAuxiliarCobrarClientesHonomasticos;
		final JToolBar jTtoolBarDetalleCobrarClientesHonomasticos=jTtoolBarDetalleAuxiliarCobrarClientesHonomasticos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesHonomasticos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesHonomasticos;
			processRunnable.jTableDatos=jTableDatosCobrarClientesHonomasticos;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesHonomasticos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesHonomasticos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesHonomasticos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesHonomasticos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesHonomasticos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesHonomasticos;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesHonomasticos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesHonomasticos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarClientesHonomasticos ,jPanelParametrosReportesCobrarClientesHonomasticos, jTableDatosCobrarClientesHonomasticos,/*jScrollPanelDatosCobrarClientesHonomasticos,*/jPanelCamposCobrarClientesHonomasticos,jPanelPaginacionCobrarClientesHonomasticos, /*jScrollPanelDatosEdicionCobrarClientesHonomasticos,*/ jPanelAccionesCobrarClientesHonomasticos,jPanelAccionesFormularioCobrarClientesHonomasticos,jmenuBarCobrarClientesHonomasticos,jmenuBarDetalleCobrarClientesHonomasticos,jTtoolBarCobrarClientesHonomasticos,jTtoolBarDetalleCobrarClientesHonomasticos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarClientesHonomasticos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarClientesHonomasticos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarClientesHonomasticos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarClientesHonomasticos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarClientesHonomasticos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarClientesHonomasticos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarClientesHonomasticos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarClientesHonomasticos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarClientesHonomasticos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarclienteshonomasticosConstantesFunciones.getsFinalQueryCobrarClientesHonomasticos();
		String  finalQueryPaginacionTodos=this.cobrarclienteshonomasticosConstantesFunciones.getsFinalQueryCobrarClientesHonomasticos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarClientesHonomasticosConstantesFunciones.getArrayColumnasGlobalesNoCobrarClientesHonomasticos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarClientesHonomasticosConstantesFunciones.getArrayColumnasGlobalesCobrarClientesHonomasticos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarClientesHonomasticosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarclienteshonomasticossEliminados= new ArrayList<CobrarClientesHonomasticos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarClientesHonomasticos();
		
				///*CobrarClientesHonomasticosSessionBean*/this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
			
			if(this.cobrarclienteshonomasticosSessionBean==null) {
				this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
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
					this.iNumeroPaginacion=CobrarClientesHonomasticosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarClientesHonomasticosConstantesFunciones.getClassesForeignKeysOfCobrarClientesHonomasticos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarclienteshonomasticos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarclienteshonomasticossAux= new ArrayList<CobrarClientesHonomasticos>();
			
				
			cobrarclienteshonomasticosLogic.setDatosCliente(this.datosCliente);
			cobrarclienteshonomasticosLogic.setDatosDeep(this.datosDeep);
			cobrarclienteshonomasticosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarClientesHonomasticos")) {
				this.sDetalleReporte=CobrarClientesHonomasticosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesHonomasticos(id_paisBusquedaCobrarClientesHonomasticos,id_regionBusquedaCobrarClientesHonomasticos,id_provinciaBusquedaCobrarClientesHonomasticos,id_ciudadBusquedaCobrarClientesHonomasticos,fecha_nacimientoBusquedaCobrarClientesHonomasticos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossBusquedaCobrarClientesHonomasticos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_paisBusquedaCobrarClientesHonomasticos,id_regionBusquedaCobrarClientesHonomasticos,id_provinciaBusquedaCobrarClientesHonomasticos,id_ciudadBusquedaCobrarClientesHonomasticos,fecha_nacimientoBusquedaCobrarClientesHonomasticos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesHonomasticosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesHonomasticos(id_paisBusquedaCobrarClientesHonomasticos,id_regionBusquedaCobrarClientesHonomasticos,id_provinciaBusquedaCobrarClientesHonomasticos,id_ciudadBusquedaCobrarClientesHonomasticos,fecha_nacimientoBusquedaCobrarClientesHonomasticos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesHonomasticosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesHonomasticos(id_paisBusquedaCobrarClientesHonomasticos,id_regionBusquedaCobrarClientesHonomasticos,id_provinciaBusquedaCobrarClientesHonomasticos,id_ciudadBusquedaCobrarClientesHonomasticos,fecha_nacimientoBusquedaCobrarClientesHonomasticos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()==null||cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarclienteshonomasticoss==null|| cobrarclienteshonomasticoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclienteshonomasticossAux=new ArrayList<CobrarClientesHonomasticos>();
						cobrarclienteshonomasticossAux.addAll(cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclienteshonomasticossAux=new ArrayList<CobrarClientesHonomasticos>();
							cobrarclienteshonomasticossAux.addAll(cobrarclienteshonomasticoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossBusquedaCobrarClientesHonomasticos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_paisBusquedaCobrarClientesHonomasticos,id_regionBusquedaCobrarClientesHonomasticos,id_provinciaBusquedaCobrarClientesHonomasticos,id_ciudadBusquedaCobrarClientesHonomasticos,fecha_nacimientoBusquedaCobrarClientesHonomasticos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesHonomasticosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesHonomasticos(id_paisBusquedaCobrarClientesHonomasticos,id_regionBusquedaCobrarClientesHonomasticos,id_provinciaBusquedaCobrarClientesHonomasticos,id_ciudadBusquedaCobrarClientesHonomasticos,fecha_nacimientoBusquedaCobrarClientesHonomasticos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesHonomasticosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesHonomasticos(id_paisBusquedaCobrarClientesHonomasticos,id_regionBusquedaCobrarClientesHonomasticos,id_provinciaBusquedaCobrarClientesHonomasticos,id_ciudadBusquedaCobrarClientesHonomasticos,fecha_nacimientoBusquedaCobrarClientesHonomasticos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarClientesHonomasticoss("BusquedaCobrarClientesHonomasticos",cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarClientesHonomasticoss("BusquedaCobrarClientesHonomasticos",cobrarclienteshonomasticoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclienteshonomasticosLogic.setCobrarClientesHonomasticoss(new ArrayList<CobrarClientesHonomasticos>());
						cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().addAll(cobrarclienteshonomasticossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclienteshonomasticoss=new ArrayList<CobrarClientesHonomasticos>();
							cobrarclienteshonomasticoss.addAll(cobrarclienteshonomasticossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarClientesHonomasticos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarClientesHonomasticos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclienteshonomasticoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclienteshonomasticoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarClientesHonomasticos cobrarclienteshonomasticos) {
		Boolean permite=true;
		
		if(this.cobrarclienteshonomasticos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarClientesHonomasticosConstantesFunciones.getOrderByListaCobrarClientesHonomasticos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarClientesHonomasticosConstantesFunciones.getOrderByListaCobrarClientesHonomasticos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
				if(cobrarclienteshonomasticos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclienteshonomasticosTotales=cobrarclienteshonomasticos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticos:this.cobrarclienteshonomasticoss) {
				if(cobrarclienteshonomasticos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclienteshonomasticosTotales=cobrarclienteshonomasticos;
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
			this.cobrarclienteshonomasticosAux=new CobrarClientesHonomasticos();
			this.cobrarclienteshonomasticosAux.setsType(Constantes2.S_TOTALES);
			this.cobrarclienteshonomasticosAux.setIsNew(false);
			this.cobrarclienteshonomasticosAux.setIsChanged(false);
			this.cobrarclienteshonomasticosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarClientesHonomasticosConstantesFunciones.TotalizarValoresFilaCobrarClientesHonomasticos(this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss(),this.cobrarclienteshonomasticosAux);
				
				//this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().add(this.cobrarclienteshonomasticosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarClientesHonomasticosConstantesFunciones.TotalizarValoresFilaCobrarClientesHonomasticos(this.cobrarclienteshonomasticoss,this.cobrarclienteshonomasticosAux);
				
				this.cobrarclienteshonomasticoss.add(this.cobrarclienteshonomasticosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarclienteshonomasticosTotales=new CobrarClientesHonomasticos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().remove(cobrarclienteshonomasticosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclienteshonomasticoss.remove(cobrarclienteshonomasticosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarclienteshonomasticosTotales=new CobrarClientesHonomasticos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
				if(cobrarclienteshonomasticos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclienteshonomasticosTotales=cobrarclienteshonomasticos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesHonomasticosConstantesFunciones.TotalizarValoresFilaCobrarClientesHonomasticos(this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss(),cobrarclienteshonomasticosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticos:this.cobrarclienteshonomasticoss) {
				if(cobrarclienteshonomasticos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclienteshonomasticosTotales=cobrarclienteshonomasticos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesHonomasticosConstantesFunciones.TotalizarValoresFilaCobrarClientesHonomasticos(this.cobrarclienteshonomasticoss,cobrarclienteshonomasticosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarClientesHonomasticossBusquedaCobrarClientesHonomasticos()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarClientesHonomasticos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesHonomasticossFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesHonomasticossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesHonomasticossFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesHonomasticossFK_IdProvincia()throws Exception {
		try {
			sAccionBusqueda="FK_IdProvincia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesHonomasticossFK_IdRegion()throws Exception {
		try {
			sAccionBusqueda="FK_IdRegion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesHonomasticossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarClientesHonomasticossBusquedaCobrarClientesHonomasticos(String sFinalQuery,Long id_pais,Long id_region,Long id_provincia,Long id_ciudad,Date fecha_nacimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossBusquedaCobrarClientesHonomasticos(sFinalQuery,this.pagination,id_pais,id_region,id_provincia,id_ciudad,fecha_nacimiento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesHonomasticossFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesHonomasticossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesHonomasticossFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesHonomasticossFK_IdProvincia(String sFinalQuery,Long id_provincia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossFK_IdProvincia(sFinalQuery,this.pagination,id_provincia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesHonomasticossFK_IdRegion(String sFinalQuery,Long id_region)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossFK_IdRegion(sFinalQuery,this.pagination,id_region);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesHonomasticossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCobrarClientesHonomasticos() {
		this.isPermisoTodoCobrarClientesHonomasticos=false;
		this.isPermisoNuevoCobrarClientesHonomasticos=false;
		this.isPermisoActualizarCobrarClientesHonomasticos=false;
		this.isPermisoActualizarOriginalCobrarClientesHonomasticos=false;
		this.isPermisoEliminarCobrarClientesHonomasticos=false;
		this.isPermisoGuardarCambiosCobrarClientesHonomasticos=false;
		this.isPermisoConsultaCobrarClientesHonomasticos=true;
		this.isPermisoBusquedaCobrarClientesHonomasticos=true;
		this.isPermisoReporteCobrarClientesHonomasticos=true;
		this.isPermisoOrdenCobrarClientesHonomasticos=false;		
		this.isPermisoPaginacionMedioCobrarClientesHonomasticos=false;		
		this.isPermisoPaginacionAltoCobrarClientesHonomasticos=false;		
		this.isPermisoPaginacionTodoCobrarClientesHonomasticos=false;		
		this.isPermisoCopiarCobrarClientesHonomasticos=false;		
		this.isPermisoVerFormCobrarClientesHonomasticos=false;		
		this.isPermisoDuplicarCobrarClientesHonomasticos=false;
		this.isPermisoOrdenCobrarClientesHonomasticos=false;
	}
	
	public void setPermisosUsuarioCobrarClientesHonomasticos(Boolean isPermiso) {
		this.isPermisoTodoCobrarClientesHonomasticos=isPermiso;
		this.isPermisoNuevoCobrarClientesHonomasticos=isPermiso;
		this.isPermisoActualizarCobrarClientesHonomasticos=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesHonomasticos=isPermiso;
		this.isPermisoEliminarCobrarClientesHonomasticos=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesHonomasticos=isPermiso;
		this.isPermisoConsultaCobrarClientesHonomasticos=isPermiso;
		this.isPermisoBusquedaCobrarClientesHonomasticos=isPermiso;
		this.isPermisoReporteCobrarClientesHonomasticos=isPermiso;
		this.isPermisoOrdenCobrarClientesHonomasticos=isPermiso;		
		this.isPermisoPaginacionMedioCobrarClientesHonomasticos=isPermiso;		
		this.isPermisoPaginacionAltoCobrarClientesHonomasticos=isPermiso;		
		this.isPermisoPaginacionTodoCobrarClientesHonomasticos=isPermiso;		
		this.isPermisoCopiarCobrarClientesHonomasticos=isPermiso;		
		this.isPermisoVerFormCobrarClientesHonomasticos=isPermiso;		
		this.isPermisoDuplicarCobrarClientesHonomasticos=isPermiso;
		this.isPermisoOrdenCobrarClientesHonomasticos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarClientesHonomasticos(Boolean isPermiso) {
		//this.isPermisoTodoCobrarClientesHonomasticos=isPermiso;
		this.isPermisoNuevoCobrarClientesHonomasticos=isPermiso;
		this.isPermisoActualizarCobrarClientesHonomasticos=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesHonomasticos=isPermiso;
		this.isPermisoEliminarCobrarClientesHonomasticos=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesHonomasticos=isPermiso;
		//this.isPermisoConsultaCobrarClientesHonomasticos=isPermiso;
		//this.isPermisoBusquedaCobrarClientesHonomasticos=isPermiso;
		//this.isPermisoReporteCobrarClientesHonomasticos=isPermiso;
		//this.isPermisoOrdenCobrarClientesHonomasticos=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarClientesHonomasticos=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarClientesHonomasticos=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarClientesHonomasticos=isPermiso;		
		//this.isPermisoCopiarCobrarClientesHonomasticos=isPermiso;		
		//this.isPermisoDuplicarCobrarClientesHonomasticos=isPermiso;
		//this.isPermisoOrdenCobrarClientesHonomasticos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesHonomasticosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarClientesHonomasticosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarClientesHonomasticos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesHonomasticosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarClientesHonomasticosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarClientesHonomasticosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarClientesHonomasticosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarClientesHonomasticos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarClientesHonomasticosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarClientesHonomasticosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarClientesHonomasticos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarClientesHonomasticos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarClientesHonomasticos=this.isPermisoActualizarCobrarClientesHonomasticos;
			this.isPermisoEliminarCobrarClientesHonomasticos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarClientesHonomasticos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarClientesHonomasticos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarClientesHonomasticos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarClientesHonomasticos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarClientesHonomasticos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesHonomasticos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarClientesHonomasticos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarClientesHonomasticos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarClientesHonomasticos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarClientesHonomasticos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarClientesHonomasticos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarClientesHonomasticos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesHonomasticos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarClientesHonomasticos.setToolTipText(this.jTableDatosCobrarClientesHonomasticos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarClientesHonomasticos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarClientesHonomasticos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarClientesHonomasticosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarClientesHonomasticosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarClientesHonomasticos() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarClientesHonomasticosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.regionsForeignKey=new ArrayList();
				this.provinciasForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarClientesHonomasticosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarClientesHonomasticosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRegionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRegionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.regionsForeignKey==null||this.regionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RegionConstantesFunciones.getArrayColumnasGlobalesRegion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RegionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RegionConstantesFunciones.SFINALQUERY;

				this.cargarCombosRegionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProvinciaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProvinciaConstantesFunciones.SFINALQUERY;

				this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarClientesHonomasticos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyRegion();
			this.addItemDefectoCombosForeignKeyProvincia();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarclienteshonomasticosSessionBean==null) {
				this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
			}

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyRegion()throws Exception {
		try {

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionRegion()) {
				Region region=new Region();
				RegionConstantesFunciones.setRegionDescripcion(region,Constantes.SMENSAJE_ESCOJA_OPCION);
				region.setId(null);

				if(!RegionConstantesFunciones.ExisteEnLista(this.regionsForeignKey,region,true)) {

					this.regionsForeignKey.add(0,region);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				Provincia provincia=new Provincia();
				ProvinciaConstantesFunciones.setProvinciaDescripcion(provincia,Constantes.SMENSAJE_ESCOJA_OPCION);
				provincia.setId(null);

				if(!ProvinciaConstantesFunciones.ExisteEnLista(this.provinciasForeignKey,provincia,true)) {

					this.provinciasForeignKey.add(0,provincia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.cobrarclienteshonomasticosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCobrarClientesHonomasticos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarClientesHonomasticos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarClientesHonomasticos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesHonomasticos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarClientesHonomasticos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesHonomasticos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarClientesHonomasticos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarClientesHonomasticos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarClientesHonomasticos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarClientesHonomasticos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameRegionsForeignKey("Todos");
			this.cargarCombosFrameProvinciasForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarClientesHonomasticos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRegionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarClientesHonomasticos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public CobrarClientesHonomasticosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarClientesHonomasticosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarClientesHonomasticosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean(); 
		this.cobrarclienteshonomasticosConstantesFunciones=new CobrarClientesHonomasticosConstantesFunciones(); 
		this.cobrarclienteshonomasticosBean=new CobrarClientesHonomasticos();//(this.cobrarclienteshonomasticosConstantesFunciones); 		
		this.cobrarclienteshonomasticosReturnGeneral=new CobrarClientesHonomasticosParameterReturnGeneral(); 
		
		this.cobrarclienteshonomasticosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclienteshonomasticosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarClientesHonomasticosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarClientesHonomasticosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarClientesHonomasticosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarClientesHonomasticos(true);
			
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
			
			this.cobrarclienteshonomasticosConstantesFunciones=new CobrarClientesHonomasticosConstantesFunciones(); 
			this.cobrarclienteshonomasticosBean=new CobrarClientesHonomasticos();//this.cobrarclienteshonomasticosConstantesFunciones); 			
			this.cobrarclienteshonomasticosReturnGeneral=new CobrarClientesHonomasticosParameterReturnGeneral(); 
		
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Honomasticos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cobrarclienteshonomasticos=new CobrarClientesHonomasticos();
			this.cobrarclienteshonomasticoss = new ArrayList<CobrarClientesHonomasticos>();
			this.cobrarclienteshonomasticossAux = new ArrayList<CobrarClientesHonomasticos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic=new CobrarClientesHonomasticosLogic();
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarclienteshonomasticosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarclienteshonomasticosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarClientesHonomasticos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos);	
					}
					
					if(this.jInternalFrameImportacionCobrarClientesHonomasticos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesHonomasticos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarClientesHonomasticos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarClientesHonomasticos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesHonomasticos);
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setVisible(false);
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos);
					this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarClientesHonomasticos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesHonomasticos);
					this.jInternalFrameImportacionCobrarClientesHonomasticos.setVisible(false);
					this.jInternalFrameImportacionCobrarClientesHonomasticos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarClientesHonomasticos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesHonomasticos);
					this.jInternalFrameOrderByCobrarClientesHonomasticos.setVisible(false);
					this.jInternalFrameOrderByCobrarClientesHonomasticos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarClientesHonomasticosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarClientesHonomasticosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarclienteshonomasticosReturnGeneral=new CobrarClientesHonomasticosParameterReturnGeneral();
			
			this.cobrarclienteshonomasticosParameterGeneral=new CobrarClientesHonomasticosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarclienteshonomasticosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarClientesHonomasticosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesHonomasticosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado(),this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesHonomasticosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado(),this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaCopiarCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaVerFormCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;
			
			
			this.isVisibilidadBusquedaCobrarClientesHonomasticos=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdProvincia=true;
			this.isVisibilidadFK_IdRegion=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarClientesHonomasticos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarClientesHonomasticos(false);
			
			this.setPermisosUsuarioCobrarClientesHonomasticos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado() && this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarClientesHonomasticosClasesRelacionadas();
			}
			
			if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarClientesHonomasticosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarClientesHonomasticos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesHonomasticos();
			}
			
			if(!this.isPermisoBusquedaCobrarClientesHonomasticos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarClientesHonomasticosConstantesFunciones.getTiposSeleccionarCobrarClientesHonomasticos());
				
				this.tiposColumnasSelect=CobrarClientesHonomasticosConstantesFunciones.getTiposSeleccionarCobrarClientesHonomasticos(true);
				
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
			//if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarClientesHonomasticos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioCobrarClientesHonomasticos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioCobrarClientesHonomasticos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesHonomasticos() ;
			
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
			this.paisLogic=new PaisLogic();
			this.regionLogic=new RegionLogic();
			this.provinciaLogic=new ProvinciaLogic();
			this.ciudadLogic=new CiudadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobrarclienteshonomasticosImplementable= (CobrarClientesHonomasticosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesHonomasticosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarclienteshonomasticosImplementableHome= (CobrarClientesHonomasticosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesHonomasticosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarclienteshonomasticoss= new ArrayList<CobrarClientesHonomasticos>();
			this.cobrarclienteshonomasticossEliminados= new ArrayList<CobrarClientesHonomasticos>();
						
			this.isEsNuevoCobrarClientesHonomasticos=false;
			this.esParaAccionDesdeFormularioCobrarClientesHonomasticos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.regionsForeignKey=new ArrayList<Region>() ;
			this.provinciasForeignKey=new ArrayList<Provincia>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarClientesHonomasticos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarClientesHonomasticos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarClientesHonomasticosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarClientesHonomasticos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarClientesHonomasticos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarClientesHonomasticos();
			}
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarClientesHonomasticos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarClientesHonomasticos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarClientesHonomasticos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarClientesHonomasticos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarClientesHonomasticos")) {
				iIndex=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarClientesHonomasticos();	
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
	
	public void cargarCombosForeignKeyCobrarClientesHonomasticos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarClientesHonomasticos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarClientesHonomasticos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarClientesHonomasticosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarClientesHonomasticos();
		
		this.cargarCombosFrameForeignKeyCobrarClientesHonomasticos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarClientesHonomasticos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarClientesHonomasticos();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRegion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRegionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRegion();
				this.cargarCombosFrameRegionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRegion(this.regionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProvincia(this.provinciasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCobrarClientesHonomasticosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
			
			if(jTableDatosCobrarClientesHonomasticos.getRowCount()>=1) {
				jTableDatosCobrarClientesHonomasticos.removeRowSelectionInterval(0, jTableDatosCobrarClientesHonomasticos.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarClientesHonomasticos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarClientesHonomasticos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarClientesHonomasticos(true);			
			//this.cobrarclienteshonomasticos=new CobrarClientesHonomasticos();
			//this.cobrarclienteshonomasticos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesHonomasticos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos() ;
			
			if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesHonomasticos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarclienteshonomasticos);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);				
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
			if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarClientesHonomasticos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarClientesHonomasticosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarClientesHonomasticos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesHonomasticos.getSelectedRows().length;			
			}
			
			cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarClientesHonomasticos--;			
				//CobrarClientesHonomasticos cobrarclienteshonomasticosAux= new CobrarClientesHonomasticos();			
				//cobrarclienteshonomasticosAux.setId(this.iIdNuevoCobrarClientesHonomasticos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarClientesHonomasticos cobrarclienteshonomasticosOrigen=new CobrarClientesHonomasticos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosOrigen : cobrarclienteshonomasticossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarclienteshonomasticosOrigen =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclienteshonomasticosOrigen =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarClientesHonomasticos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarclienteshonomasticos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarClientesHonomasticos(cobrarclienteshonomasticosOrigen,this.cobrarclienteshonomasticos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().add(this.cobrarclienteshonomasticosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticoss.add(this.cobrarclienteshonomasticosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
				
				this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesHonomasticos(), this.getIndiceNuevoCobrarClientesHonomasticos());
				
				int iLastRow =  this.jTableDatosCobrarClientesHonomasticos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesHonomasticos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesHonomasticos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();									
		
			CobrarClientesHonomasticos cobrarclienteshonomasticosOrigen=new CobrarClientesHonomasticos();
			CobrarClientesHonomasticos cobrarclienteshonomasticosDestino=new CobrarClientesHonomasticos();
				
			cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesHonomasticos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarclienteshonomasticossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarClientesHonomasticos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclienteshonomasticosOrigen =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclienteshonomasticosOrigen =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclienteshonomasticosDestino =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclienteshonomasticosDestino =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarclienteshonomasticosOrigen =cobrarclienteshonomasticossSeleccionados.get(0);
				cobrarclienteshonomasticosDestino =cobrarclienteshonomasticossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarClientesHonomasticos(cobrarclienteshonomasticosOrigen,cobrarclienteshonomasticosDestino,true,false);
				
				cobrarclienteshonomasticosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarclienteshonomasticosDestino,cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarclienteshonomasticosDestino,cobrarclienteshonomasticoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
				
				//this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesHonomasticos(), this.getIndiceNuevoCobrarClientesHonomasticos());
				
				int iLastRow =  this.jTableDatosCobrarClientesHonomasticos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesHonomasticos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesHonomasticos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarClientesHonomasticos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(!isVisible);
			this.jPanelPaginacionCobrarClientesHonomasticos.setVisible(!isVisible);
			this.jPanelAccionesCobrarClientesHonomasticos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarClientesHonomasticos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarClientesHonomasticos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarClientesHonomasticos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarClientesHonomasticos();
			
			this.abrirFrameOrderByCobrarClientesHonomasticos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarClientesHonomasticos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarClientesHonomasticos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesHonomasticos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setSize(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.iWidthFormulario,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarClientesHonomasticos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarClientesHonomasticos.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jContentPaneDetalleCobrarClientesHonomasticos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jContentPaneDetalleCobrarClientesHonomasticos.getWidth(),CobrarClientesHonomasticosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jContentPaneDetalleCobrarClientesHonomasticos.getWidth(),CobrarClientesHonomasticosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jContentPaneDetalleCobrarClientesHonomasticos.getWidth(),CobrarClientesHonomasticosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarClientesHonomasticos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarClientesHonomasticos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarClientesHonomasticos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesHonomasticos,false,this);
				} else {
					this.jInternalFrameOrderByCobrarClientesHonomasticos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesHonomasticos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesHonomasticos);
				this.jInternalFrameOrderByCobrarClientesHonomasticos.setVisible(false);
				this.jInternalFrameOrderByCobrarClientesHonomasticos.setSelected(false);
				
				this.jInternalFrameOrderByCobrarClientesHonomasticos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesHonomasticos"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarClientesHonomasticos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarClientesHonomasticos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarClientesHonomasticos==null) {
				
				this.jInternalFrameImportacionCobrarClientesHonomasticos=new ImportacionJInternalFrame(CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesHonomasticos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesHonomasticos);
				this.jInternalFrameImportacionCobrarClientesHonomasticos.setVisible(false);
				this.jInternalFrameImportacionCobrarClientesHonomasticos.setSelected(false);


				this.jInternalFrameImportacionCobrarClientesHonomasticos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesHonomasticos"));
				this.jInternalFrameImportacionCobrarClientesHonomasticos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesHonomasticos"));
				this.jInternalFrameImportacionCobrarClientesHonomasticos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesHonomasticos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarClientesHonomasticos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos==null) {
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos=new ReporteDinamicoJInternalFrame(CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos);
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesHonomasticos"));
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesHonomasticos"));
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesHonomasticos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesHonomasticos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarClientesHonomasticos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesHonomasticos);
			
	       	this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.dispose();
			//this.jInternalFrameDetalleFormCobrarClientesHonomasticos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarClientesHonomasticos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarClientesHonomasticos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarClientesHonomasticos.setVisible(true);
	        this.jInternalFrameImportacionCobrarClientesHonomasticos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarClientesHonomasticos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setVisible(true);
	        this.jInternalFrameOrderByCobrarClientesHonomasticos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarClientesHonomasticos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setVisible(false);
	        this.jInternalFrameOrderByCobrarClientesHonomasticos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarClientesHonomasticos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarClientesHonomasticos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarClientesHonomasticos.setVisible(false);
	        this.jInternalFrameImportacionCobrarClientesHonomasticos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarClientesHonomasticos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarClientesHonomasticos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarClientesHonomasticos(true);
			//this.isEsNuevoCobrarClientesHonomasticos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesHonomasticos(false) ;
			
			if(cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesHonomasticos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarClientesHonomasticosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarClientesHonomasticos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarClientesHonomasticos(true);
			//this.isEsNuevoCobrarClientesHonomasticos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarclienteshonomasticos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarClientesHonomasticos(false) ;
			
			if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesHonomasticos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaRegion(List<Region> regionsForeignKey)throws Exception{
		TableColumn tableColumnRegion=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION));
		TableCellEditor tableCellEditorRegion =tableColumnRegion.getCellEditor();

		RegionTableCell regionTableCellFk=(RegionTableCell)tableCellEditorRegion;

		if(regionTableCellFk!=null) {
			regionTableCellFk.setregionsForeignKey(regionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//regionTableCellFk.setRowActual(intSelectedRow);
			//regionTableCellFk.setregionsForeignKeyActual(regionsForeignKey);
		//}


		if(regionTableCellFk!=null) {
			regionTableCellFk.RecargarRegionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasForeignKey)throws Exception{
		TableColumn tableColumnProvincia=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		ProvinciaTableCell provinciaTableCellFk=(ProvinciaTableCell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasForeignKey(provinciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//provinciaTableCellFk.setRowActual(intSelectedRow);
			//provinciaTableCellFk.setprovinciasForeignKeyActual(provinciasForeignKey);
		//}


		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.RecargarProvinciasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesHonomasticos(false);
			
			//if(!this.isEsNuevoCobrarClientesHonomasticos) {								
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarclienteshonomasticos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarClientesHonomasticos=true;
					this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
					this.isEsNuevoCobrarClientesHonomasticos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarClientesHonomasticos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarClientesHonomasticos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesHonomasticos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesHonomasticos(false);
			
												
				
				if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarClientesHonomasticos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarclienteshonomasticos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclienteshonomasticos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclienteshonomasticos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarclienteshonomasticos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarClientesHonomasticosModel) this.jTableDatosCobrarClientesHonomasticos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarClientesHonomasticos=true;
				this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
				this.isEsNuevoCobrarClientesHonomasticos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesHonomasticos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesHonomasticos(false);
				
				
				
				if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarClientesHonomasticos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarClientesHonomasticos.getRowCount()>=1) {
				jTableDatosCobrarClientesHonomasticos.removeRowSelectionInterval(0, jTableDatosCobrarClientesHonomasticos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarClientesHonomasticos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesHonomasticos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos(false) ;
			
			this.isEsNuevoCobrarClientesHonomasticos=false;
			
			if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarClientesHonomasticos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				
				//SI ES MANUAL
				if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarClientesHonomasticos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarClientesHonomasticos--;			
			//CobrarClientesHonomasticos cobrarclienteshonomasticosAux= new CobrarClientesHonomasticos();			
			//cobrarclienteshonomasticosAux.setId(this.iIdNuevoCobrarClientesHonomasticos);
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarClientesHonomasticos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
			
			this.cobrarclienteshonomasticos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().add(this.cobrarclienteshonomasticosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarclienteshonomasticoss.add(this.cobrarclienteshonomasticosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
			
			this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesHonomasticos(), this.getIndiceNuevoCobrarClientesHonomasticos());
			
			int iLastRow =  this.jTableDatosCobrarClientesHonomasticos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarClientesHonomasticos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarClientesHonomasticos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
			
			//SI ES MANUAL
			if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesHonomasticos();
			}
			
			//this.abrirFrameTreeCobrarClientesHonomasticos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarClientesHonomasticos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarClientesHonomasticos.setFileImportacion(this.jInternalFrameImportacionCobrarClientesHonomasticos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarClientesHonomasticos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarClientesHonomasticos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarClientesHonomasticos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarClientesHonomasticos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		

		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarClientesHonomasticosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarClientesHonomasticosBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarClientesHonomasticoss("Todos",cobrarclienteshonomasticossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreRuta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreRuta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreRuta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreRuta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreComercial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreComercial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreComercial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreComercial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaNacimientoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaNacimientoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaNacimientoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaNacimientoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionDireccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionDireccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionDireccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionDireccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoTelefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoTelefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoTelefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoTelefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA:
					sNombreCampoCategoria="nombre_ruta";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					sNombreCampoCategoria="nombre_comercial";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO:
					sNombreCampoCategoria="fecha_nacimiento_dato";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoria="direccion_direccion";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoria="telefono_telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA:
					sNombreCampoCategoriaValor="nombre_ruta";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					sNombreCampoCategoriaValor="nombre_comercial";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO:
					sNombreCampoCategoriaValor="fecha_nacimiento_dato";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoriaValor="direccion_direccion";
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoriaValor="telefono_telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ruta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ruta");
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Comercial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_comercial");
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Nacimiento Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_nacimiento_dato");
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_direccion");
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclienteshonomasticos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarClientesHonomasticoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getregion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getprovincia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getfecha_nacimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getnombre_ruta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getnombre_comercial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getfecha_nacimiento_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.getdireccion_direccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO);
					iRow++;

					for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclienteshonomasticos.gettelefono_telefono());
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
			//	this.getFilaCabeceraExportarExcelCobrarClientesHonomasticos(row);				
			//	iRow++;
			//}				
			
			//for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarClientesHonomasticos(cobrarclienteshonomasticosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
			
			//SI ES MANUAL
			if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesHonomasticos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
			
			//SI ES MANUAL
			if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesHonomasticos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
			
			//SI ES MANUAL
			if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesHonomasticos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarClientesHonomasticos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarClientesHonomasticos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarClientesHonomasticos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarClientesHonomasticos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarClientesHonomasticos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarClientesHonomasticos.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarClientesHonomasticos.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarClientesHonomasticos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarClientesHonomasticos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarClientesHonomasticos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarClientesHonomasticos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarClientesHonomasticos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarClientesHonomasticos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesHonomasticos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesHonomasticos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarClientesHonomasticos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarClientesHonomasticos();
		
		this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesHonomasticos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesHonomasticos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesHonomasticos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesHonomasticos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarClientesHonomasticos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jCheckBoxPostAccionNuevoCobrarClientesHonomasticos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jCheckBoxPostAccionSinCerrarCobrarClientesHonomasticos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jCheckBoxPostAccionSinMensajeCobrarClientesHonomasticos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarClientesHonomasticos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jCheckBoxPostAccionNuevoCobrarClientesHonomasticos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jCheckBoxPostAccionSinCerrarCobrarClientesHonomasticos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jCheckBoxPostAccionSinMensajeCobrarClientesHonomasticos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarClientesHonomasticos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarClientesHonomasticos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarClientesHonomasticos(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesHonomasticos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesHonomasticos() throws Exception {
		try	{
			if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesHonomasticos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesHonomasticos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesHonomasticos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarClientesHonomasticos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarClientesHonomasticos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.addItem(reporte);
			}
			
			
			if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarClientesHonomasticos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarClientesHonomasticos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesHonomasticos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesHonomasticos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarClientesHonomasticos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getSelectedItem()!=null){this.id_paisBusquedaCobrarClientesHonomasticos=((Pais)this.jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getSelectedItem()).getId();}
		if(this.jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getSelectedItem()!=null){this.id_regionBusquedaCobrarClientesHonomasticos=((Region)this.jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getSelectedItem()).getId();}
		if(this.jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getSelectedItem()!=null){this.id_provinciaBusquedaCobrarClientesHonomasticos=((Provincia)this.jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getSelectedItem()).getId();}
		if(this.jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getSelectedItem()!=null){this.id_ciudadBusquedaCobrarClientesHonomasticos=((Ciudad)this.jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getSelectedItem()).getId();}
		this.fecha_nacimientoBusquedaCobrarClientesHonomasticos=new Date(this.jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarClientesHonomasticos(Boolean esInicializar) throws Exception {				
		if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesHonomasticos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarClientesHonomasticos() throws Exception {
		this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarClientesHonomasticos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarClientesHonomasticosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarClientesHonomasticos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarclienteshonomasticoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarClientesHonomasticos.setModel(new CobrarClientesHonomasticosModel(this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarClientesHonomasticos.setModel(new CobrarClientesHonomasticosModel(this.cobrarclienteshonomasticoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarClientesHonomasticos!=null && this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarClientesHonomasticos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO,cobrarclienteshonomasticosConstantesFunciones.resaltarSeleccionarCobrarClientesHonomasticos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO,cobrarclienteshonomasticosConstantesFunciones.resaltarSeleccionarCobrarClientesHonomasticos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_ID));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostraridCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltaridCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activaridCobrarClientesHonomasticos,this,true,"idCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltaridCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activaridCobrarClientesHonomasticos,this,true,"idCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_ciudadCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_ciudadCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_ciudadCobrarClientesHonomasticos,this,true,"nombre_ciudadCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_ciudadCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_ciudadCobrarClientesHonomasticos,this,true,"nombre_ciudadCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_rutaCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_rutaCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_rutaCobrarClientesHonomasticos,this,true,"nombre_rutaCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_rutaCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_rutaCobrarClientesHonomasticos,this,true,"nombre_rutaCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_vendedorCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_vendedorCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_vendedorCobrarClientesHonomasticos,this,true,"nombre_vendedorCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_vendedorCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_vendedorCobrarClientesHonomasticos,this,true,"nombre_vendedorCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrarcodigoCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarcodigoCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarcodigoCobrarClientesHonomasticos,this,true,"codigoCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarcodigoCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarcodigoCobrarClientesHonomasticos,this,true,"codigoCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_completoCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_completoCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_completoCobrarClientesHonomasticos,this,true,"nombre_completoCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_completoCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_completoCobrarClientesHonomasticos,this,true,"nombre_completoCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_comercialCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_comercialCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_comercialCobrarClientesHonomasticos,this,true,"nombre_comercialCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_comercialCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_comercialCobrarClientesHonomasticos,this,true,"nombre_comercialCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrarfecha_nacimiento_datoCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarfecha_nacimiento_datoCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarfecha_nacimiento_datoCobrarClientesHonomasticos,this,true,"fecha_nacimiento_datoCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltarfecha_nacimiento_datoCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activarfecha_nacimiento_datoCobrarClientesHonomasticos,this,true,"fecha_nacimiento_datoCobrarClientesHonomasticos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrardireccion_direccionCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltardireccion_direccionCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activardireccion_direccionCobrarClientesHonomasticos,this,true,"direccion_direccionCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltardireccion_direccionCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activardireccion_direccionCobrarClientesHonomasticos,this,true,"direccion_direccionCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO));

		if(this.cobrarclienteshonomasticosConstantesFunciones.mostrartelefono_telefonoCobrarClientesHonomasticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltartelefono_telefonoCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activartelefono_telefonoCobrarClientesHonomasticos,this,true,"telefono_telefonoCobrarClientesHonomasticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclienteshonomasticosConstantesFunciones.resaltartelefono_telefonoCobrarClientesHonomasticos,this.cobrarclienteshonomasticosConstantesFunciones.activartelefono_telefonoCobrarClientesHonomasticos,this,true,"telefono_telefonoCobrarClientesHonomasticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesHonomasticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesHonomasticos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesHonomasticos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarClientesHonomasticos.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarClientesHonomasticos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarClientesHonomasticos.moveColumn(this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarClientesHonomasticos.moveColumn(this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarClientesHonomasticos.moveColumn(this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarClientesHonomasticos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarClientesHonomasticos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarClientesHonomasticos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarClientesHonomasticos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarClientesHonomasticos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarClientesHonomasticos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarclienteshonomasticoss.size()-1;
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
		//this.jTableDatosCobrarClientesHonomasticos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarClientesHonomasticos();
			
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
				
				//this.isEsNuevoCobrarClientesHonomasticos=false;
					
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
				if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesHonomasticos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarclienteshonomasticos.getsType().equals("DUPLICADO")
				   || this.cobrarclienteshonomasticos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarClientesHonomasticos=true;
				
				} else {
					this.isEsNuevoCobrarClientesHonomasticos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarclienteshonomasticos.getId()>=0 && !this.cobrarclienteshonomasticos.getIsNew()) {						
						this.isEsNuevoCobrarClientesHonomasticos=false;
						
					} else {
						this.isEsNuevoCobrarClientesHonomasticos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarClientesHonomasticos(esRelaciones);						
				
				this.seleccionarCobrarClientesHonomasticos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarclienteshonomasticos.getId()<0) {
					this.isEsNuevoCobrarClientesHonomasticos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarClientesHonomasticos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarClientesHonomasticos(evt,rowIndex);
				}	
				
				if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarClientesHonomasticos: " + this.dDif); 
					}
				}								
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarClientesHonomasticos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarclienteshonomasticos)) {
					if(this.cobrarclienteshonomasticos.getId()>0) {
						this.cobrarclienteshonomasticos.setIsDeleted(true);
						
						this.cobrarclienteshonomasticossEliminados.add(this.cobrarclienteshonomasticos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().remove(this.cobrarclienteshonomasticos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticoss.remove(this.cobrarclienteshonomasticos);				
					}
					
					
					((CobrarClientesHonomasticosModel) this.jTableDatosCobrarClientesHonomasticos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarClientesHonomasticos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarClientesHonomasticos) {
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesHonomasticos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarClientesHonomasticos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarClientesHonomasticos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarClientesHonomasticos(cobrarclienteshonomasticos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarClientesHonomasticos(cobrarclienteshonomasticos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarClientesHonomasticos(cobrarclienteshonomasticos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesHonomasticos(cobrarclienteshonomasticos);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_ciudadCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_rutaCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_ruta());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_vendedorCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextFieldcodigoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_completoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_comercialCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setDate(cobrarclienteshonomasticos.getfecha_nacimiento_dato());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreadireccion_direccionCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreatelefono_telefonoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.gettelefono_telefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarClientesHonomasticos cobrarclienteshonomasticosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarclienteshonomasticosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarClientesHonomasticos cobrarclienteshonomasticosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarclienteshonomasticosLocal=this.cobrarclienteshonomasticos;
			} else {
				cobrarclienteshonomasticosLocal=this.cobrarclienteshonomasticosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarclienteshonomasticosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarClientesHonomasticos(cobrarclienteshonomasticosLocal,true);
					
					if(cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarclienteshonomasticosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarclienteshonomasticosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(cobrarclienteshonomasticos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(cobrarclienteshonomasticos);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(cobrarclienteshonomasticos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.getText()==null || this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.getText()=="" || this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.setText("0");
			}

			if(conColumnasBase) {cobrarclienteshonomasticos.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelIdCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.setnombre_ciudad(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_ciudadCobrarClientesHonomasticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_ciudadCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.setnombre_ruta(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_rutaCobrarClientesHonomasticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_rutaCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.setnombre_vendedor(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_vendedorCobrarClientesHonomasticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_vendedorCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.setcodigo(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextFieldcodigoCobrarClientesHonomasticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelcodigoCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.setnombre_completo(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_completoCobrarClientesHonomasticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_completoCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.setnombre_comercial(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_comercialCobrarClientesHonomasticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelnombre_comercialCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.setfecha_nacimiento_dato(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelfecha_nacimiento_datoCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.setdireccion_direccion(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreadireccion_direccionCobrarClientesHonomasticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabeldireccion_direccionCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclienteshonomasticos.settelefono_telefono(this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreatelefono_telefonoCobrarClientesHonomasticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabeltelefono_telefonoCobrarClientesHonomasticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticosBean,CobrarClientesHonomasticos cobrarclienteshonomasticos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticosOrigen,CobrarClientesHonomasticos cobrarclienteshonomasticos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getId()!=null && !cobrarclienteshonomasticosOrigen.getId().equals(0L))) {cobrarclienteshonomasticos.setId(cobrarclienteshonomasticosOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getfecha_nacimiento()!=null && !cobrarclienteshonomasticosOrigen.getfecha_nacimiento().equals(new Date()))) {cobrarclienteshonomasticos.setfecha_nacimiento(cobrarclienteshonomasticosOrigen.getfecha_nacimiento());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getnombre_ciudad()!=null && !cobrarclienteshonomasticosOrigen.getnombre_ciudad().equals(""))) {cobrarclienteshonomasticos.setnombre_ciudad(cobrarclienteshonomasticosOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getnombre_ruta()!=null && !cobrarclienteshonomasticosOrigen.getnombre_ruta().equals(""))) {cobrarclienteshonomasticos.setnombre_ruta(cobrarclienteshonomasticosOrigen.getnombre_ruta());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getnombre_vendedor()!=null && !cobrarclienteshonomasticosOrigen.getnombre_vendedor().equals(""))) {cobrarclienteshonomasticos.setnombre_vendedor(cobrarclienteshonomasticosOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getcodigo()!=null && !cobrarclienteshonomasticosOrigen.getcodigo().equals(""))) {cobrarclienteshonomasticos.setcodigo(cobrarclienteshonomasticosOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getnombre_completo()!=null && !cobrarclienteshonomasticosOrigen.getnombre_completo().equals(""))) {cobrarclienteshonomasticos.setnombre_completo(cobrarclienteshonomasticosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getnombre_comercial()!=null && !cobrarclienteshonomasticosOrigen.getnombre_comercial().equals(""))) {cobrarclienteshonomasticos.setnombre_comercial(cobrarclienteshonomasticosOrigen.getnombre_comercial());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getfecha_nacimiento_dato()!=null && !cobrarclienteshonomasticosOrigen.getfecha_nacimiento_dato().equals(new Date()))) {cobrarclienteshonomasticos.setfecha_nacimiento_dato(cobrarclienteshonomasticosOrigen.getfecha_nacimiento_dato());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.getdireccion_direccion()!=null && !cobrarclienteshonomasticosOrigen.getdireccion_direccion().equals(""))) {cobrarclienteshonomasticos.setdireccion_direccion(cobrarclienteshonomasticosOrigen.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosOrigen.gettelefono_telefono()!=null && !cobrarclienteshonomasticosOrigen.gettelefono_telefono().equals(""))) {cobrarclienteshonomasticos.settelefono_telefono(cobrarclienteshonomasticosOrigen.gettelefono_telefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_ciudadCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_rutaCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_ruta());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_vendedorCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextFieldcodigoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_completoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_comercialCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setDate(cobrarclienteshonomasticos.getfecha_nacimiento_dato());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreadireccion_direccionCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreatelefono_telefonoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticos.gettelefono_telefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesHonomasticos(CobrarClientesHonomasticosBean cobrarclienteshonomasticosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_ciudadCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_rutaCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.getnombre_ruta());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_vendedorCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextFieldcodigoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_completoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_comercialCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setDate(cobrarclienteshonomasticosBean.getfecha_nacimiento_dato());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreadireccion_direccionCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreatelefono_telefonoCobrarClientesHonomasticos.setText(cobrarclienteshonomasticosBean.gettelefono_telefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarClientesHonomasticos(CobrarClientesHonomasticosParameterReturnGeneral cobrarclienteshonomasticosReturnGeneral,CobrarClientesHonomasticosBean cobrarclienteshonomasticosBean,Boolean conDefault) throws Exception { 
		try {
			CobrarClientesHonomasticos cobrarclienteshonomasticosLocal=new CobrarClientesHonomasticos();
			
			cobrarclienteshonomasticosLocal=cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getId()!=null && !cobrarclienteshonomasticosLocal.getId().equals(0L))) {cobrarclienteshonomasticosBean.setId(cobrarclienteshonomasticosLocal.getId());}}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getnombre_ciudad()!=null && !cobrarclienteshonomasticosLocal.getnombre_ciudad().equals(""))) {cobrarclienteshonomasticosBean.setnombre_ciudad(cobrarclienteshonomasticosLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getnombre_ruta()!=null && !cobrarclienteshonomasticosLocal.getnombre_ruta().equals(""))) {cobrarclienteshonomasticosBean.setnombre_ruta(cobrarclienteshonomasticosLocal.getnombre_ruta());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getnombre_vendedor()!=null && !cobrarclienteshonomasticosLocal.getnombre_vendedor().equals(""))) {cobrarclienteshonomasticosBean.setnombre_vendedor(cobrarclienteshonomasticosLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getcodigo()!=null && !cobrarclienteshonomasticosLocal.getcodigo().equals(""))) {cobrarclienteshonomasticosBean.setcodigo(cobrarclienteshonomasticosLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getnombre_completo()!=null && !cobrarclienteshonomasticosLocal.getnombre_completo().equals(""))) {cobrarclienteshonomasticosBean.setnombre_completo(cobrarclienteshonomasticosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getnombre_comercial()!=null && !cobrarclienteshonomasticosLocal.getnombre_comercial().equals(""))) {cobrarclienteshonomasticosBean.setnombre_comercial(cobrarclienteshonomasticosLocal.getnombre_comercial());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getfecha_nacimiento_dato()!=null && !cobrarclienteshonomasticosLocal.getfecha_nacimiento_dato().equals(new Date()))) {cobrarclienteshonomasticosBean.setfecha_nacimiento_dato(cobrarclienteshonomasticosLocal.getfecha_nacimiento_dato());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.getdireccion_direccion()!=null && !cobrarclienteshonomasticosLocal.getdireccion_direccion().equals(""))) {cobrarclienteshonomasticosBean.setdireccion_direccion(cobrarclienteshonomasticosLocal.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarclienteshonomasticosLocal.gettelefono_telefono()!=null && !cobrarclienteshonomasticosLocal.gettelefono_telefono().equals(""))) {cobrarclienteshonomasticosBean.settelefono_telefono(cobrarclienteshonomasticosLocal.gettelefono_telefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarClientesHonomasticosGenerico(Long idCobrarClientesHonomasticosSeleccionado,JComboBox jComboBoxCobrarClientesHonomasticos,List<CobrarClientesHonomasticos> cobrarclienteshonomasticossLocal)throws Exception {
		try {
			CobrarClientesHonomasticos  cobrarclienteshonomasticosTemp=null;

			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticossLocal) {
				if(cobrarclienteshonomasticosAux.getId()!=null && cobrarclienteshonomasticosAux.getId().equals(idCobrarClientesHonomasticosSeleccionado)) {
					cobrarclienteshonomasticosTemp=cobrarclienteshonomasticosAux;
					break;
				}
			}

			jComboBoxCobrarClientesHonomasticos.setSelectedItem(cobrarclienteshonomasticosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarClientesHonomasticosGenerico(JComboBox jComboBoxCobrarClientesHonomasticos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesHonomasticos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarClientesHonomasticos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesHonomasticos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarClientesHonomasticos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarClientesHonomasticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarClientesHonomasticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclienteshonomasticos=(CobrarClientesHonomasticos) cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclienteshonomasticos =(CobrarClientesHonomasticos) cobrarclienteshonomasticoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarclienteshonomasticos.getIsNew() && !cobrarclienteshonomasticos.getIsChanged() && !cobrarclienteshonomasticos.getIsDeleted()) {
				sDescripcion=cobrarclienteshonomasticos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclienteshonomasticos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cobrarclienteshonomasticos.getIsNew() && !cobrarclienteshonomasticos.getIsChanged() && !cobrarclienteshonomasticos.getIsDeleted()) {
				sDescripcion=cobrarclienteshonomasticos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclienteshonomasticos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!cobrarclienteshonomasticos.getIsNew() && !cobrarclienteshonomasticos.getIsChanged() && !cobrarclienteshonomasticos.getIsDeleted()) {
				sDescripcion=cobrarclienteshonomasticos.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclienteshonomasticos.getpais_descripcion();
			}
		}

		if(sTipo.equals("Region")) {
			//sDescripcion=this.getActualRegionForeignKeyDescripcion((Long)value);
			if(!cobrarclienteshonomasticos.getIsNew() && !cobrarclienteshonomasticos.getIsChanged() && !cobrarclienteshonomasticos.getIsDeleted()) {
				sDescripcion=cobrarclienteshonomasticos.getregion_descripcion();
			} else {
				//sDescripcion=this.getActualRegionForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclienteshonomasticos.getregion_descripcion();
			}
		}

		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
			if(!cobrarclienteshonomasticos.getIsNew() && !cobrarclienteshonomasticos.getIsChanged() && !cobrarclienteshonomasticos.getIsDeleted()) {
				sDescripcion=cobrarclienteshonomasticos.getprovincia_descripcion();
			} else {
				//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclienteshonomasticos.getprovincia_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!cobrarclienteshonomasticos.getIsNew() && !cobrarclienteshonomasticos.getIsChanged() && !cobrarclienteshonomasticos.getIsDeleted()) {
				sDescripcion=cobrarclienteshonomasticos.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclienteshonomasticos.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarClientesHonomasticos cobrarclienteshonomasticosRow=new CobrarClientesHonomasticos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclienteshonomasticosRow=(CobrarClientesHonomasticos) cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclienteshonomasticosRow=(CobrarClientesHonomasticos) cobrarclienteshonomasticoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos));			
			this.jButtonDuplicarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesHonomasticos && this.isPermisoDuplicarCobrarClientesHonomasticos));			
			this.jButtonCopiarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesHonomasticos && this.isPermisoCopiarCobrarClientesHonomasticos));
			this.jButtonVerFormCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesHonomasticos && this.isPermisoVerFormCobrarClientesHonomasticos));
			
			this.jButtonAbrirOrderByCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos && this.isPermisoOrdenCobrarClientesHonomasticos));			
			
			this.jButtonNuevoRelacionesCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos));			
			this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesHonomasticos && this.isPermisoActualizarCobrarClientesHonomasticos));	
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos && this.isPermisoActualizarCobrarClientesHonomasticos));	
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos && this.isPermisoEliminarCobrarClientesHonomasticos));
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarCobrarClientesHonomasticos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos);							
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos));						
			this.jButtonDuplicarToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesHonomasticos && this.isPermisoDuplicarCobrarClientesHonomasticos));						
			this.jButtonCopiarToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesHonomasticos && this.isPermisoCopiarCobrarClientesHonomasticos));			
			this.jButtonVerFormToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesHonomasticos && this.isPermisoVerFormCobrarClientesHonomasticos));			
			this.jButtonAbrirOrderByToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos && this.isPermisoOrdenCobrarClientesHonomasticos));
			this.jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));			
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesHonomasticos && this.isPermisoActualizarCobrarClientesHonomasticos));	
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos  && this.isPermisoActualizarCobrarClientesHonomasticos));	
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos && this.isPermisoEliminarCobrarClientesHonomasticos));
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarToolBarCobrarClientesHonomasticos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos);				
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos));			
			this.jMenuItemDuplicarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesHonomasticos && this.isPermisoDuplicarCobrarClientesHonomasticos));			
			this.jMenuItemCopiarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesHonomasticos && this.isPermisoCopiarCobrarClientesHonomasticos));			
			this.jMenuItemVerFormCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesHonomasticos && this.isPermisoVerFormCobrarClientesHonomasticos));			
			this.jMenuItemAbrirOrderByCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos && this.isPermisoOrdenCobrarClientesHonomasticos));			
			//this.jMenuItemMostrarOcultarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos && this.isPermisoOrdenCobrarClientesHonomasticos));
			this.jMenuItemDetalleAbrirOrderByCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos && this.isPermisoOrdenCobrarClientesHonomasticos));			
			//this.jMenuItemDetalleMostrarOcultarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos && this.isPermisoOrdenCobrarClientesHonomasticos));			
			this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos));			
			this.jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos && this.isPermisoNuevoCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));									
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemModificarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesHonomasticos && this.isPermisoActualizarCobrarClientesHonomasticos));	
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemActualizarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos && this.isPermisoActualizarCobrarClientesHonomasticos));	
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemEliminarCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos && this.isPermisoEliminarCobrarClientesHonomasticos));
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemCancelarCobrarClientesHonomasticos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos);				
			}
			
			this.jMenuItemGuardarCambiosCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));						
			this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=this.jButtonNuevoCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarClientesHonomasticos=this.jButtonDuplicarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaCopiarCobrarClientesHonomasticos=this.jButtonCopiarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaVerFormCobrarClientesHonomasticos=this.jButtonVerFormCobrarClientesHonomasticos.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarClientesHonomasticos=this.jButtonAbrirOrderByCobrarClientesHonomasticos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=this.jButtonNuevoRelacionesCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=this.jButtonModificarCobrarClientesHonomasticos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosCobrarClientesHonomasticos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=this.jButtonNuevoToolBarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=this.jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarToolBarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarToolBarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarToolBarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarToolBarCobrarClientesHonomasticos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=this.jButtonGuardarCambiosToolBarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=this.jButtonGuardarCambiosTablaToolBarCobrarClientesHonomasticos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=this.jMenuItemNuevoCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemModificarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemActualizarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemEliminarCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemCancelarCobrarClientesHonomasticos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=this.jMenuItemGuardarCambiosCobrarClientesHonomasticos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarClientesHonomasticos(Boolean esInicializar) {
		if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesHonomasticos();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarClientesHonomasticos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarClientesHonomasticos() {
		this.jButtonNuevoCobrarClientesHonomasticos.setVisible(this.isPermisoNuevoCobrarClientesHonomasticos);			
		this.jButtonDuplicarCobrarClientesHonomasticos.setVisible(this.isPermisoDuplicarCobrarClientesHonomasticos);			
		this.jButtonCopiarCobrarClientesHonomasticos.setVisible(this.isPermisoCopiarCobrarClientesHonomasticos);			
		this.jButtonVerFormCobrarClientesHonomasticos.setVisible(this.isPermisoVerFormCobrarClientesHonomasticos);			
		
		this.jButtonAbrirOrderByCobrarClientesHonomasticos.setVisible(this.isPermisoOrdenCobrarClientesHonomasticos);					
		
		this.jButtonNuevoRelacionesCobrarClientesHonomasticos.setVisible(this.isPermisoNuevoCobrarClientesHonomasticos);			
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarCobrarClientesHonomasticos.setVisible(this.isPermisoActualizarCobrarClientesHonomasticos);	
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarCobrarClientesHonomasticos.setVisible(this.isPermisoActualizarCobrarClientesHonomasticos);	
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarCobrarClientesHonomasticos.setVisible(this.isPermisoEliminarCobrarClientesHonomasticos);
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarCobrarClientesHonomasticos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos);						
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosCobrarClientesHonomasticos.setVisible(this.isPermisoGuardarCambiosCobrarClientesHonomasticos);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.setVisible(this.isPermisoActualizarCobrarClientesHonomasticos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesHonomasticos() {
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarCobrarClientesHonomasticos.setVisible(this.isPermisoActualizarCobrarClientesHonomasticos);	
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarCobrarClientesHonomasticos.setVisible(this.isPermisoActualizarCobrarClientesHonomasticos);	
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarCobrarClientesHonomasticos.setVisible(this.isPermisoEliminarCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarCobrarClientesHonomasticos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos);							
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosCobrarClientesHonomasticos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos && this.isPermisoGuardarCambiosCobrarClientesHonomasticos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarClientesHonomasticos() {
		if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesHonomasticos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarClientesHonomasticos() {
	}
	
	public void jTableDatosCobrarClientesHonomasticosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarClientesHonomasticos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarclienteshonomasticos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarClientesHonomasticosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarClientesHonomasticos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesHonomasticos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarclienteshonomasticosLogic.getConnexion());

				if(this.cobrarclienteshonomasticos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarclienteshonomasticos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesHonomasticos=(TitledBorder)this.jScrollPanelDatosCobrarClientesHonomasticos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarClientesHonomasticos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarclienteshonomasticos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCobrarClientesHonomasticosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCobrarClientesHonomasticos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesHonomasticos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cobrarclienteshonomasticosLogic.getConnexion());

				if(this.cobrarclienteshonomasticos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cobrarclienteshonomasticos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesHonomasticos=(TitledBorder)this.jScrollPanelDatosCobrarClientesHonomasticos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCobrarClientesHonomasticos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cobrarclienteshonomasticos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisCobrarClientesHonomasticosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebCobrarClientesHonomasticos(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesHonomasticos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.cobrarclienteshonomasticosLogic.getConnexion());

				if(this.cobrarclienteshonomasticos.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.cobrarclienteshonomasticos.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesHonomasticos=(TitledBorder)this.jScrollPanelDatosCobrarClientesHonomasticos.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderCobrarClientesHonomasticos.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.cobrarclienteshonomasticos.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_regionCobrarClientesHonomasticosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoregion=true;

			idTienePermisoregion=this.tienePermisosUsuarioEnPaginaWebCobrarClientesHonomasticos(RegionConstantesFunciones.CLASSNAME);

			if(idTienePermisoregion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesHonomasticos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);

				this.regionBeanSwingJInternalFrame=new RegionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.regionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.regionBeanSwingJInternalFrame.getRegionLogic().setConnexion(this.cobrarclienteshonomasticosLogic.getConnexion());

				if(this.cobrarclienteshonomasticos.getid_region()!=null) {
					this.regionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.regionBeanSwingJInternalFrame.setIdActual(this.cobrarclienteshonomasticos.getid_region());
					this.regionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.regionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.regionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegion();
				}

				JInternalFrameBase jinternalFrame =this.regionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesHonomasticos=(TitledBorder)this.jScrollPanelDatosCobrarClientesHonomasticos.getBorder();
				TitledBorder titledBorderregion=(TitledBorder)this.regionBeanSwingJInternalFrame.jScrollPanelDatosRegion.getBorder();

				titledBorderregion.setTitle(titledBorderCobrarClientesHonomasticos.getTitle() + " -> Region");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_regionCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getid_region()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_region = "+this.cobrarclienteshonomasticos.getid_region().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_provinciaCobrarClientesHonomasticosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprovincia=true;

			idTienePermisoprovincia=this.tienePermisosUsuarioEnPaginaWebCobrarClientesHonomasticos(ProvinciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoprovincia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesHonomasticos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.cobrarclienteshonomasticosLogic.getConnexion());

				if(this.cobrarclienteshonomasticos.getid_provincia()!=null) {
					this.provinciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.provinciaBeanSwingJInternalFrame.setIdActual(this.cobrarclienteshonomasticos.getid_provincia());
					this.provinciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia();
				}

				JInternalFrameBase jinternalFrame =this.provinciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesHonomasticos=(TitledBorder)this.jScrollPanelDatosCobrarClientesHonomasticos.getBorder();
				TitledBorder titledBorderprovincia=(TitledBorder)this.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

				titledBorderprovincia.setTitle(titledBorderCobrarClientesHonomasticos.getTitle() + " -> Provincia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_provinciaCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getid_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_provincia = "+this.cobrarclienteshonomasticos.getid_provincia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadCobrarClientesHonomasticosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebCobrarClientesHonomasticos(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesHonomasticos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesHonomasticos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.cobrarclienteshonomasticosLogic.getConnexion());

				if(this.cobrarclienteshonomasticos.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.cobrarclienteshonomasticos.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesHonomasticos=(TitledBorder)this.jScrollPanelDatosCobrarClientesHonomasticos.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderCobrarClientesHonomasticos.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.cobrarclienteshonomasticos.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_nacimientoCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getfecha_nacimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_nacimiento = '"+Funciones2.getStringPostgresDate(this.cobrarclienteshonomasticos.getfecha_nacimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.cobrarclienteshonomasticos.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_rutaCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getnombre_ruta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ruta like '%"+this.cobrarclienteshonomasticos.getnombre_ruta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.cobrarclienteshonomasticos.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarclienteshonomasticos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.cobrarclienteshonomasticos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_comercialCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getnombre_comercial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_comercial like '%"+this.cobrarclienteshonomasticos.getnombre_comercial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getfecha_nacimiento_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_nacimiento_dato = '"+Funciones2.getStringPostgresDate(this.cobrarclienteshonomasticos.getfecha_nacimiento_dato())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_direccionCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.getdireccion_direccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_direccion like '%"+this.cobrarclienteshonomasticos.getdireccion_direccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_telefonoCobrarClientesHonomasticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.getcobrarclienteshonomasticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclienteshonomasticos==null) {
						this.cobrarclienteshonomasticos = new CobrarClientesHonomasticos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);
				}

				if(this.cobrarclienteshonomasticos.gettelefono_telefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_telefono like '%"+this.cobrarclienteshonomasticos.gettelefono_telefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);

			this.getCobrarClientesHonomasticossBusquedaCobrarClientesHonomasticos();

			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);

			//if(CobrarClientesHonomasticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);

			this.getCobrarClientesHonomasticossFK_IdCiudad();

			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);

			//if(CobrarClientesHonomasticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);

			this.getCobrarClientesHonomasticossFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);

			//if(CobrarClientesHonomasticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);

			this.getCobrarClientesHonomasticossFK_IdPais();

			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);

			//if(CobrarClientesHonomasticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProvinciaCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);

			this.getCobrarClientesHonomasticossFK_IdProvincia();

			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);

			//if(CobrarClientesHonomasticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRegionCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);

			this.getCobrarClientesHonomasticossFK_IdRegion();

			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);

			//if(CobrarClientesHonomasticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCobrarClientesHonomasticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);

			this.getCobrarClientesHonomasticossFK_IdSucursal();

			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);

			//if(CobrarClientesHonomasticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclienteshonomasticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarClientesHonomasticos() {
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.dispose();
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
			this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.dispose();
			this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos=null;
		}
		
		if(this.jInternalFrameImportacionCobrarClientesHonomasticos!=null) {
			this.jInternalFrameImportacionCobrarClientesHonomasticos.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarClientesHonomasticos.dispose();
			this.jInternalFrameImportacionCobrarClientesHonomasticos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarClientesHonomasticos();
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarClientesHonomasticos")) {
				jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarClientesHonomasticos")) {
				jButtonDuplicarCobrarClientesHonomasticosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarClientesHonomasticos")) {
				jButtonCopiarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarClientesHonomasticos")) {
				jButtonVerFormCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarClientesHonomasticos")) {
				jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarClientesHonomasticos")) {
				jButtonDuplicarCobrarClientesHonomasticosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarClientesHonomasticos")) {
				jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarClientesHonomasticos")) {
				jButtonDuplicarCobrarClientesHonomasticosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesHonomasticos")) {
				jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarClientesHonomasticos")) {
				jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarClientesHonomasticos")) {
				jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarClientesHonomasticos")) {
				jButtonModificarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarClientesHonomasticos")) {
				jButtonModificarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarClientesHonomasticos")) {
				jButtonModificarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarClientesHonomasticos")) {
				jButtonActualizarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarClientesHonomasticos")) {
				jButtonActualizarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarClientesHonomasticos")) {
				jButtonActualizarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarClientesHonomasticos")) {
				jButtonEliminarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarClientesHonomasticos")) {
				jButtonEliminarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarClientesHonomasticos")) {
				jButtonEliminarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarClientesHonomasticos")) {
				jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarClientesHonomasticos")) {
				jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarClientesHonomasticos")) {
				jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarClientesHonomasticos")) {
				jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarClientesHonomasticos")) {
				jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarClientesHonomasticos")) {
				jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarClientesHonomasticos")) {
				jButtonMostrarOcultarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarClientesHonomasticos")) {
				jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarClientesHonomasticos")) {
				jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarClientesHonomasticos")) {
				jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarClientesHonomasticos")) {
				jButtonCopiarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarClientesHonomasticos")) {
				jButtonVerFormCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarClientesHonomasticos")) {
				jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarClientesHonomasticos")) {
				jButtonCopiarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarClientesHonomasticos")) {
				jButtonVerFormCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesHonomasticos")) {
				jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarClientesHonomasticos")) {
				jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarClientesHonomasticos")) {
				jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarClientesHonomasticos")) {
				jButtonRecargarInformacionCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarClientesHonomasticos")) {
				jButtonRecargarInformacionCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarClientesHonomasticos")) {
				jButtonRecargarInformacionCobrarClientesHonomasticosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarClientesHonomasticos")) {
				jButtonAnterioresCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarClientesHonomasticos")) {
				jButtonAnterioresCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarClientesHonomasticos")) {
				jButtonAnterioresCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarClientesHonomasticos")) {
				jButtonSiguientesCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarClientesHonomasticos")) {
				jButtonSiguientesCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarClientesHonomasticos")) {
				jButtonSiguientesCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarClientesHonomasticos") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarClientesHonomasticos")) {
				jButtonAbrirOrderByCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarClientesHonomasticos") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarClientesHonomasticos")) {
				jButtonMostrarOcultarCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesHonomasticos")) {
				jButtonNuevoGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarClientesHonomasticos")) {
				jButtonNuevoGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarClientesHonomasticos")) {
				jButtonNuevoGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarClientesHonomasticos")) {
				jButtonCerrarReporteDinamicoCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarClientesHonomasticos")) {
				jButtonGenerarReporteDinamicoCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarClientesHonomasticos")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarClientesHonomasticos")) {
				jButtonCerrarImportacionCobrarClientesHonomasticosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarClientesHonomasticos")) {
				
				jButtonGenerarImportacionCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarClientesHonomasticos")) {
				
				jButtonAbrirImportacionCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarClientesHonomasticos")) {
				jComboBoxTiposAccionesCobrarClientesHonomasticosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarClientesHonomasticos")) {
				jComboBoxTiposRelacionesCobrarClientesHonomasticosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarClientesHonomasticos")) {
				jComboBoxTiposAccionesCobrarClientesHonomasticosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarClientesHonomasticos")) {
				
				jComboBoxTiposSeleccionarCobrarClientesHonomasticosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarClientesHonomasticos")) {
				jTextFieldValorCampoGeneralCobrarClientesHonomasticosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarClientesHonomasticos")) {
				jButtonAbrirOrderByCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarClientesHonomasticos")) {
				jButtonAbrirOrderByCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarClientesHonomasticos")) {
				jButtonCerrarOrderByCobrarClientesHonomasticosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesHonomasticosBusqueda")) {
				this.jButtonidCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_empresaCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_empresaCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_sucursalCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_sucursalCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_paisCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_paisCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_regionCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_regionCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_regionCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_regionCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_provinciaCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_provinciaCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_ciudadCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_ciudadCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoCobrarClientesHonomasticosBusqueda")) {
				this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_ciudadCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_rutaCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_rutaCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_vendedorCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesHonomasticosBusqueda")) {
				this.jButtoncodigoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_completoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_comercialCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_comercialCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimiento_datoCobrarClientesHonomasticosBusqueda")) {
				this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarClientesHonomasticosBusqueda")) {
				this.jButtondireccion_direccionCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarClientesHonomasticosBusqueda")) {
				this.jButtontelefono_telefonoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos")) {
				this.jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosActionPerformed(evt);
			}
			
			;
			
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarClientesHonomasticos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				


				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarClientesHonomasticos cobrarclienteshonomasticosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarclienteshonomasticosLocal=this.cobrarclienteshonomasticos;
			} else {
				cobrarclienteshonomasticosLocal=this.cobrarclienteshonomasticosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
							
				
				


				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
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
			
			


			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
								
						
				


				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
								
				
				


				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
							
				
				


				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
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
			
			


			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
								
				
				


				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarClientesHonomasticos")) {
					jCheckBoxSeleccionarTodosCobrarClientesHonomasticosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarClientesHonomasticos")) {
					jCheckBoxSeleccionadosCobrarClientesHonomasticosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarClientesHonomasticos")) {
					
				}
				
				


				
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
												
				
				


				
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
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
			
			


			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclienteshonomasticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclienteshonomasticos);
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
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
				
				


				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesHonomasticos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesHonomasticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesHonomasticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclienteshonomasticosAnterior =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarClientesHonomasticos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarClientesHonomasticosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarClientesHonomasticos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarclienteshonomasticos =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarclienteshonomasticos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarClientesHonomasticos")) {
				
				}
				
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarClientesHonomasticos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarClientesHonomasticos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarClientesHonomasticos")) {
			
			}
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarClientesHonomasticos();
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarClientesHonomasticos")) {
				jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarClientesHonomasticos")) {
				jButtonDuplicarCobrarClientesHonomasticosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarClientesHonomasticos")) {
				jButtonCopiarCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarClientesHonomasticos")) {
				jButtonVerFormCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesHonomasticos")) {
				jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarClientesHonomasticos")) {
				jButtonModificarCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarClientesHonomasticos")) {
				jButtonActualizarCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarClientesHonomasticos")) {
				jButtonEliminarCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesHonomasticos")) {
				jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarClientesHonomasticos")) {
				jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarClientesHonomasticos")) {
				jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarClientesHonomasticos")) {
				jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesHonomasticos")) {
				jButtonNuevoGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarClientesHonomasticos")) {
				jButtonAbrirOrderByCobrarClientesHonomasticosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarClientesHonomasticos")) {
				jButtonRecargarInformacionCobrarClientesHonomasticosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarClientesHonomasticos")) {
				jButtonAnterioresCobrarClientesHonomasticosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarClientesHonomasticos")) {
				jButtonSiguientesCobrarClientesHonomasticosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesHonomasticosBusqueda")) {
				this.jButtonidCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_empresaCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_empresaCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_sucursalCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_sucursalCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_paisCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_paisCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_regionCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_regionCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_regionCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_regionCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_provinciaCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_provinciaCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadCobrarClientesHonomasticosUpdate")) {
				this.jButtonid_ciudadCobrarClientesHonomasticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadCobrarClientesHonomasticosBusqueda")) {
				this.jButtonid_ciudadCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoCobrarClientesHonomasticosBusqueda")) {
				this.jButtonfecha_nacimientoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_ciudadCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_rutaCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_rutaCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_vendedorCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesHonomasticosBusqueda")) {
				this.jButtoncodigoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_completoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_comercialCobrarClientesHonomasticosBusqueda")) {
				this.jButtonnombre_comercialCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimiento_datoCobrarClientesHonomasticosBusqueda")) {
				this.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarClientesHonomasticosBusqueda")) {
				this.jButtondireccion_direccionCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarClientesHonomasticosBusqueda")) {
				this.jButtontelefono_telefonoCobrarClientesHonomasticosBusquedaActionPerformed(evt);
			}
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarClientesHonomasticos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarClientesHonomasticos")) {
				closingInternalFrameCobrarClientesHonomasticos();
				
			} else if(sTipo.equals("jButtonCancelarCobrarClientesHonomasticos")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarClientesHonomasticos = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarClientesHonomasticosBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesHonomasticosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesHonomasticos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarClientesHonomasticosActionPerformed(null);
			}
			
			CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclienteshonomasticos,new Object(),this.cobrarclienteshonomasticosParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarClientesHonomasticos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarClientesHonomasticos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarClientesHonomasticos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarclienteshonomasticos)) {
			if(!esControlTabla) {
				if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);			
				}
				
				if(this.cobrarclienteshonomasticosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesHonomasticos(this.cobrarclienteshonomasticosReturnGeneral,this.cobrarclienteshonomasticosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarclienteshonomasticosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesHonomasticos(classes,this.cobrarclienteshonomasticosReturnGeneral,this.cobrarclienteshonomasticosBean,false);
					}
						
					if(this.cobrarclienteshonomasticosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesHonomasticos(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarClientesHonomasticos(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos());	
					}
						
					if(this.cobrarclienteshonomasticosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesHonomasticos(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos(),classes);//this.cobrarclienteshonomasticosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,classes);//this.cobrarclienteshonomasticosBean);									
				}
			
				if(CobrarClientesHonomasticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarClientesHonomasticos(this.cobrarclienteshonomasticos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesHonomasticos(this.cobrarclienteshonomasticos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarclienteshonomasticosAnterior!=null) {
						this.cobrarclienteshonomasticos=this.cobrarclienteshonomasticosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarclienteshonomasticosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos(),cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticos(),this.cobrarclienteshonomasticoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarClientesHonomasticos.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarClientesHonomasticos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarClientesHonomasticos();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarClientesHonomasticos() throws Exception {
		
		CobrarClientesHonomasticosModel cobrarclienteshonomasticosModel=(CobrarClientesHonomasticosModel)this.jTableDatosCobrarClientesHonomasticos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclienteshonomasticosModel.cobrarclienteshonomasticoss=this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarclienteshonomasticosModel.cobrarclienteshonomasticoss=this.cobrarclienteshonomasticoss;
		}
		
		
		((CobrarClientesHonomasticosModel) this.jTableDatosCobrarClientesHonomasticos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarClientesHonomasticos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarclienteshonomasticosAnterior(),this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarclienteshonomasticosAnterior(),this.cobrarclienteshonomasticoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarClientesHonomasticos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
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
										
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclienteshonomasticos,new Object(),generalEntityParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarClientesHonomasticosConstantesFunciones.getClassesRelationshipsOfCobrarClientesHonomasticos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarClientesHonomasticosConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarClientesHonomasticos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarClientesHonomasticos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclienteshonomasticos,new Object(),generalEntityParameterGeneral,this.cobrarclienteshonomasticosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarClientesHonomasticos(CobrarClientesHonomasticosBean cobrarclienteshonomasticosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesHonomasticos(ArrayList<Classe> classes,CobrarClientesHonomasticosReturnGeneral cobrarclienteshonomasticosReturnGeneral,CobrarClientesHonomasticosBean cobrarclienteshonomasticosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarclienteshonomasticos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos = new CobrarClientesHonomasticosDetalleFormJInternalFrame(jDesktopPane,this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones(),this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setVisible(false);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.cobrarclienteshonomasticosLogic=this.cobrarclienteshonomasticosLogic;
		
		this.cargarCombosFrameForeignKeyCobrarClientesHonomasticos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesHonomasticos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesHonomasticos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarClientesHonomasticos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesHonomasticos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesHonomasticos"));
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesHonomasticos"));

		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarToolBarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesHonomasticos"));
					
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemModificarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesHonomasticos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesHonomasticos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarToolBarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesHonomasticos"));
						
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemActualizarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesHonomasticos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesHonomasticos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesHonomasticos"));
								
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemEliminarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesHonomasticos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesHonomasticos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesHonomasticos"));
					
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemCancelarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesHonomasticos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemDetalleCerrarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesHonomasticos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesHonomasticos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesHonomasticos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesHonomasticos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonidCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_empresaCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_empresaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_sucursalCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_paisCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_paisCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_regionCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_regionCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_provinciaCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_ciudadCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rutaCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtoncodigoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimiento_datoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesHonomasticosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesHonomasticos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarClientesHonomasticos"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesHonomasticos"));
		}
		
		this.jTableDatosCobrarClientesHonomasticos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarClientesHonomasticos"));
		
		this.jTableDatosCobrarClientesHonomasticos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarClientesHonomasticos"));
		
		this.jButtonNuevoCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"NuevoCobrarClientesHonomasticos"));
		
		this.jButtonDuplicarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"DuplicarCobrarClientesHonomasticos"));
		
		this.jButtonCopiarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"CopiarCobrarClientesHonomasticos"));
		
		this.jButtonVerFormCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"VerFormCobrarClientesHonomasticos"));
		
		
		this.jButtonNuevoToolBarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarClientesHonomasticos"));
			
		this.jButtonDuplicarToolBarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarClientesHonomasticos"));
			
		this.jMenuItemNuevoCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarClientesHonomasticos"));
			
		this.jMenuItemDuplicarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarClientesHonomasticos"));		
		
		
		this.jButtonNuevoRelacionesCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarClientesHonomasticos"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarClientesHonomasticos"));
			
		this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarClientesHonomasticos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesHonomasticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonModificarToolBarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesHonomasticos"));
			
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemModificarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesHonomasticos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesHonomasticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonActualizarToolBarCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesHonomasticos"));
				
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemActualizarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesHonomasticos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesHonomasticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonEliminarToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesHonomasticos"));
						
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemEliminarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesHonomasticos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesHonomasticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonCancelarToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesHonomasticos"));
			
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemCancelarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesHonomasticos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarClientesHonomasticos"));		
		
		
		this.jButtonCerrarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"CerrarCobrarClientesHonomasticos"));
		
		
		this.jButtonCerrarToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarClientesHonomasticos"));
			
		this.jMenuItemCerrarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarClientesHonomasticos"));
			
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jMenuItemDetalleCerrarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesHonomasticos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarClientesHonomasticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesHonomasticos"));
		}
		
		this.jButtonCopiarToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarClientesHonomasticos"));
			
		this.jButtonVerFormToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarClientesHonomasticos"));
		
		this.jMenuItemGuardarCambiosCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarClientesHonomasticos"));
			
		this.jMenuItemCopiarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarClientesHonomasticos"));		
		
		this.jMenuItemVerFormCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarClientesHonomasticos"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesHonomasticos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarClientesHonomasticos"));
			
		this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesHonomasticos"));		
		
		
		
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarClientesHonomasticos"));
					
		this.jButtonRecargarInformacionToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarClientesHonomasticos"));
		
		this.jMenuItemRecargarInformacionCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarClientesHonomasticos"));		
		
		
		
		this.jButtonAnterioresCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"AnterioresCobrarClientesHonomasticos"));
		
		
		this.jButtonAnterioresToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarClientesHonomasticos"));
		
		this.jMenuItemAnterioresCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarClientesHonomasticos"));		
		
		
		this.jButtonSiguientesCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"SiguientesCobrarClientesHonomasticos"));
		
		
		this.jButtonSiguientesToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarClientesHonomasticos"));
			
		this.jMenuItemSiguientesCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarClientesHonomasticos"));
			
		this.jMenuItemAbrirOrderByCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarClientesHonomasticos"));
			
		this.jMenuItemMostrarOcultarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarClientesHonomasticos"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarClientesHonomasticos"));
			
		this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarClientesHonomasticos"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarClientesHonomasticos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarClientesHonomasticos"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarClientesHonomasticos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarClientesHonomasticos"));

		this.jCheckBoxSeleccionadosCobrarClientesHonomasticos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarClientesHonomasticos"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesHonomasticos"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarClientesHonomasticos"));
			
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarClientesHonomasticos"));
					
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarClientesHonomasticos"));
			
		this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarClientesHonomasticos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonidCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_empresaCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_empresaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_sucursalCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_paisCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_paisCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_regionCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_regionCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_provinciaCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_ciudadCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rutaCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtoncodigoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimiento_datoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesHonomasticosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesHonomasticos"));
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesHonomasticos"));
				this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesHonomasticos"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesHonomasticos"));				
			//this.jButtonGenerarReporteDinamicoCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesHonomasticos"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesHonomasticos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarClientesHonomasticos!=null) {
				this.jInternalFrameImportacionCobrarClientesHonomasticos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesHonomasticos"));
				this.jInternalFrameImportacionCobrarClientesHonomasticos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesHonomasticos"));
				this.jInternalFrameImportacionCobrarClientesHonomasticos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesHonomasticos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarClientesHonomasticos"));
			
			this.jButtonAbrirOrderByToolBarCobrarClientesHonomasticos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarClientesHonomasticos"));			
			
			if(this.jInternalFrameOrderByCobrarClientesHonomasticos!=null) {
				this.jInternalFrameOrderByCobrarClientesHonomasticos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesHonomasticos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTabbedPaneRelacionesCobrarClientesHonomasticos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesHonomasticos"));
		
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
            		closingInternalFrameCobrarClientesHonomasticos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarClientesHonomasticos = (JInternalFrameBase)event.getSource();
	            	
	            CobrarClientesHonomasticosBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesHonomasticosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesHonomasticos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarClientesHonomasticosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarClientesHonomasticos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarClientesHonomasticosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarClientesHonomasticos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarClientesHonomasticos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarClientesHonomasticos";
		inputMap = this.jButtonNuevoCobrarClientesHonomasticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarClientesHonomasticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarClientesHonomasticos";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesHonomasticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarClientesHonomasticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesHonomasticosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarClientesHonomasticos";
		inputMap = this.jButtonModificarCobrarClientesHonomasticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarClientesHonomasticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarClientesHonomasticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarClientesHonomasticos";
		inputMap = this.jButtonActualizarCobrarClientesHonomasticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarClientesHonomasticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarClientesHonomasticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarClientesHonomasticos";
		inputMap = this.jButtonEliminarCobrarClientesHonomasticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarClientesHonomasticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarClientesHonomasticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarClientesHonomasticos";
		inputMap = this.jButtonCancelarCobrarClientesHonomasticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarClientesHonomasticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarClientesHonomasticos";
		inputMap = this.jButtonCerrarCobrarClientesHonomasticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarClientesHonomasticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarClientesHonomasticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarClientesHonomasticos";
		inputMap = this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosCobrarClientesHonomasticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonGuardarCambiosCobrarClientesHonomasticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarClientesHonomasticosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarClientesHonomasticosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarClientesHonomasticosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarClientesHonomasticosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonidCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_empresaCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_empresaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_sucursalCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_sucursalCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_paisCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_paisCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_regionCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_regionCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_provinciaCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_provinciaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesHonomasticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_ciudadCobrarClientesHonomasticosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesHonomasticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonid_ciudadCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonfecha_nacimientoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_ciudadCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_rutaCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rutaCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_vendedorCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtoncodigoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_completoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonnombre_comercialCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtonfecha_nacimiento_datoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimiento_datoCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtondireccion_direccionCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesHonomasticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jButtontelefono_telefonoCobrarClientesHonomasticosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesHonomasticosBusqueda"));
		
		
		this.jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarClientesHonomasticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarClientesHonomasticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarClientesHonomasticosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarClientesHonomasticos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
					cobrarclienteshonomasticosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticoss) {
					cobrarclienteshonomasticosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarClientesHonomasticosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
						cobrarclienteshonomasticosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticoss) {
						cobrarclienteshonomasticosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesHonomasticos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesHonomasticos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarClientesHonomasticosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarClientesHonomasticos.getSelectedRows();
			
			CobrarClientesHonomasticos cobrarclienteshonomasticosLocal=new CobrarClientesHonomasticos();
			
			//this.seleccionarTodosCobrarClientesHonomasticos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarclienteshonomasticosLocal =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarclienteshonomasticosLocal =(CobrarClientesHonomasticos) this.cobrarclienteshonomasticoss.toArray()[this.jTableDatosCobrarClientesHonomasticos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarclienteshonomasticosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
						cobrarclienteshonomasticosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticoss) {
						cobrarclienteshonomasticosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesHonomasticos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesHonomasticos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesHonomasticos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarClientesHonomasticosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarClientesHonomasticosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarClientesHonomasticosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
				
						if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							cobrarclienteshonomasticosAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_ruta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclienteshonomasticosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_comercial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO)) {
							existe=true;
							cobrarclienteshonomasticosAux.setfecha_nacimiento_dato(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarclienteshonomasticosAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarclienteshonomasticosAux.settelefono_telefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticoss) {
					
						if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							cobrarclienteshonomasticosAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_ruta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclienteshonomasticosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
							existe=true;
							cobrarclienteshonomasticosAux.setnombre_comercial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO)) {
							existe=true;
							cobrarclienteshonomasticosAux.setfecha_nacimiento_dato(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarclienteshonomasticosAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarclienteshonomasticosAux.settelefono_telefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarClientesHonomasticosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarClientesHonomasticos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarClientesHonomasticos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarClientesHonomasticos) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarClientesHonomasticos(conSplash);
				
					this.generarReporteCobrarClientesHonomasticossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarClientesHonomasticossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesHonomasticossSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesHonomasticossSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesHonomasticos();
				
				this.exportarCobrarClientesHonomasticossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarClientesHonomasticoss();
				//this.importarCobrarClientesHonomasticoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesHonomasticos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarClientesHonomasticossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Clientes Honomasticos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarClientesHonomasticos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarClientesHonomasticos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarClientesHonomasticos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarClientesHonomasticosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarClientesHonomasticos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarClientesHonomasticos(conSplash);
					
						//this.actualizarParametrosGeneralCobrarClientesHonomasticos();
						
						this.generarReporteProcesoAccionCobrarClientesHonomasticossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Clientes HonomasticosES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Clientes Honomasticos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarClientesHonomasticos();
				
						this.actualizarParametrosGeneralCobrarClientesHonomasticos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarclienteshonomasticosReturnGeneral=cobrarclienteshonomasticosLogic.procesarAccionCobrarClientesHonomasticossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss(),this.cobrarclienteshonomasticosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarClientesHonomasticosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarClientesHonomasticos();
					
					CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarClientesHonomasticosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxTiposAccionesFormularioCobrarClientesHonomasticos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarClientesHonomasticos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarClientesHonomasticosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarClientesHonomasticos();
			
			if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		
			CobrarClientesHonomasticos cobrarclienteshonomasticos=new CobrarClientesHonomasticos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.getSelectedItem();
			
			
			
			
			cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarclienteshonomasticossSeleccionados.size()==1) {
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticossSeleccionados) {
					cobrarclienteshonomasticos=cobrarclienteshonomasticosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarClientesHonomasticos();
			
      		//this.finishProcessCobrarClientesHonomasticos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarClientesHonomasticosReturnGeneral() throws Exception {
		if(this.cobrarclienteshonomasticosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarclienteshonomasticosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarclienteshonomasticosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarclienteshonomasticosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarclienteshonomasticosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarclienteshonomasticosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
		}
		
		if(this.cobrarclienteshonomasticosReturnGeneral.getConRetornoLista() || this.cobrarclienteshonomasticosReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarclienteshonomasticosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarclienteshonomasticosLogic.setCobrarClientesHonomasticoss(this.cobrarclienteshonomasticosReturnGeneral.getCobrarClientesHonomasticoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarClientesHonomasticos(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarClientesHonomasticos() throws Exception {
		
		
	}
	
	public ArrayList<CobrarClientesHonomasticos> getCobrarClientesHonomasticossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarClientesHonomasticos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss()) {
					if(cobrarclienteshonomasticosAux.getIsSelected()) {
						cobrarclienteshonomasticossSeleccionados.add(cobrarclienteshonomasticosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:this.cobrarclienteshonomasticoss) {
					if(cobrarclienteshonomasticosAux.getIsSelected()) {
						cobrarclienteshonomasticossSeleccionados.add(cobrarclienteshonomasticosAux);				
					}
				}
			}
			
			if(cobrarclienteshonomasticossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarclienteshonomasticossSeleccionados.addAll(this.cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarclienteshonomasticossSeleccionados.addAll(this.cobrarclienteshonomasticoss);				
					}
				}
			}
		} else {
			cobrarclienteshonomasticossSeleccionados.add(this.cobrarclienteshonomasticos);
		}
		
		return cobrarclienteshonomasticossSeleccionados;
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
	
	public void generarReporteCobrarClientesHonomasticossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarClientesHonomasticossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarClientesHonomasticossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesHonomasticossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesHonomasticossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Clientes Honomasticos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarClientesHonomasticossSeleccionados() throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarClientesHonomasticoss("Todos",cobrarclienteshonomasticossSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarClientesHonomasticossSeleccionados() throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarClientesHonomasticoss("Todos",cobrarclienteshonomasticossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarClientesHonomasticossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarClientesHonomasticoss("Todos",cobrarclienteshonomasticossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarClientesHonomasticossSeleccionados() throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarClientesHonomasticos();
		
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarClientesHonomasticos();
		
		
		//this.generarReporteCobrarClientesHonomasticoss("Todos",cobrarclienteshonomasticossSeleccionados ,cobrarclienteshonomasticosImplementable,cobrarclienteshonomasticosImplementableHome);
	}
	
	public void mostrarImportacionCobrarClientesHonomasticoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarClientesHonomasticos();
		
		this.abrirFrameImportacionCobrarClientesHonomasticos();		
		
			
		//this.generarReporteCobrarClientesHonomasticoss("Todos",cobrarclienteshonomasticossSeleccionados ,cobrarclienteshonomasticosImplementable,cobrarclienteshonomasticosImplementableHome);
	}
	
	public void importarCobrarClientesHonomasticoss() throws Exception {		
	
	}
	
	public void exportarCobrarClientesHonomasticossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarClientesHonomasticossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarClientesHonomasticossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarClientesHonomasticossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Clientes Honomasticos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarClientesHonomasticossSeleccionados() throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclienteshonomasticos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarClientesHonomasticos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarClientesHonomasticos(cobrarclienteshonomasticosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarclienteshonomasticosAux.setsDetalleGeneralEntityReporte(cobrarclienteshonomasticosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarClientesHonomasticos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarclienteshonomasticos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getregion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getfecha_nacimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getnombre_ruta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getnombre_comercial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getfecha_nacimiento_dato().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.getdireccion_direccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclienteshonomasticos.gettelefono_telefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarClientesHonomasticossSeleccionados() throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclienteshonomasticos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarClientesHonomasticoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarClientesHonomasticos(row);				
				iRow++;
			}				
			
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarClientesHonomasticos(cobrarclienteshonomasticosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarClientesHonomasticossSeleccionados() throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();		
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclienteshonomasticos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarclienteshonomasticoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarclienteshonomasticos");
			//elementRoot.appendChild(element);
		
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticossSeleccionados) {
				element = document.createElement("cobrarclienteshonomasticos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarClientesHonomasticos(cobrarclienteshonomasticosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Honomasticos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarClientesHonomasticos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getregion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getprovincia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getfecha_nacimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getnombre_ruta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getnombre_comercial());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getfecha_nacimiento_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.getdireccion_direccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclienteshonomasticos.gettelefono_telefono());				
	}
	
	public void setFilaDatosExportarXmlCobrarClientesHonomasticos(CobrarClientesHonomasticos cobrarclienteshonomasticos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarClientesHonomasticosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarclienteshonomasticos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarClientesHonomasticosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarclienteshonomasticos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarClientesHonomasticosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarclienteshonomasticos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CobrarClientesHonomasticosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cobrarclienteshonomasticos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementpais_descripcion = document.createElement(CobrarClientesHonomasticosConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(cobrarclienteshonomasticos.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementregion_descripcion = document.createElement(CobrarClientesHonomasticosConstantesFunciones.IDREGION);
		elementregion_descripcion.appendChild(document.createTextNode(cobrarclienteshonomasticos.getregion_descripcion()));
		element.appendChild(elementregion_descripcion);

		Element elementprovincia_descripcion = document.createElement(CobrarClientesHonomasticosConstantesFunciones.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(cobrarclienteshonomasticos.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementciudad_descripcion = document.createElement(CobrarClientesHonomasticosConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(cobrarclienteshonomasticos.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementfecha_nacimiento = document.createElement(CobrarClientesHonomasticosConstantesFunciones.FECHANACIMIENTO);
		elementfecha_nacimiento.appendChild(document.createTextNode(cobrarclienteshonomasticos.getfecha_nacimiento().toString().trim()));
		element.appendChild(elementfecha_nacimiento);

		Element elementnombre_ciudad = document.createElement(CobrarClientesHonomasticosConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(cobrarclienteshonomasticos.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_ruta = document.createElement(CobrarClientesHonomasticosConstantesFunciones.NOMBRERUTA);
		elementnombre_ruta.appendChild(document.createTextNode(cobrarclienteshonomasticos.getnombre_ruta().trim()));
		element.appendChild(elementnombre_ruta);

		Element elementnombre_vendedor = document.createElement(CobrarClientesHonomasticosConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(cobrarclienteshonomasticos.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementcodigo = document.createElement(CobrarClientesHonomasticosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarclienteshonomasticos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(CobrarClientesHonomasticosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(cobrarclienteshonomasticos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnombre_comercial = document.createElement(CobrarClientesHonomasticosConstantesFunciones.NOMBRECOMERCIAL);
		elementnombre_comercial.appendChild(document.createTextNode(cobrarclienteshonomasticos.getnombre_comercial().trim()));
		element.appendChild(elementnombre_comercial);

		Element elementfecha_nacimiento_dato = document.createElement(CobrarClientesHonomasticosConstantesFunciones.FECHANACIMIENTODATO);
		elementfecha_nacimiento_dato.appendChild(document.createTextNode(cobrarclienteshonomasticos.getfecha_nacimiento_dato().toString().trim()));
		element.appendChild(elementfecha_nacimiento_dato);

		Element elementdireccion_direccion = document.createElement(CobrarClientesHonomasticosConstantesFunciones.DIRECCIONDIRECCION);
		elementdireccion_direccion.appendChild(document.createTextNode(cobrarclienteshonomasticos.getdireccion_direccion().trim()));
		element.appendChild(elementdireccion_direccion);

		Element elementtelefono_telefono = document.createElement(CobrarClientesHonomasticosConstantesFunciones.TELEFONOTELEFONO);
		elementtelefono_telefono.appendChild(document.createTextNode(cobrarclienteshonomasticos.gettelefono_telefono().trim()));
		element.appendChild(elementtelefono_telefono);
	}
	
	public void generarReporteGroupGenericoCobrarClientesHonomasticossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados=new ArrayList<CobrarClientesHonomasticos>();
		
		cobrarclienteshonomasticossSeleccionados=this.getCobrarClientesHonomasticossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarClientesHonomasticos(cobrarclienteshonomasticossSeleccionados);
		
		this.generarReporteCobrarClientesHonomasticoss("Todos",cobrarclienteshonomasticossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarClientesHonomasticos(ArrayList<CobrarClientesHonomasticos> cobrarclienteshonomasticossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarClientesHonomasticos cobrarclienteshonomasticosAux:cobrarclienteshonomasticossSeleccionados) {
				cobrarclienteshonomasticosAux.setsDetalleGeneralEntityReporte(cobrarclienteshonomasticosAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDREGION)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getregion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDPROVINCIA)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTO)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarclienteshonomasticosAux.getfecha_nacimiento()));
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRERUTA)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getnombre_ruta());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getnombre_comercial());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_FECHANACIMIENTODATO)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarclienteshonomasticosAux.getfecha_nacimiento_dato()));
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.getdireccion_direccion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesHonomasticosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
					existe=true;
					cobrarclienteshonomasticosAux.setsDescripcionGeneralEntityReporte1(cobrarclienteshonomasticosAux.gettelefono_telefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesHonomasticosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarClientesHonomasticos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=true;
		} else {
			this.actualizarEstadoPanelsCobrarClientesHonomasticos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarClientesHonomasticos=false;
			//this.isVisibilidadCeldaVerFormCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesHonomasticos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;												
			}
			
			this.jButtonCerrarCobrarClientesHonomasticos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarclienteshonomasticos)) {
			this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarClientesHonomasticos=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesHonomasticos=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesHonomasticos=false;
		//this.isVisibilidadCeldaModificarCobrarClientesHonomasticos=true;
		this.isVisibilidadCeldaActualizarCobrarClientesHonomasticos=false;
		this.isVisibilidadCeldaEliminarCobrarClientesHonomasticos=false;
		//this.isVisibilidadCeldaCancelarCobrarClientesHonomasticos=true;			
		this.isVisibilidadCeldaGuardarCobrarClientesHonomasticos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesHonomasticos() {
	}
	
	public void actualizarEstadoPanelsCobrarClientesHonomasticos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosCobrarClientesHonomasticos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesHonomasticos!=null) {
				this.jPanelPaginacionCobrarClientesHonomasticos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosCobrarClientesHonomasticos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesHonomasticos!=null) {
				this.jPanelPaginacionCobrarClientesHonomasticos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosCobrarClientesHonomasticos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesHonomasticos!=null) {
				this.jPanelPaginacionCobrarClientesHonomasticos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosCobrarClientesHonomasticos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesHonomasticos!=null) {
				this.jPanelPaginacionCobrarClientesHonomasticos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosCobrarClientesHonomasticos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesHonomasticos!=null) {
				this.jPanelPaginacionCobrarClientesHonomasticos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosCobrarClientesHonomasticos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesHonomasticos!=null) {
				this.jPanelPaginacionCobrarClientesHonomasticos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesHonomasticos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesHonomasticos!=null) {
				this.jScrollPanelDatosCobrarClientesHonomasticos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesHonomasticos!=null) {
				this.jPanelPaginacionCobrarClientesHonomasticos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
					this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarClientesHonomasticos!=null) {
				this.jPanelParametrosReportesCobrarClientesHonomasticos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarClientesHonomasticos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesHonomasticos) {this.jTabbedPaneBusquedasCobrarClientesHonomasticos.remove(jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaCobrarClientesHonomasticos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesHonomasticos) {this.jTabbedPaneBusquedasCobrarClientesHonomasticos.remove(jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaCobrarClientesHonomasticos=isParaPais;
			if(!this.isVisibilidadBusquedaCobrarClientesHonomasticos) {this.jTabbedPaneBusquedasCobrarClientesHonomasticos.remove(jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);}
		}
		
	}

	public void setVisibilidadBusquedasParaRegion(Boolean isParaRegion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRegionNegation=!isParaRegion;

			this.isVisibilidadBusquedaCobrarClientesHonomasticos=isParaRegion;
			if(!this.isVisibilidadBusquedaCobrarClientesHonomasticos) {this.jTabbedPaneBusquedasCobrarClientesHonomasticos.remove(jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProvincia(Boolean isParaProvincia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProvinciaNegation=!isParaProvincia;

			this.isVisibilidadBusquedaCobrarClientesHonomasticos=isParaProvincia;
			if(!this.isVisibilidadBusquedaCobrarClientesHonomasticos) {this.jTabbedPaneBusquedasCobrarClientesHonomasticos.remove(jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaCobrarClientesHonomasticos=isParaCiudad;
			if(!this.isVisibilidadBusquedaCobrarClientesHonomasticos) {this.jTabbedPaneBusquedasCobrarClientesHonomasticos.remove(jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);}
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
			
			this.inicializarActualizarBindingTablaCobrarClientesHonomasticos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarClientesHonomasticos() {
		this.updateBorderResaltarBusquedasFormularioCobrarClientesHonomasticos();
		this.updateVisibilidadBusquedasFormularioCobrarClientesHonomasticos();
		this.updateHabilitarBusquedasFormularioCobrarClientesHonomasticos();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarClientesHonomasticos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos.getComponents().length>0) {
	

		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos!=null) {
			index= this.jTabbedPaneBusquedasCobrarClientesHonomasticos.indexOfComponent(this.jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesHonomasticos.getComponent(index);
				jPanel.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarClientesHonomasticos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesHonomasticos.indexOfComponent(this.jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesHonomasticos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
			if(!this.cobrarclienteshonomasticosConstantesFunciones.mostrarBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos && index>-1) {
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarClientesHonomasticos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarClientesHonomasticos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesHonomasticos.indexOfComponent(this.jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesHonomasticos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
				this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setEnabledAt(index,this.cobrarclienteshonomasticosConstantesFunciones.activarBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarClientesHonomasticos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarClientesHonomasticos")) {
			index= this.jTabbedPaneBusquedasCobrarClientesHonomasticos.indexOfComponent(this.jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);

			this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesHonomasticos.getComponent(index);

			this.cobrarclienteshonomasticosConstantesFunciones.setResaltarBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos(resaltar);

			jPanel.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarClientesHonomasticos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarClientesHonomasticos() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarClientesHonomasticos();
		this.updateVisibilidadResaltarControlesFormularioCobrarClientesHonomasticos();
		this.updateHabilitarResaltarControlesFormularioCobrarClientesHonomasticos();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarClientesHonomasticos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltaridCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltaridCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_empresaCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_empresaCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_sucursalCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_sucursalCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_paisCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_paisCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_regionCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_regionCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_provinciaCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_provinciaCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_ciudadCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarid_ciudadCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarfecha_nacimientoCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarfecha_nacimientoCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_ciudadCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_ciudadCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_ciudadCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_rutaCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_rutaCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_rutaCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_vendedorCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_vendedorCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_vendedorCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarcodigoCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextFieldcodigoCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarcodigoCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_completoCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_completoCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_completoCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_comercialCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_comercialCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarnombre_comercialCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltarfecha_nacimiento_datoCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltarfecha_nacimiento_datoCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltardireccion_direccionCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreadireccion_direccionCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltardireccion_direccionCobrarClientesHonomasticos);}
		if(this.cobrarclienteshonomasticosConstantesFunciones.resaltartelefono_telefonoCobrarClientesHonomasticos!=null && this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreatelefono_telefonoCobrarClientesHonomasticos.setBorder(this.cobrarclienteshonomasticosConstantesFunciones.resaltartelefono_telefonoCobrarClientesHonomasticos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarClientesHonomasticos() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
	
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostraridCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelidCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostraridCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_empresaCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelid_empresaCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_empresaCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_sucursalCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelid_sucursalCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_sucursalCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_paisCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelid_paisCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_paisCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_regionCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelid_regionCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_regionCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_provinciaCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelid_provinciaCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_provinciaCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_ciudadCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelid_ciudadCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarid_ciudadCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarfecha_nacimientoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelfecha_nacimientoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarfecha_nacimientoCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_ciudadCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_ciudadCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelnombre_ciudadCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_ciudadCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_rutaCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_rutaCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelnombre_rutaCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_rutaCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_vendedorCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_vendedorCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelnombre_vendedorCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_vendedorCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextFieldcodigoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarcodigoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelcodigoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarcodigoCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_completoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_completoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelnombre_completoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_completoCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_comercialCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_comercialCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelnombre_comercialCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarnombre_comercialCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarfecha_nacimiento_datoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPanelfecha_nacimiento_datoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrarfecha_nacimiento_datoCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreadireccion_direccionCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrardireccion_direccionCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPaneldireccion_direccionCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrardireccion_direccionCobrarClientesHonomasticos);
		//this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreatelefono_telefonoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrartelefono_telefonoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jPaneltelefono_telefonoCobrarClientesHonomasticos.setVisible(this.cobrarclienteshonomasticosConstantesFunciones.mostrartelefono_telefonoCobrarClientesHonomasticos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarClientesHonomasticos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesHonomasticos!=null) {
	
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jLabelidCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activaridCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_empresaCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarid_empresaCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_sucursalCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarid_sucursalCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_paisCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarid_paisCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_regionCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarid_regionCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_provinciaCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarid_provinciaCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jComboBoxid_ciudadCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarid_ciudadCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimientoCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarfecha_nacimientoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_ciudadCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_ciudadCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_rutaCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_rutaCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_vendedorCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_vendedorCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextFieldcodigoCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarcodigoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_completoCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_completoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreanombre_comercialCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarnombre_comercialCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jDateChooserfecha_nacimiento_datoCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activarfecha_nacimiento_datoCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreadireccion_direccionCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activardireccion_direccionCobrarClientesHonomasticos);
		this.jInternalFrameDetalleFormCobrarClientesHonomasticos.jTextAreatelefono_telefonoCobrarClientesHonomasticos.setEnabled(this.cobrarclienteshonomasticosConstantesFunciones.activartelefono_telefonoCobrarClientesHonomasticos);
		}
	}
	
		
}