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

import com.bydan.erp.cartera.util.ClienteArchivoConstantesFunciones;
import com.bydan.erp.cartera.util.ClienteArchivoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ClienteArchivoParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ClienteArchivoBean;
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
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

	
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("unused")
public class ClienteArchivoBeanSwingJInternalFrame extends ClienteArchivoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ClienteArchivoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ClienteArchivo> clientearchivoValidator = new ClassValidator<ClienteArchivo>(ClienteArchivo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ClienteArchivo clientearchivo;	
	public ClienteArchivo clientearchivoAux;
	public ClienteArchivo clientearchivoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ClienteArchivo clientearchivoTotales;
	public Long idClienteArchivoActual;
	public Long iIdNuevoClienteArchivo=0L;
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

	public String sFinalQueryComboTipoArchivo="";

	public List<TipoArchivo> tipoarchivosForeignKey;

	public List<TipoArchivo> gettipoarchivosForeignKey() {
		return tipoarchivosForeignKey;
	}

	public void settipoarchivosForeignKey(List<TipoArchivo> tipoarchivosForeignKey) {
		this.tipoarchivosForeignKey = tipoarchivosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoArchivo tipoarchivoForeignKey;

	public TipoArchivo gettipoarchivoForeignKey() {
		return tipoarchivoForeignKey;
	}

	public void settipoarchivoForeignKey(TipoArchivo tipoarchivoForeignKey) {
		this.tipoarchivoForeignKey = tipoarchivoForeignKey;
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
	
	public Boolean isPermisoTodoClienteArchivo;
	public Boolean isPermisoNuevoClienteArchivo;
	public Boolean isPermisoActualizarClienteArchivo;
	public Boolean isPermisoActualizarOriginalClienteArchivo;
	public Boolean isPermisoEliminarClienteArchivo;
	public Boolean isPermisoGuardarCambiosClienteArchivo;
	public Boolean isPermisoConsultaClienteArchivo;
	public Boolean isPermisoBusquedaClienteArchivo;
	public Boolean isPermisoReporteClienteArchivo;
	public Boolean isPermisoPaginacionMedioClienteArchivo;
	public Boolean isPermisoPaginacionAltoClienteArchivo;
	public Boolean isPermisoPaginacionTodoClienteArchivo;
	public Boolean isPermisoCopiarClienteArchivo;
	public Boolean isPermisoVerFormClienteArchivo;
	public Boolean isPermisoDuplicarClienteArchivo;
	public Boolean isPermisoOrdenClienteArchivo;
	
	
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
	
	public ClienteArchivoParameterReturnGeneral clientearchivoReturnGeneral;
	public ClienteArchivoParameterReturnGeneral clientearchivoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoClienteArchivo=false;
	public Boolean esParaAccionDesdeFormularioClienteArchivo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ClienteArchivoSessionBeanAdditional clientearchivoSessionBeanAdditional=null;
	
	public ClienteArchivoSessionBeanAdditional getClienteArchivoSessionBeanAdditional() {
		return this.clientearchivoSessionBeanAdditional;
	}
	
	public void setClienteArchivoSessionBeanAdditional(ClienteArchivoSessionBeanAdditional clientearchivoSessionBeanAdditional) {
		try {
			this.clientearchivoSessionBeanAdditional=clientearchivoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ClienteArchivoBeanSwingJInternalFrameAdditional clientearchivoBeanSwingJInternalFrameAdditional=null;
	//public class ClienteArchivoBeanSwingJInternalFrame
	
	public ClienteArchivoBeanSwingJInternalFrameAdditional getClienteArchivoBeanSwingJInternalFrameAdditional() {
		return this.clientearchivoBeanSwingJInternalFrameAdditional;
	}
	
	public void setClienteArchivoBeanSwingJInternalFrameAdditional(ClienteArchivoBeanSwingJInternalFrameAdditional clientearchivoBeanSwingJInternalFrameAdditional) {
		try {
			this.clientearchivoBeanSwingJInternalFrameAdditional=clientearchivoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ClienteArchivoLogic clientearchivoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ClienteArchivo clientearchivoBean;
	public ClienteArchivoConstantesFunciones clientearchivoConstantesFunciones;
	//public ClienteArchivoParameterReturnGeneral clientearchivoReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public TipoArchivoLogic tipoarchivoLogic;
	
	//PARAMETROS
	
	
	//public List<ClienteArchivo> clientearchivos;	
	//public List<ClienteArchivo> clientearchivosEliminados;
	//public List<ClienteArchivo> clientearchivosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoClienteArchivo=false;
	public Boolean isVisibilidadCeldaDuplicarClienteArchivo=true;
	public Boolean isVisibilidadCeldaCopiarClienteArchivo=true;
	public Boolean isVisibilidadCeldaVerFormClienteArchivo=true;
	public Boolean isVisibilidadCeldaOrdenClienteArchivo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
	public Boolean isVisibilidadCeldaModificarClienteArchivo=false;
	public Boolean isVisibilidadCeldaActualizarClienteArchivo=false;
	public Boolean isVisibilidadCeldaEliminarClienteArchivo=false;
	public Boolean isVisibilidadCeldaCancelarClienteArchivo=false;
	public Boolean isVisibilidadCeldaGuardarClienteArchivo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosClienteArchivo=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdTipoArchivo=false;
	
	public Long getiIdNuevoClienteArchivo() {
		return this.iIdNuevoClienteArchivo;
	}

	public void setiIdNuevoClienteArchivo(Long iIdNuevoClienteArchivo) {
		this.iIdNuevoClienteArchivo = iIdNuevoClienteArchivo;
	}
	
	public Long getidClienteArchivoActual() {
		return this.idClienteArchivoActual;
	}

	public void setidClienteArchivoActual(Long idClienteArchivoActual) {
		this.idClienteArchivoActual = idClienteArchivoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ClienteArchivo getclientearchivo() {
		return this.clientearchivo;
	}

	public void setclientearchivo(ClienteArchivo clientearchivo) {
		this.clientearchivo = clientearchivo;
	}
	
	public ClienteArchivo getclientearchivoAux() {
		return this.clientearchivoAux;
	}

	public void setclientearchivoAux(ClienteArchivo clientearchivoAux) {
		this.clientearchivoAux = clientearchivoAux;
	}				
	
	public ClienteArchivo getclientearchivoAnterior() {
		return this.clientearchivoAnterior;
	}

	public void setclientearchivoAnterior(ClienteArchivo clientearchivoAnterior) {
		this.clientearchivoAnterior = clientearchivoAnterior;
	}	
	
	public ClienteArchivo getclientearchivoTotales() {
		return this.clientearchivoTotales;
	}

	public void setclientearchivoTotales(ClienteArchivo clientearchivoTotales) {
		this.clientearchivoTotales = clientearchivoTotales;
	}	
	
	public ClienteArchivo getclientearchivoBean() {
		return this.clientearchivoBean;
	}

	public void setclientearchivoBean(ClienteArchivo clientearchivoBean) {
		this.clientearchivoBean = clientearchivoBean;
	}	
	
	public ClienteArchivoParameterReturnGeneral getclientearchivoReturnGeneral() {
		return this.clientearchivoReturnGeneral;
	}

	public void setclientearchivoReturnGeneral(ClienteArchivoParameterReturnGeneral clientearchivoReturnGeneral) {
		this.clientearchivoReturnGeneral = clientearchivoReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_tipo_archivoFK_IdTipoArchivo=-1L;

	public Long getid_tipo_archivoFK_IdTipoArchivo() {
		return this.id_tipo_archivoFK_IdTipoArchivo;
	}

	public void setid_tipo_archivoFK_IdTipoArchivo(Long id_tipo_archivoFK_IdTipoArchivo) {
		this.id_tipo_archivoFK_IdTipoArchivo = id_tipo_archivoFK_IdTipoArchivo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ClienteArchivoLogic getClienteArchivoLogic()	{		
		return clientearchivoLogic;
	}

	public void setClienteArchivoLogic(ClienteArchivoLogic clientearchivoLogic) {
		this.clientearchivoLogic = clientearchivoLogic;
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
	
	public Boolean getIsEsNuevoClienteArchivo() {
		return isEsNuevoClienteArchivo;
	}

	public void setIsEsNuevoClienteArchivo(Boolean isEsNuevoClienteArchivo) {
		this.isEsNuevoClienteArchivo = isEsNuevoClienteArchivo;
	}

	public Boolean getEsParaAccionDesdeFormularioClienteArchivo() {
		return esParaAccionDesdeFormularioClienteArchivo;
	}
	
	public void setEsParaAccionDesdeFormularioClienteArchivo(Boolean esParaAccionDesdeFormularioClienteArchivo) {
		this.esParaAccionDesdeFormularioClienteArchivo = esParaAccionDesdeFormularioClienteArchivo;
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

			if(this.clientearchivoSessionBean==null) {
				this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
			}

			if(!this.clientearchivoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(clientearchivoSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoArchivosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoarchivosForeignKey=new ArrayList<TipoArchivo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoArchivoLogic tipoarchivoLogic=new TipoArchivoLogic();

			tipoarchivoLogic.getTipoArchivoDataAccess().setIsForForeingKeyData(true);

			if(this.clientearchivoSessionBean==null) {
				this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
			}

			if(!this.clientearchivoSessionBean.getisBusquedaDesdeForeignKeySesionTipoArchivo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarchivoLogic.getTipoArchivoDataAccess().setIsForForeingKeyData(true);

					tipoarchivoLogic.getTodosTipoArchivosWithConnection(sFinalQuery,new Pagination());

					this.tipoarchivosForeignKey=tipoarchivoLogic.getTipoArchivos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoArchivo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarchivoLogic.getEntityWithConnection(clientearchivoSessionBean.getlidTipoArchivoActual());
					this.tipoarchivosForeignKey.add(tipoarchivoLogic.getTipoArchivo());
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

					if(this.clientearchivo!=null) {
						this.clientearchivo.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
						this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteClienteArchivo.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
						if(this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.getItemCount()>0) {
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteClienteArchivo!=null) {
						jComboBoxid_clienteFK_IdClienteClienteArchivo.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteClienteArchivo!=null) {
							//jComboBoxid_clienteFK_IdClienteClienteArchivo.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteClienteArchivo.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteClienteArchivo.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteClienteArchivoGenerico)throws Exception
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
				jComboBoxid_clienteClienteArchivoGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteClienteArchivoGenerico!=null && jComboBoxid_clienteClienteArchivoGenerico.getItemCount()>0) {
					jComboBoxid_clienteClienteArchivoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoArchivoForeignKey(Long idTipoArchivoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoArchivo  tipoarchivoTemp=null;

			for(TipoArchivo tipoarchivoAux:tipoarchivosForeignKey) {
				if(tipoarchivoAux.getId()!=null && tipoarchivoAux.getId().equals(idTipoArchivoSeleccionado)) {
					tipoarchivoTemp=tipoarchivoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoarchivoTemp!=null) {

					if(this.clientearchivo!=null) {
						this.clientearchivo.setTipoArchivo(tipoarchivoTemp);
					}

					if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
						this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setSelectedItem(tipoarchivoTemp);
					}
				} else {
					//jComboBoxid_tipo_archivoClienteArchivo.setSelectedItem(tipoarchivoTemp);
					if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
						if(this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.getItemCount()>0) {
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoArchivo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoarchivoTemp!=null && jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo!=null) {
						jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setSelectedItem(tipoarchivoTemp);
					} else {
						if(jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo!=null) {
							//jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setSelectedItem(tipoarchivoTemp);
							if(jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.getItemCount()>0) {
								jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setSelectedIndex(0);
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

	public String getActualTipoArchivoForeignKeyDescripcion(Long idTipoArchivoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoArchivo  tipoarchivoTemp=null;

			for(TipoArchivo tipoarchivoAux:tipoarchivosForeignKey) {
				if(tipoarchivoAux.getId()!=null && tipoarchivoAux.getId().equals(idTipoArchivoSeleccionado)) {
					tipoarchivoTemp=tipoarchivoAux;
					break;
				}
			}


			sDescripcion=TipoArchivoConstantesFunciones.getTipoArchivoDescripcion(tipoarchivoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoArchivoForeignKeyGenerico(Long idTipoArchivoSeleccionado,JComboBox jComboBoxid_tipo_archivoClienteArchivoGenerico)throws Exception
	{
		try
		{
			TipoArchivo  tipoarchivoTemp=null;

			for(TipoArchivo tipoarchivoAux:tipoarchivosForeignKey) {
				if(tipoarchivoAux.getId()!=null && tipoarchivoAux.getId().equals(idTipoArchivoSeleccionado)) {
					tipoarchivoTemp=tipoarchivoAux;
					break;
				}
			}

			if(tipoarchivoTemp!=null) {
				jComboBoxid_tipo_archivoClienteArchivoGenerico.setSelectedItem(tipoarchivoTemp);
			} else {
				if(jComboBoxid_tipo_archivoClienteArchivoGenerico!=null && jComboBoxid_tipo_archivoClienteArchivoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_archivoClienteArchivoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ClienteArchivo clientearchivo,JComboBox jComboBoxid_clienteClienteArchivoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteClienteArchivoGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteClienteArchivoGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				clientearchivo.setid_cliente(clienteAux.getId());
				clientearchivo.setcliente_descripcion(ClienteArchivoConstantesFunciones.getClienteDescripcion(clienteAux));
				clientearchivo.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoArchivoForeignKey(ClienteArchivo clientearchivo,JComboBox jComboBoxid_tipo_archivoClienteArchivoGenerico)throws Exception
	{
		try
		{
			TipoArchivo  tipoarchivoAux=new TipoArchivo();

			if(jComboBoxid_tipo_archivoClienteArchivoGenerico==null) {
				tipoarchivoAux=(TipoArchivo)this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.getSelectedItem();
			} else {
				tipoarchivoAux=(TipoArchivo)jComboBoxid_tipo_archivoClienteArchivoGenerico.getSelectedItem();
			}

			if(tipoarchivoAux!=null && tipoarchivoAux.getId()!=null) {
				clientearchivo.setid_tipo_archivo(tipoarchivoAux.getId());
				clientearchivo.settipoarchivo_descripcion(ClienteArchivoConstantesFunciones.getTipoArchivoDescripcion(tipoarchivoAux));
				clientearchivo.setTipoArchivo(tipoarchivoAux);			}
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

					if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClienteArchivo!=null) { 
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClienteArchivo!=null) { 
					}

					if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteClienteArchivo.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteClienteArchivo.addItem(cliente);
							}
						}

						if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoArchivosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoArchivo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClienteArchivo!=null) { 
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.removeAllItems();

							for(TipoArchivo tipoarchivo:this.tipoarchivosForeignKey) {
								this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.addItem(tipoarchivo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClienteArchivo!=null) { 
					}

					if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoArchivo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.removeAllItems();

							for(TipoArchivo tipoarchivo:this.tipoarchivosForeignKey) {
								this.jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.addItem(tipoarchivo);
							}
						}

						if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteClienteArchivo.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteClienteArchivo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoArchivoForeignKey(TipoArchivo tipoarchivo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setSelectedItem(tipoarchivo);
						}
					} else {
						if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setSelectedItem(tipoarchivo);
						} else {
							this.jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesClienteArchivo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ClienteArchivoConstantesFunciones.refrescarForeignKeysDescripcionesClienteArchivo(this.clientearchivoLogic.getClienteArchivos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ClienteArchivoConstantesFunciones.refrescarForeignKeysDescripcionesClienteArchivo(this.clientearchivos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoArchivo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//clientearchivoLogic.setClienteArchivos(this.clientearchivos);
			clientearchivoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ClienteArchivoParameterReturnGeneral getClienteArchivoParameterGeneral() {
		return this.clientearchivoParameterGeneral;
	}
	
	public void setClienteArchivoParameterGeneral(ClienteArchivoParameterReturnGeneral clientearchivoParameterGeneral) {
		this.clientearchivoParameterGeneral = clientearchivoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoClienteArchivo() {
		return isPermisoTodoClienteArchivo;
	}

	public void setIsPermisoTodoClienteArchivo(Boolean isPermisoTodoClienteArchivo) {
		this.isPermisoTodoClienteArchivo = isPermisoTodoClienteArchivo;
	}

	public Boolean getIsPermisoNuevoClienteArchivo() {
		return isPermisoNuevoClienteArchivo;
	}

	public void setIsPermisoNuevoClienteArchivo(Boolean isPermisoNuevoClienteArchivo) {
		this.isPermisoNuevoClienteArchivo = isPermisoNuevoClienteArchivo;
	}

	public Boolean getIsPermisoActualizarClienteArchivo() {
		return isPermisoActualizarClienteArchivo;
	}

	public void setIsPermisoActualizarClienteArchivo(Boolean isPermisoActualizarClienteArchivo) {
		this.isPermisoActualizarClienteArchivo = isPermisoActualizarClienteArchivo;
	}

	public Boolean getIsPermisoEliminarClienteArchivo() {
		return isPermisoEliminarClienteArchivo;
	}

	public void setIsPermisoEliminarClienteArchivo(Boolean isPermisoEliminarClienteArchivo) {
		this.isPermisoEliminarClienteArchivo = isPermisoEliminarClienteArchivo;
	}

	public Boolean getIsPermisoGuardarCambiosClienteArchivo() {
		return isPermisoGuardarCambiosClienteArchivo;
	}

	public void setIsPermisoGuardarCambiosClienteArchivo(Boolean isPermisoGuardarCambiosClienteArchivo) {
		this.isPermisoGuardarCambiosClienteArchivo = isPermisoGuardarCambiosClienteArchivo;
	}
	
	public Boolean getIsPermisoConsultaClienteArchivo() {
		return isPermisoConsultaClienteArchivo;
	}

	public void setIsPermisoConsultaClienteArchivo(Boolean isPermisoConsultaClienteArchivo) {
		this.isPermisoConsultaClienteArchivo = isPermisoConsultaClienteArchivo;
	}

	public Boolean getIsPermisoBusquedaClienteArchivo() {
		return isPermisoBusquedaClienteArchivo;
	}

	public void setIsPermisoBusquedaClienteArchivo(Boolean isPermisoBusquedaClienteArchivo) {
		this.isPermisoBusquedaClienteArchivo = isPermisoBusquedaClienteArchivo;
	}

	public Boolean getIsPermisoReporteClienteArchivo() {
		return isPermisoReporteClienteArchivo;
	}

	public void setIsPermisoReporteClienteArchivo(Boolean isPermisoReporteClienteArchivo) {
		this.isPermisoReporteClienteArchivo = isPermisoReporteClienteArchivo;
	}
	
	public Boolean getIsPermisoPaginacionMedioClienteArchivo() {
		return isPermisoPaginacionMedioClienteArchivo;
	}

	public void setIsPermisoPaginacionMedioClienteArchivo(Boolean isPermisoPaginacionMedioClienteArchivo) {
		this.isPermisoPaginacionMedioClienteArchivo = isPermisoPaginacionMedioClienteArchivo;
	}
	
	public Boolean getIsPermisoPaginacionTodoClienteArchivo() {
		return isPermisoPaginacionTodoClienteArchivo;
	}

	public void setIsPermisoPaginacionTodoClienteArchivo(Boolean isPermisoPaginacionTodoClienteArchivo) {
		this.isPermisoPaginacionTodoClienteArchivo = isPermisoPaginacionTodoClienteArchivo;
	}
	
	public Boolean getIsPermisoPaginacionAltoClienteArchivo() {
		return isPermisoPaginacionAltoClienteArchivo;
	}

	public void setIsPermisoPaginacionAltoClienteArchivo(Boolean isPermisoPaginacionAltoClienteArchivo) {
		this.isPermisoPaginacionAltoClienteArchivo = isPermisoPaginacionAltoClienteArchivo;
	}
	
	public Boolean getIsPermisoCopiarClienteArchivo() {
		return isPermisoCopiarClienteArchivo;
	}

	public void setIsPermisoCopiarClienteArchivo(Boolean isPermisoCopiarClienteArchivo) {
		this.isPermisoCopiarClienteArchivo = isPermisoCopiarClienteArchivo;
	}
	
	public Boolean getIsPermisoVerFormClienteArchivo() {
		return isPermisoVerFormClienteArchivo;
	}

	public void setIsPermisoVerFormClienteArchivo(Boolean isPermisoVerFormClienteArchivo) {
		this.isPermisoVerFormClienteArchivo = isPermisoVerFormClienteArchivo;
	}
	
	public Boolean getIsPermisoDuplicarClienteArchivo() {
		return isPermisoDuplicarClienteArchivo;
	}

	public void setIsPermisoDuplicarClienteArchivo(Boolean isPermisoDuplicarClienteArchivo) {
		this.isPermisoDuplicarClienteArchivo = isPermisoDuplicarClienteArchivo;
	}
	
	public Boolean getIsPermisoOrdenClienteArchivo() {
		return isPermisoOrdenClienteArchivo;
	}

	public void setIsPermisoOrdenClienteArchivo(Boolean isPermisoOrdenClienteArchivo) {
		this.isPermisoOrdenClienteArchivo = isPermisoOrdenClienteArchivo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoClienteArchivo() {
		return isVisibilidadCeldaNuevoClienteArchivo;
	}

	public void setIsVisibilidadCeldaNuevoClienteArchivo(Boolean isVisibilidadCeldaNuevoClienteArchivo) {
		this.isVisibilidadCeldaNuevoClienteArchivo = isVisibilidadCeldaNuevoClienteArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarClienteArchivo() {
		return isVisibilidadCeldaDuplicarClienteArchivo;
	}

	public void setIsVisibilidadCeldaDuplicarClienteArchivo(Boolean isVisibilidadCeldaDuplicarClienteArchivo) {
		this.isVisibilidadCeldaDuplicarClienteArchivo = isVisibilidadCeldaDuplicarClienteArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarClienteArchivo() {
		return isVisibilidadCeldaCopiarClienteArchivo;
	}

	public void setIsVisibilidadCeldaCopiarClienteArchivo(Boolean isVisibilidadCeldaCopiarClienteArchivo) {
		this.isVisibilidadCeldaCopiarClienteArchivo = isVisibilidadCeldaCopiarClienteArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormClienteArchivo() {
		return isVisibilidadCeldaVerFormClienteArchivo;
	}

	public void setIsVisibilidadCeldaVerFormClienteArchivo(Boolean isVisibilidadCeldaVerFormClienteArchivo) {
		this.isVisibilidadCeldaVerFormClienteArchivo = isVisibilidadCeldaVerFormClienteArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenClienteArchivo() {
		return isVisibilidadCeldaOrdenClienteArchivo;
	}

	public void setIsVisibilidadCeldaOrdenClienteArchivo(Boolean isVisibilidadCeldaOrdenClienteArchivo) {
		this.isVisibilidadCeldaOrdenClienteArchivo = isVisibilidadCeldaOrdenClienteArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesClienteArchivo() {
		return isVisibilidadCeldaNuevoRelacionesClienteArchivo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesClienteArchivo(Boolean isVisibilidadCeldaNuevoRelacionesClienteArchivo) {
		this.isVisibilidadCeldaNuevoRelacionesClienteArchivo = isVisibilidadCeldaNuevoRelacionesClienteArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarClienteArchivo() {
		return isVisibilidadCeldaModificarClienteArchivo;
	}

	public void setIsVisibilidadCeldaModificarClienteArchivo(Boolean isVisibilidadCeldaModificarClienteArchivo) {
		this.isVisibilidadCeldaModificarClienteArchivo = isVisibilidadCeldaModificarClienteArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarClienteArchivo() {
		return isVisibilidadCeldaActualizarClienteArchivo;
	}

	public void setIsVisibilidadCeldaActualizarClienteArchivo(Boolean isVisibilidadCeldaActualizarClienteArchivo) {
		this.isVisibilidadCeldaActualizarClienteArchivo = isVisibilidadCeldaActualizarClienteArchivo;
	}

	public Boolean getIsVisibilidadCeldaEliminarClienteArchivo() {
		return isVisibilidadCeldaEliminarClienteArchivo;
	}

	public void setIsVisibilidadCeldaEliminarClienteArchivo(Boolean isVisibilidadCeldaEliminarClienteArchivo) {
		this.isVisibilidadCeldaEliminarClienteArchivo = isVisibilidadCeldaEliminarClienteArchivo;
	}

	public Boolean getIsVisibilidadCeldaCancelarClienteArchivo() {
		return isVisibilidadCeldaCancelarClienteArchivo;
	}

	public void setIsVisibilidadCeldaCancelarClienteArchivo(Boolean isVisibilidadCeldaCancelarClienteArchivo) {
		this.isVisibilidadCeldaCancelarClienteArchivo = isVisibilidadCeldaCancelarClienteArchivo;
	}

	public Boolean getIsVisibilidadCeldaGuardarClienteArchivo() {
		return isVisibilidadCeldaGuardarClienteArchivo;
	}

	public void setIsVisibilidadCeldaGuardarClienteArchivo(Boolean isVisibilidadCeldaGuardarClienteArchivo) {
		this.isVisibilidadCeldaGuardarClienteArchivo = isVisibilidadCeldaGuardarClienteArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosClienteArchivo() {
		return isVisibilidadCeldaGuardarCambiosClienteArchivo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosClienteArchivo(Boolean isVisibilidadCeldaGuardarCambiosClienteArchivo) {
		this.isVisibilidadCeldaGuardarCambiosClienteArchivo = isVisibilidadCeldaGuardarCambiosClienteArchivo;
	}
		
	public ClienteArchivoSessionBean getclientearchivoSessionBean() {
		return this.clientearchivoSessionBean;
	}
	
	public void setclientearchivoSessionBean(ClienteArchivoSessionBean clientearchivoSessionBean) {
		this.clientearchivoSessionBean=clientearchivoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdTipoArchivo() {
		return this.isVisibilidadFK_IdTipoArchivo;
	}

	public void setisVisibilidadFK_IdTipoArchivo(Boolean isVisibilidadFK_IdTipoArchivo) {
		this.isVisibilidadFK_IdTipoArchivo=isVisibilidadFK_IdTipoArchivo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(ClienteArchivo clientearchivo)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(clientearchivo,null);
				this.setActualParaGuardarTipoArchivoForeignKey(clientearchivo,null);
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
	
	public void bugActualizarReferenciaActual(ClienteArchivo clientearchivo,ClienteArchivo clientearchivoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalClienteArchivo(clientearchivo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		clientearchivoAux.setId(clientearchivo.getId());
		clientearchivoAux.setVersionRow(clientearchivo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessClienteArchivo();
		
			int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = clientearchivoValidator.getInvalidValues(this.clientearchivo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			clientearchivoLogic.setDatosCliente(datosCliente);
			clientearchivoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				clientearchivoAux=new  ClienteArchivo();
				
				clientearchivoAux.setIsNew(true);
				clientearchivoAux.setIsChanged(true);
				
				clientearchivoAux.setClienteArchivoOriginal(this.clientearchivo);
				
				clientearchivoAux.setId(this.clientearchivo.getId());	
				clientearchivoAux.setVersionRow(this.clientearchivo.getVersionRow());	
				clientearchivoAux.setid_cliente(this.clientearchivo.getid_cliente());	
				clientearchivoAux.setid_tipo_archivo(this.clientearchivo.getid_tipo_archivo());	
				clientearchivoAux.setnombre(this.clientearchivo.getnombre());	
				clientearchivoAux.setarchivo(this.clientearchivo.getarchivo());	
				clientearchivoAux.setdescripcion(this.clientearchivo.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.clientearchivoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(clientearchivoAux,clientearchivoLogic.getClienteArchivos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clientearchivoAux,clientearchivos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.clientearchivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clientearchivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivoLogic.saveClienteArchivos();//WithConnection
						//clientearchivoLogic.getSetVersionRowClienteArchivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.clientearchivo,clientearchivoAux);
					
					this.refrescarForeignKeysDescripcionesClienteArchivo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								clientearchivoLogic.saveClienteArchivoRelaciones(clientearchivoAux);//WithConnection
								//clientearchivoLogic.getSetVersionRowClienteArchivos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.clientearchivo,clientearchivoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.clientearchivoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(clientearchivoAux,clientearchivoLogic.getClienteArchivos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(clientearchivoAux,clientearchivos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.clientearchivo,clientearchivoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				clientearchivoAux=new  ClienteArchivo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.clientearchivoSessionBean.getEsGuardarRelacionado() 
					|| (this.clientearchivoSessionBean.getEsGuardarRelacionado() && this.clientearchivo.getId()>=0)) {
						
					clientearchivoAux.setIsNew(false);
				}
				
				clientearchivoAux.setIsDeleted(false);
			
				clientearchivoAux.setId(this.clientearchivo.getId());	
				clientearchivoAux.setVersionRow(this.clientearchivo.getVersionRow());	
				clientearchivoAux.setid_cliente(this.clientearchivo.getid_cliente());	
				clientearchivoAux.setid_tipo_archivo(this.clientearchivo.getid_tipo_archivo());	
				clientearchivoAux.setnombre(this.clientearchivo.getnombre());	
				clientearchivoAux.setarchivo(this.clientearchivo.getarchivo());	
				clientearchivoAux.setdescripcion(this.clientearchivo.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(clientearchivoAux,clientearchivoLogic.getClienteArchivos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clientearchivoAux,clientearchivos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.clientearchivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clientearchivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivoLogic.saveClienteArchivos();//WithConnection
						//clientearchivoLogic.getSetVersionRowClienteArchivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.clientearchivo,clientearchivoAux);
					
					this.refrescarForeignKeysDescripcionesClienteArchivo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								clientearchivoLogic.saveClienteArchivoRelaciones(clientearchivoAux);//WithConnection
								//clientearchivoLogic.getSetVersionRowClienteArchivos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.clientearchivo,clientearchivoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.clientearchivoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(clientearchivoAux,clientearchivoLogic.getClienteArchivos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(clientearchivoAux,clientearchivos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.clientearchivo,clientearchivoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				clientearchivoAux=new  ClienteArchivo();
				
				clientearchivoAux.setIsNew(false);
				clientearchivoAux.setIsChanged(false);
				
				clientearchivoAux.setIsDeleted(true);
				
				clientearchivoAux.setId(this.clientearchivo.getId());	
				clientearchivoAux.setVersionRow(this.clientearchivo.getVersionRow());	
				clientearchivoAux.setid_cliente(this.clientearchivo.getid_cliente());	
				clientearchivoAux.setid_tipo_archivo(this.clientearchivo.getid_tipo_archivo());	
				clientearchivoAux.setnombre(this.clientearchivo.getnombre());	
				clientearchivoAux.setarchivo(this.clientearchivo.getarchivo());	
				clientearchivoAux.setdescripcion(this.clientearchivo.getdescripcion());	
				
				if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.clientearchivoAux.getId()>=0) {	
						this.clientearchivosEliminados.add(clientearchivoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(clientearchivoAux,clientearchivoLogic.getClienteArchivos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clientearchivoAux,clientearchivos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.clientearchivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clientearchivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivoLogic.saveClienteArchivos();//WithConnection
						//clientearchivoLogic.getSetVersionRowClienteArchivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								clientearchivoLogic.saveClienteArchivoRelaciones(clientearchivoAux);//WithConnection
								//clientearchivoLogic.getSetVersionRowClienteArchivos();//WithConnection
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
							if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.clientearchivoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(clientearchivoAux,clientearchivoLogic.getClienteArchivos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(clientearchivoAux,clientearchivos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.getClienteArchivos().addAll(this.clientearchivosEliminados);
					
					clientearchivoLogic.saveClienteArchivos();//WithConnection
					//clientearchivoLogic.getSetVersionRowClienteArchivos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesClienteArchivo();
				
				this.clientearchivosEliminados= new ArrayList<ClienteArchivo>();		
			}
			
			if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cliente Archivo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.clientearchivo=clientearchivoAux;
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
      		//this.finishProcessClienteArchivo();
      	}
		
	}	
	
	public void actualizarRelaciones(ClienteArchivo clientearchivoLocal) throws Exception {
		
		if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ClienteArchivo clientearchivoLocal) throws Exception {	
		if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				clientearchivoLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoArchivoDetalleFormJInternalFrame.class)) {
				TipoArchivoBeanSwingJInternalFrame tipoarchivoBeanSwingJInternalFrameLocal=(TipoArchivoBeanSwingJInternalFrame) ((TipoArchivoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoarchivoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoArchivo(tipoarchivoBeanSwingJInternalFrameLocal.gettipoarchivo(),true);
				tipoarchivoBeanSwingJInternalFrameLocal.actualizarLista(tipoarchivoBeanSwingJInternalFrameLocal.tipoarchivo,this.tipoarchivosForeignKey);

				tipoarchivoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoarchivoBeanSwingJInternalFrameLocal.tipoarchivo);

				clientearchivoLocal.setTipoArchivo(tipoarchivoBeanSwingJInternalFrameLocal.tipoarchivo);

				this.addItemDefectoCombosForeignKeyTipoArchivo();
				this.cargarCombosFrameTipoArchivosForeignKey("Formulario");
				this.setActualTipoArchivoForeignKey(tipoarchivoBeanSwingJInternalFrameLocal.tipoarchivo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarClienteArchivoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = clientearchivoValidator.getInvalidValues(this.clientearchivo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ClienteArchivo clientearchivo,List<ClienteArchivo> clientearchivos) throws Exception {
		try	{		
			ClienteArchivoConstantesFunciones.actualizarLista(clientearchivo,clientearchivos,this.clientearchivoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ClienteArchivo clientearchivo,List<ClienteArchivo> clientearchivos) throws Exception {
		try	{			
			ClienteArchivoConstantesFunciones.actualizarSelectedLista(clientearchivo,clientearchivos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ClienteArchivo> clientearchivosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				clientearchivosLocal=this.clientearchivoLogic.getClienteArchivos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				clientearchivosLocal=this.clientearchivos;
			}
			//ARCHITECTURE
		
			for(ClienteArchivo clientearchivoLocal:clientearchivosLocal) {
				if(this.permiteMantenimiento(clientearchivoLocal) && clientearchivoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ClienteArchivoConstantesFunciones.getClienteArchivoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ClienteArchivoConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabelid_clienteClienteArchivo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteArchivoConstantesFunciones.IDTIPOARCHIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabelid_tipo_archivoClienteArchivo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteArchivoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabelnombreClienteArchivo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteArchivoConstantesFunciones.ARCHIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabelarchivoClienteArchivo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteArchivoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabeldescripcionClienteArchivo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteArchivo.jLabelid_clienteClienteArchivo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteArchivo.jLabelid_tipo_archivoClienteArchivo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteArchivo.jLabelnombreClienteArchivo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteArchivo.jLabelarchivoClienteArchivo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteArchivo.jLabeldescripcionClienteArchivo,"");
		
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
		this.iIdNuevoClienteArchivo--;	
		
		
		this.clientearchivoAux=new ClienteArchivo();
		
		this.clientearchivoAux.setId(this.iIdNuevoClienteArchivo);
		this.clientearchivoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.clientearchivoLogic.getClienteArchivos().add(this.clientearchivoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.clientearchivos.add(this.clientearchivoAux);
		}
		//ARCHITECTURE
		
		this.clientearchivo=this.clientearchivoAux;
		
		if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioClienteArchivo(this.clientearchivo);
			this.setVariablesObjetoActualToFormularioForeignKeyClienteArchivo(this.clientearchivo);
		}
				
		//this.setDefaultControlesClienteArchivo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyClienteArchivo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyClienteArchivo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyClienteArchivo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClienteArchivo(this.clientearchivoBean,this.clientearchivo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ClienteArchivoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
			classes=ClienteArchivoConstantesFunciones.getClassesRelationshipsOfClienteArchivo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.clientearchivoReturnGeneral=clientearchivoLogic.procesarEventosClienteArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clientearchivoLogic.getClienteArchivos(),this.clientearchivo,this.clientearchivoParameterGeneral,this.isEsNuevoClienteArchivo,classes);//this.clientearchivoLogic.getClienteArchivo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanClienteArchivo(this.clientearchivoReturnGeneral,this.clientearchivoBean,false);
		
		if(this.clientearchivoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyClienteArchivo(this.clientearchivoReturnGeneral.getClienteArchivo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioClienteArchivo(this.clientearchivoReturnGeneral.getClienteArchivo());
		}
		
		if(this.clientearchivoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioClienteArchivo(this.clientearchivoReturnGeneral.getClienteArchivo(),classes);//this.clientearchivoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyClienteArchivo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyClienteArchivo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.RecargarFormClienteArchivo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingClienteArchivo(false);
						
			if(clientearchivoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteArchivo();
			}
			
			this.actualizarVisualTableDatosClienteArchivo();
			
			this.jTableDatosClienteArchivo.setRowSelectionInterval(this.getIndiceNuevoClienteArchivo(), this.getIndiceNuevoClienteArchivo());
			
			this.seleccionarFilaTablaClienteArchivoActual();
						
			this.actualizarEstadoCeldasBotonesClienteArchivo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesClienteArchivo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormClienteArchivo.jTextFieldnombreClienteArchivo.setEnabled(isHabilitar && this.clientearchivoConstantesFunciones.activarnombreClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jTextAreadescripcionClienteArchivo.setEnabled(isHabilitar && this.clientearchivoConstantesFunciones.activardescripcionClienteArchivo);	
		
		this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setEnabled(isHabilitar && this.clientearchivoConstantesFunciones.activarid_clienteClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setEnabled(isHabilitar && this.clientearchivoConstantesFunciones.activarid_tipo_archivoClienteArchivo);
	};
	
	public void setDefaultControlesClienteArchivo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoClienteArchivo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.clientearchivoSessionBean.setConGuardarRelaciones(true);			
			this.clientearchivoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.setVisible(true);
			
					
		} else {
			//this.clientearchivoSessionBean.setConGuardarRelaciones(false);			
			this.clientearchivoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoClienteArchivo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
				if(clientearchivoAux.getId().equals(this.iIdNuevoClienteArchivo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteArchivo clientearchivoAux:this.clientearchivos) {
				if(clientearchivoAux.getId().equals(this.iIdNuevoClienteArchivo)) {
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
	
	public int getIndiceActualClienteArchivo(ClienteArchivo clientearchivo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
				if(clientearchivoAux.getId().equals(clientearchivo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteArchivo clientearchivoAux:this.clientearchivos) {
				if(clientearchivoAux.getId().equals(clientearchivo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalClienteArchivo(ClienteArchivo clientearchivoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
				if(clientearchivoAux.getClienteArchivoOriginal().getId().equals(clientearchivoOriginal.getId())) {
					existe=true;
					clientearchivoOriginal.setId(clientearchivoAux.getId());
					clientearchivoOriginal.setVersionRow(clientearchivoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteArchivo clientearchivoAux:this.clientearchivos) {
				if(clientearchivoAux.getClienteArchivoOriginal().getId().equals(clientearchivoOriginal.getId())) {
					existe=true;
					clientearchivoOriginal.setId(clientearchivoAux.getId());
					clientearchivoOriginal.setVersionRow(clientearchivoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosClienteArchivo(Boolean esParaCancelar) throws Exception {
		clientearchivosAux=new ArrayList<ClienteArchivo>();
		clientearchivoAux=new ClienteArchivo();
		
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
					if(clientearchivoAux.getId()<0) {
						clientearchivosAux.add(clientearchivoAux);
					}		
				}
				this.iIdNuevoClienteArchivo=0L;
				this.clientearchivoLogic.getClienteArchivos().removeAll(clientearchivosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteArchivo clientearchivoAux:this.clientearchivos) {
					if(clientearchivoAux.getId()<0) {
						clientearchivosAux.add(clientearchivoAux);
					}		
				}
				this.iIdNuevoClienteArchivo=0L;
				this.clientearchivos.removeAll(clientearchivosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoClienteArchivo 
					&& this.clientearchivoLogic.getClienteArchivos().size()>0
					) {
					clientearchivoAux=this.clientearchivoLogic.getClienteArchivos().get(this.clientearchivoLogic.getClienteArchivos().size() - 1);
				
					if(clientearchivoAux.getId()<0) {
						this.clientearchivoLogic.getClienteArchivos().remove(clientearchivoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoClienteArchivo && this.clientearchivos.size()>0) {
					clientearchivoAux=this.clientearchivos.get(this.clientearchivos.size() - 1);
				
					if(clientearchivoAux.getId()<0) {
						this.clientearchivos.remove(clientearchivoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoClienteArchivo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(clientearchivo.getId()<0) {
				this.clientearchivoLogic.getClienteArchivos().remove(this.clientearchivo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(clientearchivo.getId()<0) {
				this.clientearchivos.remove(this.clientearchivo);
			}
		}			
	}
	
	public void setEstadosInicialesClienteArchivo(List<ClienteArchivo> clientearchivosAux) throws Exception {
		ClienteArchivoConstantesFunciones.setEstadosInicialesClienteArchivo(clientearchivosAux);
	}
	
	public void setEstadosInicialesClienteArchivo(ClienteArchivo clientearchivoAux) throws Exception {
		ClienteArchivoConstantesFunciones.setEstadosInicialesClienteArchivo(clientearchivoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarClienteArchivoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesClienteArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarClienteArchivoActual()) {
				if(!this.isEsNuevoClienteArchivo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesClienteArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoClienteArchivo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarClienteArchivoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cliente Archivo ?", "MANTENIMIENTO DE Cliente Archivo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesClienteArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ClienteArchivo clientearchivo) throws Exception {
		ClienteArchivoConstantesFunciones.seleccionarAsignar(this.clientearchivo,clientearchivo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarClienteArchivo=this.isPermisoActualizarOriginalClienteArchivo;
			
			
			this.seleccionarAsignar(clientearchivo);
			
			

			idClienteActual=clientearchivo.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClienteArchivoConstantesFunciones.quitarEspaciosClienteArchivo(this.clientearchivo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesClienteArchivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.clientearchivoSessionBean.setsFuncionBusquedaRapida(this.clientearchivoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoClienteArchivo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosClienteArchivo(esParaCancelar);				
				this.cancelarNuevoClienteArchivo(esParaCancelar);								
			}
			
			this.clientearchivo=new ClienteArchivo();
			
			this.inicializarClienteArchivo();
			
			this.actualizarEstadoCeldasBotonesClienteArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarClienteArchivo() throws Exception {
		try {
			ClienteArchivoConstantesFunciones.inicializarClienteArchivo(this.clientearchivo);
			
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
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.clientearchivoLogic.getClienteArchivos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteClienteArchivos(String sAccionBusqueda,List<ClienteArchivo> clientearchivosParaReportes) throws Exception {
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
					sPathReporteFinal="ClienteArchivo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ClienteArchivoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ClienteArchivoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ClienteArchivo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cliente Archivos");		
		parameters.put("busquedapor", ClienteArchivoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceClienteArchivo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ClienteArchivoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ClienteArchivoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceClienteArchivo=new JRBeanArrayDataSource(ClienteArchivoJInternalFrame.TraerClienteArchivoBeans(clientearchivosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceClienteArchivo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ClienteArchivoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ClienteArchivoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ClienteArchivoBean.TraerClienteArchivoBeans(clientearchivosParaReportes).toArray()));
							
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
				this.generarExcelReporteClienteArchivos(sAccionBusqueda,sTipoArchivoReporte,clientearchivosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalClienteArchivos(sAccionBusqueda,sTipoArchivoReporte,clientearchivosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoClienteArchivoActionPerformed(null);
					//this.generarExcelReporteClienteArchivos(sAccionBusqueda,sTipoArchivoReporte,clientearchivosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalClienteArchivos(sAccionBusqueda,sTipoArchivoReporte,clientearchivosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesClienteArchivos(sAccionBusqueda,sTipoArchivoReporte,clientearchivosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesClienteArchivos(sAccionBusqueda,sTipoArchivoReporte,clientearchivosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteClienteArchivos(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteArchivo> clientearchivosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientearchivo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteArchivos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClienteArchivo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ClienteArchivo clientearchivo : clientearchivosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ClienteArchivoConstantesFunciones.generarExcelReporteDataClienteArchivo("NORMAL",row,workbook,clientearchivo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderClienteArchivo(String sTipo,Row row,Workbook workbook) {
		
		ClienteArchivoConstantesFunciones.generarExcelReporteHeaderClienteArchivo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalClienteArchivos(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteArchivo> clientearchivosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientearchivo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteArchivos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ClienteArchivo clientearchivo : clientearchivosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ClienteArchivoConstantesFunciones.getClienteArchivoDescripcion(clientearchivo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientearchivo.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientearchivo.gettipoarchivo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteArchivoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientearchivo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientearchivo.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesClienteArchivos(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteArchivo> clientearchivosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ClienteArchivo> clientearchivosRespaldo=null;
		
		classes=ClienteArchivoConstantesFunciones.getClassesRelationshipsOfClienteArchivo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.clientearchivoLogic.setDatosCliente(this.datosCliente);
		this.clientearchivoLogic.setDatosDeep(this.datosDeep);
		this.clientearchivoLogic.setIsConDeep(true);
		
		clientearchivosRespaldo=this.clientearchivoLogic.getClienteArchivos();
		
		this.clientearchivoLogic.setClienteArchivos(clientearchivosParaReportes);	
		this.clientearchivoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		clientearchivosParaReportes=this.clientearchivoLogic.getClienteArchivos();
		this.clientearchivoLogic.setClienteArchivos(clientearchivosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientearchivo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteArchivos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClienteArchivo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ClienteArchivo clientearchivo : clientearchivosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderClienteArchivo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ClienteArchivoConstantesFunciones.generarExcelReporteDataClienteArchivo("NORMAL",row,workbook,clientearchivo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ClienteArchivoConstantesFunciones.getClienteArchivoDescripcion(clientearchivo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoClienteArchivo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessClienteArchivo() throws Exception {		
		this.startProcessClienteArchivo(true);
	}
	
	public void startProcessClienteArchivo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasClienteArchivo ,this.jPanelParametrosReportesClienteArchivo, this.jScrollPanelDatosClienteArchivo,this.jPanelPaginacionClienteArchivo, this.jScrollPanelDatosEdicionClienteArchivo, this.jPanelAccionesClienteArchivo,this.jPanelAccionesFormularioClienteArchivo,this.jmenuBarClienteArchivo,this.jmenuBarDetalleClienteArchivo,this.jTtoolBarClienteArchivo,this.jTtoolBarDetalleClienteArchivo);		
		
		final JTabbedPane jTabbedPaneBusquedasClienteArchivo=this.jTabbedPaneBusquedasClienteArchivo; 
		
		final JPanel jPanelParametrosReportesClienteArchivo=this.jPanelParametrosReportesClienteArchivo;
		//final JScrollPane jScrollPanelDatosClienteArchivo=this.jScrollPanelDatosClienteArchivo;
		final JTable jTableDatosClienteArchivo=this.jTableDatosClienteArchivo;		
		final JPanel jPanelPaginacionClienteArchivo=this.jPanelPaginacionClienteArchivo;
		//final JScrollPane jScrollPanelDatosEdicionClienteArchivo=this.jScrollPanelDatosEdicionClienteArchivo;
		final JPanel jPanelAccionesClienteArchivo=this.jPanelAccionesClienteArchivo;
		
		JPanel jPanelCamposAuxiliarClienteArchivo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarClienteArchivo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			jPanelCamposAuxiliarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jPanelCamposClienteArchivo;
			jPanelAccionesFormularioAuxiliarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jPanelAccionesFormularioClienteArchivo;
		}
		
		final JPanel jPanelCamposClienteArchivo=jPanelCamposAuxiliarClienteArchivo;
		final JPanel jPanelAccionesFormularioClienteArchivo=jPanelAccionesFormularioAuxiliarClienteArchivo;
		
		
		final JMenuBar jmenuBarClienteArchivo=this.jmenuBarClienteArchivo;
		final JToolBar jTtoolBarClienteArchivo=this.jTtoolBarClienteArchivo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarClienteArchivo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClienteArchivo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			jmenuBarDetalleAuxiliarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jmenuBarDetalleClienteArchivo;
			jTtoolBarDetalleAuxiliarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jTtoolBarDetalleClienteArchivo;
		}
		
		final JMenuBar jmenuBarDetalleClienteArchivo=jmenuBarDetalleAuxiliarClienteArchivo;
		final JToolBar jTtoolBarDetalleClienteArchivo=jTtoolBarDetalleAuxiliarClienteArchivo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClienteArchivo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClienteArchivo;
			processRunnable.jTableDatos=jTableDatosClienteArchivo;
			processRunnable.jPanelCampos=jPanelCamposClienteArchivo;
			processRunnable.jPanelPaginacion=jPanelPaginacionClienteArchivo;
			processRunnable.jPanelAcciones=jPanelAccionesClienteArchivo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClienteArchivo;
			
			
			processRunnable.jmenuBar=jmenuBarClienteArchivo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClienteArchivo;
			processRunnable.jTtoolBar=jTtoolBarClienteArchivo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClienteArchivo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClienteArchivo ,jPanelParametrosReportesClienteArchivo,jTableDatosClienteArchivo, /*jScrollPanelDatosClienteArchivo,*/jPanelCamposClienteArchivo,jPanelPaginacionClienteArchivo, /*jScrollPanelDatosEdicionClienteArchivo,*/ jPanelAccionesClienteArchivo,jPanelAccionesFormularioClienteArchivo,jmenuBarClienteArchivo,jmenuBarDetalleClienteArchivo,jTtoolBarClienteArchivo,jTtoolBarDetalleClienteArchivo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClienteArchivo ,jPanelParametrosReportesClienteArchivo, jScrollPanelDatosClienteArchivo,jPanelPaginacionClienteArchivo, jScrollPanelDatosEdicionClienteArchivo, jPanelAccionesClienteArchivo,jPanelAccionesFormularioClienteArchivo,jmenuBarClienteArchivo,jmenuBarDetalleClienteArchivo,jTtoolBarClienteArchivo,jTtoolBarDetalleClienteArchivo);
						
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
	
	public void finishProcessClienteArchivo() {// throws Exception 
		this.finishProcessClienteArchivo(true);
	}
	
	public void finishProcessClienteArchivo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasClienteArchivo ,this.jPanelParametrosReportesClienteArchivo, this.jScrollPanelDatosClienteArchivo,this.jPanelPaginacionClienteArchivo, this.jScrollPanelDatosEdicionClienteArchivo, this.jPanelAccionesClienteArchivo,this.jPanelAccionesFormularioClienteArchivo,this.jmenuBarClienteArchivo,this.jmenuBarDetalleClienteArchivo,this.jTtoolBarClienteArchivo,this.jTtoolBarDetalleClienteArchivo);		
		
		final JTabbedPane jTabbedPaneBusquedasClienteArchivo=this.jTabbedPaneBusquedasClienteArchivo; 
		
		final JPanel jPanelParametrosReportesClienteArchivo=this.jPanelParametrosReportesClienteArchivo;
		//final JScrollPane jScrollPanelDatosClienteArchivo=this.jScrollPanelDatosClienteArchivo;
		final JTable jTableDatosClienteArchivo=this.jTableDatosClienteArchivo;		
		final JPanel jPanelPaginacionClienteArchivo=this.jPanelPaginacionClienteArchivo;
		//final JScrollPane jScrollPanelDatosEdicionClienteArchivo=this.jScrollPanelDatosEdicionClienteArchivo;
		final JPanel jPanelAccionesClienteArchivo=this.jPanelAccionesClienteArchivo;
		
		JPanel jPanelCamposAuxiliarClienteArchivo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarClienteArchivo=new JPanel();
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			jPanelCamposAuxiliarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jPanelCamposClienteArchivo;
			jPanelAccionesFormularioAuxiliarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jPanelAccionesFormularioClienteArchivo;
		}
		
		final JPanel jPanelCamposClienteArchivo=jPanelCamposAuxiliarClienteArchivo;
		final JPanel jPanelAccionesFormularioClienteArchivo=jPanelAccionesFormularioAuxiliarClienteArchivo;
		
		
		final JMenuBar jmenuBarClienteArchivo=this.jmenuBarClienteArchivo;		
		final JToolBar jTtoolBarClienteArchivo=this.jTtoolBarClienteArchivo;
				
		JMenuBar jmenuBarDetalleAuxiliarClienteArchivo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClienteArchivo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			jmenuBarDetalleAuxiliarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jmenuBarDetalleClienteArchivo;
			jTtoolBarDetalleAuxiliarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jTtoolBarDetalleClienteArchivo;		
		}
		
		final JMenuBar jmenuBarDetalleClienteArchivo=jmenuBarDetalleAuxiliarClienteArchivo;
		final JToolBar jTtoolBarDetalleClienteArchivo=jTtoolBarDetalleAuxiliarClienteArchivo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClienteArchivo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClienteArchivo;
			processRunnable.jTableDatos=jTableDatosClienteArchivo;
			processRunnable.jPanelCampos=jPanelCamposClienteArchivo;
			processRunnable.jPanelPaginacion=jPanelPaginacionClienteArchivo;
			processRunnable.jPanelAcciones=jPanelAccionesClienteArchivo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClienteArchivo;
			
			
			processRunnable.jmenuBar=jmenuBarClienteArchivo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClienteArchivo;
			processRunnable.jTtoolBar=jTtoolBarClienteArchivo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClienteArchivo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasClienteArchivo ,jPanelParametrosReportesClienteArchivo, jTableDatosClienteArchivo,/*jScrollPanelDatosClienteArchivo,*/jPanelCamposClienteArchivo,jPanelPaginacionClienteArchivo, /*jScrollPanelDatosEdicionClienteArchivo,*/ jPanelAccionesClienteArchivo,jPanelAccionesFormularioClienteArchivo,jmenuBarClienteArchivo,jmenuBarDetalleClienteArchivo,jTtoolBarClienteArchivo,jTtoolBarDetalleClienteArchivo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesClienteArchivo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarClienteArchivo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuClienteArchivo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarClienteArchivo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarClienteArchivo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleClienteArchivo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuClienteArchivo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarClienteArchivo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleClienteArchivo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.clientearchivoConstantesFunciones.getsFinalQueryClienteArchivo();
		String  finalQueryPaginacionTodos=this.clientearchivoConstantesFunciones.getsFinalQueryClienteArchivo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ClienteArchivoConstantesFunciones.getArrayColumnasGlobalesNoClienteArchivo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ClienteArchivoConstantesFunciones.getArrayColumnasGlobalesClienteArchivo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ClienteArchivoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.clientearchivosEliminados= new ArrayList<ClienteArchivo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessClienteArchivo();
		
				///*ClienteArchivoSessionBean*/this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
			
			if(this.clientearchivoSessionBean==null) {
				this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
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
					this.iNumeroPaginacion=ClienteArchivoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ClienteArchivoConstantesFunciones.getClassesForeignKeysOfClienteArchivo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/clientearchivo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			clientearchivosAux= new ArrayList<ClienteArchivo>();
			
				
			clientearchivoLogic.setDatosCliente(this.datosCliente);
			clientearchivoLogic.setDatosDeep(this.datosDeep);
			clientearchivoLogic.setIsConDeep(true);
			
			
			clientearchivoLogic.getClienteArchivoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					clientearchivoLogic.getTodosClienteArchivos(finalQueryGlobal,pagination);
					
					//clientearchivoLogic.getTodosClienteArchivosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(clientearchivoLogic.getClienteArchivos()==null|| clientearchivoLogic.getClienteArchivos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clientearchivosAux= new ArrayList<ClienteArchivo>();
							clientearchivosAux.addAll(clientearchivoLogic.getClienteArchivos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientearchivosAux= new ArrayList<ClienteArchivo>();
							clientearchivosAux.addAll(clientearchivos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clientearchivoLogic.getTodosClienteArchivos(finalQueryGlobal+"",this.pagination);												
							
							//clientearchivoLogic.getTodosClienteArchivosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteClienteArchivos("Todos",clientearchivoLogic.getClienteArchivos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clientearchivoLogic.setClienteArchivos(new ArrayList<ClienteArchivo>());					
							clientearchivoLogic.getClienteArchivos().addAll(clientearchivosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientearchivos=new ArrayList<ClienteArchivo>();
							clientearchivos.addAll(clientearchivosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idClienteArchivo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idClienteArchivo=this.idActual;
				
				} else if(this.idClienteArchivoActual!=null && this.idClienteArchivoActual!=0L) {
					idClienteArchivo=idClienteArchivoActual;
				}
				
					
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndicePorId(idClienteArchivo);
				
				this.clientearchivos=new ArrayList<ClienteArchivo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					clientearchivoLogic.getEntity(idClienteArchivo);
					
					//clientearchivoLogic.getEntityWithConnection(idClienteArchivo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientearchivoLogic.setClienteArchivos(new ArrayList<ClienteArchivo>());
					clientearchivoLogic.getClienteArchivos().add(clientearchivoLogic.getClienteArchivo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientearchivos=new ArrayList<ClienteArchivo>();
					this.clientearchivos.add(clientearchivo);
				}
				
				if(clientearchivoLogic.getClienteArchivo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					clientearchivoLogic.getClienteArchivosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=clientearchivoLogic.getClienteArchivos()==null||clientearchivoLogic.getClienteArchivos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=clientearchivos==null|| clientearchivos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivosAux=new ArrayList<ClienteArchivo>();
						clientearchivosAux.addAll(clientearchivoLogic.getClienteArchivos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientearchivosAux=new ArrayList<ClienteArchivo>();
							clientearchivosAux.addAll(clientearchivos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							clientearchivoLogic.getClienteArchivosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClienteArchivos("FK_IdCliente",clientearchivoLogic.getClienteArchivos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClienteArchivos("FK_IdCliente",clientearchivos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivoLogic.setClienteArchivos(new ArrayList<ClienteArchivo>());
						clientearchivoLogic.getClienteArchivos().addAll(clientearchivosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientearchivos=new ArrayList<ClienteArchivo>();
							clientearchivos.addAll(clientearchivosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoArchivo")) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdTipoArchivo(id_tipo_archivoFK_IdTipoArchivo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					clientearchivoLogic.getClienteArchivosFK_IdTipoArchivo(finalQueryGlobal,pagination,id_tipo_archivoFK_IdTipoArchivo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdTipoArchivo(id_tipo_archivoFK_IdTipoArchivo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdTipoArchivo(id_tipo_archivoFK_IdTipoArchivo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=clientearchivoLogic.getClienteArchivos()==null||clientearchivoLogic.getClienteArchivos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=clientearchivos==null|| clientearchivos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivosAux=new ArrayList<ClienteArchivo>();
						clientearchivosAux.addAll(clientearchivoLogic.getClienteArchivos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientearchivosAux=new ArrayList<ClienteArchivo>();
							clientearchivosAux.addAll(clientearchivos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							clientearchivoLogic.getClienteArchivosFK_IdTipoArchivo(finalQueryGlobal,pagination,id_tipo_archivoFK_IdTipoArchivo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdTipoArchivo(id_tipo_archivoFK_IdTipoArchivo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteArchivoConstantesFunciones.getDetalleIndiceFK_IdTipoArchivo(id_tipo_archivoFK_IdTipoArchivo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClienteArchivos("FK_IdTipoArchivo",clientearchivoLogic.getClienteArchivos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClienteArchivos("FK_IdTipoArchivo",clientearchivos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivoLogic.setClienteArchivos(new ArrayList<ClienteArchivo>());
						clientearchivoLogic.getClienteArchivos().addAll(clientearchivosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientearchivos=new ArrayList<ClienteArchivo>();
							clientearchivos.addAll(clientearchivosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesClienteArchivo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessClienteArchivo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=clientearchivoLogic.getClienteArchivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clientearchivos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=clientearchivoLogic.getClienteArchivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clientearchivos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ClienteArchivo clientearchivo) {
		Boolean permite=true;
		
		if(this.clientearchivo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ClienteArchivoConstantesFunciones.getOrderByListaClienteArchivo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ClienteArchivoConstantesFunciones.getOrderByListaClienteArchivo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteArchivo clientearchivo:clientearchivoLogic.getClienteArchivos()) {
				if(clientearchivo.getsType().equals(Constantes2.S_TOTALES)) {
					clientearchivoTotales=clientearchivo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteArchivo clientearchivo:this.clientearchivos) {
				if(clientearchivo.getsType().equals(Constantes2.S_TOTALES)) {
					clientearchivoTotales=clientearchivo;
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
			this.clientearchivoAux=new ClienteArchivo();
			this.clientearchivoAux.setsType(Constantes2.S_TOTALES);
			this.clientearchivoAux.setIsNew(false);
			this.clientearchivoAux.setIsChanged(false);
			this.clientearchivoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ClienteArchivoConstantesFunciones.TotalizarValoresFilaClienteArchivo(this.clientearchivoLogic.getClienteArchivos(),this.clientearchivoAux);
				
				this.clientearchivoLogic.getClienteArchivos().add(this.clientearchivoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ClienteArchivoConstantesFunciones.TotalizarValoresFilaClienteArchivo(this.clientearchivos,this.clientearchivoAux);
				
				this.clientearchivos.add(this.clientearchivoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		clientearchivoTotales=new ClienteArchivo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.clientearchivoLogic.getClienteArchivos().remove(clientearchivoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.clientearchivos.remove(clientearchivoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		clientearchivoTotales=new ClienteArchivo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteArchivo clientearchivo:clientearchivoLogic.getClienteArchivos()) {
				if(clientearchivo.getsType().equals(Constantes2.S_TOTALES)) {
					clientearchivoTotales=clientearchivo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClienteArchivoConstantesFunciones.TotalizarValoresFilaClienteArchivo(this.clientearchivoLogic.getClienteArchivos(),clientearchivoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteArchivo clientearchivo:this.clientearchivos) {
				if(clientearchivo.getsType().equals(Constantes2.S_TOTALES)) {
					clientearchivoTotales=clientearchivo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClienteArchivoConstantesFunciones.TotalizarValoresFilaClienteArchivo(this.clientearchivos,clientearchivoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getClienteArchivosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClienteArchivosFK_IdTipoArchivo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoArchivo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getClienteArchivosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientearchivoLogic.getClienteArchivosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClienteArchivosFK_IdTipoArchivo(String sFinalQuery,Long id_tipo_archivo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientearchivoLogic.getClienteArchivosFK_IdTipoArchivo(sFinalQuery,this.pagination,id_tipo_archivo);
				
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
	
	public void inicializarPermisosClienteArchivo() {
		this.isPermisoTodoClienteArchivo=false;
		this.isPermisoNuevoClienteArchivo=false;
		this.isPermisoActualizarClienteArchivo=false;
		this.isPermisoActualizarOriginalClienteArchivo=false;
		this.isPermisoEliminarClienteArchivo=false;
		this.isPermisoGuardarCambiosClienteArchivo=false;
		this.isPermisoConsultaClienteArchivo=false;
		this.isPermisoBusquedaClienteArchivo=false;
		this.isPermisoReporteClienteArchivo=false;		
		this.isPermisoOrdenClienteArchivo=false;		
		this.isPermisoPaginacionMedioClienteArchivo=false;		
		this.isPermisoPaginacionAltoClienteArchivo=false;
		this.isPermisoPaginacionTodoClienteArchivo=false;
		this.isPermisoCopiarClienteArchivo=false;		
		this.isPermisoVerFormClienteArchivo=false;		
		this.isPermisoDuplicarClienteArchivo=false;		
		this.isPermisoOrdenClienteArchivo=false;		
	}
	
	public void setPermisosUsuarioClienteArchivo(Boolean isPermiso) {
		this.isPermisoTodoClienteArchivo=isPermiso;
		this.isPermisoNuevoClienteArchivo=isPermiso;
		this.isPermisoActualizarClienteArchivo=isPermiso;
		this.isPermisoActualizarOriginalClienteArchivo=isPermiso;
		this.isPermisoEliminarClienteArchivo=isPermiso;
		this.isPermisoGuardarCambiosClienteArchivo=isPermiso;
		this.isPermisoConsultaClienteArchivo=isPermiso;
		this.isPermisoBusquedaClienteArchivo=isPermiso;
		this.isPermisoReporteClienteArchivo=isPermiso;
		this.isPermisoOrdenClienteArchivo=isPermiso;		
		this.isPermisoPaginacionMedioClienteArchivo=isPermiso;		
		this.isPermisoPaginacionAltoClienteArchivo=isPermiso;		
		this.isPermisoPaginacionTodoClienteArchivo=isPermiso;		
		this.isPermisoCopiarClienteArchivo=isPermiso;		
		this.isPermisoVerFormClienteArchivo=isPermiso;		
		this.isPermisoDuplicarClienteArchivo=isPermiso;
		this.isPermisoOrdenClienteArchivo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioClienteArchivo(Boolean isPermiso) {
		//this.isPermisoTodoClienteArchivo=isPermiso;
		this.isPermisoNuevoClienteArchivo=isPermiso;
		this.isPermisoActualizarClienteArchivo=isPermiso;
		this.isPermisoActualizarOriginalClienteArchivo=isPermiso;
		this.isPermisoEliminarClienteArchivo=isPermiso;
		this.isPermisoGuardarCambiosClienteArchivo=isPermiso;
		//this.isPermisoConsultaClienteArchivo=isPermiso;
		//this.isPermisoBusquedaClienteArchivo=isPermiso;
		//this.isPermisoReporteClienteArchivo=isPermiso;
		//this.isPermisoOrdenClienteArchivo=isPermiso;		
		//this.isPermisoPaginacionMedioClienteArchivo=isPermiso;		
		//this.isPermisoPaginacionAltoClienteArchivo=isPermiso;		
		//this.isPermisoPaginacionTodoClienteArchivo=isPermiso;		
		//this.isPermisoCopiarClienteArchivo=isPermiso;		
		//this.isPermisoDuplicarClienteArchivo=isPermiso;
		//this.isPermisoOrdenClienteArchivo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioClienteArchivoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ClienteArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebClienteArchivo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioClienteArchivoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioClienteArchivoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionClienteArchivoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioClienteArchivoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioClienteArchivo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ClienteArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ClienteArchivoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoClienteArchivo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarClienteArchivo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalClienteArchivo=this.isPermisoActualizarClienteArchivo;
			this.isPermisoEliminarClienteArchivo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosClienteArchivo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaClienteArchivo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaClienteArchivo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoClienteArchivo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteClienteArchivo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClienteArchivo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioClienteArchivo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoClienteArchivo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoClienteArchivo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarClienteArchivo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormClienteArchivo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarClienteArchivo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClienteArchivo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosClienteArchivo.setToolTipText(this.jTableDatosClienteArchivo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioClienteArchivo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioClienteArchivo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ClienteArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ClienteArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioClienteArchivo() throws Exception {
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
	public void inicializarCombosForeignKeyClienteArchivoListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.tipoarchivosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyClienteArchivoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ClienteArchivoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyClienteArchivoListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoArchivoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoArchivoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoarchivosForeignKey==null||this.tipoarchivosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoArchivoConstantesFunciones.getArrayColumnasGlobalesTipoArchivo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoArchivoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoArchivoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoArchivosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyClienteArchivoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ClienteArchivoParameterReturnGeneral clientearchivoReturnGeneral=new ClienteArchivoParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.clientearchivoConstantesFunciones.cargarid_clienteClienteArchivo)
					 || (this.esRecargarFks && this.clientearchivoConstantesFunciones.cargarid_clienteClienteArchivo)) {

					if(!this.clientearchivoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+clientearchivoSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoArchivo="";

				if(((this.tipoarchivosForeignKey==null||this.tipoarchivosForeignKey.size()<=0) && this.clientearchivoConstantesFunciones.cargarid_tipo_archivoClienteArchivo)
					 || (this.esRecargarFks && this.clientearchivoConstantesFunciones.cargarid_tipo_archivoClienteArchivo)) {

					if(!this.clientearchivoSessionBean.getisBusquedaDesdeForeignKeySesionTipoArchivo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoArchivoConstantesFunciones.getArrayColumnasGlobalesTipoArchivo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoArchivo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoArchivoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoArchivo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoArchivo, "");
						finalQueryGlobalTipoArchivo+=TipoArchivoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoArchivosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoArchivo=" WHERE " + ConstantesSql.ID + "="+clientearchivoSessionBean.getlidTipoArchivoActual();
					}
				} else {
					finalQueryGlobalTipoArchivo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				clientearchivoReturnGeneral=clientearchivoLogic.cargarCombosLoteForeignKeyClienteArchivo(finalQueryGlobalCliente,finalQueryGlobalTipoArchivo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=clientearchivoReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoArchivo.equals("NONE")) {
				this.tipoarchivosForeignKey=clientearchivoReturnGeneral.gettipoarchivosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyClienteArchivo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoArchivo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.clientearchivoSessionBean==null) {
				this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
			}

			if(!this.clientearchivoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoArchivo()throws Exception {
		try {

			if(!this.clientearchivoSessionBean.getisBusquedaDesdeForeignKeySesionTipoArchivo()) {
				TipoArchivo tipoarchivo=new TipoArchivo();
				TipoArchivoConstantesFunciones.setTipoArchivoDescripcion(tipoarchivo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoarchivo.setId(null);

				if(!TipoArchivoConstantesFunciones.ExisteEnLista(this.tipoarchivosForeignKey,tipoarchivo,true)) {

					this.tipoarchivosForeignKey.add(0,tipoarchivo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyClienteArchivo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyClienteArchivo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyClienteArchivo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyClienteArchivo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyClienteArchivo(ClienteArchivo clientearchivo)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(clientearchivo.getid_cliente(),false,"Formulario");
			this.setActualTipoArchivoForeignKey(clientearchivo.getid_tipo_archivo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyClienteArchivo(ClienteArchivo clientearchivo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(clientearchivo.getCliente()!=null && !sTipoEvento.equals("id_clienteClienteArchivo")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(clientearchivo.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyClienteArchivo()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.clientearchivoConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoArchivoForeignKey(this.clientearchivoConstantesFunciones.getid_tipo_archivo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyClienteArchivo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyClienteArchivo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyClienteArchivo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroClienteArchivo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyClienteArchivo()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoArchivosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyClienteArchivo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoArchivosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyClienteArchivo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo!=null && this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.getItemCount()>0) {
				this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo!=null && this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.getItemCount()>0) {
				this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ClienteArchivoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ClienteArchivoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ClienteArchivoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.clientearchivoSessionBean=new ClienteArchivoSessionBean(); 
		this.clientearchivoConstantesFunciones=new ClienteArchivoConstantesFunciones(); 
		this.clientearchivoBean=new ClienteArchivo();//(this.clientearchivoConstantesFunciones); 		
		this.clientearchivoReturnGeneral=new ClienteArchivoParameterReturnGeneral(); 
		
		this.clientearchivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clientearchivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ClienteArchivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ClienteArchivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ClienteArchivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessClienteArchivo(true);
			
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
			
			this.clientearchivoConstantesFunciones=new ClienteArchivoConstantesFunciones(); 
			this.clientearchivoBean=new ClienteArchivo();//this.clientearchivoConstantesFunciones); 			
			this.clientearchivoReturnGeneral=new ClienteArchivoParameterReturnGeneral(); 
		
			ClienteArchivoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cliente Archivo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.clientearchivo=new ClienteArchivo();
			this.clientearchivos = new ArrayList<ClienteArchivo>();
			this.clientearchivosAux = new ArrayList<ClienteArchivo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic=new ClienteArchivoLogic();
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}
			
			//this.clientearchivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.clientearchivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormClienteArchivo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClienteArchivo);	
					}
					
					if(this.jInternalFrameImportacionClienteArchivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClienteArchivo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByClienteArchivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByClienteArchivo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormClienteArchivo);
				this.jInternalFrameDetalleFormClienteArchivo.setVisible(false);
				this.jInternalFrameDetalleFormClienteArchivo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClienteArchivo);
					this.jInternalFrameReporteDinamicoClienteArchivo.setVisible(false);
					this.jInternalFrameReporteDinamicoClienteArchivo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionClienteArchivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionClienteArchivo);
					this.jInternalFrameImportacionClienteArchivo.setVisible(false);
					this.jInternalFrameImportacionClienteArchivo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByClienteArchivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByClienteArchivo);
					this.jInternalFrameOrderByClienteArchivo.setVisible(false);
					this.jInternalFrameOrderByClienteArchivo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idClienteArchivoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ClienteArchivoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.clientearchivoReturnGeneral=new ClienteArchivoParameterReturnGeneral();
			
			this.clientearchivoParameterGeneral=new ClienteArchivoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.clientearchivoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ClienteArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClienteArchivoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.clientearchivoSessionBean.getEsGuardarRelacionado(),this.clientearchivoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClienteArchivoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.clientearchivoSessionBean.getEsGuardarRelacionado(),this.clientearchivoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoClienteArchivo=false;
			this.isVisibilidadCeldaDuplicarClienteArchivo=true;
			this.isVisibilidadCeldaCopiarClienteArchivo=true;
			this.isVisibilidadCeldaVerFormClienteArchivo=true;
			this.isVisibilidadCeldaOrdenClienteArchivo=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
			this.isVisibilidadCeldaModificarClienteArchivo=false;
			this.isVisibilidadCeldaActualizarClienteArchivo=false;
			this.isVisibilidadCeldaEliminarClienteArchivo=false;
			this.isVisibilidadCeldaCancelarClienteArchivo=false;
			this.isVisibilidadCeldaGuardarClienteArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdTipoArchivo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesClienteArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosClienteArchivo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioClienteArchivo(false);
			
			this.setPermisosUsuarioClienteArchivo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clientearchivoSessionBean.getEsGuardarRelacionado() 
				|| (this.clientearchivoSessionBean.getEsGuardarRelacionado() && this.clientearchivoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClienteArchivoClasesRelacionadas();
			}
			
			if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClienteArchivoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosClienteArchivo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualClienteArchivo();
			}
			
			if(!this.isPermisoBusquedaClienteArchivo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioClienteArchivo,this.isPermisoPaginacionMedioClienteArchivo,this.isPermisoPaginacionTodoClienteArchivo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ClienteArchivoConstantesFunciones.getTiposSeleccionarClienteArchivo());
				
				this.tiposColumnasSelect=ClienteArchivoConstantesFunciones.getTiposSeleccionarClienteArchivo(true);
				
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
			//if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioClienteArchivo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioClienteArchivo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioClienteArchivo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteArchivo() ;
			
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
			this.tipoarchivoLogic=new TipoArchivoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				clientearchivoImplementable= (ClienteArchivoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClienteArchivoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				clientearchivoImplementableHome= (ClienteArchivoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClienteArchivoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.clientearchivos= new ArrayList<ClienteArchivo>();
			this.clientearchivosEliminados= new ArrayList<ClienteArchivo>();
						
			this.isEsNuevoClienteArchivo=false;
			this.esParaAccionDesdeFormularioClienteArchivo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoarchivosForeignKey=new ArrayList<TipoArchivo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyClienteArchivo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroClienteArchivo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ClienteArchivoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ClienteArchivoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesClienteArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingClienteArchivo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioClienteArchivo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioClienteArchivo();
			}
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasClienteArchivo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasClienteArchivo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasClienteArchivo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessClienteArchivo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ClienteArchivo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectClienteArchivo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesClienteArchivo")) {
				iIndex=this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessClienteArchivo();	
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
	
	public void cargarCombosForeignKeyClienteArchivo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyClienteArchivo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyClienteArchivo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyClienteArchivoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyClienteArchivo();
		
		this.cargarCombosFrameForeignKeyClienteArchivo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyClienteArchivo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyClienteArchivo();
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

	public void cargarCombosForeignKeyTipoArchivo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoArchivoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoArchivo();
				this.cargarCombosFrameTipoArchivosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoArchivo(this.tipoarchivosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoClienteArchivoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
			
			if(jTableDatosClienteArchivo.getRowCount()>=1) {
				jTableDatosClienteArchivo.removeRowSelectionInterval(0, jTableDatosClienteArchivo.getRowCount()-1);						
			}
			
			this.isEsNuevoClienteArchivo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoClienteArchivo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesClienteArchivo(true);			
			//this.clientearchivo=new ClienteArchivo();
			//this.clientearchivo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteArchivo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteArchivo() ;
			
			if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteArchivo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.clientearchivo);	
			this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);				
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
			if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ClienteArchivo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarClienteArchivoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosClienteArchivo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosClienteArchivo.getSelectedRows().length;			
			}
			
			clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoClienteArchivo--;			
				//ClienteArchivo clientearchivoAux= new ClienteArchivo();			
				//clientearchivoAux.setId(this.iIdNuevoClienteArchivo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ClienteArchivo clientearchivoOrigen=new ClienteArchivo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ClienteArchivo clientearchivoOrigen : clientearchivosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							clientearchivoOrigen =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientearchivoOrigen =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaClienteArchivo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.clientearchivo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosClienteArchivo(clientearchivoOrigen,this.clientearchivo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.clientearchivoLogic.getClienteArchivos().add(this.clientearchivoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.clientearchivos.add(this.clientearchivoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaClienteArchivo(false);
				
				this.jTableDatosClienteArchivo.setRowSelectionInterval(this.getIndiceNuevoClienteArchivo(), this.getIndiceNuevoClienteArchivo());
				
				int iLastRow =  this.jTableDatosClienteArchivo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClienteArchivo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClienteArchivo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteArchivo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();									
		
			ClienteArchivo clientearchivoOrigen=new ClienteArchivo();
			ClienteArchivo clientearchivoDestino=new ClienteArchivo();
				
			clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosClienteArchivo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || clientearchivosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosClienteArchivo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivoOrigen =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						clientearchivoOrigen =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientearchivoDestino =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						clientearchivoDestino =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				clientearchivoOrigen =clientearchivosSeleccionados.get(0);
				clientearchivoDestino =clientearchivosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosClienteArchivo(clientearchivoOrigen,clientearchivoDestino,true,false);
				
				clientearchivoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(clientearchivoDestino,clientearchivoLogic.getClienteArchivos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clientearchivoDestino,clientearchivos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaClienteArchivo(false);
				
				//this.jTableDatosClienteArchivo.setRowSelectionInterval(this.getIndiceNuevoClienteArchivo(), this.getIndiceNuevoClienteArchivo());
				
				int iLastRow =  this.jTableDatosClienteArchivo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClienteArchivo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClienteArchivo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteArchivo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormClienteArchivo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesClienteArchivo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasClienteArchivo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesClienteArchivo.setVisible(!isVisible);
			this.jPanelPaginacionClienteArchivo.setVisible(!isVisible);
			this.jPanelAccionesClienteArchivo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameClienteArchivo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoClienteArchivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionClienteArchivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByClienteArchivo();
			
			this.abrirFrameOrderByClienteArchivo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByClienteArchivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleClienteArchivo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormClienteArchivo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormClienteArchivo.isMaximum()) {
					this.jInternalFrameDetalleFormClienteArchivo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormClienteArchivo.setSize(this.jInternalFrameDetalleFormClienteArchivo.iWidthFormulario,this.jInternalFrameDetalleFormClienteArchivo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormClienteArchivo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormClienteArchivo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormClienteArchivo.isMaximum()) {
						this.jInternalFrameDetalleFormClienteArchivo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormClienteArchivo.jContentPaneDetalleClienteArchivo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormClienteArchivo.jContentPaneDetalleClienteArchivo.getWidth(),ClienteArchivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormClienteArchivo.jContentPaneDetalleClienteArchivo.getWidth(),ClienteArchivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormClienteArchivo.jContentPaneDetalleClienteArchivo.getWidth(),ClienteArchivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormClienteArchivo.setVisible(true);
	        this.jInternalFrameDetalleFormClienteArchivo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByClienteArchivo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByClienteArchivo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByClienteArchivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteArchivo,false,this);
				} else {
					this.jInternalFrameOrderByClienteArchivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteArchivo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByClienteArchivo);
				this.jInternalFrameOrderByClienteArchivo.setVisible(false);
				this.jInternalFrameOrderByClienteArchivo.setSelected(false);
				
				this.jInternalFrameOrderByClienteArchivo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClienteArchivo"));
				
				this.inicializarActualizarBindingTablaOrderByClienteArchivo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionClienteArchivo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionClienteArchivo==null) {
				
				this.jInternalFrameImportacionClienteArchivo=new ImportacionJInternalFrame(ClienteArchivoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClienteArchivo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionClienteArchivo);
				this.jInternalFrameImportacionClienteArchivo.setVisible(false);
				this.jInternalFrameImportacionClienteArchivo.setSelected(false);


				this.jInternalFrameImportacionClienteArchivo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClienteArchivo"));
				this.jInternalFrameImportacionClienteArchivo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClienteArchivo"));
				this.jInternalFrameImportacionClienteArchivo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClienteArchivo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoClienteArchivo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoClienteArchivo==null) {
				this.jInternalFrameReporteDinamicoClienteArchivo=new ReporteDinamicoJInternalFrame(ClienteArchivoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClienteArchivo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClienteArchivo);
				this.jInternalFrameReporteDinamicoClienteArchivo.setVisible(false);
				this.jInternalFrameReporteDinamicoClienteArchivo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoClienteArchivo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteArchivo"));
				this.jInternalFrameReporteDinamicoClienteArchivo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteArchivo"));
				this.jInternalFrameReporteDinamicoClienteArchivo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteArchivo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteArchivo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleClienteArchivo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormClienteArchivo);
			
	       	this.jInternalFrameDetalleFormClienteArchivo.setVisible(false);
	        this.jInternalFrameDetalleFormClienteArchivo.setSelected(false);
			
			//this.jInternalFrameDetalleFormClienteArchivo.dispose();
			//this.jInternalFrameDetalleFormClienteArchivo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoClienteArchivo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoClienteArchivo.setVisible(true);
	        this.jInternalFrameReporteDinamicoClienteArchivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionClienteArchivo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionClienteArchivo.setVisible(true);
	        this.jInternalFrameImportacionClienteArchivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByClienteArchivo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByClienteArchivo.setVisible(true);
	        this.jInternalFrameOrderByClienteArchivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByClienteArchivo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByClienteArchivo.setVisible(false);
	        this.jInternalFrameOrderByClienteArchivo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoClienteArchivo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoClienteArchivo.setVisible(false);
	        this.jInternalFrameReporteDinamicoClienteArchivo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionClienteArchivo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionClienteArchivo.setVisible(false);
	        this.jInternalFrameImportacionClienteArchivo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarClienteArchivo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarClienteArchivo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesClienteArchivo(true);
			//this.isEsNuevoClienteArchivo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesClienteArchivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteArchivo(false) ;
			
			if(clientearchivoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteArchivo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteArchivo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaClienteArchivoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarClienteArchivo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesClienteArchivo(true);
			//this.isEsNuevoClienteArchivo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.clientearchivo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesClienteArchivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesClienteArchivo(false) ;
			
			if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteArchivo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteArchivo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.clientearchivoConstantesFunciones.cargarid_clienteClienteArchivo) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingClienteArchivo(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosClienteArchivo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoArchivo(List<TipoArchivo> tipoarchivosForeignKey)throws Exception{
		TableColumn tableColumnTipoArchivo=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO));
		TableCellEditor tableCellEditorTipoArchivo =tableColumnTipoArchivo.getCellEditor();

		TipoArchivoTableCell tipoarchivoTableCellFk=(TipoArchivoTableCell)tableCellEditorTipoArchivo;

		if(tipoarchivoTableCellFk!=null) {
			tipoarchivoTableCellFk.settipoarchivosForeignKey(tipoarchivosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosClienteArchivo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoarchivoTableCellFk.setRowActual(intSelectedRow);
			//tipoarchivoTableCellFk.settipoarchivosForeignKeyActual(tipoarchivosForeignKey);
		//}


		if(tipoarchivoTableCellFk!=null) {
			tipoarchivoTableCellFk.RecargarTipoArchivosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesClienteArchivo(false);
			
			//if(!this.isEsNuevoClienteArchivo) {								
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
				
			}
			
			if(this.permiteMantenimiento(this.clientearchivo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoClienteArchivo=true;
					this.inicializarActualizarBindingTablaClienteArchivo(false);
					this.isEsNuevoClienteArchivo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoClienteArchivo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoClienteArchivo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClienteArchivo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteArchivo(false);
				
				this.habilitarDeshabilitarControlesClienteArchivo(false);
			
												
				
				if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleClienteArchivo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoClienteArchivoActionPerformed(evt,clientearchivoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualClienteArchivo(this.clientearchivo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosClienteArchivo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,clientearchivoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.clientearchivo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarClienteArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				this.clientearchivo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				this.clientearchivo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.clientearchivo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ClienteArchivoModel) this.jTableDatosClienteArchivo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoClienteArchivo=true;
				this.inicializarActualizarBindingTablaClienteArchivo(false);
				this.isEsNuevoClienteArchivo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClienteArchivo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteArchivo(false);
				
				this.habilitarDeshabilitarControlesClienteArchivo(false);
				
				
				
				if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleClienteArchivo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarClienteArchivoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosClienteArchivo.getRowCount()>=1) {
				jTableDatosClienteArchivo.removeRowSelectionInterval(0, jTableDatosClienteArchivo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesClienteArchivo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaClienteArchivo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteArchivo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteArchivo(false) ;
			
			this.isEsNuevoClienteArchivo=false;
			
			if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleClienteArchivo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosClienteArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingClienteArchivo(false);
				
				//SI ES MANUAL
				if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualClienteArchivo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosClienteArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoClienteArchivo--;			
			//ClienteArchivo clientearchivoAux= new ClienteArchivo();			
			//clientearchivoAux.setId(this.iIdNuevoClienteArchivo);
			
			if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaClienteArchivo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
			
			this.clientearchivo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.clientearchivoLogic.getClienteArchivos().add(this.clientearchivoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.clientearchivos.add(this.clientearchivoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaClienteArchivo(false);
			
			this.jTableDatosClienteArchivo.setRowSelectionInterval(this.getIndiceNuevoClienteArchivo(), this.getIndiceNuevoClienteArchivo());
			
			int iLastRow =  this.jTableDatosClienteArchivo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosClienteArchivo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosClienteArchivo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaClienteArchivo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionClienteArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingClienteArchivo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteArchivo(false);
			
			//SI ES MANUAL
			if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteArchivo();
			}
			
			//this.abrirFrameTreeClienteArchivo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionClienteArchivoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cliente ArchivoS ?", "MANTENIMIENTO DE Cliente Archivo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionClienteArchivo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralClienteArchivo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.clientearchivoReturnGeneral=clientearchivoLogic.procesarImportacionClienteArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.clientearchivoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarClienteArchivoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionClienteArchivoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionClienteArchivo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionClienteArchivo.setFileImportacion(this.jInternalFrameImportacionClienteArchivo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionClienteArchivo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionClienteArchivo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionClienteArchivo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionClienteArchivo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoClienteArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		

		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ClienteArchivoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ClienteArchivoBaseDesign.jrxml";
			
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
			
			this.generarReporteClienteArchivos("Todos",clientearchivosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoArchivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoArchivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoArchivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoArchivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteArchivoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteArchivoConstantesFunciones.LABEL_ARCHIVO:
					iAnchoColumna=0;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoClienteArchivo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO:
					sNombreCampoCategoria="id_tipo_archivo";
					break;

				case ClienteArchivoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ClienteArchivoConstantesFunciones.LABEL_ARCHIVO:
					sNombreCampoCategoria="archivo";
					break;

				case ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO:
					sNombreCampoCategoriaValor="id_tipo_archivo";
					break;

				case ClienteArchivoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ClienteArchivoConstantesFunciones.LABEL_ARCHIVO:
					sNombreCampoCategoriaValor="archivo";
					break;

				case ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Archivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_archivo");
					break;

				case ClienteArchivoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ClienteArchivoConstantesFunciones.LABEL_ARCHIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Archivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"archivo");
					break;

				case ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoClienteArchivoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientearchivo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ClienteArchivos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ClienteArchivo clientearchivo:clientearchivosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientearchivo.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO);
					iRow++;

					for(ClienteArchivo clientearchivo:clientearchivosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientearchivo.gettipoarchivo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteArchivoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ClienteArchivo clientearchivo:clientearchivosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientearchivo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ClienteArchivo clientearchivo:clientearchivosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientearchivo.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelClienteArchivo(row);				
			//	iRow++;
			//}				
			
			//for(ClienteArchivo clientearchivoAux:clientearchivosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelClienteArchivo(clientearchivoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
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
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteArchivo(false);
			
			//SI ES MANUAL
			if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteArchivo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresClienteArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteArchivo(false);
			
			//SI ES MANUAL
			if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClienteArchivo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesClienteArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteArchivo(false);
			
			//SI ES MANUAL
			if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClienteArchivo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaClienteArchivo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosClienteArchivo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosClienteArchivo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosClienteArchivo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosClienteArchivo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosClienteArchivo.setMinimumSize(dimensionMinimum);
		this.jTableDatosClienteArchivo.setMaximumSize(dimensionMaximum);
		this.jTableDatosClienteArchivo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingClienteArchivo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingClienteArchivo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingClienteArchivo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaClienteArchivo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesClienteArchivo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasClienteArchivo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteArchivo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesClienteArchivo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualClienteArchivo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaClienteArchivo();
		
		this.inicializarActualizarBindingBotonesManualClienteArchivo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualClienteArchivo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteArchivo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualClienteArchivo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualClienteArchivo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosClienteArchivo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosClienteArchivo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteClienteArchivo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormClienteArchivo.jCheckBoxPostAccionNuevoClienteArchivo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormClienteArchivo.jCheckBoxPostAccionSinCerrarClienteArchivo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormClienteArchivo.jCheckBoxPostAccionSinMensajeClienteArchivo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosClienteArchivo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosClienteArchivo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteClienteArchivo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
				this.jInternalFrameDetalleFormClienteArchivo.jCheckBoxPostAccionNuevoClienteArchivo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormClienteArchivo.jCheckBoxPostAccionSinCerrarClienteArchivo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormClienteArchivo.jCheckBoxPostAccionSinMensajeClienteArchivo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionClienteArchivo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionClienteArchivo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesClienteArchivo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesClienteArchivo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesClienteArchivo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarClienteArchivo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesClienteArchivo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesClienteArchivo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralClienteArchivo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesClienteArchivo(Boolean esInicializar) throws Exception {
		try	{	
			if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualClienteArchivo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesClienteArchivo() throws Exception {
		try	{
			if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualClienteArchivo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClienteArchivo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualClienteArchivo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesClienteArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesClienteArchivo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesClienteArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesClienteArchivo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesClienteArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesClienteArchivo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionClienteArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionClienteArchivo.addItem(reporte);
			}
			
			
			if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionClienteArchivo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionClienteArchivo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesClienteArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesClienteArchivo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesClienteArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesClienteArchivo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarClienteArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarClienteArchivo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarClienteArchivo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteArchivo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteArchivo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
				this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
				this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoClienteArchivo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
				
				if(this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClienteArchivo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoClienteArchivo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClienteArchivo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClienteArchivo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualClienteArchivo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteClienteArchivo.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteClienteArchivo.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.getSelectedItem()!=null){this.id_tipo_archivoFK_IdTipoArchivo=((TipoArchivo)this.jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasClienteArchivo(Boolean esInicializar) throws Exception {				
		if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualClienteArchivo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaClienteArchivo() throws Exception {
		this.inicializarActualizarBindingTablaClienteArchivo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByClienteArchivo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosClienteArchivoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaClienteArchivo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=clientearchivoLogic.getClienteArchivos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=clientearchivos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosClienteArchivo.setModel(new ClienteArchivoModel(this.clientearchivoLogic.getClienteArchivos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosClienteArchivo.setModel(new ClienteArchivoModel(this.clientearchivos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByClienteArchivo!=null && this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByClienteArchivo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO,clientearchivoConstantesFunciones.resaltarSeleccionarClienteArchivo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO,clientearchivoConstantesFunciones.resaltarSeleccionarClienteArchivo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,ClienteArchivoConstantesFunciones.LABEL_ID));

		if(this.clientearchivoConstantesFunciones.mostraridClienteArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteArchivoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.clientearchivoConstantesFunciones.resaltaridClienteArchivo,this.clientearchivoConstantesFunciones.activaridClienteArchivo,this,true,"idClienteArchivo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientearchivoConstantesFunciones.resaltaridClienteArchivo,this.clientearchivoConstantesFunciones.activaridClienteArchivo,this,true,"idClienteArchivo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE));

		if(this.clientearchivoConstantesFunciones.mostrarid_clienteClienteArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.clientearchivoConstantesFunciones.resaltarid_clienteClienteArchivo,this,this.clientearchivoConstantesFunciones.activarid_clienteClienteArchivo));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.clientearchivoConstantesFunciones.resaltarid_clienteClienteArchivo,this,this.clientearchivoConstantesFunciones.activarid_clienteClienteArchivo,true,"id_clienteClienteArchivo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO));

		if(this.clientearchivoConstantesFunciones.mostrarid_tipo_archivoClienteArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoArchivoTableCell(this.tipoarchivosForeignKey,this.clientearchivoConstantesFunciones.resaltarid_tipo_archivoClienteArchivo,this,this.clientearchivoConstantesFunciones.activarid_tipo_archivoClienteArchivo));
			tableColumn.setCellEditor(new TipoArchivoTableCell(this.tipoarchivosForeignKey,this.clientearchivoConstantesFunciones.resaltarid_tipo_archivoClienteArchivo,this,this.clientearchivoConstantesFunciones.activarid_tipo_archivoClienteArchivo,true,"id_tipo_archivoClienteArchivo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,ClienteArchivoConstantesFunciones.LABEL_NOMBRE));

		if(this.clientearchivoConstantesFunciones.mostrarnombreClienteArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteArchivoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clientearchivoConstantesFunciones.resaltarnombreClienteArchivo,this.clientearchivoConstantesFunciones.activarnombreClienteArchivo,this,true,"nombreClienteArchivo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientearchivoConstantesFunciones.resaltarnombreClienteArchivo,this.clientearchivoConstantesFunciones.activarnombreClienteArchivo,this,true,"nombreClienteArchivo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,ClienteArchivoConstantesFunciones.LABEL_ARCHIVO));

		if(this.clientearchivoConstantesFunciones.mostrararchivoClienteArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteArchivoConstantesFunciones.LABEL_ARCHIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelArchivoRenderer(this.clientearchivoConstantesFunciones.resaltararchivoClienteArchivo,this.clientearchivoConstantesFunciones.activararchivoClienteArchivo));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientearchivoConstantesFunciones.resaltararchivoClienteArchivo,this.clientearchivoConstantesFunciones.activararchivoClienteArchivo,this,true,"archivoClienteArchivo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.clientearchivoConstantesFunciones.mostrardescripcionClienteArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clientearchivoConstantesFunciones.resaltardescripcionClienteArchivo,this.clientearchivoConstantesFunciones.activardescripcionClienteArchivo,this,true,"descripcionClienteArchivo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientearchivoConstantesFunciones.resaltardescripcionClienteArchivo,this.clientearchivoConstantesFunciones.activardescripcionClienteArchivo,this,true,"descripcionClienteArchivo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteArchivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.clientearchivoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.clientearchivoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClienteArchivo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.clientearchivoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.clientearchivoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClienteArchivo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.clientearchivoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.clientearchivoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosClienteArchivo.addColumn(tableColumn);
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
			
			this.jTableDatosClienteArchivo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosClienteArchivo.moveColumn(this.jTableDatosClienteArchivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosClienteArchivo.moveColumn(this.jTableDatosClienteArchivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosClienteArchivo.moveColumn(this.jTableDatosClienteArchivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosClienteArchivo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosClienteArchivo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosClienteArchivo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosClienteArchivo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosClienteArchivo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosClienteArchivo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosClienteArchivo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosClienteArchivo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=clientearchivoLogic.getClienteArchivos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=clientearchivos.size()-1;
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
		//this.jTableDatosClienteArchivo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosClienteArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosClienteArchivo();
			
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
				
				//this.isEsNuevoClienteArchivo=false;
					
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
				if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormClienteArchivo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClienteArchivo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClienteArchivo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.clientearchivo.getsType().equals("DUPLICADO")
				   || this.clientearchivo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoClienteArchivo=true;
				
				} else {
					this.isEsNuevoClienteArchivo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
					if(this.clientearchivo.getId()>=0 && !this.clientearchivo.getIsNew()) {						
						this.isEsNuevoClienteArchivo=false;
						
					} else {
						this.isEsNuevoClienteArchivo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoClienteArchivo(esRelaciones);						
				
				this.seleccionarClienteArchivo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.clientearchivo.getId()<0) {
					this.isEsNuevoClienteArchivo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarClienteArchivo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarClienteArchivo(evt,rowIndex);
				}	
				
				if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ClienteArchivo: " + this.dDif); 
					}
				}								
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarClienteArchivo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.clientearchivo)) {
					if(this.clientearchivo.getId()>0) {
						this.clientearchivo.setIsDeleted(true);
						
						this.clientearchivosEliminados.add(this.clientearchivo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.clientearchivoLogic.getClienteArchivos().remove(this.clientearchivo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.clientearchivos.remove(this.clientearchivo);				
					}
					
					
					((ClienteArchivoModel) this.jTableDatosClienteArchivo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteArchivo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarClienteArchivo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoClienteArchivo) {
			
			if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClienteArchivo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClienteArchivo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioClienteArchivo(this.clientearchivo);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.clientearchivoConstantesFunciones.cargarid_clienteClienteArchivo || this.clientearchivoConstantesFunciones.event_dependid_clienteClienteArchivo) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.clientearchivo.getid_cliente());
									//this.inicializarActualizarBindingClienteArchivo(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(clientearchivo.getCliente()!=null) {
							this.clientesForeignKey.add(clientearchivo.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.clientearchivo.getid_cliente(),false,"Formulario");

					//TipoArchivo
					if(!this.clientearchivoConstantesFunciones.cargarid_tipo_archivoClienteArchivo || this.clientearchivoConstantesFunciones.event_dependid_tipo_archivoClienteArchivo) {
						//this.cargarCombosTipoArchivosForeignKeyLista(" where id="+this.clientearchivo.getid_tipo_archivo());
									//this.inicializarActualizarBindingClienteArchivo(false,false);
						this.tipoarchivosForeignKey=new ArrayList<TipoArchivo>();

						if(clientearchivo.getTipoArchivo()!=null) {
							this.tipoarchivosForeignKey.add(clientearchivo.getTipoArchivo());
						}

						this.addItemDefectoCombosForeignKeyTipoArchivo();
						this.cargarCombosFrameTipoArchivosForeignKey("Todos");
					}
					this.setActualTipoArchivoForeignKey(this.clientearchivo.getid_tipo_archivo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesClienteArchivo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesClienteArchivo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteArchivo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoClienteArchivo(ClienteArchivo clientearchivo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoClienteArchivo(clientearchivo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoClienteArchivo(ClienteArchivo clientearchivo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioClienteArchivo(clientearchivo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyClienteArchivo(clientearchivo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyClienteArchivo(clientearchivo);
	}
	
	public void setVariablesObjetoActualToFormularioClienteArchivo(ClienteArchivo clientearchivo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.setText(clientearchivo.getId().toString());
			this.jInternalFrameDetalleFormClienteArchivo.jTextFieldnombreClienteArchivo.setText(clientearchivo.getnombre());


			this.jInternalFrameDetalleFormClienteArchivo.jLabelImagenarchivoClienteArchivo.setText("Archivo");
			this.jInternalFrameDetalleFormClienteArchivo.jTextAreadescripcionClienteArchivo.setText(clientearchivo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ClienteArchivo clientearchivoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,clientearchivoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ClienteArchivo clientearchivoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				clientearchivoLocal=this.clientearchivo;
			} else {
				clientearchivoLocal=this.clientearchivoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(clientearchivoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoClienteArchivo(clientearchivoLocal,true);
					
					if(clientearchivoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(clientearchivoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(clientearchivoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoClienteArchivo(ClienteArchivo clientearchivo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClienteArchivo(clientearchivo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(clientearchivo);
	}
	
	public void setVariablesFormularioToObjetoActualClienteArchivo(ClienteArchivo clientearchivo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClienteArchivo(clientearchivo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualClienteArchivo(ClienteArchivo clientearchivo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.getText()==null || this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.getText()=="" || this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.getText()=="Id") {
				this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.setText("0");
			}

			if(conColumnasBase) {clientearchivo.setId(Long.parseLong(this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteArchivoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabelIdClienteArchivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clientearchivo.setnombre(this.jInternalFrameDetalleFormClienteArchivo.jTextFieldnombreClienteArchivo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteArchivoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabelnombreClienteArchivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			if(this.jInternalFrameDetalleFormClienteArchivo.jFileChooserarchivoClienteArchivo.getSelectedFile()!=null){clientearchivo.setarchivo(FuncionesSwing.getBytesFromFile(this.jInternalFrameDetalleFormClienteArchivo.jFileChooserarchivoClienteArchivo.getSelectedFile()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteArchivoConstantesFunciones.LABEL_ARCHIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabelarchivoClienteArchivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clientearchivo.setdescripcion(this.jInternalFrameDetalleFormClienteArchivo.jTextAreadescripcionClienteArchivo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteArchivo.jLabeldescripcionClienteArchivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClienteArchivo(ClienteArchivo clientearchivoBean,ClienteArchivo clientearchivo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && clientearchivoBean.getid_cliente()!=null && !clientearchivoBean.getid_cliente().equals(-1L))) {clientearchivo.setid_cliente(clientearchivoBean.getid_cliente());}
			if(conDefault || (!conDefault && clientearchivoBean.getid_tipo_archivo()!=null && !clientearchivoBean.getid_tipo_archivo().equals(-1L))) {clientearchivo.setid_tipo_archivo(clientearchivoBean.getid_tipo_archivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosClienteArchivo(ClienteArchivo clientearchivoOrigen,ClienteArchivo clientearchivo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && clientearchivoOrigen.getId()!=null && !clientearchivoOrigen.getId().equals(0L))) {clientearchivo.setId(clientearchivoOrigen.getId());}}
			if(conDefault || (!conDefault && clientearchivoOrigen.getid_cliente()!=null && !clientearchivoOrigen.getid_cliente().equals(-1L))) {clientearchivo.setid_cliente(clientearchivoOrigen.getid_cliente());}
			if(conDefault || (!conDefault && clientearchivoOrigen.getid_tipo_archivo()!=null && !clientearchivoOrigen.getid_tipo_archivo().equals(-1L))) {clientearchivo.setid_tipo_archivo(clientearchivoOrigen.getid_tipo_archivo());}
			if(conDefault || (!conDefault && clientearchivoOrigen.getnombre()!=null && !clientearchivoOrigen.getnombre().equals(""))) {clientearchivo.setnombre(clientearchivoOrigen.getnombre());}
			if(conDefault || (!conDefault && clientearchivoOrigen.getarchivo()!=null && !clientearchivoOrigen.getarchivo().equals(null))) {clientearchivo.setarchivo(clientearchivoOrigen.getarchivo());}
			if(conDefault || (!conDefault && clientearchivoOrigen.getdescripcion()!=null && !clientearchivoOrigen.getdescripcion().equals(""))) {clientearchivo.setdescripcion(clientearchivoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClienteArchivo(ClienteArchivo clientearchivo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.setText(clientearchivo.getId().toString());
			this.jInternalFrameDetalleFormClienteArchivo.jTextFieldnombreClienteArchivo.setText(clientearchivo.getnombre());


			this.jInternalFrameDetalleFormClienteArchivo.jLabelImagenarchivoClienteArchivo.setText("Archivo");
			this.jInternalFrameDetalleFormClienteArchivo.jTextAreadescripcionClienteArchivo.setText(clientearchivo.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClienteArchivo(ClienteArchivoBean clientearchivoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.setText(clientearchivoBean.getId().toString());
			this.jInternalFrameDetalleFormClienteArchivo.jTextFieldnombreClienteArchivo.setText(clientearchivoBean.getnombre());
			this.jInternalFrameDetalleFormClienteArchivo.jTextAreadescripcionClienteArchivo.setText(clientearchivoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanClienteArchivo(ClienteArchivoParameterReturnGeneral clientearchivoReturnGeneral,ClienteArchivoBean clientearchivoBean,Boolean conDefault) throws Exception { 
		try {
			ClienteArchivo clientearchivoLocal=new ClienteArchivo();
			
			clientearchivoLocal=clientearchivoReturnGeneral.getClienteArchivo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && clientearchivoLocal.getId()!=null && !clientearchivoLocal.getId().equals(0L))) {clientearchivoBean.setId(clientearchivoLocal.getId());}}
			if(conDefault || (!conDefault && clientearchivoLocal.getid_cliente()!=null && !clientearchivoLocal.getid_cliente().equals(-1L))) {clientearchivoBean.setid_cliente(clientearchivoLocal.getid_cliente());}
			if(conDefault || (!conDefault && clientearchivoLocal.getid_tipo_archivo()!=null && !clientearchivoLocal.getid_tipo_archivo().equals(-1L))) {clientearchivoBean.setid_tipo_archivo(clientearchivoLocal.getid_tipo_archivo());}
			if(conDefault || (!conDefault && clientearchivoLocal.getnombre()!=null && !clientearchivoLocal.getnombre().equals(""))) {clientearchivoBean.setnombre(clientearchivoLocal.getnombre());}
			if(conDefault || (!conDefault && clientearchivoLocal.getdescripcion()!=null && !clientearchivoLocal.getdescripcion().equals(""))) {clientearchivoBean.setdescripcion(clientearchivoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxClienteArchivoGenerico(Long idClienteArchivoSeleccionado,JComboBox jComboBoxClienteArchivo,List<ClienteArchivo> clientearchivosLocal)throws Exception {
		try {
			ClienteArchivo  clientearchivoTemp=null;

			for(ClienteArchivo clientearchivoAux:clientearchivosLocal) {
				if(clientearchivoAux.getId()!=null && clientearchivoAux.getId().equals(idClienteArchivoSeleccionado)) {
					clientearchivoTemp=clientearchivoAux;
					break;
				}
			}

			jComboBoxClienteArchivo.setSelectedItem(clientearchivoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxClienteArchivoGenerico(JComboBox jComboBoxClienteArchivo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClienteArchivo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxClienteArchivo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClienteArchivo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxClienteArchivo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxClienteArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxClienteArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clientearchivo=(ClienteArchivo) clientearchivoLogic.getClienteArchivos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			clientearchivo =(ClienteArchivo) clientearchivos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!clientearchivo.getIsNew() && !clientearchivo.getIsChanged() && !clientearchivo.getIsDeleted()) {
				sDescripcion=clientearchivo.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=clientearchivo.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoArchivo")) {
			//sDescripcion=this.getActualTipoArchivoForeignKeyDescripcion((Long)value);
			if(!clientearchivo.getIsNew() && !clientearchivo.getIsChanged() && !clientearchivo.getIsDeleted()) {
				sDescripcion=clientearchivo.gettipoarchivo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoArchivoForeignKeyDescripcion((Long)value);
				sDescripcion=clientearchivo.gettipoarchivo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ClienteArchivo clientearchivoRow=new ClienteArchivo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clientearchivoRow=(ClienteArchivo) clientearchivoLogic.getClienteArchivos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			clientearchivoRow=(ClienteArchivo) clientearchivos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualClienteArchivo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoClienteArchivo && this.isPermisoNuevoClienteArchivo));			
			this.jButtonDuplicarClienteArchivo.setVisible((this.isVisibilidadCeldaDuplicarClienteArchivo && this.isPermisoDuplicarClienteArchivo));			
			this.jButtonCopiarClienteArchivo.setVisible((this.isVisibilidadCeldaCopiarClienteArchivo && this.isPermisoCopiarClienteArchivo));
			this.jButtonVerFormClienteArchivo.setVisible((this.isVisibilidadCeldaVerFormClienteArchivo && this.isPermisoVerFormClienteArchivo));
			
			this.jButtonAbrirOrderByClienteArchivo.setVisible((this.isVisibilidadCeldaOrdenClienteArchivo && this.isPermisoOrdenClienteArchivo));			
			
			this.jButtonNuevoRelacionesClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteArchivo && this.isPermisoNuevoClienteArchivo));			
			this.jButtonNuevoGuardarCambiosClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoClienteArchivo && this.isPermisoNuevoClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));
			
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarClienteArchivo.setVisible((this.isVisibilidadCeldaModificarClienteArchivo && this.isPermisoActualizarClienteArchivo));	
			this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarClienteArchivo.setVisible((this.isVisibilidadCeldaActualizarClienteArchivo && this.isPermisoActualizarClienteArchivo));	
			this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarClienteArchivo.setVisible((this.isVisibilidadCeldaEliminarClienteArchivo && this.isPermisoEliminarClienteArchivo));
			this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarClienteArchivo.setVisible(this.isVisibilidadCeldaCancelarClienteArchivo);							
			this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosClienteArchivo.setVisible((this.isVisibilidadCeldaGuardarClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));			
			
			}
						
			this.jButtonGuardarCambiosTablaClienteArchivo.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoClienteArchivo && this.isPermisoNuevoClienteArchivo));						
			this.jButtonDuplicarToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaDuplicarClienteArchivo && this.isPermisoDuplicarClienteArchivo));						
			this.jButtonCopiarToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaCopiarClienteArchivo && this.isPermisoCopiarClienteArchivo));			
			this.jButtonVerFormToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaVerFormClienteArchivo && this.isPermisoVerFormClienteArchivo));			
			this.jButtonAbrirOrderByToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaOrdenClienteArchivo && this.isPermisoOrdenClienteArchivo));
			this.jButtonNuevoRelacionesToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteArchivo && this.isPermisoNuevoClienteArchivo));			
			this.jButtonNuevoGuardarCambiosToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoClienteArchivo && this.isPermisoNuevoClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));			
			
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaModificarClienteArchivo && this.isPermisoActualizarClienteArchivo));	
			this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaActualizarClienteArchivo  && this.isPermisoActualizarClienteArchivo));	
			this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaEliminarClienteArchivo && this.isPermisoEliminarClienteArchivo));
			this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarToolBarClienteArchivo.setVisible(this.isVisibilidadCeldaCancelarClienteArchivo);				
			this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaGuardarClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarClienteArchivo.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoClienteArchivo && this.isPermisoNuevoClienteArchivo));			
			this.jMenuItemDuplicarClienteArchivo.setVisible((this.isVisibilidadCeldaDuplicarClienteArchivo && this.isPermisoDuplicarClienteArchivo));			
			this.jMenuItemCopiarClienteArchivo.setVisible((this.isVisibilidadCeldaCopiarClienteArchivo && this.isPermisoCopiarClienteArchivo));			
			this.jMenuItemVerFormClienteArchivo.setVisible((this.isVisibilidadCeldaVerFormClienteArchivo && this.isPermisoVerFormClienteArchivo));			
			this.jMenuItemAbrirOrderByClienteArchivo.setVisible((this.isVisibilidadCeldaOrdenClienteArchivo && this.isPermisoOrdenClienteArchivo));			
			//this.jMenuItemMostrarOcultarClienteArchivo.setVisible((this.isVisibilidadCeldaOrdenClienteArchivo && this.isPermisoOrdenClienteArchivo));
			this.jMenuItemDetalleAbrirOrderByClienteArchivo.setVisible((this.isVisibilidadCeldaOrdenClienteArchivo && this.isPermisoOrdenClienteArchivo));			
			//this.jMenuItemDetalleMostrarOcultarClienteArchivo.setVisible((this.isVisibilidadCeldaOrdenClienteArchivo && this.isPermisoOrdenClienteArchivo));			
			this.jMenuItemNuevoRelacionesClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteArchivo && this.isPermisoNuevoClienteArchivo));			
			this.jMenuItemNuevoGuardarCambiosClienteArchivo.setVisible((this.isVisibilidadCeldaNuevoClienteArchivo && this.isPermisoNuevoClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));									
			
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemModificarClienteArchivo.setVisible((this.isVisibilidadCeldaModificarClienteArchivo && this.isPermisoActualizarClienteArchivo));	
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemActualizarClienteArchivo.setVisible((this.isVisibilidadCeldaActualizarClienteArchivo && this.isPermisoActualizarClienteArchivo));	
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemEliminarClienteArchivo.setVisible((this.isVisibilidadCeldaEliminarClienteArchivo && this.isPermisoEliminarClienteArchivo));
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemCancelarClienteArchivo.setVisible(this.isVisibilidadCeldaCancelarClienteArchivo);				
			}
			
			this.jMenuItemGuardarCambiosClienteArchivo.setVisible((this.isVisibilidadCeldaGuardarClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));						
			this.jMenuItemGuardarCambiosTablaClienteArchivo.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoClienteArchivo=this.jButtonNuevoClienteArchivo.isVisible();
			this.isVisibilidadCeldaDuplicarClienteArchivo=this.jButtonDuplicarClienteArchivo.isVisible();
			this.isVisibilidadCeldaCopiarClienteArchivo=this.jButtonCopiarClienteArchivo.isVisible();
			this.isVisibilidadCeldaVerFormClienteArchivo=this.jButtonVerFormClienteArchivo.isVisible();
			
			this.isVisibilidadCeldaOrdenClienteArchivo=this.jButtonAbrirOrderByClienteArchivo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=this.jButtonNuevoRelacionesClienteArchivo.isVisible();
			this.isVisibilidadCeldaModificarClienteArchivo=this.jButtonModificarClienteArchivo.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			this.isVisibilidadCeldaActualizarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarClienteArchivo.isVisible();
			this.isVisibilidadCeldaEliminarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarClienteArchivo.isVisible();
			this.isVisibilidadCeldaCancelarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarClienteArchivo.isVisible();
			this.isVisibilidadCeldaGuardarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosClienteArchivo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=this.jButtonGuardarCambiosTablaClienteArchivo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoClienteArchivo=this.jButtonNuevoToolBarClienteArchivo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=this.jButtonNuevoRelacionesToolBarClienteArchivo.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			this.isVisibilidadCeldaModificarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarToolBarClienteArchivo.isVisible();
			this.isVisibilidadCeldaActualizarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarToolBarClienteArchivo.isVisible();
			this.isVisibilidadCeldaEliminarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarToolBarClienteArchivo.isVisible();
			this.isVisibilidadCeldaCancelarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarToolBarClienteArchivo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClienteArchivo=this.jButtonGuardarCambiosToolBarClienteArchivo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=this.jButtonGuardarCambiosTablaToolBarClienteArchivo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoClienteArchivo=this.jMenuItemNuevoClienteArchivo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=this.jMenuItemNuevoRelacionesClienteArchivo.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			this.isVisibilidadCeldaModificarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jMenuItemModificarClienteArchivo.isVisible();
			this.isVisibilidadCeldaActualizarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jMenuItemActualizarClienteArchivo.isVisible();
			this.isVisibilidadCeldaEliminarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jMenuItemEliminarClienteArchivo.isVisible();
			this.isVisibilidadCeldaCancelarClienteArchivo=this.jInternalFrameDetalleFormClienteArchivo.jMenuItemCancelarClienteArchivo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClienteArchivo=this.jMenuItemGuardarCambiosClienteArchivo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=this.jMenuItemGuardarCambiosTablaClienteArchivo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesClienteArchivo(Boolean esInicializar) {
		if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
				//if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesClienteArchivo();
			}
			
			this.inicializarActualizarBindingBotonesManualClienteArchivo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualClienteArchivo() {
		this.jButtonNuevoClienteArchivo.setVisible(this.isPermisoNuevoClienteArchivo);			
		this.jButtonDuplicarClienteArchivo.setVisible(this.isPermisoDuplicarClienteArchivo);			
		this.jButtonCopiarClienteArchivo.setVisible(this.isPermisoCopiarClienteArchivo);			
		this.jButtonVerFormClienteArchivo.setVisible(this.isPermisoVerFormClienteArchivo);			
		
		this.jButtonAbrirOrderByClienteArchivo.setVisible(this.isPermisoOrdenClienteArchivo);					
		
		this.jButtonNuevoRelacionesClienteArchivo.setVisible(this.isPermisoNuevoClienteArchivo);			
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarClienteArchivo.setVisible(this.isPermisoActualizarClienteArchivo);	
			this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarClienteArchivo.setVisible(this.isPermisoActualizarClienteArchivo);	
			this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarClienteArchivo.setVisible(this.isPermisoEliminarClienteArchivo);
			this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarClienteArchivo.setVisible(this.isVisibilidadCeldaCancelarClienteArchivo);						
			this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosClienteArchivo.setVisible(this.isPermisoGuardarCambiosClienteArchivo);							
		}
		
		this.jButtonGuardarCambiosTablaClienteArchivo.setVisible(this.isPermisoActualizarClienteArchivo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleClienteArchivo() {
		this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarClienteArchivo.setVisible(this.isPermisoActualizarClienteArchivo);	
		this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarClienteArchivo.setVisible(this.isPermisoActualizarClienteArchivo);	
		this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarClienteArchivo.setVisible(this.isPermisoEliminarClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarClienteArchivo.setVisible(this.isVisibilidadCeldaCancelarClienteArchivo);							
		this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosClienteArchivo.setVisible((this.isVisibilidadCeldaGuardarClienteArchivo && this.isPermisoGuardarCambiosClienteArchivo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosClienteArchivo() {
		if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualClienteArchivo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesClienteArchivo() {
	}
	
	public void jTableDatosClienteArchivoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarClienteArchivo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidClienteArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteArchivo(this.getclientearchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientearchivo==null) {
						this.clientearchivo = new ClienteArchivo();
					}

					this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
				}

				if(this.clientearchivo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.clientearchivo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteClienteArchivoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderClienteArchivo=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosClienteArchivo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderClienteArchivo=(TitledBorder)this.jScrollPanelDatosClienteArchivo.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderClienteArchivo.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteClienteArchivoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebClienteArchivo(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClienteArchivo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClienteArchivo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClienteArchivo(this.getclientearchivo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.clientearchivoLogic.getConnexion());

				if(this.clientearchivo.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.clientearchivo.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClienteArchivo=(TitledBorder)this.jScrollPanelDatosClienteArchivo.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderClienteArchivo.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteClienteArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteArchivo(this.getclientearchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientearchivo==null) {
						this.clientearchivo = new ClienteArchivo();
					}

					this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
				}

				if(this.clientearchivo.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.clientearchivo.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_archivoClienteArchivoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoarchivo=true;

			idTienePermisotipoarchivo=this.tienePermisosUsuarioEnPaginaWebClienteArchivo(TipoArchivoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoarchivo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClienteArchivo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClienteArchivo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClienteArchivo(this.getclientearchivo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);

				this.tipoarchivoBeanSwingJInternalFrame=new TipoArchivoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoarchivoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoarchivoBeanSwingJInternalFrame.getTipoArchivoLogic().setConnexion(this.clientearchivoLogic.getConnexion());

				if(this.clientearchivo.getid_tipo_archivo()!=null) {
					this.tipoarchivoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoarchivoBeanSwingJInternalFrame.setIdActual(this.clientearchivo.getid_tipo_archivo());
					this.tipoarchivoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoarchivoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoarchivoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoArchivo();
				}

				JInternalFrameBase jinternalFrame =this.tipoarchivoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClienteArchivo=(TitledBorder)this.jScrollPanelDatosClienteArchivo.getBorder();
				TitledBorder titledBordertipoarchivo=(TitledBorder)this.tipoarchivoBeanSwingJInternalFrame.jScrollPanelDatosTipoArchivo.getBorder();

				titledBordertipoarchivo.setTitle(titledBorderClienteArchivo.getTitle() + " -> Tipo Archivo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_archivoClienteArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteArchivo(this.getclientearchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientearchivo==null) {
						this.clientearchivo = new ClienteArchivo();
					}

					this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
				}

				if(this.clientearchivo.getid_tipo_archivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_archivo = "+this.clientearchivo.getid_tipo_archivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreClienteArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteArchivo(this.getclientearchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientearchivo==null) {
						this.clientearchivo = new ClienteArchivo();
					}

					this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
				}

				if(this.clientearchivo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.clientearchivo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonarchivoClienteArchivoActionPerformed(java.awt.event.ActionEvent evt) {
		try {

			int iReturnArchivo = this.jInternalFrameDetalleFormClienteArchivo.jFileChooserarchivoClienteArchivo.showOpenDialog(this);

			if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
				this.jInternalFrameDetalleFormClienteArchivo.jLabelImagenarchivoClienteArchivo.setText(this.jInternalFrameDetalleFormClienteArchivo.jFileChooserarchivoClienteArchivo.getSelectedFile().getName());
			}
		} catch(Exception e) {
			;
		}
	}

	public void jButtonDescargararchivoClienteArchivoActionPerformed(java.awt.event.ActionEvent evt) throws Exception  {
		try {


			String sPathDir=this.parametroGeneralUsuario.getpath_exportar()+ClienteArchivoConstantesFunciones.CLASSNAME;
			String sPathFile=sPathDir+"/"+this.clientearchivo.getnombre().replace(" ", "").toLowerCase()+"."+Funciones2.getExtensionTipoArchivo(this.clientearchivo.getid_tipo_archivo());
			File dir = new File(sPathDir);

			if (!dir.exists()) {
				dir.mkdirs();
			}

			FileOutputStream fileOuputStream =  new FileOutputStream(sPathFile);
			fileOuputStream.write(this.clientearchivo.getarchivo());
			fileOuputStream.close();

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO &&
				JOptionPane.showMessageDialog(this,"DESCARGADO CORRECTAMENTE:"+sPathFile,"MANTENIMIENTO DE ClienteArchivo",JOptionPane.INFORMATION_MESSAGE);
			}

	} catch(Exception e) {
			throw e;
		}
	}

	public void jButtonarchivoClienteArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteArchivo(this.getclientearchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientearchivo==null) {
						this.clientearchivo = new ClienteArchivo();
					}

					this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
				}

				if(this.clientearchivo.getarchivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where archivo = "+this.clientearchivo.getarchivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionClienteArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteArchivo(this.getclientearchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientearchivo==null) {
						this.clientearchivo = new ClienteArchivo();
					}

					this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);
				}

				if(this.clientearchivo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.clientearchivo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteClienteArchivoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClienteArchivo(false,false);

			this.getClienteArchivosFK_IdCliente();

			this.inicializarActualizarBindingClienteArchivo(false);

			//if(ClienteArchivoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClienteArchivo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoArchivoClienteArchivoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClienteArchivo(false,false);

			this.getClienteArchivosFK_IdTipoArchivo();

			this.inicializarActualizarBindingClienteArchivo(false);

			//if(ClienteArchivoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClienteArchivo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientearchivoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameClienteArchivo() {
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
			this.jInternalFrameDetalleFormClienteArchivo.setVisible(false);	    			
			this.jInternalFrameDetalleFormClienteArchivo.dispose();
			this.jInternalFrameDetalleFormClienteArchivo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
			this.jInternalFrameReporteDinamicoClienteArchivo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoClienteArchivo.dispose();
			this.jInternalFrameReporteDinamicoClienteArchivo=null;
		}
		
		if(this.jInternalFrameImportacionClienteArchivo!=null) {
			this.jInternalFrameImportacionClienteArchivo.setVisible(false);	    			
			this.jInternalFrameImportacionClienteArchivo.dispose();
			this.jInternalFrameImportacionClienteArchivo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessClienteArchivo();
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
			
			if(sTipo.equals("NuevoClienteArchivo")) {
				jButtonNuevoClienteArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarClienteArchivo")) {
				jButtonDuplicarClienteArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarClienteArchivo")) {
				jButtonCopiarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("VerFormClienteArchivo")) {
				jButtonVerFormClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarClienteArchivo")) {
				jButtonNuevoClienteArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarClienteArchivo")) {
				jButtonDuplicarClienteArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoClienteArchivo")) {
				jButtonNuevoClienteArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarClienteArchivo")) {
				jButtonDuplicarClienteArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesClienteArchivo")) {
				jButtonNuevoClienteArchivoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarClienteArchivo")) {
				jButtonNuevoClienteArchivoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesClienteArchivo")) {
				jButtonNuevoClienteArchivoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarClienteArchivo")) {
				jButtonModificarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarClienteArchivo")) {
				jButtonModificarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarClienteArchivo")) {
				jButtonModificarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarClienteArchivo")) {
				jButtonActualizarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarClienteArchivo")) {
				jButtonActualizarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarClienteArchivo")) {
				jButtonActualizarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("EliminarClienteArchivo")) {
				jButtonEliminarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarClienteArchivo")) {
				jButtonEliminarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarClienteArchivo")) {
				jButtonEliminarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("CancelarClienteArchivo")) {
				jButtonCancelarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarClienteArchivo")) {
				jButtonCancelarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarClienteArchivo")) {
				jButtonCancelarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("CerrarClienteArchivo")) {
				jButtonCerrarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarClienteArchivo")) {
				jButtonCerrarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarClienteArchivo")) {
				jButtonCerrarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarClienteArchivo")) {
				jButtonMostrarOcultarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarClienteArchivo")) {
				jButtonCancelarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosClienteArchivo")) {
				jButtonGuardarCambiosClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarClienteArchivo")) {
				jButtonGuardarCambiosClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarClienteArchivo")) {
				jButtonCopiarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarClienteArchivo")) {
				jButtonVerFormClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosClienteArchivo")) {
				jButtonGuardarCambiosClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarClienteArchivo")) {
				jButtonCopiarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormClienteArchivo")) {
				jButtonVerFormClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaClienteArchivo")) {
				jButtonGuardarCambiosClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarClienteArchivo")) {
				jButtonGuardarCambiosClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaClienteArchivo")) {
				jButtonGuardarCambiosClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionClienteArchivo")) {
				jButtonRecargarInformacionClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarClienteArchivo")) {
				jButtonRecargarInformacionClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionClienteArchivo")) {
				jButtonRecargarInformacionClienteArchivoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresClienteArchivo")) {
				jButtonAnterioresClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarClienteArchivo")) {
				jButtonAnterioresClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreClienteArchivo")) {
				jButtonAnterioresClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesClienteArchivo")) {
				jButtonSiguientesClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarClienteArchivo")) {
				jButtonSiguientesClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesClienteArchivo")) {
				jButtonSiguientesClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByClienteArchivo") || sTipo.equals("MenuItemDetalleAbrirOrderByClienteArchivo")) {
				jButtonAbrirOrderByClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarClienteArchivo") || sTipo.equals("MenuItemDetalleMostrarOcultarClienteArchivo")) {
				jButtonMostrarOcultarClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosClienteArchivo")) {
				jButtonNuevoGuardarCambiosClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarClienteArchivo")) {
				jButtonNuevoGuardarCambiosClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosClienteArchivo")) {
				jButtonNuevoGuardarCambiosClienteArchivoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoClienteArchivo")) {
				jButtonCerrarReporteDinamicoClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoClienteArchivo")) {
				jButtonGenerarReporteDinamicoClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoClienteArchivo")) {
				
				jButtonGenerarExcelReporteDinamicoClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionClienteArchivo")) {
				jButtonCerrarImportacionClienteArchivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionClienteArchivo")) {
				
				jButtonGenerarImportacionClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionClienteArchivo")) {
				
				jButtonAbrirImportacionClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesClienteArchivo")) {
				jComboBoxTiposAccionesClienteArchivoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesClienteArchivo")) {
				jComboBoxTiposRelacionesClienteArchivoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioClienteArchivo")) {
				jComboBoxTiposAccionesClienteArchivoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarClienteArchivo")) {
				
				jComboBoxTiposSeleccionarClienteArchivoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralClienteArchivo")) {
				jTextFieldValorCampoGeneralClienteArchivoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByClienteArchivo")) {
				jButtonAbrirOrderByClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarClienteArchivo")) {
				jButtonAbrirOrderByClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByClienteArchivo")) {
				jButtonCerrarOrderByClienteArchivoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClienteArchivoBusqueda")) {
				this.jButtonidClienteArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteClienteArchivo")) {
				this.jButtonid_clienteClienteArchivoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteClienteArchivoUpdate")) {
				this.jButtonid_clienteClienteArchivoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteClienteArchivoBusqueda")) {
				this.jButtonid_clienteClienteArchivoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_archivoClienteArchivoUpdate")) {
				this.jButtonid_tipo_archivoClienteArchivoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_archivoClienteArchivoBusqueda")) {
				this.jButtonid_tipo_archivoClienteArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreClienteArchivoBusqueda")) {
				this.jButtonnombreClienteArchivoBusquedaActionPerformed(evt);
			}
			//ABRIR BUSQUEDA ARCHIVO CAMPO
			
			else if(sTipo.equals("archivoClienteArchivo")) {
				this.jButtonarchivoClienteArchivoActionPerformed(evt);
			}
			
			//DESCARGAR ARCHIVO CAMPO
			else if(sTipo.equals("DescargararchivoClienteArchivo")) {
				this.jButtonDescargararchivoClienteArchivoActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("archivoClienteArchivoBusqueda")) {
				this.jButtonarchivoClienteArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionClienteArchivoBusqueda")) {
				this.jButtondescripcionClienteArchivoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteClienteArchivo")) {
				this.jButtonid_clienteClienteArchivoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteClienteArchivo")) {
				this.jButtonFK_IdClienteClienteArchivoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoArchivoClienteArchivo")) {
				this.jButtonFK_IdTipoArchivoClienteArchivoActionPerformed(evt);
			}
			
			;
			
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessClienteArchivo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteArchivoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				


				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ClienteArchivo clientearchivoLocal=null;
			
			if(!this.getEsControlTabla()) {
				clientearchivoLocal=this.clientearchivo;
			} else {
				clientearchivoLocal=this.clientearchivoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
							
				
				


				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
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
			
			


			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteArchivoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
								
						
				


				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
								
				
				


				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteArchivoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
							
				
				


				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteArchivoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
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
			
			


			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteArchivoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
								
				
				


				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteArchivoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteArchivoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosClienteArchivo")) {
					jCheckBoxSeleccionarTodosClienteArchivoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosClienteArchivo")) {
					jCheckBoxSeleccionadosClienteArchivoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarClienteArchivo")) {
					
				}
				
				


				
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
												
				
				


				
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteArchivoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteArchivoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
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
			
			


			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteArchivoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientearchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientearchivo);
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
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
				
				


				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteArchivo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientearchivoAnterior =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarClienteArchivo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosClienteArchivoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosClienteArchivo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.clientearchivo =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.clientearchivo =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.clientearchivo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarClienteArchivo")) {
				
				}
				
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarClienteArchivo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosClienteArchivo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarClienteArchivo")) {
			
			}
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessClienteArchivo();
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
			if(sTipo.equals("NuevoClienteArchivo")) {
				jButtonNuevoClienteArchivoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarClienteArchivo")) {
				jButtonDuplicarClienteArchivoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarClienteArchivo")) {
				jButtonCopiarClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormClienteArchivo")) {
				jButtonVerFormClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesClienteArchivo")) {
				jButtonNuevoClienteArchivoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarClienteArchivo")) {
				jButtonModificarClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarClienteArchivo")) {
				jButtonActualizarClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarClienteArchivo")) {
				jButtonEliminarClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaClienteArchivo")) {
				jButtonGuardarCambiosClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarClienteArchivo")) {
				jButtonCancelarClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarClienteArchivo")) {
				jButtonCerrarClienteArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosClienteArchivo")) {
				jButtonGuardarCambiosClienteArchivoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosClienteArchivo")) {
				jButtonNuevoGuardarCambiosClienteArchivoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByClienteArchivo")) {
				jButtonAbrirOrderByClienteArchivoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionClienteArchivo")) {
				jButtonRecargarInformacionClienteArchivoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresClienteArchivo")) {
				jButtonAnterioresClienteArchivoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesClienteArchivo")) {
				jButtonSiguientesClienteArchivoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClienteArchivoBusqueda")) {
				this.jButtonidClienteArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteClienteArchivo")) {
				this.jButtonid_clienteClienteArchivoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteClienteArchivoUpdate")) {
				this.jButtonid_clienteClienteArchivoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteClienteArchivoBusqueda")) {
				this.jButtonid_clienteClienteArchivoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_archivoClienteArchivoUpdate")) {
				this.jButtonid_tipo_archivoClienteArchivoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_archivoClienteArchivoBusqueda")) {
				this.jButtonid_tipo_archivoClienteArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreClienteArchivoBusqueda")) {
				this.jButtonnombreClienteArchivoBusquedaActionPerformed(evt);
			}
			//ABRIR BUSQUEDA ARCHIVO CAMPO
			
			else if(sTipo.equals("archivoClienteArchivo")) {
				this.jButtonarchivoClienteArchivoActionPerformed(evt);
			}
			
			//DESCARGAR ARCHIVO CAMPO
			else if(sTipo.equals("DescargararchivoClienteArchivo")) {
				this.jButtonDescargararchivoClienteArchivoActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("archivoClienteArchivoBusqueda")) {
				this.jButtonarchivoClienteArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionClienteArchivoBusqueda")) {
				this.jButtondescripcionClienteArchivoBusquedaActionPerformed(evt);
			}
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessClienteArchivo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameClienteArchivo")) {
				closingInternalFrameClienteArchivo();
				
			} else if(sTipo.equals("jButtonCancelarClienteArchivo")) {
				JInternalFrameBase jInternalFrameDetalleFormClienteArchivo = (JInternalFrameBase)evt.getSource();
	            	
	            ClienteArchivoBeanSwingJInternalFrame jInternalFrameParent=(ClienteArchivoBeanSwingJInternalFrame)jInternalFrameDetalleFormClienteArchivo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarClienteArchivoActionPerformed(null);
			}
			
			ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.clientearchivo,new Object(),this.clientearchivoParameterGeneral,this.clientearchivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormClienteArchivo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormClienteArchivo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormClienteArchivo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.clientearchivo)) {
			if(!esControlTabla) {
				if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);			
				}
				
				if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualClienteArchivo(this.clientearchivo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.clientearchivoReturnGeneral=clientearchivoLogic.procesarEventosClienteArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clientearchivoLogic.getClienteArchivos(),this.clientearchivo,this.clientearchivoParameterGeneral,this.isEsNuevoClienteArchivo,classes);//this.clientearchivoLogic.getClienteArchivo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanClienteArchivo(this.clientearchivoReturnGeneral,this.clientearchivoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanClienteArchivo(classes,this.clientearchivoReturnGeneral,this.clientearchivoBean,false);
					}
						
					if(this.clientearchivoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyClienteArchivo(this.clientearchivoReturnGeneral.getClienteArchivo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioClienteArchivo(this.clientearchivoReturnGeneral.getClienteArchivo());	
					}
						
					if(this.clientearchivoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioClienteArchivo(this.clientearchivoReturnGeneral.getClienteArchivo(),classes);//this.clientearchivoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioClienteArchivo(this.clientearchivo,classes);//this.clientearchivoBean);									
				}
			
				if(ClienteArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualClienteArchivo(this.clientearchivo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteArchivo(this.clientearchivo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.clientearchivoAnterior!=null) {
						this.clientearchivo=this.clientearchivoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.clientearchivoReturnGeneral=clientearchivoLogic.procesarEventosClienteArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clientearchivoLogic.getClienteArchivos(),this.clientearchivo,this.clientearchivoParameterGeneral,this.isEsNuevoClienteArchivo,classes);//this.clientearchivoLogic.getClienteArchivo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.clientearchivoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.clientearchivoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.clientearchivoReturnGeneral.getClienteArchivo(),clientearchivoLogic.getClienteArchivos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.clientearchivoReturnGeneral.getClienteArchivo(),this.clientearchivos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosClienteArchivo.repaint();
				
				//((AbstractTableModel) this.jTableDatosClienteArchivo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosClienteArchivo();
			}
		}
	}
	
	public void actualizarVisualTableDatosClienteArchivo() throws Exception {
		
		ClienteArchivoModel clientearchivoModel=(ClienteArchivoModel)this.jTableDatosClienteArchivo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clientearchivoModel.clientearchivos=this.clientearchivoLogic.getClienteArchivos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			clientearchivoModel.clientearchivos=this.clientearchivos;
		}
		
		
		((ClienteArchivoModel) this.jTableDatosClienteArchivo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaClienteArchivo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getclientearchivoAnterior(),this.clientearchivoLogic.getClienteArchivos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getclientearchivoAnterior(),this.clientearchivos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosClienteArchivo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioClienteArchivo(ClienteArchivo clientearchivo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
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
										
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clientearchivo,new Object(),generalEntityParameterGeneral,this.clientearchivoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.clientearchivoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ClienteArchivoConstantesFunciones.getClassesRelationshipsOfClienteArchivo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ClienteArchivoConstantesFunciones.getClassesRelationshipsFromStringsOfClienteArchivo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormClienteArchivo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ClienteArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clientearchivo,new Object(),generalEntityParameterGeneral,this.clientearchivoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioClienteArchivo(ClienteArchivoBean clientearchivoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanClienteArchivo(ArrayList<Classe> classes,ClienteArchivoReturnGeneral clientearchivoReturnGeneral,ClienteArchivoBean clientearchivoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualClienteArchivo(ClienteArchivo clientearchivo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.clientearchivo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormClienteArchivo = new ClienteArchivoDetalleFormJInternalFrame(jDesktopPane,this.clientearchivoSessionBean.getConGuardarRelaciones(),this.clientearchivoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.setVisible(false);
		this.jInternalFrameDetalleFormClienteArchivo.setSelected(false);						
		
		this.jInternalFrameDetalleFormClienteArchivo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormClienteArchivo.clientearchivoLogic=this.clientearchivoLogic;
		
		this.cargarCombosFrameForeignKeyClienteArchivo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleClienteArchivo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClienteArchivo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyClienteArchivo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyClienteArchivo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormClienteArchivo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClienteArchivo"));
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarClienteArchivo.addActionListener(new ButtonActionListener(this,"ModificarClienteArchivo"));

		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarToolBarClienteArchivo.addActionListener(new ButtonActionListener(this,"ModificarToolBarClienteArchivo"));
					
		this.jInternalFrameDetalleFormClienteArchivo.jMenuItemModificarClienteArchivo.addActionListener(new ButtonActionListener(this,"MenuItemModificarClienteArchivo"));		
		
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarClienteArchivo.addActionListener (new ButtonActionListener(this,"ActualizarClienteArchivo"));
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarToolBarClienteArchivo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClienteArchivo"));
						
		this.jInternalFrameDetalleFormClienteArchivo.jMenuItemActualizarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClienteArchivo"));		
		
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarClienteArchivo.addActionListener (new ButtonActionListener(this,"EliminarClienteArchivo"));
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"EliminarToolBarClienteArchivo"));
								
		this.jInternalFrameDetalleFormClienteArchivo.jMenuItemEliminarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClienteArchivo"));		
		
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarClienteArchivo.addActionListener (new ButtonActionListener(this,"CancelarClienteArchivo"));
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"CancelarToolBarClienteArchivo"));
					
		this.jInternalFrameDetalleFormClienteArchivo.jMenuItemCancelarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClienteArchivo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jMenuItemDetalleCerrarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClienteArchivo"));		
		
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteArchivo"));
		
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteArchivo"));
		
		
		
		this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClienteArchivo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonidClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"idClienteArchivoBusqueda"));
		//jButtonid_clienteClienteArchivo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteArchivoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivo.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_tipo_archivoClienteArchivoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_archivoClienteArchivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_tipo_archivoClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_archivoClienteArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonnombreClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreClienteArchivoBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormClienteArchivo.jButtonarchivoClienteArchivo.addActionListener(new ButtonActionListener(this,"archivoClienteArchivo"));
		this.jInternalFrameDetalleFormClienteArchivo.jButtonDescargararchivoClienteArchivo.addActionListener(new ButtonActionListener(this,"DescargararchivoClienteArchivo"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonarchivoClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"archivoClienteArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtondescripcionClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionClienteArchivoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClienteArchivo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameClienteArchivo"));
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClienteArchivo"));
		}
		
		this.jTableDatosClienteArchivo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarClienteArchivo"));
		
		this.jTableDatosClienteArchivo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarClienteArchivo"));
		
		this.jButtonNuevoClienteArchivo.addActionListener(new ButtonActionListener(this,"NuevoClienteArchivo"));
		
		this.jButtonDuplicarClienteArchivo.addActionListener(new ButtonActionListener(this,"DuplicarClienteArchivo"));
		
		this.jButtonCopiarClienteArchivo.addActionListener(new ButtonActionListener(this,"CopiarClienteArchivo"));
		
		this.jButtonVerFormClienteArchivo.addActionListener(new ButtonActionListener(this,"VerFormClienteArchivo"));
		
		
		this.jButtonNuevoToolBarClienteArchivo.addActionListener(new ButtonActionListener(this,"NuevoToolBarClienteArchivo"));
			
		this.jButtonDuplicarToolBarClienteArchivo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarClienteArchivo"));
			
		this.jMenuItemNuevoClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoClienteArchivo"));
			
		this.jMenuItemDuplicarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarClienteArchivo"));		
		
		
		this.jButtonNuevoRelacionesClienteArchivo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesClienteArchivo"));
		
		
		this.jButtonNuevoRelacionesToolBarClienteArchivo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarClienteArchivo"));
			
		this.jMenuItemNuevoRelacionesClienteArchivo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesClienteArchivo"));		
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarClienteArchivo.addActionListener(new ButtonActionListener(this,"ModificarClienteArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonModificarToolBarClienteArchivo.addActionListener(new ButtonActionListener(this,"ModificarToolBarClienteArchivo"));
			
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemModificarClienteArchivo.addActionListener(new ButtonActionListener(this,"MenuItemModificarClienteArchivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarClienteArchivo.addActionListener (new ButtonActionListener(this,"ActualizarClienteArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonActualizarToolBarClienteArchivo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClienteArchivo"));
				
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemActualizarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClienteArchivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarClienteArchivo.addActionListener (new ButtonActionListener(this,"EliminarClienteArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonEliminarToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"EliminarToolBarClienteArchivo"));
						
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemEliminarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClienteArchivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarClienteArchivo.addActionListener (new ButtonActionListener(this,"CancelarClienteArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonCancelarToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"CancelarToolBarClienteArchivo"));
			
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemCancelarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClienteArchivo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarClienteArchivo"));		
		
		
		this.jButtonCerrarClienteArchivo.addActionListener (new ButtonActionListener(this,"CerrarClienteArchivo"));
		
		
		this.jButtonCerrarToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"CerrarToolBarClienteArchivo"));
			
		this.jMenuItemCerrarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarClienteArchivo"));
			
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jMenuItemDetalleCerrarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClienteArchivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosClienteArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosClienteArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteArchivo"));
		}
		
		this.jButtonCopiarToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"CopiarToolBarClienteArchivo"));
			
		this.jButtonVerFormToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"VerFormToolBarClienteArchivo"));
		
		this.jMenuItemGuardarCambiosClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosClienteArchivo"));
			
		this.jMenuItemCopiarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarClienteArchivo"));		
		
		this.jMenuItemVerFormClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormClienteArchivo"));		
		
		
		this.jButtonGuardarCambiosTablaClienteArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClienteArchivo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarClienteArchivo"));
			
		this.jMenuItemGuardarCambiosTablaClienteArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClienteArchivo"));		
		
		
		
		this.jButtonRecargarInformacionClienteArchivo.addActionListener (new ButtonActionListener(this,"RecargarInformacionClienteArchivo"));
					
		this.jButtonRecargarInformacionToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarClienteArchivo"));
		
		this.jMenuItemRecargarInformacionClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionClienteArchivo"));		
		
		
		
		this.jButtonAnterioresClienteArchivo.addActionListener (new ButtonActionListener(this,"AnterioresClienteArchivo"));
		
		
		this.jButtonAnterioresToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarClienteArchivo"));
		
		this.jMenuItemAnterioresClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresClienteArchivo"));		
		
		
		this.jButtonSiguientesClienteArchivo.addActionListener (new ButtonActionListener(this,"SiguientesClienteArchivo"));
		
		
		this.jButtonSiguientesToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarClienteArchivo"));
			
		this.jMenuItemSiguientesClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesClienteArchivo"));
			
		this.jMenuItemAbrirOrderByClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByClienteArchivo"));
			
		this.jMenuItemMostrarOcultarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarClienteArchivo"));
			
		this.jMenuItemDetalleAbrirOrderByClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByClienteArchivo"));
			
		this.jMenuItemDetalleMostarOcultarClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarClienteArchivo"));		
		
		
		this.jButtonNuevoGuardarCambiosClienteArchivo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosClienteArchivo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarClienteArchivo"));
			
		this.jMenuItemNuevoGuardarCambiosClienteArchivo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosClienteArchivo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosClienteArchivo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosClienteArchivo"));

		this.jCheckBoxSeleccionadosClienteArchivo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosClienteArchivo"));
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClienteArchivo"));
		}
		
		
		this.jComboBoxTiposRelacionesClienteArchivo.addActionListener (new ButtonActionListener(this,"TiposRelacionesClienteArchivo"));
			
		this.jComboBoxTiposAccionesClienteArchivo.addActionListener (new ButtonActionListener(this,"TiposAccionesClienteArchivo"));
					
		this.jComboBoxTiposSeleccionarClienteArchivo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarClienteArchivo"));
			
		this.jTextFieldValorCampoGeneralClienteArchivo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralClienteArchivo"));		
		
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonidClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"idClienteArchivoBusqueda"));
		//jButtonid_clienteClienteArchivo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteArchivoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivo.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_tipo_archivoClienteArchivoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_archivoClienteArchivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_tipo_archivoClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_archivoClienteArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonnombreClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreClienteArchivoBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormClienteArchivo.jButtonarchivoClienteArchivo.addActionListener(new ButtonActionListener(this,"archivoClienteArchivo"));
		this.jInternalFrameDetalleFormClienteArchivo.jButtonDescargararchivoClienteArchivo.addActionListener(new ButtonActionListener(this,"DescargararchivoClienteArchivo"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonarchivoClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"archivoClienteArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtondescripcionClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionClienteArchivoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteClienteArchivo.addActionListener(new ButtonActionListener(this,"FK_IdClienteClienteArchivo"));

			this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivo"));

			this.jButtonFK_IdTipoArchivoClienteArchivo.addActionListener(new ButtonActionListener(this,"FK_IdTipoArchivoClienteArchivo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoClienteArchivo!=null) {
				this.jInternalFrameReporteDinamicoClienteArchivo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteArchivo"));
				this.jInternalFrameReporteDinamicoClienteArchivo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteArchivo"));
				this.jInternalFrameReporteDinamicoClienteArchivo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteArchivo"));
			}
			
			//this.jButtonCerrarReporteDinamicoClienteArchivo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteArchivo"));				
			//this.jButtonGenerarReporteDinamicoClienteArchivo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteArchivo"));
			//this.jButtonGenerarExcelReporteDinamicoClienteArchivo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteArchivo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionClienteArchivo!=null) {
				this.jInternalFrameImportacionClienteArchivo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClienteArchivo"));
				this.jInternalFrameImportacionClienteArchivo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClienteArchivo"));
				this.jInternalFrameImportacionClienteArchivo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClienteArchivo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByClienteArchivo.addActionListener (new ButtonActionListener(this,"AbrirOrderByClienteArchivo"));
			
			this.jButtonAbrirOrderByToolBarClienteArchivo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarClienteArchivo"));			
			
			if(this.jInternalFrameOrderByClienteArchivo!=null) {
				this.jInternalFrameOrderByClienteArchivo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClienteArchivo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteArchivo.jTabbedPaneRelacionesClienteArchivo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClienteArchivo"));
		
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
            		closingInternalFrameClienteArchivo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormClienteArchivo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormClienteArchivo = (JInternalFrameBase)event.getSource();
	            	
	            ClienteArchivoBeanSwingJInternalFrame jInternalFrameParent=(ClienteArchivoBeanSwingJInternalFrame)jInternalFrameDetalleFormClienteArchivo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarClienteArchivoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosClienteArchivo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosClienteArchivoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosClienteArchivo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosClienteArchivo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteArchivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteArchivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteArchivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoClienteArchivo";
		inputMap = this.jButtonNuevoClienteArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoClienteArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClienteArchivoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteArchivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteArchivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteArchivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesClienteArchivo";
		inputMap = this.jButtonNuevoRelacionesClienteArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesClienteArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClienteArchivoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarClienteArchivo";
		inputMap = this.jButtonModificarClienteArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarClienteArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarClienteArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarClienteArchivo";
		inputMap = this.jButtonActualizarClienteArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarClienteArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarClienteArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarClienteArchivo";
		inputMap = this.jButtonEliminarClienteArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarClienteArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarClienteArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarClienteArchivo";
		inputMap = this.jButtonCancelarClienteArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarClienteArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarClienteArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarClienteArchivo";
		inputMap = this.jButtonCerrarClienteArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarClienteArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarClienteArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosClienteArchivo";
		inputMap = this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosClienteArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormClienteArchivo.jButtonGuardarCambiosClienteArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosClienteArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosClienteArchivo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosClienteArchivoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesClienteArchivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesClienteArchivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarClienteArchivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarClienteArchivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralClienteArchivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralClienteArchivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonidClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"idClienteArchivoBusqueda"));
		//jButtonid_clienteClienteArchivo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteArchivoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivo.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_tipo_archivoClienteArchivoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_archivoClienteArchivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonid_tipo_archivoClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_archivoClienteArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonnombreClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreClienteArchivoBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormClienteArchivo.jButtonarchivoClienteArchivo.addActionListener(new ButtonActionListener(this,"archivoClienteArchivo"));
		this.jInternalFrameDetalleFormClienteArchivo.jButtonDescargararchivoClienteArchivo.addActionListener(new ButtonActionListener(this,"DescargararchivoClienteArchivo"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtonarchivoClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"archivoClienteArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteArchivo.jButtondescripcionClienteArchivoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionClienteArchivoBusqueda"));
		
		
		this.jButtonFK_IdClienteClienteArchivo.addActionListener(new ButtonActionListener(this,"FK_IdClienteClienteArchivo"));

		this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo.addActionListener(new ButtonActionListener(this,"id_clienteClienteArchivo"));

		this.jButtonFK_IdTipoArchivoClienteArchivo.addActionListener(new ButtonActionListener(this,"FK_IdTipoArchivoClienteArchivo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionClienteArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionClienteArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarClienteArchivoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarClienteArchivo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosClienteArchivo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
					clientearchivoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteArchivo clientearchivoAux:clientearchivos) {
					clientearchivoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosClienteArchivoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClienteArchivo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
						clientearchivoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteArchivo clientearchivoAux:clientearchivos) {
						clientearchivoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteArchivo clientearchivoAux:clientearchivos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaClienteArchivo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClienteArchivo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClienteArchivo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosClienteArchivoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClienteArchivo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosClienteArchivo.getSelectedRows();
			
			ClienteArchivo clientearchivoLocal=new ClienteArchivo();
			
			//this.seleccionarTodosClienteArchivo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientearchivoLocal =(ClienteArchivo) this.clientearchivoLogic.getClienteArchivos().toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					clientearchivoLocal =(ClienteArchivo) this.clientearchivos.toArray()[this.jTableDatosClienteArchivo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				clientearchivoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
						clientearchivoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteArchivo clientearchivoAux:clientearchivos) {
						clientearchivoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaClienteArchivo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClienteArchivo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClienteArchivo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClienteArchivo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualClienteArchivoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarClienteArchivoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralClienteArchivoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingClienteArchivo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralClienteArchivo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClienteArchivo clientearchivoAux:this.clientearchivoLogic.getClienteArchivos()) {
				
						if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							clientearchivoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_ARCHIVO)) {
							existe=true;
							clientearchivoAux.setarchivo(null);
						}
						 else if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							clientearchivoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteArchivo clientearchivoAux:clientearchivos) {
					
						if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							clientearchivoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_ARCHIVO)) {
							existe=true;
							clientearchivoAux.setarchivo(null);
						}
						 else if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							clientearchivoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaClienteArchivo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesClienteArchivoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingClienteArchivo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioClienteArchivo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesClienteArchivo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteClienteArchivo) {				
					conSplash=true;//false;										
					
					//this.startProcessClienteArchivo(conSplash);
				
					this.generarReporteClienteArchivosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoClienteArchivosSeleccionados();
				//this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClienteArchivosSeleccionados(false);
				//this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClienteArchivosSeleccionados(true);
				//this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClienteArchivo();
				
				this.exportarClienteArchivosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionClienteArchivos();
				//this.importarClienteArchivos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClienteArchivo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelClienteArchivosSeleccionados();
				//this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cliente Archivo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessClienteArchivo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoClienteArchivo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyClienteArchivo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.setSelectedIndex(0);					
				}	
			} 			
			else if(ClienteArchivoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteClienteArchivo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessClienteArchivo(conSplash);
					
						//this.actualizarParametrosGeneralClienteArchivo();
						
						this.generarReporteProcesoAccionClienteArchivosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ClienteArchivoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cliente ArchivoS SELECCIONADOS?", "MANTENIMIENTO DE Cliente Archivo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessClienteArchivo();
				
						this.actualizarParametrosGeneralClienteArchivo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.clientearchivoReturnGeneral=clientearchivoLogic.procesarAccionClienteArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.clientearchivoLogic.getClienteArchivos(),this.clientearchivoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarClienteArchivoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralClienteArchivo();
					
					ClienteArchivoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarClienteArchivoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesClienteArchivo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormClienteArchivo.jComboBoxTiposAccionesFormularioClienteArchivo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessClienteArchivo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesClienteArchivoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessClienteArchivo();
			
			if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		
			ClienteArchivo clientearchivo=new ClienteArchivo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingClienteArchivo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesClienteArchivo.getSelectedItem();
			
			
			
			
			clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
			//this.sTipoAccion;
			
			if(clientearchivosSeleccionados.size()==1) {
				for(ClienteArchivo clientearchivoAux:clientearchivosSeleccionados) {
					clientearchivo=clientearchivoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessClienteArchivo();
			
      		//this.finishProcessClienteArchivo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarClienteArchivoReturnGeneral() throws Exception {
		if(this.clientearchivoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.clientearchivoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.clientearchivoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.clientearchivoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.clientearchivoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.clientearchivoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingClienteArchivo(false);
		}
		
		if(this.clientearchivoReturnGeneral.getConRetornoLista() || this.clientearchivoReturnGeneral.getConRetornoObjeto()) {
			if(this.clientearchivoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.clientearchivoLogic.setClienteArchivos(this.clientearchivoReturnGeneral.getClienteArchivos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.clientearchivoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.clientearchivoLogic.setClienteArchivo(this.clientearchivoReturnGeneral.getClienteArchivo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingClienteArchivo(false);
		}
	}
	
	public void actualizarParametrosGeneralClienteArchivo() throws Exception {
		
		
	}
	
	public ArrayList<ClienteArchivo> getClienteArchivosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioClienteArchivo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ClienteArchivo clientearchivoAux:clientearchivoLogic.getClienteArchivos()) {
					if(clientearchivoAux.getIsSelected()) {
						clientearchivosSeleccionados.add(clientearchivoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteArchivo clientearchivoAux:this.clientearchivos) {
					if(clientearchivoAux.getIsSelected()) {
						clientearchivosSeleccionados.add(clientearchivoAux);				
					}
				}
			}
			
			if(clientearchivosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						clientearchivosSeleccionados.addAll(this.clientearchivoLogic.getClienteArchivos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						clientearchivosSeleccionados.addAll(this.clientearchivos);				
					}
				}
			}
		} else {
			clientearchivosSeleccionados.add(this.clientearchivo);
		}
		
		return clientearchivosSeleccionados;
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
	
	public void generarReporteClienteArchivosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalClienteArchivosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoClienteArchivosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClienteArchivosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClienteArchivosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cliente Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesClienteArchivosSeleccionados() throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteClienteArchivos("Todos",clientearchivosSeleccionados);
		
	}	
	
	public void generarReporteNormalClienteArchivosSeleccionados() throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteClienteArchivos("Todos",clientearchivosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionClienteArchivosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteClienteArchivos("Todos",clientearchivosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoClienteArchivosSeleccionados() throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoClienteArchivo();
		
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoClienteArchivo();
		
		
		//this.generarReporteClienteArchivos("Todos",clientearchivosSeleccionados ,clientearchivoImplementable,clientearchivoImplementableHome);
	}
	
	public void mostrarImportacionClienteArchivos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionClienteArchivo();
		
		this.abrirFrameImportacionClienteArchivo();		
		
			
		//this.generarReporteClienteArchivos("Todos",clientearchivosSeleccionados ,clientearchivoImplementable,clientearchivoImplementableHome);
	}
	
	public void importarClienteArchivos() throws Exception {		
	
	}
	
	public void exportarClienteArchivosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelClienteArchivosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoClienteArchivosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlClienteArchivosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cliente Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoClienteArchivosSeleccionados() throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientearchivo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarClienteArchivo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ClienteArchivo clientearchivoAux:clientearchivosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarClienteArchivo(clientearchivoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//clientearchivoAux.setsDetalleGeneralEntityReporte(clientearchivoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarClienteArchivo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ClienteArchivoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteArchivoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteArchivoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteArchivoConstantesFunciones.LABEL_ARCHIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarClienteArchivo(ClienteArchivo clientearchivo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=clientearchivo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=clientearchivo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientearchivo.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientearchivo.gettipoarchivo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientearchivo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientearchivo.getarchivo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientearchivo.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelClienteArchivosSeleccionados() throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientearchivo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ClienteArchivos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelClienteArchivo(row);				
				iRow++;
			}				
			
			for(ClienteArchivo clientearchivoAux:clientearchivosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelClienteArchivo(clientearchivoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlClienteArchivosSeleccionados() throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();		
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientearchivo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("clientearchivos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("clientearchivo");
			//elementRoot.appendChild(element);
		
			for(ClienteArchivo clientearchivoAux:clientearchivosSeleccionados) {
				element = document.createElement("clientearchivo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlClienteArchivo(clientearchivoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Archivo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelClienteArchivo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_ARCHIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelClienteArchivo(ClienteArchivo clientearchivo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(clientearchivo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(clientearchivo.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clientearchivo.gettipoarchivo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clientearchivo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(clientearchivo.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlClienteArchivo(ClienteArchivo clientearchivo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ClienteArchivoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(clientearchivo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ClienteArchivoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(clientearchivo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcliente_descripcion = document.createElement(ClienteArchivoConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(clientearchivo.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipoarchivo_descripcion = document.createElement(ClienteArchivoConstantesFunciones.IDTIPOARCHIVO);
		elementtipoarchivo_descripcion.appendChild(document.createTextNode(clientearchivo.gettipoarchivo_descripcion()));
		element.appendChild(elementtipoarchivo_descripcion);

		Element elementnombre = document.createElement(ClienteArchivoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(clientearchivo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementarchivo = document.createElement(ClienteArchivoConstantesFunciones.ARCHIVO);
		elementarchivo.appendChild(document.createTextNode(clientearchivo.getarchivo().toString().trim()));
		element.appendChild(elementarchivo);

		Element elementdescripcion = document.createElement(ClienteArchivoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(clientearchivo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoClienteArchivosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ClienteArchivo> clientearchivosSeleccionados=new ArrayList<ClienteArchivo>();
		
		clientearchivosSeleccionados=this.getClienteArchivosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoClienteArchivo(clientearchivosSeleccionados);
		
		this.generarReporteClienteArchivos("Todos",clientearchivosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoClienteArchivo(ArrayList<ClienteArchivo> clientearchivosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ClienteArchivo clientearchivoAux:clientearchivosSeleccionados) {
				clientearchivoAux.setsDetalleGeneralEntityReporte(clientearchivoAux.toString());
			
				if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					clientearchivoAux.setsDescripcionGeneralEntityReporte1(clientearchivoAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_IDTIPOARCHIVO)) {
					existe=true;
					clientearchivoAux.setsDescripcionGeneralEntityReporte1(clientearchivoAux.gettipoarchivo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					clientearchivoAux.setsDescripcionGeneralEntityReporte1(clientearchivoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_ARCHIVO)) {
					existe=true;
					clientearchivoAux.setsDescripcionGeneralEntityReporte1(clientearchivoAux.getarchivo().toString());
				}
				 else if(sTipoSeleccionar.equals(ClienteArchivoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					clientearchivoAux.setsDescripcionGeneralEntityReporte1(clientearchivoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesClienteArchivo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoClienteArchivo=true;
				this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=true;
				this.isVisibilidadCeldaGuardarCambiosClienteArchivo=true;
			}
			
			this.isVisibilidadCeldaModificarClienteArchivo=false;
			this.isVisibilidadCeldaActualizarClienteArchivo=false;
			this.isVisibilidadCeldaEliminarClienteArchivo=false;
			this.isVisibilidadCeldaCancelarClienteArchivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteArchivo=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoClienteArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=false;
			this.isVisibilidadCeldaModificarClienteArchivo=false;
			this.isVisibilidadCeldaActualizarClienteArchivo=true;
			this.isVisibilidadCeldaEliminarClienteArchivo=false;
			this.isVisibilidadCeldaCancelarClienteArchivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteArchivo=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoClienteArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=false;
			this.isVisibilidadCeldaModificarClienteArchivo=false;
			this.isVisibilidadCeldaActualizarClienteArchivo=true;
			this.isVisibilidadCeldaEliminarClienteArchivo=true;
			this.isVisibilidadCeldaCancelarClienteArchivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteArchivo=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoClienteArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=false;
			this.isVisibilidadCeldaModificarClienteArchivo=false;
			this.isVisibilidadCeldaActualizarClienteArchivo=true;
			this.isVisibilidadCeldaEliminarClienteArchivo=false;
			this.isVisibilidadCeldaCancelarClienteArchivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoClienteArchivo=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=true;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=true;
			this.isVisibilidadCeldaModificarClienteArchivo=false;
			this.isVisibilidadCeldaActualizarClienteArchivo=false;
			this.isVisibilidadCeldaEliminarClienteArchivo=false;
			this.isVisibilidadCeldaCancelarClienteArchivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteArchivo=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoClienteArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=false;
			this.isVisibilidadCeldaActualizarClienteArchivo=false;
			this.isVisibilidadCeldaEliminarClienteArchivo=false;
			this.isVisibilidadCeldaCancelarClienteArchivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoClienteArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=false;
			this.isVisibilidadCeldaModificarClienteArchivo=true;
			this.isVisibilidadCeldaActualizarClienteArchivo=false;
			this.isVisibilidadCeldaEliminarClienteArchivo=false;
			this.isVisibilidadCeldaCancelarClienteArchivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteArchivo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoClienteArchivo=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=true;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=true;
		} else {
			this.actualizarEstadoPanelsClienteArchivo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarClienteArchivo=false;
			//this.isVisibilidadCeldaVerFormClienteArchivo=false;
			this.isVisibilidadCeldaDuplicarClienteArchivo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!clientearchivoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
		} else {
			this.isVisibilidadCeldaNuevoClienteArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosClienteArchivo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(clientearchivoSessionBean.getEsGuardarRelacionado()) {
			if(!clientearchivoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;												
			}
			
			this.jButtonCerrarClienteArchivo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesClienteArchivo=false;
		}
		
		if(!this.permiteMantenimiento(this.clientearchivo)) {
			this.isVisibilidadCeldaActualizarClienteArchivo=false;
			this.isVisibilidadCeldaEliminarClienteArchivo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesClienteArchivo() {
	}
	
	public void actualizarEstadoPanelsClienteArchivo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionClienteArchivo!=null) {
				this.jScrollPanelDatosEdicionClienteArchivo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteArchivo!=null) {
				this.jScrollPanelDatosClienteArchivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteArchivo!=null) {
				this.jPanelPaginacionClienteArchivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionClienteArchivo!=null) {
				this.jScrollPanelDatosEdicionClienteArchivo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosClienteArchivo!=null) {
				this.jScrollPanelDatosClienteArchivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteArchivo!=null) {
				this.jPanelPaginacionClienteArchivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionClienteArchivo!=null) {
				this.jScrollPanelDatosEdicionClienteArchivo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClienteArchivo!=null) {
				this.jScrollPanelDatosClienteArchivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteArchivo!=null) {
				this.jPanelPaginacionClienteArchivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionClienteArchivo!=null) {
				this.jScrollPanelDatosEdicionClienteArchivo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClienteArchivo!=null) {
				this.jScrollPanelDatosClienteArchivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteArchivo!=null) {
				this.jPanelPaginacionClienteArchivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionClienteArchivo!=null) {
				this.jScrollPanelDatosEdicionClienteArchivo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteArchivo!=null) {
				this.jScrollPanelDatosClienteArchivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteArchivo!=null) {
				this.jPanelPaginacionClienteArchivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionClienteArchivo!=null) {
				this.jScrollPanelDatosEdicionClienteArchivo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteArchivo!=null) {
				this.jScrollPanelDatosClienteArchivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteArchivo!=null) {
				this.jPanelPaginacionClienteArchivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionClienteArchivo!=null) {
				this.jScrollPanelDatosEdicionClienteArchivo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteArchivo!=null) {
				this.jScrollPanelDatosClienteArchivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteArchivo!=null) {
				this.jPanelPaginacionClienteArchivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
					this.jTabbedPaneBusquedasClienteArchivo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteArchivo!=null) {
				this.jTabbedPaneBusquedasClienteArchivo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesClienteArchivo!=null) {
				this.jPanelParametrosReportesClienteArchivo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasClienteArchivo.remove(jPanelFK_IdClienteClienteArchivo);}

			this.isVisibilidadFK_IdTipoArchivo=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoArchivo) {this.jTabbedPaneBusquedasClienteArchivo.remove(jPanelFK_IdTipoArchivoClienteArchivo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoArchivo(Boolean isParaTipoArchivo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoArchivoNegation=!isParaTipoArchivo;

			this.isVisibilidadFK_IdCliente=isParaTipoArchivoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasClienteArchivo.remove(jPanelFK_IdClienteClienteArchivo);}

			this.isVisibilidadFK_IdTipoArchivo=isParaTipoArchivo;
			if(!this.isVisibilidadFK_IdTipoArchivo) {this.jTabbedPaneBusquedasClienteArchivo.remove(jPanelFK_IdTipoArchivoClienteArchivo);}
		}
		
	}
	
	
	
	

	public String registrarSesionClienteArchivoParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(clientearchivoSessionBean==null) {
				clientearchivoSessionBean=new ClienteArchivoSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(clientearchivoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.clientearchivoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ClienteArchivoConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionClienteArchivo(true);
			//clienteSessionBean.setlidClienteArchivoActual(this.idClienteArchivoActual);

			clientearchivoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo(true);
			clientearchivoSessionBean.setlIdClienteArchivoActualForeignKey(this.idClienteArchivoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ClienteArchivoSessionBean clientearchivoSessionBean=new ClienteArchivoSessionBean();
		
		if(this.clientearchivoSessionBean==null) {
			this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
		}
		
		this.clientearchivoSessionBean.setsUltimaBusquedaClienteArchivo(this.getsAccionBusqueda());
		this.clientearchivoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.clientearchivoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			clientearchivoSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoArchivo")) {
			clientearchivoSessionBean.setid_tipo_archivo(this.getid_tipo_archivoFK_IdTipoArchivo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ClienteArchivoSessionBean clientearchivoSessionBean=new ClienteArchivoSessionBean();
		
		if(this.clientearchivoSessionBean==null) {
			this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
		}
		
		if(this.clientearchivoSessionBean.getsUltimaBusquedaClienteArchivo()!=null&&!this.clientearchivoSessionBean.getsUltimaBusquedaClienteArchivo().equals("")) {
			this.setsAccionBusqueda(clientearchivoSessionBean.getsUltimaBusquedaClienteArchivo());
			this.setiNumeroPaginacion(clientearchivoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(clientearchivoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(clientearchivoSessionBean.getid_cliente());
				clientearchivoSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoArchivo")) {
				this.setid_tipo_archivoFK_IdTipoArchivo(clientearchivoSessionBean.getid_tipo_archivo());
				clientearchivoSessionBean.setid_tipo_archivo(-1L);
			}
		}
		
		this.clientearchivoSessionBean.setsUltimaBusquedaClienteArchivo("");
		this.clientearchivoSessionBean.setiNumeroPaginacion(ClienteArchivoConstantesFunciones.INUMEROPAGINACION);
		this.clientearchivoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaClienteArchivo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioClienteArchivo() {
		this.updateBorderResaltarBusquedasFormularioClienteArchivo();
		this.updateVisibilidadBusquedasFormularioClienteArchivo();
		this.updateHabilitarBusquedasFormularioClienteArchivo();
	}
	
	public void updateBorderResaltarBusquedasFormularioClienteArchivo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasClienteArchivo.getComponents().length>0) {
	

		if(this.clientearchivoConstantesFunciones.resaltarFK_IdClienteClienteArchivo!=null) {
			index= this.jTabbedPaneBusquedasClienteArchivo.indexOfComponent(this.jPanelFK_IdClienteClienteArchivo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteArchivo.getComponent(index);
				jPanel.setBorder(this.clientearchivoConstantesFunciones.resaltarFK_IdClienteClienteArchivo);
			}
		}

		if(this.clientearchivoConstantesFunciones.resaltarFK_IdTipoArchivoClienteArchivo!=null) {
			index= this.jTabbedPaneBusquedasClienteArchivo.indexOfComponent(this.jPanelFK_IdTipoArchivoClienteArchivo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteArchivo.getComponent(index);
				jPanel.setBorder(this.clientearchivoConstantesFunciones.resaltarFK_IdTipoArchivoClienteArchivo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioClienteArchivo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasClienteArchivo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClienteArchivo.indexOfComponent(this.jPanelFK_IdClienteClienteArchivo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClienteArchivo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.clientearchivoConstantesFunciones.mostrarFK_IdClienteClienteArchivo);
			if(!this.clientearchivoConstantesFunciones.mostrarFK_IdClienteClienteArchivo && index>-1) {
				this.jTabbedPaneBusquedasClienteArchivo.remove(index);
			}

			index= this.jTabbedPaneBusquedasClienteArchivo.indexOfComponent(this.jPanelFK_IdTipoArchivoClienteArchivo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClienteArchivo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.clientearchivoConstantesFunciones.mostrarFK_IdTipoArchivoClienteArchivo);
			if(!this.clientearchivoConstantesFunciones.mostrarFK_IdTipoArchivoClienteArchivo && index>-1) {
				this.jTabbedPaneBusquedasClienteArchivo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioClienteArchivo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasClienteArchivo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClienteArchivo.indexOfComponent(this.jPanelFK_IdClienteClienteArchivo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClienteArchivo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.clientearchivoConstantesFunciones.activarFK_IdClienteClienteArchivo);
				this.jTabbedPaneBusquedasClienteArchivo.setEnabledAt(index,this.clientearchivoConstantesFunciones.activarFK_IdClienteClienteArchivo);
			}

			index= this.jTabbedPaneBusquedasClienteArchivo.indexOfComponent(this.jPanelFK_IdTipoArchivoClienteArchivo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClienteArchivo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.clientearchivoConstantesFunciones.activarFK_IdTipoArchivoClienteArchivo);
				this.jTabbedPaneBusquedasClienteArchivo.setEnabledAt(index,this.clientearchivoConstantesFunciones.activarFK_IdTipoArchivoClienteArchivo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaClienteArchivo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasClienteArchivo.indexOfComponent(this.jPanelFK_IdClienteClienteArchivo);

			this.jTabbedPaneBusquedasClienteArchivo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteArchivo.getComponent(index);

			this.clientearchivoConstantesFunciones.setResaltarFK_IdClienteClienteArchivo(resaltar);

			jPanel.setBorder(this.clientearchivoConstantesFunciones.resaltarFK_IdClienteClienteArchivo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoArchivo")) {
			index= this.jTabbedPaneBusquedasClienteArchivo.indexOfComponent(this.jPanelFK_IdTipoArchivoClienteArchivo);

			this.jTabbedPaneBusquedasClienteArchivo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteArchivo.getComponent(index);

			this.clientearchivoConstantesFunciones.setResaltarFK_IdTipoArchivoClienteArchivo(resaltar);

			jPanel.setBorder(this.clientearchivoConstantesFunciones.resaltarFK_IdTipoArchivoClienteArchivo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarClienteArchivo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioClienteArchivo() throws Exception {

		if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioClienteArchivo();
		this.updateVisibilidadResaltarControlesFormularioClienteArchivo();
		this.updateHabilitarResaltarControlesFormularioClienteArchivo();
		
	}
	
	public void updateBorderResaltarControlesFormularioClienteArchivo() throws Exception {
		if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.clientearchivoConstantesFunciones.resaltaridClienteArchivo!=null && this.jInternalFrameDetalleFormClienteArchivo!=null) {this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.setBorder(this.clientearchivoConstantesFunciones.resaltaridClienteArchivo);}
		if(this.clientearchivoConstantesFunciones.resaltarid_clienteClienteArchivo!=null && this.jInternalFrameDetalleFormClienteArchivo!=null) {this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setBorder(this.clientearchivoConstantesFunciones.resaltarid_clienteClienteArchivo);}
		if(this.clientearchivoConstantesFunciones.resaltarid_tipo_archivoClienteArchivo!=null && this.jInternalFrameDetalleFormClienteArchivo!=null) {this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setBorder(this.clientearchivoConstantesFunciones.resaltarid_tipo_archivoClienteArchivo);}
		if(this.clientearchivoConstantesFunciones.resaltarnombreClienteArchivo!=null && this.jInternalFrameDetalleFormClienteArchivo!=null) {this.jInternalFrameDetalleFormClienteArchivo.jTextFieldnombreClienteArchivo.setBorder(this.clientearchivoConstantesFunciones.resaltarnombreClienteArchivo);}
		if(this.clientearchivoConstantesFunciones.resaltararchivoClienteArchivo!=null && this.jInternalFrameDetalleFormClienteArchivo!=null) {this.jInternalFrameDetalleFormClienteArchivo.jFileChooserarchivoClienteArchivo.setBorder(this.clientearchivoConstantesFunciones.resaltararchivoClienteArchivo);}
		if(this.clientearchivoConstantesFunciones.resaltardescripcionClienteArchivo!=null && this.jInternalFrameDetalleFormClienteArchivo!=null) {this.jInternalFrameDetalleFormClienteArchivo.jTextAreadescripcionClienteArchivo.setBorder(this.clientearchivoConstantesFunciones.resaltardescripcionClienteArchivo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioClienteArchivo() throws Exception {		
		if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
	
		//this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostraridClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jPanelidClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostraridClienteArchivo);
		//this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrarid_clienteClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jPanelid_clienteClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrarid_clienteClienteArchivo);
			this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrarid_clienteClienteArchivo);
		//this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrarid_tipo_archivoClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jPanelid_tipo_archivoClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrarid_tipo_archivoClienteArchivo);
		//this.jInternalFrameDetalleFormClienteArchivo.jTextFieldnombreClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrarnombreClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jPanelnombreClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrarnombreClienteArchivo);
		//this.jInternalFrameDetalleFormClienteArchivo.jFileChooserarchivoClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrararchivoClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jPanelarchivoClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrararchivoClienteArchivo);
		//this.jInternalFrameDetalleFormClienteArchivo.jTextAreadescripcionClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrardescripcionClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jPaneldescripcionClienteArchivo.setVisible(this.clientearchivoConstantesFunciones.mostrardescripcionClienteArchivo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioClienteArchivo() throws Exception {
		if(this.jInternalFrameDetalleFormClienteArchivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClienteArchivo!=null) {
	
		this.jInternalFrameDetalleFormClienteArchivo.jLabelidClienteArchivo.setEnabled(this.clientearchivoConstantesFunciones.activaridClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_clienteClienteArchivo.setEnabled(this.clientearchivoConstantesFunciones.activarid_clienteClienteArchivo);
			this.jInternalFrameDetalleFormClienteArchivo.jButtonid_clienteClienteArchivo.setEnabled(this.clientearchivoConstantesFunciones.activarid_clienteClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jComboBoxid_tipo_archivoClienteArchivo.setEnabled(this.clientearchivoConstantesFunciones.activarid_tipo_archivoClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jTextFieldnombreClienteArchivo.setEnabled(this.clientearchivoConstantesFunciones.activarnombreClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jFileChooserarchivoClienteArchivo.setEnabled(this.clientearchivoConstantesFunciones.activararchivoClienteArchivo);
		this.jInternalFrameDetalleFormClienteArchivo.jTextAreadescripcionClienteArchivo.setEnabled(this.clientearchivoConstantesFunciones.activardescripcionClienteArchivo);
		}
	}
	
		
}