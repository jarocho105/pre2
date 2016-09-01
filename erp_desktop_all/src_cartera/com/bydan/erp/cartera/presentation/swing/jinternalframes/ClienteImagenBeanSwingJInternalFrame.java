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

import com.bydan.erp.cartera.util.ClienteImagenConstantesFunciones;
import com.bydan.erp.cartera.util.ClienteImagenParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ClienteImagenParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ClienteImagenBean;
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
public class ClienteImagenBeanSwingJInternalFrame extends ClienteImagenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ClienteImagenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ClienteImagen> clienteimagenValidator = new ClassValidator<ClienteImagen>(ClienteImagen.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ClienteImagen clienteimagen;	
	public ClienteImagen clienteimagenAux;
	public ClienteImagen clienteimagenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ClienteImagen clienteimagenTotales;
	public Long idClienteImagenActual;
	public Long iIdNuevoClienteImagen=0L;
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

	public String sFinalQueryComboTipoImagenPersona="";

	public List<TipoImagenPersona> tipoimagenpersonasForeignKey;

	public List<TipoImagenPersona> gettipoimagenpersonasForeignKey() {
		return tipoimagenpersonasForeignKey;
	}

	public void settipoimagenpersonasForeignKey(List<TipoImagenPersona> tipoimagenpersonasForeignKey) {
		this.tipoimagenpersonasForeignKey = tipoimagenpersonasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoImagenPersona tipoimagenpersonaForeignKey;

	public TipoImagenPersona gettipoimagenpersonaForeignKey() {
		return tipoimagenpersonaForeignKey;
	}

	public void settipoimagenpersonaForeignKey(TipoImagenPersona tipoimagenpersonaForeignKey) {
		this.tipoimagenpersonaForeignKey = tipoimagenpersonaForeignKey;
	}

	public String sFinalQueryComboTipoImagen="";

	public List<TipoImagen> tipoimagensForeignKey;

	public List<TipoImagen> gettipoimagensForeignKey() {
		return tipoimagensForeignKey;
	}

	public void settipoimagensForeignKey(List<TipoImagen> tipoimagensForeignKey) {
		this.tipoimagensForeignKey = tipoimagensForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoImagen tipoimagenForeignKey;

	public TipoImagen gettipoimagenForeignKey() {
		return tipoimagenForeignKey;
	}

	public void settipoimagenForeignKey(TipoImagen tipoimagenForeignKey) {
		this.tipoimagenForeignKey = tipoimagenForeignKey;
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
	
	public Boolean isPermisoTodoClienteImagen;
	public Boolean isPermisoNuevoClienteImagen;
	public Boolean isPermisoActualizarClienteImagen;
	public Boolean isPermisoActualizarOriginalClienteImagen;
	public Boolean isPermisoEliminarClienteImagen;
	public Boolean isPermisoGuardarCambiosClienteImagen;
	public Boolean isPermisoConsultaClienteImagen;
	public Boolean isPermisoBusquedaClienteImagen;
	public Boolean isPermisoReporteClienteImagen;
	public Boolean isPermisoPaginacionMedioClienteImagen;
	public Boolean isPermisoPaginacionAltoClienteImagen;
	public Boolean isPermisoPaginacionTodoClienteImagen;
	public Boolean isPermisoCopiarClienteImagen;
	public Boolean isPermisoVerFormClienteImagen;
	public Boolean isPermisoDuplicarClienteImagen;
	public Boolean isPermisoOrdenClienteImagen;
	
	
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
	
	public ClienteImagenParameterReturnGeneral clienteimagenReturnGeneral;
	public ClienteImagenParameterReturnGeneral clienteimagenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoClienteImagen=false;
	public Boolean esParaAccionDesdeFormularioClienteImagen=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ClienteImagenSessionBeanAdditional clienteimagenSessionBeanAdditional=null;
	
	public ClienteImagenSessionBeanAdditional getClienteImagenSessionBeanAdditional() {
		return this.clienteimagenSessionBeanAdditional;
	}
	
	public void setClienteImagenSessionBeanAdditional(ClienteImagenSessionBeanAdditional clienteimagenSessionBeanAdditional) {
		try {
			this.clienteimagenSessionBeanAdditional=clienteimagenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ClienteImagenBeanSwingJInternalFrameAdditional clienteimagenBeanSwingJInternalFrameAdditional=null;
	//public class ClienteImagenBeanSwingJInternalFrame
	
	public ClienteImagenBeanSwingJInternalFrameAdditional getClienteImagenBeanSwingJInternalFrameAdditional() {
		return this.clienteimagenBeanSwingJInternalFrameAdditional;
	}
	
	public void setClienteImagenBeanSwingJInternalFrameAdditional(ClienteImagenBeanSwingJInternalFrameAdditional clienteimagenBeanSwingJInternalFrameAdditional) {
		try {
			this.clienteimagenBeanSwingJInternalFrameAdditional=clienteimagenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ClienteImagenLogic clienteimagenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ClienteImagen clienteimagenBean;
	public ClienteImagenConstantesFunciones clienteimagenConstantesFunciones;
	//public ClienteImagenParameterReturnGeneral clienteimagenReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public TipoImagenPersonaLogic tipoimagenpersonaLogic;
	public TipoImagenLogic tipoimagenLogic;
	
	//PARAMETROS
	
	
	//public List<ClienteImagen> clienteimagens;	
	//public List<ClienteImagen> clienteimagensEliminados;
	//public List<ClienteImagen> clienteimagensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoClienteImagen=false;
	public Boolean isVisibilidadCeldaDuplicarClienteImagen=true;
	public Boolean isVisibilidadCeldaCopiarClienteImagen=true;
	public Boolean isVisibilidadCeldaVerFormClienteImagen=true;
	public Boolean isVisibilidadCeldaOrdenClienteImagen=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
	public Boolean isVisibilidadCeldaModificarClienteImagen=false;
	public Boolean isVisibilidadCeldaActualizarClienteImagen=false;
	public Boolean isVisibilidadCeldaEliminarClienteImagen=false;
	public Boolean isVisibilidadCeldaCancelarClienteImagen=false;
	public Boolean isVisibilidadCeldaGuardarClienteImagen=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosClienteImagen=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdTipoImagen=false;
	public Boolean isVisibilidadFK_IdTipoImagenPersona=false;
	
	public Long getiIdNuevoClienteImagen() {
		return this.iIdNuevoClienteImagen;
	}

	public void setiIdNuevoClienteImagen(Long iIdNuevoClienteImagen) {
		this.iIdNuevoClienteImagen = iIdNuevoClienteImagen;
	}
	
	public Long getidClienteImagenActual() {
		return this.idClienteImagenActual;
	}

	public void setidClienteImagenActual(Long idClienteImagenActual) {
		this.idClienteImagenActual = idClienteImagenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ClienteImagen getclienteimagen() {
		return this.clienteimagen;
	}

	public void setclienteimagen(ClienteImagen clienteimagen) {
		this.clienteimagen = clienteimagen;
	}
	
	public ClienteImagen getclienteimagenAux() {
		return this.clienteimagenAux;
	}

	public void setclienteimagenAux(ClienteImagen clienteimagenAux) {
		this.clienteimagenAux = clienteimagenAux;
	}				
	
	public ClienteImagen getclienteimagenAnterior() {
		return this.clienteimagenAnterior;
	}

	public void setclienteimagenAnterior(ClienteImagen clienteimagenAnterior) {
		this.clienteimagenAnterior = clienteimagenAnterior;
	}	
	
	public ClienteImagen getclienteimagenTotales() {
		return this.clienteimagenTotales;
	}

	public void setclienteimagenTotales(ClienteImagen clienteimagenTotales) {
		this.clienteimagenTotales = clienteimagenTotales;
	}	
	
	public ClienteImagen getclienteimagenBean() {
		return this.clienteimagenBean;
	}

	public void setclienteimagenBean(ClienteImagen clienteimagenBean) {
		this.clienteimagenBean = clienteimagenBean;
	}	
	
	public ClienteImagenParameterReturnGeneral getclienteimagenReturnGeneral() {
		return this.clienteimagenReturnGeneral;
	}

	public void setclienteimagenReturnGeneral(ClienteImagenParameterReturnGeneral clienteimagenReturnGeneral) {
		this.clienteimagenReturnGeneral = clienteimagenReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_tipo_imagenFK_IdTipoImagen=-1L;

	public Long getid_tipo_imagenFK_IdTipoImagen() {
		return this.id_tipo_imagenFK_IdTipoImagen;
	}

	public void setid_tipo_imagenFK_IdTipoImagen(Long id_tipo_imagenFK_IdTipoImagen) {
		this.id_tipo_imagenFK_IdTipoImagen = id_tipo_imagenFK_IdTipoImagen;
	}

	public Long id_tipo_imagen_personaFK_IdTipoImagenPersona=-1L;

	public Long getid_tipo_imagen_personaFK_IdTipoImagenPersona() {
		return this.id_tipo_imagen_personaFK_IdTipoImagenPersona;
	}

	public void setid_tipo_imagen_personaFK_IdTipoImagenPersona(Long id_tipo_imagen_personaFK_IdTipoImagenPersona) {
		this.id_tipo_imagen_personaFK_IdTipoImagenPersona = id_tipo_imagen_personaFK_IdTipoImagenPersona;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ClienteImagenLogic getClienteImagenLogic()	{		
		return clienteimagenLogic;
	}

	public void setClienteImagenLogic(ClienteImagenLogic clienteimagenLogic) {
		this.clienteimagenLogic = clienteimagenLogic;
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
	
	public Boolean getIsEsNuevoClienteImagen() {
		return isEsNuevoClienteImagen;
	}

	public void setIsEsNuevoClienteImagen(Boolean isEsNuevoClienteImagen) {
		this.isEsNuevoClienteImagen = isEsNuevoClienteImagen;
	}

	public Boolean getEsParaAccionDesdeFormularioClienteImagen() {
		return esParaAccionDesdeFormularioClienteImagen;
	}
	
	public void setEsParaAccionDesdeFormularioClienteImagen(Boolean esParaAccionDesdeFormularioClienteImagen) {
		this.esParaAccionDesdeFormularioClienteImagen = esParaAccionDesdeFormularioClienteImagen;
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

			if(this.clienteimagenSessionBean==null) {
				this.clienteimagenSessionBean=new ClienteImagenSessionBean();
			}

			if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(clienteimagenSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoImagenPersonasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoimagenpersonasForeignKey=new ArrayList<TipoImagenPersona>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoImagenPersonaLogic tipoimagenpersonaLogic=new TipoImagenPersonaLogic();

			tipoimagenpersonaLogic.getTipoImagenPersonaDataAccess().setIsForForeingKeyData(true);

			if(this.clienteimagenSessionBean==null) {
				this.clienteimagenSessionBean=new ClienteImagenSessionBean();
			}

			if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagenPersona()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenpersonaLogic.getTipoImagenPersonaDataAccess().setIsForForeingKeyData(true);

					tipoimagenpersonaLogic.getTodosTipoImagenPersonasWithConnection(sFinalQuery,new Pagination());

					this.tipoimagenpersonasForeignKey=tipoimagenpersonaLogic.getTipoImagenPersonas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoImagenPersona(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenpersonaLogic.getEntityWithConnection(clienteimagenSessionBean.getlidTipoImagenPersonaActual());
					this.tipoimagenpersonasForeignKey.add(tipoimagenpersonaLogic.getTipoImagenPersona());
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

	public void cargarCombosTipoImagensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoimagensForeignKey=new ArrayList<TipoImagen>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoImagenLogic tipoimagenLogic=new TipoImagenLogic();

			tipoimagenLogic.getTipoImagenDataAccess().setIsForForeingKeyData(true);

			if(this.clienteimagenSessionBean==null) {
				this.clienteimagenSessionBean=new ClienteImagenSessionBean();
			}

			if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagen()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenLogic.getTipoImagenDataAccess().setIsForForeingKeyData(true);

					tipoimagenLogic.getTodosTipoImagensWithConnection(sFinalQuery,new Pagination());

					this.tipoimagensForeignKey=tipoimagenLogic.getTipoImagens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoImagen(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenLogic.getEntityWithConnection(clienteimagenSessionBean.getlidTipoImagenActual());
					this.tipoimagensForeignKey.add(tipoimagenLogic.getTipoImagen());
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

					if(this.clienteimagen!=null) {
						this.clienteimagen.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormClienteImagen!=null) {
						this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteClienteImagen.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormClienteImagen!=null) {
						if(this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.getItemCount()>0) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteClienteImagen!=null) {
						jComboBoxid_clienteFK_IdClienteClienteImagen.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteClienteImagen!=null) {
							//jComboBoxid_clienteFK_IdClienteClienteImagen.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteClienteImagen.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteClienteImagen.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteClienteImagenGenerico)throws Exception
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
				jComboBoxid_clienteClienteImagenGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteClienteImagenGenerico!=null && jComboBoxid_clienteClienteImagenGenerico.getItemCount()>0) {
					jComboBoxid_clienteClienteImagenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoImagenPersonaForeignKey(Long idTipoImagenPersonaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoImagenPersona  tipoimagenpersonaTemp=null;

			for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasForeignKey) {
				if(tipoimagenpersonaAux.getId()!=null && tipoimagenpersonaAux.getId().equals(idTipoImagenPersonaSeleccionado)) {
					tipoimagenpersonaTemp=tipoimagenpersonaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoimagenpersonaTemp!=null) {

					if(this.clienteimagen!=null) {
						this.clienteimagen.setTipoImagenPersona(tipoimagenpersonaTemp);
					}

					if(this.jInternalFrameDetalleFormClienteImagen!=null) {
						this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setSelectedItem(tipoimagenpersonaTemp);
					}
				} else {
					//jComboBoxid_tipo_imagen_personaClienteImagen.setSelectedItem(tipoimagenpersonaTemp);
					if(this.jInternalFrameDetalleFormClienteImagen!=null) {
						if(this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.getItemCount()>0) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoImagenPersona") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoimagenpersonaTemp!=null && jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen!=null) {
						jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setSelectedItem(tipoimagenpersonaTemp);
					} else {
						if(jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen!=null) {
							//jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setSelectedItem(tipoimagenpersonaTemp);
							if(jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.getItemCount()>0) {
								jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setSelectedIndex(0);
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

	public String getActualTipoImagenPersonaForeignKeyDescripcion(Long idTipoImagenPersonaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoImagenPersona  tipoimagenpersonaTemp=null;

			for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasForeignKey) {
				if(tipoimagenpersonaAux.getId()!=null && tipoimagenpersonaAux.getId().equals(idTipoImagenPersonaSeleccionado)) {
					tipoimagenpersonaTemp=tipoimagenpersonaAux;
					break;
				}
			}


			sDescripcion=TipoImagenPersonaConstantesFunciones.getTipoImagenPersonaDescripcion(tipoimagenpersonaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoImagenPersonaForeignKeyGenerico(Long idTipoImagenPersonaSeleccionado,JComboBox jComboBoxid_tipo_imagen_personaClienteImagenGenerico)throws Exception
	{
		try
		{
			TipoImagenPersona  tipoimagenpersonaTemp=null;

			for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasForeignKey) {
				if(tipoimagenpersonaAux.getId()!=null && tipoimagenpersonaAux.getId().equals(idTipoImagenPersonaSeleccionado)) {
					tipoimagenpersonaTemp=tipoimagenpersonaAux;
					break;
				}
			}

			if(tipoimagenpersonaTemp!=null) {
				jComboBoxid_tipo_imagen_personaClienteImagenGenerico.setSelectedItem(tipoimagenpersonaTemp);
			} else {
				if(jComboBoxid_tipo_imagen_personaClienteImagenGenerico!=null && jComboBoxid_tipo_imagen_personaClienteImagenGenerico.getItemCount()>0) {
					jComboBoxid_tipo_imagen_personaClienteImagenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoImagenForeignKey(Long idTipoImagenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoImagen  tipoimagenTemp=null;

			for(TipoImagen tipoimagenAux:tipoimagensForeignKey) {
				if(tipoimagenAux.getId()!=null && tipoimagenAux.getId().equals(idTipoImagenSeleccionado)) {
					tipoimagenTemp=tipoimagenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoimagenTemp!=null) {

					if(this.clienteimagen!=null) {
						this.clienteimagen.setTipoImagen(tipoimagenTemp);
					}

					if(this.jInternalFrameDetalleFormClienteImagen!=null) {
						this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setSelectedItem(tipoimagenTemp);
					}
				} else {
					//jComboBoxid_tipo_imagenClienteImagen.setSelectedItem(tipoimagenTemp);
					if(this.jInternalFrameDetalleFormClienteImagen!=null) {
						if(this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.getItemCount()>0) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoImagen") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoimagenTemp!=null && jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen!=null) {
						jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.setSelectedItem(tipoimagenTemp);
					} else {
						if(jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen!=null) {
							//jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.setSelectedItem(tipoimagenTemp);
							if(jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.getItemCount()>0) {
								jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.setSelectedIndex(0);
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

	public String getActualTipoImagenForeignKeyDescripcion(Long idTipoImagenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoImagen  tipoimagenTemp=null;

			for(TipoImagen tipoimagenAux:tipoimagensForeignKey) {
				if(tipoimagenAux.getId()!=null && tipoimagenAux.getId().equals(idTipoImagenSeleccionado)) {
					tipoimagenTemp=tipoimagenAux;
					break;
				}
			}


			sDescripcion=TipoImagenConstantesFunciones.getTipoImagenDescripcion(tipoimagenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoImagenForeignKeyGenerico(Long idTipoImagenSeleccionado,JComboBox jComboBoxid_tipo_imagenClienteImagenGenerico)throws Exception
	{
		try
		{
			TipoImagen  tipoimagenTemp=null;

			for(TipoImagen tipoimagenAux:tipoimagensForeignKey) {
				if(tipoimagenAux.getId()!=null && tipoimagenAux.getId().equals(idTipoImagenSeleccionado)) {
					tipoimagenTemp=tipoimagenAux;
					break;
				}
			}

			if(tipoimagenTemp!=null) {
				jComboBoxid_tipo_imagenClienteImagenGenerico.setSelectedItem(tipoimagenTemp);
			} else {
				if(jComboBoxid_tipo_imagenClienteImagenGenerico!=null && jComboBoxid_tipo_imagenClienteImagenGenerico.getItemCount()>0) {
					jComboBoxid_tipo_imagenClienteImagenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ClienteImagen clienteimagen,JComboBox jComboBoxid_clienteClienteImagenGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteClienteImagenGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteClienteImagenGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				clienteimagen.setid_cliente(clienteAux.getId());
				clienteimagen.setcliente_descripcion(ClienteImagenConstantesFunciones.getClienteDescripcion(clienteAux));
				clienteimagen.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoImagenPersonaForeignKey(ClienteImagen clienteimagen,JComboBox jComboBoxid_tipo_imagen_personaClienteImagenGenerico)throws Exception
	{
		try
		{
			TipoImagenPersona  tipoimagenpersonaAux=new TipoImagenPersona();

			if(jComboBoxid_tipo_imagen_personaClienteImagenGenerico==null) {
				tipoimagenpersonaAux=(TipoImagenPersona)this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.getSelectedItem();
			} else {
				tipoimagenpersonaAux=(TipoImagenPersona)jComboBoxid_tipo_imagen_personaClienteImagenGenerico.getSelectedItem();
			}

			if(tipoimagenpersonaAux!=null && tipoimagenpersonaAux.getId()!=null) {
				clienteimagen.setid_tipo_imagen_persona(tipoimagenpersonaAux.getId());
				clienteimagen.settipoimagenpersona_descripcion(ClienteImagenConstantesFunciones.getTipoImagenPersonaDescripcion(tipoimagenpersonaAux));
				clienteimagen.setTipoImagenPersona(tipoimagenpersonaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoImagenForeignKey(ClienteImagen clienteimagen,JComboBox jComboBoxid_tipo_imagenClienteImagenGenerico)throws Exception
	{
		try
		{
			TipoImagen  tipoimagenAux=new TipoImagen();

			if(jComboBoxid_tipo_imagenClienteImagenGenerico==null) {
				tipoimagenAux=(TipoImagen)this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.getSelectedItem();
			} else {
				tipoimagenAux=(TipoImagen)jComboBoxid_tipo_imagenClienteImagenGenerico.getSelectedItem();
			}

			if(tipoimagenAux!=null && tipoimagenAux.getId()!=null) {
				clienteimagen.setid_tipo_imagen(tipoimagenAux.getId());
				clienteimagen.settipoimagen_descripcion(ClienteImagenConstantesFunciones.getTipoImagenDescripcion(tipoimagenAux));
				clienteimagen.setTipoImagen(tipoimagenAux);			}
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

					if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClienteImagen!=null) { 
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClienteImagen!=null) { 
					}

					if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteClienteImagen.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteClienteImagen.addItem(cliente);
							}
						}

						if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoImagenPersonasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoImagenPersona=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClienteImagen!=null) { 
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.removeAllItems();

							for(TipoImagenPersona tipoimagenpersona:this.tipoimagenpersonasForeignKey) {
								this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.addItem(tipoimagenpersona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClienteImagen!=null) { 
					}

					if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoImagenPersona") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.removeAllItems();

							for(TipoImagenPersona tipoimagenpersona:this.tipoimagenpersonasForeignKey) {
								this.jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.addItem(tipoimagenpersona);
							}
						}

						if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoImagensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoImagen=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClienteImagen!=null) { 
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.removeAllItems();

							for(TipoImagen tipoimagen:this.tipoimagensForeignKey) {
								this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.addItem(tipoimagen);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClienteImagen!=null) { 
					}

					if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoImagen") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.removeAllItems();

							for(TipoImagen tipoimagen:this.tipoimagensForeignKey) {
								this.jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.addItem(tipoimagen);
							}
						}

						if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormClienteImagen!=null) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormClienteImagen!=null) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteClienteImagen.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteClienteImagen.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoImagenPersonaForeignKey(TipoImagenPersona tipoimagenpersona,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormClienteImagen!=null) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setSelectedItem(tipoimagenpersona);
						}
					} else {
						if(this.jInternalFrameDetalleFormClienteImagen!=null) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setSelectedItem(tipoimagenpersona);
						} else {
							this.jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoImagenForeignKey(TipoImagen tipoimagen,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormClienteImagen!=null) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setSelectedItem(tipoimagen);
						}
					} else {
						if(this.jInternalFrameDetalleFormClienteImagen!=null) {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.setSelectedItem(tipoimagen);
						} else {
							this.jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesClienteImagen() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ClienteImagenConstantesFunciones.refrescarForeignKeysDescripcionesClienteImagen(this.clienteimagenLogic.getClienteImagens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ClienteImagenConstantesFunciones.refrescarForeignKeysDescripcionesClienteImagen(this.clienteimagens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoImagenPersona.class));
		classes.add(new Classe(TipoImagen.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//clienteimagenLogic.setClienteImagens(this.clienteimagens);
			clienteimagenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ClienteImagenParameterReturnGeneral getClienteImagenParameterGeneral() {
		return this.clienteimagenParameterGeneral;
	}
	
	public void setClienteImagenParameterGeneral(ClienteImagenParameterReturnGeneral clienteimagenParameterGeneral) {
		this.clienteimagenParameterGeneral = clienteimagenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoClienteImagen() {
		return isPermisoTodoClienteImagen;
	}

	public void setIsPermisoTodoClienteImagen(Boolean isPermisoTodoClienteImagen) {
		this.isPermisoTodoClienteImagen = isPermisoTodoClienteImagen;
	}

	public Boolean getIsPermisoNuevoClienteImagen() {
		return isPermisoNuevoClienteImagen;
	}

	public void setIsPermisoNuevoClienteImagen(Boolean isPermisoNuevoClienteImagen) {
		this.isPermisoNuevoClienteImagen = isPermisoNuevoClienteImagen;
	}

	public Boolean getIsPermisoActualizarClienteImagen() {
		return isPermisoActualizarClienteImagen;
	}

	public void setIsPermisoActualizarClienteImagen(Boolean isPermisoActualizarClienteImagen) {
		this.isPermisoActualizarClienteImagen = isPermisoActualizarClienteImagen;
	}

	public Boolean getIsPermisoEliminarClienteImagen() {
		return isPermisoEliminarClienteImagen;
	}

	public void setIsPermisoEliminarClienteImagen(Boolean isPermisoEliminarClienteImagen) {
		this.isPermisoEliminarClienteImagen = isPermisoEliminarClienteImagen;
	}

	public Boolean getIsPermisoGuardarCambiosClienteImagen() {
		return isPermisoGuardarCambiosClienteImagen;
	}

	public void setIsPermisoGuardarCambiosClienteImagen(Boolean isPermisoGuardarCambiosClienteImagen) {
		this.isPermisoGuardarCambiosClienteImagen = isPermisoGuardarCambiosClienteImagen;
	}
	
	public Boolean getIsPermisoConsultaClienteImagen() {
		return isPermisoConsultaClienteImagen;
	}

	public void setIsPermisoConsultaClienteImagen(Boolean isPermisoConsultaClienteImagen) {
		this.isPermisoConsultaClienteImagen = isPermisoConsultaClienteImagen;
	}

	public Boolean getIsPermisoBusquedaClienteImagen() {
		return isPermisoBusquedaClienteImagen;
	}

	public void setIsPermisoBusquedaClienteImagen(Boolean isPermisoBusquedaClienteImagen) {
		this.isPermisoBusquedaClienteImagen = isPermisoBusquedaClienteImagen;
	}

	public Boolean getIsPermisoReporteClienteImagen() {
		return isPermisoReporteClienteImagen;
	}

	public void setIsPermisoReporteClienteImagen(Boolean isPermisoReporteClienteImagen) {
		this.isPermisoReporteClienteImagen = isPermisoReporteClienteImagen;
	}
	
	public Boolean getIsPermisoPaginacionMedioClienteImagen() {
		return isPermisoPaginacionMedioClienteImagen;
	}

	public void setIsPermisoPaginacionMedioClienteImagen(Boolean isPermisoPaginacionMedioClienteImagen) {
		this.isPermisoPaginacionMedioClienteImagen = isPermisoPaginacionMedioClienteImagen;
	}
	
	public Boolean getIsPermisoPaginacionTodoClienteImagen() {
		return isPermisoPaginacionTodoClienteImagen;
	}

	public void setIsPermisoPaginacionTodoClienteImagen(Boolean isPermisoPaginacionTodoClienteImagen) {
		this.isPermisoPaginacionTodoClienteImagen = isPermisoPaginacionTodoClienteImagen;
	}
	
	public Boolean getIsPermisoPaginacionAltoClienteImagen() {
		return isPermisoPaginacionAltoClienteImagen;
	}

	public void setIsPermisoPaginacionAltoClienteImagen(Boolean isPermisoPaginacionAltoClienteImagen) {
		this.isPermisoPaginacionAltoClienteImagen = isPermisoPaginacionAltoClienteImagen;
	}
	
	public Boolean getIsPermisoCopiarClienteImagen() {
		return isPermisoCopiarClienteImagen;
	}

	public void setIsPermisoCopiarClienteImagen(Boolean isPermisoCopiarClienteImagen) {
		this.isPermisoCopiarClienteImagen = isPermisoCopiarClienteImagen;
	}
	
	public Boolean getIsPermisoVerFormClienteImagen() {
		return isPermisoVerFormClienteImagen;
	}

	public void setIsPermisoVerFormClienteImagen(Boolean isPermisoVerFormClienteImagen) {
		this.isPermisoVerFormClienteImagen = isPermisoVerFormClienteImagen;
	}
	
	public Boolean getIsPermisoDuplicarClienteImagen() {
		return isPermisoDuplicarClienteImagen;
	}

	public void setIsPermisoDuplicarClienteImagen(Boolean isPermisoDuplicarClienteImagen) {
		this.isPermisoDuplicarClienteImagen = isPermisoDuplicarClienteImagen;
	}
	
	public Boolean getIsPermisoOrdenClienteImagen() {
		return isPermisoOrdenClienteImagen;
	}

	public void setIsPermisoOrdenClienteImagen(Boolean isPermisoOrdenClienteImagen) {
		this.isPermisoOrdenClienteImagen = isPermisoOrdenClienteImagen;
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
	
	public Boolean getIsVisibilidadCeldaNuevoClienteImagen() {
		return isVisibilidadCeldaNuevoClienteImagen;
	}

	public void setIsVisibilidadCeldaNuevoClienteImagen(Boolean isVisibilidadCeldaNuevoClienteImagen) {
		this.isVisibilidadCeldaNuevoClienteImagen = isVisibilidadCeldaNuevoClienteImagen;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarClienteImagen() {
		return isVisibilidadCeldaDuplicarClienteImagen;
	}

	public void setIsVisibilidadCeldaDuplicarClienteImagen(Boolean isVisibilidadCeldaDuplicarClienteImagen) {
		this.isVisibilidadCeldaDuplicarClienteImagen = isVisibilidadCeldaDuplicarClienteImagen;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarClienteImagen() {
		return isVisibilidadCeldaCopiarClienteImagen;
	}

	public void setIsVisibilidadCeldaCopiarClienteImagen(Boolean isVisibilidadCeldaCopiarClienteImagen) {
		this.isVisibilidadCeldaCopiarClienteImagen = isVisibilidadCeldaCopiarClienteImagen;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormClienteImagen() {
		return isVisibilidadCeldaVerFormClienteImagen;
	}

	public void setIsVisibilidadCeldaVerFormClienteImagen(Boolean isVisibilidadCeldaVerFormClienteImagen) {
		this.isVisibilidadCeldaVerFormClienteImagen = isVisibilidadCeldaVerFormClienteImagen;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenClienteImagen() {
		return isVisibilidadCeldaOrdenClienteImagen;
	}

	public void setIsVisibilidadCeldaOrdenClienteImagen(Boolean isVisibilidadCeldaOrdenClienteImagen) {
		this.isVisibilidadCeldaOrdenClienteImagen = isVisibilidadCeldaOrdenClienteImagen;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesClienteImagen() {
		return isVisibilidadCeldaNuevoRelacionesClienteImagen;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesClienteImagen(Boolean isVisibilidadCeldaNuevoRelacionesClienteImagen) {
		this.isVisibilidadCeldaNuevoRelacionesClienteImagen = isVisibilidadCeldaNuevoRelacionesClienteImagen;
	}
	
	public Boolean getIsVisibilidadCeldaModificarClienteImagen() {
		return isVisibilidadCeldaModificarClienteImagen;
	}

	public void setIsVisibilidadCeldaModificarClienteImagen(Boolean isVisibilidadCeldaModificarClienteImagen) {
		this.isVisibilidadCeldaModificarClienteImagen = isVisibilidadCeldaModificarClienteImagen;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarClienteImagen() {
		return isVisibilidadCeldaActualizarClienteImagen;
	}

	public void setIsVisibilidadCeldaActualizarClienteImagen(Boolean isVisibilidadCeldaActualizarClienteImagen) {
		this.isVisibilidadCeldaActualizarClienteImagen = isVisibilidadCeldaActualizarClienteImagen;
	}

	public Boolean getIsVisibilidadCeldaEliminarClienteImagen() {
		return isVisibilidadCeldaEliminarClienteImagen;
	}

	public void setIsVisibilidadCeldaEliminarClienteImagen(Boolean isVisibilidadCeldaEliminarClienteImagen) {
		this.isVisibilidadCeldaEliminarClienteImagen = isVisibilidadCeldaEliminarClienteImagen;
	}

	public Boolean getIsVisibilidadCeldaCancelarClienteImagen() {
		return isVisibilidadCeldaCancelarClienteImagen;
	}

	public void setIsVisibilidadCeldaCancelarClienteImagen(Boolean isVisibilidadCeldaCancelarClienteImagen) {
		this.isVisibilidadCeldaCancelarClienteImagen = isVisibilidadCeldaCancelarClienteImagen;
	}

	public Boolean getIsVisibilidadCeldaGuardarClienteImagen() {
		return isVisibilidadCeldaGuardarClienteImagen;
	}

	public void setIsVisibilidadCeldaGuardarClienteImagen(Boolean isVisibilidadCeldaGuardarClienteImagen) {
		this.isVisibilidadCeldaGuardarClienteImagen = isVisibilidadCeldaGuardarClienteImagen;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosClienteImagen() {
		return isVisibilidadCeldaGuardarCambiosClienteImagen;
	}

	public void setIsVisibilidadCeldaGuardarCambiosClienteImagen(Boolean isVisibilidadCeldaGuardarCambiosClienteImagen) {
		this.isVisibilidadCeldaGuardarCambiosClienteImagen = isVisibilidadCeldaGuardarCambiosClienteImagen;
	}
		
	public ClienteImagenSessionBean getclienteimagenSessionBean() {
		return this.clienteimagenSessionBean;
	}
	
	public void setclienteimagenSessionBean(ClienteImagenSessionBean clienteimagenSessionBean) {
		this.clienteimagenSessionBean=clienteimagenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdTipoImagen() {
		return this.isVisibilidadFK_IdTipoImagen;
	}

	public void setisVisibilidadFK_IdTipoImagen(Boolean isVisibilidadFK_IdTipoImagen) {
		this.isVisibilidadFK_IdTipoImagen=isVisibilidadFK_IdTipoImagen;
	}

	public Boolean getisVisibilidadFK_IdTipoImagenPersona() {
		return this.isVisibilidadFK_IdTipoImagenPersona;
	}

	public void setisVisibilidadFK_IdTipoImagenPersona(Boolean isVisibilidadFK_IdTipoImagenPersona) {
		this.isVisibilidadFK_IdTipoImagenPersona=isVisibilidadFK_IdTipoImagenPersona;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysClienteImagen(ClienteImagen clienteimagen)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(clienteimagen,null);
				this.setActualParaGuardarTipoImagenPersonaForeignKey(clienteimagen,null);
				this.setActualParaGuardarTipoImagenForeignKey(clienteimagen,null);
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
	
	public void bugActualizarReferenciaActual(ClienteImagen clienteimagen,ClienteImagen clienteimagenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalClienteImagen(clienteimagen);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		clienteimagenAux.setId(clienteimagen.getId());
		clienteimagenAux.setVersionRow(clienteimagen.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessClienteImagen();
		
			int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = clienteimagenValidator.getInvalidValues(this.clienteimagen);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			clienteimagenLogic.setDatosCliente(datosCliente);
			clienteimagenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				clienteimagenAux=new  ClienteImagen();
				
				clienteimagenAux.setIsNew(true);
				clienteimagenAux.setIsChanged(true);
				
				clienteimagenAux.setClienteImagenOriginal(this.clienteimagen);
				
				clienteimagenAux.setId(this.clienteimagen.getId());	
				clienteimagenAux.setVersionRow(this.clienteimagen.getVersionRow());	
				clienteimagenAux.setid_cliente(this.clienteimagen.getid_cliente());	
				clienteimagenAux.setid_tipo_imagen_persona(this.clienteimagen.getid_tipo_imagen_persona());	
				clienteimagenAux.setid_tipo_imagen(this.clienteimagen.getid_tipo_imagen());	
				clienteimagenAux.setnombre(this.clienteimagen.getnombre());	
				clienteimagenAux.setimagen(this.clienteimagen.getimagen());	
				clienteimagenAux.setdescripcion(this.clienteimagen.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.clienteimagenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.clienteimagenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(clienteimagenAux,clienteimagenLogic.getClienteImagens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clienteimagenAux,clienteimagens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.clienteimagenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clienteimagenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagenLogic.saveClienteImagens();//WithConnection
						//clienteimagenLogic.getSetVersionRowClienteImagens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.clienteimagen,clienteimagenAux);
					
					this.refrescarForeignKeysDescripcionesClienteImagen();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clienteimagenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				clienteimagenAux=new  ClienteImagen();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.clienteimagenSessionBean.getEsGuardarRelacionado() 
					|| (this.clienteimagenSessionBean.getEsGuardarRelacionado() && this.clienteimagen.getId()>=0)) {
						
					clienteimagenAux.setIsNew(false);
				}
				
				clienteimagenAux.setIsDeleted(false);
			
				clienteimagenAux.setId(this.clienteimagen.getId());	
				clienteimagenAux.setVersionRow(this.clienteimagen.getVersionRow());	
				clienteimagenAux.setid_cliente(this.clienteimagen.getid_cliente());	
				clienteimagenAux.setid_tipo_imagen_persona(this.clienteimagen.getid_tipo_imagen_persona());	
				clienteimagenAux.setid_tipo_imagen(this.clienteimagen.getid_tipo_imagen());	
				clienteimagenAux.setnombre(this.clienteimagen.getnombre());	
				clienteimagenAux.setimagen(this.clienteimagen.getimagen());	
				clienteimagenAux.setdescripcion(this.clienteimagen.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(clienteimagenAux,clienteimagenLogic.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clienteimagenAux,clienteimagens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.clienteimagenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clienteimagenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagenLogic.saveClienteImagens();//WithConnection
						//clienteimagenLogic.getSetVersionRowClienteImagens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.clienteimagen,clienteimagenAux);
					
					this.refrescarForeignKeysDescripcionesClienteImagen();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clienteimagenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				clienteimagenAux=new  ClienteImagen();
				
				clienteimagenAux.setIsNew(false);
				clienteimagenAux.setIsChanged(false);
				
				clienteimagenAux.setIsDeleted(true);
				
				clienteimagenAux.setId(this.clienteimagen.getId());	
				clienteimagenAux.setVersionRow(this.clienteimagen.getVersionRow());	
				clienteimagenAux.setid_cliente(this.clienteimagen.getid_cliente());	
				clienteimagenAux.setid_tipo_imagen_persona(this.clienteimagen.getid_tipo_imagen_persona());	
				clienteimagenAux.setid_tipo_imagen(this.clienteimagen.getid_tipo_imagen());	
				clienteimagenAux.setnombre(this.clienteimagen.getnombre());	
				clienteimagenAux.setimagen(this.clienteimagen.getimagen());	
				clienteimagenAux.setdescripcion(this.clienteimagen.getdescripcion());	
				
				if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.clienteimagenAux.getId()>=0) {	
						this.clienteimagensEliminados.add(clienteimagenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(clienteimagenAux,clienteimagenLogic.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clienteimagenAux,clienteimagens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.clienteimagenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clienteimagenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagenLogic.saveClienteImagens();//WithConnection
						//clienteimagenLogic.getSetVersionRowClienteImagens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clienteimagenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.clienteimagenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.clienteimagenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(clienteimagenAux,clienteimagenLogic.getClienteImagens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(clienteimagenAux,clienteimagens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.getClienteImagens().addAll(this.clienteimagensEliminados);
					
					clienteimagenLogic.saveClienteImagens();//WithConnection
					//clienteimagenLogic.getSetVersionRowClienteImagens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesClienteImagen();
				
				this.clienteimagensEliminados= new ArrayList<ClienteImagen>();		
			}
			
			if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cliente Imagen GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.clienteimagen=clienteimagenAux;
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
      		//this.finishProcessClienteImagen();
      	}
		
	}	
	
	public void actualizarRelaciones(ClienteImagen clienteimagenLocal) throws Exception {
		
		if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ClienteImagen clienteimagenLocal) throws Exception {	
		if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				clienteimagenLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoImagenPersonaDetalleFormJInternalFrame.class)) {
				TipoImagenPersonaBeanSwingJInternalFrame tipoimagenpersonaBeanSwingJInternalFrameLocal=(TipoImagenPersonaBeanSwingJInternalFrame) ((TipoImagenPersonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoimagenpersonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoImagenPersona(tipoimagenpersonaBeanSwingJInternalFrameLocal.gettipoimagenpersona(),true);
				tipoimagenpersonaBeanSwingJInternalFrameLocal.actualizarLista(tipoimagenpersonaBeanSwingJInternalFrameLocal.tipoimagenpersona,this.tipoimagenpersonasForeignKey);

				tipoimagenpersonaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoimagenpersonaBeanSwingJInternalFrameLocal.tipoimagenpersona);

				clienteimagenLocal.setTipoImagenPersona(tipoimagenpersonaBeanSwingJInternalFrameLocal.tipoimagenpersona);

				this.addItemDefectoCombosForeignKeyTipoImagenPersona();
				this.cargarCombosFrameTipoImagenPersonasForeignKey("Formulario");
				this.setActualTipoImagenPersonaForeignKey(tipoimagenpersonaBeanSwingJInternalFrameLocal.tipoimagenpersona.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoImagenDetalleFormJInternalFrame.class)) {
				TipoImagenBeanSwingJInternalFrame tipoimagenBeanSwingJInternalFrameLocal=(TipoImagenBeanSwingJInternalFrame) ((TipoImagenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoimagenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoImagen(tipoimagenBeanSwingJInternalFrameLocal.gettipoimagen(),true);
				tipoimagenBeanSwingJInternalFrameLocal.actualizarLista(tipoimagenBeanSwingJInternalFrameLocal.tipoimagen,this.tipoimagensForeignKey);

				tipoimagenBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoimagenBeanSwingJInternalFrameLocal.tipoimagen);

				clienteimagenLocal.setTipoImagen(tipoimagenBeanSwingJInternalFrameLocal.tipoimagen);

				this.addItemDefectoCombosForeignKeyTipoImagen();
				this.cargarCombosFrameTipoImagensForeignKey("Formulario");
				this.setActualTipoImagenForeignKey(tipoimagenBeanSwingJInternalFrameLocal.tipoimagen.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarClienteImagenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = clienteimagenValidator.getInvalidValues(this.clienteimagen);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ClienteImagen clienteimagen,List<ClienteImagen> clienteimagens) throws Exception {
		try	{		
			ClienteImagenConstantesFunciones.actualizarLista(clienteimagen,clienteimagens,this.clienteimagenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ClienteImagen clienteimagen,List<ClienteImagen> clienteimagens) throws Exception {
		try	{			
			ClienteImagenConstantesFunciones.actualizarSelectedLista(clienteimagen,clienteimagens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ClienteImagen> clienteimagensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				clienteimagensLocal=this.clienteimagenLogic.getClienteImagens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				clienteimagensLocal=this.clienteimagens;
			}
			//ARCHITECTURE
		
			for(ClienteImagen clienteimagenLocal:clienteimagensLocal) {
				if(this.permiteMantenimiento(clienteimagenLocal) && clienteimagenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ClienteImagenConstantesFunciones.getClienteImagenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ClienteImagenConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabelid_clienteClienteImagen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteImagenConstantesFunciones.IDTIPOIMAGENPERSONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabelid_tipo_imagen_personaClienteImagen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteImagenConstantesFunciones.IDTIPOIMAGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabelid_tipo_imagenClienteImagen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteImagenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabelnombreClienteImagen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteImagenConstantesFunciones.IMAGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabelimagenClienteImagen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteImagenConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabeldescripcionClienteImagen,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteImagen.jLabelid_clienteClienteImagen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteImagen.jLabelid_tipo_imagen_personaClienteImagen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteImagen.jLabelid_tipo_imagenClienteImagen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteImagen.jLabelnombreClienteImagen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteImagen.jLabelimagenClienteImagen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteImagen.jLabeldescripcionClienteImagen,"");
		
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
		this.iIdNuevoClienteImagen--;	
		
		
		this.clienteimagenAux=new ClienteImagen();
		
		this.clienteimagenAux.setId(this.iIdNuevoClienteImagen);
		this.clienteimagenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.clienteimagenLogic.getClienteImagens().add(this.clienteimagenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.clienteimagens.add(this.clienteimagenAux);
		}
		//ARCHITECTURE
		
		this.clienteimagen=this.clienteimagenAux;
		
		if(ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioClienteImagen(this.clienteimagen);
			this.setVariablesObjetoActualToFormularioForeignKeyClienteImagen(this.clienteimagen);
		}
				
		//this.setDefaultControlesClienteImagen();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyClienteImagen();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyClienteImagen();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyClienteImagen();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClienteImagen(this.clienteimagenBean,this.clienteimagen,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ClienteImagenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
			classes=ClienteImagenConstantesFunciones.getClassesRelationshipsOfClienteImagen(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.clienteimagenReturnGeneral=clienteimagenLogic.procesarEventosClienteImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clienteimagenLogic.getClienteImagens(),this.clienteimagen,this.clienteimagenParameterGeneral,this.isEsNuevoClienteImagen,classes);//this.clienteimagenLogic.getClienteImagen()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanClienteImagen(this.clienteimagenReturnGeneral,this.clienteimagenBean,false);
		
		if(this.clienteimagenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyClienteImagen(this.clienteimagenReturnGeneral.getClienteImagen());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioClienteImagen(this.clienteimagenReturnGeneral.getClienteImagen());
		}
		
		if(this.clienteimagenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioClienteImagen(this.clienteimagenReturnGeneral.getClienteImagen(),classes);//this.clienteimagenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyClienteImagen();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyClienteImagen();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClienteImagenBeanSwingJInternalFrameAdditional.RecargarFormClienteImagen(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingClienteImagen(false);
						
			if(clienteimagenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteImagen();
			}
			
			this.actualizarVisualTableDatosClienteImagen();
			
			this.jTableDatosClienteImagen.setRowSelectionInterval(this.getIndiceNuevoClienteImagen(), this.getIndiceNuevoClienteImagen());
			
			this.seleccionarFilaTablaClienteImagenActual();
						
			this.actualizarEstadoCeldasBotonesClienteImagen("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesClienteImagen(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormClienteImagen.jTextFieldnombreClienteImagen.setEnabled(isHabilitar && this.clienteimagenConstantesFunciones.activarnombreClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jTextAreadescripcionClienteImagen.setEnabled(isHabilitar && this.clienteimagenConstantesFunciones.activardescripcionClienteImagen);	
		
		this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setEnabled(isHabilitar && this.clienteimagenConstantesFunciones.activarid_clienteClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setEnabled(isHabilitar && this.clienteimagenConstantesFunciones.activarid_tipo_imagen_personaClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setEnabled(isHabilitar && this.clienteimagenConstantesFunciones.activarid_tipo_imagenClienteImagen);
	};
	
	public void setDefaultControlesClienteImagen() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoClienteImagen(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.clienteimagenSessionBean.setConGuardarRelaciones(true);			
			this.clienteimagenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.setVisible(true);
			
					
		} else {
			//this.clienteimagenSessionBean.setConGuardarRelaciones(false);			
			this.clienteimagenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoClienteImagen() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
				if(clienteimagenAux.getId().equals(this.iIdNuevoClienteImagen)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteImagen clienteimagenAux:this.clienteimagens) {
				if(clienteimagenAux.getId().equals(this.iIdNuevoClienteImagen)) {
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
	
	public int getIndiceActualClienteImagen(ClienteImagen clienteimagen,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
				if(clienteimagenAux.getId().equals(clienteimagen.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteImagen clienteimagenAux:this.clienteimagens) {
				if(clienteimagenAux.getId().equals(clienteimagen.getId())) {
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
	
	public void setCamposBaseDesdeOriginalClienteImagen(ClienteImagen clienteimagenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
				if(clienteimagenAux.getClienteImagenOriginal().getId().equals(clienteimagenOriginal.getId())) {
					existe=true;
					clienteimagenOriginal.setId(clienteimagenAux.getId());
					clienteimagenOriginal.setVersionRow(clienteimagenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteImagen clienteimagenAux:this.clienteimagens) {
				if(clienteimagenAux.getClienteImagenOriginal().getId().equals(clienteimagenOriginal.getId())) {
					existe=true;
					clienteimagenOriginal.setId(clienteimagenAux.getId());
					clienteimagenOriginal.setVersionRow(clienteimagenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosClienteImagen(Boolean esParaCancelar) throws Exception {
		clienteimagensAux=new ArrayList<ClienteImagen>();
		clienteimagenAux=new ClienteImagen();
		
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
					if(clienteimagenAux.getId()<0) {
						clienteimagensAux.add(clienteimagenAux);
					}		
				}
				this.iIdNuevoClienteImagen=0L;
				this.clienteimagenLogic.getClienteImagens().removeAll(clienteimagensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteImagen clienteimagenAux:this.clienteimagens) {
					if(clienteimagenAux.getId()<0) {
						clienteimagensAux.add(clienteimagenAux);
					}		
				}
				this.iIdNuevoClienteImagen=0L;
				this.clienteimagens.removeAll(clienteimagensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoClienteImagen 
					&& this.clienteimagenLogic.getClienteImagens().size()>0
					) {
					clienteimagenAux=this.clienteimagenLogic.getClienteImagens().get(this.clienteimagenLogic.getClienteImagens().size() - 1);
				
					if(clienteimagenAux.getId()<0) {
						this.clienteimagenLogic.getClienteImagens().remove(clienteimagenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoClienteImagen && this.clienteimagens.size()>0) {
					clienteimagenAux=this.clienteimagens.get(this.clienteimagens.size() - 1);
				
					if(clienteimagenAux.getId()<0) {
						this.clienteimagens.remove(clienteimagenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoClienteImagen(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(clienteimagen.getId()<0) {
				this.clienteimagenLogic.getClienteImagens().remove(this.clienteimagen);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(clienteimagen.getId()<0) {
				this.clienteimagens.remove(this.clienteimagen);
			}
		}			
	}
	
	public void setEstadosInicialesClienteImagen(List<ClienteImagen> clienteimagensAux) throws Exception {
		ClienteImagenConstantesFunciones.setEstadosInicialesClienteImagen(clienteimagensAux);
	}
	
	public void setEstadosInicialesClienteImagen(ClienteImagen clienteimagenAux) throws Exception {
		ClienteImagenConstantesFunciones.setEstadosInicialesClienteImagen(clienteimagenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarClienteImagenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesClienteImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarClienteImagenActual()) {
				if(!this.isEsNuevoClienteImagen) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesClienteImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoClienteImagen=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarClienteImagenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cliente Imagen ?", "MANTENIMIENTO DE Cliente Imagen", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesClienteImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ClienteImagen clienteimagen) throws Exception {
		ClienteImagenConstantesFunciones.seleccionarAsignar(this.clienteimagen,clienteimagen);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarClienteImagen=this.isPermisoActualizarOriginalClienteImagen;
			
			
			this.seleccionarAsignar(clienteimagen);
			
			

			idClienteActual=clienteimagen.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClienteImagenConstantesFunciones.quitarEspaciosClienteImagen(this.clienteimagen,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesClienteImagen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.clienteimagenSessionBean.setsFuncionBusquedaRapida(this.clienteimagenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoClienteImagen) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosClienteImagen(esParaCancelar);				
				this.cancelarNuevoClienteImagen(esParaCancelar);								
			}
			
			this.clienteimagen=new ClienteImagen();
			
			this.inicializarClienteImagen();
			
			this.actualizarEstadoCeldasBotonesClienteImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarClienteImagen() throws Exception {
		try {
			ClienteImagenConstantesFunciones.inicializarClienteImagen(this.clienteimagen);
			
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
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.clienteimagenLogic.getClienteImagens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteClienteImagens(String sAccionBusqueda,List<ClienteImagen> clienteimagensParaReportes) throws Exception {
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
					sPathReporteFinal="ClienteImagen"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ClienteImagenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ClienteImagenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ClienteImagen"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cliente Imagenes");		
		parameters.put("busquedapor", ClienteImagenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceClienteImagen=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ClienteImagenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ClienteImagenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceClienteImagen=new JRBeanArrayDataSource(ClienteImagenJInternalFrame.TraerClienteImagenBeans(clienteimagensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceClienteImagen);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ClienteImagenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ClienteImagenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ClienteImagenBean.TraerClienteImagenBeans(clienteimagensParaReportes).toArray()));
							
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
				this.generarExcelReporteClienteImagens(sAccionBusqueda,sTipoArchivoReporte,clienteimagensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalClienteImagens(sAccionBusqueda,sTipoArchivoReporte,clienteimagensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoClienteImagenActionPerformed(null);
					//this.generarExcelReporteClienteImagens(sAccionBusqueda,sTipoArchivoReporte,clienteimagensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalClienteImagens(sAccionBusqueda,sTipoArchivoReporte,clienteimagensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesClienteImagens(sAccionBusqueda,sTipoArchivoReporte,clienteimagensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesClienteImagens(sAccionBusqueda,sTipoArchivoReporte,clienteimagensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteClienteImagens(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteImagen> clienteimagensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clienteimagen";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteImagens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClienteImagen("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ClienteImagen clienteimagen : clienteimagensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ClienteImagenConstantesFunciones.generarExcelReporteDataClienteImagen("NORMAL",row,workbook,clienteimagen,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderClienteImagen(String sTipo,Row row,Workbook workbook) {
		
		ClienteImagenConstantesFunciones.generarExcelReporteHeaderClienteImagen(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalClienteImagens(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteImagen> clienteimagensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clienteimagen_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteImagens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ClienteImagen clienteimagen : clienteimagensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ClienteImagenConstantesFunciones.getClienteImagenDescripcion(clienteimagen));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteImagenConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clienteimagen.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clienteimagen.gettipoimagenpersona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clienteimagen.gettipoimagen_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteImagenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clienteimagen.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteImagenConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clienteimagen.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesClienteImagens(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteImagen> clienteimagensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ClienteImagen> clienteimagensRespaldo=null;
		
		classes=ClienteImagenConstantesFunciones.getClassesRelationshipsOfClienteImagen(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.clienteimagenLogic.setDatosCliente(this.datosCliente);
		this.clienteimagenLogic.setDatosDeep(this.datosDeep);
		this.clienteimagenLogic.setIsConDeep(true);
		
		clienteimagensRespaldo=this.clienteimagenLogic.getClienteImagens();
		
		this.clienteimagenLogic.setClienteImagens(clienteimagensParaReportes);	
		this.clienteimagenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		clienteimagensParaReportes=this.clienteimagenLogic.getClienteImagens();
		this.clienteimagenLogic.setClienteImagens(clienteimagensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clienteimagen_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteImagens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClienteImagen("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ClienteImagen clienteimagen : clienteimagensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderClienteImagen("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ClienteImagenConstantesFunciones.generarExcelReporteDataClienteImagen("NORMAL",row,workbook,clienteimagen,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ClienteImagenConstantesFunciones.getClienteImagenDescripcion(clienteimagen));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoClienteImagen.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessClienteImagen() throws Exception {		
		this.startProcessClienteImagen(true);
	}
	
	public void startProcessClienteImagen(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasClienteImagen ,this.jPanelParametrosReportesClienteImagen, this.jScrollPanelDatosClienteImagen,this.jPanelPaginacionClienteImagen, this.jScrollPanelDatosEdicionClienteImagen, this.jPanelAccionesClienteImagen,this.jPanelAccionesFormularioClienteImagen,this.jmenuBarClienteImagen,this.jmenuBarDetalleClienteImagen,this.jTtoolBarClienteImagen,this.jTtoolBarDetalleClienteImagen);		
		
		final JTabbedPane jTabbedPaneBusquedasClienteImagen=this.jTabbedPaneBusquedasClienteImagen; 
		
		final JPanel jPanelParametrosReportesClienteImagen=this.jPanelParametrosReportesClienteImagen;
		//final JScrollPane jScrollPanelDatosClienteImagen=this.jScrollPanelDatosClienteImagen;
		final JTable jTableDatosClienteImagen=this.jTableDatosClienteImagen;		
		final JPanel jPanelPaginacionClienteImagen=this.jPanelPaginacionClienteImagen;
		//final JScrollPane jScrollPanelDatosEdicionClienteImagen=this.jScrollPanelDatosEdicionClienteImagen;
		final JPanel jPanelAccionesClienteImagen=this.jPanelAccionesClienteImagen;
		
		JPanel jPanelCamposAuxiliarClienteImagen=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarClienteImagen=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			jPanelCamposAuxiliarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jPanelCamposClienteImagen;
			jPanelAccionesFormularioAuxiliarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jPanelAccionesFormularioClienteImagen;
		}
		
		final JPanel jPanelCamposClienteImagen=jPanelCamposAuxiliarClienteImagen;
		final JPanel jPanelAccionesFormularioClienteImagen=jPanelAccionesFormularioAuxiliarClienteImagen;
		
		
		final JMenuBar jmenuBarClienteImagen=this.jmenuBarClienteImagen;
		final JToolBar jTtoolBarClienteImagen=this.jTtoolBarClienteImagen;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarClienteImagen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClienteImagen=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			jmenuBarDetalleAuxiliarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jmenuBarDetalleClienteImagen;
			jTtoolBarDetalleAuxiliarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jTtoolBarDetalleClienteImagen;
		}
		
		final JMenuBar jmenuBarDetalleClienteImagen=jmenuBarDetalleAuxiliarClienteImagen;
		final JToolBar jTtoolBarDetalleClienteImagen=jTtoolBarDetalleAuxiliarClienteImagen;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClienteImagen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClienteImagen;
			processRunnable.jTableDatos=jTableDatosClienteImagen;
			processRunnable.jPanelCampos=jPanelCamposClienteImagen;
			processRunnable.jPanelPaginacion=jPanelPaginacionClienteImagen;
			processRunnable.jPanelAcciones=jPanelAccionesClienteImagen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClienteImagen;
			
			
			processRunnable.jmenuBar=jmenuBarClienteImagen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClienteImagen;
			processRunnable.jTtoolBar=jTtoolBarClienteImagen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClienteImagen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClienteImagen ,jPanelParametrosReportesClienteImagen,jTableDatosClienteImagen, /*jScrollPanelDatosClienteImagen,*/jPanelCamposClienteImagen,jPanelPaginacionClienteImagen, /*jScrollPanelDatosEdicionClienteImagen,*/ jPanelAccionesClienteImagen,jPanelAccionesFormularioClienteImagen,jmenuBarClienteImagen,jmenuBarDetalleClienteImagen,jTtoolBarClienteImagen,jTtoolBarDetalleClienteImagen);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClienteImagen ,jPanelParametrosReportesClienteImagen, jScrollPanelDatosClienteImagen,jPanelPaginacionClienteImagen, jScrollPanelDatosEdicionClienteImagen, jPanelAccionesClienteImagen,jPanelAccionesFormularioClienteImagen,jmenuBarClienteImagen,jmenuBarDetalleClienteImagen,jTtoolBarClienteImagen,jTtoolBarDetalleClienteImagen);
						
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
	
	public void finishProcessClienteImagen() {// throws Exception 
		this.finishProcessClienteImagen(true);
	}
	
	public void finishProcessClienteImagen(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasClienteImagen ,this.jPanelParametrosReportesClienteImagen, this.jScrollPanelDatosClienteImagen,this.jPanelPaginacionClienteImagen, this.jScrollPanelDatosEdicionClienteImagen, this.jPanelAccionesClienteImagen,this.jPanelAccionesFormularioClienteImagen,this.jmenuBarClienteImagen,this.jmenuBarDetalleClienteImagen,this.jTtoolBarClienteImagen,this.jTtoolBarDetalleClienteImagen);		
		
		final JTabbedPane jTabbedPaneBusquedasClienteImagen=this.jTabbedPaneBusquedasClienteImagen; 
		
		final JPanel jPanelParametrosReportesClienteImagen=this.jPanelParametrosReportesClienteImagen;
		//final JScrollPane jScrollPanelDatosClienteImagen=this.jScrollPanelDatosClienteImagen;
		final JTable jTableDatosClienteImagen=this.jTableDatosClienteImagen;		
		final JPanel jPanelPaginacionClienteImagen=this.jPanelPaginacionClienteImagen;
		//final JScrollPane jScrollPanelDatosEdicionClienteImagen=this.jScrollPanelDatosEdicionClienteImagen;
		final JPanel jPanelAccionesClienteImagen=this.jPanelAccionesClienteImagen;
		
		JPanel jPanelCamposAuxiliarClienteImagen=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarClienteImagen=new JPanel();
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			jPanelCamposAuxiliarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jPanelCamposClienteImagen;
			jPanelAccionesFormularioAuxiliarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jPanelAccionesFormularioClienteImagen;
		}
		
		final JPanel jPanelCamposClienteImagen=jPanelCamposAuxiliarClienteImagen;
		final JPanel jPanelAccionesFormularioClienteImagen=jPanelAccionesFormularioAuxiliarClienteImagen;
		
		
		final JMenuBar jmenuBarClienteImagen=this.jmenuBarClienteImagen;		
		final JToolBar jTtoolBarClienteImagen=this.jTtoolBarClienteImagen;
				
		JMenuBar jmenuBarDetalleAuxiliarClienteImagen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClienteImagen=new JToolBar();
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			jmenuBarDetalleAuxiliarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jmenuBarDetalleClienteImagen;
			jTtoolBarDetalleAuxiliarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jTtoolBarDetalleClienteImagen;		
		}
		
		final JMenuBar jmenuBarDetalleClienteImagen=jmenuBarDetalleAuxiliarClienteImagen;
		final JToolBar jTtoolBarDetalleClienteImagen=jTtoolBarDetalleAuxiliarClienteImagen;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClienteImagen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClienteImagen;
			processRunnable.jTableDatos=jTableDatosClienteImagen;
			processRunnable.jPanelCampos=jPanelCamposClienteImagen;
			processRunnable.jPanelPaginacion=jPanelPaginacionClienteImagen;
			processRunnable.jPanelAcciones=jPanelAccionesClienteImagen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClienteImagen;
			
			
			processRunnable.jmenuBar=jmenuBarClienteImagen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClienteImagen;
			processRunnable.jTtoolBar=jTtoolBarClienteImagen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClienteImagen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasClienteImagen ,jPanelParametrosReportesClienteImagen, jTableDatosClienteImagen,/*jScrollPanelDatosClienteImagen,*/jPanelCamposClienteImagen,jPanelPaginacionClienteImagen, /*jScrollPanelDatosEdicionClienteImagen,*/ jPanelAccionesClienteImagen,jPanelAccionesFormularioClienteImagen,jmenuBarClienteImagen,jmenuBarDetalleClienteImagen,jTtoolBarClienteImagen,jTtoolBarDetalleClienteImagen));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesClienteImagen(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarClienteImagen(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuClienteImagen(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarClienteImagen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarClienteImagen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleClienteImagen,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuClienteImagen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarClienteImagen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleClienteImagen,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.clienteimagenConstantesFunciones.getsFinalQueryClienteImagen();
		String  finalQueryPaginacionTodos=this.clienteimagenConstantesFunciones.getsFinalQueryClienteImagen();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ClienteImagenConstantesFunciones.getArrayColumnasGlobalesNoClienteImagen(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ClienteImagenConstantesFunciones.getArrayColumnasGlobalesClienteImagen(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ClienteImagenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.clienteimagensEliminados= new ArrayList<ClienteImagen>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessClienteImagen();
		
				///*ClienteImagenSessionBean*/this.clienteimagenSessionBean=new ClienteImagenSessionBean();
			
			if(this.clienteimagenSessionBean==null) {
				this.clienteimagenSessionBean=new ClienteImagenSessionBean();
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
					this.iNumeroPaginacion=ClienteImagenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ClienteImagenConstantesFunciones.getClassesForeignKeysOfClienteImagen(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/clienteimagen."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			clienteimagensAux= new ArrayList<ClienteImagen>();
			
				
			clienteimagenLogic.setDatosCliente(this.datosCliente);
			clienteimagenLogic.setDatosDeep(this.datosDeep);
			clienteimagenLogic.setIsConDeep(true);
			
			
			clienteimagenLogic.getClienteImagenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					clienteimagenLogic.getTodosClienteImagens(finalQueryGlobal,pagination);
					
					//clienteimagenLogic.getTodosClienteImagensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(clienteimagenLogic.getClienteImagens()==null|| clienteimagenLogic.getClienteImagens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clienteimagensAux= new ArrayList<ClienteImagen>();
							clienteimagensAux.addAll(clienteimagenLogic.getClienteImagens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagensAux= new ArrayList<ClienteImagen>();
							clienteimagensAux.addAll(clienteimagens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clienteimagenLogic.getTodosClienteImagens(finalQueryGlobal+"",this.pagination);												
							
							//clienteimagenLogic.getTodosClienteImagensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteClienteImagens("Todos",clienteimagenLogic.getClienteImagens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clienteimagenLogic.setClienteImagens(new ArrayList<ClienteImagen>());					
							clienteimagenLogic.getClienteImagens().addAll(clienteimagensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagens=new ArrayList<ClienteImagen>();
							clienteimagens.addAll(clienteimagensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idClienteImagen=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idClienteImagen=this.idActual;
				
				} else if(this.idClienteImagenActual!=null && this.idClienteImagenActual!=0L) {
					idClienteImagen=idClienteImagenActual;
				}
				
					
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndicePorId(idClienteImagen);
				
				this.clienteimagens=new ArrayList<ClienteImagen>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					clienteimagenLogic.getEntity(idClienteImagen);
					
					//clienteimagenLogic.getEntityWithConnection(idClienteImagen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteimagenLogic.setClienteImagens(new ArrayList<ClienteImagen>());
					clienteimagenLogic.getClienteImagens().add(clienteimagenLogic.getClienteImagen());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clienteimagens=new ArrayList<ClienteImagen>();
					this.clienteimagens.add(clienteimagen);
				}
				
				if(clienteimagenLogic.getClienteImagen()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					clienteimagenLogic.getClienteImagensFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=clienteimagenLogic.getClienteImagens()==null||clienteimagenLogic.getClienteImagens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=clienteimagens==null|| clienteimagens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagensAux=new ArrayList<ClienteImagen>();
						clienteimagensAux.addAll(clienteimagenLogic.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagensAux=new ArrayList<ClienteImagen>();
							clienteimagensAux.addAll(clienteimagens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							clienteimagenLogic.getClienteImagensFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClienteImagens("FK_IdCliente",clienteimagenLogic.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClienteImagens("FK_IdCliente",clienteimagens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagenLogic.setClienteImagens(new ArrayList<ClienteImagen>());
						clienteimagenLogic.getClienteImagens().addAll(clienteimagensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagens=new ArrayList<ClienteImagen>();
							clienteimagens.addAll(clienteimagensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoImagen")) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					clienteimagenLogic.getClienteImagensFK_IdTipoImagen(finalQueryGlobal,pagination,id_tipo_imagenFK_IdTipoImagen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=clienteimagenLogic.getClienteImagens()==null||clienteimagenLogic.getClienteImagens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=clienteimagens==null|| clienteimagens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagensAux=new ArrayList<ClienteImagen>();
						clienteimagensAux.addAll(clienteimagenLogic.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagensAux=new ArrayList<ClienteImagen>();
							clienteimagensAux.addAll(clienteimagens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							clienteimagenLogic.getClienteImagensFK_IdTipoImagen(finalQueryGlobal,pagination,id_tipo_imagenFK_IdTipoImagen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClienteImagens("FK_IdTipoImagen",clienteimagenLogic.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClienteImagens("FK_IdTipoImagen",clienteimagens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagenLogic.setClienteImagens(new ArrayList<ClienteImagen>());
						clienteimagenLogic.getClienteImagens().addAll(clienteimagensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagens=new ArrayList<ClienteImagen>();
							clienteimagens.addAll(clienteimagensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoImagenPersona")) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagenPersona(id_tipo_imagen_personaFK_IdTipoImagenPersona);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					clienteimagenLogic.getClienteImagensFK_IdTipoImagenPersona(finalQueryGlobal,pagination,id_tipo_imagen_personaFK_IdTipoImagenPersona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagenPersona(id_tipo_imagen_personaFK_IdTipoImagenPersona);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagenPersona(id_tipo_imagen_personaFK_IdTipoImagenPersona);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=clienteimagenLogic.getClienteImagens()==null||clienteimagenLogic.getClienteImagens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=clienteimagens==null|| clienteimagens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagensAux=new ArrayList<ClienteImagen>();
						clienteimagensAux.addAll(clienteimagenLogic.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagensAux=new ArrayList<ClienteImagen>();
							clienteimagensAux.addAll(clienteimagens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							clienteimagenLogic.getClienteImagensFK_IdTipoImagenPersona(finalQueryGlobal,pagination,id_tipo_imagen_personaFK_IdTipoImagenPersona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagenPersona(id_tipo_imagen_personaFK_IdTipoImagenPersona);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteImagenConstantesFunciones.getDetalleIndiceFK_IdTipoImagenPersona(id_tipo_imagen_personaFK_IdTipoImagenPersona);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClienteImagens("FK_IdTipoImagenPersona",clienteimagenLogic.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClienteImagens("FK_IdTipoImagenPersona",clienteimagens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagenLogic.setClienteImagens(new ArrayList<ClienteImagen>());
						clienteimagenLogic.getClienteImagens().addAll(clienteimagensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagens=new ArrayList<ClienteImagen>();
							clienteimagens.addAll(clienteimagensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesClienteImagen();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessClienteImagen();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=clienteimagenLogic.getClienteImagens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clienteimagens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=clienteimagenLogic.getClienteImagens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clienteimagens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ClienteImagen clienteimagen) {
		Boolean permite=true;
		
		if(this.clienteimagen.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ClienteImagenConstantesFunciones.getOrderByListaClienteImagen();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ClienteImagenConstantesFunciones.getOrderByListaClienteImagen();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteImagen clienteimagen:clienteimagenLogic.getClienteImagens()) {
				if(clienteimagen.getsType().equals(Constantes2.S_TOTALES)) {
					clienteimagenTotales=clienteimagen;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteImagen clienteimagen:this.clienteimagens) {
				if(clienteimagen.getsType().equals(Constantes2.S_TOTALES)) {
					clienteimagenTotales=clienteimagen;
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
			this.clienteimagenAux=new ClienteImagen();
			this.clienteimagenAux.setsType(Constantes2.S_TOTALES);
			this.clienteimagenAux.setIsNew(false);
			this.clienteimagenAux.setIsChanged(false);
			this.clienteimagenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ClienteImagenConstantesFunciones.TotalizarValoresFilaClienteImagen(this.clienteimagenLogic.getClienteImagens(),this.clienteimagenAux);
				
				this.clienteimagenLogic.getClienteImagens().add(this.clienteimagenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ClienteImagenConstantesFunciones.TotalizarValoresFilaClienteImagen(this.clienteimagens,this.clienteimagenAux);
				
				this.clienteimagens.add(this.clienteimagenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		clienteimagenTotales=new ClienteImagen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.clienteimagenLogic.getClienteImagens().remove(clienteimagenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.clienteimagens.remove(clienteimagenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		clienteimagenTotales=new ClienteImagen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteImagen clienteimagen:clienteimagenLogic.getClienteImagens()) {
				if(clienteimagen.getsType().equals(Constantes2.S_TOTALES)) {
					clienteimagenTotales=clienteimagen;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClienteImagenConstantesFunciones.TotalizarValoresFilaClienteImagen(this.clienteimagenLogic.getClienteImagens(),clienteimagenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteImagen clienteimagen:this.clienteimagens) {
				if(clienteimagen.getsType().equals(Constantes2.S_TOTALES)) {
					clienteimagenTotales=clienteimagen;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClienteImagenConstantesFunciones.TotalizarValoresFilaClienteImagen(this.clienteimagens,clienteimagenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getClienteImagensFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClienteImagensFK_IdTipoImagen()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoImagen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClienteImagensFK_IdTipoImagenPersona()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoImagenPersona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getClienteImagensFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteimagenLogic.getClienteImagensFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClienteImagensFK_IdTipoImagen(String sFinalQuery,Long id_tipo_imagen)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteimagenLogic.getClienteImagensFK_IdTipoImagen(sFinalQuery,this.pagination,id_tipo_imagen);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClienteImagensFK_IdTipoImagenPersona(String sFinalQuery,Long id_tipo_imagen_persona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteimagenLogic.getClienteImagensFK_IdTipoImagenPersona(sFinalQuery,this.pagination,id_tipo_imagen_persona);
				
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
	
	public void inicializarPermisosClienteImagen() {
		this.isPermisoTodoClienteImagen=false;
		this.isPermisoNuevoClienteImagen=false;
		this.isPermisoActualizarClienteImagen=false;
		this.isPermisoActualizarOriginalClienteImagen=false;
		this.isPermisoEliminarClienteImagen=false;
		this.isPermisoGuardarCambiosClienteImagen=false;
		this.isPermisoConsultaClienteImagen=false;
		this.isPermisoBusquedaClienteImagen=false;
		this.isPermisoReporteClienteImagen=false;		
		this.isPermisoOrdenClienteImagen=false;		
		this.isPermisoPaginacionMedioClienteImagen=false;		
		this.isPermisoPaginacionAltoClienteImagen=false;
		this.isPermisoPaginacionTodoClienteImagen=false;
		this.isPermisoCopiarClienteImagen=false;		
		this.isPermisoVerFormClienteImagen=false;		
		this.isPermisoDuplicarClienteImagen=false;		
		this.isPermisoOrdenClienteImagen=false;		
	}
	
	public void setPermisosUsuarioClienteImagen(Boolean isPermiso) {
		this.isPermisoTodoClienteImagen=isPermiso;
		this.isPermisoNuevoClienteImagen=isPermiso;
		this.isPermisoActualizarClienteImagen=isPermiso;
		this.isPermisoActualizarOriginalClienteImagen=isPermiso;
		this.isPermisoEliminarClienteImagen=isPermiso;
		this.isPermisoGuardarCambiosClienteImagen=isPermiso;
		this.isPermisoConsultaClienteImagen=isPermiso;
		this.isPermisoBusquedaClienteImagen=isPermiso;
		this.isPermisoReporteClienteImagen=isPermiso;
		this.isPermisoOrdenClienteImagen=isPermiso;		
		this.isPermisoPaginacionMedioClienteImagen=isPermiso;		
		this.isPermisoPaginacionAltoClienteImagen=isPermiso;		
		this.isPermisoPaginacionTodoClienteImagen=isPermiso;		
		this.isPermisoCopiarClienteImagen=isPermiso;		
		this.isPermisoVerFormClienteImagen=isPermiso;		
		this.isPermisoDuplicarClienteImagen=isPermiso;
		this.isPermisoOrdenClienteImagen=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioClienteImagen(Boolean isPermiso) {
		//this.isPermisoTodoClienteImagen=isPermiso;
		this.isPermisoNuevoClienteImagen=isPermiso;
		this.isPermisoActualizarClienteImagen=isPermiso;
		this.isPermisoActualizarOriginalClienteImagen=isPermiso;
		this.isPermisoEliminarClienteImagen=isPermiso;
		this.isPermisoGuardarCambiosClienteImagen=isPermiso;
		//this.isPermisoConsultaClienteImagen=isPermiso;
		//this.isPermisoBusquedaClienteImagen=isPermiso;
		//this.isPermisoReporteClienteImagen=isPermiso;
		//this.isPermisoOrdenClienteImagen=isPermiso;		
		//this.isPermisoPaginacionMedioClienteImagen=isPermiso;		
		//this.isPermisoPaginacionAltoClienteImagen=isPermiso;		
		//this.isPermisoPaginacionTodoClienteImagen=isPermiso;		
		//this.isPermisoCopiarClienteImagen=isPermiso;		
		//this.isPermisoDuplicarClienteImagen=isPermiso;
		//this.isPermisoOrdenClienteImagen=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioClienteImagenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ClienteImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebClienteImagen(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioClienteImagenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioClienteImagenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionClienteImagenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioClienteImagenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioClienteImagen() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ClienteImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ClienteImagenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoClienteImagen=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarClienteImagen=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalClienteImagen=this.isPermisoActualizarClienteImagen;
			this.isPermisoEliminarClienteImagen=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosClienteImagen=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaClienteImagen=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaClienteImagen=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoClienteImagen=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteClienteImagen=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClienteImagen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioClienteImagen=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoClienteImagen=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoClienteImagen=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarClienteImagen=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormClienteImagen=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarClienteImagen=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClienteImagen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosClienteImagen.setToolTipText(this.jTableDatosClienteImagen.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioClienteImagen(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioClienteImagen(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ClienteImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ClienteImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioClienteImagen() throws Exception {
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
	public void inicializarCombosForeignKeyClienteImagenListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.tipoimagenpersonasForeignKey=new ArrayList();
				this.tipoimagensForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyClienteImagenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ClienteImagenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyClienteImagenListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoImagenPersonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoImagenListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoImagenPersonaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoimagenpersonasForeignKey==null||this.tipoimagenpersonasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoImagenPersonaConstantesFunciones.getArrayColumnasGlobalesTipoImagenPersona(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoImagenPersonaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoImagenPersonaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoImagenPersonasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoImagenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoimagensForeignKey==null||this.tipoimagensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoImagenConstantesFunciones.getArrayColumnasGlobalesTipoImagen(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoImagenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoImagenConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoImagensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyClienteImagenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ClienteImagenParameterReturnGeneral clienteimagenReturnGeneral=new ClienteImagenParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.clienteimagenConstantesFunciones.cargarid_clienteClienteImagen)
					 || (this.esRecargarFks && this.clienteimagenConstantesFunciones.cargarid_clienteClienteImagen)) {

					if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+clienteimagenSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoImagenPersona="";

				if(((this.tipoimagenpersonasForeignKey==null||this.tipoimagenpersonasForeignKey.size()<=0) && this.clienteimagenConstantesFunciones.cargarid_tipo_imagen_personaClienteImagen)
					 || (this.esRecargarFks && this.clienteimagenConstantesFunciones.cargarid_tipo_imagen_personaClienteImagen)) {

					if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagenPersona()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoImagenPersonaConstantesFunciones.getArrayColumnasGlobalesTipoImagenPersona(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoImagenPersona=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoImagenPersonaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoImagenPersona=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoImagenPersona, "");
						finalQueryGlobalTipoImagenPersona+=TipoImagenPersonaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoImagenPersonasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoImagenPersona=" WHERE " + ConstantesSql.ID + "="+clienteimagenSessionBean.getlidTipoImagenPersonaActual();
					}
				} else {
					finalQueryGlobalTipoImagenPersona="NONE";
				}


				String finalQueryGlobalTipoImagen="";

				if(((this.tipoimagensForeignKey==null||this.tipoimagensForeignKey.size()<=0) && this.clienteimagenConstantesFunciones.cargarid_tipo_imagenClienteImagen)
					 || (this.esRecargarFks && this.clienteimagenConstantesFunciones.cargarid_tipo_imagenClienteImagen)) {

					if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagen()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoImagenConstantesFunciones.getArrayColumnasGlobalesTipoImagen(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoImagen=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoImagenConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoImagen=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoImagen, "");
						finalQueryGlobalTipoImagen+=TipoImagenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoImagensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoImagen=" WHERE " + ConstantesSql.ID + "="+clienteimagenSessionBean.getlidTipoImagenActual();
					}
				} else {
					finalQueryGlobalTipoImagen="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				clienteimagenReturnGeneral=clienteimagenLogic.cargarCombosLoteForeignKeyClienteImagen(finalQueryGlobalCliente,finalQueryGlobalTipoImagenPersona,finalQueryGlobalTipoImagen);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=clienteimagenReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoImagenPersona.equals("NONE")) {
				this.tipoimagenpersonasForeignKey=clienteimagenReturnGeneral.gettipoimagenpersonasForeignKey();
			}

			if(!finalQueryGlobalTipoImagen.equals("NONE")) {
				this.tipoimagensForeignKey=clienteimagenReturnGeneral.gettipoimagensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyClienteImagen()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoImagenPersona();
			this.addItemDefectoCombosForeignKeyTipoImagen();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.clienteimagenSessionBean==null) {
				this.clienteimagenSessionBean=new ClienteImagenSessionBean();
			}

			if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoImagenPersona()throws Exception {
		try {

			if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagenPersona()) {
				TipoImagenPersona tipoimagenpersona=new TipoImagenPersona();
				TipoImagenPersonaConstantesFunciones.setTipoImagenPersonaDescripcion(tipoimagenpersona,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoimagenpersona.setId(null);

				if(!TipoImagenPersonaConstantesFunciones.ExisteEnLista(this.tipoimagenpersonasForeignKey,tipoimagenpersona,true)) {

					this.tipoimagenpersonasForeignKey.add(0,tipoimagenpersona);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoImagen()throws Exception {
		try {

			if(!this.clienteimagenSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagen()) {
				TipoImagen tipoimagen=new TipoImagen();
				TipoImagenConstantesFunciones.setTipoImagenDescripcion(tipoimagen,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoimagen.setId(null);

				if(!TipoImagenConstantesFunciones.ExisteEnLista(this.tipoimagensForeignKey,tipoimagen,true)) {

					this.tipoimagensForeignKey.add(0,tipoimagen);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyClienteImagen()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyClienteImagen(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyClienteImagen()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyClienteImagen();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyClienteImagen(ClienteImagen clienteimagen)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(clienteimagen.getid_cliente(),false,"Formulario");
			this.setActualTipoImagenPersonaForeignKey(clienteimagen.getid_tipo_imagen_persona(),false,"Formulario");
			this.setActualTipoImagenForeignKey(clienteimagen.getid_tipo_imagen(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyClienteImagen(ClienteImagen clienteimagen,String sTipoEvento)throws Exception {	
		try {
			
			

				if(clienteimagen.getCliente()!=null && !sTipoEvento.equals("id_clienteClienteImagen")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(clienteimagen.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyClienteImagen()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.clienteimagenConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoImagenPersonaForeignKey(this.clienteimagenConstantesFunciones.getid_tipo_imagen_persona(),false,"Formulario");
			this.setActualTipoImagenForeignKey(this.clienteimagenConstantesFunciones.getid_tipo_imagen(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyClienteImagen()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyClienteImagen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyClienteImagen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroClienteImagen()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyClienteImagen()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoImagenPersonasForeignKey("Todos");
			this.cargarCombosFrameTipoImagensForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyClienteImagen(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoImagenPersonasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoImagensForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyClienteImagen()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.getItemCount()>0) {
				this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.getItemCount()>0) {
				this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.getItemCount()>0) {
				this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ClienteImagenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ClienteImagenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ClienteImagenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.clienteimagenSessionBean=new ClienteImagenSessionBean(); 
		this.clienteimagenConstantesFunciones=new ClienteImagenConstantesFunciones(); 
		this.clienteimagenBean=new ClienteImagen();//(this.clienteimagenConstantesFunciones); 		
		this.clienteimagenReturnGeneral=new ClienteImagenParameterReturnGeneral(); 
		
		this.clienteimagenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clienteimagenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ClienteImagenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ClienteImagenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ClienteImagenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessClienteImagen(true);
			
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
			
			this.clienteimagenConstantesFunciones=new ClienteImagenConstantesFunciones(); 
			this.clienteimagenBean=new ClienteImagen();//this.clienteimagenConstantesFunciones); 			
			this.clienteimagenReturnGeneral=new ClienteImagenParameterReturnGeneral(); 
		
			ClienteImagenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cliente Imagen Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.clienteimagen=new ClienteImagen();
			this.clienteimagens = new ArrayList<ClienteImagen>();
			this.clienteimagensAux = new ArrayList<ClienteImagen>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic=new ClienteImagenLogic();
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}
			
			//this.clienteimagenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.clienteimagenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormClienteImagen);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClienteImagen);	
					}
					
					if(this.jInternalFrameImportacionClienteImagen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClienteImagen);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByClienteImagen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByClienteImagen);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormClienteImagen!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormClienteImagen);
				this.jInternalFrameDetalleFormClienteImagen.setVisible(false);
				this.jInternalFrameDetalleFormClienteImagen.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClienteImagen);
					this.jInternalFrameReporteDinamicoClienteImagen.setVisible(false);
					this.jInternalFrameReporteDinamicoClienteImagen.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionClienteImagen!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionClienteImagen);
					this.jInternalFrameImportacionClienteImagen.setVisible(false);
					this.jInternalFrameImportacionClienteImagen.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByClienteImagen!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByClienteImagen);
					this.jInternalFrameOrderByClienteImagen.setVisible(false);
					this.jInternalFrameOrderByClienteImagen.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idClienteImagenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ClienteImagenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.clienteimagenReturnGeneral=new ClienteImagenParameterReturnGeneral();
			
			this.clienteimagenParameterGeneral=new ClienteImagenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.clienteimagenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ClienteImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClienteImagenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.clienteimagenSessionBean.getEsGuardarRelacionado(),this.clienteimagenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClienteImagenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.clienteimagenSessionBean.getEsGuardarRelacionado(),this.clienteimagenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoClienteImagen=false;
			this.isVisibilidadCeldaDuplicarClienteImagen=true;
			this.isVisibilidadCeldaCopiarClienteImagen=true;
			this.isVisibilidadCeldaVerFormClienteImagen=true;
			this.isVisibilidadCeldaOrdenClienteImagen=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
			this.isVisibilidadCeldaModificarClienteImagen=false;
			this.isVisibilidadCeldaActualizarClienteImagen=false;
			this.isVisibilidadCeldaEliminarClienteImagen=false;
			this.isVisibilidadCeldaCancelarClienteImagen=false;
			this.isVisibilidadCeldaGuardarClienteImagen=false;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdTipoImagen=true;
			this.isVisibilidadFK_IdTipoImagenPersona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesClienteImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosClienteImagen();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioClienteImagen(false);
			
			this.setPermisosUsuarioClienteImagen();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clienteimagenSessionBean.getEsGuardarRelacionado() 
				|| (this.clienteimagenSessionBean.getEsGuardarRelacionado() && this.clienteimagenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClienteImagenClasesRelacionadas();
			}
			
			if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClienteImagenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosClienteImagen();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualClienteImagen();
			}
			
			if(!this.isPermisoBusquedaClienteImagen) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasClienteImagen.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioClienteImagen,this.isPermisoPaginacionMedioClienteImagen,this.isPermisoPaginacionTodoClienteImagen);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ClienteImagenConstantesFunciones.getTiposSeleccionarClienteImagen());
				
				this.tiposColumnasSelect=ClienteImagenConstantesFunciones.getTiposSeleccionarClienteImagen(true);
				
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
			//if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioClienteImagen();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioClienteImagen(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioClienteImagen(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteImagen() ;
			
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
			this.tipoimagenpersonaLogic=new TipoImagenPersonaLogic();
			this.tipoimagenLogic=new TipoImagenLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				clienteimagenImplementable= (ClienteImagenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClienteImagenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				clienteimagenImplementableHome= (ClienteImagenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClienteImagenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.clienteimagens= new ArrayList<ClienteImagen>();
			this.clienteimagensEliminados= new ArrayList<ClienteImagen>();
						
			this.isEsNuevoClienteImagen=false;
			this.esParaAccionDesdeFormularioClienteImagen=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoimagenpersonasForeignKey=new ArrayList<TipoImagenPersona>() ;
			this.tipoimagensForeignKey=new ArrayList<TipoImagen>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyClienteImagen(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroClienteImagen();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ClienteImagenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ClienteImagenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesClienteImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingClienteImagen(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormClienteImagen!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioClienteImagen();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioClienteImagen();
			}
			
			ClienteImagenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasClienteImagen.getTabCount(); i++) {
					this.jTabbedPaneBusquedasClienteImagen.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasClienteImagen.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessClienteImagen(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ClienteImagen: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectClienteImagen() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesClienteImagen")) {
				iIndex=this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessClienteImagen();	
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
	
	public void cargarCombosForeignKeyClienteImagen(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyClienteImagen(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyClienteImagen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyClienteImagenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyClienteImagen();
		
		this.cargarCombosFrameForeignKeyClienteImagen();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyClienteImagen();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyClienteImagen();
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

	public void cargarCombosForeignKeyTipoImagenPersona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoImagenPersonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoImagenPersona();
				this.cargarCombosFrameTipoImagenPersonasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoImagenPersona(this.tipoimagenpersonasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoImagen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoImagenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoImagen();
				this.cargarCombosFrameTipoImagensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoImagen(this.tipoimagensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoClienteImagenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
			
			if(jTableDatosClienteImagen.getRowCount()>=1) {
				jTableDatosClienteImagen.removeRowSelectionInterval(0, jTableDatosClienteImagen.getRowCount()-1);						
			}
			
			this.isEsNuevoClienteImagen=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoClienteImagen(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesClienteImagen(true);			
			//this.clienteimagen=new ClienteImagen();
			//this.clienteimagen.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteImagen(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteImagen() ;
			
			if(ClienteImagenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteImagen(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.clienteimagen);	
			this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);				
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
			if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ClienteImagen: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarClienteImagenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosClienteImagen.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosClienteImagen.getSelectedRows().length;			
			}
			
			clienteimagensSeleccionados=this.getClienteImagensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoClienteImagen--;			
				//ClienteImagen clienteimagenAux= new ClienteImagen();			
				//clienteimagenAux.setId(this.iIdNuevoClienteImagen);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ClienteImagen clienteimagenOrigen=new ClienteImagen();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ClienteImagen clienteimagenOrigen : clienteimagensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							clienteimagenOrigen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clienteimagenOrigen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaClienteImagen();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.clienteimagen.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosClienteImagen(clienteimagenOrigen,this.clienteimagen,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.clienteimagenLogic.getClienteImagens().add(this.clienteimagenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.clienteimagens.add(this.clienteimagenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaClienteImagen(false);
				
				this.jTableDatosClienteImagen.setRowSelectionInterval(this.getIndiceNuevoClienteImagen(), this.getIndiceNuevoClienteImagen());
				
				int iLastRow =  this.jTableDatosClienteImagen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClienteImagen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClienteImagen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteImagen(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();									
		
			ClienteImagen clienteimagenOrigen=new ClienteImagen();
			ClienteImagen clienteimagenDestino=new ClienteImagen();
				
			clienteimagensSeleccionados=this.getClienteImagensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosClienteImagen.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || clienteimagensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosClienteImagen.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagenOrigen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						clienteimagenOrigen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clienteimagenDestino =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						clienteimagenDestino =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				clienteimagenOrigen =clienteimagensSeleccionados.get(0);
				clienteimagenDestino =clienteimagensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosClienteImagen(clienteimagenOrigen,clienteimagenDestino,true,false);
				
				clienteimagenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(clienteimagenDestino,clienteimagenLogic.getClienteImagens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clienteimagenDestino,clienteimagens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaClienteImagen(false);
				
				//this.jTableDatosClienteImagen.setRowSelectionInterval(this.getIndiceNuevoClienteImagen(), this.getIndiceNuevoClienteImagen());
				
				int iLastRow =  this.jTableDatosClienteImagen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClienteImagen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClienteImagen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteImagen(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormClienteImagen.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesClienteImagen.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasClienteImagen.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesClienteImagen.setVisible(!isVisible);
			this.jPanelPaginacionClienteImagen.setVisible(!isVisible);
			this.jPanelAccionesClienteImagen.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameClienteImagen();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoClienteImagen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionClienteImagen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByClienteImagen();
			
			this.abrirFrameOrderByClienteImagen();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByClienteImagen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleClienteImagen(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormClienteImagen);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormClienteImagen.isMaximum()) {
					this.jInternalFrameDetalleFormClienteImagen.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormClienteImagen.setSize(this.jInternalFrameDetalleFormClienteImagen.iWidthFormulario,this.jInternalFrameDetalleFormClienteImagen.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormClienteImagen.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormClienteImagen.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormClienteImagen.isMaximum()) {
						this.jInternalFrameDetalleFormClienteImagen.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormClienteImagen.jContentPaneDetalleClienteImagen.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormClienteImagen.jContentPaneDetalleClienteImagen.getWidth(),ClienteImagenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormClienteImagen.jContentPaneDetalleClienteImagen.getWidth(),ClienteImagenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormClienteImagen.jContentPaneDetalleClienteImagen.getWidth(),ClienteImagenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormClienteImagen.setVisible(true);
	        this.jInternalFrameDetalleFormClienteImagen.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByClienteImagen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByClienteImagen==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByClienteImagen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteImagen,false,this);
				} else {
					this.jInternalFrameOrderByClienteImagen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteImagen,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByClienteImagen);
				this.jInternalFrameOrderByClienteImagen.setVisible(false);
				this.jInternalFrameOrderByClienteImagen.setSelected(false);
				
				this.jInternalFrameOrderByClienteImagen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClienteImagen"));
				
				this.inicializarActualizarBindingTablaOrderByClienteImagen();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionClienteImagen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionClienteImagen==null) {
				
				this.jInternalFrameImportacionClienteImagen=new ImportacionJInternalFrame(ClienteImagenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClienteImagen);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionClienteImagen);
				this.jInternalFrameImportacionClienteImagen.setVisible(false);
				this.jInternalFrameImportacionClienteImagen.setSelected(false);


				this.jInternalFrameImportacionClienteImagen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClienteImagen"));
				this.jInternalFrameImportacionClienteImagen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClienteImagen"));
				this.jInternalFrameImportacionClienteImagen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClienteImagen"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoClienteImagen() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoClienteImagen==null) {
				this.jInternalFrameReporteDinamicoClienteImagen=new ReporteDinamicoJInternalFrame(ClienteImagenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClienteImagen);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClienteImagen);
				this.jInternalFrameReporteDinamicoClienteImagen.setVisible(false);
				this.jInternalFrameReporteDinamicoClienteImagen.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoClienteImagen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteImagen"));
				this.jInternalFrameReporteDinamicoClienteImagen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteImagen"));
				this.jInternalFrameReporteDinamicoClienteImagen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteImagen"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteImagen();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleClienteImagen() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormClienteImagen);
			
	       	this.jInternalFrameDetalleFormClienteImagen.setVisible(false);
	        this.jInternalFrameDetalleFormClienteImagen.setSelected(false);
			
			//this.jInternalFrameDetalleFormClienteImagen.dispose();
			//this.jInternalFrameDetalleFormClienteImagen=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoClienteImagen() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoClienteImagen.setVisible(true);
	        this.jInternalFrameReporteDinamicoClienteImagen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionClienteImagen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionClienteImagen.setVisible(true);
	        this.jInternalFrameImportacionClienteImagen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByClienteImagen() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByClienteImagen.setVisible(true);
	        this.jInternalFrameOrderByClienteImagen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByClienteImagen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByClienteImagen.setVisible(false);
	        this.jInternalFrameOrderByClienteImagen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoClienteImagen() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoClienteImagen.setVisible(false);
	        this.jInternalFrameReporteDinamicoClienteImagen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionClienteImagen() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionClienteImagen.setVisible(false);
	        this.jInternalFrameImportacionClienteImagen.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarClienteImagen(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarClienteImagen(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesClienteImagen(true);
			//this.isEsNuevoClienteImagen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesClienteImagen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteImagen(false) ;
			
			if(clienteimagenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ClienteImagenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteImagen(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteImagen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaClienteImagenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarClienteImagen(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesClienteImagen(true);
			//this.isEsNuevoClienteImagen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.clienteimagen.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesClienteImagen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesClienteImagen(false) ;
			
			if(ClienteImagenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteImagen(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteImagen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.clienteimagenConstantesFunciones.cargarid_clienteClienteImagen) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingClienteImagen(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosClienteImagen.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoImagenPersona(List<TipoImagenPersona> tipoimagenpersonasForeignKey)throws Exception{
		TableColumn tableColumnTipoImagenPersona=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA));
		TableCellEditor tableCellEditorTipoImagenPersona =tableColumnTipoImagenPersona.getCellEditor();

		TipoImagenPersonaTableCell tipoimagenpersonaTableCellFk=(TipoImagenPersonaTableCell)tableCellEditorTipoImagenPersona;

		if(tipoimagenpersonaTableCellFk!=null) {
			tipoimagenpersonaTableCellFk.settipoimagenpersonasForeignKey(tipoimagenpersonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosClienteImagen.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoimagenpersonaTableCellFk.setRowActual(intSelectedRow);
			//tipoimagenpersonaTableCellFk.settipoimagenpersonasForeignKeyActual(tipoimagenpersonasForeignKey);
		//}


		if(tipoimagenpersonaTableCellFk!=null) {
			tipoimagenpersonaTableCellFk.RecargarTipoImagenPersonasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoImagen(List<TipoImagen> tipoimagensForeignKey)throws Exception{
		TableColumn tableColumnTipoImagen=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN));
		TableCellEditor tableCellEditorTipoImagen =tableColumnTipoImagen.getCellEditor();

		TipoImagenTableCell tipoimagenTableCellFk=(TipoImagenTableCell)tableCellEditorTipoImagen;

		if(tipoimagenTableCellFk!=null) {
			tipoimagenTableCellFk.settipoimagensForeignKey(tipoimagensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosClienteImagen.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoimagenTableCellFk.setRowActual(intSelectedRow);
			//tipoimagenTableCellFk.settipoimagensForeignKeyActual(tipoimagensForeignKey);
		//}


		if(tipoimagenTableCellFk!=null) {
			tipoimagenTableCellFk.RecargarTipoImagensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesClienteImagen(false);
			
			//if(!this.isEsNuevoClienteImagen) {								
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				
			}
			
			if(this.permiteMantenimiento(this.clienteimagen)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoClienteImagen=true;
					this.inicializarActualizarBindingTablaClienteImagen(false);
					this.isEsNuevoClienteImagen=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoClienteImagen=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoClienteImagen=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClienteImagen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteImagen(false);
				
				this.habilitarDeshabilitarControlesClienteImagen(false);
			
												
				
				if(ClienteImagenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleClienteImagen();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoClienteImagenActionPerformed(evt,clienteimagenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualClienteImagen(this.clienteimagen,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosClienteImagen.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,clienteimagenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.clienteimagen.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarClienteImagenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				this.clienteimagen.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				this.clienteimagen.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.clienteimagen)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ClienteImagenModel) this.jTableDatosClienteImagen.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoClienteImagen=true;
				this.inicializarActualizarBindingTablaClienteImagen(false);
				this.isEsNuevoClienteImagen=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClienteImagen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteImagen(false);
				
				this.habilitarDeshabilitarControlesClienteImagen(false);
				
				
				
				if(ClienteImagenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleClienteImagen();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarClienteImagenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosClienteImagen.getRowCount()>=1) {
				jTableDatosClienteImagen.removeRowSelectionInterval(0, jTableDatosClienteImagen.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesClienteImagen(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaClienteImagen(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteImagen(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteImagen(false) ;
			
			this.isEsNuevoClienteImagen=false;
			
			if(ClienteImagenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleClienteImagen();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosClienteImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingClienteImagen(false);
				
				//SI ES MANUAL
				if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualClienteImagen();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosClienteImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoClienteImagen--;			
			//ClienteImagen clienteimagenAux= new ClienteImagen();			
			//clienteimagenAux.setId(this.iIdNuevoClienteImagen);
			
			if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaClienteImagen();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
			
			this.clienteimagen.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.clienteimagenLogic.getClienteImagens().add(this.clienteimagenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.clienteimagens.add(this.clienteimagenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaClienteImagen(false);
			
			this.jTableDatosClienteImagen.setRowSelectionInterval(this.getIndiceNuevoClienteImagen(), this.getIndiceNuevoClienteImagen());
			
			int iLastRow =  this.jTableDatosClienteImagen.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosClienteImagen.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosClienteImagen.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaClienteImagen(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionClienteImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingClienteImagen(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteImagen(false);
			
			//SI ES MANUAL
			if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteImagen();
			}
			
			//this.abrirFrameTreeClienteImagen();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionClienteImagenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cliente ImagenES ?", "MANTENIMIENTO DE Cliente Imagen", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionClienteImagen.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralClienteImagen();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.clienteimagenReturnGeneral=clienteimagenLogic.procesarImportacionClienteImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.clienteimagenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarClienteImagenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionClienteImagenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionClienteImagen.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionClienteImagen.setFileImportacion(this.jInternalFrameImportacionClienteImagen.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionClienteImagen.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionClienteImagen.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionClienteImagen.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionClienteImagen.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoClienteImagenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		

		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ClienteImagenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ClienteImagenBaseDesign.jrxml";
			
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
			
			this.generarReporteClienteImagens("Todos",clienteimagensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClienteImagenConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoImagenPersona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoImagenPersona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoImagenPersona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoImagenPersona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoImagen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoImagen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoImagen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoImagen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteImagenConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteImagenConstantesFunciones.LABEL_IMAGEN:
					iAnchoColumna=0;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_agen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_agen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_agen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_agen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteImagenConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoClienteImagen.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ClienteImagenConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA:
					sNombreCampoCategoria="id_tipo_imagen_persona";
					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN:
					sNombreCampoCategoria="id_tipo_imagen";
					break;

				case ClienteImagenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ClienteImagenConstantesFunciones.LABEL_IMAGEN:
					sNombreCampoCategoria="imagen";
					break;

				case ClienteImagenConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ClienteImagenConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA:
					sNombreCampoCategoriaValor="id_tipo_imagen_persona";
					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN:
					sNombreCampoCategoriaValor="id_tipo_imagen";
					break;

				case ClienteImagenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ClienteImagenConstantesFunciones.LABEL_IMAGEN:
					sNombreCampoCategoriaValor="imagen";
					break;

				case ClienteImagenConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClienteImagenConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idcliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Imagen Persona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_imagen_persona");
					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Imagen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_imagen");
					break;

				case ClienteImagenConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ClienteImagenConstantesFunciones.LABEL_IMAGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Imagen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"imagen");
					break;

				case ClienteImagenConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoClienteImagenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clienteimagen";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ClienteImagens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ClienteImagenConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ClienteImagen clienteimagen:clienteimagensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clienteimagen.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA);
					iRow++;

					for(ClienteImagen clienteimagen:clienteimagensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clienteimagen.gettipoimagenpersona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN);
					iRow++;

					for(ClienteImagen clienteimagen:clienteimagensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clienteimagen.gettipoimagen_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteImagenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ClienteImagen clienteimagen:clienteimagensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clienteimagen.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteImagenConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ClienteImagen clienteimagen:clienteimagensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clienteimagen.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelClienteImagen(row);				
			//	iRow++;
			//}				
			
			//for(ClienteImagen clienteimagenAux:clienteimagensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelClienteImagen(clienteimagenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
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
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteImagen(false);
			
			//SI ES MANUAL
			if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteImagen();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresClienteImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteImagen(false);
			
			//SI ES MANUAL
			if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClienteImagen();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesClienteImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteImagen(false);
			
			//SI ES MANUAL
			if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClienteImagen();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaClienteImagen() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosClienteImagen.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosClienteImagen.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosClienteImagen.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosClienteImagen.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosClienteImagen.setMinimumSize(dimensionMinimum);
		this.jTableDatosClienteImagen.setMaximumSize(dimensionMaximum);
		this.jTableDatosClienteImagen.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingClienteImagen(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingClienteImagen(esInicializar,true);
	}
	
	public void inicializarActualizarBindingClienteImagen(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaClienteImagen(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesClienteImagen(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasClienteImagen(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteImagen(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesClienteImagen(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualClienteImagen() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaClienteImagen();
		
		this.inicializarActualizarBindingBotonesManualClienteImagen(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualClienteImagen();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteImagen() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualClienteImagen(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualClienteImagen(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosClienteImagen.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosClienteImagen.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteClienteImagen.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormClienteImagen!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormClienteImagen.jCheckBoxPostAccionNuevoClienteImagen.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormClienteImagen.jCheckBoxPostAccionSinCerrarClienteImagen.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormClienteImagen.jCheckBoxPostAccionSinMensajeClienteImagen.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosClienteImagen.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosClienteImagen.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteClienteImagen.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormClienteImagen!=null) {
				this.jInternalFrameDetalleFormClienteImagen.jCheckBoxPostAccionNuevoClienteImagen.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormClienteImagen.jCheckBoxPostAccionSinCerrarClienteImagen.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormClienteImagen.jCheckBoxPostAccionSinMensajeClienteImagen.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionClienteImagen.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionClienteImagen.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesClienteImagen.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesClienteImagen.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesClienteImagen.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarClienteImagen.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesClienteImagen.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesClienteImagen.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralClienteImagen.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesClienteImagen(Boolean esInicializar) throws Exception {
		try	{	
			if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualClienteImagen(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesClienteImagen() throws Exception {
		try	{
			if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualClienteImagen();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClienteImagen() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualClienteImagen() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesClienteImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesClienteImagen.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesClienteImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesClienteImagen.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesClienteImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesClienteImagen.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionClienteImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionClienteImagen.addItem(reporte);
			}
			
			
			if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionClienteImagen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionClienteImagen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesClienteImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesClienteImagen.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesClienteImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesClienteImagen.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarClienteImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarClienteImagen.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarClienteImagen.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteImagen();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteImagen() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
				this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
				this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoClienteImagen.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
				
				if(this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClienteImagen.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoClienteImagen.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClienteImagen.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClienteImagen.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualClienteImagen()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteClienteImagen.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteClienteImagen.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.getSelectedItem()!=null){this.id_tipo_imagenFK_IdTipoImagen=((TipoImagen)this.jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.getSelectedItem()!=null){this.id_tipo_imagen_personaFK_IdTipoImagenPersona=((TipoImagenPersona)this.jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasClienteImagen(Boolean esInicializar) throws Exception {				
		if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualClienteImagen();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaClienteImagen() throws Exception {
		this.inicializarActualizarBindingTablaClienteImagen(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByClienteImagen() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosClienteImagenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaClienteImagen(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=clienteimagenLogic.getClienteImagens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=clienteimagens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosClienteImagen.setModel(new ClienteImagenModel(this.clienteimagenLogic.getClienteImagens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosClienteImagen.setModel(new ClienteImagenModel(this.clienteimagens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByClienteImagen!=null && this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByClienteImagen();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO,clienteimagenConstantesFunciones.resaltarSeleccionarClienteImagen,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO,clienteimagenConstantesFunciones.resaltarSeleccionarClienteImagen,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_ID));

		if(this.clienteimagenConstantesFunciones.mostraridClienteImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteImagenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.clienteimagenConstantesFunciones.resaltaridClienteImagen,this.clienteimagenConstantesFunciones.activaridClienteImagen,this,true,"idClienteImagen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clienteimagenConstantesFunciones.resaltaridClienteImagen,this.clienteimagenConstantesFunciones.activaridClienteImagen,this,true,"idClienteImagen","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_IDCLIENTE));

		if(this.clienteimagenConstantesFunciones.mostrarid_clienteClienteImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteImagenConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.clienteimagenConstantesFunciones.resaltarid_clienteClienteImagen,this,this.clienteimagenConstantesFunciones.activarid_clienteClienteImagen));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.clienteimagenConstantesFunciones.resaltarid_clienteClienteImagen,this,this.clienteimagenConstantesFunciones.activarid_clienteClienteImagen,true,"id_clienteClienteImagen","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA));

		if(this.clienteimagenConstantesFunciones.mostrarid_tipo_imagen_personaClienteImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoImagenPersonaTableCell(this.tipoimagenpersonasForeignKey,this.clienteimagenConstantesFunciones.resaltarid_tipo_imagen_personaClienteImagen,this,this.clienteimagenConstantesFunciones.activarid_tipo_imagen_personaClienteImagen));
			tableColumn.setCellEditor(new TipoImagenPersonaTableCell(this.tipoimagenpersonasForeignKey,this.clienteimagenConstantesFunciones.resaltarid_tipo_imagen_personaClienteImagen,this,this.clienteimagenConstantesFunciones.activarid_tipo_imagen_personaClienteImagen,true,"id_tipo_imagen_personaClienteImagen","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN));

		if(this.clienteimagenConstantesFunciones.mostrarid_tipo_imagenClienteImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoImagenTableCell(this.tipoimagensForeignKey,this.clienteimagenConstantesFunciones.resaltarid_tipo_imagenClienteImagen,this,this.clienteimagenConstantesFunciones.activarid_tipo_imagenClienteImagen));
			tableColumn.setCellEditor(new TipoImagenTableCell(this.tipoimagensForeignKey,this.clienteimagenConstantesFunciones.resaltarid_tipo_imagenClienteImagen,this,this.clienteimagenConstantesFunciones.activarid_tipo_imagenClienteImagen,true,"id_tipo_imagenClienteImagen","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_NOMBRE));

		if(this.clienteimagenConstantesFunciones.mostrarnombreClienteImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteImagenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clienteimagenConstantesFunciones.resaltarnombreClienteImagen,this.clienteimagenConstantesFunciones.activarnombreClienteImagen,this,true,"nombreClienteImagen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clienteimagenConstantesFunciones.resaltarnombreClienteImagen,this.clienteimagenConstantesFunciones.activarnombreClienteImagen,this,true,"nombreClienteImagen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_IMAGEN));

		if(this.clienteimagenConstantesFunciones.mostrarimagenClienteImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteImagenConstantesFunciones.LABEL_IMAGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelImageRenderer(this.clienteimagenConstantesFunciones.resaltarimagenClienteImagen,this.clienteimagenConstantesFunciones.activarimagenClienteImagen));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clienteimagenConstantesFunciones.resaltarimagenClienteImagen,this.clienteimagenConstantesFunciones.activarimagenClienteImagen,this,true,"imagenClienteImagen","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,ClienteImagenConstantesFunciones.LABEL_DESCRIPCION));

		if(this.clienteimagenConstantesFunciones.mostrardescripcionClienteImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteImagenConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clienteimagenConstantesFunciones.resaltardescripcionClienteImagen,this.clienteimagenConstantesFunciones.activardescripcionClienteImagen,this,true,"descripcionClienteImagen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clienteimagenConstantesFunciones.resaltardescripcionClienteImagen,this.clienteimagenConstantesFunciones.activardescripcionClienteImagen,this,true,"descripcionClienteImagen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteImagenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.clienteimagenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.clienteimagenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClienteImagen.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.clienteimagenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.clienteimagenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClienteImagen.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarClienteImagen && this.isPermisoGuardarCambiosClienteImagen) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.clienteimagenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.clienteimagenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosClienteImagen.addColumn(tableColumn);
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
			
			this.jTableDatosClienteImagen.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClienteImagen && this.isPermisoGuardarCambiosClienteImagen) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClienteImagen && this.isPermisoGuardarCambiosClienteImagen) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosClienteImagen.moveColumn(this.jTableDatosClienteImagen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosClienteImagen.moveColumn(this.jTableDatosClienteImagen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosClienteImagen.moveColumn(this.jTableDatosClienteImagen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosClienteImagen.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosClienteImagen.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosClienteImagen,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosClienteImagen.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosClienteImagen.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosClienteImagen.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosClienteImagen.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosClienteImagen.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=clienteimagenLogic.getClienteImagens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=clienteimagens.size()-1;
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
		//this.jTableDatosClienteImagen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosClienteImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosClienteImagen();
			
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
				
				//this.isEsNuevoClienteImagen=false;
					
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
				if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormClienteImagen==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClienteImagen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClienteImagen.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.clienteimagen.getsType().equals("DUPLICADO")
				   || this.clienteimagen.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoClienteImagen=true;
				
				} else {
					this.isEsNuevoClienteImagen=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
					if(this.clienteimagen.getId()>=0 && !this.clienteimagen.getIsNew()) {						
						this.isEsNuevoClienteImagen=false;
						
					} else {
						this.isEsNuevoClienteImagen=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoClienteImagen(esRelaciones);						
				
				this.seleccionarClienteImagen(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.clienteimagen.getId()<0) {
					this.isEsNuevoClienteImagen=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarClienteImagen(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarClienteImagen(evt,rowIndex);
				}	
				
				if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ClienteImagen: " + this.dDif); 
					}
				}								
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarClienteImagen(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.clienteimagen)) {
					if(this.clienteimagen.getId()>0) {
						this.clienteimagen.setIsDeleted(true);
						
						this.clienteimagensEliminados.add(this.clienteimagen);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.clienteimagenLogic.getClienteImagens().remove(this.clienteimagen);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.clienteimagens.remove(this.clienteimagen);				
					}
					
					
					((ClienteImagenModel) this.jTableDatosClienteImagen.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteImagen(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarClienteImagen(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoClienteImagen) {
			
			if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClienteImagen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClienteImagen.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioClienteImagen(this.clienteimagen);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.clienteimagenConstantesFunciones.cargarid_clienteClienteImagen || this.clienteimagenConstantesFunciones.event_dependid_clienteClienteImagen) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.clienteimagen.getid_cliente());
									//this.inicializarActualizarBindingClienteImagen(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(clienteimagen.getCliente()!=null) {
							this.clientesForeignKey.add(clienteimagen.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.clienteimagen.getid_cliente(),false,"Formulario");

					//TipoImagenPersona
					if(!this.clienteimagenConstantesFunciones.cargarid_tipo_imagen_personaClienteImagen || this.clienteimagenConstantesFunciones.event_dependid_tipo_imagen_personaClienteImagen) {
						//this.cargarCombosTipoImagenPersonasForeignKeyLista(" where id="+this.clienteimagen.getid_tipo_imagen_persona());
									//this.inicializarActualizarBindingClienteImagen(false,false);
						this.tipoimagenpersonasForeignKey=new ArrayList<TipoImagenPersona>();

						if(clienteimagen.getTipoImagenPersona()!=null) {
							this.tipoimagenpersonasForeignKey.add(clienteimagen.getTipoImagenPersona());
						}

						this.addItemDefectoCombosForeignKeyTipoImagenPersona();
						this.cargarCombosFrameTipoImagenPersonasForeignKey("Todos");
					}
					this.setActualTipoImagenPersonaForeignKey(this.clienteimagen.getid_tipo_imagen_persona(),false,"Formulario");

					//TipoImagen
					if(!this.clienteimagenConstantesFunciones.cargarid_tipo_imagenClienteImagen || this.clienteimagenConstantesFunciones.event_dependid_tipo_imagenClienteImagen) {
						//this.cargarCombosTipoImagensForeignKeyLista(" where id="+this.clienteimagen.getid_tipo_imagen());
									//this.inicializarActualizarBindingClienteImagen(false,false);
						this.tipoimagensForeignKey=new ArrayList<TipoImagen>();

						if(clienteimagen.getTipoImagen()!=null) {
							this.tipoimagensForeignKey.add(clienteimagen.getTipoImagen());
						}

						this.addItemDefectoCombosForeignKeyTipoImagen();
						this.cargarCombosFrameTipoImagensForeignKey("Todos");
					}
					this.setActualTipoImagenForeignKey(this.clienteimagen.getid_tipo_imagen(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesClienteImagen("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesClienteImagen(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteImagen() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoClienteImagen(ClienteImagen clienteimagen) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoClienteImagen(clienteimagen,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoClienteImagen(ClienteImagen clienteimagen,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioClienteImagen(clienteimagen);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyClienteImagen(clienteimagen,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyClienteImagen(clienteimagen);
	}
	
	public void setVariablesObjetoActualToFormularioClienteImagen(ClienteImagen clienteimagen) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.setText(clienteimagen.getId().toString());
			this.jInternalFrameDetalleFormClienteImagen.jTextFieldnombreClienteImagen.setText(clienteimagen.getnombre());


			this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setText("Imagen");

			if(clienteimagen.getimagen()!=null) {
				this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
				this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
				this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));

				imageActual=FuncionesSwing.getImageFromBytes((byte[])clienteimagen.getimagen());

				if(imageActual!=null) {
					imageIcon=new ImageIcon(imageActual);

					if (imageIcon != null) {
						this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setIcon(imageIcon);
						this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setText(null);
						this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.updateUI();
					} else {
						this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setText("Imagen no Encontrada");
					}
				}
			}

			this.jInternalFrameDetalleFormClienteImagen.jTextAreadescripcionClienteImagen.setText(clienteimagen.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ClienteImagen clienteimagenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,clienteimagenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ClienteImagen clienteimagenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				clienteimagenLocal=this.clienteimagen;
			} else {
				clienteimagenLocal=this.clienteimagenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(clienteimagenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoClienteImagen(clienteimagenLocal,true);
					
					if(clienteimagenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(clienteimagenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(clienteimagenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoClienteImagen(ClienteImagen clienteimagen,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClienteImagen(clienteimagen,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(clienteimagen);
	}
	
	public void setVariablesFormularioToObjetoActualClienteImagen(ClienteImagen clienteimagen,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClienteImagen(clienteimagen,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualClienteImagen(ClienteImagen clienteimagen,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.getText()==null || this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.getText()=="" || this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.getText()=="Id") {
				this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.setText("0");
			}

			if(conColumnasBase) {clienteimagen.setId(Long.parseLong(this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteImagenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabelIdClienteImagen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clienteimagen.setnombre(this.jInternalFrameDetalleFormClienteImagen.jTextFieldnombreClienteImagen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteImagenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabelnombreClienteImagen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			if(this.jInternalFrameDetalleFormClienteImagen.jFileChooserimagenClienteImagen.getSelectedFile()!=null){clienteimagen.setimagen(FuncionesSwing.getBytesFromFile(this.jInternalFrameDetalleFormClienteImagen.jFileChooserimagenClienteImagen.getSelectedFile()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteImagenConstantesFunciones.LABEL_IMAGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabelimagenClienteImagen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clienteimagen.setdescripcion(this.jInternalFrameDetalleFormClienteImagen.jTextAreadescripcionClienteImagen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteImagenConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteImagen.jLabeldescripcionClienteImagen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClienteImagen(ClienteImagen clienteimagenBean,ClienteImagen clienteimagen,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && clienteimagenBean.getid_cliente()!=null && !clienteimagenBean.getid_cliente().equals(-1L))) {clienteimagen.setid_cliente(clienteimagenBean.getid_cliente());}
			if(conDefault || (!conDefault && clienteimagenBean.getid_tipo_imagen_persona()!=null && !clienteimagenBean.getid_tipo_imagen_persona().equals(-1L))) {clienteimagen.setid_tipo_imagen_persona(clienteimagenBean.getid_tipo_imagen_persona());}
			if(conDefault || (!conDefault && clienteimagenBean.getid_tipo_imagen()!=null && !clienteimagenBean.getid_tipo_imagen().equals(-1L))) {clienteimagen.setid_tipo_imagen(clienteimagenBean.getid_tipo_imagen());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosClienteImagen(ClienteImagen clienteimagenOrigen,ClienteImagen clienteimagen,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && clienteimagenOrigen.getId()!=null && !clienteimagenOrigen.getId().equals(0L))) {clienteimagen.setId(clienteimagenOrigen.getId());}}
			if(conDefault || (!conDefault && clienteimagenOrigen.getid_cliente()!=null && !clienteimagenOrigen.getid_cliente().equals(-1L))) {clienteimagen.setid_cliente(clienteimagenOrigen.getid_cliente());}
			if(conDefault || (!conDefault && clienteimagenOrigen.getid_tipo_imagen_persona()!=null && !clienteimagenOrigen.getid_tipo_imagen_persona().equals(-1L))) {clienteimagen.setid_tipo_imagen_persona(clienteimagenOrigen.getid_tipo_imagen_persona());}
			if(conDefault || (!conDefault && clienteimagenOrigen.getid_tipo_imagen()!=null && !clienteimagenOrigen.getid_tipo_imagen().equals(-1L))) {clienteimagen.setid_tipo_imagen(clienteimagenOrigen.getid_tipo_imagen());}
			if(conDefault || (!conDefault && clienteimagenOrigen.getnombre()!=null && !clienteimagenOrigen.getnombre().equals(""))) {clienteimagen.setnombre(clienteimagenOrigen.getnombre());}
			if(conDefault || (!conDefault && clienteimagenOrigen.getimagen()!=null && !clienteimagenOrigen.getimagen().equals(null))) {clienteimagen.setimagen(clienteimagenOrigen.getimagen());}
			if(conDefault || (!conDefault && clienteimagenOrigen.getdescripcion()!=null && !clienteimagenOrigen.getdescripcion().equals(""))) {clienteimagen.setdescripcion(clienteimagenOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClienteImagen(ClienteImagen clienteimagen) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.setText(clienteimagen.getId().toString());
			this.jInternalFrameDetalleFormClienteImagen.jTextFieldnombreClienteImagen.setText(clienteimagen.getnombre());


			this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setText("Imagen");

			if(clienteimagen.getimagen()!=null) {
				this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
				this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
				this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));

				imageActual=FuncionesSwing.getImageFromBytes((byte[])clienteimagen.getimagen());

				if(imageActual!=null) {
					imageIcon=new ImageIcon(imageActual);

					if (imageIcon != null) {
						this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setIcon(imageIcon);
						this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setText(null);
						this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.updateUI();
					} else {
						this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setText("Imagen no Encontrada");
					}
				}
			}

			this.jInternalFrameDetalleFormClienteImagen.jTextAreadescripcionClienteImagen.setText(clienteimagen.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClienteImagen(ClienteImagenBean clienteimagenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.setText(clienteimagenBean.getId().toString());
			this.jInternalFrameDetalleFormClienteImagen.jTextFieldnombreClienteImagen.setText(clienteimagenBean.getnombre());
			this.jInternalFrameDetalleFormClienteImagen.jTextAreadescripcionClienteImagen.setText(clienteimagenBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanClienteImagen(ClienteImagenParameterReturnGeneral clienteimagenReturnGeneral,ClienteImagenBean clienteimagenBean,Boolean conDefault) throws Exception { 
		try {
			ClienteImagen clienteimagenLocal=new ClienteImagen();
			
			clienteimagenLocal=clienteimagenReturnGeneral.getClienteImagen();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && clienteimagenLocal.getId()!=null && !clienteimagenLocal.getId().equals(0L))) {clienteimagenBean.setId(clienteimagenLocal.getId());}}
			if(conDefault || (!conDefault && clienteimagenLocal.getid_cliente()!=null && !clienteimagenLocal.getid_cliente().equals(-1L))) {clienteimagenBean.setid_cliente(clienteimagenLocal.getid_cliente());}
			if(conDefault || (!conDefault && clienteimagenLocal.getid_tipo_imagen_persona()!=null && !clienteimagenLocal.getid_tipo_imagen_persona().equals(-1L))) {clienteimagenBean.setid_tipo_imagen_persona(clienteimagenLocal.getid_tipo_imagen_persona());}
			if(conDefault || (!conDefault && clienteimagenLocal.getid_tipo_imagen()!=null && !clienteimagenLocal.getid_tipo_imagen().equals(-1L))) {clienteimagenBean.setid_tipo_imagen(clienteimagenLocal.getid_tipo_imagen());}
			if(conDefault || (!conDefault && clienteimagenLocal.getnombre()!=null && !clienteimagenLocal.getnombre().equals(""))) {clienteimagenBean.setnombre(clienteimagenLocal.getnombre());}
			if(conDefault || (!conDefault && clienteimagenLocal.getdescripcion()!=null && !clienteimagenLocal.getdescripcion().equals(""))) {clienteimagenBean.setdescripcion(clienteimagenLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxClienteImagenGenerico(Long idClienteImagenSeleccionado,JComboBox jComboBoxClienteImagen,List<ClienteImagen> clienteimagensLocal)throws Exception {
		try {
			ClienteImagen  clienteimagenTemp=null;

			for(ClienteImagen clienteimagenAux:clienteimagensLocal) {
				if(clienteimagenAux.getId()!=null && clienteimagenAux.getId().equals(idClienteImagenSeleccionado)) {
					clienteimagenTemp=clienteimagenAux;
					break;
				}
			}

			jComboBoxClienteImagen.setSelectedItem(clienteimagenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxClienteImagenGenerico(JComboBox jComboBoxClienteImagen,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClienteImagen.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxClienteImagen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClienteImagen.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxClienteImagen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxClienteImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxClienteImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clienteimagen=(ClienteImagen) clienteimagenLogic.getClienteImagens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			clienteimagen =(ClienteImagen) clienteimagens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!clienteimagen.getIsNew() && !clienteimagen.getIsChanged() && !clienteimagen.getIsDeleted()) {
				sDescripcion=clienteimagen.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=clienteimagen.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoImagenPersona")) {
			//sDescripcion=this.getActualTipoImagenPersonaForeignKeyDescripcion((Long)value);
			if(!clienteimagen.getIsNew() && !clienteimagen.getIsChanged() && !clienteimagen.getIsDeleted()) {
				sDescripcion=clienteimagen.gettipoimagenpersona_descripcion();
			} else {
				//sDescripcion=this.getActualTipoImagenPersonaForeignKeyDescripcion((Long)value);
				sDescripcion=clienteimagen.gettipoimagenpersona_descripcion();
			}
		}

		if(sTipo.equals("TipoImagen")) {
			//sDescripcion=this.getActualTipoImagenForeignKeyDescripcion((Long)value);
			if(!clienteimagen.getIsNew() && !clienteimagen.getIsChanged() && !clienteimagen.getIsDeleted()) {
				sDescripcion=clienteimagen.gettipoimagen_descripcion();
			} else {
				//sDescripcion=this.getActualTipoImagenForeignKeyDescripcion((Long)value);
				sDescripcion=clienteimagen.gettipoimagen_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ClienteImagen clienteimagenRow=new ClienteImagen();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clienteimagenRow=(ClienteImagen) clienteimagenLogic.getClienteImagens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			clienteimagenRow=(ClienteImagen) clienteimagens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualClienteImagen(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoClienteImagen.setVisible((this.isVisibilidadCeldaNuevoClienteImagen && this.isPermisoNuevoClienteImagen));			
			this.jButtonDuplicarClienteImagen.setVisible((this.isVisibilidadCeldaDuplicarClienteImagen && this.isPermisoDuplicarClienteImagen));			
			this.jButtonCopiarClienteImagen.setVisible((this.isVisibilidadCeldaCopiarClienteImagen && this.isPermisoCopiarClienteImagen));
			this.jButtonVerFormClienteImagen.setVisible((this.isVisibilidadCeldaVerFormClienteImagen && this.isPermisoVerFormClienteImagen));
			
			this.jButtonAbrirOrderByClienteImagen.setVisible((this.isVisibilidadCeldaOrdenClienteImagen && this.isPermisoOrdenClienteImagen));			
			
			this.jButtonNuevoRelacionesClienteImagen.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteImagen && this.isPermisoNuevoClienteImagen));			
			this.jButtonNuevoGuardarCambiosClienteImagen.setVisible((this.isVisibilidadCeldaNuevoClienteImagen && this.isPermisoNuevoClienteImagen && this.isPermisoGuardarCambiosClienteImagen));
			
			if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonModificarClienteImagen.setVisible((this.isVisibilidadCeldaModificarClienteImagen && this.isPermisoActualizarClienteImagen));	
			this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarClienteImagen.setVisible((this.isVisibilidadCeldaActualizarClienteImagen && this.isPermisoActualizarClienteImagen));	
			this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarClienteImagen.setVisible((this.isVisibilidadCeldaEliminarClienteImagen && this.isPermisoEliminarClienteImagen));
			this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarClienteImagen.setVisible(this.isVisibilidadCeldaCancelarClienteImagen);							
			this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosClienteImagen.setVisible((this.isVisibilidadCeldaGuardarClienteImagen && this.isPermisoGuardarCambiosClienteImagen));			
			
			}
						
			this.jButtonGuardarCambiosTablaClienteImagen.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteImagen && this.isPermisoGuardarCambiosClienteImagen));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarClienteImagen.setVisible((this.isVisibilidadCeldaNuevoClienteImagen && this.isPermisoNuevoClienteImagen));						
			this.jButtonDuplicarToolBarClienteImagen.setVisible((this.isVisibilidadCeldaDuplicarClienteImagen && this.isPermisoDuplicarClienteImagen));						
			this.jButtonCopiarToolBarClienteImagen.setVisible((this.isVisibilidadCeldaCopiarClienteImagen && this.isPermisoCopiarClienteImagen));			
			this.jButtonVerFormToolBarClienteImagen.setVisible((this.isVisibilidadCeldaVerFormClienteImagen && this.isPermisoVerFormClienteImagen));			
			this.jButtonAbrirOrderByToolBarClienteImagen.setVisible((this.isVisibilidadCeldaOrdenClienteImagen && this.isPermisoOrdenClienteImagen));
			this.jButtonNuevoRelacionesToolBarClienteImagen.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteImagen && this.isPermisoNuevoClienteImagen));			
			this.jButtonNuevoGuardarCambiosToolBarClienteImagen.setVisible((this.isVisibilidadCeldaNuevoClienteImagen && this.isPermisoNuevoClienteImagen && this.isPermisoGuardarCambiosClienteImagen));			
			
			if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonModificarToolBarClienteImagen.setVisible((this.isVisibilidadCeldaModificarClienteImagen && this.isPermisoActualizarClienteImagen));	
			this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarToolBarClienteImagen.setVisible((this.isVisibilidadCeldaActualizarClienteImagen  && this.isPermisoActualizarClienteImagen));	
			this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarToolBarClienteImagen.setVisible((this.isVisibilidadCeldaEliminarClienteImagen && this.isPermisoEliminarClienteImagen));
			this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarToolBarClienteImagen.setVisible(this.isVisibilidadCeldaCancelarClienteImagen);				
			this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosToolBarClienteImagen.setVisible((this.isVisibilidadCeldaGuardarClienteImagen && this.isPermisoGuardarCambiosClienteImagen));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarClienteImagen.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteImagen && this.isPermisoGuardarCambiosClienteImagen));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoClienteImagen.setVisible((this.isVisibilidadCeldaNuevoClienteImagen && this.isPermisoNuevoClienteImagen));			
			this.jMenuItemDuplicarClienteImagen.setVisible((this.isVisibilidadCeldaDuplicarClienteImagen && this.isPermisoDuplicarClienteImagen));			
			this.jMenuItemCopiarClienteImagen.setVisible((this.isVisibilidadCeldaCopiarClienteImagen && this.isPermisoCopiarClienteImagen));			
			this.jMenuItemVerFormClienteImagen.setVisible((this.isVisibilidadCeldaVerFormClienteImagen && this.isPermisoVerFormClienteImagen));			
			this.jMenuItemAbrirOrderByClienteImagen.setVisible((this.isVisibilidadCeldaOrdenClienteImagen && this.isPermisoOrdenClienteImagen));			
			//this.jMenuItemMostrarOcultarClienteImagen.setVisible((this.isVisibilidadCeldaOrdenClienteImagen && this.isPermisoOrdenClienteImagen));
			this.jMenuItemDetalleAbrirOrderByClienteImagen.setVisible((this.isVisibilidadCeldaOrdenClienteImagen && this.isPermisoOrdenClienteImagen));			
			//this.jMenuItemDetalleMostrarOcultarClienteImagen.setVisible((this.isVisibilidadCeldaOrdenClienteImagen && this.isPermisoOrdenClienteImagen));			
			this.jMenuItemNuevoRelacionesClienteImagen.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteImagen && this.isPermisoNuevoClienteImagen));			
			this.jMenuItemNuevoGuardarCambiosClienteImagen.setVisible((this.isVisibilidadCeldaNuevoClienteImagen && this.isPermisoNuevoClienteImagen && this.isPermisoGuardarCambiosClienteImagen));									
			
			if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemModificarClienteImagen.setVisible((this.isVisibilidadCeldaModificarClienteImagen && this.isPermisoActualizarClienteImagen));	
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemActualizarClienteImagen.setVisible((this.isVisibilidadCeldaActualizarClienteImagen && this.isPermisoActualizarClienteImagen));	
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemEliminarClienteImagen.setVisible((this.isVisibilidadCeldaEliminarClienteImagen && this.isPermisoEliminarClienteImagen));
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemCancelarClienteImagen.setVisible(this.isVisibilidadCeldaCancelarClienteImagen);				
			}
			
			this.jMenuItemGuardarCambiosClienteImagen.setVisible((this.isVisibilidadCeldaGuardarClienteImagen && this.isPermisoGuardarCambiosClienteImagen));						
			this.jMenuItemGuardarCambiosTablaClienteImagen.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteImagen && this.isPermisoGuardarCambiosClienteImagen));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoClienteImagen=this.jButtonNuevoClienteImagen.isVisible();
			this.isVisibilidadCeldaDuplicarClienteImagen=this.jButtonDuplicarClienteImagen.isVisible();
			this.isVisibilidadCeldaCopiarClienteImagen=this.jButtonCopiarClienteImagen.isVisible();
			this.isVisibilidadCeldaVerFormClienteImagen=this.jButtonVerFormClienteImagen.isVisible();
			
			this.isVisibilidadCeldaOrdenClienteImagen=this.jButtonAbrirOrderByClienteImagen.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=this.jButtonNuevoRelacionesClienteImagen.isVisible();
			this.isVisibilidadCeldaModificarClienteImagen=this.jButtonModificarClienteImagen.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			this.isVisibilidadCeldaActualizarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarClienteImagen.isVisible();
			this.isVisibilidadCeldaEliminarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarClienteImagen.isVisible();
			this.isVisibilidadCeldaCancelarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarClienteImagen.isVisible();
			this.isVisibilidadCeldaGuardarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosClienteImagen.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=this.jButtonGuardarCambiosTablaClienteImagen.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoClienteImagen=this.jButtonNuevoToolBarClienteImagen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=this.jButtonNuevoRelacionesToolBarClienteImagen.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			this.isVisibilidadCeldaModificarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jButtonModificarToolBarClienteImagen.isVisible();
			this.isVisibilidadCeldaActualizarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarToolBarClienteImagen.isVisible();
			this.isVisibilidadCeldaEliminarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarToolBarClienteImagen.isVisible();
			this.isVisibilidadCeldaCancelarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarToolBarClienteImagen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClienteImagen=this.jButtonGuardarCambiosToolBarClienteImagen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=this.jButtonGuardarCambiosTablaToolBarClienteImagen.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoClienteImagen=this.jMenuItemNuevoClienteImagen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=this.jMenuItemNuevoRelacionesClienteImagen.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			this.isVisibilidadCeldaModificarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jMenuItemModificarClienteImagen.isVisible();
			this.isVisibilidadCeldaActualizarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jMenuItemActualizarClienteImagen.isVisible();
			this.isVisibilidadCeldaEliminarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jMenuItemEliminarClienteImagen.isVisible();
			this.isVisibilidadCeldaCancelarClienteImagen=this.jInternalFrameDetalleFormClienteImagen.jMenuItemCancelarClienteImagen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClienteImagen=this.jMenuItemGuardarCambiosClienteImagen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=this.jMenuItemGuardarCambiosTablaClienteImagen.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesClienteImagen(Boolean esInicializar) {
		if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
				//if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesClienteImagen();
			}
			
			this.inicializarActualizarBindingBotonesManualClienteImagen(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualClienteImagen() {
		this.jButtonNuevoClienteImagen.setVisible(this.isPermisoNuevoClienteImagen);			
		this.jButtonDuplicarClienteImagen.setVisible(this.isPermisoDuplicarClienteImagen);			
		this.jButtonCopiarClienteImagen.setVisible(this.isPermisoCopiarClienteImagen);			
		this.jButtonVerFormClienteImagen.setVisible(this.isPermisoVerFormClienteImagen);			
		
		this.jButtonAbrirOrderByClienteImagen.setVisible(this.isPermisoOrdenClienteImagen);					
		
		this.jButtonNuevoRelacionesClienteImagen.setVisible(this.isPermisoNuevoClienteImagen);			
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonModificarClienteImagen.setVisible(this.isPermisoActualizarClienteImagen);	
			this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarClienteImagen.setVisible(this.isPermisoActualizarClienteImagen);	
			this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarClienteImagen.setVisible(this.isPermisoEliminarClienteImagen);
			this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarClienteImagen.setVisible(this.isVisibilidadCeldaCancelarClienteImagen);						
			this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosClienteImagen.setVisible(this.isPermisoGuardarCambiosClienteImagen);							
		}
		
		this.jButtonGuardarCambiosTablaClienteImagen.setVisible(this.isPermisoActualizarClienteImagen);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleClienteImagen() {
		this.jInternalFrameDetalleFormClienteImagen.jButtonModificarClienteImagen.setVisible(this.isPermisoActualizarClienteImagen);	
		this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarClienteImagen.setVisible(this.isPermisoActualizarClienteImagen);	
		this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarClienteImagen.setVisible(this.isPermisoEliminarClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarClienteImagen.setVisible(this.isVisibilidadCeldaCancelarClienteImagen);							
		this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosClienteImagen.setVisible((this.isVisibilidadCeldaGuardarClienteImagen && this.isPermisoGuardarCambiosClienteImagen));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosClienteImagen() {
		if(ClienteImagenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualClienteImagen();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesClienteImagen() {
	}
	
	public void jTableDatosClienteImagenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarClienteImagen(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidClienteImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clienteimagen==null) {
						this.clienteimagen = new ClienteImagen();
					}

					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				}

				if(this.clienteimagen.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.clienteimagen.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteClienteImagenActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderClienteImagen=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosClienteImagen.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderClienteImagen=(TitledBorder)this.jScrollPanelDatosClienteImagen.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderClienteImagen.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteClienteImagenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebClienteImagen(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClienteImagen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClienteImagen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.clienteimagenLogic.getConnexion());

				if(this.clienteimagen.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.clienteimagen.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClienteImagen=(TitledBorder)this.jScrollPanelDatosClienteImagen.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderClienteImagen.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteClienteImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clienteimagen==null) {
						this.clienteimagen = new ClienteImagen();
					}

					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				}

				if(this.clienteimagen.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.clienteimagen.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_imagen_personaClienteImagenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoimagenpersona=true;

			idTienePermisotipoimagenpersona=this.tienePermisosUsuarioEnPaginaWebClienteImagen(TipoImagenPersonaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoimagenpersona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClienteImagen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClienteImagen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);

				this.tipoimagenpersonaBeanSwingJInternalFrame=new TipoImagenPersonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoimagenpersonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoimagenpersonaBeanSwingJInternalFrame.getTipoImagenPersonaLogic().setConnexion(this.clienteimagenLogic.getConnexion());

				if(this.clienteimagen.getid_tipo_imagen_persona()!=null) {
					this.tipoimagenpersonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoimagenpersonaBeanSwingJInternalFrame.setIdActual(this.clienteimagen.getid_tipo_imagen_persona());
					this.tipoimagenpersonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoimagenpersonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoimagenpersonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoImagenPersona();
				}

				JInternalFrameBase jinternalFrame =this.tipoimagenpersonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClienteImagen=(TitledBorder)this.jScrollPanelDatosClienteImagen.getBorder();
				TitledBorder titledBordertipoimagenpersona=(TitledBorder)this.tipoimagenpersonaBeanSwingJInternalFrame.jScrollPanelDatosTipoImagenPersona.getBorder();

				titledBordertipoimagenpersona.setTitle(titledBorderClienteImagen.getTitle() + " -> Tipo Imagen Persona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_imagen_personaClienteImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clienteimagen==null) {
						this.clienteimagen = new ClienteImagen();
					}

					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				}

				if(this.clienteimagen.getid_tipo_imagen_persona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_imagen_persona = "+this.clienteimagen.getid_tipo_imagen_persona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_imagenClienteImagenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoimagen=true;

			idTienePermisotipoimagen=this.tienePermisosUsuarioEnPaginaWebClienteImagen(TipoImagenConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoimagen) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClienteImagen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClienteImagen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);

				this.tipoimagenBeanSwingJInternalFrame=new TipoImagenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoimagenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoimagenBeanSwingJInternalFrame.getTipoImagenLogic().setConnexion(this.clienteimagenLogic.getConnexion());

				if(this.clienteimagen.getid_tipo_imagen()!=null) {
					this.tipoimagenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoimagenBeanSwingJInternalFrame.setIdActual(this.clienteimagen.getid_tipo_imagen());
					this.tipoimagenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoimagenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoimagenBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoImagen();
				}

				JInternalFrameBase jinternalFrame =this.tipoimagenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClienteImagen=(TitledBorder)this.jScrollPanelDatosClienteImagen.getBorder();
				TitledBorder titledBordertipoimagen=(TitledBorder)this.tipoimagenBeanSwingJInternalFrame.jScrollPanelDatosTipoImagen.getBorder();

				titledBordertipoimagen.setTitle(titledBorderClienteImagen.getTitle() + " -> Tipo Imagen");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_imagenClienteImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clienteimagen==null) {
						this.clienteimagen = new ClienteImagen();
					}

					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				}

				if(this.clienteimagen.getid_tipo_imagen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_imagen = "+this.clienteimagen.getid_tipo_imagen().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreClienteImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clienteimagen==null) {
						this.clienteimagen = new ClienteImagen();
					}

					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				}

				if(this.clienteimagen.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.clienteimagen.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonimagenClienteImagenActionPerformed(java.awt.event.ActionEvent evt) {
		try {


			this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
			this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
			this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));

			Image imageActual=null;
			int iReturnArchivo = this.jInternalFrameDetalleFormClienteImagen.jFileChooserimagenClienteImagen.showOpenDialog(this);

			if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
				imageActual=ImageIO.read(this.jInternalFrameDetalleFormClienteImagen.jFileChooserimagenClienteImagen.getSelectedFile()).getScaledInstance(this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.getWidth(), this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.getHeight(), Image.SCALE_DEFAULT);

				if (imageActual != null) {
					this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setIcon(new ImageIcon(imageActual));
					this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.setText(null);
					this.jInternalFrameDetalleFormClienteImagen.jLabelImagenimagenClienteImagen.updateUI();
				}
			}
		} catch(Exception e) {
			;
		}
	}

	public void jButtonDescargarimagenClienteImagenActionPerformed(java.awt.event.ActionEvent evt) throws Exception  {
		try {


			String sPathDir=this.parametroGeneralUsuario.getpath_exportar()+ClienteImagenConstantesFunciones.CLASSNAME;
			String sPathFile=sPathDir+"/"+this.clienteimagen.getnombre().replace(" ", "").toLowerCase()+"."+Funciones2.getExtensionTipoImagen(this.clienteimagen.getid_tipo_imagen());
			File dir = new File(sPathDir);

			if (!dir.exists()) {
				dir.mkdirs();
			}

			FileOutputStream fileOuputStream =  new FileOutputStream(sPathFile);
			fileOuputStream.write(this.clienteimagen.getimagen());
			fileOuputStream.close();

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO &&
				JOptionPane.showMessageDialog(this,"DESCARGADO CORRECTAMENTE:"+sPathFile,"MANTENIMIENTO DE ClienteImagen",JOptionPane.INFORMATION_MESSAGE);
			}

	} catch(Exception e) {
			throw e;
		}
	}

	public void jButtonimagenClienteImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clienteimagen==null) {
						this.clienteimagen = new ClienteImagen();
					}

					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				}

				if(this.clienteimagen.getimagen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where imagen = "+this.clienteimagen.getimagen().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionClienteImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteImagen(this.getclienteimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clienteimagen==null) {
						this.clienteimagen = new ClienteImagen();
					}

					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);
				}

				if(this.clienteimagen.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.clienteimagen.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteClienteImagenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClienteImagen(false,false);

			this.getClienteImagensFK_IdCliente();

			this.inicializarActualizarBindingClienteImagen(false);

			//if(ClienteImagenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClienteImagen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoImagenClienteImagenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClienteImagen(false,false);

			this.getClienteImagensFK_IdTipoImagen();

			this.inicializarActualizarBindingClienteImagen(false);

			//if(ClienteImagenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClienteImagen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoImagenPersonaClienteImagenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClienteImagen(false,false);

			this.getClienteImagensFK_IdTipoImagenPersona();

			this.inicializarActualizarBindingClienteImagen(false);

			//if(ClienteImagenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClienteImagen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clienteimagenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameClienteImagen() {
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
			this.jInternalFrameDetalleFormClienteImagen.setVisible(false);	    			
			this.jInternalFrameDetalleFormClienteImagen.dispose();
			this.jInternalFrameDetalleFormClienteImagen=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
			this.jInternalFrameReporteDinamicoClienteImagen.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoClienteImagen.dispose();
			this.jInternalFrameReporteDinamicoClienteImagen=null;
		}
		
		if(this.jInternalFrameImportacionClienteImagen!=null) {
			this.jInternalFrameImportacionClienteImagen.setVisible(false);	    			
			this.jInternalFrameImportacionClienteImagen.dispose();
			this.jInternalFrameImportacionClienteImagen=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessClienteImagen();
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
			
			if(sTipo.equals("NuevoClienteImagen")) {
				jButtonNuevoClienteImagenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarClienteImagen")) {
				jButtonDuplicarClienteImagenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarClienteImagen")) {
				jButtonCopiarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("VerFormClienteImagen")) {
				jButtonVerFormClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarClienteImagen")) {
				jButtonNuevoClienteImagenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarClienteImagen")) {
				jButtonDuplicarClienteImagenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoClienteImagen")) {
				jButtonNuevoClienteImagenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarClienteImagen")) {
				jButtonDuplicarClienteImagenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesClienteImagen")) {
				jButtonNuevoClienteImagenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarClienteImagen")) {
				jButtonNuevoClienteImagenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesClienteImagen")) {
				jButtonNuevoClienteImagenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarClienteImagen")) {
				jButtonModificarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarClienteImagen")) {
				jButtonModificarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarClienteImagen")) {
				jButtonModificarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarClienteImagen")) {
				jButtonActualizarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarClienteImagen")) {
				jButtonActualizarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarClienteImagen")) {
				jButtonActualizarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("EliminarClienteImagen")) {
				jButtonEliminarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarClienteImagen")) {
				jButtonEliminarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarClienteImagen")) {
				jButtonEliminarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("CancelarClienteImagen")) {
				jButtonCancelarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarClienteImagen")) {
				jButtonCancelarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarClienteImagen")) {
				jButtonCancelarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("CerrarClienteImagen")) {
				jButtonCerrarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarClienteImagen")) {
				jButtonCerrarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarClienteImagen")) {
				jButtonCerrarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarClienteImagen")) {
				jButtonMostrarOcultarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarClienteImagen")) {
				jButtonCancelarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosClienteImagen")) {
				jButtonGuardarCambiosClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarClienteImagen")) {
				jButtonGuardarCambiosClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarClienteImagen")) {
				jButtonCopiarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarClienteImagen")) {
				jButtonVerFormClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosClienteImagen")) {
				jButtonGuardarCambiosClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarClienteImagen")) {
				jButtonCopiarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormClienteImagen")) {
				jButtonVerFormClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaClienteImagen")) {
				jButtonGuardarCambiosClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarClienteImagen")) {
				jButtonGuardarCambiosClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaClienteImagen")) {
				jButtonGuardarCambiosClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionClienteImagen")) {
				jButtonRecargarInformacionClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarClienteImagen")) {
				jButtonRecargarInformacionClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionClienteImagen")) {
				jButtonRecargarInformacionClienteImagenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresClienteImagen")) {
				jButtonAnterioresClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarClienteImagen")) {
				jButtonAnterioresClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreClienteImagen")) {
				jButtonAnterioresClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesClienteImagen")) {
				jButtonSiguientesClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarClienteImagen")) {
				jButtonSiguientesClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesClienteImagen")) {
				jButtonSiguientesClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByClienteImagen") || sTipo.equals("MenuItemDetalleAbrirOrderByClienteImagen")) {
				jButtonAbrirOrderByClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarClienteImagen") || sTipo.equals("MenuItemDetalleMostrarOcultarClienteImagen")) {
				jButtonMostrarOcultarClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosClienteImagen")) {
				jButtonNuevoGuardarCambiosClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarClienteImagen")) {
				jButtonNuevoGuardarCambiosClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosClienteImagen")) {
				jButtonNuevoGuardarCambiosClienteImagenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoClienteImagen")) {
				jButtonCerrarReporteDinamicoClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoClienteImagen")) {
				jButtonGenerarReporteDinamicoClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoClienteImagen")) {
				
				jButtonGenerarExcelReporteDinamicoClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionClienteImagen")) {
				jButtonCerrarImportacionClienteImagenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionClienteImagen")) {
				
				jButtonGenerarImportacionClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionClienteImagen")) {
				
				jButtonAbrirImportacionClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesClienteImagen")) {
				jComboBoxTiposAccionesClienteImagenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesClienteImagen")) {
				jComboBoxTiposRelacionesClienteImagenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioClienteImagen")) {
				jComboBoxTiposAccionesClienteImagenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarClienteImagen")) {
				
				jComboBoxTiposSeleccionarClienteImagenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralClienteImagen")) {
				jTextFieldValorCampoGeneralClienteImagenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByClienteImagen")) {
				jButtonAbrirOrderByClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarClienteImagen")) {
				jButtonAbrirOrderByClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByClienteImagen")) {
				jButtonCerrarOrderByClienteImagenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClienteImagenBusqueda")) {
				this.jButtonidClienteImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteClienteImagen")) {
				this.jButtonid_clienteClienteImagenActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteClienteImagenUpdate")) {
				this.jButtonid_clienteClienteImagenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteClienteImagenBusqueda")) {
				this.jButtonid_clienteClienteImagenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_imagen_personaClienteImagenUpdate")) {
				this.jButtonid_tipo_imagen_personaClienteImagenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_imagen_personaClienteImagenBusqueda")) {
				this.jButtonid_tipo_imagen_personaClienteImagenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_imagenClienteImagenUpdate")) {
				this.jButtonid_tipo_imagenClienteImagenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_imagenClienteImagenBusqueda")) {
				this.jButtonid_tipo_imagenClienteImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreClienteImagenBusqueda")) {
				this.jButtonnombreClienteImagenBusquedaActionPerformed(evt);
			}
			//ABRIR BUSQUEDA ARCHIVO CAMPO
			
			else if(sTipo.equals("imagenClienteImagen")) {
				this.jButtonimagenClienteImagenActionPerformed(evt);
			}
			
			//DESCARGAR ARCHIVO CAMPO
			else if(sTipo.equals("DescargarimagenClienteImagen")) {
				this.jButtonDescargarimagenClienteImagenActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("imagenClienteImagenBusqueda")) {
				this.jButtonimagenClienteImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionClienteImagenBusqueda")) {
				this.jButtondescripcionClienteImagenBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteClienteImagen")) {
				this.jButtonid_clienteClienteImagenActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteClienteImagen")) {
				this.jButtonFK_IdClienteClienteImagenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoImagenClienteImagen")) {
				this.jButtonFK_IdTipoImagenClienteImagenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoImagenPersonaClienteImagen")) {
				this.jButtonFK_IdTipoImagenPersonaClienteImagenActionPerformed(evt);
			}
			
			;
			
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessClienteImagen();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteImagenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				


				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ClienteImagen clienteimagenLocal=null;
			
			if(!this.getEsControlTabla()) {
				clienteimagenLocal=this.clienteimagen;
			} else {
				clienteimagenLocal=this.clienteimagenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
							
				
				


				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
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
			
			


			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteImagenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
								
						
				


				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
								
				
				


				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteImagenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
							
				
				


				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteImagenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagenAnterior =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.clienteimagenAnterior =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
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
			
			


			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteImagenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
								
				
				


				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteImagenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteImagenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosClienteImagen")) {
					jCheckBoxSeleccionarTodosClienteImagenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosClienteImagen")) {
					jCheckBoxSeleccionadosClienteImagenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarClienteImagen")) {
					
				}
				
				


				
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
												
				
				


				
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteImagenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clienteimagenAnterior =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.clienteimagenAnterior =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteImagenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
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
			
			


			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteImagenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clienteimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clienteimagen);
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
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
				
				


				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteImagen.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clienteimagenAnterior =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarClienteImagen")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosClienteImagenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosClienteImagen.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.clienteimagen =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.clienteimagen =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.clienteimagen);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarClienteImagen")) {
				
				}
				
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarClienteImagen")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosClienteImagen.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarClienteImagen")) {
			
			}
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessClienteImagen();
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
			if(sTipo.equals("NuevoClienteImagen")) {
				jButtonNuevoClienteImagenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarClienteImagen")) {
				jButtonDuplicarClienteImagenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarClienteImagen")) {
				jButtonCopiarClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormClienteImagen")) {
				jButtonVerFormClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesClienteImagen")) {
				jButtonNuevoClienteImagenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarClienteImagen")) {
				jButtonModificarClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarClienteImagen")) {
				jButtonActualizarClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarClienteImagen")) {
				jButtonEliminarClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaClienteImagen")) {
				jButtonGuardarCambiosClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarClienteImagen")) {
				jButtonCancelarClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarClienteImagen")) {
				jButtonCerrarClienteImagenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosClienteImagen")) {
				jButtonGuardarCambiosClienteImagenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosClienteImagen")) {
				jButtonNuevoGuardarCambiosClienteImagenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByClienteImagen")) {
				jButtonAbrirOrderByClienteImagenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionClienteImagen")) {
				jButtonRecargarInformacionClienteImagenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresClienteImagen")) {
				jButtonAnterioresClienteImagenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesClienteImagen")) {
				jButtonSiguientesClienteImagenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClienteImagenBusqueda")) {
				this.jButtonidClienteImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteClienteImagen")) {
				this.jButtonid_clienteClienteImagenActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteClienteImagenUpdate")) {
				this.jButtonid_clienteClienteImagenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteClienteImagenBusqueda")) {
				this.jButtonid_clienteClienteImagenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_imagen_personaClienteImagenUpdate")) {
				this.jButtonid_tipo_imagen_personaClienteImagenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_imagen_personaClienteImagenBusqueda")) {
				this.jButtonid_tipo_imagen_personaClienteImagenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_imagenClienteImagenUpdate")) {
				this.jButtonid_tipo_imagenClienteImagenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_imagenClienteImagenBusqueda")) {
				this.jButtonid_tipo_imagenClienteImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreClienteImagenBusqueda")) {
				this.jButtonnombreClienteImagenBusquedaActionPerformed(evt);
			}
			//ABRIR BUSQUEDA ARCHIVO CAMPO
			
			else if(sTipo.equals("imagenClienteImagen")) {
				this.jButtonimagenClienteImagenActionPerformed(evt);
			}
			
			//DESCARGAR ARCHIVO CAMPO
			else if(sTipo.equals("DescargarimagenClienteImagen")) {
				this.jButtonDescargarimagenClienteImagenActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("imagenClienteImagenBusqueda")) {
				this.jButtonimagenClienteImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionClienteImagenBusqueda")) {
				this.jButtondescripcionClienteImagenBusquedaActionPerformed(evt);
			}
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessClienteImagen();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameClienteImagen")) {
				closingInternalFrameClienteImagen();
				
			} else if(sTipo.equals("jButtonCancelarClienteImagen")) {
				JInternalFrameBase jInternalFrameDetalleFormClienteImagen = (JInternalFrameBase)evt.getSource();
	            	
	            ClienteImagenBeanSwingJInternalFrame jInternalFrameParent=(ClienteImagenBeanSwingJInternalFrame)jInternalFrameDetalleFormClienteImagen.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarClienteImagenActionPerformed(null);
			}
			
			ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.clienteimagen,new Object(),this.clienteimagenParameterGeneral,this.clienteimagenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormClienteImagen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormClienteImagen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormClienteImagen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.clienteimagen)) {
			if(!esControlTabla) {
				if(ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);			
				}
				
				if(this.clienteimagenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualClienteImagen(this.clienteimagen,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.clienteimagenReturnGeneral=clienteimagenLogic.procesarEventosClienteImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clienteimagenLogic.getClienteImagens(),this.clienteimagen,this.clienteimagenParameterGeneral,this.isEsNuevoClienteImagen,classes);//this.clienteimagenLogic.getClienteImagen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanClienteImagen(this.clienteimagenReturnGeneral,this.clienteimagenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.clienteimagenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanClienteImagen(classes,this.clienteimagenReturnGeneral,this.clienteimagenBean,false);
					}
						
					if(this.clienteimagenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyClienteImagen(this.clienteimagenReturnGeneral.getClienteImagen());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioClienteImagen(this.clienteimagenReturnGeneral.getClienteImagen());	
					}
						
					if(this.clienteimagenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioClienteImagen(this.clienteimagenReturnGeneral.getClienteImagen(),classes);//this.clienteimagenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioClienteImagen(this.clienteimagen,classes);//this.clienteimagenBean);									
				}
			
				if(ClienteImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualClienteImagen(this.clienteimagen,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteImagen(this.clienteimagen);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.clienteimagenAnterior!=null) {
						this.clienteimagen=this.clienteimagenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.clienteimagenReturnGeneral=clienteimagenLogic.procesarEventosClienteImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clienteimagenLogic.getClienteImagens(),this.clienteimagen,this.clienteimagenParameterGeneral,this.isEsNuevoClienteImagen,classes);//this.clienteimagenLogic.getClienteImagen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.clienteimagenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.clienteimagenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.clienteimagenReturnGeneral.getClienteImagen(),clienteimagenLogic.getClienteImagens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.clienteimagenReturnGeneral.getClienteImagen(),this.clienteimagens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosClienteImagen.repaint();
				
				//((AbstractTableModel) this.jTableDatosClienteImagen.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosClienteImagen();
			}
		}
	}
	
	public void actualizarVisualTableDatosClienteImagen() throws Exception {
		
		ClienteImagenModel clienteimagenModel=(ClienteImagenModel)this.jTableDatosClienteImagen.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clienteimagenModel.clienteimagens=this.clienteimagenLogic.getClienteImagens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			clienteimagenModel.clienteimagens=this.clienteimagens;
		}
		
		
		((ClienteImagenModel) this.jTableDatosClienteImagen.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaClienteImagen() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getclienteimagenAnterior(),this.clienteimagenLogic.getClienteImagens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getclienteimagenAnterior(),this.clienteimagens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosClienteImagen();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioClienteImagen(ClienteImagen clienteimagen,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
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
										
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clienteimagen,new Object(),generalEntityParameterGeneral,this.clienteimagenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.clienteimagenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ClienteImagenConstantesFunciones.getClassesRelationshipsOfClienteImagen(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ClienteImagenConstantesFunciones.getClassesRelationshipsFromStringsOfClienteImagen(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormClienteImagen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ClienteImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clienteimagen,new Object(),generalEntityParameterGeneral,this.clienteimagenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioClienteImagen(ClienteImagenBean clienteimagenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanClienteImagen(ArrayList<Classe> classes,ClienteImagenReturnGeneral clienteimagenReturnGeneral,ClienteImagenBean clienteimagenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualClienteImagen(ClienteImagen clienteimagen,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.clienteimagen)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormClienteImagen = new ClienteImagenDetalleFormJInternalFrame(jDesktopPane,this.clienteimagenSessionBean.getConGuardarRelaciones(),this.clienteimagenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.setVisible(false);
		this.jInternalFrameDetalleFormClienteImagen.setSelected(false);						
		
		this.jInternalFrameDetalleFormClienteImagen.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormClienteImagen.clienteimagenLogic=this.clienteimagenLogic;
		
		this.cargarCombosFrameForeignKeyClienteImagen("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleClienteImagen();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClienteImagen();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyClienteImagen("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyClienteImagen();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormClienteImagen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClienteImagen"));
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonModificarClienteImagen.addActionListener(new ButtonActionListener(this,"ModificarClienteImagen"));

		
		this.jInternalFrameDetalleFormClienteImagen.jButtonModificarToolBarClienteImagen.addActionListener(new ButtonActionListener(this,"ModificarToolBarClienteImagen"));
					
		this.jInternalFrameDetalleFormClienteImagen.jMenuItemModificarClienteImagen.addActionListener(new ButtonActionListener(this,"MenuItemModificarClienteImagen"));		
		
		
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarClienteImagen.addActionListener (new ButtonActionListener(this,"ActualizarClienteImagen"));
		
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarToolBarClienteImagen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClienteImagen"));
						
		this.jInternalFrameDetalleFormClienteImagen.jMenuItemActualizarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClienteImagen"));		
		
		
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarClienteImagen.addActionListener (new ButtonActionListener(this,"EliminarClienteImagen"));
		
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"EliminarToolBarClienteImagen"));
								
		this.jInternalFrameDetalleFormClienteImagen.jMenuItemEliminarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClienteImagen"));		
		
		
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarClienteImagen.addActionListener (new ButtonActionListener(this,"CancelarClienteImagen"));
		
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"CancelarToolBarClienteImagen"));
					
		this.jInternalFrameDetalleFormClienteImagen.jMenuItemCancelarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClienteImagen"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormClienteImagen.jMenuItemDetalleCerrarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClienteImagen"));		
		
		
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteImagen"));
		
		
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteImagen"));
		
		
		
		this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClienteImagen"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonidClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"idClienteImagenBusqueda"));
		//jButtonid_clienteClienteImagen.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteImagenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagen.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagen"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagen_personaClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagen_personaClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagen_personaClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagen_personaClienteImagenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagenClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagenClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagenClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagenClienteImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonnombreClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"nombreClienteImagenBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormClienteImagen.jButtonimagenClienteImagen.addActionListener(new ButtonActionListener(this,"imagenClienteImagen"));
		this.jInternalFrameDetalleFormClienteImagen.jButtonDescargarimagenClienteImagen.addActionListener(new ButtonActionListener(this,"DescargarimagenClienteImagen"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonimagenClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"imagenClienteImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtondescripcionClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionClienteImagenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClienteImagen"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameClienteImagen"));
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClienteImagen"));
		}
		
		this.jTableDatosClienteImagen.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarClienteImagen"));
		
		this.jTableDatosClienteImagen.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarClienteImagen"));
		
		this.jButtonNuevoClienteImagen.addActionListener(new ButtonActionListener(this,"NuevoClienteImagen"));
		
		this.jButtonDuplicarClienteImagen.addActionListener(new ButtonActionListener(this,"DuplicarClienteImagen"));
		
		this.jButtonCopiarClienteImagen.addActionListener(new ButtonActionListener(this,"CopiarClienteImagen"));
		
		this.jButtonVerFormClienteImagen.addActionListener(new ButtonActionListener(this,"VerFormClienteImagen"));
		
		
		this.jButtonNuevoToolBarClienteImagen.addActionListener(new ButtonActionListener(this,"NuevoToolBarClienteImagen"));
			
		this.jButtonDuplicarToolBarClienteImagen.addActionListener(new ButtonActionListener(this,"DuplicarToolBarClienteImagen"));
			
		this.jMenuItemNuevoClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoClienteImagen"));
			
		this.jMenuItemDuplicarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarClienteImagen"));		
		
		
		this.jButtonNuevoRelacionesClienteImagen.addActionListener (new ButtonActionListener(this,"NuevoRelacionesClienteImagen"));
		
		
		this.jButtonNuevoRelacionesToolBarClienteImagen.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarClienteImagen"));
			
		this.jMenuItemNuevoRelacionesClienteImagen.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesClienteImagen"));		
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonModificarClienteImagen.addActionListener(new ButtonActionListener(this,"ModificarClienteImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonModificarToolBarClienteImagen.addActionListener(new ButtonActionListener(this,"ModificarToolBarClienteImagen"));
			
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemModificarClienteImagen.addActionListener(new ButtonActionListener(this,"MenuItemModificarClienteImagen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarClienteImagen.addActionListener (new ButtonActionListener(this,"ActualizarClienteImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonActualizarToolBarClienteImagen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClienteImagen"));
				
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemActualizarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClienteImagen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarClienteImagen.addActionListener (new ButtonActionListener(this,"EliminarClienteImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonEliminarToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"EliminarToolBarClienteImagen"));
						
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemEliminarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClienteImagen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarClienteImagen.addActionListener (new ButtonActionListener(this,"CancelarClienteImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonCancelarToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"CancelarToolBarClienteImagen"));
			
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemCancelarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClienteImagen"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarClienteImagen"));		
		
		
		this.jButtonCerrarClienteImagen.addActionListener (new ButtonActionListener(this,"CerrarClienteImagen"));
		
		
		this.jButtonCerrarToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"CerrarToolBarClienteImagen"));
			
		this.jMenuItemCerrarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemCerrarClienteImagen"));
			
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jMenuItemDetalleCerrarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClienteImagen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosClienteImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosClienteImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteImagen"));
		}
		
		this.jButtonCopiarToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"CopiarToolBarClienteImagen"));
			
		this.jButtonVerFormToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"VerFormToolBarClienteImagen"));
		
		this.jMenuItemGuardarCambiosClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosClienteImagen"));
			
		this.jMenuItemCopiarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemCopiarClienteImagen"));		
		
		this.jMenuItemVerFormClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemVerFormClienteImagen"));		
		
		
		this.jButtonGuardarCambiosTablaClienteImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClienteImagen"));
		
		
		this.jButtonGuardarCambiosTablaToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarClienteImagen"));
			
		this.jMenuItemGuardarCambiosTablaClienteImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClienteImagen"));		
		
		
		
		this.jButtonRecargarInformacionClienteImagen.addActionListener (new ButtonActionListener(this,"RecargarInformacionClienteImagen"));
					
		this.jButtonRecargarInformacionToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarClienteImagen"));
		
		this.jMenuItemRecargarInformacionClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionClienteImagen"));		
		
		
		
		this.jButtonAnterioresClienteImagen.addActionListener (new ButtonActionListener(this,"AnterioresClienteImagen"));
		
		
		this.jButtonAnterioresToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"AnterioresToolBarClienteImagen"));
		
		this.jMenuItemAnterioresClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresClienteImagen"));		
		
		
		this.jButtonSiguientesClienteImagen.addActionListener (new ButtonActionListener(this,"SiguientesClienteImagen"));
		
		
		this.jButtonSiguientesToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"SiguientesToolBarClienteImagen"));
			
		this.jMenuItemSiguientesClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesClienteImagen"));
			
		this.jMenuItemAbrirOrderByClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByClienteImagen"));
			
		this.jMenuItemMostrarOcultarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarClienteImagen"));
			
		this.jMenuItemDetalleAbrirOrderByClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByClienteImagen"));
			
		this.jMenuItemDetalleMostarOcultarClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarClienteImagen"));		
		
		
		this.jButtonNuevoGuardarCambiosClienteImagen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosClienteImagen"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarClienteImagen"));
			
		this.jMenuItemNuevoGuardarCambiosClienteImagen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosClienteImagen"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosClienteImagen.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosClienteImagen"));

		this.jCheckBoxSeleccionadosClienteImagen.addItemListener(new CheckBoxItemListener(this,"SeleccionadosClienteImagen"));
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClienteImagen"));
		}
		
		
		this.jComboBoxTiposRelacionesClienteImagen.addActionListener (new ButtonActionListener(this,"TiposRelacionesClienteImagen"));
			
		this.jComboBoxTiposAccionesClienteImagen.addActionListener (new ButtonActionListener(this,"TiposAccionesClienteImagen"));
					
		this.jComboBoxTiposSeleccionarClienteImagen.addActionListener (new ButtonActionListener(this,"TiposSeleccionarClienteImagen"));
			
		this.jTextFieldValorCampoGeneralClienteImagen.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralClienteImagen"));		
		
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonidClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"idClienteImagenBusqueda"));
		//jButtonid_clienteClienteImagen.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteImagenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagen.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagen"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagen_personaClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagen_personaClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagen_personaClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagen_personaClienteImagenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagenClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagenClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagenClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagenClienteImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonnombreClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"nombreClienteImagenBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormClienteImagen.jButtonimagenClienteImagen.addActionListener(new ButtonActionListener(this,"imagenClienteImagen"));
		this.jInternalFrameDetalleFormClienteImagen.jButtonDescargarimagenClienteImagen.addActionListener(new ButtonActionListener(this,"DescargarimagenClienteImagen"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonimagenClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"imagenClienteImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtondescripcionClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionClienteImagenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteClienteImagen.addActionListener(new ButtonActionListener(this,"FK_IdClienteClienteImagen"));

			this.jButtonBuscarFK_IdClienteid_clienteClienteImagen.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagen"));

			this.jButtonFK_IdTipoImagenClienteImagen.addActionListener(new ButtonActionListener(this,"FK_IdTipoImagenClienteImagen"));

			this.jButtonFK_IdTipoImagenPersonaClienteImagen.addActionListener(new ButtonActionListener(this,"FK_IdTipoImagenPersonaClienteImagen"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoClienteImagen!=null) {
				this.jInternalFrameReporteDinamicoClienteImagen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteImagen"));
				this.jInternalFrameReporteDinamicoClienteImagen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteImagen"));
				this.jInternalFrameReporteDinamicoClienteImagen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteImagen"));
			}
			
			//this.jButtonCerrarReporteDinamicoClienteImagen.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteImagen"));				
			//this.jButtonGenerarReporteDinamicoClienteImagen.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteImagen"));
			//this.jButtonGenerarExcelReporteDinamicoClienteImagen.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteImagen"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionClienteImagen!=null) {
				this.jInternalFrameImportacionClienteImagen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClienteImagen"));
				this.jInternalFrameImportacionClienteImagen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClienteImagen"));
				this.jInternalFrameImportacionClienteImagen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClienteImagen"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByClienteImagen.addActionListener (new ButtonActionListener(this,"AbrirOrderByClienteImagen"));
			
			this.jButtonAbrirOrderByToolBarClienteImagen.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarClienteImagen"));			
			
			if(this.jInternalFrameOrderByClienteImagen!=null) {
				this.jInternalFrameOrderByClienteImagen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClienteImagen"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormClienteImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteImagen.jTabbedPaneRelacionesClienteImagen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClienteImagen"));
		
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
            		closingInternalFrameClienteImagen();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormClienteImagen.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormClienteImagen = (JInternalFrameBase)event.getSource();
	            	
	            ClienteImagenBeanSwingJInternalFrame jInternalFrameParent=(ClienteImagenBeanSwingJInternalFrame)jInternalFrameDetalleFormClienteImagen.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarClienteImagenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosClienteImagen.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosClienteImagenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosClienteImagen.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosClienteImagen.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteImagenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteImagenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteImagenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoClienteImagen";
		inputMap = this.jButtonNuevoClienteImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoClienteImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClienteImagenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteImagenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteImagenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteImagenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesClienteImagen";
		inputMap = this.jButtonNuevoRelacionesClienteImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesClienteImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClienteImagenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarClienteImagen";
		inputMap = this.jButtonModificarClienteImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarClienteImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarClienteImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarClienteImagen";
		inputMap = this.jButtonActualizarClienteImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarClienteImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarClienteImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarClienteImagen";
		inputMap = this.jButtonEliminarClienteImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarClienteImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarClienteImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarClienteImagen";
		inputMap = this.jButtonCancelarClienteImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarClienteImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarClienteImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarClienteImagen";
		inputMap = this.jButtonCerrarClienteImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarClienteImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarClienteImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosClienteImagen";
		inputMap = this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosClienteImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormClienteImagen.jButtonGuardarCambiosClienteImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosClienteImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosClienteImagen.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosClienteImagenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesClienteImagen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesClienteImagenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarClienteImagen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarClienteImagenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralClienteImagen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralClienteImagenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonidClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"idClienteImagenBusqueda"));
		//jButtonid_clienteClienteImagen.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteImagenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagen.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagen"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagen_personaClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagen_personaClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagen_personaClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagen_personaClienteImagenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagenClienteImagenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagenClienteImagenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonid_tipo_imagenClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagenClienteImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonnombreClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"nombreClienteImagenBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormClienteImagen.jButtonimagenClienteImagen.addActionListener(new ButtonActionListener(this,"imagenClienteImagen"));
		this.jInternalFrameDetalleFormClienteImagen.jButtonDescargarimagenClienteImagen.addActionListener(new ButtonActionListener(this,"DescargarimagenClienteImagen"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtonimagenClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"imagenClienteImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteImagen.jButtondescripcionClienteImagenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionClienteImagenBusqueda"));
		
		
		this.jButtonFK_IdClienteClienteImagen.addActionListener(new ButtonActionListener(this,"FK_IdClienteClienteImagen"));

		this.jButtonBuscarFK_IdClienteid_clienteClienteImagen.addActionListener(new ButtonActionListener(this,"id_clienteClienteImagen"));

		this.jButtonFK_IdTipoImagenClienteImagen.addActionListener(new ButtonActionListener(this,"FK_IdTipoImagenClienteImagen"));

		this.jButtonFK_IdTipoImagenPersonaClienteImagen.addActionListener(new ButtonActionListener(this,"FK_IdTipoImagenPersonaClienteImagen"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionClienteImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionClienteImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarClienteImagenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarClienteImagen.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosClienteImagen(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
					clienteimagenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteImagen clienteimagenAux:clienteimagens) {
					clienteimagenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosClienteImagenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClienteImagen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
						clienteimagenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteImagen clienteimagenAux:clienteimagens) {
						clienteimagenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteImagen clienteimagenAux:clienteimagens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaClienteImagen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClienteImagen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClienteImagen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosClienteImagenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClienteImagen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosClienteImagen.getSelectedRows();
			
			ClienteImagen clienteimagenLocal=new ClienteImagen();
			
			//this.seleccionarTodosClienteImagen(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteimagenLocal =(ClienteImagen) this.clienteimagenLogic.getClienteImagens().toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					clienteimagenLocal =(ClienteImagen) this.clienteimagens.toArray()[this.jTableDatosClienteImagen.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				clienteimagenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
						clienteimagenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteImagen clienteimagenAux:clienteimagens) {
						clienteimagenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaClienteImagen(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClienteImagen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClienteImagen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClienteImagen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualClienteImagenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarClienteImagenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralClienteImagenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingClienteImagen(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralClienteImagen.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClienteImagen clienteimagenAux:this.clienteimagenLogic.getClienteImagens()) {
				
						if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							clienteimagenAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_IMAGEN)) {
							existe=true;
							clienteimagenAux.setimagen(null);
						}
						 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							clienteimagenAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteImagen clienteimagenAux:clienteimagens) {
					
						if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							clienteimagenAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_IMAGEN)) {
							existe=true;
							clienteimagenAux.setimagen(null);
						}
						 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							clienteimagenAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaClienteImagen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesClienteImagenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingClienteImagen(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioClienteImagen=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesClienteImagen.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteClienteImagen) {				
					conSplash=true;//false;										
					
					//this.startProcessClienteImagen(conSplash);
				
					this.generarReporteClienteImagensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoClienteImagensSeleccionados();
				//this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClienteImagensSeleccionados(false);
				//this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClienteImagensSeleccionados(true);
				//this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClienteImagen();
				
				this.exportarClienteImagensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionClienteImagens();
				//this.importarClienteImagens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClienteImagen();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelClienteImagensSeleccionados();
				//this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cliente Imagen", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessClienteImagen();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoClienteImagen)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyClienteImagen(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.setSelectedIndex(0);					
				}	
			} 			
			else if(ClienteImagenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteClienteImagen) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessClienteImagen(conSplash);
					
						//this.actualizarParametrosGeneralClienteImagen();
						
						this.generarReporteProcesoAccionClienteImagensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ClienteImagenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cliente ImagenES SELECCIONADOS?", "MANTENIMIENTO DE Cliente Imagen", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessClienteImagen();
				
						this.actualizarParametrosGeneralClienteImagen();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.clienteimagenReturnGeneral=clienteimagenLogic.procesarAccionClienteImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.clienteimagenLogic.getClienteImagens(),this.clienteimagenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarClienteImagenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralClienteImagen();
					
					ClienteImagenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarClienteImagenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesClienteImagen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormClienteImagen.jComboBoxTiposAccionesFormularioClienteImagen.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessClienteImagen(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesClienteImagenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessClienteImagen();
			
			if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		
			ClienteImagen clienteimagen=new ClienteImagen();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingClienteImagen(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesClienteImagen.getSelectedItem();
			
			
			
			
			clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
			//this.sTipoAccion;
			
			if(clienteimagensSeleccionados.size()==1) {
				for(ClienteImagen clienteimagenAux:clienteimagensSeleccionados) {
					clienteimagen=clienteimagenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessClienteImagen();
			
      		//this.finishProcessClienteImagen(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarClienteImagenReturnGeneral() throws Exception {
		if(this.clienteimagenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.clienteimagenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.clienteimagenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.clienteimagenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.clienteimagenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.clienteimagenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingClienteImagen(false);
		}
		
		if(this.clienteimagenReturnGeneral.getConRetornoLista() || this.clienteimagenReturnGeneral.getConRetornoObjeto()) {
			if(this.clienteimagenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.clienteimagenLogic.setClienteImagens(this.clienteimagenReturnGeneral.getClienteImagens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.clienteimagenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.clienteimagenLogic.setClienteImagen(this.clienteimagenReturnGeneral.getClienteImagen());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingClienteImagen(false);
		}
	}
	
	public void actualizarParametrosGeneralClienteImagen() throws Exception {
		
		
	}
	
	public ArrayList<ClienteImagen> getClienteImagensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioClienteImagen) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ClienteImagen clienteimagenAux:clienteimagenLogic.getClienteImagens()) {
					if(clienteimagenAux.getIsSelected()) {
						clienteimagensSeleccionados.add(clienteimagenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteImagen clienteimagenAux:this.clienteimagens) {
					if(clienteimagenAux.getIsSelected()) {
						clienteimagensSeleccionados.add(clienteimagenAux);				
					}
				}
			}
			
			if(clienteimagensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						clienteimagensSeleccionados.addAll(this.clienteimagenLogic.getClienteImagens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						clienteimagensSeleccionados.addAll(this.clienteimagens);				
					}
				}
			}
		} else {
			clienteimagensSeleccionados.add(this.clienteimagen);
		}
		
		return clienteimagensSeleccionados;
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
	
	public void generarReporteClienteImagensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalClienteImagensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoClienteImagensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClienteImagensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClienteImagensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cliente Imagen",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesClienteImagensSeleccionados() throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteClienteImagens("Todos",clienteimagensSeleccionados);
		
	}	
	
	public void generarReporteNormalClienteImagensSeleccionados() throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteClienteImagens("Todos",clienteimagensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionClienteImagensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteClienteImagens("Todos",clienteimagensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoClienteImagensSeleccionados() throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		
		
		
		this.abrirInicializarFrameReporteDinamicoClienteImagen();
		
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoClienteImagen();
		
		
		//this.generarReporteClienteImagens("Todos",clienteimagensSeleccionados ,clienteimagenImplementable,clienteimagenImplementableHome);
	}
	
	public void mostrarImportacionClienteImagens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionClienteImagen();
		
		this.abrirFrameImportacionClienteImagen();		
		
			
		//this.generarReporteClienteImagens("Todos",clienteimagensSeleccionados ,clienteimagenImplementable,clienteimagenImplementableHome);
	}
	
	public void importarClienteImagens() throws Exception {		
	
	}
	
	public void exportarClienteImagensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelClienteImagensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoClienteImagensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlClienteImagensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cliente Imagen",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoClienteImagensSeleccionados() throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clienteimagen."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarClienteImagen(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ClienteImagen clienteimagenAux:clienteimagensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarClienteImagen(clienteimagenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//clienteimagenAux.setsDetalleGeneralEntityReporte(clienteimagenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarClienteImagen(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ClienteImagenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteImagenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteImagenConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteImagenConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteImagenConstantesFunciones.LABEL_IMAGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteImagenConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarClienteImagen(ClienteImagen clienteimagen,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=clienteimagen.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=clienteimagen.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=clienteimagen.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clienteimagen.gettipoimagenpersona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clienteimagen.gettipoimagen_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clienteimagen.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clienteimagen.getimagen().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clienteimagen.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelClienteImagensSeleccionados() throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clienteimagen.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ClienteImagens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelClienteImagen(row);				
				iRow++;
			}				
			
			for(ClienteImagen clienteimagenAux:clienteimagensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelClienteImagen(clienteimagenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlClienteImagensSeleccionados() throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();		
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clienteimagen.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("clienteimagens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("clienteimagen");
			//elementRoot.appendChild(element);
		
			for(ClienteImagen clienteimagenAux:clienteimagensSeleccionados) {
				element = document.createElement("clienteimagen");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlClienteImagen(clienteimagenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cliente Imagen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelClienteImagen(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_IMAGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteImagenConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelClienteImagen(ClienteImagen clienteimagen,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(clienteimagen.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(clienteimagen.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clienteimagen.gettipoimagenpersona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clienteimagen.gettipoimagen_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clienteimagen.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(clienteimagen.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlClienteImagen(ClienteImagen clienteimagen,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ClienteImagenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(clienteimagen.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ClienteImagenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(clienteimagen.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcliente_descripcion = document.createElement(ClienteImagenConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(clienteimagen.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipoimagenpersona_descripcion = document.createElement(ClienteImagenConstantesFunciones.IDTIPOIMAGENPERSONA);
		elementtipoimagenpersona_descripcion.appendChild(document.createTextNode(clienteimagen.gettipoimagenpersona_descripcion()));
		element.appendChild(elementtipoimagenpersona_descripcion);

		Element elementtipoimagen_descripcion = document.createElement(ClienteImagenConstantesFunciones.IDTIPOIMAGEN);
		elementtipoimagen_descripcion.appendChild(document.createTextNode(clienteimagen.gettipoimagen_descripcion()));
		element.appendChild(elementtipoimagen_descripcion);

		Element elementnombre = document.createElement(ClienteImagenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(clienteimagen.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementimagen = document.createElement(ClienteImagenConstantesFunciones.IMAGEN);
		elementimagen.appendChild(document.createTextNode(clienteimagen.getimagen().toString().trim()));
		element.appendChild(elementimagen);

		Element elementdescripcion = document.createElement(ClienteImagenConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(clienteimagen.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoClienteImagensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ClienteImagen> clienteimagensSeleccionados=new ArrayList<ClienteImagen>();
		
		clienteimagensSeleccionados=this.getClienteImagensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoClienteImagen(clienteimagensSeleccionados);
		
		this.generarReporteClienteImagens("Todos",clienteimagensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoClienteImagen(ArrayList<ClienteImagen> clienteimagensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ClienteImagen clienteimagenAux:clienteimagensSeleccionados) {
				clienteimagenAux.setsDetalleGeneralEntityReporte(clienteimagenAux.toString());
			
				if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					clienteimagenAux.setsDescripcionGeneralEntityReporte1(clienteimagenAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGENPERSONA)) {
					existe=true;
					clienteimagenAux.setsDescripcionGeneralEntityReporte1(clienteimagenAux.gettipoimagenpersona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_IDTIPOIMAGEN)) {
					existe=true;
					clienteimagenAux.setsDescripcionGeneralEntityReporte1(clienteimagenAux.gettipoimagen_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					clienteimagenAux.setsDescripcionGeneralEntityReporte1(clienteimagenAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_IMAGEN)) {
					existe=true;
					clienteimagenAux.setsDescripcionGeneralEntityReporte1(clienteimagenAux.getimagen().toString());
				}
				 else if(sTipoSeleccionar.equals(ClienteImagenConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					clienteimagenAux.setsDescripcionGeneralEntityReporte1(clienteimagenAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesClienteImagen(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoClienteImagen=true;
				this.isVisibilidadCeldaNuevoRelacionesClienteImagen=true;
				this.isVisibilidadCeldaGuardarCambiosClienteImagen=true;
			}
			
			this.isVisibilidadCeldaModificarClienteImagen=false;
			this.isVisibilidadCeldaActualizarClienteImagen=false;
			this.isVisibilidadCeldaEliminarClienteImagen=false;
			this.isVisibilidadCeldaCancelarClienteImagen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteImagen=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoClienteImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=false;
			this.isVisibilidadCeldaModificarClienteImagen=false;
			this.isVisibilidadCeldaActualizarClienteImagen=true;
			this.isVisibilidadCeldaEliminarClienteImagen=false;
			this.isVisibilidadCeldaCancelarClienteImagen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteImagen=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoClienteImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=false;
			this.isVisibilidadCeldaModificarClienteImagen=false;
			this.isVisibilidadCeldaActualizarClienteImagen=true;
			this.isVisibilidadCeldaEliminarClienteImagen=true;
			this.isVisibilidadCeldaCancelarClienteImagen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteImagen=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoClienteImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=false;
			this.isVisibilidadCeldaModificarClienteImagen=false;
			this.isVisibilidadCeldaActualizarClienteImagen=true;
			this.isVisibilidadCeldaEliminarClienteImagen=false;
			this.isVisibilidadCeldaCancelarClienteImagen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoClienteImagen=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=true;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=true;
			this.isVisibilidadCeldaModificarClienteImagen=false;
			this.isVisibilidadCeldaActualizarClienteImagen=false;
			this.isVisibilidadCeldaEliminarClienteImagen=false;
			this.isVisibilidadCeldaCancelarClienteImagen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteImagen=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoClienteImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=false;
			this.isVisibilidadCeldaActualizarClienteImagen=false;
			this.isVisibilidadCeldaEliminarClienteImagen=false;
			this.isVisibilidadCeldaCancelarClienteImagen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoClienteImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=false;
			this.isVisibilidadCeldaModificarClienteImagen=true;
			this.isVisibilidadCeldaActualizarClienteImagen=false;
			this.isVisibilidadCeldaEliminarClienteImagen=false;
			this.isVisibilidadCeldaCancelarClienteImagen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteImagen=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ClienteImagenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoClienteImagen=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=true;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=true;
		} else {
			this.actualizarEstadoPanelsClienteImagen(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarClienteImagen=false;
			//this.isVisibilidadCeldaVerFormClienteImagen=false;
			this.isVisibilidadCeldaDuplicarClienteImagen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!clienteimagenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
		} else {
			this.isVisibilidadCeldaNuevoClienteImagen=false;
			this.isVisibilidadCeldaGuardarCambiosClienteImagen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(clienteimagenSessionBean.getEsGuardarRelacionado()) {
			if(!clienteimagenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;												
			}
			
			this.jButtonCerrarClienteImagen.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesClienteImagen=false;
		}
		
		if(!this.permiteMantenimiento(this.clienteimagen)) {
			this.isVisibilidadCeldaActualizarClienteImagen=false;
			this.isVisibilidadCeldaEliminarClienteImagen=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesClienteImagen() {
	}
	
	public void actualizarEstadoPanelsClienteImagen(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionClienteImagen!=null) {
				this.jScrollPanelDatosEdicionClienteImagen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteImagen!=null) {
				this.jTabbedPaneBusquedasClienteImagen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteImagen!=null) {
				this.jScrollPanelDatosClienteImagen.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteImagen!=null) {
				this.jPanelPaginacionClienteImagen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionClienteImagen!=null) {
				this.jScrollPanelDatosEdicionClienteImagen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteImagen!=null) {
				this.jTabbedPaneBusquedasClienteImagen.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosClienteImagen!=null) {
				this.jScrollPanelDatosClienteImagen.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteImagen!=null) {
				this.jPanelPaginacionClienteImagen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionClienteImagen!=null) {
				this.jScrollPanelDatosEdicionClienteImagen.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteImagen!=null) {
				this.jTabbedPaneBusquedasClienteImagen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClienteImagen!=null) {
				this.jScrollPanelDatosClienteImagen.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteImagen!=null) {
				this.jPanelPaginacionClienteImagen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionClienteImagen!=null) {
				this.jScrollPanelDatosEdicionClienteImagen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteImagen!=null) {
				this.jTabbedPaneBusquedasClienteImagen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClienteImagen!=null) {
				this.jScrollPanelDatosClienteImagen.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteImagen!=null) {
				this.jPanelPaginacionClienteImagen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionClienteImagen!=null) {
				this.jScrollPanelDatosEdicionClienteImagen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteImagen!=null) {
				this.jTabbedPaneBusquedasClienteImagen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteImagen!=null) {
				this.jScrollPanelDatosClienteImagen.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteImagen!=null) {
				this.jPanelPaginacionClienteImagen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionClienteImagen!=null) {
				this.jScrollPanelDatosEdicionClienteImagen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteImagen!=null) {
				this.jTabbedPaneBusquedasClienteImagen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteImagen!=null) {
				this.jScrollPanelDatosClienteImagen.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteImagen!=null) {
				this.jPanelPaginacionClienteImagen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionClienteImagen!=null) {
				this.jScrollPanelDatosEdicionClienteImagen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteImagen!=null) {
				this.jTabbedPaneBusquedasClienteImagen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteImagen!=null) {
				this.jScrollPanelDatosClienteImagen.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteImagen!=null) {
				this.jPanelPaginacionClienteImagen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasClienteImagen!=null) {
					this.jTabbedPaneBusquedasClienteImagen.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteImagen!=null) {
				this.jTabbedPaneBusquedasClienteImagen.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesClienteImagen!=null) {
				this.jPanelParametrosReportesClienteImagen.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdClienteClienteImagen);}

			this.isVisibilidadFK_IdTipoImagen=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoImagen) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdTipoImagenClienteImagen);}

			this.isVisibilidadFK_IdTipoImagenPersona=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoImagenPersona) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdTipoImagenPersonaClienteImagen);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoImagenPersona(Boolean isParaTipoImagenPersona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoImagenPersonaNegation=!isParaTipoImagenPersona;

			this.isVisibilidadFK_IdCliente=isParaTipoImagenPersonaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdClienteClienteImagen);}

			this.isVisibilidadFK_IdTipoImagen=isParaTipoImagenPersonaNegation;
			if(!this.isVisibilidadFK_IdTipoImagen) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdTipoImagenClienteImagen);}

			this.isVisibilidadFK_IdTipoImagenPersona=isParaTipoImagenPersona;
			if(!this.isVisibilidadFK_IdTipoImagenPersona) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdTipoImagenPersonaClienteImagen);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoImagen(Boolean isParaTipoImagen){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoImagenNegation=!isParaTipoImagen;

			this.isVisibilidadFK_IdCliente=isParaTipoImagenNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdClienteClienteImagen);}

			this.isVisibilidadFK_IdTipoImagen=isParaTipoImagen;
			if(!this.isVisibilidadFK_IdTipoImagen) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdTipoImagenClienteImagen);}

			this.isVisibilidadFK_IdTipoImagenPersona=isParaTipoImagenNegation;
			if(!this.isVisibilidadFK_IdTipoImagenPersona) {this.jTabbedPaneBusquedasClienteImagen.remove(jPanelFK_IdTipoImagenPersonaClienteImagen);}
		}
		
	}
	
	
	
	

	public String registrarSesionClienteImagenParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(clienteimagenSessionBean==null) {
				clienteimagenSessionBean=new ClienteImagenSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(clienteimagenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.clienteimagenFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ClienteImagenConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionClienteImagen(true);
			//clienteSessionBean.setlidClienteImagenActual(this.idClienteImagenActual);

			clienteimagenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyClienteImagen(true);
			clienteimagenSessionBean.setlIdClienteImagenActualForeignKey(this.idClienteImagenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ClienteImagenSessionBean clienteimagenSessionBean=new ClienteImagenSessionBean();
		
		if(this.clienteimagenSessionBean==null) {
			this.clienteimagenSessionBean=new ClienteImagenSessionBean();
		}
		
		this.clienteimagenSessionBean.setsUltimaBusquedaClienteImagen(this.getsAccionBusqueda());
		this.clienteimagenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.clienteimagenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			clienteimagenSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoImagen")) {
			clienteimagenSessionBean.setid_tipo_imagen(this.getid_tipo_imagenFK_IdTipoImagen());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoImagenPersona")) {
			clienteimagenSessionBean.setid_tipo_imagen_persona(this.getid_tipo_imagen_personaFK_IdTipoImagenPersona());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ClienteImagenSessionBean clienteimagenSessionBean=new ClienteImagenSessionBean();
		
		if(this.clienteimagenSessionBean==null) {
			this.clienteimagenSessionBean=new ClienteImagenSessionBean();
		}
		
		if(this.clienteimagenSessionBean.getsUltimaBusquedaClienteImagen()!=null&&!this.clienteimagenSessionBean.getsUltimaBusquedaClienteImagen().equals("")) {
			this.setsAccionBusqueda(clienteimagenSessionBean.getsUltimaBusquedaClienteImagen());
			this.setiNumeroPaginacion(clienteimagenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(clienteimagenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(clienteimagenSessionBean.getid_cliente());
				clienteimagenSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoImagen")) {
				this.setid_tipo_imagenFK_IdTipoImagen(clienteimagenSessionBean.getid_tipo_imagen());
				clienteimagenSessionBean.setid_tipo_imagen(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoImagenPersona")) {
				this.setid_tipo_imagen_personaFK_IdTipoImagenPersona(clienteimagenSessionBean.getid_tipo_imagen_persona());
				clienteimagenSessionBean.setid_tipo_imagen_persona(-1L);
			}
		}
		
		this.clienteimagenSessionBean.setsUltimaBusquedaClienteImagen("");
		this.clienteimagenSessionBean.setiNumeroPaginacion(ClienteImagenConstantesFunciones.INUMEROPAGINACION);
		this.clienteimagenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaClienteImagen(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioClienteImagen() {
		this.updateBorderResaltarBusquedasFormularioClienteImagen();
		this.updateVisibilidadBusquedasFormularioClienteImagen();
		this.updateHabilitarBusquedasFormularioClienteImagen();
	}
	
	public void updateBorderResaltarBusquedasFormularioClienteImagen() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasClienteImagen.getComponents().length>0) {
	

		if(this.clienteimagenConstantesFunciones.resaltarFK_IdClienteClienteImagen!=null) {
			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdClienteClienteImagen);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
				jPanel.setBorder(this.clienteimagenConstantesFunciones.resaltarFK_IdClienteClienteImagen);
			}
		}

		if(this.clienteimagenConstantesFunciones.resaltarFK_IdTipoImagenClienteImagen!=null) {
			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdTipoImagenClienteImagen);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
				jPanel.setBorder(this.clienteimagenConstantesFunciones.resaltarFK_IdTipoImagenClienteImagen);
			}
		}

		if(this.clienteimagenConstantesFunciones.resaltarFK_IdTipoImagenPersonaClienteImagen!=null) {
			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdTipoImagenPersonaClienteImagen);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
				jPanel.setBorder(this.clienteimagenConstantesFunciones.resaltarFK_IdTipoImagenPersonaClienteImagen);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioClienteImagen() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasClienteImagen.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdClienteClienteImagen);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.clienteimagenConstantesFunciones.mostrarFK_IdClienteClienteImagen);
			if(!this.clienteimagenConstantesFunciones.mostrarFK_IdClienteClienteImagen && index>-1) {
				this.jTabbedPaneBusquedasClienteImagen.remove(index);
			}

			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdTipoImagenClienteImagen);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.clienteimagenConstantesFunciones.mostrarFK_IdTipoImagenClienteImagen);
			if(!this.clienteimagenConstantesFunciones.mostrarFK_IdTipoImagenClienteImagen && index>-1) {
				this.jTabbedPaneBusquedasClienteImagen.remove(index);
			}

			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdTipoImagenPersonaClienteImagen);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.clienteimagenConstantesFunciones.mostrarFK_IdTipoImagenPersonaClienteImagen);
			if(!this.clienteimagenConstantesFunciones.mostrarFK_IdTipoImagenPersonaClienteImagen && index>-1) {
				this.jTabbedPaneBusquedasClienteImagen.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioClienteImagen() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasClienteImagen.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdClienteClienteImagen);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.clienteimagenConstantesFunciones.activarFK_IdClienteClienteImagen);
				this.jTabbedPaneBusquedasClienteImagen.setEnabledAt(index,this.clienteimagenConstantesFunciones.activarFK_IdClienteClienteImagen);
			}

			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdTipoImagenClienteImagen);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.clienteimagenConstantesFunciones.activarFK_IdTipoImagenClienteImagen);
				this.jTabbedPaneBusquedasClienteImagen.setEnabledAt(index,this.clienteimagenConstantesFunciones.activarFK_IdTipoImagenClienteImagen);
			}

			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdTipoImagenPersonaClienteImagen);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.clienteimagenConstantesFunciones.activarFK_IdTipoImagenPersonaClienteImagen);
				this.jTabbedPaneBusquedasClienteImagen.setEnabledAt(index,this.clienteimagenConstantesFunciones.activarFK_IdTipoImagenPersonaClienteImagen);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaClienteImagen(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdClienteClienteImagen);

			this.jTabbedPaneBusquedasClienteImagen.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);

			this.clienteimagenConstantesFunciones.setResaltarFK_IdClienteClienteImagen(resaltar);

			jPanel.setBorder(this.clienteimagenConstantesFunciones.resaltarFK_IdClienteClienteImagen);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoImagen")) {
			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdTipoImagenClienteImagen);

			this.jTabbedPaneBusquedasClienteImagen.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);

			this.clienteimagenConstantesFunciones.setResaltarFK_IdTipoImagenClienteImagen(resaltar);

			jPanel.setBorder(this.clienteimagenConstantesFunciones.resaltarFK_IdTipoImagenClienteImagen);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoImagenPersona")) {
			index= this.jTabbedPaneBusquedasClienteImagen.indexOfComponent(this.jPanelFK_IdTipoImagenPersonaClienteImagen);

			this.jTabbedPaneBusquedasClienteImagen.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteImagen.getComponent(index);

			this.clienteimagenConstantesFunciones.setResaltarFK_IdTipoImagenPersonaClienteImagen(resaltar);

			jPanel.setBorder(this.clienteimagenConstantesFunciones.resaltarFK_IdTipoImagenPersonaClienteImagen);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarClienteImagen.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioClienteImagen() throws Exception {

		if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioClienteImagen();
		this.updateVisibilidadResaltarControlesFormularioClienteImagen();
		this.updateHabilitarResaltarControlesFormularioClienteImagen();
		
	}
	
	public void updateBorderResaltarControlesFormularioClienteImagen() throws Exception {
		if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.clienteimagenConstantesFunciones.resaltaridClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen!=null) {this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.setBorder(this.clienteimagenConstantesFunciones.resaltaridClienteImagen);}
		if(this.clienteimagenConstantesFunciones.resaltarid_clienteClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen!=null) {this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setBorder(this.clienteimagenConstantesFunciones.resaltarid_clienteClienteImagen);}
		if(this.clienteimagenConstantesFunciones.resaltarid_tipo_imagen_personaClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen!=null) {this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setBorder(this.clienteimagenConstantesFunciones.resaltarid_tipo_imagen_personaClienteImagen);}
		if(this.clienteimagenConstantesFunciones.resaltarid_tipo_imagenClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen!=null) {this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setBorder(this.clienteimagenConstantesFunciones.resaltarid_tipo_imagenClienteImagen);}
		if(this.clienteimagenConstantesFunciones.resaltarnombreClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen!=null) {this.jInternalFrameDetalleFormClienteImagen.jTextFieldnombreClienteImagen.setBorder(this.clienteimagenConstantesFunciones.resaltarnombreClienteImagen);}
		if(this.clienteimagenConstantesFunciones.resaltarimagenClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen!=null) {this.jInternalFrameDetalleFormClienteImagen.jFileChooserimagenClienteImagen.setBorder(this.clienteimagenConstantesFunciones.resaltarimagenClienteImagen);}
		if(this.clienteimagenConstantesFunciones.resaltardescripcionClienteImagen!=null && this.jInternalFrameDetalleFormClienteImagen!=null) {this.jInternalFrameDetalleFormClienteImagen.jTextAreadescripcionClienteImagen.setBorder(this.clienteimagenConstantesFunciones.resaltardescripcionClienteImagen);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioClienteImagen() throws Exception {		
		if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
	
		//this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostraridClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jPanelidClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostraridClienteImagen);
		//this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarid_clienteClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jPanelid_clienteClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarid_clienteClienteImagen);
			this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarid_clienteClienteImagen);
		//this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarid_tipo_imagen_personaClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jPanelid_tipo_imagen_personaClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarid_tipo_imagen_personaClienteImagen);
		//this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarid_tipo_imagenClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jPanelid_tipo_imagenClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarid_tipo_imagenClienteImagen);
		//this.jInternalFrameDetalleFormClienteImagen.jTextFieldnombreClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarnombreClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jPanelnombreClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarnombreClienteImagen);
		//this.jInternalFrameDetalleFormClienteImagen.jFileChooserimagenClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarimagenClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jPanelimagenClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrarimagenClienteImagen);
		//this.jInternalFrameDetalleFormClienteImagen.jTextAreadescripcionClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrardescripcionClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jPaneldescripcionClienteImagen.setVisible(this.clienteimagenConstantesFunciones.mostrardescripcionClienteImagen);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioClienteImagen() throws Exception {
		if(this.jInternalFrameDetalleFormClienteImagen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClienteImagen!=null) {
	
		this.jInternalFrameDetalleFormClienteImagen.jLabelidClienteImagen.setEnabled(this.clienteimagenConstantesFunciones.activaridClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_clienteClienteImagen.setEnabled(this.clienteimagenConstantesFunciones.activarid_clienteClienteImagen);
			this.jInternalFrameDetalleFormClienteImagen.jButtonid_clienteClienteImagen.setEnabled(this.clienteimagenConstantesFunciones.activarid_clienteClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagen_personaClienteImagen.setEnabled(this.clienteimagenConstantesFunciones.activarid_tipo_imagen_personaClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jComboBoxid_tipo_imagenClienteImagen.setEnabled(this.clienteimagenConstantesFunciones.activarid_tipo_imagenClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jTextFieldnombreClienteImagen.setEnabled(this.clienteimagenConstantesFunciones.activarnombreClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jFileChooserimagenClienteImagen.setEnabled(this.clienteimagenConstantesFunciones.activarimagenClienteImagen);
		this.jInternalFrameDetalleFormClienteImagen.jTextAreadescripcionClienteImagen.setEnabled(this.clienteimagenConstantesFunciones.activardescripcionClienteImagen);
		}
	}
	
		
}