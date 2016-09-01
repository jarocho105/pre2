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

import com.bydan.erp.cartera.util.ContactoClienteConstantesFunciones;
import com.bydan.erp.cartera.util.ContactoClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ContactoClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ContactoClienteBean;
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
public class ContactoClienteBeanSwingJInternalFrame extends ContactoClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ContactoClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ContactoCliente> contactoclienteValidator = new ClassValidator<ContactoCliente>(ContactoCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ContactoCliente contactocliente;	
	public ContactoCliente contactoclienteAux;
	public ContactoCliente contactoclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ContactoCliente contactoclienteTotales;
	public Long idContactoClienteActual;
	public Long iIdNuevoContactoCliente=0L;
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
	
	public Boolean isPermisoTodoContactoCliente;
	public Boolean isPermisoNuevoContactoCliente;
	public Boolean isPermisoActualizarContactoCliente;
	public Boolean isPermisoActualizarOriginalContactoCliente;
	public Boolean isPermisoEliminarContactoCliente;
	public Boolean isPermisoGuardarCambiosContactoCliente;
	public Boolean isPermisoConsultaContactoCliente;
	public Boolean isPermisoBusquedaContactoCliente;
	public Boolean isPermisoReporteContactoCliente;
	public Boolean isPermisoPaginacionMedioContactoCliente;
	public Boolean isPermisoPaginacionAltoContactoCliente;
	public Boolean isPermisoPaginacionTodoContactoCliente;
	public Boolean isPermisoCopiarContactoCliente;
	public Boolean isPermisoVerFormContactoCliente;
	public Boolean isPermisoDuplicarContactoCliente;
	public Boolean isPermisoOrdenContactoCliente;
	
	
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
	
	public ContactoClienteParameterReturnGeneral contactoclienteReturnGeneral;
	public ContactoClienteParameterReturnGeneral contactoclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoContactoCliente=false;
	public Boolean esParaAccionDesdeFormularioContactoCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ContactoClienteSessionBeanAdditional contactoclienteSessionBeanAdditional=null;
	
	public ContactoClienteSessionBeanAdditional getContactoClienteSessionBeanAdditional() {
		return this.contactoclienteSessionBeanAdditional;
	}
	
	public void setContactoClienteSessionBeanAdditional(ContactoClienteSessionBeanAdditional contactoclienteSessionBeanAdditional) {
		try {
			this.contactoclienteSessionBeanAdditional=contactoclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ContactoClienteBeanSwingJInternalFrameAdditional contactoclienteBeanSwingJInternalFrameAdditional=null;
	//public class ContactoClienteBeanSwingJInternalFrame
	
	public ContactoClienteBeanSwingJInternalFrameAdditional getContactoClienteBeanSwingJInternalFrameAdditional() {
		return this.contactoclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setContactoClienteBeanSwingJInternalFrameAdditional(ContactoClienteBeanSwingJInternalFrameAdditional contactoclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.contactoclienteBeanSwingJInternalFrameAdditional=contactoclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ContactoClienteLogic contactoclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ContactoCliente contactoclienteBean;
	public ContactoClienteConstantesFunciones contactoclienteConstantesFunciones;
	//public ContactoClienteParameterReturnGeneral contactoclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<ContactoCliente> contactoclientes;	
	//public List<ContactoCliente> contactoclientesEliminados;
	//public List<ContactoCliente> contactoclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoContactoCliente=false;
	public Boolean isVisibilidadCeldaDuplicarContactoCliente=true;
	public Boolean isVisibilidadCeldaCopiarContactoCliente=true;
	public Boolean isVisibilidadCeldaVerFormContactoCliente=true;
	public Boolean isVisibilidadCeldaOrdenContactoCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
	public Boolean isVisibilidadCeldaModificarContactoCliente=false;
	public Boolean isVisibilidadCeldaActualizarContactoCliente=false;
	public Boolean isVisibilidadCeldaEliminarContactoCliente=false;
	public Boolean isVisibilidadCeldaCancelarContactoCliente=false;
	public Boolean isVisibilidadCeldaGuardarContactoCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosContactoCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoContactoCliente() {
		return this.iIdNuevoContactoCliente;
	}

	public void setiIdNuevoContactoCliente(Long iIdNuevoContactoCliente) {
		this.iIdNuevoContactoCliente = iIdNuevoContactoCliente;
	}
	
	public Long getidContactoClienteActual() {
		return this.idContactoClienteActual;
	}

	public void setidContactoClienteActual(Long idContactoClienteActual) {
		this.idContactoClienteActual = idContactoClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ContactoCliente getcontactocliente() {
		return this.contactocliente;
	}

	public void setcontactocliente(ContactoCliente contactocliente) {
		this.contactocliente = contactocliente;
	}
	
	public ContactoCliente getcontactoclienteAux() {
		return this.contactoclienteAux;
	}

	public void setcontactoclienteAux(ContactoCliente contactoclienteAux) {
		this.contactoclienteAux = contactoclienteAux;
	}				
	
	public ContactoCliente getcontactoclienteAnterior() {
		return this.contactoclienteAnterior;
	}

	public void setcontactoclienteAnterior(ContactoCliente contactoclienteAnterior) {
		this.contactoclienteAnterior = contactoclienteAnterior;
	}	
	
	public ContactoCliente getcontactoclienteTotales() {
		return this.contactoclienteTotales;
	}

	public void setcontactoclienteTotales(ContactoCliente contactoclienteTotales) {
		this.contactoclienteTotales = contactoclienteTotales;
	}	
	
	public ContactoCliente getcontactoclienteBean() {
		return this.contactoclienteBean;
	}

	public void setcontactoclienteBean(ContactoCliente contactoclienteBean) {
		this.contactoclienteBean = contactoclienteBean;
	}	
	
	public ContactoClienteParameterReturnGeneral getcontactoclienteReturnGeneral() {
		return this.contactoclienteReturnGeneral;
	}

	public void setcontactoclienteReturnGeneral(ContactoClienteParameterReturnGeneral contactoclienteReturnGeneral) {
		this.contactoclienteReturnGeneral = contactoclienteReturnGeneral;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ContactoClienteLogic getContactoClienteLogic()	{		
		return contactoclienteLogic;
	}

	public void setContactoClienteLogic(ContactoClienteLogic contactoclienteLogic) {
		this.contactoclienteLogic = contactoclienteLogic;
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
	
	public Boolean getIsEsNuevoContactoCliente() {
		return isEsNuevoContactoCliente;
	}

	public void setIsEsNuevoContactoCliente(Boolean isEsNuevoContactoCliente) {
		this.isEsNuevoContactoCliente = isEsNuevoContactoCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioContactoCliente() {
		return esParaAccionDesdeFormularioContactoCliente;
	}
	
	public void setEsParaAccionDesdeFormularioContactoCliente(Boolean esParaAccionDesdeFormularioContactoCliente) {
		this.esParaAccionDesdeFormularioContactoCliente = esParaAccionDesdeFormularioContactoCliente;
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

			if(this.contactoclienteSessionBean==null) {
				this.contactoclienteSessionBean=new ContactoClienteSessionBean();
			}

			if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(contactoclienteSessionBean.getlidEmpresaActual());
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

			if(this.contactoclienteSessionBean==null) {
				this.contactoclienteSessionBean=new ContactoClienteSessionBean();
			}

			if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(contactoclienteSessionBean.getlidSucursalActual());
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

			if(this.contactoclienteSessionBean==null) {
				this.contactoclienteSessionBean=new ContactoClienteSessionBean();
			}

			if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(contactoclienteSessionBean.getlidClienteActual());
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

					if(this.contactocliente!=null) {
						this.contactocliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormContactoCliente!=null) {
						this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaContactoCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormContactoCliente!=null) {
						if(this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaContactoClienteGenerico)throws Exception
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
				jComboBoxid_empresaContactoClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaContactoClienteGenerico!=null && jComboBoxid_empresaContactoClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaContactoClienteGenerico.setSelectedIndex(0);
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

					if(this.contactocliente!=null) {
						this.contactocliente.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormContactoCliente!=null) {
						this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalContactoCliente.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormContactoCliente!=null) {
						if(this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalContactoClienteGenerico)throws Exception
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
				jComboBoxid_sucursalContactoClienteGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalContactoClienteGenerico!=null && jComboBoxid_sucursalContactoClienteGenerico.getItemCount()>0) {
					jComboBoxid_sucursalContactoClienteGenerico.setSelectedIndex(0);
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

					if(this.contactocliente!=null) {
						this.contactocliente.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormContactoCliente!=null) {
						this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteContactoCliente.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormContactoCliente!=null) {
						if(this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteContactoCliente!=null) {
						jComboBoxid_clienteFK_IdClienteContactoCliente.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteContactoCliente!=null) {
							//jComboBoxid_clienteFK_IdClienteContactoCliente.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteContactoCliente.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteContactoCliente.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteContactoClienteGenerico)throws Exception
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
				jComboBoxid_clienteContactoClienteGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteContactoClienteGenerico!=null && jComboBoxid_clienteContactoClienteGenerico.getItemCount()>0) {
					jComboBoxid_clienteContactoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ContactoCliente contactocliente,JComboBox jComboBoxid_empresaContactoClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaContactoClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaContactoClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				contactocliente.setid_empresa(empresaAux.getId());
				contactocliente.setempresa_descripcion(ContactoClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				contactocliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ContactoCliente contactocliente,JComboBox jComboBoxid_sucursalContactoClienteGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalContactoClienteGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalContactoClienteGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				contactocliente.setid_sucursal(sucursalAux.getId());
				contactocliente.setsucursal_descripcion(ContactoClienteConstantesFunciones.getSucursalDescripcion(sucursalAux));
				contactocliente.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ContactoCliente contactocliente,JComboBox jComboBoxid_clienteContactoClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteContactoClienteGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteContactoClienteGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				contactocliente.setid_cliente(clienteAux.getId());
				contactocliente.setcliente_descripcion(ContactoClienteConstantesFunciones.getClienteDescripcion(clienteAux));
				contactocliente.setCliente(clienteAux);			}
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

					if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormContactoCliente!=null) { 
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormContactoCliente!=null) { 
					}

					if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormContactoCliente!=null) { 
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormContactoCliente!=null) { 
					}

					if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormContactoCliente!=null) { 
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormContactoCliente!=null) { 
					}

					if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteContactoCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteContactoCliente.addItem(cliente);
							}
						}

						if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormContactoCliente!=null) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormContactoCliente!=null) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormContactoCliente!=null) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormContactoCliente!=null) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormContactoCliente!=null) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormContactoCliente!=null) {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteContactoCliente.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteContactoCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesContactoCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ContactoClienteConstantesFunciones.refrescarForeignKeysDescripcionesContactoCliente(this.contactoclienteLogic.getContactoClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ContactoClienteConstantesFunciones.refrescarForeignKeysDescripcionesContactoCliente(this.contactoclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//contactoclienteLogic.setContactoClientes(this.contactoclientes);
			contactoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ContactoClienteParameterReturnGeneral getContactoClienteParameterGeneral() {
		return this.contactoclienteParameterGeneral;
	}
	
	public void setContactoClienteParameterGeneral(ContactoClienteParameterReturnGeneral contactoclienteParameterGeneral) {
		this.contactoclienteParameterGeneral = contactoclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoContactoCliente() {
		return isPermisoTodoContactoCliente;
	}

	public void setIsPermisoTodoContactoCliente(Boolean isPermisoTodoContactoCliente) {
		this.isPermisoTodoContactoCliente = isPermisoTodoContactoCliente;
	}

	public Boolean getIsPermisoNuevoContactoCliente() {
		return isPermisoNuevoContactoCliente;
	}

	public void setIsPermisoNuevoContactoCliente(Boolean isPermisoNuevoContactoCliente) {
		this.isPermisoNuevoContactoCliente = isPermisoNuevoContactoCliente;
	}

	public Boolean getIsPermisoActualizarContactoCliente() {
		return isPermisoActualizarContactoCliente;
	}

	public void setIsPermisoActualizarContactoCliente(Boolean isPermisoActualizarContactoCliente) {
		this.isPermisoActualizarContactoCliente = isPermisoActualizarContactoCliente;
	}

	public Boolean getIsPermisoEliminarContactoCliente() {
		return isPermisoEliminarContactoCliente;
	}

	public void setIsPermisoEliminarContactoCliente(Boolean isPermisoEliminarContactoCliente) {
		this.isPermisoEliminarContactoCliente = isPermisoEliminarContactoCliente;
	}

	public Boolean getIsPermisoGuardarCambiosContactoCliente() {
		return isPermisoGuardarCambiosContactoCliente;
	}

	public void setIsPermisoGuardarCambiosContactoCliente(Boolean isPermisoGuardarCambiosContactoCliente) {
		this.isPermisoGuardarCambiosContactoCliente = isPermisoGuardarCambiosContactoCliente;
	}
	
	public Boolean getIsPermisoConsultaContactoCliente() {
		return isPermisoConsultaContactoCliente;
	}

	public void setIsPermisoConsultaContactoCliente(Boolean isPermisoConsultaContactoCliente) {
		this.isPermisoConsultaContactoCliente = isPermisoConsultaContactoCliente;
	}

	public Boolean getIsPermisoBusquedaContactoCliente() {
		return isPermisoBusquedaContactoCliente;
	}

	public void setIsPermisoBusquedaContactoCliente(Boolean isPermisoBusquedaContactoCliente) {
		this.isPermisoBusquedaContactoCliente = isPermisoBusquedaContactoCliente;
	}

	public Boolean getIsPermisoReporteContactoCliente() {
		return isPermisoReporteContactoCliente;
	}

	public void setIsPermisoReporteContactoCliente(Boolean isPermisoReporteContactoCliente) {
		this.isPermisoReporteContactoCliente = isPermisoReporteContactoCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioContactoCliente() {
		return isPermisoPaginacionMedioContactoCliente;
	}

	public void setIsPermisoPaginacionMedioContactoCliente(Boolean isPermisoPaginacionMedioContactoCliente) {
		this.isPermisoPaginacionMedioContactoCliente = isPermisoPaginacionMedioContactoCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoContactoCliente() {
		return isPermisoPaginacionTodoContactoCliente;
	}

	public void setIsPermisoPaginacionTodoContactoCliente(Boolean isPermisoPaginacionTodoContactoCliente) {
		this.isPermisoPaginacionTodoContactoCliente = isPermisoPaginacionTodoContactoCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoContactoCliente() {
		return isPermisoPaginacionAltoContactoCliente;
	}

	public void setIsPermisoPaginacionAltoContactoCliente(Boolean isPermisoPaginacionAltoContactoCliente) {
		this.isPermisoPaginacionAltoContactoCliente = isPermisoPaginacionAltoContactoCliente;
	}
	
	public Boolean getIsPermisoCopiarContactoCliente() {
		return isPermisoCopiarContactoCliente;
	}

	public void setIsPermisoCopiarContactoCliente(Boolean isPermisoCopiarContactoCliente) {
		this.isPermisoCopiarContactoCliente = isPermisoCopiarContactoCliente;
	}
	
	public Boolean getIsPermisoVerFormContactoCliente() {
		return isPermisoVerFormContactoCliente;
	}

	public void setIsPermisoVerFormContactoCliente(Boolean isPermisoVerFormContactoCliente) {
		this.isPermisoVerFormContactoCliente = isPermisoVerFormContactoCliente;
	}
	
	public Boolean getIsPermisoDuplicarContactoCliente() {
		return isPermisoDuplicarContactoCliente;
	}

	public void setIsPermisoDuplicarContactoCliente(Boolean isPermisoDuplicarContactoCliente) {
		this.isPermisoDuplicarContactoCliente = isPermisoDuplicarContactoCliente;
	}
	
	public Boolean getIsPermisoOrdenContactoCliente() {
		return isPermisoOrdenContactoCliente;
	}

	public void setIsPermisoOrdenContactoCliente(Boolean isPermisoOrdenContactoCliente) {
		this.isPermisoOrdenContactoCliente = isPermisoOrdenContactoCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoContactoCliente() {
		return isVisibilidadCeldaNuevoContactoCliente;
	}

	public void setIsVisibilidadCeldaNuevoContactoCliente(Boolean isVisibilidadCeldaNuevoContactoCliente) {
		this.isVisibilidadCeldaNuevoContactoCliente = isVisibilidadCeldaNuevoContactoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarContactoCliente() {
		return isVisibilidadCeldaDuplicarContactoCliente;
	}

	public void setIsVisibilidadCeldaDuplicarContactoCliente(Boolean isVisibilidadCeldaDuplicarContactoCliente) {
		this.isVisibilidadCeldaDuplicarContactoCliente = isVisibilidadCeldaDuplicarContactoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarContactoCliente() {
		return isVisibilidadCeldaCopiarContactoCliente;
	}

	public void setIsVisibilidadCeldaCopiarContactoCliente(Boolean isVisibilidadCeldaCopiarContactoCliente) {
		this.isVisibilidadCeldaCopiarContactoCliente = isVisibilidadCeldaCopiarContactoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormContactoCliente() {
		return isVisibilidadCeldaVerFormContactoCliente;
	}

	public void setIsVisibilidadCeldaVerFormContactoCliente(Boolean isVisibilidadCeldaVerFormContactoCliente) {
		this.isVisibilidadCeldaVerFormContactoCliente = isVisibilidadCeldaVerFormContactoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenContactoCliente() {
		return isVisibilidadCeldaOrdenContactoCliente;
	}

	public void setIsVisibilidadCeldaOrdenContactoCliente(Boolean isVisibilidadCeldaOrdenContactoCliente) {
		this.isVisibilidadCeldaOrdenContactoCliente = isVisibilidadCeldaOrdenContactoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesContactoCliente() {
		return isVisibilidadCeldaNuevoRelacionesContactoCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesContactoCliente(Boolean isVisibilidadCeldaNuevoRelacionesContactoCliente) {
		this.isVisibilidadCeldaNuevoRelacionesContactoCliente = isVisibilidadCeldaNuevoRelacionesContactoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarContactoCliente() {
		return isVisibilidadCeldaModificarContactoCliente;
	}

	public void setIsVisibilidadCeldaModificarContactoCliente(Boolean isVisibilidadCeldaModificarContactoCliente) {
		this.isVisibilidadCeldaModificarContactoCliente = isVisibilidadCeldaModificarContactoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarContactoCliente() {
		return isVisibilidadCeldaActualizarContactoCliente;
	}

	public void setIsVisibilidadCeldaActualizarContactoCliente(Boolean isVisibilidadCeldaActualizarContactoCliente) {
		this.isVisibilidadCeldaActualizarContactoCliente = isVisibilidadCeldaActualizarContactoCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarContactoCliente() {
		return isVisibilidadCeldaEliminarContactoCliente;
	}

	public void setIsVisibilidadCeldaEliminarContactoCliente(Boolean isVisibilidadCeldaEliminarContactoCliente) {
		this.isVisibilidadCeldaEliminarContactoCliente = isVisibilidadCeldaEliminarContactoCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarContactoCliente() {
		return isVisibilidadCeldaCancelarContactoCliente;
	}

	public void setIsVisibilidadCeldaCancelarContactoCliente(Boolean isVisibilidadCeldaCancelarContactoCliente) {
		this.isVisibilidadCeldaCancelarContactoCliente = isVisibilidadCeldaCancelarContactoCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarContactoCliente() {
		return isVisibilidadCeldaGuardarContactoCliente;
	}

	public void setIsVisibilidadCeldaGuardarContactoCliente(Boolean isVisibilidadCeldaGuardarContactoCliente) {
		this.isVisibilidadCeldaGuardarContactoCliente = isVisibilidadCeldaGuardarContactoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosContactoCliente() {
		return isVisibilidadCeldaGuardarCambiosContactoCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosContactoCliente(Boolean isVisibilidadCeldaGuardarCambiosContactoCliente) {
		this.isVisibilidadCeldaGuardarCambiosContactoCliente = isVisibilidadCeldaGuardarCambiosContactoCliente;
	}
		
	public ContactoClienteSessionBean getcontactoclienteSessionBean() {
		return this.contactoclienteSessionBean;
	}
	
	public void setcontactoclienteSessionBean(ContactoClienteSessionBean contactoclienteSessionBean) {
		this.contactoclienteSessionBean=contactoclienteSessionBean;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysContactoCliente(ContactoCliente contactocliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(contactocliente,null);
				this.setActualParaGuardarSucursalForeignKey(contactocliente,null);
				this.setActualParaGuardarClienteForeignKey(contactocliente,null);
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
	
	public void bugActualizarReferenciaActual(ContactoCliente contactocliente,ContactoCliente contactoclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalContactoCliente(contactocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		contactoclienteAux.setId(contactocliente.getId());
		contactoclienteAux.setVersionRow(contactocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessContactoCliente();
		
			int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = contactoclienteValidator.getInvalidValues(this.contactocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			contactoclienteLogic.setDatosCliente(datosCliente);
			contactoclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				contactoclienteAux=new  ContactoCliente();
				
				contactoclienteAux.setIsNew(true);
				contactoclienteAux.setIsChanged(true);
				
				contactoclienteAux.setContactoClienteOriginal(this.contactocliente);
				
				contactoclienteAux.setId(this.contactocliente.getId());	
				contactoclienteAux.setVersionRow(this.contactocliente.getVersionRow());	
				contactoclienteAux.setid_empresa(this.contactocliente.getid_empresa());	
				contactoclienteAux.setid_sucursal(this.contactocliente.getid_sucursal());	
				contactoclienteAux.setid_cliente(this.contactocliente.getid_cliente());	
				contactoclienteAux.setnombre_completo(this.contactocliente.getnombre_completo());	
				contactoclienteAux.setruc(this.contactocliente.getruc());	
				contactoclienteAux.setdireccion(this.contactocliente.getdireccion());	
				contactoclienteAux.settelefono(this.contactocliente.gettelefono());	
				contactoclienteAux.settelefono_celular(this.contactocliente.gettelefono_celular());	
				contactoclienteAux.setemail(this.contactocliente.getemail());	
				contactoclienteAux.setdescripcion(this.contactocliente.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.contactoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(contactoclienteAux,contactoclienteLogic.getContactoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contactoclienteAux,contactoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.contactoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contactoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclienteLogic.saveContactoClientes();//WithConnection
						//contactoclienteLogic.getSetVersionRowContactoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.contactocliente,contactoclienteAux);
					
					this.refrescarForeignKeysDescripcionesContactoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contactoclienteLogic.saveContactoClienteRelaciones(contactoclienteAux);//WithConnection
								//contactoclienteLogic.getSetVersionRowContactoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.contactocliente,contactoclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.contactoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(contactoclienteAux,contactoclienteLogic.getContactoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(contactoclienteAux,contactoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.contactocliente,contactoclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				contactoclienteAux=new  ContactoCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.contactoclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.contactoclienteSessionBean.getEsGuardarRelacionado() && this.contactocliente.getId()>=0)) {
						
					contactoclienteAux.setIsNew(false);
				}
				
				contactoclienteAux.setIsDeleted(false);
			
				contactoclienteAux.setId(this.contactocliente.getId());	
				contactoclienteAux.setVersionRow(this.contactocliente.getVersionRow());	
				contactoclienteAux.setid_empresa(this.contactocliente.getid_empresa());	
				contactoclienteAux.setid_sucursal(this.contactocliente.getid_sucursal());	
				contactoclienteAux.setid_cliente(this.contactocliente.getid_cliente());	
				contactoclienteAux.setnombre_completo(this.contactocliente.getnombre_completo());	
				contactoclienteAux.setruc(this.contactocliente.getruc());	
				contactoclienteAux.setdireccion(this.contactocliente.getdireccion());	
				contactoclienteAux.settelefono(this.contactocliente.gettelefono());	
				contactoclienteAux.settelefono_celular(this.contactocliente.gettelefono_celular());	
				contactoclienteAux.setemail(this.contactocliente.getemail());	
				contactoclienteAux.setdescripcion(this.contactocliente.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(contactoclienteAux,contactoclienteLogic.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contactoclienteAux,contactoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.contactoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contactoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclienteLogic.saveContactoClientes();//WithConnection
						//contactoclienteLogic.getSetVersionRowContactoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.contactocliente,contactoclienteAux);
					
					this.refrescarForeignKeysDescripcionesContactoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contactoclienteLogic.saveContactoClienteRelaciones(contactoclienteAux);//WithConnection
								//contactoclienteLogic.getSetVersionRowContactoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.contactocliente,contactoclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.contactoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(contactoclienteAux,contactoclienteLogic.getContactoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(contactoclienteAux,contactoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.contactocliente,contactoclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				contactoclienteAux=new  ContactoCliente();
				
				contactoclienteAux.setIsNew(false);
				contactoclienteAux.setIsChanged(false);
				
				contactoclienteAux.setIsDeleted(true);
				
				contactoclienteAux.setId(this.contactocliente.getId());	
				contactoclienteAux.setVersionRow(this.contactocliente.getVersionRow());	
				contactoclienteAux.setid_empresa(this.contactocliente.getid_empresa());	
				contactoclienteAux.setid_sucursal(this.contactocliente.getid_sucursal());	
				contactoclienteAux.setid_cliente(this.contactocliente.getid_cliente());	
				contactoclienteAux.setnombre_completo(this.contactocliente.getnombre_completo());	
				contactoclienteAux.setruc(this.contactocliente.getruc());	
				contactoclienteAux.setdireccion(this.contactocliente.getdireccion());	
				contactoclienteAux.settelefono(this.contactocliente.gettelefono());	
				contactoclienteAux.settelefono_celular(this.contactocliente.gettelefono_celular());	
				contactoclienteAux.setemail(this.contactocliente.getemail());	
				contactoclienteAux.setdescripcion(this.contactocliente.getdescripcion());	
				
				if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.contactoclienteAux.getId()>=0) {	
						this.contactoclientesEliminados.add(contactoclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(contactoclienteAux,contactoclienteLogic.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contactoclienteAux,contactoclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.contactoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contactoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclienteLogic.saveContactoClientes();//WithConnection
						//contactoclienteLogic.getSetVersionRowContactoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contactoclienteLogic.saveContactoClienteRelaciones(contactoclienteAux);//WithConnection
								//contactoclienteLogic.getSetVersionRowContactoClientes();//WithConnection
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
							if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.contactoclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(contactoclienteAux,contactoclienteLogic.getContactoClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(contactoclienteAux,contactoclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getContactoClientes().addAll(this.contactoclientesEliminados);
					
					contactoclienteLogic.saveContactoClientes();//WithConnection
					//contactoclienteLogic.getSetVersionRowContactoClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesContactoCliente();
				
				this.contactoclientesEliminados= new ArrayList<ContactoCliente>();		
			}
			
			if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Contacto Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.contactocliente=contactoclienteAux;
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
      		//this.finishProcessContactoCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(ContactoCliente contactoclienteLocal) throws Exception {
		
		if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ContactoCliente contactoclienteLocal) throws Exception {	
		if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				contactoclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				contactoclienteLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				contactoclienteLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarContactoClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = contactoclienteValidator.getInvalidValues(this.contactocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ContactoCliente contactocliente,List<ContactoCliente> contactoclientes) throws Exception {
		try	{		
			ContactoClienteConstantesFunciones.actualizarLista(contactocliente,contactoclientes,this.contactoclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ContactoCliente contactocliente,List<ContactoCliente> contactoclientes) throws Exception {
		try	{			
			ContactoClienteConstantesFunciones.actualizarSelectedLista(contactocliente,contactoclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ContactoCliente> contactoclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				contactoclientesLocal=this.contactoclienteLogic.getContactoClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				contactoclientesLocal=this.contactoclientes;
			}
			//ARCHITECTURE
		
			for(ContactoCliente contactoclienteLocal:contactoclientesLocal) {
				if(this.permiteMantenimiento(contactoclienteLocal) && contactoclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ContactoClienteConstantesFunciones.getContactoClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelid_empresaContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelid_sucursalContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelid_clienteContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelnombre_completoContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelrucContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabeldireccionContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabeltelefonoContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.TELEFONOCELULAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabeltelefono_celularContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelemailContactoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContactoClienteConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabeldescripcionContactoCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabelid_empresaContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabelid_sucursalContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabelid_clienteContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabelnombre_completoContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabelrucContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabeldireccionContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabeltelefonoContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabeltelefono_celularContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabelemailContactoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContactoCliente.jLabeldescripcionContactoCliente,"");
		
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
		this.iIdNuevoContactoCliente--;	
		
		
		this.contactoclienteAux=new ContactoCliente();
		
		this.contactoclienteAux.setId(this.iIdNuevoContactoCliente);
		this.contactoclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.contactoclienteLogic.getContactoClientes().add(this.contactoclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.contactoclientes.add(this.contactoclienteAux);
		}
		//ARCHITECTURE
		
		this.contactocliente=this.contactoclienteAux;
		
		if(ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioContactoCliente(this.contactocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyContactoCliente(this.contactocliente);
		}
				
		//this.setDefaultControlesContactoCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyContactoCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyContactoCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyContactoCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualContactoCliente(this.contactoclienteBean,this.contactocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ContactoClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
			classes=ContactoClienteConstantesFunciones.getClassesRelationshipsOfContactoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.contactoclienteReturnGeneral=contactoclienteLogic.procesarEventosContactoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.contactoclienteLogic.getContactoClientes(),this.contactocliente,this.contactoclienteParameterGeneral,this.isEsNuevoContactoCliente,classes);//this.contactoclienteLogic.getContactoCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanContactoCliente(this.contactoclienteReturnGeneral,this.contactoclienteBean,false);
		
		if(this.contactoclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyContactoCliente(this.contactoclienteReturnGeneral.getContactoCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioContactoCliente(this.contactoclienteReturnGeneral.getContactoCliente());
		}
		
		if(this.contactoclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioContactoCliente(this.contactoclienteReturnGeneral.getContactoCliente(),classes);//this.contactoclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyContactoCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyContactoCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ContactoClienteBeanSwingJInternalFrameAdditional.RecargarFormContactoCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingContactoCliente(false);
						
			if(contactoclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContactoCliente();
			}
			
			this.actualizarVisualTableDatosContactoCliente();
			
			this.jTableDatosContactoCliente.setRowSelectionInterval(this.getIndiceNuevoContactoCliente(), this.getIndiceNuevoContactoCliente());
			
			this.seleccionarFilaTablaContactoClienteActual();
						
			this.actualizarEstadoCeldasBotonesContactoCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesContactoCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormContactoCliente.jTextAreanombre_completoContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activarnombre_completoContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextFieldrucContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activarrucContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextAreadireccionContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activardireccionContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefonoContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activartelefonoContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefono_celularContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activartelefono_celularContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextFieldemailContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activaremailContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextAreadescripcionContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activardescripcionContactoCliente);	
		//
		this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activarid_empresaContactoCliente);//
		this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activarid_sucursalContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setEnabled(isHabilitar && this.contactoclienteConstantesFunciones.activarid_clienteContactoCliente);
	};
	
	public void setDefaultControlesContactoCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoContactoCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.contactoclienteSessionBean.setConGuardarRelaciones(true);			
			this.contactoclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.setVisible(true);
			
					
		} else {
			//this.contactoclienteSessionBean.setConGuardarRelaciones(false);			
			this.contactoclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoContactoCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
				if(contactoclienteAux.getId().equals(this.iIdNuevoContactoCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ContactoCliente contactoclienteAux:this.contactoclientes) {
				if(contactoclienteAux.getId().equals(this.iIdNuevoContactoCliente)) {
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
	
	public int getIndiceActualContactoCliente(ContactoCliente contactocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
				if(contactoclienteAux.getId().equals(contactocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ContactoCliente contactoclienteAux:this.contactoclientes) {
				if(contactoclienteAux.getId().equals(contactocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalContactoCliente(ContactoCliente contactoclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
				if(contactoclienteAux.getContactoClienteOriginal().getId().equals(contactoclienteOriginal.getId())) {
					existe=true;
					contactoclienteOriginal.setId(contactoclienteAux.getId());
					contactoclienteOriginal.setVersionRow(contactoclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ContactoCliente contactoclienteAux:this.contactoclientes) {
				if(contactoclienteAux.getContactoClienteOriginal().getId().equals(contactoclienteOriginal.getId())) {
					existe=true;
					contactoclienteOriginal.setId(contactoclienteAux.getId());
					contactoclienteOriginal.setVersionRow(contactoclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosContactoCliente(Boolean esParaCancelar) throws Exception {
		contactoclientesAux=new ArrayList<ContactoCliente>();
		contactoclienteAux=new ContactoCliente();
		
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
					if(contactoclienteAux.getId()<0) {
						contactoclientesAux.add(contactoclienteAux);
					}		
				}
				this.iIdNuevoContactoCliente=0L;
				this.contactoclienteLogic.getContactoClientes().removeAll(contactoclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ContactoCliente contactoclienteAux:this.contactoclientes) {
					if(contactoclienteAux.getId()<0) {
						contactoclientesAux.add(contactoclienteAux);
					}		
				}
				this.iIdNuevoContactoCliente=0L;
				this.contactoclientes.removeAll(contactoclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoContactoCliente 
					&& this.contactoclienteLogic.getContactoClientes().size()>0
					) {
					contactoclienteAux=this.contactoclienteLogic.getContactoClientes().get(this.contactoclienteLogic.getContactoClientes().size() - 1);
				
					if(contactoclienteAux.getId()<0) {
						this.contactoclienteLogic.getContactoClientes().remove(contactoclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoContactoCliente && this.contactoclientes.size()>0) {
					contactoclienteAux=this.contactoclientes.get(this.contactoclientes.size() - 1);
				
					if(contactoclienteAux.getId()<0) {
						this.contactoclientes.remove(contactoclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoContactoCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(contactocliente.getId()<0) {
				this.contactoclienteLogic.getContactoClientes().remove(this.contactocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(contactocliente.getId()<0) {
				this.contactoclientes.remove(this.contactocliente);
			}
		}			
	}
	
	public void setEstadosInicialesContactoCliente(List<ContactoCliente> contactoclientesAux) throws Exception {
		ContactoClienteConstantesFunciones.setEstadosInicialesContactoCliente(contactoclientesAux);
	}
	
	public void setEstadosInicialesContactoCliente(ContactoCliente contactoclienteAux) throws Exception {
		ContactoClienteConstantesFunciones.setEstadosInicialesContactoCliente(contactoclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarContactoClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesContactoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarContactoClienteActual()) {
				if(!this.isEsNuevoContactoCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesContactoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoContactoCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarContactoClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Contacto Cliente ?", "MANTENIMIENTO DE Contacto Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesContactoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ContactoCliente contactocliente) throws Exception {
		ContactoClienteConstantesFunciones.seleccionarAsignar(this.contactocliente,contactocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarContactoCliente=this.isPermisoActualizarOriginalContactoCliente;
			
			
			this.seleccionarAsignar(contactocliente);
			
			

			idClienteActual=contactocliente.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ContactoClienteConstantesFunciones.quitarEspaciosContactoCliente(this.contactocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesContactoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.contactoclienteSessionBean.setsFuncionBusquedaRapida(this.contactoclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoContactoCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosContactoCliente(esParaCancelar);				
				this.cancelarNuevoContactoCliente(esParaCancelar);								
			}
			
			this.contactocliente=new ContactoCliente();
			
			this.inicializarContactoCliente();
			
			this.actualizarEstadoCeldasBotonesContactoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarContactoCliente() throws Exception {
		try {
			ContactoClienteConstantesFunciones.inicializarContactoCliente(this.contactocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.contactoclienteLogic.getContactoClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteContactoClientes(String sAccionBusqueda,List<ContactoCliente> contactoclientesParaReportes) throws Exception {
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
					sPathReporteFinal="ContactoCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ContactoClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ContactoClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ContactoCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Contacto Clientes");		
		parameters.put("busquedapor", ContactoClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceContactoCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ContactoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ContactoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceContactoCliente=new JRBeanArrayDataSource(ContactoClienteJInternalFrame.TraerContactoClienteBeans(contactoclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceContactoCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ContactoClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ContactoClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ContactoClienteBean.TraerContactoClienteBeans(contactoclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteContactoClientes(sAccionBusqueda,sTipoArchivoReporte,contactoclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalContactoClientes(sAccionBusqueda,sTipoArchivoReporte,contactoclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoContactoClienteActionPerformed(null);
					//this.generarExcelReporteContactoClientes(sAccionBusqueda,sTipoArchivoReporte,contactoclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalContactoClientes(sAccionBusqueda,sTipoArchivoReporte,contactoclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesContactoClientes(sAccionBusqueda,sTipoArchivoReporte,contactoclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesContactoClientes(sAccionBusqueda,sTipoArchivoReporte,contactoclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteContactoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ContactoCliente> contactoclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contactocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ContactoClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderContactoCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ContactoCliente contactocliente : contactoclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ContactoClienteConstantesFunciones.generarExcelReporteDataContactoCliente("NORMAL",row,workbook,contactocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderContactoCliente(String sTipo,Row row,Workbook workbook) {
		
		ContactoClienteConstantesFunciones.generarExcelReporteHeaderContactoCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalContactoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ContactoCliente> contactoclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contactocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ContactoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ContactoCliente contactocliente : contactoclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ContactoClienteConstantesFunciones.getContactoClienteDescripcion(contactocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.gettelefono_celular());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.getemail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContactoClienteConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contactocliente.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesContactoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ContactoCliente> contactoclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ContactoCliente> contactoclientesRespaldo=null;
		
		classes=ContactoClienteConstantesFunciones.getClassesRelationshipsOfContactoCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.contactoclienteLogic.setDatosCliente(this.datosCliente);
		this.contactoclienteLogic.setDatosDeep(this.datosDeep);
		this.contactoclienteLogic.setIsConDeep(true);
		
		contactoclientesRespaldo=this.contactoclienteLogic.getContactoClientes();
		
		this.contactoclienteLogic.setContactoClientes(contactoclientesParaReportes);	
		this.contactoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		contactoclientesParaReportes=this.contactoclienteLogic.getContactoClientes();
		this.contactoclienteLogic.setContactoClientes(contactoclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contactocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ContactoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderContactoCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ContactoCliente contactocliente : contactoclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderContactoCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ContactoClienteConstantesFunciones.generarExcelReporteDataContactoCliente("NORMAL",row,workbook,contactocliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ContactoClienteConstantesFunciones.getContactoClienteDescripcion(contactocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoContactoCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessContactoCliente() throws Exception {		
		this.startProcessContactoCliente(true);
	}
	
	public void startProcessContactoCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasContactoCliente ,this.jPanelParametrosReportesContactoCliente, this.jScrollPanelDatosContactoCliente,this.jPanelPaginacionContactoCliente, this.jScrollPanelDatosEdicionContactoCliente, this.jPanelAccionesContactoCliente,this.jPanelAccionesFormularioContactoCliente,this.jmenuBarContactoCliente,this.jmenuBarDetalleContactoCliente,this.jTtoolBarContactoCliente,this.jTtoolBarDetalleContactoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasContactoCliente=this.jTabbedPaneBusquedasContactoCliente; 
		
		final JPanel jPanelParametrosReportesContactoCliente=this.jPanelParametrosReportesContactoCliente;
		//final JScrollPane jScrollPanelDatosContactoCliente=this.jScrollPanelDatosContactoCliente;
		final JTable jTableDatosContactoCliente=this.jTableDatosContactoCliente;		
		final JPanel jPanelPaginacionContactoCliente=this.jPanelPaginacionContactoCliente;
		//final JScrollPane jScrollPanelDatosEdicionContactoCliente=this.jScrollPanelDatosEdicionContactoCliente;
		final JPanel jPanelAccionesContactoCliente=this.jPanelAccionesContactoCliente;
		
		JPanel jPanelCamposAuxiliarContactoCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarContactoCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			jPanelCamposAuxiliarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jPanelCamposContactoCliente;
			jPanelAccionesFormularioAuxiliarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jPanelAccionesFormularioContactoCliente;
		}
		
		final JPanel jPanelCamposContactoCliente=jPanelCamposAuxiliarContactoCliente;
		final JPanel jPanelAccionesFormularioContactoCliente=jPanelAccionesFormularioAuxiliarContactoCliente;
		
		
		final JMenuBar jmenuBarContactoCliente=this.jmenuBarContactoCliente;
		final JToolBar jTtoolBarContactoCliente=this.jTtoolBarContactoCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarContactoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarContactoCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			jmenuBarDetalleAuxiliarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jmenuBarDetalleContactoCliente;
			jTtoolBarDetalleAuxiliarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jTtoolBarDetalleContactoCliente;
		}
		
		final JMenuBar jmenuBarDetalleContactoCliente=jmenuBarDetalleAuxiliarContactoCliente;
		final JToolBar jTtoolBarDetalleContactoCliente=jTtoolBarDetalleAuxiliarContactoCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasContactoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesContactoCliente;
			processRunnable.jTableDatos=jTableDatosContactoCliente;
			processRunnable.jPanelCampos=jPanelCamposContactoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionContactoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesContactoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioContactoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarContactoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleContactoCliente;
			processRunnable.jTtoolBar=jTtoolBarContactoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleContactoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasContactoCliente ,jPanelParametrosReportesContactoCliente,jTableDatosContactoCliente, /*jScrollPanelDatosContactoCliente,*/jPanelCamposContactoCliente,jPanelPaginacionContactoCliente, /*jScrollPanelDatosEdicionContactoCliente,*/ jPanelAccionesContactoCliente,jPanelAccionesFormularioContactoCliente,jmenuBarContactoCliente,jmenuBarDetalleContactoCliente,jTtoolBarContactoCliente,jTtoolBarDetalleContactoCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasContactoCliente ,jPanelParametrosReportesContactoCliente, jScrollPanelDatosContactoCliente,jPanelPaginacionContactoCliente, jScrollPanelDatosEdicionContactoCliente, jPanelAccionesContactoCliente,jPanelAccionesFormularioContactoCliente,jmenuBarContactoCliente,jmenuBarDetalleContactoCliente,jTtoolBarContactoCliente,jTtoolBarDetalleContactoCliente);
						
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
	
	public void finishProcessContactoCliente() {// throws Exception 
		this.finishProcessContactoCliente(true);
	}
	
	public void finishProcessContactoCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasContactoCliente ,this.jPanelParametrosReportesContactoCliente, this.jScrollPanelDatosContactoCliente,this.jPanelPaginacionContactoCliente, this.jScrollPanelDatosEdicionContactoCliente, this.jPanelAccionesContactoCliente,this.jPanelAccionesFormularioContactoCliente,this.jmenuBarContactoCliente,this.jmenuBarDetalleContactoCliente,this.jTtoolBarContactoCliente,this.jTtoolBarDetalleContactoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasContactoCliente=this.jTabbedPaneBusquedasContactoCliente; 
		
		final JPanel jPanelParametrosReportesContactoCliente=this.jPanelParametrosReportesContactoCliente;
		//final JScrollPane jScrollPanelDatosContactoCliente=this.jScrollPanelDatosContactoCliente;
		final JTable jTableDatosContactoCliente=this.jTableDatosContactoCliente;		
		final JPanel jPanelPaginacionContactoCliente=this.jPanelPaginacionContactoCliente;
		//final JScrollPane jScrollPanelDatosEdicionContactoCliente=this.jScrollPanelDatosEdicionContactoCliente;
		final JPanel jPanelAccionesContactoCliente=this.jPanelAccionesContactoCliente;
		
		JPanel jPanelCamposAuxiliarContactoCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarContactoCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			jPanelCamposAuxiliarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jPanelCamposContactoCliente;
			jPanelAccionesFormularioAuxiliarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jPanelAccionesFormularioContactoCliente;
		}
		
		final JPanel jPanelCamposContactoCliente=jPanelCamposAuxiliarContactoCliente;
		final JPanel jPanelAccionesFormularioContactoCliente=jPanelAccionesFormularioAuxiliarContactoCliente;
		
		
		final JMenuBar jmenuBarContactoCliente=this.jmenuBarContactoCliente;		
		final JToolBar jTtoolBarContactoCliente=this.jTtoolBarContactoCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarContactoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarContactoCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			jmenuBarDetalleAuxiliarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jmenuBarDetalleContactoCliente;
			jTtoolBarDetalleAuxiliarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jTtoolBarDetalleContactoCliente;		
		}
		
		final JMenuBar jmenuBarDetalleContactoCliente=jmenuBarDetalleAuxiliarContactoCliente;
		final JToolBar jTtoolBarDetalleContactoCliente=jTtoolBarDetalleAuxiliarContactoCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasContactoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesContactoCliente;
			processRunnable.jTableDatos=jTableDatosContactoCliente;
			processRunnable.jPanelCampos=jPanelCamposContactoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionContactoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesContactoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioContactoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarContactoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleContactoCliente;
			processRunnable.jTtoolBar=jTtoolBarContactoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleContactoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasContactoCliente ,jPanelParametrosReportesContactoCliente, jTableDatosContactoCliente,/*jScrollPanelDatosContactoCliente,*/jPanelCamposContactoCliente,jPanelPaginacionContactoCliente, /*jScrollPanelDatosEdicionContactoCliente,*/ jPanelAccionesContactoCliente,jPanelAccionesFormularioContactoCliente,jmenuBarContactoCliente,jmenuBarDetalleContactoCliente,jTtoolBarContactoCliente,jTtoolBarDetalleContactoCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesContactoCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarContactoCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuContactoCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarContactoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarContactoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleContactoCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuContactoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarContactoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleContactoCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.contactoclienteConstantesFunciones.getsFinalQueryContactoCliente();
		String  finalQueryPaginacionTodos=this.contactoclienteConstantesFunciones.getsFinalQueryContactoCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ContactoClienteConstantesFunciones.getArrayColumnasGlobalesNoContactoCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ContactoClienteConstantesFunciones.getArrayColumnasGlobalesContactoCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ContactoClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.contactoclientesEliminados= new ArrayList<ContactoCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessContactoCliente();
		
				///*ContactoClienteSessionBean*/this.contactoclienteSessionBean=new ContactoClienteSessionBean();
			
			if(this.contactoclienteSessionBean==null) {
				this.contactoclienteSessionBean=new ContactoClienteSessionBean();
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
					this.iNumeroPaginacion=ContactoClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ContactoClienteConstantesFunciones.getClassesForeignKeysOfContactoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/contactocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			contactoclientesAux= new ArrayList<ContactoCliente>();
			
				
			contactoclienteLogic.setDatosCliente(this.datosCliente);
			contactoclienteLogic.setDatosDeep(this.datosDeep);
			contactoclienteLogic.setIsConDeep(true);
			
			
			contactoclienteLogic.getContactoClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					contactoclienteLogic.getTodosContactoClientes(finalQueryGlobal,pagination);
					
					//contactoclienteLogic.getTodosContactoClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(contactoclienteLogic.getContactoClientes()==null|| contactoclienteLogic.getContactoClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contactoclientesAux= new ArrayList<ContactoCliente>();
							contactoclientesAux.addAll(contactoclienteLogic.getContactoClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclientesAux= new ArrayList<ContactoCliente>();
							contactoclientesAux.addAll(contactoclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contactoclienteLogic.getTodosContactoClientes(finalQueryGlobal+"",this.pagination);												
							
							//contactoclienteLogic.getTodosContactoClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteContactoClientes("Todos",contactoclienteLogic.getContactoClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contactoclienteLogic.setContactoClientes(new ArrayList<ContactoCliente>());					
							contactoclienteLogic.getContactoClientes().addAll(contactoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclientes=new ArrayList<ContactoCliente>();
							contactoclientes.addAll(contactoclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idContactoCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idContactoCliente=this.idActual;
				
				} else if(this.idContactoClienteActual!=null && this.idContactoClienteActual!=0L) {
					idContactoCliente=idContactoClienteActual;
				}
				
					
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndicePorId(idContactoCliente);
				
				this.contactoclientes=new ArrayList<ContactoCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					contactoclienteLogic.getEntity(idContactoCliente);
					
					//contactoclienteLogic.getEntityWithConnection(idContactoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contactoclienteLogic.setContactoClientes(new ArrayList<ContactoCliente>());
					contactoclienteLogic.getContactoClientes().add(contactoclienteLogic.getContactoCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contactoclientes=new ArrayList<ContactoCliente>();
					this.contactoclientes.add(contactocliente);
				}
				
				if(contactoclienteLogic.getContactoCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					contactoclienteLogic.getContactoClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=contactoclienteLogic.getContactoClientes()==null||contactoclienteLogic.getContactoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=contactoclientes==null|| contactoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclientesAux=new ArrayList<ContactoCliente>();
						contactoclientesAux.addAll(contactoclienteLogic.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclientesAux=new ArrayList<ContactoCliente>();
							contactoclientesAux.addAll(contactoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							contactoclienteLogic.getContactoClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteContactoClientes("FK_IdCliente",contactoclienteLogic.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteContactoClientes("FK_IdCliente",contactoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclienteLogic.setContactoClientes(new ArrayList<ContactoCliente>());
						contactoclienteLogic.getContactoClientes().addAll(contactoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclientes=new ArrayList<ContactoCliente>();
							contactoclientes.addAll(contactoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					contactoclienteLogic.getContactoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=contactoclienteLogic.getContactoClientes()==null||contactoclienteLogic.getContactoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=contactoclientes==null|| contactoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclientesAux=new ArrayList<ContactoCliente>();
						contactoclientesAux.addAll(contactoclienteLogic.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclientesAux=new ArrayList<ContactoCliente>();
							contactoclientesAux.addAll(contactoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							contactoclienteLogic.getContactoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteContactoClientes("FK_IdEmpresa",contactoclienteLogic.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteContactoClientes("FK_IdEmpresa",contactoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclienteLogic.setContactoClientes(new ArrayList<ContactoCliente>());
						contactoclienteLogic.getContactoClientes().addAll(contactoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclientes=new ArrayList<ContactoCliente>();
							contactoclientes.addAll(contactoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					contactoclienteLogic.getContactoClientesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=contactoclienteLogic.getContactoClientes()==null||contactoclienteLogic.getContactoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=contactoclientes==null|| contactoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclientesAux=new ArrayList<ContactoCliente>();
						contactoclientesAux.addAll(contactoclienteLogic.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclientesAux=new ArrayList<ContactoCliente>();
							contactoclientesAux.addAll(contactoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							contactoclienteLogic.getContactoClientesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContactoClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteContactoClientes("FK_IdSucursal",contactoclienteLogic.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteContactoClientes("FK_IdSucursal",contactoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclienteLogic.setContactoClientes(new ArrayList<ContactoCliente>());
						contactoclienteLogic.getContactoClientes().addAll(contactoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclientes=new ArrayList<ContactoCliente>();
							contactoclientes.addAll(contactoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesContactoCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessContactoCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=contactoclienteLogic.getContactoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contactoclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=contactoclienteLogic.getContactoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contactoclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ContactoCliente contactocliente) {
		Boolean permite=true;
		
		if(this.contactocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ContactoClienteConstantesFunciones.getOrderByListaContactoCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ContactoClienteConstantesFunciones.getOrderByListaContactoCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ContactoCliente contactocliente:contactoclienteLogic.getContactoClientes()) {
				if(contactocliente.getsType().equals(Constantes2.S_TOTALES)) {
					contactoclienteTotales=contactocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ContactoCliente contactocliente:this.contactoclientes) {
				if(contactocliente.getsType().equals(Constantes2.S_TOTALES)) {
					contactoclienteTotales=contactocliente;
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
			this.contactoclienteAux=new ContactoCliente();
			this.contactoclienteAux.setsType(Constantes2.S_TOTALES);
			this.contactoclienteAux.setIsNew(false);
			this.contactoclienteAux.setIsChanged(false);
			this.contactoclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ContactoClienteConstantesFunciones.TotalizarValoresFilaContactoCliente(this.contactoclienteLogic.getContactoClientes(),this.contactoclienteAux);
				
				this.contactoclienteLogic.getContactoClientes().add(this.contactoclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ContactoClienteConstantesFunciones.TotalizarValoresFilaContactoCliente(this.contactoclientes,this.contactoclienteAux);
				
				this.contactoclientes.add(this.contactoclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		contactoclienteTotales=new ContactoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.contactoclienteLogic.getContactoClientes().remove(contactoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.contactoclientes.remove(contactoclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		contactoclienteTotales=new ContactoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ContactoCliente contactocliente:contactoclienteLogic.getContactoClientes()) {
				if(contactocliente.getsType().equals(Constantes2.S_TOTALES)) {
					contactoclienteTotales=contactocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ContactoClienteConstantesFunciones.TotalizarValoresFilaContactoCliente(this.contactoclienteLogic.getContactoClientes(),contactoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ContactoCliente contactocliente:this.contactoclientes) {
				if(contactocliente.getsType().equals(Constantes2.S_TOTALES)) {
					contactoclienteTotales=contactocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ContactoClienteConstantesFunciones.TotalizarValoresFilaContactoCliente(this.contactoclientes,contactoclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getContactoClientesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getContactoClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getContactoClientesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getContactoClientesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contactoclienteLogic.getContactoClientesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getContactoClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contactoclienteLogic.getContactoClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getContactoClientesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contactoclienteLogic.getContactoClientesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosContactoCliente() {
		this.isPermisoTodoContactoCliente=false;
		this.isPermisoNuevoContactoCliente=false;
		this.isPermisoActualizarContactoCliente=false;
		this.isPermisoActualizarOriginalContactoCliente=false;
		this.isPermisoEliminarContactoCliente=false;
		this.isPermisoGuardarCambiosContactoCliente=false;
		this.isPermisoConsultaContactoCliente=false;
		this.isPermisoBusquedaContactoCliente=false;
		this.isPermisoReporteContactoCliente=false;		
		this.isPermisoOrdenContactoCliente=false;		
		this.isPermisoPaginacionMedioContactoCliente=false;		
		this.isPermisoPaginacionAltoContactoCliente=false;
		this.isPermisoPaginacionTodoContactoCliente=false;
		this.isPermisoCopiarContactoCliente=false;		
		this.isPermisoVerFormContactoCliente=false;		
		this.isPermisoDuplicarContactoCliente=false;		
		this.isPermisoOrdenContactoCliente=false;		
	}
	
	public void setPermisosUsuarioContactoCliente(Boolean isPermiso) {
		this.isPermisoTodoContactoCliente=isPermiso;
		this.isPermisoNuevoContactoCliente=isPermiso;
		this.isPermisoActualizarContactoCliente=isPermiso;
		this.isPermisoActualizarOriginalContactoCliente=isPermiso;
		this.isPermisoEliminarContactoCliente=isPermiso;
		this.isPermisoGuardarCambiosContactoCliente=isPermiso;
		this.isPermisoConsultaContactoCliente=isPermiso;
		this.isPermisoBusquedaContactoCliente=isPermiso;
		this.isPermisoReporteContactoCliente=isPermiso;
		this.isPermisoOrdenContactoCliente=isPermiso;		
		this.isPermisoPaginacionMedioContactoCliente=isPermiso;		
		this.isPermisoPaginacionAltoContactoCliente=isPermiso;		
		this.isPermisoPaginacionTodoContactoCliente=isPermiso;		
		this.isPermisoCopiarContactoCliente=isPermiso;		
		this.isPermisoVerFormContactoCliente=isPermiso;		
		this.isPermisoDuplicarContactoCliente=isPermiso;
		this.isPermisoOrdenContactoCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioContactoCliente(Boolean isPermiso) {
		//this.isPermisoTodoContactoCliente=isPermiso;
		this.isPermisoNuevoContactoCliente=isPermiso;
		this.isPermisoActualizarContactoCliente=isPermiso;
		this.isPermisoActualizarOriginalContactoCliente=isPermiso;
		this.isPermisoEliminarContactoCliente=isPermiso;
		this.isPermisoGuardarCambiosContactoCliente=isPermiso;
		//this.isPermisoConsultaContactoCliente=isPermiso;
		//this.isPermisoBusquedaContactoCliente=isPermiso;
		//this.isPermisoReporteContactoCliente=isPermiso;
		//this.isPermisoOrdenContactoCliente=isPermiso;		
		//this.isPermisoPaginacionMedioContactoCliente=isPermiso;		
		//this.isPermisoPaginacionAltoContactoCliente=isPermiso;		
		//this.isPermisoPaginacionTodoContactoCliente=isPermiso;		
		//this.isPermisoCopiarContactoCliente=isPermiso;		
		//this.isPermisoDuplicarContactoCliente=isPermiso;
		//this.isPermisoOrdenContactoCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioContactoClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ContactoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebContactoCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioContactoClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioContactoClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionContactoClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioContactoClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioContactoCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ContactoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ContactoClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoContactoCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarContactoCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalContactoCliente=this.isPermisoActualizarContactoCliente;
			this.isPermisoEliminarContactoCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosContactoCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaContactoCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaContactoCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoContactoCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteContactoCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenContactoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioContactoCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoContactoCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoContactoCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarContactoCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormContactoCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarContactoCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenContactoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosContactoCliente.setToolTipText(this.jTableDatosContactoCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioContactoCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioContactoCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ContactoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ContactoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioContactoCliente() throws Exception {
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
	public void inicializarCombosForeignKeyContactoClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyContactoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ContactoClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyContactoClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyContactoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ContactoClienteParameterReturnGeneral contactoclienteReturnGeneral=new ContactoClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.contactoclienteConstantesFunciones.cargarid_empresaContactoCliente)
					 || (this.esRecargarFks && this.contactoclienteConstantesFunciones.cargarid_empresaContactoCliente)) {

					if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+contactoclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.contactoclienteConstantesFunciones.cargarid_sucursalContactoCliente)
					 || (this.esRecargarFks && this.contactoclienteConstantesFunciones.cargarid_sucursalContactoCliente)) {

					if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+contactoclienteSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.contactoclienteConstantesFunciones.cargarid_clienteContactoCliente)
					 || (this.esRecargarFks && this.contactoclienteConstantesFunciones.cargarid_clienteContactoCliente)) {

					if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+contactoclienteSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				contactoclienteReturnGeneral=contactoclienteLogic.cargarCombosLoteForeignKeyContactoCliente(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=contactoclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=contactoclienteReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=contactoclienteReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyContactoCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.contactoclienteSessionBean==null) {
				this.contactoclienteSessionBean=new ContactoClienteSessionBean();
			}

			if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.contactoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyContactoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyContactoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyContactoCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyContactoCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyContactoCliente(ContactoCliente contactocliente)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(contactocliente.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyContactoCliente(ContactoCliente contactocliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(contactocliente.getCliente()!=null && !sTipoEvento.equals("id_clienteContactoCliente")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(contactocliente.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyContactoCliente()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.contactoclienteConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyContactoCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyContactoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyContactoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroContactoCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyContactoCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyContactoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyContactoCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ContactoClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ContactoClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ContactoClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.contactoclienteSessionBean=new ContactoClienteSessionBean(); 
		this.contactoclienteConstantesFunciones=new ContactoClienteConstantesFunciones(); 
		this.contactoclienteBean=new ContactoCliente();//(this.contactoclienteConstantesFunciones); 		
		this.contactoclienteReturnGeneral=new ContactoClienteParameterReturnGeneral(); 
		
		this.contactoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contactoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ContactoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ContactoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ContactoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessContactoCliente(true);
			
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
			
			this.contactoclienteConstantesFunciones=new ContactoClienteConstantesFunciones(); 
			this.contactoclienteBean=new ContactoCliente();//this.contactoclienteConstantesFunciones); 			
			this.contactoclienteReturnGeneral=new ContactoClienteParameterReturnGeneral(); 
		
			ContactoClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Contacto Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.contactocliente=new ContactoCliente();
			this.contactoclientes = new ArrayList<ContactoCliente>();
			this.contactoclientesAux = new ArrayList<ContactoCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic=new ContactoClienteLogic();
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.contactoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.contactoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormContactoCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoContactoCliente);	
					}
					
					if(this.jInternalFrameImportacionContactoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionContactoCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByContactoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByContactoCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormContactoCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormContactoCliente);
				this.jInternalFrameDetalleFormContactoCliente.setVisible(false);
				this.jInternalFrameDetalleFormContactoCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoContactoCliente);
					this.jInternalFrameReporteDinamicoContactoCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoContactoCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionContactoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionContactoCliente);
					this.jInternalFrameImportacionContactoCliente.setVisible(false);
					this.jInternalFrameImportacionContactoCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByContactoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByContactoCliente);
					this.jInternalFrameOrderByContactoCliente.setVisible(false);
					this.jInternalFrameOrderByContactoCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idContactoClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ContactoClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.contactoclienteReturnGeneral=new ContactoClienteParameterReturnGeneral();
			
			this.contactoclienteParameterGeneral=new ContactoClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.contactoclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ContactoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ContactoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.contactoclienteSessionBean.getEsGuardarRelacionado(),this.contactoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ContactoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.contactoclienteSessionBean.getEsGuardarRelacionado(),this.contactoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoContactoCliente=false;
			this.isVisibilidadCeldaDuplicarContactoCliente=true;
			this.isVisibilidadCeldaCopiarContactoCliente=true;
			this.isVisibilidadCeldaVerFormContactoCliente=true;
			this.isVisibilidadCeldaOrdenContactoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
			this.isVisibilidadCeldaModificarContactoCliente=false;
			this.isVisibilidadCeldaActualizarContactoCliente=false;
			this.isVisibilidadCeldaEliminarContactoCliente=false;
			this.isVisibilidadCeldaCancelarContactoCliente=false;
			this.isVisibilidadCeldaGuardarContactoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesContactoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosContactoCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioContactoCliente(false);
			
			this.setPermisosUsuarioContactoCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contactoclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.contactoclienteSessionBean.getEsGuardarRelacionado() && this.contactoclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioContactoClienteClasesRelacionadas();
			}
			
			if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioContactoClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosContactoCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualContactoCliente();
			}
			
			if(!this.isPermisoBusquedaContactoCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasContactoCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioContactoCliente,this.isPermisoPaginacionMedioContactoCliente,this.isPermisoPaginacionTodoContactoCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ContactoClienteConstantesFunciones.getTiposSeleccionarContactoCliente());
				
				this.tiposColumnasSelect=ContactoClienteConstantesFunciones.getTiposSeleccionarContactoCliente(true);
				
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
			//if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioContactoCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioContactoCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioContactoCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesContactoCliente() ;
			
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
				contactoclienteImplementable= (ContactoClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ContactoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				contactoclienteImplementableHome= (ContactoClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ContactoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.contactoclientes= new ArrayList<ContactoCliente>();
			this.contactoclientesEliminados= new ArrayList<ContactoCliente>();
						
			this.isEsNuevoContactoCliente=false;
			this.esParaAccionDesdeFormularioContactoCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyContactoCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroContactoCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ContactoClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ContactoClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesContactoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingContactoCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormContactoCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioContactoCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioContactoCliente();
			}
			
			ContactoClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasContactoCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasContactoCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasContactoCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessContactoCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ContactoCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectContactoCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesContactoCliente")) {
				iIndex=this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessContactoCliente();	
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
	
	public void cargarCombosForeignKeyContactoCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyContactoCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyContactoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyContactoClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyContactoCliente();
		
		this.cargarCombosFrameForeignKeyContactoCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyContactoCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyContactoCliente();
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
	
	public void jButtonNuevoContactoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
			
			if(jTableDatosContactoCliente.getRowCount()>=1) {
				jTableDatosContactoCliente.removeRowSelectionInterval(0, jTableDatosContactoCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoContactoCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoContactoCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesContactoCliente(true);			
			//this.contactocliente=new ContactoCliente();
			//this.contactocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContactoCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContactoCliente() ;
			
			if(ContactoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContactoCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.contactocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);				
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
			if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ContactoCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarContactoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosContactoCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosContactoCliente.getSelectedRows().length;			
			}
			
			contactoclientesSeleccionados=this.getContactoClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoContactoCliente--;			
				//ContactoCliente contactoclienteAux= new ContactoCliente();			
				//contactoclienteAux.setId(this.iIdNuevoContactoCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ContactoCliente contactoclienteOrigen=new ContactoCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ContactoCliente contactoclienteOrigen : contactoclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							contactoclienteOrigen =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contactoclienteOrigen =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaContactoCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.contactocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosContactoCliente(contactoclienteOrigen,this.contactocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.contactoclienteLogic.getContactoClientes().add(this.contactoclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.contactoclientes.add(this.contactoclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaContactoCliente(false);
				
				this.jTableDatosContactoCliente.setRowSelectionInterval(this.getIndiceNuevoContactoCliente(), this.getIndiceNuevoContactoCliente());
				
				int iLastRow =  this.jTableDatosContactoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosContactoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosContactoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaContactoCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();									
		
			ContactoCliente contactoclienteOrigen=new ContactoCliente();
			ContactoCliente contactoclienteDestino=new ContactoCliente();
				
			contactoclientesSeleccionados=this.getContactoClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosContactoCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || contactoclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosContactoCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclienteOrigen =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						contactoclienteOrigen =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contactoclienteDestino =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						contactoclienteDestino =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				contactoclienteOrigen =contactoclientesSeleccionados.get(0);
				contactoclienteDestino =contactoclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosContactoCliente(contactoclienteOrigen,contactoclienteDestino,true,false);
				
				contactoclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(contactoclienteDestino,contactoclienteLogic.getContactoClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contactoclienteDestino,contactoclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaContactoCliente(false);
				
				//this.jTableDatosContactoCliente.setRowSelectionInterval(this.getIndiceNuevoContactoCliente(), this.getIndiceNuevoContactoCliente());
				
				int iLastRow =  this.jTableDatosContactoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosContactoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosContactoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaContactoCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormContactoCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesContactoCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasContactoCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesContactoCliente.setVisible(!isVisible);
			this.jPanelPaginacionContactoCliente.setVisible(!isVisible);
			this.jPanelAccionesContactoCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameContactoCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoContactoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionContactoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByContactoCliente();
			
			this.abrirFrameOrderByContactoCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByContactoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleContactoCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormContactoCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormContactoCliente.isMaximum()) {
					this.jInternalFrameDetalleFormContactoCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormContactoCliente.setSize(this.jInternalFrameDetalleFormContactoCliente.iWidthFormulario,this.jInternalFrameDetalleFormContactoCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormContactoCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormContactoCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormContactoCliente.isMaximum()) {
						this.jInternalFrameDetalleFormContactoCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormContactoCliente.jContentPaneDetalleContactoCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormContactoCliente.jContentPaneDetalleContactoCliente.getWidth(),ContactoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormContactoCliente.jContentPaneDetalleContactoCliente.getWidth(),ContactoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormContactoCliente.jContentPaneDetalleContactoCliente.getWidth(),ContactoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormContactoCliente.setVisible(true);
	        this.jInternalFrameDetalleFormContactoCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByContactoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByContactoCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByContactoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContactoCliente,false,this);
				} else {
					this.jInternalFrameOrderByContactoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContactoCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByContactoCliente);
				this.jInternalFrameOrderByContactoCliente.setVisible(false);
				this.jInternalFrameOrderByContactoCliente.setSelected(false);
				
				this.jInternalFrameOrderByContactoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByContactoCliente"));
				
				this.inicializarActualizarBindingTablaOrderByContactoCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionContactoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionContactoCliente==null) {
				
				this.jInternalFrameImportacionContactoCliente=new ImportacionJInternalFrame(ContactoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionContactoCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionContactoCliente);
				this.jInternalFrameImportacionContactoCliente.setVisible(false);
				this.jInternalFrameImportacionContactoCliente.setSelected(false);


				this.jInternalFrameImportacionContactoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionContactoCliente"));
				this.jInternalFrameImportacionContactoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionContactoCliente"));
				this.jInternalFrameImportacionContactoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionContactoCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoContactoCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoContactoCliente==null) {
				this.jInternalFrameReporteDinamicoContactoCliente=new ReporteDinamicoJInternalFrame(ContactoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoContactoCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoContactoCliente);
				this.jInternalFrameReporteDinamicoContactoCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoContactoCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoContactoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContactoCliente"));
				this.jInternalFrameReporteDinamicoContactoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContactoCliente"));
				this.jInternalFrameReporteDinamicoContactoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContactoCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContactoCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleContactoCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormContactoCliente);
			
	       	this.jInternalFrameDetalleFormContactoCliente.setVisible(false);
	        this.jInternalFrameDetalleFormContactoCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormContactoCliente.dispose();
			//this.jInternalFrameDetalleFormContactoCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoContactoCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoContactoCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoContactoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionContactoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionContactoCliente.setVisible(true);
	        this.jInternalFrameImportacionContactoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByContactoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByContactoCliente.setVisible(true);
	        this.jInternalFrameOrderByContactoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByContactoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByContactoCliente.setVisible(false);
	        this.jInternalFrameOrderByContactoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoContactoCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoContactoCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoContactoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionContactoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionContactoCliente.setVisible(false);
	        this.jInternalFrameImportacionContactoCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarContactoCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarContactoCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesContactoCliente(true);
			//this.isEsNuevoContactoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesContactoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContactoCliente(false) ;
			
			if(contactoclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ContactoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContactoCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContactoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaContactoClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarContactoCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesContactoCliente(true);
			//this.isEsNuevoContactoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.contactocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesContactoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesContactoCliente(false) ;
			
			if(ContactoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContactoCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContactoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.contactoclienteConstantesFunciones.cargarid_clienteContactoCliente) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingContactoCliente(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosContactoCliente.getSelectedRow();

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
	
	public void jButtonActualizarContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesContactoCliente(false);
			
			//if(!this.isEsNuevoContactoCliente) {								
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				
			}
			
			if(this.permiteMantenimiento(this.contactocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoContactoCliente=true;
					this.inicializarActualizarBindingTablaContactoCliente(false);
					this.isEsNuevoContactoCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoContactoCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoContactoCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesContactoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContactoCliente(false);
				
				this.habilitarDeshabilitarControlesContactoCliente(false);
			
												
				
				if(ContactoClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleContactoCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoContactoClienteActionPerformed(evt,contactoclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualContactoCliente(this.contactocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosContactoCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,contactoclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.contactocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarContactoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				this.contactocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				this.contactocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.contactocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ContactoClienteModel) this.jTableDatosContactoCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoContactoCliente=true;
				this.inicializarActualizarBindingTablaContactoCliente(false);
				this.isEsNuevoContactoCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesContactoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContactoCliente(false);
				
				this.habilitarDeshabilitarControlesContactoCliente(false);
				
				
				
				if(ContactoClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleContactoCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarContactoClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosContactoCliente.getRowCount()>=1) {
				jTableDatosContactoCliente.removeRowSelectionInterval(0, jTableDatosContactoCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesContactoCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaContactoCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContactoCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContactoCliente(false) ;
			
			this.isEsNuevoContactoCliente=false;
			
			if(ContactoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleContactoCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosContactoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingContactoCliente(false);
				
				//SI ES MANUAL
				if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualContactoCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosContactoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoContactoCliente--;			
			//ContactoCliente contactoclienteAux= new ContactoCliente();			
			//contactoclienteAux.setId(this.iIdNuevoContactoCliente);
			
			if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaContactoCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
			
			this.contactocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.contactoclienteLogic.getContactoClientes().add(this.contactoclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.contactoclientes.add(this.contactoclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaContactoCliente(false);
			
			this.jTableDatosContactoCliente.setRowSelectionInterval(this.getIndiceNuevoContactoCliente(), this.getIndiceNuevoContactoCliente());
			
			int iLastRow =  this.jTableDatosContactoCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosContactoCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosContactoCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaContactoCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionContactoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingContactoCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContactoCliente(false);
			
			//SI ES MANUAL
			if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContactoCliente();
			}
			
			//this.abrirFrameTreeContactoCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionContactoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Contacto ClienteS ?", "MANTENIMIENTO DE Contacto Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionContactoCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralContactoCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.contactoclienteReturnGeneral=contactoclienteLogic.procesarImportacionContactoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.contactoclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarContactoClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionContactoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionContactoCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionContactoCliente.setFileImportacion(this.jInternalFrameImportacionContactoCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionContactoCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionContactoCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionContactoCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionContactoCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoContactoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		

		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ContactoClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ContactoClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteContactoClientes("Todos",contactoclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ContactoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoCelular_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoCelular_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoCelular_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoCelular_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContactoClienteConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoContactoCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ContactoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ContactoClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case ContactoClienteConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case ContactoClienteConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR:
					sNombreCampoCategoria="telefono_celular";
					break;

				case ContactoClienteConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="email";
					break;

				case ContactoClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ContactoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ContactoClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case ContactoClienteConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case ContactoClienteConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR:
					sNombreCampoCategoriaValor="telefono_celular";
					break;

				case ContactoClienteConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="email";
					break;

				case ContactoClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ContactoClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ContactoClienteConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case ContactoClienteConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case ContactoClienteConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Celular",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_celular");
					break;

				case ContactoClienteConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Email",sNombreCampoCategoria,sNombreCampoCategoriaValor,"email");
					break;

				case ContactoClienteConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoContactoClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contactocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ContactoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ContactoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_RUC);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.gettelefono_celular());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.getemail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContactoClienteConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ContactoCliente contactocliente:contactoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contactocliente.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelContactoCliente(row);				
			//	iRow++;
			//}				
			
			//for(ContactoCliente contactoclienteAux:contactoclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelContactoCliente(contactoclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContactoCliente(false);
			
			//SI ES MANUAL
			if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContactoCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresContactoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContactoCliente(false);
			
			//SI ES MANUAL
			if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualContactoCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesContactoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContactoCliente(false);
			
			//SI ES MANUAL
			if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualContactoCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaContactoCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosContactoCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosContactoCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosContactoCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosContactoCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosContactoCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosContactoCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosContactoCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingContactoCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingContactoCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingContactoCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaContactoCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesContactoCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasContactoCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesContactoCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesContactoCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualContactoCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaContactoCliente();
		
		this.inicializarActualizarBindingBotonesManualContactoCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualContactoCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesContactoCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualContactoCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualContactoCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosContactoCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosContactoCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteContactoCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormContactoCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormContactoCliente.jCheckBoxPostAccionNuevoContactoCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormContactoCliente.jCheckBoxPostAccionSinCerrarContactoCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormContactoCliente.jCheckBoxPostAccionSinMensajeContactoCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosContactoCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosContactoCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteContactoCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormContactoCliente!=null) {
				this.jInternalFrameDetalleFormContactoCliente.jCheckBoxPostAccionNuevoContactoCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormContactoCliente.jCheckBoxPostAccionSinCerrarContactoCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormContactoCliente.jCheckBoxPostAccionSinMensajeContactoCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionContactoCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionContactoCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesContactoCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesContactoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesContactoCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarContactoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesContactoCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesContactoCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralContactoCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesContactoCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualContactoCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesContactoCliente() throws Exception {
		try	{
			if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualContactoCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleContactoCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualContactoCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesContactoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesContactoCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesContactoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesContactoCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesContactoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesContactoCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionContactoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionContactoCliente.addItem(reporte);
			}
			
			
			if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionContactoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionContactoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesContactoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesContactoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesContactoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesContactoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarContactoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarContactoCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarContactoCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContactoCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContactoCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
				this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
				this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoContactoCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoContactoCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoContactoCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoContactoCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoContactoCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualContactoCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteContactoCliente.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteContactoCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasContactoCliente(Boolean esInicializar) throws Exception {				
		if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualContactoCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaContactoCliente() throws Exception {
		this.inicializarActualizarBindingTablaContactoCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByContactoCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosContactoClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaContactoCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=contactoclienteLogic.getContactoClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=contactoclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosContactoCliente.setModel(new ContactoClienteModel(this.contactoclienteLogic.getContactoClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosContactoCliente.setModel(new ContactoClienteModel(this.contactoclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByContactoCliente!=null && this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByContactoCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO,contactoclienteConstantesFunciones.resaltarSeleccionarContactoCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO,contactoclienteConstantesFunciones.resaltarSeleccionarContactoCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_ID));

		if(this.contactoclienteConstantesFunciones.mostraridContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.contactoclienteConstantesFunciones.resaltaridContactoCliente,this.contactoclienteConstantesFunciones.activaridContactoCliente,this,true,"idContactoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contactoclienteConstantesFunciones.resaltaridContactoCliente,this.contactoclienteConstantesFunciones.activaridContactoCliente,this,true,"idContactoCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.contactoclienteConstantesFunciones.mostrarid_empresaContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.contactoclienteConstantesFunciones.resaltarid_empresaContactoCliente,this,this.contactoclienteConstantesFunciones.activarid_empresaContactoCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.contactoclienteConstantesFunciones.resaltarid_empresaContactoCliente,this,this.contactoclienteConstantesFunciones.activarid_empresaContactoCliente,false,"id_empresaContactoCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.contactoclienteConstantesFunciones.mostrarid_sucursalContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.contactoclienteConstantesFunciones.resaltarid_sucursalContactoCliente,this,this.contactoclienteConstantesFunciones.activarid_sucursalContactoCliente));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.contactoclienteConstantesFunciones.resaltarid_sucursalContactoCliente,this,this.contactoclienteConstantesFunciones.activarid_sucursalContactoCliente,false,"id_sucursalContactoCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_IDCLIENTE));

		if(this.contactoclienteConstantesFunciones.mostrarid_clienteContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.contactoclienteConstantesFunciones.resaltarid_clienteContactoCliente,this,this.contactoclienteConstantesFunciones.activarid_clienteContactoCliente));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.contactoclienteConstantesFunciones.resaltarid_clienteContactoCliente,this,this.contactoclienteConstantesFunciones.activarid_clienteContactoCliente,true,"id_clienteContactoCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.contactoclienteConstantesFunciones.mostrarnombre_completoContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contactoclienteConstantesFunciones.resaltarnombre_completoContactoCliente,this.contactoclienteConstantesFunciones.activarnombre_completoContactoCliente,this,true,"nombre_completoContactoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contactoclienteConstantesFunciones.resaltarnombre_completoContactoCliente,this.contactoclienteConstantesFunciones.activarnombre_completoContactoCliente,this,true,"nombre_completoContactoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_RUC));

		if(this.contactoclienteConstantesFunciones.mostrarrucContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contactoclienteConstantesFunciones.resaltarrucContactoCliente,this.contactoclienteConstantesFunciones.activarrucContactoCliente,this,true,"rucContactoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contactoclienteConstantesFunciones.resaltarrucContactoCliente,this.contactoclienteConstantesFunciones.activarrucContactoCliente,this,true,"rucContactoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_DIRECCION));

		if(this.contactoclienteConstantesFunciones.mostrardireccionContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contactoclienteConstantesFunciones.resaltardireccionContactoCliente,this.contactoclienteConstantesFunciones.activardireccionContactoCliente,this,true,"direccionContactoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contactoclienteConstantesFunciones.resaltardireccionContactoCliente,this.contactoclienteConstantesFunciones.activardireccionContactoCliente,this,true,"direccionContactoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_TELEFONO));

		if(this.contactoclienteConstantesFunciones.mostrartelefonoContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contactoclienteConstantesFunciones.resaltartelefonoContactoCliente,this.contactoclienteConstantesFunciones.activartelefonoContactoCliente,this,true,"telefonoContactoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contactoclienteConstantesFunciones.resaltartelefonoContactoCliente,this.contactoclienteConstantesFunciones.activartelefonoContactoCliente,this,true,"telefonoContactoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR));

		if(this.contactoclienteConstantesFunciones.mostrartelefono_celularContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contactoclienteConstantesFunciones.resaltartelefono_celularContactoCliente,this.contactoclienteConstantesFunciones.activartelefono_celularContactoCliente,this,true,"telefono_celularContactoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contactoclienteConstantesFunciones.resaltartelefono_celularContactoCliente,this.contactoclienteConstantesFunciones.activartelefono_celularContactoCliente,this,true,"telefono_celularContactoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_EMAIL));

		if(this.contactoclienteConstantesFunciones.mostraremailContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contactoclienteConstantesFunciones.resaltaremailContactoCliente,this.contactoclienteConstantesFunciones.activaremailContactoCliente,this,true,"emailContactoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contactoclienteConstantesFunciones.resaltaremailContactoCliente,this.contactoclienteConstantesFunciones.activaremailContactoCliente,this,true,"emailContactoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,ContactoClienteConstantesFunciones.LABEL_DESCRIPCION));

		if(this.contactoclienteConstantesFunciones.mostrardescripcionContactoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContactoClienteConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contactoclienteConstantesFunciones.resaltardescripcionContactoCliente,this.contactoclienteConstantesFunciones.activardescripcionContactoCliente,this,true,"descripcionContactoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contactoclienteConstantesFunciones.resaltardescripcionContactoCliente,this.contactoclienteConstantesFunciones.activardescripcionContactoCliente,this,true,"descripcionContactoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContactoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.contactoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.contactoclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosContactoCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.contactoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.contactoclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosContactoCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarContactoCliente && this.isPermisoGuardarCambiosContactoCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.contactoclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.contactoclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosContactoCliente.addColumn(tableColumn);
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
			
			this.jTableDatosContactoCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarContactoCliente && this.isPermisoGuardarCambiosContactoCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarContactoCliente && this.isPermisoGuardarCambiosContactoCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosContactoCliente.moveColumn(this.jTableDatosContactoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosContactoCliente.moveColumn(this.jTableDatosContactoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosContactoCliente.moveColumn(this.jTableDatosContactoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosContactoCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosContactoCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosContactoCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosContactoCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosContactoCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosContactoCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosContactoCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosContactoCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=contactoclienteLogic.getContactoClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=contactoclientes.size()-1;
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
		//this.jTableDatosContactoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosContactoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosContactoCliente();
			
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
				
				//this.isEsNuevoContactoCliente=false;
					
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
				if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormContactoCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosContactoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosContactoCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.contactocliente.getsType().equals("DUPLICADO")
				   || this.contactocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoContactoCliente=true;
				
				} else {
					this.isEsNuevoContactoCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.contactocliente.getId()>=0 && !this.contactocliente.getIsNew()) {						
						this.isEsNuevoContactoCliente=false;
						
					} else {
						this.isEsNuevoContactoCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoContactoCliente(esRelaciones);						
				
				this.seleccionarContactoCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.contactocliente.getId()<0) {
					this.isEsNuevoContactoCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarContactoCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarContactoCliente(evt,rowIndex);
				}	
				
				if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ContactoCliente: " + this.dDif); 
					}
				}								
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarContactoCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.contactocliente)) {
					if(this.contactocliente.getId()>0) {
						this.contactocliente.setIsDeleted(true);
						
						this.contactoclientesEliminados.add(this.contactocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.contactoclienteLogic.getContactoClientes().remove(this.contactocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.contactoclientes.remove(this.contactocliente);				
					}
					
					
					((ContactoClienteModel) this.jTableDatosContactoCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaContactoCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarContactoCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoContactoCliente) {
			
			if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosContactoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosContactoCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioContactoCliente(this.contactocliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.contactoclienteConstantesFunciones.cargarid_empresaContactoCliente || this.contactoclienteConstantesFunciones.event_dependid_empresaContactoCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.contactocliente.getid_empresa());
									//this.inicializarActualizarBindingContactoCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(contactocliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(contactocliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.contactocliente.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.contactoclienteConstantesFunciones.cargarid_sucursalContactoCliente || this.contactoclienteConstantesFunciones.event_dependid_sucursalContactoCliente) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.contactocliente.getid_sucursal());
									//this.inicializarActualizarBindingContactoCliente(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(contactocliente.getSucursal()!=null) {
							this.sucursalsForeignKey.add(contactocliente.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.contactocliente.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.contactoclienteConstantesFunciones.cargarid_clienteContactoCliente || this.contactoclienteConstantesFunciones.event_dependid_clienteContactoCliente) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.contactocliente.getid_cliente());
									//this.inicializarActualizarBindingContactoCliente(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(contactocliente.getCliente()!=null) {
							this.clientesForeignKey.add(contactocliente.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.contactocliente.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesContactoCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesContactoCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContactoCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoContactoCliente(ContactoCliente contactocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoContactoCliente(contactocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoContactoCliente(ContactoCliente contactocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioContactoCliente(contactocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyContactoCliente(contactocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyContactoCliente(contactocliente);
	}
	
	public void setVariablesObjetoActualToFormularioContactoCliente(ContactoCliente contactocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.setText(contactocliente.getId().toString());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreanombre_completoContactoCliente.setText(contactocliente.getnombre_completo());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldrucContactoCliente.setText(contactocliente.getruc());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreadireccionContactoCliente.setText(contactocliente.getdireccion());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefonoContactoCliente.setText(contactocliente.gettelefono());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefono_celularContactoCliente.setText(contactocliente.gettelefono_celular());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldemailContactoCliente.setText(contactocliente.getemail());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreadescripcionContactoCliente.setText(contactocliente.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ContactoCliente contactoclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,contactoclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ContactoCliente contactoclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				contactoclienteLocal=this.contactocliente;
			} else {
				contactoclienteLocal=this.contactoclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(contactoclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoContactoCliente(contactoclienteLocal,true);
					
					if(contactoclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(contactoclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(contactoclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoContactoCliente(ContactoCliente contactocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualContactoCliente(contactocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(contactocliente);
	}
	
	public void setVariablesFormularioToObjetoActualContactoCliente(ContactoCliente contactocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualContactoCliente(contactocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualContactoCliente(ContactoCliente contactocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.getText()==null || this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.getText()=="" || this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.setText("0");
			}

			if(conColumnasBase) {contactocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContactoClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelIdContactoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contactocliente.setnombre_completo(this.jInternalFrameDetalleFormContactoCliente.jTextAreanombre_completoContactoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelnombre_completoContactoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contactocliente.setruc(this.jInternalFrameDetalleFormContactoCliente.jTextFieldrucContactoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContactoClienteConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelrucContactoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contactocliente.setdireccion(this.jInternalFrameDetalleFormContactoCliente.jTextAreadireccionContactoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContactoClienteConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabeldireccionContactoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contactocliente.settelefono(this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefonoContactoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContactoClienteConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabeltelefonoContactoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contactocliente.settelefono_celular(this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefono_celularContactoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabeltelefono_celularContactoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contactocliente.setemail(this.jInternalFrameDetalleFormContactoCliente.jTextFieldemailContactoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContactoClienteConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabelemailContactoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contactocliente.setdescripcion(this.jInternalFrameDetalleFormContactoCliente.jTextAreadescripcionContactoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContactoClienteConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContactoCliente.jLabeldescripcionContactoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualContactoCliente(ContactoCliente contactoclienteBean,ContactoCliente contactocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && contactoclienteBean.getid_cliente()!=null && !contactoclienteBean.getid_cliente().equals(-1L))) {contactocliente.setid_cliente(contactoclienteBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosContactoCliente(ContactoCliente contactoclienteOrigen,ContactoCliente contactocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && contactoclienteOrigen.getId()!=null && !contactoclienteOrigen.getId().equals(0L))) {contactocliente.setId(contactoclienteOrigen.getId());}}
			if(conDefault || (!conDefault && contactoclienteOrigen.getid_cliente()!=null && !contactoclienteOrigen.getid_cliente().equals(-1L))) {contactocliente.setid_cliente(contactoclienteOrigen.getid_cliente());}
			if(conDefault || (!conDefault && contactoclienteOrigen.getnombre_completo()!=null && !contactoclienteOrigen.getnombre_completo().equals(""))) {contactocliente.setnombre_completo(contactoclienteOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && contactoclienteOrigen.getruc()!=null && !contactoclienteOrigen.getruc().equals(""))) {contactocliente.setruc(contactoclienteOrigen.getruc());}
			if(conDefault || (!conDefault && contactoclienteOrigen.getdireccion()!=null && !contactoclienteOrigen.getdireccion().equals(""))) {contactocliente.setdireccion(contactoclienteOrigen.getdireccion());}
			if(conDefault || (!conDefault && contactoclienteOrigen.gettelefono()!=null && !contactoclienteOrigen.gettelefono().equals(""))) {contactocliente.settelefono(contactoclienteOrigen.gettelefono());}
			if(conDefault || (!conDefault && contactoclienteOrigen.gettelefono_celular()!=null && !contactoclienteOrigen.gettelefono_celular().equals(""))) {contactocliente.settelefono_celular(contactoclienteOrigen.gettelefono_celular());}
			if(conDefault || (!conDefault && contactoclienteOrigen.getemail()!=null && !contactoclienteOrigen.getemail().equals(""))) {contactocliente.setemail(contactoclienteOrigen.getemail());}
			if(conDefault || (!conDefault && contactoclienteOrigen.getdescripcion()!=null && !contactoclienteOrigen.getdescripcion().equals(""))) {contactocliente.setdescripcion(contactoclienteOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioContactoCliente(ContactoCliente contactocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.setText(contactocliente.getId().toString());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreanombre_completoContactoCliente.setText(contactocliente.getnombre_completo());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldrucContactoCliente.setText(contactocliente.getruc());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreadireccionContactoCliente.setText(contactocliente.getdireccion());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefonoContactoCliente.setText(contactocliente.gettelefono());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefono_celularContactoCliente.setText(contactocliente.gettelefono_celular());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldemailContactoCliente.setText(contactocliente.getemail());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreadescripcionContactoCliente.setText(contactocliente.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioContactoCliente(ContactoClienteBean contactoclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.setText(contactoclienteBean.getId().toString());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreanombre_completoContactoCliente.setText(contactoclienteBean.getnombre_completo());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldrucContactoCliente.setText(contactoclienteBean.getruc());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreadireccionContactoCliente.setText(contactoclienteBean.getdireccion());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefonoContactoCliente.setText(contactoclienteBean.gettelefono());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefono_celularContactoCliente.setText(contactoclienteBean.gettelefono_celular());
			this.jInternalFrameDetalleFormContactoCliente.jTextFieldemailContactoCliente.setText(contactoclienteBean.getemail());
			this.jInternalFrameDetalleFormContactoCliente.jTextAreadescripcionContactoCliente.setText(contactoclienteBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanContactoCliente(ContactoClienteParameterReturnGeneral contactoclienteReturnGeneral,ContactoClienteBean contactoclienteBean,Boolean conDefault) throws Exception { 
		try {
			ContactoCliente contactoclienteLocal=new ContactoCliente();
			
			contactoclienteLocal=contactoclienteReturnGeneral.getContactoCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && contactoclienteLocal.getId()!=null && !contactoclienteLocal.getId().equals(0L))) {contactoclienteBean.setId(contactoclienteLocal.getId());}}
			if(conDefault || (!conDefault && contactoclienteLocal.getid_cliente()!=null && !contactoclienteLocal.getid_cliente().equals(-1L))) {contactoclienteBean.setid_cliente(contactoclienteLocal.getid_cliente());}
			if(conDefault || (!conDefault && contactoclienteLocal.getnombre_completo()!=null && !contactoclienteLocal.getnombre_completo().equals(""))) {contactoclienteBean.setnombre_completo(contactoclienteLocal.getnombre_completo());}
			if(conDefault || (!conDefault && contactoclienteLocal.getruc()!=null && !contactoclienteLocal.getruc().equals(""))) {contactoclienteBean.setruc(contactoclienteLocal.getruc());}
			if(conDefault || (!conDefault && contactoclienteLocal.getdireccion()!=null && !contactoclienteLocal.getdireccion().equals(""))) {contactoclienteBean.setdireccion(contactoclienteLocal.getdireccion());}
			if(conDefault || (!conDefault && contactoclienteLocal.gettelefono()!=null && !contactoclienteLocal.gettelefono().equals(""))) {contactoclienteBean.settelefono(contactoclienteLocal.gettelefono());}
			if(conDefault || (!conDefault && contactoclienteLocal.gettelefono_celular()!=null && !contactoclienteLocal.gettelefono_celular().equals(""))) {contactoclienteBean.settelefono_celular(contactoclienteLocal.gettelefono_celular());}
			if(conDefault || (!conDefault && contactoclienteLocal.getemail()!=null && !contactoclienteLocal.getemail().equals(""))) {contactoclienteBean.setemail(contactoclienteLocal.getemail());}
			if(conDefault || (!conDefault && contactoclienteLocal.getdescripcion()!=null && !contactoclienteLocal.getdescripcion().equals(""))) {contactoclienteBean.setdescripcion(contactoclienteLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxContactoClienteGenerico(Long idContactoClienteSeleccionado,JComboBox jComboBoxContactoCliente,List<ContactoCliente> contactoclientesLocal)throws Exception {
		try {
			ContactoCliente  contactoclienteTemp=null;

			for(ContactoCliente contactoclienteAux:contactoclientesLocal) {
				if(contactoclienteAux.getId()!=null && contactoclienteAux.getId().equals(idContactoClienteSeleccionado)) {
					contactoclienteTemp=contactoclienteAux;
					break;
				}
			}

			jComboBoxContactoCliente.setSelectedItem(contactoclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxContactoClienteGenerico(JComboBox jComboBoxContactoCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxContactoCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxContactoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxContactoCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxContactoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contactocliente=(ContactoCliente) contactoclienteLogic.getContactoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			contactocliente =(ContactoCliente) contactoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!contactocliente.getIsNew() && !contactocliente.getIsChanged() && !contactocliente.getIsDeleted()) {
				sDescripcion=contactocliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=contactocliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!contactocliente.getIsNew() && !contactocliente.getIsChanged() && !contactocliente.getIsDeleted()) {
				sDescripcion=contactocliente.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=contactocliente.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!contactocliente.getIsNew() && !contactocliente.getIsChanged() && !contactocliente.getIsDeleted()) {
				sDescripcion=contactocliente.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=contactocliente.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ContactoCliente contactoclienteRow=new ContactoCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contactoclienteRow=(ContactoCliente) contactoclienteLogic.getContactoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			contactoclienteRow=(ContactoCliente) contactoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualContactoCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoContactoCliente.setVisible((this.isVisibilidadCeldaNuevoContactoCliente && this.isPermisoNuevoContactoCliente));			
			this.jButtonDuplicarContactoCliente.setVisible((this.isVisibilidadCeldaDuplicarContactoCliente && this.isPermisoDuplicarContactoCliente));			
			this.jButtonCopiarContactoCliente.setVisible((this.isVisibilidadCeldaCopiarContactoCliente && this.isPermisoCopiarContactoCliente));
			this.jButtonVerFormContactoCliente.setVisible((this.isVisibilidadCeldaVerFormContactoCliente && this.isPermisoVerFormContactoCliente));
			
			this.jButtonAbrirOrderByContactoCliente.setVisible((this.isVisibilidadCeldaOrdenContactoCliente && this.isPermisoOrdenContactoCliente));			
			
			this.jButtonNuevoRelacionesContactoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesContactoCliente && this.isPermisoNuevoContactoCliente));			
			this.jButtonNuevoGuardarCambiosContactoCliente.setVisible((this.isVisibilidadCeldaNuevoContactoCliente && this.isPermisoNuevoContactoCliente && this.isPermisoGuardarCambiosContactoCliente));
			
			if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonModificarContactoCliente.setVisible((this.isVisibilidadCeldaModificarContactoCliente && this.isPermisoActualizarContactoCliente));	
			this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarContactoCliente.setVisible((this.isVisibilidadCeldaActualizarContactoCliente && this.isPermisoActualizarContactoCliente));	
			this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarContactoCliente.setVisible((this.isVisibilidadCeldaEliminarContactoCliente && this.isPermisoEliminarContactoCliente));
			this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarContactoCliente.setVisible(this.isVisibilidadCeldaCancelarContactoCliente);							
			this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosContactoCliente.setVisible((this.isVisibilidadCeldaGuardarContactoCliente && this.isPermisoGuardarCambiosContactoCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaContactoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosContactoCliente && this.isPermisoGuardarCambiosContactoCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarContactoCliente.setVisible((this.isVisibilidadCeldaNuevoContactoCliente && this.isPermisoNuevoContactoCliente));						
			this.jButtonDuplicarToolBarContactoCliente.setVisible((this.isVisibilidadCeldaDuplicarContactoCliente && this.isPermisoDuplicarContactoCliente));						
			this.jButtonCopiarToolBarContactoCliente.setVisible((this.isVisibilidadCeldaCopiarContactoCliente && this.isPermisoCopiarContactoCliente));			
			this.jButtonVerFormToolBarContactoCliente.setVisible((this.isVisibilidadCeldaVerFormContactoCliente && this.isPermisoVerFormContactoCliente));			
			this.jButtonAbrirOrderByToolBarContactoCliente.setVisible((this.isVisibilidadCeldaOrdenContactoCliente && this.isPermisoOrdenContactoCliente));
			this.jButtonNuevoRelacionesToolBarContactoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesContactoCliente && this.isPermisoNuevoContactoCliente));			
			this.jButtonNuevoGuardarCambiosToolBarContactoCliente.setVisible((this.isVisibilidadCeldaNuevoContactoCliente && this.isPermisoNuevoContactoCliente && this.isPermisoGuardarCambiosContactoCliente));			
			
			if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonModificarToolBarContactoCliente.setVisible((this.isVisibilidadCeldaModificarContactoCliente && this.isPermisoActualizarContactoCliente));	
			this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarToolBarContactoCliente.setVisible((this.isVisibilidadCeldaActualizarContactoCliente  && this.isPermisoActualizarContactoCliente));	
			this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarToolBarContactoCliente.setVisible((this.isVisibilidadCeldaEliminarContactoCliente && this.isPermisoEliminarContactoCliente));
			this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarToolBarContactoCliente.setVisible(this.isVisibilidadCeldaCancelarContactoCliente);				
			this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosToolBarContactoCliente.setVisible((this.isVisibilidadCeldaGuardarContactoCliente && this.isPermisoGuardarCambiosContactoCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarContactoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosContactoCliente && this.isPermisoGuardarCambiosContactoCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoContactoCliente.setVisible((this.isVisibilidadCeldaNuevoContactoCliente && this.isPermisoNuevoContactoCliente));			
			this.jMenuItemDuplicarContactoCliente.setVisible((this.isVisibilidadCeldaDuplicarContactoCliente && this.isPermisoDuplicarContactoCliente));			
			this.jMenuItemCopiarContactoCliente.setVisible((this.isVisibilidadCeldaCopiarContactoCliente && this.isPermisoCopiarContactoCliente));			
			this.jMenuItemVerFormContactoCliente.setVisible((this.isVisibilidadCeldaVerFormContactoCliente && this.isPermisoVerFormContactoCliente));			
			this.jMenuItemAbrirOrderByContactoCliente.setVisible((this.isVisibilidadCeldaOrdenContactoCliente && this.isPermisoOrdenContactoCliente));			
			//this.jMenuItemMostrarOcultarContactoCliente.setVisible((this.isVisibilidadCeldaOrdenContactoCliente && this.isPermisoOrdenContactoCliente));
			this.jMenuItemDetalleAbrirOrderByContactoCliente.setVisible((this.isVisibilidadCeldaOrdenContactoCliente && this.isPermisoOrdenContactoCliente));			
			//this.jMenuItemDetalleMostrarOcultarContactoCliente.setVisible((this.isVisibilidadCeldaOrdenContactoCliente && this.isPermisoOrdenContactoCliente));			
			this.jMenuItemNuevoRelacionesContactoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesContactoCliente && this.isPermisoNuevoContactoCliente));			
			this.jMenuItemNuevoGuardarCambiosContactoCliente.setVisible((this.isVisibilidadCeldaNuevoContactoCliente && this.isPermisoNuevoContactoCliente && this.isPermisoGuardarCambiosContactoCliente));									
			
			if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemModificarContactoCliente.setVisible((this.isVisibilidadCeldaModificarContactoCliente && this.isPermisoActualizarContactoCliente));	
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemActualizarContactoCliente.setVisible((this.isVisibilidadCeldaActualizarContactoCliente && this.isPermisoActualizarContactoCliente));	
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemEliminarContactoCliente.setVisible((this.isVisibilidadCeldaEliminarContactoCliente && this.isPermisoEliminarContactoCliente));
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemCancelarContactoCliente.setVisible(this.isVisibilidadCeldaCancelarContactoCliente);				
			}
			
			this.jMenuItemGuardarCambiosContactoCliente.setVisible((this.isVisibilidadCeldaGuardarContactoCliente && this.isPermisoGuardarCambiosContactoCliente));						
			this.jMenuItemGuardarCambiosTablaContactoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosContactoCliente && this.isPermisoGuardarCambiosContactoCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoContactoCliente=this.jButtonNuevoContactoCliente.isVisible();
			this.isVisibilidadCeldaDuplicarContactoCliente=this.jButtonDuplicarContactoCliente.isVisible();
			this.isVisibilidadCeldaCopiarContactoCliente=this.jButtonCopiarContactoCliente.isVisible();
			this.isVisibilidadCeldaVerFormContactoCliente=this.jButtonVerFormContactoCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenContactoCliente=this.jButtonAbrirOrderByContactoCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=this.jButtonNuevoRelacionesContactoCliente.isVisible();
			this.isVisibilidadCeldaModificarContactoCliente=this.jButtonModificarContactoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			this.isVisibilidadCeldaActualizarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarContactoCliente.isVisible();
			this.isVisibilidadCeldaEliminarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarContactoCliente.isVisible();
			this.isVisibilidadCeldaCancelarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarContactoCliente.isVisible();
			this.isVisibilidadCeldaGuardarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosContactoCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=this.jButtonGuardarCambiosTablaContactoCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoContactoCliente=this.jButtonNuevoToolBarContactoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=this.jButtonNuevoRelacionesToolBarContactoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			this.isVisibilidadCeldaModificarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jButtonModificarToolBarContactoCliente.isVisible();
			this.isVisibilidadCeldaActualizarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarToolBarContactoCliente.isVisible();
			this.isVisibilidadCeldaEliminarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarToolBarContactoCliente.isVisible();
			this.isVisibilidadCeldaCancelarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarToolBarContactoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarContactoCliente=this.jButtonGuardarCambiosToolBarContactoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=this.jButtonGuardarCambiosTablaToolBarContactoCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoContactoCliente=this.jMenuItemNuevoContactoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=this.jMenuItemNuevoRelacionesContactoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			this.isVisibilidadCeldaModificarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jMenuItemModificarContactoCliente.isVisible();
			this.isVisibilidadCeldaActualizarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jMenuItemActualizarContactoCliente.isVisible();
			this.isVisibilidadCeldaEliminarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jMenuItemEliminarContactoCliente.isVisible();
			this.isVisibilidadCeldaCancelarContactoCliente=this.jInternalFrameDetalleFormContactoCliente.jMenuItemCancelarContactoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarContactoCliente=this.jMenuItemGuardarCambiosContactoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=this.jMenuItemGuardarCambiosTablaContactoCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesContactoCliente(Boolean esInicializar) {
		if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesContactoCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualContactoCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualContactoCliente() {
		this.jButtonNuevoContactoCliente.setVisible(this.isPermisoNuevoContactoCliente);			
		this.jButtonDuplicarContactoCliente.setVisible(this.isPermisoDuplicarContactoCliente);			
		this.jButtonCopiarContactoCliente.setVisible(this.isPermisoCopiarContactoCliente);			
		this.jButtonVerFormContactoCliente.setVisible(this.isPermisoVerFormContactoCliente);			
		
		this.jButtonAbrirOrderByContactoCliente.setVisible(this.isPermisoOrdenContactoCliente);					
		
		this.jButtonNuevoRelacionesContactoCliente.setVisible(this.isPermisoNuevoContactoCliente);			
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonModificarContactoCliente.setVisible(this.isPermisoActualizarContactoCliente);	
			this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarContactoCliente.setVisible(this.isPermisoActualizarContactoCliente);	
			this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarContactoCliente.setVisible(this.isPermisoEliminarContactoCliente);
			this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarContactoCliente.setVisible(this.isVisibilidadCeldaCancelarContactoCliente);						
			this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosContactoCliente.setVisible(this.isPermisoGuardarCambiosContactoCliente);							
		}
		
		this.jButtonGuardarCambiosTablaContactoCliente.setVisible(this.isPermisoActualizarContactoCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleContactoCliente() {
		this.jInternalFrameDetalleFormContactoCliente.jButtonModificarContactoCliente.setVisible(this.isPermisoActualizarContactoCliente);	
		this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarContactoCliente.setVisible(this.isPermisoActualizarContactoCliente);	
		this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarContactoCliente.setVisible(this.isPermisoEliminarContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarContactoCliente.setVisible(this.isVisibilidadCeldaCancelarContactoCliente);							
		this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosContactoCliente.setVisible((this.isVisibilidadCeldaGuardarContactoCliente && this.isPermisoGuardarCambiosContactoCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosContactoCliente() {
		if(ContactoClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualContactoCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesContactoCliente() {
	}
	
	public void jTableDatosContactoClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarContactoCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.contactocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaContactoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebContactoCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosContactoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosContactoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.contactoclienteLogic.getConnexion());

				if(this.contactocliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.contactocliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderContactoCliente=(TitledBorder)this.jScrollPanelDatosContactoCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderContactoCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.contactocliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalContactoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebContactoCliente(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosContactoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosContactoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.contactoclienteLogic.getConnexion());

				if(this.contactocliente.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.contactocliente.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderContactoCliente=(TitledBorder)this.jScrollPanelDatosContactoCliente.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderContactoCliente.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.contactocliente.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteContactoClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderContactoCliente=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosContactoCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderContactoCliente=(TitledBorder)this.jScrollPanelDatosContactoCliente.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderContactoCliente.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteContactoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebContactoCliente(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosContactoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosContactoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.contactoclienteLogic.getConnexion());

				if(this.contactocliente.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.contactocliente.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderContactoCliente=(TitledBorder)this.jScrollPanelDatosContactoCliente.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderContactoCliente.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.contactocliente.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.contactocliente.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.contactocliente.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.contactocliente.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.contactocliente.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_celularContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.gettelefono_celular()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_celular like '%"+this.contactocliente.gettelefono_celular()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getemail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where email like '%"+this.contactocliente.getemail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionContactoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.getcontactocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contactocliente==null) {
						this.contactocliente = new ContactoCliente();
					}

					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);
				}

				if(this.contactocliente.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.contactocliente.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContactoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteContactoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingContactoCliente(false,false);

			this.getContactoClientesFK_IdCliente();

			this.inicializarActualizarBindingContactoCliente(false);

			//if(ContactoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingContactoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaContactoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingContactoCliente(false,false);

			this.getContactoClientesFK_IdEmpresa();

			this.inicializarActualizarBindingContactoCliente(false);

			//if(ContactoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingContactoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalContactoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingContactoCliente(false,false);

			this.getContactoClientesFK_IdSucursal();

			this.inicializarActualizarBindingContactoCliente(false);

			//if(ContactoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingContactoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contactoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameContactoCliente() {
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
			this.jInternalFrameDetalleFormContactoCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormContactoCliente.dispose();
			this.jInternalFrameDetalleFormContactoCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
			this.jInternalFrameReporteDinamicoContactoCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoContactoCliente.dispose();
			this.jInternalFrameReporteDinamicoContactoCliente=null;
		}
		
		if(this.jInternalFrameImportacionContactoCliente!=null) {
			this.jInternalFrameImportacionContactoCliente.setVisible(false);	    			
			this.jInternalFrameImportacionContactoCliente.dispose();
			this.jInternalFrameImportacionContactoCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessContactoCliente();
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoContactoCliente")) {
				jButtonNuevoContactoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarContactoCliente")) {
				jButtonDuplicarContactoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarContactoCliente")) {
				jButtonCopiarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormContactoCliente")) {
				jButtonVerFormContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarContactoCliente")) {
				jButtonNuevoContactoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarContactoCliente")) {
				jButtonDuplicarContactoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoContactoCliente")) {
				jButtonNuevoContactoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarContactoCliente")) {
				jButtonDuplicarContactoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesContactoCliente")) {
				jButtonNuevoContactoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarContactoCliente")) {
				jButtonNuevoContactoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesContactoCliente")) {
				jButtonNuevoContactoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarContactoCliente")) {
				jButtonModificarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarContactoCliente")) {
				jButtonModificarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarContactoCliente")) {
				jButtonModificarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarContactoCliente")) {
				jButtonActualizarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarContactoCliente")) {
				jButtonActualizarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarContactoCliente")) {
				jButtonActualizarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarContactoCliente")) {
				jButtonEliminarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarContactoCliente")) {
				jButtonEliminarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarContactoCliente")) {
				jButtonEliminarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarContactoCliente")) {
				jButtonCancelarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarContactoCliente")) {
				jButtonCancelarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarContactoCliente")) {
				jButtonCancelarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarContactoCliente")) {
				jButtonCerrarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarContactoCliente")) {
				jButtonCerrarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarContactoCliente")) {
				jButtonCerrarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarContactoCliente")) {
				jButtonMostrarOcultarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarContactoCliente")) {
				jButtonCancelarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosContactoCliente")) {
				jButtonGuardarCambiosContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarContactoCliente")) {
				jButtonGuardarCambiosContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarContactoCliente")) {
				jButtonCopiarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarContactoCliente")) {
				jButtonVerFormContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosContactoCliente")) {
				jButtonGuardarCambiosContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarContactoCliente")) {
				jButtonCopiarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormContactoCliente")) {
				jButtonVerFormContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaContactoCliente")) {
				jButtonGuardarCambiosContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarContactoCliente")) {
				jButtonGuardarCambiosContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaContactoCliente")) {
				jButtonGuardarCambiosContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionContactoCliente")) {
				jButtonRecargarInformacionContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarContactoCliente")) {
				jButtonRecargarInformacionContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionContactoCliente")) {
				jButtonRecargarInformacionContactoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresContactoCliente")) {
				jButtonAnterioresContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarContactoCliente")) {
				jButtonAnterioresContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreContactoCliente")) {
				jButtonAnterioresContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesContactoCliente")) {
				jButtonSiguientesContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarContactoCliente")) {
				jButtonSiguientesContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesContactoCliente")) {
				jButtonSiguientesContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByContactoCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByContactoCliente")) {
				jButtonAbrirOrderByContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarContactoCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarContactoCliente")) {
				jButtonMostrarOcultarContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosContactoCliente")) {
				jButtonNuevoGuardarCambiosContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarContactoCliente")) {
				jButtonNuevoGuardarCambiosContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosContactoCliente")) {
				jButtonNuevoGuardarCambiosContactoClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoContactoCliente")) {
				jButtonCerrarReporteDinamicoContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoContactoCliente")) {
				jButtonGenerarReporteDinamicoContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoContactoCliente")) {
				
				jButtonGenerarExcelReporteDinamicoContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionContactoCliente")) {
				jButtonCerrarImportacionContactoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionContactoCliente")) {
				
				jButtonGenerarImportacionContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionContactoCliente")) {
				
				jButtonAbrirImportacionContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesContactoCliente")) {
				jComboBoxTiposAccionesContactoClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesContactoCliente")) {
				jComboBoxTiposRelacionesContactoClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioContactoCliente")) {
				jComboBoxTiposAccionesContactoClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarContactoCliente")) {
				
				jComboBoxTiposSeleccionarContactoClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralContactoCliente")) {
				jTextFieldValorCampoGeneralContactoClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByContactoCliente")) {
				jButtonAbrirOrderByContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarContactoCliente")) {
				jButtonAbrirOrderByContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByContactoCliente")) {
				jButtonCerrarOrderByContactoClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idContactoClienteBusqueda")) {
				this.jButtonidContactoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaContactoClienteUpdate")) {
				this.jButtonid_empresaContactoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaContactoClienteBusqueda")) {
				this.jButtonid_empresaContactoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalContactoClienteUpdate")) {
				this.jButtonid_sucursalContactoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalContactoClienteBusqueda")) {
				this.jButtonid_sucursalContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteContactoCliente")) {
				this.jButtonid_clienteContactoClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteContactoClienteUpdate")) {
				this.jButtonid_clienteContactoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteContactoClienteBusqueda")) {
				this.jButtonid_clienteContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoContactoClienteBusqueda")) {
				this.jButtonnombre_completoContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucContactoClienteBusqueda")) {
				this.jButtonrucContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionContactoClienteBusqueda")) {
				this.jButtondireccionContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoContactoClienteBusqueda")) {
				this.jButtontelefonoContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_celularContactoClienteBusqueda")) {
				this.jButtontelefono_celularContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailContactoClienteBusqueda")) {
				this.jButtonemailContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionContactoClienteBusqueda")) {
				this.jButtondescripcionContactoClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteContactoCliente")) {
				this.jButtonid_clienteContactoClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteContactoCliente")) {
				this.jButtonFK_IdClienteContactoClienteActionPerformed(evt);
			}
			
			;
			
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessContactoCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContactoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				


				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ContactoCliente contactoclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				contactoclienteLocal=this.contactocliente;
			} else {
				contactoclienteLocal=this.contactoclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
							
				
				


				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContactoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
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
			
			


			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContactoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
								
						
				


				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
								
				
				


				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContactoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContactoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContactoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
							
				
				


				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContactoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactoclienteAnterior =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.contactoclienteAnterior =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
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
			
			


			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContactoClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
								
				
				


				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContactoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContactoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContactoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosContactoCliente")) {
					jCheckBoxSeleccionarTodosContactoClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosContactoCliente")) {
					jCheckBoxSeleccionadosContactoClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarContactoCliente")) {
					
				}
				
				


				
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
												
				
				


				
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContactoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contactoclienteAnterior =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.contactoclienteAnterior =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContactoClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
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
			
			


			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContactoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contactocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contactocliente);
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
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
				
				


				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ContactoCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ContactoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContactoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contactoclienteAnterior =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarContactoCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosContactoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosContactoCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.contactocliente =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.contactocliente =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.contactocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarContactoCliente")) {
				
				}
				
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarContactoCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosContactoCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarContactoCliente")) {
			
			}
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessContactoCliente();
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
			if(sTipo.equals("NuevoContactoCliente")) {
				jButtonNuevoContactoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarContactoCliente")) {
				jButtonDuplicarContactoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarContactoCliente")) {
				jButtonCopiarContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormContactoCliente")) {
				jButtonVerFormContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesContactoCliente")) {
				jButtonNuevoContactoClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarContactoCliente")) {
				jButtonModificarContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarContactoCliente")) {
				jButtonActualizarContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarContactoCliente")) {
				jButtonEliminarContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaContactoCliente")) {
				jButtonGuardarCambiosContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarContactoCliente")) {
				jButtonCancelarContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarContactoCliente")) {
				jButtonCerrarContactoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosContactoCliente")) {
				jButtonGuardarCambiosContactoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosContactoCliente")) {
				jButtonNuevoGuardarCambiosContactoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByContactoCliente")) {
				jButtonAbrirOrderByContactoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionContactoCliente")) {
				jButtonRecargarInformacionContactoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresContactoCliente")) {
				jButtonAnterioresContactoClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesContactoCliente")) {
				jButtonSiguientesContactoClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idContactoClienteBusqueda")) {
				this.jButtonidContactoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaContactoClienteUpdate")) {
				this.jButtonid_empresaContactoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaContactoClienteBusqueda")) {
				this.jButtonid_empresaContactoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalContactoClienteUpdate")) {
				this.jButtonid_sucursalContactoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalContactoClienteBusqueda")) {
				this.jButtonid_sucursalContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteContactoCliente")) {
				this.jButtonid_clienteContactoClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteContactoClienteUpdate")) {
				this.jButtonid_clienteContactoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteContactoClienteBusqueda")) {
				this.jButtonid_clienteContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoContactoClienteBusqueda")) {
				this.jButtonnombre_completoContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucContactoClienteBusqueda")) {
				this.jButtonrucContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionContactoClienteBusqueda")) {
				this.jButtondireccionContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoContactoClienteBusqueda")) {
				this.jButtontelefonoContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_celularContactoClienteBusqueda")) {
				this.jButtontelefono_celularContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailContactoClienteBusqueda")) {
				this.jButtonemailContactoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionContactoClienteBusqueda")) {
				this.jButtondescripcionContactoClienteBusquedaActionPerformed(evt);
			}
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessContactoCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameContactoCliente")) {
				closingInternalFrameContactoCliente();
				
			} else if(sTipo.equals("jButtonCancelarContactoCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormContactoCliente = (JInternalFrameBase)evt.getSource();
	            	
	            ContactoClienteBeanSwingJInternalFrame jInternalFrameParent=(ContactoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormContactoCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarContactoClienteActionPerformed(null);
			}
			
			ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.contactocliente,new Object(),this.contactoclienteParameterGeneral,this.contactoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormContactoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormContactoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormContactoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.contactocliente)) {
			if(!esControlTabla) {
				if(ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);			
				}
				
				if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualContactoCliente(this.contactocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.contactoclienteReturnGeneral=contactoclienteLogic.procesarEventosContactoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contactoclienteLogic.getContactoClientes(),this.contactocliente,this.contactoclienteParameterGeneral,this.isEsNuevoContactoCliente,classes);//this.contactoclienteLogic.getContactoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanContactoCliente(this.contactoclienteReturnGeneral,this.contactoclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanContactoCliente(classes,this.contactoclienteReturnGeneral,this.contactoclienteBean,false);
					}
						
					if(this.contactoclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyContactoCliente(this.contactoclienteReturnGeneral.getContactoCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioContactoCliente(this.contactoclienteReturnGeneral.getContactoCliente());	
					}
						
					if(this.contactoclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioContactoCliente(this.contactoclienteReturnGeneral.getContactoCliente(),classes);//this.contactoclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioContactoCliente(this.contactocliente,classes);//this.contactoclienteBean);									
				}
			
				if(ContactoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualContactoCliente(this.contactocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysContactoCliente(this.contactocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.contactoclienteAnterior!=null) {
						this.contactocliente=this.contactoclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.contactoclienteReturnGeneral=contactoclienteLogic.procesarEventosContactoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contactoclienteLogic.getContactoClientes(),this.contactocliente,this.contactoclienteParameterGeneral,this.isEsNuevoContactoCliente,classes);//this.contactoclienteLogic.getContactoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.contactoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.contactoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.contactoclienteReturnGeneral.getContactoCliente(),contactoclienteLogic.getContactoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.contactoclienteReturnGeneral.getContactoCliente(),this.contactoclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosContactoCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosContactoCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosContactoCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosContactoCliente() throws Exception {
		
		ContactoClienteModel contactoclienteModel=(ContactoClienteModel)this.jTableDatosContactoCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contactoclienteModel.contactoclientes=this.contactoclienteLogic.getContactoClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			contactoclienteModel.contactoclientes=this.contactoclientes;
		}
		
		
		((ContactoClienteModel) this.jTableDatosContactoCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaContactoCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcontactoclienteAnterior(),this.contactoclienteLogic.getContactoClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcontactoclienteAnterior(),this.contactoclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosContactoCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioContactoCliente(ContactoCliente contactocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
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
										
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contactocliente,new Object(),generalEntityParameterGeneral,this.contactoclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ContactoClienteConstantesFunciones.getClassesRelationshipsOfContactoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ContactoClienteConstantesFunciones.getClassesRelationshipsFromStringsOfContactoCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormContactoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ContactoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contactocliente,new Object(),generalEntityParameterGeneral,this.contactoclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioContactoCliente(ContactoClienteBean contactoclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanContactoCliente(ArrayList<Classe> classes,ContactoClienteReturnGeneral contactoclienteReturnGeneral,ContactoClienteBean contactoclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualContactoCliente(ContactoCliente contactocliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.contactocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormContactoCliente = new ContactoClienteDetalleFormJInternalFrame(jDesktopPane,this.contactoclienteSessionBean.getConGuardarRelaciones(),this.contactoclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.setVisible(false);
		this.jInternalFrameDetalleFormContactoCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormContactoCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormContactoCliente.contactoclienteLogic=this.contactoclienteLogic;
		
		this.cargarCombosFrameForeignKeyContactoCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleContactoCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleContactoCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyContactoCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyContactoCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormContactoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarContactoCliente"));
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonModificarContactoCliente.addActionListener(new ButtonActionListener(this,"ModificarContactoCliente"));

		
		this.jInternalFrameDetalleFormContactoCliente.jButtonModificarToolBarContactoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarContactoCliente"));
					
		this.jInternalFrameDetalleFormContactoCliente.jMenuItemModificarContactoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarContactoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarContactoCliente.addActionListener (new ButtonActionListener(this,"ActualizarContactoCliente"));
		
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarToolBarContactoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarContactoCliente"));
						
		this.jInternalFrameDetalleFormContactoCliente.jMenuItemActualizarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarContactoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarContactoCliente.addActionListener (new ButtonActionListener(this,"EliminarContactoCliente"));
		
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarContactoCliente"));
								
		this.jInternalFrameDetalleFormContactoCliente.jMenuItemEliminarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarContactoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarContactoCliente.addActionListener (new ButtonActionListener(this,"CancelarContactoCliente"));
		
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarContactoCliente"));
					
		this.jInternalFrameDetalleFormContactoCliente.jMenuItemCancelarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarContactoCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormContactoCliente.jMenuItemDetalleCerrarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarContactoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContactoCliente"));
		
		
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContactoCliente"));
		
		
		
		this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioContactoCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonidContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idContactoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_empresaContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_empresaContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaContactoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_sucursalContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_sucursalContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalContactoClienteBusqueda"));
		//jButtonid_clienteContactoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteContactoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoCliente.addActionListener(new ButtonActionListener(this,"id_clienteContactoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonnombre_completoContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonrucContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"rucContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtondireccionContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"direccionContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtontelefonoContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"telefonoContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtontelefono_celularContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"telefono_celularContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonemailContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"emailContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtondescripcionContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionContactoClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesContactoCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameContactoCliente"));
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarContactoCliente"));
		}
		
		this.jTableDatosContactoCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarContactoCliente"));
		
		this.jTableDatosContactoCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarContactoCliente"));
		
		this.jButtonNuevoContactoCliente.addActionListener(new ButtonActionListener(this,"NuevoContactoCliente"));
		
		this.jButtonDuplicarContactoCliente.addActionListener(new ButtonActionListener(this,"DuplicarContactoCliente"));
		
		this.jButtonCopiarContactoCliente.addActionListener(new ButtonActionListener(this,"CopiarContactoCliente"));
		
		this.jButtonVerFormContactoCliente.addActionListener(new ButtonActionListener(this,"VerFormContactoCliente"));
		
		
		this.jButtonNuevoToolBarContactoCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarContactoCliente"));
			
		this.jButtonDuplicarToolBarContactoCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarContactoCliente"));
			
		this.jMenuItemNuevoContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoContactoCliente"));
			
		this.jMenuItemDuplicarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarContactoCliente"));		
		
		
		this.jButtonNuevoRelacionesContactoCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesContactoCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarContactoCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarContactoCliente"));
			
		this.jMenuItemNuevoRelacionesContactoCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesContactoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonModificarContactoCliente.addActionListener(new ButtonActionListener(this,"ModificarContactoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonModificarToolBarContactoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarContactoCliente"));
			
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemModificarContactoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarContactoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarContactoCliente.addActionListener (new ButtonActionListener(this,"ActualizarContactoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonActualizarToolBarContactoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarContactoCliente"));
				
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemActualizarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarContactoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarContactoCliente.addActionListener (new ButtonActionListener(this,"EliminarContactoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonEliminarToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarContactoCliente"));
						
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemEliminarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarContactoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarContactoCliente.addActionListener (new ButtonActionListener(this,"CancelarContactoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonCancelarToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarContactoCliente"));
			
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemCancelarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarContactoCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarContactoCliente"));		
		
		
		this.jButtonCerrarContactoCliente.addActionListener (new ButtonActionListener(this,"CerrarContactoCliente"));
		
		
		this.jButtonCerrarToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarContactoCliente"));
			
		this.jMenuItemCerrarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarContactoCliente"));
			
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jMenuItemDetalleCerrarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarContactoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosContactoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosContactoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContactoCliente"));
		}
		
		this.jButtonCopiarToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarContactoCliente"));
			
		this.jButtonVerFormToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarContactoCliente"));
		
		this.jMenuItemGuardarCambiosContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosContactoCliente"));
			
		this.jMenuItemCopiarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarContactoCliente"));		
		
		this.jMenuItemVerFormContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormContactoCliente"));		
		
		
		this.jButtonGuardarCambiosTablaContactoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaContactoCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarContactoCliente"));
			
		this.jMenuItemGuardarCambiosTablaContactoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaContactoCliente"));		
		
		
		
		this.jButtonRecargarInformacionContactoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionContactoCliente"));
					
		this.jButtonRecargarInformacionToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarContactoCliente"));
		
		this.jMenuItemRecargarInformacionContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionContactoCliente"));		
		
		
		
		this.jButtonAnterioresContactoCliente.addActionListener (new ButtonActionListener(this,"AnterioresContactoCliente"));
		
		
		this.jButtonAnterioresToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarContactoCliente"));
		
		this.jMenuItemAnterioresContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresContactoCliente"));		
		
		
		this.jButtonSiguientesContactoCliente.addActionListener (new ButtonActionListener(this,"SiguientesContactoCliente"));
		
		
		this.jButtonSiguientesToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarContactoCliente"));
			
		this.jMenuItemSiguientesContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesContactoCliente"));
			
		this.jMenuItemAbrirOrderByContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByContactoCliente"));
			
		this.jMenuItemMostrarOcultarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarContactoCliente"));
			
		this.jMenuItemDetalleAbrirOrderByContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByContactoCliente"));
			
		this.jMenuItemDetalleMostarOcultarContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarContactoCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosContactoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosContactoCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarContactoCliente"));
			
		this.jMenuItemNuevoGuardarCambiosContactoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosContactoCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosContactoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosContactoCliente"));

		this.jCheckBoxSeleccionadosContactoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosContactoCliente"));
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioContactoCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesContactoCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesContactoCliente"));
			
		this.jComboBoxTiposAccionesContactoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesContactoCliente"));
					
		this.jComboBoxTiposSeleccionarContactoCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarContactoCliente"));
			
		this.jTextFieldValorCampoGeneralContactoCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralContactoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonidContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idContactoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_empresaContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_empresaContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaContactoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_sucursalContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_sucursalContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalContactoClienteBusqueda"));
		//jButtonid_clienteContactoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteContactoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoCliente.addActionListener(new ButtonActionListener(this,"id_clienteContactoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonnombre_completoContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonrucContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"rucContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtondireccionContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"direccionContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtontelefonoContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"telefonoContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtontelefono_celularContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"telefono_celularContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonemailContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"emailContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtondescripcionContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionContactoClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteContactoCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteContactoCliente"));

			this.jButtonBuscarFK_IdClienteid_clienteContactoCliente.addActionListener(new ButtonActionListener(this,"id_clienteContactoCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoContactoCliente!=null) {
				this.jInternalFrameReporteDinamicoContactoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContactoCliente"));
				this.jInternalFrameReporteDinamicoContactoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContactoCliente"));
				this.jInternalFrameReporteDinamicoContactoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContactoCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoContactoCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContactoCliente"));				
			//this.jButtonGenerarReporteDinamicoContactoCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContactoCliente"));
			//this.jButtonGenerarExcelReporteDinamicoContactoCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContactoCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionContactoCliente!=null) {
				this.jInternalFrameImportacionContactoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionContactoCliente"));
				this.jInternalFrameImportacionContactoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionContactoCliente"));
				this.jInternalFrameImportacionContactoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionContactoCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByContactoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByContactoCliente"));
			
			this.jButtonAbrirOrderByToolBarContactoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarContactoCliente"));			
			
			if(this.jInternalFrameOrderByContactoCliente!=null) {
				this.jInternalFrameOrderByContactoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByContactoCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormContactoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContactoCliente.jTabbedPaneRelacionesContactoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesContactoCliente"));
		
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
            		closingInternalFrameContactoCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormContactoCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormContactoCliente = (JInternalFrameBase)event.getSource();
	            	
	            ContactoClienteBeanSwingJInternalFrame jInternalFrameParent=(ContactoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormContactoCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarContactoClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosContactoCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosContactoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosContactoCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosContactoCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContactoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContactoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContactoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoContactoCliente";
		inputMap = this.jButtonNuevoContactoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoContactoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoContactoClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContactoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContactoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContactoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesContactoCliente";
		inputMap = this.jButtonNuevoRelacionesContactoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesContactoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoContactoClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarContactoCliente";
		inputMap = this.jButtonModificarContactoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarContactoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarContactoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarContactoCliente";
		inputMap = this.jButtonActualizarContactoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarContactoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarContactoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarContactoCliente";
		inputMap = this.jButtonEliminarContactoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarContactoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarContactoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarContactoCliente";
		inputMap = this.jButtonCancelarContactoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarContactoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarContactoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarContactoCliente";
		inputMap = this.jButtonCerrarContactoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarContactoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarContactoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosContactoCliente";
		inputMap = this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosContactoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormContactoCliente.jButtonGuardarCambiosContactoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosContactoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosContactoCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosContactoClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesContactoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesContactoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarContactoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarContactoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralContactoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralContactoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonidContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idContactoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_empresaContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_empresaContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaContactoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_sucursalContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_sucursalContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalContactoClienteBusqueda"));
		//jButtonid_clienteContactoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteContactoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoCliente.addActionListener(new ButtonActionListener(this,"id_clienteContactoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteContactoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonnombre_completoContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonrucContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"rucContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtondireccionContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"direccionContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtontelefonoContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"telefonoContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtontelefono_celularContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"telefono_celularContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtonemailContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"emailContactoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContactoCliente.jButtondescripcionContactoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionContactoClienteBusqueda"));
		
		
		this.jButtonFK_IdClienteContactoCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteContactoCliente"));

		this.jButtonBuscarFK_IdClienteid_clienteContactoCliente.addActionListener(new ButtonActionListener(this,"id_clienteContactoCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionContactoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionContactoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarContactoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarContactoCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosContactoCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
					contactoclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ContactoCliente contactoclienteAux:contactoclientes) {
					contactoclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosContactoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingContactoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
						contactoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ContactoCliente contactoclienteAux:contactoclientes) {
						contactoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ContactoCliente contactoclienteAux:contactoclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaContactoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosContactoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosContactoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosContactoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingContactoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosContactoCliente.getSelectedRows();
			
			ContactoCliente contactoclienteLocal=new ContactoCliente();
			
			//this.seleccionarTodosContactoCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contactoclienteLocal =(ContactoCliente) this.contactoclienteLogic.getContactoClientes().toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					contactoclienteLocal =(ContactoCliente) this.contactoclientes.toArray()[this.jTableDatosContactoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				contactoclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
						contactoclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ContactoCliente contactoclienteAux:contactoclientes) {
						contactoclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaContactoCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosContactoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosContactoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosContactoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualContactoClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarContactoClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralContactoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingContactoCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralContactoCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ContactoCliente contactoclienteAux:this.contactoclienteLogic.getContactoClientes()) {
				
						if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							contactoclienteAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_RUC)) {
							existe=true;
							contactoclienteAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							contactoclienteAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							contactoclienteAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR)) {
							existe=true;
							contactoclienteAux.settelefono_celular(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							contactoclienteAux.setemail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							contactoclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ContactoCliente contactoclienteAux:contactoclientes) {
					
						if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							contactoclienteAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_RUC)) {
							existe=true;
							contactoclienteAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							contactoclienteAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							contactoclienteAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR)) {
							existe=true;
							contactoclienteAux.settelefono_celular(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							contactoclienteAux.setemail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							contactoclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaContactoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesContactoClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingContactoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioContactoCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesContactoCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteContactoCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessContactoCliente(conSplash);
				
					this.generarReporteContactoClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoContactoClientesSeleccionados();
				//this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoContactoClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoContactoClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessContactoCliente();
				
				this.exportarContactoClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionContactoClientes();
				//this.importarContactoClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessContactoCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelContactoClientesSeleccionados();
				//this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Contacto Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessContactoCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoContactoCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyContactoCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(ContactoClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteContactoCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessContactoCliente(conSplash);
					
						//this.actualizarParametrosGeneralContactoCliente();
						
						this.generarReporteProcesoAccionContactoClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ContactoClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Contacto ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Contacto Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessContactoCliente();
				
						this.actualizarParametrosGeneralContactoCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.contactoclienteReturnGeneral=contactoclienteLogic.procesarAccionContactoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.contactoclienteLogic.getContactoClientes(),this.contactoclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarContactoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralContactoCliente();
					
					ContactoClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarContactoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesContactoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormContactoCliente.jComboBoxTiposAccionesFormularioContactoCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessContactoCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesContactoClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessContactoCliente();
			
			if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		
			ContactoCliente contactocliente=new ContactoCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingContactoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesContactoCliente.getSelectedItem();
			
			
			
			
			contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(contactoclientesSeleccionados.size()==1) {
				for(ContactoCliente contactoclienteAux:contactoclientesSeleccionados) {
					contactocliente=contactoclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessContactoCliente();
			
      		//this.finishProcessContactoCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarContactoClienteReturnGeneral() throws Exception {
		if(this.contactoclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.contactoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.contactoclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.contactoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.contactoclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.contactoclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingContactoCliente(false);
		}
		
		if(this.contactoclienteReturnGeneral.getConRetornoLista() || this.contactoclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.contactoclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.contactoclienteLogic.setContactoClientes(this.contactoclienteReturnGeneral.getContactoClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.contactoclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.contactoclienteLogic.setContactoCliente(this.contactoclienteReturnGeneral.getContactoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingContactoCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralContactoCliente() throws Exception {
		
		
	}
	
	public ArrayList<ContactoCliente> getContactoClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioContactoCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ContactoCliente contactoclienteAux:contactoclienteLogic.getContactoClientes()) {
					if(contactoclienteAux.getIsSelected()) {
						contactoclientesSeleccionados.add(contactoclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ContactoCliente contactoclienteAux:this.contactoclientes) {
					if(contactoclienteAux.getIsSelected()) {
						contactoclientesSeleccionados.add(contactoclienteAux);				
					}
				}
			}
			
			if(contactoclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						contactoclientesSeleccionados.addAll(this.contactoclienteLogic.getContactoClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						contactoclientesSeleccionados.addAll(this.contactoclientes);				
					}
				}
			}
		} else {
			contactoclientesSeleccionados.add(this.contactocliente);
		}
		
		return contactoclientesSeleccionados;
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
	
	public void generarReporteContactoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalContactoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoContactoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoContactoClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoContactoClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Contacto Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesContactoClientesSeleccionados() throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteContactoClientes("Todos",contactoclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalContactoClientesSeleccionados() throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteContactoClientes("Todos",contactoclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionContactoClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteContactoClientes("Todos",contactoclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoContactoClientesSeleccionados() throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoContactoCliente();
		
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoContactoCliente();
		
		
		//this.generarReporteContactoClientes("Todos",contactoclientesSeleccionados ,contactoclienteImplementable,contactoclienteImplementableHome);
	}
	
	public void mostrarImportacionContactoClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionContactoCliente();
		
		this.abrirFrameImportacionContactoCliente();		
		
			
		//this.generarReporteContactoClientes("Todos",contactoclientesSeleccionados ,contactoclienteImplementable,contactoclienteImplementableHome);
	}
	
	public void importarContactoClientes() throws Exception {		
	
	}
	
	public void exportarContactoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelContactoClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoContactoClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlContactoClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Contacto Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoContactoClientesSeleccionados() throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contactocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarContactoCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ContactoCliente contactoclienteAux:contactoclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarContactoCliente(contactoclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//contactoclienteAux.setsDetalleGeneralEntityReporte(contactoclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarContactoCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContactoClienteConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarContactoCliente(ContactoCliente contactocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=contactocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.gettelefono_celular();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getemail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contactocliente.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelContactoClientesSeleccionados() throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contactocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ContactoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelContactoCliente(row);				
				iRow++;
			}				
			
			for(ContactoCliente contactoclienteAux:contactoclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelContactoCliente(contactoclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlContactoClientesSeleccionados() throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();		
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contactocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("contactoclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("contactocliente");
			//elementRoot.appendChild(element);
		
			for(ContactoCliente contactoclienteAux:contactoclientesSeleccionados) {
				element = document.createElement("contactocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlContactoCliente(contactoclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contacto Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelContactoCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ContactoClienteConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelContactoCliente(ContactoCliente contactocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.gettelefono_celular());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getemail());
		cell = row.createCell(iColumn++);cell.setCellValue(contactocliente.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlContactoCliente(ContactoCliente contactocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ContactoClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(contactocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ContactoClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(contactocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ContactoClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(contactocliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ContactoClienteConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(contactocliente.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(ContactoClienteConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(contactocliente.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementnombre_completo = document.createElement(ContactoClienteConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(contactocliente.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementruc = document.createElement(ContactoClienteConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(contactocliente.getruc().trim()));
		element.appendChild(elementruc);

		Element elementdireccion = document.createElement(ContactoClienteConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(contactocliente.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(ContactoClienteConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(contactocliente.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementtelefono_celular = document.createElement(ContactoClienteConstantesFunciones.TELEFONOCELULAR);
		elementtelefono_celular.appendChild(document.createTextNode(contactocliente.gettelefono_celular().trim()));
		element.appendChild(elementtelefono_celular);

		Element elementemail = document.createElement(ContactoClienteConstantesFunciones.EMAIL);
		elementemail.appendChild(document.createTextNode(contactocliente.getemail().trim()));
		element.appendChild(elementemail);

		Element elementdescripcion = document.createElement(ContactoClienteConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(contactocliente.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoContactoClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ContactoCliente> contactoclientesSeleccionados=new ArrayList<ContactoCliente>();
		
		contactoclientesSeleccionados=this.getContactoClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoContactoCliente(contactoclientesSeleccionados);
		
		this.generarReporteContactoClientes("Todos",contactoclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoContactoCliente(ArrayList<ContactoCliente> contactoclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ContactoCliente contactoclienteAux:contactoclientesSeleccionados) {
				contactoclienteAux.setsDetalleGeneralEntityReporte(contactoclienteAux.toString());
			
				if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_RUC)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.gettelefono_celular());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.getemail());
				}
				 else if(sTipoSeleccionar.equals(ContactoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					contactoclienteAux.setsDescripcionGeneralEntityReporte1(contactoclienteAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContactoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesContactoCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoContactoCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesContactoCliente=true;
				this.isVisibilidadCeldaGuardarCambiosContactoCliente=true;
			}
			
			this.isVisibilidadCeldaModificarContactoCliente=false;
			this.isVisibilidadCeldaActualizarContactoCliente=false;
			this.isVisibilidadCeldaEliminarContactoCliente=false;
			this.isVisibilidadCeldaCancelarContactoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContactoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoContactoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=false;
			this.isVisibilidadCeldaModificarContactoCliente=false;
			this.isVisibilidadCeldaActualizarContactoCliente=true;
			this.isVisibilidadCeldaEliminarContactoCliente=false;
			this.isVisibilidadCeldaCancelarContactoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContactoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoContactoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=false;
			this.isVisibilidadCeldaModificarContactoCliente=false;
			this.isVisibilidadCeldaActualizarContactoCliente=true;
			this.isVisibilidadCeldaEliminarContactoCliente=true;
			this.isVisibilidadCeldaCancelarContactoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContactoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoContactoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=false;
			this.isVisibilidadCeldaModificarContactoCliente=false;
			this.isVisibilidadCeldaActualizarContactoCliente=true;
			this.isVisibilidadCeldaEliminarContactoCliente=false;
			this.isVisibilidadCeldaCancelarContactoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoContactoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=true;
			this.isVisibilidadCeldaModificarContactoCliente=false;
			this.isVisibilidadCeldaActualizarContactoCliente=false;
			this.isVisibilidadCeldaEliminarContactoCliente=false;
			this.isVisibilidadCeldaCancelarContactoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContactoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoContactoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=false;
			this.isVisibilidadCeldaActualizarContactoCliente=false;
			this.isVisibilidadCeldaEliminarContactoCliente=false;
			this.isVisibilidadCeldaCancelarContactoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoContactoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=false;
			this.isVisibilidadCeldaModificarContactoCliente=true;
			this.isVisibilidadCeldaActualizarContactoCliente=false;
			this.isVisibilidadCeldaEliminarContactoCliente=false;
			this.isVisibilidadCeldaCancelarContactoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarContactoCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ContactoClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoContactoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=true;
		} else {
			this.actualizarEstadoPanelsContactoCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarContactoCliente=false;
			//this.isVisibilidadCeldaVerFormContactoCliente=false;
			this.isVisibilidadCeldaDuplicarContactoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!contactoclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoContactoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosContactoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(contactoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!contactoclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;												
			}
			
			this.jButtonCerrarContactoCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesContactoCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.contactocliente)) {
			this.isVisibilidadCeldaActualizarContactoCliente=false;
			this.isVisibilidadCeldaEliminarContactoCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesContactoCliente() {
	}
	
	public void actualizarEstadoPanelsContactoCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionContactoCliente!=null) {
				this.jScrollPanelDatosEdicionContactoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContactoCliente!=null) {
				this.jTabbedPaneBusquedasContactoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContactoCliente!=null) {
				this.jScrollPanelDatosContactoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionContactoCliente!=null) {
				this.jPanelPaginacionContactoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionContactoCliente!=null) {
				this.jScrollPanelDatosEdicionContactoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContactoCliente!=null) {
				this.jTabbedPaneBusquedasContactoCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosContactoCliente!=null) {
				this.jScrollPanelDatosContactoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionContactoCliente!=null) {
				this.jPanelPaginacionContactoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionContactoCliente!=null) {
				this.jScrollPanelDatosEdicionContactoCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContactoCliente!=null) {
				this.jTabbedPaneBusquedasContactoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosContactoCliente!=null) {
				this.jScrollPanelDatosContactoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionContactoCliente!=null) {
				this.jPanelPaginacionContactoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionContactoCliente!=null) {
				this.jScrollPanelDatosEdicionContactoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContactoCliente!=null) {
				this.jTabbedPaneBusquedasContactoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosContactoCliente!=null) {
				this.jScrollPanelDatosContactoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionContactoCliente!=null) {
				this.jPanelPaginacionContactoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionContactoCliente!=null) {
				this.jScrollPanelDatosEdicionContactoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContactoCliente!=null) {
				this.jTabbedPaneBusquedasContactoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContactoCliente!=null) {
				this.jScrollPanelDatosContactoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionContactoCliente!=null) {
				this.jPanelPaginacionContactoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionContactoCliente!=null) {
				this.jScrollPanelDatosEdicionContactoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContactoCliente!=null) {
				this.jTabbedPaneBusquedasContactoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContactoCliente!=null) {
				this.jScrollPanelDatosContactoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionContactoCliente!=null) {
				this.jPanelPaginacionContactoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionContactoCliente!=null) {
				this.jScrollPanelDatosEdicionContactoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContactoCliente!=null) {
				this.jTabbedPaneBusquedasContactoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContactoCliente!=null) {
				this.jScrollPanelDatosContactoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionContactoCliente!=null) {
				this.jPanelPaginacionContactoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasContactoCliente!=null) {
					this.jTabbedPaneBusquedasContactoCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContactoCliente!=null) {
				this.jTabbedPaneBusquedasContactoCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesContactoCliente!=null) {
				this.jPanelParametrosReportesContactoCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasContactoCliente.remove(jPanelFK_IdClienteContactoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasContactoCliente.remove(jPanelFK_IdClienteContactoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasContactoCliente.remove(jPanelFK_IdClienteContactoCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionContactoClienteParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(contactoclienteSessionBean==null) {
				contactoclienteSessionBean=new ContactoClienteSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(contactoclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.contactoclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ContactoClienteConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionContactoCliente(true);
			//clienteSessionBean.setlidContactoClienteActual(this.idContactoClienteActual);

			contactoclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyContactoCliente(true);
			contactoclienteSessionBean.setlIdContactoClienteActualForeignKey(this.idContactoClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ContactoClienteSessionBean contactoclienteSessionBean=new ContactoClienteSessionBean();
		
		if(this.contactoclienteSessionBean==null) {
			this.contactoclienteSessionBean=new ContactoClienteSessionBean();
		}
		
		this.contactoclienteSessionBean.setsUltimaBusquedaContactoCliente(this.getsAccionBusqueda());
		this.contactoclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.contactoclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			contactoclienteSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			contactoclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			contactoclienteSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ContactoClienteSessionBean contactoclienteSessionBean=new ContactoClienteSessionBean();
		
		if(this.contactoclienteSessionBean==null) {
			this.contactoclienteSessionBean=new ContactoClienteSessionBean();
		}
		
		if(this.contactoclienteSessionBean.getsUltimaBusquedaContactoCliente()!=null&&!this.contactoclienteSessionBean.getsUltimaBusquedaContactoCliente().equals("")) {
			this.setsAccionBusqueda(contactoclienteSessionBean.getsUltimaBusquedaContactoCliente());
			this.setiNumeroPaginacion(contactoclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(contactoclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(contactoclienteSessionBean.getid_cliente());
				contactoclienteSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(contactoclienteSessionBean.getid_empresa());
				contactoclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(contactoclienteSessionBean.getid_sucursal());
				contactoclienteSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.contactoclienteSessionBean.setsUltimaBusquedaContactoCliente("");
		this.contactoclienteSessionBean.setiNumeroPaginacion(ContactoClienteConstantesFunciones.INUMEROPAGINACION);
		this.contactoclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaContactoCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioContactoCliente() {
		this.updateBorderResaltarBusquedasFormularioContactoCliente();
		this.updateVisibilidadBusquedasFormularioContactoCliente();
		this.updateHabilitarBusquedasFormularioContactoCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioContactoCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasContactoCliente.getComponents().length>0) {
	

		if(this.contactoclienteConstantesFunciones.resaltarFK_IdClienteContactoCliente!=null) {
			index= this.jTabbedPaneBusquedasContactoCliente.indexOfComponent(this.jPanelFK_IdClienteContactoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasContactoCliente.getComponent(index);
				jPanel.setBorder(this.contactoclienteConstantesFunciones.resaltarFK_IdClienteContactoCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioContactoCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasContactoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasContactoCliente.indexOfComponent(this.jPanelFK_IdClienteContactoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasContactoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.contactoclienteConstantesFunciones.mostrarFK_IdClienteContactoCliente);
			if(!this.contactoclienteConstantesFunciones.mostrarFK_IdClienteContactoCliente && index>-1) {
				this.jTabbedPaneBusquedasContactoCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioContactoCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasContactoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasContactoCliente.indexOfComponent(this.jPanelFK_IdClienteContactoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasContactoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.contactoclienteConstantesFunciones.activarFK_IdClienteContactoCliente);
				this.jTabbedPaneBusquedasContactoCliente.setEnabledAt(index,this.contactoclienteConstantesFunciones.activarFK_IdClienteContactoCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaContactoCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasContactoCliente.indexOfComponent(this.jPanelFK_IdClienteContactoCliente);

			this.jTabbedPaneBusquedasContactoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasContactoCliente.getComponent(index);

			this.contactoclienteConstantesFunciones.setResaltarFK_IdClienteContactoCliente(resaltar);

			jPanel.setBorder(this.contactoclienteConstantesFunciones.resaltarFK_IdClienteContactoCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarContactoCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioContactoCliente() throws Exception {

		if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioContactoCliente();
		this.updateVisibilidadResaltarControlesFormularioContactoCliente();
		this.updateHabilitarResaltarControlesFormularioContactoCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioContactoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.contactoclienteConstantesFunciones.resaltaridContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltaridContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltarid_empresaContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltarid_empresaContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltarid_sucursalContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltarid_sucursalContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltarid_clienteContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltarid_clienteContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltarnombre_completoContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jTextAreanombre_completoContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltarnombre_completoContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltarrucContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jTextFieldrucContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltarrucContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltardireccionContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jTextAreadireccionContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltardireccionContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltartelefonoContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefonoContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltartelefonoContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltartelefono_celularContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefono_celularContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltartelefono_celularContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltaremailContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jTextFieldemailContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltaremailContactoCliente);}
		if(this.contactoclienteConstantesFunciones.resaltardescripcionContactoCliente!=null && this.jInternalFrameDetalleFormContactoCliente!=null) {this.jInternalFrameDetalleFormContactoCliente.jTextAreadescripcionContactoCliente.setBorder(this.contactoclienteConstantesFunciones.resaltardescripcionContactoCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioContactoCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
	
		//this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostraridContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPanelidContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostraridContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarid_empresaContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPanelid_empresaContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarid_empresaContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarid_sucursalContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPanelid_sucursalContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarid_sucursalContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarid_clienteContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPanelid_clienteContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarid_clienteContactoCliente);
			this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarid_clienteContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jTextAreanombre_completoContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarnombre_completoContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPanelnombre_completoContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarnombre_completoContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jTextFieldrucContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarrucContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPanelrucContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrarrucContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jTextAreadireccionContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrardireccionContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPaneldireccionContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrardireccionContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefonoContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrartelefonoContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPaneltelefonoContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrartelefonoContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefono_celularContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrartelefono_celularContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPaneltelefono_celularContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrartelefono_celularContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jTextFieldemailContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostraremailContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPanelemailContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostraremailContactoCliente);
		//this.jInternalFrameDetalleFormContactoCliente.jTextAreadescripcionContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrardescripcionContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jPaneldescripcionContactoCliente.setVisible(this.contactoclienteConstantesFunciones.mostrardescripcionContactoCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioContactoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormContactoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormContactoCliente!=null) {
	
		this.jInternalFrameDetalleFormContactoCliente.jLabelidContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activaridContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_empresaContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activarid_empresaContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_sucursalContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activarid_sucursalContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jComboBoxid_clienteContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activarid_clienteContactoCliente);
			this.jInternalFrameDetalleFormContactoCliente.jButtonid_clienteContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activarid_clienteContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextAreanombre_completoContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activarnombre_completoContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextFieldrucContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activarrucContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextAreadireccionContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activardireccionContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefonoContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activartelefonoContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextFieldtelefono_celularContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activartelefono_celularContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextFieldemailContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activaremailContactoCliente);
		this.jInternalFrameDetalleFormContactoCliente.jTextAreadescripcionContactoCliente.setEnabled(this.contactoclienteConstantesFunciones.activardescripcionContactoCliente);
		}
	}
	
		
}