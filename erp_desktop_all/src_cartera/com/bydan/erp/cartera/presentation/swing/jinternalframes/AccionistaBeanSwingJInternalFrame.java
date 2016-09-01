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

import com.bydan.erp.cartera.util.AccionistaConstantesFunciones;
import com.bydan.erp.cartera.util.AccionistaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.AccionistaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.AccionistaBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class AccionistaBeanSwingJInternalFrame extends AccionistaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AccionistaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Accionista> accionistaValidator = new ClassValidator<Accionista>(Accionista.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Accionista accionista;	
	public Accionista accionistaAux;
	public Accionista accionistaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Accionista accionistaTotales;
	public Long idAccionistaActual;
	public Long iIdNuevoAccionista=0L;
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

	public String sFinalQueryComboTipoInversion="";

	public List<TipoInversion> tipoinversionsForeignKey;

	public List<TipoInversion> gettipoinversionsForeignKey() {
		return tipoinversionsForeignKey;
	}

	public void settipoinversionsForeignKey(List<TipoInversion> tipoinversionsForeignKey) {
		this.tipoinversionsForeignKey = tipoinversionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoInversion tipoinversionForeignKey;

	public TipoInversion gettipoinversionForeignKey() {
		return tipoinversionForeignKey;
	}

	public void settipoinversionForeignKey(TipoInversion tipoinversionForeignKey) {
		this.tipoinversionForeignKey = tipoinversionForeignKey;
	}

	public String sFinalQueryComboTipoIdentificacion="";

	public List<TipoIdentificacion> tipoidentificacionsForeignKey;

	public List<TipoIdentificacion> gettipoidentificacionsForeignKey() {
		return tipoidentificacionsForeignKey;
	}

	public void settipoidentificacionsForeignKey(List<TipoIdentificacion> tipoidentificacionsForeignKey) {
		this.tipoidentificacionsForeignKey = tipoidentificacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIdentificacion tipoidentificacionForeignKey;

	public TipoIdentificacion gettipoidentificacionForeignKey() {
		return tipoidentificacionForeignKey;
	}

	public void settipoidentificacionForeignKey(TipoIdentificacion tipoidentificacionForeignKey) {
		this.tipoidentificacionForeignKey = tipoidentificacionForeignKey;
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
	
	public Boolean isPermisoTodoAccionista;
	public Boolean isPermisoNuevoAccionista;
	public Boolean isPermisoActualizarAccionista;
	public Boolean isPermisoActualizarOriginalAccionista;
	public Boolean isPermisoEliminarAccionista;
	public Boolean isPermisoGuardarCambiosAccionista;
	public Boolean isPermisoConsultaAccionista;
	public Boolean isPermisoBusquedaAccionista;
	public Boolean isPermisoReporteAccionista;
	public Boolean isPermisoPaginacionMedioAccionista;
	public Boolean isPermisoPaginacionAltoAccionista;
	public Boolean isPermisoPaginacionTodoAccionista;
	public Boolean isPermisoCopiarAccionista;
	public Boolean isPermisoVerFormAccionista;
	public Boolean isPermisoDuplicarAccionista;
	public Boolean isPermisoOrdenAccionista;
	
	
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
	
	public AccionistaParameterReturnGeneral accionistaReturnGeneral;
	public AccionistaParameterReturnGeneral accionistaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAccionista=false;
	public Boolean esParaAccionDesdeFormularioAccionista=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AccionistaSessionBeanAdditional accionistaSessionBeanAdditional=null;
	
	public AccionistaSessionBeanAdditional getAccionistaSessionBeanAdditional() {
		return this.accionistaSessionBeanAdditional;
	}
	
	public void setAccionistaSessionBeanAdditional(AccionistaSessionBeanAdditional accionistaSessionBeanAdditional) {
		try {
			this.accionistaSessionBeanAdditional=accionistaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AccionistaBeanSwingJInternalFrameAdditional accionistaBeanSwingJInternalFrameAdditional=null;
	//public class AccionistaBeanSwingJInternalFrame
	
	public AccionistaBeanSwingJInternalFrameAdditional getAccionistaBeanSwingJInternalFrameAdditional() {
		return this.accionistaBeanSwingJInternalFrameAdditional;
	}
	
	public void setAccionistaBeanSwingJInternalFrameAdditional(AccionistaBeanSwingJInternalFrameAdditional accionistaBeanSwingJInternalFrameAdditional) {
		try {
			this.accionistaBeanSwingJInternalFrameAdditional=accionistaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AccionistaLogic accionistaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Accionista accionistaBean;
	public AccionistaConstantesFunciones accionistaConstantesFunciones;
	//public AccionistaParameterReturnGeneral accionistaReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public TipoInversionLogic tipoinversionLogic;
	public TipoIdentificacionLogic tipoidentificacionLogic;
	
	//PARAMETROS
	
	
	//public List<Accionista> accionistas;	
	//public List<Accionista> accionistasEliminados;
	//public List<Accionista> accionistasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAccionista=false;
	public Boolean isVisibilidadCeldaDuplicarAccionista=true;
	public Boolean isVisibilidadCeldaCopiarAccionista=true;
	public Boolean isVisibilidadCeldaVerFormAccionista=true;
	public Boolean isVisibilidadCeldaOrdenAccionista=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAccionista=false;
	public Boolean isVisibilidadCeldaModificarAccionista=false;
	public Boolean isVisibilidadCeldaActualizarAccionista=false;
	public Boolean isVisibilidadCeldaEliminarAccionista=false;
	public Boolean isVisibilidadCeldaCancelarAccionista=false;
	public Boolean isVisibilidadCeldaGuardarAccionista=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAccionista=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdClientePorNombreCorto=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdValorClienteInversion=false;
	public Boolean isVisibilidadFK_IdValorIdentificacion=false;
	
	public Long getiIdNuevoAccionista() {
		return this.iIdNuevoAccionista;
	}

	public void setiIdNuevoAccionista(Long iIdNuevoAccionista) {
		this.iIdNuevoAccionista = iIdNuevoAccionista;
	}
	
	public Long getidAccionistaActual() {
		return this.idAccionistaActual;
	}

	public void setidAccionistaActual(Long idAccionistaActual) {
		this.idAccionistaActual = idAccionistaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Accionista getaccionista() {
		return this.accionista;
	}

	public void setaccionista(Accionista accionista) {
		this.accionista = accionista;
	}
	
	public Accionista getaccionistaAux() {
		return this.accionistaAux;
	}

	public void setaccionistaAux(Accionista accionistaAux) {
		this.accionistaAux = accionistaAux;
	}				
	
	public Accionista getaccionistaAnterior() {
		return this.accionistaAnterior;
	}

	public void setaccionistaAnterior(Accionista accionistaAnterior) {
		this.accionistaAnterior = accionistaAnterior;
	}	
	
	public Accionista getaccionistaTotales() {
		return this.accionistaTotales;
	}

	public void setaccionistaTotales(Accionista accionistaTotales) {
		this.accionistaTotales = accionistaTotales;
	}	
	
	public Accionista getaccionistaBean() {
		return this.accionistaBean;
	}

	public void setaccionistaBean(Accionista accionistaBean) {
		this.accionistaBean = accionistaBean;
	}	
	
	public AccionistaParameterReturnGeneral getaccionistaReturnGeneral() {
		return this.accionistaReturnGeneral;
	}

	public void setaccionistaReturnGeneral(AccionistaParameterReturnGeneral accionistaReturnGeneral) {
		this.accionistaReturnGeneral = accionistaReturnGeneral;
	}	
	
	
	public Long idclienteBusquedaPorIdClientePorNombreCorto=-1L;

	public Long getidclienteBusquedaPorIdClientePorNombreCorto() {
		return this.idclienteBusquedaPorIdClientePorNombreCorto;
	}

	public void setidclienteBusquedaPorIdClientePorNombreCorto(Long idclienteBusquedaPorIdClientePorNombreCorto) {
		this.idclienteBusquedaPorIdClientePorNombreCorto = idclienteBusquedaPorIdClientePorNombreCorto;
	}

;
	public String nombrecortoBusquedaPorIdClientePorNombreCorto="";

	public String getnombrecortoBusquedaPorIdClientePorNombreCorto() {
		return this.nombrecortoBusquedaPorIdClientePorNombreCorto;
	}

	public void setnombrecortoBusquedaPorIdClientePorNombreCorto(String nombrecortoBusquedaPorIdClientePorNombreCorto) {
		this.nombrecortoBusquedaPorIdClientePorNombreCorto = nombrecortoBusquedaPorIdClientePorNombreCorto;
	}

	public Long idclienteFK_IdCliente=-1L;

	public Long getidclienteFK_IdCliente() {
		return this.idclienteFK_IdCliente;
	}

	public void setidclienteFK_IdCliente(Long idclienteFK_IdCliente) {
		this.idclienteFK_IdCliente = idclienteFK_IdCliente;
	}

	public Long idvalorclienteinversionFK_IdValorClienteInversion=-1L;

	public Long getidvalorclienteinversionFK_IdValorClienteInversion() {
		return this.idvalorclienteinversionFK_IdValorClienteInversion;
	}

	public void setidvalorclienteinversionFK_IdValorClienteInversion(Long idvalorclienteinversionFK_IdValorClienteInversion) {
		this.idvalorclienteinversionFK_IdValorClienteInversion = idvalorclienteinversionFK_IdValorClienteInversion;
	}

	public Long idvaloridentificacionFK_IdValorIdentificacion=-1L;

	public Long getidvaloridentificacionFK_IdValorIdentificacion() {
		return this.idvaloridentificacionFK_IdValorIdentificacion;
	}

	public void setidvaloridentificacionFK_IdValorIdentificacion(Long idvaloridentificacionFK_IdValorIdentificacion) {
		this.idvaloridentificacionFK_IdValorIdentificacion = idvaloridentificacionFK_IdValorIdentificacion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AccionistaLogic getAccionistaLogic()	{		
		return accionistaLogic;
	}

	public void setAccionistaLogic(AccionistaLogic accionistaLogic) {
		this.accionistaLogic = accionistaLogic;
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
	
	public Boolean getIsEsNuevoAccionista() {
		return isEsNuevoAccionista;
	}

	public void setIsEsNuevoAccionista(Boolean isEsNuevoAccionista) {
		this.isEsNuevoAccionista = isEsNuevoAccionista;
	}

	public Boolean getEsParaAccionDesdeFormularioAccionista() {
		return esParaAccionDesdeFormularioAccionista;
	}
	
	public void setEsParaAccionDesdeFormularioAccionista(Boolean esParaAccionDesdeFormularioAccionista) {
		this.esParaAccionDesdeFormularioAccionista = esParaAccionDesdeFormularioAccionista;
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

			if(this.accionistaSessionBean==null) {
				this.accionistaSessionBean=new AccionistaSessionBean();
			}

			if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(accionistaSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoInversionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoinversionsForeignKey=new ArrayList<TipoInversion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoInversionLogic tipoinversionLogic=new TipoInversionLogic();

			tipoinversionLogic.getTipoInversionDataAccess().setIsForForeingKeyData(true);

			if(this.accionistaSessionBean==null) {
				this.accionistaSessionBean=new AccionistaSessionBean();
			}

			if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoInversion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinversionLogic.getTipoInversionDataAccess().setIsForForeingKeyData(true);

					tipoinversionLogic.getTodosTipoInversionsWithConnection(sFinalQuery,new Pagination());

					this.tipoinversionsForeignKey=tipoinversionLogic.getTipoInversions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoInversion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinversionLogic.getEntityWithConnection(accionistaSessionBean.getlidTipoInversionActual());
					this.tipoinversionsForeignKey.add(tipoinversionLogic.getTipoInversion());
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

	public void cargarCombosTipoIdentificacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIdentificacionLogic tipoidentificacionLogic=new TipoIdentificacionLogic();

			tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingKeyData(true);

			if(this.accionistaSessionBean==null) {
				this.accionistaSessionBean=new AccionistaSessionBean();
			}

			if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingKeyData(true);

					tipoidentificacionLogic.getTodosTipoIdentificacionsWithConnection(sFinalQuery,new Pagination());

					this.tipoidentificacionsForeignKey=tipoidentificacionLogic.getTipoIdentificacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIdentificacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.getEntityWithConnection(accionistaSessionBean.getlidTipoIdentificacionActual());
					this.tipoidentificacionsForeignKey.add(tipoidentificacionLogic.getTipoIdentificacion());
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

					if(this.accionista!=null) {
						this.accionista.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormAccionista!=null) {
						this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteAccionista.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormAccionista!=null) {
						if(this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.getItemCount()>0) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdClientePorNombreCorto") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista!=null) {
						jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista!=null) {
							//jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.getItemCount()>0) {
								jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteAccionista!=null) {
						jComboBoxidclienteFK_IdClienteAccionista.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteAccionista!=null) {
							//jComboBoxidclienteFK_IdClienteAccionista.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteAccionista.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteAccionista.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteAccionistaGenerico)throws Exception
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
				jComboBoxidclienteAccionistaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteAccionistaGenerico!=null && jComboBoxidclienteAccionistaGenerico.getItemCount()>0) {
					jComboBoxidclienteAccionistaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoInversionForeignKey(Long idTipoInversionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoInversion  tipoinversionTemp=null;

			for(TipoInversion tipoinversionAux:tipoinversionsForeignKey) {
				if(tipoinversionAux.getId()!=null && tipoinversionAux.getId().equals(idTipoInversionSeleccionado)) {
					tipoinversionTemp=tipoinversionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoinversionTemp!=null) {

					if(this.accionista!=null) {
						this.accionista.setTipoInversion(tipoinversionTemp);
					}

					if(this.jInternalFrameDetalleFormAccionista!=null) {
						this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setSelectedItem(tipoinversionTemp);
					}
				} else {
					//jComboBoxidvalorclienteinversionAccionista.setSelectedItem(tipoinversionTemp);
					if(this.jInternalFrameDetalleFormAccionista!=null) {
						if(this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.getItemCount()>0) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteInversion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoinversionTemp!=null && jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista!=null) {
						jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.setSelectedItem(tipoinversionTemp);
					} else {
						if(jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista!=null) {
							//jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.setSelectedItem(tipoinversionTemp);
							if(jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.getItemCount()>0) {
								jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.setSelectedIndex(0);
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

	public String getActualTipoInversionForeignKeyDescripcion(Long idTipoInversionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoInversion  tipoinversionTemp=null;

			for(TipoInversion tipoinversionAux:tipoinversionsForeignKey) {
				if(tipoinversionAux.getId()!=null && tipoinversionAux.getId().equals(idTipoInversionSeleccionado)) {
					tipoinversionTemp=tipoinversionAux;
					break;
				}
			}


			sDescripcion=TipoInversionConstantesFunciones.getTipoInversionDescripcion(tipoinversionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoInversionForeignKeyGenerico(Long idTipoInversionSeleccionado,JComboBox jComboBoxidvalorclienteinversionAccionistaGenerico)throws Exception
	{
		try
		{
			TipoInversion  tipoinversionTemp=null;

			for(TipoInversion tipoinversionAux:tipoinversionsForeignKey) {
				if(tipoinversionAux.getId()!=null && tipoinversionAux.getId().equals(idTipoInversionSeleccionado)) {
					tipoinversionTemp=tipoinversionAux;
					break;
				}
			}

			if(tipoinversionTemp!=null) {
				jComboBoxidvalorclienteinversionAccionistaGenerico.setSelectedItem(tipoinversionTemp);
			} else {
				if(jComboBoxidvalorclienteinversionAccionistaGenerico!=null && jComboBoxidvalorclienteinversionAccionistaGenerico.getItemCount()>0) {
					jComboBoxidvalorclienteinversionAccionistaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoIdentificacionForeignKey(Long idTipoIdentificacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoidentificacionTemp!=null) {

					if(this.accionista!=null) {
						this.accionista.setTipoIdentificacion(tipoidentificacionTemp);
					}

					if(this.jInternalFrameDetalleFormAccionista!=null) {
						this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setSelectedItem(tipoidentificacionTemp);
					}
				} else {
					//jComboBoxidvaloridentificacionAccionista.setSelectedItem(tipoidentificacionTemp);
					if(this.jInternalFrameDetalleFormAccionista!=null) {
						if(this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.getItemCount()>0) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorIdentificacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoidentificacionTemp!=null && jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista!=null) {
						jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.setSelectedItem(tipoidentificacionTemp);
					} else {
						if(jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista!=null) {
							//jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.setSelectedItem(tipoidentificacionTemp);
							if(jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.getItemCount()>0) {
								jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.setSelectedIndex(0);
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

	public String getActualTipoIdentificacionForeignKeyDescripcion(Long idTipoIdentificacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}


			sDescripcion=TipoIdentificacionConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIdentificacionForeignKeyGenerico(Long idTipoIdentificacionSeleccionado,JComboBox jComboBoxidvaloridentificacionAccionistaGenerico)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			if(tipoidentificacionTemp!=null) {
				jComboBoxidvaloridentificacionAccionistaGenerico.setSelectedItem(tipoidentificacionTemp);
			} else {
				if(jComboBoxidvaloridentificacionAccionistaGenerico!=null && jComboBoxidvaloridentificacionAccionistaGenerico.getItemCount()>0) {
					jComboBoxidvaloridentificacionAccionistaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Accionista accionista,JComboBox jComboBoxidclienteAccionistaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteAccionistaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteAccionistaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				accionista.setidcliente(clienteAux.getId());
				accionista.setcliente_descripcion(AccionistaConstantesFunciones.getClienteDescripcion(clienteAux));
				accionista.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoInversionForeignKey(Accionista accionista,JComboBox jComboBoxidvalorclienteinversionAccionistaGenerico)throws Exception
	{
		try
		{
			TipoInversion  tipoinversionAux=new TipoInversion();

			if(jComboBoxidvalorclienteinversionAccionistaGenerico==null) {
				tipoinversionAux=(TipoInversion)this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.getSelectedItem();
			} else {
				tipoinversionAux=(TipoInversion)jComboBoxidvalorclienteinversionAccionistaGenerico.getSelectedItem();
			}

			if(tipoinversionAux!=null && tipoinversionAux.getId()!=null) {
				accionista.setidvalorclienteinversion(tipoinversionAux.getId());
				accionista.settipoinversion_descripcion(AccionistaConstantesFunciones.getTipoInversionDescripcion(tipoinversionAux));
				accionista.setTipoInversion(tipoinversionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIdentificacionForeignKey(Accionista accionista,JComboBox jComboBoxidvaloridentificacionAccionistaGenerico)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionAux=new TipoIdentificacion();

			if(jComboBoxidvaloridentificacionAccionistaGenerico==null) {
				tipoidentificacionAux=(TipoIdentificacion)this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.getSelectedItem();
			} else {
				tipoidentificacionAux=(TipoIdentificacion)jComboBoxidvaloridentificacionAccionistaGenerico.getSelectedItem();
			}

			if(tipoidentificacionAux!=null && tipoidentificacionAux.getId()!=null) {
				accionista.setidvaloridentificacion(tipoidentificacionAux.getId());
				accionista.settipoidentificacion_descripcion(AccionistaConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacionAux));
				accionista.setTipoIdentificacion(tipoidentificacionAux);			}
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

					if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAccionista!=null) { 
							this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAccionista!=null) { 
					}

					if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdClientePorNombreCorto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.addItem(cliente);
							}
						}

						if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteAccionista.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteAccionista.addItem(cliente);
							}
						}

						if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoInversionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoInversion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAccionista!=null) { 
							this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.removeAllItems();

							for(TipoInversion tipoinversion:this.tipoinversionsForeignKey) {
								this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.addItem(tipoinversion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAccionista!=null) { 
					}

					if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteInversion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.removeAllItems();

							for(TipoInversion tipoinversion:this.tipoinversionsForeignKey) {
								this.jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.addItem(tipoinversion);
							}
						}

						if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIdentificacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIdentificacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAccionista!=null) { 
							this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.removeAllItems();

							for(TipoIdentificacion tipoidentificacion:this.tipoidentificacionsForeignKey) {
								this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.addItem(tipoidentificacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAccionista!=null) { 
					}

					if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorIdentificacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.removeAllItems();

							for(TipoIdentificacion tipoidentificacion:this.tipoidentificacionsForeignKey) {
								this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.addItem(tipoidentificacion);
							}
						}

						if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAccionista!=null) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormAccionista!=null) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteAccionista.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteAccionista.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoInversionForeignKey(TipoInversion tipoinversion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAccionista!=null) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setSelectedItem(tipoinversion);
						}
					} else {
						if(this.jInternalFrameDetalleFormAccionista!=null) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.setSelectedItem(tipoinversion);
						} else {
							this.jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoIdentificacionForeignKey(TipoIdentificacion tipoidentificacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAccionista!=null) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setSelectedItem(tipoidentificacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormAccionista!=null) {
							this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.setSelectedItem(tipoidentificacion);
						} else {
							this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAccionista() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AccionistaConstantesFunciones.refrescarForeignKeysDescripcionesAccionista(this.accionistaLogic.getAccionistas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AccionistaConstantesFunciones.refrescarForeignKeysDescripcionesAccionista(this.accionistas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoInversion.class));
		classes.add(new Classe(TipoIdentificacion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//accionistaLogic.setAccionistas(this.accionistas);
			accionistaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AccionistaParameterReturnGeneral getAccionistaParameterGeneral() {
		return this.accionistaParameterGeneral;
	}
	
	public void setAccionistaParameterGeneral(AccionistaParameterReturnGeneral accionistaParameterGeneral) {
		this.accionistaParameterGeneral = accionistaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAccionista() {
		return isPermisoTodoAccionista;
	}

	public void setIsPermisoTodoAccionista(Boolean isPermisoTodoAccionista) {
		this.isPermisoTodoAccionista = isPermisoTodoAccionista;
	}

	public Boolean getIsPermisoNuevoAccionista() {
		return isPermisoNuevoAccionista;
	}

	public void setIsPermisoNuevoAccionista(Boolean isPermisoNuevoAccionista) {
		this.isPermisoNuevoAccionista = isPermisoNuevoAccionista;
	}

	public Boolean getIsPermisoActualizarAccionista() {
		return isPermisoActualizarAccionista;
	}

	public void setIsPermisoActualizarAccionista(Boolean isPermisoActualizarAccionista) {
		this.isPermisoActualizarAccionista = isPermisoActualizarAccionista;
	}

	public Boolean getIsPermisoEliminarAccionista() {
		return isPermisoEliminarAccionista;
	}

	public void setIsPermisoEliminarAccionista(Boolean isPermisoEliminarAccionista) {
		this.isPermisoEliminarAccionista = isPermisoEliminarAccionista;
	}

	public Boolean getIsPermisoGuardarCambiosAccionista() {
		return isPermisoGuardarCambiosAccionista;
	}

	public void setIsPermisoGuardarCambiosAccionista(Boolean isPermisoGuardarCambiosAccionista) {
		this.isPermisoGuardarCambiosAccionista = isPermisoGuardarCambiosAccionista;
	}
	
	public Boolean getIsPermisoConsultaAccionista() {
		return isPermisoConsultaAccionista;
	}

	public void setIsPermisoConsultaAccionista(Boolean isPermisoConsultaAccionista) {
		this.isPermisoConsultaAccionista = isPermisoConsultaAccionista;
	}

	public Boolean getIsPermisoBusquedaAccionista() {
		return isPermisoBusquedaAccionista;
	}

	public void setIsPermisoBusquedaAccionista(Boolean isPermisoBusquedaAccionista) {
		this.isPermisoBusquedaAccionista = isPermisoBusquedaAccionista;
	}

	public Boolean getIsPermisoReporteAccionista() {
		return isPermisoReporteAccionista;
	}

	public void setIsPermisoReporteAccionista(Boolean isPermisoReporteAccionista) {
		this.isPermisoReporteAccionista = isPermisoReporteAccionista;
	}
	
	public Boolean getIsPermisoPaginacionMedioAccionista() {
		return isPermisoPaginacionMedioAccionista;
	}

	public void setIsPermisoPaginacionMedioAccionista(Boolean isPermisoPaginacionMedioAccionista) {
		this.isPermisoPaginacionMedioAccionista = isPermisoPaginacionMedioAccionista;
	}
	
	public Boolean getIsPermisoPaginacionTodoAccionista() {
		return isPermisoPaginacionTodoAccionista;
	}

	public void setIsPermisoPaginacionTodoAccionista(Boolean isPermisoPaginacionTodoAccionista) {
		this.isPermisoPaginacionTodoAccionista = isPermisoPaginacionTodoAccionista;
	}
	
	public Boolean getIsPermisoPaginacionAltoAccionista() {
		return isPermisoPaginacionAltoAccionista;
	}

	public void setIsPermisoPaginacionAltoAccionista(Boolean isPermisoPaginacionAltoAccionista) {
		this.isPermisoPaginacionAltoAccionista = isPermisoPaginacionAltoAccionista;
	}
	
	public Boolean getIsPermisoCopiarAccionista() {
		return isPermisoCopiarAccionista;
	}

	public void setIsPermisoCopiarAccionista(Boolean isPermisoCopiarAccionista) {
		this.isPermisoCopiarAccionista = isPermisoCopiarAccionista;
	}
	
	public Boolean getIsPermisoVerFormAccionista() {
		return isPermisoVerFormAccionista;
	}

	public void setIsPermisoVerFormAccionista(Boolean isPermisoVerFormAccionista) {
		this.isPermisoVerFormAccionista = isPermisoVerFormAccionista;
	}
	
	public Boolean getIsPermisoDuplicarAccionista() {
		return isPermisoDuplicarAccionista;
	}

	public void setIsPermisoDuplicarAccionista(Boolean isPermisoDuplicarAccionista) {
		this.isPermisoDuplicarAccionista = isPermisoDuplicarAccionista;
	}
	
	public Boolean getIsPermisoOrdenAccionista() {
		return isPermisoOrdenAccionista;
	}

	public void setIsPermisoOrdenAccionista(Boolean isPermisoOrdenAccionista) {
		this.isPermisoOrdenAccionista = isPermisoOrdenAccionista;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAccionista() {
		return isVisibilidadCeldaNuevoAccionista;
	}

	public void setIsVisibilidadCeldaNuevoAccionista(Boolean isVisibilidadCeldaNuevoAccionista) {
		this.isVisibilidadCeldaNuevoAccionista = isVisibilidadCeldaNuevoAccionista;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAccionista() {
		return isVisibilidadCeldaDuplicarAccionista;
	}

	public void setIsVisibilidadCeldaDuplicarAccionista(Boolean isVisibilidadCeldaDuplicarAccionista) {
		this.isVisibilidadCeldaDuplicarAccionista = isVisibilidadCeldaDuplicarAccionista;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAccionista() {
		return isVisibilidadCeldaCopiarAccionista;
	}

	public void setIsVisibilidadCeldaCopiarAccionista(Boolean isVisibilidadCeldaCopiarAccionista) {
		this.isVisibilidadCeldaCopiarAccionista = isVisibilidadCeldaCopiarAccionista;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAccionista() {
		return isVisibilidadCeldaVerFormAccionista;
	}

	public void setIsVisibilidadCeldaVerFormAccionista(Boolean isVisibilidadCeldaVerFormAccionista) {
		this.isVisibilidadCeldaVerFormAccionista = isVisibilidadCeldaVerFormAccionista;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAccionista() {
		return isVisibilidadCeldaOrdenAccionista;
	}

	public void setIsVisibilidadCeldaOrdenAccionista(Boolean isVisibilidadCeldaOrdenAccionista) {
		this.isVisibilidadCeldaOrdenAccionista = isVisibilidadCeldaOrdenAccionista;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAccionista() {
		return isVisibilidadCeldaNuevoRelacionesAccionista;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAccionista(Boolean isVisibilidadCeldaNuevoRelacionesAccionista) {
		this.isVisibilidadCeldaNuevoRelacionesAccionista = isVisibilidadCeldaNuevoRelacionesAccionista;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAccionista() {
		return isVisibilidadCeldaModificarAccionista;
	}

	public void setIsVisibilidadCeldaModificarAccionista(Boolean isVisibilidadCeldaModificarAccionista) {
		this.isVisibilidadCeldaModificarAccionista = isVisibilidadCeldaModificarAccionista;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAccionista() {
		return isVisibilidadCeldaActualizarAccionista;
	}

	public void setIsVisibilidadCeldaActualizarAccionista(Boolean isVisibilidadCeldaActualizarAccionista) {
		this.isVisibilidadCeldaActualizarAccionista = isVisibilidadCeldaActualizarAccionista;
	}

	public Boolean getIsVisibilidadCeldaEliminarAccionista() {
		return isVisibilidadCeldaEliminarAccionista;
	}

	public void setIsVisibilidadCeldaEliminarAccionista(Boolean isVisibilidadCeldaEliminarAccionista) {
		this.isVisibilidadCeldaEliminarAccionista = isVisibilidadCeldaEliminarAccionista;
	}

	public Boolean getIsVisibilidadCeldaCancelarAccionista() {
		return isVisibilidadCeldaCancelarAccionista;
	}

	public void setIsVisibilidadCeldaCancelarAccionista(Boolean isVisibilidadCeldaCancelarAccionista) {
		this.isVisibilidadCeldaCancelarAccionista = isVisibilidadCeldaCancelarAccionista;
	}

	public Boolean getIsVisibilidadCeldaGuardarAccionista() {
		return isVisibilidadCeldaGuardarAccionista;
	}

	public void setIsVisibilidadCeldaGuardarAccionista(Boolean isVisibilidadCeldaGuardarAccionista) {
		this.isVisibilidadCeldaGuardarAccionista = isVisibilidadCeldaGuardarAccionista;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAccionista() {
		return isVisibilidadCeldaGuardarCambiosAccionista;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAccionista(Boolean isVisibilidadCeldaGuardarCambiosAccionista) {
		this.isVisibilidadCeldaGuardarCambiosAccionista = isVisibilidadCeldaGuardarCambiosAccionista;
	}
		
	public AccionistaSessionBean getaccionistaSessionBean() {
		return this.accionistaSessionBean;
	}
	
	public void setaccionistaSessionBean(AccionistaSessionBean accionistaSessionBean) {
		this.accionistaSessionBean=accionistaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdClientePorNombreCorto() {
		return this.isVisibilidadBusquedaPorIdClientePorNombreCorto;
	}

	public void setisVisibilidadBusquedaPorIdClientePorNombreCorto(Boolean isVisibilidadBusquedaPorIdClientePorNombreCorto) {
		this.isVisibilidadBusquedaPorIdClientePorNombreCorto=isVisibilidadBusquedaPorIdClientePorNombreCorto;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdValorClienteInversion() {
		return this.isVisibilidadFK_IdValorClienteInversion;
	}

	public void setisVisibilidadFK_IdValorClienteInversion(Boolean isVisibilidadFK_IdValorClienteInversion) {
		this.isVisibilidadFK_IdValorClienteInversion=isVisibilidadFK_IdValorClienteInversion;
	}

	public Boolean getisVisibilidadFK_IdValorIdentificacion() {
		return this.isVisibilidadFK_IdValorIdentificacion;
	}

	public void setisVisibilidadFK_IdValorIdentificacion(Boolean isVisibilidadFK_IdValorIdentificacion) {
		this.isVisibilidadFK_IdValorIdentificacion=isVisibilidadFK_IdValorIdentificacion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAccionista(Accionista accionista)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(accionista,null);
				this.setActualParaGuardarTipoInversionForeignKey(accionista,null);
				this.setActualParaGuardarTipoIdentificacionForeignKey(accionista,null);
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
	
	public void bugActualizarReferenciaActual(Accionista accionista,Accionista accionistaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAccionista(accionista);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		accionistaAux.setId(accionista.getId());
		accionistaAux.setVersionRow(accionista.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAccionista();
		
			int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = accionistaValidator.getInvalidValues(this.accionista);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			accionistaLogic.setDatosCliente(datosCliente);
			accionistaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				accionistaAux=new  Accionista();
				
				accionistaAux.setIsNew(true);
				accionistaAux.setIsChanged(true);
				
				accionistaAux.setAccionistaOriginal(this.accionista);
				
				accionistaAux.setId(this.accionista.getId());	
				accionistaAux.setVersionRow(this.accionista.getVersionRow());	
				accionistaAux.setidcliente(this.accionista.getidcliente());	
				accionistaAux.setidvalorclienteinversion(this.accionista.getidvalorclienteinversion());	
				accionistaAux.setidvaloridentificacion(this.accionista.getidvaloridentificacion());	
				accionistaAux.setidentificacion(this.accionista.getidentificacion());	
				accionistaAux.setapellidopaterno(this.accionista.getapellidopaterno());	
				accionistaAux.setapellidomaterno(this.accionista.getapellidomaterno());	
				accionistaAux.setprimernombre(this.accionista.getprimernombre());	
				accionistaAux.setsegundonombre(this.accionista.getsegundonombre());	
				accionistaAux.setnombrecorto(this.accionista.getnombrecorto());	
				accionistaAux.setparticipacion(this.accionista.getparticipacion());	
				accionistaAux.setesactivo(this.accionista.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.accionistaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.accionistaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(accionistaAux,accionistaLogic.getAccionistas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(accionistaAux,accionistas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.accionistaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.accionistaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaLogic.saveAccionistas();//WithConnection
						//accionistaLogic.getSetVersionRowAccionistas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.accionista,accionistaAux);
					
					this.refrescarForeignKeysDescripcionesAccionista();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.accionistaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								accionistaLogic.saveAccionistaRelaciones(accionistaAux);//WithConnection
								//accionistaLogic.getSetVersionRowAccionistas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.accionista,accionistaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.accionistaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.accionistaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(accionistaAux,accionistaLogic.getAccionistas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(accionistaAux,accionistas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.accionista,accionistaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				accionistaAux=new  Accionista();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.accionistaSessionBean.getEsGuardarRelacionado() 
					|| (this.accionistaSessionBean.getEsGuardarRelacionado() && this.accionista.getId()>=0)) {
						
					accionistaAux.setIsNew(false);
				}
				
				accionistaAux.setIsDeleted(false);
			
				accionistaAux.setId(this.accionista.getId());	
				accionistaAux.setVersionRow(this.accionista.getVersionRow());	
				accionistaAux.setidcliente(this.accionista.getidcliente());	
				accionistaAux.setidvalorclienteinversion(this.accionista.getidvalorclienteinversion());	
				accionistaAux.setidvaloridentificacion(this.accionista.getidvaloridentificacion());	
				accionistaAux.setidentificacion(this.accionista.getidentificacion());	
				accionistaAux.setapellidopaterno(this.accionista.getapellidopaterno());	
				accionistaAux.setapellidomaterno(this.accionista.getapellidomaterno());	
				accionistaAux.setprimernombre(this.accionista.getprimernombre());	
				accionistaAux.setsegundonombre(this.accionista.getsegundonombre());	
				accionistaAux.setnombrecorto(this.accionista.getnombrecorto());	
				accionistaAux.setparticipacion(this.accionista.getparticipacion());	
				accionistaAux.setesactivo(this.accionista.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(accionistaAux,accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(accionistaAux,accionistas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.accionistaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.accionistaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaLogic.saveAccionistas();//WithConnection
						//accionistaLogic.getSetVersionRowAccionistas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.accionista,accionistaAux);
					
					this.refrescarForeignKeysDescripcionesAccionista();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.accionistaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								accionistaLogic.saveAccionistaRelaciones(accionistaAux);//WithConnection
								//accionistaLogic.getSetVersionRowAccionistas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.accionista,accionistaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.accionistaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.accionistaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(accionistaAux,accionistaLogic.getAccionistas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(accionistaAux,accionistas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.accionista,accionistaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				accionistaAux=new  Accionista();
				
				accionistaAux.setIsNew(false);
				accionistaAux.setIsChanged(false);
				
				accionistaAux.setIsDeleted(true);
				
				accionistaAux.setId(this.accionista.getId());	
				accionistaAux.setVersionRow(this.accionista.getVersionRow());	
				accionistaAux.setidcliente(this.accionista.getidcliente());	
				accionistaAux.setidvalorclienteinversion(this.accionista.getidvalorclienteinversion());	
				accionistaAux.setidvaloridentificacion(this.accionista.getidvaloridentificacion());	
				accionistaAux.setidentificacion(this.accionista.getidentificacion());	
				accionistaAux.setapellidopaterno(this.accionista.getapellidopaterno());	
				accionistaAux.setapellidomaterno(this.accionista.getapellidomaterno());	
				accionistaAux.setprimernombre(this.accionista.getprimernombre());	
				accionistaAux.setsegundonombre(this.accionista.getsegundonombre());	
				accionistaAux.setnombrecorto(this.accionista.getnombrecorto());	
				accionistaAux.setparticipacion(this.accionista.getparticipacion());	
				accionistaAux.setesactivo(this.accionista.getesactivo());	
				
				if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.accionistaAux.getId()>=0) {	
						this.accionistasEliminados.add(accionistaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(accionistaAux,accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(accionistaAux,accionistas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.accionistaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.accionistaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaLogic.saveAccionistas();//WithConnection
						//accionistaLogic.getSetVersionRowAccionistas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.accionistaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								accionistaLogic.saveAccionistaRelaciones(accionistaAux);//WithConnection
								//accionistaLogic.getSetVersionRowAccionistas();//WithConnection
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
							if(this.accionistaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.accionistaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(accionistaAux,accionistaLogic.getAccionistas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(accionistaAux,accionistas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getAccionistas().addAll(this.accionistasEliminados);
					
					accionistaLogic.saveAccionistas();//WithConnection
					//accionistaLogic.getSetVersionRowAccionistas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAccionista();
				
				this.accionistasEliminados= new ArrayList<Accionista>();		
			}
			
			if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Accionista GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.accionista=accionistaAux;
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
      		//this.finishProcessAccionista();
      	}
		
	}	
	
	public void actualizarRelaciones(Accionista accionistaLocal) throws Exception {
		
		if(this.accionistaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Accionista accionistaLocal) throws Exception {	
		if(this.accionistaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				accionistaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoInversionDetalleFormJInternalFrame.class)) {
				TipoInversionBeanSwingJInternalFrame tipoinversionBeanSwingJInternalFrameLocal=(TipoInversionBeanSwingJInternalFrame) ((TipoInversionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoinversionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoInversion(tipoinversionBeanSwingJInternalFrameLocal.gettipoinversion(),true);
				tipoinversionBeanSwingJInternalFrameLocal.actualizarLista(tipoinversionBeanSwingJInternalFrameLocal.tipoinversion,this.tipoinversionsForeignKey);

				tipoinversionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoinversionBeanSwingJInternalFrameLocal.tipoinversion);

				accionistaLocal.setTipoInversion(tipoinversionBeanSwingJInternalFrameLocal.tipoinversion);

				this.addItemDefectoCombosForeignKeyTipoInversion();
				this.cargarCombosFrameTipoInversionsForeignKey("Formulario");
				this.setActualTipoInversionForeignKey(tipoinversionBeanSwingJInternalFrameLocal.tipoinversion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoIdentificacionDetalleFormJInternalFrame.class)) {
				TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrameLocal=(TipoIdentificacionBeanSwingJInternalFrame) ((TipoIdentificacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoidentificacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIdentificacion(tipoidentificacionBeanSwingJInternalFrameLocal.gettipoidentificacion(),true);
				tipoidentificacionBeanSwingJInternalFrameLocal.actualizarLista(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion,this.tipoidentificacionsForeignKey);

				tipoidentificacionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion);

				accionistaLocal.setTipoIdentificacion(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion);

				this.addItemDefectoCombosForeignKeyTipoIdentificacion();
				this.cargarCombosFrameTipoIdentificacionsForeignKey("Formulario");
				this.setActualTipoIdentificacionForeignKey(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAccionistaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = accionistaValidator.getInvalidValues(this.accionista);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Accionista accionista,List<Accionista> accionistas) throws Exception {
		try	{		
			AccionistaConstantesFunciones.actualizarLista(accionista,accionistas,this.accionistaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Accionista accionista,List<Accionista> accionistas) throws Exception {
		try	{			
			AccionistaConstantesFunciones.actualizarSelectedLista(accionista,accionistas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Accionista> accionistasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				accionistasLocal=this.accionistaLogic.getAccionistas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				accionistasLocal=this.accionistas;
			}
			//ARCHITECTURE
		
			for(Accionista accionistaLocal:accionistasLocal) {
				if(this.permiteMantenimiento(accionistaLocal) && accionistaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AccionistaConstantesFunciones.getAccionistaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelidclienteAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.IDTIPOINVERSION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelidvalorclienteinversionAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.IDTIPOIDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelidvaloridentificacionAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelidentificacionAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.APELLIDOPATERNO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelapellidopaternoAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.APELLIDOMATERNO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelapellidomaternoAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.PRIMERNOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelprimernombreAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.SEGUNDONOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelsegundonombreAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.NOMBRECORTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelnombrecortoAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.PARTICIPACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelparticipacionAccionista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionistaConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelesactivoAccionista,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAccionista!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelidclienteAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelidvalorclienteinversionAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelidvaloridentificacionAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelidentificacionAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelapellidopaternoAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelapellidomaternoAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelprimernombreAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelsegundonombreAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelnombrecortoAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelparticipacionAccionista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccionista.jLabelesactivoAccionista,"");
		
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
		this.iIdNuevoAccionista--;	
		
		
		this.accionistaAux=new Accionista();
		
		this.accionistaAux.setId(this.iIdNuevoAccionista);
		this.accionistaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.accionistaLogic.getAccionistas().add(this.accionistaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.accionistas.add(this.accionistaAux);
		}
		//ARCHITECTURE
		
		this.accionista=this.accionistaAux;
		
		if(AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAccionista(this.accionista);
			this.setVariablesObjetoActualToFormularioForeignKeyAccionista(this.accionista);
		}
				
		//this.setDefaultControlesAccionista();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAccionista();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAccionista();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAccionista();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAccionista(this.accionistaBean,this.accionista,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AccionistaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.accionistaSessionBean.getConGuardarRelaciones()) {
			classes=AccionistaConstantesFunciones.getClassesRelationshipsOfAccionista(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.accionistaReturnGeneral=accionistaLogic.procesarEventosAccionistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.accionistaLogic.getAccionistas(),this.accionista,this.accionistaParameterGeneral,this.isEsNuevoAccionista,classes);//this.accionistaLogic.getAccionista()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAccionista(this.accionistaReturnGeneral,this.accionistaBean,false);
		
		if(this.accionistaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAccionista(this.accionistaReturnGeneral.getAccionista());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAccionista(this.accionistaReturnGeneral.getAccionista());
		}
		
		if(this.accionistaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAccionista(this.accionistaReturnGeneral.getAccionista(),classes);//this.accionistaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAccionista(this.accionista,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAccionista();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAccionista();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AccionistaBeanSwingJInternalFrameAdditional.RecargarFormAccionista(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAccionista(false);
						
			if(accionistaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAccionista();
			}
			
			this.actualizarVisualTableDatosAccionista();
			
			this.jTableDatosAccionista.setRowSelectionInterval(this.getIndiceNuevoAccionista(), this.getIndiceNuevoAccionista());
			
			this.seleccionarFilaTablaAccionistaActual();
						
			this.actualizarEstadoCeldasBotonesAccionista("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAccionista(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAccionista.jTextFieldidentificacionAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activaridentificacionAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreaapellidopaternoAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activarapellidopaternoAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreaapellidomaternoAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activarapellidomaternoAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreaprimernombreAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activarprimernombreAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreasegundonombreAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activarsegundonombreAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreanombrecortoAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activarnombrecortoAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextFieldparticipacionAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activarparticipacionAccionista);
		this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activaresactivoAccionista);	
		
		this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activaridclienteAccionista);
		this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activaridvalorclienteinversionAccionista);
		this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setEnabled(isHabilitar && this.accionistaConstantesFunciones.activaridvaloridentificacionAccionista);
	};
	
	public void setDefaultControlesAccionista() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAccionista(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.accionistaSessionBean.setConGuardarRelaciones(true);			
			this.accionistaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.setVisible(true);
			
					
		} else {
			//this.accionistaSessionBean.setConGuardarRelaciones(false);			
			this.accionistaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAccionista() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
				if(accionistaAux.getId().equals(this.iIdNuevoAccionista)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accionista accionistaAux:this.accionistas) {
				if(accionistaAux.getId().equals(this.iIdNuevoAccionista)) {
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
	
	public int getIndiceActualAccionista(Accionista accionista,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
				if(accionistaAux.getId().equals(accionista.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accionista accionistaAux:this.accionistas) {
				if(accionistaAux.getId().equals(accionista.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAccionista(Accionista accionistaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
				if(accionistaAux.getAccionistaOriginal().getId().equals(accionistaOriginal.getId())) {
					existe=true;
					accionistaOriginal.setId(accionistaAux.getId());
					accionistaOriginal.setVersionRow(accionistaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accionista accionistaAux:this.accionistas) {
				if(accionistaAux.getAccionistaOriginal().getId().equals(accionistaOriginal.getId())) {
					existe=true;
					accionistaOriginal.setId(accionistaAux.getId());
					accionistaOriginal.setVersionRow(accionistaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAccionista(Boolean esParaCancelar) throws Exception {
		accionistasAux=new ArrayList<Accionista>();
		accionistaAux=new Accionista();
		
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
					if(accionistaAux.getId()<0) {
						accionistasAux.add(accionistaAux);
					}		
				}
				this.iIdNuevoAccionista=0L;
				this.accionistaLogic.getAccionistas().removeAll(accionistasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Accionista accionistaAux:this.accionistas) {
					if(accionistaAux.getId()<0) {
						accionistasAux.add(accionistaAux);
					}		
				}
				this.iIdNuevoAccionista=0L;
				this.accionistas.removeAll(accionistasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAccionista 
					&& this.accionistaLogic.getAccionistas().size()>0
					) {
					accionistaAux=this.accionistaLogic.getAccionistas().get(this.accionistaLogic.getAccionistas().size() - 1);
				
					if(accionistaAux.getId()<0) {
						this.accionistaLogic.getAccionistas().remove(accionistaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAccionista && this.accionistas.size()>0) {
					accionistaAux=this.accionistas.get(this.accionistas.size() - 1);
				
					if(accionistaAux.getId()<0) {
						this.accionistas.remove(accionistaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAccionista(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(accionista.getId()<0) {
				this.accionistaLogic.getAccionistas().remove(this.accionista);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(accionista.getId()<0) {
				this.accionistas.remove(this.accionista);
			}
		}			
	}
	
	public void setEstadosInicialesAccionista(List<Accionista> accionistasAux) throws Exception {
		AccionistaConstantesFunciones.setEstadosInicialesAccionista(accionistasAux);
	}
	
	public void setEstadosInicialesAccionista(Accionista accionistaAux) throws Exception {
		AccionistaConstantesFunciones.setEstadosInicialesAccionista(accionistaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAccionistaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAccionista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAccionistaActual()) {
				if(!this.isEsNuevoAccionista) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAccionista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAccionista=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAccionistaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Accionista ?", "MANTENIMIENTO DE Accionista", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAccionista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Accionista accionista) throws Exception {
		AccionistaConstantesFunciones.seleccionarAsignar(this.accionista,accionista);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAccionista=this.isPermisoActualizarOriginalAccionista;
			
			
			this.seleccionarAsignar(accionista);
			
			

			idClienteActual=accionista.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AccionistaConstantesFunciones.quitarEspaciosAccionista(this.accionista,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAccionista("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.accionistaSessionBean.setsFuncionBusquedaRapida(this.accionistaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoAccionista) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAccionista(esParaCancelar);				
				this.cancelarNuevoAccionista(esParaCancelar);								
			}
			
			this.accionista=new Accionista();
			
			this.inicializarAccionista();
			
			this.actualizarEstadoCeldasBotonesAccionista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAccionista() throws Exception {
		try {
			AccionistaConstantesFunciones.inicializarAccionista(this.accionista);
			
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
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.accionistaLogic.getAccionistas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAccionistas(String sAccionBusqueda,List<Accionista> accionistasParaReportes) throws Exception {
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
					sPathReporteFinal="Accionista"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AccionistaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AccionistaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Accionista"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Accionistas");		
		parameters.put("busquedapor", AccionistaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAccionista=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AccionistaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AccionistaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAccionista=new JRBeanArrayDataSource(AccionistaJInternalFrame.TraerAccionistaBeans(accionistasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAccionista);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AccionistaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AccionistaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AccionistaBean.TraerAccionistaBeans(accionistasParaReportes).toArray()));
							
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
				this.generarExcelReporteAccionistas(sAccionBusqueda,sTipoArchivoReporte,accionistasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAccionistas(sAccionBusqueda,sTipoArchivoReporte,accionistasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAccionistaActionPerformed(null);
					//this.generarExcelReporteAccionistas(sAccionBusqueda,sTipoArchivoReporte,accionistasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAccionistas(sAccionBusqueda,sTipoArchivoReporte,accionistasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAccionistas(sAccionBusqueda,sTipoArchivoReporte,accionistasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAccionistas(sAccionBusqueda,sTipoArchivoReporte,accionistasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAccionistas(String sAccionBusqueda,String sTipoArchivoReporte,List<Accionista> accionistasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accionista";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Accionistas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAccionista("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Accionista accionista : accionistasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AccionistaConstantesFunciones.generarExcelReporteDataAccionista("NORMAL",row,workbook,accionista,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAccionista(String sTipo,Row row,Workbook workbook) {
		
		AccionistaConstantesFunciones.generarExcelReporteHeaderAccionista(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAccionistas(String sAccionBusqueda,String sTipoArchivoReporte,List<Accionista> accionistasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accionista_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Accionistas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Accionista accionista : accionistasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AccionistaConstantesFunciones.getAccionistaDescripcion(accionista));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.gettipoinversion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.gettipoidentificacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.getapellidopaterno());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.getapellidomaterno());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.getprimernombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.getsegundonombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_NOMBRECORTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_NOMBRECORTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.getnombrecorto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_PARTICIPACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_PARTICIPACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accionista.getparticipacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionistaConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionistaConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(accionista.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAccionistas(String sAccionBusqueda,String sTipoArchivoReporte,List<Accionista> accionistasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Accionista> accionistasRespaldo=null;
		
		classes=AccionistaConstantesFunciones.getClassesRelationshipsOfAccionista(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.accionistaLogic.setDatosCliente(this.datosCliente);
		this.accionistaLogic.setDatosDeep(this.datosDeep);
		this.accionistaLogic.setIsConDeep(true);
		
		accionistasRespaldo=this.accionistaLogic.getAccionistas();
		
		this.accionistaLogic.setAccionistas(accionistasParaReportes);	
		this.accionistaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		accionistasParaReportes=this.accionistaLogic.getAccionistas();
		this.accionistaLogic.setAccionistas(accionistasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accionista_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Accionistas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAccionista("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Accionista accionista : accionistasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAccionista("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AccionistaConstantesFunciones.generarExcelReporteDataAccionista("NORMAL",row,workbook,accionista,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AccionistaConstantesFunciones.getAccionistaDescripcion(accionista));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAccionista.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAccionista.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAccionista() throws Exception {		
		this.startProcessAccionista(true);
	}
	
	public void startProcessAccionista(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAccionista ,this.jPanelParametrosReportesAccionista, this.jScrollPanelDatosAccionista,this.jPanelPaginacionAccionista, this.jScrollPanelDatosEdicionAccionista, this.jPanelAccionesAccionista,this.jPanelAccionesFormularioAccionista,this.jmenuBarAccionista,this.jmenuBarDetalleAccionista,this.jTtoolBarAccionista,this.jTtoolBarDetalleAccionista);		
		
		final JTabbedPane jTabbedPaneBusquedasAccionista=this.jTabbedPaneBusquedasAccionista; 
		
		final JPanel jPanelParametrosReportesAccionista=this.jPanelParametrosReportesAccionista;
		//final JScrollPane jScrollPanelDatosAccionista=this.jScrollPanelDatosAccionista;
		final JTable jTableDatosAccionista=this.jTableDatosAccionista;		
		final JPanel jPanelPaginacionAccionista=this.jPanelPaginacionAccionista;
		//final JScrollPane jScrollPanelDatosEdicionAccionista=this.jScrollPanelDatosEdicionAccionista;
		final JPanel jPanelAccionesAccionista=this.jPanelAccionesAccionista;
		
		JPanel jPanelCamposAuxiliarAccionista=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAccionista=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAccionista!=null) {
			jPanelCamposAuxiliarAccionista=this.jInternalFrameDetalleFormAccionista.jPanelCamposAccionista;
			jPanelAccionesFormularioAuxiliarAccionista=this.jInternalFrameDetalleFormAccionista.jPanelAccionesFormularioAccionista;
		}
		
		final JPanel jPanelCamposAccionista=jPanelCamposAuxiliarAccionista;
		final JPanel jPanelAccionesFormularioAccionista=jPanelAccionesFormularioAuxiliarAccionista;
		
		
		final JMenuBar jmenuBarAccionista=this.jmenuBarAccionista;
		final JToolBar jTtoolBarAccionista=this.jTtoolBarAccionista;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAccionista=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAccionista=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) {
			jmenuBarDetalleAuxiliarAccionista=this.jInternalFrameDetalleFormAccionista.jmenuBarDetalleAccionista;
			jTtoolBarDetalleAuxiliarAccionista=this.jInternalFrameDetalleFormAccionista.jTtoolBarDetalleAccionista;
		}
		
		final JMenuBar jmenuBarDetalleAccionista=jmenuBarDetalleAuxiliarAccionista;
		final JToolBar jTtoolBarDetalleAccionista=jTtoolBarDetalleAuxiliarAccionista;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAccionista;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAccionista;
			processRunnable.jTableDatos=jTableDatosAccionista;
			processRunnable.jPanelCampos=jPanelCamposAccionista;
			processRunnable.jPanelPaginacion=jPanelPaginacionAccionista;
			processRunnable.jPanelAcciones=jPanelAccionesAccionista;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAccionista;
			
			
			processRunnable.jmenuBar=jmenuBarAccionista;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAccionista;
			processRunnable.jTtoolBar=jTtoolBarAccionista;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAccionista;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAccionista ,jPanelParametrosReportesAccionista,jTableDatosAccionista, /*jScrollPanelDatosAccionista,*/jPanelCamposAccionista,jPanelPaginacionAccionista, /*jScrollPanelDatosEdicionAccionista,*/ jPanelAccionesAccionista,jPanelAccionesFormularioAccionista,jmenuBarAccionista,jmenuBarDetalleAccionista,jTtoolBarAccionista,jTtoolBarDetalleAccionista);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAccionista ,jPanelParametrosReportesAccionista, jScrollPanelDatosAccionista,jPanelPaginacionAccionista, jScrollPanelDatosEdicionAccionista, jPanelAccionesAccionista,jPanelAccionesFormularioAccionista,jmenuBarAccionista,jmenuBarDetalleAccionista,jTtoolBarAccionista,jTtoolBarDetalleAccionista);
						
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
	
	public void finishProcessAccionista() {// throws Exception 
		this.finishProcessAccionista(true);
	}
	
	public void finishProcessAccionista(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAccionista ,this.jPanelParametrosReportesAccionista, this.jScrollPanelDatosAccionista,this.jPanelPaginacionAccionista, this.jScrollPanelDatosEdicionAccionista, this.jPanelAccionesAccionista,this.jPanelAccionesFormularioAccionista,this.jmenuBarAccionista,this.jmenuBarDetalleAccionista,this.jTtoolBarAccionista,this.jTtoolBarDetalleAccionista);		
		
		final JTabbedPane jTabbedPaneBusquedasAccionista=this.jTabbedPaneBusquedasAccionista; 
		
		final JPanel jPanelParametrosReportesAccionista=this.jPanelParametrosReportesAccionista;
		//final JScrollPane jScrollPanelDatosAccionista=this.jScrollPanelDatosAccionista;
		final JTable jTableDatosAccionista=this.jTableDatosAccionista;		
		final JPanel jPanelPaginacionAccionista=this.jPanelPaginacionAccionista;
		//final JScrollPane jScrollPanelDatosEdicionAccionista=this.jScrollPanelDatosEdicionAccionista;
		final JPanel jPanelAccionesAccionista=this.jPanelAccionesAccionista;
		
		JPanel jPanelCamposAuxiliarAccionista=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAccionista=new JPanel();
		
		if(this.jInternalFrameDetalleFormAccionista!=null) {
			jPanelCamposAuxiliarAccionista=this.jInternalFrameDetalleFormAccionista.jPanelCamposAccionista;
			jPanelAccionesFormularioAuxiliarAccionista=this.jInternalFrameDetalleFormAccionista.jPanelAccionesFormularioAccionista;
		}
		
		final JPanel jPanelCamposAccionista=jPanelCamposAuxiliarAccionista;
		final JPanel jPanelAccionesFormularioAccionista=jPanelAccionesFormularioAuxiliarAccionista;
		
		
		final JMenuBar jmenuBarAccionista=this.jmenuBarAccionista;		
		final JToolBar jTtoolBarAccionista=this.jTtoolBarAccionista;
				
		JMenuBar jmenuBarDetalleAuxiliarAccionista=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAccionista=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAccionista!=null) {
			jmenuBarDetalleAuxiliarAccionista=this.jInternalFrameDetalleFormAccionista.jmenuBarDetalleAccionista;
			jTtoolBarDetalleAuxiliarAccionista=this.jInternalFrameDetalleFormAccionista.jTtoolBarDetalleAccionista;		
		}
		
		final JMenuBar jmenuBarDetalleAccionista=jmenuBarDetalleAuxiliarAccionista;
		final JToolBar jTtoolBarDetalleAccionista=jTtoolBarDetalleAuxiliarAccionista;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAccionista;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAccionista;
			processRunnable.jTableDatos=jTableDatosAccionista;
			processRunnable.jPanelCampos=jPanelCamposAccionista;
			processRunnable.jPanelPaginacion=jPanelPaginacionAccionista;
			processRunnable.jPanelAcciones=jPanelAccionesAccionista;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAccionista;
			
			
			processRunnable.jmenuBar=jmenuBarAccionista;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAccionista;
			processRunnable.jTtoolBar=jTtoolBarAccionista;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAccionista;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAccionista ,jPanelParametrosReportesAccionista, jTableDatosAccionista,/*jScrollPanelDatosAccionista,*/jPanelCamposAccionista,jPanelPaginacionAccionista, /*jScrollPanelDatosEdicionAccionista,*/ jPanelAccionesAccionista,jPanelAccionesFormularioAccionista,jmenuBarAccionista,jmenuBarDetalleAccionista,jTtoolBarAccionista,jTtoolBarDetalleAccionista));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAccionista(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAccionista(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAccionista(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAccionista(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAccionista,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAccionista,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAccionista(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAccionista,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAccionista,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.accionistaConstantesFunciones.getsFinalQueryAccionista();
		String  finalQueryPaginacionTodos=this.accionistaConstantesFunciones.getsFinalQueryAccionista();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AccionistaConstantesFunciones.getArrayColumnasGlobalesNoAccionista(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AccionistaConstantesFunciones.getArrayColumnasGlobalesAccionista(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AccionistaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.accionistasEliminados= new ArrayList<Accionista>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAccionista();
		
				///*AccionistaSessionBean*/this.accionistaSessionBean=new AccionistaSessionBean();
			
			if(this.accionistaSessionBean==null) {
				this.accionistaSessionBean=new AccionistaSessionBean();
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
					this.iNumeroPaginacion=AccionistaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AccionistaConstantesFunciones.getClassesForeignKeysOfAccionista(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/accionista."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			accionistasAux= new ArrayList<Accionista>();
			
				
			accionistaLogic.setDatosCliente(this.datosCliente);
			accionistaLogic.setDatosDeep(this.datosDeep);
			accionistaLogic.setIsConDeep(true);
			
			
			accionistaLogic.getAccionistaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					accionistaLogic.getTodosAccionistas(finalQueryGlobal,pagination);
					
					//accionistaLogic.getTodosAccionistasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(accionistaLogic.getAccionistas()==null|| accionistaLogic.getAccionistas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							accionistasAux= new ArrayList<Accionista>();
							accionistasAux.addAll(accionistaLogic.getAccionistas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistasAux= new ArrayList<Accionista>();
							accionistasAux.addAll(accionistas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							accionistaLogic.getTodosAccionistas(finalQueryGlobal+"",this.pagination);												
							
							//accionistaLogic.getTodosAccionistasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAccionistas("Todos",accionistaLogic.getAccionistas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							accionistaLogic.setAccionistas(new ArrayList<Accionista>());					
							accionistaLogic.getAccionistas().addAll(accionistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistas=new ArrayList<Accionista>();
							accionistas.addAll(accionistasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAccionista=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAccionista=this.idActual;
				
				} else if(this.idAccionistaActual!=null && this.idAccionistaActual!=0L) {
					idAccionista=idAccionistaActual;
				}
				
					
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndicePorId(idAccionista);
				
				this.accionistas=new ArrayList<Accionista>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					accionistaLogic.getEntity(idAccionista);
					
					//accionistaLogic.getEntityWithConnection(idAccionista);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionistaLogic.setAccionistas(new ArrayList<Accionista>());
					accionistaLogic.getAccionistas().add(accionistaLogic.getAccionista());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.accionistas=new ArrayList<Accionista>();
					this.accionistas.add(accionista);
				}
				
				if(accionistaLogic.getAccionista()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdClientePorNombreCorto")) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceBusquedaPorIdClientePorNombreCorto(idclienteBusquedaPorIdClientePorNombreCorto,nombrecortoBusquedaPorIdClientePorNombreCorto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					accionistaLogic.getAccionistasBusquedaPorIdClientePorNombreCorto(finalQueryGlobal,pagination,idclienteBusquedaPorIdClientePorNombreCorto,nombrecortoBusquedaPorIdClientePorNombreCorto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceBusquedaPorIdClientePorNombreCorto(idclienteBusquedaPorIdClientePorNombreCorto,nombrecortoBusquedaPorIdClientePorNombreCorto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceBusquedaPorIdClientePorNombreCorto(idclienteBusquedaPorIdClientePorNombreCorto,nombrecortoBusquedaPorIdClientePorNombreCorto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=accionistaLogic.getAccionistas()==null||accionistaLogic.getAccionistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=accionistas==null|| accionistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistasAux=new ArrayList<Accionista>();
						accionistasAux.addAll(accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistasAux=new ArrayList<Accionista>();
							accionistasAux.addAll(accionistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							accionistaLogic.getAccionistasBusquedaPorIdClientePorNombreCorto(finalQueryGlobal,pagination,idclienteBusquedaPorIdClientePorNombreCorto,nombrecortoBusquedaPorIdClientePorNombreCorto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceBusquedaPorIdClientePorNombreCorto(idclienteBusquedaPorIdClientePorNombreCorto,nombrecortoBusquedaPorIdClientePorNombreCorto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceBusquedaPorIdClientePorNombreCorto(idclienteBusquedaPorIdClientePorNombreCorto,nombrecortoBusquedaPorIdClientePorNombreCorto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAccionistas("BusquedaPorIdClientePorNombreCorto",accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAccionistas("BusquedaPorIdClientePorNombreCorto",accionistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaLogic.setAccionistas(new ArrayList<Accionista>());
						accionistaLogic.getAccionistas().addAll(accionistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistas=new ArrayList<Accionista>();
							accionistas.addAll(accionistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					accionistaLogic.getAccionistasFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=accionistaLogic.getAccionistas()==null||accionistaLogic.getAccionistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=accionistas==null|| accionistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistasAux=new ArrayList<Accionista>();
						accionistasAux.addAll(accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistasAux=new ArrayList<Accionista>();
							accionistasAux.addAll(accionistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							accionistaLogic.getAccionistasFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAccionistas("FK_IdCliente",accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAccionistas("FK_IdCliente",accionistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaLogic.setAccionistas(new ArrayList<Accionista>());
						accionistaLogic.getAccionistas().addAll(accionistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistas=new ArrayList<Accionista>();
							accionistas.addAll(accionistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteInversion")) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorClienteInversion(idvalorclienteinversionFK_IdValorClienteInversion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					accionistaLogic.getAccionistasFK_IdValorClienteInversion(finalQueryGlobal,pagination,idvalorclienteinversionFK_IdValorClienteInversion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorClienteInversion(idvalorclienteinversionFK_IdValorClienteInversion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorClienteInversion(idvalorclienteinversionFK_IdValorClienteInversion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=accionistaLogic.getAccionistas()==null||accionistaLogic.getAccionistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=accionistas==null|| accionistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistasAux=new ArrayList<Accionista>();
						accionistasAux.addAll(accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistasAux=new ArrayList<Accionista>();
							accionistasAux.addAll(accionistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							accionistaLogic.getAccionistasFK_IdValorClienteInversion(finalQueryGlobal,pagination,idvalorclienteinversionFK_IdValorClienteInversion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorClienteInversion(idvalorclienteinversionFK_IdValorClienteInversion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorClienteInversion(idvalorclienteinversionFK_IdValorClienteInversion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAccionistas("FK_IdValorClienteInversion",accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAccionistas("FK_IdValorClienteInversion",accionistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaLogic.setAccionistas(new ArrayList<Accionista>());
						accionistaLogic.getAccionistas().addAll(accionistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistas=new ArrayList<Accionista>();
							accionistas.addAll(accionistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorIdentificacion")) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					accionistaLogic.getAccionistasFK_IdValorIdentificacion(finalQueryGlobal,pagination,idvaloridentificacionFK_IdValorIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=accionistaLogic.getAccionistas()==null||accionistaLogic.getAccionistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=accionistas==null|| accionistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistasAux=new ArrayList<Accionista>();
						accionistasAux.addAll(accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistasAux=new ArrayList<Accionista>();
							accionistasAux.addAll(accionistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							accionistaLogic.getAccionistasFK_IdValorIdentificacion(finalQueryGlobal,pagination,idvaloridentificacionFK_IdValorIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionistaConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAccionistas("FK_IdValorIdentificacion",accionistaLogic.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAccionistas("FK_IdValorIdentificacion",accionistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaLogic.setAccionistas(new ArrayList<Accionista>());
						accionistaLogic.getAccionistas().addAll(accionistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistas=new ArrayList<Accionista>();
							accionistas.addAll(accionistasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAccionista();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAccionista();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=accionistaLogic.getAccionistas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=accionistas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=accionistaLogic.getAccionistas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=accionistas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Accionista accionista) {
		Boolean permite=true;
		
		if(this.accionista.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AccionistaConstantesFunciones.getOrderByListaAccionista();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AccionistaConstantesFunciones.getOrderByListaAccionista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accionista accionista:accionistaLogic.getAccionistas()) {
				if(accionista.getsType().equals(Constantes2.S_TOTALES)) {
					accionistaTotales=accionista;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accionista accionista:this.accionistas) {
				if(accionista.getsType().equals(Constantes2.S_TOTALES)) {
					accionistaTotales=accionista;
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
			this.accionistaAux=new Accionista();
			this.accionistaAux.setsType(Constantes2.S_TOTALES);
			this.accionistaAux.setIsNew(false);
			this.accionistaAux.setIsChanged(false);
			this.accionistaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AccionistaConstantesFunciones.TotalizarValoresFilaAccionista(this.accionistaLogic.getAccionistas(),this.accionistaAux);
				
				this.accionistaLogic.getAccionistas().add(this.accionistaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AccionistaConstantesFunciones.TotalizarValoresFilaAccionista(this.accionistas,this.accionistaAux);
				
				this.accionistas.add(this.accionistaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		accionistaTotales=new Accionista();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.accionistaLogic.getAccionistas().remove(accionistaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.accionistas.remove(accionistaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		accionistaTotales=new Accionista();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accionista accionista:accionistaLogic.getAccionistas()) {
				if(accionista.getsType().equals(Constantes2.S_TOTALES)) {
					accionistaTotales=accionista;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AccionistaConstantesFunciones.TotalizarValoresFilaAccionista(this.accionistaLogic.getAccionistas(),accionistaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accionista accionista:this.accionistas) {
				if(accionista.getsType().equals(Constantes2.S_TOTALES)) {
					accionistaTotales=accionista;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AccionistaConstantesFunciones.TotalizarValoresFilaAccionista(this.accionistas,accionistaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAccionistasBusquedaPorIdClientePorNombreCorto()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdClientePorNombreCorto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAccionistasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAccionistasFK_IdValorClienteInversion()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteInversion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAccionistasFK_IdValorIdentificacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorIdentificacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAccionistasBusquedaPorIdClientePorNombreCorto(String sFinalQuery,Long idcliente,String nombrecorto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionistaLogic.getAccionistasBusquedaPorIdClientePorNombreCorto(sFinalQuery,this.pagination,idcliente,nombrecorto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAccionistasFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionistaLogic.getAccionistasFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAccionistasFK_IdValorClienteInversion(String sFinalQuery,Long idvalorclienteinversion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionistaLogic.getAccionistasFK_IdValorClienteInversion(sFinalQuery,this.pagination,idvalorclienteinversion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAccionistasFK_IdValorIdentificacion(String sFinalQuery,Long idvaloridentificacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionistaLogic.getAccionistasFK_IdValorIdentificacion(sFinalQuery,this.pagination,idvaloridentificacion);
				
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
	
	public void inicializarPermisosAccionista() {
		this.isPermisoTodoAccionista=false;
		this.isPermisoNuevoAccionista=false;
		this.isPermisoActualizarAccionista=false;
		this.isPermisoActualizarOriginalAccionista=false;
		this.isPermisoEliminarAccionista=false;
		this.isPermisoGuardarCambiosAccionista=false;
		this.isPermisoConsultaAccionista=false;
		this.isPermisoBusquedaAccionista=false;
		this.isPermisoReporteAccionista=false;		
		this.isPermisoOrdenAccionista=false;		
		this.isPermisoPaginacionMedioAccionista=false;		
		this.isPermisoPaginacionAltoAccionista=false;
		this.isPermisoPaginacionTodoAccionista=false;
		this.isPermisoCopiarAccionista=false;		
		this.isPermisoVerFormAccionista=false;		
		this.isPermisoDuplicarAccionista=false;		
		this.isPermisoOrdenAccionista=false;		
	}
	
	public void setPermisosUsuarioAccionista(Boolean isPermiso) {
		this.isPermisoTodoAccionista=isPermiso;
		this.isPermisoNuevoAccionista=isPermiso;
		this.isPermisoActualizarAccionista=isPermiso;
		this.isPermisoActualizarOriginalAccionista=isPermiso;
		this.isPermisoEliminarAccionista=isPermiso;
		this.isPermisoGuardarCambiosAccionista=isPermiso;
		this.isPermisoConsultaAccionista=isPermiso;
		this.isPermisoBusquedaAccionista=isPermiso;
		this.isPermisoReporteAccionista=isPermiso;
		this.isPermisoOrdenAccionista=isPermiso;		
		this.isPermisoPaginacionMedioAccionista=isPermiso;		
		this.isPermisoPaginacionAltoAccionista=isPermiso;		
		this.isPermisoPaginacionTodoAccionista=isPermiso;		
		this.isPermisoCopiarAccionista=isPermiso;		
		this.isPermisoVerFormAccionista=isPermiso;		
		this.isPermisoDuplicarAccionista=isPermiso;
		this.isPermisoOrdenAccionista=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAccionista(Boolean isPermiso) {
		//this.isPermisoTodoAccionista=isPermiso;
		this.isPermisoNuevoAccionista=isPermiso;
		this.isPermisoActualizarAccionista=isPermiso;
		this.isPermisoActualizarOriginalAccionista=isPermiso;
		this.isPermisoEliminarAccionista=isPermiso;
		this.isPermisoGuardarCambiosAccionista=isPermiso;
		//this.isPermisoConsultaAccionista=isPermiso;
		//this.isPermisoBusquedaAccionista=isPermiso;
		//this.isPermisoReporteAccionista=isPermiso;
		//this.isPermisoOrdenAccionista=isPermiso;		
		//this.isPermisoPaginacionMedioAccionista=isPermiso;		
		//this.isPermisoPaginacionAltoAccionista=isPermiso;		
		//this.isPermisoPaginacionTodoAccionista=isPermiso;		
		//this.isPermisoCopiarAccionista=isPermiso;		
		//this.isPermisoDuplicarAccionista=isPermiso;
		//this.isPermisoOrdenAccionista=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAccionistaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AccionistaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAccionista(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAccionistaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAccionistaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAccionistaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAccionistaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAccionista() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AccionistaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AccionistaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAccionista=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAccionista=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAccionista=this.isPermisoActualizarAccionista;
			this.isPermisoEliminarAccionista=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAccionista=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAccionista=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAccionista=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAccionista=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAccionista=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAccionista=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAccionista=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAccionista=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAccionista=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAccionista=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAccionista=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAccionista=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAccionista=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAccionista.setToolTipText(this.jTableDatosAccionista.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAccionista(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAccionista(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AccionistaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AccionistaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAccionista() throws Exception {
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
	public void inicializarCombosForeignKeyAccionistaListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.tipoinversionsForeignKey=new ArrayList();
				this.tipoidentificacionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAccionistaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AccionistaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAccionistaListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoInversionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoIdentificacionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoInversionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoinversionsForeignKey==null||this.tipoinversionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoInversionConstantesFunciones.getArrayColumnasGlobalesTipoInversion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoInversionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoInversionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoInversionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIdentificacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoidentificacionsForeignKey==null||this.tipoidentificacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIdentificacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIdentificacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAccionistaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AccionistaParameterReturnGeneral accionistaReturnGeneral=new AccionistaParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.accionistaConstantesFunciones.cargaridclienteAccionista)
					 || (this.esRecargarFks && this.accionistaConstantesFunciones.cargaridclienteAccionista)) {

					if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+accionistaSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoInversion="";

				if(((this.tipoinversionsForeignKey==null||this.tipoinversionsForeignKey.size()<=0) && this.accionistaConstantesFunciones.cargaridvalorclienteinversionAccionista)
					 || (this.esRecargarFks && this.accionistaConstantesFunciones.cargaridvalorclienteinversionAccionista)) {

					if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoInversion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoInversionConstantesFunciones.getArrayColumnasGlobalesTipoInversion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoInversion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoInversionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoInversion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoInversion, "");
						finalQueryGlobalTipoInversion+=TipoInversionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoInversionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoInversion=" WHERE " + ConstantesSql.ID + "="+accionistaSessionBean.getlidTipoInversionActual();
					}
				} else {
					finalQueryGlobalTipoInversion="NONE";
				}


				String finalQueryGlobalTipoIdentificacion="";

				if(((this.tipoidentificacionsForeignKey==null||this.tipoidentificacionsForeignKey.size()<=0) && this.accionistaConstantesFunciones.cargaridvaloridentificacionAccionista)
					 || (this.esRecargarFks && this.accionistaConstantesFunciones.cargaridvaloridentificacionAccionista)) {

					if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoIdentificacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoIdentificacion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoIdentificacion, "");
						finalQueryGlobalTipoIdentificacion+=TipoIdentificacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoIdentificacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoIdentificacion=" WHERE " + ConstantesSql.ID + "="+accionistaSessionBean.getlidTipoIdentificacionActual();
					}
				} else {
					finalQueryGlobalTipoIdentificacion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				accionistaReturnGeneral=accionistaLogic.cargarCombosLoteForeignKeyAccionista(finalQueryGlobalCliente,finalQueryGlobalTipoInversion,finalQueryGlobalTipoIdentificacion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=accionistaReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoInversion.equals("NONE")) {
				this.tipoinversionsForeignKey=accionistaReturnGeneral.gettipoinversionsForeignKey();
			}

			if(!finalQueryGlobalTipoIdentificacion.equals("NONE")) {
				this.tipoidentificacionsForeignKey=accionistaReturnGeneral.gettipoidentificacionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAccionista()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoInversion();
			this.addItemDefectoCombosForeignKeyTipoIdentificacion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.accionistaSessionBean==null) {
				this.accionistaSessionBean=new AccionistaSessionBean();
			}

			if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoInversion()throws Exception {
		try {

			if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoInversion()) {
				TipoInversion tipoinversion=new TipoInversion();
				TipoInversionConstantesFunciones.setTipoInversionDescripcion(tipoinversion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoinversion.setId(null);

				if(!TipoInversionConstantesFunciones.ExisteEnLista(this.tipoinversionsForeignKey,tipoinversion,true)) {

					this.tipoinversionsForeignKey.add(0,tipoinversion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoIdentificacion()throws Exception {
		try {

			if(!this.accionistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {
				TipoIdentificacion tipoidentificacion=new TipoIdentificacion();
				TipoIdentificacionConstantesFunciones.setTipoIdentificacionDescripcion(tipoidentificacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoidentificacion.setId(null);

				if(!TipoIdentificacionConstantesFunciones.ExisteEnLista(this.tipoidentificacionsForeignKey,tipoidentificacion,true)) {

					this.tipoidentificacionsForeignKey.add(0,tipoidentificacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAccionista()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAccionista(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAccionista()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAccionista();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAccionista(Accionista accionista)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(accionista.getidcliente(),false,"Formulario");
			this.setActualTipoInversionForeignKey(accionista.getidvalorclienteinversion(),false,"Formulario");
			this.setActualTipoIdentificacionForeignKey(accionista.getidvaloridentificacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAccionista(Accionista accionista,String sTipoEvento)throws Exception {	
		try {
			
			

				if(accionista.getCliente()!=null && !sTipoEvento.equals("idclienteAccionista")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(accionista.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAccionista()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.accionistaConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualTipoInversionForeignKey(this.accionistaConstantesFunciones.getidvalorclienteinversion(),false,"Formulario");
			this.setActualTipoIdentificacionForeignKey(this.accionistaConstantesFunciones.getidvaloridentificacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAccionista()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAccionista()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAccionista()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAccionista()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAccionista()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoInversionsForeignKey("Todos");
			this.cargarCombosFrameTipoIdentificacionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAccionista(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoInversionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoIdentificacionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAccionista()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista!=null && this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.getItemCount()>0) {
				this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista!=null && this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.getItemCount()>0) {
				this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista!=null && this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.getItemCount()>0) {
				this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public AccionistaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AccionistaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AccionistaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.accionistaSessionBean=new AccionistaSessionBean(); 
		this.accionistaConstantesFunciones=new AccionistaConstantesFunciones(); 
		this.accionistaBean=new Accionista();//(this.accionistaConstantesFunciones); 		
		this.accionistaReturnGeneral=new AccionistaParameterReturnGeneral(); 
		
		this.accionistaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.accionistaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AccionistaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AccionistaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AccionistaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAccionista(true);
			
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
			
			this.accionistaConstantesFunciones=new AccionistaConstantesFunciones(); 
			this.accionistaBean=new Accionista();//this.accionistaConstantesFunciones); 			
			this.accionistaReturnGeneral=new AccionistaParameterReturnGeneral(); 
		
			AccionistaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Accionista Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.accionista=new Accionista();
			this.accionistas = new ArrayList<Accionista>();
			this.accionistasAux = new ArrayList<Accionista>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic=new AccionistaLogic();
				this.accionistaLogic.getNewConnexionToDeep("");
			}
			
			//this.accionistaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.accionistaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAccionista);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAccionista!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAccionista);	
					}
					
					if(this.jInternalFrameImportacionAccionista!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAccionista);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAccionista!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAccionista);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAccionista!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAccionista);
				this.jInternalFrameDetalleFormAccionista.setVisible(false);
				this.jInternalFrameDetalleFormAccionista.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAccionista!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAccionista);
					this.jInternalFrameReporteDinamicoAccionista.setVisible(false);
					this.jInternalFrameReporteDinamicoAccionista.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAccionista!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAccionista);
					this.jInternalFrameImportacionAccionista.setVisible(false);
					this.jInternalFrameImportacionAccionista.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAccionista!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAccionista);
					this.jInternalFrameOrderByAccionista.setVisible(false);
					this.jInternalFrameOrderByAccionista.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAccionistaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AccionistaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.accionistaReturnGeneral=new AccionistaParameterReturnGeneral();
			
			this.accionistaParameterGeneral=new AccionistaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.accionistaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AccionistaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AccionistaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.accionistaSessionBean.getEsGuardarRelacionado(),this.accionistaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AccionistaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.accionistaSessionBean.getEsGuardarRelacionado(),this.accionistaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAccionista=false;
			this.isVisibilidadCeldaDuplicarAccionista=true;
			this.isVisibilidadCeldaCopiarAccionista=true;
			this.isVisibilidadCeldaVerFormAccionista=true;
			this.isVisibilidadCeldaOrdenAccionista=true;
			this.isVisibilidadCeldaNuevoRelacionesAccionista=false;
			this.isVisibilidadCeldaModificarAccionista=false;
			this.isVisibilidadCeldaActualizarAccionista=false;
			this.isVisibilidadCeldaEliminarAccionista=false;
			this.isVisibilidadCeldaCancelarAccionista=false;
			this.isVisibilidadCeldaGuardarAccionista=false;
			this.isVisibilidadCeldaGuardarCambiosAccionista=false;
			
			
			this.isVisibilidadBusquedaPorIdClientePorNombreCorto=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdValorClienteInversion=true;
			this.isVisibilidadFK_IdValorIdentificacion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAccionista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAccionista();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAccionista(false);
			
			this.setPermisosUsuarioAccionista();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.accionistaSessionBean.getEsGuardarRelacionado() 
				|| (this.accionistaSessionBean.getEsGuardarRelacionado() && this.accionistaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAccionistaClasesRelacionadas();
			}
			
			if(this.accionistaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAccionistaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AccionistaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAccionista();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAccionista();
			}
			
			if(!this.isPermisoBusquedaAccionista) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAccionista.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAccionista,this.isPermisoPaginacionMedioAccionista,this.isPermisoPaginacionTodoAccionista);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AccionistaConstantesFunciones.getTiposSeleccionarAccionista());
				
				this.tiposColumnasSelect=AccionistaConstantesFunciones.getTiposSeleccionarAccionista(true);
				
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
			//if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAccionista();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAccionista(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAccionista(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAccionista() ;
			
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
			this.tipoinversionLogic=new TipoInversionLogic();
			this.tipoidentificacionLogic=new TipoIdentificacionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				accionistaImplementable= (AccionistaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AccionistaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				accionistaImplementableHome= (AccionistaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AccionistaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.accionistas= new ArrayList<Accionista>();
			this.accionistasEliminados= new ArrayList<Accionista>();
						
			this.isEsNuevoAccionista=false;
			this.esParaAccionDesdeFormularioAccionista=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoinversionsForeignKey=new ArrayList<TipoInversion>() ;
			this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAccionista(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAccionista();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AccionistaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AccionistaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAccionista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAccionista(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAccionista!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAccionista();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAccionista();
			}
			
			AccionistaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAccionista.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAccionista.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAccionista.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAccionista(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Accionista: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAccionista() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAccionista")) {
				iIndex=this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAccionista.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAccionista();	
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
	
	public void cargarCombosForeignKeyAccionista(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAccionista(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAccionista(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAccionistaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAccionista();
		
		this.cargarCombosFrameForeignKeyAccionista();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAccionista();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAccionista();
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

	public void cargarCombosForeignKeyTipoInversion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoInversionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoInversion();
				this.cargarCombosFrameTipoInversionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoInversion(this.tipoinversionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIdentificacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIdentificacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIdentificacion();
				this.cargarCombosFrameTipoIdentificacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIdentificacion(this.tipoidentificacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAccionistaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.accionistaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
			
			if(jTableDatosAccionista.getRowCount()>=1) {
				jTableDatosAccionista.removeRowSelectionInterval(0, jTableDatosAccionista.getRowCount()-1);						
			}
			
			this.isEsNuevoAccionista=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAccionista(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAccionista(true);			
			//this.accionista=new Accionista();
			//this.accionista.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAccionista(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAccionista() ;
			
			if(AccionistaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAccionista(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.accionista);	
			this.actualizarInformacion("INFO_PADRE",false,this.accionista);				
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
			if(this.accionistaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Accionista: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAccionistaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAccionista.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAccionista.getSelectedRows().length;			
			}
			
			accionistasSeleccionados=this.getAccionistasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAccionista--;			
				//Accionista accionistaAux= new Accionista();			
				//accionistaAux.setId(this.iIdNuevoAccionista);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Accionista accionistaOrigen=new Accionista();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Accionista accionistaOrigen : accionistasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							accionistaOrigen =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionistaOrigen =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAccionista();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.accionista.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAccionista(accionistaOrigen,this.accionista,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.accionistaLogic.getAccionistas().add(this.accionistaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.accionistas.add(this.accionistaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAccionista(false);
				
				this.jTableDatosAccionista.setRowSelectionInterval(this.getIndiceNuevoAccionista(), this.getIndiceNuevoAccionista());
				
				int iLastRow =  this.jTableDatosAccionista.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAccionista.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAccionista.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAccionista(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();									
		
			Accionista accionistaOrigen=new Accionista();
			Accionista accionistaDestino=new Accionista();
				
			accionistasSeleccionados=this.getAccionistasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAccionista.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || accionistasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAccionista.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaOrigen =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						accionistaOrigen =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionistaDestino =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						accionistaDestino =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				accionistaOrigen =accionistasSeleccionados.get(0);
				accionistaDestino =accionistasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAccionista(accionistaOrigen,accionistaDestino,true,false);
				
				accionistaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(accionistaDestino,accionistaLogic.getAccionistas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(accionistaDestino,accionistas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAccionista(false);
				
				//this.jTableDatosAccionista.setRowSelectionInterval(this.getIndiceNuevoAccionista(), this.getIndiceNuevoAccionista());
				
				int iLastRow =  this.jTableDatosAccionista.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAccionista.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAccionista.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAccionista(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAccionista.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAccionista.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAccionista.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAccionista.setVisible(!isVisible);
			this.jPanelPaginacionAccionista.setVisible(!isVisible);
			this.jPanelAccionesAccionista.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAccionista();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAccionista();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAccionista();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAccionista();
			
			this.abrirFrameOrderByAccionista();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAccionista();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAccionista(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAccionista);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAccionista.isMaximum()) {
					this.jInternalFrameDetalleFormAccionista.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAccionista.setSize(this.jInternalFrameDetalleFormAccionista.iWidthFormulario,this.jInternalFrameDetalleFormAccionista.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAccionista.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAccionista.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAccionista.isMaximum()) {
						this.jInternalFrameDetalleFormAccionista.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAccionista.jContentPaneDetalleAccionista.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAccionista.jContentPaneDetalleAccionista.getWidth(),AccionistaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAccionista.jContentPaneDetalleAccionista.getWidth(),AccionistaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAccionista.jContentPaneDetalleAccionista.getWidth(),AccionistaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAccionista.setVisible(true);
	        this.jInternalFrameDetalleFormAccionista.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAccionista() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAccionista==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAccionista=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAccionista,false,this);
				} else {
					this.jInternalFrameOrderByAccionista=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAccionista,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAccionista);
				this.jInternalFrameOrderByAccionista.setVisible(false);
				this.jInternalFrameOrderByAccionista.setSelected(false);
				
				this.jInternalFrameOrderByAccionista.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAccionista"));
				
				this.inicializarActualizarBindingTablaOrderByAccionista();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAccionista() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAccionista==null) {
				
				this.jInternalFrameImportacionAccionista=new ImportacionJInternalFrame(AccionistaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAccionista);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAccionista);
				this.jInternalFrameImportacionAccionista.setVisible(false);
				this.jInternalFrameImportacionAccionista.setSelected(false);


				this.jInternalFrameImportacionAccionista.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAccionista"));
				this.jInternalFrameImportacionAccionista.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAccionista"));
				this.jInternalFrameImportacionAccionista.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAccionista"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAccionista() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAccionista==null) {
				this.jInternalFrameReporteDinamicoAccionista=new ReporteDinamicoJInternalFrame(AccionistaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAccionista);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAccionista);
				this.jInternalFrameReporteDinamicoAccionista.setVisible(false);
				this.jInternalFrameReporteDinamicoAccionista.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAccionista.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAccionista"));
				this.jInternalFrameReporteDinamicoAccionista.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAccionista"));
				this.jInternalFrameReporteDinamicoAccionista.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAccionista"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAccionista();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAccionista() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAccionista);
			
	       	this.jInternalFrameDetalleFormAccionista.setVisible(false);
	        this.jInternalFrameDetalleFormAccionista.setSelected(false);
			
			//this.jInternalFrameDetalleFormAccionista.dispose();
			//this.jInternalFrameDetalleFormAccionista=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAccionista() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAccionista.setVisible(true);
	        this.jInternalFrameReporteDinamicoAccionista.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAccionista() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAccionista.setVisible(true);
	        this.jInternalFrameImportacionAccionista.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAccionista() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAccionista.setVisible(true);
	        this.jInternalFrameOrderByAccionista.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAccionista() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAccionista.setVisible(false);
	        this.jInternalFrameOrderByAccionista.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAccionista() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAccionista.setVisible(false);
	        this.jInternalFrameReporteDinamicoAccionista.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAccionista() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAccionista.setVisible(false);
	        this.jInternalFrameImportacionAccionista.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAccionista(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAccionista(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAccionista(true);
			//this.isEsNuevoAccionista=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAccionista("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAccionista(false) ;
			
			if(accionistaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AccionistaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAccionista(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAccionista(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAccionistaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAccionista(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAccionista(true);
			//this.isEsNuevoAccionista=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.accionista.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAccionista("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAccionista(false) ;
			
			if(AccionistaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAccionista(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAccionista(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.accionistaConstantesFunciones.cargaridclienteAccionista) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingAccionista(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAccionista.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoInversion(List<TipoInversion> tipoinversionsForeignKey)throws Exception{
		TableColumn tableColumnTipoInversion=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION));
		TableCellEditor tableCellEditorTipoInversion =tableColumnTipoInversion.getCellEditor();

		TipoInversionTableCell tipoinversionTableCellFk=(TipoInversionTableCell)tableCellEditorTipoInversion;

		if(tipoinversionTableCellFk!=null) {
			tipoinversionTableCellFk.settipoinversionsForeignKey(tipoinversionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAccionista.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoinversionTableCellFk.setRowActual(intSelectedRow);
			//tipoinversionTableCellFk.settipoinversionsForeignKeyActual(tipoinversionsForeignKey);
		//}


		if(tipoinversionTableCellFk!=null) {
			tipoinversionTableCellFk.RecargarTipoInversionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoIdentificacion(List<TipoIdentificacion> tipoidentificacionsForeignKey)throws Exception{
		TableColumn tableColumnTipoIdentificacion=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION));
		TableCellEditor tableCellEditorTipoIdentificacion =tableColumnTipoIdentificacion.getCellEditor();

		TipoIdentificacionTableCell tipoidentificacionTableCellFk=(TipoIdentificacionTableCell)tableCellEditorTipoIdentificacion;

		if(tipoidentificacionTableCellFk!=null) {
			tipoidentificacionTableCellFk.settipoidentificacionsForeignKey(tipoidentificacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAccionista.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoidentificacionTableCellFk.setRowActual(intSelectedRow);
			//tipoidentificacionTableCellFk.settipoidentificacionsForeignKeyActual(tipoidentificacionsForeignKey);
		//}


		if(tipoidentificacionTableCellFk!=null) {
			tipoidentificacionTableCellFk.RecargarTipoIdentificacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAccionista(false);
			
			//if(!this.isEsNuevoAccionista) {								
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				
			}
			
			if(this.permiteMantenimiento(this.accionista)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.accionistaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAccionista=true;
					this.inicializarActualizarBindingTablaAccionista(false);
					this.isEsNuevoAccionista=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAccionista=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAccionista=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAccionista(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAccionista(false);
				
				this.habilitarDeshabilitarControlesAccionista(false);
			
												
				
				if(AccionistaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAccionista();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAccionistaActionPerformed(evt,accionistaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAccionista(this.accionista,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAccionista.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,accionistaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.accionista.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAccionistaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				this.accionista.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				this.accionista.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.accionista)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.accionistaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AccionistaModel) this.jTableDatosAccionista.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAccionista=true;
				this.inicializarActualizarBindingTablaAccionista(false);
				this.isEsNuevoAccionista=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAccionista(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAccionista(false);
				
				this.habilitarDeshabilitarControlesAccionista(false);
				
				
				
				if(AccionistaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAccionista();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAccionistaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAccionista.getRowCount()>=1) {
				jTableDatosAccionista.removeRowSelectionInterval(0, jTableDatosAccionista.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAccionista(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAccionista(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAccionista(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAccionista(false) ;
			
			this.isEsNuevoAccionista=false;
			
			if(AccionistaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAccionista();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAccionistaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAccionista(false);
				
				//SI ES MANUAL
				if(AccionistaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAccionista();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAccionistaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAccionista--;			
			//Accionista accionistaAux= new Accionista();			
			//accionistaAux.setId(this.iIdNuevoAccionista);
			
			if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAccionista();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
			
			this.accionista.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.accionistaLogic.getAccionistas().add(this.accionistaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.accionistas.add(this.accionistaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAccionista(false);
			
			this.jTableDatosAccionista.setRowSelectionInterval(this.getIndiceNuevoAccionista(), this.getIndiceNuevoAccionista());
			
			int iLastRow =  this.jTableDatosAccionista.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAccionista.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAccionista.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAccionista(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAccionistaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAccionista(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAccionista(false);
			
			//SI ES MANUAL
			if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAccionista();
			}
			
			//this.abrirFrameTreeAccionista();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAccionistaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AccionistaS ?", "MANTENIMIENTO DE Accionista", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAccionista.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAccionista();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.accionistaReturnGeneral=accionistaLogic.procesarImportacionAccionistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.accionistaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAccionistaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAccionistaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAccionista.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAccionista.setFileImportacion(this.jInternalFrameImportacionAccionista.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAccionista.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAccionista.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAccionista.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAccionista.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAccionistaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		

		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AccionistaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AccionistaBaseDesign.jrxml";
			
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
			
			this.generarReporteAccionistas("Todos",accionistasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AccionistaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoInversion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoInversion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoInversion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoInversion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIdentificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIdentificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIdentificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIdentificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellidoPaterno_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellidoPaterno_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellidoPaterno_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellidoPaterno_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellidoMaterno_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellidoMaterno_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellidoMaterno_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellidoMaterno_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_imerNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_imerNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_imerNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_imerNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gundoNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gundoNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gundoNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gundoNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_NOMBRECORTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCorto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCorto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCorto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCorto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_PARTICIPACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rticipacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rticipacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rticipacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rticipacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionistaConstantesFunciones.LABEL_ESACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoAccionista.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAccionista.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AccionistaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION:
					sNombreCampoCategoria="idvalorclienteinversion";
					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					sNombreCampoCategoria="idvaloridentificacion";
					break;

				case AccionistaConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO:
					sNombreCampoCategoria="apellidopaterno";
					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO:
					sNombreCampoCategoria="apellidomaterno";
					break;

				case AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE:
					sNombreCampoCategoria="primernombre";
					break;

				case AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE:
					sNombreCampoCategoria="segundonombre";
					break;

				case AccionistaConstantesFunciones.LABEL_NOMBRECORTO:
					sNombreCampoCategoria="nombrecorto";
					break;

				case AccionistaConstantesFunciones.LABEL_PARTICIPACION:
					sNombreCampoCategoria="participacion";
					break;

				case AccionistaConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAccionista.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AccionistaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION:
					sNombreCampoCategoriaValor="idvalorclienteinversion";
					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					sNombreCampoCategoriaValor="idvaloridentificacion";
					break;

				case AccionistaConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO:
					sNombreCampoCategoriaValor="apellidopaterno";
					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO:
					sNombreCampoCategoriaValor="apellidomaterno";
					break;

				case AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE:
					sNombreCampoCategoriaValor="primernombre";
					break;

				case AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE:
					sNombreCampoCategoriaValor="segundonombre";
					break;

				case AccionistaConstantesFunciones.LABEL_NOMBRECORTO:
					sNombreCampoCategoriaValor="nombrecorto";
					break;

				case AccionistaConstantesFunciones.LABEL_PARTICIPACION:
					sNombreCampoCategoriaValor="participacion";
					break;

				case AccionistaConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAccionista.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAccionista.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AccionistaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Inversion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclienteinversion");
					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvaloridentificacion");
					break;

				case AccionistaConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido Paterno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellidopaterno");
					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido Materno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellidomaterno");
					break;

				case AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Primer Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"primernombre");
					break;

				case AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Segundo Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"segundonombre");
					break;

				case AccionistaConstantesFunciones.LABEL_NOMBRECORTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Corto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombrecorto");
					break;

				case AccionistaConstantesFunciones.LABEL_PARTICIPACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Participacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"participacion");
					break;

				case AccionistaConstantesFunciones.LABEL_ESACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoAccionistaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accionista";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Accionistas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AccionistaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.gettipoinversion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.gettipoidentificacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getapellidopaterno());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getapellidomaterno());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getprimernombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getsegundonombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_NOMBRECORTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_NOMBRECORTO);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getnombrecorto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_PARTICIPACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_PARTICIPACION);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getparticipacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionistaConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionistaConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(Accionista accionista:accionistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accionista.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelAccionista(row);				
			//	iRow++;
			//}				
			
			//for(Accionista accionistaAux:accionistasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAccionista(accionistaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
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
				this.accionistaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAccionista(false);
			
			//SI ES MANUAL
			if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAccionista();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAccionistaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAccionista(false);
			
			//SI ES MANUAL
			if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAccionista();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAccionistaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAccionista(false);
			
			//SI ES MANUAL
			if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAccionista();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAccionista() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAccionista.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAccionista.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAccionista.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAccionista.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAccionista.setMinimumSize(dimensionMinimum);
		this.jTableDatosAccionista.setMaximumSize(dimensionMaximum);
		this.jTableDatosAccionista.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAccionista(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAccionista(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAccionista(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAccionista(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAccionista(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAccionista(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAccionista(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAccionista(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AccionistaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAccionista() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAccionista();
		
		this.inicializarActualizarBindingBotonesManualAccionista(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAccionista();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAccionista() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAccionista(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAccionista(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAccionista.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAccionista.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAccionista.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAccionista!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAccionista.jCheckBoxPostAccionNuevoAccionista.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAccionista.jCheckBoxPostAccionSinCerrarAccionista.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAccionista.jCheckBoxPostAccionSinMensajeAccionista.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAccionista.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAccionista.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAccionista.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAccionista!=null) {
				this.jInternalFrameDetalleFormAccionista.jCheckBoxPostAccionNuevoAccionista.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAccionista.jCheckBoxPostAccionSinCerrarAccionista.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAccionista.jCheckBoxPostAccionSinMensajeAccionista.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAccionista.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAccionista.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAccionista!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAccionista.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAccionista!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAccionista.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAccionista.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAccionista.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAccionista.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAccionista!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAccionista.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAccionista.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAccionista(Boolean esInicializar) throws Exception {
		try	{	
			if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAccionista(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAccionista() throws Exception {
		try	{
			if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAccionista();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAccionista() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAccionista() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAccionista.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAccionista.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAccionista.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAccionista.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAccionista.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAccionista.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAccionista.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAccionista.addItem(reporte);
			}
			
			
			if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAccionista.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAccionista.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAccionista.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAccionista.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAccionista.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAccionista.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAccionista.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAccionista.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAccionista.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAccionista();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAccionista() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAccionista!=null) {
				this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAccionista!=null) {
				this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAccionista.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAccionista!=null) {
				
				if(this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAccionista.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAccionista.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAccionista.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAccionista.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAccionista()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.getSelectedItem()!=null){this.idclienteBusquedaPorIdClientePorNombreCorto=((Cliente)this.jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.getSelectedItem()).getId();}
		this.nombrecortoBusquedaPorIdClientePorNombreCorto=this.jTextAreanombrecortoBusquedaPorIdClientePorNombreCortoAccionista.getText();
		if(this.jComboBoxidclienteFK_IdClienteAccionista.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteAccionista.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.getSelectedItem()!=null){this.idvalorclienteinversionFK_IdValorClienteInversion=((TipoInversion)this.jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.getSelectedItem()).getId();}
		if(this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.getSelectedItem()!=null){this.idvaloridentificacionFK_IdValorIdentificacion=((TipoIdentificacion)this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAccionista(Boolean esInicializar) throws Exception {				
		if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAccionista();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAccionista() throws Exception {
		this.inicializarActualizarBindingTablaAccionista(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAccionista() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAccionistaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionistaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAccionista(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=accionistaLogic.getAccionistas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=accionistas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAccionista.setModel(new AccionistaModel(this.accionistaLogic.getAccionistas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAccionista.setModel(new AccionistaModel(this.accionistas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAccionista!=null && this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAccionista();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AccionistaConstantesFunciones.SCLASSWEBTITULO,accionistaConstantesFunciones.resaltarSeleccionarAccionista,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AccionistaConstantesFunciones.SCLASSWEBTITULO,accionistaConstantesFunciones.resaltarSeleccionarAccionista,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_ID));

		if(this.accionistaConstantesFunciones.mostraridAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.accionistaConstantesFunciones.resaltaridAccionista,this.accionistaConstantesFunciones.activaridAccionista,this,true,"idAccionista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionistaConstantesFunciones.resaltaridAccionista,this.accionistaConstantesFunciones.activaridAccionista,this,true,"idAccionista","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_IDCLIENTE));

		if(this.accionistaConstantesFunciones.mostraridclienteAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.accionistaConstantesFunciones.resaltaridclienteAccionista,this,this.accionistaConstantesFunciones.activaridclienteAccionista));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.accionistaConstantesFunciones.resaltaridclienteAccionista,this,this.accionistaConstantesFunciones.activaridclienteAccionista,true,"idclienteAccionista","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION));

		if(this.accionistaConstantesFunciones.mostraridvalorclienteinversionAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoInversionTableCell(this.tipoinversionsForeignKey,this.accionistaConstantesFunciones.resaltaridvalorclienteinversionAccionista,this,this.accionistaConstantesFunciones.activaridvalorclienteinversionAccionista));
			tableColumn.setCellEditor(new TipoInversionTableCell(this.tipoinversionsForeignKey,this.accionistaConstantesFunciones.resaltaridvalorclienteinversionAccionista,this,this.accionistaConstantesFunciones.activaridvalorclienteinversionAccionista,true,"idvalorclienteinversionAccionista","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION));

		if(this.accionistaConstantesFunciones.mostraridvaloridentificacionAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIdentificacionTableCell(this.tipoidentificacionsForeignKey,this.accionistaConstantesFunciones.resaltaridvaloridentificacionAccionista,this,this.accionistaConstantesFunciones.activaridvaloridentificacionAccionista));
			tableColumn.setCellEditor(new TipoIdentificacionTableCell(this.tipoidentificacionsForeignKey,this.accionistaConstantesFunciones.resaltaridvaloridentificacionAccionista,this,this.accionistaConstantesFunciones.activaridvaloridentificacionAccionista,true,"idvaloridentificacionAccionista","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.accionistaConstantesFunciones.mostraridentificacionAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionistaConstantesFunciones.resaltaridentificacionAccionista,this.accionistaConstantesFunciones.activaridentificacionAccionista,this,true,"identificacionAccionista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionistaConstantesFunciones.resaltaridentificacionAccionista,this.accionistaConstantesFunciones.activaridentificacionAccionista,this,true,"identificacionAccionista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO));

		if(this.accionistaConstantesFunciones.mostrarapellidopaternoAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionistaConstantesFunciones.resaltarapellidopaternoAccionista,this.accionistaConstantesFunciones.activarapellidopaternoAccionista,this,true,"apellidopaternoAccionista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionistaConstantesFunciones.resaltarapellidopaternoAccionista,this.accionistaConstantesFunciones.activarapellidopaternoAccionista,this,true,"apellidopaternoAccionista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO));

		if(this.accionistaConstantesFunciones.mostrarapellidomaternoAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionistaConstantesFunciones.resaltarapellidomaternoAccionista,this.accionistaConstantesFunciones.activarapellidomaternoAccionista,this,true,"apellidomaternoAccionista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionistaConstantesFunciones.resaltarapellidomaternoAccionista,this.accionistaConstantesFunciones.activarapellidomaternoAccionista,this,true,"apellidomaternoAccionista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE));

		if(this.accionistaConstantesFunciones.mostrarprimernombreAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionistaConstantesFunciones.resaltarprimernombreAccionista,this.accionistaConstantesFunciones.activarprimernombreAccionista,this,true,"primernombreAccionista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionistaConstantesFunciones.resaltarprimernombreAccionista,this.accionistaConstantesFunciones.activarprimernombreAccionista,this,true,"primernombreAccionista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE));

		if(this.accionistaConstantesFunciones.mostrarsegundonombreAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionistaConstantesFunciones.resaltarsegundonombreAccionista,this.accionistaConstantesFunciones.activarsegundonombreAccionista,this,true,"segundonombreAccionista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionistaConstantesFunciones.resaltarsegundonombreAccionista,this.accionistaConstantesFunciones.activarsegundonombreAccionista,this,true,"segundonombreAccionista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_NOMBRECORTO));

		if(this.accionistaConstantesFunciones.mostrarnombrecortoAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_NOMBRECORTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionistaConstantesFunciones.resaltarnombrecortoAccionista,this.accionistaConstantesFunciones.activarnombrecortoAccionista,this,true,"nombrecortoAccionista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionistaConstantesFunciones.resaltarnombrecortoAccionista,this.accionistaConstantesFunciones.activarnombrecortoAccionista,this,true,"nombrecortoAccionista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_PARTICIPACION));

		if(this.accionistaConstantesFunciones.mostrarparticipacionAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_PARTICIPACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.accionistaConstantesFunciones.resaltarparticipacionAccionista,this.accionistaConstantesFunciones.activarparticipacionAccionista,this,true,"participacionAccionista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionistaConstantesFunciones.resaltarparticipacionAccionista,this.accionistaConstantesFunciones.activarparticipacionAccionista,this,true,"participacionAccionista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionista,AccionistaConstantesFunciones.LABEL_ESACTIVO));

		if(this.accionistaConstantesFunciones.mostraresactivoAccionista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionistaConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.accionistaConstantesFunciones.resaltaresactivoAccionista,this.accionistaConstantesFunciones.activaresactivoAccionista));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.accionistaConstantesFunciones.resaltaresactivoAccionista,this.accionistaConstantesFunciones.activaresactivoAccionista,this,true,"esactivoAccionista","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AccionistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.accionistaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.accionistaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAccionista.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.accionistaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.accionistaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAccionista.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAccionista && this.isPermisoGuardarCambiosAccionista) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.accionistaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.accionistaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAccionista.addColumn(tableColumn);
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
			
			this.jTableDatosAccionista.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAccionista && this.isPermisoGuardarCambiosAccionista) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAccionista && this.isPermisoGuardarCambiosAccionista) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAccionista.moveColumn(this.jTableDatosAccionista.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAccionista.moveColumn(this.jTableDatosAccionista.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAccionista.moveColumn(this.jTableDatosAccionista.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAccionista.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAccionista.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAccionista,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAccionista.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAccionista.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAccionista.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAccionista.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAccionista.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=accionistaLogic.getAccionistas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=accionistas.size()-1;
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
		//this.jTableDatosAccionista.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAccionista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAccionista();
			
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
				
				//this.isEsNuevoAccionista=false;
					
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
				if(this.accionistaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAccionista==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAccionista.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAccionista.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.accionista.getsType().equals("DUPLICADO")
				   || this.accionista.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAccionista=true;
				
				} else {
					this.isEsNuevoAccionista=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
					if(this.accionista.getId()>=0 && !this.accionista.getIsNew()) {						
						this.isEsNuevoAccionista=false;
						
					} else {
						this.isEsNuevoAccionista=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAccionista(esRelaciones);						
				
				this.seleccionarAccionista(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.accionista.getId()<0) {
					this.isEsNuevoAccionista=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAccionista(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAccionista(evt,rowIndex);
				}	
				
				if(this.accionistaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Accionista: " + this.dDif); 
					}
				}								
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAccionista(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.accionista)) {
					if(this.accionista.getId()>0) {
						this.accionista.setIsDeleted(true);
						
						this.accionistasEliminados.add(this.accionista);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.accionistaLogic.getAccionistas().remove(this.accionista);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.accionistas.remove(this.accionista);				
					}
					
					
					((AccionistaModel) this.jTableDatosAccionista.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAccionista(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAccionista(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAccionista) {
			
			if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAccionista.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAccionista.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAccionista(this.accionista);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.accionistaConstantesFunciones.cargaridclienteAccionista || this.accionistaConstantesFunciones.event_dependidclienteAccionista) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.accionista.getidcliente());
									//this.inicializarActualizarBindingAccionista(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(accionista.getCliente()!=null) {
							this.clientesForeignKey.add(accionista.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.accionista.getidcliente(),false,"Formulario");

					//TipoInversion
					if(!this.accionistaConstantesFunciones.cargaridvalorclienteinversionAccionista || this.accionistaConstantesFunciones.event_dependidvalorclienteinversionAccionista) {
						//this.cargarCombosTipoInversionsForeignKeyLista(" where id="+this.accionista.getidvalorclienteinversion());
									//this.inicializarActualizarBindingAccionista(false,false);
						this.tipoinversionsForeignKey=new ArrayList<TipoInversion>();

						if(accionista.getTipoInversion()!=null) {
							this.tipoinversionsForeignKey.add(accionista.getTipoInversion());
						}

						this.addItemDefectoCombosForeignKeyTipoInversion();
						this.cargarCombosFrameTipoInversionsForeignKey("Todos");
					}
					this.setActualTipoInversionForeignKey(this.accionista.getidvalorclienteinversion(),false,"Formulario");

					//TipoIdentificacion
					if(!this.accionistaConstantesFunciones.cargaridvaloridentificacionAccionista || this.accionistaConstantesFunciones.event_dependidvaloridentificacionAccionista) {
						//this.cargarCombosTipoIdentificacionsForeignKeyLista(" where id="+this.accionista.getidvaloridentificacion());
									//this.inicializarActualizarBindingAccionista(false,false);
						this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>();

						if(accionista.getTipoIdentificacion()!=null) {
							this.tipoidentificacionsForeignKey.add(accionista.getTipoIdentificacion());
						}

						this.addItemDefectoCombosForeignKeyTipoIdentificacion();
						this.cargarCombosFrameTipoIdentificacionsForeignKey("Todos");
					}
					this.setActualTipoIdentificacionForeignKey(this.accionista.getidvaloridentificacion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAccionista("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAccionista(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAccionista() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAccionista(Accionista accionista) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAccionista(accionista,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAccionista(Accionista accionista,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAccionista(accionista);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAccionista(accionista,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAccionista(accionista);
	}
	
	public void setVariablesObjetoActualToFormularioAccionista(Accionista accionista) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.setText(accionista.getId().toString());
			this.jInternalFrameDetalleFormAccionista.jTextFieldidentificacionAccionista.setText(accionista.getidentificacion());
			this.jInternalFrameDetalleFormAccionista.jTextAreaapellidopaternoAccionista.setText(accionista.getapellidopaterno());
			this.jInternalFrameDetalleFormAccionista.jTextAreaapellidomaternoAccionista.setText(accionista.getapellidomaterno());
			this.jInternalFrameDetalleFormAccionista.jTextAreaprimernombreAccionista.setText(accionista.getprimernombre());
			this.jInternalFrameDetalleFormAccionista.jTextAreasegundonombreAccionista.setText(accionista.getsegundonombre());
			this.jInternalFrameDetalleFormAccionista.jTextAreanombrecortoAccionista.setText(accionista.getnombrecorto());
			this.jInternalFrameDetalleFormAccionista.jTextFieldparticipacionAccionista.setText(accionista.getparticipacion().toString());
			this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.setSelected(accionista.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Accionista accionistaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,accionistaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Accionista accionistaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				accionistaLocal=this.accionista;
			} else {
				accionistaLocal=this.accionistaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(accionistaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAccionista(accionistaLocal,true);
					
					if(accionistaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(accionistaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(accionistaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAccionista(Accionista accionista,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAccionista(accionista,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAccionista(accionista);
	}
	
	public void setVariablesFormularioToObjetoActualAccionista(Accionista accionista,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAccionista(accionista,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAccionista(Accionista accionista,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.getText()==null || this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.getText()=="" || this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.getText()=="Id") {
				this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.setText("0");
			}

			if(conColumnasBase) {accionista.setId(Long.parseLong(this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelIdAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accionista.setidentificacion(this.jInternalFrameDetalleFormAccionista.jTextFieldidentificacionAccionista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelidentificacionAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accionista.setapellidopaterno(this.jInternalFrameDetalleFormAccionista.jTextAreaapellidopaternoAccionista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelapellidopaternoAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accionista.setapellidomaterno(this.jInternalFrameDetalleFormAccionista.jTextAreaapellidomaternoAccionista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelapellidomaternoAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accionista.setprimernombre(this.jInternalFrameDetalleFormAccionista.jTextAreaprimernombreAccionista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelprimernombreAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accionista.setsegundonombre(this.jInternalFrameDetalleFormAccionista.jTextAreasegundonombreAccionista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelsegundonombreAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accionista.setnombrecorto(this.jInternalFrameDetalleFormAccionista.jTextAreanombrecortoAccionista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_NOMBRECORTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelnombrecortoAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accionista.setparticipacion(Integer.parseInt(this.jInternalFrameDetalleFormAccionista.jTextFieldparticipacionAccionista.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_PARTICIPACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelparticipacionAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accionista.setesactivo(this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionistaConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccionista.jLabelesactivoAccionista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAccionista(Accionista accionistaBean,Accionista accionista,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && accionistaBean.getidcliente()!=null && !accionistaBean.getidcliente().equals(-1L))) {accionista.setidcliente(accionistaBean.getidcliente());}
			if(conDefault || (!conDefault && accionistaBean.getidvalorclienteinversion()!=null && !accionistaBean.getidvalorclienteinversion().equals(-1L))) {accionista.setidvalorclienteinversion(accionistaBean.getidvalorclienteinversion());}
			if(conDefault || (!conDefault && accionistaBean.getidvaloridentificacion()!=null && !accionistaBean.getidvaloridentificacion().equals(-1L))) {accionista.setidvaloridentificacion(accionistaBean.getidvaloridentificacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAccionista(Accionista accionistaOrigen,Accionista accionista,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && accionistaOrigen.getId()!=null && !accionistaOrigen.getId().equals(0L))) {accionista.setId(accionistaOrigen.getId());}}
			if(conDefault || (!conDefault && accionistaOrigen.getidcliente()!=null && !accionistaOrigen.getidcliente().equals(-1L))) {accionista.setidcliente(accionistaOrigen.getidcliente());}
			if(conDefault || (!conDefault && accionistaOrigen.getidvalorclienteinversion()!=null && !accionistaOrigen.getidvalorclienteinversion().equals(-1L))) {accionista.setidvalorclienteinversion(accionistaOrigen.getidvalorclienteinversion());}
			if(conDefault || (!conDefault && accionistaOrigen.getidvaloridentificacion()!=null && !accionistaOrigen.getidvaloridentificacion().equals(-1L))) {accionista.setidvaloridentificacion(accionistaOrigen.getidvaloridentificacion());}
			if(conDefault || (!conDefault && accionistaOrigen.getidentificacion()!=null && !accionistaOrigen.getidentificacion().equals(""))) {accionista.setidentificacion(accionistaOrigen.getidentificacion());}
			if(conDefault || (!conDefault && accionistaOrigen.getapellidopaterno()!=null && !accionistaOrigen.getapellidopaterno().equals(""))) {accionista.setapellidopaterno(accionistaOrigen.getapellidopaterno());}
			if(conDefault || (!conDefault && accionistaOrigen.getapellidomaterno()!=null && !accionistaOrigen.getapellidomaterno().equals(""))) {accionista.setapellidomaterno(accionistaOrigen.getapellidomaterno());}
			if(conDefault || (!conDefault && accionistaOrigen.getprimernombre()!=null && !accionistaOrigen.getprimernombre().equals(""))) {accionista.setprimernombre(accionistaOrigen.getprimernombre());}
			if(conDefault || (!conDefault && accionistaOrigen.getsegundonombre()!=null && !accionistaOrigen.getsegundonombre().equals(""))) {accionista.setsegundonombre(accionistaOrigen.getsegundonombre());}
			if(conDefault || (!conDefault && accionistaOrigen.getnombrecorto()!=null && !accionistaOrigen.getnombrecorto().equals(""))) {accionista.setnombrecorto(accionistaOrigen.getnombrecorto());}
			if(conDefault || (!conDefault && accionistaOrigen.getparticipacion()!=null && !accionistaOrigen.getparticipacion().equals(0))) {accionista.setparticipacion(accionistaOrigen.getparticipacion());}
			if(conDefault || (!conDefault && accionistaOrigen.getesactivo()!=null && !accionistaOrigen.getesactivo().equals(false))) {accionista.setesactivo(accionistaOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAccionista(Accionista accionista) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.setText(accionista.getId().toString());
			this.jInternalFrameDetalleFormAccionista.jTextFieldidentificacionAccionista.setText(accionista.getidentificacion());
			this.jInternalFrameDetalleFormAccionista.jTextAreaapellidopaternoAccionista.setText(accionista.getapellidopaterno());
			this.jInternalFrameDetalleFormAccionista.jTextAreaapellidomaternoAccionista.setText(accionista.getapellidomaterno());
			this.jInternalFrameDetalleFormAccionista.jTextAreaprimernombreAccionista.setText(accionista.getprimernombre());
			this.jInternalFrameDetalleFormAccionista.jTextAreasegundonombreAccionista.setText(accionista.getsegundonombre());
			this.jInternalFrameDetalleFormAccionista.jTextAreanombrecortoAccionista.setText(accionista.getnombrecorto());
			this.jInternalFrameDetalleFormAccionista.jTextFieldparticipacionAccionista.setText(accionista.getparticipacion().toString());
			this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.setSelected(accionista.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAccionista(AccionistaBean accionistaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.setText(accionistaBean.getId().toString());
			this.jInternalFrameDetalleFormAccionista.jTextFieldidentificacionAccionista.setText(accionistaBean.getidentificacion());
			this.jInternalFrameDetalleFormAccionista.jTextAreaapellidopaternoAccionista.setText(accionistaBean.getapellidopaterno());
			this.jInternalFrameDetalleFormAccionista.jTextAreaapellidomaternoAccionista.setText(accionistaBean.getapellidomaterno());
			this.jInternalFrameDetalleFormAccionista.jTextAreaprimernombreAccionista.setText(accionistaBean.getprimernombre());
			this.jInternalFrameDetalleFormAccionista.jTextAreasegundonombreAccionista.setText(accionistaBean.getsegundonombre());
			this.jInternalFrameDetalleFormAccionista.jTextAreanombrecortoAccionista.setText(accionistaBean.getnombrecorto());
			this.jInternalFrameDetalleFormAccionista.jTextFieldparticipacionAccionista.setText(accionistaBean.getparticipacion().toString());
			this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.setSelected(accionistaBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAccionista(AccionistaParameterReturnGeneral accionistaReturnGeneral,AccionistaBean accionistaBean,Boolean conDefault) throws Exception { 
		try {
			Accionista accionistaLocal=new Accionista();
			
			accionistaLocal=accionistaReturnGeneral.getAccionista();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && accionistaLocal.getId()!=null && !accionistaLocal.getId().equals(0L))) {accionistaBean.setId(accionistaLocal.getId());}}
			if(conDefault || (!conDefault && accionistaLocal.getidcliente()!=null && !accionistaLocal.getidcliente().equals(-1L))) {accionistaBean.setidcliente(accionistaLocal.getidcliente());}
			if(conDefault || (!conDefault && accionistaLocal.getidvalorclienteinversion()!=null && !accionistaLocal.getidvalorclienteinversion().equals(-1L))) {accionistaBean.setidvalorclienteinversion(accionistaLocal.getidvalorclienteinversion());}
			if(conDefault || (!conDefault && accionistaLocal.getidvaloridentificacion()!=null && !accionistaLocal.getidvaloridentificacion().equals(-1L))) {accionistaBean.setidvaloridentificacion(accionistaLocal.getidvaloridentificacion());}
			if(conDefault || (!conDefault && accionistaLocal.getidentificacion()!=null && !accionistaLocal.getidentificacion().equals(""))) {accionistaBean.setidentificacion(accionistaLocal.getidentificacion());}
			if(conDefault || (!conDefault && accionistaLocal.getapellidopaterno()!=null && !accionistaLocal.getapellidopaterno().equals(""))) {accionistaBean.setapellidopaterno(accionistaLocal.getapellidopaterno());}
			if(conDefault || (!conDefault && accionistaLocal.getapellidomaterno()!=null && !accionistaLocal.getapellidomaterno().equals(""))) {accionistaBean.setapellidomaterno(accionistaLocal.getapellidomaterno());}
			if(conDefault || (!conDefault && accionistaLocal.getprimernombre()!=null && !accionistaLocal.getprimernombre().equals(""))) {accionistaBean.setprimernombre(accionistaLocal.getprimernombre());}
			if(conDefault || (!conDefault && accionistaLocal.getsegundonombre()!=null && !accionistaLocal.getsegundonombre().equals(""))) {accionistaBean.setsegundonombre(accionistaLocal.getsegundonombre());}
			if(conDefault || (!conDefault && accionistaLocal.getnombrecorto()!=null && !accionistaLocal.getnombrecorto().equals(""))) {accionistaBean.setnombrecorto(accionistaLocal.getnombrecorto());}
			if(conDefault || (!conDefault && accionistaLocal.getparticipacion()!=null && !accionistaLocal.getparticipacion().equals(0))) {accionistaBean.setparticipacion(accionistaLocal.getparticipacion());}
			if(conDefault || (!conDefault && accionistaLocal.getesactivo()!=null && !accionistaLocal.getesactivo().equals(false))) {accionistaBean.setesactivo(accionistaLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAccionistaGenerico(Long idAccionistaSeleccionado,JComboBox jComboBoxAccionista,List<Accionista> accionistasLocal)throws Exception {
		try {
			Accionista  accionistaTemp=null;

			for(Accionista accionistaAux:accionistasLocal) {
				if(accionistaAux.getId()!=null && accionistaAux.getId().equals(idAccionistaSeleccionado)) {
					accionistaTemp=accionistaAux;
					break;
				}
			}

			jComboBoxAccionista.setSelectedItem(accionistaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAccionistaGenerico(JComboBox jComboBoxAccionista,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAccionista.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAccionista.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAccionista.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAccionista.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAccionista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAccionista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			accionista=(Accionista) accionistaLogic.getAccionistas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			accionista =(Accionista) accionistas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!accionista.getIsNew() && !accionista.getIsChanged() && !accionista.getIsDeleted()) {
				sDescripcion=accionista.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=accionista.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoInversion")) {
			//sDescripcion=this.getActualTipoInversionForeignKeyDescripcion((Long)value);
			if(!accionista.getIsNew() && !accionista.getIsChanged() && !accionista.getIsDeleted()) {
				sDescripcion=accionista.gettipoinversion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoInversionForeignKeyDescripcion((Long)value);
				sDescripcion=accionista.gettipoinversion_descripcion();
			}
		}

		if(sTipo.equals("TipoIdentificacion")) {
			//sDescripcion=this.getActualTipoIdentificacionForeignKeyDescripcion((Long)value);
			if(!accionista.getIsNew() && !accionista.getIsChanged() && !accionista.getIsDeleted()) {
				sDescripcion=accionista.gettipoidentificacion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIdentificacionForeignKeyDescripcion((Long)value);
				sDescripcion=accionista.gettipoidentificacion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Accionista accionistaRow=new Accionista();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			accionistaRow=(Accionista) accionistaLogic.getAccionistas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			accionistaRow=(Accionista) accionistas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAccionista(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAccionista.setVisible((this.isVisibilidadCeldaNuevoAccionista && this.isPermisoNuevoAccionista));			
			this.jButtonDuplicarAccionista.setVisible((this.isVisibilidadCeldaDuplicarAccionista && this.isPermisoDuplicarAccionista));			
			this.jButtonCopiarAccionista.setVisible((this.isVisibilidadCeldaCopiarAccionista && this.isPermisoCopiarAccionista));
			this.jButtonVerFormAccionista.setVisible((this.isVisibilidadCeldaVerFormAccionista && this.isPermisoVerFormAccionista));
			
			this.jButtonAbrirOrderByAccionista.setVisible((this.isVisibilidadCeldaOrdenAccionista && this.isPermisoOrdenAccionista));			
			
			this.jButtonNuevoRelacionesAccionista.setVisible((this.isVisibilidadCeldaNuevoRelacionesAccionista && this.isPermisoNuevoAccionista));			
			this.jButtonNuevoGuardarCambiosAccionista.setVisible((this.isVisibilidadCeldaNuevoAccionista && this.isPermisoNuevoAccionista && this.isPermisoGuardarCambiosAccionista));
			
			if(this.jInternalFrameDetalleFormAccionista!=null) {
			this.jInternalFrameDetalleFormAccionista.jButtonModificarAccionista.setVisible((this.isVisibilidadCeldaModificarAccionista && this.isPermisoActualizarAccionista));	
			this.jInternalFrameDetalleFormAccionista.jButtonActualizarAccionista.setVisible((this.isVisibilidadCeldaActualizarAccionista && this.isPermisoActualizarAccionista));	
			this.jInternalFrameDetalleFormAccionista.jButtonEliminarAccionista.setVisible((this.isVisibilidadCeldaEliminarAccionista && this.isPermisoEliminarAccionista));
			this.jInternalFrameDetalleFormAccionista.jButtonCancelarAccionista.setVisible(this.isVisibilidadCeldaCancelarAccionista);							
			this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosAccionista.setVisible((this.isVisibilidadCeldaGuardarAccionista && this.isPermisoGuardarCambiosAccionista));			
			
			}
						
			this.jButtonGuardarCambiosTablaAccionista.setVisible((this.isVisibilidadCeldaGuardarCambiosAccionista && this.isPermisoGuardarCambiosAccionista));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAccionista.setVisible((this.isVisibilidadCeldaNuevoAccionista && this.isPermisoNuevoAccionista));						
			this.jButtonDuplicarToolBarAccionista.setVisible((this.isVisibilidadCeldaDuplicarAccionista && this.isPermisoDuplicarAccionista));						
			this.jButtonCopiarToolBarAccionista.setVisible((this.isVisibilidadCeldaCopiarAccionista && this.isPermisoCopiarAccionista));			
			this.jButtonVerFormToolBarAccionista.setVisible((this.isVisibilidadCeldaVerFormAccionista && this.isPermisoVerFormAccionista));			
			this.jButtonAbrirOrderByToolBarAccionista.setVisible((this.isVisibilidadCeldaOrdenAccionista && this.isPermisoOrdenAccionista));
			this.jButtonNuevoRelacionesToolBarAccionista.setVisible((this.isVisibilidadCeldaNuevoRelacionesAccionista && this.isPermisoNuevoAccionista));			
			this.jButtonNuevoGuardarCambiosToolBarAccionista.setVisible((this.isVisibilidadCeldaNuevoAccionista && this.isPermisoNuevoAccionista && this.isPermisoGuardarCambiosAccionista));			
			
			if(this.jInternalFrameDetalleFormAccionista!=null) {
			this.jInternalFrameDetalleFormAccionista.jButtonModificarToolBarAccionista.setVisible((this.isVisibilidadCeldaModificarAccionista && this.isPermisoActualizarAccionista));	
			this.jInternalFrameDetalleFormAccionista.jButtonActualizarToolBarAccionista.setVisible((this.isVisibilidadCeldaActualizarAccionista  && this.isPermisoActualizarAccionista));	
			this.jInternalFrameDetalleFormAccionista.jButtonEliminarToolBarAccionista.setVisible((this.isVisibilidadCeldaEliminarAccionista && this.isPermisoEliminarAccionista));
			this.jInternalFrameDetalleFormAccionista.jButtonCancelarToolBarAccionista.setVisible(this.isVisibilidadCeldaCancelarAccionista);				
			this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosToolBarAccionista.setVisible((this.isVisibilidadCeldaGuardarAccionista && this.isPermisoGuardarCambiosAccionista));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAccionista.setVisible((this.isVisibilidadCeldaGuardarCambiosAccionista && this.isPermisoGuardarCambiosAccionista));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAccionista.setVisible((this.isVisibilidadCeldaNuevoAccionista && this.isPermisoNuevoAccionista));			
			this.jMenuItemDuplicarAccionista.setVisible((this.isVisibilidadCeldaDuplicarAccionista && this.isPermisoDuplicarAccionista));			
			this.jMenuItemCopiarAccionista.setVisible((this.isVisibilidadCeldaCopiarAccionista && this.isPermisoCopiarAccionista));			
			this.jMenuItemVerFormAccionista.setVisible((this.isVisibilidadCeldaVerFormAccionista && this.isPermisoVerFormAccionista));			
			this.jMenuItemAbrirOrderByAccionista.setVisible((this.isVisibilidadCeldaOrdenAccionista && this.isPermisoOrdenAccionista));			
			//this.jMenuItemMostrarOcultarAccionista.setVisible((this.isVisibilidadCeldaOrdenAccionista && this.isPermisoOrdenAccionista));
			this.jMenuItemDetalleAbrirOrderByAccionista.setVisible((this.isVisibilidadCeldaOrdenAccionista && this.isPermisoOrdenAccionista));			
			//this.jMenuItemDetalleMostrarOcultarAccionista.setVisible((this.isVisibilidadCeldaOrdenAccionista && this.isPermisoOrdenAccionista));			
			this.jMenuItemNuevoRelacionesAccionista.setVisible((this.isVisibilidadCeldaNuevoRelacionesAccionista && this.isPermisoNuevoAccionista));			
			this.jMenuItemNuevoGuardarCambiosAccionista.setVisible((this.isVisibilidadCeldaNuevoAccionista && this.isPermisoNuevoAccionista && this.isPermisoGuardarCambiosAccionista));									
			
			if(this.jInternalFrameDetalleFormAccionista!=null) {
			this.jInternalFrameDetalleFormAccionista.jMenuItemModificarAccionista.setVisible((this.isVisibilidadCeldaModificarAccionista && this.isPermisoActualizarAccionista));	
			this.jInternalFrameDetalleFormAccionista.jMenuItemActualizarAccionista.setVisible((this.isVisibilidadCeldaActualizarAccionista && this.isPermisoActualizarAccionista));	
			this.jInternalFrameDetalleFormAccionista.jMenuItemEliminarAccionista.setVisible((this.isVisibilidadCeldaEliminarAccionista && this.isPermisoEliminarAccionista));
			this.jInternalFrameDetalleFormAccionista.jMenuItemCancelarAccionista.setVisible(this.isVisibilidadCeldaCancelarAccionista);				
			}
			
			this.jMenuItemGuardarCambiosAccionista.setVisible((this.isVisibilidadCeldaGuardarAccionista && this.isPermisoGuardarCambiosAccionista));						
			this.jMenuItemGuardarCambiosTablaAccionista.setVisible((this.isVisibilidadCeldaGuardarCambiosAccionista && this.isPermisoGuardarCambiosAccionista));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAccionista=this.jButtonNuevoAccionista.isVisible();
			this.isVisibilidadCeldaDuplicarAccionista=this.jButtonDuplicarAccionista.isVisible();
			this.isVisibilidadCeldaCopiarAccionista=this.jButtonCopiarAccionista.isVisible();
			this.isVisibilidadCeldaVerFormAccionista=this.jButtonVerFormAccionista.isVisible();
			
			this.isVisibilidadCeldaOrdenAccionista=this.jButtonAbrirOrderByAccionista.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAccionista=this.jButtonNuevoRelacionesAccionista.isVisible();
			this.isVisibilidadCeldaModificarAccionista=this.jButtonModificarAccionista.isVisible();
			
			if(this.jInternalFrameDetalleFormAccionista!=null) {
			this.isVisibilidadCeldaActualizarAccionista=this.jInternalFrameDetalleFormAccionista.jButtonActualizarAccionista.isVisible();
			this.isVisibilidadCeldaEliminarAccionista=this.jInternalFrameDetalleFormAccionista.jButtonEliminarAccionista.isVisible();
			this.isVisibilidadCeldaCancelarAccionista=this.jInternalFrameDetalleFormAccionista.jButtonCancelarAccionista.isVisible();
			this.isVisibilidadCeldaGuardarAccionista=this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosAccionista.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAccionista=this.jButtonGuardarCambiosTablaAccionista.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAccionista=this.jButtonNuevoToolBarAccionista.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAccionista=this.jButtonNuevoRelacionesToolBarAccionista.isVisible();
			
			if(this.jInternalFrameDetalleFormAccionista!=null) {
			this.isVisibilidadCeldaModificarAccionista=this.jInternalFrameDetalleFormAccionista.jButtonModificarToolBarAccionista.isVisible();
			this.isVisibilidadCeldaActualizarAccionista=this.jInternalFrameDetalleFormAccionista.jButtonActualizarToolBarAccionista.isVisible();
			this.isVisibilidadCeldaEliminarAccionista=this.jInternalFrameDetalleFormAccionista.jButtonEliminarToolBarAccionista.isVisible();
			this.isVisibilidadCeldaCancelarAccionista=this.jInternalFrameDetalleFormAccionista.jButtonCancelarToolBarAccionista.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAccionista=this.jButtonGuardarCambiosToolBarAccionista.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAccionista=this.jButtonGuardarCambiosTablaToolBarAccionista.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAccionista=this.jMenuItemNuevoAccionista.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAccionista=this.jMenuItemNuevoRelacionesAccionista.isVisible();
			
			if(this.jInternalFrameDetalleFormAccionista!=null) {
			this.isVisibilidadCeldaModificarAccionista=this.jInternalFrameDetalleFormAccionista.jMenuItemModificarAccionista.isVisible();
			this.isVisibilidadCeldaActualizarAccionista=this.jInternalFrameDetalleFormAccionista.jMenuItemActualizarAccionista.isVisible();
			this.isVisibilidadCeldaEliminarAccionista=this.jInternalFrameDetalleFormAccionista.jMenuItemEliminarAccionista.isVisible();
			this.isVisibilidadCeldaCancelarAccionista=this.jInternalFrameDetalleFormAccionista.jMenuItemCancelarAccionista.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAccionista=this.jMenuItemGuardarCambiosAccionista.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAccionista=this.jMenuItemGuardarCambiosTablaAccionista.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAccionista(Boolean esInicializar) {
		if(AccionistaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.accionistaSessionBean.getConGuardarRelaciones()) {
				//if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAccionista();
			}
			
			this.inicializarActualizarBindingBotonesManualAccionista(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAccionista() {
		this.jButtonNuevoAccionista.setVisible(this.isPermisoNuevoAccionista);			
		this.jButtonDuplicarAccionista.setVisible(this.isPermisoDuplicarAccionista);			
		this.jButtonCopiarAccionista.setVisible(this.isPermisoCopiarAccionista);			
		this.jButtonVerFormAccionista.setVisible(this.isPermisoVerFormAccionista);			
		
		this.jButtonAbrirOrderByAccionista.setVisible(this.isPermisoOrdenAccionista);					
		
		this.jButtonNuevoRelacionesAccionista.setVisible(this.isPermisoNuevoAccionista);			
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonModificarAccionista.setVisible(this.isPermisoActualizarAccionista);	
			this.jInternalFrameDetalleFormAccionista.jButtonActualizarAccionista.setVisible(this.isPermisoActualizarAccionista);	
			this.jInternalFrameDetalleFormAccionista.jButtonEliminarAccionista.setVisible(this.isPermisoEliminarAccionista);
			this.jInternalFrameDetalleFormAccionista.jButtonCancelarAccionista.setVisible(this.isVisibilidadCeldaCancelarAccionista);						
			this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosAccionista.setVisible(this.isPermisoGuardarCambiosAccionista);							
		}
		
		this.jButtonGuardarCambiosTablaAccionista.setVisible(this.isPermisoActualizarAccionista);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAccionista() {
		this.jInternalFrameDetalleFormAccionista.jButtonModificarAccionista.setVisible(this.isPermisoActualizarAccionista);	
		this.jInternalFrameDetalleFormAccionista.jButtonActualizarAccionista.setVisible(this.isPermisoActualizarAccionista);	
		this.jInternalFrameDetalleFormAccionista.jButtonEliminarAccionista.setVisible(this.isPermisoEliminarAccionista);
		this.jInternalFrameDetalleFormAccionista.jButtonCancelarAccionista.setVisible(this.isVisibilidadCeldaCancelarAccionista);							
		this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosAccionista.setVisible((this.isVisibilidadCeldaGuardarAccionista && this.isPermisoGuardarCambiosAccionista));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAccionista() {
		if(AccionistaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAccionista();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAccionista() {
	}
	
	public void jTableDatosAccionistaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAccionista(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.accionista.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteAccionistaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderAccionista=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosAccionista.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderAccionista=(TitledBorder)this.jScrollPanelDatosAccionista.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderAccionista.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteAccionistaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebAccionista(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAccionista.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAccionista.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.accionistaLogic.getConnexion());

				if(this.accionista.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.accionista.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAccionista=(TitledBorder)this.jScrollPanelDatosAccionista.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderAccionista.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.accionista.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclienteinversionAccionistaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoinversion=true;

			idTienePermisotipoinversion=this.tienePermisosUsuarioEnPaginaWebAccionista(TipoInversionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoinversion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAccionista.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAccionista.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);

				this.tipoinversionBeanSwingJInternalFrame=new TipoInversionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoinversionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoinversionBeanSwingJInternalFrame.getTipoInversionLogic().setConnexion(this.accionistaLogic.getConnexion());

				if(this.accionista.getidvalorclienteinversion()!=null) {
					this.tipoinversionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoinversionBeanSwingJInternalFrame.setIdActual(this.accionista.getidvalorclienteinversion());
					this.tipoinversionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoinversionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoinversionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoInversion();
				}

				JInternalFrameBase jinternalFrame =this.tipoinversionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAccionista=(TitledBorder)this.jScrollPanelDatosAccionista.getBorder();
				TitledBorder titledBordertipoinversion=(TitledBorder)this.tipoinversionBeanSwingJInternalFrame.jScrollPanelDatosTipoInversion.getBorder();

				titledBordertipoinversion.setTitle(titledBorderAccionista.getTitle() + " -> Tipo Inversion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclienteinversionAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getidvalorclienteinversion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclienteinversion = "+this.accionista.getidvalorclienteinversion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvaloridentificacionAccionistaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoidentificacion=true;

			idTienePermisotipoidentificacion=this.tienePermisosUsuarioEnPaginaWebAccionista(TipoIdentificacionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoidentificacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAccionista.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAccionista.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);

				this.tipoidentificacionBeanSwingJInternalFrame=new TipoIdentificacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoidentificacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoidentificacionBeanSwingJInternalFrame.getTipoIdentificacionLogic().setConnexion(this.accionistaLogic.getConnexion());

				if(this.accionista.getidvaloridentificacion()!=null) {
					this.tipoidentificacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoidentificacionBeanSwingJInternalFrame.setIdActual(this.accionista.getidvaloridentificacion());
					this.tipoidentificacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoidentificacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoidentificacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIdentificacion();
				}

				JInternalFrameBase jinternalFrame =this.tipoidentificacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAccionista=(TitledBorder)this.jScrollPanelDatosAccionista.getBorder();
				TitledBorder titledBordertipoidentificacion=(TitledBorder)this.tipoidentificacionBeanSwingJInternalFrame.jScrollPanelDatosTipoIdentificacion.getBorder();

				titledBordertipoidentificacion.setTitle(titledBorderAccionista.getTitle() + " -> Tipo Identificacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvaloridentificacionAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getidvaloridentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvaloridentificacion = "+this.accionista.getidvaloridentificacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.accionista.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidopaternoAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getapellidopaterno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellidopaterno like '%"+this.accionista.getapellidopaterno()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidomaternoAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getapellidomaterno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellidomaterno like '%"+this.accionista.getapellidomaterno()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprimernombreAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getprimernombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where primernombre like '%"+this.accionista.getprimernombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsegundonombreAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getsegundonombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where segundonombre like '%"+this.accionista.getsegundonombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrecortoAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getnombrecorto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombrecorto like '%"+this.accionista.getnombrecorto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonparticipacionAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getparticipacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where participacion = "+this.accionista.getparticipacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoAccionistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccionista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccionista(this.getaccionista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accionista==null) {
						this.accionista = new Accionista();
					}

					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);
				}

				if(this.accionista.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.accionista.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccionista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdClientePorNombreCortoAccionistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAccionista(false,false);

			this.getAccionistasBusquedaPorIdClientePorNombreCorto();

			this.inicializarActualizarBindingAccionista(false);

			//if(AccionistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAccionista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteAccionistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAccionista(false,false);

			this.getAccionistasFK_IdCliente();

			this.inicializarActualizarBindingAccionista(false);

			//if(AccionistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAccionista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteInversionAccionistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAccionista(false,false);

			this.getAccionistasFK_IdValorClienteInversion();

			this.inicializarActualizarBindingAccionista(false);

			//if(AccionistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAccionista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorIdentificacionAccionistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAccionista(false,false);

			this.getAccionistasFK_IdValorIdentificacion();

			this.inicializarActualizarBindingAccionista(false);

			//if(AccionistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAccionista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAccionista() {
		if(this.jInternalFrameDetalleFormAccionista!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAccionista!=null) {
			this.jInternalFrameDetalleFormAccionista.setVisible(false);	    			
			this.jInternalFrameDetalleFormAccionista.dispose();
			this.jInternalFrameDetalleFormAccionista=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAccionista!=null) {
			this.jInternalFrameReporteDinamicoAccionista.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAccionista.dispose();
			this.jInternalFrameReporteDinamicoAccionista=null;
		}
		
		if(this.jInternalFrameImportacionAccionista!=null) {
			this.jInternalFrameImportacionAccionista.setVisible(false);	    			
			this.jInternalFrameImportacionAccionista.dispose();
			this.jInternalFrameImportacionAccionista=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAccionista();
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
			
			if(sTipo.equals("NuevoAccionista")) {
				jButtonNuevoAccionistaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAccionista")) {
				jButtonDuplicarAccionistaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAccionista")) {
				jButtonCopiarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("VerFormAccionista")) {
				jButtonVerFormAccionistaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAccionista")) {
				jButtonNuevoAccionistaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAccionista")) {
				jButtonDuplicarAccionistaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAccionista")) {
				jButtonNuevoAccionistaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAccionista")) {
				jButtonDuplicarAccionistaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAccionista")) {
				jButtonNuevoAccionistaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAccionista")) {
				jButtonNuevoAccionistaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAccionista")) {
				jButtonNuevoAccionistaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAccionista")) {
				jButtonModificarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAccionista")) {
				jButtonModificarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAccionista")) {
				jButtonModificarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAccionista")) {
				jButtonActualizarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAccionista")) {
				jButtonActualizarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAccionista")) {
				jButtonActualizarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("EliminarAccionista")) {
				jButtonEliminarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAccionista")) {
				jButtonEliminarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAccionista")) {
				jButtonEliminarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("CancelarAccionista")) {
				jButtonCancelarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAccionista")) {
				jButtonCancelarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAccionista")) {
				jButtonCancelarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("CerrarAccionista")) {
				jButtonCerrarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAccionista")) {
				jButtonCerrarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAccionista")) {
				jButtonCerrarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAccionista")) {
				jButtonMostrarOcultarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAccionista")) {
				jButtonCancelarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAccionista")) {
				jButtonGuardarCambiosAccionistaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAccionista")) {
				jButtonGuardarCambiosAccionistaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAccionista")) {
				jButtonCopiarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAccionista")) {
				jButtonVerFormAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAccionista")) {
				jButtonGuardarCambiosAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAccionista")) {
				jButtonCopiarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAccionista")) {
				jButtonVerFormAccionistaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAccionista")) {
				jButtonGuardarCambiosAccionistaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAccionista")) {
				jButtonGuardarCambiosAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAccionista")) {
				jButtonGuardarCambiosAccionistaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAccionista")) {
				jButtonRecargarInformacionAccionistaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAccionista")) {
				jButtonRecargarInformacionAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAccionista")) {
				jButtonRecargarInformacionAccionistaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAccionista")) {
				jButtonAnterioresAccionistaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAccionista")) {
				jButtonAnterioresAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAccionista")) {
				jButtonAnterioresAccionistaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAccionista")) {
				jButtonSiguientesAccionistaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAccionista")) {
				jButtonSiguientesAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAccionista")) {
				jButtonSiguientesAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAccionista") || sTipo.equals("MenuItemDetalleAbrirOrderByAccionista")) {
				jButtonAbrirOrderByAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAccionista") || sTipo.equals("MenuItemDetalleMostrarOcultarAccionista")) {
				jButtonMostrarOcultarAccionistaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAccionista")) {
				jButtonNuevoGuardarCambiosAccionistaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAccionista")) {
				jButtonNuevoGuardarCambiosAccionistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAccionista")) {
				jButtonNuevoGuardarCambiosAccionistaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAccionista")) {
				jButtonCerrarReporteDinamicoAccionistaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAccionista")) {
				jButtonGenerarReporteDinamicoAccionistaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAccionista")) {
				
				jButtonGenerarExcelReporteDinamicoAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAccionista")) {
				jButtonCerrarImportacionAccionistaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAccionista")) {
				
				jButtonGenerarImportacionAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAccionista")) {
				
				jButtonAbrirImportacionAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAccionista")) {
				jComboBoxTiposAccionesAccionistaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAccionista")) {
				jComboBoxTiposRelacionesAccionistaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAccionista")) {
				jComboBoxTiposAccionesAccionistaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAccionista")) {
				
				jComboBoxTiposSeleccionarAccionistaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAccionista")) {
				jTextFieldValorCampoGeneralAccionistaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAccionista")) {
				jButtonAbrirOrderByAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAccionista")) {
				jButtonAbrirOrderByAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAccionista")) {
				jButtonCerrarOrderByAccionistaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAccionistaBusqueda")) {
				this.jButtonidAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteAccionista")) {
				this.jButtonidclienteAccionistaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteAccionistaUpdate")) {
				this.jButtonidclienteAccionistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteAccionistaBusqueda")) {
				this.jButtonidclienteAccionistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclienteinversionAccionistaUpdate")) {
				this.jButtonidvalorclienteinversionAccionistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclienteinversionAccionistaBusqueda")) {
				this.jButtonidvalorclienteinversionAccionistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvaloridentificacionAccionistaUpdate")) {
				this.jButtonidvaloridentificacionAccionistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvaloridentificacionAccionistaBusqueda")) {
				this.jButtonidvaloridentificacionAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionAccionistaBusqueda")) {
				this.jButtonidentificacionAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidopaternoAccionistaBusqueda")) {
				this.jButtonapellidopaternoAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidomaternoAccionistaBusqueda")) {
				this.jButtonapellidomaternoAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("primernombreAccionistaBusqueda")) {
				this.jButtonprimernombreAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("segundonombreAccionistaBusqueda")) {
				this.jButtonsegundonombreAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrecortoAccionistaBusqueda")) {
				this.jButtonnombrecortoAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("participacionAccionistaBusqueda")) {
				this.jButtonparticipacionAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoAccionistaBusqueda")) {
				this.jButtonesactivoAccionistaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteAccionista")) {
				this.jButtonidclienteAccionistaActionPerformed(evt);
			}
			else if(sTipo.equals("idclienteAccionista")) {
				this.jButtonidclienteAccionistaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorIdClientePorNombreCortoAccionista")) {
				this.jButtonBusquedaPorIdClientePorNombreCortoAccionistaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteAccionista")) {
				this.jButtonFK_IdClienteAccionistaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteInversionAccionista")) {
				this.jButtonFK_IdValorClienteInversionAccionistaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorIdentificacionAccionista")) {
				this.jButtonFK_IdValorIdentificacionAccionistaActionPerformed(evt);
			}
			
			;
			
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAccionista();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionistaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				


				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Accionista accionistaLocal=null;
			
			if(!this.getEsControlTabla()) {
				accionistaLocal=this.accionista;
			} else {
				accionistaLocal=this.accionistaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
							
				
				


				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaAnterior =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionistaAnterior =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
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
			
			


			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionistaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
								
						
				


				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
								
				
				


				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaAnterior =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionistaAnterior =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaAnterior =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionistaAnterior =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionistaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
			
			this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
							
				
				


				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionistaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionistaAnterior =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.accionistaAnterior =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
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
			
			


			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionistaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
			
			this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
								
				
				


				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaAnterior =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionistaAnterior =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionistaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
			
			this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionistaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAccionista")) {
					jCheckBoxSeleccionarTodosAccionistaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAccionista")) {
					jCheckBoxSeleccionadosAccionistaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAccionista")) {
					
				}
				
				


				
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
												
				
				


				
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionistaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionistaAnterior =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.accionistaAnterior =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionistaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
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
			
			


			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionistaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accionista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accionista);
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
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
				
				


				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accionista.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accionista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionistaAnterior =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionistaAnterior =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAccionista")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAccionistaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAccionista.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.accionista =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.accionista =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.accionista);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAccionista")) {
				
				}
				
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAccionista")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAccionista.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAccionista")) {
			
			}
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAccionista();
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
			if(sTipo.equals("NuevoAccionista")) {
				jButtonNuevoAccionistaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAccionista")) {
				jButtonDuplicarAccionistaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAccionista")) {
				jButtonCopiarAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAccionista")) {
				jButtonVerFormAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAccionista")) {
				jButtonNuevoAccionistaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAccionista")) {
				jButtonModificarAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAccionista")) {
				jButtonActualizarAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAccionista")) {
				jButtonEliminarAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAccionista")) {
				jButtonGuardarCambiosAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAccionista")) {
				jButtonCancelarAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAccionista")) {
				jButtonCerrarAccionistaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAccionista")) {
				jButtonGuardarCambiosAccionistaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAccionista")) {
				jButtonNuevoGuardarCambiosAccionistaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAccionista")) {
				jButtonAbrirOrderByAccionistaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAccionista")) {
				jButtonRecargarInformacionAccionistaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAccionista")) {
				jButtonAnterioresAccionistaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAccionista")) {
				jButtonSiguientesAccionistaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAccionistaBusqueda")) {
				this.jButtonidAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteAccionista")) {
				this.jButtonidclienteAccionistaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteAccionistaUpdate")) {
				this.jButtonidclienteAccionistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteAccionistaBusqueda")) {
				this.jButtonidclienteAccionistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclienteinversionAccionistaUpdate")) {
				this.jButtonidvalorclienteinversionAccionistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclienteinversionAccionistaBusqueda")) {
				this.jButtonidvalorclienteinversionAccionistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvaloridentificacionAccionistaUpdate")) {
				this.jButtonidvaloridentificacionAccionistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvaloridentificacionAccionistaBusqueda")) {
				this.jButtonidvaloridentificacionAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionAccionistaBusqueda")) {
				this.jButtonidentificacionAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidopaternoAccionistaBusqueda")) {
				this.jButtonapellidopaternoAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidomaternoAccionistaBusqueda")) {
				this.jButtonapellidomaternoAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("primernombreAccionistaBusqueda")) {
				this.jButtonprimernombreAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("segundonombreAccionistaBusqueda")) {
				this.jButtonsegundonombreAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrecortoAccionistaBusqueda")) {
				this.jButtonnombrecortoAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("participacionAccionistaBusqueda")) {
				this.jButtonparticipacionAccionistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoAccionistaBusqueda")) {
				this.jButtonesactivoAccionistaBusquedaActionPerformed(evt);
			}
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAccionista();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAccionista")) {
				closingInternalFrameAccionista();
				
			} else if(sTipo.equals("jButtonCancelarAccionista")) {
				JInternalFrameBase jInternalFrameDetalleFormAccionista = (JInternalFrameBase)evt.getSource();
	            	
	            AccionistaBeanSwingJInternalFrame jInternalFrameParent=(AccionistaBeanSwingJInternalFrame)jInternalFrameDetalleFormAccionista.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAccionistaActionPerformed(null);
			}
			
			AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.accionista,new Object(),this.accionistaParameterGeneral,this.accionistaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAccionista(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAccionista(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAccionista(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.accionista)) {
			if(!esControlTabla) {
				if(AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);			
				}
				
				if(this.accionistaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAccionista(this.accionista,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.accionistaReturnGeneral=accionistaLogic.procesarEventosAccionistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.accionistaLogic.getAccionistas(),this.accionista,this.accionistaParameterGeneral,this.isEsNuevoAccionista,classes);//this.accionistaLogic.getAccionista()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAccionista(this.accionistaReturnGeneral,this.accionistaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.accionistaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAccionista(classes,this.accionistaReturnGeneral,this.accionistaBean,false);
					}
						
					if(this.accionistaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAccionista(this.accionistaReturnGeneral.getAccionista());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAccionista(this.accionistaReturnGeneral.getAccionista());	
					}
						
					if(this.accionistaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAccionista(this.accionistaReturnGeneral.getAccionista(),classes);//this.accionistaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAccionista(this.accionista,classes);//this.accionistaBean);									
				}
			
				if(AccionistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAccionista(this.accionista,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAccionista(this.accionista);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.accionistaAnterior!=null) {
						this.accionista=this.accionistaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.accionistaReturnGeneral=accionistaLogic.procesarEventosAccionistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.accionistaLogic.getAccionistas(),this.accionista,this.accionistaParameterGeneral,this.isEsNuevoAccionista,classes);//this.accionistaLogic.getAccionista()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.accionistaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.accionistaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.accionistaReturnGeneral.getAccionista(),accionistaLogic.getAccionistas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.accionistaReturnGeneral.getAccionista(),this.accionistas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAccionista.repaint();
				
				//((AbstractTableModel) this.jTableDatosAccionista.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAccionista();
			}
		}
	}
	
	public void actualizarVisualTableDatosAccionista() throws Exception {
		
		AccionistaModel accionistaModel=(AccionistaModel)this.jTableDatosAccionista.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			accionistaModel.accionistas=this.accionistaLogic.getAccionistas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			accionistaModel.accionistas=this.accionistas;
		}
		
		
		((AccionistaModel) this.jTableDatosAccionista.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAccionista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getaccionistaAnterior(),this.accionistaLogic.getAccionistas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getaccionistaAnterior(),this.accionistas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAccionista();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAccionista(Accionista accionista,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
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
										
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.accionista,new Object(),generalEntityParameterGeneral,this.accionistaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.accionistaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AccionistaConstantesFunciones.getClassesRelationshipsOfAccionista(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AccionistaConstantesFunciones.getClassesRelationshipsFromStringsOfAccionista(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAccionista(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AccionistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.accionista,new Object(),generalEntityParameterGeneral,this.accionistaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAccionista(AccionistaBean accionistaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAccionista(ArrayList<Classe> classes,AccionistaReturnGeneral accionistaReturnGeneral,AccionistaBean accionistaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAccionista(Accionista accionista,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.accionista)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAccionista = new AccionistaDetalleFormJInternalFrame(jDesktopPane,this.accionistaSessionBean.getConGuardarRelaciones(),this.accionistaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAccionista);
		this.jInternalFrameDetalleFormAccionista.setVisible(false);
		this.jInternalFrameDetalleFormAccionista.setSelected(false);						
		
		this.jInternalFrameDetalleFormAccionista.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAccionista.accionistaLogic=this.accionistaLogic;
		
		this.cargarCombosFrameForeignKeyAccionista("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAccionista();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAccionista();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAccionista("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAccionista();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAccionista.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAccionista"));
		
		this.jInternalFrameDetalleFormAccionista.jButtonModificarAccionista.addActionListener(new ButtonActionListener(this,"ModificarAccionista"));

		
		this.jInternalFrameDetalleFormAccionista.jButtonModificarToolBarAccionista.addActionListener(new ButtonActionListener(this,"ModificarToolBarAccionista"));
					
		this.jInternalFrameDetalleFormAccionista.jMenuItemModificarAccionista.addActionListener(new ButtonActionListener(this,"MenuItemModificarAccionista"));		
		
		
		
		this.jInternalFrameDetalleFormAccionista.jButtonActualizarAccionista.addActionListener (new ButtonActionListener(this,"ActualizarAccionista"));
		
		
		this.jInternalFrameDetalleFormAccionista.jButtonActualizarToolBarAccionista.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAccionista"));
						
		this.jInternalFrameDetalleFormAccionista.jMenuItemActualizarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAccionista"));		
		
		
		
		this.jInternalFrameDetalleFormAccionista.jButtonEliminarAccionista.addActionListener (new ButtonActionListener(this,"EliminarAccionista"));
		
		
		this.jInternalFrameDetalleFormAccionista.jButtonEliminarToolBarAccionista.addActionListener (new ButtonActionListener(this,"EliminarToolBarAccionista"));
								
		this.jInternalFrameDetalleFormAccionista.jMenuItemEliminarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAccionista"));		
		
		
		
		this.jInternalFrameDetalleFormAccionista.jButtonCancelarAccionista.addActionListener (new ButtonActionListener(this,"CancelarAccionista"));
		
		
		this.jInternalFrameDetalleFormAccionista.jButtonCancelarToolBarAccionista.addActionListener (new ButtonActionListener(this,"CancelarToolBarAccionista"));
					
		this.jInternalFrameDetalleFormAccionista.jMenuItemCancelarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAccionista"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAccionista.jMenuItemDetalleCerrarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAccionista"));		
		
		
		
		this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosToolBarAccionista.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAccionista"));
		
		
		
		this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosToolBarAccionista.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAccionista"));
		
		
		
		this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAccionista"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idAccionistaBusqueda"));
		//jButtonidclienteAccionista.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteAccionistaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionista.addActionListener(new ButtonActionListener(this,"idclienteAccionista"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idclienteAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteAccionistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidvalorclienteinversionAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienteinversionAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidvalorclienteinversionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienteinversionAccionistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidvaloridentificacionAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idvaloridentificacionAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidvaloridentificacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idvaloridentificacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidentificacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"identificacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonapellidopaternoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonapellidomaternoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonprimernombreAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"primernombreAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonsegundonombreAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonnombrecortoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"nombrecortoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonparticipacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"participacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonesactivoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoAccionistaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAccionista"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAccionista"));
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAccionista"));
		}
		
		this.jTableDatosAccionista.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAccionista"));
		
		this.jTableDatosAccionista.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAccionista"));
		
		this.jButtonNuevoAccionista.addActionListener(new ButtonActionListener(this,"NuevoAccionista"));
		
		this.jButtonDuplicarAccionista.addActionListener(new ButtonActionListener(this,"DuplicarAccionista"));
		
		this.jButtonCopiarAccionista.addActionListener(new ButtonActionListener(this,"CopiarAccionista"));
		
		this.jButtonVerFormAccionista.addActionListener(new ButtonActionListener(this,"VerFormAccionista"));
		
		
		this.jButtonNuevoToolBarAccionista.addActionListener(new ButtonActionListener(this,"NuevoToolBarAccionista"));
			
		this.jButtonDuplicarToolBarAccionista.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAccionista"));
			
		this.jMenuItemNuevoAccionista.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAccionista"));
			
		this.jMenuItemDuplicarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAccionista"));		
		
		
		this.jButtonNuevoRelacionesAccionista.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAccionista"));
		
		
		this.jButtonNuevoRelacionesToolBarAccionista.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAccionista"));
			
		this.jMenuItemNuevoRelacionesAccionista.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAccionista"));		
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonModificarAccionista.addActionListener(new ButtonActionListener(this,"ModificarAccionista"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonModificarToolBarAccionista.addActionListener(new ButtonActionListener(this,"ModificarToolBarAccionista"));
			
			this.jInternalFrameDetalleFormAccionista.jMenuItemModificarAccionista.addActionListener(new ButtonActionListener(this,"MenuItemModificarAccionista"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAccionista.jButtonActualizarAccionista.addActionListener (new ButtonActionListener(this,"ActualizarAccionista"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonActualizarToolBarAccionista.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAccionista"));
				
			this.jInternalFrameDetalleFormAccionista.jMenuItemActualizarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAccionista"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonEliminarAccionista.addActionListener (new ButtonActionListener(this,"EliminarAccionista"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonEliminarToolBarAccionista.addActionListener (new ButtonActionListener(this,"EliminarToolBarAccionista"));
						
			this.jInternalFrameDetalleFormAccionista.jMenuItemEliminarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAccionista"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonCancelarAccionista.addActionListener (new ButtonActionListener(this,"CancelarAccionista"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonCancelarToolBarAccionista.addActionListener (new ButtonActionListener(this,"CancelarToolBarAccionista"));
			
			this.jInternalFrameDetalleFormAccionista.jMenuItemCancelarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAccionista"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAccionista.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAccionista"));		
		
		
		this.jButtonCerrarAccionista.addActionListener (new ButtonActionListener(this,"CerrarAccionista"));
		
		
		this.jButtonCerrarToolBarAccionista.addActionListener (new ButtonActionListener(this,"CerrarToolBarAccionista"));
			
		this.jMenuItemCerrarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAccionista"));
			
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jMenuItemDetalleCerrarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAccionista"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosAccionista.addActionListener (new ButtonActionListener(this,"GuardarCambiosAccionista"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosToolBarAccionista.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAccionista"));
		}
		
		this.jButtonCopiarToolBarAccionista.addActionListener (new ButtonActionListener(this,"CopiarToolBarAccionista"));
			
		this.jButtonVerFormToolBarAccionista.addActionListener (new ButtonActionListener(this,"VerFormToolBarAccionista"));
		
		this.jMenuItemGuardarCambiosAccionista.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAccionista"));
			
		this.jMenuItemCopiarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAccionista"));		
		
		this.jMenuItemVerFormAccionista.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAccionista"));		
		
		
		this.jButtonGuardarCambiosTablaAccionista.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAccionista"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAccionista.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAccionista"));
			
		this.jMenuItemGuardarCambiosTablaAccionista.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAccionista"));		
		
		
		
		this.jButtonRecargarInformacionAccionista.addActionListener (new ButtonActionListener(this,"RecargarInformacionAccionista"));
					
		this.jButtonRecargarInformacionToolBarAccionista.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAccionista"));
		
		this.jMenuItemRecargarInformacionAccionista.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAccionista"));		
		
		
		
		this.jButtonAnterioresAccionista.addActionListener (new ButtonActionListener(this,"AnterioresAccionista"));
		
		
		this.jButtonAnterioresToolBarAccionista.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAccionista"));
		
		this.jMenuItemAnterioresAccionista.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAccionista"));		
		
		
		this.jButtonSiguientesAccionista.addActionListener (new ButtonActionListener(this,"SiguientesAccionista"));
		
		
		this.jButtonSiguientesToolBarAccionista.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAccionista"));
			
		this.jMenuItemSiguientesAccionista.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAccionista"));
			
		this.jMenuItemAbrirOrderByAccionista.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAccionista"));
			
		this.jMenuItemMostrarOcultarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAccionista"));
			
		this.jMenuItemDetalleAbrirOrderByAccionista.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAccionista"));
			
		this.jMenuItemDetalleMostarOcultarAccionista.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAccionista"));		
		
		
		this.jButtonNuevoGuardarCambiosAccionista.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAccionista"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAccionista.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAccionista"));
			
		this.jMenuItemNuevoGuardarCambiosAccionista.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAccionista"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAccionista.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAccionista"));

		this.jCheckBoxSeleccionadosAccionista.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAccionista"));
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAccionista"));
		}
		
		
		this.jComboBoxTiposRelacionesAccionista.addActionListener (new ButtonActionListener(this,"TiposRelacionesAccionista"));
			
		this.jComboBoxTiposAccionesAccionista.addActionListener (new ButtonActionListener(this,"TiposAccionesAccionista"));
					
		this.jComboBoxTiposSeleccionarAccionista.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAccionista"));
			
		this.jTextFieldValorCampoGeneralAccionista.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAccionista"));		
		
		
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idAccionistaBusqueda"));
		//jButtonidclienteAccionista.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteAccionistaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionista.addActionListener(new ButtonActionListener(this,"idclienteAccionista"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idclienteAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteAccionistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidvalorclienteinversionAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienteinversionAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidvalorclienteinversionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienteinversionAccionistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidvaloridentificacionAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idvaloridentificacionAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidvaloridentificacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idvaloridentificacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidentificacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"identificacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonapellidopaternoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonapellidomaternoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonprimernombreAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"primernombreAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonsegundonombreAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonnombrecortoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"nombrecortoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonparticipacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"participacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonesactivoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoAccionistaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdClientePorNombreCortoAccionista.addActionListener(new ButtonActionListener(this,"BusquedaPorIdClientePorNombreCortoAccionista"));

			this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista.addActionListener(new ButtonActionListener(this,"idclienteAccionista"));

			this.jButtonFK_IdClienteAccionista.addActionListener(new ButtonActionListener(this,"FK_IdClienteAccionista"));

			this.jButtonBuscarFK_IdClienteidclienteAccionista.addActionListener(new ButtonActionListener(this,"idclienteAccionista"));

			this.jButtonFK_IdValorClienteInversionAccionista.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteInversionAccionista"));

			this.jButtonFK_IdValorIdentificacionAccionista.addActionListener(new ButtonActionListener(this,"FK_IdValorIdentificacionAccionista"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAccionista!=null) {
				this.jInternalFrameReporteDinamicoAccionista.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAccionista"));
				this.jInternalFrameReporteDinamicoAccionista.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAccionista"));
				this.jInternalFrameReporteDinamicoAccionista.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAccionista"));
			}
			
			//this.jButtonCerrarReporteDinamicoAccionista.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAccionista"));				
			//this.jButtonGenerarReporteDinamicoAccionista.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAccionista"));
			//this.jButtonGenerarExcelReporteDinamicoAccionista.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAccionista"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAccionista!=null) {
				this.jInternalFrameImportacionAccionista.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAccionista"));
				this.jInternalFrameImportacionAccionista.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAccionista"));
				this.jInternalFrameImportacionAccionista.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAccionista"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAccionista.addActionListener (new ButtonActionListener(this,"AbrirOrderByAccionista"));
			
			this.jButtonAbrirOrderByToolBarAccionista.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAccionista"));			
			
			if(this.jInternalFrameOrderByAccionista!=null) {
				this.jInternalFrameOrderByAccionista.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAccionista"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAccionista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccionista.jTabbedPaneRelacionesAccionista.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAccionista"));
		
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
            		closingInternalFrameAccionista();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAccionista.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAccionista = (JInternalFrameBase)event.getSource();
	            	
	            AccionistaBeanSwingJInternalFrame jInternalFrameParent=(AccionistaBeanSwingJInternalFrame)jInternalFrameDetalleFormAccionista.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAccionistaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAccionista.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAccionistaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAccionista.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAccionista.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionistaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionistaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionistaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAccionista";
		inputMap = this.jButtonNuevoAccionista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAccionista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAccionistaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionistaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionistaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionistaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAccionista";
		inputMap = this.jButtonNuevoRelacionesAccionista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAccionista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAccionistaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAccionista";
		inputMap = this.jButtonModificarAccionista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAccionista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAccionistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAccionista";
		inputMap = this.jButtonActualizarAccionista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAccionista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAccionistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAccionista";
		inputMap = this.jButtonEliminarAccionista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAccionista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAccionistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAccionista";
		inputMap = this.jButtonCancelarAccionista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAccionista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAccionistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAccionista";
		inputMap = this.jButtonCerrarAccionista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAccionista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAccionistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAccionista";
		inputMap = this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosAccionista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAccionista.jButtonGuardarCambiosAccionista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAccionistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAccionista.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAccionistaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAccionista.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAccionistaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAccionista.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAccionistaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAccionista.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAccionistaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idAccionistaBusqueda"));
		//jButtonidclienteAccionista.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteAccionistaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionista.addActionListener(new ButtonActionListener(this,"idclienteAccionista"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idclienteAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteAccionistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidvalorclienteinversionAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienteinversionAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidvalorclienteinversionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienteinversionAccionistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccionista.jButtonidvaloridentificacionAccionistaUpdate.addActionListener(new ButtonActionListener(this,"idvaloridentificacionAccionistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidvaloridentificacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"idvaloridentificacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonidentificacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"identificacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonapellidopaternoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonapellidomaternoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonprimernombreAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"primernombreAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonsegundonombreAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonnombrecortoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"nombrecortoAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonparticipacionAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"participacionAccionistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccionista.jButtonesactivoAccionistaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoAccionistaBusqueda"));
		
		
		this.jButtonBusquedaPorIdClientePorNombreCortoAccionista.addActionListener(new ButtonActionListener(this,"BusquedaPorIdClientePorNombreCortoAccionista"));

		this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista.addActionListener(new ButtonActionListener(this,"idclienteAccionista"));

		this.jButtonFK_IdClienteAccionista.addActionListener(new ButtonActionListener(this,"FK_IdClienteAccionista"));

		this.jButtonBuscarFK_IdClienteidclienteAccionista.addActionListener(new ButtonActionListener(this,"idclienteAccionista"));

		this.jButtonFK_IdValorClienteInversionAccionista.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteInversionAccionista"));

		this.jButtonFK_IdValorIdentificacionAccionista.addActionListener(new ButtonActionListener(this,"FK_IdValorIdentificacionAccionista"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAccionista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAccionistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAccionistaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAccionista.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAccionista(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
					accionistaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Accionista accionistaAux:accionistas) {
					accionistaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAccionistaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAccionista(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
						accionistaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Accionista accionistaAux:accionistas) {
						accionistaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
					
						if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							accionistaAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Accionista accionistaAux:accionistas) {
						
						if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							accionistaAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAccionista(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAccionista.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAccionista.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAccionista,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAccionistaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAccionista(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAccionista.getSelectedRows();
			
			Accionista accionistaLocal=new Accionista();
			
			//this.seleccionarTodosAccionista(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionistaLocal =(Accionista) this.accionistaLogic.getAccionistas().toArray()[this.jTableDatosAccionista.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					accionistaLocal =(Accionista) this.accionistas.toArray()[this.jTableDatosAccionista.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				accionistaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
						accionistaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Accionista accionistaAux:accionistas) {
						accionistaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAccionista(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAccionista.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAccionista.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAccionista,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAccionistaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAccionistaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAccionistaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAccionista(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAccionista.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Accionista accionistaAux:this.accionistaLogic.getAccionistas()) {
				
						if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							accionistaAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO)) {
							existe=true;
							accionistaAux.setapellidopaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO)) {
							existe=true;
							accionistaAux.setapellidomaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE)) {
							existe=true;
							accionistaAux.setprimernombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
							existe=true;
							accionistaAux.setsegundonombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_NOMBRECORTO)) {
							existe=true;
							accionistaAux.setnombrecorto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_PARTICIPACION)) {
							existe=true;
							accionistaAux.setparticipacion(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Accionista accionistaAux:accionistas) {
					
						if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							accionistaAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO)) {
							existe=true;
							accionistaAux.setapellidopaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO)) {
							existe=true;
							accionistaAux.setapellidomaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE)) {
							existe=true;
							accionistaAux.setprimernombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
							existe=true;
							accionistaAux.setsegundonombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_NOMBRECORTO)) {
							existe=true;
							accionistaAux.setnombrecorto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_PARTICIPACION)) {
							existe=true;
							accionistaAux.setparticipacion(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAccionista(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAccionistaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAccionista(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAccionista=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAccionista.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAccionista) {				
					conSplash=true;//false;										
					
					//this.startProcessAccionista(conSplash);
				
					this.generarReporteAccionistasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAccionistasSeleccionados();
				//this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAccionistasSeleccionados(false);
				//this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAccionistasSeleccionados(true);
				//this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAccionista();
				
				this.exportarAccionistasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAccionistas();
				//this.importarAccionistas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAccionista();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAccionistasSeleccionados();
				//this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Accionista", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAccionista();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAccionista)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAccionista(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.setSelectedIndex(0);					
				}	
			} 			
			else if(AccionistaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAccionista) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAccionista(conSplash);
					
						//this.actualizarParametrosGeneralAccionista();
						
						this.generarReporteProcesoAccionAccionistasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AccionistaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO AccionistaS SELECCIONADOS?", "MANTENIMIENTO DE Accionista", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAccionista();
				
						this.actualizarParametrosGeneralAccionista();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.accionistaReturnGeneral=accionistaLogic.procesarAccionAccionistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.accionistaLogic.getAccionistas(),this.accionistaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAccionistaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAccionista();
					
					AccionistaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAccionistaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAccionista.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAccionista.jComboBoxTiposAccionesFormularioAccionista.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAccionista(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAccionistaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAccionista();
			
			if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		
			Accionista accionista=new Accionista();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAccionista(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAccionista.getSelectedItem();
			
			
			
			
			accionistasSeleccionados=this.getAccionistasSeleccionados(true);
			//this.sTipoAccion;
			
			if(accionistasSeleccionados.size()==1) {
				for(Accionista accionistaAux:accionistasSeleccionados) {
					accionista=accionistaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAccionista();
			
      		//this.finishProcessAccionista(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAccionistaReturnGeneral() throws Exception {
		if(this.accionistaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.accionistaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.accionistaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.accionistaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.accionistaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.accionistaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAccionista(false);
		}
		
		if(this.accionistaReturnGeneral.getConRetornoLista() || this.accionistaReturnGeneral.getConRetornoObjeto()) {
			if(this.accionistaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionistaLogic.setAccionistas(this.accionistaReturnGeneral.getAccionistas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.accionistaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionistaLogic.setAccionista(this.accionistaReturnGeneral.getAccionista());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAccionista(false);
		}
	}
	
	public void actualizarParametrosGeneralAccionista() throws Exception {
		
		
	}
	
	public ArrayList<Accionista> getAccionistasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAccionista) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Accionista accionistaAux:accionistaLogic.getAccionistas()) {
					if(accionistaAux.getIsSelected()) {
						accionistasSeleccionados.add(accionistaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Accionista accionistaAux:this.accionistas) {
					if(accionistaAux.getIsSelected()) {
						accionistasSeleccionados.add(accionistaAux);				
					}
				}
			}
			
			if(accionistasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						accionistasSeleccionados.addAll(this.accionistaLogic.getAccionistas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						accionistasSeleccionados.addAll(this.accionistas);				
					}
				}
			}
		} else {
			accionistasSeleccionados.add(this.accionista);
		}
		
		return accionistasSeleccionados;
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
	
	public void generarReporteAccionistasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAccionistasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAccionistasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAccionistasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAccionistasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Accionista",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAccionistasSeleccionados() throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAccionistas("Todos",accionistasSeleccionados);
		
	}	
	
	public void generarReporteNormalAccionistasSeleccionados() throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAccionistas("Todos",accionistasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAccionistasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAccionistas("Todos",accionistasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAccionistasSeleccionados() throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAccionista();
		
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAccionista();
		
		
		//this.generarReporteAccionistas("Todos",accionistasSeleccionados ,accionistaImplementable,accionistaImplementableHome);
	}
	
	public void mostrarImportacionAccionistas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAccionista();
		
		this.abrirFrameImportacionAccionista();		
		
			
		//this.generarReporteAccionistas("Todos",accionistasSeleccionados ,accionistaImplementable,accionistaImplementableHome);
	}
	
	public void importarAccionistas() throws Exception {		
	
	}
	
	public void exportarAccionistasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAccionistasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAccionistasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAccionistasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Accionista",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAccionistasSeleccionados() throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accionista."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAccionista(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Accionista accionistaAux:accionistasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAccionista(accionistaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//accionistaAux.setsDetalleGeneralEntityReporte(accionistaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAccionista(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_NOMBRECORTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_PARTICIPACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionistaConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAccionista(Accionista accionista,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=accionista.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.gettipoinversion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.gettipoidentificacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getapellidopaterno();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getapellidomaterno();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getprimernombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getsegundonombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getnombrecorto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getparticipacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accionista.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAccionistasSeleccionados() throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accionista.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Accionistas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAccionista(row);				
				iRow++;
			}				
			
			for(Accionista accionistaAux:accionistasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAccionista(accionistaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAccionistasSeleccionados() throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();		
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accionista.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("accionistas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("accionista");
			//elementRoot.appendChild(element);
		
			for(Accionista accionistaAux:accionistasSeleccionados) {
				element = document.createElement("accionista");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAccionista(accionistaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accionista",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAccionista(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_NOMBRECORTO);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_PARTICIPACION);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionistaConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAccionista(Accionista accionista,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.gettipoinversion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.gettipoidentificacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getapellidopaterno());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getapellidomaterno());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getprimernombre());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getsegundonombre());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getnombrecorto());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getparticipacion());
		cell = row.createCell(iColumn++);cell.setCellValue(accionista.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlAccionista(Accionista accionista,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AccionistaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(accionista.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AccionistaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(accionista.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcliente_descripcion = document.createElement(AccionistaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(accionista.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipoinversion_descripcion = document.createElement(AccionistaConstantesFunciones.IDTIPOINVERSION);
		elementtipoinversion_descripcion.appendChild(document.createTextNode(accionista.gettipoinversion_descripcion()));
		element.appendChild(elementtipoinversion_descripcion);

		Element elementtipoidentificacion_descripcion = document.createElement(AccionistaConstantesFunciones.IDTIPOIDENTIFICACION);
		elementtipoidentificacion_descripcion.appendChild(document.createTextNode(accionista.gettipoidentificacion_descripcion()));
		element.appendChild(elementtipoidentificacion_descripcion);

		Element elementidentificacion = document.createElement(AccionistaConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(accionista.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementapellidopaterno = document.createElement(AccionistaConstantesFunciones.APELLIDOPATERNO);
		elementapellidopaterno.appendChild(document.createTextNode(accionista.getapellidopaterno().trim()));
		element.appendChild(elementapellidopaterno);

		Element elementapellidomaterno = document.createElement(AccionistaConstantesFunciones.APELLIDOMATERNO);
		elementapellidomaterno.appendChild(document.createTextNode(accionista.getapellidomaterno().trim()));
		element.appendChild(elementapellidomaterno);

		Element elementprimernombre = document.createElement(AccionistaConstantesFunciones.PRIMERNOMBRE);
		elementprimernombre.appendChild(document.createTextNode(accionista.getprimernombre().trim()));
		element.appendChild(elementprimernombre);

		Element elementsegundonombre = document.createElement(AccionistaConstantesFunciones.SEGUNDONOMBRE);
		elementsegundonombre.appendChild(document.createTextNode(accionista.getsegundonombre().trim()));
		element.appendChild(elementsegundonombre);

		Element elementnombrecorto = document.createElement(AccionistaConstantesFunciones.NOMBRECORTO);
		elementnombrecorto.appendChild(document.createTextNode(accionista.getnombrecorto().trim()));
		element.appendChild(elementnombrecorto);

		Element elementparticipacion = document.createElement(AccionistaConstantesFunciones.PARTICIPACION);
		elementparticipacion.appendChild(document.createTextNode(accionista.getparticipacion().toString().trim()));
		element.appendChild(elementparticipacion);

		Element elementesactivo = document.createElement(AccionistaConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(accionista.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoAccionistasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Accionista> accionistasSeleccionados=new ArrayList<Accionista>();
		
		accionistasSeleccionados=this.getAccionistasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAccionista(accionistasSeleccionados);
		
		this.generarReporteAccionistas("Todos",accionistasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAccionista(ArrayList<Accionista> accionistasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Accionista accionistaAux:accionistasSeleccionados) {
				accionistaAux.setsDetalleGeneralEntityReporte(accionistaAux.toString());
			
				if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_IDTIPOINVERSION)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.gettipoinversion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_IDTIPOIDENTIFICACION)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.gettipoidentificacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_APELLIDOPATERNO)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.getapellidopaterno());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_APELLIDOMATERNO)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.getapellidomaterno());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_PRIMERNOMBRE)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.getprimernombre());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.getsegundonombre());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_NOMBRECORTO)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.getnombrecorto());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_PARTICIPACION)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(accionistaAux.getparticipacion().toString());
				}
				 else if(sTipoSeleccionar.equals(AccionistaConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					accionistaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(accionistaAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionistaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAccionista(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAccionista=true;
				this.isVisibilidadCeldaNuevoRelacionesAccionista=true;
				this.isVisibilidadCeldaGuardarCambiosAccionista=true;
			}
			
			this.isVisibilidadCeldaModificarAccionista=false;
			this.isVisibilidadCeldaActualizarAccionista=false;
			this.isVisibilidadCeldaEliminarAccionista=false;
			this.isVisibilidadCeldaCancelarAccionista=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccionista=true;
				} else {
					this.isVisibilidadCeldaGuardarAccionista=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAccionista=false;
			this.isVisibilidadCeldaNuevoRelacionesAccionista=false;
			this.isVisibilidadCeldaGuardarCambiosAccionista=false;
			this.isVisibilidadCeldaModificarAccionista=false;
			this.isVisibilidadCeldaActualizarAccionista=true;
			this.isVisibilidadCeldaEliminarAccionista=false;
			this.isVisibilidadCeldaCancelarAccionista=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccionista=true;
				} else {
					this.isVisibilidadCeldaGuardarAccionista=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAccionista=false;
			this.isVisibilidadCeldaNuevoRelacionesAccionista=false;
			this.isVisibilidadCeldaGuardarCambiosAccionista=false;
			this.isVisibilidadCeldaModificarAccionista=false;
			this.isVisibilidadCeldaActualizarAccionista=true;
			this.isVisibilidadCeldaEliminarAccionista=true;
			this.isVisibilidadCeldaCancelarAccionista=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccionista=true;
				} else {
					this.isVisibilidadCeldaGuardarAccionista=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAccionista=false;
			this.isVisibilidadCeldaNuevoRelacionesAccionista=false;
			this.isVisibilidadCeldaGuardarCambiosAccionista=false;
			this.isVisibilidadCeldaModificarAccionista=false;
			this.isVisibilidadCeldaActualizarAccionista=true;
			this.isVisibilidadCeldaEliminarAccionista=false;
			this.isVisibilidadCeldaCancelarAccionista=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccionista=false;
				} else {
					this.isVisibilidadCeldaGuardarAccionista=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAccionista=true;
			this.isVisibilidadCeldaNuevoRelacionesAccionista=true;
			this.isVisibilidadCeldaGuardarCambiosAccionista=true;
			this.isVisibilidadCeldaModificarAccionista=false;
			this.isVisibilidadCeldaActualizarAccionista=false;
			this.isVisibilidadCeldaEliminarAccionista=false;
			this.isVisibilidadCeldaCancelarAccionista=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccionista=true;
				} else {
					this.isVisibilidadCeldaGuardarAccionista=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAccionista=false;
			this.isVisibilidadCeldaNuevoRelacionesAccionista=false;
			this.isVisibilidadCeldaGuardarCambiosAccionista=false;
			this.isVisibilidadCeldaActualizarAccionista=false;
			this.isVisibilidadCeldaEliminarAccionista=false;
			this.isVisibilidadCeldaCancelarAccionista=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccionista=false;
				} else {
					this.isVisibilidadCeldaGuardarAccionista=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAccionista=false;
			this.isVisibilidadCeldaNuevoRelacionesAccionista=false;
			this.isVisibilidadCeldaGuardarCambiosAccionista=false;
			this.isVisibilidadCeldaModificarAccionista=true;
			this.isVisibilidadCeldaActualizarAccionista=false;
			this.isVisibilidadCeldaEliminarAccionista=false;
			this.isVisibilidadCeldaCancelarAccionista=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccionista=false;
				} else {
					this.isVisibilidadCeldaGuardarAccionista=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AccionistaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAccionista=true;
			this.isVisibilidadCeldaNuevoRelacionesAccionista=true;
			this.isVisibilidadCeldaGuardarCambiosAccionista=true;
		} else {
			this.actualizarEstadoPanelsAccionista(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAccionista=false;
			//this.isVisibilidadCeldaVerFormAccionista=false;
			this.isVisibilidadCeldaDuplicarAccionista=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!accionistaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAccionista=false;
		} else {
			this.isVisibilidadCeldaNuevoAccionista=false;
			this.isVisibilidadCeldaGuardarCambiosAccionista=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(accionistaSessionBean.getEsGuardarRelacionado()) {
			if(!accionistaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAccionista=false;												
			}
			
			this.jButtonCerrarAccionista.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAccionista=false;
		}
		
		if(!this.permiteMantenimiento(this.accionista)) {
			this.isVisibilidadCeldaActualizarAccionista=false;
			this.isVisibilidadCeldaEliminarAccionista=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAccionista() {
	}
	
	public void actualizarEstadoPanelsAccionista(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAccionista!=null) {
				this.jScrollPanelDatosEdicionAccionista.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccionista!=null) {
				this.jTabbedPaneBusquedasAccionista.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAccionista!=null) {
				this.jScrollPanelDatosAccionista.setVisible(true);
			}
			
			if(this.jPanelPaginacionAccionista!=null) {
				this.jPanelPaginacionAccionista.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAccionista!=null) {
				this.jScrollPanelDatosEdicionAccionista.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccionista!=null) {
				this.jTabbedPaneBusquedasAccionista.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAccionista!=null) {
				this.jScrollPanelDatosAccionista.setVisible(false);
			}
			
			if(this.jPanelPaginacionAccionista!=null) {
				this.jPanelPaginacionAccionista.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAccionista!=null) {
				this.jScrollPanelDatosEdicionAccionista.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccionista!=null) {
				this.jTabbedPaneBusquedasAccionista.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAccionista!=null) {
				this.jScrollPanelDatosAccionista.setVisible(false);
			}
			
			if(this.jPanelPaginacionAccionista!=null) {
				this.jPanelPaginacionAccionista.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAccionista!=null) {
				this.jScrollPanelDatosEdicionAccionista.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccionista!=null) {
				this.jTabbedPaneBusquedasAccionista.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAccionista!=null) {
				this.jScrollPanelDatosAccionista.setVisible(false);
			}
			
			if(this.jPanelPaginacionAccionista!=null) {
				this.jPanelPaginacionAccionista.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAccionista!=null) {
				this.jScrollPanelDatosEdicionAccionista.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccionista!=null) {
				this.jTabbedPaneBusquedasAccionista.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAccionista!=null) {
				this.jScrollPanelDatosAccionista.setVisible(true);
			}
			
			if(this.jPanelPaginacionAccionista!=null) {
				this.jPanelPaginacionAccionista.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAccionista!=null) {
				this.jScrollPanelDatosEdicionAccionista.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccionista!=null) {
				this.jTabbedPaneBusquedasAccionista.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAccionista!=null) {
				this.jScrollPanelDatosAccionista.setVisible(true);
			}
			
			if(this.jPanelPaginacionAccionista!=null) {
				this.jPanelPaginacionAccionista.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAccionista!=null) {
				this.jScrollPanelDatosEdicionAccionista.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccionista!=null) {
				this.jTabbedPaneBusquedasAccionista.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAccionista!=null) {
				this.jScrollPanelDatosAccionista.setVisible(true);
			}
			
			if(this.jPanelPaginacionAccionista!=null) {
				this.jPanelPaginacionAccionista.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.accionistaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAccionista!=null) {
					this.jTabbedPaneBusquedasAccionista.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.accionistaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccionista!=null) {
				this.jTabbedPaneBusquedasAccionista.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAccionista!=null) {
				this.jPanelParametrosReportesAccionista.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaPorIdClientePorNombreCorto=isParaCliente;
			if(!this.isVisibilidadBusquedaPorIdClientePorNombreCorto) {this.jTabbedPaneBusquedasAccionista.remove(jPanelBusquedaPorIdClientePorNombreCortoAccionista);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdClienteAccionista);}

			this.isVisibilidadFK_IdValorClienteInversion=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteInversion) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdValorClienteInversionAccionista);}

			this.isVisibilidadFK_IdValorIdentificacion=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorIdentificacion) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdValorIdentificacionAccionista);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoInversion(Boolean isParaTipoInversion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoInversionNegation=!isParaTipoInversion;

			this.isVisibilidadBusquedaPorIdClientePorNombreCorto=isParaTipoInversionNegation;
			if(!this.isVisibilidadBusquedaPorIdClientePorNombreCorto) {this.jTabbedPaneBusquedasAccionista.remove(jPanelBusquedaPorIdClientePorNombreCortoAccionista);}

			this.isVisibilidadFK_IdCliente=isParaTipoInversionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdClienteAccionista);}

			this.isVisibilidadFK_IdValorClienteInversion=isParaTipoInversion;
			if(!this.isVisibilidadFK_IdValorClienteInversion) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdValorClienteInversionAccionista);}

			this.isVisibilidadFK_IdValorIdentificacion=isParaTipoInversionNegation;
			if(!this.isVisibilidadFK_IdValorIdentificacion) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdValorIdentificacionAccionista);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoIdentificacion(Boolean isParaTipoIdentificacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIdentificacionNegation=!isParaTipoIdentificacion;

			this.isVisibilidadBusquedaPorIdClientePorNombreCorto=isParaTipoIdentificacionNegation;
			if(!this.isVisibilidadBusquedaPorIdClientePorNombreCorto) {this.jTabbedPaneBusquedasAccionista.remove(jPanelBusquedaPorIdClientePorNombreCortoAccionista);}

			this.isVisibilidadFK_IdCliente=isParaTipoIdentificacionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdClienteAccionista);}

			this.isVisibilidadFK_IdValorClienteInversion=isParaTipoIdentificacionNegation;
			if(!this.isVisibilidadFK_IdValorClienteInversion) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdValorClienteInversionAccionista);}

			this.isVisibilidadFK_IdValorIdentificacion=isParaTipoIdentificacion;
			if(!this.isVisibilidadFK_IdValorIdentificacion) {this.jTabbedPaneBusquedasAccionista.remove(jPanelFK_IdValorIdentificacionAccionista);}
		}
		
	}
	
	
	
	

	public String registrarSesionAccionistaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(accionistaSessionBean==null) {
				accionistaSessionBean=new AccionistaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(accionistaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.accionistaFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(AccionistaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionAccionista(true);
			//clienteSessionBean.setlidAccionistaActual(this.idAccionistaActual);

			accionistaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAccionista(true);
			accionistaSessionBean.setlIdAccionistaActualForeignKey(this.idAccionistaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AccionistaSessionBean accionistaSessionBean=new AccionistaSessionBean();
		
		if(this.accionistaSessionBean==null) {
			this.accionistaSessionBean=new AccionistaSessionBean();
		}
		
		this.accionistaSessionBean.setsUltimaBusquedaAccionista(this.getsAccionBusqueda());
		this.accionistaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.accionistaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdClientePorNombreCorto")) {
			accionistaSessionBean.setidcliente(this.getidclienteBusquedaPorIdClientePorNombreCorto());	
			accionistaSessionBean.setnombrecorto(this.getnombrecortoBusquedaPorIdClientePorNombreCorto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			accionistaSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteInversion")) {
			accionistaSessionBean.setidvalorclienteinversion(this.getidvalorclienteinversionFK_IdValorClienteInversion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorIdentificacion")) {
			accionistaSessionBean.setidvaloridentificacion(this.getidvaloridentificacionFK_IdValorIdentificacion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AccionistaSessionBean accionistaSessionBean=new AccionistaSessionBean();
		
		if(this.accionistaSessionBean==null) {
			this.accionistaSessionBean=new AccionistaSessionBean();
		}
		
		if(this.accionistaSessionBean.getsUltimaBusquedaAccionista()!=null&&!this.accionistaSessionBean.getsUltimaBusquedaAccionista().equals("")) {
			this.setsAccionBusqueda(accionistaSessionBean.getsUltimaBusquedaAccionista());
			this.setiNumeroPaginacion(accionistaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(accionistaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdClientePorNombreCorto")) {
				this.setidclienteBusquedaPorIdClientePorNombreCorto(accionistaSessionBean.getidcliente());
				accionistaSessionBean.setidcliente(-1L);
				this.setnombrecortoBusquedaPorIdClientePorNombreCorto(accionistaSessionBean.getnombrecorto());
				accionistaSessionBean.setnombrecorto("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(accionistaSessionBean.getidcliente());
				accionistaSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteInversion")) {
				this.setidvalorclienteinversionFK_IdValorClienteInversion(accionistaSessionBean.getidvalorclienteinversion());
				accionistaSessionBean.setidvalorclienteinversion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorIdentificacion")) {
				this.setidvaloridentificacionFK_IdValorIdentificacion(accionistaSessionBean.getidvaloridentificacion());
				accionistaSessionBean.setidvaloridentificacion(-1L);
			}
		}
		
		this.accionistaSessionBean.setsUltimaBusquedaAccionista("");
		this.accionistaSessionBean.setiNumeroPaginacion(AccionistaConstantesFunciones.INUMEROPAGINACION);
		this.accionistaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAccionista(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAccionista() {
		this.updateBorderResaltarBusquedasFormularioAccionista();
		this.updateVisibilidadBusquedasFormularioAccionista();
		this.updateHabilitarBusquedasFormularioAccionista();
	}
	
	public void updateBorderResaltarBusquedasFormularioAccionista() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAccionista.getComponents().length>0) {
	

		if(this.accionistaConstantesFunciones.resaltarBusquedaPorIdClientePorNombreCortoAccionista!=null) {
			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelBusquedaPorIdClientePorNombreCortoAccionista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
				jPanel.setBorder(this.accionistaConstantesFunciones.resaltarBusquedaPorIdClientePorNombreCortoAccionista);
			}
		}

		if(this.accionistaConstantesFunciones.resaltarFK_IdClienteAccionista!=null) {
			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdClienteAccionista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
				jPanel.setBorder(this.accionistaConstantesFunciones.resaltarFK_IdClienteAccionista);
			}
		}

		if(this.accionistaConstantesFunciones.resaltarFK_IdValorClienteInversionAccionista!=null) {
			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdValorClienteInversionAccionista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
				jPanel.setBorder(this.accionistaConstantesFunciones.resaltarFK_IdValorClienteInversionAccionista);
			}
		}

		if(this.accionistaConstantesFunciones.resaltarFK_IdValorIdentificacionAccionista!=null) {
			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdValorIdentificacionAccionista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
				jPanel.setBorder(this.accionistaConstantesFunciones.resaltarFK_IdValorIdentificacionAccionista);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAccionista() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAccionista.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelBusquedaPorIdClientePorNombreCortoAccionista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.accionistaConstantesFunciones.mostrarBusquedaPorIdClientePorNombreCortoAccionista);
			if(!this.accionistaConstantesFunciones.mostrarBusquedaPorIdClientePorNombreCortoAccionista && index>-1) {
				this.jTabbedPaneBusquedasAccionista.remove(index);
			}

			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdClienteAccionista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.accionistaConstantesFunciones.mostrarFK_IdClienteAccionista);
			if(!this.accionistaConstantesFunciones.mostrarFK_IdClienteAccionista && index>-1) {
				this.jTabbedPaneBusquedasAccionista.remove(index);
			}

			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdValorClienteInversionAccionista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.accionistaConstantesFunciones.mostrarFK_IdValorClienteInversionAccionista);
			if(!this.accionistaConstantesFunciones.mostrarFK_IdValorClienteInversionAccionista && index>-1) {
				this.jTabbedPaneBusquedasAccionista.remove(index);
			}

			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdValorIdentificacionAccionista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.accionistaConstantesFunciones.mostrarFK_IdValorIdentificacionAccionista);
			if(!this.accionistaConstantesFunciones.mostrarFK_IdValorIdentificacionAccionista && index>-1) {
				this.jTabbedPaneBusquedasAccionista.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAccionista() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAccionista.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelBusquedaPorIdClientePorNombreCortoAccionista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.accionistaConstantesFunciones.activarBusquedaPorIdClientePorNombreCortoAccionista);
				this.jTabbedPaneBusquedasAccionista.setEnabledAt(index,this.accionistaConstantesFunciones.activarBusquedaPorIdClientePorNombreCortoAccionista);
			}

			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdClienteAccionista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.accionistaConstantesFunciones.activarFK_IdClienteAccionista);
				this.jTabbedPaneBusquedasAccionista.setEnabledAt(index,this.accionistaConstantesFunciones.activarFK_IdClienteAccionista);
			}

			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdValorClienteInversionAccionista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.accionistaConstantesFunciones.activarFK_IdValorClienteInversionAccionista);
				this.jTabbedPaneBusquedasAccionista.setEnabledAt(index,this.accionistaConstantesFunciones.activarFK_IdValorClienteInversionAccionista);
			}

			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdValorIdentificacionAccionista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.accionistaConstantesFunciones.activarFK_IdValorIdentificacionAccionista);
				this.jTabbedPaneBusquedasAccionista.setEnabledAt(index,this.accionistaConstantesFunciones.activarFK_IdValorIdentificacionAccionista);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAccionista(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdClientePorNombreCorto")) {
			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelBusquedaPorIdClientePorNombreCortoAccionista);

			this.jTabbedPaneBusquedasAccionista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);

			this.accionistaConstantesFunciones.setResaltarBusquedaPorIdClientePorNombreCortoAccionista(resaltar);

			jPanel.setBorder(this.accionistaConstantesFunciones.resaltarBusquedaPorIdClientePorNombreCortoAccionista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdClienteAccionista);

			this.jTabbedPaneBusquedasAccionista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);

			this.accionistaConstantesFunciones.setResaltarFK_IdClienteAccionista(resaltar);

			jPanel.setBorder(this.accionistaConstantesFunciones.resaltarFK_IdClienteAccionista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteInversion")) {
			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdValorClienteInversionAccionista);

			this.jTabbedPaneBusquedasAccionista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);

			this.accionistaConstantesFunciones.setResaltarFK_IdValorClienteInversionAccionista(resaltar);

			jPanel.setBorder(this.accionistaConstantesFunciones.resaltarFK_IdValorClienteInversionAccionista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorIdentificacion")) {
			index= this.jTabbedPaneBusquedasAccionista.indexOfComponent(this.jPanelFK_IdValorIdentificacionAccionista);

			this.jTabbedPaneBusquedasAccionista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccionista.getComponent(index);

			this.accionistaConstantesFunciones.setResaltarFK_IdValorIdentificacionAccionista(resaltar);

			jPanel.setBorder(this.accionistaConstantesFunciones.resaltarFK_IdValorIdentificacionAccionista);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAccionista.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAccionista() throws Exception {

		if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAccionista();
		this.updateVisibilidadResaltarControlesFormularioAccionista();
		this.updateHabilitarResaltarControlesFormularioAccionista();
		
	}
	
	public void updateBorderResaltarControlesFormularioAccionista() throws Exception {
		if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.accionistaConstantesFunciones.resaltaridAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.setBorder(this.accionistaConstantesFunciones.resaltaridAccionista);}
		if(this.accionistaConstantesFunciones.resaltaridclienteAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setBorder(this.accionistaConstantesFunciones.resaltaridclienteAccionista);}
		if(this.accionistaConstantesFunciones.resaltaridvalorclienteinversionAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setBorder(this.accionistaConstantesFunciones.resaltaridvalorclienteinversionAccionista);}
		if(this.accionistaConstantesFunciones.resaltaridvaloridentificacionAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setBorder(this.accionistaConstantesFunciones.resaltaridvaloridentificacionAccionista);}
		if(this.accionistaConstantesFunciones.resaltaridentificacionAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jTextFieldidentificacionAccionista.setBorder(this.accionistaConstantesFunciones.resaltaridentificacionAccionista);}
		if(this.accionistaConstantesFunciones.resaltarapellidopaternoAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jTextAreaapellidopaternoAccionista.setBorder(this.accionistaConstantesFunciones.resaltarapellidopaternoAccionista);}
		if(this.accionistaConstantesFunciones.resaltarapellidomaternoAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jTextAreaapellidomaternoAccionista.setBorder(this.accionistaConstantesFunciones.resaltarapellidomaternoAccionista);}
		if(this.accionistaConstantesFunciones.resaltarprimernombreAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jTextAreaprimernombreAccionista.setBorder(this.accionistaConstantesFunciones.resaltarprimernombreAccionista);}
		if(this.accionistaConstantesFunciones.resaltarsegundonombreAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jTextAreasegundonombreAccionista.setBorder(this.accionistaConstantesFunciones.resaltarsegundonombreAccionista);}
		if(this.accionistaConstantesFunciones.resaltarnombrecortoAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jTextAreanombrecortoAccionista.setBorder(this.accionistaConstantesFunciones.resaltarnombrecortoAccionista);}
		if(this.accionistaConstantesFunciones.resaltarparticipacionAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jTextFieldparticipacionAccionista.setBorder(this.accionistaConstantesFunciones.resaltarparticipacionAccionista);}
		if(this.accionistaConstantesFunciones.resaltaresactivoAccionista!=null && this.jInternalFrameDetalleFormAccionista!=null) {this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.setBorderPainted(true);this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.setBorder(this.accionistaConstantesFunciones.resaltaresactivoAccionista);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAccionista() throws Exception {		
		if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAccionista!=null) {
	
		//this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.setVisible(this.accionistaConstantesFunciones.mostraridAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelidAccionista.setVisible(this.accionistaConstantesFunciones.mostraridAccionista);
		//this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setVisible(this.accionistaConstantesFunciones.mostraridclienteAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelidclienteAccionista.setVisible(this.accionistaConstantesFunciones.mostraridclienteAccionista);
			this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionista.setVisible(this.accionistaConstantesFunciones.mostraridclienteAccionista);
		//this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setVisible(this.accionistaConstantesFunciones.mostraridvalorclienteinversionAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelidvalorclienteinversionAccionista.setVisible(this.accionistaConstantesFunciones.mostraridvalorclienteinversionAccionista);
		//this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setVisible(this.accionistaConstantesFunciones.mostraridvaloridentificacionAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelidvaloridentificacionAccionista.setVisible(this.accionistaConstantesFunciones.mostraridvaloridentificacionAccionista);
		//this.jInternalFrameDetalleFormAccionista.jTextFieldidentificacionAccionista.setVisible(this.accionistaConstantesFunciones.mostraridentificacionAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelidentificacionAccionista.setVisible(this.accionistaConstantesFunciones.mostraridentificacionAccionista);
		//this.jInternalFrameDetalleFormAccionista.jTextAreaapellidopaternoAccionista.setVisible(this.accionistaConstantesFunciones.mostrarapellidopaternoAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelapellidopaternoAccionista.setVisible(this.accionistaConstantesFunciones.mostrarapellidopaternoAccionista);
		//this.jInternalFrameDetalleFormAccionista.jTextAreaapellidomaternoAccionista.setVisible(this.accionistaConstantesFunciones.mostrarapellidomaternoAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelapellidomaternoAccionista.setVisible(this.accionistaConstantesFunciones.mostrarapellidomaternoAccionista);
		//this.jInternalFrameDetalleFormAccionista.jTextAreaprimernombreAccionista.setVisible(this.accionistaConstantesFunciones.mostrarprimernombreAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelprimernombreAccionista.setVisible(this.accionistaConstantesFunciones.mostrarprimernombreAccionista);
		//this.jInternalFrameDetalleFormAccionista.jTextAreasegundonombreAccionista.setVisible(this.accionistaConstantesFunciones.mostrarsegundonombreAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelsegundonombreAccionista.setVisible(this.accionistaConstantesFunciones.mostrarsegundonombreAccionista);
		//this.jInternalFrameDetalleFormAccionista.jTextAreanombrecortoAccionista.setVisible(this.accionistaConstantesFunciones.mostrarnombrecortoAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelnombrecortoAccionista.setVisible(this.accionistaConstantesFunciones.mostrarnombrecortoAccionista);
		//this.jInternalFrameDetalleFormAccionista.jTextFieldparticipacionAccionista.setVisible(this.accionistaConstantesFunciones.mostrarparticipacionAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelparticipacionAccionista.setVisible(this.accionistaConstantesFunciones.mostrarparticipacionAccionista);
		//this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.setVisible(this.accionistaConstantesFunciones.mostraresactivoAccionista);
		this.jInternalFrameDetalleFormAccionista.jPanelesactivoAccionista.setVisible(this.accionistaConstantesFunciones.mostraresactivoAccionista);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAccionista() throws Exception {
		if(this.jInternalFrameDetalleFormAccionista==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAccionista!=null) {
	
		this.jInternalFrameDetalleFormAccionista.jLabelidAccionista.setEnabled(this.accionistaConstantesFunciones.activaridAccionista);
		this.jInternalFrameDetalleFormAccionista.jComboBoxidclienteAccionista.setEnabled(this.accionistaConstantesFunciones.activaridclienteAccionista);
			this.jInternalFrameDetalleFormAccionista.jButtonidclienteAccionista.setEnabled(this.accionistaConstantesFunciones.activaridclienteAccionista);
		this.jInternalFrameDetalleFormAccionista.jComboBoxidvalorclienteinversionAccionista.setEnabled(this.accionistaConstantesFunciones.activaridvalorclienteinversionAccionista);
		this.jInternalFrameDetalleFormAccionista.jComboBoxidvaloridentificacionAccionista.setEnabled(this.accionistaConstantesFunciones.activaridvaloridentificacionAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextFieldidentificacionAccionista.setEnabled(this.accionistaConstantesFunciones.activaridentificacionAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreaapellidopaternoAccionista.setEnabled(this.accionistaConstantesFunciones.activarapellidopaternoAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreaapellidomaternoAccionista.setEnabled(this.accionistaConstantesFunciones.activarapellidomaternoAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreaprimernombreAccionista.setEnabled(this.accionistaConstantesFunciones.activarprimernombreAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreasegundonombreAccionista.setEnabled(this.accionistaConstantesFunciones.activarsegundonombreAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextAreanombrecortoAccionista.setEnabled(this.accionistaConstantesFunciones.activarnombrecortoAccionista);
		this.jInternalFrameDetalleFormAccionista.jTextFieldparticipacionAccionista.setEnabled(this.accionistaConstantesFunciones.activarparticipacionAccionista);
		this.jInternalFrameDetalleFormAccionista.jCheckBoxesactivoAccionista.setEnabled(this.accionistaConstantesFunciones.activaresactivoAccionista);
		}
	}
	
		
}