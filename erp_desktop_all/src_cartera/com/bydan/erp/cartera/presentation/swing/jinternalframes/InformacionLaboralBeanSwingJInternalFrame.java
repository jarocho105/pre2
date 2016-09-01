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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.InformacionLaboralConstantesFunciones;
import com.bydan.erp.cartera.util.InformacionLaboralParameterReturnGeneral;
//import com.bydan.erp.cartera.util.InformacionLaboralParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.InformacionLaboralBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class InformacionLaboralBeanSwingJInternalFrame extends InformacionLaboralJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(InformacionLaboralBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<InformacionLaboral> informacionlaboralValidator = new ClassValidator<InformacionLaboral>(InformacionLaboral.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public InformacionLaboral informacionlaboral;	
	public InformacionLaboral informacionlaboralAux;
	public InformacionLaboral informacionlaboralAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public InformacionLaboral informacionlaboralTotales;
	public Long idInformacionLaboralActual;
	public Long iIdNuevoInformacionLaboral=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTipoEmpresa="";

	public List<TipoEmpresa> tipoempresasForeignKey;

	public List<TipoEmpresa> gettipoempresasForeignKey() {
		return tipoempresasForeignKey;
	}

	public void settipoempresasForeignKey(List<TipoEmpresa> tipoempresasForeignKey) {
		this.tipoempresasForeignKey = tipoempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoEmpresa tipoempresaForeignKey;

	public TipoEmpresa gettipoempresaForeignKey() {
		return tipoempresaForeignKey;
	}

	public void settipoempresaForeignKey(TipoEmpresa tipoempresaForeignKey) {
		this.tipoempresaForeignKey = tipoempresaForeignKey;
	}

	public String sFinalQueryComboTipoRelaLabo="";

	public List<TipoRelaLabo> tiporelalabosForeignKey;

	public List<TipoRelaLabo> gettiporelalabosForeignKey() {
		return tiporelalabosForeignKey;
	}

	public void settiporelalabosForeignKey(List<TipoRelaLabo> tiporelalabosForeignKey) {
		this.tiporelalabosForeignKey = tiporelalabosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRelaLabo tiporelalaboForeignKey;

	public TipoRelaLabo gettiporelalaboForeignKey() {
		return tiporelalaboForeignKey;
	}

	public void settiporelalaboForeignKey(TipoRelaLabo tiporelalaboForeignKey) {
		this.tiporelalaboForeignKey = tiporelalaboForeignKey;
	}

	public String sFinalQueryComboTipoAreaLabo="";

	public List<TipoAreaLabo> tipoarealabosForeignKey;

	public List<TipoAreaLabo> gettipoarealabosForeignKey() {
		return tipoarealabosForeignKey;
	}

	public void settipoarealabosForeignKey(List<TipoAreaLabo> tipoarealabosForeignKey) {
		this.tipoarealabosForeignKey = tipoarealabosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoAreaLabo tipoarealaboForeignKey;

	public TipoAreaLabo gettipoarealaboForeignKey() {
		return tipoarealaboForeignKey;
	}

	public void settipoarealaboForeignKey(TipoAreaLabo tipoarealaboForeignKey) {
		this.tipoarealaboForeignKey = tipoarealaboForeignKey;
	}

	public String sFinalQueryComboTipoCargoLabo="";

	public List<TipoCargoLabo> tipocargolabosForeignKey;

	public List<TipoCargoLabo> gettipocargolabosForeignKey() {
		return tipocargolabosForeignKey;
	}

	public void settipocargolabosForeignKey(List<TipoCargoLabo> tipocargolabosForeignKey) {
		this.tipocargolabosForeignKey = tipocargolabosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCargoLabo tipocargolaboForeignKey;

	public TipoCargoLabo gettipocargolaboForeignKey() {
		return tipocargolaboForeignKey;
	}

	public void settipocargolaboForeignKey(TipoCargoLabo tipocargolaboForeignKey) {
		this.tipocargolaboForeignKey = tipocargolaboForeignKey;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoInformacionLaboral;
	public Boolean isPermisoNuevoInformacionLaboral;
	public Boolean isPermisoActualizarInformacionLaboral;
	public Boolean isPermisoActualizarOriginalInformacionLaboral;
	public Boolean isPermisoEliminarInformacionLaboral;
	public Boolean isPermisoGuardarCambiosInformacionLaboral;
	public Boolean isPermisoConsultaInformacionLaboral;
	public Boolean isPermisoBusquedaInformacionLaboral;
	public Boolean isPermisoReporteInformacionLaboral;
	public Boolean isPermisoPaginacionMedioInformacionLaboral;
	public Boolean isPermisoPaginacionAltoInformacionLaboral;
	public Boolean isPermisoPaginacionTodoInformacionLaboral;
	public Boolean isPermisoCopiarInformacionLaboral;
	public Boolean isPermisoVerFormInformacionLaboral;
	public Boolean isPermisoDuplicarInformacionLaboral;
	public Boolean isPermisoOrdenInformacionLaboral;
	
	
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
	
	public InformacionLaboralParameterReturnGeneral informacionlaboralReturnGeneral;
	public InformacionLaboralParameterReturnGeneral informacionlaboralParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoInformacionLaboral=false;
	public Boolean esParaAccionDesdeFormularioInformacionLaboral=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected InformacionLaboralSessionBeanAdditional informacionlaboralSessionBeanAdditional=null;
	
	public InformacionLaboralSessionBeanAdditional getInformacionLaboralSessionBeanAdditional() {
		return this.informacionlaboralSessionBeanAdditional;
	}
	
	public void setInformacionLaboralSessionBeanAdditional(InformacionLaboralSessionBeanAdditional informacionlaboralSessionBeanAdditional) {
		try {
			this.informacionlaboralSessionBeanAdditional=informacionlaboralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected InformacionLaboralBeanSwingJInternalFrameAdditional informacionlaboralBeanSwingJInternalFrameAdditional=null;
	//public class InformacionLaboralBeanSwingJInternalFrame
	
	public InformacionLaboralBeanSwingJInternalFrameAdditional getInformacionLaboralBeanSwingJInternalFrameAdditional() {
		return this.informacionlaboralBeanSwingJInternalFrameAdditional;
	}
	
	public void setInformacionLaboralBeanSwingJInternalFrameAdditional(InformacionLaboralBeanSwingJInternalFrameAdditional informacionlaboralBeanSwingJInternalFrameAdditional) {
		try {
			this.informacionlaboralBeanSwingJInternalFrameAdditional=informacionlaboralBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public InformacionLaboralLogic informacionlaboralLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public InformacionLaboral informacionlaboralBean;
	public InformacionLaboralConstantesFunciones informacionlaboralConstantesFunciones;
	//public InformacionLaboralParameterReturnGeneral informacionlaboralReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public TipoEmpresaLogic tipoempresaLogic;
	public TipoRelaLaboLogic tiporelalaboLogic;
	public TipoAreaLaboLogic tipoarealaboLogic;
	public TipoCargoLaboLogic tipocargolaboLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<InformacionLaboral> informacionlaborals;	
	//public List<InformacionLaboral> informacionlaboralsEliminados;
	//public List<InformacionLaboral> informacionlaboralsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoInformacionLaboral=false;
	public Boolean isVisibilidadCeldaDuplicarInformacionLaboral=true;
	public Boolean isVisibilidadCeldaCopiarInformacionLaboral=true;
	public Boolean isVisibilidadCeldaVerFormInformacionLaboral=true;
	public Boolean isVisibilidadCeldaOrdenInformacionLaboral=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
	public Boolean isVisibilidadCeldaModificarInformacionLaboral=false;
	public Boolean isVisibilidadCeldaActualizarInformacionLaboral=false;
	public Boolean isVisibilidadCeldaEliminarInformacionLaboral=false;
	public Boolean isVisibilidadCeldaCancelarInformacionLaboral=false;
	public Boolean isVisibilidadCeldaGuardarInformacionLaboral=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosInformacionLaboral=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdTipoEmpresa=false;
	public Boolean isVisibilidadFK_IdValorClienteAreaLaboral=false;
	public Boolean isVisibilidadFK_IdValorClienteCargoLaboral=false;
	public Boolean isVisibilidadFK_IdValorClienteRelacionLaboral=false;
	
	public Long getiIdNuevoInformacionLaboral() {
		return this.iIdNuevoInformacionLaboral;
	}

	public void setiIdNuevoInformacionLaboral(Long iIdNuevoInformacionLaboral) {
		this.iIdNuevoInformacionLaboral = iIdNuevoInformacionLaboral;
	}
	
	public Long getidInformacionLaboralActual() {
		return this.idInformacionLaboralActual;
	}

	public void setidInformacionLaboralActual(Long idInformacionLaboralActual) {
		this.idInformacionLaboralActual = idInformacionLaboralActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public InformacionLaboral getinformacionlaboral() {
		return this.informacionlaboral;
	}

	public void setinformacionlaboral(InformacionLaboral informacionlaboral) {
		this.informacionlaboral = informacionlaboral;
	}
	
	public InformacionLaboral getinformacionlaboralAux() {
		return this.informacionlaboralAux;
	}

	public void setinformacionlaboralAux(InformacionLaboral informacionlaboralAux) {
		this.informacionlaboralAux = informacionlaboralAux;
	}				
	
	public InformacionLaboral getinformacionlaboralAnterior() {
		return this.informacionlaboralAnterior;
	}

	public void setinformacionlaboralAnterior(InformacionLaboral informacionlaboralAnterior) {
		this.informacionlaboralAnterior = informacionlaboralAnterior;
	}	
	
	public InformacionLaboral getinformacionlaboralTotales() {
		return this.informacionlaboralTotales;
	}

	public void setinformacionlaboralTotales(InformacionLaboral informacionlaboralTotales) {
		this.informacionlaboralTotales = informacionlaboralTotales;
	}	
	
	public InformacionLaboral getinformacionlaboralBean() {
		return this.informacionlaboralBean;
	}

	public void setinformacionlaboralBean(InformacionLaboral informacionlaboralBean) {
		this.informacionlaboralBean = informacionlaboralBean;
	}	
	
	public InformacionLaboralParameterReturnGeneral getinformacionlaboralReturnGeneral() {
		return this.informacionlaboralReturnGeneral;
	}

	public void setinformacionlaboralReturnGeneral(InformacionLaboralParameterReturnGeneral informacionlaboralReturnGeneral) {
		this.informacionlaboralReturnGeneral = informacionlaboralReturnGeneral;
	}	
	
	
	public Long idciudadFK_IdCiudad=-1L;

	public Long getidciudadFK_IdCiudad() {
		return this.idciudadFK_IdCiudad;
	}

	public void setidciudadFK_IdCiudad(Long idciudadFK_IdCiudad) {
		this.idciudadFK_IdCiudad = idciudadFK_IdCiudad;
	}

	public Long idclienteFK_IdCliente=-1L;

	public Long getidclienteFK_IdCliente() {
		return this.idclienteFK_IdCliente;
	}

	public void setidclienteFK_IdCliente(Long idclienteFK_IdCliente) {
		this.idclienteFK_IdCliente = idclienteFK_IdCliente;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long idvalorempresaFK_IdTipoEmpresa=-1L;

	public Long getidvalorempresaFK_IdTipoEmpresa() {
		return this.idvalorempresaFK_IdTipoEmpresa;
	}

	public void setidvalorempresaFK_IdTipoEmpresa(Long idvalorempresaFK_IdTipoEmpresa) {
		this.idvalorempresaFK_IdTipoEmpresa = idvalorempresaFK_IdTipoEmpresa;
	}

	public Long idvalorclientearealaboralFK_IdValorClienteAreaLaboral=-1L;

	public Long getidvalorclientearealaboralFK_IdValorClienteAreaLaboral() {
		return this.idvalorclientearealaboralFK_IdValorClienteAreaLaboral;
	}

	public void setidvalorclientearealaboralFK_IdValorClienteAreaLaboral(Long idvalorclientearealaboralFK_IdValorClienteAreaLaboral) {
		this.idvalorclientearealaboralFK_IdValorClienteAreaLaboral = idvalorclientearealaboralFK_IdValorClienteAreaLaboral;
	}

	public Long idvalorclientecargolaboralFK_IdValorClienteCargoLaboral=-1L;

	public Long getidvalorclientecargolaboralFK_IdValorClienteCargoLaboral() {
		return this.idvalorclientecargolaboralFK_IdValorClienteCargoLaboral;
	}

	public void setidvalorclientecargolaboralFK_IdValorClienteCargoLaboral(Long idvalorclientecargolaboralFK_IdValorClienteCargoLaboral) {
		this.idvalorclientecargolaboralFK_IdValorClienteCargoLaboral = idvalorclientecargolaboralFK_IdValorClienteCargoLaboral;
	}

	public Long idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral=-1L;

	public Long getidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral() {
		return this.idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral;
	}

	public void setidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral(Long idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral) {
		this.idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral = idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public InformacionLaboralLogic getInformacionLaboralLogic()	{		
		return informacionlaboralLogic;
	}

	public void setInformacionLaboralLogic(InformacionLaboralLogic informacionlaboralLogic) {
		this.informacionlaboralLogic = informacionlaboralLogic;
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
	
	public Boolean getIsEsNuevoInformacionLaboral() {
		return isEsNuevoInformacionLaboral;
	}

	public void setIsEsNuevoInformacionLaboral(Boolean isEsNuevoInformacionLaboral) {
		this.isEsNuevoInformacionLaboral = isEsNuevoInformacionLaboral;
	}

	public Boolean getEsParaAccionDesdeFormularioInformacionLaboral() {
		return esParaAccionDesdeFormularioInformacionLaboral;
	}
	
	public void setEsParaAccionDesdeFormularioInformacionLaboral(Boolean esParaAccionDesdeFormularioInformacionLaboral) {
		this.esParaAccionDesdeFormularioInformacionLaboral = esParaAccionDesdeFormularioInformacionLaboral;
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
	
	
	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(informacionlaboralSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosTipoEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoempresasForeignKey=new ArrayList<TipoEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoEmpresaLogic tipoempresaLogic=new TipoEmpresaLogic();

			tipoempresaLogic.getTipoEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempresaLogic.getTipoEmpresaDataAccess().setIsForForeingKeyData(true);

					tipoempresaLogic.getTodosTipoEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipoempresasForeignKey=tipoempresaLogic.getTipoEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempresaLogic.getEntityWithConnection(informacionlaboralSessionBean.getlidTipoEmpresaActual());
					this.tipoempresasForeignKey.add(tipoempresaLogic.getTipoEmpresa());
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

	public void cargarCombosTipoRelaLabosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporelalabosForeignKey=new ArrayList<TipoRelaLabo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRelaLaboLogic tiporelalaboLogic=new TipoRelaLaboLogic();

			tiporelalaboLogic.getTipoRelaLaboDataAccess().setIsForForeingKeyData(true);

			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoRelaLabo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporelalaboLogic.getTipoRelaLaboDataAccess().setIsForForeingKeyData(true);

					tiporelalaboLogic.getTodosTipoRelaLabosWithConnection(sFinalQuery,new Pagination());

					this.tiporelalabosForeignKey=tiporelalaboLogic.getTipoRelaLabos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRelaLabo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporelalaboLogic.getEntityWithConnection(informacionlaboralSessionBean.getlidTipoRelaLaboActual());
					this.tiporelalabosForeignKey.add(tiporelalaboLogic.getTipoRelaLabo());
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

	public void cargarCombosTipoAreaLabosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoarealabosForeignKey=new ArrayList<TipoAreaLabo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoAreaLaboLogic tipoarealaboLogic=new TipoAreaLaboLogic();

			tipoarealaboLogic.getTipoAreaLaboDataAccess().setIsForForeingKeyData(true);

			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaLabo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarealaboLogic.getTipoAreaLaboDataAccess().setIsForForeingKeyData(true);

					tipoarealaboLogic.getTodosTipoAreaLabosWithConnection(sFinalQuery,new Pagination());

					this.tipoarealabosForeignKey=tipoarealaboLogic.getTipoAreaLabos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoAreaLabo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarealaboLogic.getEntityWithConnection(informacionlaboralSessionBean.getlidTipoAreaLaboActual());
					this.tipoarealabosForeignKey.add(tipoarealaboLogic.getTipoAreaLabo());
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

	public void cargarCombosTipoCargoLabosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocargolabosForeignKey=new ArrayList<TipoCargoLabo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCargoLaboLogic tipocargolaboLogic=new TipoCargoLaboLogic();

			tipocargolaboLogic.getTipoCargoLaboDataAccess().setIsForForeingKeyData(true);

			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargoLabo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargolaboLogic.getTipoCargoLaboDataAccess().setIsForForeingKeyData(true);

					tipocargolaboLogic.getTodosTipoCargoLabosWithConnection(sFinalQuery,new Pagination());

					this.tipocargolabosForeignKey=tipocargolaboLogic.getTipoCargoLabos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCargoLabo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargolaboLogic.getEntityWithConnection(informacionlaboralSessionBean.getlidTipoCargoLaboActual());
					this.tipocargolabosForeignKey.add(tipocargolaboLogic.getTipoCargoLabo());
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

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

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
					paisLogic.getEntityWithConnection(informacionlaboralSessionBean.getlidPaisActual());
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

			ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

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
					ciudadLogic.getEntityWithConnection(informacionlaboralSessionBean.getlidCiudadActual());
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

	
	
	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.informacionlaboral!=null) {
						this.informacionlaboral.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteInformacionLaboral.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteInformacionLaboral!=null) {
						jComboBoxidclienteFK_IdClienteInformacionLaboral.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteInformacionLaboral!=null) {
							//jComboBoxidclienteFK_IdClienteInformacionLaboral.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteInformacionLaboral.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteInformacionLaboral.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteInformacionLaboralGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxidclienteInformacionLaboralGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteInformacionLaboralGenerico!=null && jComboBoxidclienteInformacionLaboralGenerico.getItemCount()>0) {
					jComboBoxidclienteInformacionLaboralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoEmpresaForeignKey(Long idTipoEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoEmpresa  tipoempresaTemp=null;

			for(TipoEmpresa tipoempresaAux:tipoempresasForeignKey) {
				if(tipoempresaAux.getId()!=null && tipoempresaAux.getId().equals(idTipoEmpresaSeleccionado)) {
					tipoempresaTemp=tipoempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoempresaTemp!=null) {

					if(this.informacionlaboral!=null) {
						this.informacionlaboral.setTipoEmpresa(tipoempresaTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setSelectedItem(tipoempresaTemp);
					}
				} else {
					//jComboBoxidvalorempresaInformacionLaboral.setSelectedItem(tipoempresaTemp);
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoempresaTemp!=null && jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral!=null) {
						jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setSelectedItem(tipoempresaTemp);
					} else {
						if(jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral!=null) {
							//jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setSelectedItem(tipoempresaTemp);
							if(jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.getItemCount()>0) {
								jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setSelectedIndex(0);
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

	public String getActualTipoEmpresaForeignKeyDescripcion(Long idTipoEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoEmpresa  tipoempresaTemp=null;

			for(TipoEmpresa tipoempresaAux:tipoempresasForeignKey) {
				if(tipoempresaAux.getId()!=null && tipoempresaAux.getId().equals(idTipoEmpresaSeleccionado)) {
					tipoempresaTemp=tipoempresaAux;
					break;
				}
			}


			sDescripcion=TipoEmpresaConstantesFunciones.getTipoEmpresaDescripcion(tipoempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoEmpresaForeignKeyGenerico(Long idTipoEmpresaSeleccionado,JComboBox jComboBoxidvalorempresaInformacionLaboralGenerico)throws Exception
	{
		try
		{
			TipoEmpresa  tipoempresaTemp=null;

			for(TipoEmpresa tipoempresaAux:tipoempresasForeignKey) {
				if(tipoempresaAux.getId()!=null && tipoempresaAux.getId().equals(idTipoEmpresaSeleccionado)) {
					tipoempresaTemp=tipoempresaAux;
					break;
				}
			}

			if(tipoempresaTemp!=null) {
				jComboBoxidvalorempresaInformacionLaboralGenerico.setSelectedItem(tipoempresaTemp);
			} else {
				if(jComboBoxidvalorempresaInformacionLaboralGenerico!=null && jComboBoxidvalorempresaInformacionLaboralGenerico.getItemCount()>0) {
					jComboBoxidvalorempresaInformacionLaboralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRelaLaboForeignKey(Long idTipoRelaLaboSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRelaLabo  tiporelalaboTemp=null;

			for(TipoRelaLabo tiporelalaboAux:tiporelalabosForeignKey) {
				if(tiporelalaboAux.getId()!=null && tiporelalaboAux.getId().equals(idTipoRelaLaboSeleccionado)) {
					tiporelalaboTemp=tiporelalaboAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporelalaboTemp!=null) {

					if(this.informacionlaboral!=null) {
						this.informacionlaboral.setTipoRelaLabo(tiporelalaboTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setSelectedItem(tiporelalaboTemp);
					}
				} else {
					//jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setSelectedItem(tiporelalaboTemp);
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteRelacionLaboral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporelalaboTemp!=null && jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral!=null) {
						jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setSelectedItem(tiporelalaboTemp);
					} else {
						if(jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral!=null) {
							//jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setSelectedItem(tiporelalaboTemp);
							if(jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.getItemCount()>0) {
								jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setSelectedIndex(0);
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

	public String getActualTipoRelaLaboForeignKeyDescripcion(Long idTipoRelaLaboSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRelaLabo  tiporelalaboTemp=null;

			for(TipoRelaLabo tiporelalaboAux:tiporelalabosForeignKey) {
				if(tiporelalaboAux.getId()!=null && tiporelalaboAux.getId().equals(idTipoRelaLaboSeleccionado)) {
					tiporelalaboTemp=tiporelalaboAux;
					break;
				}
			}


			sDescripcion=TipoRelaLaboConstantesFunciones.getTipoRelaLaboDescripcion(tiporelalaboTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRelaLaboForeignKeyGenerico(Long idTipoRelaLaboSeleccionado,JComboBox jComboBoxidvalorclienterelacionlaboralInformacionLaboralGenerico)throws Exception
	{
		try
		{
			TipoRelaLabo  tiporelalaboTemp=null;

			for(TipoRelaLabo tiporelalaboAux:tiporelalabosForeignKey) {
				if(tiporelalaboAux.getId()!=null && tiporelalaboAux.getId().equals(idTipoRelaLaboSeleccionado)) {
					tiporelalaboTemp=tiporelalaboAux;
					break;
				}
			}

			if(tiporelalaboTemp!=null) {
				jComboBoxidvalorclienterelacionlaboralInformacionLaboralGenerico.setSelectedItem(tiporelalaboTemp);
			} else {
				if(jComboBoxidvalorclienterelacionlaboralInformacionLaboralGenerico!=null && jComboBoxidvalorclienterelacionlaboralInformacionLaboralGenerico.getItemCount()>0) {
					jComboBoxidvalorclienterelacionlaboralInformacionLaboralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoAreaLaboForeignKey(Long idTipoAreaLaboSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoAreaLabo  tipoarealaboTemp=null;

			for(TipoAreaLabo tipoarealaboAux:tipoarealabosForeignKey) {
				if(tipoarealaboAux.getId()!=null && tipoarealaboAux.getId().equals(idTipoAreaLaboSeleccionado)) {
					tipoarealaboTemp=tipoarealaboAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoarealaboTemp!=null) {

					if(this.informacionlaboral!=null) {
						this.informacionlaboral.setTipoAreaLabo(tipoarealaboTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setSelectedItem(tipoarealaboTemp);
					}
				} else {
					//jComboBoxidvalorclientearealaboralInformacionLaboral.setSelectedItem(tipoarealaboTemp);
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteAreaLaboral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoarealaboTemp!=null && jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral!=null) {
						jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setSelectedItem(tipoarealaboTemp);
					} else {
						if(jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral!=null) {
							//jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setSelectedItem(tipoarealaboTemp);
							if(jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.getItemCount()>0) {
								jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setSelectedIndex(0);
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

	public String getActualTipoAreaLaboForeignKeyDescripcion(Long idTipoAreaLaboSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoAreaLabo  tipoarealaboTemp=null;

			for(TipoAreaLabo tipoarealaboAux:tipoarealabosForeignKey) {
				if(tipoarealaboAux.getId()!=null && tipoarealaboAux.getId().equals(idTipoAreaLaboSeleccionado)) {
					tipoarealaboTemp=tipoarealaboAux;
					break;
				}
			}


			sDescripcion=TipoAreaLaboConstantesFunciones.getTipoAreaLaboDescripcion(tipoarealaboTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoAreaLaboForeignKeyGenerico(Long idTipoAreaLaboSeleccionado,JComboBox jComboBoxidvalorclientearealaboralInformacionLaboralGenerico)throws Exception
	{
		try
		{
			TipoAreaLabo  tipoarealaboTemp=null;

			for(TipoAreaLabo tipoarealaboAux:tipoarealabosForeignKey) {
				if(tipoarealaboAux.getId()!=null && tipoarealaboAux.getId().equals(idTipoAreaLaboSeleccionado)) {
					tipoarealaboTemp=tipoarealaboAux;
					break;
				}
			}

			if(tipoarealaboTemp!=null) {
				jComboBoxidvalorclientearealaboralInformacionLaboralGenerico.setSelectedItem(tipoarealaboTemp);
			} else {
				if(jComboBoxidvalorclientearealaboralInformacionLaboralGenerico!=null && jComboBoxidvalorclientearealaboralInformacionLaboralGenerico.getItemCount()>0) {
					jComboBoxidvalorclientearealaboralInformacionLaboralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCargoLaboForeignKey(Long idTipoCargoLaboSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCargoLabo  tipocargolaboTemp=null;

			for(TipoCargoLabo tipocargolaboAux:tipocargolabosForeignKey) {
				if(tipocargolaboAux.getId()!=null && tipocargolaboAux.getId().equals(idTipoCargoLaboSeleccionado)) {
					tipocargolaboTemp=tipocargolaboAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocargolaboTemp!=null) {

					if(this.informacionlaboral!=null) {
						this.informacionlaboral.setTipoCargoLabo(tipocargolaboTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setSelectedItem(tipocargolaboTemp);
					}
				} else {
					//jComboBoxidvalorclientecargolaboralInformacionLaboral.setSelectedItem(tipocargolaboTemp);
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteCargoLaboral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocargolaboTemp!=null && jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral!=null) {
						jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setSelectedItem(tipocargolaboTemp);
					} else {
						if(jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral!=null) {
							//jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setSelectedItem(tipocargolaboTemp);
							if(jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.getItemCount()>0) {
								jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setSelectedIndex(0);
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

	public String getActualTipoCargoLaboForeignKeyDescripcion(Long idTipoCargoLaboSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCargoLabo  tipocargolaboTemp=null;

			for(TipoCargoLabo tipocargolaboAux:tipocargolabosForeignKey) {
				if(tipocargolaboAux.getId()!=null && tipocargolaboAux.getId().equals(idTipoCargoLaboSeleccionado)) {
					tipocargolaboTemp=tipocargolaboAux;
					break;
				}
			}


			sDescripcion=TipoCargoLaboConstantesFunciones.getTipoCargoLaboDescripcion(tipocargolaboTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCargoLaboForeignKeyGenerico(Long idTipoCargoLaboSeleccionado,JComboBox jComboBoxidvalorclientecargolaboralInformacionLaboralGenerico)throws Exception
	{
		try
		{
			TipoCargoLabo  tipocargolaboTemp=null;

			for(TipoCargoLabo tipocargolaboAux:tipocargolabosForeignKey) {
				if(tipocargolaboAux.getId()!=null && tipocargolaboAux.getId().equals(idTipoCargoLaboSeleccionado)) {
					tipocargolaboTemp=tipocargolaboAux;
					break;
				}
			}

			if(tipocargolaboTemp!=null) {
				jComboBoxidvalorclientecargolaboralInformacionLaboralGenerico.setSelectedItem(tipocargolaboTemp);
			} else {
				if(jComboBoxidvalorclientecargolaboralInformacionLaboralGenerico!=null && jComboBoxidvalorclientecargolaboralInformacionLaboralGenerico.getItemCount()>0) {
					jComboBoxidvalorclientecargolaboralInformacionLaboralGenerico.setSelectedIndex(0);
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

					if(this.informacionlaboral!=null) {
						this.informacionlaboral.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisInformacionLaboral.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisInformacionLaboral!=null) {
						jComboBoxid_paisFK_IdPaisInformacionLaboral.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisInformacionLaboral!=null) {
							//jComboBoxid_paisFK_IdPaisInformacionLaboral.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisInformacionLaboral.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisInformacionLaboral.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisInformacionLaboralGenerico)throws Exception
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
				jComboBoxid_paisInformacionLaboralGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisInformacionLaboralGenerico!=null && jComboBoxid_paisInformacionLaboralGenerico.getItemCount()>0) {
					jComboBoxid_paisInformacionLaboralGenerico.setSelectedIndex(0);
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

					if(this.informacionlaboral!=null) {
						this.informacionlaboral.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxidciudadInformacionLaboral.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxidciudadFK_IdCiudadInformacionLaboral!=null) {
						jComboBoxidciudadFK_IdCiudadInformacionLaboral.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxidciudadFK_IdCiudadInformacionLaboral!=null) {
							//jComboBoxidciudadFK_IdCiudadInformacionLaboral.setSelectedItem(ciudadTemp);
							if(jComboBoxidciudadFK_IdCiudadInformacionLaboral.getItemCount()>0) {
								jComboBoxidciudadFK_IdCiudadInformacionLaboral.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxidciudadInformacionLaboralGenerico)throws Exception
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
				jComboBoxidciudadInformacionLaboralGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxidciudadInformacionLaboralGenerico!=null && jComboBoxidciudadInformacionLaboralGenerico.getItemCount()>0) {
					jComboBoxidciudadInformacionLaboralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(InformacionLaboral informacionlaboral,JComboBox jComboBoxidclienteInformacionLaboralGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteInformacionLaboralGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteInformacionLaboralGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				informacionlaboral.setidcliente(clienteAux.getId());
				informacionlaboral.setcliente_descripcion(InformacionLaboralConstantesFunciones.getClienteDescripcion(clienteAux));
				informacionlaboral.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoEmpresaForeignKey(InformacionLaboral informacionlaboral,JComboBox jComboBoxidvalorempresaInformacionLaboralGenerico)throws Exception
	{
		try
		{
			TipoEmpresa  tipoempresaAux=new TipoEmpresa();

			if(jComboBoxidvalorempresaInformacionLaboralGenerico==null) {
				tipoempresaAux=(TipoEmpresa)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.getSelectedItem();
			} else {
				tipoempresaAux=(TipoEmpresa)jComboBoxidvalorempresaInformacionLaboralGenerico.getSelectedItem();
			}

			if(tipoempresaAux!=null && tipoempresaAux.getId()!=null) {
				informacionlaboral.setidvalorempresa(tipoempresaAux.getId());
				informacionlaboral.settipoempresa_descripcion(InformacionLaboralConstantesFunciones.getTipoEmpresaDescripcion(tipoempresaAux));
				informacionlaboral.setTipoEmpresa(tipoempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRelaLaboForeignKey(InformacionLaboral informacionlaboral,JComboBox jComboBoxidvalorclienterelacionlaboralInformacionLaboralGenerico)throws Exception
	{
		try
		{
			TipoRelaLabo  tiporelalaboAux=new TipoRelaLabo();

			if(jComboBoxidvalorclienterelacionlaboralInformacionLaboralGenerico==null) {
				tiporelalaboAux=(TipoRelaLabo)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getSelectedItem();
			} else {
				tiporelalaboAux=(TipoRelaLabo)jComboBoxidvalorclienterelacionlaboralInformacionLaboralGenerico.getSelectedItem();
			}

			if(tiporelalaboAux!=null && tiporelalaboAux.getId()!=null) {
				informacionlaboral.setidvalorclienterelacionlaboral(tiporelalaboAux.getId());
				informacionlaboral.settiporelalabo_descripcion(InformacionLaboralConstantesFunciones.getTipoRelaLaboDescripcion(tiporelalaboAux));
				informacionlaboral.setTipoRelaLabo(tiporelalaboAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoAreaLaboForeignKey(InformacionLaboral informacionlaboral,JComboBox jComboBoxidvalorclientearealaboralInformacionLaboralGenerico)throws Exception
	{
		try
		{
			TipoAreaLabo  tipoarealaboAux=new TipoAreaLabo();

			if(jComboBoxidvalorclientearealaboralInformacionLaboralGenerico==null) {
				tipoarealaboAux=(TipoAreaLabo)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.getSelectedItem();
			} else {
				tipoarealaboAux=(TipoAreaLabo)jComboBoxidvalorclientearealaboralInformacionLaboralGenerico.getSelectedItem();
			}

			if(tipoarealaboAux!=null && tipoarealaboAux.getId()!=null) {
				informacionlaboral.setidvalorclientearealaboral(tipoarealaboAux.getId());
				informacionlaboral.settipoarealabo_descripcion(InformacionLaboralConstantesFunciones.getTipoAreaLaboDescripcion(tipoarealaboAux));
				informacionlaboral.setTipoAreaLabo(tipoarealaboAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCargoLaboForeignKey(InformacionLaboral informacionlaboral,JComboBox jComboBoxidvalorclientecargolaboralInformacionLaboralGenerico)throws Exception
	{
		try
		{
			TipoCargoLabo  tipocargolaboAux=new TipoCargoLabo();

			if(jComboBoxidvalorclientecargolaboralInformacionLaboralGenerico==null) {
				tipocargolaboAux=(TipoCargoLabo)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.getSelectedItem();
			} else {
				tipocargolaboAux=(TipoCargoLabo)jComboBoxidvalorclientecargolaboralInformacionLaboralGenerico.getSelectedItem();
			}

			if(tipocargolaboAux!=null && tipocargolaboAux.getId()!=null) {
				informacionlaboral.setidvalorclientecargolaboral(tipocargolaboAux.getId());
				informacionlaboral.settipocargolabo_descripcion(InformacionLaboralConstantesFunciones.getTipoCargoLaboDescripcion(tipocargolaboAux));
				informacionlaboral.setTipoCargoLabo(tipocargolaboAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(InformacionLaboral informacionlaboral,JComboBox jComboBoxid_paisInformacionLaboralGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisInformacionLaboralGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisInformacionLaboralGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				informacionlaboral.setid_pais(paisAux.getId());
				informacionlaboral.setpais_descripcion(InformacionLaboralConstantesFunciones.getPaisDescripcion(paisAux));
				informacionlaboral.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(InformacionLaboral informacionlaboral,JComboBox jComboBoxidciudadInformacionLaboralGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxidciudadInformacionLaboralGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxidciudadInformacionLaboralGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				informacionlaboral.setidciudad(ciudadAux.getId());
				informacionlaboral.setciudad_descripcion(InformacionLaboralConstantesFunciones.getCiudadDescripcion(ciudadAux));
				informacionlaboral.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
					}

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteInformacionLaboral.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteInformacionLaboral.addItem(cliente);
							}
						}

						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.removeAllItems();

							for(TipoEmpresa tipoempresa:this.tipoempresasForeignKey) {
								this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.addItem(tipoempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
					}

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.removeAllItems();

							for(TipoEmpresa tipoempresa:this.tipoempresasForeignKey) {
								this.jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.addItem(tipoempresa);
							}
						}

						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRelaLabosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRelaLabo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.removeAllItems();

							for(TipoRelaLabo tiporelalabo:this.tiporelalabosForeignKey) {
								this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.addItem(tiporelalabo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
					}

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteRelacionLaboral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.removeAllItems();

							for(TipoRelaLabo tiporelalabo:this.tiporelalabosForeignKey) {
								this.jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.addItem(tiporelalabo);
							}
						}

						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoAreaLabosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoAreaLabo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.removeAllItems();

							for(TipoAreaLabo tipoarealabo:this.tipoarealabosForeignKey) {
								this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.addItem(tipoarealabo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
					}

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteAreaLaboral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.removeAllItems();

							for(TipoAreaLabo tipoarealabo:this.tipoarealabosForeignKey) {
								this.jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.addItem(tipoarealabo);
							}
						}

						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCargoLabosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCargoLabo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.removeAllItems();

							for(TipoCargoLabo tipocargolabo:this.tipocargolabosForeignKey) {
								this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.addItem(tipocargolabo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
					}

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteCargoLaboral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.removeAllItems();

							for(TipoCargoLabo tipocargolabo:this.tipocargolabosForeignKey) {
								this.jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.addItem(tipocargolabo);
							}
						}

						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
					}

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisInformacionLaboral.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisInformacionLaboral.addItem(pais);
							}
						}

						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
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

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { 
					}

					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidciudadFK_IdCiudadInformacionLaboral.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxidciudadFK_IdCiudadInformacionLaboral.addItem(ciudad);
							}
						}

						if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteInformacionLaboral.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteInformacionLaboral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoEmpresaForeignKey(TipoEmpresa tipoempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setSelectedItem(tipoempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setSelectedItem(tipoempresa);
						} else {
							this.jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRelaLaboForeignKey(TipoRelaLabo tiporelalabo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setSelectedItem(tiporelalabo);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setSelectedItem(tiporelalabo);
						} else {
							this.jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoAreaLaboForeignKey(TipoAreaLabo tipoarealabo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setSelectedItem(tipoarealabo);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setSelectedItem(tipoarealabo);
						} else {
							this.jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCargoLaboForeignKey(TipoCargoLabo tipocargolabo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setSelectedItem(tipocargolabo);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setSelectedItem(tipocargolabo);
						} else {
							this.jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisInformacionLaboral.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisInformacionLaboral.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidciudadFK_IdCiudadInformacionLaboral.setSelectedItem(ciudad);
						} else {
							this.jComboBoxidciudadFK_IdCiudadInformacionLaboral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesInformacionLaboral() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			InformacionLaboralConstantesFunciones.refrescarForeignKeysDescripcionesInformacionLaboral(this.informacionlaboralLogic.getInformacionLaborals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			InformacionLaboralConstantesFunciones.refrescarForeignKeysDescripcionesInformacionLaboral(this.informacionlaborals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoEmpresa.class));
		classes.add(new Classe(TipoRelaLabo.class));
		classes.add(new Classe(TipoAreaLabo.class));
		classes.add(new Classe(TipoCargoLabo.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//informacionlaboralLogic.setInformacionLaborals(this.informacionlaborals);
			informacionlaboralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public InformacionLaboralParameterReturnGeneral getInformacionLaboralParameterGeneral() {
		return this.informacionlaboralParameterGeneral;
	}
	
	public void setInformacionLaboralParameterGeneral(InformacionLaboralParameterReturnGeneral informacionlaboralParameterGeneral) {
		this.informacionlaboralParameterGeneral = informacionlaboralParameterGeneral;
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
	
	public Boolean getIsPermisoTodoInformacionLaboral() {
		return isPermisoTodoInformacionLaboral;
	}

	public void setIsPermisoTodoInformacionLaboral(Boolean isPermisoTodoInformacionLaboral) {
		this.isPermisoTodoInformacionLaboral = isPermisoTodoInformacionLaboral;
	}

	public Boolean getIsPermisoNuevoInformacionLaboral() {
		return isPermisoNuevoInformacionLaboral;
	}

	public void setIsPermisoNuevoInformacionLaboral(Boolean isPermisoNuevoInformacionLaboral) {
		this.isPermisoNuevoInformacionLaboral = isPermisoNuevoInformacionLaboral;
	}

	public Boolean getIsPermisoActualizarInformacionLaboral() {
		return isPermisoActualizarInformacionLaboral;
	}

	public void setIsPermisoActualizarInformacionLaboral(Boolean isPermisoActualizarInformacionLaboral) {
		this.isPermisoActualizarInformacionLaboral = isPermisoActualizarInformacionLaboral;
	}

	public Boolean getIsPermisoEliminarInformacionLaboral() {
		return isPermisoEliminarInformacionLaboral;
	}

	public void setIsPermisoEliminarInformacionLaboral(Boolean isPermisoEliminarInformacionLaboral) {
		this.isPermisoEliminarInformacionLaboral = isPermisoEliminarInformacionLaboral;
	}

	public Boolean getIsPermisoGuardarCambiosInformacionLaboral() {
		return isPermisoGuardarCambiosInformacionLaboral;
	}

	public void setIsPermisoGuardarCambiosInformacionLaboral(Boolean isPermisoGuardarCambiosInformacionLaboral) {
		this.isPermisoGuardarCambiosInformacionLaboral = isPermisoGuardarCambiosInformacionLaboral;
	}
	
	public Boolean getIsPermisoConsultaInformacionLaboral() {
		return isPermisoConsultaInformacionLaboral;
	}

	public void setIsPermisoConsultaInformacionLaboral(Boolean isPermisoConsultaInformacionLaboral) {
		this.isPermisoConsultaInformacionLaboral = isPermisoConsultaInformacionLaboral;
	}

	public Boolean getIsPermisoBusquedaInformacionLaboral() {
		return isPermisoBusquedaInformacionLaboral;
	}

	public void setIsPermisoBusquedaInformacionLaboral(Boolean isPermisoBusquedaInformacionLaboral) {
		this.isPermisoBusquedaInformacionLaboral = isPermisoBusquedaInformacionLaboral;
	}

	public Boolean getIsPermisoReporteInformacionLaboral() {
		return isPermisoReporteInformacionLaboral;
	}

	public void setIsPermisoReporteInformacionLaboral(Boolean isPermisoReporteInformacionLaboral) {
		this.isPermisoReporteInformacionLaboral = isPermisoReporteInformacionLaboral;
	}
	
	public Boolean getIsPermisoPaginacionMedioInformacionLaboral() {
		return isPermisoPaginacionMedioInformacionLaboral;
	}

	public void setIsPermisoPaginacionMedioInformacionLaboral(Boolean isPermisoPaginacionMedioInformacionLaboral) {
		this.isPermisoPaginacionMedioInformacionLaboral = isPermisoPaginacionMedioInformacionLaboral;
	}
	
	public Boolean getIsPermisoPaginacionTodoInformacionLaboral() {
		return isPermisoPaginacionTodoInformacionLaboral;
	}

	public void setIsPermisoPaginacionTodoInformacionLaboral(Boolean isPermisoPaginacionTodoInformacionLaboral) {
		this.isPermisoPaginacionTodoInformacionLaboral = isPermisoPaginacionTodoInformacionLaboral;
	}
	
	public Boolean getIsPermisoPaginacionAltoInformacionLaboral() {
		return isPermisoPaginacionAltoInformacionLaboral;
	}

	public void setIsPermisoPaginacionAltoInformacionLaboral(Boolean isPermisoPaginacionAltoInformacionLaboral) {
		this.isPermisoPaginacionAltoInformacionLaboral = isPermisoPaginacionAltoInformacionLaboral;
	}
	
	public Boolean getIsPermisoCopiarInformacionLaboral() {
		return isPermisoCopiarInformacionLaboral;
	}

	public void setIsPermisoCopiarInformacionLaboral(Boolean isPermisoCopiarInformacionLaboral) {
		this.isPermisoCopiarInformacionLaboral = isPermisoCopiarInformacionLaboral;
	}
	
	public Boolean getIsPermisoVerFormInformacionLaboral() {
		return isPermisoVerFormInformacionLaboral;
	}

	public void setIsPermisoVerFormInformacionLaboral(Boolean isPermisoVerFormInformacionLaboral) {
		this.isPermisoVerFormInformacionLaboral = isPermisoVerFormInformacionLaboral;
	}
	
	public Boolean getIsPermisoDuplicarInformacionLaboral() {
		return isPermisoDuplicarInformacionLaboral;
	}

	public void setIsPermisoDuplicarInformacionLaboral(Boolean isPermisoDuplicarInformacionLaboral) {
		this.isPermisoDuplicarInformacionLaboral = isPermisoDuplicarInformacionLaboral;
	}
	
	public Boolean getIsPermisoOrdenInformacionLaboral() {
		return isPermisoOrdenInformacionLaboral;
	}

	public void setIsPermisoOrdenInformacionLaboral(Boolean isPermisoOrdenInformacionLaboral) {
		this.isPermisoOrdenInformacionLaboral = isPermisoOrdenInformacionLaboral;
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
	
	public Boolean getIsVisibilidadCeldaNuevoInformacionLaboral() {
		return isVisibilidadCeldaNuevoInformacionLaboral;
	}

	public void setIsVisibilidadCeldaNuevoInformacionLaboral(Boolean isVisibilidadCeldaNuevoInformacionLaboral) {
		this.isVisibilidadCeldaNuevoInformacionLaboral = isVisibilidadCeldaNuevoInformacionLaboral;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarInformacionLaboral() {
		return isVisibilidadCeldaDuplicarInformacionLaboral;
	}

	public void setIsVisibilidadCeldaDuplicarInformacionLaboral(Boolean isVisibilidadCeldaDuplicarInformacionLaboral) {
		this.isVisibilidadCeldaDuplicarInformacionLaboral = isVisibilidadCeldaDuplicarInformacionLaboral;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarInformacionLaboral() {
		return isVisibilidadCeldaCopiarInformacionLaboral;
	}

	public void setIsVisibilidadCeldaCopiarInformacionLaboral(Boolean isVisibilidadCeldaCopiarInformacionLaboral) {
		this.isVisibilidadCeldaCopiarInformacionLaboral = isVisibilidadCeldaCopiarInformacionLaboral;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormInformacionLaboral() {
		return isVisibilidadCeldaVerFormInformacionLaboral;
	}

	public void setIsVisibilidadCeldaVerFormInformacionLaboral(Boolean isVisibilidadCeldaVerFormInformacionLaboral) {
		this.isVisibilidadCeldaVerFormInformacionLaboral = isVisibilidadCeldaVerFormInformacionLaboral;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenInformacionLaboral() {
		return isVisibilidadCeldaOrdenInformacionLaboral;
	}

	public void setIsVisibilidadCeldaOrdenInformacionLaboral(Boolean isVisibilidadCeldaOrdenInformacionLaboral) {
		this.isVisibilidadCeldaOrdenInformacionLaboral = isVisibilidadCeldaOrdenInformacionLaboral;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesInformacionLaboral() {
		return isVisibilidadCeldaNuevoRelacionesInformacionLaboral;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesInformacionLaboral(Boolean isVisibilidadCeldaNuevoRelacionesInformacionLaboral) {
		this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral = isVisibilidadCeldaNuevoRelacionesInformacionLaboral;
	}
	
	public Boolean getIsVisibilidadCeldaModificarInformacionLaboral() {
		return isVisibilidadCeldaModificarInformacionLaboral;
	}

	public void setIsVisibilidadCeldaModificarInformacionLaboral(Boolean isVisibilidadCeldaModificarInformacionLaboral) {
		this.isVisibilidadCeldaModificarInformacionLaboral = isVisibilidadCeldaModificarInformacionLaboral;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarInformacionLaboral() {
		return isVisibilidadCeldaActualizarInformacionLaboral;
	}

	public void setIsVisibilidadCeldaActualizarInformacionLaboral(Boolean isVisibilidadCeldaActualizarInformacionLaboral) {
		this.isVisibilidadCeldaActualizarInformacionLaboral = isVisibilidadCeldaActualizarInformacionLaboral;
	}

	public Boolean getIsVisibilidadCeldaEliminarInformacionLaboral() {
		return isVisibilidadCeldaEliminarInformacionLaboral;
	}

	public void setIsVisibilidadCeldaEliminarInformacionLaboral(Boolean isVisibilidadCeldaEliminarInformacionLaboral) {
		this.isVisibilidadCeldaEliminarInformacionLaboral = isVisibilidadCeldaEliminarInformacionLaboral;
	}

	public Boolean getIsVisibilidadCeldaCancelarInformacionLaboral() {
		return isVisibilidadCeldaCancelarInformacionLaboral;
	}

	public void setIsVisibilidadCeldaCancelarInformacionLaboral(Boolean isVisibilidadCeldaCancelarInformacionLaboral) {
		this.isVisibilidadCeldaCancelarInformacionLaboral = isVisibilidadCeldaCancelarInformacionLaboral;
	}

	public Boolean getIsVisibilidadCeldaGuardarInformacionLaboral() {
		return isVisibilidadCeldaGuardarInformacionLaboral;
	}

	public void setIsVisibilidadCeldaGuardarInformacionLaboral(Boolean isVisibilidadCeldaGuardarInformacionLaboral) {
		this.isVisibilidadCeldaGuardarInformacionLaboral = isVisibilidadCeldaGuardarInformacionLaboral;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosInformacionLaboral() {
		return isVisibilidadCeldaGuardarCambiosInformacionLaboral;
	}

	public void setIsVisibilidadCeldaGuardarCambiosInformacionLaboral(Boolean isVisibilidadCeldaGuardarCambiosInformacionLaboral) {
		this.isVisibilidadCeldaGuardarCambiosInformacionLaboral = isVisibilidadCeldaGuardarCambiosInformacionLaboral;
	}
		
	public InformacionLaboralSessionBean getinformacionlaboralSessionBean() {
		return this.informacionlaboralSessionBean;
	}
	
	public void setinformacionlaboralSessionBean(InformacionLaboralSessionBean informacionlaboralSessionBean) {
		this.informacionlaboralSessionBean=informacionlaboralSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdTipoEmpresa() {
		return this.isVisibilidadFK_IdTipoEmpresa;
	}

	public void setisVisibilidadFK_IdTipoEmpresa(Boolean isVisibilidadFK_IdTipoEmpresa) {
		this.isVisibilidadFK_IdTipoEmpresa=isVisibilidadFK_IdTipoEmpresa;
	}

	public Boolean getisVisibilidadFK_IdValorClienteAreaLaboral() {
		return this.isVisibilidadFK_IdValorClienteAreaLaboral;
	}

	public void setisVisibilidadFK_IdValorClienteAreaLaboral(Boolean isVisibilidadFK_IdValorClienteAreaLaboral) {
		this.isVisibilidadFK_IdValorClienteAreaLaboral=isVisibilidadFK_IdValorClienteAreaLaboral;
	}

	public Boolean getisVisibilidadFK_IdValorClienteCargoLaboral() {
		return this.isVisibilidadFK_IdValorClienteCargoLaboral;
	}

	public void setisVisibilidadFK_IdValorClienteCargoLaboral(Boolean isVisibilidadFK_IdValorClienteCargoLaboral) {
		this.isVisibilidadFK_IdValorClienteCargoLaboral=isVisibilidadFK_IdValorClienteCargoLaboral;
	}

	public Boolean getisVisibilidadFK_IdValorClienteRelacionLaboral() {
		return this.isVisibilidadFK_IdValorClienteRelacionLaboral;
	}

	public void setisVisibilidadFK_IdValorClienteRelacionLaboral(Boolean isVisibilidadFK_IdValorClienteRelacionLaboral) {
		this.isVisibilidadFK_IdValorClienteRelacionLaboral=isVisibilidadFK_IdValorClienteRelacionLaboral;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(InformacionLaboral informacionlaboral)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(informacionlaboral,null);
				this.setActualParaGuardarTipoEmpresaForeignKey(informacionlaboral,null);
				this.setActualParaGuardarTipoRelaLaboForeignKey(informacionlaboral,null);
				this.setActualParaGuardarTipoAreaLaboForeignKey(informacionlaboral,null);
				this.setActualParaGuardarTipoCargoLaboForeignKey(informacionlaboral,null);
				this.setActualParaGuardarPaisForeignKey(informacionlaboral,null);
				this.setActualParaGuardarCiudadForeignKey(informacionlaboral,null);
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
	
	public void bugActualizarReferenciaActual(InformacionLaboral informacionlaboral,InformacionLaboral informacionlaboralAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalInformacionLaboral(informacionlaboral);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		informacionlaboralAux.setId(informacionlaboral.getId());
		informacionlaboralAux.setVersionRow(informacionlaboral.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessInformacionLaboral();
		
			int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = informacionlaboralValidator.getInvalidValues(this.informacionlaboral);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			informacionlaboralLogic.setDatosCliente(datosCliente);
			informacionlaboralLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				informacionlaboralAux=new  InformacionLaboral();
				
				informacionlaboralAux.setIsNew(true);
				informacionlaboralAux.setIsChanged(true);
				
				informacionlaboralAux.setInformacionLaboralOriginal(this.informacionlaboral);
				
				informacionlaboralAux.setId(this.informacionlaboral.getId());	
				informacionlaboralAux.setVersionRow(this.informacionlaboral.getVersionRow());	
				informacionlaboralAux.setidcliente(this.informacionlaboral.getidcliente());	
				informacionlaboralAux.setidvalorempresa(this.informacionlaboral.getidvalorempresa());	
				informacionlaboralAux.setidvalorclienterelacionlaboral(this.informacionlaboral.getidvalorclienterelacionlaboral());	
				informacionlaboralAux.setidvalorclientearealaboral(this.informacionlaboral.getidvalorclientearealaboral());	
				informacionlaboralAux.setidvalorclientecargolaboral(this.informacionlaboral.getidvalorclientecargolaboral());	
				informacionlaboralAux.setid_pais(this.informacionlaboral.getid_pais());	
				informacionlaboralAux.setidciudad(this.informacionlaboral.getidciudad());	
				informacionlaboralAux.settiempoa(this.informacionlaboral.gettiempoa());	
				informacionlaboralAux.settiempom(this.informacionlaboral.gettiempom());	
				informacionlaboralAux.setnombreempresa(this.informacionlaboral.getnombreempresa());	
				informacionlaboralAux.setdireccion(this.informacionlaboral.getdireccion());	
				informacionlaboralAux.setnombrereferencia(this.informacionlaboral.getnombrereferencia());	
				informacionlaboralAux.settelefono(this.informacionlaboral.gettelefono());	
				informacionlaboralAux.settelefonocodigoarea(this.informacionlaboral.gettelefonocodigoarea());	
				informacionlaboralAux.settelefonomovil(this.informacionlaboral.gettelefonomovil());	
				informacionlaboralAux.setemail(this.informacionlaboral.getemail());	
				informacionlaboralAux.setesactivo(this.informacionlaboral.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.informacionlaboralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(informacionlaboralAux,informacionlaboralLogic.getInformacionLaborals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacionlaboralAux,informacionlaborals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacionlaboralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.saveInformacionLaborals();//WithConnection
						//informacionlaboralLogic.getSetVersionRowInformacionLaborals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.informacionlaboral,informacionlaboralAux);
					
					this.refrescarForeignKeysDescripcionesInformacionLaboral();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacionlaboralLogic.saveInformacionLaboralRelaciones(informacionlaboralAux);//WithConnection
								//informacionlaboralLogic.getSetVersionRowInformacionLaborals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.informacionlaboral,informacionlaboralAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones() 
									|| this.informacionlaboralSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(informacionlaboralAux,informacionlaboralLogic.getInformacionLaborals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(informacionlaboralAux,informacionlaborals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.informacionlaboral,informacionlaboralAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				informacionlaboralAux=new  InformacionLaboral();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado() 
					|| (this.informacionlaboralSessionBean.getEsGuardarRelacionado() && this.informacionlaboral.getId()>=0)) {
						
					informacionlaboralAux.setIsNew(false);
				}
				
				informacionlaboralAux.setIsDeleted(false);
			
				informacionlaboralAux.setId(this.informacionlaboral.getId());	
				informacionlaboralAux.setVersionRow(this.informacionlaboral.getVersionRow());	
				informacionlaboralAux.setidcliente(this.informacionlaboral.getidcliente());	
				informacionlaboralAux.setidvalorempresa(this.informacionlaboral.getidvalorempresa());	
				informacionlaboralAux.setidvalorclienterelacionlaboral(this.informacionlaboral.getidvalorclienterelacionlaboral());	
				informacionlaboralAux.setidvalorclientearealaboral(this.informacionlaboral.getidvalorclientearealaboral());	
				informacionlaboralAux.setidvalorclientecargolaboral(this.informacionlaboral.getidvalorclientecargolaboral());	
				informacionlaboralAux.setid_pais(this.informacionlaboral.getid_pais());	
				informacionlaboralAux.setidciudad(this.informacionlaboral.getidciudad());	
				informacionlaboralAux.settiempoa(this.informacionlaboral.gettiempoa());	
				informacionlaboralAux.settiempom(this.informacionlaboral.gettiempom());	
				informacionlaboralAux.setnombreempresa(this.informacionlaboral.getnombreempresa());	
				informacionlaboralAux.setdireccion(this.informacionlaboral.getdireccion());	
				informacionlaboralAux.setnombrereferencia(this.informacionlaboral.getnombrereferencia());	
				informacionlaboralAux.settelefono(this.informacionlaboral.gettelefono());	
				informacionlaboralAux.settelefonocodigoarea(this.informacionlaboral.gettelefonocodigoarea());	
				informacionlaboralAux.settelefonomovil(this.informacionlaboral.gettelefonomovil());	
				informacionlaboralAux.setemail(this.informacionlaboral.getemail());	
				informacionlaboralAux.setesactivo(this.informacionlaboral.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(informacionlaboralAux,informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacionlaboralAux,informacionlaborals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacionlaboralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.saveInformacionLaborals();//WithConnection
						//informacionlaboralLogic.getSetVersionRowInformacionLaborals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.informacionlaboral,informacionlaboralAux);
					
					this.refrescarForeignKeysDescripcionesInformacionLaboral();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacionlaboralLogic.saveInformacionLaboralRelaciones(informacionlaboralAux);//WithConnection
								//informacionlaboralLogic.getSetVersionRowInformacionLaborals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.informacionlaboral,informacionlaboralAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones() 
									|| this.informacionlaboralSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(informacionlaboralAux,informacionlaboralLogic.getInformacionLaborals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(informacionlaboralAux,informacionlaborals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.informacionlaboral,informacionlaboralAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				informacionlaboralAux=new  InformacionLaboral();
				
				informacionlaboralAux.setIsNew(false);
				informacionlaboralAux.setIsChanged(false);
				
				informacionlaboralAux.setIsDeleted(true);
				
				informacionlaboralAux.setId(this.informacionlaboral.getId());	
				informacionlaboralAux.setVersionRow(this.informacionlaboral.getVersionRow());	
				informacionlaboralAux.setidcliente(this.informacionlaboral.getidcliente());	
				informacionlaboralAux.setidvalorempresa(this.informacionlaboral.getidvalorempresa());	
				informacionlaboralAux.setidvalorclienterelacionlaboral(this.informacionlaboral.getidvalorclienterelacionlaboral());	
				informacionlaboralAux.setidvalorclientearealaboral(this.informacionlaboral.getidvalorclientearealaboral());	
				informacionlaboralAux.setidvalorclientecargolaboral(this.informacionlaboral.getidvalorclientecargolaboral());	
				informacionlaboralAux.setid_pais(this.informacionlaboral.getid_pais());	
				informacionlaboralAux.setidciudad(this.informacionlaboral.getidciudad());	
				informacionlaboralAux.settiempoa(this.informacionlaboral.gettiempoa());	
				informacionlaboralAux.settiempom(this.informacionlaboral.gettiempom());	
				informacionlaboralAux.setnombreempresa(this.informacionlaboral.getnombreempresa());	
				informacionlaboralAux.setdireccion(this.informacionlaboral.getdireccion());	
				informacionlaboralAux.setnombrereferencia(this.informacionlaboral.getnombrereferencia());	
				informacionlaboralAux.settelefono(this.informacionlaboral.gettelefono());	
				informacionlaboralAux.settelefonocodigoarea(this.informacionlaboral.gettelefonocodigoarea());	
				informacionlaboralAux.settelefonomovil(this.informacionlaboral.gettelefonomovil());	
				informacionlaboralAux.setemail(this.informacionlaboral.getemail());	
				informacionlaboralAux.setesactivo(this.informacionlaboral.getesactivo());	
				
				if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.informacionlaboralAux.getId()>=0) {	
						this.informacionlaboralsEliminados.add(informacionlaboralAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(informacionlaboralAux,informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacionlaboralAux,informacionlaborals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacionlaboralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.saveInformacionLaborals();//WithConnection
						//informacionlaboralLogic.getSetVersionRowInformacionLaborals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacionlaboralLogic.saveInformacionLaboralRelaciones(informacionlaboralAux);//WithConnection
								//informacionlaboralLogic.getSetVersionRowInformacionLaborals();//WithConnection
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
							if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones() 
								|| this.informacionlaboralSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(informacionlaboralAux,informacionlaboralLogic.getInformacionLaborals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(informacionlaboralAux,informacionlaborals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getInformacionLaborals().addAll(this.informacionlaboralsEliminados);
					
					informacionlaboralLogic.saveInformacionLaborals();//WithConnection
					//informacionlaboralLogic.getSetVersionRowInformacionLaborals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesInformacionLaboral();
				
				this.informacionlaboralsEliminados= new ArrayList<InformacionLaboral>();		
			}
			
			if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Informacion Laboral GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.informacionlaboral=informacionlaboralAux;
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
      		//this.finishProcessInformacionLaboral();
      	}
		
	}	
	
	public void actualizarRelaciones(InformacionLaboral informacionlaboralLocal) throws Exception {
		
		if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(InformacionLaboral informacionlaboralLocal) throws Exception {	
		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				informacionlaboralLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoEmpresaDetalleFormJInternalFrame.class)) {
				TipoEmpresaBeanSwingJInternalFrame tipoempresaBeanSwingJInternalFrameLocal=(TipoEmpresaBeanSwingJInternalFrame) ((TipoEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoEmpresa(tipoempresaBeanSwingJInternalFrameLocal.gettipoempresa(),true);
				tipoempresaBeanSwingJInternalFrameLocal.actualizarLista(tipoempresaBeanSwingJInternalFrameLocal.tipoempresa,this.tipoempresasForeignKey);

				tipoempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoempresaBeanSwingJInternalFrameLocal.tipoempresa);

				informacionlaboralLocal.setTipoEmpresa(tipoempresaBeanSwingJInternalFrameLocal.tipoempresa);

				this.addItemDefectoCombosForeignKeyTipoEmpresa();
				this.cargarCombosFrameTipoEmpresasForeignKey("Formulario");
				this.setActualTipoEmpresaForeignKey(tipoempresaBeanSwingJInternalFrameLocal.tipoempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRelaLaboDetalleFormJInternalFrame.class)) {
				TipoRelaLaboBeanSwingJInternalFrame tiporelalaboBeanSwingJInternalFrameLocal=(TipoRelaLaboBeanSwingJInternalFrame) ((TipoRelaLaboDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporelalaboBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRelaLabo(tiporelalaboBeanSwingJInternalFrameLocal.gettiporelalabo(),true);
				tiporelalaboBeanSwingJInternalFrameLocal.actualizarLista(tiporelalaboBeanSwingJInternalFrameLocal.tiporelalabo,this.tiporelalabosForeignKey);

				tiporelalaboBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporelalaboBeanSwingJInternalFrameLocal.tiporelalabo);

				informacionlaboralLocal.setTipoRelaLabo(tiporelalaboBeanSwingJInternalFrameLocal.tiporelalabo);

				this.addItemDefectoCombosForeignKeyTipoRelaLabo();
				this.cargarCombosFrameTipoRelaLabosForeignKey("Formulario");
				this.setActualTipoRelaLaboForeignKey(tiporelalaboBeanSwingJInternalFrameLocal.tiporelalabo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoAreaLaboDetalleFormJInternalFrame.class)) {
				TipoAreaLaboBeanSwingJInternalFrame tipoarealaboBeanSwingJInternalFrameLocal=(TipoAreaLaboBeanSwingJInternalFrame) ((TipoAreaLaboDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoarealaboBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoAreaLabo(tipoarealaboBeanSwingJInternalFrameLocal.gettipoarealabo(),true);
				tipoarealaboBeanSwingJInternalFrameLocal.actualizarLista(tipoarealaboBeanSwingJInternalFrameLocal.tipoarealabo,this.tipoarealabosForeignKey);

				tipoarealaboBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoarealaboBeanSwingJInternalFrameLocal.tipoarealabo);

				informacionlaboralLocal.setTipoAreaLabo(tipoarealaboBeanSwingJInternalFrameLocal.tipoarealabo);

				this.addItemDefectoCombosForeignKeyTipoAreaLabo();
				this.cargarCombosFrameTipoAreaLabosForeignKey("Formulario");
				this.setActualTipoAreaLaboForeignKey(tipoarealaboBeanSwingJInternalFrameLocal.tipoarealabo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCargoLaboDetalleFormJInternalFrame.class)) {
				TipoCargoLaboBeanSwingJInternalFrame tipocargolaboBeanSwingJInternalFrameLocal=(TipoCargoLaboBeanSwingJInternalFrame) ((TipoCargoLaboDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocargolaboBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCargoLabo(tipocargolaboBeanSwingJInternalFrameLocal.gettipocargolabo(),true);
				tipocargolaboBeanSwingJInternalFrameLocal.actualizarLista(tipocargolaboBeanSwingJInternalFrameLocal.tipocargolabo,this.tipocargolabosForeignKey);

				tipocargolaboBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocargolaboBeanSwingJInternalFrameLocal.tipocargolabo);

				informacionlaboralLocal.setTipoCargoLabo(tipocargolaboBeanSwingJInternalFrameLocal.tipocargolabo);

				this.addItemDefectoCombosForeignKeyTipoCargoLabo();
				this.cargarCombosFrameTipoCargoLabosForeignKey("Formulario");
				this.setActualTipoCargoLaboForeignKey(tipocargolaboBeanSwingJInternalFrameLocal.tipocargolabo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				informacionlaboralLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				informacionlaboralLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarInformacionLaboralActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = informacionlaboralValidator.getInvalidValues(this.informacionlaboral);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(InformacionLaboral informacionlaboral,List<InformacionLaboral> informacionlaborals) throws Exception {
		try	{		
			InformacionLaboralConstantesFunciones.actualizarLista(informacionlaboral,informacionlaborals,this.informacionlaboralSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(InformacionLaboral informacionlaboral,List<InformacionLaboral> informacionlaborals) throws Exception {
		try	{			
			InformacionLaboralConstantesFunciones.actualizarSelectedLista(informacionlaboral,informacionlaborals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<InformacionLaboral> informacionlaboralsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				informacionlaboralsLocal=this.informacionlaboralLogic.getInformacionLaborals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				informacionlaboralsLocal=this.informacionlaborals;
			}
			//ARCHITECTURE
		
			for(InformacionLaboral informacionlaboralLocal:informacionlaboralsLocal) {
				if(this.permiteMantenimiento(informacionlaboralLocal) && informacionlaboralLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+InformacionLaboralConstantesFunciones.getInformacionLaboralLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidclienteInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.IDTIPOEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidvalorempresaInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.IDTIPORELALABO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidvalorclienterelacionlaboralInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.IDTIPOAREALABO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidvalorclientearealaboralInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.IDTIPOCARGOLABO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidvalorclientecargolaboralInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelid_paisInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidciudadInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.TIEMPOA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltiempoaInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.TIEMPOM)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltiempomInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.NOMBREEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelnombreempresaInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeldireccionInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.NOMBREREFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelnombrereferenciaInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonoInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.TELEFONOCODIGOAREA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonocodigoareaInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.TELEFONOMOVIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonomovilInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelemailInformacionLaboral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionLaboralConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelesactivoInformacionLaboral,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidclienteInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidvalorempresaInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidvalorclienterelacionlaboralInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidvalorclientearealaboralInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidvalorclientecargolaboralInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelid_paisInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelidciudadInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltiempoaInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltiempomInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelnombreempresaInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabeldireccionInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelnombrereferenciaInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonoInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonocodigoareaInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonomovilInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelemailInformacionLaboral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionLaboral.jLabelesactivoInformacionLaboral,"");
		
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
		this.iIdNuevoInformacionLaboral--;	
		
		
		this.informacionlaboralAux=new InformacionLaboral();
		
		this.informacionlaboralAux.setId(this.iIdNuevoInformacionLaboral);
		this.informacionlaboralAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.informacionlaboralLogic.getInformacionLaborals().add(this.informacionlaboralAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.informacionlaborals.add(this.informacionlaboralAux);
		}
		//ARCHITECTURE
		
		this.informacionlaboral=this.informacionlaboralAux;
		
		if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioInformacionLaboral(this.informacionlaboral);
			this.setVariablesObjetoActualToFormularioForeignKeyInformacionLaboral(this.informacionlaboral);
		}
				
		//this.setDefaultControlesInformacionLaboral();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyInformacionLaboral();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyInformacionLaboral();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionLaboral();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInformacionLaboral(this.informacionlaboralBean,this.informacionlaboral,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(InformacionLaboralConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
			classes=InformacionLaboralConstantesFunciones.getClassesRelationshipsOfInformacionLaboral(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.informacionlaboralReturnGeneral=informacionlaboralLogic.procesarEventosInformacionLaboralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacionlaboralLogic.getInformacionLaborals(),this.informacionlaboral,this.informacionlaboralParameterGeneral,this.isEsNuevoInformacionLaboral,classes);//this.informacionlaboralLogic.getInformacionLaboral()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanInformacionLaboral(this.informacionlaboralReturnGeneral,this.informacionlaboralBean,false);
		
		if(this.informacionlaboralReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyInformacionLaboral(this.informacionlaboralReturnGeneral.getInformacionLaboral());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioInformacionLaboral(this.informacionlaboralReturnGeneral.getInformacionLaboral());
		}
		
		if(this.informacionlaboralReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioInformacionLaboral(this.informacionlaboralReturnGeneral.getInformacionLaboral(),classes);//this.informacionlaboralBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyInformacionLaboral();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyInformacionLaboral();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.RecargarFormInformacionLaboral(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingInformacionLaboral(false);
						
			if(informacionlaboralSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionLaboral();
			}
			
			this.actualizarVisualTableDatosInformacionLaboral();
			
			this.jTableDatosInformacionLaboral.setRowSelectionInterval(this.getIndiceNuevoInformacionLaboral(), this.getIndiceNuevoInformacionLaboral());
			
			this.seleccionarFilaTablaInformacionLaboralActual();
						
			this.actualizarEstadoCeldasBotonesInformacionLaboral("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesInformacionLaboral(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempoaInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activartiempoaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempomInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activartiempomInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombreempresaInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activarnombreempresaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreadireccionInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activardireccionInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombrereferenciaInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activarnombrereferenciaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonoInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activartelefonoInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtelefonocodigoareaInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activartelefonocodigoareaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonomovilInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activartelefonomovilInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreaemailInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activaremailInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activaresactivoInformacionLaboral);	
		
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activaridclienteInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activaridvalorempresaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activaridvalorclienterelacionlaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activaridvalorclientearealaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activaridvalorclientecargolaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activarid_paisInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setEnabled(isHabilitar && this.informacionlaboralConstantesFunciones.activaridciudadInformacionLaboral);
	};
	
	public void setDefaultControlesInformacionLaboral() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoInformacionLaboral(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.informacionlaboralSessionBean.setConGuardarRelaciones(true);			
			this.informacionlaboralSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.setVisible(true);
			
					
		} else {
			//this.informacionlaboralSessionBean.setConGuardarRelaciones(false);			
			this.informacionlaboralSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoInformacionLaboral() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
				if(informacionlaboralAux.getId().equals(this.iIdNuevoInformacionLaboral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionLaboral informacionlaboralAux:this.informacionlaborals) {
				if(informacionlaboralAux.getId().equals(this.iIdNuevoInformacionLaboral)) {
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
	
	public int getIndiceActualInformacionLaboral(InformacionLaboral informacionlaboral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
				if(informacionlaboralAux.getId().equals(informacionlaboral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionLaboral informacionlaboralAux:this.informacionlaborals) {
				if(informacionlaboralAux.getId().equals(informacionlaboral.getId())) {
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
	
	public void setCamposBaseDesdeOriginalInformacionLaboral(InformacionLaboral informacionlaboralOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
				if(informacionlaboralAux.getInformacionLaboralOriginal().getId().equals(informacionlaboralOriginal.getId())) {
					existe=true;
					informacionlaboralOriginal.setId(informacionlaboralAux.getId());
					informacionlaboralOriginal.setVersionRow(informacionlaboralAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionLaboral informacionlaboralAux:this.informacionlaborals) {
				if(informacionlaboralAux.getInformacionLaboralOriginal().getId().equals(informacionlaboralOriginal.getId())) {
					existe=true;
					informacionlaboralOriginal.setId(informacionlaboralAux.getId());
					informacionlaboralOriginal.setVersionRow(informacionlaboralAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosInformacionLaboral(Boolean esParaCancelar) throws Exception {
		informacionlaboralsAux=new ArrayList<InformacionLaboral>();
		informacionlaboralAux=new InformacionLaboral();
		
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
					if(informacionlaboralAux.getId()<0) {
						informacionlaboralsAux.add(informacionlaboralAux);
					}		
				}
				this.iIdNuevoInformacionLaboral=0L;
				this.informacionlaboralLogic.getInformacionLaborals().removeAll(informacionlaboralsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionLaboral informacionlaboralAux:this.informacionlaborals) {
					if(informacionlaboralAux.getId()<0) {
						informacionlaboralsAux.add(informacionlaboralAux);
					}		
				}
				this.iIdNuevoInformacionLaboral=0L;
				this.informacionlaborals.removeAll(informacionlaboralsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoInformacionLaboral 
					&& this.informacionlaboralLogic.getInformacionLaborals().size()>0
					) {
					informacionlaboralAux=this.informacionlaboralLogic.getInformacionLaborals().get(this.informacionlaboralLogic.getInformacionLaborals().size() - 1);
				
					if(informacionlaboralAux.getId()<0) {
						this.informacionlaboralLogic.getInformacionLaborals().remove(informacionlaboralAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoInformacionLaboral && this.informacionlaborals.size()>0) {
					informacionlaboralAux=this.informacionlaborals.get(this.informacionlaborals.size() - 1);
				
					if(informacionlaboralAux.getId()<0) {
						this.informacionlaborals.remove(informacionlaboralAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoInformacionLaboral(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(informacionlaboral.getId()<0) {
				this.informacionlaboralLogic.getInformacionLaborals().remove(this.informacionlaboral);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(informacionlaboral.getId()<0) {
				this.informacionlaborals.remove(this.informacionlaboral);
			}
		}			
	}
	
	public void setEstadosInicialesInformacionLaboral(List<InformacionLaboral> informacionlaboralsAux) throws Exception {
		InformacionLaboralConstantesFunciones.setEstadosInicialesInformacionLaboral(informacionlaboralsAux);
	}
	
	public void setEstadosInicialesInformacionLaboral(InformacionLaboral informacionlaboralAux) throws Exception {
		InformacionLaboralConstantesFunciones.setEstadosInicialesInformacionLaboral(informacionlaboralAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarInformacionLaboralActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesInformacionLaboral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarInformacionLaboralActual()) {
				if(!this.isEsNuevoInformacionLaboral) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesInformacionLaboral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoInformacionLaboral=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarInformacionLaboralActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Informacion Laboral ?", "MANTENIMIENTO DE Informacion Laboral", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesInformacionLaboral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(InformacionLaboral informacionlaboral) throws Exception {
		InformacionLaboralConstantesFunciones.seleccionarAsignar(this.informacionlaboral,informacionlaboral);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarInformacionLaboral=this.isPermisoActualizarOriginalInformacionLaboral;
			
			
			this.seleccionarAsignar(informacionlaboral);
			
			

			idClienteActual=informacionlaboral.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InformacionLaboralConstantesFunciones.quitarEspaciosInformacionLaboral(this.informacionlaboral,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesInformacionLaboral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.informacionlaboralSessionBean.setsFuncionBusquedaRapida(this.informacionlaboralSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoInformacionLaboral) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosInformacionLaboral(esParaCancelar);				
				this.cancelarNuevoInformacionLaboral(esParaCancelar);								
			}
			
			this.informacionlaboral=new InformacionLaboral();
			
			this.inicializarInformacionLaboral();
			
			this.actualizarEstadoCeldasBotonesInformacionLaboral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarInformacionLaboral() throws Exception {
		try {
			InformacionLaboralConstantesFunciones.inicializarInformacionLaboral(this.informacionlaboral);
			
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
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.informacionlaboralLogic.getInformacionLaborals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteInformacionLaborals(String sAccionBusqueda,List<InformacionLaboral> informacionlaboralsParaReportes) throws Exception {
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
					sPathReporteFinal="InformacionLaboral"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="InformacionLaboralMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("InformacionLaboralMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="InformacionLaboral"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Informacion Laborales");		
		parameters.put("busquedapor", InformacionLaboralConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceInformacionLaboral=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			InformacionLaboralConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			InformacionLaboralConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceInformacionLaboral=new JRBeanArrayDataSource(InformacionLaboralJInternalFrame.TraerInformacionLaboralBeans(informacionlaboralsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceInformacionLaboral);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+InformacionLaboralConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+InformacionLaboralConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(InformacionLaboralBean.TraerInformacionLaboralBeans(informacionlaboralsParaReportes).toArray()));
							
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
				this.generarExcelReporteInformacionLaborals(sAccionBusqueda,sTipoArchivoReporte,informacionlaboralsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalInformacionLaborals(sAccionBusqueda,sTipoArchivoReporte,informacionlaboralsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoInformacionLaboralActionPerformed(null);
					//this.generarExcelReporteInformacionLaborals(sAccionBusqueda,sTipoArchivoReporte,informacionlaboralsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalInformacionLaborals(sAccionBusqueda,sTipoArchivoReporte,informacionlaboralsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesInformacionLaborals(sAccionBusqueda,sTipoArchivoReporte,informacionlaboralsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesInformacionLaborals(sAccionBusqueda,sTipoArchivoReporte,informacionlaboralsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteInformacionLaborals(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionLaboral> informacionlaboralsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionlaboral";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionLaborals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInformacionLaboral("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(InformacionLaboral informacionlaboral : informacionlaboralsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			InformacionLaboralConstantesFunciones.generarExcelReporteDataInformacionLaboral("NORMAL",row,workbook,informacionlaboral,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderInformacionLaboral(String sTipo,Row row,Workbook workbook) {
		
		InformacionLaboralConstantesFunciones.generarExcelReporteHeaderInformacionLaboral(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalInformacionLaborals(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionLaboral> informacionlaboralsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionlaboral_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionLaborals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(InformacionLaboral informacionlaboral : informacionlaboralsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(InformacionLaboralConstantesFunciones.getInformacionLaboralDescripcion(informacionlaboral));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettipoempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettiporelalabo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettipoarealabo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettipocargolabo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_TIEMPOA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TIEMPOA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettiempoa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_TIEMPOM))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TIEMPOM);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettiempom());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.getnombreempresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.getnombrereferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettelefonocodigoarea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.gettelefonomovil());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionlaboral.getemail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionLaboralConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(informacionlaboral.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesInformacionLaborals(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionLaboral> informacionlaboralsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<InformacionLaboral> informacionlaboralsRespaldo=null;
		
		classes=InformacionLaboralConstantesFunciones.getClassesRelationshipsOfInformacionLaboral(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.informacionlaboralLogic.setDatosCliente(this.datosCliente);
		this.informacionlaboralLogic.setDatosDeep(this.datosDeep);
		this.informacionlaboralLogic.setIsConDeep(true);
		
		informacionlaboralsRespaldo=this.informacionlaboralLogic.getInformacionLaborals();
		
		this.informacionlaboralLogic.setInformacionLaborals(informacionlaboralsParaReportes);	
		this.informacionlaboralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		informacionlaboralsParaReportes=this.informacionlaboralLogic.getInformacionLaborals();
		this.informacionlaboralLogic.setInformacionLaborals(informacionlaboralsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionlaboral_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionLaborals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInformacionLaboral("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(InformacionLaboral informacionlaboral : informacionlaboralsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderInformacionLaboral("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			InformacionLaboralConstantesFunciones.generarExcelReporteDataInformacionLaboral("NORMAL",row,workbook,informacionlaboral,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(InformacionLaboralConstantesFunciones.getInformacionLaboralDescripcion(informacionlaboral));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionLaboral.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessInformacionLaboral() throws Exception {		
		this.startProcessInformacionLaboral(true);
	}
	
	public void startProcessInformacionLaboral(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasInformacionLaboral ,this.jPanelParametrosReportesInformacionLaboral, this.jScrollPanelDatosInformacionLaboral,this.jPanelPaginacionInformacionLaboral, this.jScrollPanelDatosEdicionInformacionLaboral, this.jPanelAccionesInformacionLaboral,this.jPanelAccionesFormularioInformacionLaboral,this.jmenuBarInformacionLaboral,this.jmenuBarDetalleInformacionLaboral,this.jTtoolBarInformacionLaboral,this.jTtoolBarDetalleInformacionLaboral);		
		
		final JTabbedPane jTabbedPaneBusquedasInformacionLaboral=this.jTabbedPaneBusquedasInformacionLaboral; 
		
		final JPanel jPanelParametrosReportesInformacionLaboral=this.jPanelParametrosReportesInformacionLaboral;
		//final JScrollPane jScrollPanelDatosInformacionLaboral=this.jScrollPanelDatosInformacionLaboral;
		final JTable jTableDatosInformacionLaboral=this.jTableDatosInformacionLaboral;		
		final JPanel jPanelPaginacionInformacionLaboral=this.jPanelPaginacionInformacionLaboral;
		//final JScrollPane jScrollPanelDatosEdicionInformacionLaboral=this.jScrollPanelDatosEdicionInformacionLaboral;
		final JPanel jPanelAccionesInformacionLaboral=this.jPanelAccionesInformacionLaboral;
		
		JPanel jPanelCamposAuxiliarInformacionLaboral=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarInformacionLaboral=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			jPanelCamposAuxiliarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jPanelCamposInformacionLaboral;
			jPanelAccionesFormularioAuxiliarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jPanelAccionesFormularioInformacionLaboral;
		}
		
		final JPanel jPanelCamposInformacionLaboral=jPanelCamposAuxiliarInformacionLaboral;
		final JPanel jPanelAccionesFormularioInformacionLaboral=jPanelAccionesFormularioAuxiliarInformacionLaboral;
		
		
		final JMenuBar jmenuBarInformacionLaboral=this.jmenuBarInformacionLaboral;
		final JToolBar jTtoolBarInformacionLaboral=this.jTtoolBarInformacionLaboral;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarInformacionLaboral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInformacionLaboral=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			jmenuBarDetalleAuxiliarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jmenuBarDetalleInformacionLaboral;
			jTtoolBarDetalleAuxiliarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jTtoolBarDetalleInformacionLaboral;
		}
		
		final JMenuBar jmenuBarDetalleInformacionLaboral=jmenuBarDetalleAuxiliarInformacionLaboral;
		final JToolBar jTtoolBarDetalleInformacionLaboral=jTtoolBarDetalleAuxiliarInformacionLaboral;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInformacionLaboral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInformacionLaboral;
			processRunnable.jTableDatos=jTableDatosInformacionLaboral;
			processRunnable.jPanelCampos=jPanelCamposInformacionLaboral;
			processRunnable.jPanelPaginacion=jPanelPaginacionInformacionLaboral;
			processRunnable.jPanelAcciones=jPanelAccionesInformacionLaboral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInformacionLaboral;
			
			
			processRunnable.jmenuBar=jmenuBarInformacionLaboral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInformacionLaboral;
			processRunnable.jTtoolBar=jTtoolBarInformacionLaboral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInformacionLaboral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInformacionLaboral ,jPanelParametrosReportesInformacionLaboral,jTableDatosInformacionLaboral, /*jScrollPanelDatosInformacionLaboral,*/jPanelCamposInformacionLaboral,jPanelPaginacionInformacionLaboral, /*jScrollPanelDatosEdicionInformacionLaboral,*/ jPanelAccionesInformacionLaboral,jPanelAccionesFormularioInformacionLaboral,jmenuBarInformacionLaboral,jmenuBarDetalleInformacionLaboral,jTtoolBarInformacionLaboral,jTtoolBarDetalleInformacionLaboral);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInformacionLaboral ,jPanelParametrosReportesInformacionLaboral, jScrollPanelDatosInformacionLaboral,jPanelPaginacionInformacionLaboral, jScrollPanelDatosEdicionInformacionLaboral, jPanelAccionesInformacionLaboral,jPanelAccionesFormularioInformacionLaboral,jmenuBarInformacionLaboral,jmenuBarDetalleInformacionLaboral,jTtoolBarInformacionLaboral,jTtoolBarDetalleInformacionLaboral);
						
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
	
	public void finishProcessInformacionLaboral() {// throws Exception 
		this.finishProcessInformacionLaboral(true);
	}
	
	public void finishProcessInformacionLaboral(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasInformacionLaboral ,this.jPanelParametrosReportesInformacionLaboral, this.jScrollPanelDatosInformacionLaboral,this.jPanelPaginacionInformacionLaboral, this.jScrollPanelDatosEdicionInformacionLaboral, this.jPanelAccionesInformacionLaboral,this.jPanelAccionesFormularioInformacionLaboral,this.jmenuBarInformacionLaboral,this.jmenuBarDetalleInformacionLaboral,this.jTtoolBarInformacionLaboral,this.jTtoolBarDetalleInformacionLaboral);		
		
		final JTabbedPane jTabbedPaneBusquedasInformacionLaboral=this.jTabbedPaneBusquedasInformacionLaboral; 
		
		final JPanel jPanelParametrosReportesInformacionLaboral=this.jPanelParametrosReportesInformacionLaboral;
		//final JScrollPane jScrollPanelDatosInformacionLaboral=this.jScrollPanelDatosInformacionLaboral;
		final JTable jTableDatosInformacionLaboral=this.jTableDatosInformacionLaboral;		
		final JPanel jPanelPaginacionInformacionLaboral=this.jPanelPaginacionInformacionLaboral;
		//final JScrollPane jScrollPanelDatosEdicionInformacionLaboral=this.jScrollPanelDatosEdicionInformacionLaboral;
		final JPanel jPanelAccionesInformacionLaboral=this.jPanelAccionesInformacionLaboral;
		
		JPanel jPanelCamposAuxiliarInformacionLaboral=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarInformacionLaboral=new JPanel();
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			jPanelCamposAuxiliarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jPanelCamposInformacionLaboral;
			jPanelAccionesFormularioAuxiliarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jPanelAccionesFormularioInformacionLaboral;
		}
		
		final JPanel jPanelCamposInformacionLaboral=jPanelCamposAuxiliarInformacionLaboral;
		final JPanel jPanelAccionesFormularioInformacionLaboral=jPanelAccionesFormularioAuxiliarInformacionLaboral;
		
		
		final JMenuBar jmenuBarInformacionLaboral=this.jmenuBarInformacionLaboral;		
		final JToolBar jTtoolBarInformacionLaboral=this.jTtoolBarInformacionLaboral;
				
		JMenuBar jmenuBarDetalleAuxiliarInformacionLaboral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInformacionLaboral=new JToolBar();
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			jmenuBarDetalleAuxiliarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jmenuBarDetalleInformacionLaboral;
			jTtoolBarDetalleAuxiliarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jTtoolBarDetalleInformacionLaboral;		
		}
		
		final JMenuBar jmenuBarDetalleInformacionLaboral=jmenuBarDetalleAuxiliarInformacionLaboral;
		final JToolBar jTtoolBarDetalleInformacionLaboral=jTtoolBarDetalleAuxiliarInformacionLaboral;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInformacionLaboral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInformacionLaboral;
			processRunnable.jTableDatos=jTableDatosInformacionLaboral;
			processRunnable.jPanelCampos=jPanelCamposInformacionLaboral;
			processRunnable.jPanelPaginacion=jPanelPaginacionInformacionLaboral;
			processRunnable.jPanelAcciones=jPanelAccionesInformacionLaboral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInformacionLaboral;
			
			
			processRunnable.jmenuBar=jmenuBarInformacionLaboral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInformacionLaboral;
			processRunnable.jTtoolBar=jTtoolBarInformacionLaboral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInformacionLaboral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasInformacionLaboral ,jPanelParametrosReportesInformacionLaboral, jTableDatosInformacionLaboral,/*jScrollPanelDatosInformacionLaboral,*/jPanelCamposInformacionLaboral,jPanelPaginacionInformacionLaboral, /*jScrollPanelDatosEdicionInformacionLaboral,*/ jPanelAccionesInformacionLaboral,jPanelAccionesFormularioInformacionLaboral,jmenuBarInformacionLaboral,jmenuBarDetalleInformacionLaboral,jTtoolBarInformacionLaboral,jTtoolBarDetalleInformacionLaboral));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesInformacionLaboral(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarInformacionLaboral(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuInformacionLaboral(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarInformacionLaboral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarInformacionLaboral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleInformacionLaboral,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuInformacionLaboral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarInformacionLaboral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleInformacionLaboral,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.informacionlaboralConstantesFunciones.getsFinalQueryInformacionLaboral();
		String  finalQueryPaginacionTodos=this.informacionlaboralConstantesFunciones.getsFinalQueryInformacionLaboral();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=InformacionLaboralConstantesFunciones.getArrayColumnasGlobalesNoInformacionLaboral(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=InformacionLaboralConstantesFunciones.getArrayColumnasGlobalesInformacionLaboral(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,InformacionLaboralConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.informacionlaboralsEliminados= new ArrayList<InformacionLaboral>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessInformacionLaboral();
		
				///*InformacionLaboralSessionBean*/this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			
			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
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
					this.iNumeroPaginacion=InformacionLaboralConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=InformacionLaboralConstantesFunciones.getClassesForeignKeysOfInformacionLaboral(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/informacionlaboral."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			informacionlaboralsAux= new ArrayList<InformacionLaboral>();
			
				
			informacionlaboralLogic.setDatosCliente(this.datosCliente);
			informacionlaboralLogic.setDatosDeep(this.datosDeep);
			informacionlaboralLogic.setIsConDeep(true);
			
			
			informacionlaboralLogic.getInformacionLaboralDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					informacionlaboralLogic.getTodosInformacionLaborals(finalQueryGlobal,pagination);
					
					//informacionlaboralLogic.getTodosInformacionLaboralsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(informacionlaboralLogic.getInformacionLaborals()==null|| informacionlaboralLogic.getInformacionLaborals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacionlaboralsAux= new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaboralLogic.getInformacionLaborals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralsAux= new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaborals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacionlaboralLogic.getTodosInformacionLaborals(finalQueryGlobal+"",this.pagination);												
							
							//informacionlaboralLogic.getTodosInformacionLaboralsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteInformacionLaborals("Todos",informacionlaboralLogic.getInformacionLaborals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());					
							informacionlaboralLogic.getInformacionLaborals().addAll(informacionlaboralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaborals=new ArrayList<InformacionLaboral>();
							informacionlaborals.addAll(informacionlaboralsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idInformacionLaboral=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idInformacionLaboral=this.idActual;
				
				} else if(this.idInformacionLaboralActual!=null && this.idInformacionLaboralActual!=0L) {
					idInformacionLaboral=idInformacionLaboralActual;
				}
				
					
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndicePorId(idInformacionLaboral);
				
				this.informacionlaborals=new ArrayList<InformacionLaboral>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					informacionlaboralLogic.getEntity(idInformacionLaboral);
					
					//informacionlaboralLogic.getEntityWithConnection(idInformacionLaboral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
					informacionlaboralLogic.getInformacionLaborals().add(informacionlaboralLogic.getInformacionLaboral());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaborals=new ArrayList<InformacionLaboral>();
					this.informacionlaborals.add(informacionlaboral);
				}
				
				if(informacionlaboralLogic.getInformacionLaboral()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionlaboralLogic.getInformacionLaboralsFK_IdCiudad(finalQueryGlobal,pagination,idciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionlaboralLogic.getInformacionLaborals()==null||informacionlaboralLogic.getInformacionLaborals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionlaborals==null|| informacionlaborals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralsAux=new ArrayList<InformacionLaboral>();
						informacionlaboralsAux.addAll(informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralsAux=new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaborals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionlaboralLogic.getInformacionLaboralsFK_IdCiudad(finalQueryGlobal,pagination,idciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionLaborals("FK_IdCiudad",informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionLaborals("FK_IdCiudad",informacionlaborals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
						informacionlaboralLogic.getInformacionLaborals().addAll(informacionlaboralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaborals=new ArrayList<InformacionLaboral>();
							informacionlaborals.addAll(informacionlaboralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionlaboralLogic.getInformacionLaboralsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionlaboralLogic.getInformacionLaborals()==null||informacionlaboralLogic.getInformacionLaborals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionlaborals==null|| informacionlaborals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralsAux=new ArrayList<InformacionLaboral>();
						informacionlaboralsAux.addAll(informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralsAux=new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaborals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionlaboralLogic.getInformacionLaboralsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionLaborals("FK_IdCliente",informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionLaborals("FK_IdCliente",informacionlaborals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
						informacionlaboralLogic.getInformacionLaborals().addAll(informacionlaboralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaborals=new ArrayList<InformacionLaboral>();
							informacionlaborals.addAll(informacionlaboralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionlaboralLogic.getInformacionLaboralsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionlaboralLogic.getInformacionLaborals()==null||informacionlaboralLogic.getInformacionLaborals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionlaborals==null|| informacionlaborals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralsAux=new ArrayList<InformacionLaboral>();
						informacionlaboralsAux.addAll(informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralsAux=new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaborals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionlaboralLogic.getInformacionLaboralsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionLaborals("FK_IdPais",informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionLaborals("FK_IdPais",informacionlaborals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
						informacionlaboralLogic.getInformacionLaborals().addAll(informacionlaboralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaborals=new ArrayList<InformacionLaboral>();
							informacionlaborals.addAll(informacionlaboralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoEmpresa")) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(idvalorempresaFK_IdTipoEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionlaboralLogic.getInformacionLaboralsFK_IdTipoEmpresa(finalQueryGlobal,pagination,idvalorempresaFK_IdTipoEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(idvalorempresaFK_IdTipoEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(idvalorempresaFK_IdTipoEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionlaboralLogic.getInformacionLaborals()==null||informacionlaboralLogic.getInformacionLaborals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionlaborals==null|| informacionlaborals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralsAux=new ArrayList<InformacionLaboral>();
						informacionlaboralsAux.addAll(informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralsAux=new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaborals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionlaboralLogic.getInformacionLaboralsFK_IdTipoEmpresa(finalQueryGlobal,pagination,idvalorempresaFK_IdTipoEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(idvalorempresaFK_IdTipoEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(idvalorempresaFK_IdTipoEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionLaborals("FK_IdTipoEmpresa",informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionLaborals("FK_IdTipoEmpresa",informacionlaborals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
						informacionlaboralLogic.getInformacionLaborals().addAll(informacionlaboralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaborals=new ArrayList<InformacionLaboral>();
							informacionlaborals.addAll(informacionlaboralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteAreaLaboral")) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteAreaLaboral(idvalorclientearealaboralFK_IdValorClienteAreaLaboral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteAreaLaboral(finalQueryGlobal,pagination,idvalorclientearealaboralFK_IdValorClienteAreaLaboral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteAreaLaboral(idvalorclientearealaboralFK_IdValorClienteAreaLaboral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteAreaLaboral(idvalorclientearealaboralFK_IdValorClienteAreaLaboral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionlaboralLogic.getInformacionLaborals()==null||informacionlaboralLogic.getInformacionLaborals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionlaborals==null|| informacionlaborals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralsAux=new ArrayList<InformacionLaboral>();
						informacionlaboralsAux.addAll(informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralsAux=new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaborals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteAreaLaboral(finalQueryGlobal,pagination,idvalorclientearealaboralFK_IdValorClienteAreaLaboral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteAreaLaboral(idvalorclientearealaboralFK_IdValorClienteAreaLaboral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteAreaLaboral(idvalorclientearealaboralFK_IdValorClienteAreaLaboral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionLaborals("FK_IdValorClienteAreaLaboral",informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionLaborals("FK_IdValorClienteAreaLaboral",informacionlaborals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
						informacionlaboralLogic.getInformacionLaborals().addAll(informacionlaboralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaborals=new ArrayList<InformacionLaboral>();
							informacionlaborals.addAll(informacionlaboralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteCargoLaboral")) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteCargoLaboral(idvalorclientecargolaboralFK_IdValorClienteCargoLaboral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteCargoLaboral(finalQueryGlobal,pagination,idvalorclientecargolaboralFK_IdValorClienteCargoLaboral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteCargoLaboral(idvalorclientecargolaboralFK_IdValorClienteCargoLaboral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteCargoLaboral(idvalorclientecargolaboralFK_IdValorClienteCargoLaboral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionlaboralLogic.getInformacionLaborals()==null||informacionlaboralLogic.getInformacionLaborals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionlaborals==null|| informacionlaborals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralsAux=new ArrayList<InformacionLaboral>();
						informacionlaboralsAux.addAll(informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralsAux=new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaborals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteCargoLaboral(finalQueryGlobal,pagination,idvalorclientecargolaboralFK_IdValorClienteCargoLaboral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteCargoLaboral(idvalorclientecargolaboralFK_IdValorClienteCargoLaboral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteCargoLaboral(idvalorclientecargolaboralFK_IdValorClienteCargoLaboral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionLaborals("FK_IdValorClienteCargoLaboral",informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionLaborals("FK_IdValorClienteCargoLaboral",informacionlaborals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
						informacionlaboralLogic.getInformacionLaborals().addAll(informacionlaboralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaborals=new ArrayList<InformacionLaboral>();
							informacionlaborals.addAll(informacionlaboralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteRelacionLaboral")) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteRelacionLaboral(idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteRelacionLaboral(finalQueryGlobal,pagination,idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteRelacionLaboral(idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteRelacionLaboral(idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionlaboralLogic.getInformacionLaborals()==null||informacionlaboralLogic.getInformacionLaborals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionlaborals==null|| informacionlaborals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralsAux=new ArrayList<InformacionLaboral>();
						informacionlaboralsAux.addAll(informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralsAux=new ArrayList<InformacionLaboral>();
							informacionlaboralsAux.addAll(informacionlaborals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteRelacionLaboral(finalQueryGlobal,pagination,idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteRelacionLaboral(idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionLaboralConstantesFunciones.getDetalleIndiceFK_IdValorClienteRelacionLaboral(idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionLaborals("FK_IdValorClienteRelacionLaboral",informacionlaboralLogic.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionLaborals("FK_IdValorClienteRelacionLaboral",informacionlaborals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
						informacionlaboralLogic.getInformacionLaborals().addAll(informacionlaboralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaborals=new ArrayList<InformacionLaboral>();
							informacionlaborals.addAll(informacionlaboralsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesInformacionLaboral();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessInformacionLaboral();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=informacionlaboralLogic.getInformacionLaborals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacionlaborals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=informacionlaboralLogic.getInformacionLaborals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacionlaborals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(InformacionLaboral informacionlaboral) {
		Boolean permite=true;
		
		if(this.informacionlaboral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=InformacionLaboralConstantesFunciones.getOrderByListaInformacionLaboral();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=InformacionLaboralConstantesFunciones.getOrderByListaInformacionLaboral();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionLaboral informacionlaboral:informacionlaboralLogic.getInformacionLaborals()) {
				if(informacionlaboral.getsType().equals(Constantes2.S_TOTALES)) {
					informacionlaboralTotales=informacionlaboral;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionLaboral informacionlaboral:this.informacionlaborals) {
				if(informacionlaboral.getsType().equals(Constantes2.S_TOTALES)) {
					informacionlaboralTotales=informacionlaboral;
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
			this.informacionlaboralAux=new InformacionLaboral();
			this.informacionlaboralAux.setsType(Constantes2.S_TOTALES);
			this.informacionlaboralAux.setIsNew(false);
			this.informacionlaboralAux.setIsChanged(false);
			this.informacionlaboralAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				InformacionLaboralConstantesFunciones.TotalizarValoresFilaInformacionLaboral(this.informacionlaboralLogic.getInformacionLaborals(),this.informacionlaboralAux);
				
				this.informacionlaboralLogic.getInformacionLaborals().add(this.informacionlaboralAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				InformacionLaboralConstantesFunciones.TotalizarValoresFilaInformacionLaboral(this.informacionlaborals,this.informacionlaboralAux);
				
				this.informacionlaborals.add(this.informacionlaboralAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		informacionlaboralTotales=new InformacionLaboral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.informacionlaboralLogic.getInformacionLaborals().remove(informacionlaboralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.informacionlaborals.remove(informacionlaboralTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		informacionlaboralTotales=new InformacionLaboral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionLaboral informacionlaboral:informacionlaboralLogic.getInformacionLaborals()) {
				if(informacionlaboral.getsType().equals(Constantes2.S_TOTALES)) {
					informacionlaboralTotales=informacionlaboral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InformacionLaboralConstantesFunciones.TotalizarValoresFilaInformacionLaboral(this.informacionlaboralLogic.getInformacionLaborals(),informacionlaboralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionLaboral informacionlaboral:this.informacionlaborals) {
				if(informacionlaboral.getsType().equals(Constantes2.S_TOTALES)) {
					informacionlaboralTotales=informacionlaboral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InformacionLaboralConstantesFunciones.TotalizarValoresFilaInformacionLaboral(this.informacionlaborals,informacionlaboralTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getInformacionLaboralsFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionLaboralsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionLaboralsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionLaboralsFK_IdTipoEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionLaboralsFK_IdValorClienteAreaLaboral()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteAreaLaboral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionLaboralsFK_IdValorClienteCargoLaboral()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteCargoLaboral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionLaboralsFK_IdValorClienteRelacionLaboral()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteRelacionLaboral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getInformacionLaboralsFK_IdCiudad(String sFinalQuery,Long idciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLogic.getInformacionLaboralsFK_IdCiudad(sFinalQuery,this.pagination,idciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionLaboralsFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLogic.getInformacionLaboralsFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionLaboralsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLogic.getInformacionLaboralsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionLaboralsFK_IdTipoEmpresa(String sFinalQuery,Long idvalorempresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLogic.getInformacionLaboralsFK_IdTipoEmpresa(sFinalQuery,this.pagination,idvalorempresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionLaboralsFK_IdValorClienteAreaLaboral(String sFinalQuery,Long idvalorclientearealaboral)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteAreaLaboral(sFinalQuery,this.pagination,idvalorclientearealaboral);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionLaboralsFK_IdValorClienteCargoLaboral(String sFinalQuery,Long idvalorclientecargolaboral)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteCargoLaboral(sFinalQuery,this.pagination,idvalorclientecargolaboral);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionLaboralsFK_IdValorClienteRelacionLaboral(String sFinalQuery,Long idvalorclienterelacionlaboral)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLogic.getInformacionLaboralsFK_IdValorClienteRelacionLaboral(sFinalQuery,this.pagination,idvalorclienterelacionlaboral);
				
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
	
	public void inicializarPermisosInformacionLaboral() {
		this.isPermisoTodoInformacionLaboral=false;
		this.isPermisoNuevoInformacionLaboral=false;
		this.isPermisoActualizarInformacionLaboral=false;
		this.isPermisoActualizarOriginalInformacionLaboral=false;
		this.isPermisoEliminarInformacionLaboral=false;
		this.isPermisoGuardarCambiosInformacionLaboral=false;
		this.isPermisoConsultaInformacionLaboral=false;
		this.isPermisoBusquedaInformacionLaboral=false;
		this.isPermisoReporteInformacionLaboral=false;		
		this.isPermisoOrdenInformacionLaboral=false;		
		this.isPermisoPaginacionMedioInformacionLaboral=false;		
		this.isPermisoPaginacionAltoInformacionLaboral=false;
		this.isPermisoPaginacionTodoInformacionLaboral=false;
		this.isPermisoCopiarInformacionLaboral=false;		
		this.isPermisoVerFormInformacionLaboral=false;		
		this.isPermisoDuplicarInformacionLaboral=false;		
		this.isPermisoOrdenInformacionLaboral=false;		
	}
	
	public void setPermisosUsuarioInformacionLaboral(Boolean isPermiso) {
		this.isPermisoTodoInformacionLaboral=isPermiso;
		this.isPermisoNuevoInformacionLaboral=isPermiso;
		this.isPermisoActualizarInformacionLaboral=isPermiso;
		this.isPermisoActualizarOriginalInformacionLaboral=isPermiso;
		this.isPermisoEliminarInformacionLaboral=isPermiso;
		this.isPermisoGuardarCambiosInformacionLaboral=isPermiso;
		this.isPermisoConsultaInformacionLaboral=isPermiso;
		this.isPermisoBusquedaInformacionLaboral=isPermiso;
		this.isPermisoReporteInformacionLaboral=isPermiso;
		this.isPermisoOrdenInformacionLaboral=isPermiso;		
		this.isPermisoPaginacionMedioInformacionLaboral=isPermiso;		
		this.isPermisoPaginacionAltoInformacionLaboral=isPermiso;		
		this.isPermisoPaginacionTodoInformacionLaboral=isPermiso;		
		this.isPermisoCopiarInformacionLaboral=isPermiso;		
		this.isPermisoVerFormInformacionLaboral=isPermiso;		
		this.isPermisoDuplicarInformacionLaboral=isPermiso;
		this.isPermisoOrdenInformacionLaboral=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioInformacionLaboral(Boolean isPermiso) {
		//this.isPermisoTodoInformacionLaboral=isPermiso;
		this.isPermisoNuevoInformacionLaboral=isPermiso;
		this.isPermisoActualizarInformacionLaboral=isPermiso;
		this.isPermisoActualizarOriginalInformacionLaboral=isPermiso;
		this.isPermisoEliminarInformacionLaboral=isPermiso;
		this.isPermisoGuardarCambiosInformacionLaboral=isPermiso;
		//this.isPermisoConsultaInformacionLaboral=isPermiso;
		//this.isPermisoBusquedaInformacionLaboral=isPermiso;
		//this.isPermisoReporteInformacionLaboral=isPermiso;
		//this.isPermisoOrdenInformacionLaboral=isPermiso;		
		//this.isPermisoPaginacionMedioInformacionLaboral=isPermiso;		
		//this.isPermisoPaginacionAltoInformacionLaboral=isPermiso;		
		//this.isPermisoPaginacionTodoInformacionLaboral=isPermiso;		
		//this.isPermisoCopiarInformacionLaboral=isPermiso;		
		//this.isPermisoDuplicarInformacionLaboral=isPermiso;
		//this.isPermisoOrdenInformacionLaboral=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioInformacionLaboralClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(InformacionLaboralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebInformacionLaboral(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioInformacionLaboralClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioInformacionLaboralClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionInformacionLaboralClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioInformacionLaboralClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioInformacionLaboral() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(InformacionLaboralJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, InformacionLaboralConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoInformacionLaboral=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarInformacionLaboral=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalInformacionLaboral=this.isPermisoActualizarInformacionLaboral;
			this.isPermisoEliminarInformacionLaboral=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosInformacionLaboral=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaInformacionLaboral=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaInformacionLaboral=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoInformacionLaboral=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteInformacionLaboral=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInformacionLaboral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioInformacionLaboral=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoInformacionLaboral=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoInformacionLaboral=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarInformacionLaboral=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormInformacionLaboral=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarInformacionLaboral=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInformacionLaboral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosInformacionLaboral.setToolTipText(this.jTableDatosInformacionLaboral.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioInformacionLaboral(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioInformacionLaboral(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(InformacionLaboralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(InformacionLaboralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioInformacionLaboral() throws Exception {
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
	public void inicializarCombosForeignKeyInformacionLaboralListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.tipoempresasForeignKey=new ArrayList();
				this.tiporelalabosForeignKey=new ArrayList();
				this.tipoarealabosForeignKey=new ArrayList();
				this.tipocargolabosForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyInformacionLaboralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(InformacionLaboralJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyInformacionLaboralListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRelaLaboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoAreaLaboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCargoLaboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoempresasForeignKey==null||this.tipoempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRelaLaboListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporelalabosForeignKey==null||this.tiporelalabosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRelaLaboConstantesFunciones.getArrayColumnasGlobalesTipoRelaLabo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRelaLaboConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRelaLaboConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRelaLabosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoAreaLaboListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoarealabosForeignKey==null||this.tipoarealabosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoAreaLaboConstantesFunciones.getArrayColumnasGlobalesTipoAreaLabo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAreaLaboConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoAreaLaboConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoAreaLabosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCargoLaboListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocargolabosForeignKey==null||this.tipocargolabosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCargoLaboConstantesFunciones.getArrayColumnasGlobalesTipoCargoLabo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCargoLaboConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCargoLaboConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCargoLabosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyInformacionLaboralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			InformacionLaboralParameterReturnGeneral informacionlaboralReturnGeneral=new InformacionLaboralParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.informacionlaboralConstantesFunciones.cargaridclienteInformacionLaboral)
					 || (this.esRecargarFks && this.informacionlaboralConstantesFunciones.cargaridclienteInformacionLaboral)) {

					if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+informacionlaboralSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoEmpresa="";

				if(((this.tipoempresasForeignKey==null||this.tipoempresasForeignKey.size()<=0) && this.informacionlaboralConstantesFunciones.cargaridvalorempresaInformacionLaboral)
					 || (this.esRecargarFks && this.informacionlaboralConstantesFunciones.cargaridvalorempresaInformacionLaboral)) {

					if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoEmpresa, "");
						finalQueryGlobalTipoEmpresa+=TipoEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoEmpresa=" WHERE " + ConstantesSql.ID + "="+informacionlaboralSessionBean.getlidTipoEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoEmpresa="NONE";
				}


				String finalQueryGlobalTipoRelaLabo="";

				if(((this.tiporelalabosForeignKey==null||this.tiporelalabosForeignKey.size()<=0) && this.informacionlaboralConstantesFunciones.cargaridvalorclienterelacionlaboralInformacionLaboral)
					 || (this.esRecargarFks && this.informacionlaboralConstantesFunciones.cargaridvalorclienterelacionlaboralInformacionLaboral)) {

					if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoRelaLabo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRelaLaboConstantesFunciones.getArrayColumnasGlobalesTipoRelaLabo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRelaLabo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRelaLaboConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRelaLabo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRelaLabo, "");
						finalQueryGlobalTipoRelaLabo+=TipoRelaLaboConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRelaLabosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRelaLabo=" WHERE " + ConstantesSql.ID + "="+informacionlaboralSessionBean.getlidTipoRelaLaboActual();
					}
				} else {
					finalQueryGlobalTipoRelaLabo="NONE";
				}


				String finalQueryGlobalTipoAreaLabo="";

				if(((this.tipoarealabosForeignKey==null||this.tipoarealabosForeignKey.size()<=0) && this.informacionlaboralConstantesFunciones.cargaridvalorclientearealaboralInformacionLaboral)
					 || (this.esRecargarFks && this.informacionlaboralConstantesFunciones.cargaridvalorclientearealaboralInformacionLaboral)) {

					if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaLabo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoAreaLaboConstantesFunciones.getArrayColumnasGlobalesTipoAreaLabo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoAreaLabo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAreaLaboConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoAreaLabo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoAreaLabo, "");
						finalQueryGlobalTipoAreaLabo+=TipoAreaLaboConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoAreaLabosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoAreaLabo=" WHERE " + ConstantesSql.ID + "="+informacionlaboralSessionBean.getlidTipoAreaLaboActual();
					}
				} else {
					finalQueryGlobalTipoAreaLabo="NONE";
				}


				String finalQueryGlobalTipoCargoLabo="";

				if(((this.tipocargolabosForeignKey==null||this.tipocargolabosForeignKey.size()<=0) && this.informacionlaboralConstantesFunciones.cargaridvalorclientecargolaboralInformacionLaboral)
					 || (this.esRecargarFks && this.informacionlaboralConstantesFunciones.cargaridvalorclientecargolaboralInformacionLaboral)) {

					if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargoLabo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCargoLaboConstantesFunciones.getArrayColumnasGlobalesTipoCargoLabo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCargoLabo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCargoLaboConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCargoLabo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCargoLabo, "");
						finalQueryGlobalTipoCargoLabo+=TipoCargoLaboConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCargoLabosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCargoLabo=" WHERE " + ConstantesSql.ID + "="+informacionlaboralSessionBean.getlidTipoCargoLaboActual();
					}
				} else {
					finalQueryGlobalTipoCargoLabo="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.informacionlaboralConstantesFunciones.cargarid_paisInformacionLaboral)
					 || (this.esRecargarFks && this.informacionlaboralConstantesFunciones.cargarid_paisInformacionLaboral)) {

					if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+informacionlaboralSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.informacionlaboralConstantesFunciones.cargaridciudadInformacionLaboral)
					 || (this.esRecargarFks && this.informacionlaboralConstantesFunciones.cargaridciudadInformacionLaboral)) {

					if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+informacionlaboralSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				informacionlaboralReturnGeneral=informacionlaboralLogic.cargarCombosLoteForeignKeyInformacionLaboral(finalQueryGlobalCliente,finalQueryGlobalTipoEmpresa,finalQueryGlobalTipoRelaLabo,finalQueryGlobalTipoAreaLabo,finalQueryGlobalTipoCargoLabo,finalQueryGlobalPais,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=informacionlaboralReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoEmpresa.equals("NONE")) {
				this.tipoempresasForeignKey=informacionlaboralReturnGeneral.gettipoempresasForeignKey();
			}

			if(!finalQueryGlobalTipoRelaLabo.equals("NONE")) {
				this.tiporelalabosForeignKey=informacionlaboralReturnGeneral.gettiporelalabosForeignKey();
			}

			if(!finalQueryGlobalTipoAreaLabo.equals("NONE")) {
				this.tipoarealabosForeignKey=informacionlaboralReturnGeneral.gettipoarealabosForeignKey();
			}

			if(!finalQueryGlobalTipoCargoLabo.equals("NONE")) {
				this.tipocargolabosForeignKey=informacionlaboralReturnGeneral.gettipocargolabosForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=informacionlaboralReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=informacionlaboralReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyInformacionLaboral()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoEmpresa();
			this.addItemDefectoCombosForeignKeyTipoRelaLabo();
			this.addItemDefectoCombosForeignKeyTipoAreaLabo();
			this.addItemDefectoCombosForeignKeyTipoCargoLabo();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.informacionlaboralSessionBean==null) {
				this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoEmpresa()throws Exception {
		try {

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoEmpresa()) {
				TipoEmpresa tipoempresa=new TipoEmpresa();
				TipoEmpresaConstantesFunciones.setTipoEmpresaDescripcion(tipoempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoempresa.setId(null);

				if(!TipoEmpresaConstantesFunciones.ExisteEnLista(this.tipoempresasForeignKey,tipoempresa,true)) {

					this.tipoempresasForeignKey.add(0,tipoempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRelaLabo()throws Exception {
		try {

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoRelaLabo()) {
				TipoRelaLabo tiporelalabo=new TipoRelaLabo();
				TipoRelaLaboConstantesFunciones.setTipoRelaLaboDescripcion(tiporelalabo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporelalabo.setId(null);

				if(!TipoRelaLaboConstantesFunciones.ExisteEnLista(this.tiporelalabosForeignKey,tiporelalabo,true)) {

					this.tiporelalabosForeignKey.add(0,tiporelalabo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoAreaLabo()throws Exception {
		try {

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaLabo()) {
				TipoAreaLabo tipoarealabo=new TipoAreaLabo();
				TipoAreaLaboConstantesFunciones.setTipoAreaLaboDescripcion(tipoarealabo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoarealabo.setId(null);

				if(!TipoAreaLaboConstantesFunciones.ExisteEnLista(this.tipoarealabosForeignKey,tipoarealabo,true)) {

					this.tipoarealabosForeignKey.add(0,tipoarealabo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoCargoLabo()throws Exception {
		try {

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargoLabo()) {
				TipoCargoLabo tipocargolabo=new TipoCargoLabo();
				TipoCargoLaboConstantesFunciones.setTipoCargoLaboDescripcion(tipocargolabo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocargolabo.setId(null);

				if(!TipoCargoLaboConstantesFunciones.ExisteEnLista(this.tipocargolabosForeignKey,tipocargolabo,true)) {

					this.tipocargolabosForeignKey.add(0,tipocargolabo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.informacionlaboralSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
	
	public void initActionsCombosTodosForeignKeyInformacionLaboral()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyInformacionLaboral(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyPais(JComboBox jComboBoxPaisGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Pais paisLocal=(Pais)jComboBoxPaisGenerico.getSelectedItem();

			if(paisLocal!=null  && paisLocal.getId()!=null  && paisLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_pais="+paisLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboCiudad=sFinalQueryCombo;

			this.ciudadsForeignKey=new ArrayList<Ciudad>();
			this.cargarCombosForeignKeyCiudad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.addItemListener(new ComboBoxItemListener(this,"id_paisInformacionLaboral"));
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.addFocusListener(new ComboBoxFocusListener(this,"id_paisInformacionLaboral"));
					}
				} else {
					if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.addActionListener(new ComboBoxActionListener(this,"id_paisInformacionLaboral"));
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.addFocusListener(new ComboBoxFocusListener(this,"id_paisInformacionLaboral"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisInformacionLaboral.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisInformacionLaboral"));

						this.jComboBoxid_paisFK_IdPaisInformacionLaboral.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisInformacionLaboral"));

					} else {
						this.jComboBoxid_paisFK_IdPaisInformacionLaboral.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisInformacionLaboral"));

						this.jComboBoxid_paisFK_IdPaisInformacionLaboral.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisInformacionLaboral"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyInformacionLaboral()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionLaboral();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyInformacionLaboral(InformacionLaboral informacionlaboral)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(informacionlaboral.getidcliente(),false,"Formulario");
			this.setActualTipoEmpresaForeignKey(informacionlaboral.getidvalorempresa(),false,"Formulario");
			this.setActualTipoRelaLaboForeignKey(informacionlaboral.getidvalorclienterelacionlaboral(),false,"Formulario");
			this.setActualTipoAreaLaboForeignKey(informacionlaboral.getidvalorclientearealaboral(),false,"Formulario");
			this.setActualTipoCargoLaboForeignKey(informacionlaboral.getidvalorclientecargolaboral(),false,"Formulario");
			this.setActualPaisForeignKey(informacionlaboral.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(informacionlaboral.getidciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyInformacionLaboral(InformacionLaboral informacionlaboral,String sTipoEvento)throws Exception {	
		try {
			
			

				if(informacionlaboral.getCliente()!=null && !sTipoEvento.equals("idclienteInformacionLaboral")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(informacionlaboral.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyInformacionLaboral()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.informacionlaboralConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualTipoEmpresaForeignKey(this.informacionlaboralConstantesFunciones.getidvalorempresa(),false,"Formulario");
			this.setActualTipoRelaLaboForeignKey(this.informacionlaboralConstantesFunciones.getidvalorclienterelacionlaboral(),false,"Formulario");
			this.setActualTipoAreaLaboForeignKey(this.informacionlaboralConstantesFunciones.getidvalorclientearealaboral(),false,"Formulario");
			this.setActualTipoCargoLaboForeignKey(this.informacionlaboralConstantesFunciones.getidvalorclientecargolaboral(),false,"Formulario");
			this.setActualPaisForeignKey(this.informacionlaboralConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.informacionlaboralConstantesFunciones.getidciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionLaboral()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyInformacionLaboral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyInformacionLaboral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroInformacionLaboral()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyInformacionLaboral()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoRelaLabosForeignKey("Todos");
			this.cargarCombosFrameTipoAreaLabosForeignKey("Todos");
			this.cargarCombosFrameTipoCargoLabosForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyInformacionLaboral(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRelaLabosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoAreaLabosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCargoLabosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyInformacionLaboral()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	











	public void recargarFormInformacionLaboralPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormInformacionLaboralidciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}


	
	



	public void recargarFormInformacionLaboralidciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.informacionlaboral,jComboBoxGenericoCiudad);
			}

			if(this.informacionlaboral.getid_pais()!=null && this.informacionlaboral.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.informacionlaboral.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.informacionlaboral.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public InformacionLaboralBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public InformacionLaboralBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public InformacionLaboralBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.informacionlaboralSessionBean=new InformacionLaboralSessionBean(); 
		this.informacionlaboralConstantesFunciones=new InformacionLaboralConstantesFunciones(); 
		this.informacionlaboralBean=new InformacionLaboral();//(this.informacionlaboralConstantesFunciones); 		
		this.informacionlaboralReturnGeneral=new InformacionLaboralParameterReturnGeneral(); 
		
		this.informacionlaboralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacionlaboralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public InformacionLaboralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public InformacionLaboralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public InformacionLaboralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessInformacionLaboral(true);
			
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
			
			this.informacionlaboralConstantesFunciones=new InformacionLaboralConstantesFunciones(); 
			this.informacionlaboralBean=new InformacionLaboral();//this.informacionlaboralConstantesFunciones); 			
			this.informacionlaboralReturnGeneral=new InformacionLaboralParameterReturnGeneral(); 
		
			InformacionLaboralBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Informacion Laboral Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.informacionlaboral=new InformacionLaboral();
			this.informacionlaborals = new ArrayList<InformacionLaboral>();
			this.informacionlaboralsAux = new ArrayList<InformacionLaboral>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic=new InformacionLaboralLogic();
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}
			
			//this.informacionlaboralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.informacionlaboralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormInformacionLaboral);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInformacionLaboral);	
					}
					
					if(this.jInternalFrameImportacionInformacionLaboral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInformacionLaboral);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByInformacionLaboral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByInformacionLaboral);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormInformacionLaboral);
				this.jInternalFrameDetalleFormInformacionLaboral.setVisible(false);
				this.jInternalFrameDetalleFormInformacionLaboral.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInformacionLaboral);
					this.jInternalFrameReporteDinamicoInformacionLaboral.setVisible(false);
					this.jInternalFrameReporteDinamicoInformacionLaboral.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionInformacionLaboral!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionInformacionLaboral);
					this.jInternalFrameImportacionInformacionLaboral.setVisible(false);
					this.jInternalFrameImportacionInformacionLaboral.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByInformacionLaboral!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByInformacionLaboral);
					this.jInternalFrameOrderByInformacionLaboral.setVisible(false);
					this.jInternalFrameOrderByInformacionLaboral.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idInformacionLaboralActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=InformacionLaboralConstantesFunciones.INUMEROPAGINACION;
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
			
			this.informacionlaboralReturnGeneral=new InformacionLaboralParameterReturnGeneral();
			
			this.informacionlaboralParameterGeneral=new InformacionLaboralParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.informacionlaboralLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
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
			
			if(InformacionLaboralJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InformacionLaboralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.informacionlaboralSessionBean.getEsGuardarRelacionado(),this.informacionlaboralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InformacionLaboralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.informacionlaboralSessionBean.getEsGuardarRelacionado(),this.informacionlaboralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoInformacionLaboral=false;
			this.isVisibilidadCeldaDuplicarInformacionLaboral=true;
			this.isVisibilidadCeldaCopiarInformacionLaboral=true;
			this.isVisibilidadCeldaVerFormInformacionLaboral=true;
			this.isVisibilidadCeldaOrdenInformacionLaboral=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
			this.isVisibilidadCeldaModificarInformacionLaboral=false;
			this.isVisibilidadCeldaActualizarInformacionLaboral=false;
			this.isVisibilidadCeldaEliminarInformacionLaboral=false;
			this.isVisibilidadCeldaCancelarInformacionLaboral=false;
			this.isVisibilidadCeldaGuardarInformacionLaboral=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdTipoEmpresa=true;
			this.isVisibilidadFK_IdValorClienteAreaLaboral=true;
			this.isVisibilidadFK_IdValorClienteCargoLaboral=true;
			this.isVisibilidadFK_IdValorClienteRelacionLaboral=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesInformacionLaboral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosInformacionLaboral();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioInformacionLaboral(false);
			
			this.setPermisosUsuarioInformacionLaboral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado() 
				|| (this.informacionlaboralSessionBean.getEsGuardarRelacionado() && this.informacionlaboralSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioInformacionLaboralClasesRelacionadas();
			}
			
			if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioInformacionLaboralClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosInformacionLaboral();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualInformacionLaboral();
			}
			
			if(!this.isPermisoBusquedaInformacionLaboral) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioInformacionLaboral,this.isPermisoPaginacionMedioInformacionLaboral,this.isPermisoPaginacionTodoInformacionLaboral);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(InformacionLaboralConstantesFunciones.getTiposSeleccionarInformacionLaboral());
				
				this.tiposColumnasSelect=InformacionLaboralConstantesFunciones.getTiposSeleccionarInformacionLaboral(true);
				
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
			//if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioInformacionLaboral();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioInformacionLaboral(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioInformacionLaboral(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionLaboral() ;
			
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
			
			this.clienteLogic=new ClienteLogic();
			this.tipoempresaLogic=new TipoEmpresaLogic();
			this.tiporelalaboLogic=new TipoRelaLaboLogic();
			this.tipoarealaboLogic=new TipoAreaLaboLogic();
			this.tipocargolaboLogic=new TipoCargoLaboLogic();
			this.paisLogic=new PaisLogic();
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
				informacionlaboralImplementable= (InformacionLaboralImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InformacionLaboralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				informacionlaboralImplementableHome= (InformacionLaboralImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InformacionLaboralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.informacionlaborals= new ArrayList<InformacionLaboral>();
			this.informacionlaboralsEliminados= new ArrayList<InformacionLaboral>();
						
			this.isEsNuevoInformacionLaboral=false;
			this.esParaAccionDesdeFormularioInformacionLaboral=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoempresasForeignKey=new ArrayList<TipoEmpresa>() ;
			this.tiporelalabosForeignKey=new ArrayList<TipoRelaLabo>() ;
			this.tipoarealabosForeignKey=new ArrayList<TipoAreaLabo>() ;
			this.tipocargolabosForeignKey=new ArrayList<TipoCargoLabo>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyInformacionLaboral(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroInformacionLaboral();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			InformacionLaboralBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=InformacionLaboralConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesInformacionLaboral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingInformacionLaboral(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioInformacionLaboral();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioInformacionLaboral();
			}
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasInformacionLaboral.getTabCount(); i++) {
					this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessInformacionLaboral(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga InformacionLaboral: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectInformacionLaboral() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesInformacionLaboral")) {
				iIndex=this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessInformacionLaboral();	
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
	
	public void cargarCombosForeignKeyInformacionLaboral(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyInformacionLaboral(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyInformacionLaboral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyInformacionLaboralListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyInformacionLaboral();
		
		this.cargarCombosFrameForeignKeyInformacionLaboral();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyInformacionLaboral();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyInformacionLaboral();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoEmpresa();
				this.cargarCombosFrameTipoEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoEmpresa(this.tipoempresasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRelaLabo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRelaLaboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRelaLabo();
				this.cargarCombosFrameTipoRelaLabosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRelaLabo(this.tiporelalabosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoAreaLabo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoAreaLaboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoAreaLabo();
				this.cargarCombosFrameTipoAreaLabosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoAreaLabo(this.tipoarealabosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCargoLabo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCargoLaboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCargoLabo();
				this.cargarCombosFrameTipoCargoLabosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCargoLabo(this.tipocargolabosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaPais(this.paissForeignKey);

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
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoInformacionLaboralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
			
			if(jTableDatosInformacionLaboral.getRowCount()>=1) {
				jTableDatosInformacionLaboral.removeRowSelectionInterval(0, jTableDatosInformacionLaboral.getRowCount()-1);						
			}
			
			this.isEsNuevoInformacionLaboral=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoInformacionLaboral(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesInformacionLaboral(true);			
			//this.informacionlaboral=new InformacionLaboral();
			//this.informacionlaboral.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionLaboral(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionLaboral() ;
			
			if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionLaboral(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.informacionlaboral);	
			this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);				
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
			if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar InformacionLaboral: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarInformacionLaboralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosInformacionLaboral.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosInformacionLaboral.getSelectedRows().length;			
			}
			
			informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoInformacionLaboral--;			
				//InformacionLaboral informacionlaboralAux= new InformacionLaboral();			
				//informacionlaboralAux.setId(this.iIdNuevoInformacionLaboral);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//InformacionLaboral informacionlaboralOrigen=new InformacionLaboral();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(InformacionLaboral informacionlaboralOrigen : informacionlaboralsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							informacionlaboralOrigen =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionlaboralOrigen =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaInformacionLaboral();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.informacionlaboral.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosInformacionLaboral(informacionlaboralOrigen,this.informacionlaboral,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.informacionlaboralLogic.getInformacionLaborals().add(this.informacionlaboralAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.informacionlaborals.add(this.informacionlaboralAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaInformacionLaboral(false);
				
				this.jTableDatosInformacionLaboral.setRowSelectionInterval(this.getIndiceNuevoInformacionLaboral(), this.getIndiceNuevoInformacionLaboral());
				
				int iLastRow =  this.jTableDatosInformacionLaboral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInformacionLaboral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInformacionLaboral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionLaboral(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();									
		
			InformacionLaboral informacionlaboralOrigen=new InformacionLaboral();
			InformacionLaboral informacionlaboralDestino=new InformacionLaboral();
				
			informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosInformacionLaboral.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || informacionlaboralsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosInformacionLaboral.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralOrigen =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						informacionlaboralOrigen =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionlaboralDestino =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						informacionlaboralDestino =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				informacionlaboralOrigen =informacionlaboralsSeleccionados.get(0);
				informacionlaboralDestino =informacionlaboralsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosInformacionLaboral(informacionlaboralOrigen,informacionlaboralDestino,true,false);
				
				informacionlaboralDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(informacionlaboralDestino,informacionlaboralLogic.getInformacionLaborals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacionlaboralDestino,informacionlaborals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaInformacionLaboral(false);
				
				//this.jTableDatosInformacionLaboral.setRowSelectionInterval(this.getIndiceNuevoInformacionLaboral(), this.getIndiceNuevoInformacionLaboral());
				
				int iLastRow =  this.jTableDatosInformacionLaboral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInformacionLaboral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInformacionLaboral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionLaboral(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormInformacionLaboral.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesInformacionLaboral.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasInformacionLaboral.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesInformacionLaboral.setVisible(!isVisible);
			this.jPanelPaginacionInformacionLaboral.setVisible(!isVisible);
			this.jPanelAccionesInformacionLaboral.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameInformacionLaboral();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoInformacionLaboral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionInformacionLaboral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByInformacionLaboral();
			
			this.abrirFrameOrderByInformacionLaboral();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByInformacionLaboral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleInformacionLaboral(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormInformacionLaboral);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormInformacionLaboral.isMaximum()) {
					this.jInternalFrameDetalleFormInformacionLaboral.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormInformacionLaboral.setSize(this.jInternalFrameDetalleFormInformacionLaboral.iWidthFormulario,this.jInternalFrameDetalleFormInformacionLaboral.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormInformacionLaboral.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormInformacionLaboral.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormInformacionLaboral.isMaximum()) {
						this.jInternalFrameDetalleFormInformacionLaboral.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormInformacionLaboral.jContentPaneDetalleInformacionLaboral.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormInformacionLaboral.jContentPaneDetalleInformacionLaboral.getWidth(),InformacionLaboralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormInformacionLaboral.jContentPaneDetalleInformacionLaboral.getWidth(),InformacionLaboralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormInformacionLaboral.jContentPaneDetalleInformacionLaboral.getWidth(),InformacionLaboralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormInformacionLaboral.setVisible(true);
	        this.jInternalFrameDetalleFormInformacionLaboral.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByInformacionLaboral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByInformacionLaboral==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByInformacionLaboral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionLaboral,false,this);
				} else {
					this.jInternalFrameOrderByInformacionLaboral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionLaboral,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByInformacionLaboral);
				this.jInternalFrameOrderByInformacionLaboral.setVisible(false);
				this.jInternalFrameOrderByInformacionLaboral.setSelected(false);
				
				this.jInternalFrameOrderByInformacionLaboral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInformacionLaboral"));
				
				this.inicializarActualizarBindingTablaOrderByInformacionLaboral();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionInformacionLaboral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionInformacionLaboral==null) {
				
				this.jInternalFrameImportacionInformacionLaboral=new ImportacionJInternalFrame(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInformacionLaboral);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionInformacionLaboral);
				this.jInternalFrameImportacionInformacionLaboral.setVisible(false);
				this.jInternalFrameImportacionInformacionLaboral.setSelected(false);


				this.jInternalFrameImportacionInformacionLaboral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInformacionLaboral"));
				this.jInternalFrameImportacionInformacionLaboral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInformacionLaboral"));
				this.jInternalFrameImportacionInformacionLaboral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInformacionLaboral"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoInformacionLaboral() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoInformacionLaboral==null) {
				this.jInternalFrameReporteDinamicoInformacionLaboral=new ReporteDinamicoJInternalFrame(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInformacionLaboral);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInformacionLaboral);
				this.jInternalFrameReporteDinamicoInformacionLaboral.setVisible(false);
				this.jInternalFrameReporteDinamicoInformacionLaboral.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoInformacionLaboral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionLaboral"));
				this.jInternalFrameReporteDinamicoInformacionLaboral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionLaboral"));
				this.jInternalFrameReporteDinamicoInformacionLaboral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionLaboral"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionLaboral();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleInformacionLaboral() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormInformacionLaboral);
			
	       	this.jInternalFrameDetalleFormInformacionLaboral.setVisible(false);
	        this.jInternalFrameDetalleFormInformacionLaboral.setSelected(false);
			
			//this.jInternalFrameDetalleFormInformacionLaboral.dispose();
			//this.jInternalFrameDetalleFormInformacionLaboral=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoInformacionLaboral() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoInformacionLaboral.setVisible(true);
	        this.jInternalFrameReporteDinamicoInformacionLaboral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionInformacionLaboral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionInformacionLaboral.setVisible(true);
	        this.jInternalFrameImportacionInformacionLaboral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByInformacionLaboral() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByInformacionLaboral.setVisible(true);
	        this.jInternalFrameOrderByInformacionLaboral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByInformacionLaboral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByInformacionLaboral.setVisible(false);
	        this.jInternalFrameOrderByInformacionLaboral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoInformacionLaboral() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoInformacionLaboral.setVisible(false);
	        this.jInternalFrameReporteDinamicoInformacionLaboral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionInformacionLaboral() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionInformacionLaboral.setVisible(false);
	        this.jInternalFrameImportacionInformacionLaboral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarInformacionLaboral(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarInformacionLaboral(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesInformacionLaboral(true);
			//this.isEsNuevoInformacionLaboral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesInformacionLaboral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionLaboral(false) ;
			
			if(informacionlaboralSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionLaboral(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionLaboral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaInformacionLaboralActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarInformacionLaboral(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesInformacionLaboral(true);
			//this.isEsNuevoInformacionLaboral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.informacionlaboral.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesInformacionLaboral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesInformacionLaboral(false) ;
			
			if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionLaboral(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionLaboral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.informacionlaboralConstantesFunciones.cargaridclienteInformacionLaboral) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingInformacionLaboral(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaidcliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoEmpresa(List<TipoEmpresa> tipoempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoEmpresa=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA));
		TableCellEditor tableCellEditorTipoEmpresa =tableColumnTipoEmpresa.getCellEditor();

		TipoEmpresaTableCell tipoempresaTableCellFk=(TipoEmpresaTableCell)tableCellEditorTipoEmpresa;

		if(tipoempresaTableCellFk!=null) {
			tipoempresaTableCellFk.settipoempresasForeignKey(tipoempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoempresaTableCellFk.setRowActual(intSelectedRow);
			//tipoempresaTableCellFk.settipoempresasForeignKeyActual(tipoempresasForeignKey);
		//}


		if(tipoempresaTableCellFk!=null) {
			tipoempresaTableCellFk.RecargarTipoEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRelaLabo(List<TipoRelaLabo> tiporelalabosForeignKey)throws Exception{
		TableColumn tableColumnTipoRelaLabo=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO));
		TableCellEditor tableCellEditorTipoRelaLabo =tableColumnTipoRelaLabo.getCellEditor();

		TipoRelaLaboTableCell tiporelalaboTableCellFk=(TipoRelaLaboTableCell)tableCellEditorTipoRelaLabo;

		if(tiporelalaboTableCellFk!=null) {
			tiporelalaboTableCellFk.settiporelalabosForeignKey(tiporelalabosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporelalaboTableCellFk.setRowActual(intSelectedRow);
			//tiporelalaboTableCellFk.settiporelalabosForeignKeyActual(tiporelalabosForeignKey);
		//}


		if(tiporelalaboTableCellFk!=null) {
			tiporelalaboTableCellFk.RecargarTipoRelaLabosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoAreaLabo(List<TipoAreaLabo> tipoarealabosForeignKey)throws Exception{
		TableColumn tableColumnTipoAreaLabo=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO));
		TableCellEditor tableCellEditorTipoAreaLabo =tableColumnTipoAreaLabo.getCellEditor();

		TipoAreaLaboTableCell tipoarealaboTableCellFk=(TipoAreaLaboTableCell)tableCellEditorTipoAreaLabo;

		if(tipoarealaboTableCellFk!=null) {
			tipoarealaboTableCellFk.settipoarealabosForeignKey(tipoarealabosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoarealaboTableCellFk.setRowActual(intSelectedRow);
			//tipoarealaboTableCellFk.settipoarealabosForeignKeyActual(tipoarealabosForeignKey);
		//}


		if(tipoarealaboTableCellFk!=null) {
			tipoarealaboTableCellFk.RecargarTipoAreaLabosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCargoLabo(List<TipoCargoLabo> tipocargolabosForeignKey)throws Exception{
		TableColumn tableColumnTipoCargoLabo=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO));
		TableCellEditor tableCellEditorTipoCargoLabo =tableColumnTipoCargoLabo.getCellEditor();

		TipoCargoLaboTableCell tipocargolaboTableCellFk=(TipoCargoLaboTableCell)tableCellEditorTipoCargoLabo;

		if(tipocargolaboTableCellFk!=null) {
			tipocargolaboTableCellFk.settipocargolabosForeignKey(tipocargolabosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocargolaboTableCellFk.setRowActual(intSelectedRow);
			//tipocargolaboTableCellFk.settipocargolabosForeignKeyActual(tipocargolabosForeignKey);
		//}


		if(tipocargolaboTableCellFk!=null) {
			tipocargolaboTableCellFk.RecargarTipoCargoLabosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesInformacionLaboral(false);
			
			//if(!this.isEsNuevoInformacionLaboral) {								
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				
			}
			
			if(this.permiteMantenimiento(this.informacionlaboral)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoInformacionLaboral=true;
					this.inicializarActualizarBindingTablaInformacionLaboral(false);
					this.isEsNuevoInformacionLaboral=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoInformacionLaboral=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoInformacionLaboral=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInformacionLaboral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionLaboral(false);
				
				this.habilitarDeshabilitarControlesInformacionLaboral(false);
			
												
				
				if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleInformacionLaboral();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoInformacionLaboralActionPerformed(evt,informacionlaboralSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualInformacionLaboral(this.informacionlaboral,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosInformacionLaboral.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,informacionlaboralSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.informacionlaboral.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				this.informacionlaboral.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				this.informacionlaboral.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.informacionlaboral)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((InformacionLaboralModel) this.jTableDatosInformacionLaboral.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoInformacionLaboral=true;
				this.inicializarActualizarBindingTablaInformacionLaboral(false);
				this.isEsNuevoInformacionLaboral=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInformacionLaboral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionLaboral(false);
				
				this.habilitarDeshabilitarControlesInformacionLaboral(false);
				
				
				
				if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleInformacionLaboral();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosInformacionLaboral.getRowCount()>=1) {
				jTableDatosInformacionLaboral.removeRowSelectionInterval(0, jTableDatosInformacionLaboral.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesInformacionLaboral(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaInformacionLaboral(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionLaboral(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionLaboral(false) ;
			
			this.isEsNuevoInformacionLaboral=false;
			
			if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleInformacionLaboral();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingInformacionLaboral(false);
				
				//SI ES MANUAL
				if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualInformacionLaboral();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoInformacionLaboral--;			
			//InformacionLaboral informacionlaboralAux= new InformacionLaboral();			
			//informacionlaboralAux.setId(this.iIdNuevoInformacionLaboral);
			
			if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaInformacionLaboral();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
			
			this.informacionlaboral.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.informacionlaboralLogic.getInformacionLaborals().add(this.informacionlaboralAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.informacionlaborals.add(this.informacionlaboralAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaInformacionLaboral(false);
			
			this.jTableDatosInformacionLaboral.setRowSelectionInterval(this.getIndiceNuevoInformacionLaboral(), this.getIndiceNuevoInformacionLaboral());
			
			int iLastRow =  this.jTableDatosInformacionLaboral.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosInformacionLaboral.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosInformacionLaboral.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaInformacionLaboral(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingInformacionLaboral(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionLaboral(false);
			
			//SI ES MANUAL
			if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionLaboral();
			}
			
			//this.abrirFrameTreeInformacionLaboral();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Informacion LaboralES ?", "MANTENIMIENTO DE Informacion Laboral", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionInformacionLaboral.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralInformacionLaboral();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.informacionlaboralReturnGeneral=informacionlaboralLogic.procesarImportacionInformacionLaboralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.informacionlaboralParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarInformacionLaboralReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionInformacionLaboral.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionInformacionLaboral.setFileImportacion(this.jInternalFrameImportacionInformacionLaboral.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionInformacionLaboral.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionInformacionLaboral.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionInformacionLaboral.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionInformacionLaboral.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		

		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("InformacionLaboralBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"InformacionLaboralBaseDesign.jrxml";
			
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
			
			this.generarReporteInformacionLaborals("Todos",informacionlaboralsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRelaLabo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRelaLabo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRelaLabo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRelaLabo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoAreaLabo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoAreaLabo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoAreaLabo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoAreaLabo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCargoLabo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCargoLabo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCargoLabo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCargoLabo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_empoA_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_empoA_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_empoA_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_empoA_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOM:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_empoM_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_empoM_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_empoM_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_empoM_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreReferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreReferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreReferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreReferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoCodigoArea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoCodigoArea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoCodigoArea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoCodigoArea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoMovil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoMovil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoMovil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoMovil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionLaboralConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoInformacionLaboral.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA:
					sNombreCampoCategoria="idvalorempresa";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO:
					sNombreCampoCategoria="idvalorclienterelacionlaboral";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO:
					sNombreCampoCategoria="idvalorclientearealaboral";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO:
					sNombreCampoCategoria="idvalorclientecargolaboral";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="idciudad";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOA:
					sNombreCampoCategoria="tiempoa";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOM:
					sNombreCampoCategoria="tiempom";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoria="nombreempresa";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA:
					sNombreCampoCategoria="nombrereferencia";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					sNombreCampoCategoria="telefonocodigoarea";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoria="telefonomovil";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="email";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA:
					sNombreCampoCategoriaValor="idvalorempresa";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO:
					sNombreCampoCategoriaValor="idvalorclienterelacionlaboral";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO:
					sNombreCampoCategoriaValor="idvalorclientearealaboral";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO:
					sNombreCampoCategoriaValor="idvalorclientecargolaboral";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="idciudad";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOA:
					sNombreCampoCategoriaValor="tiempoa";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOM:
					sNombreCampoCategoriaValor="tiempom";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoriaValor="nombreempresa";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA:
					sNombreCampoCategoriaValor="nombrereferencia";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					sNombreCampoCategoriaValor="telefonocodigoarea";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoriaValor="telefonomovil";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="email";
					break;

				case InformacionLaboralConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorempresa");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Rela Labo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclienterelacionlaboral");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Area Labo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientearealaboral");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Cargo Labo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientecargolaboral");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idciudad");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tiempo A",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tiempoa");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOM:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tiempo M",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tiempom");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombreempresa");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Referencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombrereferencia");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Codigo Area",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonocodigoarea");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Movil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonomovil");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Email",sNombreCampoCategoria,sNombreCampoCategoriaValor,"email");
					break;

				case InformacionLaboralConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esactivo");
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
	
	public void jButtonGenerarExcelReporteDinamicoInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionlaboral";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("InformacionLaborals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettipoempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettiporelalabo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettipoarealabo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettipocargolabo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TIEMPOA);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettiempoa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TIEMPOM:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TIEMPOM);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettiempom());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.getnombreempresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.getnombrereferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettelefonocodigoarea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.gettelefonomovil());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.getemail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionLaboralConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(InformacionLaboral informacionlaboral:informacionlaboralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionlaboral.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelInformacionLaboral(row);				
			//	iRow++;
			//}				
			
			//for(InformacionLaboral informacionlaboralAux:informacionlaboralsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelInformacionLaboral(informacionlaboralAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
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
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionLaboral(false);
			
			//SI ES MANUAL
			if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionLaboral();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionLaboral(false);
			
			//SI ES MANUAL
			if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInformacionLaboral();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionLaboral(false);
			
			//SI ES MANUAL
			if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInformacionLaboral();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaInformacionLaboral() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosInformacionLaboral.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosInformacionLaboral.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosInformacionLaboral.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosInformacionLaboral.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosInformacionLaboral.setMinimumSize(dimensionMinimum);
		this.jTableDatosInformacionLaboral.setMaximumSize(dimensionMaximum);
		this.jTableDatosInformacionLaboral.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingInformacionLaboral(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingInformacionLaboral(esInicializar,true);
	}
	
	public void inicializarActualizarBindingInformacionLaboral(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaInformacionLaboral(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesInformacionLaboral(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasInformacionLaboral(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionLaboral(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesInformacionLaboral(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualInformacionLaboral() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaInformacionLaboral();
		
		this.inicializarActualizarBindingBotonesManualInformacionLaboral(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualInformacionLaboral();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionLaboral() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionLaboral(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionLaboral(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosInformacionLaboral.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosInformacionLaboral.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteInformacionLaboral.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxPostAccionNuevoInformacionLaboral.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxPostAccionSinCerrarInformacionLaboral.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxPostAccionSinMensajeInformacionLaboral.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosInformacionLaboral.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosInformacionLaboral.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteInformacionLaboral.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
				this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxPostAccionNuevoInformacionLaboral.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxPostAccionSinCerrarInformacionLaboral.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxPostAccionSinMensajeInformacionLaboral.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionInformacionLaboral.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionInformacionLaboral.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesInformacionLaboral.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesInformacionLaboral.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesInformacionLaboral.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarInformacionLaboral.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesInformacionLaboral.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesInformacionLaboral.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralInformacionLaboral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesInformacionLaboral(Boolean esInicializar) throws Exception {
		try	{	
			if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionLaboral(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesInformacionLaboral() throws Exception {
		try	{
			if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualInformacionLaboral();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInformacionLaboral() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualInformacionLaboral() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesInformacionLaboral.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesInformacionLaboral.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesInformacionLaboral.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesInformacionLaboral.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesInformacionLaboral.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesInformacionLaboral.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionInformacionLaboral.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionInformacionLaboral.addItem(reporte);
			}
			
			
			if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionInformacionLaboral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionInformacionLaboral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesInformacionLaboral.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesInformacionLaboral.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesInformacionLaboral.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesInformacionLaboral.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarInformacionLaboral.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarInformacionLaboral.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarInformacionLaboral.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionLaboral();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionLaboral() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
				this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
				this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoInformacionLaboral.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
				
				if(this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformacionLaboral.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoInformacionLaboral.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInformacionLaboral.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformacionLaboral.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualInformacionLaboral()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidciudadFK_IdCiudadInformacionLaboral.getSelectedItem()!=null){this.idciudadFK_IdCiudad=((Ciudad)this.jComboBoxidciudadFK_IdCiudadInformacionLaboral.getSelectedItem()).getId();}
		if(this.jComboBoxidclienteFK_IdClienteInformacionLaboral.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteInformacionLaboral.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisInformacionLaboral.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisInformacionLaboral.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.getSelectedItem()!=null){this.idvalorempresaFK_IdTipoEmpresa=((TipoEmpresa)this.jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.getSelectedItem()!=null){this.idvalorclientearealaboralFK_IdValorClienteAreaLaboral=((TipoAreaLabo)this.jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.getSelectedItem()!=null){this.idvalorclientecargolaboralFK_IdValorClienteCargoLaboral=((TipoCargoLabo)this.jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.getSelectedItem()!=null){this.idvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral=((TipoRelaLabo)this.jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasInformacionLaboral(Boolean esInicializar) throws Exception {				
		if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualInformacionLaboral();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaInformacionLaboral() throws Exception {
		this.inicializarActualizarBindingTablaInformacionLaboral(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByInformacionLaboral() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosInformacionLaboralOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboralOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaInformacionLaboral(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=informacionlaboralLogic.getInformacionLaborals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=informacionlaborals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosInformacionLaboral.setModel(new InformacionLaboralModel(this.informacionlaboralLogic.getInformacionLaborals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosInformacionLaboral.setModel(new InformacionLaboralModel(this.informacionlaborals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByInformacionLaboral!=null && this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByInformacionLaboral();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO,informacionlaboralConstantesFunciones.resaltarSeleccionarInformacionLaboral,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO,informacionlaboralConstantesFunciones.resaltarSeleccionarInformacionLaboral,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_ID));

		if(this.informacionlaboralConstantesFunciones.mostraridInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.informacionlaboralConstantesFunciones.resaltaridInformacionLaboral,this.informacionlaboralConstantesFunciones.activaridInformacionLaboral,this,true,"idInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltaridInformacionLaboral,this.informacionlaboralConstantesFunciones.activaridInformacionLaboral,this,true,"idInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE));

		if(this.informacionlaboralConstantesFunciones.mostraridclienteInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.informacionlaboralConstantesFunciones.resaltaridclienteInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridclienteInformacionLaboral));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.informacionlaboralConstantesFunciones.resaltaridclienteInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridclienteInformacionLaboral,true,"idclienteInformacionLaboral","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA));

		if(this.informacionlaboralConstantesFunciones.mostraridvalorempresaInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoEmpresaTableCell(this.tipoempresasForeignKey,this.informacionlaboralConstantesFunciones.resaltaridvalorempresaInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridvalorempresaInformacionLaboral));
			tableColumn.setCellEditor(new TipoEmpresaTableCell(this.tipoempresasForeignKey,this.informacionlaboralConstantesFunciones.resaltaridvalorempresaInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridvalorempresaInformacionLaboral,true,"idvalorempresaInformacionLaboral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO));

		if(this.informacionlaboralConstantesFunciones.mostraridvalorclienterelacionlaboralInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRelaLaboTableCell(this.tiporelalabosForeignKey,this.informacionlaboralConstantesFunciones.resaltaridvalorclienterelacionlaboralInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridvalorclienterelacionlaboralInformacionLaboral));
			tableColumn.setCellEditor(new TipoRelaLaboTableCell(this.tiporelalabosForeignKey,this.informacionlaboralConstantesFunciones.resaltaridvalorclienterelacionlaboralInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridvalorclienterelacionlaboralInformacionLaboral,true,"idvalorclienterelacionlaboralInformacionLaboral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO));

		if(this.informacionlaboralConstantesFunciones.mostraridvalorclientearealaboralInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoAreaLaboTableCell(this.tipoarealabosForeignKey,this.informacionlaboralConstantesFunciones.resaltaridvalorclientearealaboralInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridvalorclientearealaboralInformacionLaboral));
			tableColumn.setCellEditor(new TipoAreaLaboTableCell(this.tipoarealabosForeignKey,this.informacionlaboralConstantesFunciones.resaltaridvalorclientearealaboralInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridvalorclientearealaboralInformacionLaboral,true,"idvalorclientearealaboralInformacionLaboral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO));

		if(this.informacionlaboralConstantesFunciones.mostraridvalorclientecargolaboralInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCargoLaboTableCell(this.tipocargolabosForeignKey,this.informacionlaboralConstantesFunciones.resaltaridvalorclientecargolaboralInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridvalorclientecargolaboralInformacionLaboral));
			tableColumn.setCellEditor(new TipoCargoLaboTableCell(this.tipocargolabosForeignKey,this.informacionlaboralConstantesFunciones.resaltaridvalorclientecargolaboralInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridvalorclientecargolaboralInformacionLaboral,true,"idvalorclientecargolaboralInformacionLaboral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDPAIS));

		if(this.informacionlaboralConstantesFunciones.mostrarid_paisInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.informacionlaboralConstantesFunciones.resaltarid_paisInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activarid_paisInformacionLaboral));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.informacionlaboralConstantesFunciones.resaltarid_paisInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activarid_paisInformacionLaboral,true,"id_paisInformacionLaboral","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD));

		if(this.informacionlaboralConstantesFunciones.mostraridciudadInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.informacionlaboralConstantesFunciones.resaltaridciudadInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridciudadInformacionLaboral));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.informacionlaboralConstantesFunciones.resaltaridciudadInformacionLaboral,this,this.informacionlaboralConstantesFunciones.activaridciudadInformacionLaboral,true,"idciudadInformacionLaboral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_TIEMPOA));

		if(this.informacionlaboralConstantesFunciones.mostrartiempoaInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_TIEMPOA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.informacionlaboralConstantesFunciones.resaltartiempoaInformacionLaboral,this.informacionlaboralConstantesFunciones.activartiempoaInformacionLaboral,this,true,"tiempoaInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltartiempoaInformacionLaboral,this.informacionlaboralConstantesFunciones.activartiempoaInformacionLaboral,this,true,"tiempoaInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_TIEMPOM));

		if(this.informacionlaboralConstantesFunciones.mostrartiempomInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_TIEMPOM,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.informacionlaboralConstantesFunciones.resaltartiempomInformacionLaboral,this.informacionlaboralConstantesFunciones.activartiempomInformacionLaboral,this,true,"tiempomInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltartiempomInformacionLaboral,this.informacionlaboralConstantesFunciones.activartiempomInformacionLaboral,this,true,"tiempomInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA));

		if(this.informacionlaboralConstantesFunciones.mostrarnombreempresaInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacionlaboralConstantesFunciones.resaltarnombreempresaInformacionLaboral,this.informacionlaboralConstantesFunciones.activarnombreempresaInformacionLaboral,this,true,"nombreempresaInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltarnombreempresaInformacionLaboral,this.informacionlaboralConstantesFunciones.activarnombreempresaInformacionLaboral,this,true,"nombreempresaInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_DIRECCION));

		if(this.informacionlaboralConstantesFunciones.mostrardireccionInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacionlaboralConstantesFunciones.resaltardireccionInformacionLaboral,this.informacionlaboralConstantesFunciones.activardireccionInformacionLaboral,this,true,"direccionInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltardireccionInformacionLaboral,this.informacionlaboralConstantesFunciones.activardireccionInformacionLaboral,this,true,"direccionInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA));

		if(this.informacionlaboralConstantesFunciones.mostrarnombrereferenciaInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacionlaboralConstantesFunciones.resaltarnombrereferenciaInformacionLaboral,this.informacionlaboralConstantesFunciones.activarnombrereferenciaInformacionLaboral,this,true,"nombrereferenciaInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltarnombrereferenciaInformacionLaboral,this.informacionlaboralConstantesFunciones.activarnombrereferenciaInformacionLaboral,this,true,"nombrereferenciaInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_TELEFONO));

		if(this.informacionlaboralConstantesFunciones.mostrartelefonoInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacionlaboralConstantesFunciones.resaltartelefonoInformacionLaboral,this.informacionlaboralConstantesFunciones.activartelefonoInformacionLaboral,this,true,"telefonoInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltartelefonoInformacionLaboral,this.informacionlaboralConstantesFunciones.activartelefonoInformacionLaboral,this,true,"telefonoInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA));

		if(this.informacionlaboralConstantesFunciones.mostrartelefonocodigoareaInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacionlaboralConstantesFunciones.resaltartelefonocodigoareaInformacionLaboral,this.informacionlaboralConstantesFunciones.activartelefonocodigoareaInformacionLaboral,this,true,"telefonocodigoareaInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltartelefonocodigoareaInformacionLaboral,this.informacionlaboralConstantesFunciones.activartelefonocodigoareaInformacionLaboral,this,true,"telefonocodigoareaInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL));

		if(this.informacionlaboralConstantesFunciones.mostrartelefonomovilInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacionlaboralConstantesFunciones.resaltartelefonomovilInformacionLaboral,this.informacionlaboralConstantesFunciones.activartelefonomovilInformacionLaboral,this,true,"telefonomovilInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltartelefonomovilInformacionLaboral,this.informacionlaboralConstantesFunciones.activartelefonomovilInformacionLaboral,this,true,"telefonomovilInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_EMAIL));

		if(this.informacionlaboralConstantesFunciones.mostraremailInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacionlaboralConstantesFunciones.resaltaremailInformacionLaboral,this.informacionlaboralConstantesFunciones.activaremailInformacionLaboral,this,true,"emailInformacionLaboral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionlaboralConstantesFunciones.resaltaremailInformacionLaboral,this.informacionlaboralConstantesFunciones.activaremailInformacionLaboral,this,true,"emailInformacionLaboral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,InformacionLaboralConstantesFunciones.LABEL_ESACTIVO));

		if(this.informacionlaboralConstantesFunciones.mostraresactivoInformacionLaboral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionLaboralConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.informacionlaboralConstantesFunciones.resaltaresactivoInformacionLaboral,this.informacionlaboralConstantesFunciones.activaresactivoInformacionLaboral));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.informacionlaboralConstantesFunciones.resaltaresactivoInformacionLaboral,this.informacionlaboralConstantesFunciones.activaresactivoInformacionLaboral,this,true,"esactivoInformacionLaboral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new InformacionLaboralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.informacionlaboralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.informacionlaboralSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInformacionLaboral.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.informacionlaboralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.informacionlaboralSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInformacionLaboral.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.informacionlaboralSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.informacionlaboralSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosInformacionLaboral.addColumn(tableColumn);
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
			
			this.jTableDatosInformacionLaboral.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosInformacionLaboral.moveColumn(this.jTableDatosInformacionLaboral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosInformacionLaboral.moveColumn(this.jTableDatosInformacionLaboral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosInformacionLaboral.moveColumn(this.jTableDatosInformacionLaboral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosInformacionLaboral.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosInformacionLaboral.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosInformacionLaboral,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosInformacionLaboral.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosInformacionLaboral.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosInformacionLaboral.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosInformacionLaboral.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosInformacionLaboral.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=informacionlaboralLogic.getInformacionLaborals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=informacionlaborals.size()-1;
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
		//this.jTableDatosInformacionLaboral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosInformacionLaboral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosInformacionLaboral();
			
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
				
				//this.isEsNuevoInformacionLaboral=false;
					
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
				if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormInformacionLaboral==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInformacionLaboral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.informacionlaboral.getsType().equals("DUPLICADO")
				   || this.informacionlaboral.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoInformacionLaboral=true;
				
				} else {
					this.isEsNuevoInformacionLaboral=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
					if(this.informacionlaboral.getId()>=0 && !this.informacionlaboral.getIsNew()) {						
						this.isEsNuevoInformacionLaboral=false;
						
					} else {
						this.isEsNuevoInformacionLaboral=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoInformacionLaboral(esRelaciones);						
				
				this.seleccionarInformacionLaboral(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.informacionlaboral.getId()<0) {
					this.isEsNuevoInformacionLaboral=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarInformacionLaboral(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarInformacionLaboral(evt,rowIndex);
				}	
				
				if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion InformacionLaboral: " + this.dDif); 
					}
				}								
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarInformacionLaboral(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.informacionlaboral)) {
					if(this.informacionlaboral.getId()>0) {
						this.informacionlaboral.setIsDeleted(true);
						
						this.informacionlaboralsEliminados.add(this.informacionlaboral);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.informacionlaboralLogic.getInformacionLaborals().remove(this.informacionlaboral);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.informacionlaborals.remove(this.informacionlaboral);				
					}
					
					
					((InformacionLaboralModel) this.jTableDatosInformacionLaboral.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionLaboral(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarInformacionLaboral(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoInformacionLaboral) {
			
			if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInformacionLaboral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInformacionLaboral.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioInformacionLaboral(this.informacionlaboral);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.informacionlaboralConstantesFunciones.cargaridclienteInformacionLaboral || this.informacionlaboralConstantesFunciones.event_dependidclienteInformacionLaboral) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.informacionlaboral.getidcliente());
									//this.inicializarActualizarBindingInformacionLaboral(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(informacionlaboral.getCliente()!=null) {
							this.clientesForeignKey.add(informacionlaboral.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.informacionlaboral.getidcliente(),false,"Formulario");

					//TipoEmpresa
					if(!this.informacionlaboralConstantesFunciones.cargaridvalorempresaInformacionLaboral || this.informacionlaboralConstantesFunciones.event_dependidvalorempresaInformacionLaboral) {
						//this.cargarCombosTipoEmpresasForeignKeyLista(" where id="+this.informacionlaboral.getidvalorempresa());
									//this.inicializarActualizarBindingInformacionLaboral(false,false);
						this.tipoempresasForeignKey=new ArrayList<TipoEmpresa>();

						if(informacionlaboral.getTipoEmpresa()!=null) {
							this.tipoempresasForeignKey.add(informacionlaboral.getTipoEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoEmpresa();
						this.cargarCombosFrameTipoEmpresasForeignKey("Todos");
					}
					this.setActualTipoEmpresaForeignKey(this.informacionlaboral.getidvalorempresa(),false,"Formulario");

					//TipoRelaLabo
					if(!this.informacionlaboralConstantesFunciones.cargaridvalorclienterelacionlaboralInformacionLaboral || this.informacionlaboralConstantesFunciones.event_dependidvalorclienterelacionlaboralInformacionLaboral) {
						//this.cargarCombosTipoRelaLabosForeignKeyLista(" where id="+this.informacionlaboral.getidvalorclienterelacionlaboral());
									//this.inicializarActualizarBindingInformacionLaboral(false,false);
						this.tiporelalabosForeignKey=new ArrayList<TipoRelaLabo>();

						if(informacionlaboral.getTipoRelaLabo()!=null) {
							this.tiporelalabosForeignKey.add(informacionlaboral.getTipoRelaLabo());
						}

						this.addItemDefectoCombosForeignKeyTipoRelaLabo();
						this.cargarCombosFrameTipoRelaLabosForeignKey("Todos");
					}
					this.setActualTipoRelaLaboForeignKey(this.informacionlaboral.getidvalorclienterelacionlaboral(),false,"Formulario");

					//TipoAreaLabo
					if(!this.informacionlaboralConstantesFunciones.cargaridvalorclientearealaboralInformacionLaboral || this.informacionlaboralConstantesFunciones.event_dependidvalorclientearealaboralInformacionLaboral) {
						//this.cargarCombosTipoAreaLabosForeignKeyLista(" where id="+this.informacionlaboral.getidvalorclientearealaboral());
									//this.inicializarActualizarBindingInformacionLaboral(false,false);
						this.tipoarealabosForeignKey=new ArrayList<TipoAreaLabo>();

						if(informacionlaboral.getTipoAreaLabo()!=null) {
							this.tipoarealabosForeignKey.add(informacionlaboral.getTipoAreaLabo());
						}

						this.addItemDefectoCombosForeignKeyTipoAreaLabo();
						this.cargarCombosFrameTipoAreaLabosForeignKey("Todos");
					}
					this.setActualTipoAreaLaboForeignKey(this.informacionlaboral.getidvalorclientearealaboral(),false,"Formulario");

					//TipoCargoLabo
					if(!this.informacionlaboralConstantesFunciones.cargaridvalorclientecargolaboralInformacionLaboral || this.informacionlaboralConstantesFunciones.event_dependidvalorclientecargolaboralInformacionLaboral) {
						//this.cargarCombosTipoCargoLabosForeignKeyLista(" where id="+this.informacionlaboral.getidvalorclientecargolaboral());
									//this.inicializarActualizarBindingInformacionLaboral(false,false);
						this.tipocargolabosForeignKey=new ArrayList<TipoCargoLabo>();

						if(informacionlaboral.getTipoCargoLabo()!=null) {
							this.tipocargolabosForeignKey.add(informacionlaboral.getTipoCargoLabo());
						}

						this.addItemDefectoCombosForeignKeyTipoCargoLabo();
						this.cargarCombosFrameTipoCargoLabosForeignKey("Todos");
					}
					this.setActualTipoCargoLaboForeignKey(this.informacionlaboral.getidvalorclientecargolaboral(),false,"Formulario");

					//Pais
					if(!this.informacionlaboralConstantesFunciones.cargarid_paisInformacionLaboral || this.informacionlaboralConstantesFunciones.event_dependid_paisInformacionLaboral) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.informacionlaboral.getid_pais());
									//this.inicializarActualizarBindingInformacionLaboral(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(informacionlaboral.getPais()!=null) {
							this.paissForeignKey.add(informacionlaboral.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.informacionlaboral.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.informacionlaboralConstantesFunciones.cargaridciudadInformacionLaboral || this.informacionlaboralConstantesFunciones.event_dependidciudadInformacionLaboral) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.informacionlaboral.getidciudad());
									//this.inicializarActualizarBindingInformacionLaboral(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(informacionlaboral.getCiudad()!=null) {
							this.ciudadsForeignKey.add(informacionlaboral.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.informacionlaboral.getidciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesInformacionLaboral("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesInformacionLaboral(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionLaboral() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoInformacionLaboral(InformacionLaboral informacionlaboral) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoInformacionLaboral(informacionlaboral,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoInformacionLaboral(InformacionLaboral informacionlaboral,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioInformacionLaboral(informacionlaboral);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyInformacionLaboral(informacionlaboral,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyInformacionLaboral(informacionlaboral);
	}
	
	public void setVariablesObjetoActualToFormularioInformacionLaboral(InformacionLaboral informacionlaboral) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.setText(informacionlaboral.getId().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempoaInformacionLaboral.setText(informacionlaboral.gettiempoa().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempomInformacionLaboral.setText(informacionlaboral.gettiempom().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombreempresaInformacionLaboral.setText(informacionlaboral.getnombreempresa());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreadireccionInformacionLaboral.setText(informacionlaboral.getdireccion());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombrereferenciaInformacionLaboral.setText(informacionlaboral.getnombrereferencia());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonoInformacionLaboral.setText(informacionlaboral.gettelefono());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtelefonocodigoareaInformacionLaboral.setText(informacionlaboral.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonomovilInformacionLaboral.setText(informacionlaboral.gettelefonomovil());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreaemailInformacionLaboral.setText(informacionlaboral.getemail());
			this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.setSelected(informacionlaboral.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,InformacionLaboral informacionlaboralLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,informacionlaboralLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,InformacionLaboral informacionlaboralLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				informacionlaboralLocal=this.informacionlaboral;
			} else {
				informacionlaboralLocal=this.informacionlaboralAnterior;
			}
		}
		
		if(this.permiteMantenimiento(informacionlaboralLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoInformacionLaboral(informacionlaboralLocal,true);
					
					if(informacionlaboralSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(informacionlaboralLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(informacionlaboralLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoInformacionLaboral(InformacionLaboral informacionlaboral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInformacionLaboral(informacionlaboral,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(informacionlaboral);
	}
	
	public void setVariablesFormularioToObjetoActualInformacionLaboral(InformacionLaboral informacionlaboral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInformacionLaboral(informacionlaboral,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualInformacionLaboral(InformacionLaboral informacionlaboral,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.getText()==null || this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.getText()=="" || this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.getText()=="Id") {
				this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.setText("0");
			}

			if(conColumnasBase) {informacionlaboral.setId(Long.parseLong(this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelIdInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.settiempoa(Integer.parseInt(this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempoaInformacionLaboral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_TIEMPOA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltiempoaInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.settiempom(Integer.parseInt(this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempomInformacionLaboral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_TIEMPOM+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltiempomInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.setnombreempresa(this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombreempresaInformacionLaboral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelnombreempresaInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.setdireccion(this.jInternalFrameDetalleFormInformacionLaboral.jTextAreadireccionInformacionLaboral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeldireccionInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.setnombrereferencia(this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombrereferenciaInformacionLaboral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelnombrereferenciaInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.settelefono(this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonoInformacionLaboral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonoInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.settelefonocodigoarea(this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtelefonocodigoareaInformacionLaboral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonocodigoareaInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.settelefonomovil(this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonomovilInformacionLaboral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabeltelefonomovilInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.setemail(this.jInternalFrameDetalleFormInformacionLaboral.jTextAreaemailInformacionLaboral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelemailInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionlaboral.setesactivo(this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionLaboralConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionLaboral.jLabelesactivoInformacionLaboral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInformacionLaboral(InformacionLaboral informacionlaboralBean,InformacionLaboral informacionlaboral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && informacionlaboralBean.getidcliente()!=null && !informacionlaboralBean.getidcliente().equals(-1L))) {informacionlaboral.setidcliente(informacionlaboralBean.getidcliente());}
			if(conDefault || (!conDefault && informacionlaboralBean.getidvalorempresa()!=null && !informacionlaboralBean.getidvalorempresa().equals(-1L))) {informacionlaboral.setidvalorempresa(informacionlaboralBean.getidvalorempresa());}
			if(conDefault || (!conDefault && informacionlaboralBean.getidvalorclienterelacionlaboral()!=null && !informacionlaboralBean.getidvalorclienterelacionlaboral().equals(-1L))) {informacionlaboral.setidvalorclienterelacionlaboral(informacionlaboralBean.getidvalorclienterelacionlaboral());}
			if(conDefault || (!conDefault && informacionlaboralBean.getidvalorclientearealaboral()!=null && !informacionlaboralBean.getidvalorclientearealaboral().equals(-1L))) {informacionlaboral.setidvalorclientearealaboral(informacionlaboralBean.getidvalorclientearealaboral());}
			if(conDefault || (!conDefault && informacionlaboralBean.getidvalorclientecargolaboral()!=null && !informacionlaboralBean.getidvalorclientecargolaboral().equals(-1L))) {informacionlaboral.setidvalorclientecargolaboral(informacionlaboralBean.getidvalorclientecargolaboral());}
			if(conDefault || (!conDefault && informacionlaboralBean.getid_pais()!=null && !informacionlaboralBean.getid_pais().equals(-1L))) {informacionlaboral.setid_pais(informacionlaboralBean.getid_pais());}
			if(conDefault || (!conDefault && informacionlaboralBean.getidciudad()!=null && !informacionlaboralBean.getidciudad().equals(-1L))) {informacionlaboral.setidciudad(informacionlaboralBean.getidciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosInformacionLaboral(InformacionLaboral informacionlaboralOrigen,InformacionLaboral informacionlaboral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && informacionlaboralOrigen.getId()!=null && !informacionlaboralOrigen.getId().equals(0L))) {informacionlaboral.setId(informacionlaboralOrigen.getId());}}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getidcliente()!=null && !informacionlaboralOrigen.getidcliente().equals(-1L))) {informacionlaboral.setidcliente(informacionlaboralOrigen.getidcliente());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getidvalorempresa()!=null && !informacionlaboralOrigen.getidvalorempresa().equals(-1L))) {informacionlaboral.setidvalorempresa(informacionlaboralOrigen.getidvalorempresa());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getidvalorclienterelacionlaboral()!=null && !informacionlaboralOrigen.getidvalorclienterelacionlaboral().equals(-1L))) {informacionlaboral.setidvalorclienterelacionlaboral(informacionlaboralOrigen.getidvalorclienterelacionlaboral());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getidvalorclientearealaboral()!=null && !informacionlaboralOrigen.getidvalorclientearealaboral().equals(-1L))) {informacionlaboral.setidvalorclientearealaboral(informacionlaboralOrigen.getidvalorclientearealaboral());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getidvalorclientecargolaboral()!=null && !informacionlaboralOrigen.getidvalorclientecargolaboral().equals(-1L))) {informacionlaboral.setidvalorclientecargolaboral(informacionlaboralOrigen.getidvalorclientecargolaboral());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getid_pais()!=null && !informacionlaboralOrigen.getid_pais().equals(-1L))) {informacionlaboral.setid_pais(informacionlaboralOrigen.getid_pais());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getidciudad()!=null && !informacionlaboralOrigen.getidciudad().equals(-1L))) {informacionlaboral.setidciudad(informacionlaboralOrigen.getidciudad());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.gettiempoa()!=null && !informacionlaboralOrigen.gettiempoa().equals(0))) {informacionlaboral.settiempoa(informacionlaboralOrigen.gettiempoa());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.gettiempom()!=null && !informacionlaboralOrigen.gettiempom().equals(0))) {informacionlaboral.settiempom(informacionlaboralOrigen.gettiempom());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getnombreempresa()!=null && !informacionlaboralOrigen.getnombreempresa().equals(""))) {informacionlaboral.setnombreempresa(informacionlaboralOrigen.getnombreempresa());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getdireccion()!=null && !informacionlaboralOrigen.getdireccion().equals(""))) {informacionlaboral.setdireccion(informacionlaboralOrigen.getdireccion());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getnombrereferencia()!=null && !informacionlaboralOrigen.getnombrereferencia().equals(""))) {informacionlaboral.setnombrereferencia(informacionlaboralOrigen.getnombrereferencia());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.gettelefono()!=null && !informacionlaboralOrigen.gettelefono().equals(""))) {informacionlaboral.settelefono(informacionlaboralOrigen.gettelefono());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.gettelefonocodigoarea()!=null && !informacionlaboralOrigen.gettelefonocodigoarea().equals(""))) {informacionlaboral.settelefonocodigoarea(informacionlaboralOrigen.gettelefonocodigoarea());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.gettelefonomovil()!=null && !informacionlaboralOrigen.gettelefonomovil().equals(""))) {informacionlaboral.settelefonomovil(informacionlaboralOrigen.gettelefonomovil());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getemail()!=null && !informacionlaboralOrigen.getemail().equals(""))) {informacionlaboral.setemail(informacionlaboralOrigen.getemail());}
			if(conDefault || (!conDefault && informacionlaboralOrigen.getesactivo()!=null && !informacionlaboralOrigen.getesactivo().equals(false))) {informacionlaboral.setesactivo(informacionlaboralOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInformacionLaboral(InformacionLaboral informacionlaboral) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.setText(informacionlaboral.getId().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempoaInformacionLaboral.setText(informacionlaboral.gettiempoa().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempomInformacionLaboral.setText(informacionlaboral.gettiempom().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombreempresaInformacionLaboral.setText(informacionlaboral.getnombreempresa());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreadireccionInformacionLaboral.setText(informacionlaboral.getdireccion());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombrereferenciaInformacionLaboral.setText(informacionlaboral.getnombrereferencia());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonoInformacionLaboral.setText(informacionlaboral.gettelefono());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtelefonocodigoareaInformacionLaboral.setText(informacionlaboral.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonomovilInformacionLaboral.setText(informacionlaboral.gettelefonomovil());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreaemailInformacionLaboral.setText(informacionlaboral.getemail());
			this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.setSelected(informacionlaboral.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInformacionLaboral(InformacionLaboralBean informacionlaboralBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.setText(informacionlaboralBean.getId().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempoaInformacionLaboral.setText(informacionlaboralBean.gettiempoa().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempomInformacionLaboral.setText(informacionlaboralBean.gettiempom().toString());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombreempresaInformacionLaboral.setText(informacionlaboralBean.getnombreempresa());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreadireccionInformacionLaboral.setText(informacionlaboralBean.getdireccion());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombrereferenciaInformacionLaboral.setText(informacionlaboralBean.getnombrereferencia());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonoInformacionLaboral.setText(informacionlaboralBean.gettelefono());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtelefonocodigoareaInformacionLaboral.setText(informacionlaboralBean.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonomovilInformacionLaboral.setText(informacionlaboralBean.gettelefonomovil());
			this.jInternalFrameDetalleFormInformacionLaboral.jTextAreaemailInformacionLaboral.setText(informacionlaboralBean.getemail());
			this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.setSelected(informacionlaboralBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanInformacionLaboral(InformacionLaboralParameterReturnGeneral informacionlaboralReturnGeneral,InformacionLaboralBean informacionlaboralBean,Boolean conDefault) throws Exception { 
		try {
			InformacionLaboral informacionlaboralLocal=new InformacionLaboral();
			
			informacionlaboralLocal=informacionlaboralReturnGeneral.getInformacionLaboral();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && informacionlaboralLocal.getId()!=null && !informacionlaboralLocal.getId().equals(0L))) {informacionlaboralBean.setId(informacionlaboralLocal.getId());}}
			if(conDefault || (!conDefault && informacionlaboralLocal.getidcliente()!=null && !informacionlaboralLocal.getidcliente().equals(-1L))) {informacionlaboralBean.setidcliente(informacionlaboralLocal.getidcliente());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getidvalorempresa()!=null && !informacionlaboralLocal.getidvalorempresa().equals(-1L))) {informacionlaboralBean.setidvalorempresa(informacionlaboralLocal.getidvalorempresa());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getidvalorclienterelacionlaboral()!=null && !informacionlaboralLocal.getidvalorclienterelacionlaboral().equals(-1L))) {informacionlaboralBean.setidvalorclienterelacionlaboral(informacionlaboralLocal.getidvalorclienterelacionlaboral());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getidvalorclientearealaboral()!=null && !informacionlaboralLocal.getidvalorclientearealaboral().equals(-1L))) {informacionlaboralBean.setidvalorclientearealaboral(informacionlaboralLocal.getidvalorclientearealaboral());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getidvalorclientecargolaboral()!=null && !informacionlaboralLocal.getidvalorclientecargolaboral().equals(-1L))) {informacionlaboralBean.setidvalorclientecargolaboral(informacionlaboralLocal.getidvalorclientecargolaboral());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getid_pais()!=null && !informacionlaboralLocal.getid_pais().equals(-1L))) {informacionlaboralBean.setid_pais(informacionlaboralLocal.getid_pais());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getidciudad()!=null && !informacionlaboralLocal.getidciudad().equals(-1L))) {informacionlaboralBean.setidciudad(informacionlaboralLocal.getidciudad());}
			if(conDefault || (!conDefault && informacionlaboralLocal.gettiempoa()!=null && !informacionlaboralLocal.gettiempoa().equals(0))) {informacionlaboralBean.settiempoa(informacionlaboralLocal.gettiempoa());}
			if(conDefault || (!conDefault && informacionlaboralLocal.gettiempom()!=null && !informacionlaboralLocal.gettiempom().equals(0))) {informacionlaboralBean.settiempom(informacionlaboralLocal.gettiempom());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getnombreempresa()!=null && !informacionlaboralLocal.getnombreempresa().equals(""))) {informacionlaboralBean.setnombreempresa(informacionlaboralLocal.getnombreempresa());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getdireccion()!=null && !informacionlaboralLocal.getdireccion().equals(""))) {informacionlaboralBean.setdireccion(informacionlaboralLocal.getdireccion());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getnombrereferencia()!=null && !informacionlaboralLocal.getnombrereferencia().equals(""))) {informacionlaboralBean.setnombrereferencia(informacionlaboralLocal.getnombrereferencia());}
			if(conDefault || (!conDefault && informacionlaboralLocal.gettelefono()!=null && !informacionlaboralLocal.gettelefono().equals(""))) {informacionlaboralBean.settelefono(informacionlaboralLocal.gettelefono());}
			if(conDefault || (!conDefault && informacionlaboralLocal.gettelefonocodigoarea()!=null && !informacionlaboralLocal.gettelefonocodigoarea().equals(""))) {informacionlaboralBean.settelefonocodigoarea(informacionlaboralLocal.gettelefonocodigoarea());}
			if(conDefault || (!conDefault && informacionlaboralLocal.gettelefonomovil()!=null && !informacionlaboralLocal.gettelefonomovil().equals(""))) {informacionlaboralBean.settelefonomovil(informacionlaboralLocal.gettelefonomovil());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getemail()!=null && !informacionlaboralLocal.getemail().equals(""))) {informacionlaboralBean.setemail(informacionlaboralLocal.getemail());}
			if(conDefault || (!conDefault && informacionlaboralLocal.getesactivo()!=null && !informacionlaboralLocal.getesactivo().equals(false))) {informacionlaboralBean.setesactivo(informacionlaboralLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxInformacionLaboralGenerico(Long idInformacionLaboralSeleccionado,JComboBox jComboBoxInformacionLaboral,List<InformacionLaboral> informacionlaboralsLocal)throws Exception {
		try {
			InformacionLaboral  informacionlaboralTemp=null;

			for(InformacionLaboral informacionlaboralAux:informacionlaboralsLocal) {
				if(informacionlaboralAux.getId()!=null && informacionlaboralAux.getId().equals(idInformacionLaboralSeleccionado)) {
					informacionlaboralTemp=informacionlaboralAux;
					break;
				}
			}

			jComboBoxInformacionLaboral.setSelectedItem(informacionlaboralTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxInformacionLaboralGenerico(JComboBox jComboBoxInformacionLaboral,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInformacionLaboral.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxInformacionLaboral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInformacionLaboral.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxInformacionLaboral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacionlaboral=(InformacionLaboral) informacionlaboralLogic.getInformacionLaborals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			informacionlaboral =(InformacionLaboral) informacionlaborals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!informacionlaboral.getIsNew() && !informacionlaboral.getIsChanged() && !informacionlaboral.getIsDeleted()) {
				sDescripcion=informacionlaboral.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=informacionlaboral.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoEmpresa")) {
			//sDescripcion=this.getActualTipoEmpresaForeignKeyDescripcion((Long)value);
			if(!informacionlaboral.getIsNew() && !informacionlaboral.getIsChanged() && !informacionlaboral.getIsDeleted()) {
				sDescripcion=informacionlaboral.gettipoempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=informacionlaboral.gettipoempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoRelaLabo")) {
			//sDescripcion=this.getActualTipoRelaLaboForeignKeyDescripcion((Long)value);
			if(!informacionlaboral.getIsNew() && !informacionlaboral.getIsChanged() && !informacionlaboral.getIsDeleted()) {
				sDescripcion=informacionlaboral.gettiporelalabo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRelaLaboForeignKeyDescripcion((Long)value);
				sDescripcion=informacionlaboral.gettiporelalabo_descripcion();
			}
		}

		if(sTipo.equals("TipoAreaLabo")) {
			//sDescripcion=this.getActualTipoAreaLaboForeignKeyDescripcion((Long)value);
			if(!informacionlaboral.getIsNew() && !informacionlaboral.getIsChanged() && !informacionlaboral.getIsDeleted()) {
				sDescripcion=informacionlaboral.gettipoarealabo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoAreaLaboForeignKeyDescripcion((Long)value);
				sDescripcion=informacionlaboral.gettipoarealabo_descripcion();
			}
		}

		if(sTipo.equals("TipoCargoLabo")) {
			//sDescripcion=this.getActualTipoCargoLaboForeignKeyDescripcion((Long)value);
			if(!informacionlaboral.getIsNew() && !informacionlaboral.getIsChanged() && !informacionlaboral.getIsDeleted()) {
				sDescripcion=informacionlaboral.gettipocargolabo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCargoLaboForeignKeyDescripcion((Long)value);
				sDescripcion=informacionlaboral.gettipocargolabo_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!informacionlaboral.getIsNew() && !informacionlaboral.getIsChanged() && !informacionlaboral.getIsDeleted()) {
				sDescripcion=informacionlaboral.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=informacionlaboral.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!informacionlaboral.getIsNew() && !informacionlaboral.getIsChanged() && !informacionlaboral.getIsDeleted()) {
				sDescripcion=informacionlaboral.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=informacionlaboral.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		InformacionLaboral informacionlaboralRow=new InformacionLaboral();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacionlaboralRow=(InformacionLaboral) informacionlaboralLogic.getInformacionLaborals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			informacionlaboralRow=(InformacionLaboral) informacionlaborals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualInformacionLaboral(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoInformacionLaboral && this.isPermisoNuevoInformacionLaboral));			
			this.jButtonDuplicarInformacionLaboral.setVisible((this.isVisibilidadCeldaDuplicarInformacionLaboral && this.isPermisoDuplicarInformacionLaboral));			
			this.jButtonCopiarInformacionLaboral.setVisible((this.isVisibilidadCeldaCopiarInformacionLaboral && this.isPermisoCopiarInformacionLaboral));
			this.jButtonVerFormInformacionLaboral.setVisible((this.isVisibilidadCeldaVerFormInformacionLaboral && this.isPermisoVerFormInformacionLaboral));
			
			this.jButtonAbrirOrderByInformacionLaboral.setVisible((this.isVisibilidadCeldaOrdenInformacionLaboral && this.isPermisoOrdenInformacionLaboral));			
			
			this.jButtonNuevoRelacionesInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral && this.isPermisoNuevoInformacionLaboral));			
			this.jButtonNuevoGuardarCambiosInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoInformacionLaboral && this.isPermisoNuevoInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));
			
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarInformacionLaboral.setVisible((this.isVisibilidadCeldaModificarInformacionLaboral && this.isPermisoActualizarInformacionLaboral));	
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarInformacionLaboral.setVisible((this.isVisibilidadCeldaActualizarInformacionLaboral && this.isPermisoActualizarInformacionLaboral));	
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarInformacionLaboral.setVisible((this.isVisibilidadCeldaEliminarInformacionLaboral && this.isPermisoEliminarInformacionLaboral));
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarInformacionLaboral.setVisible(this.isVisibilidadCeldaCancelarInformacionLaboral);							
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosInformacionLaboral.setVisible((this.isVisibilidadCeldaGuardarInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));			
			
			}
						
			this.jButtonGuardarCambiosTablaInformacionLaboral.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoInformacionLaboral && this.isPermisoNuevoInformacionLaboral));						
			this.jButtonDuplicarToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaDuplicarInformacionLaboral && this.isPermisoDuplicarInformacionLaboral));						
			this.jButtonCopiarToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaCopiarInformacionLaboral && this.isPermisoCopiarInformacionLaboral));			
			this.jButtonVerFormToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaVerFormInformacionLaboral && this.isPermisoVerFormInformacionLaboral));			
			this.jButtonAbrirOrderByToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaOrdenInformacionLaboral && this.isPermisoOrdenInformacionLaboral));
			this.jButtonNuevoRelacionesToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral && this.isPermisoNuevoInformacionLaboral));			
			this.jButtonNuevoGuardarCambiosToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoInformacionLaboral && this.isPermisoNuevoInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));			
			
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaModificarInformacionLaboral && this.isPermisoActualizarInformacionLaboral));	
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaActualizarInformacionLaboral  && this.isPermisoActualizarInformacionLaboral));	
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaEliminarInformacionLaboral && this.isPermisoEliminarInformacionLaboral));
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarToolBarInformacionLaboral.setVisible(this.isVisibilidadCeldaCancelarInformacionLaboral);				
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaGuardarInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarInformacionLaboral.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoInformacionLaboral && this.isPermisoNuevoInformacionLaboral));			
			this.jMenuItemDuplicarInformacionLaboral.setVisible((this.isVisibilidadCeldaDuplicarInformacionLaboral && this.isPermisoDuplicarInformacionLaboral));			
			this.jMenuItemCopiarInformacionLaboral.setVisible((this.isVisibilidadCeldaCopiarInformacionLaboral && this.isPermisoCopiarInformacionLaboral));			
			this.jMenuItemVerFormInformacionLaboral.setVisible((this.isVisibilidadCeldaVerFormInformacionLaboral && this.isPermisoVerFormInformacionLaboral));			
			this.jMenuItemAbrirOrderByInformacionLaboral.setVisible((this.isVisibilidadCeldaOrdenInformacionLaboral && this.isPermisoOrdenInformacionLaboral));			
			//this.jMenuItemMostrarOcultarInformacionLaboral.setVisible((this.isVisibilidadCeldaOrdenInformacionLaboral && this.isPermisoOrdenInformacionLaboral));
			this.jMenuItemDetalleAbrirOrderByInformacionLaboral.setVisible((this.isVisibilidadCeldaOrdenInformacionLaboral && this.isPermisoOrdenInformacionLaboral));			
			//this.jMenuItemDetalleMostrarOcultarInformacionLaboral.setVisible((this.isVisibilidadCeldaOrdenInformacionLaboral && this.isPermisoOrdenInformacionLaboral));			
			this.jMenuItemNuevoRelacionesInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral && this.isPermisoNuevoInformacionLaboral));			
			this.jMenuItemNuevoGuardarCambiosInformacionLaboral.setVisible((this.isVisibilidadCeldaNuevoInformacionLaboral && this.isPermisoNuevoInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));									
			
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemModificarInformacionLaboral.setVisible((this.isVisibilidadCeldaModificarInformacionLaboral && this.isPermisoActualizarInformacionLaboral));	
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemActualizarInformacionLaboral.setVisible((this.isVisibilidadCeldaActualizarInformacionLaboral && this.isPermisoActualizarInformacionLaboral));	
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemEliminarInformacionLaboral.setVisible((this.isVisibilidadCeldaEliminarInformacionLaboral && this.isPermisoEliminarInformacionLaboral));
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemCancelarInformacionLaboral.setVisible(this.isVisibilidadCeldaCancelarInformacionLaboral);				
			}
			
			this.jMenuItemGuardarCambiosInformacionLaboral.setVisible((this.isVisibilidadCeldaGuardarInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));						
			this.jMenuItemGuardarCambiosTablaInformacionLaboral.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoInformacionLaboral=this.jButtonNuevoInformacionLaboral.isVisible();
			this.isVisibilidadCeldaDuplicarInformacionLaboral=this.jButtonDuplicarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaCopiarInformacionLaboral=this.jButtonCopiarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaVerFormInformacionLaboral=this.jButtonVerFormInformacionLaboral.isVisible();
			
			this.isVisibilidadCeldaOrdenInformacionLaboral=this.jButtonAbrirOrderByInformacionLaboral.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=this.jButtonNuevoRelacionesInformacionLaboral.isVisible();
			this.isVisibilidadCeldaModificarInformacionLaboral=this.jButtonModificarInformacionLaboral.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			this.isVisibilidadCeldaActualizarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaEliminarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaCancelarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaGuardarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosInformacionLaboral.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=this.jButtonGuardarCambiosTablaInformacionLaboral.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoInformacionLaboral=this.jButtonNuevoToolBarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=this.jButtonNuevoRelacionesToolBarInformacionLaboral.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			this.isVisibilidadCeldaModificarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarToolBarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaActualizarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarToolBarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaEliminarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarToolBarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaCancelarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarToolBarInformacionLaboral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInformacionLaboral=this.jButtonGuardarCambiosToolBarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=this.jButtonGuardarCambiosTablaToolBarInformacionLaboral.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoInformacionLaboral=this.jMenuItemNuevoInformacionLaboral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=this.jMenuItemNuevoRelacionesInformacionLaboral.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			this.isVisibilidadCeldaModificarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemModificarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaActualizarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemActualizarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaEliminarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemEliminarInformacionLaboral.isVisible();
			this.isVisibilidadCeldaCancelarInformacionLaboral=this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemCancelarInformacionLaboral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInformacionLaboral=this.jMenuItemGuardarCambiosInformacionLaboral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=this.jMenuItemGuardarCambiosTablaInformacionLaboral.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesInformacionLaboral(Boolean esInicializar) {
		if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {			
			if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
				//if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesInformacionLaboral();
			}
			
			this.inicializarActualizarBindingBotonesManualInformacionLaboral(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualInformacionLaboral() {
		this.jButtonNuevoInformacionLaboral.setVisible(this.isPermisoNuevoInformacionLaboral);			
		this.jButtonDuplicarInformacionLaboral.setVisible(this.isPermisoDuplicarInformacionLaboral);			
		this.jButtonCopiarInformacionLaboral.setVisible(this.isPermisoCopiarInformacionLaboral);			
		this.jButtonVerFormInformacionLaboral.setVisible(this.isPermisoVerFormInformacionLaboral);			
		
		this.jButtonAbrirOrderByInformacionLaboral.setVisible(this.isPermisoOrdenInformacionLaboral);					
		
		this.jButtonNuevoRelacionesInformacionLaboral.setVisible(this.isPermisoNuevoInformacionLaboral);			
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarInformacionLaboral.setVisible(this.isPermisoActualizarInformacionLaboral);	
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarInformacionLaboral.setVisible(this.isPermisoActualizarInformacionLaboral);	
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarInformacionLaboral.setVisible(this.isPermisoEliminarInformacionLaboral);
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarInformacionLaboral.setVisible(this.isVisibilidadCeldaCancelarInformacionLaboral);						
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosInformacionLaboral.setVisible(this.isPermisoGuardarCambiosInformacionLaboral);							
		}
		
		this.jButtonGuardarCambiosTablaInformacionLaboral.setVisible(this.isPermisoActualizarInformacionLaboral);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleInformacionLaboral() {
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarInformacionLaboral.setVisible(this.isPermisoActualizarInformacionLaboral);	
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarInformacionLaboral.setVisible(this.isPermisoActualizarInformacionLaboral);	
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarInformacionLaboral.setVisible(this.isPermisoEliminarInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarInformacionLaboral.setVisible(this.isVisibilidadCeldaCancelarInformacionLaboral);							
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosInformacionLaboral.setVisible((this.isVisibilidadCeldaGuardarInformacionLaboral && this.isPermisoGuardarCambiosInformacionLaboral));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosInformacionLaboral() {
		if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualInformacionLaboral();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesInformacionLaboral() {
	}
	
	public void jTableDatosInformacionLaboralListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarInformacionLaboral(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.informacionlaboral.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteInformacionLaboralActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderInformacionLaboral=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosInformacionLaboral.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderInformacionLaboral=(TitledBorder)this.jScrollPanelDatosInformacionLaboral.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderInformacionLaboral.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteInformacionLaboralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebInformacionLaboral(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionLaboral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionLaboral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.informacionlaboralLogic.getConnexion());

				if(this.informacionlaboral.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.informacionlaboral.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionLaboral=(TitledBorder)this.jScrollPanelDatosInformacionLaboral.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderInformacionLaboral.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.informacionlaboral.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorempresaInformacionLaboralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoempresa=true;

			idTienePermisotipoempresa=this.tienePermisosUsuarioEnPaginaWebInformacionLaboral(TipoEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionLaboral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionLaboral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);

				this.tipoempresaBeanSwingJInternalFrame=new TipoEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoempresaBeanSwingJInternalFrame.getTipoEmpresaLogic().setConnexion(this.informacionlaboralLogic.getConnexion());

				if(this.informacionlaboral.getidvalorempresa()!=null) {
					this.tipoempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoempresaBeanSwingJInternalFrame.setIdActual(this.informacionlaboral.getidvalorempresa());
					this.tipoempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipoempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionLaboral=(TitledBorder)this.jScrollPanelDatosInformacionLaboral.getBorder();
				TitledBorder titledBordertipoempresa=(TitledBorder)this.tipoempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoEmpresa.getBorder();

				titledBordertipoempresa.setTitle(titledBorderInformacionLaboral.getTitle() + " -> Tipo Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorempresaInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getidvalorempresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorempresa = "+this.informacionlaboral.getidvalorempresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclienterelacionlaboralInformacionLaboralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporelalabo=true;

			idTienePermisotiporelalabo=this.tienePermisosUsuarioEnPaginaWebInformacionLaboral(TipoRelaLaboConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporelalabo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionLaboral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionLaboral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);

				this.tiporelalaboBeanSwingJInternalFrame=new TipoRelaLaboBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporelalaboBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporelalaboBeanSwingJInternalFrame.getTipoRelaLaboLogic().setConnexion(this.informacionlaboralLogic.getConnexion());

				if(this.informacionlaboral.getidvalorclienterelacionlaboral()!=null) {
					this.tiporelalaboBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporelalaboBeanSwingJInternalFrame.setIdActual(this.informacionlaboral.getidvalorclienterelacionlaboral());
					this.tiporelalaboBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporelalaboBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporelalaboBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRelaLabo();
				}

				JInternalFrameBase jinternalFrame =this.tiporelalaboBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionLaboral=(TitledBorder)this.jScrollPanelDatosInformacionLaboral.getBorder();
				TitledBorder titledBordertiporelalabo=(TitledBorder)this.tiporelalaboBeanSwingJInternalFrame.jScrollPanelDatosTipoRelaLabo.getBorder();

				titledBordertiporelalabo.setTitle(titledBorderInformacionLaboral.getTitle() + " -> Tipo Rela Labo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclienterelacionlaboralInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getidvalorclienterelacionlaboral()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclienterelacionlaboral = "+this.informacionlaboral.getidvalorclienterelacionlaboral().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientearealaboralInformacionLaboralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoarealabo=true;

			idTienePermisotipoarealabo=this.tienePermisosUsuarioEnPaginaWebInformacionLaboral(TipoAreaLaboConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoarealabo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionLaboral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionLaboral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);

				this.tipoarealaboBeanSwingJInternalFrame=new TipoAreaLaboBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoarealaboBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoarealaboBeanSwingJInternalFrame.getTipoAreaLaboLogic().setConnexion(this.informacionlaboralLogic.getConnexion());

				if(this.informacionlaboral.getidvalorclientearealaboral()!=null) {
					this.tipoarealaboBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoarealaboBeanSwingJInternalFrame.setIdActual(this.informacionlaboral.getidvalorclientearealaboral());
					this.tipoarealaboBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoarealaboBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoarealaboBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAreaLabo();
				}

				JInternalFrameBase jinternalFrame =this.tipoarealaboBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionLaboral=(TitledBorder)this.jScrollPanelDatosInformacionLaboral.getBorder();
				TitledBorder titledBordertipoarealabo=(TitledBorder)this.tipoarealaboBeanSwingJInternalFrame.jScrollPanelDatosTipoAreaLabo.getBorder();

				titledBordertipoarealabo.setTitle(titledBorderInformacionLaboral.getTitle() + " -> Tipo Area Labo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientearealaboralInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getidvalorclientearealaboral()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientearealaboral = "+this.informacionlaboral.getidvalorclientearealaboral().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientecargolaboralInformacionLaboralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocargolabo=true;

			idTienePermisotipocargolabo=this.tienePermisosUsuarioEnPaginaWebInformacionLaboral(TipoCargoLaboConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocargolabo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionLaboral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionLaboral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);

				this.tipocargolaboBeanSwingJInternalFrame=new TipoCargoLaboBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocargolaboBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocargolaboBeanSwingJInternalFrame.getTipoCargoLaboLogic().setConnexion(this.informacionlaboralLogic.getConnexion());

				if(this.informacionlaboral.getidvalorclientecargolaboral()!=null) {
					this.tipocargolaboBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocargolaboBeanSwingJInternalFrame.setIdActual(this.informacionlaboral.getidvalorclientecargolaboral());
					this.tipocargolaboBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocargolaboBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocargolaboBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCargoLabo();
				}

				JInternalFrameBase jinternalFrame =this.tipocargolaboBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionLaboral=(TitledBorder)this.jScrollPanelDatosInformacionLaboral.getBorder();
				TitledBorder titledBordertipocargolabo=(TitledBorder)this.tipocargolaboBeanSwingJInternalFrame.jScrollPanelDatosTipoCargoLabo.getBorder();

				titledBordertipocargolabo.setTitle(titledBorderInformacionLaboral.getTitle() + " -> Tipo Cargo Laboral");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientecargolaboralInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getidvalorclientecargolaboral()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientecargolaboral = "+this.informacionlaboral.getidvalorclientecargolaboral().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisInformacionLaboralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebInformacionLaboral(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionLaboral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionLaboral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.informacionlaboralLogic.getConnexion());

				if(this.informacionlaboral.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.informacionlaboral.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionLaboral=(TitledBorder)this.jScrollPanelDatosInformacionLaboral.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderInformacionLaboral.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.informacionlaboral.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidciudadInformacionLaboralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebInformacionLaboral(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionLaboral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionLaboral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.informacionlaboralLogic.getConnexion());

				if(this.informacionlaboral.getidciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.informacionlaboral.getidciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionLaboral=(TitledBorder)this.jScrollPanelDatosInformacionLaboral.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderInformacionLaboral.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidciudadInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getidciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idciudad = "+this.informacionlaboral.getidciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontiempoaInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.gettiempoa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tiempoa = "+this.informacionlaboral.gettiempoa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontiempomInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.gettiempom()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tiempom = "+this.informacionlaboral.gettiempom().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreempresaInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getnombreempresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombreempresa like '%"+this.informacionlaboral.getnombreempresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.informacionlaboral.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrereferenciaInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getnombrereferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombrereferencia like '%"+this.informacionlaboral.getnombrereferencia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.informacionlaboral.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonocodigoareaInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.gettelefonocodigoarea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonocodigoarea like '%"+this.informacionlaboral.gettelefonocodigoarea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonomovilInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.gettelefonomovil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonomovil like '%"+this.informacionlaboral.gettelefonomovil()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getemail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where email like '%"+this.informacionlaboral.getemail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoInformacionLaboralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.getinformacionlaboral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionlaboral==null) {
						this.informacionlaboral = new InformacionLaboral();
					}

					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);
				}

				if(this.informacionlaboral.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.informacionlaboral.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionLaboral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionLaboral(false,false);

			this.getInformacionLaboralsFK_IdCiudad();

			this.inicializarActualizarBindingInformacionLaboral(false);

			//if(InformacionLaboralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionLaboral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionLaboral(false,false);

			this.getInformacionLaboralsFK_IdCliente();

			this.inicializarActualizarBindingInformacionLaboral(false);

			//if(InformacionLaboralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionLaboral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionLaboral(false,false);

			this.getInformacionLaboralsFK_IdPais();

			this.inicializarActualizarBindingInformacionLaboral(false);

			//if(InformacionLaboralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionLaboral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoEmpresaInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionLaboral(false,false);

			this.getInformacionLaboralsFK_IdTipoEmpresa();

			this.inicializarActualizarBindingInformacionLaboral(false);

			//if(InformacionLaboralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionLaboral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteAreaLaboralInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionLaboral(false,false);

			this.getInformacionLaboralsFK_IdValorClienteAreaLaboral();

			this.inicializarActualizarBindingInformacionLaboral(false);

			//if(InformacionLaboralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionLaboral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteCargoLaboralInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionLaboral(false,false);

			this.getInformacionLaboralsFK_IdValorClienteCargoLaboral();

			this.inicializarActualizarBindingInformacionLaboral(false);

			//if(InformacionLaboralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionLaboral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteRelacionLaboralInformacionLaboralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionLaboral(false,false);

			this.getInformacionLaboralsFK_IdValorClienteRelacionLaboral();

			this.inicializarActualizarBindingInformacionLaboral(false);

			//if(InformacionLaboralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionLaboral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionlaboralLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameInformacionLaboral() {
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
			this.jInternalFrameDetalleFormInformacionLaboral.setVisible(false);	    			
			this.jInternalFrameDetalleFormInformacionLaboral.dispose();
			this.jInternalFrameDetalleFormInformacionLaboral=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
			this.jInternalFrameReporteDinamicoInformacionLaboral.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoInformacionLaboral.dispose();
			this.jInternalFrameReporteDinamicoInformacionLaboral=null;
		}
		
		if(this.jInternalFrameImportacionInformacionLaboral!=null) {
			this.jInternalFrameImportacionInformacionLaboral.setVisible(false);	    			
			this.jInternalFrameImportacionInformacionLaboral.dispose();
			this.jInternalFrameImportacionInformacionLaboral=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessInformacionLaboral();
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
			
			if(sTipo.equals("NuevoInformacionLaboral")) {
				jButtonNuevoInformacionLaboralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarInformacionLaboral")) {
				jButtonDuplicarInformacionLaboralActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarInformacionLaboral")) {
				jButtonCopiarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("VerFormInformacionLaboral")) {
				jButtonVerFormInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarInformacionLaboral")) {
				jButtonNuevoInformacionLaboralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarInformacionLaboral")) {
				jButtonDuplicarInformacionLaboralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoInformacionLaboral")) {
				jButtonNuevoInformacionLaboralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarInformacionLaboral")) {
				jButtonDuplicarInformacionLaboralActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesInformacionLaboral")) {
				jButtonNuevoInformacionLaboralActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarInformacionLaboral")) {
				jButtonNuevoInformacionLaboralActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesInformacionLaboral")) {
				jButtonNuevoInformacionLaboralActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarInformacionLaboral")) {
				jButtonModificarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarInformacionLaboral")) {
				jButtonModificarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarInformacionLaboral")) {
				jButtonModificarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarInformacionLaboral")) {
				jButtonActualizarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarInformacionLaboral")) {
				jButtonActualizarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarInformacionLaboral")) {
				jButtonActualizarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("EliminarInformacionLaboral")) {
				jButtonEliminarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarInformacionLaboral")) {
				jButtonEliminarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarInformacionLaboral")) {
				jButtonEliminarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("CancelarInformacionLaboral")) {
				jButtonCancelarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarInformacionLaboral")) {
				jButtonCancelarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarInformacionLaboral")) {
				jButtonCancelarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("CerrarInformacionLaboral")) {
				jButtonCerrarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarInformacionLaboral")) {
				jButtonCerrarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarInformacionLaboral")) {
				jButtonCerrarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarInformacionLaboral")) {
				jButtonMostrarOcultarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarInformacionLaboral")) {
				jButtonCancelarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosInformacionLaboral")) {
				jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarInformacionLaboral")) {
				jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarInformacionLaboral")) {
				jButtonCopiarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarInformacionLaboral")) {
				jButtonVerFormInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosInformacionLaboral")) {
				jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarInformacionLaboral")) {
				jButtonCopiarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormInformacionLaboral")) {
				jButtonVerFormInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaInformacionLaboral")) {
				jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarInformacionLaboral")) {
				jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaInformacionLaboral")) {
				jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionInformacionLaboral")) {
				jButtonRecargarInformacionInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarInformacionLaboral")) {
				jButtonRecargarInformacionInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionInformacionLaboral")) {
				jButtonRecargarInformacionInformacionLaboralActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresInformacionLaboral")) {
				jButtonAnterioresInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarInformacionLaboral")) {
				jButtonAnterioresInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreInformacionLaboral")) {
				jButtonAnterioresInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesInformacionLaboral")) {
				jButtonSiguientesInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarInformacionLaboral")) {
				jButtonSiguientesInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesInformacionLaboral")) {
				jButtonSiguientesInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByInformacionLaboral") || sTipo.equals("MenuItemDetalleAbrirOrderByInformacionLaboral")) {
				jButtonAbrirOrderByInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarInformacionLaboral") || sTipo.equals("MenuItemDetalleMostrarOcultarInformacionLaboral")) {
				jButtonMostrarOcultarInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosInformacionLaboral")) {
				jButtonNuevoGuardarCambiosInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarInformacionLaboral")) {
				jButtonNuevoGuardarCambiosInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosInformacionLaboral")) {
				jButtonNuevoGuardarCambiosInformacionLaboralActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoInformacionLaboral")) {
				jButtonCerrarReporteDinamicoInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoInformacionLaboral")) {
				jButtonGenerarReporteDinamicoInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoInformacionLaboral")) {
				
				jButtonGenerarExcelReporteDinamicoInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionInformacionLaboral")) {
				jButtonCerrarImportacionInformacionLaboralActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionInformacionLaboral")) {
				
				jButtonGenerarImportacionInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionInformacionLaboral")) {
				
				jButtonAbrirImportacionInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesInformacionLaboral")) {
				jComboBoxTiposAccionesInformacionLaboralActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesInformacionLaboral")) {
				jComboBoxTiposRelacionesInformacionLaboralActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioInformacionLaboral")) {
				jComboBoxTiposAccionesInformacionLaboralActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarInformacionLaboral")) {
				
				jComboBoxTiposSeleccionarInformacionLaboralActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralInformacionLaboral")) {
				jTextFieldValorCampoGeneralInformacionLaboralActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByInformacionLaboral")) {
				jButtonAbrirOrderByInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarInformacionLaboral")) {
				jButtonAbrirOrderByInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByInformacionLaboral")) {
				jButtonCerrarOrderByInformacionLaboralActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInformacionLaboralBusqueda")) {
				this.jButtonidInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteInformacionLaboral")) {
				this.jButtonidclienteInformacionLaboralActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteInformacionLaboralUpdate")) {
				this.jButtonidclienteInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteInformacionLaboralBusqueda")) {
				this.jButtonidclienteInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorempresaInformacionLaboralUpdate")) {
				this.jButtonidvalorempresaInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorempresaInformacionLaboralBusqueda")) {
				this.jButtonidvalorempresaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclienterelacionlaboralInformacionLaboralUpdate")) {
				this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclienterelacionlaboralInformacionLaboralBusqueda")) {
				this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientearealaboralInformacionLaboralUpdate")) {
				this.jButtonidvalorclientearealaboralInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientearealaboralInformacionLaboralBusqueda")) {
				this.jButtonidvalorclientearealaboralInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientecargolaboralInformacionLaboralUpdate")) {
				this.jButtonidvalorclientecargolaboralInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientecargolaboralInformacionLaboralBusqueda")) {
				this.jButtonidvalorclientecargolaboralInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisInformacionLaboralUpdate")) {
				this.jButtonid_paisInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisInformacionLaboralBusqueda")) {
				this.jButtonid_paisInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idciudadInformacionLaboralUpdate")) {
				this.jButtonidciudadInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idciudadInformacionLaboralBusqueda")) {
				this.jButtonidciudadInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tiempoaInformacionLaboralBusqueda")) {
				this.jButtontiempoaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tiempomInformacionLaboralBusqueda")) {
				this.jButtontiempomInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreempresaInformacionLaboralBusqueda")) {
				this.jButtonnombreempresaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionInformacionLaboralBusqueda")) {
				this.jButtondireccionInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrereferenciaInformacionLaboralBusqueda")) {
				this.jButtonnombrereferenciaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoInformacionLaboralBusqueda")) {
				this.jButtontelefonoInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonocodigoareaInformacionLaboralBusqueda")) {
				this.jButtontelefonocodigoareaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonomovilInformacionLaboralBusqueda")) {
				this.jButtontelefonomovilInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailInformacionLaboralBusqueda")) {
				this.jButtonemailInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoInformacionLaboralBusqueda")) {
				this.jButtonesactivoInformacionLaboralBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteInformacionLaboral")) {
				this.jButtonidclienteInformacionLaboralActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCiudadInformacionLaboral")) {
				this.jButtonFK_IdCiudadInformacionLaboralActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteInformacionLaboral")) {
				this.jButtonFK_IdClienteInformacionLaboralActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisInformacionLaboral")) {
				this.jButtonFK_IdPaisInformacionLaboralActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoEmpresaInformacionLaboral")) {
				this.jButtonFK_IdTipoEmpresaInformacionLaboralActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteAreaLaboralInformacionLaboral")) {
				this.jButtonFK_IdValorClienteAreaLaboralInformacionLaboralActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteCargoLaboralInformacionLaboral")) {
				this.jButtonFK_IdValorClienteCargoLaboralInformacionLaboralActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteRelacionLaboralInformacionLaboral")) {
				this.jButtonFK_IdValorClienteRelacionLaboralInformacionLaboralActionPerformed(evt);
			}
			
			;
			
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessInformacionLaboral();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionLaboralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				


				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			InformacionLaboral informacionlaboralLocal=null;
			
			if(!this.getEsControlTabla()) {
				informacionlaboralLocal=this.informacionlaboral;
			} else {
				informacionlaboralLocal=this.informacionlaboralAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
							
				
				


				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionLaboralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
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
			
			


			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionLaboralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
								
						
				


				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
								
				
				


				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionLaboralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionLaboralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionLaboralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
							
				
				


				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionLaboralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
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
			
			


			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionLaboralActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
								
				
				


				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionLaboralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionLaboralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionLaboralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosInformacionLaboral")) {
					jCheckBoxSeleccionarTodosInformacionLaboralItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosInformacionLaboral")) {
					jCheckBoxSeleccionadosInformacionLaboralItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarInformacionLaboral")) {
					
				}
				
				


				
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
												
				
				


				
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionLaboralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionLaboralActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisInformacionLaboral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral;
				}

				if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
					//classes=InformacionLaboralConstantesFunciones.getClassesRelationshipsOfInformacionLaboral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormInformacionLaboral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisInformacionLaboral")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisInformacionLaboral,"FK_IdPais");
				//recargarFormInformacionLaboralPais(jComboBoxid_paisFK_IdPaisInformacionLaboral,"FK_IdPais");
			}
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionLaboralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisInformacionLaboral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral;
				}

				if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
					//classes=InformacionLaboralConstantesFunciones.getClassesRelationshipsOfInformacionLaboral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormInformacionLaboral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisInformacionLaboral")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisInformacionLaboral,"FK_IdPais");
				//recargarFormInformacionLaboralPais(jComboBoxid_paisFK_IdPaisInformacionLaboral,"FK_IdPais");
			}
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionlaboral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionlaboral);
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisInformacionLaboral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral;
				}

				if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
					//classes=InformacionLaboralConstantesFunciones.getClassesRelationshipsOfInformacionLaboral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormInformacionLaboral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisInformacionLaboral")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisInformacionLaboral,"FK_IdPais");
				//recargarFormInformacionLaboralPais(jComboBoxid_paisFK_IdPaisInformacionLaboral,"FK_IdPais");
			}
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionLaboral.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionLaboral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionLaboralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionlaboralAnterior =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarInformacionLaboral")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosInformacionLaboralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosInformacionLaboral.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.informacionlaboral =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.informacionlaboral =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.informacionlaboral);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarInformacionLaboral")) {
				
				}
				
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarInformacionLaboral")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosInformacionLaboral.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarInformacionLaboral")) {
			
			}
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessInformacionLaboral();
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
			if(sTipo.equals("NuevoInformacionLaboral")) {
				jButtonNuevoInformacionLaboralActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarInformacionLaboral")) {
				jButtonDuplicarInformacionLaboralActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarInformacionLaboral")) {
				jButtonCopiarInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormInformacionLaboral")) {
				jButtonVerFormInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesInformacionLaboral")) {
				jButtonNuevoInformacionLaboralActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarInformacionLaboral")) {
				jButtonModificarInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarInformacionLaboral")) {
				jButtonActualizarInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarInformacionLaboral")) {
				jButtonEliminarInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaInformacionLaboral")) {
				jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarInformacionLaboral")) {
				jButtonCancelarInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarInformacionLaboral")) {
				jButtonCerrarInformacionLaboralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosInformacionLaboral")) {
				jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosInformacionLaboral")) {
				jButtonNuevoGuardarCambiosInformacionLaboralActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByInformacionLaboral")) {
				jButtonAbrirOrderByInformacionLaboralActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionInformacionLaboral")) {
				jButtonRecargarInformacionInformacionLaboralActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresInformacionLaboral")) {
				jButtonAnterioresInformacionLaboralActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesInformacionLaboral")) {
				jButtonSiguientesInformacionLaboralActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInformacionLaboralBusqueda")) {
				this.jButtonidInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteInformacionLaboral")) {
				this.jButtonidclienteInformacionLaboralActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteInformacionLaboralUpdate")) {
				this.jButtonidclienteInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteInformacionLaboralBusqueda")) {
				this.jButtonidclienteInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorempresaInformacionLaboralUpdate")) {
				this.jButtonidvalorempresaInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorempresaInformacionLaboralBusqueda")) {
				this.jButtonidvalorempresaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclienterelacionlaboralInformacionLaboralUpdate")) {
				this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclienterelacionlaboralInformacionLaboralBusqueda")) {
				this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientearealaboralInformacionLaboralUpdate")) {
				this.jButtonidvalorclientearealaboralInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientearealaboralInformacionLaboralBusqueda")) {
				this.jButtonidvalorclientearealaboralInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientecargolaboralInformacionLaboralUpdate")) {
				this.jButtonidvalorclientecargolaboralInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientecargolaboralInformacionLaboralBusqueda")) {
				this.jButtonidvalorclientecargolaboralInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisInformacionLaboralUpdate")) {
				this.jButtonid_paisInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisInformacionLaboralBusqueda")) {
				this.jButtonid_paisInformacionLaboralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idciudadInformacionLaboralUpdate")) {
				this.jButtonidciudadInformacionLaboralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idciudadInformacionLaboralBusqueda")) {
				this.jButtonidciudadInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tiempoaInformacionLaboralBusqueda")) {
				this.jButtontiempoaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tiempomInformacionLaboralBusqueda")) {
				this.jButtontiempomInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreempresaInformacionLaboralBusqueda")) {
				this.jButtonnombreempresaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionInformacionLaboralBusqueda")) {
				this.jButtondireccionInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrereferenciaInformacionLaboralBusqueda")) {
				this.jButtonnombrereferenciaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoInformacionLaboralBusqueda")) {
				this.jButtontelefonoInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonocodigoareaInformacionLaboralBusqueda")) {
				this.jButtontelefonocodigoareaInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonomovilInformacionLaboralBusqueda")) {
				this.jButtontelefonomovilInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailInformacionLaboralBusqueda")) {
				this.jButtonemailInformacionLaboralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoInformacionLaboralBusqueda")) {
				this.jButtonesactivoInformacionLaboralBusquedaActionPerformed(evt);
			}
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessInformacionLaboral();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameInformacionLaboral")) {
				closingInternalFrameInformacionLaboral();
				
			} else if(sTipo.equals("jButtonCancelarInformacionLaboral")) {
				JInternalFrameBase jInternalFrameDetalleFormInformacionLaboral = (JInternalFrameBase)evt.getSource();
	            	
	            InformacionLaboralBeanSwingJInternalFrame jInternalFrameParent=(InformacionLaboralBeanSwingJInternalFrame)jInternalFrameDetalleFormInformacionLaboral.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarInformacionLaboralActionPerformed(null);
			}
			
			InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.informacionlaboral,new Object(),this.informacionlaboralParameterGeneral,this.informacionlaboralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormInformacionLaboral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormInformacionLaboral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormInformacionLaboral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.informacionlaboral)) {
			if(!esControlTabla) {
				if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);			
				}
				
				if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualInformacionLaboral(this.informacionlaboral,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.informacionlaboralReturnGeneral=informacionlaboralLogic.procesarEventosInformacionLaboralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacionlaboralLogic.getInformacionLaborals(),this.informacionlaboral,this.informacionlaboralParameterGeneral,this.isEsNuevoInformacionLaboral,classes);//this.informacionlaboralLogic.getInformacionLaboral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanInformacionLaboral(this.informacionlaboralReturnGeneral,this.informacionlaboralBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanInformacionLaboral(classes,this.informacionlaboralReturnGeneral,this.informacionlaboralBean,false);
					}
						
					if(this.informacionlaboralReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyInformacionLaboral(this.informacionlaboralReturnGeneral.getInformacionLaboral());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioInformacionLaboral(this.informacionlaboralReturnGeneral.getInformacionLaboral());	
					}
						
					if(this.informacionlaboralReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioInformacionLaboral(this.informacionlaboralReturnGeneral.getInformacionLaboral(),classes);//this.informacionlaboralBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioInformacionLaboral(this.informacionlaboral,classes);//this.informacionlaboralBean);									
				}
			
				if(InformacionLaboralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualInformacionLaboral(this.informacionlaboral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionLaboral(this.informacionlaboral);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.informacionlaboralAnterior!=null) {
						this.informacionlaboral=this.informacionlaboralAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.informacionlaboralReturnGeneral=informacionlaboralLogic.procesarEventosInformacionLaboralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacionlaboralLogic.getInformacionLaborals(),this.informacionlaboral,this.informacionlaboralParameterGeneral,this.isEsNuevoInformacionLaboral,classes);//this.informacionlaboralLogic.getInformacionLaboral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.informacionlaboralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.informacionlaboralReturnGeneral.getInformacionLaboral(),informacionlaboralLogic.getInformacionLaborals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.informacionlaboralReturnGeneral.getInformacionLaboral(),this.informacionlaborals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosInformacionLaboral.repaint();
				
				//((AbstractTableModel) this.jTableDatosInformacionLaboral.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosInformacionLaboral();
			}
		}
	}
	
	public void actualizarVisualTableDatosInformacionLaboral() throws Exception {
		
		InformacionLaboralModel informacionlaboralModel=(InformacionLaboralModel)this.jTableDatosInformacionLaboral.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacionlaboralModel.informacionlaborals=this.informacionlaboralLogic.getInformacionLaborals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			informacionlaboralModel.informacionlaborals=this.informacionlaborals;
		}
		
		
		((InformacionLaboralModel) this.jTableDatosInformacionLaboral.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaInformacionLaboral() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getinformacionlaboralAnterior(),this.informacionlaboralLogic.getInformacionLaborals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getinformacionlaboralAnterior(),this.informacionlaborals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosInformacionLaboral();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioInformacionLaboral(InformacionLaboral informacionlaboral,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
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
										
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacionlaboral,new Object(),generalEntityParameterGeneral,this.informacionlaboralReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=InformacionLaboralConstantesFunciones.getClassesRelationshipsOfInformacionLaboral(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=InformacionLaboralConstantesFunciones.getClassesRelationshipsFromStringsOfInformacionLaboral(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormInformacionLaboral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				InformacionLaboralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacionlaboral,new Object(),generalEntityParameterGeneral,this.informacionlaboralReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioInformacionLaboral(InformacionLaboralBean informacionlaboralBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanInformacionLaboral(ArrayList<Classe> classes,InformacionLaboralReturnGeneral informacionlaboralReturnGeneral,InformacionLaboralBean informacionlaboralBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualInformacionLaboral(InformacionLaboral informacionlaboral,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.informacionlaboral)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormInformacionLaboral = new InformacionLaboralDetalleFormJInternalFrame(jDesktopPane,this.informacionlaboralSessionBean.getConGuardarRelaciones(),this.informacionlaboralSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.setVisible(false);
		this.jInternalFrameDetalleFormInformacionLaboral.setSelected(false);						
		
		this.jInternalFrameDetalleFormInformacionLaboral.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormInformacionLaboral.informacionlaboralLogic=this.informacionlaboralLogic;
		
		this.cargarCombosFrameForeignKeyInformacionLaboral("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleInformacionLaboral();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInformacionLaboral();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyInformacionLaboral("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyInformacionLaboral();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormInformacionLaboral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInformacionLaboral"));
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarInformacionLaboral.addActionListener(new ButtonActionListener(this,"ModificarInformacionLaboral"));

		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarToolBarInformacionLaboral.addActionListener(new ButtonActionListener(this,"ModificarToolBarInformacionLaboral"));
					
		this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemModificarInformacionLaboral.addActionListener(new ButtonActionListener(this,"MenuItemModificarInformacionLaboral"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarInformacionLaboral.addActionListener (new ButtonActionListener(this,"ActualizarInformacionLaboral"));
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarToolBarInformacionLaboral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInformacionLaboral"));
						
		this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemActualizarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInformacionLaboral"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarInformacionLaboral.addActionListener (new ButtonActionListener(this,"EliminarInformacionLaboral"));
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"EliminarToolBarInformacionLaboral"));
								
		this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemEliminarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInformacionLaboral"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarInformacionLaboral.addActionListener (new ButtonActionListener(this,"CancelarInformacionLaboral"));
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"CancelarToolBarInformacionLaboral"));
					
		this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemCancelarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInformacionLaboral"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemDetalleCerrarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInformacionLaboral"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionLaboral"));
		
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionLaboral"));
		
		
		
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInformacionLaboral"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionLaboralBusqueda"));
		//jButtonidclienteInformacionLaboral.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionLaboralActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboral.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboral"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorempresaInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorempresaInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorempresaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorempresaInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienterelacionlaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienterelacionlaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientearealaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientearealaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientearealaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecargolaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecargolaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonid_paisInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"id_paisInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonid_paisInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"id_paisInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidciudadInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idciudadInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidciudadInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idciudadInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontiempoaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"tiempoaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontiempomInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"tiempomInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonnombreempresaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"nombreempresaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtondireccionInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"direccionInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonnombrereferenciaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"nombrereferenciaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonoInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonoInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonocodigoareaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonomovilInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonemailInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"emailInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonesactivoInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionLaboralBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInformacionLaboral"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameInformacionLaboral"));
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInformacionLaboral"));
		}
		
		this.jTableDatosInformacionLaboral.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarInformacionLaboral"));
		
		this.jTableDatosInformacionLaboral.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarInformacionLaboral"));
		
		this.jButtonNuevoInformacionLaboral.addActionListener(new ButtonActionListener(this,"NuevoInformacionLaboral"));
		
		this.jButtonDuplicarInformacionLaboral.addActionListener(new ButtonActionListener(this,"DuplicarInformacionLaboral"));
		
		this.jButtonCopiarInformacionLaboral.addActionListener(new ButtonActionListener(this,"CopiarInformacionLaboral"));
		
		this.jButtonVerFormInformacionLaboral.addActionListener(new ButtonActionListener(this,"VerFormInformacionLaboral"));
		
		
		this.jButtonNuevoToolBarInformacionLaboral.addActionListener(new ButtonActionListener(this,"NuevoToolBarInformacionLaboral"));
			
		this.jButtonDuplicarToolBarInformacionLaboral.addActionListener(new ButtonActionListener(this,"DuplicarToolBarInformacionLaboral"));
			
		this.jMenuItemNuevoInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoInformacionLaboral"));
			
		this.jMenuItemDuplicarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarInformacionLaboral"));		
		
		
		this.jButtonNuevoRelacionesInformacionLaboral.addActionListener (new ButtonActionListener(this,"NuevoRelacionesInformacionLaboral"));
		
		
		this.jButtonNuevoRelacionesToolBarInformacionLaboral.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarInformacionLaboral"));
			
		this.jMenuItemNuevoRelacionesInformacionLaboral.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesInformacionLaboral"));		
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarInformacionLaboral.addActionListener(new ButtonActionListener(this,"ModificarInformacionLaboral"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonModificarToolBarInformacionLaboral.addActionListener(new ButtonActionListener(this,"ModificarToolBarInformacionLaboral"));
			
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemModificarInformacionLaboral.addActionListener(new ButtonActionListener(this,"MenuItemModificarInformacionLaboral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarInformacionLaboral.addActionListener (new ButtonActionListener(this,"ActualizarInformacionLaboral"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonActualizarToolBarInformacionLaboral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInformacionLaboral"));
				
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemActualizarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInformacionLaboral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarInformacionLaboral.addActionListener (new ButtonActionListener(this,"EliminarInformacionLaboral"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonEliminarToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"EliminarToolBarInformacionLaboral"));
						
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemEliminarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInformacionLaboral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarInformacionLaboral.addActionListener (new ButtonActionListener(this,"CancelarInformacionLaboral"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonCancelarToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"CancelarToolBarInformacionLaboral"));
			
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemCancelarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInformacionLaboral"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarInformacionLaboral"));		
		
		
		this.jButtonCerrarInformacionLaboral.addActionListener (new ButtonActionListener(this,"CerrarInformacionLaboral"));
		
		
		this.jButtonCerrarToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"CerrarToolBarInformacionLaboral"));
			
		this.jMenuItemCerrarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemCerrarInformacionLaboral"));
			
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jMenuItemDetalleCerrarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInformacionLaboral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosInformacionLaboral.addActionListener (new ButtonActionListener(this,"GuardarCambiosInformacionLaboral"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionLaboral"));
		}
		
		this.jButtonCopiarToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"CopiarToolBarInformacionLaboral"));
			
		this.jButtonVerFormToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"VerFormToolBarInformacionLaboral"));
		
		this.jMenuItemGuardarCambiosInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosInformacionLaboral"));
			
		this.jMenuItemCopiarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemCopiarInformacionLaboral"));		
		
		this.jMenuItemVerFormInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemVerFormInformacionLaboral"));		
		
		
		this.jButtonGuardarCambiosTablaInformacionLaboral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInformacionLaboral"));
		
		
		this.jButtonGuardarCambiosTablaToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarInformacionLaboral"));
			
		this.jMenuItemGuardarCambiosTablaInformacionLaboral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInformacionLaboral"));		
		
		
		
		this.jButtonRecargarInformacionInformacionLaboral.addActionListener (new ButtonActionListener(this,"RecargarInformacionInformacionLaboral"));
					
		this.jButtonRecargarInformacionToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarInformacionLaboral"));
		
		this.jMenuItemRecargarInformacionInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionInformacionLaboral"));		
		
		
		
		this.jButtonAnterioresInformacionLaboral.addActionListener (new ButtonActionListener(this,"AnterioresInformacionLaboral"));
		
		
		this.jButtonAnterioresToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"AnterioresToolBarInformacionLaboral"));
		
		this.jMenuItemAnterioresInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresInformacionLaboral"));		
		
		
		this.jButtonSiguientesInformacionLaboral.addActionListener (new ButtonActionListener(this,"SiguientesInformacionLaboral"));
		
		
		this.jButtonSiguientesToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"SiguientesToolBarInformacionLaboral"));
			
		this.jMenuItemSiguientesInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesInformacionLaboral"));
			
		this.jMenuItemAbrirOrderByInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByInformacionLaboral"));
			
		this.jMenuItemMostrarOcultarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarInformacionLaboral"));
			
		this.jMenuItemDetalleAbrirOrderByInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByInformacionLaboral"));
			
		this.jMenuItemDetalleMostarOcultarInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarInformacionLaboral"));		
		
		
		this.jButtonNuevoGuardarCambiosInformacionLaboral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosInformacionLaboral"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarInformacionLaboral"));
			
		this.jMenuItemNuevoGuardarCambiosInformacionLaboral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosInformacionLaboral"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosInformacionLaboral.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosInformacionLaboral"));

		this.jCheckBoxSeleccionadosInformacionLaboral.addItemListener(new CheckBoxItemListener(this,"SeleccionadosInformacionLaboral"));
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInformacionLaboral"));
		}
		
		
		this.jComboBoxTiposRelacionesInformacionLaboral.addActionListener (new ButtonActionListener(this,"TiposRelacionesInformacionLaboral"));
			
		this.jComboBoxTiposAccionesInformacionLaboral.addActionListener (new ButtonActionListener(this,"TiposAccionesInformacionLaboral"));
					
		this.jComboBoxTiposSeleccionarInformacionLaboral.addActionListener (new ButtonActionListener(this,"TiposSeleccionarInformacionLaboral"));
			
		this.jTextFieldValorCampoGeneralInformacionLaboral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralInformacionLaboral"));		
		
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionLaboralBusqueda"));
		//jButtonidclienteInformacionLaboral.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionLaboralActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboral.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboral"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorempresaInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorempresaInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorempresaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorempresaInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienterelacionlaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienterelacionlaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientearealaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientearealaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientearealaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecargolaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecargolaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonid_paisInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"id_paisInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonid_paisInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"id_paisInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidciudadInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idciudadInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidciudadInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idciudadInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontiempoaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"tiempoaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontiempomInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"tiempomInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonnombreempresaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"nombreempresaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtondireccionInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"direccionInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonnombrereferenciaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"nombrereferenciaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonoInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonoInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonocodigoareaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonomovilInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonemailInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"emailInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonesactivoInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionLaboralBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdCiudadInformacionLaboral"));

			this.jButtonFK_IdClienteInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdClienteInformacionLaboral"));

			this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboral"));

			this.jButtonFK_IdPaisInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdPaisInformacionLaboral"));

			this.jButtonFK_IdTipoEmpresaInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdTipoEmpresaInformacionLaboral"));

			this.jButtonFK_IdValorClienteAreaLaboralInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteAreaLaboralInformacionLaboral"));

			this.jButtonFK_IdValorClienteCargoLaboralInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteCargoLaboralInformacionLaboral"));

			this.jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteRelacionLaboralInformacionLaboral"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoInformacionLaboral!=null) {
				this.jInternalFrameReporteDinamicoInformacionLaboral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionLaboral"));
				this.jInternalFrameReporteDinamicoInformacionLaboral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionLaboral"));
				this.jInternalFrameReporteDinamicoInformacionLaboral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionLaboral"));
			}
			
			//this.jButtonCerrarReporteDinamicoInformacionLaboral.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionLaboral"));				
			//this.jButtonGenerarReporteDinamicoInformacionLaboral.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionLaboral"));
			//this.jButtonGenerarExcelReporteDinamicoInformacionLaboral.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionLaboral"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionInformacionLaboral!=null) {
				this.jInternalFrameImportacionInformacionLaboral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInformacionLaboral"));
				this.jInternalFrameImportacionInformacionLaboral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInformacionLaboral"));
				this.jInternalFrameImportacionInformacionLaboral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInformacionLaboral"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByInformacionLaboral.addActionListener (new ButtonActionListener(this,"AbrirOrderByInformacionLaboral"));
			
			this.jButtonAbrirOrderByToolBarInformacionLaboral.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarInformacionLaboral"));			
			
			if(this.jInternalFrameOrderByInformacionLaboral!=null) {
				this.jInternalFrameOrderByInformacionLaboral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInformacionLaboral"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionLaboral.jTabbedPaneRelacionesInformacionLaboral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInformacionLaboral"));
		
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
            		closingInternalFrameInformacionLaboral();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormInformacionLaboral.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormInformacionLaboral = (JInternalFrameBase)event.getSource();
	            	
	            InformacionLaboralBeanSwingJInternalFrame jInternalFrameParent=(InformacionLaboralBeanSwingJInternalFrame)jInternalFrameDetalleFormInformacionLaboral.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarInformacionLaboralActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosInformacionLaboral.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosInformacionLaboralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosInformacionLaboral.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosInformacionLaboral.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionLaboralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionLaboralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionLaboralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoInformacionLaboral";
		inputMap = this.jButtonNuevoInformacionLaboral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoInformacionLaboral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInformacionLaboralActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionLaboralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionLaboralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionLaboralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesInformacionLaboral";
		inputMap = this.jButtonNuevoRelacionesInformacionLaboral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesInformacionLaboral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInformacionLaboralActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarInformacionLaboral";
		inputMap = this.jButtonModificarInformacionLaboral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarInformacionLaboral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarInformacionLaboralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarInformacionLaboral";
		inputMap = this.jButtonActualizarInformacionLaboral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarInformacionLaboral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarInformacionLaboralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarInformacionLaboral";
		inputMap = this.jButtonEliminarInformacionLaboral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarInformacionLaboral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarInformacionLaboralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarInformacionLaboral";
		inputMap = this.jButtonCancelarInformacionLaboral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarInformacionLaboral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarInformacionLaboralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarInformacionLaboral";
		inputMap = this.jButtonCerrarInformacionLaboral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarInformacionLaboral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarInformacionLaboralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosInformacionLaboral";
		inputMap = this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosInformacionLaboral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonGuardarCambiosInformacionLaboral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosInformacionLaboralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosInformacionLaboral.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosInformacionLaboralItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesInformacionLaboral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesInformacionLaboralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarInformacionLaboral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarInformacionLaboralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralInformacionLaboral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralInformacionLaboralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionLaboralBusqueda"));
		//jButtonidclienteInformacionLaboral.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionLaboralActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboral.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboral"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorempresaInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorempresaInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorempresaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorempresaInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienterelacionlaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienterelacionlaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientearealaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientearealaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientearealaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecargolaboralInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecargolaboralInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonid_paisInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"id_paisInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonid_paisInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"id_paisInformacionLaboralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidciudadInformacionLaboralUpdate.addActionListener(new ButtonActionListener(this,"idciudadInformacionLaboralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonidciudadInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"idciudadInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontiempoaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"tiempoaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontiempomInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"tiempomInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonnombreempresaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"nombreempresaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtondireccionInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"direccionInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonnombrereferenciaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"nombrereferenciaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonoInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonoInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonocodigoareaInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtontelefonomovilInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonemailInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"emailInformacionLaboralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionLaboral.jButtonesactivoInformacionLaboralBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionLaboralBusqueda"));
		
		
		this.jButtonFK_IdCiudadInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdCiudadInformacionLaboral"));

		this.jButtonFK_IdClienteInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdClienteInformacionLaboral"));

		this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral.addActionListener(new ButtonActionListener(this,"idclienteInformacionLaboral"));

		this.jButtonFK_IdPaisInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdPaisInformacionLaboral"));

		this.jButtonFK_IdTipoEmpresaInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdTipoEmpresaInformacionLaboral"));

		this.jButtonFK_IdValorClienteAreaLaboralInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteAreaLaboralInformacionLaboral"));

		this.jButtonFK_IdValorClienteCargoLaboralInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteCargoLaboralInformacionLaboral"));

		this.jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteRelacionLaboralInformacionLaboral"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionInformacionLaboral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionInformacionLaboralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarInformacionLaboralActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarInformacionLaboral.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosInformacionLaboral(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
					informacionlaboralAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionLaboral informacionlaboralAux:informacionlaborals) {
					informacionlaboralAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosInformacionLaboralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInformacionLaboral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
						informacionlaboralAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionLaboral informacionlaboralAux:informacionlaborals) {
						informacionlaboralAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
					
						if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							informacionlaboralAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionLaboral informacionlaboralAux:informacionlaborals) {
						
						if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							informacionlaboralAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaInformacionLaboral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInformacionLaboral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInformacionLaboral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosInformacionLaboralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInformacionLaboral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosInformacionLaboral.getSelectedRows();
			
			InformacionLaboral informacionlaboralLocal=new InformacionLaboral();
			
			//this.seleccionarTodosInformacionLaboral(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionlaboralLocal =(InformacionLaboral) this.informacionlaboralLogic.getInformacionLaborals().toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					informacionlaboralLocal =(InformacionLaboral) this.informacionlaborals.toArray()[this.jTableDatosInformacionLaboral.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				informacionlaboralLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
						informacionlaboralAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionLaboral informacionlaboralAux:informacionlaborals) {
						informacionlaboralAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaInformacionLaboral(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInformacionLaboral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInformacionLaboral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInformacionLaboral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualInformacionLaboralItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarInformacionLaboralParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralInformacionLaboralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingInformacionLaboral(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralInformacionLaboral.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(InformacionLaboral informacionlaboralAux:this.informacionlaboralLogic.getInformacionLaborals()) {
				
						if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TIEMPOA)) {
							existe=true;
							informacionlaboralAux.settiempoa(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TIEMPOM)) {
							existe=true;
							informacionlaboralAux.settiempom(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							informacionlaboralAux.setnombreempresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							informacionlaboralAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA)) {
							existe=true;
							informacionlaboralAux.setnombrereferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							informacionlaboralAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
							existe=true;
							informacionlaboralAux.settelefonocodigoarea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							informacionlaboralAux.settelefonomovil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							informacionlaboralAux.setemail(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionLaboral informacionlaboralAux:informacionlaborals) {
					
						if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TIEMPOA)) {
							existe=true;
							informacionlaboralAux.settiempoa(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TIEMPOM)) {
							existe=true;
							informacionlaboralAux.settiempom(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							informacionlaboralAux.setnombreempresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							informacionlaboralAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA)) {
							existe=true;
							informacionlaboralAux.setnombrereferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							informacionlaboralAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
							existe=true;
							informacionlaboralAux.settelefonocodigoarea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							informacionlaboralAux.settelefonomovil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							informacionlaboralAux.setemail(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaInformacionLaboral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesInformacionLaboralActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingInformacionLaboral(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioInformacionLaboral=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesInformacionLaboral.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteInformacionLaboral) {				
					conSplash=true;//false;										
					
					//this.startProcessInformacionLaboral(conSplash);
				
					this.generarReporteInformacionLaboralsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoInformacionLaboralsSeleccionados();
				//this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInformacionLaboralsSeleccionados(false);
				//this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInformacionLaboralsSeleccionados(true);
				//this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInformacionLaboral();
				
				this.exportarInformacionLaboralsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionInformacionLaborals();
				//this.importarInformacionLaborals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInformacionLaboral();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelInformacionLaboralsSeleccionados();
				//this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Informacion Laboral", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessInformacionLaboral();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoInformacionLaboral)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyInformacionLaboral(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.setSelectedIndex(0);					
				}	
			} 			
			else if(InformacionLaboralBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteInformacionLaboral) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessInformacionLaboral(conSplash);
					
						//this.actualizarParametrosGeneralInformacionLaboral();
						
						this.generarReporteProcesoAccionInformacionLaboralsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(InformacionLaboralBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Informacion LaboralES SELECCIONADOS?", "MANTENIMIENTO DE Informacion Laboral", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessInformacionLaboral();
				
						this.actualizarParametrosGeneralInformacionLaboral();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.informacionlaboralReturnGeneral=informacionlaboralLogic.procesarAccionInformacionLaboralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.informacionlaboralLogic.getInformacionLaborals(),this.informacionlaboralParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarInformacionLaboralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralInformacionLaboral();
					
					InformacionLaboralBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarInformacionLaboralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInformacionLaboral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxTiposAccionesFormularioInformacionLaboral.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessInformacionLaboral(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesInformacionLaboralActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessInformacionLaboral();
			
			if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		
			InformacionLaboral informacionlaboral=new InformacionLaboral();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingInformacionLaboral(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesInformacionLaboral.getSelectedItem();
			
			
			
			
			informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
			//this.sTipoAccion;
			
			if(informacionlaboralsSeleccionados.size()==1) {
				for(InformacionLaboral informacionlaboralAux:informacionlaboralsSeleccionados) {
					informacionlaboral=informacionlaboralAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessInformacionLaboral();
			
      		//this.finishProcessInformacionLaboral(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarInformacionLaboralReturnGeneral() throws Exception {
		if(this.informacionlaboralReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.informacionlaboralReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.informacionlaboralReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.informacionlaboralReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.informacionlaboralReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.informacionlaboralReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingInformacionLaboral(false);
		}
		
		if(this.informacionlaboralReturnGeneral.getConRetornoLista() || this.informacionlaboralReturnGeneral.getConRetornoObjeto()) {
			if(this.informacionlaboralReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.informacionlaboralLogic.setInformacionLaborals(this.informacionlaboralReturnGeneral.getInformacionLaborals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.informacionlaboralReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.informacionlaboralLogic.setInformacionLaboral(this.informacionlaboralReturnGeneral.getInformacionLaboral());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingInformacionLaboral(false);
		}
	}
	
	public void actualizarParametrosGeneralInformacionLaboral() throws Exception {
		
		
	}
	
	public ArrayList<InformacionLaboral> getInformacionLaboralsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioInformacionLaboral) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(InformacionLaboral informacionlaboralAux:informacionlaboralLogic.getInformacionLaborals()) {
					if(informacionlaboralAux.getIsSelected()) {
						informacionlaboralsSeleccionados.add(informacionlaboralAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionLaboral informacionlaboralAux:this.informacionlaborals) {
					if(informacionlaboralAux.getIsSelected()) {
						informacionlaboralsSeleccionados.add(informacionlaboralAux);				
					}
				}
			}
			
			if(informacionlaboralsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						informacionlaboralsSeleccionados.addAll(this.informacionlaboralLogic.getInformacionLaborals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						informacionlaboralsSeleccionados.addAll(this.informacionlaborals);				
					}
				}
			}
		} else {
			informacionlaboralsSeleccionados.add(this.informacionlaboral);
		}
		
		return informacionlaboralsSeleccionados;
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
	
	public void generarReporteInformacionLaboralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalInformacionLaboralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoInformacionLaboralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInformacionLaboralsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInformacionLaboralsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Informacion Laboral",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesInformacionLaboralsSeleccionados() throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteInformacionLaborals("Todos",informacionlaboralsSeleccionados);
		
	}	
	
	public void generarReporteNormalInformacionLaboralsSeleccionados() throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteInformacionLaborals("Todos",informacionlaboralsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionInformacionLaboralsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteInformacionLaborals("Todos",informacionlaboralsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoInformacionLaboralsSeleccionados() throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		
		
		
		this.abrirInicializarFrameReporteDinamicoInformacionLaboral();
		
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoInformacionLaboral();
		
		
		//this.generarReporteInformacionLaborals("Todos",informacionlaboralsSeleccionados ,informacionlaboralImplementable,informacionlaboralImplementableHome);
	}
	
	public void mostrarImportacionInformacionLaborals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionInformacionLaboral();
		
		this.abrirFrameImportacionInformacionLaboral();		
		
			
		//this.generarReporteInformacionLaborals("Todos",informacionlaboralsSeleccionados ,informacionlaboralImplementable,informacionlaboralImplementableHome);
	}
	
	public void importarInformacionLaborals() throws Exception {		
	
	}
	
	public void exportarInformacionLaboralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelInformacionLaboralsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoInformacionLaboralsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlInformacionLaboralsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Informacion Laboral",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoInformacionLaboralsSeleccionados() throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionlaboral."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarInformacionLaboral(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(InformacionLaboral informacionlaboralAux:informacionlaboralsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarInformacionLaboral(informacionlaboralAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//informacionlaboralAux.setsDetalleGeneralEntityReporte(informacionlaboralAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarInformacionLaboral(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_TIEMPOA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_TIEMPOM;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionLaboralConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarInformacionLaboral(InformacionLaboral informacionlaboral,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=informacionlaboral.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettipoempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettiporelalabo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettipoarealabo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettipocargolabo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettiempoa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettiempom().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getnombreempresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getnombrereferencia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettelefonocodigoarea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.gettelefonomovil();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getemail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionlaboral.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelInformacionLaboralsSeleccionados() throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionlaboral.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("InformacionLaborals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelInformacionLaboral(row);				
				iRow++;
			}				
			
			for(InformacionLaboral informacionlaboralAux:informacionlaboralsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelInformacionLaboral(informacionlaboralAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlInformacionLaboralsSeleccionados() throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();		
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionlaboral.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("informacionlaborals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("informacionlaboral");
			//elementRoot.appendChild(element);
		
			for(InformacionLaboral informacionlaboralAux:informacionlaboralsSeleccionados) {
				element = document.createElement("informacionlaboral");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlInformacionLaboral(informacionlaboralAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Laboral",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelInformacionLaboral(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TIEMPOA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TIEMPOM);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionLaboralConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelInformacionLaboral(InformacionLaboral informacionlaboral,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettipoempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettiporelalabo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettipoarealabo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettipocargolabo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettiempoa());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettiempom());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getnombreempresa());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getnombrereferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettelefonocodigoarea());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.gettelefonomovil());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getemail());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionlaboral.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlInformacionLaboral(InformacionLaboral informacionlaboral,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(InformacionLaboralConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(informacionlaboral.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(InformacionLaboralConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(informacionlaboral.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcliente_descripcion = document.createElement(InformacionLaboralConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(informacionlaboral.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipoempresa_descripcion = document.createElement(InformacionLaboralConstantesFunciones.IDTIPOEMPRESA);
		elementtipoempresa_descripcion.appendChild(document.createTextNode(informacionlaboral.gettipoempresa_descripcion()));
		element.appendChild(elementtipoempresa_descripcion);

		Element elementtiporelalabo_descripcion = document.createElement(InformacionLaboralConstantesFunciones.IDTIPORELALABO);
		elementtiporelalabo_descripcion.appendChild(document.createTextNode(informacionlaboral.gettiporelalabo_descripcion()));
		element.appendChild(elementtiporelalabo_descripcion);

		Element elementtipoarealabo_descripcion = document.createElement(InformacionLaboralConstantesFunciones.IDTIPOAREALABO);
		elementtipoarealabo_descripcion.appendChild(document.createTextNode(informacionlaboral.gettipoarealabo_descripcion()));
		element.appendChild(elementtipoarealabo_descripcion);

		Element elementtipocargolabo_descripcion = document.createElement(InformacionLaboralConstantesFunciones.IDTIPOCARGOLABO);
		elementtipocargolabo_descripcion.appendChild(document.createTextNode(informacionlaboral.gettipocargolabo_descripcion()));
		element.appendChild(elementtipocargolabo_descripcion);

		Element elementpais_descripcion = document.createElement(InformacionLaboralConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(informacionlaboral.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(InformacionLaboralConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(informacionlaboral.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementtiempoa = document.createElement(InformacionLaboralConstantesFunciones.TIEMPOA);
		elementtiempoa.appendChild(document.createTextNode(informacionlaboral.gettiempoa().toString().trim()));
		element.appendChild(elementtiempoa);

		Element elementtiempom = document.createElement(InformacionLaboralConstantesFunciones.TIEMPOM);
		elementtiempom.appendChild(document.createTextNode(informacionlaboral.gettiempom().toString().trim()));
		element.appendChild(elementtiempom);

		Element elementnombreempresa = document.createElement(InformacionLaboralConstantesFunciones.NOMBREEMPRESA);
		elementnombreempresa.appendChild(document.createTextNode(informacionlaboral.getnombreempresa().trim()));
		element.appendChild(elementnombreempresa);

		Element elementdireccion = document.createElement(InformacionLaboralConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(informacionlaboral.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementnombrereferencia = document.createElement(InformacionLaboralConstantesFunciones.NOMBREREFERENCIA);
		elementnombrereferencia.appendChild(document.createTextNode(informacionlaboral.getnombrereferencia().trim()));
		element.appendChild(elementnombrereferencia);

		Element elementtelefono = document.createElement(InformacionLaboralConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(informacionlaboral.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementtelefonocodigoarea = document.createElement(InformacionLaboralConstantesFunciones.TELEFONOCODIGOAREA);
		elementtelefonocodigoarea.appendChild(document.createTextNode(informacionlaboral.gettelefonocodigoarea().trim()));
		element.appendChild(elementtelefonocodigoarea);

		Element elementtelefonomovil = document.createElement(InformacionLaboralConstantesFunciones.TELEFONOMOVIL);
		elementtelefonomovil.appendChild(document.createTextNode(informacionlaboral.gettelefonomovil().trim()));
		element.appendChild(elementtelefonomovil);

		Element elementemail = document.createElement(InformacionLaboralConstantesFunciones.EMAIL);
		elementemail.appendChild(document.createTextNode(informacionlaboral.getemail().trim()));
		element.appendChild(elementemail);

		Element elementesactivo = document.createElement(InformacionLaboralConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(informacionlaboral.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoInformacionLaboralsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<InformacionLaboral> informacionlaboralsSeleccionados=new ArrayList<InformacionLaboral>();
		
		informacionlaboralsSeleccionados=this.getInformacionLaboralsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoInformacionLaboral(informacionlaboralsSeleccionados);
		
		this.generarReporteInformacionLaborals("Todos",informacionlaboralsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoInformacionLaboral(ArrayList<InformacionLaboral> informacionlaboralsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(InformacionLaboral informacionlaboralAux:informacionlaboralsSeleccionados) {
				informacionlaboralAux.setsDetalleGeneralEntityReporte(informacionlaboralAux.toString());
			
				if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettipoempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettiporelalabo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettipoarealabo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettipocargolabo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TIEMPOA)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettiempoa().toString());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TIEMPOM)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettiempom().toString());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.getnombreempresa());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.getnombrereferencia());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettelefonocodigoarea());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.gettelefonomovil());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(informacionlaboralAux.getemail());
				}
				 else if(sTipoSeleccionar.equals(InformacionLaboralConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					informacionlaboralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(informacionlaboralAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionLaboralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesInformacionLaboral(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoInformacionLaboral=true;
				this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=true;
				this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=true;
			}
			
			this.isVisibilidadCeldaModificarInformacionLaboral=false;
			this.isVisibilidadCeldaActualizarInformacionLaboral=false;
			this.isVisibilidadCeldaEliminarInformacionLaboral=false;
			this.isVisibilidadCeldaCancelarInformacionLaboral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionLaboral=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoInformacionLaboral=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=false;
			this.isVisibilidadCeldaModificarInformacionLaboral=false;
			this.isVisibilidadCeldaActualizarInformacionLaboral=true;
			this.isVisibilidadCeldaEliminarInformacionLaboral=false;
			this.isVisibilidadCeldaCancelarInformacionLaboral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionLaboral=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoInformacionLaboral=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=false;
			this.isVisibilidadCeldaModificarInformacionLaboral=false;
			this.isVisibilidadCeldaActualizarInformacionLaboral=true;
			this.isVisibilidadCeldaEliminarInformacionLaboral=true;
			this.isVisibilidadCeldaCancelarInformacionLaboral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionLaboral=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoInformacionLaboral=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=false;
			this.isVisibilidadCeldaModificarInformacionLaboral=false;
			this.isVisibilidadCeldaActualizarInformacionLaboral=true;
			this.isVisibilidadCeldaEliminarInformacionLaboral=false;
			this.isVisibilidadCeldaCancelarInformacionLaboral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoInformacionLaboral=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=true;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=true;
			this.isVisibilidadCeldaModificarInformacionLaboral=false;
			this.isVisibilidadCeldaActualizarInformacionLaboral=false;
			this.isVisibilidadCeldaEliminarInformacionLaboral=false;
			this.isVisibilidadCeldaCancelarInformacionLaboral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionLaboral=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoInformacionLaboral=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=false;
			this.isVisibilidadCeldaActualizarInformacionLaboral=false;
			this.isVisibilidadCeldaEliminarInformacionLaboral=false;
			this.isVisibilidadCeldaCancelarInformacionLaboral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoInformacionLaboral=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=false;
			this.isVisibilidadCeldaModificarInformacionLaboral=true;
			this.isVisibilidadCeldaActualizarInformacionLaboral=false;
			this.isVisibilidadCeldaEliminarInformacionLaboral=false;
			this.isVisibilidadCeldaCancelarInformacionLaboral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionLaboral=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoInformacionLaboral=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=true;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=true;
		} else {
			this.actualizarEstadoPanelsInformacionLaboral(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarInformacionLaboral=false;
			//this.isVisibilidadCeldaVerFormInformacionLaboral=false;
			this.isVisibilidadCeldaDuplicarInformacionLaboral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!informacionlaboralSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
		} else {
			this.isVisibilidadCeldaNuevoInformacionLaboral=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionLaboral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			if(!informacionlaboralSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;												
			}
			
			this.jButtonCerrarInformacionLaboral.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesInformacionLaboral=false;
		}
		
		if(!this.permiteMantenimiento(this.informacionlaboral)) {
			this.isVisibilidadCeldaActualizarInformacionLaboral=false;
			this.isVisibilidadCeldaEliminarInformacionLaboral=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesInformacionLaboral() {
	}
	
	public void actualizarEstadoPanelsInformacionLaboral(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionInformacionLaboral!=null) {
				this.jScrollPanelDatosEdicionInformacionLaboral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionLaboral!=null) {
				this.jScrollPanelDatosInformacionLaboral.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionLaboral!=null) {
				this.jPanelPaginacionInformacionLaboral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionInformacionLaboral!=null) {
				this.jScrollPanelDatosEdicionInformacionLaboral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosInformacionLaboral!=null) {
				this.jScrollPanelDatosInformacionLaboral.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionLaboral!=null) {
				this.jPanelPaginacionInformacionLaboral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionInformacionLaboral!=null) {
				this.jScrollPanelDatosEdicionInformacionLaboral.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInformacionLaboral!=null) {
				this.jScrollPanelDatosInformacionLaboral.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionLaboral!=null) {
				this.jPanelPaginacionInformacionLaboral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionInformacionLaboral!=null) {
				this.jScrollPanelDatosEdicionInformacionLaboral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInformacionLaboral!=null) {
				this.jScrollPanelDatosInformacionLaboral.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionLaboral!=null) {
				this.jPanelPaginacionInformacionLaboral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionInformacionLaboral!=null) {
				this.jScrollPanelDatosEdicionInformacionLaboral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionLaboral!=null) {
				this.jScrollPanelDatosInformacionLaboral.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionLaboral!=null) {
				this.jPanelPaginacionInformacionLaboral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionInformacionLaboral!=null) {
				this.jScrollPanelDatosEdicionInformacionLaboral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionLaboral!=null) {
				this.jScrollPanelDatosInformacionLaboral.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionLaboral!=null) {
				this.jPanelPaginacionInformacionLaboral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionInformacionLaboral!=null) {
				this.jScrollPanelDatosEdicionInformacionLaboral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionLaboral!=null) {
				this.jScrollPanelDatosInformacionLaboral.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionLaboral!=null) {
				this.jPanelPaginacionInformacionLaboral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
					this.jTabbedPaneBusquedasInformacionLaboral.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionLaboral!=null) {
				this.jTabbedPaneBusquedasInformacionLaboral.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesInformacionLaboral!=null) {
				this.jPanelParametrosReportesInformacionLaboral.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCiudad=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdCiudadInformacionLaboral);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdClienteInformacionLaboral);}

			this.isVisibilidadFK_IdPais=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdPaisInformacionLaboral);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdTipoEmpresaInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteAreaLaboral=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteAreaLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteCargoLaboral=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteCargoLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteRelacionLaboral=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteRelacionLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoEmpresa(Boolean isParaTipoEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoEmpresaNegation=!isParaTipoEmpresa;

			this.isVisibilidadFK_IdCiudad=isParaTipoEmpresaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdCiudadInformacionLaboral);}

			this.isVisibilidadFK_IdCliente=isParaTipoEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdClienteInformacionLaboral);}

			this.isVisibilidadFK_IdPais=isParaTipoEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdPaisInformacionLaboral);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaTipoEmpresa;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdTipoEmpresaInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteAreaLaboral=isParaTipoEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorClienteAreaLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteCargoLaboral=isParaTipoEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorClienteCargoLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteRelacionLaboral=isParaTipoEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorClienteRelacionLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRelaLabo(Boolean isParaTipoRelaLabo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRelaLaboNegation=!isParaTipoRelaLabo;

			this.isVisibilidadFK_IdCiudad=isParaTipoRelaLaboNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdCiudadInformacionLaboral);}

			this.isVisibilidadFK_IdCliente=isParaTipoRelaLaboNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdClienteInformacionLaboral);}

			this.isVisibilidadFK_IdPais=isParaTipoRelaLaboNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdPaisInformacionLaboral);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaTipoRelaLaboNegation;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdTipoEmpresaInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteAreaLaboral=isParaTipoRelaLaboNegation;
			if(!this.isVisibilidadFK_IdValorClienteAreaLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteCargoLaboral=isParaTipoRelaLaboNegation;
			if(!this.isVisibilidadFK_IdValorClienteCargoLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteRelacionLaboral=isParaTipoRelaLabo;
			if(!this.isVisibilidadFK_IdValorClienteRelacionLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoAreaLabo(Boolean isParaTipoAreaLabo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoAreaLaboNegation=!isParaTipoAreaLabo;

			this.isVisibilidadFK_IdCiudad=isParaTipoAreaLaboNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdCiudadInformacionLaboral);}

			this.isVisibilidadFK_IdCliente=isParaTipoAreaLaboNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdClienteInformacionLaboral);}

			this.isVisibilidadFK_IdPais=isParaTipoAreaLaboNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdPaisInformacionLaboral);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaTipoAreaLaboNegation;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdTipoEmpresaInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteAreaLaboral=isParaTipoAreaLabo;
			if(!this.isVisibilidadFK_IdValorClienteAreaLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteCargoLaboral=isParaTipoAreaLaboNegation;
			if(!this.isVisibilidadFK_IdValorClienteCargoLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteRelacionLaboral=isParaTipoAreaLaboNegation;
			if(!this.isVisibilidadFK_IdValorClienteRelacionLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCargoLabo(Boolean isParaTipoCargoLabo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCargoLaboNegation=!isParaTipoCargoLabo;

			this.isVisibilidadFK_IdCiudad=isParaTipoCargoLaboNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdCiudadInformacionLaboral);}

			this.isVisibilidadFK_IdCliente=isParaTipoCargoLaboNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdClienteInformacionLaboral);}

			this.isVisibilidadFK_IdPais=isParaTipoCargoLaboNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdPaisInformacionLaboral);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaTipoCargoLaboNegation;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdTipoEmpresaInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteAreaLaboral=isParaTipoCargoLaboNegation;
			if(!this.isVisibilidadFK_IdValorClienteAreaLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteCargoLaboral=isParaTipoCargoLabo;
			if(!this.isVisibilidadFK_IdValorClienteCargoLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteRelacionLaboral=isParaTipoCargoLaboNegation;
			if(!this.isVisibilidadFK_IdValorClienteRelacionLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdCiudadInformacionLaboral);}

			this.isVisibilidadFK_IdCliente=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdClienteInformacionLaboral);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdPaisInformacionLaboral);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdTipoEmpresaInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteAreaLaboral=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdValorClienteAreaLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteCargoLaboral=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdValorClienteCargoLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteRelacionLaboral=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdValorClienteRelacionLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdCiudadInformacionLaboral);}

			this.isVisibilidadFK_IdCliente=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdClienteInformacionLaboral);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdPaisInformacionLaboral);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdTipoEmpresaInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteAreaLaboral=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdValorClienteAreaLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteCargoLaboral=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdValorClienteCargoLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);}

			this.isVisibilidadFK_IdValorClienteRelacionLaboral=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdValorClienteRelacionLaboral) {this.jTabbedPaneBusquedasInformacionLaboral.remove(jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);}
		}
		
	}
	
	
	
	

	public String registrarSesionInformacionLaboralParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(informacionlaboralSessionBean==null) {
				informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(informacionlaboralSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.informacionlaboralFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(InformacionLaboralConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionInformacionLaboral(true);
			//clienteSessionBean.setlidInformacionLaboralActual(this.idInformacionLaboralActual);

			informacionlaboralSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral(true);
			informacionlaboralSessionBean.setlIdInformacionLaboralActualForeignKey(this.idInformacionLaboralActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//InformacionLaboralSessionBean informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		
		if(this.informacionlaboralSessionBean==null) {
			this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		}
		
		this.informacionlaboralSessionBean.setsUltimaBusquedaInformacionLaboral(this.getsAccionBusqueda());
		this.informacionlaboralSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.informacionlaboralSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			informacionlaboralSessionBean.setidciudad(this.getidciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			informacionlaboralSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			informacionlaboralSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoEmpresa")) {
			informacionlaboralSessionBean.setidvalorempresa(this.getidvalorempresaFK_IdTipoEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteAreaLaboral")) {
			informacionlaboralSessionBean.setidvalorclientearealaboral(this.getidvalorclientearealaboralFK_IdValorClienteAreaLaboral());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteCargoLaboral")) {
			informacionlaboralSessionBean.setidvalorclientecargolaboral(this.getidvalorclientecargolaboralFK_IdValorClienteCargoLaboral());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteRelacionLaboral")) {
			informacionlaboralSessionBean.setidvalorclienterelacionlaboral(this.getidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//InformacionLaboralSessionBean informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		
		if(this.informacionlaboralSessionBean==null) {
			this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		}
		
		if(this.informacionlaboralSessionBean.getsUltimaBusquedaInformacionLaboral()!=null&&!this.informacionlaboralSessionBean.getsUltimaBusquedaInformacionLaboral().equals("")) {
			this.setsAccionBusqueda(informacionlaboralSessionBean.getsUltimaBusquedaInformacionLaboral());
			this.setiNumeroPaginacion(informacionlaboralSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(informacionlaboralSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setidciudadFK_IdCiudad(informacionlaboralSessionBean.getidciudad());
				informacionlaboralSessionBean.setidciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(informacionlaboralSessionBean.getidcliente());
				informacionlaboralSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(informacionlaboralSessionBean.getid_pais());
				informacionlaboralSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoEmpresa")) {
				this.setidvalorempresaFK_IdTipoEmpresa(informacionlaboralSessionBean.getidvalorempresa());
				informacionlaboralSessionBean.setidvalorempresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteAreaLaboral")) {
				this.setidvalorclientearealaboralFK_IdValorClienteAreaLaboral(informacionlaboralSessionBean.getidvalorclientearealaboral());
				informacionlaboralSessionBean.setidvalorclientearealaboral(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteCargoLaboral")) {
				this.setidvalorclientecargolaboralFK_IdValorClienteCargoLaboral(informacionlaboralSessionBean.getidvalorclientecargolaboral());
				informacionlaboralSessionBean.setidvalorclientecargolaboral(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteRelacionLaboral")) {
				this.setidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboral(informacionlaboralSessionBean.getidvalorclienterelacionlaboral());
				informacionlaboralSessionBean.setidvalorclienterelacionlaboral(-1L);
			}
		}
		
		this.informacionlaboralSessionBean.setsUltimaBusquedaInformacionLaboral("");
		this.informacionlaboralSessionBean.setiNumeroPaginacion(InformacionLaboralConstantesFunciones.INUMEROPAGINACION);
		this.informacionlaboralSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaInformacionLaboral(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioInformacionLaboral() {
		this.updateBorderResaltarBusquedasFormularioInformacionLaboral();
		this.updateVisibilidadBusquedasFormularioInformacionLaboral();
		this.updateHabilitarBusquedasFormularioInformacionLaboral();
	}
	
	public void updateBorderResaltarBusquedasFormularioInformacionLaboral() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasInformacionLaboral.getComponents().length>0) {
	

		if(this.informacionlaboralConstantesFunciones.resaltarFK_IdCiudadInformacionLaboral!=null) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdCiudadInformacionLaboral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdCiudadInformacionLaboral);
			}
		}

		if(this.informacionlaboralConstantesFunciones.resaltarFK_IdClienteInformacionLaboral!=null) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdClienteInformacionLaboral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdClienteInformacionLaboral);
			}
		}

		if(this.informacionlaboralConstantesFunciones.resaltarFK_IdPaisInformacionLaboral!=null) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdPaisInformacionLaboral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdPaisInformacionLaboral);
			}
		}

		if(this.informacionlaboralConstantesFunciones.resaltarFK_IdTipoEmpresaInformacionLaboral!=null) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdTipoEmpresaInformacionLaboral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdTipoEmpresaInformacionLaboral);
			}
		}

		if(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteAreaLaboralInformacionLaboral!=null) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteAreaLaboralInformacionLaboral);
			}
		}

		if(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteCargoLaboralInformacionLaboral!=null) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteCargoLaboralInformacionLaboral);
			}
		}

		if(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteRelacionLaboralInformacionLaboral!=null) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteRelacionLaboralInformacionLaboral);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioInformacionLaboral() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasInformacionLaboral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdCiudadInformacionLaboral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionlaboralConstantesFunciones.mostrarFK_IdCiudadInformacionLaboral);
			if(!this.informacionlaboralConstantesFunciones.mostrarFK_IdCiudadInformacionLaboral && index>-1) {
				this.jTabbedPaneBusquedasInformacionLaboral.remove(index);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdClienteInformacionLaboral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionlaboralConstantesFunciones.mostrarFK_IdClienteInformacionLaboral);
			if(!this.informacionlaboralConstantesFunciones.mostrarFK_IdClienteInformacionLaboral && index>-1) {
				this.jTabbedPaneBusquedasInformacionLaboral.remove(index);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdPaisInformacionLaboral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionlaboralConstantesFunciones.mostrarFK_IdPaisInformacionLaboral);
			if(!this.informacionlaboralConstantesFunciones.mostrarFK_IdPaisInformacionLaboral && index>-1) {
				this.jTabbedPaneBusquedasInformacionLaboral.remove(index);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdTipoEmpresaInformacionLaboral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionlaboralConstantesFunciones.mostrarFK_IdTipoEmpresaInformacionLaboral);
			if(!this.informacionlaboralConstantesFunciones.mostrarFK_IdTipoEmpresaInformacionLaboral && index>-1) {
				this.jTabbedPaneBusquedasInformacionLaboral.remove(index);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionlaboralConstantesFunciones.mostrarFK_IdValorClienteAreaLaboralInformacionLaboral);
			if(!this.informacionlaboralConstantesFunciones.mostrarFK_IdValorClienteAreaLaboralInformacionLaboral && index>-1) {
				this.jTabbedPaneBusquedasInformacionLaboral.remove(index);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionlaboralConstantesFunciones.mostrarFK_IdValorClienteCargoLaboralInformacionLaboral);
			if(!this.informacionlaboralConstantesFunciones.mostrarFK_IdValorClienteCargoLaboralInformacionLaboral && index>-1) {
				this.jTabbedPaneBusquedasInformacionLaboral.remove(index);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionlaboralConstantesFunciones.mostrarFK_IdValorClienteRelacionLaboralInformacionLaboral);
			if(!this.informacionlaboralConstantesFunciones.mostrarFK_IdValorClienteRelacionLaboralInformacionLaboral && index>-1) {
				this.jTabbedPaneBusquedasInformacionLaboral.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioInformacionLaboral() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasInformacionLaboral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdCiudadInformacionLaboral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionlaboralConstantesFunciones.activarFK_IdCiudadInformacionLaboral);
				this.jTabbedPaneBusquedasInformacionLaboral.setEnabledAt(index,this.informacionlaboralConstantesFunciones.activarFK_IdCiudadInformacionLaboral);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdClienteInformacionLaboral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionlaboralConstantesFunciones.activarFK_IdClienteInformacionLaboral);
				this.jTabbedPaneBusquedasInformacionLaboral.setEnabledAt(index,this.informacionlaboralConstantesFunciones.activarFK_IdClienteInformacionLaboral);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdPaisInformacionLaboral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionlaboralConstantesFunciones.activarFK_IdPaisInformacionLaboral);
				this.jTabbedPaneBusquedasInformacionLaboral.setEnabledAt(index,this.informacionlaboralConstantesFunciones.activarFK_IdPaisInformacionLaboral);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdTipoEmpresaInformacionLaboral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionlaboralConstantesFunciones.activarFK_IdTipoEmpresaInformacionLaboral);
				this.jTabbedPaneBusquedasInformacionLaboral.setEnabledAt(index,this.informacionlaboralConstantesFunciones.activarFK_IdTipoEmpresaInformacionLaboral);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionlaboralConstantesFunciones.activarFK_IdValorClienteAreaLaboralInformacionLaboral);
				this.jTabbedPaneBusquedasInformacionLaboral.setEnabledAt(index,this.informacionlaboralConstantesFunciones.activarFK_IdValorClienteAreaLaboralInformacionLaboral);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionlaboralConstantesFunciones.activarFK_IdValorClienteCargoLaboralInformacionLaboral);
				this.jTabbedPaneBusquedasInformacionLaboral.setEnabledAt(index,this.informacionlaboralConstantesFunciones.activarFK_IdValorClienteCargoLaboralInformacionLaboral);
			}

			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionlaboralConstantesFunciones.activarFK_IdValorClienteRelacionLaboralInformacionLaboral);
				this.jTabbedPaneBusquedasInformacionLaboral.setEnabledAt(index,this.informacionlaboralConstantesFunciones.activarFK_IdValorClienteRelacionLaboralInformacionLaboral);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaInformacionLaboral(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdCiudadInformacionLaboral);

			this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);

			this.informacionlaboralConstantesFunciones.setResaltarFK_IdCiudadInformacionLaboral(resaltar);

			jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdCiudadInformacionLaboral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdClienteInformacionLaboral);

			this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);

			this.informacionlaboralConstantesFunciones.setResaltarFK_IdClienteInformacionLaboral(resaltar);

			jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdClienteInformacionLaboral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdPaisInformacionLaboral);

			this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);

			this.informacionlaboralConstantesFunciones.setResaltarFK_IdPaisInformacionLaboral(resaltar);

			jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdPaisInformacionLaboral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoEmpresa")) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdTipoEmpresaInformacionLaboral);

			this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);

			this.informacionlaboralConstantesFunciones.setResaltarFK_IdTipoEmpresaInformacionLaboral(resaltar);

			jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdTipoEmpresaInformacionLaboral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteAreaLaboral")) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);

			this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);

			this.informacionlaboralConstantesFunciones.setResaltarFK_IdValorClienteAreaLaboralInformacionLaboral(resaltar);

			jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteAreaLaboralInformacionLaboral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteCargoLaboral")) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);

			this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);

			this.informacionlaboralConstantesFunciones.setResaltarFK_IdValorClienteCargoLaboralInformacionLaboral(resaltar);

			jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteCargoLaboralInformacionLaboral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteRelacionLaboral")) {
			index= this.jTabbedPaneBusquedasInformacionLaboral.indexOfComponent(this.jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);

			this.jTabbedPaneBusquedasInformacionLaboral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionLaboral.getComponent(index);

			this.informacionlaboralConstantesFunciones.setResaltarFK_IdValorClienteRelacionLaboralInformacionLaboral(resaltar);

			jPanel.setBorder(this.informacionlaboralConstantesFunciones.resaltarFK_IdValorClienteRelacionLaboralInformacionLaboral);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarInformacionLaboral.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioInformacionLaboral() throws Exception {

		if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioInformacionLaboral();
		this.updateVisibilidadResaltarControlesFormularioInformacionLaboral();
		this.updateHabilitarResaltarControlesFormularioInformacionLaboral();
		
	}
	
	public void updateBorderResaltarControlesFormularioInformacionLaboral() throws Exception {
		if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.informacionlaboralConstantesFunciones.resaltaridInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaridInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltaridclienteInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaridclienteInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltaridvalorempresaInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaridvalorempresaInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltaridvalorclienterelacionlaboralInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaridvalorclienterelacionlaboralInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltaridvalorclientearealaboralInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaridvalorclientearealaboralInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltaridvalorclientecargolaboralInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaridvalorclientecargolaboralInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltarid_paisInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltarid_paisInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltaridciudadInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaridciudadInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltartiempoaInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempoaInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltartiempoaInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltartiempomInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempomInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltartiempomInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltarnombreempresaInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombreempresaInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltarnombreempresaInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltardireccionInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextAreadireccionInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltardireccionInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltarnombrereferenciaInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombrereferenciaInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltarnombrereferenciaInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltartelefonoInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonoInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltartelefonoInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltartelefonocodigoareaInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtelefonocodigoareaInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltartelefonocodigoareaInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltartelefonomovilInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonomovilInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltartelefonomovilInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltaremailInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jTextAreaemailInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaremailInformacionLaboral);}
		if(this.informacionlaboralConstantesFunciones.resaltaresactivoInformacionLaboral!=null && this.jInternalFrameDetalleFormInformacionLaboral!=null) {this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.setBorderPainted(true);this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.setBorder(this.informacionlaboralConstantesFunciones.resaltaresactivoInformacionLaboral);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioInformacionLaboral() throws Exception {		
		if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
	
		//this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelidInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridclienteInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelidclienteInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridclienteInformacionLaboral);
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridclienteInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridvalorempresaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelidvalorempresaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridvalorempresaInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridvalorclienterelacionlaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelidvalorclienterelacionlaboralInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridvalorclienterelacionlaboralInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridvalorclientearealaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelidvalorclientearealaboralInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridvalorclientearealaboralInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridvalorclientecargolaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelidvalorclientecargolaboralInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridvalorclientecargolaboralInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrarid_paisInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelid_paisInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrarid_paisInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridciudadInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelidciudadInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraridciudadInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempoaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartiempoaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPaneltiempoaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartiempoaInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempomInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartiempomInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPaneltiempomInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartiempomInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombreempresaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrarnombreempresaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelnombreempresaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrarnombreempresaInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextAreadireccionInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrardireccionInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPaneldireccionInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrardireccionInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombrereferenciaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrarnombrereferenciaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelnombrereferenciaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrarnombrereferenciaInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonoInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartelefonoInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPaneltelefonoInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartelefonoInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtelefonocodigoareaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartelefonocodigoareaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPaneltelefonocodigoareaInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartelefonocodigoareaInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonomovilInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartelefonomovilInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPaneltelefonomovilInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostrartelefonomovilInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jTextAreaemailInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraremailInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelemailInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraremailInformacionLaboral);
		//this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraresactivoInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jPanelesactivoInformacionLaboral.setVisible(this.informacionlaboralConstantesFunciones.mostraresactivoInformacionLaboral);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioInformacionLaboral() throws Exception {
		if(this.jInternalFrameDetalleFormInformacionLaboral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInformacionLaboral!=null) {
	
		this.jInternalFrameDetalleFormInformacionLaboral.jLabelidInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaridInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidclienteInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaridclienteInformacionLaboral);
			this.jInternalFrameDetalleFormInformacionLaboral.jButtonidclienteInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaridclienteInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorempresaInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaridvalorempresaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaridvalorclienterelacionlaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientearealaboralInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaridvalorclientearealaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidvalorclientecargolaboralInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaridvalorclientecargolaboralInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxid_paisInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activarid_paisInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jComboBoxidciudadInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaridciudadInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempoaInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activartiempoaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtiempomInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activartiempomInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombreempresaInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activarnombreempresaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreadireccionInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activardireccionInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreanombrereferenciaInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activarnombrereferenciaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonoInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activartelefonoInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextFieldtelefonocodigoareaInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activartelefonocodigoareaInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreatelefonomovilInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activartelefonomovilInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jTextAreaemailInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaremailInformacionLaboral);
		this.jInternalFrameDetalleFormInformacionLaboral.jCheckBoxesactivoInformacionLaboral.setEnabled(this.informacionlaboralConstantesFunciones.activaresactivoInformacionLaboral);
		}
	}
	
		
}