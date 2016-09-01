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

import com.bydan.erp.cartera.util.ClienteCoaConstantesFunciones;
import com.bydan.erp.cartera.util.ClienteCoaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ClienteCoaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ClienteCoaBean;
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
public class ClienteCoaBeanSwingJInternalFrame extends ClienteCoaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ClienteCoaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ClienteCoa> clientecoaValidator = new ClassValidator<ClienteCoa>(ClienteCoa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ClienteCoa clientecoa;	
	public ClienteCoa clientecoaAux;
	public ClienteCoa clientecoaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ClienteCoa clientecoaTotales;
	public Long idClienteCoaActual;
	public Long iIdNuevoClienteCoa=0L;
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
	
	public Boolean isPermisoTodoClienteCoa;
	public Boolean isPermisoNuevoClienteCoa;
	public Boolean isPermisoActualizarClienteCoa;
	public Boolean isPermisoActualizarOriginalClienteCoa;
	public Boolean isPermisoEliminarClienteCoa;
	public Boolean isPermisoGuardarCambiosClienteCoa;
	public Boolean isPermisoConsultaClienteCoa;
	public Boolean isPermisoBusquedaClienteCoa;
	public Boolean isPermisoReporteClienteCoa;
	public Boolean isPermisoPaginacionMedioClienteCoa;
	public Boolean isPermisoPaginacionAltoClienteCoa;
	public Boolean isPermisoPaginacionTodoClienteCoa;
	public Boolean isPermisoCopiarClienteCoa;
	public Boolean isPermisoVerFormClienteCoa;
	public Boolean isPermisoDuplicarClienteCoa;
	public Boolean isPermisoOrdenClienteCoa;
	
	
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
	
	public ClienteCoaParameterReturnGeneral clientecoaReturnGeneral;
	public ClienteCoaParameterReturnGeneral clientecoaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoClienteCoa=false;
	public Boolean esParaAccionDesdeFormularioClienteCoa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ClienteCoaSessionBeanAdditional clientecoaSessionBeanAdditional=null;
	
	public ClienteCoaSessionBeanAdditional getClienteCoaSessionBeanAdditional() {
		return this.clientecoaSessionBeanAdditional;
	}
	
	public void setClienteCoaSessionBeanAdditional(ClienteCoaSessionBeanAdditional clientecoaSessionBeanAdditional) {
		try {
			this.clientecoaSessionBeanAdditional=clientecoaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ClienteCoaBeanSwingJInternalFrameAdditional clientecoaBeanSwingJInternalFrameAdditional=null;
	//public class ClienteCoaBeanSwingJInternalFrame
	
	public ClienteCoaBeanSwingJInternalFrameAdditional getClienteCoaBeanSwingJInternalFrameAdditional() {
		return this.clientecoaBeanSwingJInternalFrameAdditional;
	}
	
	public void setClienteCoaBeanSwingJInternalFrameAdditional(ClienteCoaBeanSwingJInternalFrameAdditional clientecoaBeanSwingJInternalFrameAdditional) {
		try {
			this.clientecoaBeanSwingJInternalFrameAdditional=clientecoaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ClienteCoaLogic clientecoaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ClienteCoa clientecoaBean;
	public ClienteCoaConstantesFunciones clientecoaConstantesFunciones;
	//public ClienteCoaParameterReturnGeneral clientecoaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<ClienteCoa> clientecoas;	
	//public List<ClienteCoa> clientecoasEliminados;
	//public List<ClienteCoa> clientecoasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoClienteCoa=false;
	public Boolean isVisibilidadCeldaDuplicarClienteCoa=true;
	public Boolean isVisibilidadCeldaCopiarClienteCoa=true;
	public Boolean isVisibilidadCeldaVerFormClienteCoa=true;
	public Boolean isVisibilidadCeldaOrdenClienteCoa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
	public Boolean isVisibilidadCeldaModificarClienteCoa=false;
	public Boolean isVisibilidadCeldaActualizarClienteCoa=false;
	public Boolean isVisibilidadCeldaEliminarClienteCoa=false;
	public Boolean isVisibilidadCeldaCancelarClienteCoa=false;
	public Boolean isVisibilidadCeldaGuardarClienteCoa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosClienteCoa=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoClienteCoa() {
		return this.iIdNuevoClienteCoa;
	}

	public void setiIdNuevoClienteCoa(Long iIdNuevoClienteCoa) {
		this.iIdNuevoClienteCoa = iIdNuevoClienteCoa;
	}
	
	public Long getidClienteCoaActual() {
		return this.idClienteCoaActual;
	}

	public void setidClienteCoaActual(Long idClienteCoaActual) {
		this.idClienteCoaActual = idClienteCoaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ClienteCoa getclientecoa() {
		return this.clientecoa;
	}

	public void setclientecoa(ClienteCoa clientecoa) {
		this.clientecoa = clientecoa;
	}
	
	public ClienteCoa getclientecoaAux() {
		return this.clientecoaAux;
	}

	public void setclientecoaAux(ClienteCoa clientecoaAux) {
		this.clientecoaAux = clientecoaAux;
	}				
	
	public ClienteCoa getclientecoaAnterior() {
		return this.clientecoaAnterior;
	}

	public void setclientecoaAnterior(ClienteCoa clientecoaAnterior) {
		this.clientecoaAnterior = clientecoaAnterior;
	}	
	
	public ClienteCoa getclientecoaTotales() {
		return this.clientecoaTotales;
	}

	public void setclientecoaTotales(ClienteCoa clientecoaTotales) {
		this.clientecoaTotales = clientecoaTotales;
	}	
	
	public ClienteCoa getclientecoaBean() {
		return this.clientecoaBean;
	}

	public void setclientecoaBean(ClienteCoa clientecoaBean) {
		this.clientecoaBean = clientecoaBean;
	}	
	
	public ClienteCoaParameterReturnGeneral getclientecoaReturnGeneral() {
		return this.clientecoaReturnGeneral;
	}

	public void setclientecoaReturnGeneral(ClienteCoaParameterReturnGeneral clientecoaReturnGeneral) {
		this.clientecoaReturnGeneral = clientecoaReturnGeneral;
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

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ClienteCoaLogic getClienteCoaLogic()	{		
		return clientecoaLogic;
	}

	public void setClienteCoaLogic(ClienteCoaLogic clientecoaLogic) {
		this.clientecoaLogic = clientecoaLogic;
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
	
	public Boolean getIsEsNuevoClienteCoa() {
		return isEsNuevoClienteCoa;
	}

	public void setIsEsNuevoClienteCoa(Boolean isEsNuevoClienteCoa) {
		this.isEsNuevoClienteCoa = isEsNuevoClienteCoa;
	}

	public Boolean getEsParaAccionDesdeFormularioClienteCoa() {
		return esParaAccionDesdeFormularioClienteCoa;
	}
	
	public void setEsParaAccionDesdeFormularioClienteCoa(Boolean esParaAccionDesdeFormularioClienteCoa) {
		this.esParaAccionDesdeFormularioClienteCoa = esParaAccionDesdeFormularioClienteCoa;
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

			if(this.clientecoaSessionBean==null) {
				this.clientecoaSessionBean=new ClienteCoaSessionBean();
			}

			if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(clientecoaSessionBean.getlidEmpresaActual());
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

			if(this.clientecoaSessionBean==null) {
				this.clientecoaSessionBean=new ClienteCoaSessionBean();
			}

			if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(clientecoaSessionBean.getlidClienteActual());
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

			if(this.clientecoaSessionBean==null) {
				this.clientecoaSessionBean=new ClienteCoaSessionBean();
			}

			if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(clientecoaSessionBean.getlidUsuarioActual());
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

					if(this.clientecoa!=null) {
						this.clientecoa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormClienteCoa!=null) {
						this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaClienteCoa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormClienteCoa!=null) {
						if(this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.getItemCount()>0) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaClienteCoaGenerico)throws Exception
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
				jComboBoxid_empresaClienteCoaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaClienteCoaGenerico!=null && jComboBoxid_empresaClienteCoaGenerico.getItemCount()>0) {
					jComboBoxid_empresaClienteCoaGenerico.setSelectedIndex(0);
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

					if(this.clientecoa!=null) {
						this.clientecoa.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormClienteCoa!=null) {
						this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteClienteCoa.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormClienteCoa!=null) {
						if(this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.getItemCount()>0) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteClienteCoa!=null) {
						jComboBoxid_clienteFK_IdClienteClienteCoa.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteClienteCoa!=null) {
							//jComboBoxid_clienteFK_IdClienteClienteCoa.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteClienteCoa.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteClienteCoa.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteClienteCoaGenerico)throws Exception
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
				jComboBoxid_clienteClienteCoaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteClienteCoaGenerico!=null && jComboBoxid_clienteClienteCoaGenerico.getItemCount()>0) {
					jComboBoxid_clienteClienteCoaGenerico.setSelectedIndex(0);
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

					if(this.clientecoa!=null) {
						this.clientecoa.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormClienteCoa!=null) {
						this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioClienteCoa.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormClienteCoa!=null) {
						if(this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.getItemCount()>0) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioClienteCoaGenerico)throws Exception
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
				jComboBoxid_usuarioClienteCoaGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioClienteCoaGenerico!=null && jComboBoxid_usuarioClienteCoaGenerico.getItemCount()>0) {
					jComboBoxid_usuarioClienteCoaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ClienteCoa clientecoa,JComboBox jComboBoxid_empresaClienteCoaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaClienteCoaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaClienteCoaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				clientecoa.setid_empresa(empresaAux.getId());
				clientecoa.setempresa_descripcion(ClienteCoaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				clientecoa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ClienteCoa clientecoa,JComboBox jComboBoxid_clienteClienteCoaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteClienteCoaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteClienteCoaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				clientecoa.setid_cliente(clienteAux.getId());
				clientecoa.setcliente_descripcion(ClienteCoaConstantesFunciones.getClienteDescripcion(clienteAux));
				clientecoa.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(ClienteCoa clientecoa,JComboBox jComboBoxid_usuarioClienteCoaGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioClienteCoaGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioClienteCoaGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				clientecoa.setid_usuario(usuarioAux.getId());
				clientecoa.setusuario_descripcion(ClienteCoaConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				clientecoa.setUsuario(usuarioAux);			}
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

					if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClienteCoa!=null) { 
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClienteCoa!=null) { 
					}

					if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClienteCoa!=null) { 
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClienteCoa!=null) { 
					}

					if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteClienteCoa.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteClienteCoa.addItem(cliente);
							}
						}

						if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClienteCoa!=null) { 
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClienteCoa!=null) { 
					}

					if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormClienteCoa!=null) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormClienteCoa!=null) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormClienteCoa!=null) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormClienteCoa!=null) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteClienteCoa.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteClienteCoa.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormClienteCoa!=null) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormClienteCoa!=null) {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesClienteCoa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ClienteCoaConstantesFunciones.refrescarForeignKeysDescripcionesClienteCoa(this.clientecoaLogic.getClienteCoas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ClienteCoaConstantesFunciones.refrescarForeignKeysDescripcionesClienteCoa(this.clientecoas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//clientecoaLogic.setClienteCoas(this.clientecoas);
			clientecoaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ClienteCoaParameterReturnGeneral getClienteCoaParameterGeneral() {
		return this.clientecoaParameterGeneral;
	}
	
	public void setClienteCoaParameterGeneral(ClienteCoaParameterReturnGeneral clientecoaParameterGeneral) {
		this.clientecoaParameterGeneral = clientecoaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoClienteCoa() {
		return isPermisoTodoClienteCoa;
	}

	public void setIsPermisoTodoClienteCoa(Boolean isPermisoTodoClienteCoa) {
		this.isPermisoTodoClienteCoa = isPermisoTodoClienteCoa;
	}

	public Boolean getIsPermisoNuevoClienteCoa() {
		return isPermisoNuevoClienteCoa;
	}

	public void setIsPermisoNuevoClienteCoa(Boolean isPermisoNuevoClienteCoa) {
		this.isPermisoNuevoClienteCoa = isPermisoNuevoClienteCoa;
	}

	public Boolean getIsPermisoActualizarClienteCoa() {
		return isPermisoActualizarClienteCoa;
	}

	public void setIsPermisoActualizarClienteCoa(Boolean isPermisoActualizarClienteCoa) {
		this.isPermisoActualizarClienteCoa = isPermisoActualizarClienteCoa;
	}

	public Boolean getIsPermisoEliminarClienteCoa() {
		return isPermisoEliminarClienteCoa;
	}

	public void setIsPermisoEliminarClienteCoa(Boolean isPermisoEliminarClienteCoa) {
		this.isPermisoEliminarClienteCoa = isPermisoEliminarClienteCoa;
	}

	public Boolean getIsPermisoGuardarCambiosClienteCoa() {
		return isPermisoGuardarCambiosClienteCoa;
	}

	public void setIsPermisoGuardarCambiosClienteCoa(Boolean isPermisoGuardarCambiosClienteCoa) {
		this.isPermisoGuardarCambiosClienteCoa = isPermisoGuardarCambiosClienteCoa;
	}
	
	public Boolean getIsPermisoConsultaClienteCoa() {
		return isPermisoConsultaClienteCoa;
	}

	public void setIsPermisoConsultaClienteCoa(Boolean isPermisoConsultaClienteCoa) {
		this.isPermisoConsultaClienteCoa = isPermisoConsultaClienteCoa;
	}

	public Boolean getIsPermisoBusquedaClienteCoa() {
		return isPermisoBusquedaClienteCoa;
	}

	public void setIsPermisoBusquedaClienteCoa(Boolean isPermisoBusquedaClienteCoa) {
		this.isPermisoBusquedaClienteCoa = isPermisoBusquedaClienteCoa;
	}

	public Boolean getIsPermisoReporteClienteCoa() {
		return isPermisoReporteClienteCoa;
	}

	public void setIsPermisoReporteClienteCoa(Boolean isPermisoReporteClienteCoa) {
		this.isPermisoReporteClienteCoa = isPermisoReporteClienteCoa;
	}
	
	public Boolean getIsPermisoPaginacionMedioClienteCoa() {
		return isPermisoPaginacionMedioClienteCoa;
	}

	public void setIsPermisoPaginacionMedioClienteCoa(Boolean isPermisoPaginacionMedioClienteCoa) {
		this.isPermisoPaginacionMedioClienteCoa = isPermisoPaginacionMedioClienteCoa;
	}
	
	public Boolean getIsPermisoPaginacionTodoClienteCoa() {
		return isPermisoPaginacionTodoClienteCoa;
	}

	public void setIsPermisoPaginacionTodoClienteCoa(Boolean isPermisoPaginacionTodoClienteCoa) {
		this.isPermisoPaginacionTodoClienteCoa = isPermisoPaginacionTodoClienteCoa;
	}
	
	public Boolean getIsPermisoPaginacionAltoClienteCoa() {
		return isPermisoPaginacionAltoClienteCoa;
	}

	public void setIsPermisoPaginacionAltoClienteCoa(Boolean isPermisoPaginacionAltoClienteCoa) {
		this.isPermisoPaginacionAltoClienteCoa = isPermisoPaginacionAltoClienteCoa;
	}
	
	public Boolean getIsPermisoCopiarClienteCoa() {
		return isPermisoCopiarClienteCoa;
	}

	public void setIsPermisoCopiarClienteCoa(Boolean isPermisoCopiarClienteCoa) {
		this.isPermisoCopiarClienteCoa = isPermisoCopiarClienteCoa;
	}
	
	public Boolean getIsPermisoVerFormClienteCoa() {
		return isPermisoVerFormClienteCoa;
	}

	public void setIsPermisoVerFormClienteCoa(Boolean isPermisoVerFormClienteCoa) {
		this.isPermisoVerFormClienteCoa = isPermisoVerFormClienteCoa;
	}
	
	public Boolean getIsPermisoDuplicarClienteCoa() {
		return isPermisoDuplicarClienteCoa;
	}

	public void setIsPermisoDuplicarClienteCoa(Boolean isPermisoDuplicarClienteCoa) {
		this.isPermisoDuplicarClienteCoa = isPermisoDuplicarClienteCoa;
	}
	
	public Boolean getIsPermisoOrdenClienteCoa() {
		return isPermisoOrdenClienteCoa;
	}

	public void setIsPermisoOrdenClienteCoa(Boolean isPermisoOrdenClienteCoa) {
		this.isPermisoOrdenClienteCoa = isPermisoOrdenClienteCoa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoClienteCoa() {
		return isVisibilidadCeldaNuevoClienteCoa;
	}

	public void setIsVisibilidadCeldaNuevoClienteCoa(Boolean isVisibilidadCeldaNuevoClienteCoa) {
		this.isVisibilidadCeldaNuevoClienteCoa = isVisibilidadCeldaNuevoClienteCoa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarClienteCoa() {
		return isVisibilidadCeldaDuplicarClienteCoa;
	}

	public void setIsVisibilidadCeldaDuplicarClienteCoa(Boolean isVisibilidadCeldaDuplicarClienteCoa) {
		this.isVisibilidadCeldaDuplicarClienteCoa = isVisibilidadCeldaDuplicarClienteCoa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarClienteCoa() {
		return isVisibilidadCeldaCopiarClienteCoa;
	}

	public void setIsVisibilidadCeldaCopiarClienteCoa(Boolean isVisibilidadCeldaCopiarClienteCoa) {
		this.isVisibilidadCeldaCopiarClienteCoa = isVisibilidadCeldaCopiarClienteCoa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormClienteCoa() {
		return isVisibilidadCeldaVerFormClienteCoa;
	}

	public void setIsVisibilidadCeldaVerFormClienteCoa(Boolean isVisibilidadCeldaVerFormClienteCoa) {
		this.isVisibilidadCeldaVerFormClienteCoa = isVisibilidadCeldaVerFormClienteCoa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenClienteCoa() {
		return isVisibilidadCeldaOrdenClienteCoa;
	}

	public void setIsVisibilidadCeldaOrdenClienteCoa(Boolean isVisibilidadCeldaOrdenClienteCoa) {
		this.isVisibilidadCeldaOrdenClienteCoa = isVisibilidadCeldaOrdenClienteCoa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesClienteCoa() {
		return isVisibilidadCeldaNuevoRelacionesClienteCoa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesClienteCoa(Boolean isVisibilidadCeldaNuevoRelacionesClienteCoa) {
		this.isVisibilidadCeldaNuevoRelacionesClienteCoa = isVisibilidadCeldaNuevoRelacionesClienteCoa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarClienteCoa() {
		return isVisibilidadCeldaModificarClienteCoa;
	}

	public void setIsVisibilidadCeldaModificarClienteCoa(Boolean isVisibilidadCeldaModificarClienteCoa) {
		this.isVisibilidadCeldaModificarClienteCoa = isVisibilidadCeldaModificarClienteCoa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarClienteCoa() {
		return isVisibilidadCeldaActualizarClienteCoa;
	}

	public void setIsVisibilidadCeldaActualizarClienteCoa(Boolean isVisibilidadCeldaActualizarClienteCoa) {
		this.isVisibilidadCeldaActualizarClienteCoa = isVisibilidadCeldaActualizarClienteCoa;
	}

	public Boolean getIsVisibilidadCeldaEliminarClienteCoa() {
		return isVisibilidadCeldaEliminarClienteCoa;
	}

	public void setIsVisibilidadCeldaEliminarClienteCoa(Boolean isVisibilidadCeldaEliminarClienteCoa) {
		this.isVisibilidadCeldaEliminarClienteCoa = isVisibilidadCeldaEliminarClienteCoa;
	}

	public Boolean getIsVisibilidadCeldaCancelarClienteCoa() {
		return isVisibilidadCeldaCancelarClienteCoa;
	}

	public void setIsVisibilidadCeldaCancelarClienteCoa(Boolean isVisibilidadCeldaCancelarClienteCoa) {
		this.isVisibilidadCeldaCancelarClienteCoa = isVisibilidadCeldaCancelarClienteCoa;
	}

	public Boolean getIsVisibilidadCeldaGuardarClienteCoa() {
		return isVisibilidadCeldaGuardarClienteCoa;
	}

	public void setIsVisibilidadCeldaGuardarClienteCoa(Boolean isVisibilidadCeldaGuardarClienteCoa) {
		this.isVisibilidadCeldaGuardarClienteCoa = isVisibilidadCeldaGuardarClienteCoa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosClienteCoa() {
		return isVisibilidadCeldaGuardarCambiosClienteCoa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosClienteCoa(Boolean isVisibilidadCeldaGuardarCambiosClienteCoa) {
		this.isVisibilidadCeldaGuardarCambiosClienteCoa = isVisibilidadCeldaGuardarCambiosClienteCoa;
	}
		
	public ClienteCoaSessionBean getclientecoaSessionBean() {
		return this.clientecoaSessionBean;
	}
	
	public void setclientecoaSessionBean(ClienteCoaSessionBean clientecoaSessionBean) {
		this.clientecoaSessionBean=clientecoaSessionBean;
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

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysClienteCoa(ClienteCoa clientecoa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(clientecoa,null);
				this.setActualParaGuardarClienteForeignKey(clientecoa,null);
				this.setActualParaGuardarUsuarioForeignKey(clientecoa,null);
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
	
	public void bugActualizarReferenciaActual(ClienteCoa clientecoa,ClienteCoa clientecoaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalClienteCoa(clientecoa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		clientecoaAux.setId(clientecoa.getId());
		clientecoaAux.setVersionRow(clientecoa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessClienteCoa();
		
			int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = clientecoaValidator.getInvalidValues(this.clientecoa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			clientecoaLogic.setDatosCliente(datosCliente);
			clientecoaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				clientecoaAux=new  ClienteCoa();
				
				clientecoaAux.setIsNew(true);
				clientecoaAux.setIsChanged(true);
				
				clientecoaAux.setClienteCoaOriginal(this.clientecoa);
				
				clientecoaAux.setId(this.clientecoa.getId());	
				clientecoaAux.setVersionRow(this.clientecoa.getVersionRow());	
				clientecoaAux.setid_empresa(this.clientecoa.getid_empresa());	
				clientecoaAux.setid_cliente(this.clientecoa.getid_cliente());	
				clientecoaAux.setid_usuario(this.clientecoa.getid_usuario());	
				clientecoaAux.setautori_imprenta(this.clientecoa.getautori_imprenta());	
				clientecoaAux.setautori_usuario(this.clientecoa.getautori_usuario());	
				clientecoaAux.setnum_factura_ini(this.clientecoa.getnum_factura_ini());	
				clientecoaAux.setnum_factura_fin(this.clientecoa.getnum_factura_fin());	
				clientecoaAux.setserie_docu(this.clientecoa.getserie_docu());	
				clientecoaAux.setfecha_vali(this.clientecoa.getfecha_vali());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.clientecoaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(clientecoaAux,clientecoaLogic.getClienteCoas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clientecoaAux,clientecoas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.clientecoaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clientecoaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoaLogic.saveClienteCoas();//WithConnection
						//clientecoaLogic.getSetVersionRowClienteCoas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.clientecoa,clientecoaAux);
					
					this.refrescarForeignKeysDescripcionesClienteCoa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								clientecoaLogic.saveClienteCoaRelaciones(clientecoaAux);//WithConnection
								//clientecoaLogic.getSetVersionRowClienteCoas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.clientecoa,clientecoaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.clientecoaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(clientecoaAux,clientecoaLogic.getClienteCoas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(clientecoaAux,clientecoas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.clientecoa,clientecoaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				clientecoaAux=new  ClienteCoa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.clientecoaSessionBean.getEsGuardarRelacionado() 
					|| (this.clientecoaSessionBean.getEsGuardarRelacionado() && this.clientecoa.getId()>=0)) {
						
					clientecoaAux.setIsNew(false);
				}
				
				clientecoaAux.setIsDeleted(false);
			
				clientecoaAux.setId(this.clientecoa.getId());	
				clientecoaAux.setVersionRow(this.clientecoa.getVersionRow());	
				clientecoaAux.setid_empresa(this.clientecoa.getid_empresa());	
				clientecoaAux.setid_cliente(this.clientecoa.getid_cliente());	
				clientecoaAux.setid_usuario(this.clientecoa.getid_usuario());	
				clientecoaAux.setautori_imprenta(this.clientecoa.getautori_imprenta());	
				clientecoaAux.setautori_usuario(this.clientecoa.getautori_usuario());	
				clientecoaAux.setnum_factura_ini(this.clientecoa.getnum_factura_ini());	
				clientecoaAux.setnum_factura_fin(this.clientecoa.getnum_factura_fin());	
				clientecoaAux.setserie_docu(this.clientecoa.getserie_docu());	
				clientecoaAux.setfecha_vali(this.clientecoa.getfecha_vali());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(clientecoaAux,clientecoaLogic.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clientecoaAux,clientecoas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.clientecoaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clientecoaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoaLogic.saveClienteCoas();//WithConnection
						//clientecoaLogic.getSetVersionRowClienteCoas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.clientecoa,clientecoaAux);
					
					this.refrescarForeignKeysDescripcionesClienteCoa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								clientecoaLogic.saveClienteCoaRelaciones(clientecoaAux);//WithConnection
								//clientecoaLogic.getSetVersionRowClienteCoas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.clientecoa,clientecoaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.clientecoaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(clientecoaAux,clientecoaLogic.getClienteCoas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(clientecoaAux,clientecoas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.clientecoa,clientecoaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				clientecoaAux=new  ClienteCoa();
				
				clientecoaAux.setIsNew(false);
				clientecoaAux.setIsChanged(false);
				
				clientecoaAux.setIsDeleted(true);
				
				clientecoaAux.setId(this.clientecoa.getId());	
				clientecoaAux.setVersionRow(this.clientecoa.getVersionRow());	
				clientecoaAux.setid_empresa(this.clientecoa.getid_empresa());	
				clientecoaAux.setid_cliente(this.clientecoa.getid_cliente());	
				clientecoaAux.setid_usuario(this.clientecoa.getid_usuario());	
				clientecoaAux.setautori_imprenta(this.clientecoa.getautori_imprenta());	
				clientecoaAux.setautori_usuario(this.clientecoa.getautori_usuario());	
				clientecoaAux.setnum_factura_ini(this.clientecoa.getnum_factura_ini());	
				clientecoaAux.setnum_factura_fin(this.clientecoa.getnum_factura_fin());	
				clientecoaAux.setserie_docu(this.clientecoa.getserie_docu());	
				clientecoaAux.setfecha_vali(this.clientecoa.getfecha_vali());	
				
				if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.clientecoaAux.getId()>=0) {	
						this.clientecoasEliminados.add(clientecoaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(clientecoaAux,clientecoaLogic.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clientecoaAux,clientecoas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.clientecoaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.clientecoaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoaLogic.saveClienteCoas();//WithConnection
						//clientecoaLogic.getSetVersionRowClienteCoas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								clientecoaLogic.saveClienteCoaRelaciones(clientecoaAux);//WithConnection
								//clientecoaLogic.getSetVersionRowClienteCoas();//WithConnection
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
							if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.clientecoaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(clientecoaAux,clientecoaLogic.getClienteCoas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(clientecoaAux,clientecoas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getClienteCoas().addAll(this.clientecoasEliminados);
					
					clientecoaLogic.saveClienteCoas();//WithConnection
					//clientecoaLogic.getSetVersionRowClienteCoas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesClienteCoa();
				
				this.clientecoasEliminados= new ArrayList<ClienteCoa>();		
			}
			
			if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Coa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.clientecoa=clientecoaAux;
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
      		//this.finishProcessClienteCoa();
      	}
		
	}	
	
	public void actualizarRelaciones(ClienteCoa clientecoaLocal) throws Exception {
		
		if(this.clientecoaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ClienteCoa clientecoaLocal) throws Exception {	
		if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				clientecoaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				clientecoaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				clientecoaLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarClienteCoaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = clientecoaValidator.getInvalidValues(this.clientecoa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ClienteCoa clientecoa,List<ClienteCoa> clientecoas) throws Exception {
		try	{		
			ClienteCoaConstantesFunciones.actualizarLista(clientecoa,clientecoas,this.clientecoaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ClienteCoa clientecoa,List<ClienteCoa> clientecoas) throws Exception {
		try	{			
			ClienteCoaConstantesFunciones.actualizarSelectedLista(clientecoa,clientecoas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ClienteCoa> clientecoasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				clientecoasLocal=this.clientecoaLogic.getClienteCoas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				clientecoasLocal=this.clientecoas;
			}
			//ARCHITECTURE
		
			for(ClienteCoa clientecoaLocal:clientecoasLocal) {
				if(this.permiteMantenimiento(clientecoaLocal) && clientecoaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ClienteCoaConstantesFunciones.getClienteCoaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelid_empresaClienteCoa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelid_clienteClienteCoa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelid_usuarioClienteCoa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.AUTORIIMPRENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelautori_imprentaClienteCoa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.AUTORIUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelautori_usuarioClienteCoa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.NUMFACTURAINI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelnum_factura_iniClienteCoa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.NUMFACTURAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelnum_factura_finClienteCoa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.SERIEDOCU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelserie_docuClienteCoa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClienteCoaConstantesFunciones.FECHAVALI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelfecha_valiClienteCoa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelid_empresaClienteCoa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelid_clienteClienteCoa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelid_usuarioClienteCoa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelautori_imprentaClienteCoa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelautori_usuarioClienteCoa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelnum_factura_iniClienteCoa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelnum_factura_finClienteCoa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelserie_docuClienteCoa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClienteCoa.jLabelfecha_valiClienteCoa,"");
		
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
		this.iIdNuevoClienteCoa--;	
		
		
		this.clientecoaAux=new ClienteCoa();
		
		this.clientecoaAux.setId(this.iIdNuevoClienteCoa);
		this.clientecoaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.clientecoaLogic.getClienteCoas().add(this.clientecoaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.clientecoas.add(this.clientecoaAux);
		}
		//ARCHITECTURE
		
		this.clientecoa=this.clientecoaAux;
		
		if(ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioClienteCoa(this.clientecoa);
			this.setVariablesObjetoActualToFormularioForeignKeyClienteCoa(this.clientecoa);
		}
				
		//this.setDefaultControlesClienteCoa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyClienteCoa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyClienteCoa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyClienteCoa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClienteCoa(this.clientecoaBean,this.clientecoa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ClienteCoaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
			classes=ClienteCoaConstantesFunciones.getClassesRelationshipsOfClienteCoa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.clientecoaReturnGeneral=clientecoaLogic.procesarEventosClienteCoasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clientecoaLogic.getClienteCoas(),this.clientecoa,this.clientecoaParameterGeneral,this.isEsNuevoClienteCoa,classes);//this.clientecoaLogic.getClienteCoa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanClienteCoa(this.clientecoaReturnGeneral,this.clientecoaBean,false);
		
		if(this.clientecoaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyClienteCoa(this.clientecoaReturnGeneral.getClienteCoa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioClienteCoa(this.clientecoaReturnGeneral.getClienteCoa());
		}
		
		if(this.clientecoaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioClienteCoa(this.clientecoaReturnGeneral.getClienteCoa(),classes);//this.clientecoaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyClienteCoa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyClienteCoa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClienteCoaBeanSwingJInternalFrameAdditional.RecargarFormClienteCoa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingClienteCoa(false);
						
			if(clientecoaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteCoa();
			}
			
			this.actualizarVisualTableDatosClienteCoa();
			
			this.jTableDatosClienteCoa.setRowSelectionInterval(this.getIndiceNuevoClienteCoa(), this.getIndiceNuevoClienteCoa());
			
			this.seleccionarFilaTablaClienteCoaActual();
						
			this.actualizarEstadoCeldasBotonesClienteCoa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesClienteCoa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_imprentaClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarautori_imprentaClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_usuarioClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarautori_usuarioClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_iniClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarnum_factura_iniClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_finClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarnum_factura_finClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldserie_docuClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarserie_docuClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jDateChooserfecha_valiClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarfecha_valiClienteCoa);	
		//
		this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarid_empresaClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarid_clienteClienteCoa);//
		this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setEnabled(isHabilitar && this.clientecoaConstantesFunciones.activarid_usuarioClienteCoa);
	};
	
	public void setDefaultControlesClienteCoa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoClienteCoa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.clientecoaSessionBean.setConGuardarRelaciones(true);			
			this.clientecoaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.setVisible(true);
			
					
		} else {
			//this.clientecoaSessionBean.setConGuardarRelaciones(false);			
			this.clientecoaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoClienteCoa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
				if(clientecoaAux.getId().equals(this.iIdNuevoClienteCoa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteCoa clientecoaAux:this.clientecoas) {
				if(clientecoaAux.getId().equals(this.iIdNuevoClienteCoa)) {
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
	
	public int getIndiceActualClienteCoa(ClienteCoa clientecoa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
				if(clientecoaAux.getId().equals(clientecoa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteCoa clientecoaAux:this.clientecoas) {
				if(clientecoaAux.getId().equals(clientecoa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalClienteCoa(ClienteCoa clientecoaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
				if(clientecoaAux.getClienteCoaOriginal().getId().equals(clientecoaOriginal.getId())) {
					existe=true;
					clientecoaOriginal.setId(clientecoaAux.getId());
					clientecoaOriginal.setVersionRow(clientecoaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteCoa clientecoaAux:this.clientecoas) {
				if(clientecoaAux.getClienteCoaOriginal().getId().equals(clientecoaOriginal.getId())) {
					existe=true;
					clientecoaOriginal.setId(clientecoaAux.getId());
					clientecoaOriginal.setVersionRow(clientecoaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosClienteCoa(Boolean esParaCancelar) throws Exception {
		clientecoasAux=new ArrayList<ClienteCoa>();
		clientecoaAux=new ClienteCoa();
		
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
					if(clientecoaAux.getId()<0) {
						clientecoasAux.add(clientecoaAux);
					}		
				}
				this.iIdNuevoClienteCoa=0L;
				this.clientecoaLogic.getClienteCoas().removeAll(clientecoasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteCoa clientecoaAux:this.clientecoas) {
					if(clientecoaAux.getId()<0) {
						clientecoasAux.add(clientecoaAux);
					}		
				}
				this.iIdNuevoClienteCoa=0L;
				this.clientecoas.removeAll(clientecoasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoClienteCoa 
					&& this.clientecoaLogic.getClienteCoas().size()>0
					) {
					clientecoaAux=this.clientecoaLogic.getClienteCoas().get(this.clientecoaLogic.getClienteCoas().size() - 1);
				
					if(clientecoaAux.getId()<0) {
						this.clientecoaLogic.getClienteCoas().remove(clientecoaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoClienteCoa && this.clientecoas.size()>0) {
					clientecoaAux=this.clientecoas.get(this.clientecoas.size() - 1);
				
					if(clientecoaAux.getId()<0) {
						this.clientecoas.remove(clientecoaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoClienteCoa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(clientecoa.getId()<0) {
				this.clientecoaLogic.getClienteCoas().remove(this.clientecoa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(clientecoa.getId()<0) {
				this.clientecoas.remove(this.clientecoa);
			}
		}			
	}
	
	public void setEstadosInicialesClienteCoa(List<ClienteCoa> clientecoasAux) throws Exception {
		ClienteCoaConstantesFunciones.setEstadosInicialesClienteCoa(clientecoasAux);
	}
	
	public void setEstadosInicialesClienteCoa(ClienteCoa clientecoaAux) throws Exception {
		ClienteCoaConstantesFunciones.setEstadosInicialesClienteCoa(clientecoaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarClienteCoaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesClienteCoa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarClienteCoaActual()) {
				if(!this.isEsNuevoClienteCoa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesClienteCoa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoClienteCoa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarClienteCoaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Coa ?", "MANTENIMIENTO DE Coa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesClienteCoa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ClienteCoa clientecoa) throws Exception {
		ClienteCoaConstantesFunciones.seleccionarAsignar(this.clientecoa,clientecoa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarClienteCoa=this.isPermisoActualizarOriginalClienteCoa;
			
			
			this.seleccionarAsignar(clientecoa);
			
			

			idClienteActual=clientecoa.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClienteCoaConstantesFunciones.quitarEspaciosClienteCoa(this.clientecoa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesClienteCoa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.clientecoaSessionBean.setsFuncionBusquedaRapida(this.clientecoaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoClienteCoa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosClienteCoa(esParaCancelar);				
				this.cancelarNuevoClienteCoa(esParaCancelar);								
			}
			
			this.clientecoa=new ClienteCoa();
			
			this.inicializarClienteCoa();
			
			this.actualizarEstadoCeldasBotonesClienteCoa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarClienteCoa() throws Exception {
		try {
			ClienteCoaConstantesFunciones.inicializarClienteCoa(this.clientecoa);
			
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
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.clientecoaLogic.getClienteCoas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteClienteCoas(String sAccionBusqueda,List<ClienteCoa> clientecoasParaReportes) throws Exception {
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
					sPathReporteFinal="ClienteCoa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ClienteCoaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ClienteCoaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ClienteCoa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Coas");		
		parameters.put("busquedapor", ClienteCoaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceClienteCoa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ClienteCoaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ClienteCoaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceClienteCoa=new JRBeanArrayDataSource(ClienteCoaJInternalFrame.TraerClienteCoaBeans(clientecoasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceClienteCoa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ClienteCoaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ClienteCoaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ClienteCoaBean.TraerClienteCoaBeans(clientecoasParaReportes).toArray()));
							
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
				this.generarExcelReporteClienteCoas(sAccionBusqueda,sTipoArchivoReporte,clientecoasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalClienteCoas(sAccionBusqueda,sTipoArchivoReporte,clientecoasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoClienteCoaActionPerformed(null);
					//this.generarExcelReporteClienteCoas(sAccionBusqueda,sTipoArchivoReporte,clientecoasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalClienteCoas(sAccionBusqueda,sTipoArchivoReporte,clientecoasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesClienteCoas(sAccionBusqueda,sTipoArchivoReporte,clientecoasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesClienteCoas(sAccionBusqueda,sTipoArchivoReporte,clientecoasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteClienteCoas(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteCoa> clientecoasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientecoa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteCoas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClienteCoa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ClienteCoa clientecoa : clientecoasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ClienteCoaConstantesFunciones.generarExcelReporteDataClienteCoa("NORMAL",row,workbook,clientecoa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderClienteCoa(String sTipo,Row row,Workbook workbook) {
		
		ClienteCoaConstantesFunciones.generarExcelReporteHeaderClienteCoa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalClienteCoas(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteCoa> clientecoasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientecoa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteCoas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ClienteCoa clientecoa : clientecoasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ClienteCoaConstantesFunciones.getClienteCoaDescripcion(clientecoa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getautori_imprenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getautori_usuario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getnum_factura_ini());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getnum_factura_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_SERIEDOCU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_SERIEDOCU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getserie_docu());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClienteCoaConstantesFunciones.LABEL_FECHAVALI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_FECHAVALI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clientecoa.getfecha_vali());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesClienteCoas(String sAccionBusqueda,String sTipoArchivoReporte,List<ClienteCoa> clientecoasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ClienteCoa> clientecoasRespaldo=null;
		
		classes=ClienteCoaConstantesFunciones.getClassesRelationshipsOfClienteCoa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.clientecoaLogic.setDatosCliente(this.datosCliente);
		this.clientecoaLogic.setDatosDeep(this.datosDeep);
		this.clientecoaLogic.setIsConDeep(true);
		
		clientecoasRespaldo=this.clientecoaLogic.getClienteCoas();
		
		this.clientecoaLogic.setClienteCoas(clientecoasParaReportes);	
		this.clientecoaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		clientecoasParaReportes=this.clientecoaLogic.getClienteCoas();
		this.clientecoaLogic.setClienteCoas(clientecoasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientecoa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClienteCoas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClienteCoa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ClienteCoa clientecoa : clientecoasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderClienteCoa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ClienteCoaConstantesFunciones.generarExcelReporteDataClienteCoa("NORMAL",row,workbook,clientecoa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ClienteCoaConstantesFunciones.getClienteCoaDescripcion(clientecoa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoClienteCoa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessClienteCoa() throws Exception {		
		this.startProcessClienteCoa(true);
	}
	
	public void startProcessClienteCoa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasClienteCoa ,this.jPanelParametrosReportesClienteCoa, this.jScrollPanelDatosClienteCoa,this.jPanelPaginacionClienteCoa, this.jScrollPanelDatosEdicionClienteCoa, this.jPanelAccionesClienteCoa,this.jPanelAccionesFormularioClienteCoa,this.jmenuBarClienteCoa,this.jmenuBarDetalleClienteCoa,this.jTtoolBarClienteCoa,this.jTtoolBarDetalleClienteCoa);		
		
		final JTabbedPane jTabbedPaneBusquedasClienteCoa=this.jTabbedPaneBusquedasClienteCoa; 
		
		final JPanel jPanelParametrosReportesClienteCoa=this.jPanelParametrosReportesClienteCoa;
		//final JScrollPane jScrollPanelDatosClienteCoa=this.jScrollPanelDatosClienteCoa;
		final JTable jTableDatosClienteCoa=this.jTableDatosClienteCoa;		
		final JPanel jPanelPaginacionClienteCoa=this.jPanelPaginacionClienteCoa;
		//final JScrollPane jScrollPanelDatosEdicionClienteCoa=this.jScrollPanelDatosEdicionClienteCoa;
		final JPanel jPanelAccionesClienteCoa=this.jPanelAccionesClienteCoa;
		
		JPanel jPanelCamposAuxiliarClienteCoa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarClienteCoa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			jPanelCamposAuxiliarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jPanelCamposClienteCoa;
			jPanelAccionesFormularioAuxiliarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jPanelAccionesFormularioClienteCoa;
		}
		
		final JPanel jPanelCamposClienteCoa=jPanelCamposAuxiliarClienteCoa;
		final JPanel jPanelAccionesFormularioClienteCoa=jPanelAccionesFormularioAuxiliarClienteCoa;
		
		
		final JMenuBar jmenuBarClienteCoa=this.jmenuBarClienteCoa;
		final JToolBar jTtoolBarClienteCoa=this.jTtoolBarClienteCoa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarClienteCoa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClienteCoa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			jmenuBarDetalleAuxiliarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jmenuBarDetalleClienteCoa;
			jTtoolBarDetalleAuxiliarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jTtoolBarDetalleClienteCoa;
		}
		
		final JMenuBar jmenuBarDetalleClienteCoa=jmenuBarDetalleAuxiliarClienteCoa;
		final JToolBar jTtoolBarDetalleClienteCoa=jTtoolBarDetalleAuxiliarClienteCoa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClienteCoa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClienteCoa;
			processRunnable.jTableDatos=jTableDatosClienteCoa;
			processRunnable.jPanelCampos=jPanelCamposClienteCoa;
			processRunnable.jPanelPaginacion=jPanelPaginacionClienteCoa;
			processRunnable.jPanelAcciones=jPanelAccionesClienteCoa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClienteCoa;
			
			
			processRunnable.jmenuBar=jmenuBarClienteCoa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClienteCoa;
			processRunnable.jTtoolBar=jTtoolBarClienteCoa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClienteCoa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClienteCoa ,jPanelParametrosReportesClienteCoa,jTableDatosClienteCoa, /*jScrollPanelDatosClienteCoa,*/jPanelCamposClienteCoa,jPanelPaginacionClienteCoa, /*jScrollPanelDatosEdicionClienteCoa,*/ jPanelAccionesClienteCoa,jPanelAccionesFormularioClienteCoa,jmenuBarClienteCoa,jmenuBarDetalleClienteCoa,jTtoolBarClienteCoa,jTtoolBarDetalleClienteCoa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClienteCoa ,jPanelParametrosReportesClienteCoa, jScrollPanelDatosClienteCoa,jPanelPaginacionClienteCoa, jScrollPanelDatosEdicionClienteCoa, jPanelAccionesClienteCoa,jPanelAccionesFormularioClienteCoa,jmenuBarClienteCoa,jmenuBarDetalleClienteCoa,jTtoolBarClienteCoa,jTtoolBarDetalleClienteCoa);
						
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
	
	public void finishProcessClienteCoa() {// throws Exception 
		this.finishProcessClienteCoa(true);
	}
	
	public void finishProcessClienteCoa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasClienteCoa ,this.jPanelParametrosReportesClienteCoa, this.jScrollPanelDatosClienteCoa,this.jPanelPaginacionClienteCoa, this.jScrollPanelDatosEdicionClienteCoa, this.jPanelAccionesClienteCoa,this.jPanelAccionesFormularioClienteCoa,this.jmenuBarClienteCoa,this.jmenuBarDetalleClienteCoa,this.jTtoolBarClienteCoa,this.jTtoolBarDetalleClienteCoa);		
		
		final JTabbedPane jTabbedPaneBusquedasClienteCoa=this.jTabbedPaneBusquedasClienteCoa; 
		
		final JPanel jPanelParametrosReportesClienteCoa=this.jPanelParametrosReportesClienteCoa;
		//final JScrollPane jScrollPanelDatosClienteCoa=this.jScrollPanelDatosClienteCoa;
		final JTable jTableDatosClienteCoa=this.jTableDatosClienteCoa;		
		final JPanel jPanelPaginacionClienteCoa=this.jPanelPaginacionClienteCoa;
		//final JScrollPane jScrollPanelDatosEdicionClienteCoa=this.jScrollPanelDatosEdicionClienteCoa;
		final JPanel jPanelAccionesClienteCoa=this.jPanelAccionesClienteCoa;
		
		JPanel jPanelCamposAuxiliarClienteCoa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarClienteCoa=new JPanel();
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			jPanelCamposAuxiliarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jPanelCamposClienteCoa;
			jPanelAccionesFormularioAuxiliarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jPanelAccionesFormularioClienteCoa;
		}
		
		final JPanel jPanelCamposClienteCoa=jPanelCamposAuxiliarClienteCoa;
		final JPanel jPanelAccionesFormularioClienteCoa=jPanelAccionesFormularioAuxiliarClienteCoa;
		
		
		final JMenuBar jmenuBarClienteCoa=this.jmenuBarClienteCoa;		
		final JToolBar jTtoolBarClienteCoa=this.jTtoolBarClienteCoa;
				
		JMenuBar jmenuBarDetalleAuxiliarClienteCoa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClienteCoa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			jmenuBarDetalleAuxiliarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jmenuBarDetalleClienteCoa;
			jTtoolBarDetalleAuxiliarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jTtoolBarDetalleClienteCoa;		
		}
		
		final JMenuBar jmenuBarDetalleClienteCoa=jmenuBarDetalleAuxiliarClienteCoa;
		final JToolBar jTtoolBarDetalleClienteCoa=jTtoolBarDetalleAuxiliarClienteCoa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClienteCoa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClienteCoa;
			processRunnable.jTableDatos=jTableDatosClienteCoa;
			processRunnable.jPanelCampos=jPanelCamposClienteCoa;
			processRunnable.jPanelPaginacion=jPanelPaginacionClienteCoa;
			processRunnable.jPanelAcciones=jPanelAccionesClienteCoa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClienteCoa;
			
			
			processRunnable.jmenuBar=jmenuBarClienteCoa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClienteCoa;
			processRunnable.jTtoolBar=jTtoolBarClienteCoa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClienteCoa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasClienteCoa ,jPanelParametrosReportesClienteCoa, jTableDatosClienteCoa,/*jScrollPanelDatosClienteCoa,*/jPanelCamposClienteCoa,jPanelPaginacionClienteCoa, /*jScrollPanelDatosEdicionClienteCoa,*/ jPanelAccionesClienteCoa,jPanelAccionesFormularioClienteCoa,jmenuBarClienteCoa,jmenuBarDetalleClienteCoa,jTtoolBarClienteCoa,jTtoolBarDetalleClienteCoa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesClienteCoa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarClienteCoa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuClienteCoa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarClienteCoa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarClienteCoa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleClienteCoa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuClienteCoa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarClienteCoa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleClienteCoa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.clientecoaConstantesFunciones.getsFinalQueryClienteCoa();
		String  finalQueryPaginacionTodos=this.clientecoaConstantesFunciones.getsFinalQueryClienteCoa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ClienteCoaConstantesFunciones.getArrayColumnasGlobalesNoClienteCoa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ClienteCoaConstantesFunciones.getArrayColumnasGlobalesClienteCoa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ClienteCoaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.clientecoasEliminados= new ArrayList<ClienteCoa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessClienteCoa();
		
				///*ClienteCoaSessionBean*/this.clientecoaSessionBean=new ClienteCoaSessionBean();
			
			if(this.clientecoaSessionBean==null) {
				this.clientecoaSessionBean=new ClienteCoaSessionBean();
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
					this.iNumeroPaginacion=ClienteCoaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ClienteCoaConstantesFunciones.getClassesForeignKeysOfClienteCoa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/clientecoa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			clientecoasAux= new ArrayList<ClienteCoa>();
			
				
			clientecoaLogic.setDatosCliente(this.datosCliente);
			clientecoaLogic.setDatosDeep(this.datosDeep);
			clientecoaLogic.setIsConDeep(true);
			
			
			clientecoaLogic.getClienteCoaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					clientecoaLogic.getTodosClienteCoas(finalQueryGlobal,pagination);
					
					//clientecoaLogic.getTodosClienteCoasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(clientecoaLogic.getClienteCoas()==null|| clientecoaLogic.getClienteCoas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clientecoasAux= new ArrayList<ClienteCoa>();
							clientecoasAux.addAll(clientecoaLogic.getClienteCoas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoasAux= new ArrayList<ClienteCoa>();
							clientecoasAux.addAll(clientecoas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clientecoaLogic.getTodosClienteCoas(finalQueryGlobal+"",this.pagination);												
							
							//clientecoaLogic.getTodosClienteCoasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteClienteCoas("Todos",clientecoaLogic.getClienteCoas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							clientecoaLogic.setClienteCoas(new ArrayList<ClienteCoa>());					
							clientecoaLogic.getClienteCoas().addAll(clientecoasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoas=new ArrayList<ClienteCoa>();
							clientecoas.addAll(clientecoasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idClienteCoa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idClienteCoa=this.idActual;
				
				} else if(this.idClienteCoaActual!=null && this.idClienteCoaActual!=0L) {
					idClienteCoa=idClienteCoaActual;
				}
				
					
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndicePorId(idClienteCoa);
				
				this.clientecoas=new ArrayList<ClienteCoa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					clientecoaLogic.getEntity(idClienteCoa);
					
					//clientecoaLogic.getEntityWithConnection(idClienteCoa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientecoaLogic.setClienteCoas(new ArrayList<ClienteCoa>());
					clientecoaLogic.getClienteCoas().add(clientecoaLogic.getClienteCoa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientecoas=new ArrayList<ClienteCoa>();
					this.clientecoas.add(clientecoa);
				}
				
				if(clientecoaLogic.getClienteCoa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					clientecoaLogic.getClienteCoasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=clientecoaLogic.getClienteCoas()==null||clientecoaLogic.getClienteCoas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=clientecoas==null|| clientecoas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoasAux=new ArrayList<ClienteCoa>();
						clientecoasAux.addAll(clientecoaLogic.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoasAux=new ArrayList<ClienteCoa>();
							clientecoasAux.addAll(clientecoas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							clientecoaLogic.getClienteCoasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClienteCoas("FK_IdCliente",clientecoaLogic.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClienteCoas("FK_IdCliente",clientecoas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoaLogic.setClienteCoas(new ArrayList<ClienteCoa>());
						clientecoaLogic.getClienteCoas().addAll(clientecoasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoas=new ArrayList<ClienteCoa>();
							clientecoas.addAll(clientecoasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					clientecoaLogic.getClienteCoasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=clientecoaLogic.getClienteCoas()==null||clientecoaLogic.getClienteCoas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=clientecoas==null|| clientecoas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoasAux=new ArrayList<ClienteCoa>();
						clientecoasAux.addAll(clientecoaLogic.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoasAux=new ArrayList<ClienteCoa>();
							clientecoasAux.addAll(clientecoas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							clientecoaLogic.getClienteCoasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClienteCoas("FK_IdEmpresa",clientecoaLogic.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClienteCoas("FK_IdEmpresa",clientecoas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoaLogic.setClienteCoas(new ArrayList<ClienteCoa>());
						clientecoaLogic.getClienteCoas().addAll(clientecoasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoas=new ArrayList<ClienteCoa>();
							clientecoas.addAll(clientecoasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					clientecoaLogic.getClienteCoasFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=clientecoaLogic.getClienteCoas()==null||clientecoaLogic.getClienteCoas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=clientecoas==null|| clientecoas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoasAux=new ArrayList<ClienteCoa>();
						clientecoasAux.addAll(clientecoaLogic.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoasAux=new ArrayList<ClienteCoa>();
							clientecoasAux.addAll(clientecoas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							clientecoaLogic.getClienteCoasFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClienteCoaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClienteCoas("FK_IdUsuario",clientecoaLogic.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClienteCoas("FK_IdUsuario",clientecoas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoaLogic.setClienteCoas(new ArrayList<ClienteCoa>());
						clientecoaLogic.getClienteCoas().addAll(clientecoasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoas=new ArrayList<ClienteCoa>();
							clientecoas.addAll(clientecoasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesClienteCoa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessClienteCoa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=clientecoaLogic.getClienteCoas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clientecoas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=clientecoaLogic.getClienteCoas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clientecoas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ClienteCoa clientecoa) {
		Boolean permite=true;
		
		if(this.clientecoa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ClienteCoaConstantesFunciones.getOrderByListaClienteCoa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ClienteCoaConstantesFunciones.getOrderByListaClienteCoa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteCoa clientecoa:clientecoaLogic.getClienteCoas()) {
				if(clientecoa.getsType().equals(Constantes2.S_TOTALES)) {
					clientecoaTotales=clientecoa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteCoa clientecoa:this.clientecoas) {
				if(clientecoa.getsType().equals(Constantes2.S_TOTALES)) {
					clientecoaTotales=clientecoa;
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
			this.clientecoaAux=new ClienteCoa();
			this.clientecoaAux.setsType(Constantes2.S_TOTALES);
			this.clientecoaAux.setIsNew(false);
			this.clientecoaAux.setIsChanged(false);
			this.clientecoaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ClienteCoaConstantesFunciones.TotalizarValoresFilaClienteCoa(this.clientecoaLogic.getClienteCoas(),this.clientecoaAux);
				
				this.clientecoaLogic.getClienteCoas().add(this.clientecoaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ClienteCoaConstantesFunciones.TotalizarValoresFilaClienteCoa(this.clientecoas,this.clientecoaAux);
				
				this.clientecoas.add(this.clientecoaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		clientecoaTotales=new ClienteCoa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.clientecoaLogic.getClienteCoas().remove(clientecoaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.clientecoas.remove(clientecoaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		clientecoaTotales=new ClienteCoa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClienteCoa clientecoa:clientecoaLogic.getClienteCoas()) {
				if(clientecoa.getsType().equals(Constantes2.S_TOTALES)) {
					clientecoaTotales=clientecoa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClienteCoaConstantesFunciones.TotalizarValoresFilaClienteCoa(this.clientecoaLogic.getClienteCoas(),clientecoaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClienteCoa clientecoa:this.clientecoas) {
				if(clientecoa.getsType().equals(Constantes2.S_TOTALES)) {
					clientecoaTotales=clientecoa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClienteCoaConstantesFunciones.TotalizarValoresFilaClienteCoa(this.clientecoas,clientecoaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getClienteCoasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClienteCoasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClienteCoasFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getClienteCoasFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientecoaLogic.getClienteCoasFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClienteCoasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientecoaLogic.getClienteCoasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClienteCoasFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientecoaLogic.getClienteCoasFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosClienteCoa() {
		this.isPermisoTodoClienteCoa=false;
		this.isPermisoNuevoClienteCoa=false;
		this.isPermisoActualizarClienteCoa=false;
		this.isPermisoActualizarOriginalClienteCoa=false;
		this.isPermisoEliminarClienteCoa=false;
		this.isPermisoGuardarCambiosClienteCoa=false;
		this.isPermisoConsultaClienteCoa=false;
		this.isPermisoBusquedaClienteCoa=false;
		this.isPermisoReporteClienteCoa=false;		
		this.isPermisoOrdenClienteCoa=false;		
		this.isPermisoPaginacionMedioClienteCoa=false;		
		this.isPermisoPaginacionAltoClienteCoa=false;
		this.isPermisoPaginacionTodoClienteCoa=false;
		this.isPermisoCopiarClienteCoa=false;		
		this.isPermisoVerFormClienteCoa=false;		
		this.isPermisoDuplicarClienteCoa=false;		
		this.isPermisoOrdenClienteCoa=false;		
	}
	
	public void setPermisosUsuarioClienteCoa(Boolean isPermiso) {
		this.isPermisoTodoClienteCoa=isPermiso;
		this.isPermisoNuevoClienteCoa=isPermiso;
		this.isPermisoActualizarClienteCoa=isPermiso;
		this.isPermisoActualizarOriginalClienteCoa=isPermiso;
		this.isPermisoEliminarClienteCoa=isPermiso;
		this.isPermisoGuardarCambiosClienteCoa=isPermiso;
		this.isPermisoConsultaClienteCoa=isPermiso;
		this.isPermisoBusquedaClienteCoa=isPermiso;
		this.isPermisoReporteClienteCoa=isPermiso;
		this.isPermisoOrdenClienteCoa=isPermiso;		
		this.isPermisoPaginacionMedioClienteCoa=isPermiso;		
		this.isPermisoPaginacionAltoClienteCoa=isPermiso;		
		this.isPermisoPaginacionTodoClienteCoa=isPermiso;		
		this.isPermisoCopiarClienteCoa=isPermiso;		
		this.isPermisoVerFormClienteCoa=isPermiso;		
		this.isPermisoDuplicarClienteCoa=isPermiso;
		this.isPermisoOrdenClienteCoa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioClienteCoa(Boolean isPermiso) {
		//this.isPermisoTodoClienteCoa=isPermiso;
		this.isPermisoNuevoClienteCoa=isPermiso;
		this.isPermisoActualizarClienteCoa=isPermiso;
		this.isPermisoActualizarOriginalClienteCoa=isPermiso;
		this.isPermisoEliminarClienteCoa=isPermiso;
		this.isPermisoGuardarCambiosClienteCoa=isPermiso;
		//this.isPermisoConsultaClienteCoa=isPermiso;
		//this.isPermisoBusquedaClienteCoa=isPermiso;
		//this.isPermisoReporteClienteCoa=isPermiso;
		//this.isPermisoOrdenClienteCoa=isPermiso;		
		//this.isPermisoPaginacionMedioClienteCoa=isPermiso;		
		//this.isPermisoPaginacionAltoClienteCoa=isPermiso;		
		//this.isPermisoPaginacionTodoClienteCoa=isPermiso;		
		//this.isPermisoCopiarClienteCoa=isPermiso;		
		//this.isPermisoDuplicarClienteCoa=isPermiso;
		//this.isPermisoOrdenClienteCoa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioClienteCoaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ClienteCoaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebClienteCoa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioClienteCoaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioClienteCoaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionClienteCoaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioClienteCoaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioClienteCoa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ClienteCoaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ClienteCoaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoClienteCoa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarClienteCoa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalClienteCoa=this.isPermisoActualizarClienteCoa;
			this.isPermisoEliminarClienteCoa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosClienteCoa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaClienteCoa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaClienteCoa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoClienteCoa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteClienteCoa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClienteCoa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioClienteCoa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoClienteCoa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoClienteCoa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarClienteCoa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormClienteCoa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarClienteCoa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClienteCoa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosClienteCoa.setToolTipText(this.jTableDatosClienteCoa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioClienteCoa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioClienteCoa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ClienteCoaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ClienteCoaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioClienteCoa() throws Exception {
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
	public void inicializarCombosForeignKeyClienteCoaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyClienteCoaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ClienteCoaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyClienteCoaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyClienteCoaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ClienteCoaParameterReturnGeneral clientecoaReturnGeneral=new ClienteCoaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.clientecoaConstantesFunciones.cargarid_empresaClienteCoa)
					 || (this.esRecargarFks && this.clientecoaConstantesFunciones.cargarid_empresaClienteCoa)) {

					if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+clientecoaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.clientecoaConstantesFunciones.cargarid_clienteClienteCoa)
					 || (this.esRecargarFks && this.clientecoaConstantesFunciones.cargarid_clienteClienteCoa)) {

					if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+clientecoaSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.clientecoaConstantesFunciones.cargarid_usuarioClienteCoa)
					 || (this.esRecargarFks && this.clientecoaConstantesFunciones.cargarid_usuarioClienteCoa)) {

					if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+clientecoaSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				clientecoaReturnGeneral=clientecoaLogic.cargarCombosLoteForeignKeyClienteCoa(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=clientecoaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=clientecoaReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=clientecoaReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyClienteCoa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.clientecoaSessionBean==null) {
				this.clientecoaSessionBean=new ClienteCoaSessionBean();
			}

			if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.clientecoaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
	
	public void initActionsCombosTodosForeignKeyClienteCoa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyClienteCoa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyClienteCoa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.clientecoa.setfecha_vali(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyClienteCoa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyClienteCoa(ClienteCoa clientecoa)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(clientecoa.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyClienteCoa(ClienteCoa clientecoa,String sTipoEvento)throws Exception {	
		try {
			
			

				if(clientecoa.getCliente()!=null && !sTipoEvento.equals("id_clienteClienteCoa")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(clientecoa.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyClienteCoa()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.clientecoaConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyClienteCoa()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyClienteCoa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyClienteCoa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroClienteCoa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyClienteCoa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyClienteCoa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyClienteCoa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.getItemCount()>0) {
				this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.getItemCount()>0) {
				this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.getItemCount()>0) {
				this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ClienteCoaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ClienteCoaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ClienteCoaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.clientecoaSessionBean=new ClienteCoaSessionBean(); 
		this.clientecoaConstantesFunciones=new ClienteCoaConstantesFunciones(); 
		this.clientecoaBean=new ClienteCoa();//(this.clientecoaConstantesFunciones); 		
		this.clientecoaReturnGeneral=new ClienteCoaParameterReturnGeneral(); 
		
		this.clientecoaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clientecoaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ClienteCoaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ClienteCoaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ClienteCoaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessClienteCoa(true);
			
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
			
			this.clientecoaConstantesFunciones=new ClienteCoaConstantesFunciones(); 
			this.clientecoaBean=new ClienteCoa();//this.clientecoaConstantesFunciones); 			
			this.clientecoaReturnGeneral=new ClienteCoaParameterReturnGeneral(); 
		
			ClienteCoaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Coa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.clientecoa=new ClienteCoa();
			this.clientecoas = new ArrayList<ClienteCoa>();
			this.clientecoasAux = new ArrayList<ClienteCoa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic=new ClienteCoaLogic();
				this.clientecoaLogic.getNewConnexionToDeep("");
			}
			
			//this.clientecoaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.clientecoaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormClienteCoa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClienteCoa);	
					}
					
					if(this.jInternalFrameImportacionClienteCoa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClienteCoa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByClienteCoa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByClienteCoa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormClienteCoa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormClienteCoa);
				this.jInternalFrameDetalleFormClienteCoa.setVisible(false);
				this.jInternalFrameDetalleFormClienteCoa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClienteCoa);
					this.jInternalFrameReporteDinamicoClienteCoa.setVisible(false);
					this.jInternalFrameReporteDinamicoClienteCoa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionClienteCoa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionClienteCoa);
					this.jInternalFrameImportacionClienteCoa.setVisible(false);
					this.jInternalFrameImportacionClienteCoa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByClienteCoa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByClienteCoa);
					this.jInternalFrameOrderByClienteCoa.setVisible(false);
					this.jInternalFrameOrderByClienteCoa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idClienteCoaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ClienteCoaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.clientecoaReturnGeneral=new ClienteCoaParameterReturnGeneral();
			
			this.clientecoaParameterGeneral=new ClienteCoaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.clientecoaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ClienteCoaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClienteCoaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.clientecoaSessionBean.getEsGuardarRelacionado(),this.clientecoaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClienteCoaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.clientecoaSessionBean.getEsGuardarRelacionado(),this.clientecoaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoClienteCoa=false;
			this.isVisibilidadCeldaDuplicarClienteCoa=true;
			this.isVisibilidadCeldaCopiarClienteCoa=true;
			this.isVisibilidadCeldaVerFormClienteCoa=true;
			this.isVisibilidadCeldaOrdenClienteCoa=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
			this.isVisibilidadCeldaModificarClienteCoa=false;
			this.isVisibilidadCeldaActualizarClienteCoa=false;
			this.isVisibilidadCeldaEliminarClienteCoa=false;
			this.isVisibilidadCeldaCancelarClienteCoa=false;
			this.isVisibilidadCeldaGuardarClienteCoa=false;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesClienteCoa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosClienteCoa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioClienteCoa(false);
			
			this.setPermisosUsuarioClienteCoa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clientecoaSessionBean.getEsGuardarRelacionado() 
				|| (this.clientecoaSessionBean.getEsGuardarRelacionado() && this.clientecoaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClienteCoaClasesRelacionadas();
			}
			
			if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClienteCoaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosClienteCoa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualClienteCoa();
			}
			
			if(!this.isPermisoBusquedaClienteCoa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasClienteCoa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioClienteCoa,this.isPermisoPaginacionMedioClienteCoa,this.isPermisoPaginacionTodoClienteCoa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ClienteCoaConstantesFunciones.getTiposSeleccionarClienteCoa());
				
				this.tiposColumnasSelect=ClienteCoaConstantesFunciones.getTiposSeleccionarClienteCoa(true);
				
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
			//if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioClienteCoa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioClienteCoa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioClienteCoa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteCoa() ;
			
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
			this.usuarioLogic=new UsuarioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				clientecoaImplementable= (ClienteCoaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClienteCoaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				clientecoaImplementableHome= (ClienteCoaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClienteCoaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.clientecoas= new ArrayList<ClienteCoa>();
			this.clientecoasEliminados= new ArrayList<ClienteCoa>();
						
			this.isEsNuevoClienteCoa=false;
			this.esParaAccionDesdeFormularioClienteCoa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyClienteCoa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroClienteCoa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ClienteCoaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ClienteCoaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesClienteCoa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingClienteCoa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormClienteCoa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioClienteCoa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioClienteCoa();
			}
			
			ClienteCoaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasClienteCoa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasClienteCoa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasClienteCoa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessClienteCoa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ClienteCoa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectClienteCoa() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesClienteCoa")) {
				iIndex=this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessClienteCoa();	
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
	
	public void cargarCombosForeignKeyClienteCoa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyClienteCoa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyClienteCoa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyClienteCoaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyClienteCoa();
		
		this.cargarCombosFrameForeignKeyClienteCoa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyClienteCoa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyClienteCoa();
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
	
	public void jButtonNuevoClienteCoaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
			
			if(jTableDatosClienteCoa.getRowCount()>=1) {
				jTableDatosClienteCoa.removeRowSelectionInterval(0, jTableDatosClienteCoa.getRowCount()-1);						
			}
			
			this.isEsNuevoClienteCoa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoClienteCoa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesClienteCoa(true);			
			//this.clientecoa=new ClienteCoa();
			//this.clientecoa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteCoa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteCoa() ;
			
			if(ClienteCoaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteCoa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.clientecoa);	
			this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);				
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
			if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ClienteCoa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarClienteCoaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosClienteCoa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosClienteCoa.getSelectedRows().length;			
			}
			
			clientecoasSeleccionados=this.getClienteCoasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoClienteCoa--;			
				//ClienteCoa clientecoaAux= new ClienteCoa();			
				//clientecoaAux.setId(this.iIdNuevoClienteCoa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ClienteCoa clientecoaOrigen=new ClienteCoa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ClienteCoa clientecoaOrigen : clientecoasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							clientecoaOrigen =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							clientecoaOrigen =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaClienteCoa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.clientecoa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosClienteCoa(clientecoaOrigen,this.clientecoa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.clientecoaLogic.getClienteCoas().add(this.clientecoaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.clientecoas.add(this.clientecoaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaClienteCoa(false);
				
				this.jTableDatosClienteCoa.setRowSelectionInterval(this.getIndiceNuevoClienteCoa(), this.getIndiceNuevoClienteCoa());
				
				int iLastRow =  this.jTableDatosClienteCoa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClienteCoa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClienteCoa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteCoa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();									
		
			ClienteCoa clientecoaOrigen=new ClienteCoa();
			ClienteCoa clientecoaDestino=new ClienteCoa();
				
			clientecoasSeleccionados=this.getClienteCoasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosClienteCoa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || clientecoasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosClienteCoa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoaOrigen =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						clientecoaOrigen =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						clientecoaDestino =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						clientecoaDestino =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				clientecoaOrigen =clientecoasSeleccionados.get(0);
				clientecoaDestino =clientecoasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosClienteCoa(clientecoaOrigen,clientecoaDestino,true,false);
				
				clientecoaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(clientecoaDestino,clientecoaLogic.getClienteCoas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(clientecoaDestino,clientecoas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaClienteCoa(false);
				
				//this.jTableDatosClienteCoa.setRowSelectionInterval(this.getIndiceNuevoClienteCoa(), this.getIndiceNuevoClienteCoa());
				
				int iLastRow =  this.jTableDatosClienteCoa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClienteCoa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClienteCoa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteCoa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormClienteCoa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesClienteCoa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasClienteCoa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesClienteCoa.setVisible(!isVisible);
			this.jPanelPaginacionClienteCoa.setVisible(!isVisible);
			this.jPanelAccionesClienteCoa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameClienteCoa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoClienteCoa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionClienteCoa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByClienteCoa();
			
			this.abrirFrameOrderByClienteCoa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByClienteCoa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleClienteCoa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormClienteCoa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormClienteCoa.isMaximum()) {
					this.jInternalFrameDetalleFormClienteCoa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormClienteCoa.setSize(this.jInternalFrameDetalleFormClienteCoa.iWidthFormulario,this.jInternalFrameDetalleFormClienteCoa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormClienteCoa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormClienteCoa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormClienteCoa.isMaximum()) {
						this.jInternalFrameDetalleFormClienteCoa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormClienteCoa.jContentPaneDetalleClienteCoa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormClienteCoa.jContentPaneDetalleClienteCoa.getWidth(),ClienteCoaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormClienteCoa.jContentPaneDetalleClienteCoa.getWidth(),ClienteCoaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormClienteCoa.jContentPaneDetalleClienteCoa.getWidth(),ClienteCoaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormClienteCoa.setVisible(true);
	        this.jInternalFrameDetalleFormClienteCoa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByClienteCoa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByClienteCoa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByClienteCoa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteCoa,false,this);
				} else {
					this.jInternalFrameOrderByClienteCoa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteCoa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByClienteCoa);
				this.jInternalFrameOrderByClienteCoa.setVisible(false);
				this.jInternalFrameOrderByClienteCoa.setSelected(false);
				
				this.jInternalFrameOrderByClienteCoa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClienteCoa"));
				
				this.inicializarActualizarBindingTablaOrderByClienteCoa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionClienteCoa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionClienteCoa==null) {
				
				this.jInternalFrameImportacionClienteCoa=new ImportacionJInternalFrame(ClienteCoaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClienteCoa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionClienteCoa);
				this.jInternalFrameImportacionClienteCoa.setVisible(false);
				this.jInternalFrameImportacionClienteCoa.setSelected(false);


				this.jInternalFrameImportacionClienteCoa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClienteCoa"));
				this.jInternalFrameImportacionClienteCoa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClienteCoa"));
				this.jInternalFrameImportacionClienteCoa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClienteCoa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoClienteCoa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoClienteCoa==null) {
				this.jInternalFrameReporteDinamicoClienteCoa=new ReporteDinamicoJInternalFrame(ClienteCoaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClienteCoa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClienteCoa);
				this.jInternalFrameReporteDinamicoClienteCoa.setVisible(false);
				this.jInternalFrameReporteDinamicoClienteCoa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoClienteCoa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteCoa"));
				this.jInternalFrameReporteDinamicoClienteCoa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteCoa"));
				this.jInternalFrameReporteDinamicoClienteCoa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteCoa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteCoa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleClienteCoa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormClienteCoa);
			
	       	this.jInternalFrameDetalleFormClienteCoa.setVisible(false);
	        this.jInternalFrameDetalleFormClienteCoa.setSelected(false);
			
			//this.jInternalFrameDetalleFormClienteCoa.dispose();
			//this.jInternalFrameDetalleFormClienteCoa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoClienteCoa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoClienteCoa.setVisible(true);
	        this.jInternalFrameReporteDinamicoClienteCoa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionClienteCoa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionClienteCoa.setVisible(true);
	        this.jInternalFrameImportacionClienteCoa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByClienteCoa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByClienteCoa.setVisible(true);
	        this.jInternalFrameOrderByClienteCoa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByClienteCoa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByClienteCoa.setVisible(false);
	        this.jInternalFrameOrderByClienteCoa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoClienteCoa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoClienteCoa.setVisible(false);
	        this.jInternalFrameReporteDinamicoClienteCoa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionClienteCoa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionClienteCoa.setVisible(false);
	        this.jInternalFrameImportacionClienteCoa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarClienteCoa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarClienteCoa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesClienteCoa(true);
			//this.isEsNuevoClienteCoa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesClienteCoa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteCoa(false) ;
			
			if(clientecoaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ClienteCoaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteCoa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteCoa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaClienteCoaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarClienteCoa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesClienteCoa(true);
			//this.isEsNuevoClienteCoa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.clientecoa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesClienteCoa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesClienteCoa(false) ;
			
			if(ClienteCoaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClienteCoa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteCoa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.clientecoaConstantesFunciones.cargarid_clienteClienteCoa) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingClienteCoa(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosClienteCoa.getSelectedRow();

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
	
	public void jButtonActualizarClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesClienteCoa(false);
			
			//if(!this.isEsNuevoClienteCoa) {								
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				
			}
			
			if(this.permiteMantenimiento(this.clientecoa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoClienteCoa=true;
					this.inicializarActualizarBindingTablaClienteCoa(false);
					this.isEsNuevoClienteCoa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoClienteCoa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoClienteCoa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClienteCoa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteCoa(false);
				
				this.habilitarDeshabilitarControlesClienteCoa(false);
			
												
				
				if(ClienteCoaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleClienteCoa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoClienteCoaActionPerformed(evt,clientecoaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualClienteCoa(this.clientecoa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosClienteCoa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,clientecoaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.clientecoa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarClienteCoaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				this.clientecoa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				this.clientecoa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.clientecoa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ClienteCoaModel) this.jTableDatosClienteCoa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoClienteCoa=true;
				this.inicializarActualizarBindingTablaClienteCoa(false);
				this.isEsNuevoClienteCoa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClienteCoa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteCoa(false);
				
				this.habilitarDeshabilitarControlesClienteCoa(false);
				
				
				
				if(ClienteCoaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleClienteCoa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarClienteCoaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosClienteCoa.getRowCount()>=1) {
				jTableDatosClienteCoa.removeRowSelectionInterval(0, jTableDatosClienteCoa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesClienteCoa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaClienteCoa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClienteCoa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClienteCoa(false) ;
			
			this.isEsNuevoClienteCoa=false;
			
			if(ClienteCoaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleClienteCoa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosClienteCoaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingClienteCoa(false);
				
				//SI ES MANUAL
				if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualClienteCoa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosClienteCoaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoClienteCoa--;			
			//ClienteCoa clientecoaAux= new ClienteCoa();			
			//clientecoaAux.setId(this.iIdNuevoClienteCoa);
			
			if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaClienteCoa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
			
			this.clientecoa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.clientecoaLogic.getClienteCoas().add(this.clientecoaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.clientecoas.add(this.clientecoaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaClienteCoa(false);
			
			this.jTableDatosClienteCoa.setRowSelectionInterval(this.getIndiceNuevoClienteCoa(), this.getIndiceNuevoClienteCoa());
			
			int iLastRow =  this.jTableDatosClienteCoa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosClienteCoa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosClienteCoa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaClienteCoa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionClienteCoaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingClienteCoa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteCoa(false);
			
			//SI ES MANUAL
			if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteCoa();
			}
			
			//this.abrirFrameTreeClienteCoa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionClienteCoaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CoaS ?", "MANTENIMIENTO DE Coa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionClienteCoa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralClienteCoa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.clientecoaReturnGeneral=clientecoaLogic.procesarImportacionClienteCoasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.clientecoaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarClienteCoaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionClienteCoaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionClienteCoa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionClienteCoa.setFileImportacion(this.jInternalFrameImportacionClienteCoa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionClienteCoa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionClienteCoa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionClienteCoa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionClienteCoa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoClienteCoaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		

		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ClienteCoaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ClienteCoaBaseDesign.jrxml";
			
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
			
			this.generarReporteClienteCoas("Todos",clientecoasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClienteCoaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteCoaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteCoaConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_toriImprenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_toriImprenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_toriImprenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_toriImprenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_toriUsuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_toriUsuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_toriUsuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_toriUsuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mFacturaIni_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mFacturaIni_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mFacturaIni_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mFacturaIni_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mFacturaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mFacturaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mFacturaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mFacturaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteCoaConstantesFunciones.LABEL_SERIEDOCU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rieDocu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rieDocu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rieDocu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rieDocu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClienteCoaConstantesFunciones.LABEL_FECHAVALI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVali_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVali_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVali_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVali_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoClienteCoa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ClienteCoaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ClienteCoaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ClienteCoaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA:
					sNombreCampoCategoria="autori_imprenta";
					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO:
					sNombreCampoCategoria="autori_usuario";
					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI:
					sNombreCampoCategoria="num_factura_ini";
					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN:
					sNombreCampoCategoria="num_factura_fin";
					break;

				case ClienteCoaConstantesFunciones.LABEL_SERIEDOCU:
					sNombreCampoCategoria="serie_docu";
					break;

				case ClienteCoaConstantesFunciones.LABEL_FECHAVALI:
					sNombreCampoCategoria="fecha_vali";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ClienteCoaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ClienteCoaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ClienteCoaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA:
					sNombreCampoCategoriaValor="autori_imprenta";
					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO:
					sNombreCampoCategoriaValor="autori_usuario";
					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI:
					sNombreCampoCategoriaValor="num_factura_ini";
					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN:
					sNombreCampoCategoriaValor="num_factura_fin";
					break;

				case ClienteCoaConstantesFunciones.LABEL_SERIEDOCU:
					sNombreCampoCategoriaValor="serie_docu";
					break;

				case ClienteCoaConstantesFunciones.LABEL_FECHAVALI:
					sNombreCampoCategoriaValor="fecha_vali";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClienteCoaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ClienteCoaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ClienteCoaConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Autorizacion Imprenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"autori_imprenta");
					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Autorizacion Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"autori_usuario");
					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"num_factura_ini");
					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"num_factura_fin");
					break;

				case ClienteCoaConstantesFunciones.LABEL_SERIEDOCU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"serie_docu");
					break;

				case ClienteCoaConstantesFunciones.LABEL_FECHAVALI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Validez",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vali");
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
	
	public void jButtonGenerarExcelReporteDinamicoClienteCoaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientecoa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ClienteCoas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ClienteCoaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteCoaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteCoaConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getautori_imprenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getautori_usuario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getnum_factura_ini());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getnum_factura_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteCoaConstantesFunciones.LABEL_SERIEDOCU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_SERIEDOCU);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getserie_docu());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClienteCoaConstantesFunciones.LABEL_FECHAVALI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_FECHAVALI);
					iRow++;

					for(ClienteCoa clientecoa:clientecoasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clientecoa.getfecha_vali());
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
			//	this.getFilaCabeceraExportarExcelClienteCoa(row);				
			//	iRow++;
			//}				
			
			//for(ClienteCoa clientecoaAux:clientecoasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelClienteCoa(clientecoaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
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
				this.clientecoaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteCoa(false);
			
			//SI ES MANUAL
			if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClienteCoa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresClienteCoaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteCoa(false);
			
			//SI ES MANUAL
			if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClienteCoa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesClienteCoaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClienteCoa(false);
			
			//SI ES MANUAL
			if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClienteCoa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaClienteCoa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosClienteCoa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosClienteCoa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosClienteCoa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosClienteCoa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosClienteCoa.setMinimumSize(dimensionMinimum);
		this.jTableDatosClienteCoa.setMaximumSize(dimensionMaximum);
		this.jTableDatosClienteCoa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingClienteCoa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingClienteCoa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingClienteCoa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaClienteCoa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesClienteCoa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasClienteCoa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteCoa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesClienteCoa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualClienteCoa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaClienteCoa();
		
		this.inicializarActualizarBindingBotonesManualClienteCoa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualClienteCoa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClienteCoa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualClienteCoa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualClienteCoa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosClienteCoa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosClienteCoa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteClienteCoa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormClienteCoa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormClienteCoa.jCheckBoxPostAccionNuevoClienteCoa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormClienteCoa.jCheckBoxPostAccionSinCerrarClienteCoa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormClienteCoa.jCheckBoxPostAccionSinMensajeClienteCoa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosClienteCoa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosClienteCoa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteClienteCoa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormClienteCoa!=null) {
				this.jInternalFrameDetalleFormClienteCoa.jCheckBoxPostAccionNuevoClienteCoa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormClienteCoa.jCheckBoxPostAccionSinCerrarClienteCoa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormClienteCoa.jCheckBoxPostAccionSinMensajeClienteCoa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionClienteCoa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionClienteCoa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesClienteCoa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesClienteCoa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesClienteCoa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarClienteCoa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesClienteCoa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesClienteCoa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralClienteCoa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesClienteCoa(Boolean esInicializar) throws Exception {
		try	{	
			if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualClienteCoa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesClienteCoa() throws Exception {
		try	{
			if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualClienteCoa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClienteCoa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualClienteCoa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesClienteCoa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesClienteCoa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesClienteCoa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesClienteCoa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesClienteCoa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesClienteCoa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionClienteCoa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionClienteCoa.addItem(reporte);
			}
			
			
			if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionClienteCoa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionClienteCoa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesClienteCoa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesClienteCoa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesClienteCoa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesClienteCoa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarClienteCoa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarClienteCoa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarClienteCoa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteCoa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClienteCoa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
				this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
				this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoClienteCoa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
				
				if(this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClienteCoa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoClienteCoa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClienteCoa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClienteCoa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualClienteCoa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteClienteCoa.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteClienteCoa.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasClienteCoa(Boolean esInicializar) throws Exception {				
		if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualClienteCoa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaClienteCoa() throws Exception {
		this.inicializarActualizarBindingTablaClienteCoa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByClienteCoa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosClienteCoaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaClienteCoa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=clientecoaLogic.getClienteCoas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=clientecoas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosClienteCoa.setModel(new ClienteCoaModel(this.clientecoaLogic.getClienteCoas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosClienteCoa.setModel(new ClienteCoaModel(this.clientecoas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByClienteCoa!=null && this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByClienteCoa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO,clientecoaConstantesFunciones.resaltarSeleccionarClienteCoa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO,clientecoaConstantesFunciones.resaltarSeleccionarClienteCoa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_ID));

		if(this.clientecoaConstantesFunciones.mostraridClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.clientecoaConstantesFunciones.resaltaridClienteCoa,this.clientecoaConstantesFunciones.activaridClienteCoa,this,true,"idClienteCoa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientecoaConstantesFunciones.resaltaridClienteCoa,this.clientecoaConstantesFunciones.activaridClienteCoa,this,true,"idClienteCoa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.clientecoaConstantesFunciones.mostrarid_empresaClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.clientecoaConstantesFunciones.resaltarid_empresaClienteCoa,this,this.clientecoaConstantesFunciones.activarid_empresaClienteCoa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.clientecoaConstantesFunciones.resaltarid_empresaClienteCoa,this,this.clientecoaConstantesFunciones.activarid_empresaClienteCoa,false,"id_empresaClienteCoa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_IDCLIENTE));

		if(this.clientecoaConstantesFunciones.mostrarid_clienteClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.clientecoaConstantesFunciones.resaltarid_clienteClienteCoa,this,this.clientecoaConstantesFunciones.activarid_clienteClienteCoa));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.clientecoaConstantesFunciones.resaltarid_clienteClienteCoa,this,this.clientecoaConstantesFunciones.activarid_clienteClienteCoa,true,"id_clienteClienteCoa","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_IDUSUARIO));

		if(this.clientecoaConstantesFunciones.mostrarid_usuarioClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.clientecoaConstantesFunciones.resaltarid_usuarioClienteCoa,this,this.clientecoaConstantesFunciones.activarid_usuarioClienteCoa));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.clientecoaConstantesFunciones.resaltarid_usuarioClienteCoa,this,this.clientecoaConstantesFunciones.activarid_usuarioClienteCoa,false,"id_usuarioClienteCoa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA));

		if(this.clientecoaConstantesFunciones.mostrarautori_imprentaClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clientecoaConstantesFunciones.resaltarautori_imprentaClienteCoa,this.clientecoaConstantesFunciones.activarautori_imprentaClienteCoa,this,true,"autori_imprentaClienteCoa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientecoaConstantesFunciones.resaltarautori_imprentaClienteCoa,this.clientecoaConstantesFunciones.activarautori_imprentaClienteCoa,this,true,"autori_imprentaClienteCoa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO));

		if(this.clientecoaConstantesFunciones.mostrarautori_usuarioClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clientecoaConstantesFunciones.resaltarautori_usuarioClienteCoa,this.clientecoaConstantesFunciones.activarautori_usuarioClienteCoa,this,true,"autori_usuarioClienteCoa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientecoaConstantesFunciones.resaltarautori_usuarioClienteCoa,this.clientecoaConstantesFunciones.activarautori_usuarioClienteCoa,this,true,"autori_usuarioClienteCoa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI));

		if(this.clientecoaConstantesFunciones.mostrarnum_factura_iniClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clientecoaConstantesFunciones.resaltarnum_factura_iniClienteCoa,this.clientecoaConstantesFunciones.activarnum_factura_iniClienteCoa,this,true,"num_factura_iniClienteCoa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientecoaConstantesFunciones.resaltarnum_factura_iniClienteCoa,this.clientecoaConstantesFunciones.activarnum_factura_iniClienteCoa,this,true,"num_factura_iniClienteCoa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN));

		if(this.clientecoaConstantesFunciones.mostrarnum_factura_finClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clientecoaConstantesFunciones.resaltarnum_factura_finClienteCoa,this.clientecoaConstantesFunciones.activarnum_factura_finClienteCoa,this,true,"num_factura_finClienteCoa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientecoaConstantesFunciones.resaltarnum_factura_finClienteCoa,this.clientecoaConstantesFunciones.activarnum_factura_finClienteCoa,this,true,"num_factura_finClienteCoa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_SERIEDOCU));

		if(this.clientecoaConstantesFunciones.mostrarserie_docuClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_SERIEDOCU,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.clientecoaConstantesFunciones.resaltarserie_docuClienteCoa,this.clientecoaConstantesFunciones.activarserie_docuClienteCoa,this,true,"serie_docuClienteCoa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.clientecoaConstantesFunciones.resaltarserie_docuClienteCoa,this.clientecoaConstantesFunciones.activarserie_docuClienteCoa,this,true,"serie_docuClienteCoa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,ClienteCoaConstantesFunciones.LABEL_FECHAVALI));

		if(this.clientecoaConstantesFunciones.mostrarfecha_valiClienteCoa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClienteCoaConstantesFunciones.LABEL_FECHAVALI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.clientecoaConstantesFunciones.resaltarfecha_valiClienteCoa,this.clientecoaConstantesFunciones.activarfecha_valiClienteCoa,this,true,"fecha_valiClienteCoa","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.clientecoaConstantesFunciones.resaltarfecha_valiClienteCoa,this.clientecoaConstantesFunciones.activarfecha_valiClienteCoa,this,true,"fecha_valiClienteCoa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ClienteCoaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.clientecoaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.clientecoaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClienteCoa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.clientecoaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.clientecoaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClienteCoa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarClienteCoa && this.isPermisoGuardarCambiosClienteCoa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.clientecoaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.clientecoaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosClienteCoa.addColumn(tableColumn);
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
			
			this.jTableDatosClienteCoa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClienteCoa && this.isPermisoGuardarCambiosClienteCoa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClienteCoa && this.isPermisoGuardarCambiosClienteCoa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosClienteCoa.moveColumn(this.jTableDatosClienteCoa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosClienteCoa.moveColumn(this.jTableDatosClienteCoa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosClienteCoa.moveColumn(this.jTableDatosClienteCoa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosClienteCoa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosClienteCoa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosClienteCoa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosClienteCoa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosClienteCoa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosClienteCoa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosClienteCoa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosClienteCoa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=clientecoaLogic.getClienteCoas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=clientecoas.size()-1;
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
		//this.jTableDatosClienteCoa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosClienteCoa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosClienteCoa();
			
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
				
				//this.isEsNuevoClienteCoa=false;
					
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
				if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormClienteCoa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClienteCoa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClienteCoa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.clientecoa.getsType().equals("DUPLICADO")
				   || this.clientecoa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoClienteCoa=true;
				
				} else {
					this.isEsNuevoClienteCoa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
					if(this.clientecoa.getId()>=0 && !this.clientecoa.getIsNew()) {						
						this.isEsNuevoClienteCoa=false;
						
					} else {
						this.isEsNuevoClienteCoa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoClienteCoa(esRelaciones);						
				
				this.seleccionarClienteCoa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.clientecoa.getId()<0) {
					this.isEsNuevoClienteCoa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarClienteCoa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarClienteCoa(evt,rowIndex);
				}	
				
				if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ClienteCoa: " + this.dDif); 
					}
				}								
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarClienteCoa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.clientecoa)) {
					if(this.clientecoa.getId()>0) {
						this.clientecoa.setIsDeleted(true);
						
						this.clientecoasEliminados.add(this.clientecoa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.clientecoaLogic.getClienteCoas().remove(this.clientecoa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.clientecoas.remove(this.clientecoa);				
					}
					
					
					((ClienteCoaModel) this.jTableDatosClienteCoa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaClienteCoa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarClienteCoa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoClienteCoa) {
			
			if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClienteCoa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClienteCoa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioClienteCoa(this.clientecoa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.clientecoaConstantesFunciones.cargarid_empresaClienteCoa || this.clientecoaConstantesFunciones.event_dependid_empresaClienteCoa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.clientecoa.getid_empresa());
									//this.inicializarActualizarBindingClienteCoa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(clientecoa.getEmpresa()!=null) {
							this.empresasForeignKey.add(clientecoa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.clientecoa.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.clientecoaConstantesFunciones.cargarid_clienteClienteCoa || this.clientecoaConstantesFunciones.event_dependid_clienteClienteCoa) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.clientecoa.getid_cliente());
									//this.inicializarActualizarBindingClienteCoa(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(clientecoa.getCliente()!=null) {
							this.clientesForeignKey.add(clientecoa.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.clientecoa.getid_cliente(),false,"Formulario");

					//Usuario
					if(!this.clientecoaConstantesFunciones.cargarid_usuarioClienteCoa || this.clientecoaConstantesFunciones.event_dependid_usuarioClienteCoa) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.clientecoa.getid_usuario());
									//this.inicializarActualizarBindingClienteCoa(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(clientecoa.getUsuario()!=null) {
							this.usuariosForeignKey.add(clientecoa.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.clientecoa.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesClienteCoa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesClienteCoa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClienteCoa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoClienteCoa(ClienteCoa clientecoa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoClienteCoa(clientecoa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoClienteCoa(ClienteCoa clientecoa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioClienteCoa(clientecoa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyClienteCoa(clientecoa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyClienteCoa(clientecoa);
	}
	
	public void setVariablesObjetoActualToFormularioClienteCoa(ClienteCoa clientecoa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.setText(clientecoa.getId().toString());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_imprentaClienteCoa.setText(clientecoa.getautori_imprenta());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_usuarioClienteCoa.setText(clientecoa.getautori_usuario());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_iniClienteCoa.setText(clientecoa.getnum_factura_ini());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_finClienteCoa.setText(clientecoa.getnum_factura_fin());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldserie_docuClienteCoa.setText(clientecoa.getserie_docu());
			this.jInternalFrameDetalleFormClienteCoa.jDateChooserfecha_valiClienteCoa.setDate(clientecoa.getfecha_vali());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ClienteCoa clientecoaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,clientecoaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ClienteCoa clientecoaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				clientecoaLocal=this.clientecoa;
			} else {
				clientecoaLocal=this.clientecoaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(clientecoaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoClienteCoa(clientecoaLocal,true);
					
					if(clientecoaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(clientecoaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(clientecoaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoClienteCoa(ClienteCoa clientecoa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClienteCoa(clientecoa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(clientecoa);
	}
	
	public void setVariablesFormularioToObjetoActualClienteCoa(ClienteCoa clientecoa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClienteCoa(clientecoa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualClienteCoa(ClienteCoa clientecoa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.getText()==null || this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.getText()=="" || this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.getText()=="Id") {
				this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.setText("0");
			}

			if(conColumnasBase) {clientecoa.setId(Long.parseLong(this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteCoaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelIdClienteCoa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clientecoa.setautori_imprenta(this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_imprentaClienteCoa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelautori_imprentaClienteCoa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clientecoa.setautori_usuario(this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_usuarioClienteCoa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelautori_usuarioClienteCoa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clientecoa.setnum_factura_ini(this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_iniClienteCoa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelnum_factura_iniClienteCoa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clientecoa.setnum_factura_fin(this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_finClienteCoa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelnum_factura_finClienteCoa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clientecoa.setserie_docu(this.jInternalFrameDetalleFormClienteCoa.jTextFieldserie_docuClienteCoa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteCoaConstantesFunciones.LABEL_SERIEDOCU+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelserie_docuClienteCoa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clientecoa.setfecha_vali(this.jInternalFrameDetalleFormClienteCoa.jDateChooserfecha_valiClienteCoa.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClienteCoaConstantesFunciones.LABEL_FECHAVALI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClienteCoa.jLabelfecha_valiClienteCoa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClienteCoa(ClienteCoa clientecoaBean,ClienteCoa clientecoa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && clientecoaBean.getid_cliente()!=null && !clientecoaBean.getid_cliente().equals(-1L))) {clientecoa.setid_cliente(clientecoaBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosClienteCoa(ClienteCoa clientecoaOrigen,ClienteCoa clientecoa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && clientecoaOrigen.getId()!=null && !clientecoaOrigen.getId().equals(0L))) {clientecoa.setId(clientecoaOrigen.getId());}}
			if(conDefault || (!conDefault && clientecoaOrigen.getid_cliente()!=null && !clientecoaOrigen.getid_cliente().equals(-1L))) {clientecoa.setid_cliente(clientecoaOrigen.getid_cliente());}
			if(conDefault || (!conDefault && clientecoaOrigen.getautori_imprenta()!=null && !clientecoaOrigen.getautori_imprenta().equals(""))) {clientecoa.setautori_imprenta(clientecoaOrigen.getautori_imprenta());}
			if(conDefault || (!conDefault && clientecoaOrigen.getautori_usuario()!=null && !clientecoaOrigen.getautori_usuario().equals(""))) {clientecoa.setautori_usuario(clientecoaOrigen.getautori_usuario());}
			if(conDefault || (!conDefault && clientecoaOrigen.getnum_factura_ini()!=null && !clientecoaOrigen.getnum_factura_ini().equals(""))) {clientecoa.setnum_factura_ini(clientecoaOrigen.getnum_factura_ini());}
			if(conDefault || (!conDefault && clientecoaOrigen.getnum_factura_fin()!=null && !clientecoaOrigen.getnum_factura_fin().equals(""))) {clientecoa.setnum_factura_fin(clientecoaOrigen.getnum_factura_fin());}
			if(conDefault || (!conDefault && clientecoaOrigen.getserie_docu()!=null && !clientecoaOrigen.getserie_docu().equals(""))) {clientecoa.setserie_docu(clientecoaOrigen.getserie_docu());}
			if(conDefault || (!conDefault && clientecoaOrigen.getfecha_vali()!=null && !clientecoaOrigen.getfecha_vali().equals(new Date()))) {clientecoa.setfecha_vali(clientecoaOrigen.getfecha_vali());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClienteCoa(ClienteCoa clientecoa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.setText(clientecoa.getId().toString());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_imprentaClienteCoa.setText(clientecoa.getautori_imprenta());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_usuarioClienteCoa.setText(clientecoa.getautori_usuario());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_iniClienteCoa.setText(clientecoa.getnum_factura_ini());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_finClienteCoa.setText(clientecoa.getnum_factura_fin());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldserie_docuClienteCoa.setText(clientecoa.getserie_docu());
			this.jInternalFrameDetalleFormClienteCoa.jDateChooserfecha_valiClienteCoa.setDate(clientecoa.getfecha_vali());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClienteCoa(ClienteCoaBean clientecoaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.setText(clientecoaBean.getId().toString());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_imprentaClienteCoa.setText(clientecoaBean.getautori_imprenta());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_usuarioClienteCoa.setText(clientecoaBean.getautori_usuario());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_iniClienteCoa.setText(clientecoaBean.getnum_factura_ini());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_finClienteCoa.setText(clientecoaBean.getnum_factura_fin());
			this.jInternalFrameDetalleFormClienteCoa.jTextFieldserie_docuClienteCoa.setText(clientecoaBean.getserie_docu());
			this.jInternalFrameDetalleFormClienteCoa.jDateChooserfecha_valiClienteCoa.setDate(clientecoaBean.getfecha_vali());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanClienteCoa(ClienteCoaParameterReturnGeneral clientecoaReturnGeneral,ClienteCoaBean clientecoaBean,Boolean conDefault) throws Exception { 
		try {
			ClienteCoa clientecoaLocal=new ClienteCoa();
			
			clientecoaLocal=clientecoaReturnGeneral.getClienteCoa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && clientecoaLocal.getId()!=null && !clientecoaLocal.getId().equals(0L))) {clientecoaBean.setId(clientecoaLocal.getId());}}
			if(conDefault || (!conDefault && clientecoaLocal.getid_cliente()!=null && !clientecoaLocal.getid_cliente().equals(-1L))) {clientecoaBean.setid_cliente(clientecoaLocal.getid_cliente());}
			if(conDefault || (!conDefault && clientecoaLocal.getautori_imprenta()!=null && !clientecoaLocal.getautori_imprenta().equals(""))) {clientecoaBean.setautori_imprenta(clientecoaLocal.getautori_imprenta());}
			if(conDefault || (!conDefault && clientecoaLocal.getautori_usuario()!=null && !clientecoaLocal.getautori_usuario().equals(""))) {clientecoaBean.setautori_usuario(clientecoaLocal.getautori_usuario());}
			if(conDefault || (!conDefault && clientecoaLocal.getnum_factura_ini()!=null && !clientecoaLocal.getnum_factura_ini().equals(""))) {clientecoaBean.setnum_factura_ini(clientecoaLocal.getnum_factura_ini());}
			if(conDefault || (!conDefault && clientecoaLocal.getnum_factura_fin()!=null && !clientecoaLocal.getnum_factura_fin().equals(""))) {clientecoaBean.setnum_factura_fin(clientecoaLocal.getnum_factura_fin());}
			if(conDefault || (!conDefault && clientecoaLocal.getserie_docu()!=null && !clientecoaLocal.getserie_docu().equals(""))) {clientecoaBean.setserie_docu(clientecoaLocal.getserie_docu());}
			if(conDefault || (!conDefault && clientecoaLocal.getfecha_vali()!=null && !clientecoaLocal.getfecha_vali().equals(new Date()))) {clientecoaBean.setfecha_vali(clientecoaLocal.getfecha_vali());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxClienteCoaGenerico(Long idClienteCoaSeleccionado,JComboBox jComboBoxClienteCoa,List<ClienteCoa> clientecoasLocal)throws Exception {
		try {
			ClienteCoa  clientecoaTemp=null;

			for(ClienteCoa clientecoaAux:clientecoasLocal) {
				if(clientecoaAux.getId()!=null && clientecoaAux.getId().equals(idClienteCoaSeleccionado)) {
					clientecoaTemp=clientecoaAux;
					break;
				}
			}

			jComboBoxClienteCoa.setSelectedItem(clientecoaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxClienteCoaGenerico(JComboBox jComboBoxClienteCoa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClienteCoa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxClienteCoa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClienteCoa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxClienteCoa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clientecoa=(ClienteCoa) clientecoaLogic.getClienteCoas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			clientecoa =(ClienteCoa) clientecoas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!clientecoa.getIsNew() && !clientecoa.getIsChanged() && !clientecoa.getIsDeleted()) {
				sDescripcion=clientecoa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=clientecoa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!clientecoa.getIsNew() && !clientecoa.getIsChanged() && !clientecoa.getIsDeleted()) {
				sDescripcion=clientecoa.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=clientecoa.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!clientecoa.getIsNew() && !clientecoa.getIsChanged() && !clientecoa.getIsDeleted()) {
				sDescripcion=clientecoa.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=clientecoa.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ClienteCoa clientecoaRow=new ClienteCoa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clientecoaRow=(ClienteCoa) clientecoaLogic.getClienteCoas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			clientecoaRow=(ClienteCoa) clientecoas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualClienteCoa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoClienteCoa.setVisible((this.isVisibilidadCeldaNuevoClienteCoa && this.isPermisoNuevoClienteCoa));			
			this.jButtonDuplicarClienteCoa.setVisible((this.isVisibilidadCeldaDuplicarClienteCoa && this.isPermisoDuplicarClienteCoa));			
			this.jButtonCopiarClienteCoa.setVisible((this.isVisibilidadCeldaCopiarClienteCoa && this.isPermisoCopiarClienteCoa));
			this.jButtonVerFormClienteCoa.setVisible((this.isVisibilidadCeldaVerFormClienteCoa && this.isPermisoVerFormClienteCoa));
			
			this.jButtonAbrirOrderByClienteCoa.setVisible((this.isVisibilidadCeldaOrdenClienteCoa && this.isPermisoOrdenClienteCoa));			
			
			this.jButtonNuevoRelacionesClienteCoa.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteCoa && this.isPermisoNuevoClienteCoa));			
			this.jButtonNuevoGuardarCambiosClienteCoa.setVisible((this.isVisibilidadCeldaNuevoClienteCoa && this.isPermisoNuevoClienteCoa && this.isPermisoGuardarCambiosClienteCoa));
			
			if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonModificarClienteCoa.setVisible((this.isVisibilidadCeldaModificarClienteCoa && this.isPermisoActualizarClienteCoa));	
			this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarClienteCoa.setVisible((this.isVisibilidadCeldaActualizarClienteCoa && this.isPermisoActualizarClienteCoa));	
			this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarClienteCoa.setVisible((this.isVisibilidadCeldaEliminarClienteCoa && this.isPermisoEliminarClienteCoa));
			this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarClienteCoa.setVisible(this.isVisibilidadCeldaCancelarClienteCoa);							
			this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosClienteCoa.setVisible((this.isVisibilidadCeldaGuardarClienteCoa && this.isPermisoGuardarCambiosClienteCoa));			
			
			}
						
			this.jButtonGuardarCambiosTablaClienteCoa.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteCoa && this.isPermisoGuardarCambiosClienteCoa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarClienteCoa.setVisible((this.isVisibilidadCeldaNuevoClienteCoa && this.isPermisoNuevoClienteCoa));						
			this.jButtonDuplicarToolBarClienteCoa.setVisible((this.isVisibilidadCeldaDuplicarClienteCoa && this.isPermisoDuplicarClienteCoa));						
			this.jButtonCopiarToolBarClienteCoa.setVisible((this.isVisibilidadCeldaCopiarClienteCoa && this.isPermisoCopiarClienteCoa));			
			this.jButtonVerFormToolBarClienteCoa.setVisible((this.isVisibilidadCeldaVerFormClienteCoa && this.isPermisoVerFormClienteCoa));			
			this.jButtonAbrirOrderByToolBarClienteCoa.setVisible((this.isVisibilidadCeldaOrdenClienteCoa && this.isPermisoOrdenClienteCoa));
			this.jButtonNuevoRelacionesToolBarClienteCoa.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteCoa && this.isPermisoNuevoClienteCoa));			
			this.jButtonNuevoGuardarCambiosToolBarClienteCoa.setVisible((this.isVisibilidadCeldaNuevoClienteCoa && this.isPermisoNuevoClienteCoa && this.isPermisoGuardarCambiosClienteCoa));			
			
			if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonModificarToolBarClienteCoa.setVisible((this.isVisibilidadCeldaModificarClienteCoa && this.isPermisoActualizarClienteCoa));	
			this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarToolBarClienteCoa.setVisible((this.isVisibilidadCeldaActualizarClienteCoa  && this.isPermisoActualizarClienteCoa));	
			this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarToolBarClienteCoa.setVisible((this.isVisibilidadCeldaEliminarClienteCoa && this.isPermisoEliminarClienteCoa));
			this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarToolBarClienteCoa.setVisible(this.isVisibilidadCeldaCancelarClienteCoa);				
			this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosToolBarClienteCoa.setVisible((this.isVisibilidadCeldaGuardarClienteCoa && this.isPermisoGuardarCambiosClienteCoa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarClienteCoa.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteCoa && this.isPermisoGuardarCambiosClienteCoa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoClienteCoa.setVisible((this.isVisibilidadCeldaNuevoClienteCoa && this.isPermisoNuevoClienteCoa));			
			this.jMenuItemDuplicarClienteCoa.setVisible((this.isVisibilidadCeldaDuplicarClienteCoa && this.isPermisoDuplicarClienteCoa));			
			this.jMenuItemCopiarClienteCoa.setVisible((this.isVisibilidadCeldaCopiarClienteCoa && this.isPermisoCopiarClienteCoa));			
			this.jMenuItemVerFormClienteCoa.setVisible((this.isVisibilidadCeldaVerFormClienteCoa && this.isPermisoVerFormClienteCoa));			
			this.jMenuItemAbrirOrderByClienteCoa.setVisible((this.isVisibilidadCeldaOrdenClienteCoa && this.isPermisoOrdenClienteCoa));			
			//this.jMenuItemMostrarOcultarClienteCoa.setVisible((this.isVisibilidadCeldaOrdenClienteCoa && this.isPermisoOrdenClienteCoa));
			this.jMenuItemDetalleAbrirOrderByClienteCoa.setVisible((this.isVisibilidadCeldaOrdenClienteCoa && this.isPermisoOrdenClienteCoa));			
			//this.jMenuItemDetalleMostrarOcultarClienteCoa.setVisible((this.isVisibilidadCeldaOrdenClienteCoa && this.isPermisoOrdenClienteCoa));			
			this.jMenuItemNuevoRelacionesClienteCoa.setVisible((this.isVisibilidadCeldaNuevoRelacionesClienteCoa && this.isPermisoNuevoClienteCoa));			
			this.jMenuItemNuevoGuardarCambiosClienteCoa.setVisible((this.isVisibilidadCeldaNuevoClienteCoa && this.isPermisoNuevoClienteCoa && this.isPermisoGuardarCambiosClienteCoa));									
			
			if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemModificarClienteCoa.setVisible((this.isVisibilidadCeldaModificarClienteCoa && this.isPermisoActualizarClienteCoa));	
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemActualizarClienteCoa.setVisible((this.isVisibilidadCeldaActualizarClienteCoa && this.isPermisoActualizarClienteCoa));	
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemEliminarClienteCoa.setVisible((this.isVisibilidadCeldaEliminarClienteCoa && this.isPermisoEliminarClienteCoa));
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemCancelarClienteCoa.setVisible(this.isVisibilidadCeldaCancelarClienteCoa);				
			}
			
			this.jMenuItemGuardarCambiosClienteCoa.setVisible((this.isVisibilidadCeldaGuardarClienteCoa && this.isPermisoGuardarCambiosClienteCoa));						
			this.jMenuItemGuardarCambiosTablaClienteCoa.setVisible((this.isVisibilidadCeldaGuardarCambiosClienteCoa && this.isPermisoGuardarCambiosClienteCoa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoClienteCoa=this.jButtonNuevoClienteCoa.isVisible();
			this.isVisibilidadCeldaDuplicarClienteCoa=this.jButtonDuplicarClienteCoa.isVisible();
			this.isVisibilidadCeldaCopiarClienteCoa=this.jButtonCopiarClienteCoa.isVisible();
			this.isVisibilidadCeldaVerFormClienteCoa=this.jButtonVerFormClienteCoa.isVisible();
			
			this.isVisibilidadCeldaOrdenClienteCoa=this.jButtonAbrirOrderByClienteCoa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=this.jButtonNuevoRelacionesClienteCoa.isVisible();
			this.isVisibilidadCeldaModificarClienteCoa=this.jButtonModificarClienteCoa.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			this.isVisibilidadCeldaActualizarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarClienteCoa.isVisible();
			this.isVisibilidadCeldaEliminarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarClienteCoa.isVisible();
			this.isVisibilidadCeldaCancelarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarClienteCoa.isVisible();
			this.isVisibilidadCeldaGuardarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosClienteCoa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=this.jButtonGuardarCambiosTablaClienteCoa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoClienteCoa=this.jButtonNuevoToolBarClienteCoa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=this.jButtonNuevoRelacionesToolBarClienteCoa.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			this.isVisibilidadCeldaModificarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jButtonModificarToolBarClienteCoa.isVisible();
			this.isVisibilidadCeldaActualizarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarToolBarClienteCoa.isVisible();
			this.isVisibilidadCeldaEliminarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarToolBarClienteCoa.isVisible();
			this.isVisibilidadCeldaCancelarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarToolBarClienteCoa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClienteCoa=this.jButtonGuardarCambiosToolBarClienteCoa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=this.jButtonGuardarCambiosTablaToolBarClienteCoa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoClienteCoa=this.jMenuItemNuevoClienteCoa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=this.jMenuItemNuevoRelacionesClienteCoa.isVisible();
			
			if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			this.isVisibilidadCeldaModificarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jMenuItemModificarClienteCoa.isVisible();
			this.isVisibilidadCeldaActualizarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jMenuItemActualizarClienteCoa.isVisible();
			this.isVisibilidadCeldaEliminarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jMenuItemEliminarClienteCoa.isVisible();
			this.isVisibilidadCeldaCancelarClienteCoa=this.jInternalFrameDetalleFormClienteCoa.jMenuItemCancelarClienteCoa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClienteCoa=this.jMenuItemGuardarCambiosClienteCoa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=this.jMenuItemGuardarCambiosTablaClienteCoa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesClienteCoa(Boolean esInicializar) {
		if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
				//if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesClienteCoa();
			}
			
			this.inicializarActualizarBindingBotonesManualClienteCoa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualClienteCoa() {
		this.jButtonNuevoClienteCoa.setVisible(this.isPermisoNuevoClienteCoa);			
		this.jButtonDuplicarClienteCoa.setVisible(this.isPermisoDuplicarClienteCoa);			
		this.jButtonCopiarClienteCoa.setVisible(this.isPermisoCopiarClienteCoa);			
		this.jButtonVerFormClienteCoa.setVisible(this.isPermisoVerFormClienteCoa);			
		
		this.jButtonAbrirOrderByClienteCoa.setVisible(this.isPermisoOrdenClienteCoa);					
		
		this.jButtonNuevoRelacionesClienteCoa.setVisible(this.isPermisoNuevoClienteCoa);			
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonModificarClienteCoa.setVisible(this.isPermisoActualizarClienteCoa);	
			this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarClienteCoa.setVisible(this.isPermisoActualizarClienteCoa);	
			this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarClienteCoa.setVisible(this.isPermisoEliminarClienteCoa);
			this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarClienteCoa.setVisible(this.isVisibilidadCeldaCancelarClienteCoa);						
			this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosClienteCoa.setVisible(this.isPermisoGuardarCambiosClienteCoa);							
		}
		
		this.jButtonGuardarCambiosTablaClienteCoa.setVisible(this.isPermisoActualizarClienteCoa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleClienteCoa() {
		this.jInternalFrameDetalleFormClienteCoa.jButtonModificarClienteCoa.setVisible(this.isPermisoActualizarClienteCoa);	
		this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarClienteCoa.setVisible(this.isPermisoActualizarClienteCoa);	
		this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarClienteCoa.setVisible(this.isPermisoEliminarClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarClienteCoa.setVisible(this.isVisibilidadCeldaCancelarClienteCoa);							
		this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosClienteCoa.setVisible((this.isVisibilidadCeldaGuardarClienteCoa && this.isPermisoGuardarCambiosClienteCoa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosClienteCoa() {
		if(ClienteCoaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualClienteCoa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesClienteCoa() {
	}
	
	public void jTableDatosClienteCoaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarClienteCoa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.clientecoa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaClienteCoaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebClienteCoa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClienteCoa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClienteCoa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.clientecoaLogic.getConnexion());

				if(this.clientecoa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.clientecoa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClienteCoa=(TitledBorder)this.jScrollPanelDatosClienteCoa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderClienteCoa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.clientecoa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteClienteCoaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderClienteCoa=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosClienteCoa.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderClienteCoa=(TitledBorder)this.jScrollPanelDatosClienteCoa.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderClienteCoa.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteClienteCoaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebClienteCoa(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClienteCoa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClienteCoa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.clientecoaLogic.getConnexion());

				if(this.clientecoa.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.clientecoa.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClienteCoa=(TitledBorder)this.jScrollPanelDatosClienteCoa.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderClienteCoa.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.clientecoa.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioClienteCoaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebClienteCoa(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClienteCoa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClienteCoa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.clientecoaLogic.getConnexion());

				if(this.clientecoa.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.clientecoa.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClienteCoa=(TitledBorder)this.jScrollPanelDatosClienteCoa.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderClienteCoa.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.clientecoa.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonautori_imprentaClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getautori_imprenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where autori_imprenta like '%"+this.clientecoa.getautori_imprenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonautori_usuarioClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getautori_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where autori_usuario like '%"+this.clientecoa.getautori_usuario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnum_factura_iniClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getnum_factura_ini()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where num_factura_ini like '%"+this.clientecoa.getnum_factura_ini()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnum_factura_finClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getnum_factura_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where num_factura_fin like '%"+this.clientecoa.getnum_factura_fin()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonserie_docuClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getserie_docu()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where serie_docu like '%"+this.clientecoa.getserie_docu()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_valiClienteCoaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.getclientecoa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clientecoa==null) {
						this.clientecoa = new ClienteCoa();
					}

					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);
				}

				if(this.clientecoa.getfecha_vali()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vali = '"+Funciones2.getStringPostgresDate(this.clientecoa.getfecha_vali())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClienteCoa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteClienteCoaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClienteCoa(false,false);

			this.getClienteCoasFK_IdCliente();

			this.inicializarActualizarBindingClienteCoa(false);

			//if(ClienteCoaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClienteCoa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaClienteCoaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClienteCoa(false,false);

			this.getClienteCoasFK_IdEmpresa();

			this.inicializarActualizarBindingClienteCoa(false);

			//if(ClienteCoaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClienteCoa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioClienteCoaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClienteCoa(false,false);

			this.getClienteCoasFK_IdUsuario();

			this.inicializarActualizarBindingClienteCoa(false);

			//if(ClienteCoaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClienteCoa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clientecoaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameClienteCoa() {
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
			this.jInternalFrameDetalleFormClienteCoa.setVisible(false);	    			
			this.jInternalFrameDetalleFormClienteCoa.dispose();
			this.jInternalFrameDetalleFormClienteCoa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
			this.jInternalFrameReporteDinamicoClienteCoa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoClienteCoa.dispose();
			this.jInternalFrameReporteDinamicoClienteCoa=null;
		}
		
		if(this.jInternalFrameImportacionClienteCoa!=null) {
			this.jInternalFrameImportacionClienteCoa.setVisible(false);	    			
			this.jInternalFrameImportacionClienteCoa.dispose();
			this.jInternalFrameImportacionClienteCoa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessClienteCoa();
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
			
			if(sTipo.equals("NuevoClienteCoa")) {
				jButtonNuevoClienteCoaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarClienteCoa")) {
				jButtonDuplicarClienteCoaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarClienteCoa")) {
				jButtonCopiarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("VerFormClienteCoa")) {
				jButtonVerFormClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarClienteCoa")) {
				jButtonNuevoClienteCoaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarClienteCoa")) {
				jButtonDuplicarClienteCoaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoClienteCoa")) {
				jButtonNuevoClienteCoaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarClienteCoa")) {
				jButtonDuplicarClienteCoaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesClienteCoa")) {
				jButtonNuevoClienteCoaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarClienteCoa")) {
				jButtonNuevoClienteCoaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesClienteCoa")) {
				jButtonNuevoClienteCoaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarClienteCoa")) {
				jButtonModificarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarClienteCoa")) {
				jButtonModificarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarClienteCoa")) {
				jButtonModificarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarClienteCoa")) {
				jButtonActualizarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarClienteCoa")) {
				jButtonActualizarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarClienteCoa")) {
				jButtonActualizarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("EliminarClienteCoa")) {
				jButtonEliminarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarClienteCoa")) {
				jButtonEliminarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarClienteCoa")) {
				jButtonEliminarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("CancelarClienteCoa")) {
				jButtonCancelarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarClienteCoa")) {
				jButtonCancelarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarClienteCoa")) {
				jButtonCancelarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("CerrarClienteCoa")) {
				jButtonCerrarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarClienteCoa")) {
				jButtonCerrarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarClienteCoa")) {
				jButtonCerrarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarClienteCoa")) {
				jButtonMostrarOcultarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarClienteCoa")) {
				jButtonCancelarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosClienteCoa")) {
				jButtonGuardarCambiosClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarClienteCoa")) {
				jButtonGuardarCambiosClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarClienteCoa")) {
				jButtonCopiarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarClienteCoa")) {
				jButtonVerFormClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosClienteCoa")) {
				jButtonGuardarCambiosClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarClienteCoa")) {
				jButtonCopiarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormClienteCoa")) {
				jButtonVerFormClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaClienteCoa")) {
				jButtonGuardarCambiosClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarClienteCoa")) {
				jButtonGuardarCambiosClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaClienteCoa")) {
				jButtonGuardarCambiosClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionClienteCoa")) {
				jButtonRecargarInformacionClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarClienteCoa")) {
				jButtonRecargarInformacionClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionClienteCoa")) {
				jButtonRecargarInformacionClienteCoaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresClienteCoa")) {
				jButtonAnterioresClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarClienteCoa")) {
				jButtonAnterioresClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreClienteCoa")) {
				jButtonAnterioresClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesClienteCoa")) {
				jButtonSiguientesClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarClienteCoa")) {
				jButtonSiguientesClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesClienteCoa")) {
				jButtonSiguientesClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByClienteCoa") || sTipo.equals("MenuItemDetalleAbrirOrderByClienteCoa")) {
				jButtonAbrirOrderByClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarClienteCoa") || sTipo.equals("MenuItemDetalleMostrarOcultarClienteCoa")) {
				jButtonMostrarOcultarClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosClienteCoa")) {
				jButtonNuevoGuardarCambiosClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarClienteCoa")) {
				jButtonNuevoGuardarCambiosClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosClienteCoa")) {
				jButtonNuevoGuardarCambiosClienteCoaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoClienteCoa")) {
				jButtonCerrarReporteDinamicoClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoClienteCoa")) {
				jButtonGenerarReporteDinamicoClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoClienteCoa")) {
				
				jButtonGenerarExcelReporteDinamicoClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionClienteCoa")) {
				jButtonCerrarImportacionClienteCoaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionClienteCoa")) {
				
				jButtonGenerarImportacionClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionClienteCoa")) {
				
				jButtonAbrirImportacionClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesClienteCoa")) {
				jComboBoxTiposAccionesClienteCoaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesClienteCoa")) {
				jComboBoxTiposRelacionesClienteCoaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioClienteCoa")) {
				jComboBoxTiposAccionesClienteCoaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarClienteCoa")) {
				
				jComboBoxTiposSeleccionarClienteCoaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralClienteCoa")) {
				jTextFieldValorCampoGeneralClienteCoaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByClienteCoa")) {
				jButtonAbrirOrderByClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarClienteCoa")) {
				jButtonAbrirOrderByClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByClienteCoa")) {
				jButtonCerrarOrderByClienteCoaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClienteCoaBusqueda")) {
				this.jButtonidClienteCoaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaClienteCoaUpdate")) {
				this.jButtonid_empresaClienteCoaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaClienteCoaBusqueda")) {
				this.jButtonid_empresaClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteClienteCoa")) {
				this.jButtonid_clienteClienteCoaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteClienteCoaUpdate")) {
				this.jButtonid_clienteClienteCoaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteClienteCoaBusqueda")) {
				this.jButtonid_clienteClienteCoaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioClienteCoaUpdate")) {
				this.jButtonid_usuarioClienteCoaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioClienteCoaBusqueda")) {
				this.jButtonid_usuarioClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autori_imprentaClienteCoaBusqueda")) {
				this.jButtonautori_imprentaClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autori_usuarioClienteCoaBusqueda")) {
				this.jButtonautori_usuarioClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("num_factura_iniClienteCoaBusqueda")) {
				this.jButtonnum_factura_iniClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("num_factura_finClienteCoaBusqueda")) {
				this.jButtonnum_factura_finClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serie_docuClienteCoaBusqueda")) {
				this.jButtonserie_docuClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_valiClienteCoaBusqueda")) {
				this.jButtonfecha_valiClienteCoaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteClienteCoa")) {
				this.jButtonid_clienteClienteCoaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteClienteCoa")) {
				this.jButtonFK_IdClienteClienteCoaActionPerformed(evt);
			}
			
			;
			
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessClienteCoa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteCoaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				


				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ClienteCoa clientecoaLocal=null;
			
			if(!this.getEsControlTabla()) {
				clientecoaLocal=this.clientecoa;
			} else {
				clientecoaLocal=this.clientecoaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
							
				
				


				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteCoaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
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
			
			


			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteCoaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
								
						
				


				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
								
				
				


				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteCoaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteCoaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteCoaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
							
				
				


				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteCoaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoaAnterior =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.clientecoaAnterior =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
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
			
			


			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteCoaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
								
				
				


				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteCoaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteCoaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteCoaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosClienteCoa")) {
					jCheckBoxSeleccionarTodosClienteCoaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosClienteCoa")) {
					jCheckBoxSeleccionadosClienteCoaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarClienteCoa")) {
					
				}
				
				


				
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
												
				
				


				
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteCoaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clientecoaAnterior =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.clientecoaAnterior =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteCoaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
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
			
			


			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClienteCoaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clientecoa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clientecoa);
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
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
				
				


				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClienteCoa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClienteCoa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClienteCoaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clientecoaAnterior =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarClienteCoa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosClienteCoaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosClienteCoa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.clientecoa =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.clientecoa =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.clientecoa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarClienteCoa")) {
				
				}
				
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarClienteCoa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosClienteCoa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarClienteCoa")) {
			
			}
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessClienteCoa();
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
			if(sTipo.equals("NuevoClienteCoa")) {
				jButtonNuevoClienteCoaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarClienteCoa")) {
				jButtonDuplicarClienteCoaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarClienteCoa")) {
				jButtonCopiarClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormClienteCoa")) {
				jButtonVerFormClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesClienteCoa")) {
				jButtonNuevoClienteCoaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarClienteCoa")) {
				jButtonModificarClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarClienteCoa")) {
				jButtonActualizarClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarClienteCoa")) {
				jButtonEliminarClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaClienteCoa")) {
				jButtonGuardarCambiosClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarClienteCoa")) {
				jButtonCancelarClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarClienteCoa")) {
				jButtonCerrarClienteCoaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosClienteCoa")) {
				jButtonGuardarCambiosClienteCoaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosClienteCoa")) {
				jButtonNuevoGuardarCambiosClienteCoaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByClienteCoa")) {
				jButtonAbrirOrderByClienteCoaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionClienteCoa")) {
				jButtonRecargarInformacionClienteCoaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresClienteCoa")) {
				jButtonAnterioresClienteCoaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesClienteCoa")) {
				jButtonSiguientesClienteCoaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClienteCoaBusqueda")) {
				this.jButtonidClienteCoaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaClienteCoaUpdate")) {
				this.jButtonid_empresaClienteCoaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaClienteCoaBusqueda")) {
				this.jButtonid_empresaClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteClienteCoa")) {
				this.jButtonid_clienteClienteCoaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteClienteCoaUpdate")) {
				this.jButtonid_clienteClienteCoaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteClienteCoaBusqueda")) {
				this.jButtonid_clienteClienteCoaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioClienteCoaUpdate")) {
				this.jButtonid_usuarioClienteCoaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioClienteCoaBusqueda")) {
				this.jButtonid_usuarioClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autori_imprentaClienteCoaBusqueda")) {
				this.jButtonautori_imprentaClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autori_usuarioClienteCoaBusqueda")) {
				this.jButtonautori_usuarioClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("num_factura_iniClienteCoaBusqueda")) {
				this.jButtonnum_factura_iniClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("num_factura_finClienteCoaBusqueda")) {
				this.jButtonnum_factura_finClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serie_docuClienteCoaBusqueda")) {
				this.jButtonserie_docuClienteCoaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_valiClienteCoaBusqueda")) {
				this.jButtonfecha_valiClienteCoaBusquedaActionPerformed(evt);
			}
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessClienteCoa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameClienteCoa")) {
				closingInternalFrameClienteCoa();
				
			} else if(sTipo.equals("jButtonCancelarClienteCoa")) {
				JInternalFrameBase jInternalFrameDetalleFormClienteCoa = (JInternalFrameBase)evt.getSource();
	            	
	            ClienteCoaBeanSwingJInternalFrame jInternalFrameParent=(ClienteCoaBeanSwingJInternalFrame)jInternalFrameDetalleFormClienteCoa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarClienteCoaActionPerformed(null);
			}
			
			ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.clientecoa,new Object(),this.clientecoaParameterGeneral,this.clientecoaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormClienteCoa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormClienteCoa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormClienteCoa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.clientecoa)) {
			if(!esControlTabla) {
				if(ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);			
				}
				
				if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualClienteCoa(this.clientecoa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.clientecoaReturnGeneral=clientecoaLogic.procesarEventosClienteCoasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clientecoaLogic.getClienteCoas(),this.clientecoa,this.clientecoaParameterGeneral,this.isEsNuevoClienteCoa,classes);//this.clientecoaLogic.getClienteCoa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanClienteCoa(this.clientecoaReturnGeneral,this.clientecoaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanClienteCoa(classes,this.clientecoaReturnGeneral,this.clientecoaBean,false);
					}
						
					if(this.clientecoaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyClienteCoa(this.clientecoaReturnGeneral.getClienteCoa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioClienteCoa(this.clientecoaReturnGeneral.getClienteCoa());	
					}
						
					if(this.clientecoaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioClienteCoa(this.clientecoaReturnGeneral.getClienteCoa(),classes);//this.clientecoaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioClienteCoa(this.clientecoa,classes);//this.clientecoaBean);									
				}
			
				if(ClienteCoaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualClienteCoa(this.clientecoa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClienteCoa(this.clientecoa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.clientecoaAnterior!=null) {
						this.clientecoa=this.clientecoaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.clientecoaReturnGeneral=clientecoaLogic.procesarEventosClienteCoasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clientecoaLogic.getClienteCoas(),this.clientecoa,this.clientecoaParameterGeneral,this.isEsNuevoClienteCoa,classes);//this.clientecoaLogic.getClienteCoa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.clientecoaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.clientecoaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.clientecoaReturnGeneral.getClienteCoa(),clientecoaLogic.getClienteCoas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.clientecoaReturnGeneral.getClienteCoa(),this.clientecoas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosClienteCoa.repaint();
				
				//((AbstractTableModel) this.jTableDatosClienteCoa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosClienteCoa();
			}
		}
	}
	
	public void actualizarVisualTableDatosClienteCoa() throws Exception {
		
		ClienteCoaModel clientecoaModel=(ClienteCoaModel)this.jTableDatosClienteCoa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clientecoaModel.clientecoas=this.clientecoaLogic.getClienteCoas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			clientecoaModel.clientecoas=this.clientecoas;
		}
		
		
		((ClienteCoaModel) this.jTableDatosClienteCoa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaClienteCoa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getclientecoaAnterior(),this.clientecoaLogic.getClienteCoas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getclientecoaAnterior(),this.clientecoas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosClienteCoa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioClienteCoa(ClienteCoa clientecoa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
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
										
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clientecoa,new Object(),generalEntityParameterGeneral,this.clientecoaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ClienteCoaConstantesFunciones.getClassesRelationshipsOfClienteCoa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ClienteCoaConstantesFunciones.getClassesRelationshipsFromStringsOfClienteCoa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormClienteCoa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ClienteCoaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clientecoa,new Object(),generalEntityParameterGeneral,this.clientecoaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioClienteCoa(ClienteCoaBean clientecoaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanClienteCoa(ArrayList<Classe> classes,ClienteCoaReturnGeneral clientecoaReturnGeneral,ClienteCoaBean clientecoaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualClienteCoa(ClienteCoa clientecoa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.clientecoa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormClienteCoa = new ClienteCoaDetalleFormJInternalFrame(jDesktopPane,this.clientecoaSessionBean.getConGuardarRelaciones(),this.clientecoaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.setVisible(false);
		this.jInternalFrameDetalleFormClienteCoa.setSelected(false);						
		
		this.jInternalFrameDetalleFormClienteCoa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormClienteCoa.clientecoaLogic=this.clientecoaLogic;
		
		this.cargarCombosFrameForeignKeyClienteCoa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleClienteCoa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClienteCoa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyClienteCoa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyClienteCoa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormClienteCoa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClienteCoa"));
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonModificarClienteCoa.addActionListener(new ButtonActionListener(this,"ModificarClienteCoa"));

		
		this.jInternalFrameDetalleFormClienteCoa.jButtonModificarToolBarClienteCoa.addActionListener(new ButtonActionListener(this,"ModificarToolBarClienteCoa"));
					
		this.jInternalFrameDetalleFormClienteCoa.jMenuItemModificarClienteCoa.addActionListener(new ButtonActionListener(this,"MenuItemModificarClienteCoa"));		
		
		
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarClienteCoa.addActionListener (new ButtonActionListener(this,"ActualizarClienteCoa"));
		
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarToolBarClienteCoa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClienteCoa"));
						
		this.jInternalFrameDetalleFormClienteCoa.jMenuItemActualizarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClienteCoa"));		
		
		
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarClienteCoa.addActionListener (new ButtonActionListener(this,"EliminarClienteCoa"));
		
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"EliminarToolBarClienteCoa"));
								
		this.jInternalFrameDetalleFormClienteCoa.jMenuItemEliminarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClienteCoa"));		
		
		
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarClienteCoa.addActionListener (new ButtonActionListener(this,"CancelarClienteCoa"));
		
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"CancelarToolBarClienteCoa"));
					
		this.jInternalFrameDetalleFormClienteCoa.jMenuItemCancelarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClienteCoa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormClienteCoa.jMenuItemDetalleCerrarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClienteCoa"));		
		
		
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteCoa"));
		
		
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteCoa"));
		
		
		
		this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClienteCoa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonidClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"idClienteCoaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_empresaClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_empresaClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClienteCoaBusqueda"));
		//jButtonid_clienteClienteCoa.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteCoaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoa.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoa"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_usuarioClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_usuarioClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonautori_imprentaClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"autori_imprentaClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonautori_usuarioClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"autori_usuarioClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonnum_factura_iniClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"num_factura_iniClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonnum_factura_finClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"num_factura_finClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonserie_docuClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"serie_docuClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonfecha_valiClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_valiClienteCoaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClienteCoa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameClienteCoa"));
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClienteCoa"));
		}
		
		this.jTableDatosClienteCoa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarClienteCoa"));
		
		this.jTableDatosClienteCoa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarClienteCoa"));
		
		this.jButtonNuevoClienteCoa.addActionListener(new ButtonActionListener(this,"NuevoClienteCoa"));
		
		this.jButtonDuplicarClienteCoa.addActionListener(new ButtonActionListener(this,"DuplicarClienteCoa"));
		
		this.jButtonCopiarClienteCoa.addActionListener(new ButtonActionListener(this,"CopiarClienteCoa"));
		
		this.jButtonVerFormClienteCoa.addActionListener(new ButtonActionListener(this,"VerFormClienteCoa"));
		
		
		this.jButtonNuevoToolBarClienteCoa.addActionListener(new ButtonActionListener(this,"NuevoToolBarClienteCoa"));
			
		this.jButtonDuplicarToolBarClienteCoa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarClienteCoa"));
			
		this.jMenuItemNuevoClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoClienteCoa"));
			
		this.jMenuItemDuplicarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarClienteCoa"));		
		
		
		this.jButtonNuevoRelacionesClienteCoa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesClienteCoa"));
		
		
		this.jButtonNuevoRelacionesToolBarClienteCoa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarClienteCoa"));
			
		this.jMenuItemNuevoRelacionesClienteCoa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesClienteCoa"));		
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonModificarClienteCoa.addActionListener(new ButtonActionListener(this,"ModificarClienteCoa"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonModificarToolBarClienteCoa.addActionListener(new ButtonActionListener(this,"ModificarToolBarClienteCoa"));
			
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemModificarClienteCoa.addActionListener(new ButtonActionListener(this,"MenuItemModificarClienteCoa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarClienteCoa.addActionListener (new ButtonActionListener(this,"ActualizarClienteCoa"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonActualizarToolBarClienteCoa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClienteCoa"));
				
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemActualizarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClienteCoa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarClienteCoa.addActionListener (new ButtonActionListener(this,"EliminarClienteCoa"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonEliminarToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"EliminarToolBarClienteCoa"));
						
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemEliminarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClienteCoa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarClienteCoa.addActionListener (new ButtonActionListener(this,"CancelarClienteCoa"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonCancelarToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"CancelarToolBarClienteCoa"));
			
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemCancelarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClienteCoa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarClienteCoa"));		
		
		
		this.jButtonCerrarClienteCoa.addActionListener (new ButtonActionListener(this,"CerrarClienteCoa"));
		
		
		this.jButtonCerrarToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"CerrarToolBarClienteCoa"));
			
		this.jMenuItemCerrarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarClienteCoa"));
			
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jMenuItemDetalleCerrarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClienteCoa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosClienteCoa.addActionListener (new ButtonActionListener(this,"GuardarCambiosClienteCoa"));
		}
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClienteCoa"));
		}
		
		this.jButtonCopiarToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"CopiarToolBarClienteCoa"));
			
		this.jButtonVerFormToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"VerFormToolBarClienteCoa"));
		
		this.jMenuItemGuardarCambiosClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosClienteCoa"));
			
		this.jMenuItemCopiarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarClienteCoa"));		
		
		this.jMenuItemVerFormClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormClienteCoa"));		
		
		
		this.jButtonGuardarCambiosTablaClienteCoa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClienteCoa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarClienteCoa"));
			
		this.jMenuItemGuardarCambiosTablaClienteCoa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClienteCoa"));		
		
		
		
		this.jButtonRecargarInformacionClienteCoa.addActionListener (new ButtonActionListener(this,"RecargarInformacionClienteCoa"));
					
		this.jButtonRecargarInformacionToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarClienteCoa"));
		
		this.jMenuItemRecargarInformacionClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionClienteCoa"));		
		
		
		
		this.jButtonAnterioresClienteCoa.addActionListener (new ButtonActionListener(this,"AnterioresClienteCoa"));
		
		
		this.jButtonAnterioresToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarClienteCoa"));
		
		this.jMenuItemAnterioresClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresClienteCoa"));		
		
		
		this.jButtonSiguientesClienteCoa.addActionListener (new ButtonActionListener(this,"SiguientesClienteCoa"));
		
		
		this.jButtonSiguientesToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarClienteCoa"));
			
		this.jMenuItemSiguientesClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesClienteCoa"));
			
		this.jMenuItemAbrirOrderByClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByClienteCoa"));
			
		this.jMenuItemMostrarOcultarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarClienteCoa"));
			
		this.jMenuItemDetalleAbrirOrderByClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByClienteCoa"));
			
		this.jMenuItemDetalleMostarOcultarClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarClienteCoa"));		
		
		
		this.jButtonNuevoGuardarCambiosClienteCoa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosClienteCoa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarClienteCoa"));
			
		this.jMenuItemNuevoGuardarCambiosClienteCoa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosClienteCoa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosClienteCoa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosClienteCoa"));

		this.jCheckBoxSeleccionadosClienteCoa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosClienteCoa"));
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClienteCoa"));
		}
		
		
		this.jComboBoxTiposRelacionesClienteCoa.addActionListener (new ButtonActionListener(this,"TiposRelacionesClienteCoa"));
			
		this.jComboBoxTiposAccionesClienteCoa.addActionListener (new ButtonActionListener(this,"TiposAccionesClienteCoa"));
					
		this.jComboBoxTiposSeleccionarClienteCoa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarClienteCoa"));
			
		this.jTextFieldValorCampoGeneralClienteCoa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralClienteCoa"));		
		
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonidClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"idClienteCoaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_empresaClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_empresaClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClienteCoaBusqueda"));
		//jButtonid_clienteClienteCoa.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteCoaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoa.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoa"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_usuarioClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_usuarioClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonautori_imprentaClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"autori_imprentaClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonautori_usuarioClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"autori_usuarioClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonnum_factura_iniClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"num_factura_iniClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonnum_factura_finClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"num_factura_finClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonserie_docuClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"serie_docuClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonfecha_valiClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_valiClienteCoaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteClienteCoa.addActionListener(new ButtonActionListener(this,"FK_IdClienteClienteCoa"));

			this.jButtonBuscarFK_IdClienteid_clienteClienteCoa.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoa"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoClienteCoa!=null) {
				this.jInternalFrameReporteDinamicoClienteCoa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteCoa"));
				this.jInternalFrameReporteDinamicoClienteCoa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteCoa"));
				this.jInternalFrameReporteDinamicoClienteCoa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteCoa"));
			}
			
			//this.jButtonCerrarReporteDinamicoClienteCoa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClienteCoa"));				
			//this.jButtonGenerarReporteDinamicoClienteCoa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClienteCoa"));
			//this.jButtonGenerarExcelReporteDinamicoClienteCoa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClienteCoa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionClienteCoa!=null) {
				this.jInternalFrameImportacionClienteCoa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClienteCoa"));
				this.jInternalFrameImportacionClienteCoa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClienteCoa"));
				this.jInternalFrameImportacionClienteCoa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClienteCoa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByClienteCoa.addActionListener (new ButtonActionListener(this,"AbrirOrderByClienteCoa"));
			
			this.jButtonAbrirOrderByToolBarClienteCoa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarClienteCoa"));			
			
			if(this.jInternalFrameOrderByClienteCoa!=null) {
				this.jInternalFrameOrderByClienteCoa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClienteCoa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormClienteCoa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClienteCoa.jTabbedPaneRelacionesClienteCoa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClienteCoa"));
		
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
            		closingInternalFrameClienteCoa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormClienteCoa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormClienteCoa = (JInternalFrameBase)event.getSource();
	            	
	            ClienteCoaBeanSwingJInternalFrame jInternalFrameParent=(ClienteCoaBeanSwingJInternalFrame)jInternalFrameDetalleFormClienteCoa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarClienteCoaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosClienteCoa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosClienteCoaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosClienteCoa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosClienteCoa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteCoaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteCoaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteCoaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoClienteCoa";
		inputMap = this.jButtonNuevoClienteCoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoClienteCoa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClienteCoaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteCoaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteCoaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClienteCoaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesClienteCoa";
		inputMap = this.jButtonNuevoRelacionesClienteCoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesClienteCoa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClienteCoaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarClienteCoa";
		inputMap = this.jButtonModificarClienteCoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarClienteCoa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarClienteCoaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarClienteCoa";
		inputMap = this.jButtonActualizarClienteCoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarClienteCoa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarClienteCoaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarClienteCoa";
		inputMap = this.jButtonEliminarClienteCoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarClienteCoa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarClienteCoaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarClienteCoa";
		inputMap = this.jButtonCancelarClienteCoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarClienteCoa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarClienteCoaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarClienteCoa";
		inputMap = this.jButtonCerrarClienteCoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarClienteCoa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarClienteCoaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosClienteCoa";
		inputMap = this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosClienteCoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormClienteCoa.jButtonGuardarCambiosClienteCoa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosClienteCoaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosClienteCoa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosClienteCoaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesClienteCoa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesClienteCoaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarClienteCoa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarClienteCoaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralClienteCoa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralClienteCoaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonidClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"idClienteCoaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_empresaClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_empresaClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClienteCoaBusqueda"));
		//jButtonid_clienteClienteCoa.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteClienteCoaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoa.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoa"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_usuarioClienteCoaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioClienteCoaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonid_usuarioClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonautori_imprentaClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"autori_imprentaClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonautori_usuarioClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"autori_usuarioClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonnum_factura_iniClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"num_factura_iniClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonnum_factura_finClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"num_factura_finClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonserie_docuClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"serie_docuClienteCoaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClienteCoa.jButtonfecha_valiClienteCoaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_valiClienteCoaBusqueda"));
		
		
		this.jButtonFK_IdClienteClienteCoa.addActionListener(new ButtonActionListener(this,"FK_IdClienteClienteCoa"));

		this.jButtonBuscarFK_IdClienteid_clienteClienteCoa.addActionListener(new ButtonActionListener(this,"id_clienteClienteCoa"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionClienteCoa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionClienteCoaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarClienteCoaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarClienteCoa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosClienteCoa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
					clientecoaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteCoa clientecoaAux:clientecoas) {
					clientecoaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosClienteCoaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClienteCoa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
						clientecoaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteCoa clientecoaAux:clientecoas) {
						clientecoaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteCoa clientecoaAux:clientecoas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaClienteCoa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClienteCoa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClienteCoa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosClienteCoaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClienteCoa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosClienteCoa.getSelectedRows();
			
			ClienteCoa clientecoaLocal=new ClienteCoa();
			
			//this.seleccionarTodosClienteCoa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clientecoaLocal =(ClienteCoa) this.clientecoaLogic.getClienteCoas().toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					clientecoaLocal =(ClienteCoa) this.clientecoas.toArray()[this.jTableDatosClienteCoa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				clientecoaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
						clientecoaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClienteCoa clientecoaAux:clientecoas) {
						clientecoaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaClienteCoa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClienteCoa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClienteCoa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClienteCoa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualClienteCoaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarClienteCoaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralClienteCoaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingClienteCoa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralClienteCoa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClienteCoa clientecoaAux:this.clientecoaLogic.getClienteCoas()) {
				
						if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA)) {
							existe=true;
							clientecoaAux.setautori_imprenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO)) {
							existe=true;
							clientecoaAux.setautori_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI)) {
							existe=true;
							clientecoaAux.setnum_factura_ini(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN)) {
							existe=true;
							clientecoaAux.setnum_factura_fin(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_SERIEDOCU)) {
							existe=true;
							clientecoaAux.setserie_docu(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_FECHAVALI)) {
							existe=true;
							clientecoaAux.setfecha_vali(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteCoa clientecoaAux:clientecoas) {
					
						if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA)) {
							existe=true;
							clientecoaAux.setautori_imprenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO)) {
							existe=true;
							clientecoaAux.setautori_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI)) {
							existe=true;
							clientecoaAux.setnum_factura_ini(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN)) {
							existe=true;
							clientecoaAux.setnum_factura_fin(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_SERIEDOCU)) {
							existe=true;
							clientecoaAux.setserie_docu(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_FECHAVALI)) {
							existe=true;
							clientecoaAux.setfecha_vali(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaClienteCoa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesClienteCoaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingClienteCoa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioClienteCoa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesClienteCoa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteClienteCoa) {				
					conSplash=true;//false;										
					
					//this.startProcessClienteCoa(conSplash);
				
					this.generarReporteClienteCoasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoClienteCoasSeleccionados();
				//this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClienteCoasSeleccionados(false);
				//this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClienteCoasSeleccionados(true);
				//this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClienteCoa();
				
				this.exportarClienteCoasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionClienteCoas();
				//this.importarClienteCoas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClienteCoa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelClienteCoasSeleccionados();
				//this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Coa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessClienteCoa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoClienteCoa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyClienteCoa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.setSelectedIndex(0);					
				}	
			} 			
			else if(ClienteCoaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteClienteCoa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessClienteCoa(conSplash);
					
						//this.actualizarParametrosGeneralClienteCoa();
						
						this.generarReporteProcesoAccionClienteCoasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ClienteCoaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CoaS SELECCIONADOS?", "MANTENIMIENTO DE Coa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessClienteCoa();
				
						this.actualizarParametrosGeneralClienteCoa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.clientecoaReturnGeneral=clientecoaLogic.procesarAccionClienteCoasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.clientecoaLogic.getClienteCoas(),this.clientecoaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarClienteCoaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralClienteCoa();
					
					ClienteCoaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarClienteCoaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesClienteCoa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormClienteCoa.jComboBoxTiposAccionesFormularioClienteCoa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessClienteCoa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesClienteCoaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessClienteCoa();
			
			if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		
			ClienteCoa clientecoa=new ClienteCoa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingClienteCoa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesClienteCoa.getSelectedItem();
			
			
			
			
			clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
			//this.sTipoAccion;
			
			if(clientecoasSeleccionados.size()==1) {
				for(ClienteCoa clientecoaAux:clientecoasSeleccionados) {
					clientecoa=clientecoaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessClienteCoa();
			
      		//this.finishProcessClienteCoa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarClienteCoaReturnGeneral() throws Exception {
		if(this.clientecoaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.clientecoaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.clientecoaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.clientecoaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.clientecoaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.clientecoaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingClienteCoa(false);
		}
		
		if(this.clientecoaReturnGeneral.getConRetornoLista() || this.clientecoaReturnGeneral.getConRetornoObjeto()) {
			if(this.clientecoaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.clientecoaLogic.setClienteCoas(this.clientecoaReturnGeneral.getClienteCoas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.clientecoaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.clientecoaLogic.setClienteCoa(this.clientecoaReturnGeneral.getClienteCoa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingClienteCoa(false);
		}
	}
	
	public void actualizarParametrosGeneralClienteCoa() throws Exception {
		
		
	}
	
	public ArrayList<ClienteCoa> getClienteCoasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioClienteCoa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ClienteCoa clientecoaAux:clientecoaLogic.getClienteCoas()) {
					if(clientecoaAux.getIsSelected()) {
						clientecoasSeleccionados.add(clientecoaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClienteCoa clientecoaAux:this.clientecoas) {
					if(clientecoaAux.getIsSelected()) {
						clientecoasSeleccionados.add(clientecoaAux);				
					}
				}
			}
			
			if(clientecoasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						clientecoasSeleccionados.addAll(this.clientecoaLogic.getClienteCoas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						clientecoasSeleccionados.addAll(this.clientecoas);				
					}
				}
			}
		} else {
			clientecoasSeleccionados.add(this.clientecoa);
		}
		
		return clientecoasSeleccionados;
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
	
	public void generarReporteClienteCoasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalClienteCoasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoClienteCoasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClienteCoasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClienteCoasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Coa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesClienteCoasSeleccionados() throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteClienteCoas("Todos",clientecoasSeleccionados);
		
	}	
	
	public void generarReporteNormalClienteCoasSeleccionados() throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteClienteCoas("Todos",clientecoasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionClienteCoasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteClienteCoas("Todos",clientecoasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoClienteCoasSeleccionados() throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoClienteCoa();
		
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoClienteCoa();
		
		
		//this.generarReporteClienteCoas("Todos",clientecoasSeleccionados ,clientecoaImplementable,clientecoaImplementableHome);
	}
	
	public void mostrarImportacionClienteCoas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionClienteCoa();
		
		this.abrirFrameImportacionClienteCoa();		
		
			
		//this.generarReporteClienteCoas("Todos",clientecoasSeleccionados ,clientecoaImplementable,clientecoaImplementableHome);
	}
	
	public void importarClienteCoas() throws Exception {		
	
	}
	
	public void exportarClienteCoasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelClienteCoasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoClienteCoasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlClienteCoasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Coa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoClienteCoasSeleccionados() throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientecoa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarClienteCoa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ClienteCoa clientecoaAux:clientecoasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarClienteCoa(clientecoaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//clientecoaAux.setsDetalleGeneralEntityReporte(clientecoaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarClienteCoa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_SERIEDOCU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClienteCoaConstantesFunciones.LABEL_FECHAVALI;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarClienteCoa(ClienteCoa clientecoa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=clientecoa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getautori_imprenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getautori_usuario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getnum_factura_ini();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getnum_factura_fin();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getserie_docu();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clientecoa.getfecha_vali().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelClienteCoasSeleccionados() throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientecoa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ClienteCoas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelClienteCoa(row);				
				iRow++;
			}				
			
			for(ClienteCoa clientecoaAux:clientecoasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelClienteCoa(clientecoaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlClienteCoasSeleccionados() throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();		
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clientecoa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("clientecoas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("clientecoa");
			//elementRoot.appendChild(element);
		
			for(ClienteCoa clientecoaAux:clientecoasSeleccionados) {
				element = document.createElement("clientecoa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlClienteCoa(clientecoaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Coa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelClienteCoa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_SERIEDOCU);
		cell = row.createCell(iColumn++);cell.setCellValue(ClienteCoaConstantesFunciones.LABEL_FECHAVALI);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelClienteCoa(ClienteCoa clientecoa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getautori_imprenta());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getautori_usuario());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getnum_factura_ini());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getnum_factura_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getserie_docu());
		cell = row.createCell(iColumn++);cell.setCellValue(clientecoa.getfecha_vali());				
	}
	
	public void setFilaDatosExportarXmlClienteCoa(ClienteCoa clientecoa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ClienteCoaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(clientecoa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ClienteCoaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(clientecoa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ClienteCoaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(clientecoa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(ClienteCoaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(clientecoa.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementusuario_descripcion = document.createElement(ClienteCoaConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(clientecoa.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementautori_imprenta = document.createElement(ClienteCoaConstantesFunciones.AUTORIIMPRENTA);
		elementautori_imprenta.appendChild(document.createTextNode(clientecoa.getautori_imprenta().trim()));
		element.appendChild(elementautori_imprenta);

		Element elementautori_usuario = document.createElement(ClienteCoaConstantesFunciones.AUTORIUSUARIO);
		elementautori_usuario.appendChild(document.createTextNode(clientecoa.getautori_usuario().trim()));
		element.appendChild(elementautori_usuario);

		Element elementnum_factura_ini = document.createElement(ClienteCoaConstantesFunciones.NUMFACTURAINI);
		elementnum_factura_ini.appendChild(document.createTextNode(clientecoa.getnum_factura_ini().trim()));
		element.appendChild(elementnum_factura_ini);

		Element elementnum_factura_fin = document.createElement(ClienteCoaConstantesFunciones.NUMFACTURAFIN);
		elementnum_factura_fin.appendChild(document.createTextNode(clientecoa.getnum_factura_fin().trim()));
		element.appendChild(elementnum_factura_fin);

		Element elementserie_docu = document.createElement(ClienteCoaConstantesFunciones.SERIEDOCU);
		elementserie_docu.appendChild(document.createTextNode(clientecoa.getserie_docu().trim()));
		element.appendChild(elementserie_docu);

		Element elementfecha_vali = document.createElement(ClienteCoaConstantesFunciones.FECHAVALI);
		elementfecha_vali.appendChild(document.createTextNode(clientecoa.getfecha_vali().toString().trim()));
		element.appendChild(elementfecha_vali);
	}
	
	public void generarReporteGroupGenericoClienteCoasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ClienteCoa> clientecoasSeleccionados=new ArrayList<ClienteCoa>();
		
		clientecoasSeleccionados=this.getClienteCoasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoClienteCoa(clientecoasSeleccionados);
		
		this.generarReporteClienteCoas("Todos",clientecoasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoClienteCoa(ArrayList<ClienteCoa> clientecoasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ClienteCoa clientecoaAux:clientecoasSeleccionados) {
				clientecoaAux.setsDetalleGeneralEntityReporte(clientecoaAux.toString());
			
				if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(clientecoaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(clientecoaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(clientecoaAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(clientecoaAux.getautori_imprenta());
				}
				 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(clientecoaAux.getautori_usuario());
				}
				 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(clientecoaAux.getnum_factura_ini());
				}
				 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(clientecoaAux.getnum_factura_fin());
				}
				 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_SERIEDOCU)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(clientecoaAux.getserie_docu());
				}
				 else if(sTipoSeleccionar.equals(ClienteCoaConstantesFunciones.LABEL_FECHAVALI)) {
					existe=true;
					clientecoaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(clientecoaAux.getfecha_vali()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClienteCoaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesClienteCoa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoClienteCoa=true;
				this.isVisibilidadCeldaNuevoRelacionesClienteCoa=true;
				this.isVisibilidadCeldaGuardarCambiosClienteCoa=true;
			}
			
			this.isVisibilidadCeldaModificarClienteCoa=false;
			this.isVisibilidadCeldaActualizarClienteCoa=false;
			this.isVisibilidadCeldaEliminarClienteCoa=false;
			this.isVisibilidadCeldaCancelarClienteCoa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteCoa=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoClienteCoa=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=false;
			this.isVisibilidadCeldaModificarClienteCoa=false;
			this.isVisibilidadCeldaActualizarClienteCoa=true;
			this.isVisibilidadCeldaEliminarClienteCoa=false;
			this.isVisibilidadCeldaCancelarClienteCoa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteCoa=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoClienteCoa=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=false;
			this.isVisibilidadCeldaModificarClienteCoa=false;
			this.isVisibilidadCeldaActualizarClienteCoa=true;
			this.isVisibilidadCeldaEliminarClienteCoa=true;
			this.isVisibilidadCeldaCancelarClienteCoa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteCoa=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoClienteCoa=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=false;
			this.isVisibilidadCeldaModificarClienteCoa=false;
			this.isVisibilidadCeldaActualizarClienteCoa=true;
			this.isVisibilidadCeldaEliminarClienteCoa=false;
			this.isVisibilidadCeldaCancelarClienteCoa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoClienteCoa=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=true;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=true;
			this.isVisibilidadCeldaModificarClienteCoa=false;
			this.isVisibilidadCeldaActualizarClienteCoa=false;
			this.isVisibilidadCeldaEliminarClienteCoa=false;
			this.isVisibilidadCeldaCancelarClienteCoa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteCoa=true;
				} else {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoClienteCoa=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=false;
			this.isVisibilidadCeldaActualizarClienteCoa=false;
			this.isVisibilidadCeldaEliminarClienteCoa=false;
			this.isVisibilidadCeldaCancelarClienteCoa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoClienteCoa=false;
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=false;
			this.isVisibilidadCeldaModificarClienteCoa=true;
			this.isVisibilidadCeldaActualizarClienteCoa=false;
			this.isVisibilidadCeldaEliminarClienteCoa=false;
			this.isVisibilidadCeldaCancelarClienteCoa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				} else {
					this.isVisibilidadCeldaGuardarClienteCoa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ClienteCoaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoClienteCoa=true;
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=true;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=true;
		} else {
			this.actualizarEstadoPanelsClienteCoa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarClienteCoa=false;
			//this.isVisibilidadCeldaVerFormClienteCoa=false;
			this.isVisibilidadCeldaDuplicarClienteCoa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!clientecoaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
		} else {
			this.isVisibilidadCeldaNuevoClienteCoa=false;
			this.isVisibilidadCeldaGuardarCambiosClienteCoa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(clientecoaSessionBean.getEsGuardarRelacionado()) {
			if(!clientecoaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;												
			}
			
			this.jButtonCerrarClienteCoa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesClienteCoa=false;
		}
		
		if(!this.permiteMantenimiento(this.clientecoa)) {
			this.isVisibilidadCeldaActualizarClienteCoa=false;
			this.isVisibilidadCeldaEliminarClienteCoa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesClienteCoa() {
	}
	
	public void actualizarEstadoPanelsClienteCoa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionClienteCoa!=null) {
				this.jScrollPanelDatosEdicionClienteCoa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteCoa!=null) {
				this.jTabbedPaneBusquedasClienteCoa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteCoa!=null) {
				this.jScrollPanelDatosClienteCoa.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteCoa!=null) {
				this.jPanelPaginacionClienteCoa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionClienteCoa!=null) {
				this.jScrollPanelDatosEdicionClienteCoa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteCoa!=null) {
				this.jTabbedPaneBusquedasClienteCoa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosClienteCoa!=null) {
				this.jScrollPanelDatosClienteCoa.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteCoa!=null) {
				this.jPanelPaginacionClienteCoa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionClienteCoa!=null) {
				this.jScrollPanelDatosEdicionClienteCoa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteCoa!=null) {
				this.jTabbedPaneBusquedasClienteCoa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClienteCoa!=null) {
				this.jScrollPanelDatosClienteCoa.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteCoa!=null) {
				this.jPanelPaginacionClienteCoa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionClienteCoa!=null) {
				this.jScrollPanelDatosEdicionClienteCoa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteCoa!=null) {
				this.jTabbedPaneBusquedasClienteCoa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClienteCoa!=null) {
				this.jScrollPanelDatosClienteCoa.setVisible(false);
			}
			
			if(this.jPanelPaginacionClienteCoa!=null) {
				this.jPanelPaginacionClienteCoa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionClienteCoa!=null) {
				this.jScrollPanelDatosEdicionClienteCoa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteCoa!=null) {
				this.jTabbedPaneBusquedasClienteCoa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteCoa!=null) {
				this.jScrollPanelDatosClienteCoa.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteCoa!=null) {
				this.jPanelPaginacionClienteCoa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionClienteCoa!=null) {
				this.jScrollPanelDatosEdicionClienteCoa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteCoa!=null) {
				this.jTabbedPaneBusquedasClienteCoa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteCoa!=null) {
				this.jScrollPanelDatosClienteCoa.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteCoa!=null) {
				this.jPanelPaginacionClienteCoa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionClienteCoa!=null) {
				this.jScrollPanelDatosEdicionClienteCoa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteCoa!=null) {
				this.jTabbedPaneBusquedasClienteCoa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClienteCoa!=null) {
				this.jScrollPanelDatosClienteCoa.setVisible(true);
			}
			
			if(this.jPanelPaginacionClienteCoa!=null) {
				this.jPanelPaginacionClienteCoa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasClienteCoa!=null) {
					this.jTabbedPaneBusquedasClienteCoa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClienteCoa!=null) {
				this.jTabbedPaneBusquedasClienteCoa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesClienteCoa!=null) {
				this.jPanelParametrosReportesClienteCoa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasClienteCoa.remove(jPanelFK_IdClienteClienteCoa);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasClienteCoa.remove(jPanelFK_IdClienteClienteCoa);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdCliente=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasClienteCoa.remove(jPanelFK_IdClienteClienteCoa);}
		}
		
	}
	
	
	
	

	public String registrarSesionClienteCoaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(clientecoaSessionBean==null) {
				clientecoaSessionBean=new ClienteCoaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(clientecoaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.clientecoaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ClienteCoaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionClienteCoa(true);
			//clienteSessionBean.setlidClienteCoaActual(this.idClienteCoaActual);

			clientecoaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyClienteCoa(true);
			clientecoaSessionBean.setlIdClienteCoaActualForeignKey(this.idClienteCoaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ClienteCoaSessionBean clientecoaSessionBean=new ClienteCoaSessionBean();
		
		if(this.clientecoaSessionBean==null) {
			this.clientecoaSessionBean=new ClienteCoaSessionBean();
		}
		
		this.clientecoaSessionBean.setsUltimaBusquedaClienteCoa(this.getsAccionBusqueda());
		this.clientecoaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.clientecoaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			clientecoaSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			clientecoaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			clientecoaSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ClienteCoaSessionBean clientecoaSessionBean=new ClienteCoaSessionBean();
		
		if(this.clientecoaSessionBean==null) {
			this.clientecoaSessionBean=new ClienteCoaSessionBean();
		}
		
		if(this.clientecoaSessionBean.getsUltimaBusquedaClienteCoa()!=null&&!this.clientecoaSessionBean.getsUltimaBusquedaClienteCoa().equals("")) {
			this.setsAccionBusqueda(clientecoaSessionBean.getsUltimaBusquedaClienteCoa());
			this.setiNumeroPaginacion(clientecoaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(clientecoaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(clientecoaSessionBean.getid_cliente());
				clientecoaSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(clientecoaSessionBean.getid_empresa());
				clientecoaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(clientecoaSessionBean.getid_usuario());
				clientecoaSessionBean.setid_usuario(-1L);
			}
		}
		
		this.clientecoaSessionBean.setsUltimaBusquedaClienteCoa("");
		this.clientecoaSessionBean.setiNumeroPaginacion(ClienteCoaConstantesFunciones.INUMEROPAGINACION);
		this.clientecoaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaClienteCoa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioClienteCoa() {
		this.updateBorderResaltarBusquedasFormularioClienteCoa();
		this.updateVisibilidadBusquedasFormularioClienteCoa();
		this.updateHabilitarBusquedasFormularioClienteCoa();
	}
	
	public void updateBorderResaltarBusquedasFormularioClienteCoa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasClienteCoa.getComponents().length>0) {
	

		if(this.clientecoaConstantesFunciones.resaltarFK_IdClienteClienteCoa!=null) {
			index= this.jTabbedPaneBusquedasClienteCoa.indexOfComponent(this.jPanelFK_IdClienteClienteCoa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteCoa.getComponent(index);
				jPanel.setBorder(this.clientecoaConstantesFunciones.resaltarFK_IdClienteClienteCoa);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioClienteCoa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasClienteCoa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClienteCoa.indexOfComponent(this.jPanelFK_IdClienteClienteCoa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClienteCoa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.clientecoaConstantesFunciones.mostrarFK_IdClienteClienteCoa);
			if(!this.clientecoaConstantesFunciones.mostrarFK_IdClienteClienteCoa && index>-1) {
				this.jTabbedPaneBusquedasClienteCoa.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioClienteCoa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasClienteCoa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClienteCoa.indexOfComponent(this.jPanelFK_IdClienteClienteCoa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClienteCoa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.clientecoaConstantesFunciones.activarFK_IdClienteClienteCoa);
				this.jTabbedPaneBusquedasClienteCoa.setEnabledAt(index,this.clientecoaConstantesFunciones.activarFK_IdClienteClienteCoa);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaClienteCoa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasClienteCoa.indexOfComponent(this.jPanelFK_IdClienteClienteCoa);

			this.jTabbedPaneBusquedasClienteCoa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClienteCoa.getComponent(index);

			this.clientecoaConstantesFunciones.setResaltarFK_IdClienteClienteCoa(resaltar);

			jPanel.setBorder(this.clientecoaConstantesFunciones.resaltarFK_IdClienteClienteCoa);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarClienteCoa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioClienteCoa() throws Exception {

		if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioClienteCoa();
		this.updateVisibilidadResaltarControlesFormularioClienteCoa();
		this.updateHabilitarResaltarControlesFormularioClienteCoa();
		
	}
	
	public void updateBorderResaltarControlesFormularioClienteCoa() throws Exception {
		if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.clientecoaConstantesFunciones.resaltaridClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltaridClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarid_empresaClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarid_empresaClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarid_clienteClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarid_clienteClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarid_usuarioClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarid_usuarioClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarautori_imprentaClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_imprentaClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarautori_imprentaClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarautori_usuarioClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_usuarioClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarautori_usuarioClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarnum_factura_iniClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_iniClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarnum_factura_iniClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarnum_factura_finClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_finClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarnum_factura_finClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarserie_docuClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jTextFieldserie_docuClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarserie_docuClienteCoa);}
		if(this.clientecoaConstantesFunciones.resaltarfecha_valiClienteCoa!=null && this.jInternalFrameDetalleFormClienteCoa!=null) {this.jInternalFrameDetalleFormClienteCoa.jDateChooserfecha_valiClienteCoa.setBorder(this.clientecoaConstantesFunciones.resaltarfecha_valiClienteCoa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioClienteCoa() throws Exception {		
		if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
	
		//this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostraridClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelidClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostraridClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarid_empresaClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelid_empresaClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarid_empresaClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarid_clienteClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelid_clienteClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarid_clienteClienteCoa);
			this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarid_clienteClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarid_usuarioClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelid_usuarioClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarid_usuarioClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_imprentaClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarautori_imprentaClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelautori_imprentaClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarautori_imprentaClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_usuarioClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarautori_usuarioClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelautori_usuarioClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarautori_usuarioClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_iniClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarnum_factura_iniClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelnum_factura_iniClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarnum_factura_iniClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_finClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarnum_factura_finClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelnum_factura_finClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarnum_factura_finClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jTextFieldserie_docuClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarserie_docuClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelserie_docuClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarserie_docuClienteCoa);
		//this.jInternalFrameDetalleFormClienteCoa.jDateChooserfecha_valiClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarfecha_valiClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jPanelfecha_valiClienteCoa.setVisible(this.clientecoaConstantesFunciones.mostrarfecha_valiClienteCoa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioClienteCoa() throws Exception {
		if(this.jInternalFrameDetalleFormClienteCoa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClienteCoa!=null) {
	
		this.jInternalFrameDetalleFormClienteCoa.jLabelidClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activaridClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_empresaClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarid_empresaClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_clienteClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarid_clienteClienteCoa);
			this.jInternalFrameDetalleFormClienteCoa.jButtonid_clienteClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarid_clienteClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jComboBoxid_usuarioClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarid_usuarioClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_imprentaClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarautori_imprentaClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldautori_usuarioClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarautori_usuarioClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_iniClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarnum_factura_iniClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldnum_factura_finClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarnum_factura_finClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jTextFieldserie_docuClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarserie_docuClienteCoa);
		this.jInternalFrameDetalleFormClienteCoa.jDateChooserfecha_valiClienteCoa.setEnabled(this.clientecoaConstantesFunciones.activarfecha_valiClienteCoa);
		}
	}
	
		
}