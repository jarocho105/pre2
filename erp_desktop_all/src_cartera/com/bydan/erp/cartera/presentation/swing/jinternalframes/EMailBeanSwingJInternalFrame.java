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

import com.bydan.erp.cartera.util.EMailConstantesFunciones;
import com.bydan.erp.cartera.util.EMailParameterReturnGeneral;
//import com.bydan.erp.cartera.util.EMailParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.EMailBean;
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
public class EMailBeanSwingJInternalFrame extends EMailJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EMailBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EMail> emailValidator = new ClassValidator<EMail>(EMail.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EMail email;	
	public EMail emailAux;
	public EMail emailAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EMail emailTotales;
	public Long idEMailActual;
	public Long iIdNuevoEMail=0L;
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
	
	public Boolean isPermisoTodoEMail;
	public Boolean isPermisoNuevoEMail;
	public Boolean isPermisoActualizarEMail;
	public Boolean isPermisoActualizarOriginalEMail;
	public Boolean isPermisoEliminarEMail;
	public Boolean isPermisoGuardarCambiosEMail;
	public Boolean isPermisoConsultaEMail;
	public Boolean isPermisoBusquedaEMail;
	public Boolean isPermisoReporteEMail;
	public Boolean isPermisoPaginacionMedioEMail;
	public Boolean isPermisoPaginacionAltoEMail;
	public Boolean isPermisoPaginacionTodoEMail;
	public Boolean isPermisoCopiarEMail;
	public Boolean isPermisoVerFormEMail;
	public Boolean isPermisoDuplicarEMail;
	public Boolean isPermisoOrdenEMail;
	
	
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
	
	public EMailParameterReturnGeneral emailReturnGeneral;
	public EMailParameterReturnGeneral emailParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEMail=false;
	public Boolean esParaAccionDesdeFormularioEMail=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EMailSessionBeanAdditional emailSessionBeanAdditional=null;
	
	public EMailSessionBeanAdditional getEMailSessionBeanAdditional() {
		return this.emailSessionBeanAdditional;
	}
	
	public void setEMailSessionBeanAdditional(EMailSessionBeanAdditional emailSessionBeanAdditional) {
		try {
			this.emailSessionBeanAdditional=emailSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EMailBeanSwingJInternalFrameAdditional emailBeanSwingJInternalFrameAdditional=null;
	//public class EMailBeanSwingJInternalFrame
	
	public EMailBeanSwingJInternalFrameAdditional getEMailBeanSwingJInternalFrameAdditional() {
		return this.emailBeanSwingJInternalFrameAdditional;
	}
	
	public void setEMailBeanSwingJInternalFrameAdditional(EMailBeanSwingJInternalFrameAdditional emailBeanSwingJInternalFrameAdditional) {
		try {
			this.emailBeanSwingJInternalFrameAdditional=emailBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EMailLogic emailLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EMail emailBean;
	public EMailConstantesFunciones emailConstantesFunciones;
	//public EMailParameterReturnGeneral emailReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<EMail> emails;	
	//public List<EMail> emailsEliminados;
	//public List<EMail> emailsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEMail=false;
	public Boolean isVisibilidadCeldaDuplicarEMail=true;
	public Boolean isVisibilidadCeldaCopiarEMail=true;
	public Boolean isVisibilidadCeldaVerFormEMail=true;
	public Boolean isVisibilidadCeldaOrdenEMail=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEMail=false;
	public Boolean isVisibilidadCeldaModificarEMail=false;
	public Boolean isVisibilidadCeldaActualizarEMail=false;
	public Boolean isVisibilidadCeldaEliminarEMail=false;
	public Boolean isVisibilidadCeldaCancelarEMail=false;
	public Boolean isVisibilidadCeldaGuardarEMail=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEMail=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEMail() {
		return this.iIdNuevoEMail;
	}

	public void setiIdNuevoEMail(Long iIdNuevoEMail) {
		this.iIdNuevoEMail = iIdNuevoEMail;
	}
	
	public Long getidEMailActual() {
		return this.idEMailActual;
	}

	public void setidEMailActual(Long idEMailActual) {
		this.idEMailActual = idEMailActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EMail getemail() {
		return this.email;
	}

	public void setemail(EMail email) {
		this.email = email;
	}
	
	public EMail getemailAux() {
		return this.emailAux;
	}

	public void setemailAux(EMail emailAux) {
		this.emailAux = emailAux;
	}				
	
	public EMail getemailAnterior() {
		return this.emailAnterior;
	}

	public void setemailAnterior(EMail emailAnterior) {
		this.emailAnterior = emailAnterior;
	}	
	
	public EMail getemailTotales() {
		return this.emailTotales;
	}

	public void setemailTotales(EMail emailTotales) {
		this.emailTotales = emailTotales;
	}	
	
	public EMail getemailBean() {
		return this.emailBean;
	}

	public void setemailBean(EMail emailBean) {
		this.emailBean = emailBean;
	}	
	
	public EMailParameterReturnGeneral getemailReturnGeneral() {
		return this.emailReturnGeneral;
	}

	public void setemailReturnGeneral(EMailParameterReturnGeneral emailReturnGeneral) {
		this.emailReturnGeneral = emailReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EMailLogic getEMailLogic()	{		
		return emailLogic;
	}

	public void setEMailLogic(EMailLogic emailLogic) {
		this.emailLogic = emailLogic;
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
	
	public Boolean getIsEsNuevoEMail() {
		return isEsNuevoEMail;
	}

	public void setIsEsNuevoEMail(Boolean isEsNuevoEMail) {
		this.isEsNuevoEMail = isEsNuevoEMail;
	}

	public Boolean getEsParaAccionDesdeFormularioEMail() {
		return esParaAccionDesdeFormularioEMail;
	}
	
	public void setEsParaAccionDesdeFormularioEMail(Boolean esParaAccionDesdeFormularioEMail) {
		this.esParaAccionDesdeFormularioEMail = esParaAccionDesdeFormularioEMail;
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

			if(this.emailSessionBean==null) {
				this.emailSessionBean=new EMailSessionBean();
			}

			if(!this.emailSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(emailSessionBean.getlidEmpresaActual());
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

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.emailSessionBean==null) {
				this.emailSessionBean=new EMailSessionBean();
			}

			if(!this.emailSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

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
					clienteLogic.getEntityWithConnection(emailSessionBean.getlidClienteActual());
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

					if(this.email!=null) {
						this.email.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEMail!=null) {
						this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEMail.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEMail!=null) {
						if(this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.getItemCount()>0) {
							this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEMailGenerico)throws Exception
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
				jComboBoxid_empresaEMailGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEMailGenerico!=null && jComboBoxid_empresaEMailGenerico.getItemCount()>0) {
					jComboBoxid_empresaEMailGenerico.setSelectedIndex(0);
				}
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

					if(this.email!=null) {
						this.email.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormEMail!=null) {
						this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteEMail.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormEMail!=null) {
						if(this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.getItemCount()>0) {
							this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteEMail!=null) {
						jComboBoxid_clienteFK_IdClienteEMail.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteEMail!=null) {
							//jComboBoxid_clienteFK_IdClienteEMail.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteEMail.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteEMail.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteEMailGenerico)throws Exception
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
				jComboBoxid_clienteEMailGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteEMailGenerico!=null && jComboBoxid_clienteEMailGenerico.getItemCount()>0) {
					jComboBoxid_clienteEMailGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EMail email,JComboBox jComboBoxid_empresaEMailGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEMailGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEMailGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				email.setid_empresa(empresaAux.getId());
				email.setempresa_descripcion(EMailConstantesFunciones.getEmpresaDescripcion(empresaAux));
				email.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(EMail email,JComboBox jComboBoxid_clienteEMailGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteEMailGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteEMailGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				email.setid_cliente(clienteAux.getId());
				email.setcliente_descripcion(EMailConstantesFunciones.getClienteDescripcion(clienteAux));
				email.setCliente(clienteAux);			}
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

					if(!EMailJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEMail!=null) { 
							this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEMail!=null) { 
					}

					if(!EMailJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EMailJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEMail!=null) { 
							this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEMail!=null) { 
					}

					if(!EMailJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EMailJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteEMail.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteEMail.addItem(cliente);
							}
						}

						if(!EMailJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEMail!=null) {
							this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEMail!=null) {
							this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEMail!=null) {
							this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormEMail!=null) {
							this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteEMail.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteEMail.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEMail() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EMailConstantesFunciones.refrescarForeignKeysDescripcionesEMail(this.emailLogic.getEMails());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EMailConstantesFunciones.refrescarForeignKeysDescripcionesEMail(this.emails);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//emailLogic.setEMails(this.emails);
			emailLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EMailParameterReturnGeneral getEMailParameterGeneral() {
		return this.emailParameterGeneral;
	}
	
	public void setEMailParameterGeneral(EMailParameterReturnGeneral emailParameterGeneral) {
		this.emailParameterGeneral = emailParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEMail() {
		return isPermisoTodoEMail;
	}

	public void setIsPermisoTodoEMail(Boolean isPermisoTodoEMail) {
		this.isPermisoTodoEMail = isPermisoTodoEMail;
	}

	public Boolean getIsPermisoNuevoEMail() {
		return isPermisoNuevoEMail;
	}

	public void setIsPermisoNuevoEMail(Boolean isPermisoNuevoEMail) {
		this.isPermisoNuevoEMail = isPermisoNuevoEMail;
	}

	public Boolean getIsPermisoActualizarEMail() {
		return isPermisoActualizarEMail;
	}

	public void setIsPermisoActualizarEMail(Boolean isPermisoActualizarEMail) {
		this.isPermisoActualizarEMail = isPermisoActualizarEMail;
	}

	public Boolean getIsPermisoEliminarEMail() {
		return isPermisoEliminarEMail;
	}

	public void setIsPermisoEliminarEMail(Boolean isPermisoEliminarEMail) {
		this.isPermisoEliminarEMail = isPermisoEliminarEMail;
	}

	public Boolean getIsPermisoGuardarCambiosEMail() {
		return isPermisoGuardarCambiosEMail;
	}

	public void setIsPermisoGuardarCambiosEMail(Boolean isPermisoGuardarCambiosEMail) {
		this.isPermisoGuardarCambiosEMail = isPermisoGuardarCambiosEMail;
	}
	
	public Boolean getIsPermisoConsultaEMail() {
		return isPermisoConsultaEMail;
	}

	public void setIsPermisoConsultaEMail(Boolean isPermisoConsultaEMail) {
		this.isPermisoConsultaEMail = isPermisoConsultaEMail;
	}

	public Boolean getIsPermisoBusquedaEMail() {
		return isPermisoBusquedaEMail;
	}

	public void setIsPermisoBusquedaEMail(Boolean isPermisoBusquedaEMail) {
		this.isPermisoBusquedaEMail = isPermisoBusquedaEMail;
	}

	public Boolean getIsPermisoReporteEMail() {
		return isPermisoReporteEMail;
	}

	public void setIsPermisoReporteEMail(Boolean isPermisoReporteEMail) {
		this.isPermisoReporteEMail = isPermisoReporteEMail;
	}
	
	public Boolean getIsPermisoPaginacionMedioEMail() {
		return isPermisoPaginacionMedioEMail;
	}

	public void setIsPermisoPaginacionMedioEMail(Boolean isPermisoPaginacionMedioEMail) {
		this.isPermisoPaginacionMedioEMail = isPermisoPaginacionMedioEMail;
	}
	
	public Boolean getIsPermisoPaginacionTodoEMail() {
		return isPermisoPaginacionTodoEMail;
	}

	public void setIsPermisoPaginacionTodoEMail(Boolean isPermisoPaginacionTodoEMail) {
		this.isPermisoPaginacionTodoEMail = isPermisoPaginacionTodoEMail;
	}
	
	public Boolean getIsPermisoPaginacionAltoEMail() {
		return isPermisoPaginacionAltoEMail;
	}

	public void setIsPermisoPaginacionAltoEMail(Boolean isPermisoPaginacionAltoEMail) {
		this.isPermisoPaginacionAltoEMail = isPermisoPaginacionAltoEMail;
	}
	
	public Boolean getIsPermisoCopiarEMail() {
		return isPermisoCopiarEMail;
	}

	public void setIsPermisoCopiarEMail(Boolean isPermisoCopiarEMail) {
		this.isPermisoCopiarEMail = isPermisoCopiarEMail;
	}
	
	public Boolean getIsPermisoVerFormEMail() {
		return isPermisoVerFormEMail;
	}

	public void setIsPermisoVerFormEMail(Boolean isPermisoVerFormEMail) {
		this.isPermisoVerFormEMail = isPermisoVerFormEMail;
	}
	
	public Boolean getIsPermisoDuplicarEMail() {
		return isPermisoDuplicarEMail;
	}

	public void setIsPermisoDuplicarEMail(Boolean isPermisoDuplicarEMail) {
		this.isPermisoDuplicarEMail = isPermisoDuplicarEMail;
	}
	
	public Boolean getIsPermisoOrdenEMail() {
		return isPermisoOrdenEMail;
	}

	public void setIsPermisoOrdenEMail(Boolean isPermisoOrdenEMail) {
		this.isPermisoOrdenEMail = isPermisoOrdenEMail;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEMail() {
		return isVisibilidadCeldaNuevoEMail;
	}

	public void setIsVisibilidadCeldaNuevoEMail(Boolean isVisibilidadCeldaNuevoEMail) {
		this.isVisibilidadCeldaNuevoEMail = isVisibilidadCeldaNuevoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEMail() {
		return isVisibilidadCeldaDuplicarEMail;
	}

	public void setIsVisibilidadCeldaDuplicarEMail(Boolean isVisibilidadCeldaDuplicarEMail) {
		this.isVisibilidadCeldaDuplicarEMail = isVisibilidadCeldaDuplicarEMail;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEMail() {
		return isVisibilidadCeldaCopiarEMail;
	}

	public void setIsVisibilidadCeldaCopiarEMail(Boolean isVisibilidadCeldaCopiarEMail) {
		this.isVisibilidadCeldaCopiarEMail = isVisibilidadCeldaCopiarEMail;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEMail() {
		return isVisibilidadCeldaVerFormEMail;
	}

	public void setIsVisibilidadCeldaVerFormEMail(Boolean isVisibilidadCeldaVerFormEMail) {
		this.isVisibilidadCeldaVerFormEMail = isVisibilidadCeldaVerFormEMail;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEMail() {
		return isVisibilidadCeldaOrdenEMail;
	}

	public void setIsVisibilidadCeldaOrdenEMail(Boolean isVisibilidadCeldaOrdenEMail) {
		this.isVisibilidadCeldaOrdenEMail = isVisibilidadCeldaOrdenEMail;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEMail() {
		return isVisibilidadCeldaNuevoRelacionesEMail;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEMail(Boolean isVisibilidadCeldaNuevoRelacionesEMail) {
		this.isVisibilidadCeldaNuevoRelacionesEMail = isVisibilidadCeldaNuevoRelacionesEMail;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEMail() {
		return isVisibilidadCeldaModificarEMail;
	}

	public void setIsVisibilidadCeldaModificarEMail(Boolean isVisibilidadCeldaModificarEMail) {
		this.isVisibilidadCeldaModificarEMail = isVisibilidadCeldaModificarEMail;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEMail() {
		return isVisibilidadCeldaActualizarEMail;
	}

	public void setIsVisibilidadCeldaActualizarEMail(Boolean isVisibilidadCeldaActualizarEMail) {
		this.isVisibilidadCeldaActualizarEMail = isVisibilidadCeldaActualizarEMail;
	}

	public Boolean getIsVisibilidadCeldaEliminarEMail() {
		return isVisibilidadCeldaEliminarEMail;
	}

	public void setIsVisibilidadCeldaEliminarEMail(Boolean isVisibilidadCeldaEliminarEMail) {
		this.isVisibilidadCeldaEliminarEMail = isVisibilidadCeldaEliminarEMail;
	}

	public Boolean getIsVisibilidadCeldaCancelarEMail() {
		return isVisibilidadCeldaCancelarEMail;
	}

	public void setIsVisibilidadCeldaCancelarEMail(Boolean isVisibilidadCeldaCancelarEMail) {
		this.isVisibilidadCeldaCancelarEMail = isVisibilidadCeldaCancelarEMail;
	}

	public Boolean getIsVisibilidadCeldaGuardarEMail() {
		return isVisibilidadCeldaGuardarEMail;
	}

	public void setIsVisibilidadCeldaGuardarEMail(Boolean isVisibilidadCeldaGuardarEMail) {
		this.isVisibilidadCeldaGuardarEMail = isVisibilidadCeldaGuardarEMail;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEMail() {
		return isVisibilidadCeldaGuardarCambiosEMail;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEMail(Boolean isVisibilidadCeldaGuardarCambiosEMail) {
		this.isVisibilidadCeldaGuardarCambiosEMail = isVisibilidadCeldaGuardarCambiosEMail;
	}
		
	public EMailSessionBean getemailSessionBean() {
		return this.emailSessionBean;
	}
	
	public void setemailSessionBean(EMailSessionBean emailSessionBean) {
		this.emailSessionBean=emailSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEMail(EMail email)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(email,null);
				this.setActualParaGuardarClienteForeignKey(email,null);
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
	
	public void bugActualizarReferenciaActual(EMail email,EMail emailAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEMail(email);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		emailAux.setId(email.getId());
		emailAux.setVersionRow(email.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEMail();
		
			int intSelectedRow = this.jTableDatosEMail.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEMail(this.email,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = emailValidator.getInvalidValues(this.email);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			emailLogic.setDatosCliente(datosCliente);
			emailLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				emailAux=new  EMail();
				
				emailAux.setIsNew(true);
				emailAux.setIsChanged(true);
				
				emailAux.setEMailOriginal(this.email);
				
				emailAux.setId(this.email.getId());	
				emailAux.setVersionRow(this.email.getVersionRow());	
				emailAux.setid_empresa(this.email.getid_empresa());	
				emailAux.setid_cliente(this.email.getid_cliente());	
				emailAux.sete_mail(this.email.gete_mail());	
				emailAux.setdescripcion(this.email.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.emailSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.emailSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(emailAux,emailLogic.getEMails());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(emailAux,emails);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.emailSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.emailSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						emailLogic.saveEMails();//WithConnection
						//emailLogic.getSetVersionRowEMails();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.email,emailAux);
					
					this.refrescarForeignKeysDescripcionesEMail();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.emailSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.emailSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								emailLogic.saveEMailRelaciones(emailAux);//WithConnection
								//emailLogic.getSetVersionRowEMails();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.email,emailAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.emailSessionBean.getEstaModoGuardarRelaciones() 
									|| this.emailSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(emailAux,emailLogic.getEMails());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(emailAux,emails);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.email,emailAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				emailAux=new  EMail();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.emailSessionBean.getEsGuardarRelacionado() 
					|| (this.emailSessionBean.getEsGuardarRelacionado() && this.email.getId()>=0)) {
						
					emailAux.setIsNew(false);
				}
				
				emailAux.setIsDeleted(false);
			
				emailAux.setId(this.email.getId());	
				emailAux.setVersionRow(this.email.getVersionRow());	
				emailAux.setid_empresa(this.email.getid_empresa());	
				emailAux.setid_cliente(this.email.getid_cliente());	
				emailAux.sete_mail(this.email.gete_mail());	
				emailAux.setdescripcion(this.email.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(emailAux,emailLogic.getEMails());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(emailAux,emails);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.emailSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.emailSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						emailLogic.saveEMails();//WithConnection
						//emailLogic.getSetVersionRowEMails();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.email,emailAux);
					
					this.refrescarForeignKeysDescripcionesEMail();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.emailSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.emailSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								emailLogic.saveEMailRelaciones(emailAux);//WithConnection
								//emailLogic.getSetVersionRowEMails();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.email,emailAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.emailSessionBean.getEstaModoGuardarRelaciones() 
									|| this.emailSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(emailAux,emailLogic.getEMails());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(emailAux,emails);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.email,emailAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				emailAux=new  EMail();
				
				emailAux.setIsNew(false);
				emailAux.setIsChanged(false);
				
				emailAux.setIsDeleted(true);
				
				emailAux.setId(this.email.getId());	
				emailAux.setVersionRow(this.email.getVersionRow());	
				emailAux.setid_empresa(this.email.getid_empresa());	
				emailAux.setid_cliente(this.email.getid_cliente());	
				emailAux.sete_mail(this.email.gete_mail());	
				emailAux.setdescripcion(this.email.getdescripcion());	
				
				if(this.emailSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.emailAux.getId()>=0) {	
						this.emailsEliminados.add(emailAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(emailAux,emailLogic.getEMails());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(emailAux,emails);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.emailSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.emailSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						emailLogic.saveEMails();//WithConnection
						//emailLogic.getSetVersionRowEMails();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.emailSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.emailSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								emailLogic.saveEMailRelaciones(emailAux);//WithConnection
								//emailLogic.getSetVersionRowEMails();//WithConnection
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
							if(this.emailSessionBean.getEstaModoGuardarRelaciones() 
								|| this.emailSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(emailAux,emailLogic.getEMails());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(emailAux,emails);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.getEMails().addAll(this.emailsEliminados);
					
					emailLogic.saveEMails();//WithConnection
					//emailLogic.getSetVersionRowEMails();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEMail();
				
				this.emailsEliminados= new ArrayList<EMail>();		
			}
			
			if(this.emailSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"E Mail GUARDADO CORRECTAMENTE","MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.email=emailAux;
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
      		//this.finishProcessEMail();
      	}
		
	}	
	
	public void actualizarRelaciones(EMail emailLocal) throws Exception {
		
		if(this.emailSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EMail emailLocal) throws Exception {	
		if(this.emailSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				emailLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				emailLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEMailActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEMail.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = emailValidator.getInvalidValues(this.email);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EMail email,List<EMail> emails) throws Exception {
		try	{		
			EMailConstantesFunciones.actualizarLista(email,emails,this.emailSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EMail email,List<EMail> emails) throws Exception {
		try	{			
			EMailConstantesFunciones.actualizarSelectedLista(email,emails);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EMail> emailsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				emailsLocal=this.emailLogic.getEMails();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				emailsLocal=this.emails;
			}
			//ARCHITECTURE
		
			for(EMail emailLocal:emailsLocal) {
				if(this.permiteMantenimiento(emailLocal) && emailLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EMailConstantesFunciones.getEMailLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EMailConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEMail.jLabelid_empresaEMail,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EMailConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEMail.jLabelid_clienteEMail,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EMailConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEMail.jLabele_mailEMail,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EMailConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEMail.jLabeldescripcionEMail,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEMail!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEMail.jLabelid_empresaEMail,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEMail.jLabelid_clienteEMail,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEMail.jLabele_mailEMail,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEMail.jLabeldescripcionEMail,"");
		
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
		this.iIdNuevoEMail--;	
		
		
		this.emailAux=new EMail();
		
		this.emailAux.setId(this.iIdNuevoEMail);
		this.emailAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.emailLogic.getEMails().add(this.emailAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.emails.add(this.emailAux);
		}
		//ARCHITECTURE
		
		this.email=this.emailAux;
		
		if(EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEMail(this.email);
			this.setVariablesObjetoActualToFormularioForeignKeyEMail(this.email);
		}
				
		//this.setDefaultControlesEMail();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEMail();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEMail();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEMail();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEMail(this.emailBean,this.email,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EMailConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.emailSessionBean.getConGuardarRelaciones()) {
			classes=EMailConstantesFunciones.getClassesRelationshipsOfEMail(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.emailReturnGeneral=emailLogic.procesarEventosEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.emailLogic.getEMails(),this.email,this.emailParameterGeneral,this.isEsNuevoEMail,classes);//this.emailLogic.getEMail()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEMail(this.emailReturnGeneral,this.emailBean,false);
		
		if(this.emailReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEMail(this.emailReturnGeneral.getEMail());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEMail(this.emailReturnGeneral.getEMail());
		}
		
		if(this.emailReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEMail(this.emailReturnGeneral.getEMail(),classes);//this.emailBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEMail(this.email,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEMail();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEMail();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EMailBeanSwingJInternalFrameAdditional.RecargarFormEMail(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEMail(false);
						
			if(emailSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EMailJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEMail();
			}
			
			this.actualizarVisualTableDatosEMail();
			
			this.jTableDatosEMail.setRowSelectionInterval(this.getIndiceNuevoEMail(), this.getIndiceNuevoEMail());
			
			this.seleccionarFilaTablaEMailActual();
						
			this.actualizarEstadoCeldasBotonesEMail("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEMail(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEMail.jTextAreae_mailEMail.setEnabled(isHabilitar && this.emailConstantesFunciones.activare_mailEMail);
		this.jInternalFrameDetalleFormEMail.jTextAreadescripcionEMail.setEnabled(isHabilitar && this.emailConstantesFunciones.activardescripcionEMail);	
		//
		this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setEnabled(isHabilitar && this.emailConstantesFunciones.activarid_empresaEMail);
		this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setEnabled(isHabilitar && this.emailConstantesFunciones.activarid_clienteEMail);
	};
	
	public void setDefaultControlesEMail() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEMail(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.emailSessionBean.setConGuardarRelaciones(true);			
			this.emailSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.setVisible(true);
			
					
		} else {
			//this.emailSessionBean.setConGuardarRelaciones(false);			
			this.emailSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEMail() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EMail emailAux:this.emailLogic.getEMails()) {
				if(emailAux.getId().equals(this.iIdNuevoEMail)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EMail emailAux:this.emails) {
				if(emailAux.getId().equals(this.iIdNuevoEMail)) {
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
	
	public int getIndiceActualEMail(EMail email,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EMail emailAux:this.emailLogic.getEMails()) {
				if(emailAux.getId().equals(email.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EMail emailAux:this.emails) {
				if(emailAux.getId().equals(email.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEMail(EMail emailOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EMail emailAux:this.emailLogic.getEMails()) {
				if(emailAux.getEMailOriginal().getId().equals(emailOriginal.getId())) {
					existe=true;
					emailOriginal.setId(emailAux.getId());
					emailOriginal.setVersionRow(emailAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EMail emailAux:this.emails) {
				if(emailAux.getEMailOriginal().getId().equals(emailOriginal.getId())) {
					existe=true;
					emailOriginal.setId(emailAux.getId());
					emailOriginal.setVersionRow(emailAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEMail(Boolean esParaCancelar) throws Exception {
		emailsAux=new ArrayList<EMail>();
		emailAux=new EMail();
		
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EMail emailAux:this.emailLogic.getEMails()) {
					if(emailAux.getId()<0) {
						emailsAux.add(emailAux);
					}		
				}
				this.iIdNuevoEMail=0L;
				this.emailLogic.getEMails().removeAll(emailsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EMail emailAux:this.emails) {
					if(emailAux.getId()<0) {
						emailsAux.add(emailAux);
					}		
				}
				this.iIdNuevoEMail=0L;
				this.emails.removeAll(emailsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEMail 
					&& this.emailLogic.getEMails().size()>0
					) {
					emailAux=this.emailLogic.getEMails().get(this.emailLogic.getEMails().size() - 1);
				
					if(emailAux.getId()<0) {
						this.emailLogic.getEMails().remove(emailAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEMail && this.emails.size()>0) {
					emailAux=this.emails.get(this.emails.size() - 1);
				
					if(emailAux.getId()<0) {
						this.emails.remove(emailAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEMail(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(email.getId()<0) {
				this.emailLogic.getEMails().remove(this.email);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(email.getId()<0) {
				this.emails.remove(this.email);
			}
		}			
	}
	
	public void setEstadosInicialesEMail(List<EMail> emailsAux) throws Exception {
		EMailConstantesFunciones.setEstadosInicialesEMail(emailsAux);
	}
	
	public void setEstadosInicialesEMail(EMail emailAux) throws Exception {
		EMailConstantesFunciones.setEstadosInicialesEMail(emailAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEMailActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEMailActual()) {
				if(!this.isEsNuevoEMail) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEMail=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEMailActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA E Mail ?", "MANTENIMIENTO DE E Mail", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EMail email) throws Exception {
		EMailConstantesFunciones.seleccionarAsignar(this.email,email);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEMail=this.isPermisoActualizarOriginalEMail;
			
			
			this.seleccionarAsignar(email);
			
			

			idClienteActual=email.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EMailConstantesFunciones.quitarEspaciosEMail(this.email,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEMail("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.emailSessionBean.setsFuncionBusquedaRapida(this.emailSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoEMail) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEMail(esParaCancelar);				
				this.cancelarNuevoEMail(esParaCancelar);								
			}
			
			this.email=new EMail();
			
			this.inicializarEMail();
			
			this.actualizarEstadoCeldasBotonesEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEMail() throws Exception {
		try {
			EMailConstantesFunciones.inicializarEMail(this.email);
			
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
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.emailLogic.getEMails().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEMails(String sAccionBusqueda,List<EMail> emailsParaReportes) throws Exception {
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
					sPathReporteFinal="EMail"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EMailMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EMailMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EMail"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  E Mailes");		
		parameters.put("busquedapor", EMailConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEMail=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EMailConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EMailConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEMail=new JRBeanArrayDataSource(EMailJInternalFrame.TraerEMailBeans(emailsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEMail);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EMailConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EMailConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EMailBean.TraerEMailBeans(emailsParaReportes).toArray()));
							
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
				this.generarExcelReporteEMails(sAccionBusqueda,sTipoArchivoReporte,emailsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEMails(sAccionBusqueda,sTipoArchivoReporte,emailsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEMailActionPerformed(null);
					//this.generarExcelReporteEMails(sAccionBusqueda,sTipoArchivoReporte,emailsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEMails(sAccionBusqueda,sTipoArchivoReporte,emailsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEMails(sAccionBusqueda,sTipoArchivoReporte,emailsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEMails(sAccionBusqueda,sTipoArchivoReporte,emailsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEMails(String sAccionBusqueda,String sTipoArchivoReporte,List<EMail> emailsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"email";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EMails");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEMail("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EMail email : emailsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EMailConstantesFunciones.generarExcelReporteDataEMail("NORMAL",row,workbook,email,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEMail(String sTipo,Row row,Workbook workbook) {
		
		EMailConstantesFunciones.generarExcelReporteHeaderEMail(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEMails(String sAccionBusqueda,String sTipoArchivoReporte,List<EMail> emailsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"email_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EMails");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EMail email : emailsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EMailConstantesFunciones.getEMailDescripcion(email));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EMailConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EMailConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(email.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EMailConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EMailConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(email.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EMailConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EMailConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(email.gete_mail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EMailConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EMailConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(email.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEMails(String sAccionBusqueda,String sTipoArchivoReporte,List<EMail> emailsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EMail> emailsRespaldo=null;
		
		classes=EMailConstantesFunciones.getClassesRelationshipsOfEMail(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.emailLogic.setDatosCliente(this.datosCliente);
		this.emailLogic.setDatosDeep(this.datosDeep);
		this.emailLogic.setIsConDeep(true);
		
		emailsRespaldo=this.emailLogic.getEMails();
		
		this.emailLogic.setEMails(emailsParaReportes);	
		this.emailLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		emailsParaReportes=this.emailLogic.getEMails();
		this.emailLogic.setEMails(emailsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"email_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EMails");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEMail("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EMail email : emailsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEMail("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EMailConstantesFunciones.generarExcelReporteDataEMail("NORMAL",row,workbook,email,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EMailConstantesFunciones.getEMailDescripcion(email));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEMail.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEMail.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEMail() throws Exception {		
		this.startProcessEMail(true);
	}
	
	public void startProcessEMail(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEMail ,this.jPanelParametrosReportesEMail, this.jScrollPanelDatosEMail,this.jPanelPaginacionEMail, this.jScrollPanelDatosEdicionEMail, this.jPanelAccionesEMail,this.jPanelAccionesFormularioEMail,this.jmenuBarEMail,this.jmenuBarDetalleEMail,this.jTtoolBarEMail,this.jTtoolBarDetalleEMail);		
		
		final JTabbedPane jTabbedPaneBusquedasEMail=this.jTabbedPaneBusquedasEMail; 
		
		final JPanel jPanelParametrosReportesEMail=this.jPanelParametrosReportesEMail;
		//final JScrollPane jScrollPanelDatosEMail=this.jScrollPanelDatosEMail;
		final JTable jTableDatosEMail=this.jTableDatosEMail;		
		final JPanel jPanelPaginacionEMail=this.jPanelPaginacionEMail;
		//final JScrollPane jScrollPanelDatosEdicionEMail=this.jScrollPanelDatosEdicionEMail;
		final JPanel jPanelAccionesEMail=this.jPanelAccionesEMail;
		
		JPanel jPanelCamposAuxiliarEMail=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEMail=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEMail!=null) {
			jPanelCamposAuxiliarEMail=this.jInternalFrameDetalleFormEMail.jPanelCamposEMail;
			jPanelAccionesFormularioAuxiliarEMail=this.jInternalFrameDetalleFormEMail.jPanelAccionesFormularioEMail;
		}
		
		final JPanel jPanelCamposEMail=jPanelCamposAuxiliarEMail;
		final JPanel jPanelAccionesFormularioEMail=jPanelAccionesFormularioAuxiliarEMail;
		
		
		final JMenuBar jmenuBarEMail=this.jmenuBarEMail;
		final JToolBar jTtoolBarEMail=this.jTtoolBarEMail;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEMail=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEMail=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEMail!=null) {
			jmenuBarDetalleAuxiliarEMail=this.jInternalFrameDetalleFormEMail.jmenuBarDetalleEMail;
			jTtoolBarDetalleAuxiliarEMail=this.jInternalFrameDetalleFormEMail.jTtoolBarDetalleEMail;
		}
		
		final JMenuBar jmenuBarDetalleEMail=jmenuBarDetalleAuxiliarEMail;
		final JToolBar jTtoolBarDetalleEMail=jTtoolBarDetalleAuxiliarEMail;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEMail;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEMail;
			processRunnable.jTableDatos=jTableDatosEMail;
			processRunnable.jPanelCampos=jPanelCamposEMail;
			processRunnable.jPanelPaginacion=jPanelPaginacionEMail;
			processRunnable.jPanelAcciones=jPanelAccionesEMail;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEMail;
			
			
			processRunnable.jmenuBar=jmenuBarEMail;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEMail;
			processRunnable.jTtoolBar=jTtoolBarEMail;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEMail;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEMail ,jPanelParametrosReportesEMail,jTableDatosEMail, /*jScrollPanelDatosEMail,*/jPanelCamposEMail,jPanelPaginacionEMail, /*jScrollPanelDatosEdicionEMail,*/ jPanelAccionesEMail,jPanelAccionesFormularioEMail,jmenuBarEMail,jmenuBarDetalleEMail,jTtoolBarEMail,jTtoolBarDetalleEMail);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEMail ,jPanelParametrosReportesEMail, jScrollPanelDatosEMail,jPanelPaginacionEMail, jScrollPanelDatosEdicionEMail, jPanelAccionesEMail,jPanelAccionesFormularioEMail,jmenuBarEMail,jmenuBarDetalleEMail,jTtoolBarEMail,jTtoolBarDetalleEMail);
						
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
	
	public void finishProcessEMail() {// throws Exception 
		this.finishProcessEMail(true);
	}
	
	public void finishProcessEMail(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEMail ,this.jPanelParametrosReportesEMail, this.jScrollPanelDatosEMail,this.jPanelPaginacionEMail, this.jScrollPanelDatosEdicionEMail, this.jPanelAccionesEMail,this.jPanelAccionesFormularioEMail,this.jmenuBarEMail,this.jmenuBarDetalleEMail,this.jTtoolBarEMail,this.jTtoolBarDetalleEMail);		
		
		final JTabbedPane jTabbedPaneBusquedasEMail=this.jTabbedPaneBusquedasEMail; 
		
		final JPanel jPanelParametrosReportesEMail=this.jPanelParametrosReportesEMail;
		//final JScrollPane jScrollPanelDatosEMail=this.jScrollPanelDatosEMail;
		final JTable jTableDatosEMail=this.jTableDatosEMail;		
		final JPanel jPanelPaginacionEMail=this.jPanelPaginacionEMail;
		//final JScrollPane jScrollPanelDatosEdicionEMail=this.jScrollPanelDatosEdicionEMail;
		final JPanel jPanelAccionesEMail=this.jPanelAccionesEMail;
		
		JPanel jPanelCamposAuxiliarEMail=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEMail=new JPanel();
		
		if(this.jInternalFrameDetalleFormEMail!=null) {
			jPanelCamposAuxiliarEMail=this.jInternalFrameDetalleFormEMail.jPanelCamposEMail;
			jPanelAccionesFormularioAuxiliarEMail=this.jInternalFrameDetalleFormEMail.jPanelAccionesFormularioEMail;
		}
		
		final JPanel jPanelCamposEMail=jPanelCamposAuxiliarEMail;
		final JPanel jPanelAccionesFormularioEMail=jPanelAccionesFormularioAuxiliarEMail;
		
		
		final JMenuBar jmenuBarEMail=this.jmenuBarEMail;		
		final JToolBar jTtoolBarEMail=this.jTtoolBarEMail;
				
		JMenuBar jmenuBarDetalleAuxiliarEMail=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEMail=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEMail!=null) {
			jmenuBarDetalleAuxiliarEMail=this.jInternalFrameDetalleFormEMail.jmenuBarDetalleEMail;
			jTtoolBarDetalleAuxiliarEMail=this.jInternalFrameDetalleFormEMail.jTtoolBarDetalleEMail;		
		}
		
		final JMenuBar jmenuBarDetalleEMail=jmenuBarDetalleAuxiliarEMail;
		final JToolBar jTtoolBarDetalleEMail=jTtoolBarDetalleAuxiliarEMail;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEMail;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEMail;
			processRunnable.jTableDatos=jTableDatosEMail;
			processRunnable.jPanelCampos=jPanelCamposEMail;
			processRunnable.jPanelPaginacion=jPanelPaginacionEMail;
			processRunnable.jPanelAcciones=jPanelAccionesEMail;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEMail;
			
			
			processRunnable.jmenuBar=jmenuBarEMail;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEMail;
			processRunnable.jTtoolBar=jTtoolBarEMail;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEMail;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEMail ,jPanelParametrosReportesEMail, jTableDatosEMail,/*jScrollPanelDatosEMail,*/jPanelCamposEMail,jPanelPaginacionEMail, /*jScrollPanelDatosEdicionEMail,*/ jPanelAccionesEMail,jPanelAccionesFormularioEMail,jmenuBarEMail,jmenuBarDetalleEMail,jTtoolBarEMail,jTtoolBarDetalleEMail));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEMail(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEMail(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEMail(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEMail(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEMail,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEMail,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEMail(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEMail,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEMail,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.emailConstantesFunciones.getsFinalQueryEMail();
		String  finalQueryPaginacionTodos=this.emailConstantesFunciones.getsFinalQueryEMail();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EMailConstantesFunciones.getArrayColumnasGlobalesNoEMail(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EMailConstantesFunciones.getArrayColumnasGlobalesEMail(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EMailConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.emailsEliminados= new ArrayList<EMail>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEMail();
		
				///*EMailSessionBean*/this.emailSessionBean=new EMailSessionBean();
			
			if(this.emailSessionBean==null) {
				this.emailSessionBean=new EMailSessionBean();
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
					this.iNumeroPaginacion=EMailConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EMailConstantesFunciones.getClassesForeignKeysOfEMail(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/email."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			emailsAux= new ArrayList<EMail>();
			
				
			emailLogic.setDatosCliente(this.datosCliente);
			emailLogic.setDatosDeep(this.datosDeep);
			emailLogic.setIsConDeep(true);
			
			
			emailLogic.getEMailDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					emailLogic.getTodosEMails(finalQueryGlobal,pagination);
					
					//emailLogic.getTodosEMailsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(emailLogic.getEMails()==null|| emailLogic.getEMails().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							emailsAux= new ArrayList<EMail>();
							emailsAux.addAll(emailLogic.getEMails());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							emailsAux= new ArrayList<EMail>();
							emailsAux.addAll(emails);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							emailLogic.getTodosEMails(finalQueryGlobal+"",this.pagination);												
							
							//emailLogic.getTodosEMailsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEMails("Todos",emailLogic.getEMails() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							emailLogic.setEMails(new ArrayList<EMail>());					
							emailLogic.getEMails().addAll(emailsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							emails=new ArrayList<EMail>();
							emails.addAll(emailsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEMail=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEMail=this.idActual;
				
				} else if(this.idEMailActual!=null && this.idEMailActual!=0L) {
					idEMail=idEMailActual;
				}
				
					
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndicePorId(idEMail);
				
				this.emails=new ArrayList<EMail>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					emailLogic.getEntity(idEMail);
					
					//emailLogic.getEntityWithConnection(idEMail);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					emailLogic.setEMails(new ArrayList<EMail>());
					emailLogic.getEMails().add(emailLogic.getEMail());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.emails=new ArrayList<EMail>();
					this.emails.add(email);
				}
				
				if(emailLogic.getEMail()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					emailLogic.getEMailsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=emailLogic.getEMails()==null||emailLogic.getEMails().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=emails==null|| emails.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						emailsAux=new ArrayList<EMail>();
						emailsAux.addAll(emailLogic.getEMails());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							emailsAux=new ArrayList<EMail>();
							emailsAux.addAll(emails);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							emailLogic.getEMailsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEMails("FK_IdCliente",emailLogic.getEMails());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEMails("FK_IdCliente",emails);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						emailLogic.setEMails(new ArrayList<EMail>());
						emailLogic.getEMails().addAll(emailsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							emails=new ArrayList<EMail>();
							emails.addAll(emailsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					emailLogic.getEMailsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=emailLogic.getEMails()==null||emailLogic.getEMails().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=emails==null|| emails.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						emailsAux=new ArrayList<EMail>();
						emailsAux.addAll(emailLogic.getEMails());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							emailsAux=new ArrayList<EMail>();
							emailsAux.addAll(emails);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							emailLogic.getEMailsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEMails("FK_IdEmpresa",emailLogic.getEMails());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEMails("FK_IdEmpresa",emails);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						emailLogic.setEMails(new ArrayList<EMail>());
						emailLogic.getEMails().addAll(emailsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							emails=new ArrayList<EMail>();
							emails.addAll(emailsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEMail();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEMail();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=emailLogic.getEMails().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=emails.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=emailLogic.getEMails().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=emails.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EMail email) {
		Boolean permite=true;
		
		if(this.email.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EMailConstantesFunciones.getOrderByListaEMail();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EMailConstantesFunciones.getOrderByListaEMail();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EMail email:emailLogic.getEMails()) {
				if(email.getsType().equals(Constantes2.S_TOTALES)) {
					emailTotales=email;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EMail email:this.emails) {
				if(email.getsType().equals(Constantes2.S_TOTALES)) {
					emailTotales=email;
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
			this.emailAux=new EMail();
			this.emailAux.setsType(Constantes2.S_TOTALES);
			this.emailAux.setIsNew(false);
			this.emailAux.setIsChanged(false);
			this.emailAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EMailConstantesFunciones.TotalizarValoresFilaEMail(this.emailLogic.getEMails(),this.emailAux);
				
				this.emailLogic.getEMails().add(this.emailAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EMailConstantesFunciones.TotalizarValoresFilaEMail(this.emails,this.emailAux);
				
				this.emails.add(this.emailAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		emailTotales=new EMail();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.emailLogic.getEMails().remove(emailTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.emails.remove(emailTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		emailTotales=new EMail();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EMail email:emailLogic.getEMails()) {
				if(email.getsType().equals(Constantes2.S_TOTALES)) {
					emailTotales=email;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EMailConstantesFunciones.TotalizarValoresFilaEMail(this.emailLogic.getEMails(),emailTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EMail email:this.emails) {
				if(email.getsType().equals(Constantes2.S_TOTALES)) {
					emailTotales=email;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EMailConstantesFunciones.TotalizarValoresFilaEMail(this.emails,emailTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEMailsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEMailsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEMailsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					emailLogic.getEMailsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEMailsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					emailLogic.getEMailsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosEMail() {
		this.isPermisoTodoEMail=false;
		this.isPermisoNuevoEMail=false;
		this.isPermisoActualizarEMail=false;
		this.isPermisoActualizarOriginalEMail=false;
		this.isPermisoEliminarEMail=false;
		this.isPermisoGuardarCambiosEMail=false;
		this.isPermisoConsultaEMail=false;
		this.isPermisoBusquedaEMail=false;
		this.isPermisoReporteEMail=false;		
		this.isPermisoOrdenEMail=false;		
		this.isPermisoPaginacionMedioEMail=false;		
		this.isPermisoPaginacionAltoEMail=false;
		this.isPermisoPaginacionTodoEMail=false;
		this.isPermisoCopiarEMail=false;		
		this.isPermisoVerFormEMail=false;		
		this.isPermisoDuplicarEMail=false;		
		this.isPermisoOrdenEMail=false;		
	}
	
	public void setPermisosUsuarioEMail(Boolean isPermiso) {
		this.isPermisoTodoEMail=isPermiso;
		this.isPermisoNuevoEMail=isPermiso;
		this.isPermisoActualizarEMail=isPermiso;
		this.isPermisoActualizarOriginalEMail=isPermiso;
		this.isPermisoEliminarEMail=isPermiso;
		this.isPermisoGuardarCambiosEMail=isPermiso;
		this.isPermisoConsultaEMail=isPermiso;
		this.isPermisoBusquedaEMail=isPermiso;
		this.isPermisoReporteEMail=isPermiso;
		this.isPermisoOrdenEMail=isPermiso;		
		this.isPermisoPaginacionMedioEMail=isPermiso;		
		this.isPermisoPaginacionAltoEMail=isPermiso;		
		this.isPermisoPaginacionTodoEMail=isPermiso;		
		this.isPermisoCopiarEMail=isPermiso;		
		this.isPermisoVerFormEMail=isPermiso;		
		this.isPermisoDuplicarEMail=isPermiso;
		this.isPermisoOrdenEMail=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEMail(Boolean isPermiso) {
		//this.isPermisoTodoEMail=isPermiso;
		this.isPermisoNuevoEMail=isPermiso;
		this.isPermisoActualizarEMail=isPermiso;
		this.isPermisoActualizarOriginalEMail=isPermiso;
		this.isPermisoEliminarEMail=isPermiso;
		this.isPermisoGuardarCambiosEMail=isPermiso;
		//this.isPermisoConsultaEMail=isPermiso;
		//this.isPermisoBusquedaEMail=isPermiso;
		//this.isPermisoReporteEMail=isPermiso;
		//this.isPermisoOrdenEMail=isPermiso;		
		//this.isPermisoPaginacionMedioEMail=isPermiso;		
		//this.isPermisoPaginacionAltoEMail=isPermiso;		
		//this.isPermisoPaginacionTodoEMail=isPermiso;		
		//this.isPermisoCopiarEMail=isPermiso;		
		//this.isPermisoDuplicarEMail=isPermiso;
		//this.isPermisoOrdenEMail=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEMailClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EMailJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEMail(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEMailClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEMailClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEMailClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEMailClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEMail() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EMailJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.emailSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EMailConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEMail=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEMail=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEMail=this.isPermisoActualizarEMail;
			this.isPermisoEliminarEMail=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEMail=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEMail=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEMail=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEMail=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEMail=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEMail=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEMail=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEMail=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEMail=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEMail=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEMail=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEMail=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEMail=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.emailSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEMail.setToolTipText(this.jTableDatosEMail.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEMail(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEMail(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EMailJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EMailJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEMail() throws Exception {
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
	public void inicializarCombosForeignKeyEMailListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEMailListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EMailJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEMailListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyEMailListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EMailParameterReturnGeneral emailReturnGeneral=new EMailParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.emailConstantesFunciones.cargarid_empresaEMail)
					 || (this.esRecargarFks && this.emailConstantesFunciones.cargarid_empresaEMail)) {

					if(!this.emailSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+emailSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.emailConstantesFunciones.cargarid_clienteEMail)
					 || (this.esRecargarFks && this.emailConstantesFunciones.cargarid_clienteEMail)) {

					if(!this.emailSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+emailSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				emailReturnGeneral=emailLogic.cargarCombosLoteForeignKeyEMail(finalQueryGlobalEmpresa,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=emailReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=emailReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEMail()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.emailSessionBean==null) {
				this.emailSessionBean=new EMailSessionBean();
			}

			if(!this.emailSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.emailSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyEMail()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEMail(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEMail()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEMail();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEMail(EMail email)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(email.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEMail(EMail email,String sTipoEvento)throws Exception {	
		try {
			
			

				if(email.getCliente()!=null && !sTipoEvento.equals("id_clienteEMail")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(email.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEMail()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.emailConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEMail()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEMail()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEMail()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEMail()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEMail()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEMail(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEMail()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail!=null && this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.getItemCount()>0) {
				this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail!=null && this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.getItemCount()>0) {
				this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public EMailBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EMailBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EMailBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.emailSessionBean=new EMailSessionBean(); 
		this.emailConstantesFunciones=new EMailConstantesFunciones(); 
		this.emailBean=new EMail();//(this.emailConstantesFunciones); 		
		this.emailReturnGeneral=new EMailParameterReturnGeneral(); 
		
		this.emailSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.emailSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EMailBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EMailBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EMailBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEMail(true);
			
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
			
			this.emailConstantesFunciones=new EMailConstantesFunciones(); 
			this.emailBean=new EMail();//this.emailConstantesFunciones); 			
			this.emailReturnGeneral=new EMailParameterReturnGeneral(); 
		
			EMailBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"E Mail Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.email=new EMail();
			this.emails = new ArrayList<EMail>();
			this.emailsAux = new ArrayList<EMail>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic=new EMailLogic();
				this.emailLogic.getNewConnexionToDeep("");
			}
			
			//this.emailSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.emailSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEMail);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEMail!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEMail);	
					}
					
					if(this.jInternalFrameImportacionEMail!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEMail);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEMail!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEMail);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEMail!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEMail);
				this.jInternalFrameDetalleFormEMail.setVisible(false);
				this.jInternalFrameDetalleFormEMail.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEMail!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEMail);
					this.jInternalFrameReporteDinamicoEMail.setVisible(false);
					this.jInternalFrameReporteDinamicoEMail.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEMail!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEMail);
					this.jInternalFrameImportacionEMail.setVisible(false);
					this.jInternalFrameImportacionEMail.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEMail!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEMail);
					this.jInternalFrameOrderByEMail.setVisible(false);
					this.jInternalFrameOrderByEMail.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEMailActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EMailConstantesFunciones.INUMEROPAGINACION;
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
			
			this.emailReturnGeneral=new EMailParameterReturnGeneral();
			
			this.emailParameterGeneral=new EMailParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.emailLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.emailSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EMailJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.emailSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EMailConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.emailSessionBean.getEsGuardarRelacionado(),this.emailSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EMailConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.emailSessionBean.getEsGuardarRelacionado(),this.emailSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEMail=false;
			this.isVisibilidadCeldaDuplicarEMail=true;
			this.isVisibilidadCeldaCopiarEMail=true;
			this.isVisibilidadCeldaVerFormEMail=true;
			this.isVisibilidadCeldaOrdenEMail=true;
			this.isVisibilidadCeldaNuevoRelacionesEMail=false;
			this.isVisibilidadCeldaModificarEMail=false;
			this.isVisibilidadCeldaActualizarEMail=false;
			this.isVisibilidadCeldaEliminarEMail=false;
			this.isVisibilidadCeldaCancelarEMail=false;
			this.isVisibilidadCeldaGuardarEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEMail=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEMail();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEMail(false);
			
			this.setPermisosUsuarioEMail();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.emailSessionBean.getEsGuardarRelacionado() 
				|| (this.emailSessionBean.getEsGuardarRelacionado() && this.emailSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEMailClasesRelacionadas();
			}
			
			if(this.emailSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEMailClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EMailJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEMail();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEMail();
			}
			
			if(!this.isPermisoBusquedaEMail) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEMail.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.emailSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEMail,this.isPermisoPaginacionMedioEMail,this.isPermisoPaginacionTodoEMail);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EMailConstantesFunciones.getTiposSeleccionarEMail());
				
				this.tiposColumnasSelect=EMailConstantesFunciones.getTiposSeleccionarEMail(true);
				
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
			//if(!this.emailSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEMail();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEMail(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEMail(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEMail() ;
			
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
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				emailImplementable= (EMailImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EMailConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				emailImplementableHome= (EMailImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EMailConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.emails= new ArrayList<EMail>();
			this.emailsEliminados= new ArrayList<EMail>();
						
			this.isEsNuevoEMail=false;
			this.esParaAccionDesdeFormularioEMail=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEMail(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEMail();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.emailSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EMailBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EMailConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEMail(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEMail!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEMail();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEMail();
			}
			
			EMailBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEMail.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEMail.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEMail.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEMail(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EMail: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEMail() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEMail")) {
				iIndex=this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEMail.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEMail();	
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
	
	public void cargarCombosForeignKeyEMail(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEMail(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEMail(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEMailListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEMail();
		
		this.cargarCombosFrameForeignKeyEMail();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEMail();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEMail();
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
	
	public void jButtonNuevoEMailActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.emailSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
			
			if(jTableDatosEMail.getRowCount()>=1) {
				jTableDatosEMail.removeRowSelectionInterval(0, jTableDatosEMail.getRowCount()-1);						
			}
			
			this.isEsNuevoEMail=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEMail(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEMail(true);			
			//this.email=new EMail();
			//this.email.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEMail(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEMail() ;
			
			if(EMailJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEMail(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.email);	
			this.actualizarInformacion("INFO_PADRE",false,this.email);				
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
			if(this.emailSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EMail: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEMailActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEMail.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEMail.getSelectedRows().length;			
			}
			
			emailsSeleccionados=this.getEMailsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEMail--;			
				//EMail emailAux= new EMail();			
				//emailAux.setId(this.iIdNuevoEMail);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EMail emailOrigen=new EMail();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EMail emailOrigen : emailsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEMail.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							emailOrigen =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							emailOrigen =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEMail();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.email.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEMail(emailOrigen,this.email,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.emailLogic.getEMails().add(this.emailAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.emails.add(this.emailAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEMail(false);
				
				this.jTableDatosEMail.setRowSelectionInterval(this.getIndiceNuevoEMail(), this.getIndiceNuevoEMail());
				
				int iLastRow =  this.jTableDatosEMail.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEMail.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEMail.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEMail(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();									
		
			EMail emailOrigen=new EMail();
			EMail emailDestino=new EMail();
				
			emailsSeleccionados=this.getEMailsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEMail.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || emailsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEMail.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						emailOrigen =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						emailOrigen =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						emailDestino =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						emailDestino =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				emailOrigen =emailsSeleccionados.get(0);
				emailDestino =emailsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEMail(emailOrigen,emailDestino,true,false);
				
				emailDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(emailDestino,emailLogic.getEMails());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(emailDestino,emails);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEMail(false);
				
				//this.jTableDatosEMail.setRowSelectionInterval(this.getIndiceNuevoEMail(), this.getIndiceNuevoEMail());
				
				int iLastRow =  this.jTableDatosEMail.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEMail.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEMail.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEMail(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEMail.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEMail.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEMail.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEMail.setVisible(!isVisible);
			this.jPanelPaginacionEMail.setVisible(!isVisible);
			this.jPanelAccionesEMail.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEMail();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEMail();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEMail();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEMail();
			
			this.abrirFrameOrderByEMail();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEMail();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEMail(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEMail);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEMail.isMaximum()) {
					this.jInternalFrameDetalleFormEMail.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEMail.setSize(this.jInternalFrameDetalleFormEMail.iWidthFormulario,this.jInternalFrameDetalleFormEMail.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEMail.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEMail.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEMail.isMaximum()) {
						this.jInternalFrameDetalleFormEMail.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEMail.jContentPaneDetalleEMail.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEMail.jContentPaneDetalleEMail.getWidth(),EMailConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEMail.jContentPaneDetalleEMail.getWidth(),EMailConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEMail.jContentPaneDetalleEMail.getWidth(),EMailConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEMail.setVisible(true);
	        this.jInternalFrameDetalleFormEMail.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEMail() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEMail==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEMail=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEMail,false,this);
				} else {
					this.jInternalFrameOrderByEMail=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEMail,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEMail);
				this.jInternalFrameOrderByEMail.setVisible(false);
				this.jInternalFrameOrderByEMail.setSelected(false);
				
				this.jInternalFrameOrderByEMail.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEMail"));
				
				this.inicializarActualizarBindingTablaOrderByEMail();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEMail() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEMail==null) {
				
				this.jInternalFrameImportacionEMail=new ImportacionJInternalFrame(EMailConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEMail);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEMail);
				this.jInternalFrameImportacionEMail.setVisible(false);
				this.jInternalFrameImportacionEMail.setSelected(false);


				this.jInternalFrameImportacionEMail.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEMail"));
				this.jInternalFrameImportacionEMail.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEMail"));
				this.jInternalFrameImportacionEMail.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEMail"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEMail() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEMail==null) {
				this.jInternalFrameReporteDinamicoEMail=new ReporteDinamicoJInternalFrame(EMailConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEMail);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEMail);
				this.jInternalFrameReporteDinamicoEMail.setVisible(false);
				this.jInternalFrameReporteDinamicoEMail.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEMail.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEMail"));
				this.jInternalFrameReporteDinamicoEMail.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEMail"));
				this.jInternalFrameReporteDinamicoEMail.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEMail"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEMail();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEMail() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEMail);
			
	       	this.jInternalFrameDetalleFormEMail.setVisible(false);
	        this.jInternalFrameDetalleFormEMail.setSelected(false);
			
			//this.jInternalFrameDetalleFormEMail.dispose();
			//this.jInternalFrameDetalleFormEMail=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEMail() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEMail.setVisible(true);
	        this.jInternalFrameReporteDinamicoEMail.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEMail() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEMail.setVisible(true);
	        this.jInternalFrameImportacionEMail.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEMail() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEMail.setVisible(true);
	        this.jInternalFrameOrderByEMail.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEMail() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEMail.setVisible(false);
	        this.jInternalFrameOrderByEMail.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEMail() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEMail.setVisible(false);
	        this.jInternalFrameReporteDinamicoEMail.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEMail() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEMail.setVisible(false);
	        this.jInternalFrameImportacionEMail.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEMail(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEMail(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEMail.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEMail(true);
			//this.isEsNuevoEMail=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEMail("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEMail(false) ;
			
			if(emailSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EMailJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEMail(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEMail(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEMailActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEMail(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEMail.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEMail(true);
			//this.isEsNuevoEMail=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.email.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEMail("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEMail(false) ;
			
			if(EMailJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEMail(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEMail(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.emailConstantesFunciones.cargarid_clienteEMail) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEMail(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEMail,EMailConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEMail.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEMailActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEMail(false);
			
			//if(!this.isEsNuevoEMail) {								
				int intSelectedRow = this.jTableDatosEMail.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEMail(this.email,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
				
			}
			
			if(this.permiteMantenimiento(this.email)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.emailSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEMail=true;
					this.inicializarActualizarBindingTablaEMail(false);
					this.isEsNuevoEMail=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEMail=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEMail=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEMail(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEMail(false);
				
				this.habilitarDeshabilitarControlesEMail(false);
			
												
				
				if(EMailJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEMail();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEMailActionPerformed(evt,emailSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEMail(this.email,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEMail.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,emailSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.email.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEMailActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEMail.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				this.email.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				this.email.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.email)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.emailSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EMailModel) this.jTableDatosEMail.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEMail=true;
				this.inicializarActualizarBindingTablaEMail(false);
				this.isEsNuevoEMail=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEMail(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEMail(false);
				
				this.habilitarDeshabilitarControlesEMail(false);
				
				
				
				if(EMailJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEMail();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEMailActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEMail.getRowCount()>=1) {
				jTableDatosEMail.removeRowSelectionInterval(0, jTableDatosEMail.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEMail(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEMail(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEMail(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEMail(false) ;
			
			this.isEsNuevoEMail=false;
			
			if(EMailJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEMail();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEMail(false);
				
				//SI ES MANUAL
				if(EMailJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEMail();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEMail--;			
			//EMail emailAux= new EMail();			
			//emailAux.setId(this.iIdNuevoEMail);
			
			if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEMail();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
			
			this.email.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.emailLogic.getEMails().add(this.emailAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.emails.add(this.emailAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEMail(false);
			
			this.jTableDatosEMail.setRowSelectionInterval(this.getIndiceNuevoEMail(), this.getIndiceNuevoEMail());
			
			int iLastRow =  this.jTableDatosEMail.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEMail.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEMail.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEMail(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEMail(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEMail(false);
			
			//SI ES MANUAL
			if(EMailJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEMail();
			}
			
			//this.abrirFrameTreeEMail();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEMailActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE E MailES ?", "MANTENIMIENTO DE E Mail", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEMail.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEMail();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.emailReturnGeneral=emailLogic.procesarImportacionEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.emailParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEMailReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEMailActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEMail.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEMail.setFileImportacion(this.jInternalFrameImportacionEMail.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEMail.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEMail.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEMail.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEMail.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEMailActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		

		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EMailBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EMailBaseDesign.jrxml";
			
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
			
			this.generarReporteEMails("Todos",emailsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EMailConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EMailConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EMailConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EMailConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoEMail.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEMail.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EMailConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EMailConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case EMailConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="e_mail";
					break;

				case EMailConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEMail.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EMailConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EMailConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case EMailConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="e_mail";
					break;

				case EMailConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEMail.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEMail.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EMailConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EMailConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case EMailConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"E Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"e_mail");
					break;

				case EMailConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoEMailActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"email";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EMails");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EMailConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EMailConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EMail email:emailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(email.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EMailConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EMailConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(EMail email:emailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(email.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EMailConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EMailConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(EMail email:emailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(email.gete_mail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EMailConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EMailConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(EMail email:emailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(email.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelEMail(row);				
			//	iRow++;
			//}				
			
			//for(EMail emailAux:emailsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEMail(emailAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
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
				this.emailLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEMail(false);
			
			//SI ES MANUAL
			if(EMailJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEMail();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEMail(false);
			
			//SI ES MANUAL
			if(EMailJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEMail();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEMail(false);
			
			//SI ES MANUAL
			if(EMailJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEMail();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEMail() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEMail.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEMail.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEMail.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEMail.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEMail.setMinimumSize(dimensionMinimum);
		this.jTableDatosEMail.setMaximumSize(dimensionMaximum);
		this.jTableDatosEMail.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEMail(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEMail(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEMail(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEMail(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEMail(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEMail(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEMail(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEMail(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EMailJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EMailJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEMail() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEMail();
		
		this.inicializarActualizarBindingBotonesManualEMail(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEMail();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEMail() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEMail(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEMail(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEMail.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEMail.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEMail.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEMail!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEMail.jCheckBoxPostAccionNuevoEMail.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEMail.jCheckBoxPostAccionSinCerrarEMail.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEMail.jCheckBoxPostAccionSinMensajeEMail.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEMail.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEMail.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEMail.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEMail!=null) {
				this.jInternalFrameDetalleFormEMail.jCheckBoxPostAccionNuevoEMail.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEMail.jCheckBoxPostAccionSinCerrarEMail.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEMail.jCheckBoxPostAccionSinMensajeEMail.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEMail.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEMail.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEMail!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEMail.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEMail!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEMail.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEMail.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEMail.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEMail.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEMail!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEMail.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEMail.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEMail(Boolean esInicializar) throws Exception {
		try	{	
			if(EMailJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEMail(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEMail() throws Exception {
		try	{
			if(EMailJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEMail();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEMail() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEMail() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEMail.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEMail.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEMail.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEMail.addItem(reporte);
			}
			
			
			if(!this.emailSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEMail.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEMail.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEMail.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEMail.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEMail.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEMail.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEMail();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEMail() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEMail!=null) {
				this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEMail!=null) {
				this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEMail.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEMail!=null) {
				
				if(this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEMail.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEMail.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEMail.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEMail.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEMail()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteEMail.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteEMail.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEMail(Boolean esInicializar) throws Exception {				
		if(EMailJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEMail();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEMail() throws Exception {
		this.inicializarActualizarBindingTablaEMail(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEMail() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEMail.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEMail.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEMailOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEMailOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEMail.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEMail(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=emailLogic.getEMails().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=emails.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEMail.setModel(new EMailModel(this.emailLogic.getEMails(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEMail.setModel(new EMailModel(this.emails,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEMail!=null && this.jInternalFrameOrderByEMail.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEMail();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEMail,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EMailConstantesFunciones.SCLASSWEBTITULO,emailConstantesFunciones.resaltarSeleccionarEMail,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EMailConstantesFunciones.SCLASSWEBTITULO,emailConstantesFunciones.resaltarSeleccionarEMail,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEMail,EMailConstantesFunciones.LABEL_ID));

		if(this.emailConstantesFunciones.mostraridEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EMailConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.emailConstantesFunciones.resaltaridEMail,this.emailConstantesFunciones.activaridEMail,this,true,"idEMail","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.emailConstantesFunciones.resaltaridEMail,this.emailConstantesFunciones.activaridEMail,this,true,"idEMail","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEMail,EMailConstantesFunciones.LABEL_IDEMPRESA));

		if(this.emailConstantesFunciones.mostrarid_empresaEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EMailConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.emailConstantesFunciones.resaltarid_empresaEMail,this,this.emailConstantesFunciones.activarid_empresaEMail));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.emailConstantesFunciones.resaltarid_empresaEMail,this,this.emailConstantesFunciones.activarid_empresaEMail,false,"id_empresaEMail","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEMail,EMailConstantesFunciones.LABEL_IDCLIENTE));

		if(this.emailConstantesFunciones.mostrarid_clienteEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EMailConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.emailConstantesFunciones.resaltarid_clienteEMail,this,this.emailConstantesFunciones.activarid_clienteEMail));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.emailConstantesFunciones.resaltarid_clienteEMail,this,this.emailConstantesFunciones.activarid_clienteEMail,true,"id_clienteEMail","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEMail,EMailConstantesFunciones.LABEL_EMAIL));

		if(this.emailConstantesFunciones.mostrare_mailEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EMailConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.emailConstantesFunciones.resaltare_mailEMail,this.emailConstantesFunciones.activare_mailEMail,this,true,"e_mailEMail","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.emailConstantesFunciones.resaltare_mailEMail,this.emailConstantesFunciones.activare_mailEMail,this,true,"e_mailEMail","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEMail,EMailConstantesFunciones.LABEL_DESCRIPCION));

		if(this.emailConstantesFunciones.mostrardescripcionEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EMailConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.emailConstantesFunciones.resaltardescripcionEMail,this.emailConstantesFunciones.activardescripcionEMail,this,true,"descripcionEMail","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.emailConstantesFunciones.resaltardescripcionEMail,this.emailConstantesFunciones.activardescripcionEMail,this,true,"descripcionEMail","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.emailSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.emailSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.emailSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEMail.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.emailSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.emailSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEMail.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEMail && this.isPermisoGuardarCambiosEMail) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.emailSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.emailSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEMail.addColumn(tableColumn);
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
			
			this.jTableDatosEMail.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEMail && this.isPermisoGuardarCambiosEMail) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEMail && this.isPermisoGuardarCambiosEMail) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEMail.moveColumn(this.jTableDatosEMail.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEMail.moveColumn(this.jTableDatosEMail.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEMail.moveColumn(this.jTableDatosEMail.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEMail.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEMail.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEMail,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEMail.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEMail.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEMail.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEMail.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEMail.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=emailLogic.getEMails().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=emails.size()-1;
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
		//this.jTableDatosEMail.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEMail();
			
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
				
				//this.isEsNuevoEMail=false;
					
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
				if(this.emailSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEMail==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEMail.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEMail.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.email.getsType().equals("DUPLICADO")
				   || this.email.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEMail=true;
				
				} else {
					this.isEsNuevoEMail=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.emailSessionBean.getEsGuardarRelacionado()) {
					if(this.email.getId()>=0 && !this.email.getIsNew()) {						
						this.isEsNuevoEMail=false;
						
					} else {
						this.isEsNuevoEMail=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEMail(esRelaciones);						
				
				this.seleccionarEMail(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.email.getId()<0) {
					this.isEsNuevoEMail=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEMail(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEMail(evt,rowIndex);
				}	
				
				if(this.emailSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EMail: " + this.dDif); 
					}
				}								
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEMail(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.email)) {
					if(this.email.getId()>0) {
						this.email.setIsDeleted(true);
						
						this.emailsEliminados.add(this.email);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.emailLogic.getEMails().remove(this.email);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.emails.remove(this.email);				
					}
					
					
					((EMailModel) this.jTableDatosEMail.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEMail(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEMail(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEMail) {
			
			if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEMail.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEMail.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEMail(this.email);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.emailConstantesFunciones.cargarid_empresaEMail || this.emailConstantesFunciones.event_dependid_empresaEMail) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.email.getid_empresa());
									//this.inicializarActualizarBindingEMail(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(email.getEmpresa()!=null) {
							this.empresasForeignKey.add(email.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.email.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.emailConstantesFunciones.cargarid_clienteEMail || this.emailConstantesFunciones.event_dependid_clienteEMail) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.email.getid_cliente());
									//this.inicializarActualizarBindingEMail(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(email.getCliente()!=null) {
							this.clientesForeignKey.add(email.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.email.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEMail("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEMail(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEMail() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEMail(EMail email) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEMail(email,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEMail(EMail email,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEMail(email);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEMail(email,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEMail(email);
	}
	
	public void setVariablesObjetoActualToFormularioEMail(EMail email) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEMail.jLabelidEMail.setText(email.getId().toString());
			this.jInternalFrameDetalleFormEMail.jTextAreae_mailEMail.setText(email.gete_mail());
			this.jInternalFrameDetalleFormEMail.jTextAreadescripcionEMail.setText(email.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EMail emailLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,emailLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EMail emailLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				emailLocal=this.email;
			} else {
				emailLocal=this.emailAnterior;
			}
		}
		
		if(this.permiteMantenimiento(emailLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEMail(emailLocal,true);
					
					if(emailSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(emailLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.emailSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(emailLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEMail(EMail email,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEMail(email,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEMail(email);
	}
	
	public void setVariablesFormularioToObjetoActualEMail(EMail email,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEMail(email,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEMail(EMail email,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEMail.jLabelidEMail.getText()==null || this.jInternalFrameDetalleFormEMail.jLabelidEMail.getText()=="" || this.jInternalFrameDetalleFormEMail.jLabelidEMail.getText()=="Id") {
				this.jInternalFrameDetalleFormEMail.jLabelidEMail.setText("0");
			}

			if(conColumnasBase) {email.setId(Long.parseLong(this.jInternalFrameDetalleFormEMail.jLabelidEMail.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EMailConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEMail.jLabelIdEMail,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			email.sete_mail(this.jInternalFrameDetalleFormEMail.jTextAreae_mailEMail.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EMailConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEMail.jLabele_mailEMail,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			email.setdescripcion(this.jInternalFrameDetalleFormEMail.jTextAreadescripcionEMail.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EMailConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEMail.jLabeldescripcionEMail,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEMail(EMail emailBean,EMail email,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && emailBean.getid_cliente()!=null && !emailBean.getid_cliente().equals(-1L))) {email.setid_cliente(emailBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEMail(EMail emailOrigen,EMail email,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && emailOrigen.getId()!=null && !emailOrigen.getId().equals(0L))) {email.setId(emailOrigen.getId());}}
			if(conDefault || (!conDefault && emailOrigen.getid_cliente()!=null && !emailOrigen.getid_cliente().equals(-1L))) {email.setid_cliente(emailOrigen.getid_cliente());}
			if(conDefault || (!conDefault && emailOrigen.gete_mail()!=null && !emailOrigen.gete_mail().equals(""))) {email.sete_mail(emailOrigen.gete_mail());}
			if(conDefault || (!conDefault && emailOrigen.getdescripcion()!=null && !emailOrigen.getdescripcion().equals(""))) {email.setdescripcion(emailOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEMail(EMail email) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEMail.jLabelidEMail.setText(email.getId().toString());
			this.jInternalFrameDetalleFormEMail.jTextAreae_mailEMail.setText(email.gete_mail());
			this.jInternalFrameDetalleFormEMail.jTextAreadescripcionEMail.setText(email.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEMail(EMailBean emailBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEMail.jLabelidEMail.setText(emailBean.getId().toString());
			this.jInternalFrameDetalleFormEMail.jTextAreae_mailEMail.setText(emailBean.gete_mail());
			this.jInternalFrameDetalleFormEMail.jTextAreadescripcionEMail.setText(emailBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEMail(EMailParameterReturnGeneral emailReturnGeneral,EMailBean emailBean,Boolean conDefault) throws Exception { 
		try {
			EMail emailLocal=new EMail();
			
			emailLocal=emailReturnGeneral.getEMail();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && emailLocal.getId()!=null && !emailLocal.getId().equals(0L))) {emailBean.setId(emailLocal.getId());}}
			if(conDefault || (!conDefault && emailLocal.getid_cliente()!=null && !emailLocal.getid_cliente().equals(-1L))) {emailBean.setid_cliente(emailLocal.getid_cliente());}
			if(conDefault || (!conDefault && emailLocal.gete_mail()!=null && !emailLocal.gete_mail().equals(""))) {emailBean.sete_mail(emailLocal.gete_mail());}
			if(conDefault || (!conDefault && emailLocal.getdescripcion()!=null && !emailLocal.getdescripcion().equals(""))) {emailBean.setdescripcion(emailLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEMailGenerico(Long idEMailSeleccionado,JComboBox jComboBoxEMail,List<EMail> emailsLocal)throws Exception {
		try {
			EMail  emailTemp=null;

			for(EMail emailAux:emailsLocal) {
				if(emailAux.getId()!=null && emailAux.getId().equals(idEMailSeleccionado)) {
					emailTemp=emailAux;
					break;
				}
			}

			jComboBoxEMail.setSelectedItem(emailTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEMailGenerico(JComboBox jComboBoxEMail,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEMail.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEMail.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEMail.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEMail.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			email=(EMail) emailLogic.getEMails().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			email =(EMail) emails.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!email.getIsNew() && !email.getIsChanged() && !email.getIsDeleted()) {
				sDescripcion=email.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=email.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!email.getIsNew() && !email.getIsChanged() && !email.getIsDeleted()) {
				sDescripcion=email.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=email.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EMail emailRow=new EMail();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			emailRow=(EMail) emailLogic.getEMails().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			emailRow=(EMail) emails.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEMail(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEMail.setVisible((this.isVisibilidadCeldaNuevoEMail && this.isPermisoNuevoEMail));			
			this.jButtonDuplicarEMail.setVisible((this.isVisibilidadCeldaDuplicarEMail && this.isPermisoDuplicarEMail));			
			this.jButtonCopiarEMail.setVisible((this.isVisibilidadCeldaCopiarEMail && this.isPermisoCopiarEMail));
			this.jButtonVerFormEMail.setVisible((this.isVisibilidadCeldaVerFormEMail && this.isPermisoVerFormEMail));
			
			this.jButtonAbrirOrderByEMail.setVisible((this.isVisibilidadCeldaOrdenEMail && this.isPermisoOrdenEMail));			
			
			this.jButtonNuevoRelacionesEMail.setVisible((this.isVisibilidadCeldaNuevoRelacionesEMail && this.isPermisoNuevoEMail));			
			this.jButtonNuevoGuardarCambiosEMail.setVisible((this.isVisibilidadCeldaNuevoEMail && this.isPermisoNuevoEMail && this.isPermisoGuardarCambiosEMail));
			
			if(this.jInternalFrameDetalleFormEMail!=null) {
			this.jInternalFrameDetalleFormEMail.jButtonModificarEMail.setVisible((this.isVisibilidadCeldaModificarEMail && this.isPermisoActualizarEMail));	
			this.jInternalFrameDetalleFormEMail.jButtonActualizarEMail.setVisible((this.isVisibilidadCeldaActualizarEMail && this.isPermisoActualizarEMail));	
			this.jInternalFrameDetalleFormEMail.jButtonEliminarEMail.setVisible((this.isVisibilidadCeldaEliminarEMail && this.isPermisoEliminarEMail));
			this.jInternalFrameDetalleFormEMail.jButtonCancelarEMail.setVisible(this.isVisibilidadCeldaCancelarEMail);							
			this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosEMail.setVisible((this.isVisibilidadCeldaGuardarEMail && this.isPermisoGuardarCambiosEMail));			
			
			}
						
			this.jButtonGuardarCambiosTablaEMail.setVisible((this.isVisibilidadCeldaGuardarCambiosEMail && this.isPermisoGuardarCambiosEMail));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEMail.setVisible((this.isVisibilidadCeldaNuevoEMail && this.isPermisoNuevoEMail));						
			this.jButtonDuplicarToolBarEMail.setVisible((this.isVisibilidadCeldaDuplicarEMail && this.isPermisoDuplicarEMail));						
			this.jButtonCopiarToolBarEMail.setVisible((this.isVisibilidadCeldaCopiarEMail && this.isPermisoCopiarEMail));			
			this.jButtonVerFormToolBarEMail.setVisible((this.isVisibilidadCeldaVerFormEMail && this.isPermisoVerFormEMail));			
			this.jButtonAbrirOrderByToolBarEMail.setVisible((this.isVisibilidadCeldaOrdenEMail && this.isPermisoOrdenEMail));
			this.jButtonNuevoRelacionesToolBarEMail.setVisible((this.isVisibilidadCeldaNuevoRelacionesEMail && this.isPermisoNuevoEMail));			
			this.jButtonNuevoGuardarCambiosToolBarEMail.setVisible((this.isVisibilidadCeldaNuevoEMail && this.isPermisoNuevoEMail && this.isPermisoGuardarCambiosEMail));			
			
			if(this.jInternalFrameDetalleFormEMail!=null) {
			this.jInternalFrameDetalleFormEMail.jButtonModificarToolBarEMail.setVisible((this.isVisibilidadCeldaModificarEMail && this.isPermisoActualizarEMail));	
			this.jInternalFrameDetalleFormEMail.jButtonActualizarToolBarEMail.setVisible((this.isVisibilidadCeldaActualizarEMail  && this.isPermisoActualizarEMail));	
			this.jInternalFrameDetalleFormEMail.jButtonEliminarToolBarEMail.setVisible((this.isVisibilidadCeldaEliminarEMail && this.isPermisoEliminarEMail));
			this.jInternalFrameDetalleFormEMail.jButtonCancelarToolBarEMail.setVisible(this.isVisibilidadCeldaCancelarEMail);				
			this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosToolBarEMail.setVisible((this.isVisibilidadCeldaGuardarEMail && this.isPermisoGuardarCambiosEMail));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEMail.setVisible((this.isVisibilidadCeldaGuardarCambiosEMail && this.isPermisoGuardarCambiosEMail));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEMail.setVisible((this.isVisibilidadCeldaNuevoEMail && this.isPermisoNuevoEMail));			
			this.jMenuItemDuplicarEMail.setVisible((this.isVisibilidadCeldaDuplicarEMail && this.isPermisoDuplicarEMail));			
			this.jMenuItemCopiarEMail.setVisible((this.isVisibilidadCeldaCopiarEMail && this.isPermisoCopiarEMail));			
			this.jMenuItemVerFormEMail.setVisible((this.isVisibilidadCeldaVerFormEMail && this.isPermisoVerFormEMail));			
			this.jMenuItemAbrirOrderByEMail.setVisible((this.isVisibilidadCeldaOrdenEMail && this.isPermisoOrdenEMail));			
			//this.jMenuItemMostrarOcultarEMail.setVisible((this.isVisibilidadCeldaOrdenEMail && this.isPermisoOrdenEMail));
			this.jMenuItemDetalleAbrirOrderByEMail.setVisible((this.isVisibilidadCeldaOrdenEMail && this.isPermisoOrdenEMail));			
			//this.jMenuItemDetalleMostrarOcultarEMail.setVisible((this.isVisibilidadCeldaOrdenEMail && this.isPermisoOrdenEMail));			
			this.jMenuItemNuevoRelacionesEMail.setVisible((this.isVisibilidadCeldaNuevoRelacionesEMail && this.isPermisoNuevoEMail));			
			this.jMenuItemNuevoGuardarCambiosEMail.setVisible((this.isVisibilidadCeldaNuevoEMail && this.isPermisoNuevoEMail && this.isPermisoGuardarCambiosEMail));									
			
			if(this.jInternalFrameDetalleFormEMail!=null) {
			this.jInternalFrameDetalleFormEMail.jMenuItemModificarEMail.setVisible((this.isVisibilidadCeldaModificarEMail && this.isPermisoActualizarEMail));	
			this.jInternalFrameDetalleFormEMail.jMenuItemActualizarEMail.setVisible((this.isVisibilidadCeldaActualizarEMail && this.isPermisoActualizarEMail));	
			this.jInternalFrameDetalleFormEMail.jMenuItemEliminarEMail.setVisible((this.isVisibilidadCeldaEliminarEMail && this.isPermisoEliminarEMail));
			this.jInternalFrameDetalleFormEMail.jMenuItemCancelarEMail.setVisible(this.isVisibilidadCeldaCancelarEMail);				
			}
			
			this.jMenuItemGuardarCambiosEMail.setVisible((this.isVisibilidadCeldaGuardarEMail && this.isPermisoGuardarCambiosEMail));						
			this.jMenuItemGuardarCambiosTablaEMail.setVisible((this.isVisibilidadCeldaGuardarCambiosEMail && this.isPermisoGuardarCambiosEMail));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEMail=this.jButtonNuevoEMail.isVisible();
			this.isVisibilidadCeldaDuplicarEMail=this.jButtonDuplicarEMail.isVisible();
			this.isVisibilidadCeldaCopiarEMail=this.jButtonCopiarEMail.isVisible();
			this.isVisibilidadCeldaVerFormEMail=this.jButtonVerFormEMail.isVisible();
			
			this.isVisibilidadCeldaOrdenEMail=this.jButtonAbrirOrderByEMail.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEMail=this.jButtonNuevoRelacionesEMail.isVisible();
			this.isVisibilidadCeldaModificarEMail=this.jButtonModificarEMail.isVisible();
			
			if(this.jInternalFrameDetalleFormEMail!=null) {
			this.isVisibilidadCeldaActualizarEMail=this.jInternalFrameDetalleFormEMail.jButtonActualizarEMail.isVisible();
			this.isVisibilidadCeldaEliminarEMail=this.jInternalFrameDetalleFormEMail.jButtonEliminarEMail.isVisible();
			this.isVisibilidadCeldaCancelarEMail=this.jInternalFrameDetalleFormEMail.jButtonCancelarEMail.isVisible();
			this.isVisibilidadCeldaGuardarEMail=this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosEMail.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEMail=this.jButtonGuardarCambiosTablaEMail.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEMail=this.jButtonNuevoToolBarEMail.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEMail=this.jButtonNuevoRelacionesToolBarEMail.isVisible();
			
			if(this.jInternalFrameDetalleFormEMail!=null) {
			this.isVisibilidadCeldaModificarEMail=this.jInternalFrameDetalleFormEMail.jButtonModificarToolBarEMail.isVisible();
			this.isVisibilidadCeldaActualizarEMail=this.jInternalFrameDetalleFormEMail.jButtonActualizarToolBarEMail.isVisible();
			this.isVisibilidadCeldaEliminarEMail=this.jInternalFrameDetalleFormEMail.jButtonEliminarToolBarEMail.isVisible();
			this.isVisibilidadCeldaCancelarEMail=this.jInternalFrameDetalleFormEMail.jButtonCancelarToolBarEMail.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEMail=this.jButtonGuardarCambiosToolBarEMail.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEMail=this.jButtonGuardarCambiosTablaToolBarEMail.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEMail=this.jMenuItemNuevoEMail.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEMail=this.jMenuItemNuevoRelacionesEMail.isVisible();
			
			if(this.jInternalFrameDetalleFormEMail!=null) {
			this.isVisibilidadCeldaModificarEMail=this.jInternalFrameDetalleFormEMail.jMenuItemModificarEMail.isVisible();
			this.isVisibilidadCeldaActualizarEMail=this.jInternalFrameDetalleFormEMail.jMenuItemActualizarEMail.isVisible();
			this.isVisibilidadCeldaEliminarEMail=this.jInternalFrameDetalleFormEMail.jMenuItemEliminarEMail.isVisible();
			this.isVisibilidadCeldaCancelarEMail=this.jInternalFrameDetalleFormEMail.jMenuItemCancelarEMail.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEMail=this.jMenuItemGuardarCambiosEMail.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEMail=this.jMenuItemGuardarCambiosTablaEMail.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEMail(Boolean esInicializar) {
		if(EMailJInternalFrame.ISBINDING_MANUAL) {			
			if(this.emailSessionBean.getConGuardarRelaciones()) {
				//if(this.emailSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEMail();
			}
			
			this.inicializarActualizarBindingBotonesManualEMail(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEMail() {
		this.jButtonNuevoEMail.setVisible(this.isPermisoNuevoEMail);			
		this.jButtonDuplicarEMail.setVisible(this.isPermisoDuplicarEMail);			
		this.jButtonCopiarEMail.setVisible(this.isPermisoCopiarEMail);			
		this.jButtonVerFormEMail.setVisible(this.isPermisoVerFormEMail);			
		
		this.jButtonAbrirOrderByEMail.setVisible(this.isPermisoOrdenEMail);					
		
		this.jButtonNuevoRelacionesEMail.setVisible(this.isPermisoNuevoEMail);			
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonModificarEMail.setVisible(this.isPermisoActualizarEMail);	
			this.jInternalFrameDetalleFormEMail.jButtonActualizarEMail.setVisible(this.isPermisoActualizarEMail);	
			this.jInternalFrameDetalleFormEMail.jButtonEliminarEMail.setVisible(this.isPermisoEliminarEMail);
			this.jInternalFrameDetalleFormEMail.jButtonCancelarEMail.setVisible(this.isVisibilidadCeldaCancelarEMail);						
			this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosEMail.setVisible(this.isPermisoGuardarCambiosEMail);							
		}
		
		this.jButtonGuardarCambiosTablaEMail.setVisible(this.isPermisoActualizarEMail);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEMail() {
		this.jInternalFrameDetalleFormEMail.jButtonModificarEMail.setVisible(this.isPermisoActualizarEMail);	
		this.jInternalFrameDetalleFormEMail.jButtonActualizarEMail.setVisible(this.isPermisoActualizarEMail);	
		this.jInternalFrameDetalleFormEMail.jButtonEliminarEMail.setVisible(this.isPermisoEliminarEMail);
		this.jInternalFrameDetalleFormEMail.jButtonCancelarEMail.setVisible(this.isVisibilidadCeldaCancelarEMail);							
		this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosEMail.setVisible((this.isVisibilidadCeldaGuardarEMail && this.isPermisoGuardarCambiosEMail));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEMail() {
		if(EMailJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEMail();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEMail() {
	}
	
	public void jTableDatosEMailListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEMail(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEMail(this.getemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.email==null) {
						this.email = new EMail();
					}

					this.setVariablesFormularioToObjetoActualEMail(this.email,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
				}

				if(this.email.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.email.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEMailUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEMail(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEMail.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEMail.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEMail.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEMail(this.getemail(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.emailLogic.getConnexion());

				if(this.email.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.email.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEMail=(TitledBorder)this.jScrollPanelDatosEMail.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEMail.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEMail(this.getemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.email==null) {
						this.email = new EMail();
					}

					this.setVariablesFormularioToObjetoActualEMail(this.email,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
				}

				if(this.email.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.email.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteEMailActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderEMail=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosEMail.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEMail=(TitledBorder)this.jScrollPanelDatosEMail.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderEMail.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteEMailUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebEMail(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEMail.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEMail.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEMail.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEMail(this.getemail(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.emailLogic.getConnexion());

				if(this.email.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.email.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEMail=(TitledBorder)this.jScrollPanelDatosEMail.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderEMail.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEMail(this.getemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.email==null) {
						this.email = new EMail();
					}

					this.setVariablesFormularioToObjetoActualEMail(this.email,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
				}

				if(this.email.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.email.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtone_mailEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEMail(this.getemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.email==null) {
						this.email = new EMail();
					}

					this.setVariablesFormularioToObjetoActualEMail(this.email,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
				}

				if(this.email.gete_mail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where e_mail like '%"+this.email.gete_mail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEMail(this.getemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.email==null) {
						this.email = new EMail();
					}

					this.setVariablesFormularioToObjetoActualEMail(this.email,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);
				}

				if(this.email.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.email.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteEMailActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEMail(false,false);

			this.getEMailsFK_IdCliente();

			this.inicializarActualizarBindingEMail(false);

			//if(EMailBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEMail(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEMailActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEMail(false,false);

			this.getEMailsFK_IdEmpresa();

			this.inicializarActualizarBindingEMail(false);

			//if(EMailBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEMail(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.emailLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEMail() {
		if(this.jInternalFrameDetalleFormEMail!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEMail!=null) {
			this.jInternalFrameDetalleFormEMail.setVisible(false);	    			
			this.jInternalFrameDetalleFormEMail.dispose();
			this.jInternalFrameDetalleFormEMail=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEMail!=null) {
			this.jInternalFrameReporteDinamicoEMail.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEMail.dispose();
			this.jInternalFrameReporteDinamicoEMail=null;
		}
		
		if(this.jInternalFrameImportacionEMail!=null) {
			this.jInternalFrameImportacionEMail.setVisible(false);	    			
			this.jInternalFrameImportacionEMail.dispose();
			this.jInternalFrameImportacionEMail=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEMail();
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
			
			if(sTipo.equals("NuevoEMail")) {
				jButtonNuevoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEMail")) {
				jButtonDuplicarEMailActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEMail")) {
				jButtonCopiarEMailActionPerformed(evt);
			} else if(sTipo.equals("VerFormEMail")) {
				jButtonVerFormEMailActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEMail")) {
				jButtonNuevoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEMail")) {
				jButtonDuplicarEMailActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEMail")) {
				jButtonNuevoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEMail")) {
				jButtonDuplicarEMailActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEMail")) {
				jButtonNuevoEMailActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEMail")) {
				jButtonNuevoEMailActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEMail")) {
				jButtonNuevoEMailActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEMail")) {
				jButtonModificarEMailActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEMail")) {
				jButtonModificarEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEMail")) {
				jButtonModificarEMailActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEMail")) {
				jButtonActualizarEMailActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEMail")) {
				jButtonActualizarEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEMail")) {
				jButtonActualizarEMailActionPerformed(evt);
			} else if(sTipo.equals("EliminarEMail")) {
				jButtonEliminarEMailActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEMail")) {
				jButtonEliminarEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEMail")) {
				jButtonEliminarEMailActionPerformed(evt);
			} else if(sTipo.equals("CancelarEMail")) {
				jButtonCancelarEMailActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEMail")) {
				jButtonCancelarEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEMail")) {
				jButtonCancelarEMailActionPerformed(evt);
			} else if(sTipo.equals("CerrarEMail")) {
				jButtonCerrarEMailActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEMail")) {
				jButtonCerrarEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEMail")) {
				jButtonCerrarEMailActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEMail")) {
				jButtonMostrarOcultarEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEMail")) {
				jButtonCancelarEMailActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEMail")) {
				jButtonGuardarCambiosEMailActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEMail")) {
				jButtonGuardarCambiosEMailActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEMail")) {
				jButtonCopiarEMailActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEMail")) {
				jButtonVerFormEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEMail")) {
				jButtonGuardarCambiosEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEMail")) {
				jButtonCopiarEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEMail")) {
				jButtonVerFormEMailActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEMail")) {
				jButtonGuardarCambiosEMailActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEMail")) {
				jButtonGuardarCambiosEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEMail")) {
				jButtonGuardarCambiosEMailActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEMail")) {
				jButtonRecargarInformacionEMailActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEMail")) {
				jButtonRecargarInformacionEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEMail")) {
				jButtonRecargarInformacionEMailActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEMail")) {
				jButtonAnterioresEMailActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEMail")) {
				jButtonAnterioresEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEMail")) {
				jButtonAnterioresEMailActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEMail")) {
				jButtonSiguientesEMailActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEMail")) {
				jButtonSiguientesEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEMail")) {
				jButtonSiguientesEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEMail") || sTipo.equals("MenuItemDetalleAbrirOrderByEMail")) {
				jButtonAbrirOrderByEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEMail") || sTipo.equals("MenuItemDetalleMostrarOcultarEMail")) {
				jButtonMostrarOcultarEMailActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEMail")) {
				jButtonNuevoGuardarCambiosEMailActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEMail")) {
				jButtonNuevoGuardarCambiosEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEMail")) {
				jButtonNuevoGuardarCambiosEMailActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEMail")) {
				jButtonCerrarReporteDinamicoEMailActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEMail")) {
				jButtonGenerarReporteDinamicoEMailActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEMail")) {
				
				jButtonGenerarExcelReporteDinamicoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEMail")) {
				jButtonCerrarImportacionEMailActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEMail")) {
				
				jButtonGenerarImportacionEMailActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEMail")) {
				
				jButtonAbrirImportacionEMailActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEMail")) {
				jComboBoxTiposAccionesEMailActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEMail")) {
				jComboBoxTiposRelacionesEMailActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEMail")) {
				jComboBoxTiposAccionesEMailActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEMail")) {
				
				jComboBoxTiposSeleccionarEMailActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEMail")) {
				jTextFieldValorCampoGeneralEMailActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEMail")) {
				jButtonAbrirOrderByEMailActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEMail")) {
				jButtonAbrirOrderByEMailActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEMail")) {
				jButtonCerrarOrderByEMailActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEMailBusqueda")) {
				this.jButtonidEMailBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEMailUpdate")) {
				this.jButtonid_empresaEMailUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEMailBusqueda")) {
				this.jButtonid_empresaEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteEMail")) {
				this.jButtonid_clienteEMailActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteEMailUpdate")) {
				this.jButtonid_clienteEMailUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteEMailBusqueda")) {
				this.jButtonid_clienteEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailEMailBusqueda")) {
				this.jButtone_mailEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEMailBusqueda")) {
				this.jButtondescripcionEMailBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteEMail")) {
				this.jButtonid_clienteEMailActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteEMail")) {
				this.jButtonFK_IdClienteEMailActionPerformed(evt);
			}
			
			;
			
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEMail();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEMailActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				


				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EMail emailLocal=null;
			
			if(!this.getEsControlTabla()) {
				emailLocal=this.email;
			} else {
				emailLocal=this.emailAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
							
				
				


				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailAnterior =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.emailAnterior =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
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
			
			


			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEMailActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
								
						
				


				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
								
				
				


				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailAnterior =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.emailAnterior =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailAnterior =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.emailAnterior =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEMailActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
			
			this.actualizarInformacion("INFO_PADRE",false,this.email);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
							
				
				


				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEMailActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.emailAnterior =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.emailAnterior =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
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
			
			


			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEMailActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
			
			this.actualizarInformacion("INFO_PADRE",false,this.email);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
								
				
				


				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailAnterior =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.emailAnterior =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEMailActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
			
			this.actualizarInformacion("INFO_PADRE",false,this.email);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEMailActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEMail")) {
					jCheckBoxSeleccionarTodosEMailItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEMail")) {
					jCheckBoxSeleccionadosEMailItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEMail")) {
					
				}
				
				


				
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
												
				
				


				
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEMailActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.emailAnterior =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.emailAnterior =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEMailActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
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
			
			


			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEMailActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.email);
				
				this.actualizarInformacion("INFO_PADRE",false,this.email);
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
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
				
				


				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EMail.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.emailAnterior =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.emailAnterior =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEMail")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEMailListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEMail.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.email =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.email =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.email);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEMail")) {
				
				}
				
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEMail")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEMail.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEMail")) {
			
			}
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEMail();
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
			if(sTipo.equals("NuevoEMail")) {
				jButtonNuevoEMailActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEMail")) {
				jButtonDuplicarEMailActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEMail")) {
				jButtonCopiarEMailActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEMail")) {
				jButtonVerFormEMailActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEMail")) {
				jButtonNuevoEMailActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEMail")) {
				jButtonModificarEMailActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEMail")) {
				jButtonActualizarEMailActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEMail")) {
				jButtonEliminarEMailActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEMail")) {
				jButtonGuardarCambiosEMailActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEMail")) {
				jButtonCancelarEMailActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEMail")) {
				jButtonCerrarEMailActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEMail")) {
				jButtonGuardarCambiosEMailActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEMail")) {
				jButtonNuevoGuardarCambiosEMailActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEMail")) {
				jButtonAbrirOrderByEMailActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEMail")) {
				jButtonRecargarInformacionEMailActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEMail")) {
				jButtonAnterioresEMailActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEMail")) {
				jButtonSiguientesEMailActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEMailBusqueda")) {
				this.jButtonidEMailBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEMailUpdate")) {
				this.jButtonid_empresaEMailUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEMailBusqueda")) {
				this.jButtonid_empresaEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteEMail")) {
				this.jButtonid_clienteEMailActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteEMailUpdate")) {
				this.jButtonid_clienteEMailUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteEMailBusqueda")) {
				this.jButtonid_clienteEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailEMailBusqueda")) {
				this.jButtone_mailEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEMailBusqueda")) {
				this.jButtondescripcionEMailBusquedaActionPerformed(evt);
			}
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEMail();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEMail")) {
				closingInternalFrameEMail();
				
			} else if(sTipo.equals("jButtonCancelarEMail")) {
				JInternalFrameBase jInternalFrameDetalleFormEMail = (JInternalFrameBase)evt.getSource();
	            	
	            EMailBeanSwingJInternalFrame jInternalFrameParent=(EMailBeanSwingJInternalFrame)jInternalFrameDetalleFormEMail.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEMailActionPerformed(null);
			}
			
			EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.email,new Object(),this.emailParameterGeneral,this.emailReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEMail(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEMail(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEMail(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.email)) {
			if(!esControlTabla) {
				if(EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEMail(this.email,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);			
				}
				
				if(this.emailSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEMail(this.email,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.emailReturnGeneral=emailLogic.procesarEventosEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.emailLogic.getEMails(),this.email,this.emailParameterGeneral,this.isEsNuevoEMail,classes);//this.emailLogic.getEMail()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEMail(this.emailReturnGeneral,this.emailBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.emailSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEMail(classes,this.emailReturnGeneral,this.emailBean,false);
					}
						
					if(this.emailReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEMail(this.emailReturnGeneral.getEMail());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEMail(this.emailReturnGeneral.getEMail());	
					}
						
					if(this.emailReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEMail(this.emailReturnGeneral.getEMail(),classes);//this.emailBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEMail(this.email,classes);//this.emailBean);									
				}
			
				if(EMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEMail(this.email,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEMail(this.email);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.emailAnterior!=null) {
						this.email=this.emailAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.emailReturnGeneral=emailLogic.procesarEventosEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.emailLogic.getEMails(),this.email,this.emailParameterGeneral,this.isEsNuevoEMail,classes);//this.emailLogic.getEMail()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.emailSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.emailSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.emailReturnGeneral.getEMail(),emailLogic.getEMails());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.emailReturnGeneral.getEMail(),this.emails);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEMail.repaint();
				
				//((AbstractTableModel) this.jTableDatosEMail.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEMail();
			}
		}
	}
	
	public void actualizarVisualTableDatosEMail() throws Exception {
		
		EMailModel emailModel=(EMailModel)this.jTableDatosEMail.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			emailModel.emails=this.emailLogic.getEMails();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			emailModel.emails=this.emails;
		}
		
		
		((EMailModel) this.jTableDatosEMail.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEMail() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getemailAnterior(),this.emailLogic.getEMails());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getemailAnterior(),this.emails);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEMail();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEMail(EMail email,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
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
										
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.email,new Object(),generalEntityParameterGeneral,this.emailReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.emailSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EMailConstantesFunciones.getClassesRelationshipsOfEMail(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EMailConstantesFunciones.getClassesRelationshipsFromStringsOfEMail(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEMail(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.email,new Object(),generalEntityParameterGeneral,this.emailReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEMail(EMailBean emailBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEMail(ArrayList<Classe> classes,EMailReturnGeneral emailReturnGeneral,EMailBean emailBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEMail(EMail email,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.email)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEMail = new EMailDetalleFormJInternalFrame(jDesktopPane,this.emailSessionBean.getConGuardarRelaciones(),this.emailSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEMail);
		this.jInternalFrameDetalleFormEMail.setVisible(false);
		this.jInternalFrameDetalleFormEMail.setSelected(false);						
		
		this.jInternalFrameDetalleFormEMail.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEMail.emailLogic=this.emailLogic;
		
		this.cargarCombosFrameForeignKeyEMail("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEMail();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEMail();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEMail("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEMail();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEMail.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEMail"));
		
		this.jInternalFrameDetalleFormEMail.jButtonModificarEMail.addActionListener(new ButtonActionListener(this,"ModificarEMail"));

		
		this.jInternalFrameDetalleFormEMail.jButtonModificarToolBarEMail.addActionListener(new ButtonActionListener(this,"ModificarToolBarEMail"));
					
		this.jInternalFrameDetalleFormEMail.jMenuItemModificarEMail.addActionListener(new ButtonActionListener(this,"MenuItemModificarEMail"));		
		
		
		
		this.jInternalFrameDetalleFormEMail.jButtonActualizarEMail.addActionListener (new ButtonActionListener(this,"ActualizarEMail"));
		
		
		this.jInternalFrameDetalleFormEMail.jButtonActualizarToolBarEMail.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEMail"));
						
		this.jInternalFrameDetalleFormEMail.jMenuItemActualizarEMail.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEMail"));		
		
		
		
		this.jInternalFrameDetalleFormEMail.jButtonEliminarEMail.addActionListener (new ButtonActionListener(this,"EliminarEMail"));
		
		
		this.jInternalFrameDetalleFormEMail.jButtonEliminarToolBarEMail.addActionListener (new ButtonActionListener(this,"EliminarToolBarEMail"));
								
		this.jInternalFrameDetalleFormEMail.jMenuItemEliminarEMail.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEMail"));		
		
		
		
		this.jInternalFrameDetalleFormEMail.jButtonCancelarEMail.addActionListener (new ButtonActionListener(this,"CancelarEMail"));
		
		
		this.jInternalFrameDetalleFormEMail.jButtonCancelarToolBarEMail.addActionListener (new ButtonActionListener(this,"CancelarToolBarEMail"));
					
		this.jInternalFrameDetalleFormEMail.jMenuItemCancelarEMail.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEMail"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEMail.jMenuItemDetalleCerrarEMail.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEMail"));		
		
		
		
		this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosToolBarEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEMail"));
		
		
		
		this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosToolBarEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEMail"));
		
		
		
		this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEMail"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonidEMailBusqueda.addActionListener(new ButtonActionListener(this,"idEMailBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEMail.jButtonid_empresaEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonid_empresaEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEMailBusqueda"));
		//jButtonid_clienteEMail.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteEMailActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMail.addActionListener(new ButtonActionListener(this,"id_clienteEMail"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMailUpdate.addActionListener(new ButtonActionListener(this,"id_clienteEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtone_mailEMailBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtondescripcionEMailBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEMailBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEMail"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEMail"));
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEMail"));
		}
		
		this.jTableDatosEMail.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEMail"));
		
		this.jTableDatosEMail.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEMail"));
		
		this.jButtonNuevoEMail.addActionListener(new ButtonActionListener(this,"NuevoEMail"));
		
		this.jButtonDuplicarEMail.addActionListener(new ButtonActionListener(this,"DuplicarEMail"));
		
		this.jButtonCopiarEMail.addActionListener(new ButtonActionListener(this,"CopiarEMail"));
		
		this.jButtonVerFormEMail.addActionListener(new ButtonActionListener(this,"VerFormEMail"));
		
		
		this.jButtonNuevoToolBarEMail.addActionListener(new ButtonActionListener(this,"NuevoToolBarEMail"));
			
		this.jButtonDuplicarToolBarEMail.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEMail"));
			
		this.jMenuItemNuevoEMail.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEMail"));
			
		this.jMenuItemDuplicarEMail.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEMail"));		
		
		
		this.jButtonNuevoRelacionesEMail.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEMail"));
		
		
		this.jButtonNuevoRelacionesToolBarEMail.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEMail"));
			
		this.jMenuItemNuevoRelacionesEMail.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEMail"));		
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonModificarEMail.addActionListener(new ButtonActionListener(this,"ModificarEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonModificarToolBarEMail.addActionListener(new ButtonActionListener(this,"ModificarToolBarEMail"));
			
			this.jInternalFrameDetalleFormEMail.jMenuItemModificarEMail.addActionListener(new ButtonActionListener(this,"MenuItemModificarEMail"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEMail.jButtonActualizarEMail.addActionListener (new ButtonActionListener(this,"ActualizarEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonActualizarToolBarEMail.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEMail"));
				
			this.jInternalFrameDetalleFormEMail.jMenuItemActualizarEMail.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEMail"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonEliminarEMail.addActionListener (new ButtonActionListener(this,"EliminarEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonEliminarToolBarEMail.addActionListener (new ButtonActionListener(this,"EliminarToolBarEMail"));
						
			this.jInternalFrameDetalleFormEMail.jMenuItemEliminarEMail.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEMail"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonCancelarEMail.addActionListener (new ButtonActionListener(this,"CancelarEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonCancelarToolBarEMail.addActionListener (new ButtonActionListener(this,"CancelarToolBarEMail"));
			
			this.jInternalFrameDetalleFormEMail.jMenuItemCancelarEMail.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEMail"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEMail.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEMail"));		
		
		
		this.jButtonCerrarEMail.addActionListener (new ButtonActionListener(this,"CerrarEMail"));
		
		
		this.jButtonCerrarToolBarEMail.addActionListener (new ButtonActionListener(this,"CerrarToolBarEMail"));
			
		this.jMenuItemCerrarEMail.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEMail"));
			
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jMenuItemDetalleCerrarEMail.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEMail"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosToolBarEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEMail"));
		}
		
		this.jButtonCopiarToolBarEMail.addActionListener (new ButtonActionListener(this,"CopiarToolBarEMail"));
			
		this.jButtonVerFormToolBarEMail.addActionListener (new ButtonActionListener(this,"VerFormToolBarEMail"));
		
		this.jMenuItemGuardarCambiosEMail.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEMail"));
			
		this.jMenuItemCopiarEMail.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEMail"));		
		
		this.jMenuItemVerFormEMail.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEMail"));		
		
		
		this.jButtonGuardarCambiosTablaEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEMail"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEMail"));
			
		this.jMenuItemGuardarCambiosTablaEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEMail"));		
		
		
		
		this.jButtonRecargarInformacionEMail.addActionListener (new ButtonActionListener(this,"RecargarInformacionEMail"));
					
		this.jButtonRecargarInformacionToolBarEMail.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEMail"));
		
		this.jMenuItemRecargarInformacionEMail.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEMail"));		
		
		
		
		this.jButtonAnterioresEMail.addActionListener (new ButtonActionListener(this,"AnterioresEMail"));
		
		
		this.jButtonAnterioresToolBarEMail.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEMail"));
		
		this.jMenuItemAnterioresEMail.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEMail"));		
		
		
		this.jButtonSiguientesEMail.addActionListener (new ButtonActionListener(this,"SiguientesEMail"));
		
		
		this.jButtonSiguientesToolBarEMail.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEMail"));
			
		this.jMenuItemSiguientesEMail.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEMail"));
			
		this.jMenuItemAbrirOrderByEMail.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEMail"));
			
		this.jMenuItemMostrarOcultarEMail.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEMail"));
			
		this.jMenuItemDetalleAbrirOrderByEMail.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEMail"));
			
		this.jMenuItemDetalleMostarOcultarEMail.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEMail"));		
		
		
		this.jButtonNuevoGuardarCambiosEMail.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEMail"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEMail.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEMail"));
			
		this.jMenuItemNuevoGuardarCambiosEMail.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEMail"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEMail.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEMail"));

		this.jCheckBoxSeleccionadosEMail.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEMail"));
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEMail"));
		}
		
		
		this.jComboBoxTiposRelacionesEMail.addActionListener (new ButtonActionListener(this,"TiposRelacionesEMail"));
			
		this.jComboBoxTiposAccionesEMail.addActionListener (new ButtonActionListener(this,"TiposAccionesEMail"));
					
		this.jComboBoxTiposSeleccionarEMail.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEMail"));
			
		this.jTextFieldValorCampoGeneralEMail.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEMail"));		
		
		
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonidEMailBusqueda.addActionListener(new ButtonActionListener(this,"idEMailBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEMail.jButtonid_empresaEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonid_empresaEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEMailBusqueda"));
		//jButtonid_clienteEMail.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteEMailActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMail.addActionListener(new ButtonActionListener(this,"id_clienteEMail"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMailUpdate.addActionListener(new ButtonActionListener(this,"id_clienteEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtone_mailEMailBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtondescripcionEMailBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEMailBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteEMail.addActionListener(new ButtonActionListener(this,"FK_IdClienteEMail"));

			this.jButtonBuscarFK_IdClienteid_clienteEMail.addActionListener(new ButtonActionListener(this,"id_clienteEMail"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEMail!=null) {
				this.jInternalFrameReporteDinamicoEMail.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEMail"));
				this.jInternalFrameReporteDinamicoEMail.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEMail"));
				this.jInternalFrameReporteDinamicoEMail.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEMail"));
			}
			
			//this.jButtonCerrarReporteDinamicoEMail.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEMail"));				
			//this.jButtonGenerarReporteDinamicoEMail.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEMail"));
			//this.jButtonGenerarExcelReporteDinamicoEMail.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEMail"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEMail!=null) {
				this.jInternalFrameImportacionEMail.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEMail"));
				this.jInternalFrameImportacionEMail.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEMail"));
				this.jInternalFrameImportacionEMail.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEMail"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEMail.addActionListener (new ButtonActionListener(this,"AbrirOrderByEMail"));
			
			this.jButtonAbrirOrderByToolBarEMail.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEMail"));			
			
			if(this.jInternalFrameOrderByEMail!=null) {
				this.jInternalFrameOrderByEMail.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEMail"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEMail.jTabbedPaneRelacionesEMail.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEMail"));
		
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
            		closingInternalFrameEMail();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEMail.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEMail = (JInternalFrameBase)event.getSource();
	            	
	            EMailBeanSwingJInternalFrame jInternalFrameParent=(EMailBeanSwingJInternalFrame)jInternalFrameDetalleFormEMail.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEMailActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEMail.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEMailListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEMail.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEMail.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEMailActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEMailActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEMailActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEMail";
		inputMap = this.jButtonNuevoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEMailActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEMailActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEMailActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEMailActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEMail";
		inputMap = this.jButtonNuevoRelacionesEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEMailActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEMail";
		inputMap = this.jButtonModificarEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEMail";
		inputMap = this.jButtonActualizarEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEMail";
		inputMap = this.jButtonEliminarEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEMail";
		inputMap = this.jButtonCancelarEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEMail";
		inputMap = this.jButtonCerrarEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEMail";
		inputMap = this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEMail.jButtonGuardarCambiosEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEMail.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEMailItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEMail.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEMailActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEMail.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEMailActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEMail.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEMailActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonidEMailBusqueda.addActionListener(new ButtonActionListener(this,"idEMailBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEMail.jButtonid_empresaEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonid_empresaEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEMailBusqueda"));
		//jButtonid_clienteEMail.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteEMailActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMail.addActionListener(new ButtonActionListener(this,"id_clienteEMail"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMailUpdate.addActionListener(new ButtonActionListener(this,"id_clienteEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtone_mailEMailBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEMail.jButtondescripcionEMailBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEMailBusqueda"));
		
		
		this.jButtonFK_IdClienteEMail.addActionListener(new ButtonActionListener(this,"FK_IdClienteEMail"));

		this.jButtonBuscarFK_IdClienteid_clienteEMail.addActionListener(new ButtonActionListener(this,"id_clienteEMail"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEMailActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEMail.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEMail(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EMail emailAux:this.emailLogic.getEMails()) {
					emailAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EMail emailAux:emails) {
					emailAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEMailItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEMail(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EMail emailAux:this.emailLogic.getEMails()) {
						emailAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EMail emailAux:emails) {
						emailAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EMail emailAux:this.emailLogic.getEMails()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EMail emailAux:emails) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEMail(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEMail.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEMail.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEMail,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEMailItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEMail(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEMail.getSelectedRows();
			
			EMail emailLocal=new EMail();
			
			//this.seleccionarTodosEMail(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					emailLocal =(EMail) this.emailLogic.getEMails().toArray()[this.jTableDatosEMail.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					emailLocal =(EMail) this.emails.toArray()[this.jTableDatosEMail.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				emailLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EMail emailAux:this.emailLogic.getEMails()) {
						emailAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EMail emailAux:emails) {
						emailAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEMail(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEMail.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEMail.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEMail,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEMailItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEMailParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEMailActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEMail(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEMail.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EMail emailAux:this.emailLogic.getEMails()) {
				
						if(sTipoSeleccionar.equals(EMailConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							emailAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EMailConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							emailAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EMail emailAux:emails) {
					
						if(sTipoSeleccionar.equals(EMailConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							emailAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EMailConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							emailAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEMail(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEMailActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEMail(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEMail=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEMail.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEMail) {				
					conSplash=true;//false;										
					
					//this.startProcessEMail(conSplash);
				
					this.generarReporteEMailsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEMailsSeleccionados();
				//this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEMailsSeleccionados(false);
				//this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEMailsSeleccionados(true);
				//this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEMail();
				
				this.exportarEMailsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEMails();
				//this.importarEMails();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEMail();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEMailsSeleccionados();
				//this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE E Mail", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEMail();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEMail)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEMail(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.setSelectedIndex(0);					
				}	
			} 			
			else if(EMailBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEMail) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEMail(conSplash);
					
						//this.actualizarParametrosGeneralEMail();
						
						this.generarReporteProcesoAccionEMailsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EMailBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO E MailES SELECCIONADOS?", "MANTENIMIENTO DE E Mail", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEMail();
				
						this.actualizarParametrosGeneralEMail();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.emailReturnGeneral=emailLogic.procesarAccionEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.emailLogic.getEMails(),this.emailParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEMailReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEMail();
					
					EMailBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEMailReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEMail.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEMail.jComboBoxTiposAccionesFormularioEMail.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEMail(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEMailActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEMail();
			
			if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		
			EMail email=new EMail();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEMail(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEMail.getSelectedItem();
			
			
			
			
			emailsSeleccionados=this.getEMailsSeleccionados(true);
			//this.sTipoAccion;
			
			if(emailsSeleccionados.size()==1) {
				for(EMail emailAux:emailsSeleccionados) {
					email=emailAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEMail();
			
      		//this.finishProcessEMail(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEMailReturnGeneral() throws Exception {
		if(this.emailReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.emailReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.emailReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.emailReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.emailReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.emailReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEMail(false);
		}
		
		if(this.emailReturnGeneral.getConRetornoLista() || this.emailReturnGeneral.getConRetornoObjeto()) {
			if(this.emailReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.emailLogic.setEMails(this.emailReturnGeneral.getEMails());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.emailReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.emailLogic.setEMail(this.emailReturnGeneral.getEMail());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEMail(false);
		}
	}
	
	public void actualizarParametrosGeneralEMail() throws Exception {
		
		
	}
	
	public ArrayList<EMail> getEMailsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEMail) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EMail emailAux:emailLogic.getEMails()) {
					if(emailAux.getIsSelected()) {
						emailsSeleccionados.add(emailAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EMail emailAux:this.emails) {
					if(emailAux.getIsSelected()) {
						emailsSeleccionados.add(emailAux);				
					}
				}
			}
			
			if(emailsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						emailsSeleccionados.addAll(this.emailLogic.getEMails());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						emailsSeleccionados.addAll(this.emails);				
					}
				}
			}
		} else {
			emailsSeleccionados.add(this.email);
		}
		
		return emailsSeleccionados;
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
	
	public void generarReporteEMailsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEMailsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEMailsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEMailsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEMailsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE E Mail",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEMailsSeleccionados() throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEMails("Todos",emailsSeleccionados);
		
	}	
	
	public void generarReporteNormalEMailsSeleccionados() throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEMails("Todos",emailsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEMailsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEMails("Todos",emailsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEMailsSeleccionados() throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEMail();
		
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEMail();
		
		
		//this.generarReporteEMails("Todos",emailsSeleccionados ,emailImplementable,emailImplementableHome);
	}
	
	public void mostrarImportacionEMails() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEMail();
		
		this.abrirFrameImportacionEMail();		
		
			
		//this.generarReporteEMails("Todos",emailsSeleccionados ,emailImplementable,emailImplementableHome);
	}
	
	public void importarEMails() throws Exception {		
	
	}
	
	public void exportarEMailsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEMailsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEMailsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEMailsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE E Mail",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEMailsSeleccionados() throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"email."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEMail(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EMail emailAux:emailsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEMail(emailAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//emailAux.setsDetalleGeneralEntityReporte(emailAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEMail(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EMailConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EMailConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EMailConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EMailConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EMailConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EMailConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEMail(EMail email,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=email.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=email.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=email.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=email.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=email.gete_mail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=email.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEMailsSeleccionados() throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"email.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EMails");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEMail(row);				
				iRow++;
			}				
			
			for(EMail emailAux:emailsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEMail(emailAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEMailsSeleccionados() throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();		
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"email.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("emails");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("email");
			//elementRoot.appendChild(element);
		
			for(EMail emailAux:emailsSeleccionados) {
				element = document.createElement("email");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEMail(emailAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.emailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE E Mail",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEMail(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EMailConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EMailConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EMailConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EMailConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(EMailConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(EMailConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEMail(EMail email,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(email.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(email.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(email.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(email.gete_mail());
		cell = row.createCell(iColumn++);cell.setCellValue(email.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlEMail(EMail email,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EMailConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(email.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EMailConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(email.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EMailConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(email.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(EMailConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(email.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elemente_mail = document.createElement(EMailConstantesFunciones.EMAIL);
		elemente_mail.appendChild(document.createTextNode(email.gete_mail().trim()));
		element.appendChild(elemente_mail);

		Element elementdescripcion = document.createElement(EMailConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(email.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoEMailsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EMail> emailsSeleccionados=new ArrayList<EMail>();
		
		emailsSeleccionados=this.getEMailsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEMail(emailsSeleccionados);
		
		this.generarReporteEMails("Todos",emailsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEMail(ArrayList<EMail> emailsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EMail emailAux:emailsSeleccionados) {
				emailAux.setsDetalleGeneralEntityReporte(emailAux.toString());
			
				if(sTipoSeleccionar.equals(EMailConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					emailAux.setsDescripcionGeneralEntityReporte1(emailAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EMailConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					emailAux.setsDescripcionGeneralEntityReporte1(emailAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EMailConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					emailAux.setsDescripcionGeneralEntityReporte1(emailAux.gete_mail());
				}
				 else if(sTipoSeleccionar.equals(EMailConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					emailAux.setsDescripcionGeneralEntityReporte1(emailAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EMailConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEMail(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEMail=true;
				this.isVisibilidadCeldaNuevoRelacionesEMail=true;
				this.isVisibilidadCeldaGuardarCambiosEMail=true;
			}
			
			this.isVisibilidadCeldaModificarEMail=false;
			this.isVisibilidadCeldaActualizarEMail=false;
			this.isVisibilidadCeldaEliminarEMail=false;
			this.isVisibilidadCeldaCancelarEMail=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEMail=true;
				} else {
					this.isVisibilidadCeldaGuardarEMail=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEMail=false;
			this.isVisibilidadCeldaModificarEMail=false;
			this.isVisibilidadCeldaActualizarEMail=true;
			this.isVisibilidadCeldaEliminarEMail=false;
			this.isVisibilidadCeldaCancelarEMail=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEMail=true;
				} else {
					this.isVisibilidadCeldaGuardarEMail=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEMail=false;
			this.isVisibilidadCeldaModificarEMail=false;
			this.isVisibilidadCeldaActualizarEMail=true;
			this.isVisibilidadCeldaEliminarEMail=true;
			this.isVisibilidadCeldaCancelarEMail=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEMail=true;
				} else {
					this.isVisibilidadCeldaGuardarEMail=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEMail=false;
			this.isVisibilidadCeldaModificarEMail=false;
			this.isVisibilidadCeldaActualizarEMail=true;
			this.isVisibilidadCeldaEliminarEMail=false;
			this.isVisibilidadCeldaCancelarEMail=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEMail=false;
				} else {
					this.isVisibilidadCeldaGuardarEMail=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEMail=true;
			this.isVisibilidadCeldaNuevoRelacionesEMail=true;
			this.isVisibilidadCeldaGuardarCambiosEMail=true;
			this.isVisibilidadCeldaModificarEMail=false;
			this.isVisibilidadCeldaActualizarEMail=false;
			this.isVisibilidadCeldaEliminarEMail=false;
			this.isVisibilidadCeldaCancelarEMail=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEMail=true;
				} else {
					this.isVisibilidadCeldaGuardarEMail=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEMail=false;
			this.isVisibilidadCeldaActualizarEMail=false;
			this.isVisibilidadCeldaEliminarEMail=false;
			this.isVisibilidadCeldaCancelarEMail=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEMail=false;
				} else {
					this.isVisibilidadCeldaGuardarEMail=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEMail=false;
			this.isVisibilidadCeldaModificarEMail=true;
			this.isVisibilidadCeldaActualizarEMail=false;
			this.isVisibilidadCeldaEliminarEMail=false;
			this.isVisibilidadCeldaCancelarEMail=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEMail=false;
				} else {
					this.isVisibilidadCeldaGuardarEMail=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EMailJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEMail=true;
			this.isVisibilidadCeldaNuevoRelacionesEMail=true;
			this.isVisibilidadCeldaGuardarCambiosEMail=true;
		} else {
			this.actualizarEstadoPanelsEMail(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEMail=false;
			//this.isVisibilidadCeldaVerFormEMail=false;
			this.isVisibilidadCeldaDuplicarEMail=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!emailSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEMail=false;
		} else {
			this.isVisibilidadCeldaNuevoEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEMail=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(emailSessionBean.getEsGuardarRelacionado()) {
			if(!emailSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEMail=false;												
			}
			
			this.jButtonCerrarEMail.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEMail=false;
		}
		
		if(!this.permiteMantenimiento(this.email)) {
			this.isVisibilidadCeldaActualizarEMail=false;
			this.isVisibilidadCeldaEliminarEMail=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEMail() {
	}
	
	public void actualizarEstadoPanelsEMail(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEMail!=null) {
				this.jScrollPanelDatosEdicionEMail.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEMail!=null) {
				this.jTabbedPaneBusquedasEMail.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEMail!=null) {
				this.jScrollPanelDatosEMail.setVisible(true);
			}
			
			if(this.jPanelPaginacionEMail!=null) {
				this.jPanelPaginacionEMail.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEMail!=null) {
				this.jScrollPanelDatosEdicionEMail.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEMail!=null) {
				this.jTabbedPaneBusquedasEMail.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEMail!=null) {
				this.jScrollPanelDatosEMail.setVisible(false);
			}
			
			if(this.jPanelPaginacionEMail!=null) {
				this.jPanelPaginacionEMail.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEMail!=null) {
				this.jScrollPanelDatosEdicionEMail.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEMail!=null) {
				this.jTabbedPaneBusquedasEMail.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEMail!=null) {
				this.jScrollPanelDatosEMail.setVisible(false);
			}
			
			if(this.jPanelPaginacionEMail!=null) {
				this.jPanelPaginacionEMail.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEMail!=null) {
				this.jScrollPanelDatosEdicionEMail.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEMail!=null) {
				this.jTabbedPaneBusquedasEMail.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEMail!=null) {
				this.jScrollPanelDatosEMail.setVisible(false);
			}
			
			if(this.jPanelPaginacionEMail!=null) {
				this.jPanelPaginacionEMail.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEMail!=null) {
				this.jScrollPanelDatosEdicionEMail.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEMail!=null) {
				this.jTabbedPaneBusquedasEMail.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEMail!=null) {
				this.jScrollPanelDatosEMail.setVisible(true);
			}
			
			if(this.jPanelPaginacionEMail!=null) {
				this.jPanelPaginacionEMail.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEMail!=null) {
				this.jScrollPanelDatosEdicionEMail.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEMail!=null) {
				this.jTabbedPaneBusquedasEMail.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEMail!=null) {
				this.jScrollPanelDatosEMail.setVisible(true);
			}
			
			if(this.jPanelPaginacionEMail!=null) {
				this.jPanelPaginacionEMail.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEMail!=null) {
				this.jScrollPanelDatosEdicionEMail.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEMail!=null) {
				this.jTabbedPaneBusquedasEMail.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEMail!=null) {
				this.jScrollPanelDatosEMail.setVisible(true);
			}
			
			if(this.jPanelPaginacionEMail!=null) {
				this.jPanelPaginacionEMail.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.emailSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEMail!=null) {
					this.jTabbedPaneBusquedasEMail.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.emailSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEMail!=null) {
				this.jTabbedPaneBusquedasEMail.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEMail!=null) {
				this.jPanelParametrosReportesEMail.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasEMail.remove(jPanelFK_IdClienteEMail);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasEMail.remove(jPanelFK_IdClienteEMail);}
		}
		
	}
	
	
	
	

	public String registrarSesionEMailParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(emailSessionBean==null) {
				emailSessionBean=new EMailSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(emailSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.emailFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(EMailConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionEMail(true);
			//clienteSessionBean.setlidEMailActual(this.idEMailActual);

			emailSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEMail(true);
			emailSessionBean.setlIdEMailActualForeignKey(this.idEMailActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EMailSessionBean emailSessionBean=new EMailSessionBean();
		
		if(this.emailSessionBean==null) {
			this.emailSessionBean=new EMailSessionBean();
		}
		
		this.emailSessionBean.setsUltimaBusquedaEMail(this.getsAccionBusqueda());
		this.emailSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.emailSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			emailSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			emailSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EMailSessionBean emailSessionBean=new EMailSessionBean();
		
		if(this.emailSessionBean==null) {
			this.emailSessionBean=new EMailSessionBean();
		}
		
		if(this.emailSessionBean.getsUltimaBusquedaEMail()!=null&&!this.emailSessionBean.getsUltimaBusquedaEMail().equals("")) {
			this.setsAccionBusqueda(emailSessionBean.getsUltimaBusquedaEMail());
			this.setiNumeroPaginacion(emailSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(emailSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(emailSessionBean.getid_cliente());
				emailSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(emailSessionBean.getid_empresa());
				emailSessionBean.setid_empresa(-1L);
			}
		}
		
		this.emailSessionBean.setsUltimaBusquedaEMail("");
		this.emailSessionBean.setiNumeroPaginacion(EMailConstantesFunciones.INUMEROPAGINACION);
		this.emailSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEMail(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEMail() {
		this.updateBorderResaltarBusquedasFormularioEMail();
		this.updateVisibilidadBusquedasFormularioEMail();
		this.updateHabilitarBusquedasFormularioEMail();
	}
	
	public void updateBorderResaltarBusquedasFormularioEMail() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEMail.getComponents().length>0) {
	

		if(this.emailConstantesFunciones.resaltarFK_IdClienteEMail!=null) {
			index= this.jTabbedPaneBusquedasEMail.indexOfComponent(this.jPanelFK_IdClienteEMail);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEMail.getComponent(index);
				jPanel.setBorder(this.emailConstantesFunciones.resaltarFK_IdClienteEMail);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEMail() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEMail.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEMail.indexOfComponent(this.jPanelFK_IdClienteEMail);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEMail.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.emailConstantesFunciones.mostrarFK_IdClienteEMail);
			if(!this.emailConstantesFunciones.mostrarFK_IdClienteEMail && index>-1) {
				this.jTabbedPaneBusquedasEMail.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEMail() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEMail.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEMail.indexOfComponent(this.jPanelFK_IdClienteEMail);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEMail.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.emailConstantesFunciones.activarFK_IdClienteEMail);
				this.jTabbedPaneBusquedasEMail.setEnabledAt(index,this.emailConstantesFunciones.activarFK_IdClienteEMail);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEMail(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasEMail.indexOfComponent(this.jPanelFK_IdClienteEMail);

			this.jTabbedPaneBusquedasEMail.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEMail.getComponent(index);

			this.emailConstantesFunciones.setResaltarFK_IdClienteEMail(resaltar);

			jPanel.setBorder(this.emailConstantesFunciones.resaltarFK_IdClienteEMail);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEMail.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEMail() throws Exception {

		if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEMail();
		this.updateVisibilidadResaltarControlesFormularioEMail();
		this.updateHabilitarResaltarControlesFormularioEMail();
		
	}
	
	public void updateBorderResaltarControlesFormularioEMail() throws Exception {
		if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.emailConstantesFunciones.resaltaridEMail!=null && this.jInternalFrameDetalleFormEMail!=null) {this.jInternalFrameDetalleFormEMail.jLabelidEMail.setBorder(this.emailConstantesFunciones.resaltaridEMail);}
		if(this.emailConstantesFunciones.resaltarid_empresaEMail!=null && this.jInternalFrameDetalleFormEMail!=null) {this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setBorder(this.emailConstantesFunciones.resaltarid_empresaEMail);}
		if(this.emailConstantesFunciones.resaltarid_clienteEMail!=null && this.jInternalFrameDetalleFormEMail!=null) {this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setBorder(this.emailConstantesFunciones.resaltarid_clienteEMail);}
		if(this.emailConstantesFunciones.resaltare_mailEMail!=null && this.jInternalFrameDetalleFormEMail!=null) {this.jInternalFrameDetalleFormEMail.jTextAreae_mailEMail.setBorder(this.emailConstantesFunciones.resaltare_mailEMail);}
		if(this.emailConstantesFunciones.resaltardescripcionEMail!=null && this.jInternalFrameDetalleFormEMail!=null) {this.jInternalFrameDetalleFormEMail.jTextAreadescripcionEMail.setBorder(this.emailConstantesFunciones.resaltardescripcionEMail);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEMail() throws Exception {		
		if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEMail!=null) {
	
		//this.jInternalFrameDetalleFormEMail.jLabelidEMail.setVisible(this.emailConstantesFunciones.mostraridEMail);
		this.jInternalFrameDetalleFormEMail.jPanelidEMail.setVisible(this.emailConstantesFunciones.mostraridEMail);
		//this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setVisible(this.emailConstantesFunciones.mostrarid_empresaEMail);
		this.jInternalFrameDetalleFormEMail.jPanelid_empresaEMail.setVisible(this.emailConstantesFunciones.mostrarid_empresaEMail);
		//this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setVisible(this.emailConstantesFunciones.mostrarid_clienteEMail);
		this.jInternalFrameDetalleFormEMail.jPanelid_clienteEMail.setVisible(this.emailConstantesFunciones.mostrarid_clienteEMail);
			this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMail.setVisible(this.emailConstantesFunciones.mostrarid_clienteEMail);
		//this.jInternalFrameDetalleFormEMail.jTextAreae_mailEMail.setVisible(this.emailConstantesFunciones.mostrare_mailEMail);
		this.jInternalFrameDetalleFormEMail.jPanele_mailEMail.setVisible(this.emailConstantesFunciones.mostrare_mailEMail);
		//this.jInternalFrameDetalleFormEMail.jTextAreadescripcionEMail.setVisible(this.emailConstantesFunciones.mostrardescripcionEMail);
		this.jInternalFrameDetalleFormEMail.jPaneldescripcionEMail.setVisible(this.emailConstantesFunciones.mostrardescripcionEMail);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEMail() throws Exception {
		if(this.jInternalFrameDetalleFormEMail==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEMail!=null) {
	
		this.jInternalFrameDetalleFormEMail.jLabelidEMail.setEnabled(this.emailConstantesFunciones.activaridEMail);
		this.jInternalFrameDetalleFormEMail.jComboBoxid_empresaEMail.setEnabled(this.emailConstantesFunciones.activarid_empresaEMail);
		this.jInternalFrameDetalleFormEMail.jComboBoxid_clienteEMail.setEnabled(this.emailConstantesFunciones.activarid_clienteEMail);
			this.jInternalFrameDetalleFormEMail.jButtonid_clienteEMail.setEnabled(this.emailConstantesFunciones.activarid_clienteEMail);
		this.jInternalFrameDetalleFormEMail.jTextAreae_mailEMail.setEnabled(this.emailConstantesFunciones.activare_mailEMail);
		this.jInternalFrameDetalleFormEMail.jTextAreadescripcionEMail.setEnabled(this.emailConstantesFunciones.activardescripcionEMail);
		}
	}
	
		
}