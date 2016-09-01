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

import com.bydan.erp.cartera.util.TelefonoConstantesFunciones;
import com.bydan.erp.cartera.util.TelefonoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TelefonoParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TelefonoBean;
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
public class TelefonoBeanSwingJInternalFrame extends TelefonoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TelefonoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Telefono> telefonoValidator = new ClassValidator<Telefono>(Telefono.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Telefono telefono;	
	public Telefono telefonoAux;
	public Telefono telefonoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Telefono telefonoTotales;
	public Long idTelefonoActual;
	public Long iIdNuevoTelefono=0L;
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

	public String sFinalQueryComboTipoTelefo="";

	public List<TipoTelefo> tipotelefosForeignKey;

	public List<TipoTelefo> gettipotelefosForeignKey() {
		return tipotelefosForeignKey;
	}

	public void settipotelefosForeignKey(List<TipoTelefo> tipotelefosForeignKey) {
		this.tipotelefosForeignKey = tipotelefosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTelefo tipotelefoForeignKey;

	public TipoTelefo gettipotelefoForeignKey() {
		return tipotelefoForeignKey;
	}

	public void settipotelefoForeignKey(TipoTelefo tipotelefoForeignKey) {
		this.tipotelefoForeignKey = tipotelefoForeignKey;
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
	
	public Boolean isPermisoTodoTelefono;
	public Boolean isPermisoNuevoTelefono;
	public Boolean isPermisoActualizarTelefono;
	public Boolean isPermisoActualizarOriginalTelefono;
	public Boolean isPermisoEliminarTelefono;
	public Boolean isPermisoGuardarCambiosTelefono;
	public Boolean isPermisoConsultaTelefono;
	public Boolean isPermisoBusquedaTelefono;
	public Boolean isPermisoReporteTelefono;
	public Boolean isPermisoPaginacionMedioTelefono;
	public Boolean isPermisoPaginacionAltoTelefono;
	public Boolean isPermisoPaginacionTodoTelefono;
	public Boolean isPermisoCopiarTelefono;
	public Boolean isPermisoVerFormTelefono;
	public Boolean isPermisoDuplicarTelefono;
	public Boolean isPermisoOrdenTelefono;
	
	
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
	
	public TelefonoParameterReturnGeneral telefonoReturnGeneral;
	public TelefonoParameterReturnGeneral telefonoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTelefono=false;
	public Boolean esParaAccionDesdeFormularioTelefono=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TelefonoSessionBeanAdditional telefonoSessionBeanAdditional=null;
	
	public TelefonoSessionBeanAdditional getTelefonoSessionBeanAdditional() {
		return this.telefonoSessionBeanAdditional;
	}
	
	public void setTelefonoSessionBeanAdditional(TelefonoSessionBeanAdditional telefonoSessionBeanAdditional) {
		try {
			this.telefonoSessionBeanAdditional=telefonoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TelefonoBeanSwingJInternalFrameAdditional telefonoBeanSwingJInternalFrameAdditional=null;
	//public class TelefonoBeanSwingJInternalFrame
	
	public TelefonoBeanSwingJInternalFrameAdditional getTelefonoBeanSwingJInternalFrameAdditional() {
		return this.telefonoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTelefonoBeanSwingJInternalFrameAdditional(TelefonoBeanSwingJInternalFrameAdditional telefonoBeanSwingJInternalFrameAdditional) {
		try {
			this.telefonoBeanSwingJInternalFrameAdditional=telefonoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TelefonoLogic telefonoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Telefono telefonoBean;
	public TelefonoConstantesFunciones telefonoConstantesFunciones;
	//public TelefonoParameterReturnGeneral telefonoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public TipoTelefoLogic tipotelefoLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<Telefono> telefonos;	
	//public List<Telefono> telefonosEliminados;
	//public List<Telefono> telefonosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTelefono=false;
	public Boolean isVisibilidadCeldaDuplicarTelefono=true;
	public Boolean isVisibilidadCeldaCopiarTelefono=true;
	public Boolean isVisibilidadCeldaVerFormTelefono=true;
	public Boolean isVisibilidadCeldaOrdenTelefono=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTelefono=false;
	public Boolean isVisibilidadCeldaModificarTelefono=false;
	public Boolean isVisibilidadCeldaActualizarTelefono=false;
	public Boolean isVisibilidadCeldaEliminarTelefono=false;
	public Boolean isVisibilidadCeldaCancelarTelefono=false;
	public Boolean isVisibilidadCeldaGuardarTelefono=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTelefono=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdValorTelefono=false;
	
	public Long getiIdNuevoTelefono() {
		return this.iIdNuevoTelefono;
	}

	public void setiIdNuevoTelefono(Long iIdNuevoTelefono) {
		this.iIdNuevoTelefono = iIdNuevoTelefono;
	}
	
	public Long getidTelefonoActual() {
		return this.idTelefonoActual;
	}

	public void setidTelefonoActual(Long idTelefonoActual) {
		this.idTelefonoActual = idTelefonoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Telefono gettelefono() {
		return this.telefono;
	}

	public void settelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	
	public Telefono gettelefonoAux() {
		return this.telefonoAux;
	}

	public void settelefonoAux(Telefono telefonoAux) {
		this.telefonoAux = telefonoAux;
	}				
	
	public Telefono gettelefonoAnterior() {
		return this.telefonoAnterior;
	}

	public void settelefonoAnterior(Telefono telefonoAnterior) {
		this.telefonoAnterior = telefonoAnterior;
	}	
	
	public Telefono gettelefonoTotales() {
		return this.telefonoTotales;
	}

	public void settelefonoTotales(Telefono telefonoTotales) {
		this.telefonoTotales = telefonoTotales;
	}	
	
	public Telefono gettelefonoBean() {
		return this.telefonoBean;
	}

	public void settelefonoBean(Telefono telefonoBean) {
		this.telefonoBean = telefonoBean;
	}	
	
	public TelefonoParameterReturnGeneral gettelefonoReturnGeneral() {
		return this.telefonoReturnGeneral;
	}

	public void settelefonoReturnGeneral(TelefonoParameterReturnGeneral telefonoReturnGeneral) {
		this.telefonoReturnGeneral = telefonoReturnGeneral;
	}	
	
	
	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
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

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_tipo_telefonoFK_IdValorTelefono=-1L;

	public Long getid_tipo_telefonoFK_IdValorTelefono() {
		return this.id_tipo_telefonoFK_IdValorTelefono;
	}

	public void setid_tipo_telefonoFK_IdValorTelefono(Long id_tipo_telefonoFK_IdValorTelefono) {
		this.id_tipo_telefonoFK_IdValorTelefono = id_tipo_telefonoFK_IdValorTelefono;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TelefonoLogic getTelefonoLogic()	{		
		return telefonoLogic;
	}

	public void setTelefonoLogic(TelefonoLogic telefonoLogic) {
		this.telefonoLogic = telefonoLogic;
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
	
	public Boolean getIsEsNuevoTelefono() {
		return isEsNuevoTelefono;
	}

	public void setIsEsNuevoTelefono(Boolean isEsNuevoTelefono) {
		this.isEsNuevoTelefono = isEsNuevoTelefono;
	}

	public Boolean getEsParaAccionDesdeFormularioTelefono() {
		return esParaAccionDesdeFormularioTelefono;
	}
	
	public void setEsParaAccionDesdeFormularioTelefono(Boolean esParaAccionDesdeFormularioTelefono) {
		this.esParaAccionDesdeFormularioTelefono = esParaAccionDesdeFormularioTelefono;
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

			if(this.telefonoSessionBean==null) {
				this.telefonoSessionBean=new TelefonoSessionBean();
			}

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(telefonoSessionBean.getlidEmpresaActual());
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

			if(this.telefonoSessionBean==null) {
				this.telefonoSessionBean=new TelefonoSessionBean();
			}

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(telefonoSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoTelefosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipotelefosForeignKey=new ArrayList<TipoTelefo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTelefoLogic tipotelefoLogic=new TipoTelefoLogic();

			//tipotelefoLogic.getTipoTelefoDataAccess().setIsForForeingKeyData(true);

			if(this.telefonoSessionBean==null) {
				this.telefonoSessionBean=new TelefonoSessionBean();
			}

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTelefo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipotelefoLogic.getTipoTelefoDataAccess().setIsForForeingKeyData(true);

					tipotelefoLogic.getTodosTipoTelefosWithConnection(sFinalQuery,new Pagination());

					this.tipotelefosForeignKey=tipotelefoLogic.getTipoTelefos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTelefo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotelefoLogic.getEntityWithConnection(telefonoSessionBean.getlidTipoTelefoActual());
					this.tipotelefosForeignKey.add(tipotelefoLogic.getTipoTelefo());
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

			if(this.telefonoSessionBean==null) {
				this.telefonoSessionBean=new TelefonoSessionBean();
			}

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(telefonoSessionBean.getlidPaisActual());
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

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.telefonoSessionBean==null) {
				this.telefonoSessionBean=new TelefonoSessionBean();
			}

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
					ciudadLogic.getEntityWithConnection(telefonoSessionBean.getlidCiudadActual());
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

					if(this.telefono!=null) {
						this.telefono.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) {
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTelefono.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTelefono!=null) {
						if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.getItemCount()>0) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTelefonoGenerico)throws Exception
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
				jComboBoxid_empresaTelefonoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTelefonoGenerico!=null && jComboBoxid_empresaTelefonoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTelefonoGenerico.setSelectedIndex(0);
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

					if(this.telefono!=null) {
						this.telefono.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) {
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteTelefono.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormTelefono!=null) {
						if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.getItemCount()>0) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteTelefono!=null) {
						jComboBoxid_clienteFK_IdClienteTelefono.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteTelefono!=null) {
							//jComboBoxid_clienteFK_IdClienteTelefono.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteTelefono.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteTelefono.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteTelefonoGenerico)throws Exception
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
				jComboBoxid_clienteTelefonoGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteTelefonoGenerico!=null && jComboBoxid_clienteTelefonoGenerico.getItemCount()>0) {
					jComboBoxid_clienteTelefonoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTelefoForeignKey(Long idTipoTelefoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTelefo  tipotelefoTemp=null;

			for(TipoTelefo tipotelefoAux:tipotelefosForeignKey) {
				if(tipotelefoAux.getId()!=null && tipotelefoAux.getId().equals(idTipoTelefoSeleccionado)) {
					tipotelefoTemp=tipotelefoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipotelefoTemp!=null) {

					if(this.telefono!=null) {
						this.telefono.setTipoTelefo(tipotelefoTemp);
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) {
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setSelectedItem(tipotelefoTemp);
					}
				} else {
					//jComboBoxid_tipo_telefonoTelefono.setSelectedItem(tipotelefoTemp);
					if(this.jInternalFrameDetalleFormTelefono!=null) {
						if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.getItemCount()>0) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorTelefono") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipotelefoTemp!=null && jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono!=null) {
						jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.setSelectedItem(tipotelefoTemp);
					} else {
						if(jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono!=null) {
							//jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.setSelectedItem(tipotelefoTemp);
							if(jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.getItemCount()>0) {
								jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.setSelectedIndex(0);
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

	public String getActualTipoTelefoForeignKeyDescripcion(Long idTipoTelefoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTelefo  tipotelefoTemp=null;

			for(TipoTelefo tipotelefoAux:tipotelefosForeignKey) {
				if(tipotelefoAux.getId()!=null && tipotelefoAux.getId().equals(idTipoTelefoSeleccionado)) {
					tipotelefoTemp=tipotelefoAux;
					break;
				}
			}


			sDescripcion=TipoTelefoConstantesFunciones.getTipoTelefoDescripcion(tipotelefoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTelefoForeignKeyGenerico(Long idTipoTelefoSeleccionado,JComboBox jComboBoxid_tipo_telefonoTelefonoGenerico)throws Exception
	{
		try
		{
			TipoTelefo  tipotelefoTemp=null;

			for(TipoTelefo tipotelefoAux:tipotelefosForeignKey) {
				if(tipotelefoAux.getId()!=null && tipotelefoAux.getId().equals(idTipoTelefoSeleccionado)) {
					tipotelefoTemp=tipotelefoAux;
					break;
				}
			}

			if(tipotelefoTemp!=null) {
				jComboBoxid_tipo_telefonoTelefonoGenerico.setSelectedItem(tipotelefoTemp);
			} else {
				if(jComboBoxid_tipo_telefonoTelefonoGenerico!=null && jComboBoxid_tipo_telefonoTelefonoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_telefonoTelefonoGenerico.setSelectedIndex(0);
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

					if(this.telefono!=null) {
						this.telefono.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) {
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTelefono.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTelefono!=null) {
						if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.getItemCount()>0) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTelefono!=null) {
						jComboBoxid_paisFK_IdPaisTelefono.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTelefono!=null) {
							//jComboBoxid_paisFK_IdPaisTelefono.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTelefono.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTelefono.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTelefonoGenerico)throws Exception
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
				jComboBoxid_paisTelefonoGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTelefonoGenerico!=null && jComboBoxid_paisTelefonoGenerico.getItemCount()>0) {
					jComboBoxid_paisTelefonoGenerico.setSelectedIndex(0);
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

					if(this.telefono!=null) {
						this.telefono.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) {
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadTelefono.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormTelefono!=null) {
						if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.getItemCount()>0) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadFK_IdCiudadTelefono!=null) {
						jComboBoxid_ciudadFK_IdCiudadTelefono.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadFK_IdCiudadTelefono!=null) {
							//jComboBoxid_ciudadFK_IdCiudadTelefono.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadFK_IdCiudadTelefono.getItemCount()>0) {
								jComboBoxid_ciudadFK_IdCiudadTelefono.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadTelefonoGenerico)throws Exception
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
				jComboBoxid_ciudadTelefonoGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadTelefonoGenerico!=null && jComboBoxid_ciudadTelefonoGenerico.getItemCount()>0) {
					jComboBoxid_ciudadTelefonoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Telefono telefono,JComboBox jComboBoxid_empresaTelefonoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTelefonoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTelefonoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				telefono.setid_empresa(empresaAux.getId());
				telefono.setempresa_descripcion(TelefonoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				telefono.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Telefono telefono,JComboBox jComboBoxid_clienteTelefonoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteTelefonoGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteTelefonoGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				telefono.setid_cliente(clienteAux.getId());
				telefono.setcliente_descripcion(TelefonoConstantesFunciones.getClienteDescripcion(clienteAux));
				telefono.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTelefoForeignKey(Telefono telefono,JComboBox jComboBoxid_tipo_telefonoTelefonoGenerico)throws Exception
	{
		try
		{
			TipoTelefo  tipotelefoAux=new TipoTelefo();

			if(jComboBoxid_tipo_telefonoTelefonoGenerico==null) {
				tipotelefoAux=(TipoTelefo)this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.getSelectedItem();
			} else {
				tipotelefoAux=(TipoTelefo)jComboBoxid_tipo_telefonoTelefonoGenerico.getSelectedItem();
			}

			if(tipotelefoAux!=null && tipotelefoAux.getId()!=null) {
				telefono.setid_tipo_telefono(tipotelefoAux.getId());
				telefono.settipotelefo_descripcion(TelefonoConstantesFunciones.getTipoTelefoDescripcion(tipotelefoAux));
				telefono.setTipoTelefo(tipotelefoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Telefono telefono,JComboBox jComboBoxid_paisTelefonoGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTelefonoGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTelefonoGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				telefono.setid_pais(paisAux.getId());
				telefono.setpais_descripcion(TelefonoConstantesFunciones.getPaisDescripcion(paisAux));
				telefono.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(Telefono telefono,JComboBox jComboBoxid_ciudadTelefonoGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadTelefonoGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadTelefonoGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				telefono.setid_ciudad(ciudadAux.getId());
				telefono.setciudad_descripcion(TelefonoConstantesFunciones.getCiudadDescripcion(ciudadAux));
				telefono.setCiudad(ciudadAux);			}
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

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) { 
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) { 
					}

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) { 
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) { 
					}

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteTelefono.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteTelefono.addItem(cliente);
							}
						}

						if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTelefosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTelefo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) { 
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.removeAllItems();

							for(TipoTelefo tipotelefo:this.tipotelefosForeignKey) {
								this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.addItem(tipotelefo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) { 
					}

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorTelefono") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.removeAllItems();

							for(TipoTelefo tipotelefo:this.tipotelefosForeignKey) {
								this.jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.addItem(tipotelefo);
							}
						}

						if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) { 
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) { 
					}

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTelefono.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTelefono.addItem(pais);
							}
						}

						if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) { 
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTelefono!=null) { 
					}

					if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadTelefono.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadFK_IdCiudadTelefono.addItem(ciudad);
							}
						}

						if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteTelefono.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteTelefono.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoTelefoForeignKey(TipoTelefo tipotelefo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setSelectedItem(tipotelefo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.setSelectedItem(tipotelefo);
						} else {
							this.jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTelefono.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTelefono.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormTelefono!=null) {
							this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadFK_IdCiudadTelefono.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadTelefono.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTelefono() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TelefonoConstantesFunciones.refrescarForeignKeysDescripcionesTelefono(this.telefonoLogic.getTelefonos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TelefonoConstantesFunciones.refrescarForeignKeysDescripcionesTelefono(this.telefonos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoTelefo.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//telefonoLogic.setTelefonos(this.telefonos);
			telefonoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TelefonoParameterReturnGeneral getTelefonoParameterGeneral() {
		return this.telefonoParameterGeneral;
	}
	
	public void setTelefonoParameterGeneral(TelefonoParameterReturnGeneral telefonoParameterGeneral) {
		this.telefonoParameterGeneral = telefonoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTelefono() {
		return isPermisoTodoTelefono;
	}

	public void setIsPermisoTodoTelefono(Boolean isPermisoTodoTelefono) {
		this.isPermisoTodoTelefono = isPermisoTodoTelefono;
	}

	public Boolean getIsPermisoNuevoTelefono() {
		return isPermisoNuevoTelefono;
	}

	public void setIsPermisoNuevoTelefono(Boolean isPermisoNuevoTelefono) {
		this.isPermisoNuevoTelefono = isPermisoNuevoTelefono;
	}

	public Boolean getIsPermisoActualizarTelefono() {
		return isPermisoActualizarTelefono;
	}

	public void setIsPermisoActualizarTelefono(Boolean isPermisoActualizarTelefono) {
		this.isPermisoActualizarTelefono = isPermisoActualizarTelefono;
	}

	public Boolean getIsPermisoEliminarTelefono() {
		return isPermisoEliminarTelefono;
	}

	public void setIsPermisoEliminarTelefono(Boolean isPermisoEliminarTelefono) {
		this.isPermisoEliminarTelefono = isPermisoEliminarTelefono;
	}

	public Boolean getIsPermisoGuardarCambiosTelefono() {
		return isPermisoGuardarCambiosTelefono;
	}

	public void setIsPermisoGuardarCambiosTelefono(Boolean isPermisoGuardarCambiosTelefono) {
		this.isPermisoGuardarCambiosTelefono = isPermisoGuardarCambiosTelefono;
	}
	
	public Boolean getIsPermisoConsultaTelefono() {
		return isPermisoConsultaTelefono;
	}

	public void setIsPermisoConsultaTelefono(Boolean isPermisoConsultaTelefono) {
		this.isPermisoConsultaTelefono = isPermisoConsultaTelefono;
	}

	public Boolean getIsPermisoBusquedaTelefono() {
		return isPermisoBusquedaTelefono;
	}

	public void setIsPermisoBusquedaTelefono(Boolean isPermisoBusquedaTelefono) {
		this.isPermisoBusquedaTelefono = isPermisoBusquedaTelefono;
	}

	public Boolean getIsPermisoReporteTelefono() {
		return isPermisoReporteTelefono;
	}

	public void setIsPermisoReporteTelefono(Boolean isPermisoReporteTelefono) {
		this.isPermisoReporteTelefono = isPermisoReporteTelefono;
	}
	
	public Boolean getIsPermisoPaginacionMedioTelefono() {
		return isPermisoPaginacionMedioTelefono;
	}

	public void setIsPermisoPaginacionMedioTelefono(Boolean isPermisoPaginacionMedioTelefono) {
		this.isPermisoPaginacionMedioTelefono = isPermisoPaginacionMedioTelefono;
	}
	
	public Boolean getIsPermisoPaginacionTodoTelefono() {
		return isPermisoPaginacionTodoTelefono;
	}

	public void setIsPermisoPaginacionTodoTelefono(Boolean isPermisoPaginacionTodoTelefono) {
		this.isPermisoPaginacionTodoTelefono = isPermisoPaginacionTodoTelefono;
	}
	
	public Boolean getIsPermisoPaginacionAltoTelefono() {
		return isPermisoPaginacionAltoTelefono;
	}

	public void setIsPermisoPaginacionAltoTelefono(Boolean isPermisoPaginacionAltoTelefono) {
		this.isPermisoPaginacionAltoTelefono = isPermisoPaginacionAltoTelefono;
	}
	
	public Boolean getIsPermisoCopiarTelefono() {
		return isPermisoCopiarTelefono;
	}

	public void setIsPermisoCopiarTelefono(Boolean isPermisoCopiarTelefono) {
		this.isPermisoCopiarTelefono = isPermisoCopiarTelefono;
	}
	
	public Boolean getIsPermisoVerFormTelefono() {
		return isPermisoVerFormTelefono;
	}

	public void setIsPermisoVerFormTelefono(Boolean isPermisoVerFormTelefono) {
		this.isPermisoVerFormTelefono = isPermisoVerFormTelefono;
	}
	
	public Boolean getIsPermisoDuplicarTelefono() {
		return isPermisoDuplicarTelefono;
	}

	public void setIsPermisoDuplicarTelefono(Boolean isPermisoDuplicarTelefono) {
		this.isPermisoDuplicarTelefono = isPermisoDuplicarTelefono;
	}
	
	public Boolean getIsPermisoOrdenTelefono() {
		return isPermisoOrdenTelefono;
	}

	public void setIsPermisoOrdenTelefono(Boolean isPermisoOrdenTelefono) {
		this.isPermisoOrdenTelefono = isPermisoOrdenTelefono;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTelefono() {
		return isVisibilidadCeldaNuevoTelefono;
	}

	public void setIsVisibilidadCeldaNuevoTelefono(Boolean isVisibilidadCeldaNuevoTelefono) {
		this.isVisibilidadCeldaNuevoTelefono = isVisibilidadCeldaNuevoTelefono;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTelefono() {
		return isVisibilidadCeldaDuplicarTelefono;
	}

	public void setIsVisibilidadCeldaDuplicarTelefono(Boolean isVisibilidadCeldaDuplicarTelefono) {
		this.isVisibilidadCeldaDuplicarTelefono = isVisibilidadCeldaDuplicarTelefono;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTelefono() {
		return isVisibilidadCeldaCopiarTelefono;
	}

	public void setIsVisibilidadCeldaCopiarTelefono(Boolean isVisibilidadCeldaCopiarTelefono) {
		this.isVisibilidadCeldaCopiarTelefono = isVisibilidadCeldaCopiarTelefono;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTelefono() {
		return isVisibilidadCeldaVerFormTelefono;
	}

	public void setIsVisibilidadCeldaVerFormTelefono(Boolean isVisibilidadCeldaVerFormTelefono) {
		this.isVisibilidadCeldaVerFormTelefono = isVisibilidadCeldaVerFormTelefono;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTelefono() {
		return isVisibilidadCeldaOrdenTelefono;
	}

	public void setIsVisibilidadCeldaOrdenTelefono(Boolean isVisibilidadCeldaOrdenTelefono) {
		this.isVisibilidadCeldaOrdenTelefono = isVisibilidadCeldaOrdenTelefono;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTelefono() {
		return isVisibilidadCeldaNuevoRelacionesTelefono;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTelefono(Boolean isVisibilidadCeldaNuevoRelacionesTelefono) {
		this.isVisibilidadCeldaNuevoRelacionesTelefono = isVisibilidadCeldaNuevoRelacionesTelefono;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTelefono() {
		return isVisibilidadCeldaModificarTelefono;
	}

	public void setIsVisibilidadCeldaModificarTelefono(Boolean isVisibilidadCeldaModificarTelefono) {
		this.isVisibilidadCeldaModificarTelefono = isVisibilidadCeldaModificarTelefono;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTelefono() {
		return isVisibilidadCeldaActualizarTelefono;
	}

	public void setIsVisibilidadCeldaActualizarTelefono(Boolean isVisibilidadCeldaActualizarTelefono) {
		this.isVisibilidadCeldaActualizarTelefono = isVisibilidadCeldaActualizarTelefono;
	}

	public Boolean getIsVisibilidadCeldaEliminarTelefono() {
		return isVisibilidadCeldaEliminarTelefono;
	}

	public void setIsVisibilidadCeldaEliminarTelefono(Boolean isVisibilidadCeldaEliminarTelefono) {
		this.isVisibilidadCeldaEliminarTelefono = isVisibilidadCeldaEliminarTelefono;
	}

	public Boolean getIsVisibilidadCeldaCancelarTelefono() {
		return isVisibilidadCeldaCancelarTelefono;
	}

	public void setIsVisibilidadCeldaCancelarTelefono(Boolean isVisibilidadCeldaCancelarTelefono) {
		this.isVisibilidadCeldaCancelarTelefono = isVisibilidadCeldaCancelarTelefono;
	}

	public Boolean getIsVisibilidadCeldaGuardarTelefono() {
		return isVisibilidadCeldaGuardarTelefono;
	}

	public void setIsVisibilidadCeldaGuardarTelefono(Boolean isVisibilidadCeldaGuardarTelefono) {
		this.isVisibilidadCeldaGuardarTelefono = isVisibilidadCeldaGuardarTelefono;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTelefono() {
		return isVisibilidadCeldaGuardarCambiosTelefono;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTelefono(Boolean isVisibilidadCeldaGuardarCambiosTelefono) {
		this.isVisibilidadCeldaGuardarCambiosTelefono = isVisibilidadCeldaGuardarCambiosTelefono;
	}
		
	public TelefonoSessionBean gettelefonoSessionBean() {
		return this.telefonoSessionBean;
	}
	
	public void settelefonoSessionBean(TelefonoSessionBean telefonoSessionBean) {
		this.telefonoSessionBean=telefonoSessionBean;
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

	public Boolean getisVisibilidadFK_IdValorTelefono() {
		return this.isVisibilidadFK_IdValorTelefono;
	}

	public void setisVisibilidadFK_IdValorTelefono(Boolean isVisibilidadFK_IdValorTelefono) {
		this.isVisibilidadFK_IdValorTelefono=isVisibilidadFK_IdValorTelefono;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTelefono(Telefono telefono)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(telefono,null);
				this.setActualParaGuardarClienteForeignKey(telefono,null);
				this.setActualParaGuardarTipoTelefoForeignKey(telefono,null);
				this.setActualParaGuardarPaisForeignKey(telefono,null);
				this.setActualParaGuardarCiudadForeignKey(telefono,null);
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
	
	public void bugActualizarReferenciaActual(Telefono telefono,Telefono telefonoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTelefono(telefono);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		telefonoAux.setId(telefono.getId());
		telefonoAux.setVersionRow(telefono.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTelefono();
		
			int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = telefonoValidator.getInvalidValues(this.telefono);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			telefonoLogic.setDatosCliente(datosCliente);
			telefonoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				telefonoAux=new  Telefono();
				
				telefonoAux.setIsNew(true);
				telefonoAux.setIsChanged(true);
				
				telefonoAux.setTelefonoOriginal(this.telefono);
				
				telefonoAux.setId(this.telefono.getId());	
				telefonoAux.setVersionRow(this.telefono.getVersionRow());	
				telefonoAux.setid_empresa(this.telefono.getid_empresa());	
				telefonoAux.setid_cliente(this.telefono.getid_cliente());	
				telefonoAux.setid_tipo_telefono(this.telefono.getid_tipo_telefono());	
				telefonoAux.setid_pais(this.telefono.getid_pais());	
				telefonoAux.setid_ciudad(this.telefono.getid_ciudad());	
				telefonoAux.settelefono(this.telefono.gettelefono());	
				telefonoAux.setextension(this.telefono.getextension());	
				telefonoAux.setes_activo(this.telefono.getes_activo());	
				telefonoAux.setdescripcion(this.telefono.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.telefonoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.telefonoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(telefonoAux,telefonoLogic.getTelefonos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefonoAux,telefonos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.telefonoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefonoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoLogic.saveTelefonos();//WithConnection
						//telefonoLogic.getSetVersionRowTelefonos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.telefono,telefonoAux);
					
					this.refrescarForeignKeysDescripcionesTelefono();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefonoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefonoLogic.saveTelefonoRelaciones(telefonoAux);//WithConnection
								//telefonoLogic.getSetVersionRowTelefonos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.telefono,telefonoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.telefonoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.telefonoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(telefonoAux,telefonoLogic.getTelefonos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(telefonoAux,telefonos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.telefono,telefonoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				telefonoAux=new  Telefono();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.telefonoSessionBean.getEsGuardarRelacionado() 
					|| (this.telefonoSessionBean.getEsGuardarRelacionado() && this.telefono.getId()>=0)) {
						
					telefonoAux.setIsNew(false);
				}
				
				telefonoAux.setIsDeleted(false);
			
				telefonoAux.setId(this.telefono.getId());	
				telefonoAux.setVersionRow(this.telefono.getVersionRow());	
				telefonoAux.setid_empresa(this.telefono.getid_empresa());	
				telefonoAux.setid_cliente(this.telefono.getid_cliente());	
				telefonoAux.setid_tipo_telefono(this.telefono.getid_tipo_telefono());	
				telefonoAux.setid_pais(this.telefono.getid_pais());	
				telefonoAux.setid_ciudad(this.telefono.getid_ciudad());	
				telefonoAux.settelefono(this.telefono.gettelefono());	
				telefonoAux.setextension(this.telefono.getextension());	
				telefonoAux.setes_activo(this.telefono.getes_activo());	
				telefonoAux.setdescripcion(this.telefono.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(telefonoAux,telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefonoAux,telefonos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.telefonoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefonoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoLogic.saveTelefonos();//WithConnection
						//telefonoLogic.getSetVersionRowTelefonos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.telefono,telefonoAux);
					
					this.refrescarForeignKeysDescripcionesTelefono();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefonoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefonoLogic.saveTelefonoRelaciones(telefonoAux);//WithConnection
								//telefonoLogic.getSetVersionRowTelefonos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.telefono,telefonoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.telefonoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.telefonoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(telefonoAux,telefonoLogic.getTelefonos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(telefonoAux,telefonos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.telefono,telefonoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				telefonoAux=new  Telefono();
				
				telefonoAux.setIsNew(false);
				telefonoAux.setIsChanged(false);
				
				telefonoAux.setIsDeleted(true);
				
				telefonoAux.setId(this.telefono.getId());	
				telefonoAux.setVersionRow(this.telefono.getVersionRow());	
				telefonoAux.setid_empresa(this.telefono.getid_empresa());	
				telefonoAux.setid_cliente(this.telefono.getid_cliente());	
				telefonoAux.setid_tipo_telefono(this.telefono.getid_tipo_telefono());	
				telefonoAux.setid_pais(this.telefono.getid_pais());	
				telefonoAux.setid_ciudad(this.telefono.getid_ciudad());	
				telefonoAux.settelefono(this.telefono.gettelefono());	
				telefonoAux.setextension(this.telefono.getextension());	
				telefonoAux.setes_activo(this.telefono.getes_activo());	
				telefonoAux.setdescripcion(this.telefono.getdescripcion());	
				
				if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.telefonoAux.getId()>=0) {	
						this.telefonosEliminados.add(telefonoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(telefonoAux,telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefonoAux,telefonos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.telefonoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefonoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoLogic.saveTelefonos();//WithConnection
						//telefonoLogic.getSetVersionRowTelefonos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefonoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefonoLogic.saveTelefonoRelaciones(telefonoAux);//WithConnection
								//telefonoLogic.getSetVersionRowTelefonos();//WithConnection
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
							if(this.telefonoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.telefonoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(telefonoAux,telefonoLogic.getTelefonos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(telefonoAux,telefonos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getTelefonos().addAll(this.telefonosEliminados);
					
					telefonoLogic.saveTelefonos();//WithConnection
					//telefonoLogic.getSetVersionRowTelefonos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTelefono();
				
				this.telefonosEliminados= new ArrayList<Telefono>();		
			}
			
			if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Telefono GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.telefono=telefonoAux;
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
      		//this.finishProcessTelefono();
      	}
		
	}	
	
	public void actualizarRelaciones(Telefono telefonoLocal) throws Exception {
		
		if(this.telefonoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Telefono telefonoLocal) throws Exception {	
		if(this.telefonoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				telefonoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				telefonoLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTelefoDetalleFormJInternalFrame.class)) {
				TipoTelefoBeanSwingJInternalFrame tipotelefoBeanSwingJInternalFrameLocal=(TipoTelefoBeanSwingJInternalFrame) ((TipoTelefoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotelefoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTelefo(tipotelefoBeanSwingJInternalFrameLocal.gettipotelefo(),true);
				tipotelefoBeanSwingJInternalFrameLocal.actualizarLista(tipotelefoBeanSwingJInternalFrameLocal.tipotelefo,this.tipotelefosForeignKey);

				tipotelefoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotelefoBeanSwingJInternalFrameLocal.tipotelefo);

				telefonoLocal.setTipoTelefo(tipotelefoBeanSwingJInternalFrameLocal.tipotelefo);

				this.addItemDefectoCombosForeignKeyTipoTelefo();
				this.cargarCombosFrameTipoTelefosForeignKey("Formulario");
				this.setActualTipoTelefoForeignKey(tipotelefoBeanSwingJInternalFrameLocal.tipotelefo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				telefonoLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				telefonoLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTelefonoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = telefonoValidator.getInvalidValues(this.telefono);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Telefono telefono,List<Telefono> telefonos) throws Exception {
		try	{		
			TelefonoConstantesFunciones.actualizarLista(telefono,telefonos,this.telefonoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Telefono telefono,List<Telefono> telefonos) throws Exception {
		try	{			
			TelefonoConstantesFunciones.actualizarSelectedLista(telefono,telefonos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Telefono> telefonosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				telefonosLocal=this.telefonoLogic.getTelefonos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				telefonosLocal=this.telefonos;
			}
			//ARCHITECTURE
		
			for(Telefono telefonoLocal:telefonosLocal) {
				if(this.permiteMantenimiento(telefonoLocal) && telefonoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TelefonoConstantesFunciones.getTelefonoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabelid_empresaTelefono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabelid_clienteTelefono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.IDTIPOTELEFO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabelid_tipo_telefonoTelefono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabelid_paisTelefono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabelid_ciudadTelefono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabeltelefonoTelefono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.EXTENSION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabelextensionTelefono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabeles_activoTelefono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TelefonoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabeldescripcionTelefono,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTelefono!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabelid_empresaTelefono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabelid_clienteTelefono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabelid_tipo_telefonoTelefono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabelid_paisTelefono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabelid_ciudadTelefono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabeltelefonoTelefono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabelextensionTelefono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabeles_activoTelefono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono.jLabeldescripcionTelefono,"");
		
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
		this.iIdNuevoTelefono--;	
		
		
		this.telefonoAux=new Telefono();
		
		this.telefonoAux.setId(this.iIdNuevoTelefono);
		this.telefonoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.telefonoLogic.getTelefonos().add(this.telefonoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.telefonos.add(this.telefonoAux);
		}
		//ARCHITECTURE
		
		this.telefono=this.telefonoAux;
		
		if(TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTelefono(this.telefono);
			this.setVariablesObjetoActualToFormularioForeignKeyTelefono(this.telefono);
		}
				
		//this.setDefaultControlesTelefono();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTelefono();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTelefono();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTelefono();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTelefono(this.telefonoBean,this.telefono,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TelefonoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.telefonoSessionBean.getConGuardarRelaciones()) {
			classes=TelefonoConstantesFunciones.getClassesRelationshipsOfTelefono(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.telefonoReturnGeneral=telefonoLogic.procesarEventosTelefonosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefonoLogic.getTelefonos(),this.telefono,this.telefonoParameterGeneral,this.isEsNuevoTelefono,classes);//this.telefonoLogic.getTelefono()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTelefono(this.telefonoReturnGeneral,this.telefonoBean,false);
		
		if(this.telefonoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTelefono(this.telefonoReturnGeneral.getTelefono());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTelefono(this.telefonoReturnGeneral.getTelefono());
		}
		
		if(this.telefonoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTelefono(this.telefonoReturnGeneral.getTelefono(),classes);//this.telefonoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTelefono(this.telefono,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTelefono();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTelefono();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TelefonoBeanSwingJInternalFrameAdditional.RecargarFormTelefono(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTelefono(false);
						
			if(telefonoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefono();
			}
			
			this.actualizarVisualTableDatosTelefono();
			
			this.jTableDatosTelefono.setRowSelectionInterval(this.getIndiceNuevoTelefono(), this.getIndiceNuevoTelefono());
			
			this.seleccionarFilaTablaTelefonoActual();
						
			this.actualizarEstadoCeldasBotonesTelefono("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTelefono(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTelefono.jTextAreatelefonoTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activartelefonoTelefono);
		this.jInternalFrameDetalleFormTelefono.jTextFieldextensionTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activarextensionTelefono);
		this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activares_activoTelefono);
		this.jInternalFrameDetalleFormTelefono.jTextAreadescripcionTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activardescripcionTelefono);	
		//
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activarid_empresaTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activarid_clienteTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activarid_tipo_telefonoTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activarid_paisTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setEnabled(isHabilitar && this.telefonoConstantesFunciones.activarid_ciudadTelefono);
	};
	
	public void setDefaultControlesTelefono() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTelefono(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.telefonoSessionBean.setConGuardarRelaciones(true);			
			this.telefonoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.setVisible(true);
			
					
		} else {
			//this.telefonoSessionBean.setConGuardarRelaciones(false);			
			this.telefonoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTelefono() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
				if(telefonoAux.getId().equals(this.iIdNuevoTelefono)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono telefonoAux:this.telefonos) {
				if(telefonoAux.getId().equals(this.iIdNuevoTelefono)) {
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
	
	public int getIndiceActualTelefono(Telefono telefono,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
				if(telefonoAux.getId().equals(telefono.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono telefonoAux:this.telefonos) {
				if(telefonoAux.getId().equals(telefono.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTelefono(Telefono telefonoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
				if(telefonoAux.getTelefonoOriginal().getId().equals(telefonoOriginal.getId())) {
					existe=true;
					telefonoOriginal.setId(telefonoAux.getId());
					telefonoOriginal.setVersionRow(telefonoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono telefonoAux:this.telefonos) {
				if(telefonoAux.getTelefonoOriginal().getId().equals(telefonoOriginal.getId())) {
					existe=true;
					telefonoOriginal.setId(telefonoAux.getId());
					telefonoOriginal.setVersionRow(telefonoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTelefono(Boolean esParaCancelar) throws Exception {
		telefonosAux=new ArrayList<Telefono>();
		telefonoAux=new Telefono();
		
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
					if(telefonoAux.getId()<0) {
						telefonosAux.add(telefonoAux);
					}		
				}
				this.iIdNuevoTelefono=0L;
				this.telefonoLogic.getTelefonos().removeAll(telefonosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Telefono telefonoAux:this.telefonos) {
					if(telefonoAux.getId()<0) {
						telefonosAux.add(telefonoAux);
					}		
				}
				this.iIdNuevoTelefono=0L;
				this.telefonos.removeAll(telefonosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTelefono 
					&& this.telefonoLogic.getTelefonos().size()>0
					) {
					telefonoAux=this.telefonoLogic.getTelefonos().get(this.telefonoLogic.getTelefonos().size() - 1);
				
					if(telefonoAux.getId()<0) {
						this.telefonoLogic.getTelefonos().remove(telefonoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTelefono && this.telefonos.size()>0) {
					telefonoAux=this.telefonos.get(this.telefonos.size() - 1);
				
					if(telefonoAux.getId()<0) {
						this.telefonos.remove(telefonoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTelefono(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(telefono.getId()<0) {
				this.telefonoLogic.getTelefonos().remove(this.telefono);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(telefono.getId()<0) {
				this.telefonos.remove(this.telefono);
			}
		}			
	}
	
	public void setEstadosInicialesTelefono(List<Telefono> telefonosAux) throws Exception {
		TelefonoConstantesFunciones.setEstadosInicialesTelefono(telefonosAux);
	}
	
	public void setEstadosInicialesTelefono(Telefono telefonoAux) throws Exception {
		TelefonoConstantesFunciones.setEstadosInicialesTelefono(telefonoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTelefonoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTelefono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTelefonoActual()) {
				if(!this.isEsNuevoTelefono) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTelefono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTelefono=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTelefonoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Telefono ?", "MANTENIMIENTO DE Telefono", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTelefono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Telefono telefono) throws Exception {
		TelefonoConstantesFunciones.seleccionarAsignar(this.telefono,telefono);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTelefono=this.isPermisoActualizarOriginalTelefono;
			
			
			this.seleccionarAsignar(telefono);
			
			

			idClienteActual=telefono.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TelefonoConstantesFunciones.quitarEspaciosTelefono(this.telefono,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTelefono("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.telefonoSessionBean.setsFuncionBusquedaRapida(this.telefonoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoTelefono) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTelefono(esParaCancelar);				
				this.cancelarNuevoTelefono(esParaCancelar);								
			}
			
			this.telefono=new Telefono();
			
			this.inicializarTelefono();
			
			this.actualizarEstadoCeldasBotonesTelefono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTelefono() throws Exception {
		try {
			TelefonoConstantesFunciones.inicializarTelefono(this.telefono);
			
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
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.telefonoLogic.getTelefonos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTelefonos(String sAccionBusqueda,List<Telefono> telefonosParaReportes) throws Exception {
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
					sPathReporteFinal="Telefono"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TelefonoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TelefonoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Telefono"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Telefonos");		
		parameters.put("busquedapor", TelefonoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTelefono=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TelefonoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TelefonoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTelefono=new JRBeanArrayDataSource(TelefonoJInternalFrame.TraerTelefonoBeans(telefonosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTelefono);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TelefonoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TelefonoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TelefonoBean.TraerTelefonoBeans(telefonosParaReportes).toArray()));
							
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
				this.generarExcelReporteTelefonos(sAccionBusqueda,sTipoArchivoReporte,telefonosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTelefonos(sAccionBusqueda,sTipoArchivoReporte,telefonosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTelefonoActionPerformed(null);
					//this.generarExcelReporteTelefonos(sAccionBusqueda,sTipoArchivoReporte,telefonosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTelefonos(sAccionBusqueda,sTipoArchivoReporte,telefonosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTelefonos(sAccionBusqueda,sTipoArchivoReporte,telefonosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTelefonos(sAccionBusqueda,sTipoArchivoReporte,telefonosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTelefonos(String sAccionBusqueda,String sTipoArchivoReporte,List<Telefono> telefonosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Telefonos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTelefono("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Telefono telefono : telefonosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TelefonoConstantesFunciones.generarExcelReporteDataTelefono("NORMAL",row,workbook,telefono,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTelefono(String sTipo,Row row,Workbook workbook) {
		
		TelefonoConstantesFunciones.generarExcelReporteHeaderTelefono(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTelefonos(String sAccionBusqueda,String sTipoArchivoReporte,List<Telefono> telefonosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Telefonos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Telefono telefono : telefonosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TelefonoConstantesFunciones.getTelefonoDescripcion(telefono));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono.gettipotelefo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_EXTENSION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_EXTENSION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono.getextension());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(telefono.getes_activo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TelefonoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TelefonoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTelefonos(String sAccionBusqueda,String sTipoArchivoReporte,List<Telefono> telefonosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Telefono> telefonosRespaldo=null;
		
		classes=TelefonoConstantesFunciones.getClassesRelationshipsOfTelefono(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.telefonoLogic.setDatosCliente(this.datosCliente);
		this.telefonoLogic.setDatosDeep(this.datosDeep);
		this.telefonoLogic.setIsConDeep(true);
		
		telefonosRespaldo=this.telefonoLogic.getTelefonos();
		
		this.telefonoLogic.setTelefonos(telefonosParaReportes);	
		this.telefonoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		telefonosParaReportes=this.telefonoLogic.getTelefonos();
		this.telefonoLogic.setTelefonos(telefonosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Telefonos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTelefono("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Telefono telefono : telefonosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTelefono("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TelefonoConstantesFunciones.generarExcelReporteDataTelefono("NORMAL",row,workbook,telefono,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TelefonoConstantesFunciones.getTelefonoDescripcion(telefono));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTelefono.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTelefono() throws Exception {		
		this.startProcessTelefono(true);
	}
	
	public void startProcessTelefono(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTelefono ,this.jPanelParametrosReportesTelefono, this.jScrollPanelDatosTelefono,this.jPanelPaginacionTelefono, this.jScrollPanelDatosEdicionTelefono, this.jPanelAccionesTelefono,this.jPanelAccionesFormularioTelefono,this.jmenuBarTelefono,this.jmenuBarDetalleTelefono,this.jTtoolBarTelefono,this.jTtoolBarDetalleTelefono);		
		
		final JTabbedPane jTabbedPaneBusquedasTelefono=this.jTabbedPaneBusquedasTelefono; 
		
		final JPanel jPanelParametrosReportesTelefono=this.jPanelParametrosReportesTelefono;
		//final JScrollPane jScrollPanelDatosTelefono=this.jScrollPanelDatosTelefono;
		final JTable jTableDatosTelefono=this.jTableDatosTelefono;		
		final JPanel jPanelPaginacionTelefono=this.jPanelPaginacionTelefono;
		//final JScrollPane jScrollPanelDatosEdicionTelefono=this.jScrollPanelDatosEdicionTelefono;
		final JPanel jPanelAccionesTelefono=this.jPanelAccionesTelefono;
		
		JPanel jPanelCamposAuxiliarTelefono=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTelefono=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTelefono!=null) {
			jPanelCamposAuxiliarTelefono=this.jInternalFrameDetalleFormTelefono.jPanelCamposTelefono;
			jPanelAccionesFormularioAuxiliarTelefono=this.jInternalFrameDetalleFormTelefono.jPanelAccionesFormularioTelefono;
		}
		
		final JPanel jPanelCamposTelefono=jPanelCamposAuxiliarTelefono;
		final JPanel jPanelAccionesFormularioTelefono=jPanelAccionesFormularioAuxiliarTelefono;
		
		
		final JMenuBar jmenuBarTelefono=this.jmenuBarTelefono;
		final JToolBar jTtoolBarTelefono=this.jTtoolBarTelefono;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTelefono=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTelefono=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) {
			jmenuBarDetalleAuxiliarTelefono=this.jInternalFrameDetalleFormTelefono.jmenuBarDetalleTelefono;
			jTtoolBarDetalleAuxiliarTelefono=this.jInternalFrameDetalleFormTelefono.jTtoolBarDetalleTelefono;
		}
		
		final JMenuBar jmenuBarDetalleTelefono=jmenuBarDetalleAuxiliarTelefono;
		final JToolBar jTtoolBarDetalleTelefono=jTtoolBarDetalleAuxiliarTelefono;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTelefono;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTelefono;
			processRunnable.jTableDatos=jTableDatosTelefono;
			processRunnable.jPanelCampos=jPanelCamposTelefono;
			processRunnable.jPanelPaginacion=jPanelPaginacionTelefono;
			processRunnable.jPanelAcciones=jPanelAccionesTelefono;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTelefono;
			
			
			processRunnable.jmenuBar=jmenuBarTelefono;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTelefono;
			processRunnable.jTtoolBar=jTtoolBarTelefono;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTelefono;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTelefono ,jPanelParametrosReportesTelefono,jTableDatosTelefono, /*jScrollPanelDatosTelefono,*/jPanelCamposTelefono,jPanelPaginacionTelefono, /*jScrollPanelDatosEdicionTelefono,*/ jPanelAccionesTelefono,jPanelAccionesFormularioTelefono,jmenuBarTelefono,jmenuBarDetalleTelefono,jTtoolBarTelefono,jTtoolBarDetalleTelefono);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTelefono ,jPanelParametrosReportesTelefono, jScrollPanelDatosTelefono,jPanelPaginacionTelefono, jScrollPanelDatosEdicionTelefono, jPanelAccionesTelefono,jPanelAccionesFormularioTelefono,jmenuBarTelefono,jmenuBarDetalleTelefono,jTtoolBarTelefono,jTtoolBarDetalleTelefono);
						
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
	
	public void finishProcessTelefono() {// throws Exception 
		this.finishProcessTelefono(true);
	}
	
	public void finishProcessTelefono(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTelefono ,this.jPanelParametrosReportesTelefono, this.jScrollPanelDatosTelefono,this.jPanelPaginacionTelefono, this.jScrollPanelDatosEdicionTelefono, this.jPanelAccionesTelefono,this.jPanelAccionesFormularioTelefono,this.jmenuBarTelefono,this.jmenuBarDetalleTelefono,this.jTtoolBarTelefono,this.jTtoolBarDetalleTelefono);		
		
		final JTabbedPane jTabbedPaneBusquedasTelefono=this.jTabbedPaneBusquedasTelefono; 
		
		final JPanel jPanelParametrosReportesTelefono=this.jPanelParametrosReportesTelefono;
		//final JScrollPane jScrollPanelDatosTelefono=this.jScrollPanelDatosTelefono;
		final JTable jTableDatosTelefono=this.jTableDatosTelefono;		
		final JPanel jPanelPaginacionTelefono=this.jPanelPaginacionTelefono;
		//final JScrollPane jScrollPanelDatosEdicionTelefono=this.jScrollPanelDatosEdicionTelefono;
		final JPanel jPanelAccionesTelefono=this.jPanelAccionesTelefono;
		
		JPanel jPanelCamposAuxiliarTelefono=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTelefono=new JPanel();
		
		if(this.jInternalFrameDetalleFormTelefono!=null) {
			jPanelCamposAuxiliarTelefono=this.jInternalFrameDetalleFormTelefono.jPanelCamposTelefono;
			jPanelAccionesFormularioAuxiliarTelefono=this.jInternalFrameDetalleFormTelefono.jPanelAccionesFormularioTelefono;
		}
		
		final JPanel jPanelCamposTelefono=jPanelCamposAuxiliarTelefono;
		final JPanel jPanelAccionesFormularioTelefono=jPanelAccionesFormularioAuxiliarTelefono;
		
		
		final JMenuBar jmenuBarTelefono=this.jmenuBarTelefono;		
		final JToolBar jTtoolBarTelefono=this.jTtoolBarTelefono;
				
		JMenuBar jmenuBarDetalleAuxiliarTelefono=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTelefono=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTelefono!=null) {
			jmenuBarDetalleAuxiliarTelefono=this.jInternalFrameDetalleFormTelefono.jmenuBarDetalleTelefono;
			jTtoolBarDetalleAuxiliarTelefono=this.jInternalFrameDetalleFormTelefono.jTtoolBarDetalleTelefono;		
		}
		
		final JMenuBar jmenuBarDetalleTelefono=jmenuBarDetalleAuxiliarTelefono;
		final JToolBar jTtoolBarDetalleTelefono=jTtoolBarDetalleAuxiliarTelefono;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTelefono;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTelefono;
			processRunnable.jTableDatos=jTableDatosTelefono;
			processRunnable.jPanelCampos=jPanelCamposTelefono;
			processRunnable.jPanelPaginacion=jPanelPaginacionTelefono;
			processRunnable.jPanelAcciones=jPanelAccionesTelefono;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTelefono;
			
			
			processRunnable.jmenuBar=jmenuBarTelefono;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTelefono;
			processRunnable.jTtoolBar=jTtoolBarTelefono;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTelefono;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTelefono ,jPanelParametrosReportesTelefono, jTableDatosTelefono,/*jScrollPanelDatosTelefono,*/jPanelCamposTelefono,jPanelPaginacionTelefono, /*jScrollPanelDatosEdicionTelefono,*/ jPanelAccionesTelefono,jPanelAccionesFormularioTelefono,jmenuBarTelefono,jmenuBarDetalleTelefono,jTtoolBarTelefono,jTtoolBarDetalleTelefono));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTelefono(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTelefono(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTelefono(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTelefono(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTelefono,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTelefono,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTelefono(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTelefono,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTelefono,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.telefonoConstantesFunciones.getsFinalQueryTelefono();
		String  finalQueryPaginacionTodos=this.telefonoConstantesFunciones.getsFinalQueryTelefono();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TelefonoConstantesFunciones.getArrayColumnasGlobalesNoTelefono(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TelefonoConstantesFunciones.getArrayColumnasGlobalesTelefono(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TelefonoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.telefonosEliminados= new ArrayList<Telefono>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTelefono();
		
				///*TelefonoSessionBean*/this.telefonoSessionBean=new TelefonoSessionBean();
			
			if(this.telefonoSessionBean==null) {
				this.telefonoSessionBean=new TelefonoSessionBean();
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
					this.iNumeroPaginacion=TelefonoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TelefonoConstantesFunciones.getClassesForeignKeysOfTelefono(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/telefono."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			telefonosAux= new ArrayList<Telefono>();
			
				
			telefonoLogic.setDatosCliente(this.datosCliente);
			telefonoLogic.setDatosDeep(this.datosDeep);
			telefonoLogic.setIsConDeep(true);
			
			
			telefonoLogic.getTelefonoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					telefonoLogic.getTodosTelefonos(finalQueryGlobal,pagination);
					
					//telefonoLogic.getTodosTelefonosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(telefonoLogic.getTelefonos()==null|| telefonoLogic.getTelefonos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefonosAux= new ArrayList<Telefono>();
							telefonosAux.addAll(telefonoLogic.getTelefonos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonosAux= new ArrayList<Telefono>();
							telefonosAux.addAll(telefonos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefonoLogic.getTodosTelefonos(finalQueryGlobal+"",this.pagination);												
							
							//telefonoLogic.getTodosTelefonosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTelefonos("Todos",telefonoLogic.getTelefonos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefonoLogic.setTelefonos(new ArrayList<Telefono>());					
							telefonoLogic.getTelefonos().addAll(telefonosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonos=new ArrayList<Telefono>();
							telefonos.addAll(telefonosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTelefono=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTelefono=this.idActual;
				
				} else if(this.idTelefonoActual!=null && this.idTelefonoActual!=0L) {
					idTelefono=idTelefonoActual;
				}
				
					
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndicePorId(idTelefono);
				
				this.telefonos=new ArrayList<Telefono>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					telefonoLogic.getEntity(idTelefono);
					
					//telefonoLogic.getEntityWithConnection(idTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoLogic.setTelefonos(new ArrayList<Telefono>());
					telefonoLogic.getTelefonos().add(telefonoLogic.getTelefono());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefonos=new ArrayList<Telefono>();
					this.telefonos.add(telefono);
				}
				
				if(telefonoLogic.getTelefono()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					telefonoLogic.getTelefonosFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=telefonoLogic.getTelefonos()==null||telefonoLogic.getTelefonos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=telefonos==null|| telefonos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonosAux=new ArrayList<Telefono>();
						telefonosAux.addAll(telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonosAux=new ArrayList<Telefono>();
							telefonosAux.addAll(telefonos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							telefonoLogic.getTelefonosFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTelefonos("FK_IdCiudad",telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTelefonos("FK_IdCiudad",telefonos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoLogic.setTelefonos(new ArrayList<Telefono>());
						telefonoLogic.getTelefonos().addAll(telefonosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonos=new ArrayList<Telefono>();
							telefonos.addAll(telefonosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					telefonoLogic.getTelefonosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=telefonoLogic.getTelefonos()==null||telefonoLogic.getTelefonos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=telefonos==null|| telefonos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonosAux=new ArrayList<Telefono>();
						telefonosAux.addAll(telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonosAux=new ArrayList<Telefono>();
							telefonosAux.addAll(telefonos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							telefonoLogic.getTelefonosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTelefonos("FK_IdCliente",telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTelefonos("FK_IdCliente",telefonos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoLogic.setTelefonos(new ArrayList<Telefono>());
						telefonoLogic.getTelefonos().addAll(telefonosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonos=new ArrayList<Telefono>();
							telefonos.addAll(telefonosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					telefonoLogic.getTelefonosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=telefonoLogic.getTelefonos()==null||telefonoLogic.getTelefonos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=telefonos==null|| telefonos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonosAux=new ArrayList<Telefono>();
						telefonosAux.addAll(telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonosAux=new ArrayList<Telefono>();
							telefonosAux.addAll(telefonos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							telefonoLogic.getTelefonosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTelefonos("FK_IdEmpresa",telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTelefonos("FK_IdEmpresa",telefonos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoLogic.setTelefonos(new ArrayList<Telefono>());
						telefonoLogic.getTelefonos().addAll(telefonosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonos=new ArrayList<Telefono>();
							telefonos.addAll(telefonosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					telefonoLogic.getTelefonosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=telefonoLogic.getTelefonos()==null||telefonoLogic.getTelefonos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=telefonos==null|| telefonos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonosAux=new ArrayList<Telefono>();
						telefonosAux.addAll(telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonosAux=new ArrayList<Telefono>();
							telefonosAux.addAll(telefonos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							telefonoLogic.getTelefonosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTelefonos("FK_IdPais",telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTelefonos("FK_IdPais",telefonos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoLogic.setTelefonos(new ArrayList<Telefono>());
						telefonoLogic.getTelefonos().addAll(telefonosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonos=new ArrayList<Telefono>();
							telefonos.addAll(telefonosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorTelefono")) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdValorTelefono(id_tipo_telefonoFK_IdValorTelefono);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					telefonoLogic.getTelefonosFK_IdValorTelefono(finalQueryGlobal,pagination,id_tipo_telefonoFK_IdValorTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdValorTelefono(id_tipo_telefonoFK_IdValorTelefono);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdValorTelefono(id_tipo_telefonoFK_IdValorTelefono);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=telefonoLogic.getTelefonos()==null||telefonoLogic.getTelefonos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=telefonos==null|| telefonos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonosAux=new ArrayList<Telefono>();
						telefonosAux.addAll(telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonosAux=new ArrayList<Telefono>();
							telefonosAux.addAll(telefonos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							telefonoLogic.getTelefonosFK_IdValorTelefono(finalQueryGlobal,pagination,id_tipo_telefonoFK_IdValorTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdValorTelefono(id_tipo_telefonoFK_IdValorTelefono);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TelefonoConstantesFunciones.getDetalleIndiceFK_IdValorTelefono(id_tipo_telefonoFK_IdValorTelefono);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTelefonos("FK_IdValorTelefono",telefonoLogic.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTelefonos("FK_IdValorTelefono",telefonos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoLogic.setTelefonos(new ArrayList<Telefono>());
						telefonoLogic.getTelefonos().addAll(telefonosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonos=new ArrayList<Telefono>();
							telefonos.addAll(telefonosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTelefono();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTelefono();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=telefonoLogic.getTelefonos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefonos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=telefonoLogic.getTelefonos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefonos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Telefono telefono) {
		Boolean permite=true;
		
		if(this.telefono.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TelefonoConstantesFunciones.getOrderByListaTelefono();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TelefonoConstantesFunciones.getOrderByListaTelefono();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono telefono:telefonoLogic.getTelefonos()) {
				if(telefono.getsType().equals(Constantes2.S_TOTALES)) {
					telefonoTotales=telefono;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono telefono:this.telefonos) {
				if(telefono.getsType().equals(Constantes2.S_TOTALES)) {
					telefonoTotales=telefono;
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
			this.telefonoAux=new Telefono();
			this.telefonoAux.setsType(Constantes2.S_TOTALES);
			this.telefonoAux.setIsNew(false);
			this.telefonoAux.setIsChanged(false);
			this.telefonoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TelefonoConstantesFunciones.TotalizarValoresFilaTelefono(this.telefonoLogic.getTelefonos(),this.telefonoAux);
				
				this.telefonoLogic.getTelefonos().add(this.telefonoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TelefonoConstantesFunciones.TotalizarValoresFilaTelefono(this.telefonos,this.telefonoAux);
				
				this.telefonos.add(this.telefonoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		telefonoTotales=new Telefono();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.telefonoLogic.getTelefonos().remove(telefonoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.telefonos.remove(telefonoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		telefonoTotales=new Telefono();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono telefono:telefonoLogic.getTelefonos()) {
				if(telefono.getsType().equals(Constantes2.S_TOTALES)) {
					telefonoTotales=telefono;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TelefonoConstantesFunciones.TotalizarValoresFilaTelefono(this.telefonoLogic.getTelefonos(),telefonoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono telefono:this.telefonos) {
				if(telefono.getsType().equals(Constantes2.S_TOTALES)) {
					telefonoTotales=telefono;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TelefonoConstantesFunciones.TotalizarValoresFilaTelefono(this.telefonos,telefonoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTelefonosFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTelefonosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTelefonosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTelefonosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTelefonosFK_IdValorTelefono()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorTelefono";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTelefonosFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoLogic.getTelefonosFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTelefonosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoLogic.getTelefonosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTelefonosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoLogic.getTelefonosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTelefonosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoLogic.getTelefonosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTelefonosFK_IdValorTelefono(String sFinalQuery,Long id_tipo_telefono)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoLogic.getTelefonosFK_IdValorTelefono(sFinalQuery,this.pagination,id_tipo_telefono);
				
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
	
	public void inicializarPermisosTelefono() {
		this.isPermisoTodoTelefono=false;
		this.isPermisoNuevoTelefono=false;
		this.isPermisoActualizarTelefono=false;
		this.isPermisoActualizarOriginalTelefono=false;
		this.isPermisoEliminarTelefono=false;
		this.isPermisoGuardarCambiosTelefono=false;
		this.isPermisoConsultaTelefono=false;
		this.isPermisoBusquedaTelefono=false;
		this.isPermisoReporteTelefono=false;		
		this.isPermisoOrdenTelefono=false;		
		this.isPermisoPaginacionMedioTelefono=false;		
		this.isPermisoPaginacionAltoTelefono=false;
		this.isPermisoPaginacionTodoTelefono=false;
		this.isPermisoCopiarTelefono=false;		
		this.isPermisoVerFormTelefono=false;		
		this.isPermisoDuplicarTelefono=false;		
		this.isPermisoOrdenTelefono=false;		
	}
	
	public void setPermisosUsuarioTelefono(Boolean isPermiso) {
		this.isPermisoTodoTelefono=isPermiso;
		this.isPermisoNuevoTelefono=isPermiso;
		this.isPermisoActualizarTelefono=isPermiso;
		this.isPermisoActualizarOriginalTelefono=isPermiso;
		this.isPermisoEliminarTelefono=isPermiso;
		this.isPermisoGuardarCambiosTelefono=isPermiso;
		this.isPermisoConsultaTelefono=isPermiso;
		this.isPermisoBusquedaTelefono=isPermiso;
		this.isPermisoReporteTelefono=isPermiso;
		this.isPermisoOrdenTelefono=isPermiso;		
		this.isPermisoPaginacionMedioTelefono=isPermiso;		
		this.isPermisoPaginacionAltoTelefono=isPermiso;		
		this.isPermisoPaginacionTodoTelefono=isPermiso;		
		this.isPermisoCopiarTelefono=isPermiso;		
		this.isPermisoVerFormTelefono=isPermiso;		
		this.isPermisoDuplicarTelefono=isPermiso;
		this.isPermisoOrdenTelefono=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTelefono(Boolean isPermiso) {
		//this.isPermisoTodoTelefono=isPermiso;
		this.isPermisoNuevoTelefono=isPermiso;
		this.isPermisoActualizarTelefono=isPermiso;
		this.isPermisoActualizarOriginalTelefono=isPermiso;
		this.isPermisoEliminarTelefono=isPermiso;
		this.isPermisoGuardarCambiosTelefono=isPermiso;
		//this.isPermisoConsultaTelefono=isPermiso;
		//this.isPermisoBusquedaTelefono=isPermiso;
		//this.isPermisoReporteTelefono=isPermiso;
		//this.isPermisoOrdenTelefono=isPermiso;		
		//this.isPermisoPaginacionMedioTelefono=isPermiso;		
		//this.isPermisoPaginacionAltoTelefono=isPermiso;		
		//this.isPermisoPaginacionTodoTelefono=isPermiso;		
		//this.isPermisoCopiarTelefono=isPermiso;		
		//this.isPermisoDuplicarTelefono=isPermiso;
		//this.isPermisoOrdenTelefono=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTelefonoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TelefonoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTelefono(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTelefonoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTelefonoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTelefonoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTelefonoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTelefono() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TelefonoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TelefonoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTelefono=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTelefono=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTelefono=this.isPermisoActualizarTelefono;
			this.isPermisoEliminarTelefono=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTelefono=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTelefono=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTelefono=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTelefono=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTelefono=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTelefono=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTelefono=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTelefono=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTelefono=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTelefono=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTelefono=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTelefono=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTelefono=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTelefono.setToolTipText(this.jTableDatosTelefono.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTelefono(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTelefono(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TelefonoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TelefonoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTelefono() throws Exception {
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
	public void inicializarCombosForeignKeyTelefonoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipotelefosForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTelefonoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TelefonoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTelefonoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTelefoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoTelefoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipotelefosForeignKey==null||this.tipotelefosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTelefoConstantesFunciones.getArrayColumnasGlobalesTipoTelefo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTelefoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTelefoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTelefosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyTelefonoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TelefonoParameterReturnGeneral telefonoReturnGeneral=new TelefonoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.telefonoConstantesFunciones.cargarid_empresaTelefono)
					 || (this.esRecargarFks && this.telefonoConstantesFunciones.cargarid_empresaTelefono)) {

					if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+telefonoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.telefonoConstantesFunciones.cargarid_clienteTelefono)
					 || (this.esRecargarFks && this.telefonoConstantesFunciones.cargarid_clienteTelefono)) {

					if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+telefonoSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoTelefo="";

				if(((this.tipotelefosForeignKey==null||this.tipotelefosForeignKey.size()<=0) && this.telefonoConstantesFunciones.cargarid_tipo_telefonoTelefono)
					 || (this.esRecargarFks && this.telefonoConstantesFunciones.cargarid_tipo_telefonoTelefono)) {

					if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTelefo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTelefoConstantesFunciones.getArrayColumnasGlobalesTipoTelefo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTelefo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTelefoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoTelefo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTelefo, "");
						finalQueryGlobalTipoTelefo+=TipoTelefoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoTelefosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTelefo=" WHERE " + ConstantesSql.ID + "="+telefonoSessionBean.getlidTipoTelefoActual();
					}
				} else {
					finalQueryGlobalTipoTelefo="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.telefonoConstantesFunciones.cargarid_paisTelefono)
					 || (this.esRecargarFks && this.telefonoConstantesFunciones.cargarid_paisTelefono)) {

					if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+telefonoSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.telefonoConstantesFunciones.cargarid_ciudadTelefono)
					 || (this.esRecargarFks && this.telefonoConstantesFunciones.cargarid_ciudadTelefono)) {

					if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+telefonoSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				telefonoReturnGeneral=telefonoLogic.cargarCombosLoteForeignKeyTelefono(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalTipoTelefo,finalQueryGlobalPais,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=telefonoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=telefonoReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoTelefo.equals("NONE")) {
				this.tipotelefosForeignKey=telefonoReturnGeneral.gettipotelefosForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=telefonoReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=telefonoReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTelefono()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoTelefo();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.telefonoSessionBean==null) {
				this.telefonoSessionBean=new TelefonoSessionBean();
			}

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoTelefo()throws Exception {
		try {

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTelefo()) {
				TipoTelefo tipotelefo=new TipoTelefo();
				TipoTelefoConstantesFunciones.setTipoTelefoDescripcion(tipotelefo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipotelefo.setId(null);

				if(!TipoTelefoConstantesFunciones.ExisteEnLista(this.tipotelefosForeignKey,tipotelefo,true)) {

					this.tipotelefosForeignKey.add(0,tipotelefo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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

			if(!this.telefonoSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
	
	public void initActionsCombosTodosForeignKeyTelefono()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTelefono(String sFormularioTipoBusqueda)throws Exception {
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
					if(this.jInternalFrameDetalleFormTelefono!=null) {
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.addItemListener(new ComboBoxItemListener(this,"id_paisTelefono"));
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.addFocusListener(new ComboBoxFocusListener(this,"id_paisTelefono"));
					}
				} else {
					if(this.jInternalFrameDetalleFormTelefono!=null) {
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.addActionListener(new ComboBoxActionListener(this,"id_paisTelefono"));
						this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.addFocusListener(new ComboBoxFocusListener(this,"id_paisTelefono"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisTelefono.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisTelefono"));

						this.jComboBoxid_paisFK_IdPaisTelefono.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisTelefono"));

					} else {
						this.jComboBoxid_paisFK_IdPaisTelefono.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisTelefono"));

						this.jComboBoxid_paisFK_IdPaisTelefono.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisTelefono"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyTelefono()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTelefono();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTelefono(Telefono telefono)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(telefono.getid_cliente(),false,"Formulario");
			this.setActualTipoTelefoForeignKey(telefono.getid_tipo_telefono(),false,"Formulario");
			this.setActualPaisForeignKey(telefono.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(telefono.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTelefono(Telefono telefono,String sTipoEvento)throws Exception {	
		try {
			
			

				if(telefono.getCliente()!=null && !sTipoEvento.equals("id_clienteTelefono")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(telefono.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTelefono()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.telefonoConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoTelefoForeignKey(this.telefonoConstantesFunciones.getid_tipo_telefono(),false,"Formulario");
			this.setActualPaisForeignKey(this.telefonoConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.telefonoConstantesFunciones.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTelefono()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTelefono()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTelefono()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTelefono()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTelefono()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoTelefosForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTelefono(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTelefosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTelefono()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono!=null && this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.getItemCount()>0) {
				this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono!=null && this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.getItemCount()>0) {
				this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono!=null && this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.getItemCount()>0) {
				this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono!=null && this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.getItemCount()>0) {
				this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono!=null && this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.getItemCount()>0) {
				this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	







	public void recargarFormTelefonoPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormTelefonoid_ciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}


	
	



	public void recargarFormTelefonoid_ciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.telefono,jComboBoxGenericoCiudad);
			}

			if(this.telefono.getid_pais()!=null && this.telefono.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.telefono.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.telefono.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public TelefonoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TelefonoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TelefonoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.telefonoSessionBean=new TelefonoSessionBean(); 
		this.telefonoConstantesFunciones=new TelefonoConstantesFunciones(); 
		this.telefonoBean=new Telefono();//(this.telefonoConstantesFunciones); 		
		this.telefonoReturnGeneral=new TelefonoParameterReturnGeneral(); 
		
		this.telefonoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefonoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TelefonoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TelefonoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TelefonoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTelefono(true);
			
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
			
			this.telefonoConstantesFunciones=new TelefonoConstantesFunciones(); 
			this.telefonoBean=new Telefono();//this.telefonoConstantesFunciones); 			
			this.telefonoReturnGeneral=new TelefonoParameterReturnGeneral(); 
		
			TelefonoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Telefono Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.telefono=new Telefono();
			this.telefonos = new ArrayList<Telefono>();
			this.telefonosAux = new ArrayList<Telefono>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic=new TelefonoLogic();
				this.telefonoLogic.getNewConnexionToDeep("");
			}
			
			//this.telefonoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.telefonoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTelefono);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTelefono!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTelefono);	
					}
					
					if(this.jInternalFrameImportacionTelefono!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTelefono);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTelefono!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTelefono);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTelefono!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTelefono);
				this.jInternalFrameDetalleFormTelefono.setVisible(false);
				this.jInternalFrameDetalleFormTelefono.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTelefono!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTelefono);
					this.jInternalFrameReporteDinamicoTelefono.setVisible(false);
					this.jInternalFrameReporteDinamicoTelefono.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTelefono!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTelefono);
					this.jInternalFrameImportacionTelefono.setVisible(false);
					this.jInternalFrameImportacionTelefono.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTelefono!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTelefono);
					this.jInternalFrameOrderByTelefono.setVisible(false);
					this.jInternalFrameOrderByTelefono.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTelefonoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TelefonoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.telefonoReturnGeneral=new TelefonoParameterReturnGeneral();
			
			this.telefonoParameterGeneral=new TelefonoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.telefonoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TelefonoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TelefonoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.telefonoSessionBean.getEsGuardarRelacionado(),this.telefonoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TelefonoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.telefonoSessionBean.getEsGuardarRelacionado(),this.telefonoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTelefono=false;
			this.isVisibilidadCeldaDuplicarTelefono=true;
			this.isVisibilidadCeldaCopiarTelefono=true;
			this.isVisibilidadCeldaVerFormTelefono=true;
			this.isVisibilidadCeldaOrdenTelefono=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefono=false;
			this.isVisibilidadCeldaModificarTelefono=false;
			this.isVisibilidadCeldaActualizarTelefono=false;
			this.isVisibilidadCeldaEliminarTelefono=false;
			this.isVisibilidadCeldaCancelarTelefono=false;
			this.isVisibilidadCeldaGuardarTelefono=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdValorTelefono=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTelefono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTelefono();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTelefono(false);
			
			this.setPermisosUsuarioTelefono();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefonoSessionBean.getEsGuardarRelacionado() 
				|| (this.telefonoSessionBean.getEsGuardarRelacionado() && this.telefonoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTelefonoClasesRelacionadas();
			}
			
			if(this.telefonoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTelefonoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TelefonoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTelefono();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTelefono();
			}
			
			if(!this.isPermisoBusquedaTelefono) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTelefono.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTelefono,this.isPermisoPaginacionMedioTelefono,this.isPermisoPaginacionTodoTelefono);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TelefonoConstantesFunciones.getTiposSeleccionarTelefono());
				
				this.tiposColumnasSelect=TelefonoConstantesFunciones.getTiposSeleccionarTelefono(true);
				
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
			//if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTelefono();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTelefono(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTelefono(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefono() ;
			
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
			this.tipotelefoLogic=new TipoTelefoLogic();
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
				telefonoImplementable= (TelefonoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TelefonoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				telefonoImplementableHome= (TelefonoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TelefonoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.telefonos= new ArrayList<Telefono>();
			this.telefonosEliminados= new ArrayList<Telefono>();
						
			this.isEsNuevoTelefono=false;
			this.esParaAccionDesdeFormularioTelefono=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipotelefosForeignKey=new ArrayList<TipoTelefo>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTelefono(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTelefono();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TelefonoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TelefonoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTelefono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTelefono(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTelefono!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTelefono();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTelefono();
			}
			
			TelefonoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTelefono.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTelefono.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTelefono.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTelefono(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Telefono: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTelefono() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTelefono")) {
				iIndex=this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTelefono.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTelefono();	
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
	
	public void cargarCombosForeignKeyTelefono(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTelefono(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTelefono(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTelefonoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTelefono();
		
		this.cargarCombosFrameForeignKeyTelefono();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTelefono();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTelefono();
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

	public void cargarCombosForeignKeyTipoTelefo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTelefoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTelefo();
				this.cargarCombosFrameTipoTelefosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoTelefo(this.tipotelefosForeignKey);

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
	
	public void jButtonNuevoTelefonoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.telefonoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
			
			if(jTableDatosTelefono.getRowCount()>=1) {
				jTableDatosTelefono.removeRowSelectionInterval(0, jTableDatosTelefono.getRowCount()-1);						
			}
			
			this.isEsNuevoTelefono=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTelefono(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTelefono(true);			
			//this.telefono=new Telefono();
			//this.telefono.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefono(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefono() ;
			
			if(TelefonoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefono(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.telefono);	
			this.actualizarInformacion("INFO_PADRE",false,this.telefono);				
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
			if(this.telefonoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Telefono: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTelefonoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTelefono.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTelefono.getSelectedRows().length;			
			}
			
			telefonosSeleccionados=this.getTelefonosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTelefono--;			
				//Telefono telefonoAux= new Telefono();			
				//telefonoAux.setId(this.iIdNuevoTelefono);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Telefono telefonoOrigen=new Telefono();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Telefono telefonoOrigen : telefonosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							telefonoOrigen =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefonoOrigen =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTelefono();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.telefono.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTelefono(telefonoOrigen,this.telefono,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.telefonoLogic.getTelefonos().add(this.telefonoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.telefonos.add(this.telefonoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTelefono(false);
				
				this.jTableDatosTelefono.setRowSelectionInterval(this.getIndiceNuevoTelefono(), this.getIndiceNuevoTelefono());
				
				int iLastRow =  this.jTableDatosTelefono.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTelefono.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTelefono.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefono(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();									
		
			Telefono telefonoOrigen=new Telefono();
			Telefono telefonoDestino=new Telefono();
				
			telefonosSeleccionados=this.getTelefonosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTelefono.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || telefonosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTelefono.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoOrigen =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						telefonoOrigen =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefonoDestino =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						telefonoDestino =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				telefonoOrigen =telefonosSeleccionados.get(0);
				telefonoDestino =telefonosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTelefono(telefonoOrigen,telefonoDestino,true,false);
				
				telefonoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(telefonoDestino,telefonoLogic.getTelefonos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefonoDestino,telefonos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTelefono(false);
				
				//this.jTableDatosTelefono.setRowSelectionInterval(this.getIndiceNuevoTelefono(), this.getIndiceNuevoTelefono());
				
				int iLastRow =  this.jTableDatosTelefono.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTelefono.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTelefono.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefono(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTelefono.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTelefono.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTelefono.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTelefono.setVisible(!isVisible);
			this.jPanelPaginacionTelefono.setVisible(!isVisible);
			this.jPanelAccionesTelefono.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTelefono();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTelefono();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTelefono();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTelefono();
			
			this.abrirFrameOrderByTelefono();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTelefono();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTelefono(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTelefono);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTelefono.isMaximum()) {
					this.jInternalFrameDetalleFormTelefono.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTelefono.setSize(this.jInternalFrameDetalleFormTelefono.iWidthFormulario,this.jInternalFrameDetalleFormTelefono.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTelefono.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTelefono.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTelefono.isMaximum()) {
						this.jInternalFrameDetalleFormTelefono.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTelefono.jContentPaneDetalleTelefono.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTelefono.jContentPaneDetalleTelefono.getWidth(),TelefonoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTelefono.jContentPaneDetalleTelefono.getWidth(),TelefonoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTelefono.jContentPaneDetalleTelefono.getWidth(),TelefonoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTelefono.setVisible(true);
	        this.jInternalFrameDetalleFormTelefono.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTelefono() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTelefono==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTelefono=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefono,false,this);
				} else {
					this.jInternalFrameOrderByTelefono=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefono,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTelefono);
				this.jInternalFrameOrderByTelefono.setVisible(false);
				this.jInternalFrameOrderByTelefono.setSelected(false);
				
				this.jInternalFrameOrderByTelefono.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTelefono"));
				
				this.inicializarActualizarBindingTablaOrderByTelefono();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTelefono() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTelefono==null) {
				
				this.jInternalFrameImportacionTelefono=new ImportacionJInternalFrame(TelefonoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTelefono);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTelefono);
				this.jInternalFrameImportacionTelefono.setVisible(false);
				this.jInternalFrameImportacionTelefono.setSelected(false);


				this.jInternalFrameImportacionTelefono.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTelefono"));
				this.jInternalFrameImportacionTelefono.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTelefono"));
				this.jInternalFrameImportacionTelefono.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTelefono"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTelefono() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTelefono==null) {
				this.jInternalFrameReporteDinamicoTelefono=new ReporteDinamicoJInternalFrame(TelefonoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTelefono);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTelefono);
				this.jInternalFrameReporteDinamicoTelefono.setVisible(false);
				this.jInternalFrameReporteDinamicoTelefono.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTelefono.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefono"));
				this.jInternalFrameReporteDinamicoTelefono.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefono"));
				this.jInternalFrameReporteDinamicoTelefono.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefono"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefono();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTelefono() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTelefono);
			
	       	this.jInternalFrameDetalleFormTelefono.setVisible(false);
	        this.jInternalFrameDetalleFormTelefono.setSelected(false);
			
			//this.jInternalFrameDetalleFormTelefono.dispose();
			//this.jInternalFrameDetalleFormTelefono=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTelefono() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTelefono.setVisible(true);
	        this.jInternalFrameReporteDinamicoTelefono.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTelefono() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTelefono.setVisible(true);
	        this.jInternalFrameImportacionTelefono.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTelefono() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTelefono.setVisible(true);
	        this.jInternalFrameOrderByTelefono.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTelefono() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTelefono.setVisible(false);
	        this.jInternalFrameOrderByTelefono.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTelefono() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTelefono.setVisible(false);
	        this.jInternalFrameReporteDinamicoTelefono.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTelefono() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTelefono.setVisible(false);
	        this.jInternalFrameImportacionTelefono.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTelefono(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTelefono(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTelefono(true);
			//this.isEsNuevoTelefono=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTelefono("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefono(false) ;
			
			if(telefonoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TelefonoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefono(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefono(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTelefonoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTelefono(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTelefono(true);
			//this.isEsNuevoTelefono=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.telefono.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTelefono("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTelefono(false) ;
			
			if(TelefonoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefono(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefono(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.telefonoConstantesFunciones.cargarid_clienteTelefono) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTelefono(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTelefono.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTelefo(List<TipoTelefo> tipotelefosForeignKey)throws Exception{
		TableColumn tableColumnTipoTelefo=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO));
		TableCellEditor tableCellEditorTipoTelefo =tableColumnTipoTelefo.getCellEditor();

		TipoTelefoTableCell tipotelefoTableCellFk=(TipoTelefoTableCell)tableCellEditorTipoTelefo;

		if(tipotelefoTableCellFk!=null) {
			tipotelefoTableCellFk.settipotelefosForeignKey(tipotelefosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTelefono.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotelefoTableCellFk.setRowActual(intSelectedRow);
			//tipotelefoTableCellFk.settipotelefosForeignKeyActual(tipotelefosForeignKey);
		//}


		if(tipotelefoTableCellFk!=null) {
			tipotelefoTableCellFk.RecargarTipoTelefosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTelefono.getSelectedRow();

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
		TableColumn tableColumnCiudad=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTelefono.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTelefono(false);
			
			//if(!this.isEsNuevoTelefono) {								
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				
			}
			
			if(this.permiteMantenimiento(this.telefono)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.telefonoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTelefono=true;
					this.inicializarActualizarBindingTablaTelefono(false);
					this.isEsNuevoTelefono=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTelefono=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTelefono=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTelefono(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefono(false);
				
				this.habilitarDeshabilitarControlesTelefono(false);
			
												
				
				if(TelefonoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTelefono();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTelefonoActionPerformed(evt,telefonoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTelefono(this.telefono,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTelefono.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,telefonoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.telefono.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTelefonoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				this.telefono.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				this.telefono.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.telefono)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.telefonoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TelefonoModel) this.jTableDatosTelefono.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTelefono=true;
				this.inicializarActualizarBindingTablaTelefono(false);
				this.isEsNuevoTelefono=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTelefono(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefono(false);
				
				this.habilitarDeshabilitarControlesTelefono(false);
				
				
				
				if(TelefonoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTelefono();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTelefonoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTelefono.getRowCount()>=1) {
				jTableDatosTelefono.removeRowSelectionInterval(0, jTableDatosTelefono.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTelefono(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTelefono(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefono(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefono(false) ;
			
			this.isEsNuevoTelefono=false;
			
			if(TelefonoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTelefono();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTelefonoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTelefono(false);
				
				//SI ES MANUAL
				if(TelefonoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTelefono();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTelefonoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTelefono--;			
			//Telefono telefonoAux= new Telefono();			
			//telefonoAux.setId(this.iIdNuevoTelefono);
			
			if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTelefono();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
			
			this.telefono.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.telefonoLogic.getTelefonos().add(this.telefonoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.telefonos.add(this.telefonoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTelefono(false);
			
			this.jTableDatosTelefono.setRowSelectionInterval(this.getIndiceNuevoTelefono(), this.getIndiceNuevoTelefono());
			
			int iLastRow =  this.jTableDatosTelefono.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTelefono.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTelefono.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTelefono(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTelefonoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTelefono(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefono(false);
			
			//SI ES MANUAL
			if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefono();
			}
			
			//this.abrirFrameTreeTelefono();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTelefonoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TelefonoS ?", "MANTENIMIENTO DE Telefono", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTelefono.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTelefono();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.telefonoReturnGeneral=telefonoLogic.procesarImportacionTelefonosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.telefonoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTelefonoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTelefonoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTelefono.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTelefono.setFileImportacion(this.jInternalFrameImportacionTelefono.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTelefono.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTelefono.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTelefono.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTelefono.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTelefonoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		

		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TelefonoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TelefonoBaseDesign.jrxml";
			
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
			
			this.generarReporteTelefonos("Todos",telefonosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TelefonoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTelefo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTelefo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTelefo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTelefo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoConstantesFunciones.LABEL_EXTENSION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tension_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tension_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tension_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tension_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TelefonoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTelefono.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTelefono.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TelefonoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TelefonoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO:
					sNombreCampoCategoria="id_tipo_telefono";
					break;

				case TelefonoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TelefonoConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case TelefonoConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case TelefonoConstantesFunciones.LABEL_EXTENSION:
					sNombreCampoCategoria="extension";
					break;

				case TelefonoConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="es_activo";
					break;

				case TelefonoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTelefono.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TelefonoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TelefonoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO:
					sNombreCampoCategoriaValor="id_tipo_telefono";
					break;

				case TelefonoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TelefonoConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case TelefonoConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case TelefonoConstantesFunciones.LABEL_EXTENSION:
					sNombreCampoCategoriaValor="extension";
					break;

				case TelefonoConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="es_activo";
					break;

				case TelefonoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTelefono.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TelefonoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TelefonoConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_telefono");
					break;

				case TelefonoConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TelefonoConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case TelefonoConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case TelefonoConstantesFunciones.LABEL_EXTENSION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Extension",sNombreCampoCategoria,sNombreCampoCategoriaValor,"extension");
					break;

				case TelefonoConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_activo");
					break;

				case TelefonoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTelefonoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Telefonos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TelefonoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.gettipotelefo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoConstantesFunciones.LABEL_EXTENSION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_EXTENSION);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.getextension());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.getes_activo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TelefonoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TelefonoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Telefono telefono:telefonosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTelefono(row);				
			//	iRow++;
			//}				
			
			//for(Telefono telefonoAux:telefonosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTelefono(telefonoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
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
				this.telefonoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefono(false);
			
			//SI ES MANUAL
			if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefono();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTelefonoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefono(false);
			
			//SI ES MANUAL
			if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTelefono();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTelefonoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefono(false);
			
			//SI ES MANUAL
			if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTelefono();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTelefono() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTelefono.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTelefono.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTelefono.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTelefono.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTelefono.setMinimumSize(dimensionMinimum);
		this.jTableDatosTelefono.setMaximumSize(dimensionMaximum);
		this.jTableDatosTelefono.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTelefono(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTelefono(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTelefono(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTelefono(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTelefono(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTelefono(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefono(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTelefono(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TelefonoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTelefono() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTelefono();
		
		this.inicializarActualizarBindingBotonesManualTelefono(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTelefono();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefono() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTelefono(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTelefono(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTelefono.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTelefono.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTelefono.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTelefono!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTelefono.jCheckBoxPostAccionNuevoTelefono.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTelefono.jCheckBoxPostAccionSinCerrarTelefono.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTelefono.jCheckBoxPostAccionSinMensajeTelefono.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTelefono.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTelefono.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTelefono.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTelefono!=null) {
				this.jInternalFrameDetalleFormTelefono.jCheckBoxPostAccionNuevoTelefono.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTelefono.jCheckBoxPostAccionSinCerrarTelefono.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTelefono.jCheckBoxPostAccionSinMensajeTelefono.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTelefono.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTelefono.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTelefono!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTelefono.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTelefono!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTelefono.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTelefono.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTelefono.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTelefono.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTelefono!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTelefono.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTelefono.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTelefono(Boolean esInicializar) throws Exception {
		try	{	
			if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTelefono(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTelefono() throws Exception {
		try	{
			if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTelefono();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTelefono() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTelefono() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTelefono.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTelefono.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTelefono.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTelefono.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTelefono.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTelefono.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTelefono.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTelefono.addItem(reporte);
			}
			
			
			if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTelefono.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTelefono.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTelefono.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTelefono.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTelefono.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTelefono.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTelefono.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTelefono.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTelefono.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefono();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefono() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTelefono!=null) {
				this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTelefono!=null) {
				this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTelefono.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTelefono!=null) {
				
				if(this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTelefono.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTelefono.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTelefono.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTelefono.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTelefono()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ciudadFK_IdCiudadTelefono.getSelectedItem()!=null){this.id_ciudadFK_IdCiudad=((Ciudad)this.jComboBoxid_ciudadFK_IdCiudadTelefono.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteTelefono.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteTelefono.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisTelefono.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTelefono.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.getSelectedItem()!=null){this.id_tipo_telefonoFK_IdValorTelefono=((TipoTelefo)this.jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTelefono(Boolean esInicializar) throws Exception {				
		if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTelefono();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTelefono() throws Exception {
		this.inicializarActualizarBindingTablaTelefono(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTelefono() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTelefonoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefonoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTelefono(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=telefonoLogic.getTelefonos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=telefonos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTelefono.setModel(new TelefonoModel(this.telefonoLogic.getTelefonos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTelefono.setModel(new TelefonoModel(this.telefonos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTelefono!=null && this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTelefono();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TelefonoConstantesFunciones.SCLASSWEBTITULO,telefonoConstantesFunciones.resaltarSeleccionarTelefono,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TelefonoConstantesFunciones.SCLASSWEBTITULO,telefonoConstantesFunciones.resaltarSeleccionarTelefono,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_ID));

		if(this.telefonoConstantesFunciones.mostraridTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.telefonoConstantesFunciones.resaltaridTelefono,this.telefonoConstantesFunciones.activaridTelefono,this,true,"idTelefono","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.telefonoConstantesFunciones.resaltaridTelefono,this.telefonoConstantesFunciones.activaridTelefono,this,true,"idTelefono","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.telefonoConstantesFunciones.mostrarid_empresaTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.telefonoConstantesFunciones.resaltarid_empresaTelefono,this,this.telefonoConstantesFunciones.activarid_empresaTelefono));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.telefonoConstantesFunciones.resaltarid_empresaTelefono,this,this.telefonoConstantesFunciones.activarid_empresaTelefono,false,"id_empresaTelefono","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDCLIENTE));

		if(this.telefonoConstantesFunciones.mostrarid_clienteTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.telefonoConstantesFunciones.resaltarid_clienteTelefono,this,this.telefonoConstantesFunciones.activarid_clienteTelefono));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.telefonoConstantesFunciones.resaltarid_clienteTelefono,this,this.telefonoConstantesFunciones.activarid_clienteTelefono,true,"id_clienteTelefono","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO));

		if(this.telefonoConstantesFunciones.mostrarid_tipo_telefonoTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoTelefoTableCell(this.tipotelefosForeignKey,this.telefonoConstantesFunciones.resaltarid_tipo_telefonoTelefono,this,this.telefonoConstantesFunciones.activarid_tipo_telefonoTelefono));
			tableColumn.setCellEditor(new TipoTelefoTableCell(this.tipotelefosForeignKey,this.telefonoConstantesFunciones.resaltarid_tipo_telefonoTelefono,this,this.telefonoConstantesFunciones.activarid_tipo_telefonoTelefono,true,"id_tipo_telefonoTelefono","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDPAIS));

		if(this.telefonoConstantesFunciones.mostrarid_paisTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.telefonoConstantesFunciones.resaltarid_paisTelefono,this,this.telefonoConstantesFunciones.activarid_paisTelefono));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.telefonoConstantesFunciones.resaltarid_paisTelefono,this,this.telefonoConstantesFunciones.activarid_paisTelefono,true,"id_paisTelefono","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_IDCIUDAD));

		if(this.telefonoConstantesFunciones.mostrarid_ciudadTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.telefonoConstantesFunciones.resaltarid_ciudadTelefono,this,this.telefonoConstantesFunciones.activarid_ciudadTelefono));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.telefonoConstantesFunciones.resaltarid_ciudadTelefono,this,this.telefonoConstantesFunciones.activarid_ciudadTelefono,true,"id_ciudadTelefono","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_TELEFONO));

		if(this.telefonoConstantesFunciones.mostrartelefonoTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.telefonoConstantesFunciones.resaltartelefonoTelefono,this.telefonoConstantesFunciones.activartelefonoTelefono,this,true,"telefonoTelefono","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.telefonoConstantesFunciones.resaltartelefonoTelefono,this.telefonoConstantesFunciones.activartelefonoTelefono,this,true,"telefonoTelefono","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_EXTENSION));

		if(this.telefonoConstantesFunciones.mostrarextensionTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_EXTENSION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.telefonoConstantesFunciones.resaltarextensionTelefono,this.telefonoConstantesFunciones.activarextensionTelefono,this,true,"extensionTelefono","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.telefonoConstantesFunciones.resaltarextensionTelefono,this.telefonoConstantesFunciones.activarextensionTelefono,this,true,"extensionTelefono","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_ESACTIVO));

		if(this.telefonoConstantesFunciones.mostrares_activoTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.telefonoConstantesFunciones.resaltares_activoTelefono,this.telefonoConstantesFunciones.activares_activoTelefono));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.telefonoConstantesFunciones.resaltares_activoTelefono,this.telefonoConstantesFunciones.activares_activoTelefono,this,true,"es_activoTelefono","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono,TelefonoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.telefonoConstantesFunciones.mostrardescripcionTelefono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TelefonoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.telefonoConstantesFunciones.resaltardescripcionTelefono,this.telefonoConstantesFunciones.activardescripcionTelefono,this,true,"descripcionTelefono","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.telefonoConstantesFunciones.resaltardescripcionTelefono,this.telefonoConstantesFunciones.activardescripcionTelefono,this,true,"descripcionTelefono","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TelefonoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.telefonoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.telefonoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTelefono.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.telefonoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.telefonoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTelefono.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTelefono && this.isPermisoGuardarCambiosTelefono) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.telefonoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.telefonoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTelefono.addColumn(tableColumn);
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
			
			this.jTableDatosTelefono.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTelefono && this.isPermisoGuardarCambiosTelefono) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTelefono && this.isPermisoGuardarCambiosTelefono) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTelefono.moveColumn(this.jTableDatosTelefono.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTelefono.moveColumn(this.jTableDatosTelefono.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTelefono.moveColumn(this.jTableDatosTelefono.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTelefono.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTelefono.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTelefono,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTelefono.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTelefono.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTelefono.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTelefono.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTelefono.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=telefonoLogic.getTelefonos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=telefonos.size()-1;
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
		//this.jTableDatosTelefono.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTelefono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTelefono();
			
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
				
				//this.isEsNuevoTelefono=false;
					
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
				if(this.telefonoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTelefono==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTelefono.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTelefono.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.telefono.getsType().equals("DUPLICADO")
				   || this.telefono.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTelefono=true;
				
				} else {
					this.isEsNuevoTelefono=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
					if(this.telefono.getId()>=0 && !this.telefono.getIsNew()) {						
						this.isEsNuevoTelefono=false;
						
					} else {
						this.isEsNuevoTelefono=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTelefono(esRelaciones);						
				
				this.seleccionarTelefono(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.telefono.getId()<0) {
					this.isEsNuevoTelefono=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTelefono(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTelefono(evt,rowIndex);
				}	
				
				if(this.telefonoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Telefono: " + this.dDif); 
					}
				}								
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTelefono(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.telefono)) {
					if(this.telefono.getId()>0) {
						this.telefono.setIsDeleted(true);
						
						this.telefonosEliminados.add(this.telefono);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.telefonoLogic.getTelefonos().remove(this.telefono);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.telefonos.remove(this.telefono);				
					}
					
					
					((TelefonoModel) this.jTableDatosTelefono.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefono(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTelefono(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTelefono) {
			
			if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTelefono.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTelefono.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTelefono(this.telefono);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.telefonoConstantesFunciones.cargarid_empresaTelefono || this.telefonoConstantesFunciones.event_dependid_empresaTelefono) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.telefono.getid_empresa());
									//this.inicializarActualizarBindingTelefono(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(telefono.getEmpresa()!=null) {
							this.empresasForeignKey.add(telefono.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.telefono.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.telefonoConstantesFunciones.cargarid_clienteTelefono || this.telefonoConstantesFunciones.event_dependid_clienteTelefono) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.telefono.getid_cliente());
									//this.inicializarActualizarBindingTelefono(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(telefono.getCliente()!=null) {
							this.clientesForeignKey.add(telefono.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.telefono.getid_cliente(),false,"Formulario");

					//TipoTelefo
					if(!this.telefonoConstantesFunciones.cargarid_tipo_telefonoTelefono || this.telefonoConstantesFunciones.event_dependid_tipo_telefonoTelefono) {
						//this.cargarCombosTipoTelefosForeignKeyLista(" where id="+this.telefono.getid_tipo_telefono());
									//this.inicializarActualizarBindingTelefono(false,false);
						this.tipotelefosForeignKey=new ArrayList<TipoTelefo>();

						if(telefono.getTipoTelefo()!=null) {
							this.tipotelefosForeignKey.add(telefono.getTipoTelefo());
						}

						this.addItemDefectoCombosForeignKeyTipoTelefo();
						this.cargarCombosFrameTipoTelefosForeignKey("Todos");
					}
					this.setActualTipoTelefoForeignKey(this.telefono.getid_tipo_telefono(),false,"Formulario");

					//Pais
					if(!this.telefonoConstantesFunciones.cargarid_paisTelefono || this.telefonoConstantesFunciones.event_dependid_paisTelefono) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.telefono.getid_pais());
									//this.inicializarActualizarBindingTelefono(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(telefono.getPais()!=null) {
							this.paissForeignKey.add(telefono.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.telefono.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.telefonoConstantesFunciones.cargarid_ciudadTelefono || this.telefonoConstantesFunciones.event_dependid_ciudadTelefono) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.telefono.getid_ciudad());
									//this.inicializarActualizarBindingTelefono(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(telefono.getCiudad()!=null) {
							this.ciudadsForeignKey.add(telefono.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.telefono.getid_ciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTelefono("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTelefono(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefono() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTelefono(Telefono telefono) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTelefono(telefono,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTelefono(Telefono telefono,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTelefono(telefono);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTelefono(telefono,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTelefono(telefono);
	}
	
	public void setVariablesObjetoActualToFormularioTelefono(Telefono telefono) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.setText(telefono.getId().toString());
			this.jInternalFrameDetalleFormTelefono.jTextAreatelefonoTelefono.setText(telefono.gettelefono());
			this.jInternalFrameDetalleFormTelefono.jTextFieldextensionTelefono.setText(telefono.getextension());
			this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.setSelected(telefono.getes_activo());
			this.jInternalFrameDetalleFormTelefono.jTextAreadescripcionTelefono.setText(telefono.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Telefono telefonoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,telefonoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Telefono telefonoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				telefonoLocal=this.telefono;
			} else {
				telefonoLocal=this.telefonoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(telefonoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTelefono(telefonoLocal,true);
					
					if(telefonoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(telefonoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(telefonoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTelefono(Telefono telefono,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTelefono(telefono,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTelefono(telefono);
	}
	
	public void setVariablesFormularioToObjetoActualTelefono(Telefono telefono,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTelefono(telefono,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTelefono(Telefono telefono,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.getText()==null || this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.getText()=="" || this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.getText()=="Id") {
				this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.setText("0");
			}

			if(conColumnasBase) {telefono.setId(Long.parseLong(this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TelefonoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabelIdTelefono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			telefono.settelefono(this.jInternalFrameDetalleFormTelefono.jTextAreatelefonoTelefono.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TelefonoConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabeltelefonoTelefono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			telefono.setextension(this.jInternalFrameDetalleFormTelefono.jTextFieldextensionTelefono.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TelefonoConstantesFunciones.LABEL_EXTENSION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabelextensionTelefono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			telefono.setes_activo(this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TelefonoConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabeles_activoTelefono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			telefono.setdescripcion(this.jInternalFrameDetalleFormTelefono.jTextAreadescripcionTelefono.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TelefonoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono.jLabeldescripcionTelefono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTelefono(Telefono telefonoBean,Telefono telefono,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && telefonoBean.getid_cliente()!=null && !telefonoBean.getid_cliente().equals(-1L))) {telefono.setid_cliente(telefonoBean.getid_cliente());}
			if(conDefault || (!conDefault && telefonoBean.getid_tipo_telefono()!=null && !telefonoBean.getid_tipo_telefono().equals(-1L))) {telefono.setid_tipo_telefono(telefonoBean.getid_tipo_telefono());}
			if(conDefault || (!conDefault && telefonoBean.getid_pais()!=null && !telefonoBean.getid_pais().equals(-1L))) {telefono.setid_pais(telefonoBean.getid_pais());}
			if(conDefault || (!conDefault && telefonoBean.getid_ciudad()!=null && !telefonoBean.getid_ciudad().equals(-1L))) {telefono.setid_ciudad(telefonoBean.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTelefono(Telefono telefonoOrigen,Telefono telefono,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && telefonoOrigen.getId()!=null && !telefonoOrigen.getId().equals(0L))) {telefono.setId(telefonoOrigen.getId());}}
			if(conDefault || (!conDefault && telefonoOrigen.getid_cliente()!=null && !telefonoOrigen.getid_cliente().equals(-1L))) {telefono.setid_cliente(telefonoOrigen.getid_cliente());}
			if(conDefault || (!conDefault && telefonoOrigen.getid_tipo_telefono()!=null && !telefonoOrigen.getid_tipo_telefono().equals(-1L))) {telefono.setid_tipo_telefono(telefonoOrigen.getid_tipo_telefono());}
			if(conDefault || (!conDefault && telefonoOrigen.getid_pais()!=null && !telefonoOrigen.getid_pais().equals(-1L))) {telefono.setid_pais(telefonoOrigen.getid_pais());}
			if(conDefault || (!conDefault && telefonoOrigen.getid_ciudad()!=null && !telefonoOrigen.getid_ciudad().equals(-1L))) {telefono.setid_ciudad(telefonoOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && telefonoOrigen.gettelefono()!=null && !telefonoOrigen.gettelefono().equals(""))) {telefono.settelefono(telefonoOrigen.gettelefono());}
			if(conDefault || (!conDefault && telefonoOrigen.getextension()!=null && !telefonoOrigen.getextension().equals(""))) {telefono.setextension(telefonoOrigen.getextension());}
			if(conDefault || (!conDefault && telefonoOrigen.getes_activo()!=null && !telefonoOrigen.getes_activo().equals(false))) {telefono.setes_activo(telefonoOrigen.getes_activo());}
			if(conDefault || (!conDefault && telefonoOrigen.getdescripcion()!=null && !telefonoOrigen.getdescripcion().equals(""))) {telefono.setdescripcion(telefonoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTelefono(Telefono telefono) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.setText(telefono.getId().toString());
			this.jInternalFrameDetalleFormTelefono.jTextAreatelefonoTelefono.setText(telefono.gettelefono());
			this.jInternalFrameDetalleFormTelefono.jTextFieldextensionTelefono.setText(telefono.getextension());
			this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.setSelected(telefono.getes_activo());
			this.jInternalFrameDetalleFormTelefono.jTextAreadescripcionTelefono.setText(telefono.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTelefono(TelefonoBean telefonoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.setText(telefonoBean.getId().toString());
			this.jInternalFrameDetalleFormTelefono.jTextAreatelefonoTelefono.setText(telefonoBean.gettelefono());
			this.jInternalFrameDetalleFormTelefono.jTextFieldextensionTelefono.setText(telefonoBean.getextension());
			this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.setSelected(telefonoBean.getes_activo());
			this.jInternalFrameDetalleFormTelefono.jTextAreadescripcionTelefono.setText(telefonoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTelefono(TelefonoParameterReturnGeneral telefonoReturnGeneral,TelefonoBean telefonoBean,Boolean conDefault) throws Exception { 
		try {
			Telefono telefonoLocal=new Telefono();
			
			telefonoLocal=telefonoReturnGeneral.getTelefono();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && telefonoLocal.getId()!=null && !telefonoLocal.getId().equals(0L))) {telefonoBean.setId(telefonoLocal.getId());}}
			if(conDefault || (!conDefault && telefonoLocal.getid_cliente()!=null && !telefonoLocal.getid_cliente().equals(-1L))) {telefonoBean.setid_cliente(telefonoLocal.getid_cliente());}
			if(conDefault || (!conDefault && telefonoLocal.getid_tipo_telefono()!=null && !telefonoLocal.getid_tipo_telefono().equals(-1L))) {telefonoBean.setid_tipo_telefono(telefonoLocal.getid_tipo_telefono());}
			if(conDefault || (!conDefault && telefonoLocal.getid_pais()!=null && !telefonoLocal.getid_pais().equals(-1L))) {telefonoBean.setid_pais(telefonoLocal.getid_pais());}
			if(conDefault || (!conDefault && telefonoLocal.getid_ciudad()!=null && !telefonoLocal.getid_ciudad().equals(-1L))) {telefonoBean.setid_ciudad(telefonoLocal.getid_ciudad());}
			if(conDefault || (!conDefault && telefonoLocal.gettelefono()!=null && !telefonoLocal.gettelefono().equals(""))) {telefonoBean.settelefono(telefonoLocal.gettelefono());}
			if(conDefault || (!conDefault && telefonoLocal.getextension()!=null && !telefonoLocal.getextension().equals(""))) {telefonoBean.setextension(telefonoLocal.getextension());}
			if(conDefault || (!conDefault && telefonoLocal.getes_activo()!=null && !telefonoLocal.getes_activo().equals(false))) {telefonoBean.setes_activo(telefonoLocal.getes_activo());}
			if(conDefault || (!conDefault && telefonoLocal.getdescripcion()!=null && !telefonoLocal.getdescripcion().equals(""))) {telefonoBean.setdescripcion(telefonoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTelefonoGenerico(Long idTelefonoSeleccionado,JComboBox jComboBoxTelefono,List<Telefono> telefonosLocal)throws Exception {
		try {
			Telefono  telefonoTemp=null;

			for(Telefono telefonoAux:telefonosLocal) {
				if(telefonoAux.getId()!=null && telefonoAux.getId().equals(idTelefonoSeleccionado)) {
					telefonoTemp=telefonoAux;
					break;
				}
			}

			jComboBoxTelefono.setSelectedItem(telefonoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTelefonoGenerico(JComboBox jComboBoxTelefono,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTelefono.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTelefono.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTelefono.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTelefono.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefono=(Telefono) telefonoLogic.getTelefonos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			telefono =(Telefono) telefonos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!telefono.getIsNew() && !telefono.getIsChanged() && !telefono.getIsDeleted()) {
				sDescripcion=telefono.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=telefono.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!telefono.getIsNew() && !telefono.getIsChanged() && !telefono.getIsDeleted()) {
				sDescripcion=telefono.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=telefono.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoTelefo")) {
			//sDescripcion=this.getActualTipoTelefoForeignKeyDescripcion((Long)value);
			if(!telefono.getIsNew() && !telefono.getIsChanged() && !telefono.getIsDeleted()) {
				sDescripcion=telefono.gettipotelefo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTelefoForeignKeyDescripcion((Long)value);
				sDescripcion=telefono.gettipotelefo_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!telefono.getIsNew() && !telefono.getIsChanged() && !telefono.getIsDeleted()) {
				sDescripcion=telefono.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=telefono.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!telefono.getIsNew() && !telefono.getIsChanged() && !telefono.getIsDeleted()) {
				sDescripcion=telefono.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=telefono.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Telefono telefonoRow=new Telefono();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefonoRow=(Telefono) telefonoLogic.getTelefonos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			telefonoRow=(Telefono) telefonos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTelefono(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTelefono.setVisible((this.isVisibilidadCeldaNuevoTelefono && this.isPermisoNuevoTelefono));			
			this.jButtonDuplicarTelefono.setVisible((this.isVisibilidadCeldaDuplicarTelefono && this.isPermisoDuplicarTelefono));			
			this.jButtonCopiarTelefono.setVisible((this.isVisibilidadCeldaCopiarTelefono && this.isPermisoCopiarTelefono));
			this.jButtonVerFormTelefono.setVisible((this.isVisibilidadCeldaVerFormTelefono && this.isPermisoVerFormTelefono));
			
			this.jButtonAbrirOrderByTelefono.setVisible((this.isVisibilidadCeldaOrdenTelefono && this.isPermisoOrdenTelefono));			
			
			this.jButtonNuevoRelacionesTelefono.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefono && this.isPermisoNuevoTelefono));			
			this.jButtonNuevoGuardarCambiosTelefono.setVisible((this.isVisibilidadCeldaNuevoTelefono && this.isPermisoNuevoTelefono && this.isPermisoGuardarCambiosTelefono));
			
			if(this.jInternalFrameDetalleFormTelefono!=null) {
			this.jInternalFrameDetalleFormTelefono.jButtonModificarTelefono.setVisible((this.isVisibilidadCeldaModificarTelefono && this.isPermisoActualizarTelefono));	
			this.jInternalFrameDetalleFormTelefono.jButtonActualizarTelefono.setVisible((this.isVisibilidadCeldaActualizarTelefono && this.isPermisoActualizarTelefono));	
			this.jInternalFrameDetalleFormTelefono.jButtonEliminarTelefono.setVisible((this.isVisibilidadCeldaEliminarTelefono && this.isPermisoEliminarTelefono));
			this.jInternalFrameDetalleFormTelefono.jButtonCancelarTelefono.setVisible(this.isVisibilidadCeldaCancelarTelefono);							
			this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosTelefono.setVisible((this.isVisibilidadCeldaGuardarTelefono && this.isPermisoGuardarCambiosTelefono));			
			
			}
						
			this.jButtonGuardarCambiosTablaTelefono.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefono && this.isPermisoGuardarCambiosTelefono));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTelefono.setVisible((this.isVisibilidadCeldaNuevoTelefono && this.isPermisoNuevoTelefono));						
			this.jButtonDuplicarToolBarTelefono.setVisible((this.isVisibilidadCeldaDuplicarTelefono && this.isPermisoDuplicarTelefono));						
			this.jButtonCopiarToolBarTelefono.setVisible((this.isVisibilidadCeldaCopiarTelefono && this.isPermisoCopiarTelefono));			
			this.jButtonVerFormToolBarTelefono.setVisible((this.isVisibilidadCeldaVerFormTelefono && this.isPermisoVerFormTelefono));			
			this.jButtonAbrirOrderByToolBarTelefono.setVisible((this.isVisibilidadCeldaOrdenTelefono && this.isPermisoOrdenTelefono));
			this.jButtonNuevoRelacionesToolBarTelefono.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefono && this.isPermisoNuevoTelefono));			
			this.jButtonNuevoGuardarCambiosToolBarTelefono.setVisible((this.isVisibilidadCeldaNuevoTelefono && this.isPermisoNuevoTelefono && this.isPermisoGuardarCambiosTelefono));			
			
			if(this.jInternalFrameDetalleFormTelefono!=null) {
			this.jInternalFrameDetalleFormTelefono.jButtonModificarToolBarTelefono.setVisible((this.isVisibilidadCeldaModificarTelefono && this.isPermisoActualizarTelefono));	
			this.jInternalFrameDetalleFormTelefono.jButtonActualizarToolBarTelefono.setVisible((this.isVisibilidadCeldaActualizarTelefono  && this.isPermisoActualizarTelefono));	
			this.jInternalFrameDetalleFormTelefono.jButtonEliminarToolBarTelefono.setVisible((this.isVisibilidadCeldaEliminarTelefono && this.isPermisoEliminarTelefono));
			this.jInternalFrameDetalleFormTelefono.jButtonCancelarToolBarTelefono.setVisible(this.isVisibilidadCeldaCancelarTelefono);				
			this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosToolBarTelefono.setVisible((this.isVisibilidadCeldaGuardarTelefono && this.isPermisoGuardarCambiosTelefono));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTelefono.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefono && this.isPermisoGuardarCambiosTelefono));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTelefono.setVisible((this.isVisibilidadCeldaNuevoTelefono && this.isPermisoNuevoTelefono));			
			this.jMenuItemDuplicarTelefono.setVisible((this.isVisibilidadCeldaDuplicarTelefono && this.isPermisoDuplicarTelefono));			
			this.jMenuItemCopiarTelefono.setVisible((this.isVisibilidadCeldaCopiarTelefono && this.isPermisoCopiarTelefono));			
			this.jMenuItemVerFormTelefono.setVisible((this.isVisibilidadCeldaVerFormTelefono && this.isPermisoVerFormTelefono));			
			this.jMenuItemAbrirOrderByTelefono.setVisible((this.isVisibilidadCeldaOrdenTelefono && this.isPermisoOrdenTelefono));			
			//this.jMenuItemMostrarOcultarTelefono.setVisible((this.isVisibilidadCeldaOrdenTelefono && this.isPermisoOrdenTelefono));
			this.jMenuItemDetalleAbrirOrderByTelefono.setVisible((this.isVisibilidadCeldaOrdenTelefono && this.isPermisoOrdenTelefono));			
			//this.jMenuItemDetalleMostrarOcultarTelefono.setVisible((this.isVisibilidadCeldaOrdenTelefono && this.isPermisoOrdenTelefono));			
			this.jMenuItemNuevoRelacionesTelefono.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefono && this.isPermisoNuevoTelefono));			
			this.jMenuItemNuevoGuardarCambiosTelefono.setVisible((this.isVisibilidadCeldaNuevoTelefono && this.isPermisoNuevoTelefono && this.isPermisoGuardarCambiosTelefono));									
			
			if(this.jInternalFrameDetalleFormTelefono!=null) {
			this.jInternalFrameDetalleFormTelefono.jMenuItemModificarTelefono.setVisible((this.isVisibilidadCeldaModificarTelefono && this.isPermisoActualizarTelefono));	
			this.jInternalFrameDetalleFormTelefono.jMenuItemActualizarTelefono.setVisible((this.isVisibilidadCeldaActualizarTelefono && this.isPermisoActualizarTelefono));	
			this.jInternalFrameDetalleFormTelefono.jMenuItemEliminarTelefono.setVisible((this.isVisibilidadCeldaEliminarTelefono && this.isPermisoEliminarTelefono));
			this.jInternalFrameDetalleFormTelefono.jMenuItemCancelarTelefono.setVisible(this.isVisibilidadCeldaCancelarTelefono);				
			}
			
			this.jMenuItemGuardarCambiosTelefono.setVisible((this.isVisibilidadCeldaGuardarTelefono && this.isPermisoGuardarCambiosTelefono));						
			this.jMenuItemGuardarCambiosTablaTelefono.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefono && this.isPermisoGuardarCambiosTelefono));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTelefono=this.jButtonNuevoTelefono.isVisible();
			this.isVisibilidadCeldaDuplicarTelefono=this.jButtonDuplicarTelefono.isVisible();
			this.isVisibilidadCeldaCopiarTelefono=this.jButtonCopiarTelefono.isVisible();
			this.isVisibilidadCeldaVerFormTelefono=this.jButtonVerFormTelefono.isVisible();
			
			this.isVisibilidadCeldaOrdenTelefono=this.jButtonAbrirOrderByTelefono.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTelefono=this.jButtonNuevoRelacionesTelefono.isVisible();
			this.isVisibilidadCeldaModificarTelefono=this.jButtonModificarTelefono.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefono!=null) {
			this.isVisibilidadCeldaActualizarTelefono=this.jInternalFrameDetalleFormTelefono.jButtonActualizarTelefono.isVisible();
			this.isVisibilidadCeldaEliminarTelefono=this.jInternalFrameDetalleFormTelefono.jButtonEliminarTelefono.isVisible();
			this.isVisibilidadCeldaCancelarTelefono=this.jInternalFrameDetalleFormTelefono.jButtonCancelarTelefono.isVisible();
			this.isVisibilidadCeldaGuardarTelefono=this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosTelefono.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTelefono=this.jButtonGuardarCambiosTablaTelefono.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTelefono=this.jButtonNuevoToolBarTelefono.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTelefono=this.jButtonNuevoRelacionesToolBarTelefono.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefono!=null) {
			this.isVisibilidadCeldaModificarTelefono=this.jInternalFrameDetalleFormTelefono.jButtonModificarToolBarTelefono.isVisible();
			this.isVisibilidadCeldaActualizarTelefono=this.jInternalFrameDetalleFormTelefono.jButtonActualizarToolBarTelefono.isVisible();
			this.isVisibilidadCeldaEliminarTelefono=this.jInternalFrameDetalleFormTelefono.jButtonEliminarToolBarTelefono.isVisible();
			this.isVisibilidadCeldaCancelarTelefono=this.jInternalFrameDetalleFormTelefono.jButtonCancelarToolBarTelefono.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTelefono=this.jButtonGuardarCambiosToolBarTelefono.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTelefono=this.jButtonGuardarCambiosTablaToolBarTelefono.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTelefono=this.jMenuItemNuevoTelefono.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTelefono=this.jMenuItemNuevoRelacionesTelefono.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefono!=null) {
			this.isVisibilidadCeldaModificarTelefono=this.jInternalFrameDetalleFormTelefono.jMenuItemModificarTelefono.isVisible();
			this.isVisibilidadCeldaActualizarTelefono=this.jInternalFrameDetalleFormTelefono.jMenuItemActualizarTelefono.isVisible();
			this.isVisibilidadCeldaEliminarTelefono=this.jInternalFrameDetalleFormTelefono.jMenuItemEliminarTelefono.isVisible();
			this.isVisibilidadCeldaCancelarTelefono=this.jInternalFrameDetalleFormTelefono.jMenuItemCancelarTelefono.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTelefono=this.jMenuItemGuardarCambiosTelefono.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTelefono=this.jMenuItemGuardarCambiosTablaTelefono.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTelefono(Boolean esInicializar) {
		if(TelefonoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.telefonoSessionBean.getConGuardarRelaciones()) {
				//if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTelefono();
			}
			
			this.inicializarActualizarBindingBotonesManualTelefono(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTelefono() {
		this.jButtonNuevoTelefono.setVisible(this.isPermisoNuevoTelefono);			
		this.jButtonDuplicarTelefono.setVisible(this.isPermisoDuplicarTelefono);			
		this.jButtonCopiarTelefono.setVisible(this.isPermisoCopiarTelefono);			
		this.jButtonVerFormTelefono.setVisible(this.isPermisoVerFormTelefono);			
		
		this.jButtonAbrirOrderByTelefono.setVisible(this.isPermisoOrdenTelefono);					
		
		this.jButtonNuevoRelacionesTelefono.setVisible(this.isPermisoNuevoTelefono);			
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonModificarTelefono.setVisible(this.isPermisoActualizarTelefono);	
			this.jInternalFrameDetalleFormTelefono.jButtonActualizarTelefono.setVisible(this.isPermisoActualizarTelefono);	
			this.jInternalFrameDetalleFormTelefono.jButtonEliminarTelefono.setVisible(this.isPermisoEliminarTelefono);
			this.jInternalFrameDetalleFormTelefono.jButtonCancelarTelefono.setVisible(this.isVisibilidadCeldaCancelarTelefono);						
			this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosTelefono.setVisible(this.isPermisoGuardarCambiosTelefono);							
		}
		
		this.jButtonGuardarCambiosTablaTelefono.setVisible(this.isPermisoActualizarTelefono);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTelefono() {
		this.jInternalFrameDetalleFormTelefono.jButtonModificarTelefono.setVisible(this.isPermisoActualizarTelefono);	
		this.jInternalFrameDetalleFormTelefono.jButtonActualizarTelefono.setVisible(this.isPermisoActualizarTelefono);	
		this.jInternalFrameDetalleFormTelefono.jButtonEliminarTelefono.setVisible(this.isPermisoEliminarTelefono);
		this.jInternalFrameDetalleFormTelefono.jButtonCancelarTelefono.setVisible(this.isVisibilidadCeldaCancelarTelefono);							
		this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosTelefono.setVisible((this.isVisibilidadCeldaGuardarTelefono && this.isPermisoGuardarCambiosTelefono));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTelefono() {
		if(TelefonoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTelefono();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTelefono() {
	}
	
	public void jTableDatosTelefonoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTelefono(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.telefono.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTelefonoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTelefono(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTelefono.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTelefono.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.telefonoLogic.getConnexion());

				if(this.telefono.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.telefono.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTelefono=(TitledBorder)this.jScrollPanelDatosTelefono.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTelefono.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.telefono.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteTelefonoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTelefono=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosTelefono.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTelefono=(TitledBorder)this.jScrollPanelDatosTelefono.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderTelefono.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteTelefonoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebTelefono(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTelefono.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTelefono.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.telefonoLogic.getConnexion());

				if(this.telefono.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.telefono.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTelefono=(TitledBorder)this.jScrollPanelDatosTelefono.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderTelefono.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.telefono.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_telefonoTelefonoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotelefo=true;

			idTienePermisotipotelefo=this.tienePermisosUsuarioEnPaginaWebTelefono(TipoTelefoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotelefo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTelefono.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTelefono.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);

				this.tipotelefoBeanSwingJInternalFrame=new TipoTelefoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotelefoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotelefoBeanSwingJInternalFrame.getTipoTelefoLogic().setConnexion(this.telefonoLogic.getConnexion());

				if(this.telefono.getid_tipo_telefono()!=null) {
					this.tipotelefoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotelefoBeanSwingJInternalFrame.setIdActual(this.telefono.getid_tipo_telefono());
					this.tipotelefoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotelefoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotelefoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTelefo();
				}

				JInternalFrameBase jinternalFrame =this.tipotelefoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTelefono=(TitledBorder)this.jScrollPanelDatosTelefono.getBorder();
				TitledBorder titledBordertipotelefo=(TitledBorder)this.tipotelefoBeanSwingJInternalFrame.jScrollPanelDatosTipoTelefo.getBorder();

				titledBordertipotelefo.setTitle(titledBorderTelefono.getTitle() + " -> Tipo Telefo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_telefonoTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getid_tipo_telefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_telefono = "+this.telefono.getid_tipo_telefono().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTelefonoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTelefono(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTelefono.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTelefono.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.telefonoLogic.getConnexion());

				if(this.telefono.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.telefono.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTelefono=(TitledBorder)this.jScrollPanelDatosTelefono.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTelefono.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.telefono.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadTelefonoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebTelefono(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTelefono.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTelefono.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.telefonoLogic.getConnexion());

				if(this.telefono.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.telefono.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTelefono=(TitledBorder)this.jScrollPanelDatosTelefono.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderTelefono.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.telefono.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.telefono.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonextensionTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getextension()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where extension like '%"+this.telefono.getextension()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_activoTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getes_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_activo = "+this.telefono.getes_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTelefonoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono(this.gettelefono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono==null) {
						this.telefono = new Telefono();
					}

					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);
				}

				if(this.telefono.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.telefono.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadTelefonoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTelefono(false,false);

			this.getTelefonosFK_IdCiudad();

			this.inicializarActualizarBindingTelefono(false);

			//if(TelefonoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTelefono(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteTelefonoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTelefono(false,false);

			this.getTelefonosFK_IdCliente();

			this.inicializarActualizarBindingTelefono(false);

			//if(TelefonoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTelefono(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTelefonoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTelefono(false,false);

			this.getTelefonosFK_IdEmpresa();

			this.inicializarActualizarBindingTelefono(false);

			//if(TelefonoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTelefono(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTelefonoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTelefono(false,false);

			this.getTelefonosFK_IdPais();

			this.inicializarActualizarBindingTelefono(false);

			//if(TelefonoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTelefono(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorTelefonoTelefonoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTelefono(false,false);

			this.getTelefonosFK_IdValorTelefono();

			this.inicializarActualizarBindingTelefono(false);

			//if(TelefonoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTelefono(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefonoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTelefono() {
		if(this.jInternalFrameDetalleFormTelefono!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTelefono!=null) {
			this.jInternalFrameDetalleFormTelefono.setVisible(false);	    			
			this.jInternalFrameDetalleFormTelefono.dispose();
			this.jInternalFrameDetalleFormTelefono=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTelefono!=null) {
			this.jInternalFrameReporteDinamicoTelefono.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTelefono.dispose();
			this.jInternalFrameReporteDinamicoTelefono=null;
		}
		
		if(this.jInternalFrameImportacionTelefono!=null) {
			this.jInternalFrameImportacionTelefono.setVisible(false);	    			
			this.jInternalFrameImportacionTelefono.dispose();
			this.jInternalFrameImportacionTelefono=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTelefono();
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTelefono")) {
				jButtonNuevoTelefonoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTelefono")) {
				jButtonDuplicarTelefonoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTelefono")) {
				jButtonCopiarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTelefono")) {
				jButtonVerFormTelefonoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTelefono")) {
				jButtonNuevoTelefonoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTelefono")) {
				jButtonDuplicarTelefonoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTelefono")) {
				jButtonNuevoTelefonoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTelefono")) {
				jButtonDuplicarTelefonoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTelefono")) {
				jButtonNuevoTelefonoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTelefono")) {
				jButtonNuevoTelefonoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTelefono")) {
				jButtonNuevoTelefonoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTelefono")) {
				jButtonModificarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTelefono")) {
				jButtonModificarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTelefono")) {
				jButtonModificarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTelefono")) {
				jButtonActualizarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTelefono")) {
				jButtonActualizarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTelefono")) {
				jButtonActualizarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTelefono")) {
				jButtonEliminarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTelefono")) {
				jButtonEliminarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTelefono")) {
				jButtonEliminarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTelefono")) {
				jButtonCancelarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTelefono")) {
				jButtonCancelarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTelefono")) {
				jButtonCancelarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTelefono")) {
				jButtonCerrarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTelefono")) {
				jButtonCerrarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTelefono")) {
				jButtonCerrarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTelefono")) {
				jButtonMostrarOcultarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTelefono")) {
				jButtonCancelarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTelefono")) {
				jButtonGuardarCambiosTelefonoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTelefono")) {
				jButtonGuardarCambiosTelefonoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTelefono")) {
				jButtonCopiarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTelefono")) {
				jButtonVerFormTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTelefono")) {
				jButtonGuardarCambiosTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTelefono")) {
				jButtonCopiarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTelefono")) {
				jButtonVerFormTelefonoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTelefono")) {
				jButtonGuardarCambiosTelefonoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTelefono")) {
				jButtonGuardarCambiosTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTelefono")) {
				jButtonGuardarCambiosTelefonoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTelefono")) {
				jButtonRecargarInformacionTelefonoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTelefono")) {
				jButtonRecargarInformacionTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTelefono")) {
				jButtonRecargarInformacionTelefonoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTelefono")) {
				jButtonAnterioresTelefonoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTelefono")) {
				jButtonAnterioresTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTelefono")) {
				jButtonAnterioresTelefonoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTelefono")) {
				jButtonSiguientesTelefonoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTelefono")) {
				jButtonSiguientesTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTelefono")) {
				jButtonSiguientesTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTelefono") || sTipo.equals("MenuItemDetalleAbrirOrderByTelefono")) {
				jButtonAbrirOrderByTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTelefono") || sTipo.equals("MenuItemDetalleMostrarOcultarTelefono")) {
				jButtonMostrarOcultarTelefonoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTelefono")) {
				jButtonNuevoGuardarCambiosTelefonoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTelefono")) {
				jButtonNuevoGuardarCambiosTelefonoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTelefono")) {
				jButtonNuevoGuardarCambiosTelefonoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTelefono")) {
				jButtonCerrarReporteDinamicoTelefonoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTelefono")) {
				jButtonGenerarReporteDinamicoTelefonoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTelefono")) {
				
				jButtonGenerarExcelReporteDinamicoTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTelefono")) {
				jButtonCerrarImportacionTelefonoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTelefono")) {
				
				jButtonGenerarImportacionTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTelefono")) {
				
				jButtonAbrirImportacionTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTelefono")) {
				jComboBoxTiposAccionesTelefonoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTelefono")) {
				jComboBoxTiposRelacionesTelefonoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTelefono")) {
				jComboBoxTiposAccionesTelefonoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTelefono")) {
				
				jComboBoxTiposSeleccionarTelefonoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTelefono")) {
				jTextFieldValorCampoGeneralTelefonoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTelefono")) {
				jButtonAbrirOrderByTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTelefono")) {
				jButtonAbrirOrderByTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTelefono")) {
				jButtonCerrarOrderByTelefonoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTelefonoBusqueda")) {
				this.jButtonidTelefonoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTelefonoUpdate")) {
				this.jButtonid_empresaTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTelefonoBusqueda")) {
				this.jButtonid_empresaTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteTelefono")) {
				this.jButtonid_clienteTelefonoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteTelefonoUpdate")) {
				this.jButtonid_clienteTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteTelefonoBusqueda")) {
				this.jButtonid_clienteTelefonoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_telefonoTelefonoUpdate")) {
				this.jButtonid_tipo_telefonoTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_telefonoTelefonoBusqueda")) {
				this.jButtonid_tipo_telefonoTelefonoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTelefonoUpdate")) {
				this.jButtonid_paisTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTelefonoBusqueda")) {
				this.jButtonid_paisTelefonoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadTelefonoUpdate")) {
				this.jButtonid_ciudadTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadTelefonoBusqueda")) {
				this.jButtonid_ciudadTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoTelefonoBusqueda")) {
				this.jButtontelefonoTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("extensionTelefonoBusqueda")) {
				this.jButtonextensionTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoTelefonoBusqueda")) {
				this.jButtones_activoTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTelefonoBusqueda")) {
				this.jButtondescripcionTelefonoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteTelefono")) {
				this.jButtonid_clienteTelefonoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCiudadTelefono")) {
				this.jButtonFK_IdCiudadTelefonoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteTelefono")) {
				this.jButtonFK_IdClienteTelefonoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTelefono")) {
				this.jButtonFK_IdPaisTelefonoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorTelefonoTelefono")) {
				this.jButtonFK_IdValorTelefonoTelefonoActionPerformed(evt);
			}
			
			;
			
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTelefono();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				


				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Telefono telefonoLocal=null;
			
			if(!this.getEsControlTabla()) {
				telefonoLocal=this.telefono;
			} else {
				telefonoLocal=this.telefonoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
							
				
				


				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoAnterior =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoAnterior =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
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
			
			


			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
								
						
				


				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
								
				
				


				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoAnterior =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoAnterior =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoAnterior =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoAnterior =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
							
				
				


				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefonoAnterior =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.telefonoAnterior =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
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
			
			


			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
								
				
				


				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoAnterior =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoAnterior =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTelefono")) {
					jCheckBoxSeleccionarTodosTelefonoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTelefono")) {
					jCheckBoxSeleccionadosTelefonoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTelefono")) {
					
				}
				
				


				
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
												
				
				


				
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefonoAnterior =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.telefonoAnterior =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisTelefono")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono;
				}

				if(this.telefonoSessionBean.getConGuardarRelaciones()) {
					//classes=TelefonoConstantesFunciones.getClassesRelationshipsOfTelefono(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormTelefono(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisTelefono")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisTelefono,"FK_IdPais");
				//recargarFormTelefonoPais(jComboBoxid_paisFK_IdPaisTelefono,"FK_IdPais");
			}
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefonoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisTelefono")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono;
				}

				if(this.telefonoSessionBean.getConGuardarRelaciones()) {
					//classes=TelefonoConstantesFunciones.getClassesRelationshipsOfTelefono(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormTelefono(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisTelefono")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisTelefono,"FK_IdPais");
				//recargarFormTelefonoPais(jComboBoxid_paisFK_IdPaisTelefono,"FK_IdPais");
			}
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono);
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisTelefono")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono;
				}

				if(this.telefonoSessionBean.getConGuardarRelaciones()) {
					//classes=TelefonoConstantesFunciones.getClassesRelationshipsOfTelefono(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormTelefono(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisTelefono")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisTelefono,"FK_IdPais");
				//recargarFormTelefonoPais(jComboBoxid_paisFK_IdPaisTelefono,"FK_IdPais");
			}
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefonoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefonoAnterior =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefonoAnterior =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTelefono")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTelefonoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTelefono.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.telefono =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.telefono =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.telefono);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTelefono")) {
				
				}
				
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTelefono")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTelefono.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTelefono")) {
			
			}
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTelefono();
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
			if(sTipo.equals("NuevoTelefono")) {
				jButtonNuevoTelefonoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTelefono")) {
				jButtonDuplicarTelefonoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTelefono")) {
				jButtonCopiarTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTelefono")) {
				jButtonVerFormTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTelefono")) {
				jButtonNuevoTelefonoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTelefono")) {
				jButtonModificarTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTelefono")) {
				jButtonActualizarTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTelefono")) {
				jButtonEliminarTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTelefono")) {
				jButtonGuardarCambiosTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTelefono")) {
				jButtonCancelarTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTelefono")) {
				jButtonCerrarTelefonoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTelefono")) {
				jButtonGuardarCambiosTelefonoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTelefono")) {
				jButtonNuevoGuardarCambiosTelefonoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTelefono")) {
				jButtonAbrirOrderByTelefonoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTelefono")) {
				jButtonRecargarInformacionTelefonoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTelefono")) {
				jButtonAnterioresTelefonoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTelefono")) {
				jButtonSiguientesTelefonoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTelefonoBusqueda")) {
				this.jButtonidTelefonoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTelefonoUpdate")) {
				this.jButtonid_empresaTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTelefonoBusqueda")) {
				this.jButtonid_empresaTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteTelefono")) {
				this.jButtonid_clienteTelefonoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteTelefonoUpdate")) {
				this.jButtonid_clienteTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteTelefonoBusqueda")) {
				this.jButtonid_clienteTelefonoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_telefonoTelefonoUpdate")) {
				this.jButtonid_tipo_telefonoTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_telefonoTelefonoBusqueda")) {
				this.jButtonid_tipo_telefonoTelefonoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTelefonoUpdate")) {
				this.jButtonid_paisTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTelefonoBusqueda")) {
				this.jButtonid_paisTelefonoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadTelefonoUpdate")) {
				this.jButtonid_ciudadTelefonoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadTelefonoBusqueda")) {
				this.jButtonid_ciudadTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoTelefonoBusqueda")) {
				this.jButtontelefonoTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("extensionTelefonoBusqueda")) {
				this.jButtonextensionTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoTelefonoBusqueda")) {
				this.jButtones_activoTelefonoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTelefonoBusqueda")) {
				this.jButtondescripcionTelefonoBusquedaActionPerformed(evt);
			}
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTelefono();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTelefono")) {
				closingInternalFrameTelefono();
				
			} else if(sTipo.equals("jButtonCancelarTelefono")) {
				JInternalFrameBase jInternalFrameDetalleFormTelefono = (JInternalFrameBase)evt.getSource();
	            	
	            TelefonoBeanSwingJInternalFrame jInternalFrameParent=(TelefonoBeanSwingJInternalFrame)jInternalFrameDetalleFormTelefono.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTelefonoActionPerformed(null);
			}
			
			TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.telefono,new Object(),this.telefonoParameterGeneral,this.telefonoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTelefono(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTelefono(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTelefono(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.telefono)) {
			if(!esControlTabla) {
				if(TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);			
				}
				
				if(this.telefonoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTelefono(this.telefono,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.telefonoReturnGeneral=telefonoLogic.procesarEventosTelefonosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefonoLogic.getTelefonos(),this.telefono,this.telefonoParameterGeneral,this.isEsNuevoTelefono,classes);//this.telefonoLogic.getTelefono()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTelefono(this.telefonoReturnGeneral,this.telefonoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.telefonoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTelefono(classes,this.telefonoReturnGeneral,this.telefonoBean,false);
					}
						
					if(this.telefonoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTelefono(this.telefonoReturnGeneral.getTelefono());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTelefono(this.telefonoReturnGeneral.getTelefono());	
					}
						
					if(this.telefonoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTelefono(this.telefonoReturnGeneral.getTelefono(),classes);//this.telefonoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTelefono(this.telefono,classes);//this.telefonoBean);									
				}
			
				if(TelefonoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTelefono(this.telefono,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono(this.telefono);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.telefonoAnterior!=null) {
						this.telefono=this.telefonoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.telefonoReturnGeneral=telefonoLogic.procesarEventosTelefonosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefonoLogic.getTelefonos(),this.telefono,this.telefonoParameterGeneral,this.isEsNuevoTelefono,classes);//this.telefonoLogic.getTelefono()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.telefonoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.telefonoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.telefonoReturnGeneral.getTelefono(),telefonoLogic.getTelefonos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.telefonoReturnGeneral.getTelefono(),this.telefonos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTelefono.repaint();
				
				//((AbstractTableModel) this.jTableDatosTelefono.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTelefono();
			}
		}
	}
	
	public void actualizarVisualTableDatosTelefono() throws Exception {
		
		TelefonoModel telefonoModel=(TelefonoModel)this.jTableDatosTelefono.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefonoModel.telefonos=this.telefonoLogic.getTelefonos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			telefonoModel.telefonos=this.telefonos;
		}
		
		
		((TelefonoModel) this.jTableDatosTelefono.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTelefono() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettelefonoAnterior(),this.telefonoLogic.getTelefonos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettelefonoAnterior(),this.telefonos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTelefono();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTelefono(Telefono telefono,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
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
										
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefono,new Object(),generalEntityParameterGeneral,this.telefonoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.telefonoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TelefonoConstantesFunciones.getClassesRelationshipsOfTelefono(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TelefonoConstantesFunciones.getClassesRelationshipsFromStringsOfTelefono(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTelefono(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TelefonoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefono,new Object(),generalEntityParameterGeneral,this.telefonoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTelefono(TelefonoBean telefonoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTelefono(ArrayList<Classe> classes,TelefonoReturnGeneral telefonoReturnGeneral,TelefonoBean telefonoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTelefono(Telefono telefono,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.telefono)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTelefono = new TelefonoDetalleFormJInternalFrame(jDesktopPane,this.telefonoSessionBean.getConGuardarRelaciones(),this.telefonoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTelefono);
		this.jInternalFrameDetalleFormTelefono.setVisible(false);
		this.jInternalFrameDetalleFormTelefono.setSelected(false);						
		
		this.jInternalFrameDetalleFormTelefono.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTelefono.telefonoLogic=this.telefonoLogic;
		
		this.cargarCombosFrameForeignKeyTelefono("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTelefono();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTelefono();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTelefono("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTelefono();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTelefono.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTelefono"));
		
		this.jInternalFrameDetalleFormTelefono.jButtonModificarTelefono.addActionListener(new ButtonActionListener(this,"ModificarTelefono"));

		
		this.jInternalFrameDetalleFormTelefono.jButtonModificarToolBarTelefono.addActionListener(new ButtonActionListener(this,"ModificarToolBarTelefono"));
					
		this.jInternalFrameDetalleFormTelefono.jMenuItemModificarTelefono.addActionListener(new ButtonActionListener(this,"MenuItemModificarTelefono"));		
		
		
		
		this.jInternalFrameDetalleFormTelefono.jButtonActualizarTelefono.addActionListener (new ButtonActionListener(this,"ActualizarTelefono"));
		
		
		this.jInternalFrameDetalleFormTelefono.jButtonActualizarToolBarTelefono.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTelefono"));
						
		this.jInternalFrameDetalleFormTelefono.jMenuItemActualizarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTelefono"));		
		
		
		
		this.jInternalFrameDetalleFormTelefono.jButtonEliminarTelefono.addActionListener (new ButtonActionListener(this,"EliminarTelefono"));
		
		
		this.jInternalFrameDetalleFormTelefono.jButtonEliminarToolBarTelefono.addActionListener (new ButtonActionListener(this,"EliminarToolBarTelefono"));
								
		this.jInternalFrameDetalleFormTelefono.jMenuItemEliminarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTelefono"));		
		
		
		
		this.jInternalFrameDetalleFormTelefono.jButtonCancelarTelefono.addActionListener (new ButtonActionListener(this,"CancelarTelefono"));
		
		
		this.jInternalFrameDetalleFormTelefono.jButtonCancelarToolBarTelefono.addActionListener (new ButtonActionListener(this,"CancelarToolBarTelefono"));
					
		this.jInternalFrameDetalleFormTelefono.jMenuItemCancelarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTelefono"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTelefono.jMenuItemDetalleCerrarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTelefono"));		
		
		
		
		this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosToolBarTelefono.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefono"));
		
		
		
		this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosToolBarTelefono.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefono"));
		
		
		
		this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTelefono"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonidTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"idTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_empresaTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_empresaTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTelefonoBusqueda"));
		//jButtonid_clienteTelefono.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTelefonoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefono.addActionListener(new ButtonActionListener(this,"id_clienteTelefono"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_tipo_telefonoTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_telefonoTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_tipo_telefonoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_telefonoTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_paisTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_paisTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_ciudadTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_ciudadTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtontelefonoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonextensionTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"extensionTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtones_activoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"es_activoTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtondescripcionTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTelefonoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTelefono"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTelefono"));
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTelefono"));
		}
		
		this.jTableDatosTelefono.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTelefono"));
		
		this.jTableDatosTelefono.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTelefono"));
		
		this.jButtonNuevoTelefono.addActionListener(new ButtonActionListener(this,"NuevoTelefono"));
		
		this.jButtonDuplicarTelefono.addActionListener(new ButtonActionListener(this,"DuplicarTelefono"));
		
		this.jButtonCopiarTelefono.addActionListener(new ButtonActionListener(this,"CopiarTelefono"));
		
		this.jButtonVerFormTelefono.addActionListener(new ButtonActionListener(this,"VerFormTelefono"));
		
		
		this.jButtonNuevoToolBarTelefono.addActionListener(new ButtonActionListener(this,"NuevoToolBarTelefono"));
			
		this.jButtonDuplicarToolBarTelefono.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTelefono"));
			
		this.jMenuItemNuevoTelefono.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTelefono"));
			
		this.jMenuItemDuplicarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTelefono"));		
		
		
		this.jButtonNuevoRelacionesTelefono.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTelefono"));
		
		
		this.jButtonNuevoRelacionesToolBarTelefono.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTelefono"));
			
		this.jMenuItemNuevoRelacionesTelefono.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTelefono"));		
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonModificarTelefono.addActionListener(new ButtonActionListener(this,"ModificarTelefono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonModificarToolBarTelefono.addActionListener(new ButtonActionListener(this,"ModificarToolBarTelefono"));
			
			this.jInternalFrameDetalleFormTelefono.jMenuItemModificarTelefono.addActionListener(new ButtonActionListener(this,"MenuItemModificarTelefono"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTelefono.jButtonActualizarTelefono.addActionListener (new ButtonActionListener(this,"ActualizarTelefono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonActualizarToolBarTelefono.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTelefono"));
				
			this.jInternalFrameDetalleFormTelefono.jMenuItemActualizarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTelefono"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonEliminarTelefono.addActionListener (new ButtonActionListener(this,"EliminarTelefono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonEliminarToolBarTelefono.addActionListener (new ButtonActionListener(this,"EliminarToolBarTelefono"));
						
			this.jInternalFrameDetalleFormTelefono.jMenuItemEliminarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTelefono"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonCancelarTelefono.addActionListener (new ButtonActionListener(this,"CancelarTelefono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonCancelarToolBarTelefono.addActionListener (new ButtonActionListener(this,"CancelarToolBarTelefono"));
			
			this.jInternalFrameDetalleFormTelefono.jMenuItemCancelarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTelefono"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTelefono.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTelefono"));		
		
		
		this.jButtonCerrarTelefono.addActionListener (new ButtonActionListener(this,"CerrarTelefono"));
		
		
		this.jButtonCerrarToolBarTelefono.addActionListener (new ButtonActionListener(this,"CerrarToolBarTelefono"));
			
		this.jMenuItemCerrarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTelefono"));
			
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jMenuItemDetalleCerrarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTelefono"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosTelefono.addActionListener (new ButtonActionListener(this,"GuardarCambiosTelefono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosToolBarTelefono.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefono"));
		}
		
		this.jButtonCopiarToolBarTelefono.addActionListener (new ButtonActionListener(this,"CopiarToolBarTelefono"));
			
		this.jButtonVerFormToolBarTelefono.addActionListener (new ButtonActionListener(this,"VerFormToolBarTelefono"));
		
		this.jMenuItemGuardarCambiosTelefono.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTelefono"));
			
		this.jMenuItemCopiarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTelefono"));		
		
		this.jMenuItemVerFormTelefono.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTelefono"));		
		
		
		this.jButtonGuardarCambiosTablaTelefono.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTelefono"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTelefono.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTelefono"));
			
		this.jMenuItemGuardarCambiosTablaTelefono.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTelefono"));		
		
		
		
		this.jButtonRecargarInformacionTelefono.addActionListener (new ButtonActionListener(this,"RecargarInformacionTelefono"));
					
		this.jButtonRecargarInformacionToolBarTelefono.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTelefono"));
		
		this.jMenuItemRecargarInformacionTelefono.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTelefono"));		
		
		
		
		this.jButtonAnterioresTelefono.addActionListener (new ButtonActionListener(this,"AnterioresTelefono"));
		
		
		this.jButtonAnterioresToolBarTelefono.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTelefono"));
		
		this.jMenuItemAnterioresTelefono.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTelefono"));		
		
		
		this.jButtonSiguientesTelefono.addActionListener (new ButtonActionListener(this,"SiguientesTelefono"));
		
		
		this.jButtonSiguientesToolBarTelefono.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTelefono"));
			
		this.jMenuItemSiguientesTelefono.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTelefono"));
			
		this.jMenuItemAbrirOrderByTelefono.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTelefono"));
			
		this.jMenuItemMostrarOcultarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTelefono"));
			
		this.jMenuItemDetalleAbrirOrderByTelefono.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTelefono"));
			
		this.jMenuItemDetalleMostarOcultarTelefono.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTelefono"));		
		
		
		this.jButtonNuevoGuardarCambiosTelefono.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTelefono"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTelefono.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTelefono"));
			
		this.jMenuItemNuevoGuardarCambiosTelefono.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTelefono"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTelefono.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTelefono"));

		this.jCheckBoxSeleccionadosTelefono.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTelefono"));
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTelefono"));
		}
		
		
		this.jComboBoxTiposRelacionesTelefono.addActionListener (new ButtonActionListener(this,"TiposRelacionesTelefono"));
			
		this.jComboBoxTiposAccionesTelefono.addActionListener (new ButtonActionListener(this,"TiposAccionesTelefono"));
					
		this.jComboBoxTiposSeleccionarTelefono.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTelefono"));
			
		this.jTextFieldValorCampoGeneralTelefono.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTelefono"));		
		
		
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonidTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"idTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_empresaTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_empresaTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTelefonoBusqueda"));
		//jButtonid_clienteTelefono.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTelefonoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefono.addActionListener(new ButtonActionListener(this,"id_clienteTelefono"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_tipo_telefonoTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_telefonoTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_tipo_telefonoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_telefonoTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_paisTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_paisTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_ciudadTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_ciudadTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtontelefonoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonextensionTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"extensionTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtones_activoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"es_activoTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtondescripcionTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTelefonoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadTelefono.addActionListener(new ButtonActionListener(this,"FK_IdCiudadTelefono"));

			this.jButtonFK_IdClienteTelefono.addActionListener(new ButtonActionListener(this,"FK_IdClienteTelefono"));

			this.jButtonBuscarFK_IdClienteid_clienteTelefono.addActionListener(new ButtonActionListener(this,"id_clienteTelefono"));

			this.jButtonFK_IdPaisTelefono.addActionListener(new ButtonActionListener(this,"FK_IdPaisTelefono"));

			this.jButtonFK_IdValorTelefonoTelefono.addActionListener(new ButtonActionListener(this,"FK_IdValorTelefonoTelefono"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTelefono!=null) {
				this.jInternalFrameReporteDinamicoTelefono.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefono"));
				this.jInternalFrameReporteDinamicoTelefono.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefono"));
				this.jInternalFrameReporteDinamicoTelefono.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefono"));
			}
			
			//this.jButtonCerrarReporteDinamicoTelefono.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefono"));				
			//this.jButtonGenerarReporteDinamicoTelefono.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefono"));
			//this.jButtonGenerarExcelReporteDinamicoTelefono.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefono"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTelefono!=null) {
				this.jInternalFrameImportacionTelefono.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTelefono"));
				this.jInternalFrameImportacionTelefono.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTelefono"));
				this.jInternalFrameImportacionTelefono.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTelefono"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTelefono.addActionListener (new ButtonActionListener(this,"AbrirOrderByTelefono"));
			
			this.jButtonAbrirOrderByToolBarTelefono.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTelefono"));			
			
			if(this.jInternalFrameOrderByTelefono!=null) {
				this.jInternalFrameOrderByTelefono.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTelefono"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTelefono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono.jTabbedPaneRelacionesTelefono.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTelefono"));
		
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
            		closingInternalFrameTelefono();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTelefono.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTelefono = (JInternalFrameBase)event.getSource();
	            	
	            TelefonoBeanSwingJInternalFrame jInternalFrameParent=(TelefonoBeanSwingJInternalFrame)jInternalFrameDetalleFormTelefono.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTelefonoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTelefono.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTelefonoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTelefono.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTelefono.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTelefono";
		inputMap = this.jButtonNuevoTelefono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTelefono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTelefonoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefonoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTelefono";
		inputMap = this.jButtonNuevoRelacionesTelefono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTelefono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTelefonoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTelefono";
		inputMap = this.jButtonModificarTelefono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTelefono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTelefonoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTelefono";
		inputMap = this.jButtonActualizarTelefono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTelefono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTelefonoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTelefono";
		inputMap = this.jButtonEliminarTelefono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTelefono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTelefonoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTelefono";
		inputMap = this.jButtonCancelarTelefono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTelefono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTelefonoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTelefono";
		inputMap = this.jButtonCerrarTelefono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTelefono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTelefonoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTelefono";
		inputMap = this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosTelefono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTelefono.jButtonGuardarCambiosTelefono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTelefonoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTelefono.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTelefonoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTelefono.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTelefonoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTelefono.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTelefonoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTelefono.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTelefonoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonidTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"idTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_empresaTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_empresaTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTelefonoBusqueda"));
		//jButtonid_clienteTelefono.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTelefonoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefono.addActionListener(new ButtonActionListener(this,"id_clienteTelefono"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_tipo_telefonoTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_telefonoTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_tipo_telefonoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_telefonoTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_paisTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_paisTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTelefonoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono.jButtonid_ciudadTelefonoUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadTelefonoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonid_ciudadTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtontelefonoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtonextensionTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"extensionTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtones_activoTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"es_activoTelefonoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono.jButtondescripcionTelefonoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTelefonoBusqueda"));
		
		
		this.jButtonFK_IdCiudadTelefono.addActionListener(new ButtonActionListener(this,"FK_IdCiudadTelefono"));

		this.jButtonFK_IdClienteTelefono.addActionListener(new ButtonActionListener(this,"FK_IdClienteTelefono"));

		this.jButtonBuscarFK_IdClienteid_clienteTelefono.addActionListener(new ButtonActionListener(this,"id_clienteTelefono"));

		this.jButtonFK_IdPaisTelefono.addActionListener(new ButtonActionListener(this,"FK_IdPaisTelefono"));

		this.jButtonFK_IdValorTelefonoTelefono.addActionListener(new ButtonActionListener(this,"FK_IdValorTelefonoTelefono"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTelefono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTelefonoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTelefonoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTelefono.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTelefono(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
					telefonoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Telefono telefonoAux:telefonos) {
					telefonoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTelefonoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTelefono(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
						telefonoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Telefono telefonoAux:telefonos) {
						telefonoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
					
						if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							telefonoAux.setes_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Telefono telefonoAux:telefonos) {
						
						if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							telefonoAux.setes_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTelefono(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTelefono.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTelefono.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTelefono,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTelefonoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTelefono(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTelefono.getSelectedRows();
			
			Telefono telefonoLocal=new Telefono();
			
			//this.seleccionarTodosTelefono(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefonoLocal =(Telefono) this.telefonoLogic.getTelefonos().toArray()[this.jTableDatosTelefono.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					telefonoLocal =(Telefono) this.telefonos.toArray()[this.jTableDatosTelefono.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				telefonoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
						telefonoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Telefono telefonoAux:telefonos) {
						telefonoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTelefono(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTelefono.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTelefono.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTelefono,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTelefonoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTelefonoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTelefonoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTelefono(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTelefono.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Telefono telefonoAux:this.telefonoLogic.getTelefonos()) {
				
						if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							telefonoAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_EXTENSION)) {
							existe=true;
							telefonoAux.setextension(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							telefonoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Telefono telefonoAux:telefonos) {
					
						if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							telefonoAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_EXTENSION)) {
							existe=true;
							telefonoAux.setextension(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							telefonoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTelefono(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTelefonoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTelefono(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTelefono=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTelefono.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTelefono) {				
					conSplash=true;//false;										
					
					//this.startProcessTelefono(conSplash);
				
					this.generarReporteTelefonosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTelefonosSeleccionados();
				//this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTelefonosSeleccionados(false);
				//this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTelefonosSeleccionados(true);
				//this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTelefono();
				
				this.exportarTelefonosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTelefonos();
				//this.importarTelefonos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTelefono();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTelefonosSeleccionados();
				//this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Telefono", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTelefono();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTelefono)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTelefono(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.setSelectedIndex(0);					
				}	
			} 			
			else if(TelefonoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTelefono) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTelefono(conSplash);
					
						//this.actualizarParametrosGeneralTelefono();
						
						this.generarReporteProcesoAccionTelefonosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TelefonoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TelefonoS SELECCIONADOS?", "MANTENIMIENTO DE Telefono", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTelefono();
				
						this.actualizarParametrosGeneralTelefono();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.telefonoReturnGeneral=telefonoLogic.procesarAccionTelefonosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.telefonoLogic.getTelefonos(),this.telefonoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTelefonoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTelefono();
					
					TelefonoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTelefonoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTelefono.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTelefono.jComboBoxTiposAccionesFormularioTelefono.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTelefono(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTelefonoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTelefono();
			
			if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		
			Telefono telefono=new Telefono();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTelefono(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTelefono.getSelectedItem();
			
			
			
			
			telefonosSeleccionados=this.getTelefonosSeleccionados(true);
			//this.sTipoAccion;
			
			if(telefonosSeleccionados.size()==1) {
				for(Telefono telefonoAux:telefonosSeleccionados) {
					telefono=telefonoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTelefono();
			
      		//this.finishProcessTelefono(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTelefonoReturnGeneral() throws Exception {
		if(this.telefonoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.telefonoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.telefonoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.telefonoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.telefonoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.telefonoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTelefono(false);
		}
		
		if(this.telefonoReturnGeneral.getConRetornoLista() || this.telefonoReturnGeneral.getConRetornoObjeto()) {
			if(this.telefonoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.telefonoLogic.setTelefonos(this.telefonoReturnGeneral.getTelefonos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.telefonoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.telefonoLogic.setTelefono(this.telefonoReturnGeneral.getTelefono());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTelefono(false);
		}
	}
	
	public void actualizarParametrosGeneralTelefono() throws Exception {
		
		
	}
	
	public ArrayList<Telefono> getTelefonosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTelefono) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Telefono telefonoAux:telefonoLogic.getTelefonos()) {
					if(telefonoAux.getIsSelected()) {
						telefonosSeleccionados.add(telefonoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Telefono telefonoAux:this.telefonos) {
					if(telefonoAux.getIsSelected()) {
						telefonosSeleccionados.add(telefonoAux);				
					}
				}
			}
			
			if(telefonosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						telefonosSeleccionados.addAll(this.telefonoLogic.getTelefonos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						telefonosSeleccionados.addAll(this.telefonos);				
					}
				}
			}
		} else {
			telefonosSeleccionados.add(this.telefono);
		}
		
		return telefonosSeleccionados;
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
	
	public void generarReporteTelefonosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTelefonosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTelefonosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTelefonosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTelefonosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Telefono",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTelefonosSeleccionados() throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTelefonos("Todos",telefonosSeleccionados);
		
	}	
	
	public void generarReporteNormalTelefonosSeleccionados() throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTelefonos("Todos",telefonosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTelefonosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTelefonos("Todos",telefonosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTelefonosSeleccionados() throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTelefono();
		
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTelefono();
		
		
		//this.generarReporteTelefonos("Todos",telefonosSeleccionados ,telefonoImplementable,telefonoImplementableHome);
	}
	
	public void mostrarImportacionTelefonos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTelefono();
		
		this.abrirFrameImportacionTelefono();		
		
			
		//this.generarReporteTelefonos("Todos",telefonosSeleccionados ,telefonoImplementable,telefonoImplementableHome);
	}
	
	public void importarTelefonos() throws Exception {		
	
	}
	
	public void exportarTelefonosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTelefonosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTelefonosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTelefonosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Telefono",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTelefonosSeleccionados() throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTelefono(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Telefono telefonoAux:telefonosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTelefono(telefonoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//telefonoAux.setsDetalleGeneralEntityReporte(telefonoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTelefono(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_EXTENSION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_ESACTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TelefonoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTelefono(Telefono telefono,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=telefono.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.gettipotelefo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.getextension();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.getes_activo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTelefonosSeleccionados() throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Telefonos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTelefono(row);				
				iRow++;
			}				
			
			for(Telefono telefonoAux:telefonosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTelefono(telefonoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTelefonosSeleccionados() throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();		
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("telefonos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("telefono");
			//elementRoot.appendChild(element);
		
			for(Telefono telefonoAux:telefonosSeleccionados) {
				element = document.createElement("telefono");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTelefono(telefonoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTelefono(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_EXTENSION);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_ESACTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(TelefonoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTelefono(Telefono telefono,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.gettipotelefo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.getextension());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.getes_activo());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTelefono(Telefono telefono,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TelefonoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(telefono.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TelefonoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(telefono.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TelefonoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(telefono.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(TelefonoConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(telefono.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipotelefo_descripcion = document.createElement(TelefonoConstantesFunciones.IDTIPOTELEFO);
		elementtipotelefo_descripcion.appendChild(document.createTextNode(telefono.gettipotelefo_descripcion()));
		element.appendChild(elementtipotelefo_descripcion);

		Element elementpais_descripcion = document.createElement(TelefonoConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(telefono.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(TelefonoConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(telefono.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementtelefono = document.createElement(TelefonoConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(telefono.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementextension = document.createElement(TelefonoConstantesFunciones.EXTENSION);
		elementextension.appendChild(document.createTextNode(telefono.getextension().trim()));
		element.appendChild(elementextension);

		Element elementes_activo = document.createElement(TelefonoConstantesFunciones.ESACTIVO);
		elementes_activo.appendChild(document.createTextNode(telefono.getes_activo().toString().trim()));
		element.appendChild(elementes_activo);

		Element elementdescripcion = document.createElement(TelefonoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(telefono.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTelefonosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Telefono> telefonosSeleccionados=new ArrayList<Telefono>();
		
		telefonosSeleccionados=this.getTelefonosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTelefono(telefonosSeleccionados);
		
		this.generarReporteTelefonos("Todos",telefonosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTelefono(ArrayList<Telefono> telefonosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Telefono telefonoAux:telefonosSeleccionados) {
				telefonoAux.setsDetalleGeneralEntityReporte(telefonoAux.toString());
			
				if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(telefonoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(telefonoAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(telefonoAux.gettipotelefo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(telefonoAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(telefonoAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(telefonoAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_EXTENSION)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(telefonoAux.getextension());
				}
				 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(telefonoAux.getes_activo()));
				}
				 else if(sTipoSeleccionar.equals(TelefonoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					telefonoAux.setsDescripcionGeneralEntityReporte1(telefonoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TelefonoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTelefono(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTelefono=true;
				this.isVisibilidadCeldaNuevoRelacionesTelefono=true;
				this.isVisibilidadCeldaGuardarCambiosTelefono=true;
			}
			
			this.isVisibilidadCeldaModificarTelefono=false;
			this.isVisibilidadCeldaActualizarTelefono=false;
			this.isVisibilidadCeldaEliminarTelefono=false;
			this.isVisibilidadCeldaCancelarTelefono=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefono=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTelefono=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono=false;
			this.isVisibilidadCeldaModificarTelefono=false;
			this.isVisibilidadCeldaActualizarTelefono=true;
			this.isVisibilidadCeldaEliminarTelefono=false;
			this.isVisibilidadCeldaCancelarTelefono=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefono=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTelefono=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono=false;
			this.isVisibilidadCeldaModificarTelefono=false;
			this.isVisibilidadCeldaActualizarTelefono=true;
			this.isVisibilidadCeldaEliminarTelefono=true;
			this.isVisibilidadCeldaCancelarTelefono=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefono=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTelefono=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono=false;
			this.isVisibilidadCeldaModificarTelefono=false;
			this.isVisibilidadCeldaActualizarTelefono=true;
			this.isVisibilidadCeldaEliminarTelefono=false;
			this.isVisibilidadCeldaCancelarTelefono=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefono=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTelefono=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefono=true;
			this.isVisibilidadCeldaGuardarCambiosTelefono=true;
			this.isVisibilidadCeldaModificarTelefono=false;
			this.isVisibilidadCeldaActualizarTelefono=false;
			this.isVisibilidadCeldaEliminarTelefono=false;
			this.isVisibilidadCeldaCancelarTelefono=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefono=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTelefono=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono=false;
			this.isVisibilidadCeldaActualizarTelefono=false;
			this.isVisibilidadCeldaEliminarTelefono=false;
			this.isVisibilidadCeldaCancelarTelefono=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefono=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTelefono=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono=false;
			this.isVisibilidadCeldaModificarTelefono=true;
			this.isVisibilidadCeldaActualizarTelefono=false;
			this.isVisibilidadCeldaEliminarTelefono=false;
			this.isVisibilidadCeldaCancelarTelefono=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefono=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TelefonoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTelefono=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefono=true;
			this.isVisibilidadCeldaGuardarCambiosTelefono=true;
		} else {
			this.actualizarEstadoPanelsTelefono(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTelefono=false;
			//this.isVisibilidadCeldaVerFormTelefono=false;
			this.isVisibilidadCeldaDuplicarTelefono=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!telefonoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTelefono=false;
		} else {
			this.isVisibilidadCeldaNuevoTelefono=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(telefonoSessionBean.getEsGuardarRelacionado()) {
			if(!telefonoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTelefono=false;												
			}
			
			this.jButtonCerrarTelefono.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTelefono=false;
		}
		
		if(!this.permiteMantenimiento(this.telefono)) {
			this.isVisibilidadCeldaActualizarTelefono=false;
			this.isVisibilidadCeldaEliminarTelefono=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTelefono() {
	}
	
	public void actualizarEstadoPanelsTelefono(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTelefono!=null) {
				this.jScrollPanelDatosEdicionTelefono.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono!=null) {
				this.jTabbedPaneBusquedasTelefono.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefono!=null) {
				this.jScrollPanelDatosTelefono.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefono!=null) {
				this.jPanelPaginacionTelefono.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTelefono!=null) {
				this.jScrollPanelDatosEdicionTelefono.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono!=null) {
				this.jTabbedPaneBusquedasTelefono.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTelefono!=null) {
				this.jScrollPanelDatosTelefono.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefono!=null) {
				this.jPanelPaginacionTelefono.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTelefono!=null) {
				this.jScrollPanelDatosEdicionTelefono.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono!=null) {
				this.jTabbedPaneBusquedasTelefono.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTelefono!=null) {
				this.jScrollPanelDatosTelefono.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefono!=null) {
				this.jPanelPaginacionTelefono.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTelefono!=null) {
				this.jScrollPanelDatosEdicionTelefono.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono!=null) {
				this.jTabbedPaneBusquedasTelefono.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTelefono!=null) {
				this.jScrollPanelDatosTelefono.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefono!=null) {
				this.jPanelPaginacionTelefono.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTelefono!=null) {
				this.jScrollPanelDatosEdicionTelefono.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono!=null) {
				this.jTabbedPaneBusquedasTelefono.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefono!=null) {
				this.jScrollPanelDatosTelefono.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefono!=null) {
				this.jPanelPaginacionTelefono.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTelefono!=null) {
				this.jScrollPanelDatosEdicionTelefono.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono!=null) {
				this.jTabbedPaneBusquedasTelefono.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefono!=null) {
				this.jScrollPanelDatosTelefono.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefono!=null) {
				this.jPanelPaginacionTelefono.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTelefono!=null) {
				this.jScrollPanelDatosEdicionTelefono.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono!=null) {
				this.jTabbedPaneBusquedasTelefono.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefono!=null) {
				this.jScrollPanelDatosTelefono.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefono!=null) {
				this.jPanelPaginacionTelefono.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.telefonoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTelefono!=null) {
					this.jTabbedPaneBusquedasTelefono.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.telefonoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono!=null) {
				this.jTabbedPaneBusquedasTelefono.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTelefono!=null) {
				this.jPanelParametrosReportesTelefono.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCiudad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdCiudadTelefono);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdClienteTelefono);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdPaisTelefono);}

			this.isVisibilidadFK_IdValorTelefono=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorTelefono) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdValorTelefonoTelefono);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCiudad=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdCiudadTelefono);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdClienteTelefono);}

			this.isVisibilidadFK_IdPais=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdPaisTelefono);}

			this.isVisibilidadFK_IdValorTelefono=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorTelefono) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdValorTelefonoTelefono);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTelefo(Boolean isParaTipoTelefo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTelefoNegation=!isParaTipoTelefo;

			this.isVisibilidadFK_IdCiudad=isParaTipoTelefoNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdCiudadTelefono);}

			this.isVisibilidadFK_IdCliente=isParaTipoTelefoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdClienteTelefono);}

			this.isVisibilidadFK_IdPais=isParaTipoTelefoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdPaisTelefono);}

			this.isVisibilidadFK_IdValorTelefono=isParaTipoTelefo;
			if(!this.isVisibilidadFK_IdValorTelefono) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdValorTelefonoTelefono);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdCiudadTelefono);}

			this.isVisibilidadFK_IdCliente=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdClienteTelefono);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdPaisTelefono);}

			this.isVisibilidadFK_IdValorTelefono=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdValorTelefono) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdValorTelefonoTelefono);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdCiudadTelefono);}

			this.isVisibilidadFK_IdCliente=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdClienteTelefono);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdPaisTelefono);}

			this.isVisibilidadFK_IdValorTelefono=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdValorTelefono) {this.jTabbedPaneBusquedasTelefono.remove(jPanelFK_IdValorTelefonoTelefono);}
		}
		
	}
	
	
	
	

	public String registrarSesionTelefonoParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(telefonoSessionBean==null) {
				telefonoSessionBean=new TelefonoSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(telefonoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.telefonoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TelefonoConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionTelefono(true);
			//clienteSessionBean.setlidTelefonoActual(this.idTelefonoActual);

			telefonoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTelefono(true);
			telefonoSessionBean.setlIdTelefonoActualForeignKey(this.idTelefonoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TelefonoSessionBean telefonoSessionBean=new TelefonoSessionBean();
		
		if(this.telefonoSessionBean==null) {
			this.telefonoSessionBean=new TelefonoSessionBean();
		}
		
		this.telefonoSessionBean.setsUltimaBusquedaTelefono(this.getsAccionBusqueda());
		this.telefonoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.telefonoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			telefonoSessionBean.setid_ciudad(this.getid_ciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			telefonoSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			telefonoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			telefonoSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorTelefono")) {
			telefonoSessionBean.setid_tipo_telefono(this.getid_tipo_telefonoFK_IdValorTelefono());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TelefonoSessionBean telefonoSessionBean=new TelefonoSessionBean();
		
		if(this.telefonoSessionBean==null) {
			this.telefonoSessionBean=new TelefonoSessionBean();
		}
		
		if(this.telefonoSessionBean.getsUltimaBusquedaTelefono()!=null&&!this.telefonoSessionBean.getsUltimaBusquedaTelefono().equals("")) {
			this.setsAccionBusqueda(telefonoSessionBean.getsUltimaBusquedaTelefono());
			this.setiNumeroPaginacion(telefonoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(telefonoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setid_ciudadFK_IdCiudad(telefonoSessionBean.getid_ciudad());
				telefonoSessionBean.setid_ciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(telefonoSessionBean.getid_cliente());
				telefonoSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(telefonoSessionBean.getid_empresa());
				telefonoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(telefonoSessionBean.getid_pais());
				telefonoSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorTelefono")) {
				this.setid_tipo_telefonoFK_IdValorTelefono(telefonoSessionBean.getid_tipo_telefono());
				telefonoSessionBean.setid_tipo_telefono(-1L);
			}
		}
		
		this.telefonoSessionBean.setsUltimaBusquedaTelefono("");
		this.telefonoSessionBean.setiNumeroPaginacion(TelefonoConstantesFunciones.INUMEROPAGINACION);
		this.telefonoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTelefono(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTelefono() {
		this.updateBorderResaltarBusquedasFormularioTelefono();
		this.updateVisibilidadBusquedasFormularioTelefono();
		this.updateHabilitarBusquedasFormularioTelefono();
	}
	
	public void updateBorderResaltarBusquedasFormularioTelefono() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTelefono.getComponents().length>0) {
	

		if(this.telefonoConstantesFunciones.resaltarFK_IdCiudadTelefono!=null) {
			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdCiudadTelefono);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
				jPanel.setBorder(this.telefonoConstantesFunciones.resaltarFK_IdCiudadTelefono);
			}
		}

		if(this.telefonoConstantesFunciones.resaltarFK_IdClienteTelefono!=null) {
			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdClienteTelefono);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
				jPanel.setBorder(this.telefonoConstantesFunciones.resaltarFK_IdClienteTelefono);
			}
		}

		if(this.telefonoConstantesFunciones.resaltarFK_IdPaisTelefono!=null) {
			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdPaisTelefono);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
				jPanel.setBorder(this.telefonoConstantesFunciones.resaltarFK_IdPaisTelefono);
			}
		}

		if(this.telefonoConstantesFunciones.resaltarFK_IdValorTelefonoTelefono!=null) {
			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdValorTelefonoTelefono);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
				jPanel.setBorder(this.telefonoConstantesFunciones.resaltarFK_IdValorTelefonoTelefono);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTelefono() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTelefono.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdCiudadTelefono);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.telefonoConstantesFunciones.mostrarFK_IdCiudadTelefono);
			if(!this.telefonoConstantesFunciones.mostrarFK_IdCiudadTelefono && index>-1) {
				this.jTabbedPaneBusquedasTelefono.remove(index);
			}

			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdClienteTelefono);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.telefonoConstantesFunciones.mostrarFK_IdClienteTelefono);
			if(!this.telefonoConstantesFunciones.mostrarFK_IdClienteTelefono && index>-1) {
				this.jTabbedPaneBusquedasTelefono.remove(index);
			}

			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdPaisTelefono);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.telefonoConstantesFunciones.mostrarFK_IdPaisTelefono);
			if(!this.telefonoConstantesFunciones.mostrarFK_IdPaisTelefono && index>-1) {
				this.jTabbedPaneBusquedasTelefono.remove(index);
			}

			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdValorTelefonoTelefono);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.telefonoConstantesFunciones.mostrarFK_IdValorTelefonoTelefono);
			if(!this.telefonoConstantesFunciones.mostrarFK_IdValorTelefonoTelefono && index>-1) {
				this.jTabbedPaneBusquedasTelefono.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTelefono() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTelefono.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdCiudadTelefono);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.telefonoConstantesFunciones.activarFK_IdCiudadTelefono);
				this.jTabbedPaneBusquedasTelefono.setEnabledAt(index,this.telefonoConstantesFunciones.activarFK_IdCiudadTelefono);
			}

			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdClienteTelefono);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.telefonoConstantesFunciones.activarFK_IdClienteTelefono);
				this.jTabbedPaneBusquedasTelefono.setEnabledAt(index,this.telefonoConstantesFunciones.activarFK_IdClienteTelefono);
			}

			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdPaisTelefono);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.telefonoConstantesFunciones.activarFK_IdPaisTelefono);
				this.jTabbedPaneBusquedasTelefono.setEnabledAt(index,this.telefonoConstantesFunciones.activarFK_IdPaisTelefono);
			}

			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdValorTelefonoTelefono);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.telefonoConstantesFunciones.activarFK_IdValorTelefonoTelefono);
				this.jTabbedPaneBusquedasTelefono.setEnabledAt(index,this.telefonoConstantesFunciones.activarFK_IdValorTelefonoTelefono);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTelefono(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdCiudadTelefono);

			this.jTabbedPaneBusquedasTelefono.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);

			this.telefonoConstantesFunciones.setResaltarFK_IdCiudadTelefono(resaltar);

			jPanel.setBorder(this.telefonoConstantesFunciones.resaltarFK_IdCiudadTelefono);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdClienteTelefono);

			this.jTabbedPaneBusquedasTelefono.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);

			this.telefonoConstantesFunciones.setResaltarFK_IdClienteTelefono(resaltar);

			jPanel.setBorder(this.telefonoConstantesFunciones.resaltarFK_IdClienteTelefono);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdPaisTelefono);

			this.jTabbedPaneBusquedasTelefono.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);

			this.telefonoConstantesFunciones.setResaltarFK_IdPaisTelefono(resaltar);

			jPanel.setBorder(this.telefonoConstantesFunciones.resaltarFK_IdPaisTelefono);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorTelefono")) {
			index= this.jTabbedPaneBusquedasTelefono.indexOfComponent(this.jPanelFK_IdValorTelefonoTelefono);

			this.jTabbedPaneBusquedasTelefono.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono.getComponent(index);

			this.telefonoConstantesFunciones.setResaltarFK_IdValorTelefonoTelefono(resaltar);

			jPanel.setBorder(this.telefonoConstantesFunciones.resaltarFK_IdValorTelefonoTelefono);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTelefono.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTelefono() throws Exception {

		if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTelefono();
		this.updateVisibilidadResaltarControlesFormularioTelefono();
		this.updateHabilitarResaltarControlesFormularioTelefono();
		
	}
	
	public void updateBorderResaltarControlesFormularioTelefono() throws Exception {
		if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.telefonoConstantesFunciones.resaltaridTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.setBorder(this.telefonoConstantesFunciones.resaltaridTelefono);}
		if(this.telefonoConstantesFunciones.resaltarid_empresaTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setBorder(this.telefonoConstantesFunciones.resaltarid_empresaTelefono);}
		if(this.telefonoConstantesFunciones.resaltarid_clienteTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setBorder(this.telefonoConstantesFunciones.resaltarid_clienteTelefono);}
		if(this.telefonoConstantesFunciones.resaltarid_tipo_telefonoTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setBorder(this.telefonoConstantesFunciones.resaltarid_tipo_telefonoTelefono);}
		if(this.telefonoConstantesFunciones.resaltarid_paisTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setBorder(this.telefonoConstantesFunciones.resaltarid_paisTelefono);}
		if(this.telefonoConstantesFunciones.resaltarid_ciudadTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setBorder(this.telefonoConstantesFunciones.resaltarid_ciudadTelefono);}
		if(this.telefonoConstantesFunciones.resaltartelefonoTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jTextAreatelefonoTelefono.setBorder(this.telefonoConstantesFunciones.resaltartelefonoTelefono);}
		if(this.telefonoConstantesFunciones.resaltarextensionTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jTextFieldextensionTelefono.setBorder(this.telefonoConstantesFunciones.resaltarextensionTelefono);}
		if(this.telefonoConstantesFunciones.resaltares_activoTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.setBorderPainted(true);this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.setBorder(this.telefonoConstantesFunciones.resaltares_activoTelefono);}
		if(this.telefonoConstantesFunciones.resaltardescripcionTelefono!=null && this.jInternalFrameDetalleFormTelefono!=null) {this.jInternalFrameDetalleFormTelefono.jTextAreadescripcionTelefono.setBorder(this.telefonoConstantesFunciones.resaltardescripcionTelefono);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTelefono() throws Exception {		
		if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTelefono!=null) {
	
		//this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.setVisible(this.telefonoConstantesFunciones.mostraridTelefono);
		this.jInternalFrameDetalleFormTelefono.jPanelidTelefono.setVisible(this.telefonoConstantesFunciones.mostraridTelefono);
		//this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_empresaTelefono);
		this.jInternalFrameDetalleFormTelefono.jPanelid_empresaTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_empresaTelefono);
		//this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_clienteTelefono);
		this.jInternalFrameDetalleFormTelefono.jPanelid_clienteTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_clienteTelefono);
			this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_clienteTelefono);
		//this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_tipo_telefonoTelefono);
		this.jInternalFrameDetalleFormTelefono.jPanelid_tipo_telefonoTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_tipo_telefonoTelefono);
		//this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_paisTelefono);
		this.jInternalFrameDetalleFormTelefono.jPanelid_paisTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_paisTelefono);
		//this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_ciudadTelefono);
		this.jInternalFrameDetalleFormTelefono.jPanelid_ciudadTelefono.setVisible(this.telefonoConstantesFunciones.mostrarid_ciudadTelefono);
		//this.jInternalFrameDetalleFormTelefono.jTextAreatelefonoTelefono.setVisible(this.telefonoConstantesFunciones.mostrartelefonoTelefono);
		this.jInternalFrameDetalleFormTelefono.jPaneltelefonoTelefono.setVisible(this.telefonoConstantesFunciones.mostrartelefonoTelefono);
		//this.jInternalFrameDetalleFormTelefono.jTextFieldextensionTelefono.setVisible(this.telefonoConstantesFunciones.mostrarextensionTelefono);
		this.jInternalFrameDetalleFormTelefono.jPanelextensionTelefono.setVisible(this.telefonoConstantesFunciones.mostrarextensionTelefono);
		//this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.setVisible(this.telefonoConstantesFunciones.mostrares_activoTelefono);
		this.jInternalFrameDetalleFormTelefono.jPaneles_activoTelefono.setVisible(this.telefonoConstantesFunciones.mostrares_activoTelefono);
		//this.jInternalFrameDetalleFormTelefono.jTextAreadescripcionTelefono.setVisible(this.telefonoConstantesFunciones.mostrardescripcionTelefono);
		this.jInternalFrameDetalleFormTelefono.jPaneldescripcionTelefono.setVisible(this.telefonoConstantesFunciones.mostrardescripcionTelefono);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTelefono() throws Exception {
		if(this.jInternalFrameDetalleFormTelefono==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTelefono!=null) {
	
		this.jInternalFrameDetalleFormTelefono.jLabelidTelefono.setEnabled(this.telefonoConstantesFunciones.activaridTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_empresaTelefono.setEnabled(this.telefonoConstantesFunciones.activarid_empresaTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_clienteTelefono.setEnabled(this.telefonoConstantesFunciones.activarid_clienteTelefono);
			this.jInternalFrameDetalleFormTelefono.jButtonid_clienteTelefono.setEnabled(this.telefonoConstantesFunciones.activarid_clienteTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_tipo_telefonoTelefono.setEnabled(this.telefonoConstantesFunciones.activarid_tipo_telefonoTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_paisTelefono.setEnabled(this.telefonoConstantesFunciones.activarid_paisTelefono);
		this.jInternalFrameDetalleFormTelefono.jComboBoxid_ciudadTelefono.setEnabled(this.telefonoConstantesFunciones.activarid_ciudadTelefono);
		this.jInternalFrameDetalleFormTelefono.jTextAreatelefonoTelefono.setEnabled(this.telefonoConstantesFunciones.activartelefonoTelefono);
		this.jInternalFrameDetalleFormTelefono.jTextFieldextensionTelefono.setEnabled(this.telefonoConstantesFunciones.activarextensionTelefono);
		this.jInternalFrameDetalleFormTelefono.jCheckBoxes_activoTelefono.setEnabled(this.telefonoConstantesFunciones.activares_activoTelefono);
		this.jInternalFrameDetalleFormTelefono.jTextAreadescripcionTelefono.setEnabled(this.telefonoConstantesFunciones.activardescripcionTelefono);
		}
	}
	
		
}